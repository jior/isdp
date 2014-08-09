/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.glaf.base.test;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.*;
import com.glaf.test.AbstractTest;
import com.glaf.base.modules.sys.model.BaseTree;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.model.Treedot;
import com.glaf.base.modules.sys.query.TreedotQuery;
import com.glaf.base.modules.sys.service.ITreedotService;
import com.glaf.core.util.FileUtils;

import com.glaf.base.helper.TreeHelper;

public class TreedotTest extends AbstractTest {

	protected ITreedotService treedotService;

	@Test
	public void testList() {
		treedotService = super.getBean("treedotService");
		TreedotQuery query = new TreedotQuery();
		// query.nameLike("工程");
		List<ITree> treeModels = new ArrayList<ITree>();
		List<Treedot> rows = treedotService.getTreedotsByQueryCriteria(0, 10,
				query);
		for (Treedot row : rows) {
			treeModels.add(row);
			treedotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}

		TreeHelper treeHelper = new TreeHelper();

		ITree root = new BaseTree();
		root.setIndexId(-1);
		root.setIndexName("/");
		JSONArray json = treeHelper.getTreeJSONArray(treeModels);

		try {
			FileUtils.save("data/treedot.json",
					json.toJSONString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
