package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FlowStation;

public class FlowStationJsonFactory {

	public static FlowStation jsonToObject(JSONObject jsonObject) {
		FlowStation model = new FlowStation();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("activDefId")) {
			model.setActivDefId(jsonObject.getString("activDefId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowStation model) {
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
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowStation model) {
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
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowStation> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowStation model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowStation> arrayToList(JSONArray array) {
		java.util.List<FlowStation> list = new java.util.ArrayList<FlowStation>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowStation model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowStationJsonFactory() {

	}

}
