package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ICellHintlistService {
	 
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
	 List<CellHintlist> list(CellHintlistQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellHintlistCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getCellHintlistCountByQueryCriteria(CellHintlistQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<CellHintlist> getCellHintlists(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<CellHintlist> getCellHintlistsByQueryCriteria(int start, int pageSize,
			CellHintlistQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 CellHintlist getCellHintlist(String id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(CellHintlist cellHintlist);

}
