package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.UserRole;

public class UserRoleJsonFactory {

	public static UserRole jsonToObject(JSONObject jsonObject) {
		UserRole model = new UserRole();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("roleid")) {
			model.setRoleid(jsonObject.getString("roleid"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("rsysid")) {
			model.setRsysid(jsonObject.getString("rsysid"));
		}
		if (jsonObject.containsKey("ruserid")) {
			model.setRuserid(jsonObject.getString("ruserid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(UserRole model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleid() != null) {
			jsonObject.put("roleid", model.getRoleid());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getRsysid() != null) {
			jsonObject.put("rsysid", model.getRsysid());
		}
		if (model.getRuserid() != null) {
			jsonObject.put("ruserid", model.getRuserid());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(UserRole model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleid() != null) {
			jsonObject.put("roleid", model.getRoleid());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getRsysid() != null) {
			jsonObject.put("rsysid", model.getRsysid());
		}
		if (model.getRuserid() != null) {
			jsonObject.put("ruserid", model.getRuserid());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<UserRole> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (UserRole model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<UserRole> arrayToList(JSONArray array) {
		java.util.List<UserRole> list = new java.util.ArrayList<UserRole>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			UserRole model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private UserRoleJsonFactory() {

	}

}
