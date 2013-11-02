package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFlowActivityDefService {

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
	FlowActivityDef getFlowActivityDef(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowActivityDefCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFlowActivityDefCountByQueryCriteria(FlowActivityDefQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefs(Map<String, Object> parameter);
	
	
	List<FlowActivityDef> getFlowActivityDefsByMainId(String mainId);
	
	/**
	 * �������̱�Ż�ȡ���̵Ļ�ڵ�
	 * @param processDefId
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefsByProcessDefId(String processDefId);
	
	/**
	 * �������̱�Ż�ȡ���̻�Ծ�ڵ����Ϣ(���������еĽڵ���Ϣ)
	 * @param processId
	 * @return
	 */
	List<FlowActivityDef> getCurrentActiveFlowActivityDefsByProcessId(String processId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<FlowActivityDef> getFlowActivityDefsByQueryCriteria(int start,
			int pageSize, FlowActivityDefQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<FlowActivityDef> list(FlowActivityDefQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(FlowActivityDef flowActivityDef);

}
