package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellRepInfoChart;
import com.glaf.isdp.query.CellRepInfoChartQuery;
import com.glaf.isdp.service.ICellRepInfoChartService;
 

public class CellRepInfoChartTest extends AbstractTest {

	protected ICellRepInfoChartService cellRepInfoChartService;

	@Test
	public void testList() {
		cellRepInfoChartService = super.getBean("cellRepInfoChartService");
		CellRepInfoChartQuery query = new CellRepInfoChartQuery();
		//query.nameLike("¹¤³Ì");
		List<CellRepInfoChart> rows = cellRepInfoChartService
				.getCellRepInfoChartsByQueryCriteria(0, 10, query);
		for (CellRepInfoChart row : rows) {
			cellRepInfoChartService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
