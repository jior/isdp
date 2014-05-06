package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.ProjectTreeAllwbs;
import com.glaf.isdp.query.ProjectTreeAllwbsQuery;
import com.glaf.isdp.service.IProjectTreeAllwbsService;

public class ProjTreeAllwbsTest extends AbstractTest {

	protected IProjectTreeAllwbsService projectTreeAllwbsService;

	@Test
	public void testList() {
		projectTreeAllwbsService = super.getBean("projectTreeAllwbsService");
		projectTreeAllwbsService.reloadExecution(16134);
		ProjectTreeAllwbsQuery query = new ProjectTreeAllwbsQuery();
		// query.nameLike("工程");
		List<ProjectTreeAllwbs> rows = projectTreeAllwbsService
				.getProjectTreeAllwbssByQueryCriteria(0, 10, query);
		for (ProjectTreeAllwbs row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
