package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreewbsAutostart;

public class TreewbsAutostartJsonFactory {

	public static TreewbsAutostart jsonToObject(JSONObject jsonObject) {
		TreewbsAutostart model = new TreewbsAutostart();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("wbsindex")) {
			model.setWbsindex(jsonObject.getInteger("wbsindex"));
		}
		if (jsonObject.containsKey("intstartype")) {
			model.setIntstartype(jsonObject.getInteger("intstartype"));
		}
		if (jsonObject.containsKey("intstardelayday")) {
			model.setIntstardelayday(jsonObject.getInteger("intstardelayday"));
		}
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreewbsAutostart model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("wbsindex", model.getWbsindex());
		jsonObject.put("intstartype", model.getIntstartype());
		jsonObject.put("intstardelayday", model.getIntstardelayday());
		jsonObject.put("inttype", model.getInttype());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreewbsAutostart model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("wbsindex", model.getWbsindex());
		jsonObject.put("intstartype", model.getIntstartype());
		jsonObject.put("intstardelayday", model.getIntstardelayday());
		jsonObject.put("inttype", model.getInttype());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreewbsAutostart> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreewbsAutostart model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreewbsAutostart> arrayToList(JSONArray array) {
		java.util.List<TreewbsAutostart> list = new java.util.ArrayList<TreewbsAutostart>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreewbsAutostart model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreewbsAutostartJsonFactory() {

	}

}
