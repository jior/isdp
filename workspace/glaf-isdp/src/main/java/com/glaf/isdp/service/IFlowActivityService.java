package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowActivityService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	FlowActivity getFlowActivity(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFlowActivityCountByQueryCriteria(FlowActivityQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivity> getFlowActivities(Map<String, Object> parameter);
	
	List<FlowActivity> getFlowActivities(int mytaskmainIndexId,
			String mycellTaskId, String activityDefId);
	
	/**
	 * 获取已经处理过的活动实例信息
	 * @param processInstanceId
	 * @return
	 */
	List<FlowActivity> getFlowActivitiesByProcessInstanceId(String processInstanceId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FlowActivity> getFlowActivitiesByQueryCriteria(int start, int pageSize,
			FlowActivityQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FlowActivity> list(FlowActivityQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowActivity flowActivity);

}
