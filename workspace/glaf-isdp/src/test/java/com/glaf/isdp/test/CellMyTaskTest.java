package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellMyTaskTest extends AbstractTest {

	protected ICellMyTaskService cellMyTaskService;

	@Test
	public void testList() {
		cellMyTaskService = super.getBean("cellMyTaskService");
		CellMyTaskQuery query = new CellMyTaskQuery();
		query.nameLike("检查");
		List<CellMyTask> rows = cellMyTaskService
				.getCellMyTasksByQueryCriteria(0, 10, query);
		for (CellMyTask row : rows) {
			cellMyTaskService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
