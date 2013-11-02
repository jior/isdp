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
import com.glaf.isdp.domain.CellTreedotView;
import com.glaf.isdp.mapper.CellTreedotViewMapper;
import com.glaf.isdp.query.CellTreedotViewQuery;
import com.glaf.isdp.service.ICellTreedotViewService;

@Service("cellTreedotViewService")
@Transactional(readOnly = true)
public class MxCellTreedotViewServiceImpl implements ICellTreedotViewService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTreedotViewServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreedotViewMapper cellTreedotViewMapper;

	public MxCellTreedotViewServiceImpl() {

	}

	public int count(CellTreedotViewQuery query) {
		query.ensureInitialized();
		return cellTreedotViewMapper
				.getCellTreedotViewCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreedotViewMapper.deleteCellTreedotViewById(id);
	}

	public CellTreedotView getCellTreedotView(String id) {
		CellTreedotView cellTreedotView = cellTreedotViewMapper
				.getCellTreedotViewById(id);
		return cellTreedotView;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotViewCount(Map<String, Object> parameter) {
		return cellTreedotViewMapper.getCellTreedotViewCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotViewCountByQueryCriteria(CellTreedotViewQuery query) {
		return cellTreedotViewMapper
				.getCellTreedotViewCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTreedotView> getCellTreedotViews(
			Map<String, Object> parameter) {
		return cellTreedotViewMapper.getCellTreedotViews(parameter);
	}

	public List<CellTreedotView> getCellTreedotViews(int indexId) {
		CellTreedotViewQuery query = new CellTreedotViewQuery();
		query.indexId(indexId);
		return this.list(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTreedotView> getCellTreedotViewsByQueryCriteria(int start,
			int pageSize, CellTreedotViewQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreedotView> rows = sqlSession.selectList(
				"getCellTreedotViewsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreedotView> list(CellTreedotViewQuery query) {
		query.ensureInitialized();
		List<CellTreedotView> list = cellTreedotViewMapper
				.getCellTreedotViewsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreedotView cellTreedotView) {
		if (StringUtils.isEmpty(cellTreedotView.getId())) {
			cellTreedotView.setId(idGenerator.getNextId());
			// cellTreedotView.setId(idGenerator.getNextId());
			// cellTreedotView.setCreateDate(new Date());
			cellTreedotViewMapper.insertCellTreedotView(cellTreedotView);
		} else {
			CellTreedotView model = this.getCellTreedotView(cellTreedotView
					.getId());
			if (model != null) {
				if (cellTreedotView.getTablename() != null) {
					model.setTablename(cellTreedotView.getTablename());
				}
				if (cellTreedotView.getTablenameS() != null) {
					model.setTablenameS(cellTreedotView.getTablenameS());
				}
				if (cellTreedotView.getAlldname() != null) {
					model.setAlldname(cellTreedotView.getAlldname());
				}
				if (cellTreedotView.getAllfname() != null) {
					model.setAllfname(cellTreedotView.getAllfname());
				}
				model.setIndexId(cellTreedotView.getIndexId());
				model.setListno(cellTreedotView.getListno());
				model.setIntrad(cellTreedotView.getIntrad());
				model.setIntwbslevel(cellTreedotView.getIntwbslevel());
				cellTreedotViewMapper.updateCellTreedotView(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellTreedotViewMapper(
			CellTreedotViewMapper cellTreedotViewMapper) {
		this.cellTreedotViewMapper = cellTreedotViewMapper;
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
