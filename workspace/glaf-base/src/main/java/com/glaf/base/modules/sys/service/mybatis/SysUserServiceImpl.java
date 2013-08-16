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

import java.util.*;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.id.*;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.service.MembershipService;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.StringTools;
import com.glaf.core.base.TableModel;
import com.glaf.core.domain.Membership;
import com.glaf.base.modules.sys.mapper.*;
import com.glaf.base.modules.sys.model.*;
import com.glaf.base.modules.sys.query.*;
import com.glaf.base.modules.sys.service.*;

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

	protected SysDeptRoleMapper sysDeptRoleMapper;

	protected SysFunctionMapper sysFunctionMapper;

	protected SysPermissionMapper sysPermissionMapper;

	protected SysRoleMapper sysRoleMapper;

	protected SysUserMapper sysUserMapper;

	protected SysUserRoleMapper sysUserRoleMapper;

	protected ITableDataService tableDataService;

	public SysUserServiceImpl() {

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
	 * ɾ�����Ž�ɫ�û�
	 * 
	 * @param deptRole
	 * @param userIds
	 */
	@Transactional
	public void deleteRoleUsers(SysDeptRole deptRole, String[] userIds) {
		for (int i = 0; i < userIds.length; i++) {
			SysUser user = this.findById(userIds[i]);
			if (user != null) {
				logger.debug(user.getName());
				TableModel table = new TableModel();
				table.setTableName("userrole");
				table.addColumn("AUTHORIZED", "Integer", 0);
				table.addColumn("ROLEID", "String", deptRole.getRoleId());
				table.addColumn("USERID", "String", user.getActorId());
				tableDataService.deleteTableData(table);

				TableModel table2 = new TableModel();
				table2.setTableName("SYS_MEMBERSHIP");
				table2.addColumn("ACTORID_", "String", user.getAccount());
				table2.addColumn("ROLEID_", "Long", deptRole.getRoleId());
				table2.addColumn("NODEID_", "Long", deptRole.getDeptId());
				tableDataService.deleteTableData(table2);
			}
		}
	}

	/**
	 * ɾ����ɫ�û�
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
				table.addColumn("AUTHORIZED", "Integer", 0);
				table.addColumn("ROLEID", "String", role.getId());
				table.addColumn("USERID", "String", user.getActorId());
				tableDataService.deleteTableData(table);

				TableModel table2 = new TableModel();
				table2.setTableName("SYS_MEMBERSHIP");
				table2.addColumn("ACTORID_", "String", user.getAccount());
				table2.addColumn("ROLEID_", "Long", role.getId());
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
			List<SysDeptRole> deptRoles = sysDeptRoleMapper
					.getSysDeptRolesByUserId(user.getActorId());
			user.getDeptRoles().addAll(deptRoles);
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
		SysUser user = sysUserMapper.getSysUserByAccount(account);
		if (user != null) {
			if (user.getDeptId() > 0) {
				user.setDepartment(sysDepartmentService.findById(user
						.getDeptId()));
			}
		}
		return user;
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

	public Collection<SysDeptRole> getDeptRoles(SysUser user) {
		return sysDeptRoleMapper.getSysDeptRolesByUserId(user.getAccount());
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

	public PageResult getSysUserList(long deptId, int pageNo, int pageSize) {
		// ��������
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));
		query.accountType(0);
		int count = this.count(query);
		if (count == 0) {// �����Ϊ��
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
		// ��������
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));
		query.accountType(0);
		if (fullName != null && fullName.trim().length() > 0) {
			query.nameLike(fullName);
		}
		int count = this.count(query);
		if (count == 0) {// �����Ϊ��
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
		// ��������
		PageResult pager = new PageResult();
		SysUserQuery query = new SysUserQuery();
		query.deptId(Long.valueOf(deptId));
		int count = this.count(query);
		if (count == 0) {// �����Ϊ��
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
	 * ��ȡĳ��Ӧ�õ�Ȩ���û�
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
	 * ��ȡĳ����ɫ������û�
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<SysUser> getSysUsersByRoleCode(String roleCode) {
		if (roleCode == null) {
			return null;
		}
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setRoleCode(roleCode);
		return sysUserMapper.getSysDeptRoleUsers(query);
	}

	/**
	 * ��ȡĳ����ɫ������û�
	 * 
	 * @param roleCode
	 * @return
	 */
	public List<SysUser> getSysUsersByRoleId(long roleId) {
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setRoleId(roleId);
		return sysUserMapper.getSysDeptRoleUsers(query);
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
		user.setDeptRoles(getDeptRoles(user));
		if (user.getDeptRoles() != null && !user.getDeptRoles().isEmpty()) {
			Iterator<SysDeptRole> deptRoles = user.getDeptRoles().iterator();
			while (deptRoles.hasNext()) {
				SysDeptRole role = deptRoles.next();
				List<SysApplication> apps = sysApplicationMapper
						.getSysApplicationByRoleId(role.getRoleId());
				List<SysFunction> functions = sysFunctionMapper
						.getSysFunctionByRoleId(role.getRoleId());
				user.getFunctions().addAll(functions);
				user.getApps().addAll(apps);
			}
		}

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
		user.setDeptRoles(getDeptRoles(user));
		if (user.getDeptRoles() != null && !user.getDeptRoles().isEmpty()) {
			Iterator<SysDeptRole> deptRoles = user.getDeptRoles().iterator();
			while (deptRoles.hasNext()) {
				SysDeptRole role = deptRoles.next();
				List<SysApplication> apps = sysApplicationMapper
						.getSysApplicationByRoleId(role.getRoleId());
				List<SysFunction> functions = sysFunctionMapper
						.getSysFunctionByRoleId(role.getRoleId());
				user.getFunctions().addAll(functions);
				user.getApps().addAll(apps);
			}
		}

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
	 * ��ȡĳЩ�û��Ľ�ɫ
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
		Collection<SysDeptRole> deptRoles = this.getDeptRoles(user);
		if (deptRoles != null && !deptRoles.isEmpty()) {
			Iterator<SysDeptRole> it = deptRoles.iterator();
			while (it.hasNext()) {
				SysDeptRole deptRole = (SysDeptRole) it.next();
				SysRole role = sysRoleMapper.getSysRoleById(deptRole
						.getRoleId());
				if (role != null
						&& StringUtils.equals(role.getCode(), roleCode)) {
					// ���ж��û��Ƿ�ӵ�д˽�ɫ
					flag = true;
					break;
				}
			}
		}

		List<String> actorIds = new ArrayList<String>();
		actorIds.add(user.getActorId());
		List<SysRole> roles = this.getUserRoles(actorIds);
		if (roles != null && !roles.isEmpty()) {
			for (SysRole role : roles) {
				if (role != null
						&& StringUtils.equals(role.getCode(), roleCode)) {
					// ���ж��û��Ƿ�ӵ�д˽�ɫ
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
		}

		TableModel table = new TableModel();
		table.setTableName("SYS_MEMBERSHIP");
		table.addColumn("ACTORID_", "String", sysUser.getAccount());
		table.addColumn("TYPE_", "String", "Superior");
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
	@Qualifier("myBatisDbIdGenerator")
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
	public void setSysDeptRoleMapper(SysDeptRoleMapper sysDeptRoleMapper) {
		this.sysDeptRoleMapper = sysDeptRoleMapper;
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
		table.addColumn("ACTORID_", "String", sysUser.getAccount());
		table.addColumn("TYPE_", "String", "Superior");
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
		return true;
	}

	@Transactional
	public boolean updateRole(SysUser user, Set<SysDeptRole> newRoles) {
		// ��ɾ���û�֮ǰ��Ȩ��
		List<SysUserRole> userRoles = sysUserRoleMapper
				.getSysUserRolesByUserId(user.getActorId());
		if (userRoles != null && !userRoles.isEmpty()) {
			for (SysUserRole userRole : userRoles) {
				TableModel table = new TableModel();
				table.setTableName("userrole");
				table.addColumn("userId", "String", user.getActorId());
				table.addColumn("roleId", "String", userRole.getRoleId());
				tableDataService.deleteTableData(table);
			}
		}

		List<Membership> memberships = new ArrayList<Membership>();

		// ������Ȩ��
		if (newRoles != null && !newRoles.isEmpty()) {
			Iterator<SysDeptRole> iter = newRoles.iterator();
			while (iter.hasNext()) {
				SysDeptRole deptRole = iter.next();
				SysUserRole userRole = new SysUserRole();
				userRole.setId(idGenerator.getNextId());
				userRole.setUserId(user.getActorId());
				userRole.setRoleId(String.valueOf(deptRole.getId()));
				userRole.setCreateDate(new Date());
				userRole.setCreateBy(user.getUpdateBy());
				sysUserRoleMapper.insertSysUserRole(userRole);

				Membership membership = new Membership();
				membership.setActorId(user.getAccount());
				membership.setModifyBy(user.getUpdateBy());
				membership.setModifyDate(new java.util.Date());
				membership.setNodeId(deptRole.getDeptId());
				membership.setRoleId(deptRole.getRoleId());
				membership.setObjectId("userrole");
				membership.setObjectValue(String.valueOf(userRole.getId()));
				memberships.add(membership);
			}
		}

		membershipService.saveMemberships(user.getDeptId(), "UserRole",
				memberships);

		return true;
	}

	@Transactional
	public boolean updateUser(SysUser sysUser) {
		sysUserMapper.updateSysUser(sysUser);
		return true;
	}

	@Transactional
	public boolean updateUserRole(SysUser user, Set<SysRole> newRoles) {
		// ��ɾ���û�֮ǰ��Ȩ��
		List<SysUserRole> userRoles = sysUserRoleMapper
				.getSysUserRolesByUserId(user.getActorId());
		if (userRoles != null && !userRoles.isEmpty()) {
			for (SysUserRole userRole : userRoles) {
				TableModel table = new TableModel();
				table.setTableName("userrole");
				table.addColumn("userId", "String", user.getActorId());
				table.addColumn("roleId", "String", userRole.getRoleId());
				tableDataService.deleteTableData(table);
			}
		}

		List<Membership> memberships = new ArrayList<Membership>();

		// ������Ȩ��
		if (newRoles != null && !newRoles.isEmpty()) {
			Iterator<SysRole> iter = newRoles.iterator();
			while (iter.hasNext()) {
				SysRole role = iter.next();
				SysDeptRoleQuery query = new SysDeptRoleQuery();
				query.setDeptId(user.getDeptId());
				query.setRoleId(role.getId());
				List<SysDeptRole> deptRoles = sysDeptRoleMapper
						.getSysDeptRoles(query);
				if (deptRoles == null || deptRoles.isEmpty()) {
					SysDeptRole deptRole = new SysDeptRole();
					deptRole.setId(idGenerator.nextId());
					deptRole.setCreateBy(user.getUpdateBy());
					deptRole.setCreateDate(new Date());
					deptRole.setDeptId(user.getDeptId());
					deptRole.setRoleId(role.getId());
					deptRole.setGrade(0);
					deptRole.setSort(0);
					sysDeptRoleMapper.insertSysDeptRole(deptRole);
				}

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
