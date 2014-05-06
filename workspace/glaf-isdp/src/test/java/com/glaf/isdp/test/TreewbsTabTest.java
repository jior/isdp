package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreewbsTab;
import com.glaf.isdp.query.TreewbsTabQuery;
import com.glaf.isdp.service.ITreewbsTabService;

public class TreewbsTabTest extends AbstractTest {

	protected ITreewbsTabService treewbsTabService;

	@Test
	public void testList() {
		treewbsTabService = super.getBean("treewbsTabService");
		TreewbsTabQuery query = new TreewbsTabQuery();
		// query.nameLike("工程");
		List<TreewbsTab> rows = treewbsTabService
				.getTreewbsTabsByQueryCriteria(0, 10, query);
		for (TreewbsTab row : rows) {
			treewbsTabService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
