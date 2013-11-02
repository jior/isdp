package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.ProjectInspection;

public class ProjectInspectionJsonFactory {

	public static ProjectInspection jsonToObject(JSONObject jsonObject) {
		ProjectInspection model = new ProjectInspection();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("intflag")) {
			model.setIntflag(jsonObject.getInteger("intflag"));
		}
		if (jsonObject.containsKey("cellTmpfiletypeId")) {
			model.setCellTmpfiletypeId(jsonObject
					.getString("cellTmpfiletypeId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("chkresult")) {
			model.setChkresult(jsonObject.getInteger("chkresult"));
		}
		if (jsonObject.containsKey("pfileId")) {
			model.setPfileId(jsonObject.getString("pfileId"));
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
		if (jsonObject.containsKey("emailId")) {
			model.setEmailId(jsonObject.getString("emailId"));
		}
		if (jsonObject.containsKey("recemailId")) {
			model.setRecemailId(jsonObject.getString("recemailId"));
		}
		if (jsonObject.containsKey("mainId")) {
			model.setMainId(jsonObject.getString("mainId"));
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

		return model;
	}

	public static JSONObject toJsonObject(ProjectInspection model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("intflag", model.getIntflag());
		if (model.getCellTmpfiletypeId() != null) {
			jsonObject.put("cellTmpfiletypeId", model.getCellTmpfiletypeId());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
		jsonObject.put("refillflag", model.getRefillflag());
		jsonObject.put("groupid", model.getGroupid());
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		if (model.getEmailId() != null) {
			jsonObject.put("emailId", model.getEmailId());
		}
		if (model.getRecemailId() != null) {
			jsonObject.put("recemailId", model.getRecemailId());
		}
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
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
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ProjectInspection model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("intflag", model.getIntflag());
		if (model.getCellTmpfiletypeId() != null) {
			jsonObject.put("cellTmpfiletypeId", model.getCellTmpfiletypeId());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("chkresult", model.getChkresult());
		if (model.getPfileId() != null) {
			jsonObject.put("pfileId", model.getPfileId());
		}
		jsonObject.put("refillflag", model.getRefillflag());
		jsonObject.put("groupid", model.getGroupid());
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		if (model.getEmailId() != null) {
			jsonObject.put("emailId", model.getEmailId());
		}
		if (model.getRecemailId() != null) {
			jsonObject.put("recemailId", model.getRecemailId());
		}
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
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
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<ProjectInspection> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ProjectInspection model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ProjectInspection> arrayToList(JSONArray array) {
		java.util.List<ProjectInspection> list = new java.util.ArrayList<ProjectInspection>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ProjectInspection model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ProjectInspectionJsonFactory() {

	}

}
