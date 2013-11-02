package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface INetRoleUseService {

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
	NetRoleUse getNetRoleUse(int id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getNetRoleUseCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getNetRoleUseCountByQueryCriteria(NetRoleUseQuery query);
	
	/**
	 * ��ȡĳ����ɫ�Ľ�ɫ��������
	 * @param roleId
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByRoleId(int roleId);
	
	/**
	 * ��ȡĳ���û��Ľ�ɫ����
	 * @param userId
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByUserId(String userId);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<NetRoleUse> getNetRoleUses(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByQueryCriteria(int start, int pageSize,
			NetRoleUseQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<NetRoleUse> list(NetRoleUseQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(NetRoleUse netRoleUse);

}
