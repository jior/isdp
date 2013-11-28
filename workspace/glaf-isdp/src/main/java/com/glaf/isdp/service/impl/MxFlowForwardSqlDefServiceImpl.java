package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.FlowForwardSqlDef;
import com.glaf.isdp.mapper.FlowForwardSqlDefMapper;
import com.glaf.isdp.query.FlowForwardSqlDefQuery;
import com.glaf.isdp.service.IFlowForwardSqlDefService;

@Service("flowForwardSqlDefService")
@Transactional(readOnly = true)
public class MxFlowForwardSqlDefServiceImpl implements
		IFlowForwardSqlDefService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowForwardSqlDefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardSqlDefMapper flowForwardSqlDefMapper;

	public MxFlowForwardSqlDefServiceImpl() {

	}

	public int count(FlowForwardSqlDefQuery query) {
		query.ensureInitialized();
		return flowForwardSqlDefMapper
				.getFlowForwardSqlDefCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowForwardSqlDefMapper.deleteFlowForwardSqlDefById(id);
	}

	public FlowForwardSqlDef getFlowForwardSqlDef(String id) {
		FlowForwardSqlDef flowForwardSqlDef = flowForwardSqlDefMapper
				.getFlowForwardSqlDefById(id);
		return flowForwardSqlDef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardSqlDefCount(Map<String, Object> parameter) {
		return flowForwardSqlDefMapper
				.getFlowForwardSqlDefCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardSqlDefCountByQueryCriteria(
			FlowForwardSqlDefQuery query) {
		return flowForwardSqlDefMapper
				.getFlowForwardSqlDefCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForwardSqlDef> getFlowForwardSqlDefs(
			Map<String, Object> parameter) {
		return flowForwardSqlDefMapper.getFlowForwardSqlDefs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowForwardSqlDef> getFlowForwardSqlDefsByQueryCriteria(
			int start, int pageSize, FlowForwardSqlDefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForwardSqlDef> rows = sqlSession.selectList(
				"getFlowForwardSqlDefsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowForwardSqlDef> list(FlowForwardSqlDefQuery query) {
		query.ensureInitialized();
		List<FlowForwardSqlDef> list = flowForwardSqlDefMapper
				.getFlowForwardSqlDefsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForwardSqlDef flowForwardSqlDef) {
		if (StringUtils.isEmpty(flowForwardSqlDef.getId())) {
			flowForwardSqlDef.setId(idGenerator.getNextId());
			// flowForwardSqlDef.setId(idGenerator.getNextId());
			// flowForwardSqlDef.setCreateDate(new Date());
			flowForwardSqlDefMapper
					.insertFlowForwardSqlDef(flowForwardSqlDef);
		} else {
			FlowForwardSqlDef model = this
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
				flowForwardSqlDefMapper.updateFlowForwardSqlDef(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardSqlDefMapper(
			FlowForwardSqlDefMapper flowForwardSqlDefMapper) {
		this.flowForwardSqlDefMapper = flowForwardSqlDefMapper;
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
