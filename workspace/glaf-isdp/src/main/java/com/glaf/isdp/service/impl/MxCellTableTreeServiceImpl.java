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

@Service("cellTableTreeService")
@Transactional(readOnly = true)
public class MxCellTableTreeServiceImpl implements ICellTableTreeService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTableTreeServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTableTreeMapper cellTableTreeMapper;

	public MxCellTableTreeServiceImpl() {

	}

	@Transactional
	public void deleteById(Integer id) {
		cellTableTreeMapper.deleteCellTableTreeById(id);
	}

	public int count(CellTableTreeQuery query) {
		query.ensureInitialized();
		return cellTableTreeMapper
				.getCellTableTreeCountByQueryCriteria(query);
	}

	/**
	 * 获取管理大类结构定义
	 * 
	 * @return
	 */
	public List<CellTableTree> getMgmtCellTableTrees() {
		CellTableTreeQuery query = new CellTableTreeQuery();
		query.domainIndex(1).tabletype(2).menuindex(68);
		return this.list(query);
	}

	public List<CellTableTree> list(CellTableTreeQuery query) {
		query.ensureInitialized();
		List<CellTableTree> list = cellTableTreeMapper
				.getCellTableTreesByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTableTreeCount(Map<String, Object> parameter) {
		return cellTableTreeMapper.getCellTableTreeCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTableTreeCountByQueryCriteria(CellTableTreeQuery query) {
		return cellTableTreeMapper
				.getCellTableTreeCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTableTree> getCellTableTreesByQueryCriteria(int start,
			int pageSize, CellTableTreeQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTableTree> rows = sqlSession.selectList(
				"getCellTableTreesByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTableTree> getCellTableTrees(Map<String, Object> parameter) {
		return cellTableTreeMapper.getCellTableTrees(parameter);
	}

	public CellTableTree getCellTableTree(Integer id) {
		CellTableTree cellTableTree = cellTableTreeMapper
				.getCellTableTreeById(id);
		return cellTableTree;
	}

	@Transactional
	public void save(CellTableTree cellTableTree) {
		if (cellTableTree.getIndexId() == 0) {
			cellTableTree.setIndexId(idGenerator.nextId().intValue());
			cellTableTreeMapper.insertCellTableTree(cellTableTree);
		} else {
			CellTableTree model = this.getCellTableTree(cellTableTree
					.getIndexId());
			if (model != null) {
				if (cellTableTree.getId() != null) {
					model.setId(cellTableTree.getId());
				}
				model.setParentId(cellTableTree.getParentId());
				if (cellTableTree.getIndexName() != null) {
					model.setIndexName(cellTableTree.getIndexName());
				}
				model.setNlevel(cellTableTree.getNlevel());
				model.setNodeico(cellTableTree.getNodeico());
				model.setListno(cellTableTree.getListno());
				model.setTabletype(cellTableTree.getTabletype());
				model.setIntdel(cellTableTree.getIntdel());
				if (cellTableTree.getBusiessId() != null) {
					model.setBusiessId(cellTableTree.getBusiessId());
				}
				if (cellTableTree.getContent() != null) {
					model.setContent(cellTableTree.getContent());
				}
				if (cellTableTree.getNum() != null) {
					model.setNum(cellTableTree.getNum());
				}
				model.setMenuindex(cellTableTree.getMenuindex());
				model.setDomainIndex(cellTableTree.getDomainIndex());
				model.setWinWidth(cellTableTree.getWinWidth());
				model.setWinHeight(cellTableTree.getWinHeight());
				cellTableTreeMapper.updateCellTableTree(model);
			}
		}
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
	public void setCellTableTreeMapper(
			CellTableTreeMapper cellTableTreeMapper) {
		this.cellTableTreeMapper = cellTableTreeMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
