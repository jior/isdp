package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectTreeAllwbsService {

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
	ProjectTreeAllwbs getProjectTreeAllwbsById(String id);
	
	ProjectTreeAllwbs getProjectTreeAllwbsByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectTreeAllwbsCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectTreeAllwbsCountByQueryCriteria(ProjectTreeAllwbsQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> getProjectTreeAllwbss(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> getProjectTreeAllwbssByQueryCriteria(int start,
			int pageSize, ProjectTreeAllwbsQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectTreeAllwbs> list(ProjectTreeAllwbsQuery query);
	
	/**
	 * 重载执行情况
	 * @param treepinfoIndexId
	 */
	@Transactional
	void reloadExecution(int treepinfoIndexId);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectTreeAllwbs projectTreeAllwbs);

}
