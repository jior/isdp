package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface IRoleUse2Service {
	 
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
	 List<RoleUse2> list(RoleUse2Query query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getRoleUse2Count(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getRoleUse2CountByQueryCriteria(RoleUse2Query query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<RoleUse2> getRoleUse2s(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<RoleUse2> getRoleUse2sByQueryCriteria(int start, int pageSize,
			RoleUse2Query query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 RoleUse2 getRoleUse2(String id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(RoleUse2 roleUse2);

}
