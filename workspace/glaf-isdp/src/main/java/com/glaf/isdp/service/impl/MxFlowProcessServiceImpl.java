package com.glaf.isdp.service.impl;

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
import com.glaf.isdp.domain.FlowProcess;
import com.glaf.isdp.mapper.FlowProcessMapper;
import com.glaf.isdp.query.FlowProcessQuery;
import com.glaf.isdp.service.IFlowProcessService;

@Service("flowProcessService")
@Transactional(readOnly = true)
public class MxFlowProcessServiceImpl implements IFlowProcessService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowProcessServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowProcessMapper flowProcessMapper;

	public MxFlowProcessServiceImpl() {

	}

	public int count(FlowProcessQuery query) {
		query.ensureInitialized();
		return flowProcessMapper.getFlowProcessCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowProcessMapper.deleteFlowProcessById(id);
	}

	public FlowProcess getFlowProcess(String id) {
		FlowProcess flowProcess = flowProcessMapper.getFlowProcessById(id);
		return flowProcess;
	}

	public List<FlowProcess> getFlowProcessesByTaskMainId(String taskMainId) {
		return flowProcessMapper.getFlowProcessesByTaskMainId(taskMainId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessCount(Map<String, Object> parameter) {
		return flowProcessMapper.getFlowProcessCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowProcessCountByQueryCriteria(FlowProcessQuery query) {
		return flowProcessMapper.getFlowProcessCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowProcess> getFlowProcesses(Map<String, Object> parameter) {
		return flowProcessMapper.getFlowProcesses(parameter);
	}

	public List<FlowProcess> getFlowProcesses(int taskmainIndexId,
			String cellTaskId, int intisflow) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("taskmainIndexId", taskmainIndexId);
		parameter.put("cellTaskId", cellTaskId);
		parameter.put("intisflow", intisflow);
		return flowProcessMapper.getFlowProcessesByTask(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowProcess> getFlowProcessesByQueryCriteria(int start,
			int pageSize, FlowProcessQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowProcess> rows = sqlSession.selectList(
				"getFlowProcessesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowProcess> list(FlowProcessQuery query) {
		query.ensureInitialized();
		List<FlowProcess> list = flowProcessMapper
				.getFlowProcessesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowProcess flowProcess) {
		if (StringUtils.isEmpty(flowProcess.getId())) {
			flowProcess.setId(idGenerator.getNextId());
			// flowProcess.setId(idGenerator.getNextId());
			// flowProcess.setCreateDate(new Date());
			flowProcessMapper.insertFlowProcess(flowProcess);
		} else {
			FlowProcess model = this.getFlowProcess(flowProcess.getId());
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
				if (flowProcess.getActor() != null) {
					model.setActor(flowProcess.getActor());
				}
				if (flowProcess.getCtime() != null) {
					model.setCtime(flowProcess.getCtime());
				}
				if (flowProcess.getVersion() != null) {
					model.setVersion(flowProcess.getVersion());
				}
				model.setState(flowProcess.getState());
				flowProcessMapper.updateFlowProcess(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowProcessMapper(
			FlowProcessMapper flowProcessMapper) {
		this.flowProcessMapper = flowProcessMapper;
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
