package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreeFolderService {

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
	TreeFolder getTreeFolderById(String id);
	
	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreeFolderCount(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreeFolderCountByQueryCriteria(TreeFolderQuery query);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	TreeFolder getTreeFolderPrimaryKey(int indexId);

	/**
	 * 
	 * @param inttype
	 * @param menuindex
	 * @return
	 */
	List<TreeFolder> getTreeFolders(int inttype, int menuindex);
	
	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreeFolder> getTreeFolders(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<TreeFolder> getTreeFoldersByQueryCriteria(int start, int pageSize,
			TreeFolderQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreeFolder> list(TreeFolderQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(TreeFolder treeFolder);

}
