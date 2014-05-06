package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTcadbmp;
import com.glaf.isdp.query.CellTcadbmpQuery;
import com.glaf.isdp.service.ICellTcadbmpService;
 

public class CellTcadbmpTest extends AbstractTest {

	protected ICellTcadbmpService cellTcadbmpService;

	@Test
	public void testList() {
		cellTcadbmpService = super.getBean("cellTcadbmpService");
		CellTcadbmpQuery query = new CellTcadbmpQuery();
		//query.nameLike("工程");
		List<CellTcadbmp> rows = cellTcadbmpService
				.getCellTcadbmpsByQueryCriteria(0, 10, query);
		for (CellTcadbmp row : rows) {
			cellTcadbmpService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
