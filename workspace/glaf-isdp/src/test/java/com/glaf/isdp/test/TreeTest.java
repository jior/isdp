package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.glaf.core.util.FileUtils;
import com.glaf.base.helper.TreeHelper;
import com.glaf.base.modules.sys.model.ITree;

import com.glaf.isdp.query.BaseTreeQuery;
import com.glaf.isdp.service.IsdpTreeService;
import com.glaf.test.AbstractTest;

public class TreeTest extends AbstractTest {

	protected IsdpTreeService isdpTreeService;

	@Test
	public void testList() {
		isdpTreeService = super.getBean("isdpTreeService");
		BaseTreeQuery query = new BaseTreeQuery();
		query.setTableName("treetop");
		// query.setOrderBy("listno");
		List<ITree> treeModels = isdpTreeService.getTreesByQueryCriteria(query);

		logger.debug("treeModels size:" + treeModels.size());

		TreeHelper treeHelper = new TreeHelper();
		JSONArray json = treeHelper.getTreeJSONArray(treeModels);

		try {
			FileUtils.save("data/" + query.getTableName() + ".json", json
					.toJSONString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
