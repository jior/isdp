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
import com.glaf.base.modules.sys.model.CellTreedotView;

public class CellTreedotViewJsonFactory {

	public static CellTreedotView jsonToObject(JSONObject jsonObject) {
		CellTreedotView model = new CellTreedotView();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("tablename")) {
			model.setTablename(jsonObject.getString("tablename"));
		}
		if (jsonObject.containsKey("tablenameS")) {
			model.setTablenameS(jsonObject.getString("tablenameS"));
		}
		if (jsonObject.containsKey("alldname")) {
			model.setAlldname(jsonObject.getString("alldname"));
		}
		if (jsonObject.containsKey("allfname")) {
			model.setAllfname(jsonObject.getString("allfname"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("intrad")) {
			model.setIntrad(jsonObject.getInteger("intrad"));
		}
		if (jsonObject.containsKey("intwbslevel")) {
			model.setIntwbslevel(jsonObject.getInteger("intwbslevel"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellTreedotView model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getTablenameS() != null) {
			jsonObject.put("tablenameS", model.getTablenameS());
		}
		if (model.getAlldname() != null) {
			jsonObject.put("alldname", model.getAlldname());
		}
		if (model.getAllfname() != null) {
			jsonObject.put("allfname", model.getAllfname());
		}
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("intrad", model.getIntrad());
		jsonObject.put("intwbslevel", model.getIntwbslevel());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellTreedotView model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getTablenameS() != null) {
			jsonObject.put("tablenameS", model.getTablenameS());
		}
		if (model.getAlldname() != null) {
			jsonObject.put("alldname", model.getAlldname());
		}
		if (model.getAllfname() != null) {
			jsonObject.put("allfname", model.getAllfname());
		}
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("intrad", model.getIntrad());
		jsonObject.put("intwbslevel", model.getIntwbslevel());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellTreedotView> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellTreedotView model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellTreedotView> arrayToList(JSONArray array) {
		java.util.List<CellTreedotView> list = new java.util.ArrayList<CellTreedotView>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellTreedotView model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellTreedotViewJsonFactory() {

	}

}
