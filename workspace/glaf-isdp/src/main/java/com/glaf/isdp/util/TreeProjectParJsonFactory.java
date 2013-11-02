package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreeProjectPar;

public class TreeProjectParJsonFactory {

	public static TreeProjectPar jsonToObject(JSONObject jsonObject) {
		TreeProjectPar model = new TreeProjectPar();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("treeprojParUser1")) {
			model.setTreeProjectParUser1(jsonObject
					.getInteger("treeprojParUser1"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreeProjectPar model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("treeprojParUser1", model.getTreeProjectParUser1());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreeProjectPar model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("treeprojParUser1", model.getTreeProjectParUser1());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreeProjectPar> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreeProjectPar model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreeProjectPar> arrayToList(JSONArray array) {
		java.util.List<TreeProjectPar> list = new java.util.ArrayList<TreeProjectPar>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreeProjectPar model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreeProjectParJsonFactory() {

	}

}
