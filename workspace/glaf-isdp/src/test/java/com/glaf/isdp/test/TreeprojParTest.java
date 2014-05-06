package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreeProjectPar;
import com.glaf.isdp.query.TreeProjectParQuery;
import com.glaf.isdp.service.ITreeProjectParService;
 

public class TreeprojParTest extends AbstractTest {

	protected ITreeProjectParService treeProjectParService;

	@Test
	public void testList() {
		treeProjectParService = super.getBean("treeProjectParService");
		TreeProjectParQuery query = new TreeProjectParQuery();
		//query.nameLike("工程");
		List<TreeProjectPar> rows = treeProjectParService
				.getTreeProjectParsByQueryCriteria(0, 10, query);
		for (TreeProjectPar row : rows) {
			treeProjectParService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
