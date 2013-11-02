package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreewbsTab;

public class TreewbsTabJsonFactory {

	public static TreewbsTab jsonToObject(JSONObject jsonObject) {
		TreewbsTab model = new TreewbsTab();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("tabIndex")) {
			model.setTabIndex(jsonObject.getInteger("tabIndex"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("oname")) {
			model.setOname(jsonObject.getString("oname"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreewbsTab model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("tabIndex", model.getTabIndex());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getOname() != null) {
			jsonObject.put("oname", model.getOname());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreewbsTab model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("tabIndex", model.getTabIndex());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getOname() != null) {
			jsonObject.put("oname", model.getOname());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreewbsTab> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreewbsTab model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreewbsTab> arrayToList(JSONArray array) {
		java.util.List<TreewbsTab> list = new java.util.ArrayList<TreewbsTab>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreewbsTab model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreewbsTabJsonFactory() {

	}

}
