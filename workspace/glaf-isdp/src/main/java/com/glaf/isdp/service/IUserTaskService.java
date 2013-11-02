package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IUserTaskService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(int id);
	
	@Transactional
	void deleteUserTasks(String actorId);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	UserTask getUserTask(int id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getUserTaskCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getUserTaskCountByQueryCriteria(UserTaskQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<UserTask> getUserTasks(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<UserTask> getUserTasksByQueryCriteria(int start, int pageSize,
			UserTaskQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<UserTask> list(UserTaskQuery query);
	
	/**
	 * ����װ���û������񣬰��մ���ʱ��������
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByTime(String actorId, String taskType);

	/**
	 * ����װ���û������񣬰���WBS������
	 * 
	 * @param actorId
	 * @param taskType
	 */
	@Transactional
	void reloadUserTasksGroupByWBS(String actorId, String taskType);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(UserTask userTask);

}
