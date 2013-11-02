package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.IsdpTreepname;

public class TreepnameJsonFactory {

	public static IsdpTreepname jsonToObject(JSONObject jsonObject) {
		IsdpTreepname model = new IsdpTreepname();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
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
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("ruleId")) {
			model.setRuleId(jsonObject.getString("ruleId"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("fruleId")) {
			model.setFruleId(jsonObject.getString("fruleId"));
		}
		if (jsonObject.containsKey("wcompany")) {
			model.setWcompany(jsonObject.getString("wcompany"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("sysId")) {
			model.setSysId(jsonObject.getString("sysId"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpTreepname model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("showid", model.getShowid());
		if (model.getRuleId() != null) {
			jsonObject.put("ruleId", model.getRuleId());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFruleId() != null) {
			jsonObject.put("fruleId", model.getFruleId());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpTreepname model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("showid", model.getShowid());
		if (model.getRuleId() != null) {
			jsonObject.put("ruleId", model.getRuleId());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getFruleId() != null) {
			jsonObject.put("fruleId", model.getFruleId());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpTreepname> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpTreepname model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpTreepname> arrayToList(JSONArray array) {
		java.util.List<IsdpTreepname> list = new java.util.ArrayList<IsdpTreepname>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpTreepname model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreepnameJsonFactory() {

	}

}
