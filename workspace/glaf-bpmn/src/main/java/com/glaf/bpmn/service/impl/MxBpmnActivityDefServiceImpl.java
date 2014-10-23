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
import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.mapper.FlowActivityDefEntityMapper;
import com.glaf.bpmn.query.FlowActivityDefQuery;
import com.glaf.bpmn.service.BpmnActivityDefService;

@Service("bpmnActivityDefService")
@Transactional(readOnly = true)
public class MxBpmnActivityDefServiceImpl implements BpmnActivityDefService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnActivityDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityDefEntityMapper flowActivityDefEntityMapper;

	public MxBpmnActivityDefServiceImpl() {

	}

	public int count(FlowActivityDefQuery query) {
		query.ensureInitialized();
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntityCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowActivityDefEntityMapper.deleteFlowActivityDefEntityById(id);
	}

	/**
	 * 根据流程编号获取流程活跃节点的信息(正在运行中的节点信息)
	 * 
	 * @param processId
	 * @return
	 */
	public List<FlowActivityDefEntity> getCurrentActiveFlowActivityEntitiesByProcessId(
			String processId) {
		return flowActivityDefEntityMapper
				.getCurrentActiveFlowActivityDefEntitiesByProcessId(processId);
	}

	public FlowActivityDefEntity getFlowActivityDef(String id) {
		FlowActivityDefEntity flowActivityDef = flowActivityDefEntityMapper
				.getFlowActivityDefEntityById(id);
		return flowActivityDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityDefCount(Map<String, Object> parameter) {
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query) {
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowActivityDefEntity> getFlowActivityEntities(
			Map<String, Object> parameter) {
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntities(parameter);
	}

	public List<FlowActivityDefEntity> getFlowActivityEntitiesByMainId(
			String mainId) {
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntitiesByMainId(mainId);
	}

	public List<FlowActivityDefEntity> getFlowActivityEntitiesByProcessDefId(
			String processDefId) {
		return flowActivityDefEntityMapper
				.getFlowActivityDefEntitiesByProcessDefId(processDefId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowActivityDefEntity> getFlowActivityEntitiesByQueryCriteria(
			int start, int pageSize, FlowActivityDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowActivityDefEntity> rows = sqlSession.selectList(
				"getFlowActivityDefEntitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowActivityDefEntity> list(FlowActivityDefQuery query) {
		query.ensureInitialized();
		List<FlowActivityDefEntity> list = flowActivityDefEntityMapper
				.getFlowActivityDefEntitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowActivityDefEntity flowActivityDef) {
		if (StringUtils.isEmpty(flowActivityDef.getId())) {
			flowActivityDef.setId(idGenerator.getNextId());
			// flowActivityDef.setId(idGenerator.getNextId());
			// flowActivityDef.setCreateDate(new Date());
			flowActivityDefEntityMapper
					.insertFlowActivityDefEntity(flowActivityDef);
		} else {
			FlowActivityDefEntity model = this
					.getFlowActivityDef(flowActivityDef.getId());
			if (model != null) {
				if (flowActivityDef.getProcessId() != null) {
					model.setProcessId(flowActivityDef.getProcessId());
				}
				if (flowActivityDef.getTypeofact() != null) {
					model.setTypeofact(flowActivityDef.getTypeofact());
				}
				if (flowActivityDef.getName() != null) {
					model.setName(flowActivityDef.getName());
				}
				if (flowActivityDef.getContent() != null) {
					model.setContent(flowActivityDef.getContent());
				}
				if (flowActivityDef.getStrfuntion() != null) {
					model.setStrfuntion(flowActivityDef.getStrfuntion());
				}
				if (flowActivityDef.getNetroleid() != null) {
					model.setNetroleid(flowActivityDef.getNetroleid());
				}
				model.setListno(flowActivityDef.getListno());
				model.setTimelimit(flowActivityDef.getTimelimit());
				model.setIssave(flowActivityDef.getIssave());
				model.setIsdel(flowActivityDef.getIsdel());
				model.setIntselectuser(flowActivityDef.getIntselectuser());
				model.setIntusedomain(flowActivityDef.getIntusedomain());
				flowActivityDefEntityMapper.updateFlowActivityDefEntity(model);
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
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
