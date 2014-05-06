package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.config.Environment;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.core.util.DBUtils;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("cellUpicInfoService")
@Transactional(readOnly = true)
public class MxCellUpicInfoServiceImpl implements ICellUpicInfoService {
	protected static final Log logger = LogFactory
			.getLog(MxCellUpicInfoServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellUpicInfoMapper cellUpicInfoMapper;

	public MxCellUpicInfoServiceImpl() {

	}

	public int count(CellUpicInfoQuery query) {
		query.ensureInitialized();
		return cellUpicInfoMapper
				.getCellUpicInfoCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellUpicInfoMapper.deleteCellUpicInfoById(id);
	}

	@Transactional
	public void deleteByIds(List<String> rowIds) {
		if (rowIds != null && !rowIds.isEmpty()) {
			for (String rowId : rowIds) {
				cellUpicInfoMapper.deleteCellUpicInfoById(rowId);
			}
		}
	}

	public IsdpDataFile getCellDataFileById(String id) {
		IsdpDataFile file = null;
		if (StringUtils
				.equals(DBUtils.POSTGRESQL, Environment.getCurrentDatabaseType())) {
			file = cellUpicInfoMapper.getCellDataFileById_postgres(id);
		} else {
			file = cellUpicInfoMapper.getCellDataFileById(id);
		}
		return file;
	}

	public CellUpicInfo getCellUpicInfo(String id) {
		CellUpicInfo cellUpicInfo = cellUpicInfoMapper
				.getCellUpicInfoById(id);
		return cellUpicInfo;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellUpicInfoCount(Map<String, Object> parameter) {
		return cellUpicInfoMapper.getCellUpicInfoCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellUpicInfoCountByQueryCriteria(CellUpicInfoQuery query) {
		return cellUpicInfoMapper
				.getCellUpicInfoCountByQueryCriteria(query);
	}

	public List<CellUpicInfo> getCellUpicInfos(int treeFolderIndexId) {
		CellUpicInfoQuery query = new CellUpicInfoQuery();
		query.indexId(treeFolderIndexId);
		return this.list(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellUpicInfo> getCellUpicInfos(Map<String, Object> parameter) {
		return cellUpicInfoMapper.getCellUpicInfos(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellUpicInfo> getCellUpicInfosByQueryCriteria(int start,
			int pageSize, CellUpicInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellUpicInfo> rows = sqlSession.selectList(
				"getCellUpicInfosByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellUpicInfo> list(CellUpicInfoQuery query) {
		query.ensureInitialized();
		List<CellUpicInfo> list = cellUpicInfoMapper
				.getCellUpicInfosByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellUpicInfo cellUpicInfo) {
		if (StringUtils.isEmpty(cellUpicInfo.getId())) {
			cellUpicInfo.setId(idGenerator.getNextId());
			// cellUpicInfo.setId(idGenerator.getNextId());
			// cellUpicInfo.setCreateDate(new Date());
			cellUpicInfoMapper.insertCellUpicInfo(cellUpicInfo);
		} else {
			CellUpicInfo model = this.getCellUpicInfo(cellUpicInfo.getId());
			if (model != null) {
				if (cellUpicInfo.getTopid() != null) {
					model.setTopid(cellUpicInfo.getTopid());
				}
				model.setIndexId(cellUpicInfo.getIndexId());
				if (cellUpicInfo.getTaskId() != null) {
					model.setTaskId(cellUpicInfo.getTaskId());
				}
				model.setPfileflag(cellUpicInfo.getPfileflag());
				if (cellUpicInfo.getFiledotFileid() != null) {
					model.setFiledotFileid(cellUpicInfo.getFiledotFileid());
				}
				model.setListno(cellUpicInfo.getListno());
				model.setChktotal(cellUpicInfo.getChktotal());
				model.setChkresult(cellUpicInfo.getChkresult());
				if (cellUpicInfo.getPfileId() != null) {
					model.setPfileId(cellUpicInfo.getPfileId());
				}
				if (cellUpicInfo.getUserid() != null) {
					model.setUserid(cellUpicInfo.getUserid());
				}
				model.setRefillflag(cellUpicInfo.getRefillflag());
				model.setGroupid(cellUpicInfo.getGroupid());
				if (cellUpicInfo.getOldId() != null) {
					model.setOldId(cellUpicInfo.getOldId());
				}
				model.setRoleId(cellUpicInfo.getRoleId());
				model.setIsfinish(cellUpicInfo.getIsfinish());
				if (cellUpicInfo.getTagnum() != null) {
					model.setTagnum(cellUpicInfo.getTagnum());
				}
				if (cellUpicInfo.getCtime() != null) {
					model.setCtime(cellUpicInfo.getCtime());
				}
				if (cellUpicInfo.getTname() != null) {
					model.setTname(cellUpicInfo.getTname());
				}
				model.setPage(cellUpicInfo.getPage());
				if (cellUpicInfo.getDuty() != null) {
					model.setDuty(cellUpicInfo.getDuty());
				}
				if (cellUpicInfo.getThematic() != null) {
					model.setThematic(cellUpicInfo.getThematic());
				}
				if (cellUpicInfo.getAnnotations() != null) {
					model.setAnnotations(cellUpicInfo.getAnnotations());
				}
				model.setTypeIndexId(cellUpicInfo.getTypeIndexId());
				if (cellUpicInfo.getTypeId() != null) {
					model.setTypeId(cellUpicInfo.getTypeId());
				}
				cellUpicInfoMapper.updateCellUpicInfo(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellUpicInfoMapper(
			CellUpicInfoMapper cellUpicInfoMapper) {
		this.cellUpicInfoMapper = cellUpicInfoMapper;
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
