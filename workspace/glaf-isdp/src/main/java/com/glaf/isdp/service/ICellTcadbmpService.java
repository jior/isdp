package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellTcadbmpService {
	 
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
	 List<CellTcadbmp> list(CellTcadbmpQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellTcadbmpCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellTcadbmpCountByQueryCriteria(CellTcadbmpQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<CellTcadbmp> getCellTcadbmps(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<CellTcadbmp> getCellTcadbmpsByQueryCriteria(int start, int pageSize,
			CellTcadbmpQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 CellTcadbmp getCellTcadbmp(String id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellTcadbmp cellTcadbmp);

}
