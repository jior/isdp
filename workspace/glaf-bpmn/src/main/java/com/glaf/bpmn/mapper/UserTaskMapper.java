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

package com.glaf.bpmn.mapper;

import java.util.*;

import org.springframework.stereotype.Component;

import com.glaf.base.modules.sys.model.BaseTree;
import com.glaf.base.modules.sys.model.ObjectEntity;
import com.glaf.bpmn.domain.*;
import com.glaf.bpmn.model.TaskItem;
import com.glaf.bpmn.query.*;

@Component
public interface UserTaskMapper {

	void deleteUserTaskById(int id);

	void deleteUserTasks(String actorId);

	List<TaskItem> getAllMyTaskItemMap(Map<String, Object> parameter);

	List<BaseTree> getMyBaseTaskTrees(ObjectEntity objectEntity);

	List<ObjectEntity> getMyCellTaskDates(Map<String, Object> parameter);

	List<ObjectEntity> getMyCellTaskIds(Map<String, Object> parameter);

	List<ObjectEntity> getMyCellTaskIndexIds(Map<String, Object> parameter);

	List<TaskItem> getMyTaskItemMap(Map<String, Object> parameter);

	List<BaseTree> getMyTaskTreepinfos(Map<String, Object> parameter);

	List<BaseTree> getMyTaskTrees(int indexId);

	List<BaseTree> getMyTaskTreesOfTypeA(int indexId);

	List<UserTask> getUserTaskByActorId(String actorId);

	UserTask getUserTaskById(int id);

	int getUserTaskCount(Map<String, Object> parameter);

	int getUserTaskCountByQueryCriteria(UserTaskQuery query);

	List<UserTask> getUserTasks(Map<String, Object> parameter);

	List<UserTask> getUserTasksByQueryCriteria(UserTaskQuery query);

	void insertUserTask(UserTask model);

	void updateUserTask(UserTask model);

}
