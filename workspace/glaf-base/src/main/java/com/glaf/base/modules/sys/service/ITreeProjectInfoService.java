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

import com.glaf.base.modules.sys.model.TreeProjectInfo;
import com.glaf.base.modules.sys.query.TreeProjectInfoQuery;

@Transactional(readOnly = true)
public interface ITreeProjectInfoService {

	@Transactional
	void deleteById(Integer paramInteger);

	@Transactional
	void deleteByIds(List<Integer> indexIds);

	/**
	 * 获取根节点记录
	 * 
	 * @return
	 */
	TreeProjectInfo getRootTreeProjectInfo();

	/**
	 * 获取所有子节点记录数
	 * 
	 * @param parentId
	 * @return
	 */
	List<Map<String, Integer>> getSubTreeProjectInfoCountByParentId(
			Integer parentId);

	/**
	 * 获取所有子节点记录数
	 * 
	 * @param parentId
	 * @return
	 */
	List<Map<String, Integer>> getSubTreeProjectInfoCountByQuery(
			TreeProjectInfoQuery query);

	TreeProjectInfo getTreeProjectInfo(Integer id);

	int getTreeProjectInfoCountByQueryCriteria(TreeProjectInfoQuery query);

	String getTreeProjectInfoId(String strfuntion);
	
 
	List<TreeProjectInfo> getTreeProjectInfos(String strfuntion);

	/**
	 * 根据父节点获取子节点
	 * 
	 * @param parentId
	 * @return
	 */
	List<TreeProjectInfo> getTreeProjectInfoListByParentId(Integer parentId);

	List<TreeProjectInfo> getTreeProjectInfosByCondition(
			Map<String, Object> params);

	List<TreeProjectInfo> getTreeProjectInfosByQueryCriteria(int start,
			int pageSize, TreeProjectInfoQuery query);

	List<TreeProjectInfo> list(TreeProjectInfoQuery query);

}
