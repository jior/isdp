package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.Role;

public class RoleJsonFactory {

	public static Role jsonToObject(JSONObject jsonObject) {
		Role model = new Role();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("roleName")) {
			model.setRoleName(jsonObject.getString("roleName"));
		}
		if (jsonObject.containsKey("roletype")) {
			model.setRoletype(jsonObject.getString("roletype"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("alldata")) {
			model.setAlldata(jsonObject.getString("alldata"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Role model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleName() != null) {
			jsonObject.put("roleName", model.getRoleName());
		}
		if (model.getRoletype() != null) {
			jsonObject.put("roletype", model.getRoletype());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getAlldata() != null) {
			jsonObject.put("alldata", model.getAlldata());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Role model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleName() != null) {
			jsonObject.put("roleName", model.getRoleName());
		}
		if (model.getRoletype() != null) {
			jsonObject.put("roletype", model.getRoletype());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getAlldata() != null) {
			jsonObject.put("alldata", model.getAlldata());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Role> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Role model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Role> arrayToList(JSONArray array) {
		java.util.List<Role> list = new java.util.ArrayList<Role>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Role model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private RoleJsonFactory() {

	}

}
