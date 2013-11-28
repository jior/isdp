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
import com.glaf.isdp.domain.Hint;
import com.glaf.isdp.mapper.HintMapper;
import com.glaf.isdp.query.HintQuery;
import com.glaf.isdp.service.IHintService;

@Service("hintService")
@Transactional(readOnly = true)
public class MxHintServiceImpl implements IHintService {
	protected static final Log logger = LogFactory
			.getLog(MxHintServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected HintMapper hintMapper;

	public MxHintServiceImpl() {

	}

	public int count(HintQuery query) {
		query.ensureInitialized();
		return hintMapper.getHintCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		hintMapper.deleteHintById(id);
	}

	public Hint getHint(String id) {
		Hint hint = hintMapper.getHintById(id);
		return hint;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getHintCount(Map<String, Object> parameter) {
		return hintMapper.getHintCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getHintCountByQueryCriteria(HintQuery query) {
		return hintMapper.getHintCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<Hint> getHints(Map<String, Object> parameter) {
		return hintMapper.getHints(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<Hint> getHintsByQueryCriteria(int start, int pageSize,
			HintQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<Hint> rows = sqlSession.selectList("getHintsByQueryCriteria",
				query, rowBounds);
		return rows;
	}

	public List<Hint> list(HintQuery query) {
		query.ensureInitialized();
		List<Hint> list = hintMapper.getHintsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(Hint hint) {
		if (StringUtils.isEmpty(hint.getId())) {
			hint.setId(idGenerator.getNextId());
			// hint.setId(idGenerator.getNextId());
			// hint.setCreateDate(new Date());
			hintMapper.insertHint(hint);
		} else {
			Hint model = this.getHint(hint.getId());
			if (model != null) {
				if (hint.getHint() != null) {
					model.setHint(hint.getHint());
				}
				hintMapper.updateHint(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setHintMapper(HintMapper hintMapper) {
		this.hintMapper = hintMapper;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
