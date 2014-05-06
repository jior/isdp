package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellSysDatalink;
import com.glaf.isdp.query.CellSysDatalinkQuery;
import com.glaf.isdp.service.ICellSysDatalinkService;

public class CellSysDatalinkTest extends AbstractTest {

	protected ICellSysDatalinkService cellSysDatalinkService;

	@Test
	public void testList() {
		cellSysDatalinkService = super.getBean("cellSysDatalinkService");
		CellSysDatalinkQuery query = new CellSysDatalinkQuery();
		// query.nameLike("工程");
		List<CellSysDatalink> rows = cellSysDatalinkService
				.getCellSysDatalinksByQueryCriteria(0, 10, query);
		for (CellSysDatalink row : rows) {
			cellSysDatalinkService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
