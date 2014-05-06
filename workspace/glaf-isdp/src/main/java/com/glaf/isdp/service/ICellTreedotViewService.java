package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTreedotViewService {

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
	CellTreedotView getCellTreedotView(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotViewCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotViewCountByQueryCriteria(CellTreedotViewQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedotView> getCellTreedotViews(Map<String, Object> parameter);
	
	
	List<CellTreedotView> getCellTreedotViews(int indexId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTreedotView> getCellTreedotViewsByQueryCriteria(int start,
			int pageSize, CellTreedotViewQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedotView> list(CellTreedotViewQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreedotView cellTreedotView);

}
