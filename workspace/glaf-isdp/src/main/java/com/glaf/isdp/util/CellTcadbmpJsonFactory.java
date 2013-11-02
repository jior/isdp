package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellTcadbmp;

public class CellTcadbmpJsonFactory {

	public static CellTcadbmp jsonToObject(JSONObject jsonObject) {
		CellTcadbmp model = new CellTcadbmp();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("fileid")) {
			model.setFileid(jsonObject.getString("fileid"));
		}
		if (jsonObject.containsKey("ostTablename")) {
			model.setOstTablename(jsonObject.getString("ostTablename"));
		}
		if (jsonObject.containsKey("ostCellid")) {
			model.setOstCellid(jsonObject.getString("ostCellid"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellTcadbmp model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFileid() != null) {
			jsonObject.put("fileid", model.getFileid());
		}
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellTcadbmp model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFileid() != null) {
			jsonObject.put("fileid", model.getFileid());
		}
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellTcadbmp> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellTcadbmp model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellTcadbmp> arrayToList(JSONArray array) {
		java.util.List<CellTcadbmp> list = new java.util.ArrayList<CellTcadbmp>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellTcadbmp model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellTcadbmpJsonFactory() {

	}

}
