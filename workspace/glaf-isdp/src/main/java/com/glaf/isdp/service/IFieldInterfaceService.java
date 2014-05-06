package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface IFieldInterfaceService {

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
	FieldInterface getFieldInterface(String id);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFieldInterfaceCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getFieldInterfaceCountByQueryCriteria(FieldInterfaceQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FieldInterface> getFieldInterfaces(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<FieldInterface> getFieldInterfacesByQueryCriteria(int start,
			int pageSize, FieldInterfaceQuery query);

	/**
	 * 根据表格类型获取字段信息
	 * 
	 * @param frmType
	 * @return
	 */
	List<FieldInterface> getFieldsByFrmType(String frmType);

	List<FieldInterface> getListShowFields(String frmType, int indexId);

	/**
	 * 根据表格类型获取列表显示字段信息
	 * 
	 * @param frmType
	 * @return
	 */
	List<FieldInterface> getListShowFieldsByFrmType(String frmType);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<FieldInterface> list(FieldInterfaceQuery query);

	/**
	 * 转载字段的基础数据定义列表
	 * 
	 * @param fields
	 */
	void loadFieldHintList(List<FieldInterface> fields);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(FieldInterface fieldInterface);

}
