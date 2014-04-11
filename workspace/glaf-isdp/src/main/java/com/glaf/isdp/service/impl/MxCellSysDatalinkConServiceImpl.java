package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
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

@Service("cellSysDatalinkConService")
@Transactional(readOnly = true)
public class MxCellSysDatalinkConServiceImpl implements
		ICellSysDatalinkConService {
	protected static final Log logger = LogFactory
			.getLog(MxCellSysDatalinkConServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellSysDatalinkConMapper cellSysDatalinkConMapper;

	public MxCellSysDatalinkConServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellSysDatalinkConMapper.deleteCellSysDatalinkConById(id);
	}

	public int count(CellSysDatalinkConQuery query) {
		query.ensureInitialized();
		return cellSysDatalinkConMapper
				.getCellSysDatalinkConCountByQueryCriteria(query);
	}

	public List<CellSysDatalinkCon> list(CellSysDatalinkConQuery query) {
		query.ensureInitialized();
		List<CellSysDatalinkCon> list = cellSysDatalinkConMapper
				.getCellSysDatalinkConsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellSysDatalinkConCount(Map<String, Object> parameter) {
		return cellSysDatalinkConMapper
				.getCellSysDatalinkConCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellSysDatalinkConCountByQueryCriteria(
			CellSysDatalinkConQuery query) {
		return cellSysDatalinkConMapper
				.getCellSysDatalinkConCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellSysDatalinkCon> getCellSysDatalinkConsByQueryCriteria(
			int start, int pageSize, CellSysDatalinkConQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellSysDatalinkCon> rows = sqlSession.selectList(
				"getCellSysDatalinkConsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellSysDatalinkCon> getCellSysDatalinkCons(
			Map<String, Object> parameter) {
		return cellSysDatalinkConMapper.getCellSysDatalinkCons(parameter);
	}

	public CellSysDatalinkCon getCellSysDatalinkCon(String id) {
		CellSysDatalinkCon cellSysDatalinkCon = cellSysDatalinkConMapper
				.getCellSysDatalinkConById(id);
		return cellSysDatalinkCon;
	}

	@Transactional
	public void save(CellSysDatalinkCon cellSysDatalinkCon) {
		if (StringUtils.isEmpty(cellSysDatalinkCon.getId())) {
			cellSysDatalinkCon.setId(idGenerator.getNextId());
			// cellSysDatalinkCon.setId(idGenerator.getNextId());
			// cellSysDatalinkCon.setCreateDate(new Date());
			cellSysDatalinkConMapper
					.insertCellSysDatalinkCon(cellSysDatalinkCon);
		} else {
			CellSysDatalinkCon model = this
					.getCellSysDatalinkCon(cellSysDatalinkCon.getId());
			if (model != null) {
				if (cellSysDatalinkCon.getSysdatalinkId() != null) {
					model.setSysdatalinkId(cellSysDatalinkCon
							.getSysdatalinkId());
				}
				model.setIntandor(cellSysDatalinkCon.getIntandor());
				model.setSqlconshow(cellSysDatalinkCon.getSqlconshow());
				model.setSqlcon(cellSysDatalinkCon.getSqlcon());
				cellSysDatalinkConMapper.updateCellSysDatalinkCon(model);
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
	public void setCellSysDatalinkConMapper(
			CellSysDatalinkConMapper cellSysDatalinkConMapper) {
		this.cellSysDatalinkConMapper = cellSysDatalinkConMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
