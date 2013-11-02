package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IUserTaskService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(int id);
	
	@Transactional
	void deleteUserTasks(String actorId);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	UserTask getUserTask(int id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getUserTaskCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getUserTaskCountByQueryCriteria(UserTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<UserTask> getUserTasks(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<UserTask> getUserTasksByQueryCriteria(int start, int pageSize,
			UserTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<UserTask> list(UserTaskQuery query);
	
	/**
	 * 重新装载用户的任务，按照传入时间做分组
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByTime(String actorId, String taskType);

	/**
	 * 重新装载用户的任务，按照WBS做分组
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByWBS(String actorId, String taskType);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(UserTask userTask);

}
