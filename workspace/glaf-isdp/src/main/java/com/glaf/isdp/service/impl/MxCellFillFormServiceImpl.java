package com.glaf.isdp.service.impl;

import java.util.HashMap;
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
import com.glaf.core.util.Paging;
import com.glaf.isdp.domain.CellDataTable;
import com.glaf.isdp.domain.IsdpCellFillForm;
import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.mapper.IsdpCellFillFormMapper;
import com.glaf.isdp.query.CellFillFormQuery;
import com.glaf.isdp.service.ICellDataTableService;
import com.glaf.isdp.service.IsdpCellFillFormService;
import com.glaf.isdp.service.ICellRepInfoService;

@Service("cellFillformService")
@Transactional(readOnly = true)
public class MxCellFillFormServiceImpl implements IsdpCellFillFormService {
	protected static final Log logger = LogFactory
			.getLog(MxCellFillFormServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpCellFillFormMapper isdpCellFillFormMapper;

	protected ICellDataTableService cellDataTableService;

	protected ICellRepInfoService cellRepInfoService;

	public MxCellFillFormServiceImpl() {

	}

	public int count(CellFillFormQuery query) {
		query.ensureInitialized();
		return isdpCellFillFormMapper
				.getCellFillFormCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpCellFillFormMapper.deleteCellFillFormById(id);
	}

	public IsdpCellFillForm getCellFillForm(String id) {
		IsdpCellFillForm cellFillform = isdpCellFillFormMapper
				.getCellFillFormById(id);
		return cellFillform;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellFillFormCount(Map<String, Object> parameter) {
		return isdpCellFillFormMapper.getCellFillFormCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellFillFormCountByQueryCriteria(CellFillFormQuery query) {
		return isdpCellFillFormMapper
				.getCellFillFormCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpCellFillForm> getCellFillForms(Map<String, Object> parameter) {
		return isdpCellFillFormMapper.getCellFillForms(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpCellFillForm> getCellFillFormsByQueryCriteria(int start,
			int pageSize, CellFillFormQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpCellFillForm> rows = sqlSession.selectList(
				"getCellFillFormsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public IsdpCellFillForm getCellFillFormWithAll(String id) {
		IsdpCellFillForm cellFillform = isdpCellFillFormMapper
				.getCellFillFormById(id);
		if (cellFillform != null && cellFillform.getFiledotFileid() != null) {
			List<CellDataTable> dataTables = cellDataTableService
					.getCellDataTablesByFiledotId(cellFillform
							.getFiledotFileid());
			cellFillform.setDataTables(dataTables);

			List<CellRepInfo> repInfos = cellRepInfoService
					.getCellRepInfosByFiledotId(cellFillform.getFiledotFileid());
			cellFillform.setRepInfos(repInfos);
		}
		return cellFillform;
	}

	public int getFileCellFillFormCount(String idLike, int indexId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		if (idLike != null && !idLike.endsWith("%")) {
			idLike = idLike + "%";
		}
		parameter.put("idLike", idLike);
		parameter.put("indexId", indexId);
		return isdpCellFillFormMapper.getFileCellFillFormCount(parameter);
	}

	public List<IsdpCellFillForm> getFileCellFillFormList(String idLike, int indexId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		if (idLike != null && !idLike.endsWith("%")) {
			idLike = idLike + "%";
		}
		parameter.put("idLike", idLike);
		parameter.put("indexId", indexId);
		return isdpCellFillFormMapper.getFileCellFillFormList(parameter);
	}

	/**
	 * 获取一页表单填写记录
	 * 
	 * @param pageNo
	 *            页码,从1开始
	 * @param pageSize
	 * @param idLike
	 * @param indexId
	 * @return
	 */
	public Paging getPageFileCellFillForm(int pageNo, int pageSize,
			String idLike, int indexId) {
		Paging paging = new Paging();
		int total = this.getFileCellFillFormCount(idLike, indexId);
		if (total > 0) {
			Map<String, Object> parameter = new HashMap<String, Object>();
			if (idLike != null && !idLike.endsWith("%")) {
				idLike = idLike + "%";
			}
			parameter.put("idLike", idLike);
			parameter.put("indexId", indexId);
			int begin = (pageNo - 1) * pageSize;
			RowBounds rowBounds = new RowBounds(begin, pageSize);
			List<IsdpCellFillForm> rows = sqlSession.selectList(
					"getFileCellFillFormList", parameter, rowBounds);
			paging.addRows(rows);
			paging.setCurrentPage(pageNo);
		}
		paging.setTotal(total);
		paging.setPageSize(pageSize);

		return paging;
	}

	public List<IsdpCellFillForm> list(CellFillFormQuery query) {
		query.ensureInitialized();
		List<IsdpCellFillForm> list = isdpCellFillFormMapper
				.getCellFillFormsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpCellFillForm cellFillform) {
		if (StringUtils.isEmpty(cellFillform.getId())) {
			cellFillform.setId(idGenerator.getNextId());
			// cellFillform.setId(idGenerator.getNextId());
			// cellFillform.setCreateDate(new Date());
			isdpCellFillFormMapper.insertCellFillForm(cellFillform);
		} else {
			IsdpCellFillForm model = this.getCellFillForm(cellFillform.getId());
			if (model != null) {
				if (cellFillform.getTopid() != null) {
					model.setTopid(cellFillform.getTopid());
				}
				model.setIndexId(cellFillform.getIndexId());
				if (cellFillform.getTaskId() != null) {
					model.setTaskId(cellFillform.getTaskId());
				}
				model.setPfileflag(cellFillform.getPfileflag());
				if (cellFillform.getFiledotFileid() != null) {
					model.setFiledotFileid(cellFillform.getFiledotFileid());
				}
				if (cellFillform.getName() != null) {
					model.setName(cellFillform.getName());
				}
				if (cellFillform.getChknum() != null) {
					model.setChknum(cellFillform.getChknum());
				}
				model.setListno(cellFillform.getListno());
				model.setChktotal(cellFillform.getChktotal());
				model.setChkresult(cellFillform.getChkresult());
				if (cellFillform.getPfileId() != null) {
					model.setPfileId(cellFillform.getPfileId());
				}
				model.setTempsave(cellFillform.getTempsave());
				if (cellFillform.getUserid() != null) {
					model.setUserid(cellFillform.getUserid());
				}
				model.setRefillflag(cellFillform.getRefillflag());
				model.setGroupid(cellFillform.getGroupid());
				if (cellFillform.getOldId() != null) {
					model.setOldId(cellFillform.getOldId());
				}
				model.setRoleId(cellFillform.getRoleId());
				model.setIsfinish(cellFillform.getIsfinish());
				if (cellFillform.getTypeTablename() != null) {
					model.setTypeTablename(cellFillform.getTypeTablename());
				}
				if (cellFillform.getTypeId() != null) {
					model.setTypeId(cellFillform.getTypeId());
				}
				model.setTypeIndexId(cellFillform.getTypeIndexId());
				if (cellFillform.getMainId() != null) {
					model.setMainId(cellFillform.getMainId());
				}
				model.setIntlastpage(cellFillform.getIntlastpage());
				isdpCellFillFormMapper.updateCellFillForm(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellDataTableService(
			ICellDataTableService cellDataTableService) {
		this.cellDataTableService = cellDataTableService;
	}

	@javax.annotation.Resource
	public void setIsdpCellFillFormMapper(
			IsdpCellFillFormMapper isdpCellFillFormMapper) {
		this.isdpCellFillFormMapper = isdpCellFillFormMapper;
	}

	@javax.annotation.Resource
	public void setCellRepInfoService(ICellRepInfoService cellRepInfoService) {
		this.cellRepInfoService = cellRepInfoService;
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
