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
import com.glaf.isdp.domain.TreewbsAutoindex;
import com.glaf.isdp.mapper.TreewbsAutoindexMapper;
import com.glaf.isdp.query.TreewbsAutoindexQuery;
import com.glaf.isdp.service.ITreewbsAutoindexService;

@Service("treewbsAutoindexService")
@Transactional(readOnly = true)
public class MxTreewbsAutoindexServiceImpl implements ITreewbsAutoindexService {
	protected static final Log logger = LogFactory
			.getLog(MxTreewbsAutoindexServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreewbsAutoindexMapper treewbsAutoindexMapper;

	public MxTreewbsAutoindexServiceImpl() {

	}

	public int count(TreewbsAutoindexQuery query) {
		query.ensureInitialized();
		return treewbsAutoindexMapper
				.getTreewbsAutoindexCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treewbsAutoindexMapper.deleteTreewbsAutoindexById(id);
	}

	public TreewbsAutoindex getTreewbsAutoindex(String id) {
		TreewbsAutoindex treewbsAutoindex = treewbsAutoindexMapper
				.getTreewbsAutoindexById(id);
		return treewbsAutoindex;
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getTreewbsAutoindexCount(Map<String, Object> parameter) {
		return treewbsAutoindexMapper.getTreewbsAutoindexCount(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getTreewbsAutoindexCountByQueryCriteria(
			TreewbsAutoindexQuery query) {
		return treewbsAutoindexMapper
				.getTreewbsAutoindexCountByQueryCriteria(query);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	public List<TreewbsAutoindex> getTreewbsAutoindexs(
			Map<String, Object> parameter) {
		return treewbsAutoindexMapper.getTreewbsAutoindexs(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	public List<TreewbsAutoindex> getTreewbsAutoindexsByQueryCriteria(
			int start, int pageSize, TreewbsAutoindexQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreewbsAutoindex> rows = sqlSession.selectList(
				"getTreewbsAutoindexsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreewbsAutoindex> list(TreewbsAutoindexQuery query) {
		query.ensureInitialized();
		List<TreewbsAutoindex> list = treewbsAutoindexMapper
				.getTreewbsAutoindexsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreewbsAutoindex treewbsAutoindex) {
		if (StringUtils.isEmpty(treewbsAutoindex.getId())) {
			treewbsAutoindex.setId(idGenerator.getNextId());
			// treewbsAutoindex.setId(idGenerator.getNextId());
			// treewbsAutoindex.setCreateDate(new Date());
			treewbsAutoindexMapper
					.insertTreewbsAutoindex(treewbsAutoindex);
		} else {
			TreewbsAutoindex model = this.getTreewbsAutoindex(treewbsAutoindex
					.getId());
			if (model != null) {
				model.setIndexId(treewbsAutoindex.getIndexId());
				model.setAutoindex(treewbsAutoindex.getAutoindex());
				model.setInttype(treewbsAutoindex.getInttype());
				model.setIndexRule(treewbsAutoindex.getIndexRule());
				treewbsAutoindexMapper.updateTreewbsAutoindex(model);
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
	public void setTreewbsAutoindexMapper(
			TreewbsAutoindexMapper treewbsAutoindexMapper) {
		this.treewbsAutoindexMapper = treewbsAutoindexMapper;
	}

}
