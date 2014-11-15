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

package com.glaf.bpmn.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.bpmn.domain.FlowStationEntity;
import com.glaf.bpmn.mapper.FlowStationEntityMapper;
import com.glaf.bpmn.query.FlowStationQuery;
import com.glaf.bpmn.service.BpmnStationService;

@Service("bpmnStationService")
@Transactional(readOnly = true)
public class MxBpmnStationServiceImpl implements BpmnStationService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnStationServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowStationEntityMapper flowStationEntityMapper;

	public MxBpmnStationServiceImpl() {

	}

	public int count(FlowStationQuery query) {
		query.ensureInitialized();
		return flowStationEntityMapper
				.getFlowStationEntityCountByQueryCriteria(query);
	}

	public FlowStationEntity getFlowStation(String id) {
		FlowStationEntity flowStation = flowStationEntityMapper
				.getFlowStationEntityById(id);
		return flowStation;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowStationCount(Map<String, Object> parameter) {
		return flowStationEntityMapper.getFlowStationEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowStationCountByQueryCriteria(FlowStationQuery query) {
		return flowStationEntityMapper
				.getFlowStationEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowStationEntity> getFlowStations(Map<String, Object> parameter) {
		return flowStationEntityMapper.getFlowStationEntities(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowStationEntity> getFlowStationsByQueryCriteria(int start,
			int pageSize, FlowStationQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowStationEntity> rows = sqlSession.selectList(
				"getFlowStationEntitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowStationEntity> list(FlowStationQuery query) {
		query.ensureInitialized();
		List<FlowStationEntity> list = flowStationEntityMapper
				.getFlowStationEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowStationEntity flowStation) {
		if (StringUtils.isEmpty(flowStation.getId())) {
			flowStation.setId(idGenerator.getNextId());
			// flowStation.setId(idGenerator.getNextId());
			// flowStation.setCreateDate(new Date());
			flowStationEntityMapper.insertFlowStationEntity(flowStation);
		} else {
			FlowStationEntity model = this.getFlowStation(flowStation.getId());
			if (model != null) {
				if (flowStation.getProcessId() != null) {
					model.setProcessId(flowStation.getProcessId());
				}
				if (flowStation.getActivDefId() != null) {
					model.setActivDefId(flowStation.getActivDefId());
				}
				flowStationEntityMapper.updateFlowStationEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowStationEntityMapper(
			FlowStationEntityMapper flowStationEntityMapper) {
		this.flowStationEntityMapper = flowStationEntityMapper;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
