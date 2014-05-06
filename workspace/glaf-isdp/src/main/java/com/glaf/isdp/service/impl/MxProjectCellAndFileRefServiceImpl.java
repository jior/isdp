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
import com.glaf.isdp.domain.ProjectCellAndFileRef;
import com.glaf.isdp.mapper.ProjectCellAndFileRefMapper;
import com.glaf.isdp.query.ProjectCellAndFileRefQuery;
import com.glaf.isdp.service.IProjectCellAndFileRefService;

@Service("projectCellAndFileRefService")
@Transactional(readOnly = true)
public class MxProjectCellAndFileRefServiceImpl implements
		IProjectCellAndFileRefService {
	protected static final Log logger = LogFactory
			.getLog(MxProjectCellAndFileRefServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ProjectCellAndFileRefMapper projectCellAndFileRefMapper;

	public MxProjectCellAndFileRefServiceImpl() {

	}

	public int count(ProjectCellAndFileRefQuery query) {
		query.ensureInitialized();
		return projectCellAndFileRefMapper
				.getProjectCellAndFileRefCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		projectCellAndFileRefMapper.deleteProjectCellAndFileRefById(id);
	}

	public ProjectCellAndFileRef getProjectCellAndFileRef(String id) {
		ProjectCellAndFileRef projectCellAndFileRef = projectCellAndFileRefMapper
				.getProjectCellAndFileRefById(id);
		return projectCellAndFileRef;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectCellAndFileRefCount(Map<String, Object> parameter) {
		return projectCellAndFileRefMapper
				.getProjectCellAndFileRefCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectCellAndFileRefCountByQueryCriteria(
			ProjectCellAndFileRefQuery query) {
		return projectCellAndFileRefMapper
				.getProjectCellAndFileRefCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectCellAndFileRef> getProjectCellAndFileRefs(
			Map<String, Object> parameter) {
		return projectCellAndFileRefMapper
				.getProjectCellAndFileRefs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectCellAndFileRef> getProjectCellAndFileRefsByQueryCriteria(
			int start, int pageSize, ProjectCellAndFileRefQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectCellAndFileRef> rows = sqlSession.selectList(
				"getProjectCellAndFileRefsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<ProjectCellAndFileRef> list(ProjectCellAndFileRefQuery query) {
		query.ensureInitialized();
		List<ProjectCellAndFileRef> list = projectCellAndFileRefMapper
				.getProjectCellAndFileRefsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(ProjectCellAndFileRef projectCellAndFileRef) {
		if (StringUtils.isEmpty(projectCellAndFileRef.getId())) {
			projectCellAndFileRef.setId(idGenerator.getNextId());
			// projectCellAndFileRef.setId(idGenerator.getNextId());
			// projectCellAndFileRef.setCreateDate(new Date());
			projectCellAndFileRefMapper
					.insertProjectCellAndFileRef(projectCellAndFileRef);
		} else {
			ProjectCellAndFileRef model = this
					.getProjectCellAndFileRef(projectCellAndFileRef.getId());
			if (model != null) {
				if (projectCellAndFileRef.getPfileid() != null) {
					model.setPfileid(projectCellAndFileRef.getPfileid());
				}
				if (projectCellAndFileRef.getCellid() != null) {
					model.setCellid(projectCellAndFileRef.getCellid());
				}
				projectCellAndFileRefMapper
						.updateProjectCellAndFileRef(model);
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
	public void setProjectCellAndFileRefMapper(
			ProjectCellAndFileRefMapper projectCellAndFileRefMapper) {
		this.projectCellAndFileRefMapper = projectCellAndFileRefMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
