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

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.SysUserRole;
import com.glaf.core.util.PageResult;

@SuppressWarnings("rawtypes")
@Transactional(readOnly = true)
public interface SysUserRoleService {

	/**
	 * ��Ȩ
	 * 
	 * @param fromUser
	 *            SysUser ��Ȩ��
	 * @param toUser
	 *            SysUser ����Ȩ��
	 * @param startDate
	 *            String
	 * @param endDate
	 *            String
	 */
	@Transactional
	boolean addRole(String fromUserId, String toUserId, String startDate,
			String endDate, int mark, String processNames,
			String processDescriptions);
	
	/**
	 * ����
	 * 
	 * @param bean
	 *            SysUserRole
	 * @return boolean
	 */
	@Transactional
	boolean create(SysUserRole bean);

	/**
	 * ��ȡ����
	 * 
	 * @param id
	 *            long
	 * @return
	 */
	SysUserRole findById(String id);
 

	/**
	 * 
	 * @param filter
	 * @return
	 */
	PageResult getAllAuthorizedUser(Map<String, String> filter);

	/**
	 * ĳ������Ȩ���û��б�
	 * 
	 * @param user
	 *            SysUser
	 * @return
	 */
	List getAuthorizedUser(SysUser user);

	/**
	 * ��ȡĳ�����ż������¼����ŵ�ĳ����ɫ���û�
	 * 
	 * @param deptId
	 * @param roleId
	 * @return
	 */
	List<SysUser> getChildrenMembershipUsers(long deptId, long roleId);

	/**
	 * ��ȡ�������ĳ����ɫ���û�
	 * 
	 * @param deptIds
	 * @param roleId
	 * @return
	 */
	List<SysUser> getMembershipUsers(List<Long> deptIds, long roleId);

	/**
	 * ��ȡĳ������ĳ����ɫ���û�
	 * 
	 * @param deptId
	 * @param roleId
	 * @return
	 */
	List<SysUser> getMembershipUsers(long deptId, long roleId);

	/**
	 * ��ȡ�û����е�����������
	 */
	List getProcessByUser(SysUser user);

	/**
	 * ȡ�������µ�δ��Ȩ�û��б��������Լ�������Ȩ�û���
	 * 
	 * @param user
	 *            SysUser
	 * @return
	 */
	List getUnAuthorizedUser(SysUser user);

	/**
	 * ��������Ȩ
	 * 
	 * @param fromUser
	 * @param toUser
	 */
	@Transactional
	void insertAgent(SysUser fromUser, SysUser toUser, String startDate,
			String endDate, int mark, String processNames);

	/**
	 * �ж��Ƿ��Ѿ���Ȩ��
	 * 
	 * @param fromUserId
	 *            long
	 * @param toUserId
	 *            long
	 * @return
	 */
	boolean isAuthorized(String fromUserId, String toUserId);

	@Transactional
	void removeAgent(SysUser fromUser, SysUser toUser);

	/**
	 * ȡ����Ȩ
	 * 
	 * @param fromUser
	 *            SysUser ��Ȩ��
	 * @param toUser
	 *            SysUser ����Ȩ��
	 */
	@Transactional
	boolean removeRole(String fromUserId, String toUserId);

	/**
	 * ��ʱ����ɾ�����ڴ�����Ȩ��
	 * 
	 * @return
	 */
	@Transactional
	public boolean removeRoles();

	/**
	 * �����ɫ�û�
	 * @param roleId
	 * @param userIds
	 */
	@Transactional
	void saveRoleUsers(long roleId, List<String> userIds);

	/**
	 * ����
	 * 
	 * @param bean
	 *            SysUserRole
	 * @return boolean
	 */
	@Transactional
	boolean update(SysUserRole bean);
}