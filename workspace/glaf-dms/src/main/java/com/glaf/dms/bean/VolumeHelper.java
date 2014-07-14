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
package com.glaf.dms.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.glaf.core.jdbc.QueryHelper;
import com.glaf.core.util.ParamUtils;

public class VolumeHelper {

	public String getTreeNodeFilterBuffer(String systemName, String actorId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("actorId", actorId);
		QueryHelper queryHelper = new QueryHelper();
		List<Map<String, Object>> resultList = queryHelper
				.getResultList(
						systemName,
						" select * from roleuse2 where roleid in (select roleid from userrole where userid = #{actorId} ) and usetype=2 ",
						params);
		StringBuffer buffer = new StringBuffer();
		buffer.append(" and ( u.id like '0|0000|%' ");
		if (resultList != null && !resultList.isEmpty()) {
			for (Map<String, Object> map : resultList) {
				String treeid = ParamUtils.getString(map, "treeid");
				buffer.append("  or u.id like '").append(treeid).append("%'");
			}
		}
		buffer.append(" ) ");
		return buffer.toString();
	}

}
