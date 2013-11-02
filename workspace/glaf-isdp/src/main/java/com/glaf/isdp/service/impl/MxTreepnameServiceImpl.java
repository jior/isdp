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
import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.isdp.mapper.IsdpTreepnameMapper;
import com.glaf.isdp.query.TreepnameQuery;
import com.glaf.isdp.service.IsdpTreepnameService;

@Service("isdpTreepnameService")
@Transactional(readOnly = true)
public class MxTreepnameServiceImpl implements IsdpTreepnameService {
	protected static final Log logger = LogFactory
			.getLog(MxTreepnameServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpTreepnameMapper isdpTreepnameMapper;

	public MxTreepnameServiceImpl() {

	}

	public int count(TreepnameQuery query) {
		query.ensureInitialized();
		return isdpTreepnameMapper.getTreepnameCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		isdpTreepnameMapper.deleteTreepnameById(id);
	}

	public IsdpTreepname getTreepname(String id) {
		IsdpTreepname treepname = isdpTreepnameMapper.getTreepnameById(id);
		return treepname;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepnameCount(Map<String, Object> parameter) {
		return isdpTreepnameMapper.getTreepnameCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreepnameCountByQueryCriteria(TreepnameQuery query) {
		return isdpTreepnameMapper.getTreepnameCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<IsdpTreepname> getTreepnames(Map<String, Object> parameter) {
		return isdpTreepnameMapper.getTreepnames(parameter);
	}

	public List<IsdpTreepname> getTreepnamesByDomainIndex(int domainIndex) {
		return isdpTreepnameMapper.getTreepnamesByDomainIndex(domainIndex);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IsdpTreepname> getTreepnamesByQueryCriteria(int start,
			int pageSize, TreepnameQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IsdpTreepname> rows = sqlSession.selectList(
				"getTreepnamesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<IsdpTreepname> list(TreepnameQuery query) {
		query.ensureInitialized();
		List<IsdpTreepname> list = isdpTreepnameMapper
				.getTreepnamesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(IsdpTreepname treepname) {
		if (StringUtils.isEmpty(treepname.getId())) {
			treepname.setId(idGenerator.getNextId());
			// treepname.setID(idGenerator.getNextId());
			// treepname.setCreateDate(new Date());
			isdpTreepnameMapper.insertTreepname(treepname);
		} else {
			IsdpTreepname model = this.getTreepname(treepname.getId());
			if (model != null) {
				model.setIndexId(treepname.getIndexId());
				if (treepname.getNum() != null) {
					model.setNum(treepname.getNum());
				}
				if (treepname.getIndexName() != null) {
					model.setIndexName(treepname.getIndexName());
				}
				model.setNlevel(treepname.getNlevel());
				model.setShowid(treepname.getShowid());
				if (treepname.getRuleId() != null) {
					model.setRuleId(treepname.getRuleId());
				}
				model.setNodeico(treepname.getNodeico());
				if (treepname.getFruleId() != null) {
					model.setFruleId(treepname.getFruleId());
				}
				if (treepname.getWcompany() != null) {
					model.setWcompany(treepname.getWcompany());
				}
				model.setListno(treepname.getListno());
				if (treepname.getSysId() != null) {
					model.setSysId(treepname.getSysId());
				}
				model.setDomainIndex(treepname.getDomainIndex());
				isdpTreepnameMapper.updateTreepname(model);
			}
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
	public void setIsdpTreepnameMapper(IsdpTreepnameMapper isdpTreepnameMapper) {
		this.isdpTreepnameMapper = isdpTreepnameMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
