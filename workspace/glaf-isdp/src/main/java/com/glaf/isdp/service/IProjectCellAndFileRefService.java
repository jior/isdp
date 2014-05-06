package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectCellAndFileRefService {

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
	ProjectCellAndFileRef getProjectCellAndFileRef(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectCellAndFileRefCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectCellAndFileRefCountByQueryCriteria(
			ProjectCellAndFileRefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectCellAndFileRef> getProjectCellAndFileRefs(
			Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<ProjectCellAndFileRef> getProjectCellAndFileRefsByQueryCriteria(
			int start, int pageSize, ProjectCellAndFileRefQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectCellAndFileRef> list(ProjectCellAndFileRefQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectCellAndFileRef projectCellAndFileRef);

}
