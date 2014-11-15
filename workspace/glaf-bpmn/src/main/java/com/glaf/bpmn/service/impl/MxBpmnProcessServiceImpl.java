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

import java.util.ArrayList;
import java.util.Date;
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
import com.glaf.core.util.ParamUtils;
import com.glaf.bpmn.domain.FlowActivityDefEntity;
import com.glaf.bpmn.domain.FlowActivityEntity;
import com.glaf.bpmn.domain.FlowForwardDefEntity;
import com.glaf.bpmn.domain.FlowProcessDefEntity;
import com.glaf.bpmn.domain.FlowProcessEntity;
import com.glaf.bpmn.mapper.FlowActivityDefEntityMapper;
import com.glaf.bpmn.mapper.FlowActivityEntityMapper;
import com.glaf.bpmn.mapper.FlowForwardDefEntityMapper;
import com.glaf.bpmn.mapper.FlowForwardEntityMapper;
import com.glaf.bpmn.mapper.FlowProcessDefEntityMapper;
import com.glaf.bpmn.mapper.FlowProcessEntityMapper;
import com.glaf.bpmn.query.FlowProcessQuery;
import com.glaf.bpmn.service.BpmnProcessDefService;
import com.glaf.bpmn.service.BpmnProcessService;

@Service("bpmnProcessService")
@Transactional(readOnly = true)
public class MxBpmnProcessServiceImpl implements BpmnProcessService {
	protected static final Log logger = LogFactory
			.getLog(MxBpmnProcessServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityDefEntityMapper flowActivityDefEntityMapper;

	protected FlowActivityEntityMapper flowActivityEntityMapper;

	protected FlowForwardDefEntityMapper flowForwardDefEntityMapper;

	protected FlowForwardEntityMapper flowForwardEntityMapper;

	protected FlowProcessDefEntityMapper flowProcessDefEntityMapper;

	protected FlowProcessEntityMapper flowProcessEntityMapper;

	protected BpmnProcessDefService bpmnProcessDefService;

	public MxBpmnProcessServiceImpl() {

	}

	public void completeTask(String actorId, String activityId, String outcome,
			Map<String, Object> variables) {
		FlowActivityEntity activity = flowActivityEntityMapper
				.getFlowActivityEntityById(activityId);
		activity.setCtimeEnd(new Date());
		activity.setState(1);
		activity.setUserId(actorId);
		flowActivityEntityMapper.updateFlowActivityEntity(activity);

		FlowProcessEntity flowProcess = flowProcessEntityMapper
				.getFlowProcessEntityById(activity.getProcessId());
		FlowProcessDefEntity processDefinition = bpmnProcessDefService
				.getFlowProcessDef(flowProcess.getProcessDefId());
		List<FlowActivityDefEntity> activities = processDefinition
				.getActivities();
		Map<String, FlowActivityDefEntity> activityMap = new HashMap<String, FlowActivityDefEntity>();
		for (FlowActivityDefEntity act : activities) {
			/**
			 * 排除开始节点
			 */
			if (!StringUtils.equals(act.getTypeofact(), "1")) {
				activityMap.put(act.getId(), act);
			}
		}

		// 找到下一步活动，创建任务活动实例（单任务，多任务）
		FlowActivityDefEntity currActivityDef = null;
		for (FlowActivityDefEntity actDef : activities) {
			if (StringUtils.equals(actDef.getId(), activity.getActivDefId())) {
				currActivityDef = actDef;// 找到当前活动
				break;
			}
		}

		/**
		 * 如果当前是结束节点，那么结束流程
		 */
		if (currActivityDef != null
				&& StringUtils.equals(currActivityDef.getTypeofact(), "2")) {
			flowProcess.setState(1);
			flowProcessEntityMapper.updateFlowProcessEntity(flowProcess);
			/**
			 * 结束流程，关闭未处理的活动实例
			 */
			return;
		}

		List<FlowActivityDefEntity> nextActivities = new ArrayList<FlowActivityDefEntity>();
		List<FlowForwardDefEntity> sequenceFlows = processDefinition
				.getSequenceFlows();
		for (FlowForwardDefEntity forwardDef : sequenceFlows) {
			if (StringUtils.equals(outcome, "pre")) {
				if (StringUtils.equals(currActivityDef.getId(),
						forwardDef.getActivPre())) {
					nextActivities
							.add(activityMap.get(forwardDef.getActivPre()));
				}
			} else if (StringUtils.equals(outcome, "next")) {
				if (StringUtils.equals(currActivityDef.getId(),
						forwardDef.getActivPre())) {
					nextActivities.add(activityMap.get(forwardDef
							.getActivNext()));
				}
			}
		}

		if (!nextActivities.isEmpty()) {
			if (nextActivities.size() == 1) {
				/**
				 * 如果下一步是结束节点，那么结束流程
				 */
				FlowActivityDefEntity activityDef = nextActivities.get(0);
				if (StringUtils.equals(activityDef.getTypeofact(), "2")) {
					flowProcess.setState(1);
					flowProcessEntityMapper
							.updateFlowProcessEntity(flowProcess);
					/**
					 * 结束流程，关闭未处理的活动实例
					 */
					return;
				}
			}
			/**
			 * 为每个活动定义创建活动实例
			 */
			for (FlowActivityDefEntity actDef : nextActivities) {
				if (StringUtils.equals(actDef.getTypeofact(), "0")) {
					FlowActivityEntity act = new FlowActivityEntity();
					act.setId(idGenerator.getNextId());
					act.setActivDefId(actDef.getId());
					act.setContent(actDef.getContent());
					act.setCtimeStart(new Date());
					act.setState(0);// 0代表未完成
					act.setListno(actDef.getListno());
					act.setTimelimit(actDef.getTimelimit());
					act.setNetroleid(actDef.getNetroleid());
					act.setProcessId(flowProcess.getId());
					act.setStrfuntion(actDef.getStrfuntion());
					act.setTypeofact(actDef.getTypeofact());
					flowActivityEntityMapper.insertFlowActivityEntity(act);
				}
			}
		}
	}

	public int count(FlowProcessQuery query) {
		query.ensureInitialized();
		return flowProcessEntityMapper
				.getFlowProcessEntityCountByQueryCriteria(query);
	}

	public FlowProcessEntity getFlowProcessById(String id) {
		FlowProcessEntity flowProcess = flowProcessEntityMapper
				.getFlowProcessEntityById(id);
		return flowProcess;
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

	public List<FlowProcessEntity> getFlowProcesses(int taskmainIndexId,
			String cellTaskId, int intisflow) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("taskmainIndexId", taskmainIndexId);
		parameter.put("cellTaskId", cellTaskId);
		parameter.put("intisflow", intisflow);
		return flowProcessEntityMapper.getFlowProcessEntityesByTask(parameter);
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

	public List<FlowProcessEntity> getFlowProcessesByTaskMainId(
			String taskMainId) {
		return flowProcessEntityMapper
				.getFlowProcessEntityesByTaskMainId(taskMainId);
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
			FlowProcessEntity model = this.getFlowProcessById(flowProcess
					.getId());
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
	public void setBpmnProcessDefService(
			BpmnProcessDefService bpmnProcessDefService) {
		this.bpmnProcessDefService = bpmnProcessDefService;
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
	public void setFlowActivityEntityMapper(
			FlowActivityEntityMapper flowActivityEntityMapper) {
		this.flowActivityEntityMapper = flowActivityEntityMapper;
	}

	@javax.annotation.Resource
	public void setFlowForwardDefEntityMapper(
			FlowForwardDefEntityMapper flowForwardDefEntityMapper) {
		this.flowForwardDefEntityMapper = flowForwardDefEntityMapper;
	}

	@javax.annotation.Resource
	public void setFlowForwardEntityMapper(
			FlowForwardEntityMapper flowForwardEntityMapper) {
		this.flowForwardEntityMapper = flowForwardEntityMapper;
	}

	@javax.annotation.Resource
	public void setFlowProcessDefEntityMapper(
			FlowProcessDefEntityMapper flowProcessDefEntityMapper) {
		this.flowProcessDefEntityMapper = flowProcessDefEntityMapper;
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

	public FlowProcessEntity startProcessInstanceByKey(String actorId,
			String processDefinitionId, String mainId,
			Map<String, Object> variables) {
		FlowProcessEntity flowProcess = new FlowProcessEntity();
		flowProcess.setId(idGenerator.getNextId());
		flowProcess.setMainId(mainId);
		flowProcess.setCtime(new Date());
		flowProcess.setProcessDefId(processDefinitionId);
		flowProcess.setActorId(actorId);
		flowProcess.setContent(ParamUtils.getString(variables, "content"));
		flowProcess.setName(ParamUtils.getString(variables, "name"));
		flowProcess.setFileid(ParamUtils.getString(variables, "fileid"));
		flowProcessEntityMapper.insertFlowProcessEntity(flowProcess);// 创建流程实例

		FlowProcessDefEntity processDefinition = bpmnProcessDefService
				.getFlowProcessDef(processDefinitionId);
		List<FlowActivityDefEntity> activities = processDefinition
				.getActivities();
		Map<String, FlowActivityDefEntity> activityMap = new HashMap<String, FlowActivityDefEntity>();
		for (FlowActivityDefEntity act : activities) {
			activityMap.put(act.getId(), act);
		}

		// 找到第一步活动，创建任务活动实例（单任务，多任务）
		FlowActivityDefEntity firstActivity = null;
		for (FlowActivityDefEntity act : activities) {
			if (StringUtils.equals(act.getTypeofact(), "1")) {
				firstActivity = act;// 取得第一步活动
				break;
			}
		}

		List<FlowActivityDefEntity> nextActivities = new ArrayList<FlowActivityDefEntity>();
		List<FlowForwardDefEntity> sequenceFlows = processDefinition
				.getSequenceFlows();
		for (FlowForwardDefEntity forward : sequenceFlows) {
			if (StringUtils
					.equals(firstActivity.getId(), forward.getActivPre())) {
				nextActivities.add(activityMap.get(forward.getActivId()));
			}
		}

		if (!nextActivities.isEmpty()) {
			/**
			 * 为每个活动定义创建活动实例
			 */
			for (FlowActivityDefEntity actDef : nextActivities) {
				if (StringUtils.equals(actDef.getTypeofact(), "0")) {
					FlowActivityEntity act = new FlowActivityEntity();
					act.setId(idGenerator.getNextId());
					act.setActivDefId(actDef.getId());
					act.setContent(actDef.getContent());
					act.setCtimeStart(new Date());
					act.setState(0);// 0代表未完成
					act.setListno(actDef.getListno());
					act.setTimelimit(actDef.getTimelimit());
					act.setNetroleid(actDef.getNetroleid());
					act.setProcessId(flowProcess.getId());
					act.setStrfuntion(actDef.getStrfuntion());
					act.setTypeofact(actDef.getTypeofact());
					flowActivityEntityMapper.insertFlowActivityEntity(act);
				}
			}
		}

		return flowProcess;
	}

}
