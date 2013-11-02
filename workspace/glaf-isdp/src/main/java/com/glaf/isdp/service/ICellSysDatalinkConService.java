package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellSysDatalinkConService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellSysDatalinkCon> list(CellSysDatalinkConQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellSysDatalinkConCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellSysDatalinkConCountByQueryCriteria(CellSysDatalinkConQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellSysDatalinkCon> getCellSysDatalinkCons(
			Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellSysDatalinkCon> getCellSysDatalinkConsByQueryCriteria(int start,
			int pageSize, CellSysDatalinkConQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	CellSysDatalinkCon getCellSysDatalinkCon(String id);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellSysDatalinkCon cellSysDatalinkCon);

}
