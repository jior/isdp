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
import com.glaf.bpmn.domain.FlowProcessEntity;
import com.glaf.bpmn.mapper.FlowProcessEntityMapper;
import com.glaf.bpmn.query.FlowProcessQuery;
import com.glaf.bpmn.service.BpmnProcessService;

@Service("bpmnProcessService")
@Transactional(readOnly = true)
public class MxBpmnProcessServiceImpl implements BpmnProcessService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnProcessServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowProcessEntityMapper flowProcessEntityMapper;

	public MxBpmnProcessServiceImpl() {

	}

	public int count(FlowProcessQuery query) {
		query.ensureInitialized();
		return flowProcessEntityMapper
				.getFlowProcessEntityCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowProcessEntityMapper.deleteFlowProcessEntityById(id);
	}

	public FlowProcessEntity getFlowProcess(String id) {
		FlowProcessEntity flowProcess = flowProcessEntityMapper
				.getFlowProcessEntityById(id);
		return flowProcess;
	}

	public List<FlowProcessEntity> getFlowProcessesByTaskMainId(
			String taskMainId) {
		return flowProcessEntityMapper
				.getFlowProcessEntityesByTaskMainId(taskMainId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessCount(Map<String, Object> parameter) {
		return flowProcessEntityMapper.getFlowProcessEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessCountByQueryCriteria(FlowProcessQuery query) {
		return flowProcessEntityMapper
				.getFlowProcessEntityCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowProcessEntity> getFlowProcesses(
			Map<String, Object> parameter) {
		return flowProcessEntityMapper.getFlowProcessEntityes(parameter);
	}

	public List<FlowProcessEntity> getFlowProcesses(int taskmainIndexId,
			String cellTaskId, int intisflow) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("taskmainIndexId", taskmainIndexId);
		parameter.put("cellTaskId", cellTaskId);
		parameter.put("intisflow", intisflow);
		return flowProcessEntityMapper.getFlowProcessEntityesByTask(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowProcessEntity> getFlowProcessesByQueryCriteria(int start,
			int pageSize, FlowProcessQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowProcessEntity> rows = sqlSession.selectList(
				"getFlowProcessEntityesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowProcessEntity> list(FlowProcessQuery query) {
		query.ensureInitialized();
		List<FlowProcessEntity> list = flowProcessEntityMapper
				.getFlowProcessEntityesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowProcessEntity flowProcess) {
		if (StringUtils.isEmpty(flowProcess.getId())) {
			flowProcess.setId(idGenerator.getNextId());
			// flowProcess.setId(idGenerator.getNextId());
			// flowProcess.setCreateDate(new Date());
			flowProcessEntityMapper.insertFlowProcessEntity(flowProcess);
		} else {
			FlowProcessEntity model = this.getFlowProcess(flowProcess.getId());
			if (model != null) {
				if (flowProcess.getProcessDefId() != null) {
					model.setProcessDefId(flowProcess.getProcessDefId());
				}
				if (flowProcess.getMainId() != null) {
					model.setMainId(flowProcess.getMainId());
				}
				if (flowProcess.getFileid() != null) {
					model.setFileid(flowProcess.getFileid());
				}
				if (flowProcess.getName() != null) {
					model.setName(flowProcess.getName());
				}
				if (flowProcess.getContent() != null) {
					model.setContent(flowProcess.getContent());
				}
				if (flowProcess.getActorId() != null) {
					model.setActorId(flowProcess.getActorId());
				}
				if (flowProcess.getCtime() != null) {
					model.setCtime(flowProcess.getCtime());
				}
				if (flowProcess.getVersion() != null) {
					model.setVersion(flowProcess.getVersion());
				}
				model.setState(flowProcess.getState());
				flowProcessEntityMapper.updateFlowProcessEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowProcessEntityMapper(
			FlowProcessEntityMapper flowProcessEntityMapper) {
		this.flowProcessEntityMapper = flowProcessEntityMapper;
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
