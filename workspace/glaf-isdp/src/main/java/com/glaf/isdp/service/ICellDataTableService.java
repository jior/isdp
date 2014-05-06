package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellDataTableService {

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
	CellDataTable getCellDataTable(String id);

	/**
	 * 根据表名获取表定义信息
	 * 
	 * @param tablename
	 * @return
	 */
	CellDataTable getCellDataTableByTablename(String tablename);

	/**
	 * 获取某个表的下一个主键值
	 * 
	 * @param tablename
	 * @param actorId
	 * @return
	 */
	String getNextId(String tablename, String actorId);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataTableCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellDataTableCountByQueryCriteria(CellDataTableQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellDataTable> getCellDataTables(Map<String, Object> parameter);

	/**
	 * 根据文件编号获取表格定义信息（一个Cell文件定义分解到多个CellDataTable）
	 * 
	 * @param filedotFileId
	 * @return
	 */
	List<CellDataTable> getCellDataTablesByFiledotId(String filedotId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellDataTable> getCellDataTablesByQueryCriteria(int start,
			int pageSize, CellDataTableQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellDataTable> list(CellDataTableQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellDataTable cellDataTable);

	/**
	 * 保存数据
	 * @param tablename
	 * @param dataMap
	 */
	@Transactional
	void saveCellUserData(String tablename, Map<String, Object> dataMap);

}
