package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpPfileService {

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
	IsdpPfile getPfile(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getPfileCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getPfileCountByQueryCriteria(PfileQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpPfile> getPfiles(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpPfile> getPfilesByQueryCriteria(int start, int pageSize,
			PfileQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpPfile> list(PfileQuery query);
	
	int getTreePfileCount(String treepinfoIdLike, String nodetype, String filingflag);
	
	List<IsdpPfile> getTreePfiles(String treepinfoIdLike, String nodetype, String filingflag);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpPfile pfile);

}
