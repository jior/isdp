package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellRepInfoChart;

public class CellRepInfoChartJsonFactory {

	public static CellRepInfoChart jsonToObject(JSONObject jsonObject) {
		CellRepInfoChart model = new CellRepInfoChart();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("nameLine")) {
			model.setNameLine(jsonObject.getString("nameLine"));
		}
		if (jsonObject.containsKey("dnameX")) {
			model.setDnameX(jsonObject.getString("dnameX"));
		}
		if (jsonObject.containsKey("dnameY")) {
			model.setDnameY(jsonObject.getString("dnameY"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellRepInfoChart model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getNameLine() != null) {
			jsonObject.put("nameLine", model.getNameLine());
		}
		if (model.getDnameX() != null) {
			jsonObject.put("dnameX", model.getDnameX());
		}
		if (model.getDnameY() != null) {
			jsonObject.put("dnameY", model.getDnameY());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellRepInfoChart model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getNameLine() != null) {
			jsonObject.put("nameLine", model.getNameLine());
		}
		if (model.getDnameX() != null) {
			jsonObject.put("dnameX", model.getDnameX());
		}
		if (model.getDnameY() != null) {
			jsonObject.put("dnameY", model.getDnameY());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellRepInfoChart> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellRepInfoChart model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellRepInfoChart> arrayToList(JSONArray array) {
		java.util.List<CellRepInfoChart> list = new java.util.ArrayList<CellRepInfoChart>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellRepInfoChart model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellRepInfoChartJsonFactory() {

	}

}
