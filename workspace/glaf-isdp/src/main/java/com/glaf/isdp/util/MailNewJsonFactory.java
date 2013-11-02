package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.MailNew;

public class MailNewJsonFactory {

	public static MailNew jsonToObject(JSONObject jsonObject) {
		MailNew model = new MailNew();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("email")) {
			model.setEmail(jsonObject.getString("email"));
		}
		if (jsonObject.containsKey("emailId")) {
			model.setEmailId(jsonObject.getString("emailId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MailNew model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		if (model.getEmailId() != null) {
			jsonObject.put("emailId", model.getEmailId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MailNew model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		if (model.getEmailId() != null) {
			jsonObject.put("emailId", model.getEmailId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MailNew> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MailNew model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MailNew> arrayToList(JSONArray array) {
		java.util.List<MailNew> list = new java.util.ArrayList<MailNew>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MailNew model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MailNewJsonFactory() {

	}

}
