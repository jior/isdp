package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.Treevmain;
import com.glaf.isdp.query.TreevmainQuery;
import com.glaf.isdp.service.ITreevmainService;
 

public class TreevmainTest extends AbstractTest {

	protected ITreevmainService treevmainService;

	@Test
	public void testList() {
		treevmainService = super.getBean("treevmainService");
		TreevmainQuery query = new TreevmainQuery();
		//query.nameLike("工程");
		List<Treevmain> rows = treevmainService
				.getTreevmainsByQueryCriteria(0, 10, query);
		for (Treevmain row : rows) {
			treevmainService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
