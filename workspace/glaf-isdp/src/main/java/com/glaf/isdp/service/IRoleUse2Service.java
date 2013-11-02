package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface IRoleUse2Service {
	 
    /**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void deleteById(String id);

    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<RoleUse2> list(RoleUse2Query query);

    /**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getRoleUse2Count(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	 int getRoleUse2CountByQueryCriteria(RoleUse2Query query);


    /**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	 List<RoleUse2> getRoleUse2s(Map<String, Object> parameter);


	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	 List<RoleUse2> getRoleUse2sByQueryCriteria(int start, int pageSize,
			RoleUse2Query query);


    /**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	 RoleUse2 getRoleUse2(String id);

    /**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	 void save(RoleUse2 roleUse2);

}
