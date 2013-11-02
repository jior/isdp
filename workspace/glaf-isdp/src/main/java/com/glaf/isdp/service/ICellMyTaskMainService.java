package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellMyTaskMainService {

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
	CellMyTaskMain getCellMyTaskMain(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellMyTaskMainCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellMyTaskMainCountByQueryCriteria(CellMyTaskMainQuery query);
	
	int getCellMyTaskMainIndexIdByFlowActId(String actId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellMyTaskMain> getCellMyTaskMains(Map<String, Object> parameter);
	
	
	 CellMyTaskMain getCellMyTaskMainByFlowActId(String id);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellMyTaskMain> getCellMyTaskMainsByQueryCriteria(int start,
			int pageSize, CellMyTaskMainQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellMyTaskMain> list(CellMyTaskMainQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellMyTaskMain cellMyTaskMain);

}
