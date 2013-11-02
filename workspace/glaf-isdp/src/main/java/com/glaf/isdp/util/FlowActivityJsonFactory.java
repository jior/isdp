package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.FlowActivity;

public class FlowActivityJsonFactory {

	public static FlowActivity jsonToObject(JSONObject jsonObject) {
		FlowActivity model = new FlowActivity();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("activDefId")) {
			model.setActivDefId(jsonObject.getString("activDefId"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("typeofact")) {
			model.setTypeofact(jsonObject.getString("typeofact"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("strfuntion")) {
			model.setStrfuntion(jsonObject.getString("strfuntion"));
		}
		if (jsonObject.containsKey("netroleid")) {
			model.setNetroleid(jsonObject.getString("netroleid"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("ctimeStart")) {
			model.setCtimeStart(jsonObject.getDate("ctimeStart"));
		}
		if (jsonObject.containsKey("ctimeEnd")) {
			model.setCtimeEnd(jsonObject.getDate("ctimeEnd"));
		}
		if (jsonObject.containsKey("state")) {
			model.setState(jsonObject.getInteger("state"));
		}
		if (jsonObject.containsKey("intback")) {
			model.setIntback(jsonObject.getInteger("intback"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowActivity model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getActivDefId() != null) {
			jsonObject.put("activDefId", model.getActivDefId());
		}
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getTypeofact() != null) {
			jsonObject.put("typeofact", model.getTypeofact());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getStrfuntion() != null) {
			jsonObject.put("strfuntion", model.getStrfuntion());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getCtimeStart() != null) {
			jsonObject.put("ctimeStart",
					DateUtils.getDate(model.getCtimeStart()));
			jsonObject.put("ctimeStart_date",
					DateUtils.getDate(model.getCtimeStart()));
			jsonObject.put("ctimeStart_datetime",
					DateUtils.getDateTime(model.getCtimeStart()));
		}
		if (model.getCtimeEnd() != null) {
			jsonObject.put("ctimeEnd", DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_date",
					DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_datetime",
					DateUtils.getDateTime(model.getCtimeEnd()));
		}
		jsonObject.put("state", model.getState());
		jsonObject.put("intback", model.getIntback());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowActivity model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getActivDefId() != null) {
			jsonObject.put("activDefId", model.getActivDefId());
		}
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getTypeofact() != null) {
			jsonObject.put("typeofact", model.getTypeofact());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getStrfuntion() != null) {
			jsonObject.put("strfuntion", model.getStrfuntion());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getCtimeStart() != null) {
			jsonObject.put("ctimeStart",
					DateUtils.getDate(model.getCtimeStart()));
			jsonObject.put("ctimeStart_date",
					DateUtils.getDate(model.getCtimeStart()));
			jsonObject.put("ctimeStart_datetime",
					DateUtils.getDateTime(model.getCtimeStart()));
		}
		if (model.getCtimeEnd() != null) {
			jsonObject.put("ctimeEnd", DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_date",
					DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_datetime",
					DateUtils.getDateTime(model.getCtimeEnd()));
		}
		jsonObject.put("state", model.getState());
		jsonObject.put("intback", model.getIntback());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowActivity> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowActivity model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowActivity> arrayToList(JSONArray array) {
		java.util.List<FlowActivity> list = new java.util.ArrayList<FlowActivity>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowActivity model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowActivityJsonFactory() {

	}

}
