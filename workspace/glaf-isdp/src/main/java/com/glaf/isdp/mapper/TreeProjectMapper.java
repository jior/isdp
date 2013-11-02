package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.TreeProject;
import com.glaf.isdp.query.TreeProjectQuery;

@Component
public interface TreeProjectMapper {

	void deleteTreeProjectById(String id);

	void deleteTreeProjectByIndexId(int indexId);

	void deleteTreeProjects(TreeProjectQuery query);

	TreeProject getTreeProjectById(String id);

	TreeProject getTreeProjectByIndexId(int indexId);

	int getTreeProjectCount(Map<String, Object> parameter);

	int getTreeProjectCountByQueryCriteria(TreeProjectQuery query);

	List<TreeProject> getTreeProjects(Map<String, Object> parameter);

	List<TreeProject> getTreeProjectsByQueryCriteria(TreeProjectQuery query);

	void insertTreeProject(TreeProject model);

	void updateTreeProject(TreeProject model);

}
