package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellCriterionTreeService {

	/**
	 * 根据id删除记录
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
	void deleteByPimaryKey(int indexId);

	/**
	 * 根据id获取一条记录
	 * 
	 * @return
	 */
	CellCriterionTree getCellCriterionTreeById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellCriterionTree getCellCriterionTreeByPimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellCriterionTreeCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellCriterionTreeCountByQueryCriteria(CellCriterionTreeQuery query);

	List<CellCriterionTree> getCellCriterionTrees(int indexId, int intistasks);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellCriterionTree> getCellCriterionTrees(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellCriterionTree> getCellCriterionTreesByQueryCriteria(int start,
			int pageSize, CellCriterionTreeQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellCriterionTree> list(CellCriterionTreeQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellCriterionTree cellCriterionTree);

}
