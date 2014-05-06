package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTreehintService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteByPrimaryKey(int indexId);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellTreehint getCellTreehintById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellTreehint getCellTreehintByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreehintCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreehintCountByQueryCriteria(CellTreehintQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreehint> getCellTreehints(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTreehint> getCellTreehintsByQueryCriteria(int start, int pageSize,
			CellTreehintQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreehint> list(CellTreehintQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreehint cellTreehint);

}
