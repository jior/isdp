package com.glaf.isdp.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.CellCriterionTree;
import com.glaf.isdp.mapper.CellCriterionTreeMapper;
import com.glaf.isdp.query.CellCriterionTreeQuery;
import com.glaf.isdp.service.ICellCriterionTreeService;

@Service("cellCriterionTreeService")
@Transactional(readOnly = true)
public class MxCellCriterionTreeServiceImpl implements
		ICellCriterionTreeService {
	protected static final Log logger = LogFactory
			.getLog(MxCellCriterionTreeServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellCriterionTreeMapper cellCriterionTreeMapper;

	public MxCellCriterionTreeServiceImpl() {

	}

	public int count(CellCriterionTreeQuery query) {
		query.ensureInitialized();
		return cellCriterionTreeMapper
				.getCellCriterionTreeCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellCriterionTreeMapper.deleteCellCriterionTreeById(id);
	}

	public void deleteByPimaryKey(int indexId) {
		cellCriterionTreeMapper.deleteCellCriterionTreeByIndexId(indexId);
	}

	public CellCriterionTree getCellCriterionTreeById(String id) {
		return cellCriterionTreeMapper.getCellCriterionTreeById(id);
	}

	public CellCriterionTree getCellCriterionTreeByPimaryKey(int indexId) {
		CellCriterionTree cellCriterionTree = cellCriterionTreeMapper
				.getCellCriterionTreeByIndexId(indexId);
		return cellCriterionTree;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellCriterionTreeCount(Map<String, Object> parameter) {
		return cellCriterionTreeMapper
				.getCellCriterionTreeCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellCriterionTreeCountByQueryCriteria(
			CellCriterionTreeQuery query) {
		return cellCriterionTreeMapper
				.getCellCriterionTreeCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellCriterionTree> getCellCriterionTrees(
			Map<String, Object> parameter) {
		return cellCriterionTreeMapper.getCellCriterionTrees(parameter);
	}

	public List<CellCriterionTree> getCellCriterionTrees(int indexId,
			int intistasks) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("indexId", indexId);
		parameter.put("intistasks", intistasks);
		return cellCriterionTreeMapper
				.getCellCriterionTreesByTasksIndexId(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<CellCriterionTree> getCellCriterionTreesByQueryCriteria(
			int start, int pageSize, CellCriterionTreeQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellCriterionTree> rows = sqlSession.selectList(
				"getCellCriterionTreesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellCriterionTree> list(CellCriterionTreeQuery query) {
		query.ensureInitialized();
		List<CellCriterionTree> list = cellCriterionTreeMapper
				.getCellCriterionTreesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellCriterionTree cellCriterionTree) {
		if (cellCriterionTree.getIndexId() == 0) {
			cellCriterionTree.setIndexId(idGenerator.nextId().intValue());
			// cellCriterionTree.setIndexId(idGenerator.getNextId());
			// cellCriterionTree.setCreateDate(new Date());
			cellCriterionTreeMapper
					.insertCellCriterionTree(cellCriterionTree);
		} else {
			CellCriterionTree model = this
					.getCellCriterionTreeByPimaryKey(cellCriterionTree
							.getIndexId());
			if (model != null) {
				model.setTreeprojIndex(cellCriterionTree.getTreeprojIndex());
				if (cellCriterionTree.getNum() != null) {
					model.setNum(cellCriterionTree.getNum());
				}
				if (cellCriterionTree.getIndexName() != null) {
					model.setIndexName(cellCriterionTree.getIndexName());
				}
				if (cellCriterionTree.getContent() != null) {
					model.setContent(cellCriterionTree.getContent());
				}
				model.setIsuse(cellCriterionTree.getIsuse());
				model.setNodeico(cellCriterionTree.getNodeico());
				model.setListno(cellCriterionTree.getListno());
				if (cellCriterionTree.getId() != null) {
					model.setId(cellCriterionTree.getId());
				}
				model.setInttype(cellCriterionTree.getInttype());
				cellCriterionTreeMapper.updateCellCriterionTree(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellCriterionTreeMapper(
			CellCriterionTreeMapper cellCriterionTreeMapper) {
		this.cellCriterionTreeMapper = cellCriterionTreeMapper;
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
