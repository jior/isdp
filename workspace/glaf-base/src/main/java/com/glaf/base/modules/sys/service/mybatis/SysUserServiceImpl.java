/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.service.mybatis;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.glaf.base.modules.sys.mapper.SysAccessMapper;
import com.glaf.base.modules.sys.mapper.SysApplicationMapper;
import com.glaf.base.modules.sys.mapper.SysFunctionMapper;
import com.glaf.base.modules.sys.mapper.SysPermissionMapper;
import com.glaf.base.modules.sys.mapper.SysRoleMapper;
import com.glaf.base.modules.sys.mapper.SysUserMapper;
import com.glaf.base.modules.sys.mapper.SysUserRoleMapper;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysFunction;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.SysUserRole;
import com.glaf.base.modules.sys.model.UserRole;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.query.UserRoleQuery;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.modules.sys.util.SysUserJsonFactory;
import com.glaf.core.base.TableModel;
import com.glaf.core.domain.Membership;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.cache.CacheFactory;
import com.glaf.core.config.SystemConfig;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.service.MembershipService;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.StringTools;

@Service("sysUserService")
@Transactional(readOnly = true)
public class SysUserServiceImpl implements SysUserService {
	protected final static Log logger = LogFactory
			.getLog(SysUserServiceImpl.class);

	protected IdGenerator idGenerator;

	protected MembershipService membershipService;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected SysAccessMapper sysAccessMapper;

	protected SysApplicationMapper sysApplicationMapper;

	protected SysDepartmentService sysDepartmentService;

	protected SysFunctionMapper sysFunctionMapper;

	protected SysPermissionMapper sysPermissionMapper;

	protected SysRoleMapper sysRoleMapper;

	protected SysUserMapper sysUserMapper;

	protected SysUserRoleMapper sysUserRoleMapper;

	protected ITableDataService tableDataService;

	public SysUserServiceImpl() {

	}

	@Transactional
	public void createRoleUser(long roleId, String actorId) {
		SysUser user = this.findByAccount(actorId);

		TableModel table = new TableModel();
		table.setTableName("userrole");
		table.addStringColumn("ID", idGenerator.getNextId());
		table.addIntegerColumn("AUTHORIZED", 0);
		table.addLongColumn("ROLEID", roleId);
		table.addStringColumn("USERID", actorId);
		tableDataService.insertTableData(table);

		TableModel table2 = new TableModel();
		table2.setTableName("SYS_MEMBERSHIP");
		table2.addLongColumn("ID_", idGenerator.nextId());
		table2.addStringColumn("ACTORID_", actorId);
		table2.addLongColumn("ROLEID_", roleId);
		table2.addLongColumn("NODEID_", user.getDeptId());
		table2.addStringColumn("TYPE_", "UserRole");
		tableDataService.insertTableData(table2);

	}

	@Transactional
	public void deleteRoleUser(long roleId, String actorId) {
		SysUser user = this.findByAccount(actorId);

		TableModel table = new TableModel();
		table.setTableName("userrole");
		table.addIntegerColumn("AUTHORIZED", 0);
		table.addLongColumn("ROLEID", roleId);
		table.addStringColumn("USERID", actorId);
		tableDataService.deleteTableData(table);

		TableModel table2 = new TableModel();
		table2.setTableName("SYS_MEMBERSHIP");
		table2.addStringColumn("ACTORID_", actorId);
		table2.addLongColumn("ROLEID_", roleId);
		table2.addLongColumn("NODEID_", user.getDeptId());
		tableDataService.deleteTableData(table2);

	}

	public List<UserRole> getRoleUserViews(UserRoleQuery query) {
		return sysUserMapper.getRoleUserViews(query);
	}

	public int count(SysUserQuery query) {
		query.ensureInitialized();
		return sysUserMapper.getSysUserCount(query);
	}

	@Transactional
	public boolean create(SysUser bean) {
		bean.setCreateTime(new Date());
		this.save(bean);
		return true;
	}

	@Transactional
	public boolean delete(long id) {
		return false;
	}

	@Transactional
	public boolean delete(SysUser bean) {
		return false;
	}

	@Transactional
	public boolean deleteAll(long[] ids) {
		return false;
	}

	@Transactional
	public void deleteById(Long id) {
		if (id != null) {
			sysUserMapper.deleteSysUserById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Long> rowIds) {
		if (rowIds != null && !rowIds.isEmpty()) {
			SysUserQuery query = new SysUserQuery();
			query.rowIds(rowIds);
			sysUserMapper.deleteSysUsers(query);
		}
	}

	/**
	 * 删除角色用户
	 * 
	 * @param role
	 * @param userIds
	 */
	@Transactional
	public void deleteRoleUsers(SysRole role, String[] userIds) {
		for (int i = 0; i < userIds.length; i++) {
			SysUser user = this.findById(userIds[i]);
			if (user != null) {
				logger.debug(user.getName());
				TableModel table = new TableModel();
				table.setTableName("userrole");
				table.addIntegerColumn("AUTHORIZED", 0);
				table.addStringColumn("ROLEID", String.valueOf(role.getId()));
				table.addStringColumn("USERID", user.getActorId());
				tableDataService.deleteTableData(table);

				TableModel table2 = new TableModel();
				table2.setTableName("SYS_MEMBERSHIP");
				table2.addStringColumn("ACTORID_", user.getAccount());
				table2.addLongColumn("ROLEID_", role.getId());
				tableDataService.deleteTableData(table2);
			}
		}
	}

	public SysUser findByAccount(String account) {
		SysUser user = sysUserMapper.getSysUserByAccount(account);
		if (user != null) {
			if (user.getDeptId() > 0) {
				user.setDepartment(sysDepartmentService.findById(user
						.getDeptId()));
			}
			return user;
		}

		return null;
	}

	public SysUser findByAccountWithAll(String account) {
		SysUser user = sysUserMapper.getSysUserByAccount(account);
		if (user != null) {
			if (user.getDeptId() > 0) {
				user.setDepartment(sysDepartmentService.findById(user
						.getDeptId()));
			}
			List<String> actorIds = new ArrayList<String>();
			actorIds.add(account);
			List<SysRole> roles = this.getUserRoles(actorIds);
			user.getRoles().addAll(roles);
			List<SysUserRole> userRoles = sysUserRoleMapper
					.getSysUserRolesByUserId(user.getActorId());
			user.getUserRoles().addAll(userRoles);
			List<SysApplication> apps = sysApplicationMapper
					.getSysApplicationByUserId(user.getActorId());
			user.getApps().addAll(apps);
			List<SysFunction> funs = sysFunctionMapper
					.getSysFunctionByUserId(user.getActorId());
			user.getFunctions().addAll(funs);
			return user;
		}

		return null;
	}

	@Override
	public SysUser findById(String account) {
		String cacheKey = "sys_user_" + account;
		if (SystemConfig.getBoolean("use_query_cache")
				&& CacheFactory.getString(cacheKey) != null) {
			String text = CacheFactory.getString(cacheKey);
			JSONObject json = JSON.parseObject(text);
			return SysUserJsonFactory.jsonToObject(json);
		}

		SysUser user = sysUserMapper.getSysUserByAccount(account);
		if (user != null) {
			if (user.getDeptId() > 0) {
				user.setDepartment(sysDepartmentService.findById(user
						.getDeptId()));
			}
			if (SystemConfig.getBoolean("use_query_cache")) {
				JSONObject json = user.toJsonObject();
				CacheFactory.put(cacheKey, json.toJSONString());
			}
		}
		return user;
	}

	public SysUser findByMail(String mail) {
		SysUser user = sysUserMapper.getSysUserByMail(mail);
		return user;
	}

	public SysUser findByMobile(String mobile) {
		SysUser user = sysUserMapper.getSysUserByMobile(mobile);
		return user;
	}

	public String getPasswordByAccount(String account) {
		return sysUserMapper.getPasswordByAccount(account);
	}

	protected Map<Long, SysDepartment> getDepartmentMap() {
		Map<Long, SysDepartment> deptMap = new HashMap<Long, SysDepartment>();
		List<SysDepartment> depts = sysDepartmentService.getSysDepartmentList();
		if (depts != null && !depts.isEmpty()) {
			for (SysDepartment dept : depts) {
				deptMap.put(dept.getId(), dept);
			}
		}
		return deptMap;
	}

	public List<SysUser> getSuperiors(String account) {
		List<SysUser> superiors = new ArrayList<SysUser>();
		SysUser bean = this.findByAccount(account);
		if (bean != null && bean.getSuperiorIds() != null) {
			List<String> superiorIds = StringTools.split(bean.getSuperiorIds());
			if (superiorIds != null && !superiorIds.isEmpty()) {
				for (String superiorId : superiorIds) {
					SysUser user = this.findByAccount(superiorId);
					if (user != null && user.getLocked() == 0) {
						superiors.add(user);
					}
				}
			}
		}
		return superiors;
	}

	public List<SysUser> getSupplierUser(String supplierNo) {
		SysUserQuery query = new SysUserQuery();
		query.account(supplierNo);
		List<SysUser> users = this.list(query);
		this.initUserDepartments(users);
		return users;
	}

	public int getSysUserCountByQueryCriteria(SysUserQuery query) {
		return sysUserMapper.getSysUserCount(query);
	}

	public List<SysUser> getSysUserList() {
		SysUserQuery query = new SysUserQuery();
		return this.list(query);
	}

	public List<SysUser> getSysUserList(long deptId) {
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));
		return this.list(query);
	}

	public PageResult getSysUserList(int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();

		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.UserName asc ");

		int start = pageSize * (pageNo - 1);
		List<SysUser> list = this.getSysUsersByQueryCriteria(start, pageSize,
				query);
		this.initUserDepartments(list);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	public PageResult getSysUserList(long deptId, int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));

		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.UserName asc ");

		int start = pageSize * (pageNo - 1);
		List<SysUser> list = this.getSysUsersByQueryCriteria(start, pageSize,
				query);
		this.initUserDepartments(list);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	public PageResult getSysUserList(long deptId, String fullName, int pageNo,
			int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));

		if (fullName != null && fullName.trim().length() > 0) {
			query.nameLike(fullName);
		}
		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.UserName asc ");

		int start = pageSize * (pageNo - 1);
		List<SysUser> list = this.getSysUsersByQueryCriteria(start, pageSize,
				query);
		this.initUserDepartments(list);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	public PageResult getSysUserList(long deptId, String userName,
			String account, int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));
		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.DEPID asc, E.UserName asc  ");

		int start = pageSize * (pageNo - 1);
		List<SysUser> list = this.getSysUsersByQueryCriteria(start, pageSize,
				query);
		this.initUserDepartments(list);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	/**
	 * 获取某个应用的权限用户
	 * 
	 * @param appId
	 * @return
	 */
	public List<SysUser> getSysUsersByAppId(Long appId) {
		return sysUserMapper.getSysUsersByAppId(appId);
	}

	public List<SysUser> getSysUsersByQueryCriteria(int start, int pageSize,
			SysUserQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysUser> rows = sqlSessionTemplate.selectList("getSysUsers",
				query, rowBounds);
		this.initUserDepartments(rows);
		return rows;
	}

	/**
	 * 获取某个角色代码的用户
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<SysUser> getSysUsersByRoleCode(String roleCode) {
		if (roleCode == null) {
			return null;
		}
		// Fix me
		return null;
	}

	/**
	 * 获取某个角色代码的用户
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<SysUser> getSysUsersByRoleId(long roleId) {
		// Fix me
		return null;
	}

	public List<SysUser> getSysUserWithDeptList() {
		SysUserQuery query = new SysUserQuery();
		List<SysUser> users = this.list(query);
		if (users != null && !users.isEmpty()) {
			this.initUserDepartments(users);
		}
		return users;
	}

	public SysUser getUserAndPrivileges(SysUser user) {

		List<String> actorIds = new ArrayList<String>();
		actorIds.add(user.getActorId());
		user.setRoles(getUserRoles(actorIds));
		if (user.getRoles() != null && !user.getRoles().isEmpty()) {
			Iterator<SysRole> roles = user.getRoles().iterator();
			while (roles.hasNext()) {
				SysRole role = roles.next();
				List<SysApplication> apps = sysApplicationMapper
						.getSysApplicationByRoleId(role.getId());
				List<SysFunction> functions = sysFunctionMapper
						.getSysFunctionByRoleId(role.getId());
				user.getFunctions().addAll(functions);
				user.getApps().addAll(apps);
			}
		}

		return user;
	}

	public SysUser getUserPrivileges(SysUser user) {
		List<String> actorIds = new ArrayList<String>();
		actorIds.add(user.getActorId());
		user.setRoles(getUserRoles(actorIds));
		if (user.getRoles() != null && !user.getRoles().isEmpty()) {
			Iterator<SysRole> roles = user.getRoles().iterator();
			while (roles.hasNext()) {
				SysRole role = (SysRole) roles.next();
				List<SysApplication> apps = sysApplicationMapper
						.getSysApplicationByRoleId(role.getId());
				List<SysFunction> functions = sysFunctionMapper
						.getSysFunctionByRoleId(role.getId());
				user.getFunctions().addAll(functions);
				user.getApps().addAll(apps);
			}
		}

		return user;
	}

	/**
	 * 获取某些用户的角色
	 * 
	 * @param actorIds
	 * @return
	 */
	public List<SysRole> getUserRoles(List<String> actorIds) {
		List<SysRole> roles = new ArrayList<SysRole>();
		if (actorIds != null && !actorIds.isEmpty()) {
			for (String actorId : actorIds) {
				List<SysRole> list = sysRoleMapper.getSysRolesOfUser(actorId);
				if (list != null && !list.isEmpty()) {
					for (SysRole role : list) {
						if (!roles.contains(role)) {
							roles.add(role);
						}
					}
				}
			}
		}
		return roles;
	}

	public List<SysRole> getUserRoles(String actorId) {
		List<SysRole> roles = new ArrayList<SysRole>();
		List<SysRole> list = sysRoleMapper.getSysRolesOfUser(actorId);
		if (list != null && !list.isEmpty()) {
			for (SysRole role : list) {
				if (!roles.contains(role)) {
					roles.add(role);
				}
			}
		}
		return roles;
	}

	protected void initUserDepartments(List<SysUser> users) {
		if (users != null && !users.isEmpty()) {
			List<SysDepartment> depts = sysDepartmentService
					.getSysDepartmentList();
			Map<Long, SysDepartment> deptMap = new HashMap<Long, SysDepartment>();
			if (depts != null && !depts.isEmpty()) {
				for (SysDepartment dept : depts) {
					deptMap.put(dept.getId(), dept);
				}
			}
			for (SysUser user : users) {
				user.setDepartment(deptMap.get(user.getDeptId()));
			}
		}
	}

	public boolean isPermission(SysUser user, String roleCode) {
		boolean flag = false;

		List<String> actorIds = new ArrayList<String>();
		actorIds.add(user.getActorId());
		List<SysRole> roles = this.getUserRoles(actorIds);
		if (roles != null && !roles.isEmpty()) {
			for (SysRole role : roles) {
				if (role != null
						&& StringUtils.equals(role.getCode(), roleCode)) {
					// 代判断用户是否拥有此角色
					flag = true;
					break;
				}
			}
		}

		return flag;
	}

	public List<SysUser> list(SysUserQuery query) {
		query.ensureInitialized();
		List<SysUser> list = sysUserMapper.getSysUsers(query);
		this.initUserDepartments(list);
		return list;
	}

	@Transactional
	public void save(SysUser sysUser) {
		if (this.findByAccount(sysUser.getAccount()) == null) {
			sysUser.setCreateTime(new Date());
			sysUserMapper.insertSysUser(sysUser);
		} else {
			sysUser.setUpdateDate(new Date());
			sysUserMapper.updateSysUser(sysUser);
			String cacheKey = "sys_user_" + sysUser.getActorId();
			CacheFactory.remove(cacheKey);
		}

		TableModel table = new TableModel();
		table.setTableName("SYS_MEMBERSHIP");
		table.addStringColumn("ACTORID_", sysUser.getAccount());
		table.addStringColumn("TYPE_", "Superior");
		tableDataService.deleteTableData(table);

		if (StringUtils.isNotEmpty(sysUser.getSuperiorIds())) {
			List<String> superiorIds = StringTools.split(sysUser
					.getSuperiorIds());
			if (superiorIds != null && !superiorIds.isEmpty()) {
				for (String superiorId : superiorIds) {
					if (!StringUtils.equals(superiorId, sysUser.getAccount())) {
						Membership membership = new Membership();
						membership.setActorId(sysUser.getAccount());
						membership.setSuperiorId(superiorId);
						membership.setModifyBy(sysUser.getUpdateBy());
						membership.setModifyDate(new java.util.Date());
						membership.setType("Superior");
						membership.setObjectId("Superior");
						membership.setObjectValue(superiorId);
						membershipService.save(membership);
					}
				}
			}
		}
	}

	@Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@Resource
	public void setMembershipService(MembershipService membershipService) {
		this.membershipService = membershipService;
	}

	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Resource
	public void setSysAccessMapper(SysAccessMapper sysAccessMapper) {
		this.sysAccessMapper = sysAccessMapper;
	}

	@Resource
	public void setSysApplicationMapper(
			SysApplicationMapper sysApplicationMapper) {
		this.sysApplicationMapper = sysApplicationMapper;
	}

	@Resource
	public void setSysDepartmentService(
			SysDepartmentService sysDepartmentService) {
		this.sysDepartmentService = sysDepartmentService;
	}

	@Resource
	public void setSysFunctionMapper(SysFunctionMapper sysFunctionMapper) {
		this.sysFunctionMapper = sysFunctionMapper;
	}

	@Resource
	public void setSysPermissionMapper(SysPermissionMapper sysPermissionMapper) {
		this.sysPermissionMapper = sysPermissionMapper;
	}

	@Resource
	public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
		this.sysRoleMapper = sysRoleMapper;
	}

	@Resource
	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}

	@Resource
	public void setSysUserRoleMapper(SysUserRoleMapper sysUserRoleMapper) {
		this.sysUserRoleMapper = sysUserRoleMapper;
	}

	@Resource
	public void setTableDataService(ITableDataService tableDataService) {
		this.tableDataService = tableDataService;
	}

	@Transactional
	public boolean update(SysUser sysUser) {
		sysUser.setUpdateDate(new Date());
		sysUserMapper.updateSysUser(sysUser);
		TableModel table = new TableModel();
		table.setTableName("SYS_MEMBERSHIP");
		table.addStringColumn("ACTORID_", sysUser.getAccount());
		table.addStringColumn("TYPE_", "Superior");
		tableDataService.deleteTableData(table);

		if (StringUtils.isNotEmpty(sysUser.getSuperiorIds())) {
			List<String> superiorIds = StringTools.split(sysUser
					.getSuperiorIds());
			if (superiorIds != null && !superiorIds.isEmpty()) {
				for (String superiorId : superiorIds) {
					if (!StringUtils.equals(superiorId, sysUser.getAccount())) {
						Membership membership = new Membership();
						membership.setActorId(sysUser.getAccount());
						membership.setSuperiorId(superiorId);
						membership.setModifyBy(sysUser.getUpdateBy());
						membership.setModifyDate(new java.util.Date());
						membership.setType("Superior");
						membership.setObjectId("Superior");
						membership.setObjectValue(superiorId);
						membershipService.save(membership);
					}
				}
			}
		}
		String cacheKey = "sys_user_" + sysUser.getActorId();
		CacheFactory.remove(cacheKey);
		return true;
	}

	@Transactional
	public boolean updateUser(SysUser sysUser) {
		sysUserMapper.updateSysUser(sysUser);
		String cacheKey = "sys_user_" + sysUser.getActorId();
		CacheFactory.remove(cacheKey);
		return true;
	}

	@Transactional
	public void updateUserPassword(SysUser sysUser) {
		sysUserMapper.updateUserPassword(sysUser);
	}

	@Transactional
	public boolean updateUserRole(SysUser user, Set<SysRole> newRoles) {
		// 先删除用户之前的权限
		List<SysUserRole> userRoles = sysUserRoleMapper
				.getSysUserRolesByUserId(user.getActorId());
		if (userRoles != null && !userRoles.isEmpty()) {
			for (SysUserRole userRole : userRoles) {
				TableModel table = new TableModel();
				table.setTableName("userrole");
				table.addStringColumn("userId", user.getActorId());
				table.addStringColumn("roleId", userRole.getRoleId());
				tableDataService.deleteTableData(table);
			}
		}

		List<Membership> memberships = new ArrayList<Membership>();

		// 增加新权限
		if (newRoles != null && !newRoles.isEmpty()) {
			Iterator<SysRole> iter = newRoles.iterator();
			while (iter.hasNext()) {
				SysRole role = iter.next();

				SysUserRole userRole = new SysUserRole();
				userRole.setId(idGenerator.getNextId());
				userRole.setUserId(user.getActorId());
				userRole.setRoleId(String.valueOf(role.getId()));
				userRole.setCreateDate(new Date());
				userRole.setCreateBy(user.getUpdateBy());
				sysUserRoleMapper.insertSysUserRole(userRole);

				Membership membership = new Membership();
				membership.setActorId(user.getAccount());
				membership.setModifyBy(user.getUpdateBy());
				membership.setModifyDate(new java.util.Date());
				membership.setNodeId(user.getDeptId());
				membership.setRoleId(role.getId());
				membership.setObjectId("userrole");
				membership.setObjectValue(String.valueOf(userRole.getId()));
				memberships.add(membership);
			}
		}

		membershipService.saveMemberships(user.getDeptId(), "UserRole",
				memberships);

		return true;
	}

}
