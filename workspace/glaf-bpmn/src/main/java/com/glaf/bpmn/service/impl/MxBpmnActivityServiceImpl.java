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
import com.glaf.bpmn.domain.FlowActivityEntity;
import com.glaf.bpmn.mapper.FlowActivityEntityMapper;
import com.glaf.bpmn.query.FlowActivityQuery;
import com.glaf.bpmn.service.BpmnActivityService;

@Service("bpmnActivityService")
@Transactional(readOnly = true)
public class MxBpmnActivityServiceImpl implements BpmnActivityService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnActivityServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityEntityMapper flowActivityEntityMapper;

	public MxBpmnActivityServiceImpl() {

	}

	public int count(FlowActivityQuery query) {
		query.ensureInitialized();
		return flowActivityEntityMapper
				.getFlowActivityEntityCountByQueryCriteria(query);
	}

	public List<FlowActivityEntity> getFlowActivities(int mytaskmainIndexId,
			String mycellTaskId, String activityDefId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("mytaskmainIndexId", mytaskmainIndexId);
		parameter.put("mycellTaskId", mycellTaskId);
		parameter.put("activityDefId", activityDefId);
		return flowActivityEntityMapper.getFlowActivitiesByTaskId(parameter);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowActivityEntity> getFlowActivities(
			Map<String, Object> parameter) {
		return flowActivityEntityMapper.getFlowActivities(parameter);
	}

	/**
	 * 获取已经处理过的活动实例信息
	 * 
	 * @param processInstanceId
	 * @return
	 */
	public List<FlowActivityEntity> getFlowActivitiesByProcessInstanceId(
			String processInstanceId) {
		return flowActivityEntityMapper
				.getFlowActivitiesByProcessInstanceId(processInstanceId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowActivityEntity> getFlowActivitiesByQueryCriteria(int start,
			int pageSize, FlowActivityQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowActivityEntity> rows = sqlSession.selectList(
				"getFlowActivitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public FlowActivityEntity getFlowActivity(String id) {
		FlowActivityEntity flowActivity = flowActivityEntityMapper
				.getFlowActivityEntityById(id);
		return flowActivity;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityCount(Map<String, Object> parameter) {
		return flowActivityEntityMapper.getFlowActivityEntityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityCountByQueryCriteria(FlowActivityQuery query) {
		return flowActivityEntityMapper
				.getFlowActivityEntityCountByQueryCriteria(query);
	}

	public List<FlowActivityEntity> list(FlowActivityQuery query) {
		query.ensureInitialized();
		List<FlowActivityEntity> list = flowActivityEntityMapper
				.getFlowActivitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowActivityEntity flowActivity) {
		if (StringUtils.isEmpty(flowActivity.getId())) {
			flowActivity.setId(idGenerator.getNextId());
			// flowActivity.setId(idGenerator.getNextId());
			// flowActivity.setCreateDate(new Date());
			flowActivityEntityMapper.insertFlowActivityEntity(flowActivity);
		} else {
			FlowActivityEntity model = this.getFlowActivity(flowActivity
					.getId());
			if (model != null) {
				if (flowActivity.getActivDefId() != null) {
					model.setActivDefId(flowActivity.getActivDefId());
				}
				if (flowActivity.getProcessId() != null) {
					model.setProcessId(flowActivity.getProcessId());
				}
				if (flowActivity.getTypeofact() != null) {
					model.setTypeofact(flowActivity.getTypeofact());
				}
				if (flowActivity.getName() != null) {
					model.setName(flowActivity.getName());
				}
				if (flowActivity.getContent() != null) {
					model.setContent(flowActivity.getContent());
				}
				if (flowActivity.getStrfuntion() != null) {
					model.setStrfuntion(flowActivity.getStrfuntion());
				}
				if (flowActivity.getNetroleid() != null) {
					model.setNetroleid(flowActivity.getNetroleid());
				}
				if (flowActivity.getUserId() != null) {
					model.setUserId(flowActivity.getUserId());
				}
				model.setListno(flowActivity.getListno());
				model.setTimelimit(flowActivity.getTimelimit());
				if (flowActivity.getCtimeStart() != null) {
					model.setCtimeStart(flowActivity.getCtimeStart());
				}
				if (flowActivity.getCtimeEnd() != null) {
					model.setCtimeEnd(flowActivity.getCtimeEnd());
				}
				model.setState(flowActivity.getState());
				model.setIntback(flowActivity.getIntback());
				flowActivityEntityMapper.updateFlowActivityEntity(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowActivityEntityMapper(
			FlowActivityEntityMapper flowActivityEntityMapper) {
		this.flowActivityEntityMapper = flowActivityEntityMapper;
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
