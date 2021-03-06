package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellMyTaskMainService {

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
	CellMyTaskMain getCellMyTaskMain(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellMyTaskMainCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellMyTaskMainCountByQueryCriteria(CellMyTaskMainQuery query);
	
	int getCellMyTaskMainIndexIdByFlowActId(String actId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellMyTaskMain> getCellMyTaskMains(Map<String, Object> parameter);
	
	
	 CellMyTaskMain getCellMyTaskMainByFlowActId(String id);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellMyTaskMain> getCellMyTaskMainsByQueryCriteria(int start,
			int pageSize, CellMyTaskMainQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellMyTaskMain> list(CellMyTaskMainQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellMyTaskMain cellMyTaskMain);

}
