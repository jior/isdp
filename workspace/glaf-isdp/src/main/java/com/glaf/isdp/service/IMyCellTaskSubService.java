package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMyCellTaskSubService {

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
	MyCellTaskSub getMyCellTaskSub(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellTaskSubCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellTaskSubCountByQueryCriteria(MyCellTaskSubQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellTaskSub> getMyCellTaskSubs(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<MyCellTaskSub> getMyCellTaskSubsByQueryCriteria(int start,
			int pageSize, MyCellTaskSubQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellTaskSub> list(MyCellTaskSubQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(MyCellTaskSub mycellTasksSub);

}
