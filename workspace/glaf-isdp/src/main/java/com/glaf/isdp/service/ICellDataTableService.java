package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataTableService {

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
	CellDataTable getCellDataTable(String id);

	/**
	 * ���ݱ�����ȡ������Ϣ
	 * 
	 * @param tablename
	 * @return
	 */
	CellDataTable getCellDataTableByTablename(String tablename);

	/**
	 * ��ȡĳ�������һ������ֵ
	 * 
	 * @param tablename
	 * @param actorId
	 * @return
	 */
	String getNextId(String tablename, String actorId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataTableCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellDataTableCountByQueryCriteria(CellDataTableQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellDataTable> getCellDataTables(Map<String, Object> parameter);

	/**
	 * �����ļ���Ż�ȡ�������Ϣ��һ��Cell�ļ�����ֽ⵽���CellDataTable��
	 * 
	 * @param filedotFileId
	 * @return
	 */
	List<CellDataTable> getCellDataTablesByFiledotId(String filedotId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellDataTable> getCellDataTablesByQueryCriteria(int start,
			int pageSize, CellDataTableQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellDataTable> list(CellDataTableQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataTable cellDataTable);

	/**
	 * ��������
	 * @param tablename
	 * @param dataMap
	 */
	@Transactional
	void saveCellUserData(String tablename, Map<String, Object> dataMap);

}
