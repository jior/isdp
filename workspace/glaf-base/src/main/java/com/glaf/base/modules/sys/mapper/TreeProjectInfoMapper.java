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

package com.glaf.base.modules.sys.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.base.modules.sys.model.TreeProjectInfo;
import com.glaf.base.modules.sys.query.TreeProjectInfoQuery;

@Component("com.glaf.base.modules.sys.mapper.TreeProjectInfoMapper")
public interface TreeProjectInfoMapper {

	void deleteTreeProjectInfos(TreeProjectInfoQuery query);

	void deleteTreeProjectInfoById(Integer indexId);

	TreeProjectInfo getTreeProjectInfoById(Integer indexId);

	String getTreeProjectInfoId(String strfuntion);

	int getTreeProjectInfoCount(TreeProjectInfoQuery query);

	List<TreeProjectInfo> getTreeProjectInfos(TreeProjectInfoQuery query);

	List<TreeProjectInfo> getTreeProjectInfosByCondition(
			Map<String, Object> params);

	void insertTreeProjectInfo(TreeProjectInfo paramTreeProjectInfo);

	void updateTreeProjectInfo(TreeProjectInfo paramTreeProjectInfo);

	List<TreeProjectInfo> getTreeProjectInfoListByParentId(Integer parentId);

	List<Map<String, Integer>> getSubTreeProjectInfoCountByParentId(
			Integer parentId);

	List<Map<String, Integer>> getSubTreeProjectInfoCountByQuery(
			TreeProjectInfoQuery query);

	TreeProjectInfo getRootTreeProjectInfo();

}
