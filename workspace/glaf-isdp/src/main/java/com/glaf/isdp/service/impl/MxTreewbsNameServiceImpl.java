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
import com.glaf.isdp.domain.TreewbsName;
import com.glaf.isdp.mapper.TreewbsNameMapper;
import com.glaf.isdp.query.TreewbsNameQuery;
import com.glaf.isdp.service.ITreewbsNameService;

@Service("treewbsNameService")
@Transactional(readOnly = true)
public class MxTreewbsNameServiceImpl implements ITreewbsNameService {
	protected static final Log logger = LogFactory
			.getLog(MxTreewbsNameServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreewbsNameMapper treewbsNameMapper;

	public MxTreewbsNameServiceImpl() {

	}

	public int count(TreewbsNameQuery query) {
		query.ensureInitialized();
		return treewbsNameMapper.getTreewbsNameCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treewbsNameMapper.deleteTreewbsNameById(id);
	}

	public TreewbsName getTreewbsName(String id) {
		TreewbsName treewbsName = treewbsNameMapper.getTreewbsNameById(id);
		return treewbsName;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsNameCount(Map<String, Object> parameter) {
		return treewbsNameMapper.getTreewbsNameCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsNameCountByQueryCriteria(TreewbsNameQuery query) {
		return treewbsNameMapper.getTreewbsNameCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<TreewbsName> getTreewbsNames(Map<String, Object> parameter) {
		return treewbsNameMapper.getTreewbsNames(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TreewbsName> getTreewbsNamesByQueryCriteria(int start,
			int pageSize, TreewbsNameQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TreewbsName> rows = sqlSession.selectList(
				"getTreewbsNamesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<TreewbsName> list(TreewbsNameQuery query) {
		query.ensureInitialized();
		List<TreewbsName> list = treewbsNameMapper
				.getTreewbsNamesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(TreewbsName treewbsName) {
		if (StringUtils.isEmpty(treewbsName.getId())) {
			treewbsName.setId(idGenerator.getNextId());
			// treewbsName.setId(idGenerator.getNextId());
			// treewbsName.setCreateDate(new Date());
			treewbsNameMapper.insertTreewbsName(treewbsName);
		} else {
			TreewbsName model = this.getTreewbsName(treewbsName.getId());
			if (model != null) {
				model.setIndexId(treewbsName.getIndexId());
				model.setWbsindex(treewbsName.getWbsindex());
				treewbsNameMapper.updateTreewbsName(model);
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
	public void setTreewbsNameMapper(
			TreewbsNameMapper treewbsNameMapper) {
		this.treewbsNameMapper = treewbsNameMapper;
	}

}
