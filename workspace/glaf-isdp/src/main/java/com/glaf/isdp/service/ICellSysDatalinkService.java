package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellSysDatalinkService {

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
	List<CellSysDatalink> list(CellSysDatalinkQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellSysDatalinkCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellSysDatalinkCountByQueryCriteria(CellSysDatalinkQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellSysDatalink> getCellSysDatalinks(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellSysDatalink> getCellSysDatalinksByQueryCriteria(int start,
			int pageSize, CellSysDatalinkQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellSysDatalink getCellSysDatalink(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellSysDatalink cellSysDatalink);

}
