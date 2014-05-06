package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreeProject;
import com.glaf.isdp.query.TreeProjectQuery;
import com.glaf.isdp.service.ITreeProjectService;
 

public class TreeprojTest extends AbstractTest {

	protected ITreeProjectService treeProjectService;

	@Test
	public void testList() {
		treeProjectService = super.getBean("treeProjectService");
		TreeProjectQuery query = new TreeProjectQuery();
		//query.nameLike("工程");
		List<TreeProject> rows = treeProjectService
				.getTreeProjectsByQueryCriteria(0, 10, query);
		for (TreeProject row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
			treeProjectService.save(row);
		}
	}

}
