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
import com.glaf.isdp.domain.TreewbsAutostart;
import com.glaf.isdp.mapper.TreewbsAutostartMapper;
import com.glaf.isdp.query.TreewbsAutostartQuery;
import com.glaf.isdp.service.ITreewbsAutostartService;

@Service("treewbsAutostartService")
@Transactional(readOnly = true)
public class MxTreewbsAutostartServiceImpl implements ITreewbsAutostartService {
	protected static final Log logger = LogFactory
			.getLog(MxTreewbsAutostartServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreewbsAutostartMapper treewbsAutostartMapper;

	public MxTreewbsAutostartServiceImpl() {

	}

	public int count(TreewbsAutostartQuery query) {
		query.ensureInitialized();
		return treewbsAutostartMapper
				.getTreewbsAutostartCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treewbsAutostartMapper.deleteTreewbsAutostartById(id);
	}

	public TreewbsAutostart getTreewbsAutostart(String id) {
		TreewbsAutostart treewbsAutostart = treewbsAutostartMapper
				.getTreewbsAutostartById(id);
		return treewbsAutostart;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsAutostartCount(Map<String, Object> parameter) {
		return treewbsAutostartMapper.getTreewbsAutostartCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsAutostartCountByQueryCriteria(
			TreewbsAutostartQuery query) {
		return treewbsAutostartMapper
				.getTreewbsAutostartCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreewbsAutostart> getTreewbsAutostarts(
			Map<String, Object> parameter) {
		return treewbsAutostartMapper.getTreewbsAutostarts(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreewbsAutostart> getTreewbsAutostartsByQueryCriteria(
			int start, int pageSize, TreewbsAutostartQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreewbsAutostart> rows = sqlSession.selectList(
				"getTreewbsAutostartsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreewbsAutostart> list(TreewbsAutostartQuery query) {
		query.ensureInitialized();
		List<TreewbsAutostart> list = treewbsAutostartMapper
				.getTreewbsAutostartsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreewbsAutostart treewbsAutostart) {
		if (StringUtils.isEmpty(treewbsAutostart.getId())) {
			treewbsAutostart.setId(idGenerator.getNextId());
			// treewbsAutostart.setId(idGenerator.getNextId());
			// treewbsAutostart.setCreateDate(new Date());
			treewbsAutostartMapper
					.insertTreewbsAutostart(treewbsAutostart);
		} else {
			TreewbsAutostart model = this.getTreewbsAutostart(treewbsAutostart
					.getId());
			if (model != null) {
				model.setIndexId(treewbsAutostart.getIndexId());
				model.setWbsindex(treewbsAutostart.getWbsindex());
				model.setIntstartype(treewbsAutostart.getIntstartype());
				model.setIntstardelayday(treewbsAutostart.getIntstardelayday());
				model.setInttype(treewbsAutostart.getInttype());
				treewbsAutostartMapper.updateTreewbsAutostart(model);
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
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@javax.annotation.Resource
	public void setTreewbsAutostartMapper(
			TreewbsAutostartMapper treewbsAutostartMapper) {
		this.treewbsAutostartMapper = treewbsAutostartMapper;
	}

}
