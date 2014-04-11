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
import com.glaf.isdp.domain.MyCellTaskSub;
import com.glaf.isdp.mapper.MyCellTaskSubMapper;
import com.glaf.isdp.query.MyCellTaskSubQuery;
import com.glaf.isdp.service.IMyCellTaskSubService;

@Service("mycellTaskSubService")
@Transactional(readOnly = true)
public class MxMyCellTaskSubServiceImpl implements IMyCellTaskSubService {
	protected static final Log logger = LogFactory
			.getLog(MxMyCellTaskSubServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MyCellTaskSubMapper myCellTaskSubMapper;

	public MxMyCellTaskSubServiceImpl() {

	}

	public int count(MyCellTaskSubQuery query) {
		query.ensureInitialized();
		return myCellTaskSubMapper.getMyCellTaskSubCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		myCellTaskSubMapper.deleteMyCellTaskSubById(id);
	}

	public MyCellTaskSub getMyCellTaskSub(String id) {
		MyCellTaskSub mycellTasksSub = myCellTaskSubMapper
				.getMyCellTaskSubById(id);
		return mycellTasksSub;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMyCellTaskSubCount(Map<String, Object> parameter) {
		return myCellTaskSubMapper.getMyCellTaskSubCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getMyCellTaskSubCountByQueryCriteria(MyCellTaskSubQuery query) {
		return myCellTaskSubMapper.getMyCellTaskSubCountByQueryCriteria(query);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<MyCellTaskSub> getMyCellTaskSubs(Map<String, Object> parameter) {
		return myCellTaskSubMapper.getMyCellTaskSubs(parameter);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */

	public List<MyCellTaskSub> getMyCellTaskSubsByQueryCriteria(int start,
			int pageSize, MyCellTaskSubQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MyCellTaskSub> rows = sqlSession.selectList(
				"getMyCellTaskSubByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<MyCellTaskSub> list(MyCellTaskSubQuery query) {
		query.ensureInitialized();
		List<MyCellTaskSub> list = myCellTaskSubMapper
				.getMyCellTaskSubsByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(MyCellTaskSub mycellTasksSub) {
		if (StringUtils.isEmpty(mycellTasksSub.getId())) {
			mycellTasksSub.setId(idGenerator.getNextId());
			// mycellTasksSub.setId(idGenerator.getNextId());
			// mycellTasksSub.setCreateDate(new Date());
			myCellTaskSubMapper.insertMyCellTaskSub(mycellTasksSub);
		} else {
			MyCellTaskSub model = this.getMyCellTaskSub(mycellTasksSub.getId());
			if (model != null) {
				if (mycellTasksSub.getTasksId() != null) {
					model.setTasksId(mycellTasksSub.getTasksId());
				}
				if (mycellTasksSub.getBusiessId() != null) {
					model.setBusiessId(mycellTasksSub.getBusiessId());
				}
				model.setCelldotIndex(mycellTasksSub.getCelldotIndex());
				if (mycellTasksSub.getFiledotFileid() != null) {
					model.setFiledotFileid(mycellTasksSub.getFiledotFileid());
				}
				model.setInttasktype(mycellTasksSub.getInttasktype());
				model.setIndexId(mycellTasksSub.getIndexId());
				if (mycellTasksSub.getSname() != null) {
					model.setSname(mycellTasksSub.getSname());
				}
				model.setIntistasks(mycellTasksSub.getIntistasks());
				model.setIntprojprocess(mycellTasksSub.getIntprojprocess());
				model.setIntistype(mycellTasksSub.getIntistype());
				if (mycellTasksSub.getNameTab() != null) {
					model.setNameTab(mycellTasksSub.getNameTab());
				}
				if (mycellTasksSub.getFlowid() != null) {
					model.setFlowid(mycellTasksSub.getFlowid());
				}
				if (mycellTasksSub.getConstr() != null) {
					model.setConstr(mycellTasksSub.getConstr());
				}
				myCellTaskSubMapper.updateMyCellTaskSub(model);
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
	public void setMyCellTaskSubMapper(MyCellTaskSubMapper myCellTaskSubMapper) {
		this.myCellTaskSubMapper = myCellTaskSubMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
