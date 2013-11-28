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
import com.glaf.isdp.domain.CellMyTaskMain;
import com.glaf.isdp.mapper.CellMyTaskMainMapper;
import com.glaf.isdp.query.CellMyTaskMainQuery;
import com.glaf.isdp.service.ICellMyTaskMainService;

@Service("cellMyTaskMainService")
@Transactional(readOnly = true)
public class MxCellMyTaskMainServiceImpl implements ICellMyTaskMainService {
	protected static final Log logger = LogFactory
			.getLog(MxCellMyTaskMainServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellMyTaskMainMapper cellMyTaskMainMapper;

	public MxCellMyTaskMainServiceImpl() {

	}

	public int count(CellMyTaskMainQuery query) {
		query.ensureInitialized();
		return cellMyTaskMainMapper
				.getCellMyTaskMainCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellMyTaskMainMapper.deleteCellMyTaskMainById(id);
	}

	public CellMyTaskMain getCellMyTaskMain(String id) {
		CellMyTaskMain cellMyTaskMain = cellMyTaskMainMapper
				.getCellMyTaskMainById(id);
		return cellMyTaskMain;
	}

	public CellMyTaskMain getCellMyTaskMainByFlowActId(String id) {
		CellMyTaskMain model = null;
		List<CellMyTaskMain> rows = cellMyTaskMainMapper
				.getCellMyTaskMainByFlowActId(id);
		if (rows != null && !rows.isEmpty()) {
			model = rows.get(0);
		}
		return model;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMyTaskMainCount(Map<String, Object> parameter) {
		return cellMyTaskMainMapper.getCellMyTaskMainCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMyTaskMainCountByQueryCriteria(CellMyTaskMainQuery query) {
		return cellMyTaskMainMapper
				.getCellMyTaskMainCountByQueryCriteria(query);
	}
	
	public int getCellMyTaskMainIndexIdByFlowActId(String actId){
		return cellMyTaskMainMapper.getCellMyTaskMainIndexIdByFlowActId(actId);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellMyTaskMain> getCellMyTaskMains(Map<String, Object> parameter) {
		return cellMyTaskMainMapper.getCellMyTaskMains(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellMyTaskMain> getCellMyTaskMainsByQueryCriteria(int start,
			int pageSize, CellMyTaskMainQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellMyTaskMain> rows = sqlSession.selectList(
				"getCellMyTaskMainsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellMyTaskMain> list(CellMyTaskMainQuery query) {
		query.ensureInitialized();
		List<CellMyTaskMain> list = cellMyTaskMainMapper
				.getCellMyTaskMainsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellMyTaskMain cellMyTaskMain) {
		if (StringUtils.isEmpty(cellMyTaskMain.getId())) {
			cellMyTaskMain.setId(idGenerator.getNextId());
			// cellMyTaskMain.setId(idGenerator.getNextId());
			// cellMyTaskMain.setCreateDate(new Date());
			cellMyTaskMainMapper.insertCellMyTaskMain(cellMyTaskMain);
		} else {
			CellMyTaskMain model = this.getCellMyTaskMain(cellMyTaskMain
					.getId());
			if (model != null) {
				if (cellMyTaskMain.getCtime() != null) {
					model.setCtime(cellMyTaskMain.getCtime());
				}
				model.setIndexId(cellMyTaskMain.getIndexId());
				if (cellMyTaskMain.getTaskId() != null) {
					model.setTaskId(cellMyTaskMain.getTaskId());
				}
				if (cellMyTaskMain.getName() != null) {
					model.setName(cellMyTaskMain.getName());
				}
				if (cellMyTaskMain.getProjname() != null) {
					model.setProjname(cellMyTaskMain.getProjname());
				}
				model.setListno(cellMyTaskMain.getListno());
				model.setTypeIndexId(cellMyTaskMain.getTypeIndexId());
				model.setFlagint(cellMyTaskMain.getFlagint());
				if (cellMyTaskMain.getMycellTasksId() != null) {
					model.setMycellTasksId(cellMyTaskMain.getMycellTasksId());
				}
				if (cellMyTaskMain.getFromtasksid() != null) {
					model.setFromtasksid(cellMyTaskMain.getFromtasksid());
				}
				if (cellMyTaskMain.getTotaskid() != null) {
					model.setTotaskid(cellMyTaskMain.getTotaskid());
				}
				model.setIntfinish(cellMyTaskMain.getIntfinish());
				model.setFileContent(cellMyTaskMain.getFileContent());
				if (cellMyTaskMain.getTypeTablename() != null) {
					model.setTypeTablename(cellMyTaskMain.getTypeTablename());
				}
				if (cellMyTaskMain.getTypeId() != null) {
					model.setTypeId(cellMyTaskMain.getTypeId());
				}
				if (cellMyTaskMain.getUserid() != null) {
					model.setUserid(cellMyTaskMain.getUserid());
				}
				if (cellMyTaskMain.getNetroleid() != null) {
					model.setNetroleid(cellMyTaskMain.getNetroleid());
				}
				model.setIntisflow(cellMyTaskMain.getIntisflow());
				model.setIntStop(cellMyTaskMain.getIntStop());
				model.setFiletypeIndex(cellMyTaskMain.getFiletypeIndex());
				cellMyTaskMainMapper.updateCellMyTaskMain(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellMyTaskMainMapper(
			CellMyTaskMainMapper cellMyTaskMainMapper) {
		this.cellMyTaskMainMapper = cellMyTaskMainMapper;
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
