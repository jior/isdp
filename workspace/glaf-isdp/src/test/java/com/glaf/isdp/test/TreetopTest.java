package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.Treetop;
import com.glaf.isdp.query.TreetopQuery;
import com.glaf.isdp.service.ITreetopService;

public class TreetopTest extends AbstractTest {

	protected ITreetopService treetopService;

	@Test
	public void testList() {
		treetopService = super.getBean("treetopService");
		TreetopQuery query = new TreetopQuery();
		query.nameLike("工程");
		List<Treetop> rows = treetopService.getTreetopsByQueryCriteria(0, 10,
				query);
		for (Treetop row : rows) {
			treetopService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
