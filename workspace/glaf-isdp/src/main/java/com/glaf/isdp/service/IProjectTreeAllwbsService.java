package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectTreeAllwbsService {

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
	ProjectTreeAllwbs getProjectTreeAllwbsById(String id);
	
	ProjectTreeAllwbs getProjectTreeAllwbsByPrimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectTreeAllwbsCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectTreeAllwbsCountByQueryCriteria(ProjectTreeAllwbsQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> getProjectTreeAllwbss(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> getProjectTreeAllwbssByQueryCriteria(int start,
			int pageSize, ProjectTreeAllwbsQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> list(ProjectTreeAllwbsQuery query);
	
	/**
	 * ����ִ�����
	 * @param treepinfoIndexId
	 */
	@Transactional
	void reloadExecution(int treepinfoIndexId);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectTreeAllwbs projectTreeAllwbs);

}
