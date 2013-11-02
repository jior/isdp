package com.glaf.isdp.service.impl;

import java.util.HashMap;
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
import com.glaf.isdp.domain.MyCellTask;
import com.glaf.isdp.mapper.MyCellTaskMapper;
import com.glaf.isdp.query.MyCellTaskQuery;
import com.glaf.isdp.service.IMyCellTaskService;

@Service("mycellTaskService")
@Transactional(readOnly = true)
public class MxMyCellTaskServiceImpl implements IMyCellTaskService {
	protected static final Log logger = LogFactory
			.getLog(MxMyCellTaskServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected MyCellTaskMapper myCellTasksMapper;

	public MxMyCellTaskServiceImpl() {

	}

	public int count(MyCellTaskQuery query) {
		query.ensureInitialized();
		return myCellTasksMapper.getMyCellTaskCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		myCellTasksMapper.deleteMyCellTaskById(id);
	}

	public MyCellTask getMyCellTask(String id) {
		MyCellTask mycellTask = myCellTasksMapper.getMyCellTaskById(id);
		return mycellTask;
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getMyCellTaskCount(Map<String, Object> parameter) {
		return myCellTasksMapper.getMyCellTaskCount(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	public int getMyCellTaskCountByQueryCriteria(MyCellTaskQuery query) {
		return myCellTasksMapper.getMyCellTaskCountByQueryCriteria(query);
	}

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	public List<MyCellTask> getMyCellTasks(Map<String, Object> parameter) {
		return myCellTasksMapper.getMyCellTasks(parameter);
	}

	public List<MyCellTask> getMyCellTasksByIndexId(int indexId, int intistasks) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("indexId", indexId);
		parameter.put("intistasks", intistasks);
		return myCellTasksMapper.getMyCellTasksByIndexId(parameter);
	}

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */

	public List<MyCellTask> getMyCellTasksByQueryCriteria(int start,
			int pageSize, MyCellTaskQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<MyCellTask> rows = sqlSession.selectList(
				"getMyCellTaskByQueryCriteria", query, rowBounds);
		return rows;
	}

	public List<MyCellTask> list(MyCellTaskQuery query) {
		query.ensureInitialized();
		List<MyCellTask> list = myCellTasksMapper
				.getMyCellTasksByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(MyCellTask mycellTasks) {
		if (StringUtils.isEmpty(mycellTasks.getId())) {
			mycellTasks.setId(idGenerator.getNextId());
			// mycellTasks.setId(idGenerator.getNextId());
			// mycellTasks.setCreateDate(new Date());
			myCellTasksMapper.insertMyCellTask(mycellTasks);
		} else {
			MyCellTask model = this.getMyCellTask(mycellTasks.getId());
			if (model != null) {
				if (mycellTasks.getName() != null) {
					model.setName(mycellTasks.getName());
				}
				if (mycellTasks.getIsused() != null) {
					model.setIsused(mycellTasks.getIsused());
				}
				if (mycellTasks.getBusiessId() != null) {
					model.setBusiessId(mycellTasks.getBusiessId());
				}
				model.setCelldotIndex(mycellTasks.getCelldotIndex());
				if (mycellTasks.getFiledotFileid() != null) {
					model.setFiledotFileid(mycellTasks.getFiledotFileid());
				}
				if (mycellTasks.getMname() != null) {
					model.setMname(mycellTasks.getMname());
				}
				if (mycellTasks.getSname() != null) {
					model.setSname(mycellTasks.getSname());
				}
				if (mycellTasks.getContent() != null) {
					model.setContent(mycellTasks.getContent());
				}
				model.setInttype(mycellTasks.getInttype());
				model.setIntcreatetype(mycellTasks.getIntcreatetype());
				if (mycellTasks.getTime1() != null) {
					model.setTime1(mycellTasks.getTime1());
				}
				if (mycellTasks.getTime2() != null) {
					model.setTime2(mycellTasks.getTime2());
				}
				if (mycellTasks.getTime3() != null) {
					model.setTime3(mycellTasks.getTime3());
				}
				model.setIssave(mycellTasks.getIssave());
				model.setIsuseworkflow(mycellTasks.getIsuseworkflow());
				model.setIndexId(mycellTasks.getIndexId());
				model.setIntflowortask(mycellTasks.getIntflowortask());
				if (mycellTasks.getFileidPress() != null) {
					model.setFileidPress(mycellTasks.getFileidPress());
				}
				if (mycellTasks.getInshowtaskinfo() != null) {
					model.setInshowtaskinfo(mycellTasks.getInshowtaskinfo());
				}
				if (mycellTasks.getFilenumid() != null) {
					model.setFilenumid(mycellTasks.getFilenumid());
				}
				myCellTasksMapper.updateMyCellTask(model);
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
	public void setMyCellTasksMapper(
			MyCellTaskMapper myCellTasksMapper) {
		this.myCellTasksMapper = myCellTasksMapper;
	}

	@javax.annotation.Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
