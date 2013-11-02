package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ITreedotService {

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
	 * 获取挂接到某个分类的文件定义
	 * 
	 * @param indexId
	 * @return
	 */
	List<IsdpFiledot> getFiledotsOfTreedot(int indexId);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Treedot getTreedotById(String id);

	/**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	Treedot getTreedotByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreedotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getTreedotCountByQueryCriteria(TreedotQuery query);

	List<String> getTreedotIdsByIndexId(int indexId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treedot> getTreedots(Map<String, Object> parameter);

	List<Treedot> getTreedotsByIdLike(String idLike);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<Treedot> getTreedotsByQueryCriteria(int start, int pageSize,
			TreedotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<Treedot> list(TreedotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(Treedot treedot);

}
