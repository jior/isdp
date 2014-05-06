package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTreedotPerService {

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
	CellTreedotPer getCellTreedotPer(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotPerCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotPerCountByQueryCriteria(CellTreedotPerQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedotPer> getCellTreedotPers(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTreedotPer> getCellTreedotPersByQueryCriteria(int start,
			int pageSize, CellTreedotPerQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedotPer> list(CellTreedotPerQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreedotPer cellTreedotPer);

}
