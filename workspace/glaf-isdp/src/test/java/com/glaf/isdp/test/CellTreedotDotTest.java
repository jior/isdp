package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTreedotDot;
import com.glaf.isdp.query.CellTreedotDotQuery;
import com.glaf.isdp.service.ICellTreedotDotService;
 

public class CellTreedotDotTest extends AbstractTest {

	protected ICellTreedotDotService cellTreedotDotService;

	@Test
	public void testList() {
		cellTreedotDotService = super.getBean("cellTreedotDotService");
		CellTreedotDotQuery query = new CellTreedotDotQuery();
		//query.nameLike("工程");
		List<CellTreedotDot> rows = cellTreedotDotService
				.getCellTreedotDotsByQueryCriteria(0, 10, query);
		for (CellTreedotDot row : rows) {
			cellTreedotDotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
