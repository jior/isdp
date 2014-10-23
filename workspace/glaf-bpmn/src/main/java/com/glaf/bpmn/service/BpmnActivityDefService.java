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

package com.glaf.bpmn.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.bpmn.domain.*;
import com.glaf.bpmn.query.*;

@Transactional(readOnly = true)
public interface BpmnActivityDefService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	FlowActivityDefEntity getFlowActivityDef(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityDefCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivityDefEntity> getFlowActivityEntities(
			Map<String, Object> parameter);

	List<FlowActivityDefEntity> getFlowActivityEntitiesByMainId(String mainId);

	/**
	 * 根据流程编号获取流程的活动节点
	 * 
	 * @param processDefId
	 * @return
	 */
	List<FlowActivityDefEntity> getFlowActivityEntitiesByProcessDefId(
			String processDefId);

	/**
	 * 根据流程编号获取流程活跃节点的信息(正在运行中的节点信息)
	 * 
	 * @param processId
	 * @return
	 */
	List<FlowActivityDefEntity> getCurrentActiveFlowActivityEntitiesByProcessId(
			String processId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowActivityDefEntity> getFlowActivityEntitiesByQueryCriteria(
			int start, int pageSize, FlowActivityDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivityDefEntity> list(FlowActivityDefQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowActivityDefEntity flowActivityDef);

}
