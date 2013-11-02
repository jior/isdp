package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.ProjectCellAndFileRef;

public class ProjectCellAndFileRefJsonFactory {

	public static ProjectCellAndFileRef jsonToObject(JSONObject jsonObject) {
		ProjectCellAndFileRef model = new ProjectCellAndFileRef();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("pfileid")) {
			model.setPfileid(jsonObject.getString("pfileid"));
		}
		if (jsonObject.containsKey("cellid")) {
			model.setCellid(jsonObject.getString("cellid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(ProjectCellAndFileRef model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getPfileid() != null) {
			jsonObject.put("pfileid", model.getPfileid());
		}
		if (model.getCellid() != null) {
			jsonObject.put("cellid", model.getCellid());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ProjectCellAndFileRef model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getPfileid() != null) {
			jsonObject.put("pfileid", model.getPfileid());
		}
		if (model.getCellid() != null) {
			jsonObject.put("cellid", model.getCellid());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(
			java.util.List<ProjectCellAndFileRef> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ProjectCellAndFileRef model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ProjectCellAndFileRef> arrayToList(
			JSONArray array) {
		java.util.List<ProjectCellAndFileRef> list = new java.util.ArrayList<ProjectCellAndFileRef>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ProjectCellAndFileRef model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ProjectCellAndFileRefJsonFactory() {

	}

}
