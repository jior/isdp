package com.glaf.isdp.service;

import java.util.*;

public interface IsdpTaskService {

	/**
	 * ��ȡĳ���û���ȫ������
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getAllTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * ��ȡĳ���û���ȫ��������
	 * 
	 * @param actorId
	 * @return
	 */
	int getAllTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * ��ȡĳ���û����˻�����
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getFallbackTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * ��ȡĳ���û����˻�������
	 * 
	 * @param actorId
	 * @return
	 */
	int getFallbackTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * ��ȡĳ���û��Ĵ�������
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getTodoTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * ��ȡĳ���û��Ĵ���������
	 * 
	 * @param actorId
	 * @return
	 */
	int getTodoTaskListCount(String actorId, Map<String, Object> params);

	/**
	 * ��ȡĳ���û����Ѱ�����
	 * 
	 * @param actorId
	 * @return
	 */
	List<Map<String, Object>> getWorkedTaskList(String actorId,
			Map<String, Object> params);

	/**
	 * ��ȡĳ���û����Ѱ�������
	 * 
	 * @param actorId
	 * @return
	 */
	int getWorkedTaskListCount(String actorId, Map<String, Object> params);

}
