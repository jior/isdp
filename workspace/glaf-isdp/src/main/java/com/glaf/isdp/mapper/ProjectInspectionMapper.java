package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface ProjectInspectionMapper {

	void deleteProjectInspections(ProjectInspectionQuery query);

	void deleteProjectInspectionById(String id);

	ProjectInspection getProjectInspectionById(String id);

	int getProjectInspectionCount(Map<String, Object> parameter);

	int getProjectInspectionCountByQueryCriteria(ProjectInspectionQuery query);

	List<ProjectInspection> getProjectInspections(Map<String, Object> parameter);

	List<Map<String,Object>> getProjectInspectionMapList(Map<String, Object> parameter);

	List<ProjectInspection> getProjectInspectionsByQueryCriteria(ProjectInspectionQuery query);

	void insertProjectInspection(ProjectInspection model);

	void updateProjectInspection(ProjectInspection model);

}
