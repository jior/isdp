package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.Hint;

public class HintJsonFactory {

	public static Hint jsonToObject(JSONObject jsonObject) {
		Hint model = new Hint();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("hint")) {
			model.setHint(jsonObject.getString("hint"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Hint model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHint() != null) {
			jsonObject.put("hint", model.getHint());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Hint model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHint() != null) {
			jsonObject.put("hint", model.getHint());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Hint> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Hint model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Hint> arrayToList(JSONArray array) {
		java.util.List<Hint> list = new java.util.ArrayList<Hint>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Hint model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private HintJsonFactory() {

	}

}
