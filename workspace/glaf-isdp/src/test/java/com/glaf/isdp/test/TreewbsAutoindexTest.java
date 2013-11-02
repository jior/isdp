package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreewbsAutoindex;
import com.glaf.isdp.query.TreewbsAutoindexQuery;
import com.glaf.isdp.service.ITreewbsAutoindexService;
 

public class TreewbsAutoindexTest extends AbstractTest {

	protected ITreewbsAutoindexService treewbsAutoindexService;

	@Test
	public void testList() {
		treewbsAutoindexService = super.getBean("treewbsAutoindexService");
		TreewbsAutoindexQuery query = new TreewbsAutoindexQuery();
		//query.nameLike("¹¤³Ì");
		List<TreewbsAutoindex> rows = treewbsAutoindexService
				.getTreewbsAutoindexsByQueryCriteria(0, 10, query);
		for (TreewbsAutoindex row : rows) {
			treewbsAutoindexService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
