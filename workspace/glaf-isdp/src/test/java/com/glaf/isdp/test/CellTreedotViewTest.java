package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTreedotView;
import com.glaf.isdp.query.CellTreedotViewQuery;
import com.glaf.isdp.service.ICellTreedotViewService;
 

public class CellTreedotViewTest extends AbstractTest {

	protected ICellTreedotViewService cellTreedotViewService;

	@Test
	public void testList() {
		cellTreedotViewService = super.getBean("cellTreedotViewService");
		CellTreedotViewQuery query = new CellTreedotViewQuery();
		//query.nameLike("工程");
		List<CellTreedotView> rows = cellTreedotViewService
				.getCellTreedotViewsByQueryCriteria(0, 10, query);
		for (CellTreedotView row : rows) {
			cellTreedotViewService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
