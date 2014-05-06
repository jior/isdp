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
import com.glaf.isdp.domain.FlowForwardDef;
import com.glaf.isdp.mapper.FlowForwardDefMapper;
import com.glaf.isdp.query.FlowForwardDefQuery;
import com.glaf.isdp.service.IFlowForwardDefService;

@Service("flowForwardDefService")
@Transactional(readOnly = true)
public class MxFlowForwardDefServiceImpl implements IFlowForwardDefService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowForwardDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardDefMapper flowForwardDefMapper;

	public MxFlowForwardDefServiceImpl() {

	}

	public int count(FlowForwardDefQuery query) {
		query.ensureInitialized();
		return flowForwardDefMapper
				.getFlowForwardDefCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowForwardDefMapper.deleteFlowForwardDefById(id);
	}

	public FlowForwardDef getFlowForwardDef(String id) {
		FlowForwardDef flowForwardDef = flowForwardDefMapper
				.getFlowForwardDefById(id);
		return flowForwardDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardDefCount(Map<String, Object> parameter) {
		return flowForwardDefMapper.getFlowForwardDefCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query) {
		return flowForwardDefMapper
				.getFlowForwardDefCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForwardDef> getFlowForwardDefs(Map<String, Object> parameter) {
		return flowForwardDefMapper.getFlowForwardDefs(parameter);
	}

	/**
	 * 根据流程编号获取活动之间的转移关系
	 * 
	 * @param processDefId
	 * @return
	 */
	public List<FlowForwardDef> getFlowForwardDefsByProcessDefId(
			String processDefId) {
		return flowForwardDefMapper
				.getFlowActivityDefsByProcessDefId(processDefId);
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
	public List<FlowForwardDef> getProcessedFlowForwardDefsByProcessId(
			String processId, String processInstanceId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("processId", processId);
		parameter.put("processInstanceId", processInstanceId);
		return flowForwardDefMapper
				.getProcessedFlowForwardDefsByProcessId(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowForwardDef> getFlowForwardDefsByQueryCriteria(int start,
			int pageSize, FlowForwardDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForwardDef> rows = sqlSession.selectList(
				"getFlowForwardDefsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowForwardDef> list(FlowForwardDefQuery query) {
		query.ensureInitialized();
		List<FlowForwardDef> list = flowForwardDefMapper
				.getFlowForwardDefsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForwardDef flowForwardDef) {
		if (StringUtils.isEmpty(flowForwardDef.getId())) {
			flowForwardDef.setId(idGenerator.getNextId());
			// flowForwardDef.setId(idGenerator.getNextId());
			// flowForwardDef.setCreateDate(new Date());
			flowForwardDefMapper.insertFlowForwardDef(flowForwardDef);
		} else {
			FlowForwardDef model = this.getFlowForwardDef(flowForwardDef
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
				flowForwardDefMapper.updateFlowForwardDef(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardDefMapper(
			FlowForwardDefMapper flowForwardDefMapper) {
		this.flowForwardDefMapper = flowForwardDefMapper;
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
