package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreewbsAutoindex;

public class TreewbsAutoindexJsonFactory {

	public static TreewbsAutoindex jsonToObject(JSONObject jsonObject) {
		TreewbsAutoindex model = new TreewbsAutoindex();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("autoindex")) {
			model.setAutoindex(jsonObject.getInteger("autoindex"));
		}
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}
		if (jsonObject.containsKey("indexRule")) {
			model.setIndexRule(jsonObject.getInteger("indexRule"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreewbsAutoindex model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("autoindex", model.getAutoindex());
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("indexRule", model.getIndexRule());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreewbsAutoindex model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("autoindex", model.getAutoindex());
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("indexRule", model.getIndexRule());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreewbsAutoindex> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreewbsAutoindex model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreewbsAutoindex> arrayToList(JSONArray array) {
		java.util.List<TreewbsAutoindex> list = new java.util.ArrayList<TreewbsAutoindex>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreewbsAutoindex model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreewbsAutoindexJsonFactory() {

	}

}
