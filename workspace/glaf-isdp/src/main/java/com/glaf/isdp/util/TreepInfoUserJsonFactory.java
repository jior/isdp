package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreepInfoUser;

public class TreepInfoUserJsonFactory {

	public static TreepInfoUser jsonToObject(JSONObject jsonObject) {
		TreepInfoUser model = new TreepInfoUser();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
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
		if (jsonObject.containsKey("nodetype")) {
			model.setNodetype(jsonObject.getString("nodetype"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getInteger("fromid"));
		}
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("projtype")) {
			model.setProjtype(jsonObject.getString("projtype"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("partId")) {
			model.setPartId(jsonObject.getInteger("partId"));
		}
		if (jsonObject.containsKey("pfilesIndex")) {
			model.setPfilesIndex(jsonObject.getInteger("pfilesIndex"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("strfileLocate")) {
			model.setStrfileLocate(jsonObject.getString("strfileLocate"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreepInfoUser model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
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
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("showid", model.getShowid());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("partId", model.getPartId());
		jsonObject.put("pfilesIndex", model.getPfilesIndex());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreepInfoUser model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
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
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("showid", model.getShowid());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("partId", model.getPartId());
		jsonObject.put("pfilesIndex", model.getPfilesIndex());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreepInfoUser> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreepInfoUser model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreepInfoUser> arrayToList(JSONArray array) {
		java.util.List<TreepInfoUser> list = new java.util.ArrayList<TreepInfoUser>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreepInfoUser model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreepInfoUserJsonFactory() {

	}

}
