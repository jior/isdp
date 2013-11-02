package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellCriterionTree;

public class CellCriterionTreeJsonFactory {

	public static CellCriterionTree jsonToObject(JSONObject jsonObject) {
		CellCriterionTree model = new CellCriterionTree();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("treeprojIndex")) {
			model.setTreeprojIndex(jsonObject.getInteger("treeprojIndex"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("isuse")) {
			model.setIsuse(jsonObject.getInteger("isuse"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellCriterionTree model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("treeprojIndex", model.getTreeprojIndex());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("isuse", model.getIsuse());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("inttype", model.getInttype());

		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellCriterionTree model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("treeprojIndex", model.getTreeprojIndex());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("isuse", model.getIsuse());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("inttype", model.getInttype());

		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellCriterionTree> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellCriterionTree model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellCriterionTree> arrayToList(JSONArray array) {
		java.util.List<CellCriterionTree> list = new java.util.ArrayList<CellCriterionTree>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellCriterionTree model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellCriterionTreeJsonFactory() {

	}

}
