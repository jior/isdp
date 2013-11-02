package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpFiledotService {

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
	IsdpFiledot getFiledot(String id);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFiledotCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getFiledotCountByQueryCriteria(FiledotQuery query);
	
	
	List<IsdpFiledot> getMyCellTaskFiles(int indexId, int intistasks);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpFiledot> getFiledots(Map<String, Object> parameter);
	
	/**
	 * ��ȡ�ҽӵ�ĳ��������ļ�����
	 * @param indexId
	 * @return
	 */
	List<IsdpFiledot> getFiledotsOfTreedot(int indexId);
	
	
	List<IsdpFiledot> getFiledotsByCheckItemId(String proj_chkitem_id);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<IsdpFiledot> getFiledotsByQueryCriteria(int start, int pageSize,
			FiledotQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<IsdpFiledot> list(FiledotQuery query);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpFiledot filedot);

}
