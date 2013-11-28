package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("cellRepInfoChartService")
@Transactional(readOnly = true)
public class MxCellRepInfoChartServiceImpl implements ICellRepInfoChartService {
	protected static final Log logger = LogFactory
			.getLog(MxCellRepInfoChartServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellRepInfoChartMapper cellRepInfoChartMapper;

	public MxCellRepInfoChartServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellRepInfoChartMapper.deleteCellRepInfoChartById(id);
	}

	public int count(CellRepInfoChartQuery query) {
		query.ensureInitialized();
		return cellRepInfoChartMapper
				.getCellRepInfoChartCountByQueryCriteria(query);
	}

	public List<CellRepInfoChart> list(CellRepInfoChartQuery query) {
		query.ensureInitialized();
		List<CellRepInfoChart> list = cellRepInfoChartMapper
				.getCellRepInfoChartsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfoChartCount(Map<String, Object> parameter) {
		return cellRepInfoChartMapper.getCellRepInfoChartCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfoChartCountByQueryCriteria(
			CellRepInfoChartQuery query) {
		return cellRepInfoChartMapper
				.getCellRepInfoChartCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellRepInfoChart> getCellRepInfoChartsByQueryCriteria(
			int start, int pageSize, CellRepInfoChartQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellRepInfoChart> rows = sqlSession.selectList(
				"getCellRepInfoChartsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellRepInfoChart> getCellRepInfoCharts(
			Map<String, Object> parameter) {
		return cellRepInfoChartMapper.getCellRepInfoCharts(parameter);
	}

	public CellRepInfoChart getCellRepInfoChart(String id) {
		CellRepInfoChart cellRepInfoChart = cellRepInfoChartMapper
				.getCellRepInfoChartById(id);
		return cellRepInfoChart;
	}

	@Transactional
	public void save(CellRepInfoChart cellRepInfoChart) {
		if (StringUtils.isEmpty(cellRepInfoChart.getId())) {
			cellRepInfoChart.setId(idGenerator.getNextId());
			// cellRepInfoChart.setId(idGenerator.getNextId());
			// cellRepInfoChart.setCreateDate(new Date());
			cellRepInfoChartMapper
					.insertCellRepInfoChart(cellRepInfoChart);
		} else {
			CellRepInfoChart model = this.getCellRepInfoChart(cellRepInfoChart
					.getId());
			if (model != null) {
				if (cellRepInfoChart.getTopid() != null) {
					model.setTopid(cellRepInfoChart.getTopid());
				}
				if (cellRepInfoChart.getNameLine() != null) {
					model.setNameLine(cellRepInfoChart.getNameLine());
				}
				if (cellRepInfoChart.getDnameX() != null) {
					model.setDnameX(cellRepInfoChart.getDnameX());
				}
				if (cellRepInfoChart.getDnameY() != null) {
					model.setDnameY(cellRepInfoChart.getDnameY());
				}
				cellRepInfoChartMapper.updateCellRepInfoChart(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setCellRepInfoChartMapper(
			CellRepInfoChartMapper cellRepInfoChartMapper) {
		this.cellRepInfoChartMapper = cellRepInfoChartMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
