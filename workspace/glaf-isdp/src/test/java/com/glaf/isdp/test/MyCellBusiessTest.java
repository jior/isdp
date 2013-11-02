package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MyCellBusiess;
import com.glaf.isdp.query.MyCellBusiessQuery;
import com.glaf.isdp.service.IMyCellBusiessService;

public class MyCellBusiessTest extends AbstractTest {

	protected IMyCellBusiessService myCellBusiessService;

	@Test
	public void testList() {
		myCellBusiessService = super.getBean("myCellBusiessService");
		MyCellBusiessQuery query = new MyCellBusiessQuery();
		// query.nameLike("¹¤³Ì");
		List<MyCellBusiess> rows = myCellBusiessService
				.getMyCellBusiesssByQueryCriteria(0, 10, query);
		for (MyCellBusiess row : rows) {
			myCellBusiessService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
