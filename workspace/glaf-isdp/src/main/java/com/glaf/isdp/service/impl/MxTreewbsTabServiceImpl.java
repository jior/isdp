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
import com.glaf.isdp.domain.TreewbsTab;
import com.glaf.isdp.mapper.TreewbsTabMapper;
import com.glaf.isdp.query.TreewbsTabQuery;
import com.glaf.isdp.service.ITreewbsTabService;

@Service("treewbsTabService")
@Transactional(readOnly = true)
public class MxTreewbsTabServiceImpl implements ITreewbsTabService {
	protected static final Log logger = LogFactory
			.getLog(MxTreewbsTabServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreewbsTabMapper treewbsTabsMapper;

	public MxTreewbsTabServiceImpl() {

	}

	public int count(TreewbsTabQuery query) {
		query.ensureInitialized();
		return treewbsTabsMapper.getTreewbsTabCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treewbsTabsMapper.deleteTreewbsTabById(id);
	}

	public TreewbsTab getTreewbsTab(String id) {
		TreewbsTab treewbsTabs = treewbsTabsMapper.getTreewbsTabById(id);
		return treewbsTabs;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsTabCount(Map<String, Object> parameter) {
		return treewbsTabsMapper.getTreewbsTabCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsTabCountByQueryCriteria(TreewbsTabQuery query) {
		return treewbsTabsMapper.getTreewbsTabCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreewbsTab> getTreewbsTabs(Map<String, Object> parameter) {
		return treewbsTabsMapper.getTreewbsTabs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreewbsTab> getTreewbsTabsByQueryCriteria(int start,
			int pageSize, TreewbsTabQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreewbsTab> rows = sqlSession.selectList(
				"getTreewbsTabsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreewbsTab> list(TreewbsTabQuery query) {
		query.ensureInitialized();
		List<TreewbsTab> list = treewbsTabsMapper
				.getTreewbsTabsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreewbsTab treewbsTabs) {
		if (StringUtils.isEmpty(treewbsTabs.getId())) {
			treewbsTabs.setId(idGenerator.getNextId());
			// treewbsTabs.setId(idGenerator.getNextId());
			// treewbsTabs.setCreateDate(new Date());
			treewbsTabsMapper.insertTreewbsTab(treewbsTabs);
		} else {
			TreewbsTab model = this.getTreewbsTab(treewbsTabs.getId());
			if (model != null) {
				model.setIndexId(treewbsTabs.getIndexId());
				model.setTabIndex(treewbsTabs.getTabIndex());
				if (treewbsTabs.getName() != null) {
					model.setName(treewbsTabs.getName());
				}
				if (treewbsTabs.getOname() != null) {
					model.setOname(treewbsTabs.getOname());
				}
				treewbsTabsMapper.updateTreewbsTab(model);
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
	public void setTreewbsTabMapper(
			TreewbsTabMapper treewbsTabsMapper) {
		this.treewbsTabsMapper = treewbsTabsMapper;
	}

}
