package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreeFolderService {

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
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	TreeFolder getTreeFolderById(String id);
	
	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreeFolderCount(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreeFolderCountByQueryCriteria(TreeFolderQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	TreeFolder getTreeFolderPrimaryKey(int indexId);

	/**
	 * 
	 * @param inttype
	 * @param menuindex
	 * @return
	 */
	List<TreeFolder> getTreeFolders(int inttype, int menuindex);
	
	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<TreeFolder> getTreeFolders(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<TreeFolder> getTreeFoldersByQueryCriteria(int start, int pageSize,
			TreeFolderQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<TreeFolder> list(TreeFolderQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(TreeFolder treeFolder);

}
