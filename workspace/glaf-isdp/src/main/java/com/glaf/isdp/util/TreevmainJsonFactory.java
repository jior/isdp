package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.Treevmain;

public class TreevmainJsonFactory {

	public static Treevmain jsonToObject(JSONObject jsonObject) {
		Treevmain model = new Treevmain();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
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
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getString("filenum"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("vflag")) {
			model.setVflag(jsonObject.getString("vflag"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("ztype")) {
			model.setZtype(jsonObject.getInteger("ztype"));
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

		return model;
	}

	public static JSONObject toJsonObject(Treevmain model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Treevmain model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Treevmain> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Treevmain model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Treevmain> arrayToList(JSONArray array) {
		java.util.List<Treevmain> list = new java.util.ArrayList<Treevmain>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Treevmain model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreevmainJsonFactory() {

	}

}
