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

package com.glaf.base.modules.sys.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.model.SysDeptRole;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.core.util.PageResult;

@Transactional(readOnly = true)
public interface SysUserService {

	/**
	 * 保存
	 * 
	 * @param bean
	 *            SysUser
	 * @return boolean
	 */
	@Transactional
	boolean create(SysUser bean);

	/**
	 * 删除
	 * 
	 * @param id
	 *            int
	 * @return boolean
	 */
	@Transactional
	boolean delete(long id);

	/**
	 * 删除
	 * 
	 * @param bean
	 *            SysUser
	 * @return boolean
	 */
	@Transactional
	boolean delete(SysUser bean);

	/**
	 * 批量删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	boolean deleteAll(long[] id);

	/**
	 * 删除部门角色用户
	 * 
	 * @param deptRole
	 * @param userIds
	 */
	@Transactional
	void deleteRoleUsers(SysRole role, String[] userIds);

	/**
	 * 删除部门角色用户
	 * 
	 * @param deptRole
	 * @param userIds
	 */
	@Transactional
	void deleteRoleUsers(SysDeptRole deptRole, String[] userIds);

	/**
	 * 按名称查找对象
	 * 
	 * @param name
	 *            String
	 * @return SysUser
	 */
	SysUser findByAccount(String account);

	/**
	 * 按名称查找对象
	 * 
	 * @param name
	 *            String
	 * @return SysUser
	 */
	SysUser findByAccountWithAll(String account);

	/**
	 * 按名称查找对象
	 * 
	 * @param actorId
	 *            String
	 * @return SysUser
	 */
	SysUser findById(String actorId);

	/**
	 * 
	 * @param user
	 * @return
	 */
	Collection<SysDeptRole> getDeptRoles(SysUser user);

	/**
	 * 获取某个用户的上级
	 * 
	 * @param account
	 * @return
	 */
	List<SysUser> getSuperiors(String account);

	/**
	 * 查找供应商用户 flag = true 表示该用户存在，否则为不存在
	 * 
	 * @param supplierNo
	 * @return
	 */
	List<SysUser> getSupplierUser(String supplierNo);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getSysUserCountByQueryCriteria(SysUserQuery query);

	/**
	 * 获取列表
	 * 
	 * @param deptId
	 *            int
	 * @return List
	 */
	List<SysUser> getSysUserList();

	/**
	 * 获取列表
	 * 
	 * @param deptId
	 *            int
	 * @return List
	 */
	List<SysUser> getSysUserList(long deptId);

	/**
	 * 获取全部员工数据集 分页列表
	 * 
	 * @param pageNo
	 *            int
	 * @param pageSize
	 *            int
	 * @return
	 */
	PageResult getSysUserList(int pageNo, int pageSize);

	/**
	 * 获取特定部门的员工数据集 分页列表
	 * 
	 * @param deptId
	 *            int
	 * @param pageNo
	 *            int
	 * @param pageSize
	 *            int
	 * @return
	 */
	PageResult getSysUserList(long deptId, int pageNo, int pageSize);

	/**
	 * 查询获取sysUser列表
	 * 
	 * @param deptId
	 * @param fullName
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PageResult getSysUserList(long deptId, String fullName, int pageNo,
			int pageSize);

	/**
	 * 获取列表
	 * 
	 */
	PageResult getSysUserList(long deptId, String userName, String account,
			int pageNo, int pageSize);

	/**
	 * 获取某个应用的权限用户
	 * 
	 * @param appId
	 * @return
	 */
	List<SysUser> getSysUsersByAppId(Long appId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<SysUser> getSysUsersByQueryCriteria(int start, int pageSize,
			SysUserQuery query);

	/**
	 * 获取某个角色代码的用户
	 * 
	 * @param roleCode
	 * @return
	 */
	List<SysUser> getSysUsersByRoleCode(String roleCode);

	/**
	 * 获取某个角色编号的用户
	 * 
	 * @param roleId
	 * @return
	 */
	List<SysUser> getSysUsersByRoleId(long roleId);

	/**
	 * 获取列表
	 * 
	 * @param deptId
	 *            int
	 * @return List
	 */
	List<SysUser> getSysUserWithDeptList();

	SysUser getUserAndPrivileges(SysUser user);

	/**
	 * 其用户权限
	 * 
	 * @param user
	 * @return
	 */
	SysUser getUserPrivileges(SysUser user);

	String getPasswordByAccount(String account);

	/**
	 * 获取某些用户的角色
	 * 
	 * @param actorIds
	 * @return
	 */
	List<SysRole> getUserRoles(List<String> actorIds);

	/**
	 * 获取某个用户的角色
	 * 
	 * @param actorId
	 * @return
	 */
	List<SysRole> getUserRoles(String actorId);

	/**
	 * 判断用户是否有权限
	 * 
	 * @param user
	 * @param code
	 * @return
	 */
	boolean isPermission(SysUser user, String roleCode);

	/**
	 * 更新
	 * 
	 * @param bean
	 *            SysUser
	 * @return boolean
	 */
	@Transactional
	boolean update(SysUser bean);

	/**
	 * 设置用户权限
	 * 
	 * @param user
	 *            系统用户
	 * @param delRoles
	 *            要删除的用户权限
	 * @param newRoles
	 *            要增加的用户权限
	 */
	@Transactional
	boolean updateRole(SysUser user, Set<SysDeptRole> newRoles);

	/**
	 * 修改用户信息
	 * 
	 * @param bean
	 * @return
	 */
	@Transactional
	boolean updateUser(SysUser bean);

	@Transactional
	void updateUserPassword(SysUser sysUser);

	/**
	 * 设置用户角色
	 * 
	 * @param user
	 *            用户
	 * @param newRoles
	 *            角色集合
	 * @return
	 */
	@Transactional
	boolean updateUserRole(SysUser user, Set<SysRole> newRoles);

}