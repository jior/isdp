package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreewbsNameService {

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
	TreewbsName getTreewbsName(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreewbsNameCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreewbsNameCountByQueryCriteria(TreewbsNameQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreewbsName> getTreewbsNames(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<TreewbsName> getTreewbsNamesByQueryCriteria(int start, int pageSize,
			TreewbsNameQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<TreewbsName> list(TreewbsNameQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(TreewbsName treewbsName);

}
