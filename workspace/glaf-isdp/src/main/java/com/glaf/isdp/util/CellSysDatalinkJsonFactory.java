package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellSysDatalink;

public class CellSysDatalinkJsonFactory {

	public static CellSysDatalink jsonToObject(JSONObject jsonObject) {
		CellSysDatalink model = new CellSysDatalink();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("busiessIdSrc")) {
			model.setBusiessIdSrc(jsonObject.getString("busiessIdSrc"));
		}
		if (jsonObject.containsKey("fileidSrc")) {
			model.setFileidSrc(jsonObject.getString("fileidSrc"));
		}
		if (jsonObject.containsKey("dotnameSrc")) {
			model.setDotnameSrc(jsonObject.getString("dotnameSrc"));
		}
		if (jsonObject.containsKey("busiessIdDes")) {
			model.setBusiessIdDes(jsonObject.getString("busiessIdDes"));
		}
		if (jsonObject.containsKey("buiessnameDes")) {
			model.setBuiessnameDes(jsonObject.getString("buiessnameDes"));
		}
		if (jsonObject.containsKey("fileidDes")) {
			model.setFileidDes(jsonObject.getString("fileidDes"));
		}
		if (jsonObject.containsKey("dotnameDes")) {
			model.setDotnameDes(jsonObject.getString("dotnameDes"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellSysDatalink model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getBusiessIdSrc() != null) {
			jsonObject.put("busiessIdSrc", model.getBusiessIdSrc());
		}
		if (model.getFileidSrc() != null) {
			jsonObject.put("fileidSrc", model.getFileidSrc());
		}
		if (model.getDotnameSrc() != null) {
			jsonObject.put("dotnameSrc", model.getDotnameSrc());
		}
		if (model.getBusiessIdDes() != null) {
			jsonObject.put("busiessIdDes", model.getBusiessIdDes());
		}
		if (model.getBuiessnameDes() != null) {
			jsonObject.put("buiessnameDes", model.getBuiessnameDes());
		}
		if (model.getFileidDes() != null) {
			jsonObject.put("fileidDes", model.getFileidDes());
		}
		if (model.getDotnameDes() != null) {
			jsonObject.put("dotnameDes", model.getDotnameDes());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellSysDatalink model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getBusiessIdSrc() != null) {
			jsonObject.put("busiessIdSrc", model.getBusiessIdSrc());
		}
		if (model.getFileidSrc() != null) {
			jsonObject.put("fileidSrc", model.getFileidSrc());
		}
		if (model.getDotnameSrc() != null) {
			jsonObject.put("dotnameSrc", model.getDotnameSrc());
		}
		if (model.getBusiessIdDes() != null) {
			jsonObject.put("busiessIdDes", model.getBusiessIdDes());
		}
		if (model.getBuiessnameDes() != null) {
			jsonObject.put("buiessnameDes", model.getBuiessnameDes());
		}
		if (model.getFileidDes() != null) {
			jsonObject.put("fileidDes", model.getFileidDes());
		}
		if (model.getDotnameDes() != null) {
			jsonObject.put("dotnameDes", model.getDotnameDes());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellSysDatalink> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellSysDatalink model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellSysDatalink> arrayToList(JSONArray array) {
		java.util.List<CellSysDatalink> list = new java.util.ArrayList<CellSysDatalink>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellSysDatalink model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellSysDatalinkJsonFactory() {

	}

}
