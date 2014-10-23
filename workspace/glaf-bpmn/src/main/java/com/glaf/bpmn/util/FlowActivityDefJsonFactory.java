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

package com.glaf.bpmn.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.bpmn.domain.FlowActivityDefEntity;

public class FlowActivityDefJsonFactory {

	public static FlowActivityDefEntity jsonToObject(JSONObject jsonObject) {
		FlowActivityDefEntity model = new FlowActivityDefEntity();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("typeofact")) {
			model.setTypeofact(jsonObject.getString("typeofact"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("strfuntion")) {
			model.setStrfuntion(jsonObject.getString("strfuntion"));
		}
		if (jsonObject.containsKey("netroleid")) {
			model.setNetroleid(jsonObject.getString("netroleid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}
		if (jsonObject.containsKey("isdel")) {
			model.setIsdel(jsonObject.getInteger("isdel"));
		}
		if (jsonObject.containsKey("intselectuser")) {
			model.setIntselectuser(jsonObject.getInteger("intselectuser"));
		}
		if (jsonObject.containsKey("intusedomain")) {
			model.setIntusedomain(jsonObject.getInteger("intusedomain"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowActivityDefEntity model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getTypeofact() != null) {
			jsonObject.put("typeofact", model.getTypeofact());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getStrfuntion() != null) {
			jsonObject.put("strfuntion", model.getStrfuntion());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isdel", model.getIsdel());
		jsonObject.put("intselectuser", model.getIntselectuser());
		jsonObject.put("intusedomain", model.getIntusedomain());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowActivityDefEntity model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getTypeofact() != null) {
			jsonObject.put("typeofact", model.getTypeofact());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getStrfuntion() != null) {
			jsonObject.put("strfuntion", model.getStrfuntion());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isdel", model.getIsdel());
		jsonObject.put("intselectuser", model.getIntselectuser());
		jsonObject.put("intusedomain", model.getIntusedomain());
		return jsonObject;
	}

	public static JSONArray listToArray(
			java.util.List<FlowActivityDefEntity> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowActivityDefEntity model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowActivityDefEntity> arrayToList(
			JSONArray array) {
		java.util.List<FlowActivityDefEntity> list = new java.util.ArrayList<FlowActivityDefEntity>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowActivityDefEntity model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowActivityDefJsonFactory() {

	}

}
