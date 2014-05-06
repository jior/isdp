package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MyCellTaskSub;
import com.glaf.isdp.query.MyCellTaskSubQuery;
import com.glaf.isdp.service.IMyCellTaskSubService;

public class MyCellTaskSubTest extends AbstractTest {

	protected IMyCellTaskSubService myCellTaskSubService;

	@Test
	public void testList() {
		myCellTaskSubService = super.getBean("myCellTaskSubService");
		MyCellTaskSubQuery query = new MyCellTaskSubQuery();
		// query.nameLike("工程");
		List<MyCellTaskSub> rows = myCellTaskSubService
				.getMyCellTaskSubsByQueryCriteria(0, 10, query);
		for (MyCellTaskSub row : rows) {
			myCellTaskSubService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
