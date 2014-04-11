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

@Service("cellMenuService")
@Transactional(readOnly = true)
public class MxCellMenuServiceImpl implements ICellMenuService {
	protected static final Log logger = LogFactory
			.getLog(MxCellMenuServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellMenuMapper cellMenuMapper;

	public MxCellMenuServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellMenuMapper.deleteCellMenuById(id);
	}

	public int count(CellMenuQuery query) {
		query.ensureInitialized();
		return cellMenuMapper.getCellMenuCountByQueryCriteria(query);
	}

	public List<CellMenu> list(CellMenuQuery query) {
		query.ensureInitialized();
		List<CellMenu> list = cellMenuMapper
				.getCellMenusByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMenuCount(Map<String, Object> parameter) {
		return cellMenuMapper.getCellMenuCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMenuCountByQueryCriteria(CellMenuQuery query) {
		return cellMenuMapper.getCellMenuCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellMenu> getCellMenusByQueryCriteria(int start, int pageSize,
			CellMenuQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellMenu> rows = sqlSession.selectList(
				"getCellMenusByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellMenu> getCellMenus(Map<String, Object> parameter) {
		return cellMenuMapper.getCellMenus(parameter);
	}

	public CellMenu getCellMenu(String id) {
		CellMenu cellMenu = cellMenuMapper.getCellMenuById(id);
		return cellMenu;
	}

	public CellMenu getCellMenuByBusinessId(String businessId) {
		CellMenuQuery query = new CellMenuQuery();
		query.busiessId(businessId);
		List<CellMenu> list = cellMenuMapper
				.getCellMenusByQueryCriteria(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	@Transactional
	public void save(CellMenu cellMenu) {
		if (StringUtils.isEmpty(cellMenu.getId())) {
			cellMenu.setId(idGenerator.getNextId());
			// cellMenu.setId(idGenerator.getNextId());
			// cellMenu.setCreateDate(new Date());
			cellMenuMapper.insertCellMenu(cellMenu);
		} else {
			CellMenu model = this.getCellMenu(cellMenu.getId());
			if (model != null) {
				if (cellMenu.getName() != null) {
					model.setName(cellMenu.getName());
				}
				if (cellMenu.getUserid() != null) {
					model.setUserid(cellMenu.getUserid());
				}
				if (cellMenu.getIsuselect() != null) {
					model.setIsuselect(cellMenu.getIsuselect());
				}
				model.setIssystem(cellMenu.getIssystem());
				model.setIntused(cellMenu.getIntused());
				if (cellMenu.getBusiessId() != null) {
					model.setBusiessId(cellMenu.getBusiessId());
				}
				model.setIntdel(cellMenu.getIntdel());
				cellMenuMapper.updateCellMenu(model);
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
	public void setCellMenuMapper(CellMenuMapper cellMenuMapper) {
		this.cellMenuMapper = cellMenuMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
