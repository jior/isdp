package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.FlowProcessDef;

public class FlowProcessDefJsonFactory {

	public static FlowProcessDef jsonToObject(JSONObject jsonObject) {
		FlowProcessDef model = new FlowProcessDef();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("mainId")) {
			model.setMainId(jsonObject.getString("mainId"));
		}
		if (jsonObject.containsKey("fileid")) {
			model.setFileid(jsonObject.getString("fileid"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("actor")) {
			model.setActor(jsonObject.getString("actor"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("version")) {
			model.setVersion(jsonObject.getString("version"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}
		if (jsonObject.containsKey("intflag")) {
			model.setIntflag(jsonObject.getInteger("intflag"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowProcessDef model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		if (model.getFileid() != null) {
			jsonObject.put("fileid", model.getFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getActor() != null) {
			jsonObject.put("actor", model.getActor());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getVersion() != null) {
			jsonObject.put("version", model.getVersion());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("intflag", model.getIntflag());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowProcessDef model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		if (model.getFileid() != null) {
			jsonObject.put("fileid", model.getFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getActor() != null) {
			jsonObject.put("actor", model.getActor());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getVersion() != null) {
			jsonObject.put("version", model.getVersion());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("intflag", model.getIntflag());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowProcessDef> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowProcessDef model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowProcessDef> arrayToList(JSONArray array) {
		java.util.List<FlowProcessDef> list = new java.util.ArrayList<FlowProcessDef>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowProcessDef model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowProcessDefJsonFactory() {

	}

}
