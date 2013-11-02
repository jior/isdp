package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.NetRoleUse;

public class NetRoleUseJsonFactory {

	public static NetRoleUse jsonToObject(JSONObject jsonObject) {
		NetRoleUse model = new NetRoleUse();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getInteger("id"));
		}
		if (jsonObject.containsKey("roleid")) {
			model.setRoleid(jsonObject.getInteger("roleid"));
		}
		if (jsonObject.containsKey("celltreedotIndex")) {
			model.setCelltreedotIndex(jsonObject.getInteger("celltreedotIndex"));
		}
		if (jsonObject.containsKey("intuserper")) {
			model.setIntuserper(jsonObject.getInteger("intuserper"));
		}

		return model;
	}

	public static JSONObject toJsonObject(NetRoleUse model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("roleid", model.getRoleid());
		jsonObject.put("celltreedotIndex", model.getCelltreedotIndex());
		jsonObject.put("intuserper", model.getIntuserper());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(NetRoleUse model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("roleid", model.getRoleid());
		jsonObject.put("celltreedotIndex", model.getCelltreedotIndex());
		jsonObject.put("intuserper", model.getIntuserper());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<NetRoleUse> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (NetRoleUse model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<NetRoleUse> arrayToList(JSONArray array) {
		java.util.List<NetRoleUse> list = new java.util.ArrayList<NetRoleUse>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			NetRoleUse model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private NetRoleUseJsonFactory() {

	}

}
