package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellCriterionTreeService {

	/**
	 * ����idɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteByPimaryKey(int indexId);

	/**
	 * ����id��ȡһ����¼
	 * 
	 * @return
	 */
	CellCriterionTree getCellCriterionTreeById(String id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	CellCriterionTree getCellCriterionTreeByPimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellCriterionTreeCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellCriterionTreeCountByQueryCriteria(CellCriterionTreeQuery query);

	List<CellCriterionTree> getCellCriterionTrees(int indexId, int intistasks);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellCriterionTree> getCellCriterionTrees(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellCriterionTree> getCellCriterionTreesByQueryCriteria(int start,
			int pageSize, CellCriterionTreeQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellCriterionTree> list(CellCriterionTreeQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellCriterionTree cellCriterionTree);

}
