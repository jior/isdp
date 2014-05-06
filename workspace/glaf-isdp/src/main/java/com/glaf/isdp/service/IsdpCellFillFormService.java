package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.util.Paging;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IsdpCellFillFormService {

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
	IsdpCellFillForm getCellFillForm(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellFillFormCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellFillFormCountByQueryCriteria(CellFillFormQuery query);
	
	
	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> getCellFillForms(Map<String, Object> parameter);
	
	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> getCellFillFormsByQueryCriteria(int start, int pageSize,
			CellFillFormQuery query);
	
	IsdpCellFillForm getCellFillFormWithAll(String id);

	int getFileCellFillFormCount(String idLike, int indexId);

	List<IsdpCellFillForm> getFileCellFillFormList(String idLike, int indexId);

	/**
	 * 获取一页表单填写记录
	 * @param pageNo 页码,从1开始
	 * @param pageSize
	 * @param idLike
	 * @param indexId
	 * @return
	 */
	Paging getPageFileCellFillForm(int pageNo, int pageSize, String idLike, int indexId);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<IsdpCellFillForm> list(CellFillFormQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(IsdpCellFillForm cellFillform);

}
