package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.isdp.query.TreepnameQuery;
import com.glaf.isdp.service.IsdpTreepnameService;
 

public class TreepnameTest extends AbstractTest {

	protected IsdpTreepnameService treepnameService;

	@Test
	public void testList() {
		treepnameService = super.getBean("treepnameService");
		TreepnameQuery query = new TreepnameQuery();
		//query.nameLike("工程");
		List<IsdpTreepname> rows = treepnameService
				.getTreepnamesByQueryCriteria(0, 10, query);
		for (IsdpTreepname row : rows) {
			treepnameService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
