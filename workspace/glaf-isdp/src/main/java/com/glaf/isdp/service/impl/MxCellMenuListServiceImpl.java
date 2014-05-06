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

@Service("cellMenuListService")
@Transactional(readOnly = true)
public class MxCellMenuListServiceImpl implements ICellMenuListService {
	protected static final Log logger = LogFactory
			.getLog(MxCellMenuListServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellMenuListMapper cellMenuListMapper;

	public MxCellMenuListServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellMenuListMapper.deleteCellMenuListById(id);
	}

	public int count(CellMenuListQuery query) {
		query.ensureInitialized();
		return cellMenuListMapper
				.getCellMenuListCountByQueryCriteria(query);
	}

	public List<CellMenuList> list(CellMenuListQuery query) {
		query.ensureInitialized();
		List<CellMenuList> list = cellMenuListMapper
				.getCellMenuListsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMenuListCount(Map<String, Object> parameter) {
		return cellMenuListMapper.getCellMenuListCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMenuListCountByQueryCriteria(CellMenuListQuery query) {
		return cellMenuListMapper
				.getCellMenuListCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellMenuList> getCellMenuListsByQueryCriteria(int start,
			int pageSize, CellMenuListQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellMenuList> rows = sqlSession.selectList(
				"getCellMenuListsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellMenuList> getCellMenuLists(Map<String, Object> parameter) {
		return cellMenuListMapper.getCellMenuLists(parameter);
	}

	public CellMenuList getCellMenuList(String id) {
		CellMenuList cellMenuList = cellMenuListMapper
				.getCellMenuListById(id);
		return cellMenuList;
	}

	@Transactional
	public void save(CellMenuList cellMenuList) {
		if (StringUtils.isEmpty(cellMenuList.getId())) {
			cellMenuList.setId(idGenerator.getNextId());
			// cellMenuList.setId(idGenerator.getNextId());
			// cellMenuList.setCreateDate(new Date());
			cellMenuListMapper.insertCellMenuList(cellMenuList);
		} else {
			CellMenuList model = this.getCellMenuList(cellMenuList.getId());
			if (model != null) {
				if (cellMenuList.getTopid() != null) {
					model.setTopid(cellMenuList.getTopid());
				}
				model.setIndexId(cellMenuList.getIndexId());
				cellMenuListMapper.updateCellMenuList(model);
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
	public void setCellMenuListMapper(
			CellMenuListMapper cellMenuListMapper) {
		this.cellMenuListMapper = cellMenuListMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
