package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellFillFormTest extends AbstractTest {

	protected IsdpCellFillFormService cellFillFormService;

	@Test
	public void testList() {
		cellFillFormService = super.getBean("cellFillFormService");
		CellFillFormQuery query = new CellFillFormQuery();
		query.nameLike("材料");
		List<IsdpCellFillForm> rows = cellFillFormService
				.getCellFillFormsByQueryCriteria(0, 10, query);
		for (IsdpCellFillForm row : rows) {
			cellFillFormService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
