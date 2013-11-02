package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.ProjectCellAndFileRef;
import com.glaf.isdp.query.ProjectCellAndFileRefQuery;

@Component
public interface ProjectCellAndFileRefMapper {

	void deleteProjectCellAndFileRefById(String id);

	void deleteProjectCellAndFileRefs(ProjectCellAndFileRefQuery query);

	ProjectCellAndFileRef getProjectCellAndFileRefById(String id);

	int getProjectCellAndFileRefCount(Map<String, Object> parameter);

	int getProjectCellAndFileRefCountByQueryCriteria(
			ProjectCellAndFileRefQuery query);

	List<ProjectCellAndFileRef> getProjectCellAndFileRefs(
			Map<String, Object> parameter);

	List<ProjectCellAndFileRef> getProjectCellAndFileRefsByQueryCriteria(
			ProjectCellAndFileRefQuery query);

	void insertProjectCellAndFileRef(ProjectCellAndFileRef model);

	void updateProjectCellAndFileRef(ProjectCellAndFileRef model);

}
