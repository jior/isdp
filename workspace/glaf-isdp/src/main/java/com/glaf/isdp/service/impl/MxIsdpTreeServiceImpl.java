package com.glaf.isdp.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.mapper.IsdpTreeMapper;
import com.glaf.isdp.query.BaseTreeQuery;
import com.glaf.isdp.query.IsdpTreeQuery;
import com.glaf.isdp.service.IsdpTreeService;

@Service("isdpTreeService")
@Transactional(readOnly = true)
public class MxIsdpTreeServiceImpl implements IsdpTreeService {
	protected static final Log logger = LogFactory
			.getLog(MxIsdpTreeServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected IsdpTreeMapper isdpTreeMapper;

	public MxIsdpTreeServiceImpl() {

	}

	public List<ITree> getTreesByQueryCriteria(BaseTreeQuery query) {
		if (StringUtils.isEmpty(query.getTableName())) {
			throw new java.lang.IllegalArgumentException(
					"tablename is required");
		}
		return isdpTreeMapper.getBaseTreesByQueryCriteria(query);
	}

	public List<ITree> getIsdpTreesByQueryCriteria(IsdpTreeQuery query) {
		if (StringUtils.isEmpty(query.getSelectSql())) {
			throw new java.lang.IllegalArgumentException("sql is required");
		}
		return isdpTreeMapper.getIsdpTreesByQueryCriteria(query);
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
	public void setIsdpTreeMapper(IsdpTreeMapper isdpTreeMapper) {
		this.isdpTreeMapper = isdpTreeMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
