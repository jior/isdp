package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.CellTreedotDot;
import com.glaf.isdp.mapper.CellTreedotDotMapper;
import com.glaf.isdp.query.CellTreedotDotQuery;
import com.glaf.isdp.service.ICellTreedotDotService;

@Service("cellTreedotDotService")
@Transactional(readOnly = true)
public class MxCellTreedotDotServiceImpl implements ICellTreedotDotService {
	protected static final Log logger = LogFactory
			.getLog(MxCellTreedotDotServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellTreedotDotMapper cellTreedotDotMapper;

	public MxCellTreedotDotServiceImpl() {

	}

	public int count(CellTreedotDotQuery query) {
		query.ensureInitialized();
		return cellTreedotDotMapper
				.getCellTreedotDotCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellTreedotDotMapper.deleteCellTreedotDotById(id);
	}

	public CellTreedotDot getCellTreedotDot(String id) {
		CellTreedotDot cellTreedotDot = cellTreedotDotMapper
				.getCellTreedotDotById(id);
		return cellTreedotDot;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotDotCount(Map<String, Object> parameter) {
		return cellTreedotDotMapper.getCellTreedotDotCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellTreedotDotCountByQueryCriteria(CellTreedotDotQuery query) {
		return cellTreedotDotMapper
				.getCellTreedotDotCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellTreedotDot> getCellTreedotDots(Map<String, Object> parameter) {
		return cellTreedotDotMapper.getCellTreedotDots(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellTreedotDot> getCellTreedotDotsByQueryCriteria(int start,
			int pageSize, CellTreedotDotQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellTreedotDot> rows = sqlSession.selectList(
				"getCellTreedotDotsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellTreedotDot> list(CellTreedotDotQuery query) {
		query.ensureInitialized();
		List<CellTreedotDot> list = cellTreedotDotMapper
				.getCellTreedotDotsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellTreedotDot cellTreedotDot) {
		if (StringUtils.isEmpty(cellTreedotDot.getId())) {
			cellTreedotDot.setId(idGenerator.getNextId());
			// cellTreedotDot.setId(idGenerator.getNextId());
			// cellTreedotDot.setCreateDate(new Date());
			cellTreedotDotMapper.insertCellTreedotDot(cellTreedotDot);
		} else {
			CellTreedotDot model = this.getCellTreedotDot(cellTreedotDot
					.getId());
			if (model != null) {
				model.setIndexId(cellTreedotDot.getIndexId());
				if (cellTreedotDot.getFiledotFileid() != null) {
					model.setFiledotFileid(cellTreedotDot.getFiledotFileid());
				}
				model.setListno(cellTreedotDot.getListno());
				cellTreedotDotMapper.updateCellTreedotDot(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellTreedotDotMapper(
			CellTreedotDotMapper cellTreedotDotMapper) {
		this.cellTreedotDotMapper = cellTreedotDotMapper;
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
