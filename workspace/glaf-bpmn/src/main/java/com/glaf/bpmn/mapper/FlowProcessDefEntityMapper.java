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

import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.bpmn.query.FlowProcessDefQuery;

@Component
public interface FlowProcessDefEntityMapper {

	void deleteFlowProcessDefEntityById(String id);

	void deleteFlowProcessDefEntityEntities(FlowProcessDefQuery query);

	FlowProcessDefEntity getFlowProcessDefEntityById(String id);

	FlowProcessDefEntity getFlowProcessDefEntityById_postgres(String id);

	int getFlowProcessDefEntityCount(Map<String, Object> parameter);

	int getFlowProcessDefEntityCountByQueryCriteria(FlowProcessDefQuery query);

	List<FlowProcessDefEntity> getFlowProcessDefEntityEntities(
			Map<String, Object> parameter);

	List<FlowProcessDefEntity> getFlowProcessDefEntityEntitiesByQueryCriteria(
			FlowProcessDefQuery query);

	void insertFlowProcessDefEntity(FlowProcessDefEntity model);

	void updateFlowProcessDefEntity(FlowProcessDefEntity model);

}