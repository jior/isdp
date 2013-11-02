package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellDataVirtable;

public class CellDataVirtableJsonFactory {

	public static CellDataVirtable jsonToObject(JSONObject jsonObject) {
		CellDataVirtable model = new CellDataVirtable();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("tableid")) {
			model.setTableid(jsonObject.getString("tableid"));
		}
		if (jsonObject.containsKey("desid")) {
			model.setDesid(jsonObject.getString("desid"));
		}
		if (jsonObject.containsKey("lstname")) {
			model.setLstname(jsonObject.getString("lstname"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellDataVirtable model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTableid() != null) {
			jsonObject.put("tableid", model.getTableid());
		}
		if (model.getDesid() != null) {
			jsonObject.put("desid", model.getDesid());
		}
		if (model.getLstname() != null) {
			jsonObject.put("lstname", model.getLstname());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellDataVirtable model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTableid() != null) {
			jsonObject.put("tableid", model.getTableid());
		}
		if (model.getDesid() != null) {
			jsonObject.put("desid", model.getDesid());
		}
		if (model.getLstname() != null) {
			jsonObject.put("lstname", model.getLstname());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellDataVirtable> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellDataVirtable model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellDataVirtable> arrayToList(JSONArray array) {
		java.util.List<CellDataVirtable> list = new java.util.ArrayList<CellDataVirtable>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellDataVirtable model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellDataVirtableJsonFactory() {

	}

}
