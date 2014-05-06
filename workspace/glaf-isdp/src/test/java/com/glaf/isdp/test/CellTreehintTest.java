package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTreehint;
import com.glaf.isdp.query.CellTreehintQuery;
import com.glaf.isdp.service.ICellTreehintService;
 

public class CellTreehintTest extends AbstractTest {

	protected ICellTreehintService cellTreehintService;

	@Test
	public void testList() {
		cellTreehintService = super.getBean("cellTreehintService");
		CellTreehintQuery query = new CellTreehintQuery();
		//query.nameLike("工程");
		List<CellTreehint> rows = cellTreehintService
				.getCellTreehintsByQueryCriteria(0, 10, query);
		for (CellTreehint row : rows) {
			cellTreehintService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
