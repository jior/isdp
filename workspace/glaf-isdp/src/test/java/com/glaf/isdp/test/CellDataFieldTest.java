package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellDataFieldTest extends AbstractTest {

	protected ICellDataFieldService cellDataFieldService;

	@Test
	public void testList() {
		cellDataFieldService = super.getBean("cellDataFieldService");
		CellDataFieldQuery query = new CellDataFieldQuery();
		query.fieldname("name");
		List<CellDataField> rows = cellDataFieldService
				.getCellDataFieldsByQueryCriteria(0, 10, query);
		for (CellDataField row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
