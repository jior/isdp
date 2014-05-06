package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpPfileAttService {

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
	IsdpPfileAtt getPfileAtt(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getPfileAttCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getPfileAttCountByQueryCriteria(PfileAttQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpPfileAtt> getPfileAtts(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpPfileAtt> getPfileAttsByQueryCriteria(int start, int pageSize,
			PfileAttQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpPfileAtt> list(PfileAttQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpPfileAtt pfileAtt);

}
