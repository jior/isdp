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

package com.glaf.base.modules.sys.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.CellTreedotPer;

public class CellTreedotPerJsonFactory {

	public static CellTreedotPer jsonToObject(JSONObject jsonObject) {
		CellTreedotPer model = new CellTreedotPer();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getString("fromid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("intuserper")) {
			model.setIntuserper(jsonObject.getInteger("intuserper"));
		}
		if (jsonObject.containsKey("menuIndex")) {
			model.setMenuIndex(jsonObject.getInteger("menuIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellTreedotPer model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFromid() != null) {
			jsonObject.put("fromid", model.getFromid());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("intuserper", model.getIntuserper());
		jsonObject.put("menuIndex", model.getMenuIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellTreedotPer model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFromid() != null) {
			jsonObject.put("fromid", model.getFromid());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("intuserper", model.getIntuserper());
		jsonObject.put("menuIndex", model.getMenuIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellTreedotPer> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellTreedotPer model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellTreedotPer> arrayToList(JSONArray array) {
		java.util.List<CellTreedotPer> list = new java.util.ArrayList<CellTreedotPer>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellTreedotPer model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellTreedotPerJsonFactory() {

	}

}
