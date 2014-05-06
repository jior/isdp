package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTableTree;
import com.glaf.isdp.query.CellTableTreeQuery;
import com.glaf.isdp.service.ICellTableTreeService;

public class CellTableTreeTest extends AbstractTest {

	protected ICellTableTreeService cellTableTreeService;

	@Test
	public void testList() {
		cellTableTreeService = super.getBean("cellTableTreeService");
		CellTableTreeQuery query = new CellTableTreeQuery();
		// query.nameLike("工程");
		List<CellTableTree> rows = cellTableTreeService
				.getCellTableTreesByQueryCriteria(0, 10, query);
		for (CellTableTree row : rows) {
			cellTableTreeService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

	@Test
	public void testGetMgmtCellTableTrees() {
		cellTableTreeService = super.getBean("cellTableTreeService");
		List<CellTableTree> rows = cellTableTreeService.getMgmtCellTableTrees();
		for (CellTableTree row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
