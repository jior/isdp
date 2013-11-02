package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface INetRoleService {

	/**
	 * ��������ɾ����¼
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(int id);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	NetRole getNetRole(int id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getNetRoleCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getNetRoleCountByQueryCriteria(NetRoleQuery query);
	
	/**
	 * ��ȡ�û��Ľ�ɫ��Ϣ
	 * @param userId
	 * @return
	 */
	List<NetRole> getNetRolesByUserId(String userId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<NetRole> getNetRoles(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<NetRole> getNetRolesByQueryCriteria(int start, int pageSize,
			NetRoleQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<NetRole> list(NetRoleQuery query);
	
	Map<Integer, NetRole> getRoleMap();

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(NetRole netRole);

}
