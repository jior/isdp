package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.NetDotRole;

public class NetDotRoleJsonFactory {

	public static NetDotRole jsonToObject(JSONObject jsonObject) {
		NetDotRole model = new NetDotRole();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("roleId")) {
			model.setRoleId(jsonObject.getInteger("roleId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}

		return model;
	}

	public static JSONObject toJsonObject(NetDotRole model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("roleId", model.getRoleId());
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(NetDotRole model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("roleId", model.getRoleId());
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<NetDotRole> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (NetDotRole model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<NetDotRole> arrayToList(JSONArray array) {
		java.util.List<NetDotRole> list = new java.util.ArrayList<NetDotRole>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			NetDotRole model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private NetDotRoleJsonFactory() {

	}

}
