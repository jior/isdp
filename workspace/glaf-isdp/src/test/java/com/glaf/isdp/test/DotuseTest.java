package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpDotuse;
import com.glaf.isdp.query.DotuseQuery;
import com.glaf.isdp.service.IsdpDotuseService;
 

public class DotuseTest extends AbstractTest {

	protected IsdpDotuseService dotuseService;

	@Test
	public void testList() {
		dotuseService = super.getBean("dotuseService");
		DotuseQuery query = new DotuseQuery();
		//query.nameLike("¹¤³Ì");
		List<IsdpDotuse> rows = dotuseService
				.getDotusesByQueryCriteria(0, 10, query);
		for (IsdpDotuse row : rows) {
			dotuseService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
