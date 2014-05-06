package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellRepInfoChartService {

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
	List<CellRepInfoChart> list(CellRepInfoChartQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfoChartCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfoChartCountByQueryCriteria(CellRepInfoChartQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfoChart> getCellRepInfoCharts(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellRepInfoChart> getCellRepInfoChartsByQueryCriteria(int start,
			int pageSize, CellRepInfoChartQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellRepInfoChart getCellRepInfoChart(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellRepInfoChart cellRepInfoChart);

}
