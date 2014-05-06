package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpPfile;
import com.glaf.isdp.query.PfileQuery;
import com.glaf.isdp.service.IsdpPfileService;
 

public class PfileTest extends AbstractTest {

	protected IsdpPfileService pfileService;

	@Test
	public void testList() {
		pfileService = super.getBean("pfileService");
		PfileQuery query = new PfileQuery();
		//query.nameLike("工程");
		List<IsdpPfile> rows = pfileService
				.getPfilesByQueryCriteria(0, 10, query);
		for (IsdpPfile row : rows) {
			pfileService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
