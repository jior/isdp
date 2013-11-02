package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.ListShow;

public class ListShowJsonFactory {

	public static ListShow jsonToObject(JSONObject jsonObject) {
		ListShow model = new ListShow();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("listId")) {
			model.setListId(jsonObject.getString("listId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("frmtype")) {
			model.setFrmtype(jsonObject.getString("frmtype"));
		}
		if (jsonObject.containsKey("leftL")) {
			model.setLeftL(jsonObject.getInteger("leftL"));
		}
		if (jsonObject.containsKey("topL")) {
			model.setTopL(jsonObject.getInteger("topL"));
		}
		if (jsonObject.containsKey("widthL")) {
			model.setWidthL(jsonObject.getInteger("widthL"));
		}
		if (jsonObject.containsKey("heightL")) {
			model.setHeightL(jsonObject.getInteger("heightL"));
		}
		if (jsonObject.containsKey("leftC")) {
			model.setLeftC(jsonObject.getInteger("leftC"));
		}
		if (jsonObject.containsKey("topC")) {
			model.setTopC(jsonObject.getInteger("topC"));
		}
		if (jsonObject.containsKey("widthC")) {
			model.setWidthC(jsonObject.getInteger("widthC"));
		}
		if (jsonObject.containsKey("heightC")) {
			model.setHeightC(jsonObject.getInteger("heightC"));
		}

		return model;
	}

	public static JSONObject toJsonObject(ListShow model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getListId() != null) {
			jsonObject.put("listId", model.getListId());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		jsonObject.put("leftL", model.getLeftL());
		jsonObject.put("topL", model.getTopL());
		jsonObject.put("widthL", model.getWidthL());
		jsonObject.put("heightL", model.getHeightL());
		jsonObject.put("leftC", model.getLeftC());
		jsonObject.put("topC", model.getTopC());
		jsonObject.put("widthC", model.getWidthC());
		jsonObject.put("heightC", model.getHeightC());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ListShow model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getListId() != null) {
			jsonObject.put("listId", model.getListId());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		jsonObject.put("leftL", model.getLeftL());
		jsonObject.put("topL", model.getTopL());
		jsonObject.put("widthL", model.getWidthL());
		jsonObject.put("heightL", model.getHeightL());
		jsonObject.put("leftC", model.getLeftC());
		jsonObject.put("topC", model.getTopC());
		jsonObject.put("widthC", model.getWidthC());
		jsonObject.put("heightC", model.getHeightC());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<ListShow> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ListShow model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ListShow> arrayToList(JSONArray array) {
		java.util.List<ListShow> list = new java.util.ArrayList<ListShow>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ListShow model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ListShowJsonFactory() {

	}

}
