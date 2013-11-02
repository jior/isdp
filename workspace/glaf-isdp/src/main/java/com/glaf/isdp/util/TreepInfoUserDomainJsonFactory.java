package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreepInfoUserDomain;

public class TreepInfoUserDomainJsonFactory {

	public static TreepInfoUserDomain jsonToObject(JSONObject jsonObject) {
		TreepInfoUserDomain model = new TreepInfoUserDomain();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreepInfoUserDomain model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreepInfoUserDomain model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreepInfoUserDomain> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreepInfoUserDomain model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreepInfoUserDomain> arrayToList(
			JSONArray array) {
		java.util.List<TreepInfoUserDomain> list = new java.util.ArrayList<TreepInfoUserDomain>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreepInfoUserDomain model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreepInfoUserDomainJsonFactory() {

	}

}
