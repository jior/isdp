package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellHintlist;

public class CellHintlistJsonFactory {

	public static CellHintlist jsonToObject(JSONObject jsonObject) {
		CellHintlist model = new CellHintlist();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("hint")) {
			model.setHint(jsonObject.getString("hint"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellHintlist model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHint() != null) {
			jsonObject.put("hint", model.getHint());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellHintlist model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHint() != null) {
			jsonObject.put("hint", model.getHint());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellHintlist> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellHintlist model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellHintlist> arrayToList(JSONArray array) {
		java.util.List<CellHintlist> list = new java.util.ArrayList<CellHintlist>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellHintlist model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellHintlistJsonFactory() {

	}

}
