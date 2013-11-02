package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FlowForward;

public class FlowForwardJsonFactory {

	public static FlowForward jsonToObject(JSONObject jsonObject) {
		FlowForward model = new FlowForward();
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

	public static JSONObject toJsonObject(FlowForward model) {
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

	public static ObjectNode toObjectNode(FlowForward model) {
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

	public static JSONArray listToArray(java.util.List<FlowForward> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForward model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForward> arrayToList(JSONArray array) {
		java.util.List<FlowForward> list = new java.util.ArrayList<FlowForward>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForward model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardJsonFactory() {

	}

}
