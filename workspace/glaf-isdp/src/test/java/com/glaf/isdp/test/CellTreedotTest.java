package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.CellTreedot;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.helper.IsdpTreeHelper;
import com.glaf.isdp.query.CellTreedotQuery;
import com.glaf.isdp.service.ICellTreedotService;

public class CellTreedotTest extends AbstractTest {

	protected ICellTreedotService cellTreedotService;

	@Test
	public void testList() {
		cellTreedotService = super.getBean("cellTreedotService");
		CellTreedotQuery query = new CellTreedotQuery();
		// query.nameLike("工程");
		List<ITree> treeModels = new ArrayList<ITree>();
		List<CellTreedot> rows = cellTreedotService
				.getCellTreedotsByQueryCriteria(0, 500, query);
		for (CellTreedot row : rows) {
			treeModels.add(row);
			cellTreedotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
		IsdpTreeHelper treeHelper = new IsdpTreeHelper();
		JSONArray arr = treeHelper.getTreeJSONArray(treeModels);
		System.out.println(arr.toJSONString());

		JSONObject json = treeHelper.getTreeJson(treeModels);
		System.out.println(json.toJSONString());
	}

}
