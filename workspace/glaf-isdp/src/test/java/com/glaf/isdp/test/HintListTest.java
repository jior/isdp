package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.HintList;
import com.glaf.isdp.query.HintListQuery;
import com.glaf.isdp.service.IHintListService;
 

public class HintListTest extends AbstractTest {

	protected IHintListService hintListService;

	@Test
	public void testList() {
		hintListService = super.getBean("hintListService");
		HintListQuery query = new HintListQuery();
		//query.nameLike("工程");
		List<HintList> rows = hintListService
				.getHintListsByQueryCriteria(0, 10, query);
		for (HintList row : rows) {
			hintListService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
