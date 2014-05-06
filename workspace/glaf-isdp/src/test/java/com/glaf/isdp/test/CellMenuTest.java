package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellMenu;
import com.glaf.isdp.query.CellMenuQuery;
import com.glaf.isdp.service.ICellMenuService;

public class CellMenuTest extends AbstractTest {

	protected ICellMenuService cellMenuService;

	@Test
	public void testList() {
		cellMenuService = super.getBean("cellMenuService");
		CellMenuQuery query = new CellMenuQuery();
		query.nameLike("工程");
		List<CellMenu> rows = cellMenuService.getCellMenusByQueryCriteria(0,
				10, query);
		for (CellMenu row : rows) {
			cellMenuService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
