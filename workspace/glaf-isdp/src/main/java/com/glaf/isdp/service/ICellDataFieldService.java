package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataFieldService {

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
	CellDataField getCellDataField(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataFieldCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataFieldCountByQueryCriteria(CellDataFieldQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellDataField> getCellDataFields(Map<String, Object> parameter);
	
	/**
	 * ���ݱ�ID��ȡ�ֶ���Ϣ
	 * @param tableId
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByTableId(String tableId);
	
	/**
	 * ���ݱ��ļ���Ż�ȡ�ֶ���Ϣ
	 * @param filedotId
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByFiledotId(String filedotId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByQueryCriteria(int start,
			int pageSize, CellDataFieldQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellDataField> list(CellDataFieldQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataField cellDataField);

}
