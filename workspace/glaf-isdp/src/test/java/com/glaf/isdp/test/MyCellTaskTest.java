package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.MyCellTask;
import com.glaf.isdp.query.MyCellTaskQuery;
import com.glaf.isdp.service.IMyCellTaskService;

public class MyCellTaskTest extends AbstractTest {

	protected IMyCellTaskService myCellTaskService;

	@Test
	public void testList() {
		myCellTaskService = super.getBean("myCellTaskService");
		MyCellTaskQuery query = new MyCellTaskQuery();
		// query.nameLike("¹¤³Ì");
		List<MyCellTask> rows = myCellTaskService
				.getMyCellTasksByQueryCriteria(0, 10, query);
		for (MyCellTask row : rows) {
			myCellTaskService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
