package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellSysDatalinkConService {

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
	List<CellSysDatalinkCon> list(CellSysDatalinkConQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellSysDatalinkConCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellSysDatalinkConCountByQueryCriteria(CellSysDatalinkConQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellSysDatalinkCon> getCellSysDatalinkCons(
			Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellSysDatalinkCon> getCellSysDatalinkConsByQueryCriteria(int start,
			int pageSize, CellSysDatalinkConQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellSysDatalinkCon getCellSysDatalinkCon(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellSysDatalinkCon cellSysDatalinkCon);

}
