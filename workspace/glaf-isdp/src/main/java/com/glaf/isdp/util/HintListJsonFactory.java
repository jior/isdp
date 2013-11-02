package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.HintList;

public class HintListJsonFactory {

	public static HintList jsonToObject(JSONObject jsonObject) {
		HintList model = new HintList();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("hintid")) {
			model.setHintid(jsonObject.getString("hintid"));
		}
		if (jsonObject.containsKey("list")) {
			model.setList(jsonObject.getString("list"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("hintdata")) {
			model.setHintdata(jsonObject.getInteger("hintdata"));
		}

		return model;
	}

	public static JSONObject toJsonObject(HintList model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHintid() != null) {
			jsonObject.put("hintid", model.getHintid());
		}
		if (model.getList() != null) {
			jsonObject.put("list", model.getList());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("hintdata", model.getHintdata());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(HintList model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getHintid() != null) {
			jsonObject.put("hintid", model.getHintid());
		}
		if (model.getList() != null) {
			jsonObject.put("list", model.getList());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("hintdata", model.getHintdata());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<HintList> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (HintList model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<HintList> arrayToList(JSONArray array) {
		java.util.List<HintList> list = new java.util.ArrayList<HintList>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			HintList model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private HintListJsonFactory() {

	}

}
