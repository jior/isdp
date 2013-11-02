package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface IProjectOrganizationService {
	 
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
	 List<ProjectOrganization> list(ProjectOrganizationQuery query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getProjectOrganizationCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getProjectOrganizationCountByQueryCriteria(ProjectOrganizationQuery query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<ProjectOrganization> getProjectOrganizations(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<ProjectOrganization> getProjectOrganizationsByQueryCriteria(int start, int pageSize,
			ProjectOrganizationQuery query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 ProjectOrganization getProjectOrganization(Integer id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(ProjectOrganization projectOrganization);

}
