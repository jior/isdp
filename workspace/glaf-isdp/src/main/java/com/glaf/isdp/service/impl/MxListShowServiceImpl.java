package com.glaf.isdp.service.impl;

import java.util.*;

import org.apache.commons.lang.StringUtils;
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

@Service("listShowService")
@Transactional(readOnly = true)
public class MxListShowServiceImpl implements IListShowService {
	protected static final Log logger = LogFactory
			.getLog(MxListShowServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected ListShowMapper listShowMapper;

	public MxListShowServiceImpl() {

	}

	@Transactional
	public void deleteById(String id) {
		listShowMapper.deleteListShowById(id);
	}

	public int count(ListShowQuery query) {
		query.ensureInitialized();
		return listShowMapper.getListShowCountByQueryCriteria(query);
	}

	public List<ListShow> list(ListShowQuery query) {
		query.ensureInitialized();
		List<ListShow> list = listShowMapper
				.getListShowsByQueryCriteria(query);
		return list;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getListShowCount(Map<String, Object> parameter) {
		return listShowMapper.getListShowCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getListShowCountByQueryCriteria(ListShowQuery query) {
		return listShowMapper.getListShowCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<ListShow> getListShowsByQueryCriteria(int start, int pageSize,
			ListShowQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<ListShow> rows = sqlSession.selectList(
				"getListShowsByQueryCriteria", query, rowBounds);
		return rows;
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<ListShow> getListShows(Map<String, Object> parameter) {
		return listShowMapper.getListShows(parameter);
	}

	public ListShow getListShow(String id) {
		ListShow listShow = listShowMapper.getListShowById(id);
		return listShow;
	}

	@Transactional
	public void save(ListShow listShow) {
		if (StringUtils.isEmpty(listShow.getId())) {
			listShow.setId(idGenerator.getNextId());
			// listShow.setId(idGenerator.getNextId());
			// listShow.setCreateDate(new Date());
			listShowMapper.insertListShow(listShow);
		} else {
			ListShow model = this.getListShow(listShow.getId());
			if (model != null) {
				model.setIndexId(listShow.getIndexId());
				if (listShow.getListId() != null) {
					model.setListId(listShow.getListId());
				}
				model.setListno(listShow.getListno());
				if (listShow.getFrmtype() != null) {
					model.setFrmtype(listShow.getFrmtype());
				}
				model.setLeftL(listShow.getLeftL());
				model.setTopL(listShow.getTopL());
				model.setWidthL(listShow.getWidthL());
				model.setHeightL(listShow.getHeightL());
				model.setLeftC(listShow.getLeftC());
				model.setTopC(listShow.getTopC());
				model.setWidthC(listShow.getWidthC());
				model.setHeightC(listShow.getHeightC());
				listShowMapper.updateListShow(model);
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
	public void setListShowMapper(ListShowMapper listShowMapper) {
		this.listShowMapper = listShowMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
