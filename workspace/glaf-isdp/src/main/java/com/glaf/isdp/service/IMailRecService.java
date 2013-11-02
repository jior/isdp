package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMailRecService {

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
	List<MailRec> list(MailRecQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getMailRecCount(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡ��¼����
	 * 
	 * @return
	 */
	int getMailRecCountByQueryCriteria(MailRecQuery query);

	/**
	 * ���ݲ�ѯ������ȡ��¼�б�
	 * 
	 * @return
	 */
	List<MailRec> getMailRecs(Map<String, Object> parameter);

	/**
	 * ���ݲ�ѯ������ȡһҳ������
	 * 
	 * @return
	 */
	List<MailRec> getMailRecsByQueryCriteria(int start, int pageSize,
			MailRecQuery query);

	/**
	 * ����������ȡһ����¼
	 * 
	 * @return
	 */
	MailRec getMailRec(String id);

	/**
	 * �����ʼ�MessageId��ȡ�ʼ���Ϣ
	 * 
	 * @param messageId
	 * @return
	 */
	MailRec getMailRecByMessageId(String messageId);

	@Transactional
	String nextId();

	/**
	 * ����һ����¼
	 * 
	 * @return
	 */
	@Transactional
	void save(MailRec mailRec);

}
