package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.Treetop;

public class TreetopJsonFactory {

	public static Treetop jsonToObject(JSONObject jsonObject) {
		Treetop model = new Treetop();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
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
		if (jsonObject.containsKey("ftype")) {
			model.setFtype(jsonObject.getString("ftype"));
		}
		if (jsonObject.containsKey("secondIndexName")) {
			model.setSecondIndexName(jsonObject.getString("secondIndexName"));
		}
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getString("filenum"));
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
		if (jsonObject.containsKey("isnotshow")) {
			model.setIsnotshow(jsonObject.getString("isnotshow"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("filenumid")) {
			model.setFilenumid(jsonObject.getString("filenumid"));
		}
		if (jsonObject.containsKey("slevel")) {
			model.setSlevel(jsonObject.getString("slevel"));
		}
		if (jsonObject.containsKey("savetime")) {
			model.setSavetime(jsonObject.getString("savetime"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Treetop model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
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
		if (model.getFtype() != null) {
			jsonObject.put("ftype", model.getFtype());
		}
		if (model.getSecondIndexName() != null) {
			jsonObject.put("secondIndexName", model.getSecondIndexName());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getIsnotshow() != null) {
			jsonObject.put("isnotshow", model.getIsnotshow());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Treetop model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
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
		if (model.getFtype() != null) {
			jsonObject.put("ftype", model.getFtype());
		}
		if (model.getSecondIndexName() != null) {
			jsonObject.put("secondIndexName", model.getSecondIndexName());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getIsnotshow() != null) {
			jsonObject.put("isnotshow", model.getIsnotshow());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Treetop> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Treetop model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Treetop> arrayToList(JSONArray array) {
		java.util.List<Treetop> list = new java.util.ArrayList<Treetop>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Treetop model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreetopJsonFactory() {

	}

}
