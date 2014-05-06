package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpTreepnameService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	IsdpTreepname getTreepname(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepnameCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepnameCountByQueryCriteria(TreepnameQuery query);
	
	List<IsdpTreepname> getTreepnamesByDomainIndex(int domainIndex);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpTreepname> getTreepnames(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpTreepname> getTreepnamesByQueryCriteria(int start, int pageSize,
			TreepnameQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpTreepname> list(TreepnameQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpTreepname treepname);

}
