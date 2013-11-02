package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.Treewbs;

public class TreewbsJsonFactory {

	public static Treewbs jsonToObject(JSONObject jsonObject) {
		Treewbs model = new Treewbs();
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
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
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
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}
		if (jsonObject.containsKey("pindexId")) {
			model.setPindexId(jsonObject.getInteger("pindexId"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("intusetname")) {
			model.setIntusetname(jsonObject.getInteger("intusetname"));
		}
		if (jsonObject.containsKey("intstartype")) {
			model.setIntstartype(jsonObject.getInteger("intstartype"));
		}
		if (jsonObject.containsKey("intstardelayday")) {
			model.setIntstardelayday(jsonObject.getInteger("intstardelayday"));
		}
		if (jsonObject.containsKey("intstartA")) {
			model.setIntstartA(jsonObject.getInteger("intstartA"));
		}
		if (jsonObject.containsKey("intstartP")) {
			model.setIntstartP(jsonObject.getInteger("intstartP"));
		}
		if (jsonObject.containsKey("intendA")) {
			model.setIntendA(jsonObject.getInteger("intendA"));
		}
		if (jsonObject.containsKey("intendP")) {
			model.setIntendP(jsonObject.getInteger("intendP"));
		}
		if (jsonObject.containsKey("intneednode")) {
			model.setIntneednode(jsonObject.getInteger("intneednode"));
		}
		if (jsonObject.containsKey("intusetnum")) {
			model.setIntusetnum(jsonObject.getInteger("intusetnum"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}
		if (jsonObject.containsKey("strfileLocate")) {
			model.setStrfileLocate(jsonObject.getString("strfileLocate"));
		}
		if (jsonObject.containsKey("intnodetype")) {
			model.setIntnodetype(jsonObject.getInteger("intnodetype"));
		}
		if (jsonObject.containsKey("intloadfile")) {
			model.setIntloadfile(jsonObject.getInteger("intloadfile"));
		}
		if (jsonObject.containsKey("intorglevel")) {
			model.setIntorglevel(jsonObject.getInteger("intorglevel"));
		}
		if (jsonObject.containsKey("uindexId")) {
			model.setUindexId(jsonObject.getInteger("uindexId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Treewbs model) {
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
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("pindexId", model.getPindexId());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		jsonObject.put("intusetname", model.getIntusetname());
		jsonObject.put("intstartype", model.getIntstartype());
		jsonObject.put("intstardelayday", model.getIntstardelayday());
		jsonObject.put("intstartA", model.getIntstartA());
		jsonObject.put("intstartP", model.getIntstartP());
		jsonObject.put("intendA", model.getIntendA());
		jsonObject.put("intendP", model.getIntendP());
		jsonObject.put("intneednode", model.getIntneednode());
		jsonObject.put("intusetnum", model.getIntusetnum());
		jsonObject.put("domainIndex", model.getDomainIndex());
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		jsonObject.put("intnodetype", model.getIntnodetype());
		jsonObject.put("intloadfile", model.getIntloadfile());
		jsonObject.put("intorglevel", model.getIntorglevel());
		jsonObject.put("uindexId", model.getUindexId());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Treewbs model) {
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
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("pindexId", model.getPindexId());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		jsonObject.put("intusetname", model.getIntusetname());
		jsonObject.put("intstartype", model.getIntstartype());
		jsonObject.put("intstardelayday", model.getIntstardelayday());
		jsonObject.put("intstartA", model.getIntstartA());
		jsonObject.put("intstartP", model.getIntstartP());
		jsonObject.put("intendA", model.getIntendA());
		jsonObject.put("intendP", model.getIntendP());
		jsonObject.put("intneednode", model.getIntneednode());
		jsonObject.put("intusetnum", model.getIntusetnum());
		jsonObject.put("domainIndex", model.getDomainIndex());
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		jsonObject.put("intnodetype", model.getIntnodetype());
		jsonObject.put("intloadfile", model.getIntloadfile());
		jsonObject.put("intorglevel", model.getIntorglevel());
		jsonObject.put("uindexId", model.getUindexId());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Treewbs> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Treewbs model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Treewbs> arrayToList(JSONArray array) {
		java.util.List<Treewbs> list = new java.util.ArrayList<Treewbs>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Treewbs model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreewbsJsonFactory() {

	}

}
