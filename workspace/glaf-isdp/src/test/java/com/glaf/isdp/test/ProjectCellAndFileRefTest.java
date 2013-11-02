package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.ProjectCellAndFileRef;
import com.glaf.isdp.query.ProjectCellAndFileRefQuery;
import com.glaf.isdp.service.IProjectCellAndFileRefService;
 

public class ProjectCellAndFileRefTest extends AbstractTest {

	protected IProjectCellAndFileRefService projectCellAndFileRefService;

	@Test
	public void testList() {
		projectCellAndFileRefService = super.getBean("projectCellAndFileRefService");
		ProjectCellAndFileRefQuery query = new ProjectCellAndFileRefQuery();
		//query.nameLike("¹¤³Ì");
		List<ProjectCellAndFileRef> rows = projectCellAndFileRefService
				.getProjectCellAndFileRefsByQueryCriteria(0, 10, query);
		for (ProjectCellAndFileRef row : rows) {
			projectCellAndFileRefService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
