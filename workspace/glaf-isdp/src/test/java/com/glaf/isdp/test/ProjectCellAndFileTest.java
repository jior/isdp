package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.ProjectCellAndFile;
import com.glaf.isdp.query.ProjectCellAndFileQuery;
import com.glaf.isdp.service.IProjectCellAndFileService;
 

public class ProjectCellAndFileTest extends AbstractTest {

	protected IProjectCellAndFileService projectCellAndFileService;

	@Test
	public void testList() {
		projectCellAndFileService = super.getBean("projectCellAndFileService");
		ProjectCellAndFileQuery query = new ProjectCellAndFileQuery();
		//query.nameLike("工程");
		List<ProjectCellAndFile> rows = projectCellAndFileService
				.getProjectCellAndFilesByQueryCriteria(0, 10, query);
		for (ProjectCellAndFile row : rows) {
			projectCellAndFileService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
