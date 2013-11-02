package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.CellUpicInfo;

public class CellUpicInfoJsonFactory {

	public static CellUpicInfo jsonToObject(JSONObject jsonObject) {
		CellUpicInfo model = new CellUpicInfo();
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
		if (jsonObject.containsKey("tagnum")) {
			model.setTagnum(jsonObject.getString("tagnum"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("tname")) {
			model.setTname(jsonObject.getString("tname"));
		}
		if (jsonObject.containsKey("page")) {
			model.setPage(jsonObject.getInteger("page"));
		}
		if (jsonObject.containsKey("duty")) {
			model.setDuty(jsonObject.getString("duty"));
		}
		if (jsonObject.containsKey("thematic")) {
			model.setThematic(jsonObject.getString("thematic"));
		}
		if (jsonObject.containsKey("annotations")) {
			model.setAnnotations(jsonObject.getString("annotations"));
		}
		if (jsonObject.containsKey("typeIndexId")) {
			model.setTypeIndexId(jsonObject.getInteger("typeIndexId"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellUpicInfo model) {
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
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chktotal", model.getChktotal());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
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
		if (model.getTagnum() != null) {
			jsonObject.put("tagnum", model.getTagnum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		jsonObject.put("page", model.getPage());
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellUpicInfo model) {
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
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chktotal", model.getChktotal());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
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
		if (model.getTagnum() != null) {
			jsonObject.put("tagnum", model.getTagnum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		jsonObject.put("page", model.getPage());
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		jsonObject.put("typeIndexId", model.getTypeIndexId());
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellUpicInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellUpicInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellUpicInfo> arrayToList(JSONArray array) {
		java.util.List<CellUpicInfo> list = new java.util.ArrayList<CellUpicInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellUpicInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellUpicInfoJsonFactory() {

	}

}
