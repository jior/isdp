package com.glaf.isdp.service;

import java.util.*;

import org.springframework.transaction.annotation.Transactional;

import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Transactional(readOnly = true)
public interface ICellRepInfoService {

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
	CellRepInfo getCellRepInfo(String id);
	
	/**
	 * 根据主键返回该对象及各个关联信息
	 * @param id
	 * @return
	 */
	CellRepInfo getCellRepInfoWithAll(String id);
	
	/**
	 * 获取某个角色某个表格的单元格信息
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	List<CellRepInfo> getRoleUseExistsCellRepInfos(String filedot_fileid, int roleid, int celltreedot_index);
	
	/**
	 * 获取某个角色某个表格的单元格信息
	 * @param filedot_fileid
	 * @param roleid
	 * @param celltreedot_index
	 * @return
	 */
	List<CellRepInfo> getRoleUseNotExistsCellRepInfos(String filedot_fileid, int roleid, int celltreedot_index);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfoCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	int getCellRepInfoCountByQueryCriteria(CellRepInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfo> getCellRepInfos(Map<String, Object> parameter);

	/**
	 * 根据文件编号获取表格定义信息
	 * 
	 * @param filedotId
	 * @return
	 */
	List<CellRepInfo> getCellRepInfosByFiledotId(String filedotId);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	List<CellRepInfo> getCellRepInfosByQueryCriteria(int start, int pageSize,
			CellRepInfoQuery query);

	/**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	List<CellRepInfo> list(CellRepInfoQuery query);

	/**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	void save(CellRepInfo cellRepInfo);

}
