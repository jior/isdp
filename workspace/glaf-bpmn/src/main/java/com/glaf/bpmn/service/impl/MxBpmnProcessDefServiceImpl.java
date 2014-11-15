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

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.DBUtils;
import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.domain.FlowForwardDefEntity;
import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.bpmn.mapper.FlowActivityDefEntityMapper;
import com.glaf.bpmn.mapper.FlowForwardDefEntityMapper;
import com.glaf.bpmn.mapper.FlowProcessDefEntityMapper;
import com.glaf.bpmn.query.FlowProcessDefQuery;
import com.glaf.bpmn.service.BpmnProcessDefService;

@Service("bpmnProcessDefService")
@Transactional(readOnly = true)
public class MxBpmnProcessDefServiceImpl implements BpmnProcessDefService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnProcessDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityDefEntityMapper flowActivityDefEntityMapper;

	protected FlowProcessDefEntityMapper flowProcessDefEntityMapper;

	protected FlowForwardDefEntityMapper flowForwardDefEntityMapper;

	public MxBpmnProcessDefServiceImpl() {

	}

	public int count(FlowProcessDefQuery query) {
		query.ensureInitialized();
		return flowProcessDefEntityMapper
				.getFlowProcessDefEntityCountByQueryCriteria(query);
	}

	public FlowProcessDefEntity getFlowProcessDef(String id) {
		FlowProcessDefEntity flowProcessDef = null;
		if (StringUtils.equals(DBUtils.POSTGRESQL,
				Environment.getCurrentDatabaseType())) {
			flowProcessDef = flowProcessDefEntityMapper
					.getFlowProcessDefEntityById_postgres(id);
		} else {
			flowProcessDef = flowProcessDefEntityMapper
					.getFlowProcessDefEntityById(id);
		}
		if (flowProcessDef != null) {
			List<FlowActivityDefEntity> activities = flowActivityDefEntityMapper
					.getFlowActivityDefEntitiesByProcessDefId(flowProcessDef
							.getId());
			flowProcessDef.setActivities(activities);
			List<FlowForwardDefEntity> sequenceFlows = flowForwardDefEntityMapper
					.getFlowActivityDefEntitiesByProcessDefId(flowProcessDef
							.getId());
			flowProcessDef.setSequenceFlows(sequenceFlows);
		}
		return flowProcessDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessDefCount(Map<String, Object> parameter) {
		return flowProcessDefEntityMapper
				.getFlowProcessDefEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessDefCountByQueryCriteria(FlowProcessDefQuery query) {
		return flowProcessDefEntityMapper
				.getFlowProcessDefEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowProcessDefEntity> getFlowProcessDefEntities(
			Map<String, Object> parameter) {
		return flowProcessDefEntityMapper
				.getFlowProcessDefEntityEntities(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowProcessDefEntity> getFlowProcessEntitiesByQueryCriteria(
			int start, int pageSize, FlowProcessDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowProcessDefEntity> rows = sqlSession.selectList(
				"getFlowProcessDefEntitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowProcessDefEntity> list(FlowProcessDefQuery query) {
		query.ensureInitialized();
		List<FlowProcessDefEntity> list = flowProcessDefEntityMapper
				.getFlowProcessDefEntityEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowProcessDefEntity flowProcessDef) {
		if (StringUtils.isEmpty(flowProcessDef.getId())) {
			flowProcessDef.setId(idGenerator.getNextId());
		}
		flowProcessDefEntityMapper.insertFlowProcessDefEntity(flowProcessDef);
		if (flowProcessDef.getActivities() != null
				&& !flowProcessDef.getActivities().isEmpty()) {
			List<FlowActivityDefEntity> activities = flowProcessDef
					.getActivities();
			for (FlowActivityDefEntity act : activities) {
				if (StringUtils.isEmpty(act.getId())) {
					act.setId(idGenerator.getNextId());
				}
				act.setProcessId(flowProcessDef.getId());
				flowActivityDefEntityMapper.insertFlowActivityDefEntity(act);
			}
		}
		List<FlowForwardDefEntity> sequenceFlows = flowProcessDef
				.getSequenceFlows();
		if (sequenceFlows != null && !sequenceFlows.isEmpty()) {

			for (FlowForwardDefEntity forward : sequenceFlows) {
				if (StringUtils.isEmpty(forward.getId())) {
					forward.setId(idGenerator.getNextId());
				}
				forward.setProcessId(flowProcessDef.getId());
				flowForwardDefEntityMapper.insertFlowForwardDefEntity(forward);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowActivityDefEntityMapper(
			FlowActivityDefEntityMapper flowActivityDefEntityMapper) {
		this.flowActivityDefEntityMapper = flowActivityDefEntityMapper;
	}

	@javax.annotation.Resource
	public void setFlowForwardDefEntityMapper(
			FlowForwardDefEntityMapper flowForwardDefEntityMapper) {
		this.flowForwardDefEntityMapper = flowForwardDefEntityMapper;
	}

	@javax.annotation.Resource
	public void setFlowProcessDefEntityMapper(
			FlowProcessDefEntityMapper flowProcessDefEntityMapper) {
		this.flowProcessDefEntityMapper = flowProcessDefEntityMapper;
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
