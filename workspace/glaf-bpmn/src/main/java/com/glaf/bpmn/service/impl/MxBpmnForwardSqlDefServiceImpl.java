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
import com.glaf.bpmn.domain.FlowForwardSqlDefEntity;
import com.glaf.bpmn.mapper.FlowForwardSqlDefEntityMapper;
import com.glaf.bpmn.query.FlowForwardSqlDefQuery;
import com.glaf.bpmn.service.BpmnForwardSqlDefService;

@Service("bpmnForwardSqlDefService")
@Transactional(readOnly = true)
public class MxBpmnForwardSqlDefServiceImpl implements BpmnForwardSqlDefService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnForwardSqlDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardSqlDefEntityMapper flowForwardSqlDefEntityMapper;

	public MxBpmnForwardSqlDefServiceImpl() {

	}

	public int count(FlowForwardSqlDefQuery query) {
		query.ensureInitialized();
		return flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntityCountByQueryCriteria(query);
	}

	public FlowForwardSqlDefEntity getFlowForwardSqlDef(String id) {
		FlowForwardSqlDefEntity flowForwardSqlDef = flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntityById(id);
		return flowForwardSqlDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardSqlDefCount(Map<String, Object> parameter) {
		return flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardSqlDefCountByQueryCriteria(
			FlowForwardSqlDefQuery query) {
		return flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForwardSqlDefEntity> getFlowForwardSqlEntities(
			Map<String, Object> parameter) {
		return flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntities(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowForwardSqlDefEntity> getFlowForwardSqlEntitiesByQueryCriteria(
			int start, int pageSize, FlowForwardSqlDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForwardSqlDefEntity> rows = sqlSession
				.selectList("getFlowForwardSqlDefEntitiesByQueryCriteria",
						query, rowBounds);
		return rows;
	}

	public List<FlowForwardSqlDefEntity> list(FlowForwardSqlDefQuery query) {
		query.ensureInitialized();
		List<FlowForwardSqlDefEntity> list = flowForwardSqlDefEntityMapper
				.getFlowForwardSqlDefEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForwardSqlDefEntity flowForwardSqlDef) {
		if (StringUtils.isEmpty(flowForwardSqlDef.getId())) {
			flowForwardSqlDef.setId(idGenerator.getNextId());
			// flowForwardSqlDef.setId(idGenerator.getNextId());
			// flowForwardSqlDef.setCreateDate(new Date());
			flowForwardSqlDefEntityMapper
					.insertFlowForwardSqlDefEntity(flowForwardSqlDef);
		} else {
			FlowForwardSqlDefEntity model = this
					.getFlowForwardSqlDef(flowForwardSqlDef.getId());
			if (model != null) {
				if (flowForwardSqlDef.getProcessId() != null) {
					model.setProcessId(flowForwardSqlDef.getProcessId());
				}
				if (flowForwardSqlDef.getFlowForwardD() != null) {
					model.setFlowForwardD(flowForwardSqlDef.getFlowForwardD());
				}
				model.setIntandor(flowForwardSqlDef.getIntandor());
				model.setSqlconType(flowForwardSqlDef.getSqlconType());
				if (flowForwardSqlDef.getSqlconDtype() != null) {
					model.setSqlconDtype(flowForwardSqlDef.getSqlconDtype());
				}
				if (flowForwardSqlDef.getSqlconField() != null) {
					model.setSqlconField(flowForwardSqlDef.getSqlconField());
				}
				if (flowForwardSqlDef.getStrsp() != null) {
					model.setStrsp(flowForwardSqlDef.getStrsp());
				}
				if (flowForwardSqlDef.getSqlconValue() != null) {
					model.setSqlconValue(flowForwardSqlDef.getSqlconValue());
				}
				if (flowForwardSqlDef.getSqlconshow() != null) {
					model.setSqlconshow(flowForwardSqlDef.getSqlconshow());
				}
				model.setIssave(flowForwardSqlDef.getIssave());
				flowForwardSqlDefEntityMapper
						.updateFlowForwardSqlDefEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardSqlDefEntityMapper(
			FlowForwardSqlDefEntityMapper flowForwardSqlDefEntityMapper) {
		this.flowForwardSqlDefEntityMapper = flowForwardSqlDefEntityMapper;
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
