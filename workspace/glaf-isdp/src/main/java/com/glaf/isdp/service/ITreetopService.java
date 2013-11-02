package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface ITreetopService {
	 
    /**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	 void deleteById(Integer id);

    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<Treetop> list(TreetopQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getTreetopCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getTreetopCountByQueryCriteria(TreetopQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<Treetop> getTreetops(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<Treetop> getTreetopsByQueryCriteria(int start, int pageSize,
			TreetopQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 Treetop getTreetop(Integer id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(Treetop treetop);

}
