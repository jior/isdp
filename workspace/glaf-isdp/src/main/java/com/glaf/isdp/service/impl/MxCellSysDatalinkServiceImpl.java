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

@Service("cellSysDatalinkService")
@Transactional(readOnly = true)
public class MxCellSysDatalinkServiceImpl implements ICellSysDatalinkService {
	protected static final Log logger = LogFactory
			.getLog(MxCellSysDatalinkServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellSysDatalinkMapper cellSysDatalinkMapper;

	public MxCellSysDatalinkServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		cellSysDatalinkMapper.deleteCellSysDatalinkById(id);
	}

	public int count(CellSysDatalinkQuery query) {
		query.ensureInitialized();
		return cellSysDatalinkMapper
				.getCellSysDatalinkCountByQueryCriteria(query);
	}

	public List<CellSysDatalink> list(CellSysDatalinkQuery query) {
		query.ensureInitialized();
		List<CellSysDatalink> list = cellSysDatalinkMapper
				.getCellSysDatalinksByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellSysDatalinkCount(Map<String, Object> parameter) {
		return cellSysDatalinkMapper.getCellSysDatalinkCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellSysDatalinkCountByQueryCriteria(CellSysDatalinkQuery query) {
		return cellSysDatalinkMapper
				.getCellSysDatalinkCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellSysDatalink> getCellSysDatalinksByQueryCriteria(int start,
			int pageSize, CellSysDatalinkQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellSysDatalink> rows = sqlSession.selectList(
				"getCellSysDatalinksByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellSysDatalink> getCellSysDatalinks(
			Map<String, Object> parameter) {
		return cellSysDatalinkMapper.getCellSysDatalinks(parameter);
	}

	public CellSysDatalink getCellSysDatalink(String id) {
		CellSysDatalink cellSysDatalink = cellSysDatalinkMapper
				.getCellSysDatalinkById(id);
		return cellSysDatalink;
	}

	@Transactional
	public void save(CellSysDatalink cellSysDatalink) {
		if (StringUtils.isEmpty(cellSysDatalink.getId())) {
			cellSysDatalink.setId(idGenerator.getNextId());
			// cellSysDatalink.setId(idGenerator.getNextId());
			// cellSysDatalink.setCreateDate(new Date());
			cellSysDatalinkMapper.insertCellSysDatalink(cellSysDatalink);
		} else {
			CellSysDatalink model = this.getCellSysDatalink(cellSysDatalink
					.getId());
			if (model != null) {
				if (cellSysDatalink.getBusiessIdSrc() != null) {
					model.setBusiessIdSrc(cellSysDatalink.getBusiessIdSrc());
				}
				model.setCelldotIndexSrc(cellSysDatalink.getCelldotIndexSrc());
				if (cellSysDatalink.getFileidSrc() != null) {
					model.setFileidSrc(cellSysDatalink.getFileidSrc());
				}
				if (cellSysDatalink.getDotnameSrc() != null) {
					model.setDotnameSrc(cellSysDatalink.getDotnameSrc());
				}
				if (cellSysDatalink.getBusiessIdDes() != null) {
					model.setBusiessIdDes(cellSysDatalink.getBusiessIdDes());
				}
				if (cellSysDatalink.getBuiessnameDes() != null) {
					model.setBuiessnameDes(cellSysDatalink.getBuiessnameDes());
				}
				model.setCelldotIndexDes(cellSysDatalink.getCelldotIndexDes());
				if (cellSysDatalink.getFileidDes() != null) {
					model.setFileidDes(cellSysDatalink.getFileidDes());
				}
				if (cellSysDatalink.getDotnameDes() != null) {
					model.setDotnameDes(cellSysDatalink.getDotnameDes());
				}
				model.setIntlinktype(cellSysDatalink.getIntlinktype());
				model.setIntdiff1(cellSysDatalink.getIntdiff1());
				model.setIntdiff2(cellSysDatalink.getIntdiff2());
				cellSysDatalinkMapper.updateCellSysDatalink(model);
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
	public void setCellSysDatalinkMapper(
			CellSysDatalinkMapper cellSysDatalinkMapper) {
		this.cellSysDatalinkMapper = cellSysDatalinkMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
