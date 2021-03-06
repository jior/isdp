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

import org.json.JSONArray;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.model.RealmInfo;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysApplicationQuery;
import com.glaf.core.base.TreeModel;
import com.glaf.core.util.PageResult;

@Transactional(readOnly = true)
public interface SysApplicationService {

	/**
	 * 保存
	 * 
	 * @param bean
	 *            SysApplication
	 * @return boolean
	 */
	@Transactional
	boolean create(SysApplication bean);

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
	 *            SysApplication
	 * @return boolean
	 */
	@Transactional
	boolean delete(SysApplication bean);

	/**
	 * 批量删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional
	boolean deleteAll(long[] id);

	/**
	 * 按编码查找对象
	 * 
	 * @param code
	 *            String
	 * @return SysApplication
	 */
	SysApplication findByCode(String code);

	/**
	 * 获取对象
	 * 
	 * @param id
	 * @return
	 */
	SysApplication findById(long id);

	/**
	 * 按名称查找对象
	 * 
	 * @param name
	 *            String
	 * @return SysApplication
	 */
	SysApplication findByName(String name);

	SysApplication findByNodeId(long nodeId);

	/**
	 * 获取用户能访问到的模块列表
	 * 
	 * @param userId
	 *            int
	 * @param parent
	 *            int
	 * @return List
	 */
	List<SysApplication> getAccessAppList(long parent, SysUser user);

	/**
	 * 获取全部列表
	 * 
	 * @return List
	 */
	List<SysApplication> getApplicationList();
	
	
	/**
	 * 获取某个用户的全部模块列表
	 * 
	 * @return List
	 */
	List<SysApplication> getSysApplicationByUserId(String actorId);

	/**
	 * 获取列表
	 * 
	 * @param parentId
	 *            int
	 * @return List
	 */
	List<SysApplication> getApplicationList(long parentId);

	/**
	 * 获取分页列表
	 * 
	 * @param parentId
	 *            int
	 * @param pageNo
	 *            int
	 * @param pageSize
	 *            int
	 * @return
	 */
	PageResult getApplicationList(long parentId, int pageNo, int pageSize);

	PageResult getApplicationList(int pageNo, int pageSize,
			SysApplicationQuery query);

	/**
	 * 获取某个模块的角色及用户
	 * 
	 * @param appId
	 * @return
	 */
	List<SysRole> getApplicationRoleWithUsers(long appId);

	/**
	 * 获取菜单
	 * 
	 * @param parent
	 * @param userId
	 * @return
	 */
	String getMenu(long parent, SysUser user);

	List<RealmInfo> getRealmInfos();

	List<SysApplication> getRoleApplications(long roleId);

	/**
	 * 获取角色菜单之json对象
	 * 
	 * @param roleCode
	 * @return
	 */
	JSONArray getRoleMenu(String roleCode);

	/**
	 * 获取角色菜单之json对象
	 * 
	 * @param serviceUrl
	 * @param roleCode
	 * @return
	 */
	JSONArray getRoleMenu(String serviceUrl, String roleCode);

	List<SysApplication> getSysApplicationByRoleCode(String roleCode);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getSysApplicationCountByQueryCriteria(SysApplicationQuery query);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<SysApplication> getSysApplicationsByQueryCriteria(int start,
			int pageSize, SysApplicationQuery query);

	/**
	 * 获取用户某个分类下的顶级菜单节点
	 * 
	 * @param parent
	 *            父节点编号
	 * @param userId
	 *            用户登录账号
	 * @return
	 */
	List<TreeModel> getTopLevelTreeModels(long parentId, String userId);

	/**
	 * 获取用户某个分类下的顶级菜单节点
	 * 
	 * @param appCode
	 *            应用编码
	 * @param userId
	 *            用户登录账号
	 * @return
	 */
	List<TreeModel> getTopLevelTreeModels(String appCode, String userId);

	TreeModel getTreeModelByAppId(long appId);

	/**
	 * 获取用户某个分类下的全部分类节点
	 * 
	 * @param parent
	 *            父节点编号
	 * @param userId
	 *            用户登录账号
	 * @return
	 */
	List<TreeModel> getTreeModels(long parentId, String userId);

	/**
	 * 获取某个角色编码的全部分类节点（包含已经失效的菜单）
	 * 
	 * @param roleCode
	 *            角色编码
	 * @return
	 */
	List<TreeModel> getTreeModels(String roleCode);

	List<SysTree> getTreeWithApplicationList(long parentId);

	/**
	 * 获取用户菜单之json对象
	 * 
	 * @param parentId
	 *            父节点编号
	 * @param userId
	 *            用户登录账号
	 * @return
	 */
	JSONArray getUserMenu(long parentId, String userId);

	@Transactional
	void saveRoleApplications(long roleId, List<Long> appIds);

	/**
	 * 排序
	 * 
	 * @param bean
	 *            SysApplication
	 * @param operate
	 *            int 操作
	 */
	@Transactional
	void sort(long parent, SysApplication bean, int operate);

	/**
	 * 更新
	 * 
	 * @param bean
	 *            SysApplication
	 * @return boolean
	 */
	@Transactional
	boolean update(SysApplication bean);
}