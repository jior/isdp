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
import com.glaf.isdp.domain.CellDottofile;
import com.glaf.isdp.mapper.CellDottofileMapper;
import com.glaf.isdp.query.CellDottofileQuery;
import com.glaf.isdp.service.ICellDottofileService;

@Service("cellDottofileService")
@Transactional(readOnly = true)
public class MxCellDottofileServiceImpl implements ICellDottofileService {
	protected static final Log logger = LogFactory
			.getLog(MxCellDottofileServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellDottofileMapper cellDottofileMapper;

	public MxCellDottofileServiceImpl() {

	}

	public int count(CellDottofileQuery query) {
		query.ensureInitialized();
		return cellDottofileMapper
				.getCellDottofileCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellDottofileMapper.deleteCellDottofileById(id);
	}

	public CellDottofile getCellDottofile(String id) {
		CellDottofile cellDottofile = cellDottofileMapper
				.getCellDottofileById(id);
		return cellDottofile;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDottofileCount(Map<String, Object> parameter) {
		return cellDottofileMapper.getCellDottofileCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDottofileCountByQueryCriteria(CellDottofileQuery query) {
		return cellDottofileMapper
				.getCellDottofileCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellDottofile> getCellDottofiles(Map<String, Object> parameter) {
		return cellDottofileMapper.getCellDottofiles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<CellDottofile> getCellDottofilesByQueryCriteria(int start,
			int pageSize, CellDottofileQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellDottofile> rows = sqlSession.selectList(
				"getCellDottofilesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellDottofile> list(CellDottofileQuery query) {
		query.ensureInitialized();
		List<CellDottofile> list = cellDottofileMapper
				.getCellDottofilesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellDottofile cellDottofile) {
		if (StringUtils.isEmpty(cellDottofile.getId())) {
			cellDottofile.setId(idGenerator.getNextId());
			// cellDottofile.setId(idGenerator.getNextId());
			// cellDottofile.setCreateDate(new Date());
			cellDottofileMapper.insertCellDottofile(cellDottofile);
		} else {
			CellDottofile model = this.getCellDottofile(cellDottofile.getId());
			if (model != null) {
				model.setTreetopIndexid(cellDottofile.getTreetopIndexid());
				if (cellDottofile.getNum() != null) {
					model.setNum(cellDottofile.getNum());
				}
				if (cellDottofile.getName() != null) {
					model.setName(cellDottofile.getName());
				}
				model.setListno(cellDottofile.getListno());
				cellDottofileMapper.updateCellDottofile(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellDottofileMapper(
			CellDottofileMapper cellDottofileMapper) {
		this.cellDottofileMapper = cellDottofileMapper;
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
