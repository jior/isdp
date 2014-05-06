package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpPfileAtt;
import com.glaf.isdp.query.PfileAttQuery;
import com.glaf.isdp.service.IsdpPfileAttService;
 

public class PfileAttTest extends AbstractTest {

	protected IsdpPfileAttService pfileAttService;

	@Test
	public void testList() {
		pfileAttService = super.getBean("pfileAttService");
		PfileAttQuery query = new PfileAttQuery();
		//query.nameLike("工程");
		List<IsdpPfileAtt> rows = pfileAttService
				.getPfileAttsByQueryCriteria(0, 10, query);
		for (IsdpPfileAtt row : rows) {
			pfileAttService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
