package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreewbsAutoindexService {

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
	TreewbsAutoindex getTreewbsAutoindex(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreewbsAutoindexCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreewbsAutoindexCountByQueryCriteria(TreewbsAutoindexQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreewbsAutoindex> getTreewbsAutoindexs(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<TreewbsAutoindex> getTreewbsAutoindexsByQueryCriteria(int start,
			int pageSize, TreewbsAutoindexQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreewbsAutoindex> list(TreewbsAutoindexQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(TreewbsAutoindex treewbsAutoindex);

}
