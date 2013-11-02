package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellUpicInfoService {

	/**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);
	
	/**
	 * 根据主键删除多条记录
	 * @param rowIds
	 */
	@Transactional
	void deleteByIds(List<String> rowIds);
	
	
	IsdpDataFile getCellDataFileById(String id);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellUpicInfo> list(CellUpicInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfos(int treeFolderIndexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellUpicInfoCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellUpicInfoCountByQueryCriteria(CellUpicInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfos(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellUpicInfo> getCellUpicInfosByQueryCriteria(int start, int pageSize,
			CellUpicInfoQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	CellUpicInfo getCellUpicInfo(String id);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellUpicInfo cellUpicInfo);

}
