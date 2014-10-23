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
import com.glaf.bpmn.domain.FlowForwardEntity;

public class FlowForwardJsonFactory {

	public static FlowForwardEntity jsonToObject(JSONObject jsonObject) {
		FlowForwardEntity model = new FlowForwardEntity();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("activDefId")) {
			model.setActivDefId(jsonObject.getString("activDefId"));
		}
		if (jsonObject.containsKey("activDefNext")) {
			model.setActivDefNext(jsonObject.getString("activDefNext"));
		}
		if (jsonObject.containsKey("sendtype")) {
			model.setSendtype(jsonObject.getInteger("sendtype"));
		}
		if (jsonObject.containsKey("sendtimes")) {
			model.setSendtimes(jsonObject.getInteger("sendtimes"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowForwardEntity model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getActivDefId() != null) {
			jsonObject.put("activDefId", model.getActivDefId());
		}
		if (model.getActivDefNext() != null) {
			jsonObject.put("activDefNext", model.getActivDefNext());
		}
		jsonObject.put("sendtype", model.getSendtype());
		jsonObject.put("sendtimes", model.getSendtimes());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowForwardEntity model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getActivDefId() != null) {
			jsonObject.put("activDefId", model.getActivDefId());
		}
		if (model.getActivDefNext() != null) {
			jsonObject.put("activDefNext", model.getActivDefNext());
		}
		jsonObject.put("sendtype", model.getSendtype());
		jsonObject.put("sendtimes", model.getSendtimes());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowForwardEntity> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForwardEntity model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForwardEntity> arrayToList(JSONArray array) {
		java.util.List<FlowForwardEntity> list = new java.util.ArrayList<FlowForwardEntity>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForwardEntity model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardJsonFactory() {

	}

}
