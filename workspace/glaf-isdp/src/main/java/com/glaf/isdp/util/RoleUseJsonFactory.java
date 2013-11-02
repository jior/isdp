package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.RoleUse;

public class RoleUseJsonFactory {

	public static RoleUse jsonToObject(JSONObject jsonObject) {
		RoleUse model = new RoleUse();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("roleId")) {
			model.setRoleId(jsonObject.getString("roleId"));
		}
		if (jsonObject.containsKey("usetype")) {
			model.setUsetype(jsonObject.getString("usetype"));
		}
		if (jsonObject.containsKey("pid")) {
			model.setPid(jsonObject.getInteger("pid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(RoleUse model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleId() != null) {
			jsonObject.put("roleId", model.getRoleId());
		}
		if (model.getUsetype() != null) {
			jsonObject.put("usetype", model.getUsetype());
		}
		jsonObject.put("pid", model.getPid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(RoleUse model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleId() != null) {
			jsonObject.put("roleId", model.getRoleId());
		}
		if (model.getUsetype() != null) {
			jsonObject.put("usetype", model.getUsetype());
		}
		jsonObject.put("pid", model.getPid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<RoleUse> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (RoleUse model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<RoleUse> arrayToList(JSONArray array) {
		java.util.List<RoleUse> list = new java.util.ArrayList<RoleUse>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			RoleUse model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private RoleUseJsonFactory() {

	}

}
