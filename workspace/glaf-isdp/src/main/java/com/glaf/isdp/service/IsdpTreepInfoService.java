package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpTreepInfoService {

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
	IsdpTreepInfo getTreepInfoById(String id);
	
	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	IsdpTreepInfo getTreepInfoByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepInfoCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreepInfoCountByQueryCriteria(TreepInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> getTreepInfos(Map<String, Object> parameter);
	
	List<String> getTreepInfoIds(String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfos(String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfosByTreedotIndexId(int indexId);
	
	List<IsdpTreepInfo> getWfTreepInfos(int indexId, String strfuntion);
	
	List<IsdpTreepInfo> getTreepInfoList(List<String> rowIds, int topId, String nodetype);
	
	/**
	 * 获取WBS工程信息
	 * @param indexId
	 * @return
	 */
	List<IsdpTreepInfo> getWbsTreepInfosByIndexId(int indexId);
	
	List<IsdpTreepInfo> getTreepInfosByTopId(String nodeType, int topId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> getTreepInfosByQueryCriteria(int start, int pageSize,
			TreepInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpTreepInfo> list(TreepInfoQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpTreepInfo treepInfo);

}
