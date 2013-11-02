package com.glaf.isdp.service.impl;

import java.util.*;

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

@Service("cellTreehintService")
@Transactional(readOnly = true)
public class MxCellTreehintServiceImpl implements ICellTreehintService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTreehintServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreehintMapper cellTreehintMapper;

	public MxCellTreehintServiceImpl() {

	}

	public int count(CellTreehintQuery query) {
		query.ensureInitialized();
		return cellTreehintMapper
				.getCellTreehintCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreehintMapper.deleteCellTreehintById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		cellTreehintMapper.deleteCellTreehintByIndexId(indexId);
	}

	public CellTreehint getCellTreehintById(String id) {
		CellTreehint cellTreehint = cellTreehintMapper
				.getCellTreehintById(id);
		return cellTreehint;
	}

	public CellTreehint getCellTreehintByPrimaryKey(int indexId) {
		return cellTreehintMapper.getCellTreehintByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreehintCount(Map<String, Object> parameter) {
		return cellTreehintMapper.getCellTreehintCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreehintCountByQueryCriteria(CellTreehintQuery query) {
		return cellTreehintMapper
				.getCellTreehintCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTreehint> getCellTreehints(Map<String, Object> parameter) {
		return cellTreehintMapper.getCellTreehints(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTreehint> getCellTreehintsByQueryCriteria(int start,
			int pageSize, CellTreehintQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreehint> rows = sqlSession.selectList(
				"getCellTreehintsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreehint> list(CellTreehintQuery query) {
		query.ensureInitialized();
		List<CellTreehint> list = cellTreehintMapper
				.getCellTreehintsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreehint cellTreehint) {
		if (cellTreehint.getIndexId() == 0) {
			cellTreehint.setIndexId(idGenerator.nextId().intValue());
			// cellTreehint.setIndexId(idGenerator.getNextId());
			// cellTreehint.setCreateDate(new Date());
			cellTreehintMapper.insertCellTreehint(cellTreehint);
		} else {
			CellTreehint model = this.getCellTreehintByPrimaryKey(cellTreehint
					.getIndexId());
			if (model != null) {
				if (cellTreehint.getId() != null) {
					model.setId(cellTreehint.getId());
				}
				if (cellTreehint.getIndexName() != null) {
					model.setIndexName(cellTreehint.getIndexName());
				}
				model.setNlevel(cellTreehint.getNlevel());
				if (cellTreehint.getNum() != null) {
					model.setNum(cellTreehint.getNum());
				}
				if (cellTreehint.getContent() != null) {
					model.setContent(cellTreehint.getContent());
				}
				model.setNodeico(cellTreehint.getNodeico());
				model.setListno(cellTreehint.getListno());
				cellTreehintMapper.updateCellTreehint(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellTreehintMapper(
			CellTreehintMapper cellTreehintMapper) {
		this.cellTreehintMapper = cellTreehintMapper;
	}

 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name="myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
