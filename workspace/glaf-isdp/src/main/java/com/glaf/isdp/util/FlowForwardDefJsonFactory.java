package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FlowForwardDef;

public class FlowForwardDefJsonFactory {

	public static FlowForwardDef jsonToObject(JSONObject jsonObject) {
		FlowForwardDef model = new FlowForwardDef();
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

	public static JSONObject toJsonObject(FlowForwardDef model) {
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

	public static ObjectNode toObjectNode(FlowForwardDef model) {
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

	public static JSONArray listToArray(java.util.List<FlowForwardDef> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForwardDef model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForwardDef> arrayToList(JSONArray array) {
		java.util.List<FlowForwardDef> list = new java.util.ArrayList<FlowForwardDef>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForwardDef model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardDefJsonFactory() {

	}

}
