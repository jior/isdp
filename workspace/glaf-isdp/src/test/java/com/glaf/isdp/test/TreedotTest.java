package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.*;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.isdp.domain.BaseTree;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.Treedot;
import com.glaf.isdp.helper.IsdpTreeHelper;
import com.glaf.isdp.query.TreedotQuery;
import com.glaf.isdp.service.ITreedotService;
 

public class TreedotTest extends AbstractTest {

	protected ITreedotService treedotService;

	@Test
	public void testList() {
		treedotService = super.getBean("treedotService");
		TreedotQuery query = new TreedotQuery();
		//query.nameLike("工程");
		List<ITree> treeModels = new ArrayList<ITree>();
		List<Treedot> rows = treedotService
				.getTreedotsByQueryCriteria(0, 10, query);
		for (Treedot row : rows) {
			treeModels.add(row);
			treedotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
		
		IsdpTreeHelper treeHelper = new IsdpTreeHelper();
		
		ITree root = new BaseTree();
		root.setIndexId(-1);
		root.setIndexName("/");
		JSONArray json = treeHelper.getTreeJSONArray(treeModels);
		 
		try {
			FileUtils.save("data/treedot.json", json.toJSONString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
