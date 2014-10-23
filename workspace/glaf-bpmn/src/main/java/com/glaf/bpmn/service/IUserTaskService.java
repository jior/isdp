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
public interface IUserTaskService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(int id);
	
	@Transactional
	void deleteUserTasks(String actorId);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	UserTask getUserTask(int id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getUserTaskCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getUserTaskCountByQueryCriteria(UserTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<UserTask> getUserTasks(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<UserTask> getUserTasksByQueryCriteria(int start, int pageSize,
			UserTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<UserTask> list(UserTaskQuery query);
	
	/**
	 * 重新装载用户的任务，按照传入时间做分组
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByTime(String actorId, String taskType);

	/**
	 * 重新装载用户的任务，按照WBS做分组
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByWBS(String actorId, String taskType);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(UserTask userTask);

}
