package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellMenuList;
import com.glaf.isdp.query.CellMenuListQuery;
import com.glaf.isdp.service.ICellMenuListService;
 

public class CellMenuListTest extends AbstractTest {

	protected ICellMenuListService cellMenuListService;

	@Test
	public void testList() {
		cellMenuListService = super.getBean("cellMenuListService");
		CellMenuListQuery query = new CellMenuListQuery();
		//query.nameLike("¹¤³Ì");
		List<CellMenuList> rows = cellMenuListService
				.getCellMenuListsByQueryCriteria(0, 10, query);
		for (CellMenuList row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
