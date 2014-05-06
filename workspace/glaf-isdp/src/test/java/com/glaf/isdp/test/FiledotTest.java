package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.query.FiledotQuery;
import com.glaf.isdp.service.IsdpFiledotService;
 

public class FiledotTest extends AbstractTest {

	protected IsdpFiledotService filedotService;

	@Test
	public void testList() {
		filedotService = super.getBean("filedotService");
		FiledotQuery query = new FiledotQuery();
		//query.nameLike("工程");
		List<IsdpFiledot> rows = filedotService
				.getFiledotsByQueryCriteria(0, 10, query);
		for (IsdpFiledot row : rows) {
			filedotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
