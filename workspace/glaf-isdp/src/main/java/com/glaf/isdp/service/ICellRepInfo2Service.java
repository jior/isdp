package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellRepInfo2Service {

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
	CellRepInfo2 getCellRepInfo2(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfo2Count(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfo2CountByQueryCriteria(CellRepInfo2Query query);
	
	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2sByFiledotId(String filedotId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2s(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellRepInfo2> getCellRepInfo2sByQueryCriteria(int start, int pageSize,
			CellRepInfo2Query query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfo2> list(CellRepInfo2Query query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellRepInfo2 cellRepInfo2);

}
