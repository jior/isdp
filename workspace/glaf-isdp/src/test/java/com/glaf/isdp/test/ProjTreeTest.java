package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.ProjectTree;
import com.glaf.isdp.query.ProjectTreeQuery;
import com.glaf.isdp.service.IProjectTreeService;
 

public class ProjTreeTest extends AbstractTest {

	protected IProjectTreeService projectTreeService;

	@Test
	public void testList() {
		projectTreeService = super.getBean("projectTreeService");
		ProjectTreeQuery query = new ProjectTreeQuery();
		//query.nameLike("¹¤³Ì");
		List<ProjectTree> rows = projectTreeService
				.getProjectTreesByQueryCriteria(0, 10, query);
		for (ProjectTree row : rows) {
			projectTreeService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
