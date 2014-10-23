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

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.bpmn.domain.FlowProcessEntity;
import com.glaf.bpmn.query.FlowProcessQuery;

@Component
public interface FlowProcessEntityMapper {

	void deleteFlowProcessEntityById(String id);

	void deleteFlowProcessEntities(FlowProcessQuery query);

	FlowProcessEntity getFlowProcessEntityById(String id);

	int getFlowProcessEntityCount(Map<String, Object> parameter);

	int getFlowProcessEntityCountByQueryCriteria(FlowProcessQuery query);

	List<FlowProcessEntity> getFlowProcessEntityesByTaskMainId(String taskMainId);

	List<FlowProcessEntity> getFlowProcessEntityes(Map<String, Object> parameter);

	List<FlowProcessEntity> getFlowProcessEntityesByQueryCriteria(
			FlowProcessQuery query);

	List<FlowProcessEntity> getFlowProcessEntityesByTask(
			Map<String, Object> parameter);

	void insertFlowProcessEntity(FlowProcessEntity model);

	void updateFlowProcessEntity(FlowProcessEntity model);

}
