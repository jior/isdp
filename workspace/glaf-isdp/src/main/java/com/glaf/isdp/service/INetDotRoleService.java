package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface INetDotRoleService {

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
	NetDotRole getNetDotRole(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetDotRoleCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetDotRoleCountByQueryCriteria(NetDotRoleQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetDotRole> getNetDotRoles(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<NetDotRole> getNetDotRolesByQueryCriteria(int start, int pageSize,
			NetDotRoleQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetDotRole> list(NetDotRoleQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(NetDotRole netDotRole);

}
