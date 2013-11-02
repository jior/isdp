package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.ProjectTreeAllwbs;
import com.glaf.isdp.query.ProjectTreeAllwbsQuery;

@Component
public interface ProjectTreeAllwbsMapper {

	void deleteProjectTreeAllwbsById(String id);

	void deleteProjectTreeAllwbsByCellTaskIndexId(int cellTaskIndexId);

	void deleteProjectTreeAllwbss(ProjectTreeAllwbsQuery query);

	ProjectTreeAllwbs getProjectTreeAllwbsById(String id);

	ProjectTreeAllwbs getProjectTreeAllwbsByIndexId(int indexId);

	int getProjectTreeAllwbsCount(Map<String, Object> parameter);

	int getProjectTreeAllwbsCountByQueryCriteria(ProjectTreeAllwbsQuery query);

	List<ProjectTreeAllwbs> getProjectTreeAllwbss(Map<String, Object> parameter);

	List<ProjectTreeAllwbs> getProjectTreeAllwbssByQueryCriteria(
			ProjectTreeAllwbsQuery query);

	void insertProjectTreeAllwbs(ProjectTreeAllwbs model);

	void updateProjectTreeAllwbs(ProjectTreeAllwbs model);

}
