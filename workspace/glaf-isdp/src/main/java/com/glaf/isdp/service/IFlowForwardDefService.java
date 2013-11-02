package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowForwardDefService {

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
	FlowForwardDef getFlowForwardDef(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowForwardDefCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowForwardDefCountByQueryCriteria(FlowForwardDefQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefs(Map<String, Object> parameter);
	
	
	/**
	 * �������̱�Ż�ȡ�֮���ת�ƹ�ϵ
	 * @param processDefId
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefsByProcessDefId(String processDefId);
	
	
	/**
	 * �������̱�Ż�ȡ�Ѿ�����Ļ֮���ת�ƹ�ϵ
	 * @param processId ���̱��
	 * @param processInstanceId ����ʵ�����
	 * @return
	 */
	List<FlowForwardDef> getProcessedFlowForwardDefsByProcessId(String processId, String processInstanceId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<FlowForwardDef> getFlowForwardDefsByQueryCriteria(int start,
			int pageSize, FlowForwardDefQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowForwardDef> list(FlowForwardDefQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowForwardDef flowForwardDef);

}
