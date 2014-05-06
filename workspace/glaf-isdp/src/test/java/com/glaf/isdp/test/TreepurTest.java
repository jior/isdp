package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.Treepur;
import com.glaf.isdp.query.TreepurQuery;
import com.glaf.isdp.service.ITreepurService;
 

public class TreepurTest extends AbstractTest {

	protected ITreepurService treepurService;

	@Test
	public void testList() {
		treepurService = super.getBean("treepurService");
		TreepurQuery query = new TreepurQuery();
		//query.nameLike("工程");
		List<Treepur> rows = treepurService
				.getTreepursByQueryCriteria(0, 10, query);
		for (Treepur row : rows) {
			treepurService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
