package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreewbsAutostart;
import com.glaf.isdp.query.TreewbsAutostartQuery;
import com.glaf.isdp.service.ITreewbsAutostartService;
 

public class TreewbsAutostartTest extends AbstractTest {

	protected ITreewbsAutostartService treewbsAutostartService;

	@Test
	public void testList() {
		treewbsAutostartService = super.getBean("treewbsAutostartService");
		TreewbsAutostartQuery query = new TreewbsAutostartQuery();
		//query.nameLike("工程");
		List<TreewbsAutostart> rows = treewbsAutostartService
				.getTreewbsAutostartsByQueryCriteria(0, 10, query);
		for (TreewbsAutostart row : rows) {
			treewbsAutostartService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
