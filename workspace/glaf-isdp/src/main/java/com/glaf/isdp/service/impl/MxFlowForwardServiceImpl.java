package com.glaf.isdp.service.impl;

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
import com.glaf.isdp.domain.FlowForward;
import com.glaf.isdp.mapper.FlowForwardMapper;
import com.glaf.isdp.query.FlowForwardQuery;
import com.glaf.isdp.service.IFlowForwardService;

@Service("flowForwardService")
@Transactional(readOnly = true)
public class MxFlowForwardServiceImpl implements IFlowForwardService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowForwardServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowForwardMapper flowForwardMapper;

	public MxFlowForwardServiceImpl() {

	}

	public int count(FlowForwardQuery query) {
		query.ensureInitialized();
		return flowForwardMapper.getFlowForwardCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowForwardMapper.deleteFlowForwardById(id);
	}

	public FlowForward getFlowForward(String id) {
		FlowForward flowForward = flowForwardMapper.getFlowForwardById(id);
		return flowForward;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardCount(Map<String, Object> parameter) {
		return flowForwardMapper.getFlowForwardCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowForwardCountByQueryCriteria(FlowForwardQuery query) {
		return flowForwardMapper.getFlowForwardCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowForward> getFlowForwards(Map<String, Object> parameter) {
		return flowForwardMapper.getFlowForwards(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowForward> getFlowForwardsByQueryCriteria(int start,
			int pageSize, FlowForwardQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowForward> rows = sqlSession.selectList(
				"getFlowForwardsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowForward> list(FlowForwardQuery query) {
		query.ensureInitialized();
		List<FlowForward> list = flowForwardMapper
				.getFlowForwardsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowForward flowForward) {
		if (StringUtils.isEmpty(flowForward.getId())) {
			flowForward.setId(idGenerator.getNextId());
			// flowForward.setId(idGenerator.getNextId());
			// flowForward.setCreateDate(new Date());
			flowForwardMapper.insertFlowForward(flowForward);
		} else {
			FlowForward model = this.getFlowForward(flowForward.getId());
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
				flowForwardMapper.updateFlowForward(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowForwardMapper(
			FlowForwardMapper flowForwardMapper) {
		this.flowForwardMapper = flowForwardMapper;
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
