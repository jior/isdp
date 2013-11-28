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
import com.glaf.isdp.domain.FlowActivity;
import com.glaf.isdp.mapper.FlowActivityMapper;
import com.glaf.isdp.query.FlowActivityQuery;
import com.glaf.isdp.service.IFlowActivityService;

@Service("flowActivityService")
@Transactional(readOnly = true)
public class MxFlowActivityServiceImpl implements IFlowActivityService {
	protected static final Log logger = LogFactory
			.getLog(MxFlowActivityServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected SqlSession sqlSession;

	protected FlowActivityMapper flowActivityMapper;

	public MxFlowActivityServiceImpl() {

	}

	public int count(FlowActivityQuery query) {
		query.ensureInitialized();
		return flowActivityMapper
				.getFlowActivityCountByQueryCriteria(query);
	}

	@Transactional
	public void deleteById(String id) {
		flowActivityMapper.deleteFlowActivityById(id);
	}

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	public List<FlowActivity> getFlowActivities(Map<String, Object> parameter) {
		return flowActivityMapper.getFlowActivities(parameter);
	}

	public List<FlowActivity> getFlowActivities(int mytaskmainIndexId,
			String mycellTaskId, String activityDefId) {
		Map<String, Object> parameter = new HashMap<String, Object>();
		parameter.put("mytaskmainIndexId", mytaskmainIndexId);
		parameter.put("mycellTaskId", mycellTaskId);
		parameter.put("activityDefId", activityDefId);
		return flowActivityMapper.getFlowActivitiesByTaskId(parameter);
	}

	/**
	 * 获取已经处理过的活动实例信息
	 * 
	 * @param processInstanceId
	 * @return
	 */
	public List<FlowActivity> getFlowActivitiesByProcessInstanceId(
			String processInstanceId) {
		return flowActivityMapper
				.getFlowActivitiesByProcessInstanceId(processInstanceId);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<FlowActivity> getFlowActivitiesByQueryCriteria(int start,
			int pageSize, FlowActivityQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<FlowActivity> rows = sqlSession.selectList(
				"getFlowActivitiesByQueryCriteria", query, rowBounds);
		return rows;
	}

	public FlowActivity getFlowActivity(String id) {
		FlowActivity flowActivity = flowActivityMapper
				.getFlowActivityById(id);
		return flowActivity;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityCount(Map<String, Object> parameter) {
		return flowActivityMapper.getFlowActivityCount(parameter);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getFlowActivityCountByQueryCriteria(FlowActivityQuery query) {
		return flowActivityMapper
				.getFlowActivityCountByQueryCriteria(query);
	}

	public List<FlowActivity> list(FlowActivityQuery query) {
		query.ensureInitialized();
		List<FlowActivity> list = flowActivityMapper
				.getFlowActivitiesByQueryCriteria(query);
		return list;
	}

	@Transactional
	public void save(FlowActivity flowActivity) {
		if (StringUtils.isEmpty(flowActivity.getId())) {
			flowActivity.setId(idGenerator.getNextId());
			// flowActivity.setId(idGenerator.getNextId());
			// flowActivity.setCreateDate(new Date());
			flowActivityMapper.insertFlowActivity(flowActivity);
		} else {
			FlowActivity model = this.getFlowActivity(flowActivity.getId());
			if (model != null) {
				if (flowActivity.getActivDefId() != null) {
					model.setActivDefId(flowActivity.getActivDefId());
				}
				if (flowActivity.getProcessId() != null) {
					model.setProcessId(flowActivity.getProcessId());
				}
				if (flowActivity.getTypeofact() != null) {
					model.setTypeofact(flowActivity.getTypeofact());
				}
				if (flowActivity.getName() != null) {
					model.setName(flowActivity.getName());
				}
				if (flowActivity.getContent() != null) {
					model.setContent(flowActivity.getContent());
				}
				if (flowActivity.getStrfuntion() != null) {
					model.setStrfuntion(flowActivity.getStrfuntion());
				}
				if (flowActivity.getNetroleid() != null) {
					model.setNetroleid(flowActivity.getNetroleid());
				}
				if (flowActivity.getUserid() != null) {
					model.setUserid(flowActivity.getUserid());
				}
				model.setListno(flowActivity.getListno());
				model.setTimelimit(flowActivity.getTimelimit());
				if (flowActivity.getCtimeStart() != null) {
					model.setCtimeStart(flowActivity.getCtimeStart());
				}
				if (flowActivity.getCtimeEnd() != null) {
					model.setCtimeEnd(flowActivity.getCtimeEnd());
				}
				model.setState(flowActivity.getState());
				model.setIntback(flowActivity.getIntback());
				flowActivityMapper.updateFlowActivity(model);
			}
		}
	}

 
	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource
	public void setFlowActivityMapper(
			FlowActivityMapper flowActivityMapper) {
		this.flowActivityMapper = flowActivityMapper;
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
