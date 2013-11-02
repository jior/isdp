package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.ProjectOrganization;
import com.glaf.isdp.query.ProjectOrganizationQuery;
import com.glaf.isdp.service.IProjectOrganizationService;
 

public class ProjectOrganizationTest extends AbstractTest {

	protected IProjectOrganizationService projectOrganizationService;

	@Test
	public void testList() {
		projectOrganizationService = super.getBean("projectOrganizationService");
		ProjectOrganizationQuery query = new ProjectOrganizationQuery();
		query.indexNameLike("¹«Ë¾");
		List<ProjectOrganization> rows = projectOrganizationService
				.getProjectOrganizationsByQueryCriteria(0, 10, query);
		for (ProjectOrganization row : rows) {
			projectOrganizationService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
