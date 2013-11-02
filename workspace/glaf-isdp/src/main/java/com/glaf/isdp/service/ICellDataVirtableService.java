package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataVirtableService {

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
	List<CellDataVirtable> list(CellDataVirtableQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataVirtableCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataVirtableCountByQueryCriteria(CellDataVirtableQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellDataVirtable> getCellDataVirtables(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellDataVirtable> getCellDataVirtablesByQueryCriteria(int start,
			int pageSize, CellDataVirtableQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	CellDataVirtable getCellDataVirtable(String id);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataVirtable cellDataVirtable);

}
