package com.glaf.isdp.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

 
@Transactional(readOnly = true)
public interface IProjectInspectionService {
	 
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
	 List<ProjectInspection> list(ProjectInspectionQuery query);

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getProjectInspectionCount(Map<String, Object> parameter);

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getProjectInspectionCountByQueryCriteria(ProjectInspectionQuery query);


    /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<ProjectInspection> getProjectInspections(Map<String, Object> parameter);


	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<ProjectInspection> getProjectInspectionsByQueryCriteria(int start, int pageSize,
			ProjectInspectionQuery query);


    /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 ProjectInspection getProjectInspection(String id);

    /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(ProjectInspection projectInspection);

}
