package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTreedotPer;
import com.glaf.isdp.query.CellTreedotPerQuery;
import com.glaf.isdp.service.ICellTreedotPerService;
 

public class CellTreedotPerTest extends AbstractTest {

	protected ICellTreedotPerService cellTreedotPerService;

	@Test
	public void testList() {
		cellTreedotPerService = super.getBean("cellTreedotPerService");
		CellTreedotPerQuery query = new CellTreedotPerQuery();
		//query.nameLike("工程");
		List<CellTreedotPer> rows = cellTreedotPerService
				.getCellTreedotPersByQueryCriteria(0, 10, query);
		for (CellTreedotPer row : rows) {
			cellTreedotPerService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
