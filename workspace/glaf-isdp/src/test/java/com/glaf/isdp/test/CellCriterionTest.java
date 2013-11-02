package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;

import com.glaf.isdp.domain.CellCriterion;
import com.glaf.isdp.query.CellCriterionQuery;
import com.glaf.isdp.service.*;
import com.glaf.test.AbstractTest;

public class CellCriterionTest extends AbstractTest {

	protected ICellCriterionService cellCriterionService;

	@Test
	public void testList() {
		cellCriterionService = super.getBean("cellCriterionService");
		CellCriterionQuery query = new CellCriterionQuery();
		query.contentLike("¿í¶È");
		List<CellCriterion> rows = cellCriterionService
				.getCellCriterionsByQueryCriteria(0, 10, query);
		for (CellCriterion row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
