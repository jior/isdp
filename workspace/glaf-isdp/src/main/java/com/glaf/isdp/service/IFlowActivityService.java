package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowActivityService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	FlowActivity getFlowActivity(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowActivityCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowActivityCountByQueryCriteria(FlowActivityQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowActivity> getFlowActivities(Map<String, Object> parameter);
	
	List<FlowActivity> getFlowActivities(int mytaskmainIndexId,
			String mycellTaskId, String activityDefId);
	
	/**
	 * ��ȡ�Ѿ�������Ļʵ����Ϣ
	 * @param processInstanceId
	 * @return
	 */
	List<FlowActivity> getFlowActivitiesByProcessInstanceId(String processInstanceId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<FlowActivity> getFlowActivitiesByQueryCriteria(int start, int pageSize,
			FlowActivityQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowActivity> list(FlowActivityQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowActivity flowActivity);

}
