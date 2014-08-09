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

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.base.modules.sys.model.CellTreedotDot;
import com.glaf.base.modules.sys.query.CellTreedotDotQuery;
import com.glaf.base.modules.sys.service.ICellTreedotDotService;
 

public class CellTreedotDotTest extends AbstractTest {

	protected ICellTreedotDotService cellTreedotDotService;

	@Test
	public void testList() {
		cellTreedotDotService = super.getBean("cellTreedotDotService");
		CellTreedotDotQuery query = new CellTreedotDotQuery();
		//query.nameLike("工程");
		List<CellTreedotDot> rows = cellTreedotDotService
				.getCellTreedotDotsByQueryCriteria(0, 10, query);
		for (CellTreedotDot row : rows) {
			cellTreedotDotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
