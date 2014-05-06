package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellRepInfo2;
import com.glaf.isdp.query.CellRepInfo2Query;
import com.glaf.isdp.service.ICellRepInfo2Service;
 

public class CellRepInfo2Test extends AbstractTest {

	protected ICellRepInfo2Service cellRepInfo2Service;

	@Test
	public void testList() {
		cellRepInfo2Service = super.getBean("cellRepInfo2Service");
		CellRepInfo2Query query = new CellRepInfo2Query();
		//query.nameLike("工程");
		List<CellRepInfo2> rows = cellRepInfo2Service
				.getCellRepInfo2sByQueryCriteria(0, 10, query);
		for (CellRepInfo2 row : rows) {
			cellRepInfo2Service.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
