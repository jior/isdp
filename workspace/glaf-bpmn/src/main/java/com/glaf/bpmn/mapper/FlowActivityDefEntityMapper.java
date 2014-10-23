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

import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.query.FlowActivityDefQuery;

@Component
public interface FlowActivityDefEntityMapper {

	void deleteFlowActivityDefEntityById(String id);

	void deleteFlowActivityDefEntities(FlowActivityDefQuery query);

	FlowActivityDefEntity getFlowActivityDefEntityById(String id);

	int getFlowActivityDefEntityCount(Map<String, Object> parameter);

	int getFlowActivityDefEntityCountByQueryCriteria(FlowActivityDefQuery query);

	List<FlowActivityDefEntity> getFlowActivityDefEntities(
			Map<String, Object> parameter);

	List<FlowActivityDefEntity> getFlowActivityDefEntitiesByProcessDefId(
			String processDefId);

	List<FlowActivityDefEntity> getFlowActivityDefEntitiesByMainId(String mainId);

	List<FlowActivityDefEntity> getCurrentActiveFlowActivityDefEntitiesByProcessId(
			String processId);

	List<FlowActivityDefEntity> getFlowActivityDefEntitiesByQueryCriteria(
			FlowActivityDefQuery query);

	void insertFlowActivityDefEntity(FlowActivityDefEntity model);

	void updateFlowActivityDefEntity(FlowActivityDefEntity model);

}
