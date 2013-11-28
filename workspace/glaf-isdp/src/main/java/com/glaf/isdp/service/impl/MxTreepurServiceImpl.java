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
import com.glaf.isdp.domain.Treepur;
import com.glaf.isdp.mapper.TreepurMapper;
import com.glaf.isdp.query.TreepurQuery;
import com.glaf.isdp.service.ITreepurService;

@Service("treepurService")
@Transactional(readOnly = true)
public class MxTreepurServiceImpl implements ITreepurService {
	protected static final Log logger = LogFactory
			.getLog(MxTreepurServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreepurMapper treepurMapper;

	public MxTreepurServiceImpl() {

	}

	public int count(TreepurQuery query) {
		query.ensureInitialized();
		return treepurMapper.getTreepurCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treepurMapper.deleteTreepurById(id);
	}

	public Treepur getTreepur(String id) {
		Treepur treepur = treepurMapper.getTreepurById(id);
		return treepur;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepurCount(Map<String, Object> parameter) {
		return treepurMapper.getTreepurCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepurCountByQueryCriteria(TreepurQuery query) {
		return treepurMapper.getTreepurCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Treepur> getTreepurs(Map<String, Object> parameter) {
		return treepurMapper.getTreepurs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Treepur> getTreepursByQueryCriteria(int start, int pageSize,
			TreepurQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Treepur> rows = sqlSession.selectList(
				"getTreepursByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<Treepur> list(TreepurQuery query) {
		query.ensureInitialized();
		List<Treepur> list = treepurMapper
				.getTreepursByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Treepur treepur) {
		if (StringUtils.isEmpty(treepur.getId())) {
			treepur.setId(idGenerator.getNextId());
			// treepur.setId(idGenerator.getNextId());
			// treepur.setCreateDate(new Date());
			treepurMapper.insertTreepur(treepur);
		} else {
			Treepur model = this.getTreepur(treepur.getId());
			if (model != null) {
				model.setIndexId(treepur.getIndexId());
				if (treepur.getIndexName() != null) {
					model.setIndexName(treepur.getIndexName());
				}
				model.setModulenum(treepur.getModulenum());
				if (treepur.getContent() != null) {
					model.setContent(treepur.getContent());
				}
				model.setListno(treepur.getListno());
				treepurMapper.updateTreepur(model);
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
	public void setTreepurMapper(TreepurMapper treepurMapper) {
		this.treepurMapper = treepurMapper;
	}

}
