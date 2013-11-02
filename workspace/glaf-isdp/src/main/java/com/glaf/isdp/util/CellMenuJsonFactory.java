package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellMenu;

public class CellMenuJsonFactory {

	public static CellMenu jsonToObject(JSONObject jsonObject) {
		CellMenu model = new CellMenu();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("isuselect")) {
			model.setIsuselect(jsonObject.getString("isuselect"));
		}
		if (jsonObject.containsKey("issystem")) {
			model.setIssystem(jsonObject.getInteger("issystem"));
		}
		if (jsonObject.containsKey("intused")) {
			model.setIntused(jsonObject.getInteger("intused"));
		}
		if (jsonObject.containsKey("busiessId")) {
			model.setBusiessId(jsonObject.getString("busiessId"));
		}
		if (jsonObject.containsKey("intdel")) {
			model.setIntdel(jsonObject.getInteger("intdel"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellMenu model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getIsuselect() != null) {
			jsonObject.put("isuselect", model.getIsuselect());
		}
		jsonObject.put("issystem", model.getIssystem());
		jsonObject.put("intused", model.getIntused());
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("intdel", model.getIntdel());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellMenu model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getIsuselect() != null) {
			jsonObject.put("isuselect", model.getIsuselect());
		}
		jsonObject.put("issystem", model.getIssystem());
		jsonObject.put("intused", model.getIntused());
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("intdel", model.getIntdel());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellMenu> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellMenu model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellMenu> arrayToList(JSONArray array) {
		java.util.List<CellMenu> list = new java.util.ArrayList<CellMenu>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellMenu model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellMenuJsonFactory() {

	}

}
