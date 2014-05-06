package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellSysDatalinkCon;
import com.glaf.isdp.query.CellSysDatalinkConQuery;
import com.glaf.isdp.service.ICellSysDatalinkConService;

public class CellSysDatalinkConTest extends AbstractTest {

	protected ICellSysDatalinkConService cellSysDatalinkConService;

	@Test
	public void testList() {
		cellSysDatalinkConService = super.getBean("cellSysDatalinkConService");
		CellSysDatalinkConQuery query = new CellSysDatalinkConQuery();
		// query.nameLike("工程");
		List<CellSysDatalinkCon> rows = cellSysDatalinkConService
				.getCellSysDatalinkConsByQueryCriteria(0, 10, query);
		for (CellSysDatalinkCon row : rows) {
			cellSysDatalinkConService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
