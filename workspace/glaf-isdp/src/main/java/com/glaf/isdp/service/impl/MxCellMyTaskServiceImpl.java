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
import com.glaf.isdp.domain.CellMyTask;
import com.glaf.isdp.mapper.CellMyTaskMapper;
import com.glaf.isdp.query.CellMyTaskQuery;
import com.glaf.isdp.service.ICellMyTaskService;

@Service("cellMyTaskService")
@Transactional(readOnly = true)
public class MxCellMyTaskServiceImpl implements ICellMyTaskService {
	protected static final Log logger = LogFactory
			.getLog(MxCellMyTaskServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected CellMyTaskMapper cellMyTaskMapper;

	public MxCellMyTaskServiceImpl() {

	}

	public int count(CellMyTaskQuery query) {
		query.ensureInitialized();
		return cellMyTaskMapper.getCellMyTaskCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		cellMyTaskMapper.deleteCellMyTaskById(id);
	}

	public CellMyTask getCellMyTask(String id) {
		CellMyTask cellMyTask = cellMyTaskMapper.getCellMyTaskById(id);
		return cellMyTask;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMyTaskCount(Map<String, Object> parameter) {
		return cellMyTaskMapper.getCellMyTaskCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getCellMyTaskCountByQueryCriteria(CellMyTaskQuery query) {
		return cellMyTaskMapper.getCellMyTaskCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<CellMyTask> getCellMyTasks(Map<String, Object> parameter) {
		return cellMyTaskMapper.getCellMyTasks(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<CellMyTask> getCellMyTasksByQueryCriteria(int start,
			int pageSize, CellMyTaskQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<CellMyTask> rows = sqlSession.selectList(
				"getCellMyTasksByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<CellMyTask> list(CellMyTaskQuery query) {
		query.ensureInitialized();
		List<CellMyTask> list = cellMyTaskMapper
				.getCellMyTasksByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(CellMyTask cellMyTask) {
		if (StringUtils.isEmpty(cellMyTask.getId())) {
			cellMyTask.setId(idGenerator.getNextId());
			// cellMyTask.setId(idGenerator.getNextId());
			// cellMyTask.setCreateDate(new Date());
			cellMyTaskMapper.insertCellMyTask(cellMyTask);
		} else {
			CellMyTask model = this.getCellMyTask(cellMyTask.getId());
			if (model != null) {
				if (cellMyTask.getTopid() != null) {
					model.setTopid(cellMyTask.getTopid());
				}
				if (cellMyTask.getFillformId() != null) {
					model.setFillformId(cellMyTask.getFillformId());
				}
				if (cellMyTask.getCtime() != null) {
					model.setCtime(cellMyTask.getCtime());
				}
				model.setIndexId(cellMyTask.getIndexId());
				if (cellMyTask.getTaskId() != null) {
					model.setTaskId(cellMyTask.getTaskId());
				}
				if (cellMyTask.getFiledotFileid() != null) {
					model.setFiledotFileid(cellMyTask.getFiledotFileid());
				}
				if (cellMyTask.getName() != null) {
					model.setName(cellMyTask.getName());
				}
				if (cellMyTask.getProjname() != null) {
					model.setProjname(cellMyTask.getProjname());
				}
				model.setListno(cellMyTask.getListno());
				model.setTypeIndexId(cellMyTask.getTypeIndexId());
				model.setPage(cellMyTask.getPage());
				model.setFinishint(cellMyTask.getFinishint());
				model.setFormtypeint(cellMyTask.getFormtypeint());
				model.setFlagint(cellMyTask.getFlagint());
				model.setIntinflow(cellMyTask.getIntinflow());
				if (cellMyTask.getMainId() != null) {
					model.setMainId(cellMyTask.getMainId());
				}
				model.setIntlastpage(cellMyTask.getIntlastpage());
				cellMyTaskMapper.updateCellMyTask(model);
			}
		}
	}

	@javax.annotation.Resource
	public void setCellMyTaskMapper(
			CellMyTaskMapper cellMyTaskMapper) {
		this.cellMyTaskMapper = cellMyTaskMapper;
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
