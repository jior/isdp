package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.Hint;
import com.glaf.isdp.query.HintQuery;
import com.glaf.isdp.service.IHintService;
 

public class HintTest extends AbstractTest {

	protected IHintService hintService;

	@Test
	public void testList() {
		hintService = super.getBean("hintService");
		HintQuery query = new HintQuery();
		//query.nameLike("¹¤³Ì");
		List<Hint> rows = hintService
				.getHintsByQueryCriteria(0, 10, query);
		for (Hint row : rows) {
			hintService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
