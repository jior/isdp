package com.glaf.isdp.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.ProjectTree;
import com.glaf.isdp.mapper.ProjectTreeMapper;
import com.glaf.isdp.query.ProjectTreeQuery;
import com.glaf.isdp.service.IProjectTreeService;

@Service("projectTreeService")
@Transactional(readOnly = true)
public class MxProjectTreeServiceImpl implements IProjectTreeService {
	protected static final Log logger = LogFactory
			.getLog(MxProjectTreeServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ProjectTreeMapper projectTreeMapper;

	public MxProjectTreeServiceImpl() {

	}

	public int count(ProjectTreeQuery query) {
		query.ensureInitialized();
		return projectTreeMapper.getProjectTreeCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		projectTreeMapper.deleteProjectTreeById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		projectTreeMapper.deleteProjectTreeByIndexId(indexId);
	}

	public ProjectTree getProjectTreeById(String id) {
		ProjectTree projectTree = projectTreeMapper.getProjectTreeById(id);
		return projectTree;
	}

	public ProjectTree getProjectTreeByPrimaryKey(int indexId) {
		return projectTreeMapper.getProjectTreeByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectTreeCount(Map<String, Object> parameter) {
		return projectTreeMapper.getProjectTreeCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getProjectTreeCountByQueryCriteria(ProjectTreeQuery query) {
		return projectTreeMapper.getProjectTreeCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ProjectTree> getProjectTrees(Map<String, Object> parameter) {
		return projectTreeMapper.getProjectTrees(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ProjectTree> getProjectTreesByQueryCriteria(int start,
			int pageSize, ProjectTreeQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ProjectTree> rows = sqlSession.selectList(
				"getProjectTreesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<ProjectTree> list(ProjectTreeQuery query) {
		query.ensureInitialized();
		List<ProjectTree> list = projectTreeMapper
				.getProjectTreesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(ProjectTree projectTree) {
		if (projectTree.getIndexId() == 0) {
			projectTree.setIndexId(idGenerator.nextId().intValue());
			// projectTree.setIndexId(idGenerator.getNextId());
			// projectTree.setCreateDate(new Date());
			projectTreeMapper.insertProjectTree(projectTree);
		} else {
			ProjectTree model = this.getProjectTreeByPrimaryKey(projectTree
					.getIndexId());
			if (model != null) {
				if (projectTree.getId() != null) {
					model.setId(projectTree.getId());
				}
				if (projectTree.getIndexName() != null) {
					model.setIndexName(projectTree.getIndexName());
				}
				model.setNlevel(projectTree.getNlevel());
				if (projectTree.getContent() != null) {
					model.setContent(projectTree.getContent());
				}
				model.setNodeico(projectTree.getNodeico());
				model.setListno(projectTree.getListno());
				model.setInttype(projectTree.getInttype());
				projectTreeMapper.updateProjectTree(model);
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
	public void setProjectTreeMapper(
			ProjectTreeMapper projectTreeMapper) {
		this.projectTreeMapper = projectTreeMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
