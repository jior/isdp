package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellMenuListService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellMenuList> list(CellMenuListQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellMenuListCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellMenuListCountByQueryCriteria(CellMenuListQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellMenuList> getCellMenuLists(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellMenuList> getCellMenuListsByQueryCriteria(int start, int pageSize,
			CellMenuListQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellMenuList getCellMenuList(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellMenuList cellMenuList);

}
