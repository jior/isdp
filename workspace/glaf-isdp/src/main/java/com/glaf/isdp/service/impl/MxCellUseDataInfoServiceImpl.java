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

@Service("cellUseDataInfoService")
@Transactional(readOnly = true)
public class MxCellUseDataInfoServiceImpl implements ICellUseDataInfoService {
	protected static final Log logger = LogFactory
			.getLog(MxCellUseDataInfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellUseDataInfoMapper cellUseDataInfoMapper;

	public MxCellUseDataInfoServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellUseDataInfoMapper.deleteCellUseDataInfoById(id);
	}

	public int count(CellUseDataInfoQuery query) {
		query.ensureInitialized();
		return cellUseDataInfoMapper
				.getCellUseDataInfoCountByQueryCriteria(query);
	}

	public List<CellUseDataInfo> list(CellUseDataInfoQuery query) {
		query.ensureInitialized();
		List<CellUseDataInfo> list = cellUseDataInfoMapper
				.getCellUseDataInfosByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellUseDataInfoCount(Map<String, Object> parameter) {
		return cellUseDataInfoMapper.getCellUseDataInfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellUseDataInfoCountByQueryCriteria(CellUseDataInfoQuery query) {
		return cellUseDataInfoMapper
				.getCellUseDataInfoCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellUseDataInfo> getCellUseDataInfosByQueryCriteria(int start,
			int pageSize, CellUseDataInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellUseDataInfo> rows = sqlSession.selectList(
				"getCellUseDataInfosByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellUseDataInfo> getCellUseDataInfos(
			Map<String, Object> parameter) {
		return cellUseDataInfoMapper.getCellUseDataInfos(parameter);
	}

	public CellUseDataInfo getCellUseDataInfo(String id) {
		CellUseDataInfo cellUseDataInfo = cellUseDataInfoMapper
				.getCellUseDataInfoById(id);
		return cellUseDataInfo;
	}

	@Transactional
	public void save(CellUseDataInfo cellUseDataInfo) {
		if (StringUtils.isEmpty(cellUseDataInfo.getId())) {
			cellUseDataInfo.setId(idGenerator.getNextId());
			// cellUseDataInfo.setId(idGenerator.getNextId());
			// cellUseDataInfo.setCreateDate(new Date());
			cellUseDataInfoMapper.insertCellUseDataInfo(cellUseDataInfo);
		} else {
			CellUseDataInfo model = this.getCellUseDataInfo(cellUseDataInfo
					.getId());
			if (model != null) {
				if (cellUseDataInfo.getTablename() != null) {
					model.setTablename(cellUseDataInfo.getTablename());
				}
				if (cellUseDataInfo.getTableId() != null) {
					model.setTableId(cellUseDataInfo.getTableId());
				}
				model.setOstTablename(cellUseDataInfo.getOstTablename());
				model.setOstRow(cellUseDataInfo.getOstRow());
				model.setOstCol(cellUseDataInfo.getOstCol());
				model.setFlag(cellUseDataInfo.getFlag());
				model.setLevel(cellUseDataInfo.getLevel());
				if (cellUseDataInfo.getUseTablename() != null) {
					model.setUseTablename(cellUseDataInfo.getUseTablename());
				}
				if (cellUseDataInfo.getUseId() != null) {
					model.setUseId(cellUseDataInfo.getUseId());
				}
				model.setUseIndexId(cellUseDataInfo.getUseIndexId());
				cellUseDataInfoMapper.updateCellUseDataInfo(model);
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
	public void setCellUseDataInfoMapper(
			CellUseDataInfoMapper cellUseDataInfoMapper) {
		this.cellUseDataInfoMapper = cellUseDataInfoMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
