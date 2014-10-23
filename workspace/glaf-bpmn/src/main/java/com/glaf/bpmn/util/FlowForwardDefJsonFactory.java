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
import com.glaf.bpmn.domain.FlowForwardDefEntity;

public class FlowForwardDefJsonFactory {

	public static FlowForwardDefEntity jsonToObject(JSONObject jsonObject) {
		FlowForwardDefEntity model = new FlowForwardDefEntity();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("activId")) {
			model.setActivId(jsonObject.getString("activId"));
		}
		if (jsonObject.containsKey("activPre")) {
			model.setActivPre(jsonObject.getString("activPre"));
		}
		if (jsonObject.containsKey("activNext")) {
			model.setActivNext(jsonObject.getString("activNext"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}
		if (jsonObject.containsKey("isdel")) {
			model.setIsdel(jsonObject.getInteger("isdel"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowForwardDefEntity model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getActivId() != null) {
			jsonObject.put("activId", model.getActivId());
		}
		if (model.getActivPre() != null) {
			jsonObject.put("activPre", model.getActivPre());
		}
		if (model.getActivNext() != null) {
			jsonObject.put("activNext", model.getActivNext());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isdel", model.getIsdel());
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowForwardDefEntity model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getActivId() != null) {
			jsonObject.put("activId", model.getActivId());
		}
		if (model.getActivPre() != null) {
			jsonObject.put("activPre", model.getActivPre());
		}
		if (model.getActivNext() != null) {
			jsonObject.put("activNext", model.getActivNext());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isdel", model.getIsdel());
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static JSONArray listToArray(
			java.util.List<FlowForwardDefEntity> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForwardDefEntity model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForwardDefEntity> arrayToList(
			JSONArray array) {
		java.util.List<FlowForwardDefEntity> list = new java.util.ArrayList<FlowForwardDefEntity>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForwardDefEntity model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardDefJsonFactory() {

	}

}
