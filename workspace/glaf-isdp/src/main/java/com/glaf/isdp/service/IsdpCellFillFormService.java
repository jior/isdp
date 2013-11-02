package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.util.Paging;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpCellFillFormService {

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
	IsdpCellFillForm getCellFillForm(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellFillFormCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellFillFormCountByQueryCriteria(CellFillFormQuery query);
	
	
	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> getCellFillForms(Map<String, Object> parameter);
	
	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> getCellFillFormsByQueryCriteria(int start, int pageSize,
			CellFillFormQuery query);
	
	IsdpCellFillForm getCellFillFormWithAll(String id);

	int getFileCellFillFormCount(String idLike, int indexId);

	List<IsdpCellFillForm> getFileCellFillFormList(String idLike, int indexId);

	/**
	 * ��ȡһҳ����д��¼
	 * @param pageNo ҳ��,��1��ʼ
	 * @param pageSize
	 * @param idLike
	 * @param indexId
	 * @return
	 */
	Paging getPageFileCellFillForm(int pageNo, int pageSize, String idLike, int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> list(CellFillFormQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpCellFillForm cellFillform);

}
