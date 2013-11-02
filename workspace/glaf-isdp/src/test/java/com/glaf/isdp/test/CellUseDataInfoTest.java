package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellUseDataInfo;
import com.glaf.isdp.query.CellUseDataInfoQuery;
import com.glaf.isdp.service.ICellUseDataInfoService;

public class CellUseDataInfoTest extends AbstractTest {

	protected ICellUseDataInfoService cellUseDataInfoService;

	@Test
	public void testList() {
		cellUseDataInfoService = super.getBean("cellUseDataInfoService");
		CellUseDataInfoQuery query = new CellUseDataInfoQuery();
		// query.nameLike("¹¤³Ì");
		List<CellUseDataInfo> rows = cellUseDataInfoService
				.getCellUseDataInfosByQueryCriteria(0, 10, query);
		for (CellUseDataInfo row : rows) {
			cellUseDataInfoService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
