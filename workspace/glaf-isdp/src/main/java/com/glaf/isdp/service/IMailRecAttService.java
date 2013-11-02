package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMailRecAttService {

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
	List<MailRecAtt> list(MailRecAttQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getMailRecAttCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getMailRecAttCountByQueryCriteria(MailRecAttQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<MailRecAtt> getMailRecAtts(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<MailRecAtt> getMailRecAttsByQueryCriteria(int start, int pageSize,
			MailRecAttQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	MailRecAtt getMailRecAtt(String id);

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(MailRecAtt mailRecAtt);

}
