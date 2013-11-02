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
import com.glaf.isdp.domain.HintList;
import com.glaf.isdp.mapper.HintListMapper;
import com.glaf.isdp.query.HintListQuery;
import com.glaf.isdp.service.IHintListService;

@Service("hintListService")
@Transactional(readOnly = true)
public class MxHintListServiceImpl implements IHintListService {
	protected static final Log logger = LogFactory
			.getLog(MxHintListServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected HintListMapper hintListMapper;

	public MxHintListServiceImpl() {

	}

	public int count(HintListQuery query) {
		query.ensureInitialized();
		return hintListMapper.getHintListCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		hintListMapper.deleteHintListById(id);
	}

	public HintList getHintList(String id) {
		HintList hintList = hintListMapper.getHintListById(id);
		return hintList;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getHintListCount(Map<String, Object> parameter) {
		return hintListMapper.getHintListCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getHintListCountByQueryCriteria(HintListQuery query) {
		return hintListMapper.getHintListCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<HintList> getHintLists(Map<String, Object> parameter) {
		return hintListMapper.getHintLists(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<HintList> getHintListsByQueryCriteria(int start, int pageSize,
			HintListQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<HintList> rows = sqlSession.selectList(
				"getHintListsByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<HintList> list(HintListQuery query) {
		query.ensureInitialized();
		List<HintList> list = hintListMapper
				.getHintListsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(HintList hintList) {
		if (StringUtils.isEmpty(hintList.getId())) {
			hintList.setId(idGenerator.getNextId());
			// hintList.setId(idGenerator.getNextId());
			// hintList.setCreateDate(new Date());
			hintListMapper.insertHintList(hintList);
		} else {
			HintList model = this.getHintList(hintList.getId());
			if (model != null) {
				if (hintList.getHintid() != null) {
					model.setHintid(hintList.getHintid());
				}
				if (hintList.getList() != null) {
					model.setList(hintList.getList());
				}
				if (hintList.getContent() != null) {
					model.setContent(hintList.getContent());
				}
				model.setListno(hintList.getListno());
				model.setHintdata(hintList.getHintdata());
				hintListMapper.updateHintList(model);
			}
		}
	}

	 
	@javax.annotation.Resource(name="myBatisEntityDAO")
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setHintListMapper(HintListMapper hintListMapper) {
		this.hintListMapper = hintListMapper;
	}

	@javax.annotation.Resource(name="myBatisDbIdGenerator")
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
