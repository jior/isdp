package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IMyCellBusiessService {

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
	MyCellBusiess getMyCellBusiess(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellBusiessCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getMyCellBusiessCountByQueryCriteria(MyCellBusiessQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellBusiess> getMyCellBusiesss(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<MyCellBusiess> getMyCellBusiesssByQueryCriteria(int start,
			int pageSize, MyCellBusiessQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<MyCellBusiess> list(MyCellBusiessQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(MyCellBusiess mycellBusiess);

}
