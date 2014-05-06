package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellTreedotService {

	/**
	 * 根据id删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

	/**
	 * 根据id删除记录
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
	CellTreedot getCellTreedotById(String id);

	/**
	 * 根据indexId获取一条记录
	 * 
	 * @return
	 */
	CellTreedot getCellTreedotByPrimaryKey(int indexId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellTreedotCountByQueryCriteria(CellTreedotQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedots(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByQueryCriteria(int start, int pageSize,
			CellTreedotQuery query);

	/**
	 * 根据topId获取菜单项
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getCellTreedotsByTopId(String topId);
	
	/**
	 * 根据父ID获取二级菜单
	 * @param parentId
	 * @return
	 */
	List<CellTreedot> getChildrenCellTreedots(int parentId);

	/**
	 * 获取topId为system_init的系统菜单项
	 * 
	 * @return
	 */
	List<CellTreedot> getSystemInitCellTreedots();

	/**
	 * 根据topId获取顶层菜单
	 * 
	 * @param topId
	 * @return
	 */
	List<CellTreedot> getTopLevelCellTreedotsByTopId(String topId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellTreedot> list(CellTreedotQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellTreedot cellTreedot);

}
