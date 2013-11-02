package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.CellDataField;

public class CellDataFieldJsonFactory {

	public static CellDataField jsonToObject(JSONObject jsonObject) {
		CellDataField model = new CellDataField();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("tableid")) {
			model.setTableid(jsonObject.getString("tableid"));
		}
		if (jsonObject.containsKey("fieldname")) {
			model.setFieldname(jsonObject.getString("fieldname"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("maxuser")) {
			model.setMaxuser(jsonObject.getInteger("maxuser"));
		}
		if (jsonObject.containsKey("maxsys")) {
			model.setMaxsys(jsonObject.getInteger("maxsys"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("sysnum")) {
			model.setSysnum(jsonObject.getString("sysnum"));
		}
		if (jsonObject.containsKey("tablename")) {
			model.setTablename(jsonObject.getString("tablename"));
		}
		if (jsonObject.containsKey("dname")) {
			model.setDname(jsonObject.getString("dname"));
		}
		if (jsonObject.containsKey("userindex")) {
			model.setUserindex(jsonObject.getString("userindex"));
		}
		if (jsonObject.containsKey("treetablenameB")) {
			model.setTreetablenameB(jsonObject.getString("treetablenameB"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellDataField model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTableid() != null) {
			jsonObject.put("tableid", model.getTableid());
		}
		if (model.getFieldname() != null) {
			jsonObject.put("fieldname", model.getFieldname());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("maxuser", model.getMaxuser());
		jsonObject.put("maxsys", model.getMaxsys());
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getSysnum() != null) {
			jsonObject.put("sysnum", model.getSysnum());
		}
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getUserindex() != null) {
			jsonObject.put("userindex", model.getUserindex());
		}
		if (model.getTreetablenameB() != null) {
			jsonObject.put("treetablenameB", model.getTreetablenameB());
		}

		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellDataField model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTableid() != null) {
			jsonObject.put("tableid", model.getTableid());
		}
		if (model.getFieldname() != null) {
			jsonObject.put("fieldname", model.getFieldname());
		}
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("maxuser", model.getMaxuser());
		jsonObject.put("maxsys", model.getMaxsys());
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getSysnum() != null) {
			jsonObject.put("sysnum", model.getSysnum());
		}
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getUserindex() != null) {
			jsonObject.put("userindex", model.getUserindex());
		}
		if (model.getTreetablenameB() != null) {
			jsonObject.put("treetablenameB", model.getTreetablenameB());
		}

		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellDataField> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellDataField model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellDataField> arrayToList(JSONArray array) {
		java.util.List<CellDataField> list = new java.util.ArrayList<CellDataField>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellDataField model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellDataFieldJsonFactory() {

	}

}
