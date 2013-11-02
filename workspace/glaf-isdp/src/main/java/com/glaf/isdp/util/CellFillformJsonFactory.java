package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.IsdpCellFillForm;

public class CellFillformJsonFactory {

	public static IsdpCellFillForm jsonToObject(JSONObject jsonObject) {
		IsdpCellFillForm model = new IsdpCellFillForm();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("taskId")) {
			model.setTaskId(jsonObject.getString("taskId"));
		}
		if (jsonObject.containsKey("pfileflag")) {
			model.setPfileflag(jsonObject.getInteger("pfileflag"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("chknum")) {
			model.setChknum(jsonObject.getString("chknum"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("chktotal")) {
			model.setChktotal(jsonObject.getInteger("chktotal"));
		}
		if (jsonObject.containsKey("chkresult")) {
			model.setChkresult(jsonObject.getInteger("chkresult"));
		}
		if (jsonObject.containsKey("pfileId")) {
			model.setPfileId(jsonObject.getString("pfileId"));
		}
		if (jsonObject.containsKey("tempsave")) {
			model.setTempsave(jsonObject.getInteger("tempsave"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("refillflag")) {
			model.setRefillflag(jsonObject.getInteger("refillflag"));
		}
		if (jsonObject.containsKey("groupid")) {
			model.setGroupid(jsonObject.getInteger("groupid"));
		}
		if (jsonObject.containsKey("oldId")) {
			model.setOldId(jsonObject.getString("oldId"));
		}
		if (jsonObject.containsKey("roleId")) {
			model.setRoleId(jsonObject.getInteger("roleId"));
		}
		if (jsonObject.containsKey("isfinish")) {
			model.setIsfinish(jsonObject.getInteger("isfinish"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}
		if (jsonObject.containsKey("typeIndexId")) {
			model.setTypeIndexId(jsonObject.getInteger("typeIndexId"));
		}
		if (jsonObject.containsKey("mainId")) {
			model.setMainId(jsonObject.getString("mainId"));
		}
		if (jsonObject.containsKey("intlastpage")) {
			model.setIntlastpage(jsonObject.getInteger("intlastpage"));
		}
		if (jsonObject.containsKey("intsheets")) {
			model.setIntsheets(jsonObject.getInteger("intsheets"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpCellFillForm model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		jsonObject.put("indexId", model.getIndexId());
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		jsonObject.put("pfileflag", model.getPfileflag());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getChknum() != null) {
			jsonObject.put("chknum", model.getChknum());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chktotal", model.getChktotal());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
		jsonObject.put("tempsave", model.getTempsave());
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("refillflag", model.getRefillflag());
		jsonObject.put("groupid", model.getGroupid());
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		jsonObject.put("roleId", model.getRoleId());
		jsonObject.put("isfinish", model.getIsfinish());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		jsonObject.put("intlastpage", model.getIntlastpage());
		jsonObject.put("intsheets", model.getIntsheets());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpCellFillForm model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		jsonObject.put("indexId", model.getIndexId());
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		jsonObject.put("pfileflag", model.getPfileflag());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getChknum() != null) {
			jsonObject.put("chknum", model.getChknum());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chktotal", model.getChktotal());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
		jsonObject.put("tempsave", model.getTempsave());
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		jsonObject.put("refillflag", model.getRefillflag());
		jsonObject.put("groupid", model.getGroupid());
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		jsonObject.put("roleId", model.getRoleId());
		jsonObject.put("isfinish", model.getIsfinish());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		jsonObject.put("intlastpage", model.getIntlastpage());
		jsonObject.put("intsheets", model.getIntsheets());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpCellFillForm> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpCellFillForm model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpCellFillForm> arrayToList(JSONArray array) {
		java.util.List<IsdpCellFillForm> list = new java.util.ArrayList<IsdpCellFillForm>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpCellFillForm model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellFillformJsonFactory() {

	}

}
