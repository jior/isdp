package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreewbsName;

public class TreewbsNameJsonFactory {

	public static TreewbsName jsonToObject(JSONObject jsonObject) {
		TreewbsName model = new TreewbsName();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("wbsindex")) {
			model.setWbsindex(jsonObject.getInteger("wbsindex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreewbsName model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("wbsindex", model.getWbsindex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreewbsName model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("wbsindex", model.getWbsindex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreewbsName> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreewbsName model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreewbsName> arrayToList(JSONArray array) {
		java.util.List<TreewbsName> list = new java.util.ArrayList<TreewbsName>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreewbsName model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreewbsNameJsonFactory() {

	}

}
