package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpDotuseService {

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
	IsdpDotuse getDotuse(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getDotuseCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getDotuseCountByQueryCriteria(DotuseQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpDotuse> getDotuses(Map<String, Object> parameter);

	List<IsdpDotuse> getDotuses(String topId, int type);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpDotuse> getDotusesByQueryCriteria(int start, int pageSize,
			DotuseQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpDotuse> list(DotuseQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpDotuse dotuse);

}
