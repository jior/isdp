package com.glaf.liferay.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.liferay.domain.User;
import com.glaf.liferay.query.UserQuery;

@Transactional(readOnly = true)
public interface UserService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(Long id);

	/**
	 * 根据主键删除多条记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteByIds(List<Long> ids);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<User> list(UserQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getUserCountByQueryCriteria(UserQuery query);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<User> getUsersByQueryCriteria(int start, int pageSize, UserQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	User getUser(Long id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(User user);

}
