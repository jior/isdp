package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellMenuList;

public class CellMenuListJsonFactory {

	public static CellMenuList jsonToObject(JSONObject jsonObject) {
		CellMenuList model = new CellMenuList();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellMenuList model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellMenuList model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellMenuList> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellMenuList model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellMenuList> arrayToList(JSONArray array) {
		java.util.List<CellMenuList> list = new java.util.ArrayList<CellMenuList>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellMenuList model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellMenuListJsonFactory() {

	}

}
