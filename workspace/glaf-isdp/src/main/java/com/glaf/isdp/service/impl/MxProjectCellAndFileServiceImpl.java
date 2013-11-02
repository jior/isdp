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
import com.glaf.isdp.domain.ProjectCellAndFile;
import com.glaf.isdp.mapper.ProjectCellAndFileMapper;
import com.glaf.isdp.query.ProjectCellAndFileQuery;
import com.glaf.isdp.service.IProjectCellAndFileService;

@Service("projectCellAndFileService")
@Transactional(readOnly = true)
public class MxProjectCellAndFileServiceImpl implements
		IProjectCellAndFileService {
	protected static final Log logger = LogFactory
			.getLog(MxProjectCellAndFileServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ProjectCellAndFileMapper projectCellAndFileMapper;

	public MxProjectCellAndFileServiceImpl() {

	}

	public int count(ProjectCellAndFileQuery query) {
		query.ensureInitialized();
		return projectCellAndFileMapper
				.getProjectCellAndFileCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		projectCellAndFileMapper.deleteProjectCellAndFileById(id);
	}

	public ProjectCellAndFile getProjectCellAndFile(String id) {
		ProjectCellAndFile projectCellAndFile = projectCellAndFileMapper
				.getProjectCellAndFileById(id);
		return projectCellAndFile;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectCellAndFileCount(Map<String, Object> parameter) {
		return projectCellAndFileMapper
				.getProjectCellAndFileCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectCellAndFileCountByQueryCriteria(
			ProjectCellAndFileQuery query) {
		return projectCellAndFileMapper
				.getProjectCellAndFileCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectCellAndFile> getProjectCellAndFiles(
			Map<String, Object> parameter) {
		return projectCellAndFileMapper.getProjectCellAndFiles(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectCellAndFile> getProjectCellAndFilesByQueryCriteria(
			int start, int pageSize, ProjectCellAndFileQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectCellAndFile> rows = sqlSession.selectList(
				"getProjectCellAndFilesByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 获取WBS中文件检查信息
	 * 
	 * @param indexId
	 * @return
	 */
	public List<ProjectCellAndFile> getWbsFileProjectCellAndFileByIndexId(
			int indexId) {
		return projectCellAndFileMapper
				.getWbsFileProjectCellAndFileByIndexId(indexId);
	}

	/**
	 * 获取WBS中表格检查信息
	 * 
	 * @param indexId
	 * @return
	 */
	public List<ProjectCellAndFile> getWbsProjectCellAndFileByIndexId(
			int indexId) {
		return projectCellAndFileMapper
				.getWbsProjectCellAndFileByIndexId(indexId);
	}

	public List<ProjectCellAndFile> list(ProjectCellAndFileQuery query) {
		query.ensureInitialized();
		List<ProjectCellAndFile> list = projectCellAndFileMapper
				.getProjectCellAndFilesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(ProjectCellAndFile projectCellAndFile) {
		if (StringUtils.isEmpty(projectCellAndFile.getId())) {
			projectCellAndFile.setId(idGenerator.getNextId());
			// projectCellAndFile.setId(idGenerator.getNextId());
			// projectCellAndFile.setCreateDate(new Date());
			projectCellAndFileMapper
					.insertProjectCellAndFile(projectCellAndFile);
		} else {
			ProjectCellAndFile model = this
					.getProjectCellAndFile(projectCellAndFile.getId());
			if (model != null) {
				model.setIndexId(projectCellAndFile.getIndexId());
				model.setInttype(projectCellAndFile.getInttype());
				if (projectCellAndFile.getName() != null) {
					model.setName(projectCellAndFile.getName());
				}
				if (projectCellAndFile.getDefId() != null) {
					model.setDefId(projectCellAndFile.getDefId());
				}
				if (projectCellAndFile.getUseId() != null) {
					model.setUseId(projectCellAndFile.getUseId());
				}
				model.setIntPage0(projectCellAndFile.getIntPage0());
				model.setIntPage1(projectCellAndFile.getIntPage1());
				model.setIntPage2(projectCellAndFile.getIntPage2());
				model.setIntfinish(projectCellAndFile.getIntfinish());
				projectCellAndFileMapper.updateProjectCellAndFile(model);
			}
		}
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
	public void setProjectCellAndFileMapper(
			ProjectCellAndFileMapper projectCellAndFileMapper) {
		this.projectCellAndFileMapper = projectCellAndFileMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
