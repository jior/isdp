package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.query.CellRepInfoQuery;
import com.glaf.isdp.service.ICellRepInfoService;
 

public class CellRepInfoTest extends AbstractTest {

	protected ICellRepInfoService cellRepInfoService;

	@Test
	public void testList() {
		cellRepInfoService = super.getBean("cellRepInfoService");
		CellRepInfoQuery query = new CellRepInfoQuery();
		//query.nameLike("¹¤³Ì");
		List<CellRepInfo> rows = cellRepInfoService
				.getCellRepInfosByQueryCriteria(0, 10, query);
		for (CellRepInfo row : rows) {
			cellRepInfoService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
