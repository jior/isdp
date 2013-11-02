package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataFieldService {

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
	CellDataField getCellDataField(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataFieldCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataFieldCountByQueryCriteria(CellDataFieldQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellDataField> getCellDataFields(Map<String, Object> parameter);
	
	/**
	 * 根据表ID获取字段信息
	 * @param tableId
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByTableId(String tableId);
	
	/**
	 * 根据表单文件编号获取字段信息
	 * @param filedotId
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByFiledotId(String filedotId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellDataField> getCellDataFieldsByQueryCriteria(int start,
			int pageSize, CellDataFieldQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellDataField> list(CellDataFieldQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataField cellDataField);

}
