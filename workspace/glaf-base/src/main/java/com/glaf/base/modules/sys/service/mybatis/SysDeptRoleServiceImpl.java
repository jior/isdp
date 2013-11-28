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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.mapper.SysAccessMapper;
import com.glaf.base.modules.sys.mapper.SysApplicationMapper;
import com.glaf.base.modules.sys.mapper.SysDeptRoleMapper;
import com.glaf.base.modules.sys.mapper.SysFunctionMapper;
import com.glaf.base.modules.sys.mapper.SysPermissionMapper;
import com.glaf.base.modules.sys.mapper.SysUserMapper;
import com.glaf.base.modules.sys.mapper.SysUserRoleMapper;
import com.glaf.base.modules.sys.model.SysAccess;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysDeptRole;
import com.glaf.base.modules.sys.model.SysPermission;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.SysUserRole;
import com.glaf.base.modules.sys.query.SysDeptRoleQuery;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysDeptRoleService;
import com.glaf.base.modules.sys.service.SysFunctionService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.core.base.TableModel;
import com.glaf.core.domain.Membership;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.service.MembershipService;
import com.glaf.core.util.PageResult;

@Service("sysDeptRoleService")
@Transactional(readOnly = true)
public class SysDeptRoleServiceImpl implements SysDeptRoleService {
	protected final static Log logger = LogFactory
			.getLog(SysDeptRoleServiceImpl.class);

	protected IdGenerator idGenerator;

	protected MembershipService membershipService;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected SysAccessMapper sysAccessMapper;

	protected SysApplicationMapper sysApplicationMapper;

	protected SysApplicationService sysApplicationService;

	protected SysDepartmentService sysDepartmentService;

	protected SysDeptRoleMapper sysDeptRoleMapper;

	protected SysFunctionMapper sysFunctionMapper;

	protected SysFunctionService sysFunctionService;

	protected SysPermissionMapper sysPermissionMapper;

	protected SysRoleService sysRoleService;

	protected SysUserMapper sysUserMapper;

	protected SysUserRoleMapper sysUserRoleMapper;

	protected SysUserService sysUserService;

	protected ITableDataService tableDataService;

	public SysDeptRoleServiceImpl() {

	}

	public int count(SysDeptRoleQuery query) {
		query.ensureInitialized();
		return sysDeptRoleMapper.getSysDeptRoleCount(query);
	}

	@Transactional
	public boolean create(SysDeptRole bean) {
		this.save(bean);
		return true;
	}

	@Transactional
	public boolean delete(long id) {
		this.deleteById(id);
		return true;
	}

	@Transactional
	public boolean delete(SysDeptRole bean) {
		this.deleteById(bean.getId());
		return true;
	}

	@Transactional
	public boolean deleteAll(long[] ids) {
		if (ids != null && ids.length > 0) {
			for (long id : ids) {
				this.deleteById(id);
			}
		}
		return true;
	}

	@Transactional
	public boolean deleteByDept(long deptId) {
		sysDeptRoleMapper.deleteSysDeptRoleByDeptId(deptId);
		return true;
	}

	@Transactional
	public void deleteById(Long id) {
		if (id != null) {
			sysDeptRoleMapper.deleteSysDeptRoleById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Long> rowIds) {
		if (rowIds != null && !rowIds.isEmpty()) {
			SysDeptRoleQuery query = new SysDeptRoleQuery();
			query.rowIds(rowIds);
			sysDeptRoleMapper.deleteSysDeptRoles(query);
		}
	}

	public SysDeptRole find(long deptId, long roleId) {
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setDeptId(deptId);
		query.setRoleId(roleId);
		query.setOrderBy(" E.ID desc ");
		List<SysDeptRole> list = this.list(query);
		if (list != null && !list.isEmpty()) {
			SysDeptRole deptRole = list.get(0);
			deptRole.setDept(sysDepartmentService.findById(deptRole.getDeptId()));
			deptRole.setRole(sysRoleService.findById(deptRole.getRoleId()));
			deptRole.getApps().addAll(
					sysApplicationMapper.getSysApplicationByRoleId(deptRole
							.getRoleId()));
			deptRole.getFunctions().addAll(
					sysFunctionMapper.getSysFunctionByRoleId(deptRole
							.getRoleId()));
			SysDeptRoleQuery q = new SysDeptRoleQuery();
			q.setDeptId(deptId);
			q.setRoleId(roleId);
			List<SysUser> users = sysUserMapper.getSysDeptRoleUsers(q);
			deptRole.getUsers().addAll(users);
			return deptRole;
		}
		return null;
	}

	public SysDeptRole findById(long id) {
		return this.getSysDeptRole(id);
	}

	public Set<SysUser> findRoleUser(long deptId, String roleCode) {
		Set<SysUser> users = new HashSet<SysUser>();
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.deptId(deptId);
		query.setRoleCode(roleCode);
		List<SysUser> list = sysUserMapper.getSysDeptRoleUsers(query);

		if (list != null && !list.isEmpty()) {
			this.initUserDepartments(list);
			users.addAll(list);
		}

		return users;
	}

	public List<SysDeptRole> getRoleList(long deptId) {
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setDeptId(deptId);
		List<SysDeptRole> list = this.list(query);
		this.initRoles(list);
		return list;
	}

	public PageResult getRoleList(long deptId, int pageNo, int pageSize) {
		// 计算总数
		PageResult pager = new PageResult();
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.deptId(Long.valueOf(deptId));
		int count = this.count(query);
		if (count == 0) {// 结果集为空
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.SORT desc");

		int start = pageSize * (pageNo - 1);
		List<SysDeptRole> list = this.getSysDeptRolesByQueryCriteria(start,
				pageSize, query);
		this.initRoles(list);
		pager.setResults(list);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	public SysDeptRole getSysDeptRole(Long id) {
		if (id == null) {
			return null;
		}
		SysDeptRole deptRole = sysDeptRoleMapper.getSysDeptRoleById(id);
		if (deptRole != null) {
			deptRole.setDept(sysDepartmentService.findById(deptRole.getDeptId()));
			deptRole.setRole(sysRoleService.findById(deptRole.getRoleId()));
			deptRole.getApps().addAll(
					sysApplicationMapper.getSysApplicationByRoleId(deptRole
							.getRoleId()));
			deptRole.getFunctions().addAll(
					sysFunctionMapper.getSysFunctionByRoleId(deptRole
							.getRoleId()));
		}
		return deptRole;
	}

	public int getSysDeptRoleCountByQueryCriteria(SysDeptRoleQuery query) {
		return sysDeptRoleMapper.getSysDeptRoleCount(query);
	}

	public List<SysDeptRole> getSysDeptRolesByQueryCriteria(int start,
			int pageSize, SysDeptRoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysDeptRole> rows = sqlSessionTemplate.selectList(
				"getSysDeptRoles", query, rowBounds);
		return rows;
	}

	protected void initRoles(List<SysDeptRole> list) {
		if (list != null && !list.isEmpty()) {
			List<SysRole> rows = sysRoleService.getSysRoleList();
			Map<Long, SysRole> dataMap = new HashMap<Long, SysRole>();
			if (rows != null && !rows.isEmpty()) {
				for (SysRole m : rows) {
					dataMap.put(m.getId(), m);
				}
			}
			for (SysDeptRole bean : list) {
				bean.setRole(dataMap.get(Long.valueOf(bean.getRoleId())));
			}
		}
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
				user.setDepartment(deptMap.get(Long.valueOf(user.getDeptId())));
			}
		}
	}

	public List<SysDeptRole> list(SysDeptRoleQuery query) {
		query.ensureInitialized();
		List<SysDeptRole> list = sysDeptRoleMapper.getSysDeptRoles(query);
		return list;
	}

	@Transactional
	public void save(SysDeptRole sysDeptRole) {
		if (sysDeptRole.getId() == 0) {
			sysDeptRole.setId(idGenerator.nextId());
			sysDeptRole.setCreateDate(new Date());
			sysDeptRoleMapper.insertSysDeptRole(sysDeptRole);
		} else {
			sysDeptRoleMapper.updateSysDeptRole(sysDeptRole);
		}

		Membership membership = new Membership();
		membership.setModifyBy(sysDeptRole.getCreateBy());
		membership.setModifyDate(new java.util.Date());
		membership.setNodeId(sysDeptRole.getDeptId());
		membership.setRoleId(sysDeptRole.getRoleId());
		membership.setObjectId("SYS_DEPT_ROLE");
		membership.setObjectValue(String.valueOf(sysDeptRole.getId()));
		membership.setType("SysDeptRole");
		membershipService.save(membership);
	}

	/**
	 * 设置角色对应的模块、功能
	 * 
	 * @param roleId
	 * @param appId
	 * @param funcId
	 * @return
	 */
	@Transactional
	public boolean saveRoleApplication(long roleId, long[] appIds,
			long[] funcIds) {
		SysDeptRole role = findById(roleId);
		if (role != null && appIds != null) {
			sysAccessMapper.deleteSysAccessByRoleId(roleId);
			sysAccessMapper.deleteSysAccessByRoleId(role.getRoleId());
			// 设置角色对应的模块访问权限
			for (int i = 0; i < appIds.length; i++) {
				logger.debug("app id:" + appIds[i]);
				if (appIds[i] > 0) {
					SysAccess access = new SysAccess();
					access.setAppId(appIds[i]);
					access.setRoleId(role.getId());
					sysAccessMapper.insertSysAccess(access);

					if (roleId != role.getRoleId()) {
						SysAccess access2 = new SysAccess();
						access2.setAppId(appIds[i]);
						access2.setRoleId(role.getRoleId());
						sysAccessMapper.insertSysAccess(access2);
					}
				}
			}
		}

		// 设置模块对应的功能操作权限
		if (role != null && funcIds != null) {
			sysPermissionMapper.deleteSysPermissionByRoleId(roleId);
			sysPermissionMapper.deleteSysPermissionByRoleId(role.getRoleId());
			for (int i = 0; i < funcIds.length; i++) {
				logger.debug("function id:" + funcIds[i]);
				if (funcIds[i] > 0) {
					SysPermission p = new SysPermission();
					p.setFuncId(funcIds[i]);
					p.setRoleId(role.getId());
					sysPermissionMapper.insertSysPermission(p);

					if (roleId != role.getRoleId()) {
						SysPermission p2 = new SysPermission();
						p2.setFuncId(funcIds[i]);
						p2.setRoleId(role.getRoleId());
						sysPermissionMapper.insertSysPermission(p2);
					}
				}
			}
		}
		return true;
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
	public void setSysApplicationService(
			SysApplicationService sysApplicationService) {
		this.sysApplicationService = sysApplicationService;
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
	public void setSysFunctionService(SysFunctionService sysFunctionService) {
		this.sysFunctionService = sysFunctionService;
	}

	@Resource
	public void setSysPermissionMapper(SysPermissionMapper sysPermissionMapper) {
		this.sysPermissionMapper = sysPermissionMapper;
	}

	@Resource
	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
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
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	@Resource
	public void setTableDataService(ITableDataService tableDataService) {
		this.tableDataService = tableDataService;
	}

	/**
	 * 排序
	 * 
	 * @param bean
	 *            SysDeptRole
	 * @param operate
	 *            int 操作
	 */
	@Transactional
	public void sort(SysDeptRole bean, int operate) {
		if (bean == null)
			return;
		if (operate == SysConstants.SORT_PREVIOUS) {// 前移
			sortByPrevious(bean);
		} else if (operate == SysConstants.SORT_FORWARD) {// 后移
			sortByForward(bean);
		}
	}

	/**
	 * 向后移动排序
	 * 
	 * @param bean
	 */
	private void sortByForward(SysDeptRole bean) {
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setDeptId(bean.getDeptId());
		query.setSortLessThan(bean.getSort());
		query.setOrderBy(" E.SORT desc ");

		// 查找后一个对象
		List<SysDeptRole> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysDeptRole temp = (SysDeptRole) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean

			temp.setSort(i);
			this.update(temp);// 更新temp
		}
	}

	/**
	 * 向前移动排序
	 * 
	 * @param bean
	 */
	private void sortByPrevious(SysDeptRole bean) {
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setDeptId(bean.getDeptId());
		query.setSortGreaterThan(bean.getSort());
		query.setOrderBy(" E.SORT asc ");
		// 查找前一个对象

		List<SysDeptRole> list = this.list(query);
		if (list != null && list.size() > 0) {// 有记录
			SysDeptRole temp = (SysDeptRole) list.get(0);
			int i = bean.getSort();
			bean.setSort(temp.getSort());
			this.update(bean);// 更新bean

			temp.setSort(i);
			this.update(temp);// 更新temp
		}
	}

	@Transactional
	public boolean update(SysDeptRole bean) {
		this.save(bean);
		TableModel table = new TableModel();
		table.setTableName("userrole");
		table.addStringColumn("ROLEID", String.valueOf(bean.getRoleId()));
		tableDataService.deleteTableData(table);

		List<Membership> memberships = new ArrayList<Membership>();
		Set<SysUser> users = bean.getUsers();
		if (users != null && !users.isEmpty()) {
			for (SysUser user : users) {
				SysUserRole userRole = new SysUserRole();
				userRole.setId(idGenerator.getNextId());
				userRole.setUserId(user.getActorId());
				userRole.setRoleId(String.valueOf(bean.getId()));
				userRole.setDeptRole(bean);
				userRole.setCreateBy(bean.getCreateBy());
				userRole.setCreateDate(new Date());
				sysUserRoleMapper.insertSysUserRole(userRole);

				SysUserRole userRole2 = new SysUserRole();
				userRole2.setId(idGenerator.getNextId());
				userRole2.setUserId(user.getActorId());
				userRole2.setRoleId(String.valueOf(bean.getRoleId()));
				userRole2.setDeptRole(bean);
				userRole2.setCreateBy(bean.getCreateBy());
				userRole2.setCreateDate(new Date());
				sysUserRoleMapper.insertSysUserRole(userRole2);

				Membership membership = new Membership();
				membership.setActorId(user.getAccount());
				membership.setModifyBy(bean.getCreateBy());
				membership.setModifyDate(new java.util.Date());
				membership.setNodeId(bean.getDeptId());
				membership.setRoleId(bean.getRoleId());
				membership.setObjectId("userrole");
				membership.setObjectValue(String.valueOf(userRole.getId()));
				memberships.add(membership);
			}
		}

		membershipService.saveMemberships(bean.getDeptId(), bean.getRoleId(),
				"DeptRoleUser", memberships);

		return true;
	}

}
