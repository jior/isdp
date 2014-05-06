package com.glaf.isdp.service;

import java.util.*;

public interface IsdpTaskService {

	/**
	 * 获取某个用户的全部任务
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getAllTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * 获取某个用户的全部任务数
	 * 
	 * @param actorId
	 * @return
	 */
	int getAllTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * 获取某个用户的退回任务
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getFallbackTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * 获取某个用户的退回任务数
	 * 
	 * @param actorId
	 * @return
	 */
	int getFallbackTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * 获取某个用户的待办任务
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getTodoTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * 获取某个用户的待办任务数
	 * 
	 * @param actorId
	 * @return
	 */
	int getTodoTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * 获取某个用户的已办任务
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getWorkedTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * 获取某个用户的已办任务数
	 * 
	 * @param actorId
	 * @return
	 */
	int getWorkedTaskListCount(String actorId, Map<String, Object> params);

}
