package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.MyCellTaskSub;

public class MycellTaskSubJsonFactory {

	public static MyCellTaskSub jsonToObject(JSONObject jsonObject) {
		MyCellTaskSub model = new MyCellTaskSub();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("tasksId")) {
			model.setTasksId(jsonObject.getString("tasksId"));
		}
		if (jsonObject.containsKey("busiessId")) {
			model.setBusiessId(jsonObject.getString("busiessId"));
		}
		if (jsonObject.containsKey("celldotIndex")) {
			model.setCelldotIndex(jsonObject.getInteger("celldotIndex"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("inttasktype")) {
			model.setInttasktype(jsonObject.getInteger("inttasktype"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("sname")) {
			model.setSname(jsonObject.getString("sname"));
		}
		if (jsonObject.containsKey("intistasks")) {
			model.setIntistasks(jsonObject.getInteger("intistasks"));
		}
		if (jsonObject.containsKey("intprojprocess")) {
			model.setIntprojprocess(jsonObject.getInteger("intprojprocess"));
		}
		if (jsonObject.containsKey("intistype")) {
			model.setIntistype(jsonObject.getInteger("intistype"));
		}
		if (jsonObject.containsKey("nameTab")) {
			model.setNameTab(jsonObject.getString("nameTab"));
		}
		if (jsonObject.containsKey("flowid")) {
			model.setFlowid(jsonObject.getString("flowid"));
		}
		if (jsonObject.containsKey("constr")) {
			model.setConstr(jsonObject.getString("constr"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MyCellTaskSub model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTasksId() != null) {
			jsonObject.put("tasksId", model.getTasksId());
		}
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("celldotIndex", model.getCelldotIndex());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("inttasktype", model.getInttasktype());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getSname() != null) {
			jsonObject.put("sname", model.getSname());
		}
		jsonObject.put("intistasks", model.getIntistasks());
		jsonObject.put("intprojprocess", model.getIntprojprocess());
		jsonObject.put("intistype", model.getIntistype());
		if (model.getNameTab() != null) {
			jsonObject.put("nameTab", model.getNameTab());
		}
		if (model.getFlowid() != null) {
			jsonObject.put("flowid", model.getFlowid());
		}
		if (model.getConstr() != null) {
			jsonObject.put("constr", model.getConstr());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MyCellTaskSub model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTasksId() != null) {
			jsonObject.put("tasksId", model.getTasksId());
		}
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("celldotIndex", model.getCelldotIndex());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("inttasktype", model.getInttasktype());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getSname() != null) {
			jsonObject.put("sname", model.getSname());
		}
		jsonObject.put("intistasks", model.getIntistasks());
		jsonObject.put("intprojprocess", model.getIntprojprocess());
		jsonObject.put("intistype", model.getIntistype());
		if (model.getNameTab() != null) {
			jsonObject.put("nameTab", model.getNameTab());
		}
		if (model.getFlowid() != null) {
			jsonObject.put("flowid", model.getFlowid());
		}
		if (model.getConstr() != null) {
			jsonObject.put("constr", model.getConstr());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MyCellTaskSub> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MyCellTaskSub model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MyCellTaskSub> arrayToList(JSONArray array) {
		java.util.List<MyCellTaskSub> list = new java.util.ArrayList<MyCellTaskSub>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MyCellTaskSub model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MycellTaskSubJsonFactory() {

	}

}
