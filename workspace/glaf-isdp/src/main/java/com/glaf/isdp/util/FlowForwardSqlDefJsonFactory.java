package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FlowForwardSqlDef;

public class FlowForwardSqlDefJsonFactory {

	public static FlowForwardSqlDef jsonToObject(JSONObject jsonObject) {
		FlowForwardSqlDef model = new FlowForwardSqlDef();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("processId")) {
			model.setProcessId(jsonObject.getString("processId"));
		}
		if (jsonObject.containsKey("flowForwardD")) {
			model.setFlowForwardD(jsonObject.getString("flowForwardD"));
		}
		if (jsonObject.containsKey("intandor")) {
			model.setIntandor(jsonObject.getInteger("intandor"));
		}
		if (jsonObject.containsKey("sqlconType")) {
			model.setSqlconType(jsonObject.getInteger("sqlconType"));
		}
		if (jsonObject.containsKey("sqlconDtype")) {
			model.setSqlconDtype(jsonObject.getString("sqlconDtype"));
		}
		if (jsonObject.containsKey("sqlconField")) {
			model.setSqlconField(jsonObject.getString("sqlconField"));
		}
		if (jsonObject.containsKey("strsp")) {
			model.setStrsp(jsonObject.getString("strsp"));
		}
		if (jsonObject.containsKey("sqlconValue")) {
			model.setSqlconValue(jsonObject.getString("sqlconValue"));
		}
		if (jsonObject.containsKey("sqlconshow")) {
			model.setSqlconshow(jsonObject.getString("sqlconshow"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FlowForwardSqlDef model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getFlowForwardD() != null) {
			jsonObject.put("flowForwardD", model.getFlowForwardD());
		}
		jsonObject.put("intandor", model.getIntandor());
		jsonObject.put("sqlconType", model.getSqlconType());
		if (model.getSqlconDtype() != null) {
			jsonObject.put("sqlconDtype", model.getSqlconDtype());
		}
		if (model.getSqlconField() != null) {
			jsonObject.put("sqlconField", model.getSqlconField());
		}
		if (model.getStrsp() != null) {
			jsonObject.put("strsp", model.getStrsp());
		}
		if (model.getSqlconValue() != null) {
			jsonObject.put("sqlconValue", model.getSqlconValue());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		jsonObject.put("issave", model.getIssave());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FlowForwardSqlDef model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getProcessId() != null) {
			jsonObject.put("processId", model.getProcessId());
		}
		if (model.getFlowForwardD() != null) {
			jsonObject.put("flowForwardD", model.getFlowForwardD());
		}
		jsonObject.put("intandor", model.getIntandor());
		jsonObject.put("sqlconType", model.getSqlconType());
		if (model.getSqlconDtype() != null) {
			jsonObject.put("sqlconDtype", model.getSqlconDtype());
		}
		if (model.getSqlconField() != null) {
			jsonObject.put("sqlconField", model.getSqlconField());
		}
		if (model.getStrsp() != null) {
			jsonObject.put("strsp", model.getStrsp());
		}
		if (model.getSqlconValue() != null) {
			jsonObject.put("sqlconValue", model.getSqlconValue());
		}
		if (model.getSqlconshow() != null) {
			jsonObject.put("sqlconshow", model.getSqlconshow());
		}
		jsonObject.put("issave", model.getIssave());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FlowForwardSqlDef> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FlowForwardSqlDef model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FlowForwardSqlDef> arrayToList(JSONArray array) {
		java.util.List<FlowForwardSqlDef> list = new java.util.ArrayList<FlowForwardSqlDef>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FlowForwardSqlDef model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FlowForwardSqlDefJsonFactory() {

	}

}
