package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellUseDataInfo;

public class CellUseDataInfoJsonFactory {

	public static CellUseDataInfo jsonToObject(JSONObject jsonObject) {
		CellUseDataInfo model = new CellUseDataInfo();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("tablename")) {
			model.setTablename(jsonObject.getString("tablename"));
		}
		if (jsonObject.containsKey("tableId")) {
			model.setTableId(jsonObject.getString("tableId"));
		}
		if (jsonObject.containsKey("ostTablename")) {
			model.setOstTablename(jsonObject.getInteger("ostTablename"));
		}
		if (jsonObject.containsKey("ostRow")) {
			model.setOstRow(jsonObject.getInteger("ostRow"));
		}
		if (jsonObject.containsKey("ostCol")) {
			model.setOstCol(jsonObject.getInteger("ostCol"));
		}
		if (jsonObject.containsKey("flag")) {
			model.setFlag(jsonObject.getInteger("flag"));
		}
		if (jsonObject.containsKey("level")) {
			model.setLevel(jsonObject.getInteger("level"));
		}
		if (jsonObject.containsKey("useTablename")) {
			model.setUseTablename(jsonObject.getString("useTablename"));
		}
		if (jsonObject.containsKey("useId")) {
			model.setUseId(jsonObject.getString("useId"));
		}
		if (jsonObject.containsKey("useIndexId")) {
			model.setUseIndexId(jsonObject.getInteger("useIndexId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellUseDataInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getTableId() != null) {
			jsonObject.put("tableId", model.getTableId());
		}
		jsonObject.put("ostTablename", model.getOstTablename());
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		jsonObject.put("flag", model.getFlag());
		jsonObject.put("level", model.getLevel());
		if (model.getUseTablename() != null) {
			jsonObject.put("useTablename", model.getUseTablename());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		jsonObject.put("useIndexId", model.getUseIndexId());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellUseDataInfo model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getTableId() != null) {
			jsonObject.put("tableId", model.getTableId());
		}
		jsonObject.put("ostTablename", model.getOstTablename());
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		jsonObject.put("flag", model.getFlag());
		jsonObject.put("level", model.getLevel());
		if (model.getUseTablename() != null) {
			jsonObject.put("useTablename", model.getUseTablename());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		jsonObject.put("useIndexId", model.getUseIndexId());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellUseDataInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellUseDataInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellUseDataInfo> arrayToList(JSONArray array) {
		java.util.List<CellUseDataInfo> list = new java.util.ArrayList<CellUseDataInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellUseDataInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellUseDataInfoJsonFactory() {

	}

}
