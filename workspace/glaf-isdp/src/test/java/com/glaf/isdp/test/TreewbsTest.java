package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.glaf.test.AbstractTest;
import com.glaf.base.helper.TreeHelper;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.isdp.domain.Treewbs;
import com.glaf.isdp.query.TreewbsQuery;
import com.glaf.isdp.service.ITreewbsService;

public class TreewbsTest extends AbstractTest {

	protected ITreewbsService treewbsService;

	@Test
	public void testList() {
		treewbsService = super.getBean("treewbsService");
		TreewbsQuery query = new TreewbsQuery();
		// query.nameLike("工程");
		List<Treewbs> rows = treewbsService.getTreewbssByQueryCriteria(0, 1000,
				query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (Treewbs row : rows) {
			treewbsService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
			treeModels.add(row);
		}
		TreeHelper treeHelper = new TreeHelper();
		JSONArray json = treeHelper.getTreeJSONArray(treeModels);
		System.out.println(json.toJSONString());
	}

}
