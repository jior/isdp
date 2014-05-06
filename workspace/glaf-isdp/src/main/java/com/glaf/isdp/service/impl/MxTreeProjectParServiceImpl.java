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
import com.glaf.isdp.domain.TreeProjectPar;
import com.glaf.isdp.mapper.TreeProjectParMapper;
import com.glaf.isdp.query.TreeProjectParQuery;
import com.glaf.isdp.service.ITreeProjectParService;

@Service("treeProjectParService")
@Transactional(readOnly = true)
public class MxTreeProjectParServiceImpl implements ITreeProjectParService {
	protected static final Log logger = LogFactory
			.getLog(MxTreeProjectParServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreeProjectParMapper treeProjectParMapper;

	public MxTreeProjectParServiceImpl() {

	}

	public int count(TreeProjectParQuery query) {
		query.ensureInitialized();
		return treeProjectParMapper
				.getTreeProjectParCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treeProjectParMapper.deleteTreeProjectParById(id);
	}

	public TreeProjectPar getTreeProjectPar(String id) {
		TreeProjectPar treeProjectPar = treeProjectParMapper
				.getTreeProjectParById(id);
		return treeProjectPar;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeProjectParCount(Map<String, Object> parameter) {
		return treeProjectParMapper.getTreeProjectParCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreeProjectParCountByQueryCriteria(TreeProjectParQuery query) {
		return treeProjectParMapper
				.getTreeProjectParCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreeProjectPar> getTreeProjectPars(Map<String, Object> parameter) {
		return treeProjectParMapper.getTreeProjectPars(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreeProjectPar> getTreeProjectParsByQueryCriteria(int start,
			int pageSize, TreeProjectParQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreeProjectPar> rows = sqlSession.selectList(
				"getTreeProjectParsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreeProjectPar> list(TreeProjectParQuery query) {
		query.ensureInitialized();
		List<TreeProjectPar> list = treeProjectParMapper
				.getTreeProjectParsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreeProjectPar treeProjectPar) {
		if (StringUtils.isEmpty(treeProjectPar.getId())) {
			treeProjectPar.setId(idGenerator.getNextId());
			// treeProjectPar.setId(idGenerator.getNextId());
			// treeProjectPar.setCreateDate(new Date());
			treeProjectParMapper.insertTreeProjectPar(treeProjectPar);
		} else {
			TreeProjectPar model = this.getTreeProjectPar(treeProjectPar
					.getId());
			if (model != null) {
				model.setIndexId(treeProjectPar.getIndexId());
				model.setTreeProjectParUser1(treeProjectPar
						.getTreeProjectParUser1());
				treeProjectParMapper.updateTreeProjectPar(model);
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreeProjectParMapper(
			TreeProjectParMapper treeProjectParMapper) {
		this.treeProjectParMapper = treeProjectParMapper;
	}

}
