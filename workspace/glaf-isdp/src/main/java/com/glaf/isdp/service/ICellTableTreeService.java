package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTableTreeService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(Integer id);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTableTree> list(CellTableTreeQuery query);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTableTreeCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTableTreeCountByQueryCriteria(CellTableTreeQuery query);
	
	/**
	 * 获取管理大类结构定义
	 * @return
	 */
	List<CellTableTree> getMgmtCellTableTrees();

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTableTree> getCellTableTrees(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTableTree> getCellTableTreesByQueryCriteria(int start,
			int pageSize, CellTableTreeQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellTableTree getCellTableTree(Integer id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTableTree cellTableTree);

}
