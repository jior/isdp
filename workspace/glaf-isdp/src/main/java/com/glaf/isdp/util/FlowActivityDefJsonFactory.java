package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FlowActivityDef;

public class FlowActivityDefJsonFactory {

	public static FlowActivityDef jsonToObject(JSONObject jsonObject) {
		FlowActivityDef model = new FlowActivityDef();
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

	public static JSONObject toJsonObject(FlowActivityDef model) {
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

	public static ObjectNode toObjectNode(FlowActivityDef model) {
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

	public static JSONArray listToArray(java.util.List<FlowActivityDef> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowActivityDef model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowActivityDef> arrayToList(JSONArray array) {
		java.util.List<FlowActivityDef> list = new java.util.ArrayList<FlowActivityDef>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowActivityDef model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowActivityDefJsonFactory() {

	}

}
