package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataVirtableService {

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
	List<CellDataVirtable> list(CellDataVirtableQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataVirtableCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataVirtableCountByQueryCriteria(CellDataVirtableQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellDataVirtable> getCellDataVirtables(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellDataVirtable> getCellDataVirtablesByQueryCriteria(int start,
			int pageSize, CellDataVirtableQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellDataVirtable getCellDataVirtable(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataVirtable cellDataVirtable);

}
