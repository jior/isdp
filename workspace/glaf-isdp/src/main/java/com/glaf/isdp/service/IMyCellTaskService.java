package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMyCellTaskService {

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
	MyCellTask getMyCellTask(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellTaskCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellTaskCountByQueryCriteria(MyCellTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellTask> getMyCellTasks(Map<String, Object> parameter);
	
	List<MyCellTask> getMyCellTasksByIndexId(int indexId, int intistasks);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<MyCellTask> getMyCellTasksByQueryCriteria(int start, int pageSize,
			MyCellTaskQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellTask> list(MyCellTaskQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(MyCellTask mycellTask);

}
