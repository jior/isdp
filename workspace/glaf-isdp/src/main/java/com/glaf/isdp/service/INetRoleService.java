package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface INetRoleService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(int id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	NetRole getNetRole(int id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetRoleCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetRoleCountByQueryCriteria(NetRoleQuery query);
	
	/**
	 * 获取用户的角色信息
	 * @param userId
	 * @return
	 */
	List<NetRole> getNetRolesByUserId(String userId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetRole> getNetRoles(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<NetRole> getNetRolesByQueryCriteria(int start, int pageSize,
			NetRoleQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetRole> list(NetRoleQuery query);
	
	Map<Integer, NetRole> getRoleMap();

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(NetRole netRole);

}
