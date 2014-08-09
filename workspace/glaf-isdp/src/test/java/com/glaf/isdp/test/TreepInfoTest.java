package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.query.TreepInfoQuery;
import com.glaf.isdp.service.IsdpTreepInfoService;

public class TreepInfoTest extends AbstractTest {

	protected IsdpTreepInfoService treepInfoService;

	@Test
	public void test() {
		treepInfoService = super.getBean("treepInfoService");
		TreepInfoQuery query = new TreepInfoQuery();
		query.nodetype("0").topId(1);
		query.setOrderBy(" E.parent_id,E.listno");
		List<IsdpTreepInfo> rows = treepInfoService.getTreepInfosByQueryCriteria(0,
				200, query);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (IsdpTreepInfo row : rows) {
			treepInfoService.save(row);
			treeModels.add(row);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode result = treeHelper.getTreeArrayNode(treeModels);
		try {
			FileUtils.save("data/treepinfo.json",
					result.toString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info(result.toString());

	}

	@Test
	public void testGetTreepInfos() {
		treepInfoService = super.getBean("treepInfoService");
		List<IsdpTreepInfo> rows = treepInfoService.getTreepInfos("240");
		for (IsdpTreepInfo row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
		logger.debug("rows.size:" + rows.size());
	}

	@Test
	public void testList() {
		treepInfoService = super.getBean("treepInfoService");
		TreepInfoQuery query = new TreepInfoQuery();
		// query.nameLike("工程");
		List<IsdpTreepInfo> rows = treepInfoService.getTreepInfosByQueryCriteria(0,
				10, query);
		for (IsdpTreepInfo row : rows) {
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
