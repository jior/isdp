package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMailNewService {

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
	List<MailNew> list(MailNewQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMailNewCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMailNewCountByQueryCriteria(MailNewQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MailNew> getMailNews(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<MailNew> getMailNewsByQueryCriteria(int start, int pageSize,
			MailNewQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	MailNew getMailNew(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(MailNew mailNew);

}
