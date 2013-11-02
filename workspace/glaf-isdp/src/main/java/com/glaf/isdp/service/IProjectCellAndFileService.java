package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IProjectCellAndFileService {

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
	ProjectCellAndFile getProjectCellAndFile(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectCellAndFileCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getProjectCellAndFileCountByQueryCriteria(ProjectCellAndFileQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> getProjectCellAndFiles(
			Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> getProjectCellAndFilesByQueryCriteria(int start,
			int pageSize, ProjectCellAndFileQuery query);

	/**
	 * 获取WBS中文件检查信息
	 * 
	 * @param indexId
	 * @return
	 */
	List<ProjectCellAndFile> getWbsFileProjectCellAndFileByIndexId(int indexId);

	/**
	 * 获取WBS中表格检查信息
	 * 
	 * @param indexId
	 * @return
	 */
	List<ProjectCellAndFile> getWbsProjectCellAndFileByIndexId(int indexId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<ProjectCellAndFile> list(ProjectCellAndFileQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(ProjectCellAndFile projectCellAndFile);

}
