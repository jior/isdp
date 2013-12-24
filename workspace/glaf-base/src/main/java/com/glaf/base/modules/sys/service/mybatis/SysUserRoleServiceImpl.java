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

import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.mapper.SysDeptRoleMapper;
import com.glaf.base.modules.sys.mapper.SysRoleMapper;
import com.glaf.base.modules.sys.mapper.SysUserMapper;
import com.glaf.base.modules.sys.mapper.SysUserRoleMapper;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysDeptRole;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.SysUserRole;
import com.glaf.base.modules.sys.query.SysDeptRoleQuery;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.query.SysUserRoleQuery;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysUserRoleService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.core.base.TableModel;
import com.glaf.core.domain.Membership;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.security.Authentication;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.service.MembershipService;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.PageResult;

@Service("sysUserRoleService")
@Transactional(readOnly = true)
public class SysUserRoleServiceImpl implements SysUserRoleService {
	protected final static Log logger = LogFactory
			.getLog(SysUserRoleServiceImpl.class);

	protected IdGenerator idGenerator;

	protected MembershipService membershipService;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected SysDepartmentService sysDepartmentService;

	protected SysDeptRoleMapper sysDeptRoleMapper;

	protected SysUserMapper sysUserMapper;

	protected SysRoleMapper sysRoleMapper;

	protected SysUserRoleMapper sysUserRoleMapper;

	protected SysUserService sysUserService;

	protected ITableDataService tableDataService;

	public SysUserRoleServiceImpl() {

	}

	@Transactional
	public boolean addRole(String fromUserId, String toUserId,
			String startDate, String endDate, int mark, String processNames,
			String processDescriptions) {
		boolean ret = false;
		if (null != processNames && processNames.length() > 0) {
			processNames = processNames.substring(0,
					processNames.lastIndexOf(","));
		}
		if (null != processDescriptions && processDescriptions.length() > 0) {
			processDescriptions = processDescriptions.substring(0,
					processDescriptions.lastIndexOf(","));
		}
		SysUser fromUser = sysUserService.findById(fromUserId);
		SysUser toUser = sysUserService.findById(toUserId);
		if (fromUser == null || toUser == null
				|| StringUtils.equals(fromUserId, toUserId)) {
			return ret;
		}
		// ȡ����Ȩ��fromUser�Ľ�ɫ����
		SysUserRoleQuery query = new SysUserRoleQuery();
		query.userId(fromUserId);
		query.authorized(0);// 0-��ɫ�û�
		// �ҵ���Ȩ�˵Ľ�ɫ����TA�ڸ�������
		List<SysUserRole> userRoles = this.list(query);
		Iterator<SysUserRole> iter = userRoles.iterator();
		while (iter.hasNext()) {
			SysUserRole userRole = (SysUserRole) iter.next();
			logger.debug("##" + userRole.getUserId() + ":"
					+ userRole.getRoleId());
			// �ڸ�����Ȩ��
			SysUserRole bean = new SysUserRole();
			bean.setId(this.idGenerator.getNextId());
			bean.setAuthorizeFrom(fromUser.getActorId());
			bean.setUser(toUser);
			bean.setUserId(toUser.getActorId());
			bean.setRoleId(userRole.getRoleId());
			bean.setAuthorized(1);
			bean.setAvailDateStart(DateUtils.toDate(startDate));
			bean.setAvailDateEnd(DateUtils.toDate(endDate));
			bean.setProcessDescription(processDescriptions);
			if (mark == 1) {
				bean.setProcessDescription("ȫ�ִ���");
			}

			bean.setCreateDate(new Date());
			bean.setCreateBy(Authentication.getAuthenticatedActorId());

			sysUserRoleMapper.insertSysUserRole(bean);

		}
		// ���ӹ�����
		insertAgent(fromUser, toUser, startDate, endDate, mark, processNames);
		return true;
	}

	public int count(SysUserRoleQuery query) {
		query.ensureInitialized();
		return sysUserRoleMapper.getSysUserRoleCount(query);
	}

	@Transactional
	public boolean create(SysUserRole bean) {
		if (bean.getId() == null) {
			bean.setId(idGenerator.getNextId());
		}
		bean.setCreateDate(new Date());
		sysUserRoleMapper.insertSysUserRole(bean);
		return true;
	}

	@Transactional
	public boolean delete(SysUserRole bean) {
		this.deleteById(bean.getId());
		return true;
	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			sysUserRoleMapper.deleteSysUserRoleById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Long> rowIds) {
		if (rowIds != null && !rowIds.isEmpty()) {
			SysUserRoleQuery query = new SysUserRoleQuery();
			query.rowIds(rowIds);
			sysUserRoleMapper.deleteSysUserRoles(query);
		}
	}

	public SysUserRole findById(String id) {
		return this.getSysUserRole(id);
	}

	public PageResult getAllAuthorizedUser(Map<String, String> filter) {
		int pageNo = 1;
		if ((String) filter.get("page_no") != null) {
			pageNo = Integer.parseInt((String) filter.get("page_no"));
		}
		int pageSize = 2 * Constants.PAGE_SIZE;
		if ((String) filter.get("page_size") != null) {
			pageSize = Integer.parseInt((String) filter.get("page_size"));
		}

		SysUserQuery query = new SysUserQuery();

		String deptId = (String) filter.get("deptId");
		if (deptId != null) {
			query.deptId(Long.parseLong(deptId));
		}

		String name = (String) filter.get("name");
		if (name != null) {
			query.nameLike(name);
		}

		String startDate = (String) filter.get("startDate");
		if (startDate != null) {
			query.setAvailDateStartGreaterThanOrEqual(DateUtils
					.toDate(startDate));
		}

		String endDate = (String) filter.get("endDate");
		if (endDate != null) {
			query.setAvailDateEndLessThanOrEqual(DateUtils.toDate(endDate));
		}

		// ��������
		PageResult pager = new PageResult();

		int count = sysUserMapper.getCountAuthorizedUsers(query);
		if (count == 0) {// �����Ϊ��
			pager.setPageSize(pageSize);
			return pager;
		}
		query.setOrderBy(" E.SORT desc");

		int start = pageSize * (pageNo - 1);

		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysUser> rows = sqlSessionTemplate.selectList(
				"getAuthorizedUsers", query, rowBounds);
		this.initUserDepartments(rows);
		this.initUserRoles(rows);
		pager.setResults(rows);
		pager.setPageSize(pageSize);
		pager.setCurrentPageNo(pageNo);
		pager.setTotalRecordCount(count);

		return pager;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getAuthorizedUser(SysUser user) {
		List list = new ArrayList();
		Map<String, SysUser> userMap = new HashMap<String, SysUser>();
		List<SysUser> users = sysUserMapper.getAuthorizedUsersByUserId(user
				.getActorId());
		if (users != null && !users.isEmpty()) {
			for (SysUser u : users) {
				userMap.put(u.getActorId(), u);
			}
		}

		this.initUserDepartments(users);

		SysUserRoleQuery query = new SysUserRoleQuery();
		query.authorizeFrom(user.getActorId());
		query.authorized(1);

		List<SysUserRole> roles = this.list(query);
		if (roles != null && !roles.isEmpty()) {
			for (SysUserRole role : roles) {
				Object[] array = new Object[4];
				array[0] = userMap.get(role.getUserId());
				array[1] = role.getAvailDateStart();
				array[2] = role.getAvailDateEnd();
				array[3] = role.getProcessDescription();
				list.add(array);
			}
		}

		return list;
	}

	public List<SysUser> getChildrenMembershipUsers(long deptId, long roleId) {
		List<SysUser> users = new ArrayList<SysUser>();
		SysDepartment dept = sysDepartmentService.findById(deptId);
		if (dept != null) {
			List<SysDepartment> list = new ArrayList<SysDepartment>();
			sysDepartmentService.findNestingDepartment(list, deptId);
			if (!list.isEmpty()) {
				for (SysDepartment dp : list) {
					List<SysUser> userlist = getMembershipUsers(
							(int) dp.getId(), roleId);
					if (!userlist.isEmpty()) {
						users.addAll(userlist);
					}
				}
			} else {
				return this.getMembershipUsers(deptId, roleId);
			}
		}
		return users;
	}

	public List<SysUser> getMembershipUsers(List<Long> deptIds, long roleId) {
		List<SysUser> users = new ArrayList<SysUser>();
		for (Long deptId : deptIds) {
			List<SysUser> list = this.getMembershipUsers(deptId, roleId);
			if (!list.isEmpty()) {
				users.addAll(list);
			}
		}
		this.initUserDepartments(users);
		return users;
	}

	public List<SysUser> getMembershipUsers(long deptId, long roleId) {
		List<SysUser> users = new ArrayList<SysUser>();
		SysDepartment dept = sysDepartmentService.findById(deptId);
		if (dept != null && dept.getRoles() != null) {
			Set<SysDeptRole> roles = dept.getRoles();
			for (SysDeptRole role : roles) {
				if (role.getRole() != null && role.getRole().getId() == roleId) {
					if (role.getUsers() != null && !role.getUsers().isEmpty()) {
						users.addAll(role.getUsers());
					}
				}
			}
		}
		this.initUserDepartments(users);
		return users;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List getProcessByUser(SysUser user) {
		List list = new ArrayList();
		List<Map<String, Object>> rows = sysUserRoleMapper
				.getProcessByUser(user.getActorId());
		if (rows != null && !rows.isEmpty()) {
			for (Map<String, Object> dataMap : rows) {
				Object[] array = new Object[3];
				array[0] = dataMap.get("moduleName");
				array[1] = dataMap.get("processName");
				array[2] = dataMap.get("objectValue");
				list.add(array);
			}
		}

		return list;
	}

	public SysUserRole getSysUserRole(String id) {
		if (id == null) {
			return null;
		}
		SysUserRole sysUserRole = sysUserRoleMapper.getSysUserRoleById(id);
		return sysUserRole;
	}

	public int getSysUserRoleCountByQueryCriteria(SysUserRoleQuery query) {
		return sysUserRoleMapper.getSysUserRoleCount(query);
	}

	public List<SysUserRole> getSysUserRolesByQueryCriteria(int start,
			int pageSize, SysUserRoleQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<SysUserRole> rows = sqlSessionTemplate.selectList(
				"getSysUserRoles", query, rowBounds);
		return rows;
	}

	public List<SysUser> getUnAuthorizedUser(SysUser user) {
		if (user == null) {
			return new ArrayList<SysUser>();
		}
		logger.debug("name:" + user.getName());
		user = sysUserService.findById(user.getActorId());
		List<SysUser> list = null;
		// ȡ���ڲ���,�ж��Ƿ����¼�����
		SysDepartment dept = user.getDepartment();
		if (dept != null) {
			logger.debug("dept:" + dept.getName());
			list = sysUserService.getSysUserList(dept.getId());

			// ѭ��ȡ�������û�
			List<SysDepartment> deptList = sysDepartmentService
					.getSysDepartmentList(dept.getId());
			Iterator<SysDepartment> iter = deptList.iterator();
			while (iter.hasNext()) {
				SysDepartment dept2 = (SysDepartment) iter.next();
				logger.debug("dept:" + dept2.getName());
				list.addAll(sysUserService.getSysUserList(dept2.getId()));
			}

			// ��ȥ�Լ�
			list.remove(user);
			// ��ȥ����Ȩ�û�
			list.removeAll(getAuthorizedUser(user));
		}

		return list;
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

	protected void initUserRoles(List<SysUser> users) {
		if (users != null && !users.isEmpty()) {
			for (SysUser user : users) {
				List<SysUserRole> userRoles = sysUserRoleMapper
						.getSysUserRolesByUserId(user.getActorId());
				user.getUserRoles().addAll(userRoles);
			}
		}
	}

	@Transactional
	public void insertAgent(SysUser fromUser, SysUser toUser, String startDate,
			String endDate, int mark, String processNames) {
		if (endDate.length() == 10) {
			endDate += " 23:59:59";
		}
		if (mark == 1) {// ȫ�ִ���
			TableModel table = new TableModel();
			table.setTableName("SYS_AGENT");
			table.addStringColumn("ID_",
					String.valueOf(idGenerator.getNextId()));
			table.addStringColumn("ASSIGNTO_", toUser.getAccount());
			table.addStringColumn("ASSIGNFROM_", fromUser.getAccount());
			table.addIntegerColumn("AGENTTYPE_", 0);
			table.addDateColumn("STARTDATE_", DateUtils.toDate(startDate));
			table.addDateColumn("ENDDATE_", DateUtils.toDate(endDate));
			table.addStringColumn("SERVICEKEY_", "BPM");
			table.addIntegerColumn("LOCKED_", 0);
			tableDataService.insertTableData(table);
		} else {
			String[] ss = processNames.split(",");
			for (int i = 0; i < ss.length; i++) {
				String processName = ss[i];
				TableModel table = new TableModel();
				table.setTableName("SYS_AGENT");
				table.addStringColumn("ID_",
						String.valueOf(idGenerator.getNextId()));
				table.addStringColumn("ASSIGNTO_", toUser.getAccount());
				table.addStringColumn("ASSIGNFROM_", fromUser.getAccount());
				table.addIntegerColumn("AGENTTYPE_", 0);
				table.addDateColumn("STARTDATE_", DateUtils.toDate(startDate));
				table.addDateColumn("ENDDATE_", DateUtils.toDate(endDate));
				table.addStringColumn("SERVICEKEY_", "BPM");
				table.addStringColumn("PROCESSNAME_", processName);
				table.addIntegerColumn("LOCKED_", 0);
				tableDataService.insertTableData(table);
			}
		}
	}

	public boolean isAuthorized(String fromUserId, String toUserId) {
		SysUserRoleQuery query = new SysUserRoleQuery();
		query.userId(toUserId);
		query.authorizeFrom(fromUserId);

		int count = this.count(query);
		logger.debug("count:" + count + ",fromUserId:" + fromUserId
				+ ",toUserId:" + toUserId);
		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<SysUserRole> list(SysUserRoleQuery query) {
		query.ensureInitialized();
		List<SysUserRole> list = sysUserRoleMapper.getSysUserRoles(query);
		return list;
	}

	@Transactional
	public void removeAgent(SysUser fromUser, SysUser toUser) {
		TableModel table = new TableModel();
		table.setTableName("SYS_AGENT");
		table.addStringColumn("ASSIGNTO_", toUser.getAccount());
		table.addStringColumn("ASSIGNFROM_", fromUser.getAccount());
		tableDataService.deleteTableData(table);
	}

	@Transactional
	public boolean removeRole(String fromUserId, String toUserId) {
		boolean ret = false;
		SysUser fromUser = sysUserService.findById(fromUserId);
		SysUser toUser = sysUserService.findById(toUserId);
		if (fromUser == null || toUser == null)
			return ret;

		// ȡ������Ȩ��toUser�Ľ�ɫ����
		SysUserRoleQuery query = new SysUserRoleQuery();
		query.userId(toUser.getActorId());

		List<SysUserRole> userRoles = this.list(query);
		Iterator<SysUserRole> iter = userRoles.iterator();
		while (iter.hasNext()) {
			SysUserRole userRole = (SysUserRole) iter.next();
			// �ж��Ƿ�����Ȩ��
			if (userRole.getAuthorizeFrom() != null) {
				delete(userRole);// ɾ��Ȩ��
			}
		}
		// ɾ����������Ȩ
		removeAgent(fromUser, toUser);
		return true;
	}

	@Transactional
	public boolean removeRoles() {
		SysUserRoleQuery query = new SysUserRoleQuery();
		query.availDateEndLessThanOrEqual(new Date());
		query.authorized(1);

		// ȡ������Ȩ��toUser�Ľ�ɫ����
		List<SysUserRole> userRoles = this.list(query);
		Iterator<SysUserRole> iter = userRoles.iterator();
		while (iter.hasNext()) {
			SysUserRole userRole = (SysUserRole) iter.next();
			String fromUserId = userRole.getAuthorizeFrom();
			SysUser fromUser = sysUserService.findById(fromUserId);
			SysUser toUser = userRole.getUser();
			// �ж��Ƿ�����Ȩ��
			logger.debug("toUser:" + toUser.getName() + ",fromUser:"
					+ fromUser.getName() + ",remove role:"
					+ userRole.getDeptRole().getRole().getName()
					+ ",availDateEnd=" + userRole.getAvailDateEnd());
			delete(userRole);// ɾ��Ȩ��
			removeAgent(fromUser, toUser);// ɾ��������
		}
		return true;
	}

	@Transactional
	public void save(SysUserRole sysUserRole) {
		if (sysUserRole.getId() == null) {
			sysUserRole.setId(idGenerator.getNextId());
			sysUserRole.setCreateDate(new Date());
			sysUserRoleMapper.insertSysUserRole(sysUserRole);
		} else {
			sysUserRoleMapper.updateSysUserRole(sysUserRole);
		}

		SysUser user = sysUserMapper.getSysUserByAccount(sysUserRole
				.getUserId());
		SysDeptRoleQuery query = new SysDeptRoleQuery();
		query.setDeptId(user.getDeptId());
		query.setRoleId(Long.parseLong(sysUserRole.getRoleId()));
		List<SysDeptRole> deptRoles = sysDeptRoleMapper.getSysDeptRoles(query);
		if (deptRoles != null && !deptRoles.isEmpty()) {
			SysDeptRole sysDeptRole = deptRoles.get(0);
			if (sysDeptRole != null) {
				Membership membership = new Membership();
				membership.setActorId(user.getAccount());
				membership.setModifyBy(sysUserRole.getCreateBy());
				membership.setModifyDate(new java.util.Date());
				membership.setNodeId(sysDeptRole.getDeptId());
				membership.setRoleId(sysDeptRole.getRoleId());
				membership.setObjectId("userrole");
				membership.setObjectValue(String.valueOf(sysUserRole.getId()));
				membership.setType("SysUserRole");
				membershipService.save(membership);
			}
		}
	}

	/**
	 * �����ɫ�û�
	 * 
	 * @param roleId
	 * @param userIds
	 */
	@Transactional
	public void saveRoleUsers(long roleId, List<String> userIds) {
		TableModel tm = new TableModel();
		tm.setTableName("userrole");
		tm.addLongColumn("ROLEID", roleId);
		tableDataService.deleteTableData(tm);

		TableModel table = new TableModel();
		table.setTableName("SYS_MEMBERSHIP");
		table.addLongColumn("ROLEID_", roleId);
		table.addStringColumn("OBJECTID_", "userrole");
		table.addStringColumn("TYPE_", "SysUserRole");
		tableDataService.deleteTableData(table);

		for (String userId : userIds) {
			SysUser user = sysUserMapper.getSysUserByAccount(userId);
			if (user != null && user.getDeptId() > 0) {
				SysDeptRoleQuery query = new SysDeptRoleQuery();
				query.setDeptId(user.getDeptId());
				query.setRoleId(roleId);
				List<SysDeptRole> deptRoles = sysDeptRoleMapper
						.getSysDeptRoles(query);
				if (deptRoles == null || deptRoles.isEmpty()) {
					SysDeptRole deptRole = new SysDeptRole();
					deptRole.setId(idGenerator.nextId());
					deptRole.setCreateDate(new Date());
					deptRole.setDeptId(user.getDeptId());
					deptRole.setRoleId(roleId);
					deptRole.setGrade(0);
					deptRole.setSort(0);
					sysDeptRoleMapper.insertSysDeptRole(deptRole);
				}
			}

			if (user != null) {
				SysUserRole userRole = new SysUserRole();
				userRole.setId(idGenerator.getNextId());
				userRole.setUserId(user.getActorId());
				userRole.setRoleId(String.valueOf(roleId));
				userRole.setCreateDate(new Date());
				sysUserRoleMapper.insertSysUserRole(userRole);

				Membership membership = new Membership();
				membership.setActorId(user.getActorId());
				membership.setModifyDate(new java.util.Date());
				membership.setRoleId(roleId);
				membership.setNodeId(user.getDeptId());
				membership.setObjectId("userrole");
				membership.setObjectValue(String.valueOf(roleId));
				membership.setType("SysUserRole");
				membershipService.save(membership);
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
	public void setSysDepartmentService(
			SysDepartmentService sysDepartmentService) {
		this.sysDepartmentService = sysDepartmentService;
	}

	@Resource
	public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
		this.sysRoleMapper = sysRoleMapper;
	}

	@Resource
	public void setSysDeptRoleMapper(SysDeptRoleMapper sysDeptRoleMapper) {
		this.sysDeptRoleMapper = sysDeptRoleMapper;
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

	@Transactional
	public boolean update(SysUserRole bean) {
		this.save(bean);
		return true;
	}

}
