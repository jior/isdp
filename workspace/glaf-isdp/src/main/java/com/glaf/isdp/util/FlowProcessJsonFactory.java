package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.FlowProcess;

public class FlowProcessJsonFactory {

	public static FlowProcess jsonToObject(JSONObject jsonObject) {
		FlowProcess model = new FlowProcess();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processDefId")) {
			model.setProcessDefId(jsonObject.getString("processDefId"));
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
		if (jsonObject.containsKey("state")) {
			model.setState(jsonObject.getInteger("state"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowProcess model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessDefId() != null) {
			jsonObject.put("processDefId", model.getProcessDefId());
		}
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
		jsonObject.put("state", model.getState());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowProcess model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessDefId() != null) {
			jsonObject.put("processDefId", model.getProcessDefId());
		}
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
		jsonObject.put("state", model.getState());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowProcess> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowProcess model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowProcess> arrayToList(JSONArray array) {
		java.util.List<FlowProcess> list = new java.util.ArrayList<FlowProcess>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowProcess model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowProcessJsonFactory() {

	}

}
