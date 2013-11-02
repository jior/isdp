package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellSysDatalinkCon;

public class CellSysDatalinkConJsonFactory {

	public static CellSysDatalinkCon jsonToObject(JSONObject jsonObject) {
		CellSysDatalinkCon model = new CellSysDatalinkCon();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("sysdatalinkId")) {
			model.setSysdatalinkId(jsonObject.getString("sysdatalinkId"));
		}
		if (jsonObject.containsKey("sqlconshow")) {
			model.setSqlconshow(jsonObject.getString("sqlconshow"));
		}
		if (jsonObject.containsKey("sqlcon")) {
			model.setSqlcon(jsonObject.getString("sqlcon"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellSysDatalinkCon model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getSysdatalinkId() != null) {
			jsonObject.put("sysdatalinkId", model.getSysdatalinkId());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		if (model.getSqlcon() != null) {
			jsonObject.put("sqlcon", model.getSqlcon());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellSysDatalinkCon model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getSysdatalinkId() != null) {
			jsonObject.put("sysdatalinkId", model.getSysdatalinkId());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		if (model.getSqlcon() != null) {
			jsonObject.put("sqlcon", model.getSqlcon());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellSysDatalinkCon> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellSysDatalinkCon model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellSysDatalinkCon> arrayToList(JSONArray array) {
		java.util.List<CellSysDatalinkCon> list = new java.util.ArrayList<CellSysDatalinkCon>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellSysDatalinkCon model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellSysDatalinkConJsonFactory() {

	}

}
