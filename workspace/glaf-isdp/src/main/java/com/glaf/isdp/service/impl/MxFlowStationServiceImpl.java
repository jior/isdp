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
import com.glaf.isdp.domain.FlowStation;
import com.glaf.isdp.mapper.FlowStationMapper;
import com.glaf.isdp.query.FlowStationQuery;
import com.glaf.isdp.service.IFlowStationService;

@Service("flowStationService")
@Transactional(readOnly = true)
public class MxFlowStationServiceImpl implements IFlowStationService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowStationServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowStationMapper flowStationMapper;

	public MxFlowStationServiceImpl() {

	}

	public int count(FlowStationQuery query) {
		query.ensureInitialized();
		return flowStationMapper.getFlowStationCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowStationMapper.deleteFlowStationById(id);
	}

	public FlowStation getFlowStation(String id) {
		FlowStation flowStation = flowStationMapper.getFlowStationById(id);
		return flowStation;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowStationCount(Map<String, Object> parameter) {
		return flowStationMapper.getFlowStationCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowStationCountByQueryCriteria(FlowStationQuery query) {
		return flowStationMapper.getFlowStationCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowStation> getFlowStations(Map<String, Object> parameter) {
		return flowStationMapper.getFlowStations(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<FlowStation> getFlowStationsByQueryCriteria(int start,
			int pageSize, FlowStationQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowStation> rows = sqlSession.selectList(
				"getFlowStationsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<FlowStation> list(FlowStationQuery query) {
		query.ensureInitialized();
		List<FlowStation> list = flowStationMapper
				.getFlowStationsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowStation flowStation) {
		if (StringUtils.isEmpty(flowStation.getId())) {
			flowStation.setId(idGenerator.getNextId());
			// flowStation.setId(idGenerator.getNextId());
			// flowStation.setCreateDate(new Date());
			flowStationMapper.insertFlowStation(flowStation);
		} else {
			FlowStation model = this.getFlowStation(flowStation.getId());
			if (model != null) {
				if (flowStation.getProcessId() != null) {
					model.setProcessId(flowStation.getProcessId());
				}
				if (flowStation.getActivDefId() != null) {
					model.setActivDefId(flowStation.getActivDefId());
				}
				flowStationMapper.updateFlowStation(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowStationMapper(
			FlowStationMapper flowStationMapper) {
		this.flowStationMapper = flowStationMapper;
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
