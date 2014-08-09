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

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.test.AbstractTest;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.helper.TreeHelper;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.query.CellTreedotQuery;
import com.glaf.base.modules.sys.service.ICellTreedotService;

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

		TreeHelper treeHelper = new TreeHelper();
		JSONArray arr = treeHelper.getTreeJSONArray(treeModels);
		System.out.println(arr.toJSONString());

		JSONObject json = treeHelper.getTreeJson(treeModels);
		System.out.println(json.toJSONString());
	}

}
