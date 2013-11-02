package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

public class CellDottofileTest extends AbstractTest {

	protected ICellDottofileService cellDottofileService;

	@Test
	public void testList() {
		cellDottofileService = super.getBean("cellDottofileService");
		CellDottofileQuery query = new CellDottofileQuery();
		query.nameLike("¹¤³Ì");
		List<CellDottofile> rows = cellDottofileService
				.getCellDottofilesByQueryCriteria(0, 10, query);
		for (CellDottofile row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
