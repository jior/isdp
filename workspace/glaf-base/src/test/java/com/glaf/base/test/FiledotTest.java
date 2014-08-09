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

import com.glaf.base.modules.sys.model.Filedot;
import com.glaf.base.modules.sys.query.FiledotQuery;
import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.test.AbstractTest;

public class FiledotTest extends AbstractTest {

	protected IFiledotService filedotService;

	@Test
	public void testList() {
		filedotService = super.getBean("filedotService");
		FiledotQuery query = new FiledotQuery();
		// query.nameLike("工程");
		List<Filedot> rows = filedotService.getFiledotsByQueryCriteria(0, 10,
				query);
		for (Filedot row : rows) {
			filedotService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
