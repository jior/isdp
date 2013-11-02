package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.ProjectTreeAllwbs;

public class ProjectTreeAllwbsJsonFactory {

	public static ProjectTreeAllwbs jsonToObject(JSONObject jsonObject) {
		ProjectTreeAllwbs model = new ProjectTreeAllwbs();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("cellTaskIndexId")) {
			model.setCellTaskIndexId(jsonObject.getInteger("cellTaskIndexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getInteger("type"));
		}
		if (jsonObject.containsKey("roleid")) {
			model.setRoleid(jsonObject.getInteger("roleid"));
		}
		if (jsonObject.containsKey("rolename")) {
			model.setRolename(jsonObject.getString("rolename"));
		}
		if (jsonObject.containsKey("limtime")) {
			model.setLimtime(jsonObject.getInteger("limtime"));
		}
		if (jsonObject.containsKey("userid")) {
			model.setUserid(jsonObject.getString("userid"));
		}
		if (jsonObject.containsKey("username")) {
			model.setUsername(jsonObject.getString("username"));
		}
		if (jsonObject.containsKey("starttime")) {
			model.setStarttime(jsonObject.getDate("starttime"));
		}
		if (jsonObject.containsKey("endtime")) {
			model.setEndtime(jsonObject.getDate("endtime"));
		}
		if (jsonObject.containsKey("intfinish")) {
			model.setIntfinish(jsonObject.getInteger("intfinish"));
		}
		if (jsonObject.containsKey("mainId")) {
			model.setMainId(jsonObject.getString("mainId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(ProjectTreeAllwbs model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("cellTaskIndexId", model.getCellTaskIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("type", model.getType());
		jsonObject.put("roleid", model.getRoleid());
		if (model.getRolename() != null) {
			jsonObject.put("rolename", model.getRolename());
		}
		jsonObject.put("limtime", model.getLimtime());
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getUsername() != null) {
			jsonObject.put("username", model.getUsername());
		}
		if (model.getStarttime() != null) {
			jsonObject
					.put("starttime", DateUtils.getDate(model.getStarttime()));
			jsonObject.put("starttime_date",
					DateUtils.getDate(model.getStarttime()));
			jsonObject.put("starttime_datetime",
					DateUtils.getDateTime(model.getStarttime()));
		}
		if (model.getEndtime() != null) {
			jsonObject.put("endtime", DateUtils.getDate(model.getEndtime()));
			jsonObject.put("endtime_date",
					DateUtils.getDate(model.getEndtime()));
			jsonObject.put("endtime_datetime",
					DateUtils.getDateTime(model.getEndtime()));
		}
		jsonObject.put("intfinish", model.getIntfinish());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ProjectTreeAllwbs model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("cellTaskIndexId", model.getCellTaskIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("type", model.getType());
		jsonObject.put("roleid", model.getRoleid());
		if (model.getRolename() != null) {
			jsonObject.put("rolename", model.getRolename());
		}
		jsonObject.put("limtime", model.getLimtime());
		if (model.getUserid() != null) {
			jsonObject.put("userid", model.getUserid());
		}
		if (model.getUsername() != null) {
			jsonObject.put("username", model.getUsername());
		}
		if (model.getStarttime() != null) {
			jsonObject
					.put("starttime", DateUtils.getDate(model.getStarttime()));
			jsonObject.put("starttime_date",
					DateUtils.getDate(model.getStarttime()));
			jsonObject.put("starttime_datetime",
					DateUtils.getDateTime(model.getStarttime()));
		}
		if (model.getEndtime() != null) {
			jsonObject.put("endtime", DateUtils.getDate(model.getEndtime()));
			jsonObject.put("endtime_date",
					DateUtils.getDate(model.getEndtime()));
			jsonObject.put("endtime_datetime",
					DateUtils.getDateTime(model.getEndtime()));
		}
		jsonObject.put("intfinish", model.getIntfinish());
		if (model.getMainId() != null) {
			jsonObject.put("mainId", model.getMainId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<ProjectTreeAllwbs> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ProjectTreeAllwbs model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ProjectTreeAllwbs> arrayToList(JSONArray array) {
		java.util.List<ProjectTreeAllwbs> list = new java.util.ArrayList<ProjectTreeAllwbs>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ProjectTreeAllwbs model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ProjectTreeAllwbsJsonFactory() {

	}

}
