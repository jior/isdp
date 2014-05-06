package com.glaf.isdp.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.isdp.domain.BaseTree;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.TreeFolder;
import com.glaf.isdp.helper.IsdpTreeHelper;
import com.glaf.isdp.query.TreeFolderQuery;
import com.glaf.isdp.service.ITreeFolderService;

public class TreeFolderTest extends AbstractTest {

	protected ITreeFolderService treeFolderService;

	@Test
	public void testList() {
		treeFolderService = super.getBean("treeFolderService");
		TreeFolderQuery query = new TreeFolderQuery();
		// query.nameLike("工程");
		List<ITree> treeModels = new ArrayList<ITree>();
		List<TreeFolder> rows = treeFolderService
				.getTreeFoldersByQueryCriteria(0, 50, query);
		for (TreeFolder row : rows) {
			treeModels.add(row);
			treeFolderService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
		IsdpTreeHelper treeHelper = new IsdpTreeHelper();
		JSONArray array = treeHelper.getTreeJSONArray(treeModels);
		logger.debug(array.toJSONString());
		logger.debug("-----------------------------------------");
		ITree root = new BaseTree();
		root.setIndexId(-1);
		root.setIndexName("/");
		JSONObject json = treeHelper.getJsonCheckboxNode(root, treeModels, null);
		logger.debug(json.toJSONString());
		try {
			FileUtils.save("data/treefolderchk.json", json.toJSONString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JSONArray array2 = treeHelper.getTreeJSONArray(treeModels);
		try {
			FileUtils.save("data/treefolder.json", array2.toJSONString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
