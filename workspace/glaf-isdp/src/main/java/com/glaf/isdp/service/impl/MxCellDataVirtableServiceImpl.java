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

@Service("cellDataVirtableService")
@Transactional(readOnly = true)
public class MxCellDataVirtableServiceImpl implements ICellDataVirtableService {
	protected static final Log logger = LogFactory
			.getLog(MxCellDataVirtableServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellDataVirtableMapper cellDataVirtableMapper;

	public MxCellDataVirtableServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellDataVirtableMapper.deleteCellDataVirtableById(id);
	}

	public int count(CellDataVirtableQuery query) {
		query.ensureInitialized();
		return cellDataVirtableMapper
				.getCellDataVirtableCountByQueryCriteria(query);
	}

	public List<CellDataVirtable> list(CellDataVirtableQuery query) {
		query.ensureInitialized();
		List<CellDataVirtable> list = cellDataVirtableMapper
				.getCellDataVirtablesByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataVirtableCount(Map<String, Object> parameter) {
		return cellDataVirtableMapper.getCellDataVirtableCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataVirtableCountByQueryCriteria(
			CellDataVirtableQuery query) {
		return cellDataVirtableMapper
				.getCellDataVirtableCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellDataVirtable> getCellDataVirtablesByQueryCriteria(
			int start, int pageSize, CellDataVirtableQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellDataVirtable> rows = sqlSession.selectList(
				"getCellDataVirtablesByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellDataVirtable> getCellDataVirtables(
			Map<String, Object> parameter) {
		return cellDataVirtableMapper.getCellDataVirtables(parameter);
	}

	public CellDataVirtable getCellDataVirtable(String id) {
		CellDataVirtable cellDataVirtable = cellDataVirtableMapper
				.getCellDataVirtableById(id);
		return cellDataVirtable;
	}

	@Transactional
	public void save(CellDataVirtable cellDataVirtable) {
		if (StringUtils.isEmpty(cellDataVirtable.getId())) {
			cellDataVirtable.setId(idGenerator.getNextId());
			// cellDataVirtable.setId(idGenerator.getNextId());
			// cellDataVirtable.setCreateDate(new Date());
			cellDataVirtableMapper
					.insertCellDataVirtable(cellDataVirtable);
		} else {
			CellDataVirtable model = this.getCellDataVirtable(cellDataVirtable
					.getId());
			if (model != null) {
				if (cellDataVirtable.getTableid() != null) {
					model.setTableid(cellDataVirtable.getTableid());
				}
				if (cellDataVirtable.getDesid() != null) {
					model.setDesid(cellDataVirtable.getDesid());
				}
				model.setInttype(cellDataVirtable.getInttype());
				if (cellDataVirtable.getLstname() != null) {
					model.setLstname(cellDataVirtable.getLstname());
				}
				if (cellDataVirtable.getContent() != null) {
					model.setContent(cellDataVirtable.getContent());
				}
				model.setIntsave(cellDataVirtable.getIntsave());
				cellDataVirtableMapper.updateCellDataVirtable(model);
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
	public void setCellDataVirtableMapper(
			CellDataVirtableMapper cellDataVirtableMapper) {
		this.cellDataVirtableMapper = cellDataVirtableMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
