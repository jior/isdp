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
import com.glaf.isdp.domain.CellTreedotPer;
import com.glaf.isdp.mapper.CellTreedotPerMapper;
import com.glaf.isdp.query.CellTreedotPerQuery;
import com.glaf.isdp.service.ICellTreedotPerService;

@Service("cellTreedotPerService")
@Transactional(readOnly = true)
public class MxCellTreedotPerServiceImpl implements ICellTreedotPerService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTreedotPerServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreedotPerMapper cellTreedotPerMapper;

	public MxCellTreedotPerServiceImpl() {

	}

	public int count(CellTreedotPerQuery query) {
		query.ensureInitialized();
		return cellTreedotPerMapper
				.getCellTreedotPerCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreedotPerMapper.deleteCellTreedotPerById(id);
	}

	public CellTreedotPer getCellTreedotPer(String id) {
		CellTreedotPer cellTreedotPer = cellTreedotPerMapper
				.getCellTreedotPerById(id);
		return cellTreedotPer;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotPerCount(Map<String, Object> parameter) {
		return cellTreedotPerMapper.getCellTreedotPerCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotPerCountByQueryCriteria(CellTreedotPerQuery query) {
		return cellTreedotPerMapper
				.getCellTreedotPerCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTreedotPer> getCellTreedotPers(Map<String, Object> parameter) {
		return cellTreedotPerMapper.getCellTreedotPers(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTreedotPer> getCellTreedotPersByQueryCriteria(int start,
			int pageSize, CellTreedotPerQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreedotPer> rows = sqlSession.selectList(
				"getCellTreedotPersByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreedotPer> list(CellTreedotPerQuery query) {
		query.ensureInitialized();
		List<CellTreedotPer> list = cellTreedotPerMapper
				.getCellTreedotPersByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreedotPer cellTreedotPer) {
		if (StringUtils.isEmpty(cellTreedotPer.getId())) {
			cellTreedotPer.setId(idGenerator.getNextId());
			// cellTreedotPer.setId(idGenerator.getNextId());
			// cellTreedotPer.setCreateDate(new Date());
			cellTreedotPerMapper.insertCellTreedotPer(cellTreedotPer);
		} else {
			CellTreedotPer model = this.getCellTreedotPer(cellTreedotPer
					.getId());
			if (model != null) {
				model.setIndexId(cellTreedotPer.getIndexId());
				if (cellTreedotPer.getIndexName() != null) {
					model.setIndexName(cellTreedotPer.getIndexName());
				}
				model.setNlevel(cellTreedotPer.getNlevel());
				model.setNodeico(cellTreedotPer.getNodeico());
				if (cellTreedotPer.getFromid() != null) {
					model.setFromid(cellTreedotPer.getFromid());
				}
				model.setListno(cellTreedotPer.getListno());
				model.setIntuserper(cellTreedotPer.getIntuserper());
				model.setMenuIndex(cellTreedotPer.getMenuIndex());
				cellTreedotPerMapper.updateCellTreedotPer(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellTreedotPerMapper(
			CellTreedotPerMapper cellTreedotPerMapper) {
		this.cellTreedotPerMapper = cellTreedotPerMapper;
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
