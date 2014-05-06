package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface IProjectOrganizationService {
	 
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
	 List<ProjectOrganization> list(ProjectOrganizationQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getProjectOrganizationCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getProjectOrganizationCountByQueryCriteria(ProjectOrganizationQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<ProjectOrganization> getProjectOrganizations(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<ProjectOrganization> getProjectOrganizationsByQueryCriteria(int start, int pageSize,
			ProjectOrganizationQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 ProjectOrganization getProjectOrganization(Integer id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(ProjectOrganization projectOrganization);

}
