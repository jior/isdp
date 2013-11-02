package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellCriterionTreeTest extends AbstractTest {

	protected ICellCriterionTreeService cellCriterionTreeService;

	@Test
	public void testList() {
		cellCriterionTreeService = super.getBean("cellCriterionTreeService");
		CellCriterionTreeQuery query = new CellCriterionTreeQuery();
		query.indexNameLike("«≈¡∫");
		List<CellCriterionTree> rows = cellCriterionTreeService
				.getCellCriterionTreesByQueryCriteria(0, 10, query);
		for (CellCriterionTree row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
