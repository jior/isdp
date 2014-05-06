package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreepInfoUserService {

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
	TreepInfoUser getTreepInfoUser(int id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepInfoUserCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepInfoUserCountByQueryCriteria(TreepInfoUserQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreepInfoUser> getTreepInfoUsers(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<TreepInfoUser> getTreepInfoUsersByQueryCriteria(int start,
			int pageSize, TreepInfoUserQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreepInfoUser> list(TreepInfoUserQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(TreepInfoUser treepInfoUser);

}
