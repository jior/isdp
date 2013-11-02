package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.ProjectCellAndFile;

public class ProjectCellAndFileJsonFactory {

	public static ProjectCellAndFile jsonToObject(JSONObject jsonObject) {
		ProjectCellAndFile model = new ProjectCellAndFile();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("defId")) {
			model.setDefId(jsonObject.getString("defId"));
		}
		if (jsonObject.containsKey("useId")) {
			model.setUseId(jsonObject.getString("useId"));
		}
		if (jsonObject.containsKey("intPage0")) {
			model.setIntPage0(jsonObject.getInteger("intPage0"));
		}
		if (jsonObject.containsKey("intPage1")) {
			model.setIntPage1(jsonObject.getInteger("intPage1"));
		}
		if (jsonObject.containsKey("intPage2")) {
			model.setIntPage2(jsonObject.getInteger("intPage2"));
		}
		if (jsonObject.containsKey("intfinish")) {
			model.setIntfinish(jsonObject.getInteger("intfinish"));
		}

		return model;
	}

	public static JSONObject toJsonObject(ProjectCellAndFile model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("inttype", model.getInttype());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getDefId() != null) {
			jsonObject.put("defId", model.getDefId());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		jsonObject.put("intPage0", model.getIntPage0());
		jsonObject.put("intPage1", model.getIntPage1());
		jsonObject.put("intPage2", model.getIntPage2());
		jsonObject.put("intfinish", model.getIntfinish());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ProjectCellAndFile model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("inttype", model.getInttype());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getDefId() != null) {
			jsonObject.put("defId", model.getDefId());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		jsonObject.put("intPage0", model.getIntPage0());
		jsonObject.put("intPage1", model.getIntPage1());
		jsonObject.put("intPage2", model.getIntPage2());
		jsonObject.put("intfinish", model.getIntfinish());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<ProjectCellAndFile> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ProjectCellAndFile model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ProjectCellAndFile> arrayToList(JSONArray array) {
		java.util.List<ProjectCellAndFile> list = new java.util.ArrayList<ProjectCellAndFile>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ProjectCellAndFile model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ProjectCellAndFileJsonFactory() {

	}

}
