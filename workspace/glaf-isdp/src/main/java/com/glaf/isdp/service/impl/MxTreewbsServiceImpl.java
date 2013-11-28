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
import com.glaf.isdp.domain.Treewbs;
import com.glaf.isdp.mapper.TreewbsMapper;
import com.glaf.isdp.query.TreewbsQuery;
import com.glaf.isdp.service.ITreewbsService;

@Service("treewbsService")
@Transactional(readOnly = true)
public class MxTreewbsServiceImpl implements ITreewbsService {
	protected static final Log logger = LogFactory
			.getLog(MxTreewbsServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreewbsMapper treewbsMapper;

	public MxTreewbsServiceImpl() {

	}

	public int count(TreewbsQuery query) {
		query.ensureInitialized();
		return treewbsMapper.getTreewbsCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		treewbsMapper.deleteTreewbsById(id);
	}

	public Treewbs getTreewbsById(String id) {
		Treewbs treewbs = treewbsMapper.getTreewbsById(id);
		return treewbs;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsCount(Map<String, Object> parameter) {
		return treewbsMapper.getTreewbsCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreewbsCountByQueryCriteria(TreewbsQuery query) {
		return treewbsMapper.getTreewbsCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Treewbs> getTreewbss(Map<String, Object> parameter) {
		return treewbsMapper.getTreewbss(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Treewbs> getTreewbssByQueryCriteria(int start, int pageSize,
			TreewbsQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Treewbs> rows = sqlSession.selectList(
				"getTreewbssByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<Treewbs> list(TreewbsQuery query) {
		query.ensureInitialized();
		List<Treewbs> list = treewbsMapper
				.getTreewbssByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Treewbs treewbs) {
		if (treewbs.getIndexId() == 0) {
			treewbs.setIndexId(idGenerator.nextId().intValue());
			// treewbs.setIndexId(idGenerator.getNextId());
			// treewbs.setCreateDate(new Date());
			treewbsMapper.insertTreewbs(treewbs);
		} else {
			Treewbs model = this.getTreewbsByPrimaryKey(treewbs.getIndexId());
			if (model != null) {
				if (treewbs.getId() != null) {
					model.setId(treewbs.getId());
				}
				if (treewbs.getNum() != null) {
					model.setNum(treewbs.getNum());
				}
				if (treewbs.getIndexName() != null) {
					model.setIndexName(treewbs.getIndexName());
				}
				if (treewbs.getSindexName() != null) {
					model.setSindexName(treewbs.getSindexName());
				}
				model.setNlevel(treewbs.getNlevel());
				if (treewbs.getContent() != null) {
					model.setContent(treewbs.getContent());
				}
				model.setNodeico(treewbs.getNodeico());
				model.setListno(treewbs.getListno());
				model.setInttype(treewbs.getInttype());
				model.setPindexId(treewbs.getPindexId());
				if (treewbs.getTypeTablename() != null) {
					model.setTypeTablename(treewbs.getTypeTablename());
				}
				model.setIntusetname(treewbs.getIntusetname());
				model.setIntstartype(treewbs.getIntstartype());
				model.setIntstardelayday(treewbs.getIntstardelayday());
				model.setIntstartA(treewbs.getIntstartA());
				model.setIntstartP(treewbs.getIntstartP());
				model.setIntendA(treewbs.getIntendA());
				model.setIntendP(treewbs.getIntendP());
				model.setIntneednode(treewbs.getIntneednode());
				model.setIntusetnum(treewbs.getIntusetnum());
				model.setDomainIndex(treewbs.getDomainIndex());
				if (treewbs.getStrfileLocate() != null) {
					model.setStrfileLocate(treewbs.getStrfileLocate());
				}
				model.setIntnodetype(treewbs.getIntnodetype());
				model.setIntloadfile(treewbs.getIntloadfile());
				model.setIntorglevel(treewbs.getIntorglevel());
				model.setUindexId(treewbs.getUindexId());
				treewbsMapper.updateTreewbs(model);
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
	public void setTreewbsMapper(TreewbsMapper treewbsMapper) {
		this.treewbsMapper = treewbsMapper;
	}

	public void deleteByPrimaryKey(int indexId) {
		treewbsMapper.deleteTreewbsByIndexId(indexId);
	}

	public Treewbs getTreewbsByPrimaryKey(int indexId) {
		return treewbsMapper.getTreewbsByIndexId(indexId);
	}

}
