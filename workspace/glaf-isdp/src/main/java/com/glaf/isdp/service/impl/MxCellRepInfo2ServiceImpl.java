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
import com.glaf.isdp.domain.CellRepInfo2;
import com.glaf.isdp.mapper.CellRepInfo2Mapper;
import com.glaf.isdp.query.CellRepInfo2Query;
import com.glaf.isdp.service.ICellRepInfo2Service;

@Service("cellRepInfo2Service")
@Transactional(readOnly = true)
public class MxCellRepInfo2ServiceImpl implements ICellRepInfo2Service {
	protected static final Log logger = LogFactory
			.getLog(MxCellRepInfo2ServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellRepInfo2Mapper cellRepInfo2Mapper;

	public MxCellRepInfo2ServiceImpl() {

	}

	public int count(CellRepInfo2Query query) {
		query.ensureInitialized();
		return cellRepInfo2Mapper
				.getCellRepInfo2CountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellRepInfo2Mapper.deleteCellRepInfo2ById(id);
	}

	public CellRepInfo2 getCellRepInfo2(String id) {
		CellRepInfo2 cellRepInfo2 = cellRepInfo2Mapper
				.getCellRepInfo2ById(id);
		return cellRepInfo2;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfo2Count(Map<String, Object> parameter) {
		return cellRepInfo2Mapper.getCellRepInfo2Count(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellRepInfo2CountByQueryCriteria(CellRepInfo2Query query) {
		return cellRepInfo2Mapper
				.getCellRepInfo2CountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellRepInfo2> getCellRepInfo2s(Map<String, Object> parameter) {
		return cellRepInfo2Mapper.getCellRepInfo2s(parameter);
	}

	public List<CellRepInfo2> getCellRepInfo2sByFiledotId(String filedotId) {
		CellRepInfo2Query query = new CellRepInfo2Query();
		query.filedotFileid(filedotId);
		return this.list(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellRepInfo2> getCellRepInfo2sByQueryCriteria(int start,
			int pageSize, CellRepInfo2Query query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellRepInfo2> rows = sqlSession.selectList(
				"getCellRepInfo2sByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellRepInfo2> list(CellRepInfo2Query query) {
		query.ensureInitialized();
		List<CellRepInfo2> list = cellRepInfo2Mapper
				.getCellRepInfo2sByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellRepInfo2 cellRepInfo2) {
		if (StringUtils.isEmpty(cellRepInfo2.getId())) {
			cellRepInfo2.setId(idGenerator.getNextId());
			// cellRepInfo2.setId(idGenerator.getNextId());
			// cellRepInfo2.setCreateDate(new Date());
			cellRepInfo2Mapper.insertCellRepInfo2(cellRepInfo2);
		} else {
			CellRepInfo2 model = this.getCellRepInfo2(cellRepInfo2.getId());
			if (model != null) {
				if (cellRepInfo2.getFrmtype() != null) {
					model.setFrmtype(cellRepInfo2.getFrmtype());
				}
				model.setType(cellRepInfo2.getType());
				if (cellRepInfo2.getContent() != null) {
					model.setContent(cellRepInfo2.getContent());
				}
				if (cellRepInfo2.getFormula() != null) {
					model.setFormula(cellRepInfo2.getFormula());
				}
				if (cellRepInfo2.getOstTablename() != null) {
					model.setOstTablename(cellRepInfo2.getOstTablename());
				}
				model.setOstRow(cellRepInfo2.getOstRow());
				model.setOstCol(cellRepInfo2.getOstCol());
				model.setOstRowend(cellRepInfo2.getOstRowend());
				model.setOstColend(cellRepInfo2.getOstColend());
				if (cellRepInfo2.getOstCellid() != null) {
					model.setOstCellid(cellRepInfo2.getOstCellid());
				}
				if (cellRepInfo2.getFiledotFileid() != null) {
					model.setFiledotFileid(cellRepInfo2.getFiledotFileid());
				}
				model.setOstColor(cellRepInfo2.getOstColor());
				model.setOstWay(cellRepInfo2.getOstWay());
				model.setRoleId(cellRepInfo2.getRoleId());
				if (cellRepInfo2.getTablename() != null) {
					model.setTablename(cellRepInfo2.getTablename());
				}
				if (cellRepInfo2.getFname() != null) {
					model.setFname(cellRepInfo2.getFname());
				}
				if (cellRepInfo2.getDname() != null) {
					model.setDname(cellRepInfo2.getDname());
				}
				if (cellRepInfo2.getIssubtable() != null) {
					model.setIssubtable(cellRepInfo2.getIssubtable());
				}
				if (cellRepInfo2.getTablename2() != null) {
					model.setTablename2(cellRepInfo2.getTablename2());
				}
				model.setIntautoinvalue(cellRepInfo2.getIntautoinvalue());
				cellRepInfo2Mapper.updateCellRepInfo2(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellRepInfo2Mapper(
			CellRepInfo2Mapper cellRepInfo2Mapper) {
		this.cellRepInfo2Mapper = cellRepInfo2Mapper;
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
