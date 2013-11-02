package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreeProject;

public class TreeProjectJsonFactory {

	public static TreeProject jsonToObject(JSONObject jsonObject) {
		TreeProject model = new TreeProject();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topId")) {
			model.setTopId(jsonObject.getInteger("topId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("useId")) {
			model.setUseId(jsonObject.getString("useId"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("content2")) {
			model.setContent2(jsonObject.getString("content2"));
		}
		if (jsonObject.containsKey("topnode")) {
			model.setTopnode(jsonObject.getString("topnode"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("projtype")) {
			model.setProjtype(jsonObject.getString("projtype"));
		}
		if (jsonObject.containsKey("unitnum")) {
			model.setUnitnum(jsonObject.getString("unitnum"));
		}
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("ispegwork")) {
			model.setIspegwork(jsonObject.getString("ispegwork"));
		}
		if (jsonObject.containsKey("treeprojUser2")) {
			model.setTreeprojUser2(jsonObject.getString("treeprojUser2"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreeProject model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("topId", model.getTopId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		if (model.getUnitnum() != null) {
			jsonObject.put("unitnum", model.getUnitnum());
		}
		jsonObject.put("showid", model.getShowid());
		if (model.getIspegwork() != null) {
			jsonObject.put("ispegwork", model.getIspegwork());
		}
		if (model.getTreeprojUser2() != null) {
			jsonObject.put("treeprojUser2", model.getTreeprojUser2());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreeProject model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("topId", model.getTopId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getUseId() != null) {
			jsonObject.put("useId", model.getUseId());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		if (model.getUnitnum() != null) {
			jsonObject.put("unitnum", model.getUnitnum());
		}
		jsonObject.put("showid", model.getShowid());
		if (model.getIspegwork() != null) {
			jsonObject.put("ispegwork", model.getIspegwork());
		}
		if (model.getTreeprojUser2() != null) {
			jsonObject.put("treeprojUser2", model.getTreeprojUser2());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreeProject> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreeProject model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreeProject> arrayToList(JSONArray array) {
		java.util.List<TreeProject> list = new java.util.ArrayList<TreeProject>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreeProject model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreeProjectJsonFactory() {

	}

}
