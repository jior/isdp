package com.glaf.isdp.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.glaf.isdp.domain.ProjectCellAndFile;
import com.glaf.isdp.query.ProjectCellAndFileQuery;

@Component
public interface ProjectCellAndFileMapper {

	void deleteProjectCellAndFileById(String id);

	void deleteProjectCellAndFiles(ProjectCellAndFileQuery query);

	ProjectCellAndFile getProjectCellAndFileById(String id);

	int getProjectCellAndFileCount(Map<String, Object> parameter);

	int getProjectCellAndFileCountByQueryCriteria(ProjectCellAndFileQuery query);

	List<ProjectCellAndFile> getProjectCellAndFiles(
			Map<String, Object> parameter);

	List<ProjectCellAndFile> getProjectCellAndFilesByQueryCriteria(
			ProjectCellAndFileQuery query);

	List<ProjectCellAndFile> getWbsFileProjectCellAndFileByIndexId(int indexId);

	List<ProjectCellAndFile> getWbsProjectCellAndFileByIndexId(int indexId);

	void insertProjectCellAndFile(ProjectCellAndFile model);

	void updateProjectCellAndFile(ProjectCellAndFile model);

}
