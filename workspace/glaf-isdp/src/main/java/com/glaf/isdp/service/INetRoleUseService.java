package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface INetRoleUseService {

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
	NetRoleUse getNetRoleUse(int id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetRoleUseCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getNetRoleUseCountByQueryCriteria(NetRoleUseQuery query);
	
	/**
	 * 获取某个角色的角色树表引用
	 * @param roleId
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByRoleId(int roleId);
	
	/**
	 * 获取某个用户的角色引用
	 * @param userId
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByUserId(String userId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetRoleUse> getNetRoleUses(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<NetRoleUse> getNetRoleUsesByQueryCriteria(int start, int pageSize,
			NetRoleUseQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<NetRoleUse> list(NetRoleUseQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(NetRoleUse netRoleUse);

}
