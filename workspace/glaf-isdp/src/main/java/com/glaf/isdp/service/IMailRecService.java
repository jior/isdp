package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMailRecService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MailRec> list(MailRecQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMailRecCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMailRecCountByQueryCriteria(MailRecQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MailRec> getMailRecs(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<MailRec> getMailRecsByQueryCriteria(int start, int pageSize,
			MailRecQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	MailRec getMailRec(String id);

	/**
	 * 根据邮件MessageId获取邮件信息
	 * 
	 * @param messageId
	 * @return
	 */
	MailRec getMailRecByMessageId(String messageId);

	@Transactional
	String nextId();

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(MailRec mailRec);

}
