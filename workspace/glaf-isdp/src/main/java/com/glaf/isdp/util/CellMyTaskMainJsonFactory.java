package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.CellMyTaskMain;

public class CellMyTaskMainJsonFactory {

	public static CellMyTaskMain jsonToObject(JSONObject jsonObject) {
		CellMyTaskMain model = new CellMyTaskMain();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("taskId")) {
			model.setTaskId(jsonObject.getString("taskId"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("projname")) {
			model.setProjname(jsonObject.getString("projname"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("typeIndexId")) {
			model.setTypeIndexId(jsonObject.getInteger("typeIndexId"));
		}
		if (jsonObject.containsKey("flagint")) {
			model.setFlagint(jsonObject.getInteger("flagint"));
		}
		if (jsonObject.containsKey("mycellTasksId")) {
			model.setMycellTasksId(jsonObject.getString("mycellTasksId"));
		}
		if (jsonObject.containsKey("fromtasksid")) {
			model.setFromtasksid(jsonObject.getString("fromtasksid"));
		}
		if (jsonObject.containsKey("totaskid")) {
			model.setTotaskid(jsonObject.getString("totaskid"));
		}
		if (jsonObject.containsKey("intfinish")) {
			model.setIntfinish(jsonObject.getInteger("intfinish"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("netroleid")) {
			model.setNetroleid(jsonObject.getString("netroleid"));
		}
		if (jsonObject.containsKey("intisflow")) {
			model.setIntisflow(jsonObject.getInteger("intisflow"));
		}
		if (jsonObject.containsKey("intStop")) {
			model.setIntStop(jsonObject.getInteger("intStop"));
		}
		if (jsonObject.containsKey("filetypeIndex")) {
			model.setFiletypeIndex(jsonObject.getInteger("filetypeIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellMyTaskMain model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		jsonObject.put("indexId", model.getIndexId());
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getProjname() != null) {
			jsonObject.put("projname", model.getProjname());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		jsonObject.put("flagint", model.getFlagint());
		if (model.getMycellTasksId() != null) {
			jsonObject.put("mycellTasksId", model.getMycellTasksId());
		}
		if (model.getFromtasksid() != null) {
			jsonObject.put("fromtasksid", model.getFromtasksid());
		}
		if (model.getTotaskid() != null) {
			jsonObject.put("totaskid", model.getTotaskid());
		}
		jsonObject.put("intfinish", model.getIntfinish());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		jsonObject.put("intisflow", model.getIntisflow());
		jsonObject.put("intStop", model.getIntStop());
		jsonObject.put("filetypeIndex", model.getFiletypeIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellMyTaskMain model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		jsonObject.put("indexId", model.getIndexId());
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getProjname() != null) {
			jsonObject.put("projname", model.getProjname());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		jsonObject.put("flagint", model.getFlagint());
		if (model.getMycellTasksId() != null) {
			jsonObject.put("mycellTasksId", model.getMycellTasksId());
		}
		if (model.getFromtasksid() != null) {
			jsonObject.put("fromtasksid", model.getFromtasksid());
		}
		if (model.getTotaskid() != null) {
			jsonObject.put("totaskid", model.getTotaskid());
		}
		jsonObject.put("intfinish", model.getIntfinish());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getNetroleid() != null) {
			jsonObject.put("netroleid", model.getNetroleid());
		}
		jsonObject.put("intisflow", model.getIntisflow());
		jsonObject.put("intStop", model.getIntStop());
		jsonObject.put("filetypeIndex", model.getFiletypeIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellMyTaskMain> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellMyTaskMain model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellMyTaskMain> arrayToList(JSONArray array) {
		java.util.List<CellMyTaskMain> list = new java.util.ArrayList<CellMyTaskMain>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellMyTaskMain model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellMyTaskMainJsonFactory() {

	}

}
