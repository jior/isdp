package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectCellAndFileService {

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
	ProjectCellAndFile getProjectCellAndFile(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectCellAndFileCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getProjectCellAndFileCountByQueryCriteria(ProjectCellAndFileQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> getProjectCellAndFiles(
			Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> getProjectCellAndFilesByQueryCriteria(int start,
			int pageSize, ProjectCellAndFileQuery query);

	/**
	 * ��ȡWBS���ļ������Ϣ
	 * 
	 * @param indexId
	 * @return
	 */
	List<ProjectCellAndFile> getWbsFileProjectCellAndFileByIndexId(int indexId);

	/**
	 * ��ȡWBS�б������Ϣ
	 * 
	 * @param indexId
	 * @return
	 */
	List<ProjectCellAndFile> getWbsProjectCellAndFileByIndexId(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> list(ProjectCellAndFileQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectCellAndFile projectCellAndFile);

}
