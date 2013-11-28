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
import com.glaf.isdp.domain.CellDataField;
import com.glaf.isdp.mapper.CellDataFieldMapper;
import com.glaf.isdp.query.CellDataFieldQuery;
import com.glaf.isdp.service.ICellDataFieldService;

@Service("cellDataFieldService")
@Transactional(readOnly = true)
public class MxCellDataFieldServiceImpl implements ICellDataFieldService {
	protected static final Log logger = LogFactory
			.getLog(MxCellDataFieldServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellDataFieldMapper cellDataFieldMapper;

	public MxCellDataFieldServiceImpl() {

	}

	public int count(CellDataFieldQuery query) {
		query.ensureInitialized();
		return cellDataFieldMapper
				.getCellDataFieldCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellDataFieldMapper.deleteCellDataFieldById(id);
	}

	public CellDataField getCellDataField(String id) {
		CellDataField cellDataField = cellDataFieldMapper
				.getCellDataFieldById(id);
		return cellDataField;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataFieldCount(Map<String, Object> parameter) {
		return cellDataFieldMapper.getCellDataFieldCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellDataFieldCountByQueryCriteria(CellDataFieldQuery query) {
		return cellDataFieldMapper
				.getCellDataFieldCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellDataField> getCellDataFields(Map<String, Object> parameter) {
		return cellDataFieldMapper.getCellDataFields(parameter);
	}

	/**
	 * 根据表ID获取字段信息
	 * 
	 * @param tableId
	 * @return
	 */
	public List<CellDataField> getCellDataFieldsByTableId(String tableId) {
		return cellDataFieldMapper.getCellDataFieldsByTableId(tableId);
	}

	/**
	 * 根据表单文件编号获取字段信息
	 * 
	 * @param filedotId
	 * @return
	 */
	public List<CellDataField> getCellDataFieldsByFiledotId(String filedotId) {
		return cellDataFieldMapper.getCellDataFieldsByFiledotId(filedotId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<CellDataField> getCellDataFieldsByQueryCriteria(int start,
			int pageSize, CellDataFieldQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellDataField> rows = sqlSession.selectList(
				"getCellDataFieldsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellDataField> list(CellDataFieldQuery query) {
		query.ensureInitialized();
		List<CellDataField> list = cellDataFieldMapper
				.getCellDataFieldsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellDataField cellDataField) {
		if (StringUtils.isEmpty(cellDataField.getId())) {
			cellDataField.setId(idGenerator.getNextId());
			// cellDataField.setId(idGenerator.getNextId());
			// cellDataField.setCreateDate(new Date());
			cellDataFieldMapper.insertCellDataField(cellDataField);
		} else {
			CellDataField model = this.getCellDataField(cellDataField.getId());
			if (model != null) {
				if (cellDataField.getTableid() != null) {
					model.setTableid(cellDataField.getTableid());
				}
				if (cellDataField.getFieldname() != null) {
					model.setFieldname(cellDataField.getFieldname());
				}
				if (cellDataField.getUserid() != null) {
					model.setUserid(cellDataField.getUserid());
				}
				model.setMaxuser(cellDataField.getMaxuser());
				model.setMaxsys(cellDataField.getMaxsys());
				if (cellDataField.getCtime() != null) {
					model.setCtime(cellDataField.getCtime());
				}
				if (cellDataField.getSysnum() != null) {
					model.setSysnum(cellDataField.getSysnum());
				}
				if (cellDataField.getTablename() != null) {
					model.setTablename(cellDataField.getTablename());
				}
				if (cellDataField.getDname() != null) {
					model.setDname(cellDataField.getDname());
				}
				if (cellDataField.getUserindex() != null) {
					model.setUserindex(cellDataField.getUserindex());
				}
				if (cellDataField.getTreetablenameB() != null) {
					model.setTreetablenameB(cellDataField.getTreetablenameB());
				}
				cellDataFieldMapper.updateCellDataField(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellDataFieldMapper(
			CellDataFieldMapper cellDataFieldMapper) {
		this.cellDataFieldMapper = cellDataFieldMapper;
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
