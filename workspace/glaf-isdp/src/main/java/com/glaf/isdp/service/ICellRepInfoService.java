package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellRepInfoService {

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
	CellRepInfo getCellRepInfo(String id);
	
	/**
	 * �����������ظö��󼰸���������Ϣ
	 * @param id
	 * @return
	 */
	CellRepInfo getCellRepInfoWithAll(String id);
	
	/**
	 * ��ȡĳ����ɫĳ�����ĵ�Ԫ����Ϣ
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	List<CellRepInfo> getRoleUseExistsCellRepInfos(String filedot_fileid, int roleid, int celltreedot_index);
	
	/**
	 * ��ȡĳ����ɫĳ�����ĵ�Ԫ����Ϣ
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	List<CellRepInfo> getRoleUseNotExistsCellRepInfos(String filedot_fileid, int roleid, int celltreedot_index);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellRepInfoCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getCellRepInfoCountByQueryCriteria(CellRepInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellRepInfo> getCellRepInfos(Map<String, Object> parameter);

	/**
	 * �����ļ���Ż�ȡ�������Ϣ
	 * 
	 * @param filedotId
	 * @return
	 */
	List<CellRepInfo> getCellRepInfosByFiledotId(String filedotId);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<CellRepInfo> getCellRepInfosByQueryCriteria(int start, int pageSize,
			CellRepInfoQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<CellRepInfo> list(CellRepInfoQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(CellRepInfo cellRepInfo);

}
