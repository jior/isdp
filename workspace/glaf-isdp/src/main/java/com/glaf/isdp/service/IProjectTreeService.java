package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectTreeService {

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
	ProjectTree getProjectTreeById(String id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	ProjectTree getProjectTreeByPrimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectTreeCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectTreeCountByQueryCriteria(ProjectTreeQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectTree> getProjectTrees(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<ProjectTree> getProjectTreesByQueryCriteria(int start, int pageSize,
			ProjectTreeQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectTree> list(ProjectTreeQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectTree projectTree);

}
