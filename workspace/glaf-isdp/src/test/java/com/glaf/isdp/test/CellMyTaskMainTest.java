package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellMyTaskMain;
import com.glaf.isdp.query.CellMyTaskMainQuery;
import com.glaf.isdp.service.ICellMyTaskMainService;

public class CellMyTaskMainTest extends AbstractTest {

	protected ICellMyTaskMainService cellMyTaskMainService;

	@Test
	public void testList() {
		cellMyTaskMainService = super.getBean("cellMyTaskMainService");
		CellMyTaskMainQuery query = new CellMyTaskMainQuery();
		// query.nameLike("¹¤³Ì");
		List<CellMyTaskMain> rows = cellMyTaskMainService
				.getCellMyTaskMainsByQueryCriteria(0, 10, query);
		for (CellMyTaskMain row : rows) {
			cellMyTaskMainService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
