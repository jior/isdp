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
import com.glaf.bpmn.domain.FlowForwardSqlDefEntity;

public class FlowForwardSqlDefJsonFactory {

	public static FlowForwardSqlDefEntity jsonToObject(JSONObject jsonObject) {
		FlowForwardSqlDefEntity model = new FlowForwardSqlDefEntity();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("flowForwardD")) {
			model.setFlowForwardD(jsonObject.getString("flowForwardD"));
		}
		if (jsonObject.containsKey("intandor")) {
			model.setIntandor(jsonObject.getInteger("intandor"));
		}
		if (jsonObject.containsKey("sqlconType")) {
			model.setSqlconType(jsonObject.getInteger("sqlconType"));
		}
		if (jsonObject.containsKey("sqlconDtype")) {
			model.setSqlconDtype(jsonObject.getString("sqlconDtype"));
		}
		if (jsonObject.containsKey("sqlconField")) {
			model.setSqlconField(jsonObject.getString("sqlconField"));
		}
		if (jsonObject.containsKey("strsp")) {
			model.setStrsp(jsonObject.getString("strsp"));
		}
		if (jsonObject.containsKey("sqlconValue")) {
			model.setSqlconValue(jsonObject.getString("sqlconValue"));
		}
		if (jsonObject.containsKey("sqlconshow")) {
			model.setSqlconshow(jsonObject.getString("sqlconshow"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowForwardSqlDefEntity model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getFlowForwardD() != null) {
			jsonObject.put("flowForwardD", model.getFlowForwardD());
		}
		jsonObject.put("intandor", model.getIntandor());
		jsonObject.put("sqlconType", model.getSqlconType());
		if (model.getSqlconDtype() != null) {
			jsonObject.put("sqlconDtype", model.getSqlconDtype());
		}
		if (model.getSqlconField() != null) {
			jsonObject.put("sqlconField", model.getSqlconField());
		}
		if (model.getStrsp() != null) {
			jsonObject.put("strsp", model.getStrsp());
		}
		if (model.getSqlconValue() != null) {
			jsonObject.put("sqlconValue", model.getSqlconValue());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		jsonObject.put("issave", model.getIssave());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowForwardSqlDefEntity model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getFlowForwardD() != null) {
			jsonObject.put("flowForwardD", model.getFlowForwardD());
		}
		jsonObject.put("intandor", model.getIntandor());
		jsonObject.put("sqlconType", model.getSqlconType());
		if (model.getSqlconDtype() != null) {
			jsonObject.put("sqlconDtype", model.getSqlconDtype());
		}
		if (model.getSqlconField() != null) {
			jsonObject.put("sqlconField", model.getSqlconField());
		}
		if (model.getStrsp() != null) {
			jsonObject.put("strsp", model.getStrsp());
		}
		if (model.getSqlconValue() != null) {
			jsonObject.put("sqlconValue", model.getSqlconValue());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		jsonObject.put("issave", model.getIssave());
		return jsonObject;
	}

	public static JSONArray listToArray(
			java.util.List<FlowForwardSqlDefEntity> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForwardSqlDefEntity model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForwardSqlDefEntity> arrayToList(
			JSONArray array) {
		java.util.List<FlowForwardSqlDefEntity> list = new java.util.ArrayList<FlowForwardSqlDefEntity>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForwardSqlDefEntity model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardSqlDefJsonFactory() {

	}

}
