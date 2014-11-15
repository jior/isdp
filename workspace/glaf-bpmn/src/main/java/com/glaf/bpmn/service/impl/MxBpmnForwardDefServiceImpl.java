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

import java.util.HashMap;
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
import com.glaf.bpmn.domain.FlowForwardDefEntity;
import com.glaf.bpmn.mapper.FlowForwardDefEntityMapper;
import com.glaf.bpmn.query.FlowForwardDefQuery;
import com.glaf.bpmn.service.BpmnForwardDefService;

@Service("bpmnForwardDefService")
@Transactional(readOnly = true)
public class MxBpmnForwardDefServiceImpl implements BpmnForwardDefService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnForwardDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardDefEntityMapper flowForwardDefEntityMapper;

	public MxBpmnForwardDefServiceImpl() {

	}

	public int count(FlowForwardDefQuery query) {
		query.ensureInitialized();
		return flowForwardDefEntityMapper
				.getFlowForwardDefEntityCountByQueryCriteria(query);
	}

	public FlowForwardDefEntity getFlowForwardDef(String id) {
		FlowForwardDefEntity flowForwardDef = flowForwardDefEntityMapper
				.getFlowForwardDefEntityById(id);
		return flowForwardDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardDefCount(Map<String, Object> parameter) {
		return flowForwardDefEntityMapper
				.getFlowForwardDefEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query) {
		return flowForwardDefEntityMapper
				.getFlowForwardDefEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForwardDefEntity> getFlowForwardEntities(
			Map<String, Object> parameter) {
		return flowForwardDefEntityMapper.getFlowForwardDefEntities(parameter);
	}

	/**
	 * 根据流程编号获取活动之间的转移关系
	 * 
	 * @param processDefId
	 * @return
	 */
	public List<FlowForwardDefEntity> getFlowForwardEntitiesByProcessDefId(
			String processDefId) {
		return flowForwardDefEntityMapper
				.getFlowActivityDefEntitiesByProcessDefId(processDefId);
	}

	/**
	 * 根据流程编号获取已经处理的活动之间的转移关系
	 * 
	 * @param processId
	 *            流程编号
	 * @param processInstanceId
	 *            流程实例编号
	 * @return
	 */
	public List<FlowForwardDefEntity> getProcessedFlowForwardEntitiesByProcessId(
			String processId, String processInstanceId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("processId", processId);
		parameter.put("processInstanceId", processInstanceId);
		return flowForwardDefEntityMapper
				.getProcessedFlowForwardDefEntitiesByProcessId(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowForwardDefEntity> getFlowForwardEntitiesByQueryCriteria(
			int start, int pageSize, FlowForwardDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForwardDefEntity> rows = sqlSession.selectList(
				"getFlowForwardDefEntitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowForwardDefEntity> list(FlowForwardDefQuery query) {
		query.ensureInitialized();
		List<FlowForwardDefEntity> list = flowForwardDefEntityMapper
				.getFlowForwardDefEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForwardDefEntity flowForwardDef) {
		if (StringUtils.isEmpty(flowForwardDef.getId())) {
			flowForwardDef.setId(idGenerator.getNextId());
			// flowForwardDef.setId(idGenerator.getNextId());
			// flowForwardDef.setCreateDate(new Date());
			flowForwardDefEntityMapper
					.insertFlowForwardDefEntity(flowForwardDef);
		} else {
			FlowForwardDefEntity model = this.getFlowForwardDef(flowForwardDef
					.getId());
			if (model != null) {
				if (flowForwardDef.getProcessId() != null) {
					model.setProcessId(flowForwardDef.getProcessId());
				}
				if (flowForwardDef.getActivId() != null) {
					model.setActivId(flowForwardDef.getActivId());
				}
				if (flowForwardDef.getActivPre() != null) {
					model.setActivPre(flowForwardDef.getActivPre());
				}
				if (flowForwardDef.getActivNext() != null) {
					model.setActivNext(flowForwardDef.getActivNext());
				}
				model.setIssave(flowForwardDef.getIssave());
				model.setIsdel(flowForwardDef.getIsdel());
				model.setListno(flowForwardDef.getListno());
				flowForwardDefEntityMapper.updateFlowForwardDefEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardDefEntityMapper(
			FlowForwardDefEntityMapper flowForwardDefEntityMapper) {
		this.flowForwardDefEntityMapper = flowForwardDefEntityMapper;
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
