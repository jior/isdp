package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellUpicInfoService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);
	
	/**
	 * ��������ɾ��������¼
	 * @param rowIds
	 */
	@Transactional
	void deleteByIds(List<String> rowIds);
	
	
	IsdpDataFile getCellDataFileById(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellUpicInfo> list(CellUpicInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfos(int treeFolderIndexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellUpicInfoCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellUpicInfoCountByQueryCriteria(CellUpicInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfos(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfosByQueryCriteria(int start, int pageSize,
			CellUpicInfoQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	CellUpicInfo getCellUpicInfo(String id);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellUpicInfo cellUpicInfo);

}
