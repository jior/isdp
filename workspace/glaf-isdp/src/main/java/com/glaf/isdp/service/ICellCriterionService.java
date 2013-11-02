package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellCriterionService {

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
	CellCriterion getCellCriterion(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellCriterionCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellCriterionCountByQueryCriteria(CellCriterionQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellCriterion> getCellCriterions(Map<String, Object> parameter);
	
	List<CellCriterion> getCellCriterionByWBS(int wbsIndexId, int intistasks);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellCriterion> getCellCriterionsByQueryCriteria(int start,
			int pageSize, CellCriterionQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellCriterion> list(CellCriterionQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellCriterion cellCriterion);

}
