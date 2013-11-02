package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellDottofile;

public class CellDottofileJsonFactory {

	public static CellDottofile jsonToObject(JSONObject jsonObject) {
		CellDottofile model = new CellDottofile();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("treetopIndexid")) {
			model.setTreetopIndexid(jsonObject.getInteger("treetopIndexid"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellDottofile model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("treetopIndexid", model.getTreetopIndexid());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellDottofile model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("treetopIndexid", model.getTreetopIndexid());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		jsonObject.put("listno", model.getListno());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellDottofile> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellDottofile model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellDottofile> arrayToList(JSONArray array) {
		java.util.List<CellDottofile> list = new java.util.ArrayList<CellDottofile>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellDottofile model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellDottofileJsonFactory() {

	}

}
