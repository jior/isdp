package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTableTreeService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(Integer id);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellTableTree> list(CellTableTreeQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellTableTreeCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellTableTreeCountByQueryCriteria(CellTableTreeQuery query);
	
	/**
	 * ��ȡ�������ṹ����
	 * @return
	 */
	List<CellTableTree> getMgmtCellTableTrees();

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellTableTree> getCellTableTrees(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellTableTree> getCellTableTreesByQueryCriteria(int start,
			int pageSize, CellTableTreeQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	CellTableTree getCellTableTree(Integer id);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTableTree cellTableTree);

}
