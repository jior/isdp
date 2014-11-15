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
public interface BpmnProcessService {

	 

	/**
	 * 完成任务
	 * 
	 * @param actorId
	 *            用户编号
	 * @param activityId
	 *            任务编号
	 * @param outcome 
	 *        转移，向前或向后
	 * @param variables
	 *            变量集
	 */
	void completeTask(String actorId, String activityId, String outcome,
			Map<String, Object> variables);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	FlowProcessEntity getFlowProcessById(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowProcessCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowProcessCountByQueryCriteria(FlowProcessQuery query);

	List<FlowProcessEntity> getFlowProcesses(int taskmainIndexId,
			String cellTaskId, int intisflow);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowProcessEntity> getFlowProcesses(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowProcessEntity> getFlowProcessesByQueryCriteria(int start,
			int pageSize, FlowProcessQuery query);

	List<FlowProcessEntity> getFlowProcessesByTaskMainId(String taskMainId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowProcessEntity> list(FlowProcessQuery query);

	/**
	 * 
	 * @param actorId
	 *            参与者
	 * @param processDefinitionId
	 *            流程定义名
	 * @param mainId
	 *            业务主键
	 * @param variables
	 *            变量集
	 * @return
	 */
	@Transactional
	FlowProcessEntity startProcessInstanceByKey(String actorId,
			String processDefinitionId, String mainId,
			Map<String, Object> variables);

}
