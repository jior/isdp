package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreevmainService {

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
	void deleteByPrimaryKey(int indexId);

	/**
	 * ����id��ȡһ����¼
	 * 
	 * @return
	 */
	Treevmain getTreevmainById(String id);
	
	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	Treevmain getTreevmainByPrimaryKey(int indexId);


	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreevmainCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreevmainCountByQueryCriteria(TreevmainQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<Treevmain> getTreevmains(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<Treevmain> getTreevmainsByQueryCriteria(int start, int pageSize,
			TreevmainQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<Treevmain> list(TreevmainQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(Treevmain treevmain);

}
