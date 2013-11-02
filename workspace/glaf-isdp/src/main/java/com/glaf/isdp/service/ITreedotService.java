package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreedotService {

	/**
	 * ��������ɾ����¼
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
	void deleteByPrimaryKey(int indexId);

	/**
	 * ��ȡ�ҽӵ�ĳ��������ļ�����
	 * 
	 * @param indexId
	 * @return
	 */
	List<IsdpFiledot> getFiledotsOfTreedot(int indexId);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	Treedot getTreedotById(String id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	Treedot getTreedotByPrimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreedotCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreedotCountByQueryCriteria(TreedotQuery query);

	List<String> getTreedotIdsByIndexId(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<Treedot> getTreedots(Map<String, Object> parameter);

	List<Treedot> getTreedotsByIdLike(String idLike);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<Treedot> getTreedotsByQueryCriteria(int start, int pageSize,
			TreedotQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<Treedot> list(TreedotQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(Treedot treedot);

}
