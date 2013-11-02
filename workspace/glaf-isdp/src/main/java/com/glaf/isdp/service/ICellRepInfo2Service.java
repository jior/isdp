package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellRepInfo2Service {

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
	CellRepInfo2 getCellRepInfo2(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellRepInfo2Count(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellRepInfo2CountByQueryCriteria(CellRepInfo2Query query);
	
	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2sByFiledotId(String filedotId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2s(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2sByQueryCriteria(int start, int pageSize,
			CellRepInfo2Query query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellRepInfo2> list(CellRepInfo2Query query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellRepInfo2 cellRepInfo2);

}
