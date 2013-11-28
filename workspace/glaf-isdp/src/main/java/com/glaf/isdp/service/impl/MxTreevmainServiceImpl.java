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
import com.glaf.isdp.domain.Treevmain;
import com.glaf.isdp.mapper.TreevmainMapper;
import com.glaf.isdp.query.TreevmainQuery;
import com.glaf.isdp.service.ITreevmainService;

@Service("treevmainService")
@Transactional(readOnly = true)
public class MxTreevmainServiceImpl implements ITreevmainService {
	protected static final Log logger = LogFactory
			.getLog(MxTreevmainServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreevmainMapper treevmainMapper;

	public MxTreevmainServiceImpl() {

	}

	public int count(TreevmainQuery query) {
		query.ensureInitialized();
		return treevmainMapper.getTreevmainCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treevmainMapper.deleteTreevmainById(id);
	}

	public Treevmain getTreevmainById(String id) {
		Treevmain treevmain = treevmainMapper.getTreevmainById(id);
		return treevmain;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreevmainCount(Map<String, Object> parameter) {
		return treevmainMapper.getTreevmainCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreevmainCountByQueryCriteria(TreevmainQuery query) {
		return treevmainMapper.getTreevmainCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Treevmain> getTreevmains(Map<String, Object> parameter) {
		return treevmainMapper.getTreevmains(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Treevmain> getTreevmainsByQueryCriteria(int start,
			int pageSize, TreevmainQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Treevmain> rows = sqlSession.selectList(
				"getTreevmainsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<Treevmain> list(TreevmainQuery query) {
		query.ensureInitialized();
		List<Treevmain> list = treevmainMapper
				.getTreevmainsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Treevmain treevmain) {
		if (treevmain.getIndexId() == 0) {
			treevmain.setIndexId(idGenerator.nextId().intValue());
			// treevmain.setIndexId(idGenerator.getNextId());
			// treevmain.setCreateDate(new Date());
			treevmainMapper.insertTreevmain(treevmain);
		} else {
			Treevmain model = this.getTreevmainByPrimaryKey(treevmain
					.getIndexId());
			if (model != null) {
				if (treevmain.getId() != null) {
					model.setId(treevmain.getId());
				}
				if (treevmain.getIndexName() != null) {
					model.setIndexName(treevmain.getIndexName());
				}
				model.setNlevel(treevmain.getNlevel());
				if (treevmain.getNum() != null) {
					model.setNum(treevmain.getNum());
				}
				if (treevmain.getFilenum() != null) {
					model.setFilenum(treevmain.getFilenum());
				}
				if (treevmain.getContent() != null) {
					model.setContent(treevmain.getContent());
				}
				if (treevmain.getVflag() != null) {
					model.setVflag(treevmain.getVflag());
				}
				if (treevmain.getSindexName() != null) {
					model.setSindexName(treevmain.getSindexName());
				}
				model.setZtype(treevmain.getZtype());
				if (treevmain.getContent2() != null) {
					model.setContent2(treevmain.getContent2());
				}
				if (treevmain.getTopnode() != null) {
					model.setTopnode(treevmain.getTopnode());
				}
				model.setNodeico(treevmain.getNodeico());
				treevmainMapper.updateTreevmain(model);
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
	public void setTreevmainMapper(
			TreevmainMapper treevmainMapper) {
		this.treevmainMapper = treevmainMapper;
	}

	public void deleteByPrimaryKey(int indexId) {
		treevmainMapper.deleteTreevmainByIndexId(indexId);
	}

	public Treevmain getTreevmainByPrimaryKey(int indexId) {
		return treevmainMapper.getTreevmainByIndexId(indexId);
	}

}
