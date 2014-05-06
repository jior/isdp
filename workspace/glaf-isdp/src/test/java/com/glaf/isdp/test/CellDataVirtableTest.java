package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellDataVirtable;
import com.glaf.isdp.query.CellDataVirtableQuery;
import com.glaf.isdp.service.ICellDataVirtableService;
 

public class CellDataVirtableTest extends AbstractTest {

	protected ICellDataVirtableService cellDataVirtableService;

	@Test
	public void testList() {
		cellDataVirtableService = super.getBean("cellDataVirtableService");
		CellDataVirtableQuery query = new CellDataVirtableQuery();
		//query.nameLike("工程");
		List<CellDataVirtable> rows = cellDataVirtableService
				.getCellDataVirtablesByQueryCriteria(0, 10, query);
		for (CellDataVirtable row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
