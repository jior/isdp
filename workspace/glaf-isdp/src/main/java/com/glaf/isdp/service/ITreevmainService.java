package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreevmainService {

	/**
	 * 根据id删除记录
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
	 * 根据id获取一条记录
	 * 
	 * @return
	 */
	Treevmain getTreevmainById(String id);
	
	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Treevmain getTreevmainByPrimaryKey(int indexId);


	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreevmainCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreevmainCountByQueryCriteria(TreevmainQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treevmain> getTreevmains(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<Treevmain> getTreevmainsByQueryCriteria(int start, int pageSize,
			TreevmainQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treevmain> list(TreevmainQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(Treevmain treevmain);

}
