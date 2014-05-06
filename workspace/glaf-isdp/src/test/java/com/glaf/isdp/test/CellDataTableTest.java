package com.glaf.isdp.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellDataTableTest extends AbstractTest {

	protected ICellDataTableService cellDataTableService;

	@Test
	public void testList() {
		cellDataTableService = super.getBean("cellDataTableService");
		CellDataTableQuery query = new CellDataTableQuery();
		query.nameLike("工程");
		List<CellDataTable> rows = cellDataTableService
				.getCellDataTablesByQueryCriteria(0, 10, query);
		for (CellDataTable row : rows) {
			cellDataTableService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

	@Test
	public void testInsertUserData() {
		cellDataTableService = super.getBean("cellDataTableService");
		for (int i = 0; i < 10; i++) {
			Map<String, Object> dataMap = new HashMap<String, Object>();
			dataMap.put("id", String.valueOf(i));
			dataMap.put("cell_useradd1530_user1", "测试1");
			dataMap.put("cell_useradd1530_user2", "测试2");
			cellDataTableService.saveCellUserData("cell_useradd1530", dataMap);
		}
	}

}
