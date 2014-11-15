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
import com.glaf.bpmn.domain.FlowForwardEntity;
import com.glaf.bpmn.mapper.FlowForwardEntityMapper;
import com.glaf.bpmn.query.FlowForwardQuery;
import com.glaf.bpmn.service.BpmnForwardService;

@Service("bpmnForwardService")
@Transactional(readOnly = true)
public class MxBpmnForwardServiceImpl implements BpmnForwardService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnForwardServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardEntityMapper flowForwardEntityMapper;

	public MxBpmnForwardServiceImpl() {

	}

	public int count(FlowForwardQuery query) {
		query.ensureInitialized();
		return flowForwardEntityMapper
				.getFlowForwardEntityCountByQueryCriteria(query);
	}

	public FlowForwardEntity getFlowForward(String id) {
		FlowForwardEntity flowForward = flowForwardEntityMapper
				.getFlowForwardEntityById(id);
		return flowForward;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardCount(Map<String, Object> parameter) {
		return flowForwardEntityMapper.getFlowForwardEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardCountByQueryCriteria(FlowForwardQuery query) {
		return flowForwardEntityMapper
				.getFlowForwardEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForwardEntity> getFlowForwards(Map<String, Object> parameter) {
		return flowForwardEntityMapper.getFlowForwardEntities(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowForwardEntity> getFlowForwardsByQueryCriteria(int start,
			int pageSize, FlowForwardQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForwardEntity> rows = sqlSession.selectList(
				"getFlowForwardEntitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowForwardEntity> list(FlowForwardQuery query) {
		query.ensureInitialized();
		List<FlowForwardEntity> list = flowForwardEntityMapper
				.getFlowForwardEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForwardEntity flowForward) {
		if (StringUtils.isEmpty(flowForward.getId())) {
			flowForward.setId(idGenerator.getNextId());
			// flowForward.setId(idGenerator.getNextId());
			// flowForward.setCreateDate(new Date());
			flowForwardEntityMapper.insertFlowForwardEntity(flowForward);
		} else {
			FlowForwardEntity model = this.getFlowForward(flowForward.getId());
			if (model != null) {
				if (flowForward.getProcessId() != null) {
					model.setProcessId(flowForward.getProcessId());
				}
				if (flowForward.getActivDefId() != null) {
					model.setActivDefId(flowForward.getActivDefId());
				}
				if (flowForward.getActivDefNext() != null) {
					model.setActivDefNext(flowForward.getActivDefNext());
				}
				model.setSendtype(flowForward.getSendtype());
				model.setSendtimes(flowForward.getSendtimes());
				flowForwardEntityMapper.updateFlowForwardEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardEntityMapper(
			FlowForwardEntityMapper flowForwardEntityMapper) {
		this.flowForwardEntityMapper = flowForwardEntityMapper;
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
