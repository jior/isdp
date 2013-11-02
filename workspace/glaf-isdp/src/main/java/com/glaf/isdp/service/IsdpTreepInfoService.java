package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpTreepInfoService {

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
	IsdpTreepInfo getTreepInfoById(String id);
	
	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	IsdpTreepInfo getTreepInfoByPrimaryKey(int indexId);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreepInfoCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getTreepInfoCountByQueryCriteria(TreepInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> getTreepInfos(Map<String, Object> parameter);
	
	List<String> getTreepInfoIds(String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfos(String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfosByTreedotIndexId(int indexId);
	
	List<IsdpTreepInfo> getWfTreepInfos(int indexId, String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfoList(List<String> rowIds, int topId, String nodetype);
	
	/**
	 * ��ȡWBS������Ϣ
	 * @param indexId
	 * @return
	 */
	List<IsdpTreepInfo> getWbsTreepInfosByIndexId(int indexId);
	
	List<IsdpTreepInfo> getTreepInfosByTopId(String nodeType, int topId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> getTreepInfosByQueryCriteria(int start, int pageSize,
			TreepInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> list(TreepInfoQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpTreepInfo treepInfo);

}
