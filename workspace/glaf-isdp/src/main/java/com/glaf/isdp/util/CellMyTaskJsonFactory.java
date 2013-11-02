package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.CellMyTask;

public class CellMyTaskJsonFactory {

	public static CellMyTask jsonToObject(JSONObject jsonObject) {
		CellMyTask model = new CellMyTask();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("fillformId")) {
			model.setFillformId(jsonObject.getString("fillformId"));
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
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
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
		if (jsonObject.containsKey("page")) {
			model.setPage(jsonObject.getInteger("page"));
		}
		if (jsonObject.containsKey("finishint")) {
			model.setFinishint(jsonObject.getInteger("finishint"));
		}
		if (jsonObject.containsKey("formtypeint")) {
			model.setFormtypeint(jsonObject.getInteger("formtypeint"));
		}
		if (jsonObject.containsKey("flagint")) {
			model.setFlagint(jsonObject.getInteger("flagint"));
		}
		if (jsonObject.containsKey("intinflow")) {
			model.setIntinflow(jsonObject.getInteger("intinflow"));
		}
		if (jsonObject.containsKey("mainId")) {
			model.setMainId(jsonObject.getString("mainId"));
		}
		if (jsonObject.containsKey("intlastpage")) {
			model.setIntlastpage(jsonObject.getInteger("intlastpage"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellMyTask model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getFillformId() != null) {
			jsonObject.put("fillformId", model.getFillformId());
		}
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
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getProjname() != null) {
			jsonObject.put("projname", model.getProjname());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		jsonObject.put("page", model.getPage());
		jsonObject.put("finishint", model.getFinishint());
		jsonObject.put("formtypeint", model.getFormtypeint());
		jsonObject.put("flagint", model.getFlagint());
		jsonObject.put("intinflow", model.getIntinflow());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		jsonObject.put("intlastpage", model.getIntlastpage());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellMyTask model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getFillformId() != null) {
			jsonObject.put("fillformId", model.getFillformId());
		}
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
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getProjname() != null) {
			jsonObject.put("projname", model.getProjname());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		jsonObject.put("page", model.getPage());
		jsonObject.put("finishint", model.getFinishint());
		jsonObject.put("formtypeint", model.getFormtypeint());
		jsonObject.put("flagint", model.getFlagint());
		jsonObject.put("intinflow", model.getIntinflow());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		jsonObject.put("intlastpage", model.getIntlastpage());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellMyTask> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellMyTask model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellMyTask> arrayToList(JSONArray array) {
		java.util.List<CellMyTask> list = new java.util.ArrayList<CellMyTask>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellMyTask model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellMyTaskJsonFactory() {

	}

}
