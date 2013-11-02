package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellUseDataInfoService {
	 
    /**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	 void deleteById(String id);

    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> list(CellUseDataInfoQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellUseDataInfoCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellUseDataInfoCountByQueryCriteria(CellUseDataInfoQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> getCellUseDataInfos(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<CellUseDataInfo> getCellUseDataInfosByQueryCriteria(int start, int pageSize,
			CellUseDataInfoQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 CellUseDataInfo getCellUseDataInfo(String id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellUseDataInfo cellUseDataInfo);

}
