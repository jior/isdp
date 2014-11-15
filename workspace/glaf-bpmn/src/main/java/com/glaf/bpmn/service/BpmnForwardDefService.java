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
public interface BpmnForwardDefService {

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	FlowForwardDefEntity getFlowForwardDef(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowForwardDefCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowForwardDefEntity> getFlowForwardEntities(
			Map<String, Object> parameter);

	/**
	 * 根据流程编号获取活动之间的转移关系
	 * 
	 * @param processDefId
	 * @return
	 */
	List<FlowForwardDefEntity> getFlowForwardEntitiesByProcessDefId(
			String processDefId);

	/**
	 * 根据流程编号获取已经处理的活动之间的转移关系
	 * 
	 * @param processId
	 *            流程编号
	 * @param processInstanceId
	 *            流程实例编号
	 * @return
	 */
	List<FlowForwardDefEntity> getProcessedFlowForwardEntitiesByProcessId(
			String processId, String processInstanceId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowForwardDefEntity> getFlowForwardEntitiesByQueryCriteria(int start,
			int pageSize, FlowForwardDefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowForwardDefEntity> list(FlowForwardDefQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowForwardDefEntity flowForwardDef);

}
