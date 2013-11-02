package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.ProjectTree;
import com.glaf.isdp.query.ProjectTreeQuery;

@Component
public interface ProjectTreeMapper {

	void deleteProjectTreeById(String id);

	void deleteProjectTreeByIndexId(int indexId);

	void deleteProjectTrees(ProjectTreeQuery query);

	ProjectTree getProjectTreeById(String id);

	ProjectTree getProjectTreeByIndexId(int indexId);

	int getProjectTreeCount(Map<String, Object> parameter);

	int getProjectTreeCountByQueryCriteria(ProjectTreeQuery query);

	List<ProjectTree> getProjectTrees(Map<String, Object> parameter);

	List<ProjectTree> getProjectTreesByQueryCriteria(ProjectTreeQuery query);

	void insertProjectTree(ProjectTree model);

	void updateProjectTree(ProjectTree model);

}
