package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTreedotService {

	/**
	 * ����idɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * ����idɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteByPrimaryKey(int indexId);

	/**
	 * ����id��ȡһ����¼
	 * 
	 * @return
	 */
	CellTreedot getCellTreedotById(String id);

	/**
	 * ����indexId��ȡһ����¼
	 * 
	 * @return
	 */
	CellTreedot getCellTreedotByPrimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellTreedotCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellTreedotCountByQueryCriteria(CellTreedotQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedots(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByQueryCriteria(int start, int pageSize,
			CellTreedotQuery query);

	/**
	 * ����topId��ȡ�˵���
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByTopId(String topId);
	
	/**
	 * ���ݸ�ID��ȡ�����˵�
	 * @param parentId
	 * @return
	 */
	List<CellTreedot> getChildrenCellTreedots(int parentId);

	/**
	 * ��ȡtopIdΪsystem_init��ϵͳ�˵���
	 * 
	 * @return
	 */
	List<CellTreedot> getSystemInitCellTreedots();

	/**
	 * ����topId��ȡ����˵�
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellTreedot> list(CellTreedotQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreedot cellTreedot);

}
