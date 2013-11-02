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
import com.glaf.isdp.domain.TreeProject;
import com.glaf.isdp.mapper.TreeProjectMapper;
import com.glaf.isdp.query.TreeProjectQuery;
import com.glaf.isdp.service.ITreeProjectService;

@Service("treeProjectService")
@Transactional(readOnly = true)
public class MxTreeProjectServiceImpl implements ITreeProjectService {
	protected static final Log logger = LogFactory
			.getLog(MxTreeProjectServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreeProjectMapper treeProjectMapper;

	public MxTreeProjectServiceImpl() {

	}

	public int count(TreeProjectQuery query) {
		query.ensureInitialized();
		return treeProjectMapper.getTreeProjectCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treeProjectMapper.deleteTreeProjectById(id);
	}

	public void deleteByPrimaryKey(int indexId) {
		treeProjectMapper.deleteTreeProjectByIndexId(indexId);
	}

	public TreeProject getTreeProjectById(String id) {
		TreeProject treeproj = treeProjectMapper.getTreeProjectById(id);
		return treeproj;
	}

	public TreeProject getTreeProjectByPrimaryKey(int indexId) {
		return treeProjectMapper.getTreeProjectByIndexId(indexId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeProjectCount(Map<String, Object> parameter) {
		return treeProjectMapper.getTreeProjectCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeProjectCountByQueryCriteria(TreeProjectQuery query) {
		return treeProjectMapper.getTreeProjectCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreeProject> getTreeProjects(Map<String, Object> parameter) {
		return treeProjectMapper.getTreeProjects(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreeProject> getTreeProjectsByQueryCriteria(int start,
			int pageSize, TreeProjectQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreeProject> rows = sqlSession.selectList(
				"getTreeProjectsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreeProject> list(TreeProjectQuery query) {
		query.ensureInitialized();
		List<TreeProject> list = treeProjectMapper
				.getTreeProjectsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreeProject treeproj) {
		TreeProject model = this.getTreeProjectByPrimaryKey(treeproj
				.getIndexId());
		if (model != null) {
			if (treeproj.getId() != null) {
				model.setId(treeproj.getId());
			}
			model.setTopId(treeproj.getTopId());
			if (treeproj.getIndexName() != null) {
				model.setIndexName(treeproj.getIndexName());
			}
			model.setNlevel(treeproj.getNlevel());
			if (treeproj.getNum() != null) {
				model.setNum(treeproj.getNum());
			}
			if (treeproj.getContent() != null) {
				model.setContent(treeproj.getContent());
			}
			if (treeproj.getUseId() != null) {
				model.setUseId(treeproj.getUseId());
			}
			if (treeproj.getSindexName() != null) {
				model.setSindexName(treeproj.getSindexName());
			}
			if (treeproj.getContent2() != null) {
				model.setContent2(treeproj.getContent2());
			}
			if (treeproj.getTopnode() != null) {
				model.setTopnode(treeproj.getTopnode());
			}
			model.setNodeico(treeproj.getNodeico());
			if (treeproj.getProjtype() != null) {
				model.setProjtype(treeproj.getProjtype());
			}
			if (treeproj.getUnitnum() != null) {
				model.setUnitnum(treeproj.getUnitnum());
			}
			model.setShowid(treeproj.getShowid());
			model.setScaleQ(treeproj.getScaleQ());
			if (treeproj.getIspegwork() != null) {
				model.setIspegwork(treeproj.getIspegwork());
			}
			if (treeproj.getTreeProjectUser2() != null) {
				model.setTreeProjectUser2(treeproj.getTreeProjectUser2());
			}
			treeProjectMapper.updateTreeProject(model);
		} else {
			if (treeproj.getIndexId() == 0) {
				treeproj.setIndexId(idGenerator.nextId().intValue());
			}
			treeProjectMapper.insertTreeProject(treeproj);
		}
	}

	@javax.annotation.Resource(name = "myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name = "myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreeProjectMapper(
			TreeProjectMapper treeProjectMapper) {
		this.treeProjectMapper = treeProjectMapper;
	}

}
