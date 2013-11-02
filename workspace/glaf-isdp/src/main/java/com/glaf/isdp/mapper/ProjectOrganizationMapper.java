package com.glaf.isdp.mapper;

import java.util.*;
import org.springframework.stereotype.Component;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;

@Component
public interface ProjectOrganizationMapper {

	void deleteProjectOrganizations(ProjectOrganizationQuery query);

	void deleteProjectOrganizationById(Integer id);

	ProjectOrganization getProjectOrganizationById(Integer id);

	int getProjectOrganizationCount(Map<String, Object> parameter);

	int getProjectOrganizationCountByQueryCriteria(ProjectOrganizationQuery query);

	List<ProjectOrganization> getProjectOrganizations(Map<String, Object> parameter);

	List<Map<String,Object>> getProjectOrganizationMapList(Map<String, Object> parameter);

	List<ProjectOrganization> getProjectOrganizationsByQueryCriteria(ProjectOrganizationQuery query);

	void insertProjectOrganization(ProjectOrganization model);

	void updateProjectOrganization(ProjectOrganization model);

}
