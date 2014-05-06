package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.*;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("treetopService")
@Transactional(readOnly = true)
public class MxTreetopServiceImpl implements ITreetopService {
	protected static final Log logger = LogFactory
			.getLog(MxTreetopServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected TreetopMapper treetopMapper;

	public MxTreetopServiceImpl() {

	}

	public int count(TreetopQuery query) {
		query.ensureInitialized();
		return treetopMapper.getTreetopCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(Integer id) {
		treetopMapper.deleteTreetopById(id);
	}

	public Treetop getTreetop(Integer id) {
		Treetop treetop = treetopMapper.getTreetopById(id);
		return treetop;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreetopCount(Map<String, Object> parameter) {
		return treetopMapper.getTreetopCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTreetopCountByQueryCriteria(TreetopQuery query) {
		return treetopMapper.getTreetopCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Treetop> getTreetops(Map<String, Object> parameter) {
		return treetopMapper.getTreetops(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Treetop> getTreetopsByQueryCriteria(int start, int pageSize,
			TreetopQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Treetop> rows = sqlSession.selectList(
				"getTreetopsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<Treetop> list(TreetopQuery query) {
		//query.ensureInitialized();
		List<Treetop> list = treetopMapper
				.getTreetopsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Treetop treetop) {
		if (treetop.getIndexId() == 0) {
			treetop.setIndexId(idGenerator.nextId().intValue());
			// treetop.setIndexId(idGenerator.getNextId());
			// treetop.setCreateDate(new Date());
			treetopMapper.insertTreetop(treetop);
		} else {
			Treetop model = this.getTreetop(treetop.getIndexId());
			if (model != null) {
				if (treetop.getId() != null) {
					model.setId(treetop.getId());
				}
				model.setParentId(treetop.getParentId());
				if (treetop.getIndexName() != null) {
					model.setIndexName(treetop.getIndexName());
				}
				model.setNlevel(treetop.getNlevel());
				if (treetop.getNum() != null) {
					model.setNum(treetop.getNum());
				}
				if (treetop.getContent() != null) {
					model.setContent(treetop.getContent());
				}
				if (treetop.getFtype() != null) {
					model.setFtype(treetop.getFtype());
				}
				if (treetop.getSecondIndexName() != null) {
					model.setSecondIndexName(treetop.getSecondIndexName());
				}
				if (treetop.getFilenum() != null) {
					model.setFilenum(treetop.getFilenum());
				}
				model.setZtype(treetop.getZtype());
				if (treetop.getContent2() != null) {
					model.setContent2(treetop.getContent2());
				}
				if (treetop.getTopnode() != null) {
					model.setTopnode(treetop.getTopnode());
				}
				if (treetop.getIsnotshow() != null) {
					model.setIsnotshow(treetop.getIsnotshow());
				}
				model.setNodeico(treetop.getNodeico());
				if (treetop.getFilenumid() != null) {
					model.setFilenumid(treetop.getFilenumid());
				}
				if (treetop.getSlevel() != null) {
					model.setSlevel(treetop.getSlevel());
				}
				if (treetop.getSavetime() != null) {
					model.setSavetime(treetop.getSavetime());
				}
				treetopMapper.updateTreetop(model);
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
	public void setTreetopMapper(TreetopMapper treetopMapper) {
		this.treetopMapper = treetopMapper;
	}

}
