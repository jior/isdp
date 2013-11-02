package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellRepInfo2;

public class CellRepInfo2JsonFactory {

	public static CellRepInfo2 jsonToObject(JSONObject jsonObject) {
		CellRepInfo2 model = new CellRepInfo2();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("frmtype")) {
			model.setFrmtype(jsonObject.getString("frmtype"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getInteger("type"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("formula")) {
			model.setFormula(jsonObject.getString("formula"));
		}
		if (jsonObject.containsKey("ostTablename")) {
			model.setOstTablename(jsonObject.getString("ostTablename"));
		}
		if (jsonObject.containsKey("ostRow")) {
			model.setOstRow(jsonObject.getInteger("ostRow"));
		}
		if (jsonObject.containsKey("ostCol")) {
			model.setOstCol(jsonObject.getInteger("ostCol"));
		}
		if (jsonObject.containsKey("ostRowend")) {
			model.setOstRowend(jsonObject.getInteger("ostRowend"));
		}
		if (jsonObject.containsKey("ostColend")) {
			model.setOstColend(jsonObject.getInteger("ostColend"));
		}
		if (jsonObject.containsKey("ostCellid")) {
			model.setOstCellid(jsonObject.getString("ostCellid"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("ostColor")) {
			model.setOstColor(jsonObject.getInteger("ostColor"));
		}
		if (jsonObject.containsKey("ostWay")) {
			model.setOstWay(jsonObject.getInteger("ostWay"));
		}
		if (jsonObject.containsKey("roleId")) {
			model.setRoleId(jsonObject.getInteger("roleId"));
		}
		if (jsonObject.containsKey("tablename")) {
			model.setTablename(jsonObject.getString("tablename"));
		}
		if (jsonObject.containsKey("fname")) {
			model.setFname(jsonObject.getString("fname"));
		}
		if (jsonObject.containsKey("dname")) {
			model.setDname(jsonObject.getString("dname"));
		}
		if (jsonObject.containsKey("issubtable")) {
			model.setIssubtable(jsonObject.getString("issubtable"));
		}
		if (jsonObject.containsKey("tablename2")) {
			model.setTablename2(jsonObject.getString("tablename2"));
		}
		if (jsonObject.containsKey("intautoinvalue")) {
			model.setIntautoinvalue(jsonObject.getInteger("intautoinvalue"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellRepInfo2 model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		jsonObject.put("type", model.getType());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getFormula() != null) {
			jsonObject.put("formula", model.getFormula());
		}
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		jsonObject.put("ostRowend", model.getOstRowend());
		jsonObject.put("ostColend", model.getOstColend());
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("ostColor", model.getOstColor());
		jsonObject.put("ostWay", model.getOstWay());
		jsonObject.put("roleId", model.getRoleId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getIssubtable() != null) {
			jsonObject.put("issubtable", model.getIssubtable());
		}
		if (model.getTablename2() != null) {
			jsonObject.put("tablename2", model.getTablename2());
		}
		jsonObject.put("intautoinvalue", model.getIntautoinvalue());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellRepInfo2 model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		jsonObject.put("type", model.getType());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getFormula() != null) {
			jsonObject.put("formula", model.getFormula());
		}
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		jsonObject.put("ostRowend", model.getOstRowend());
		jsonObject.put("ostColend", model.getOstColend());
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("ostColor", model.getOstColor());
		jsonObject.put("ostWay", model.getOstWay());
		jsonObject.put("roleId", model.getRoleId());
		if (model.getTablename() != null) {
			jsonObject.put("tablename", model.getTablename());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getIssubtable() != null) {
			jsonObject.put("issubtable", model.getIssubtable());
		}
		if (model.getTablename2() != null) {
			jsonObject.put("tablename2", model.getTablename2());
		}
		jsonObject.put("intautoinvalue", model.getIntautoinvalue());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellRepInfo2> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellRepInfo2 model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellRepInfo2> arrayToList(JSONArray array) {
		java.util.List<CellRepInfo2> list = new java.util.ArrayList<CellRepInfo2>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellRepInfo2 model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellRepInfo2JsonFactory() {

	}

}
