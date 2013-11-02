package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.RoleUse2;

public class RoleUse2JsonFactory {

	public static RoleUse2 jsonToObject(JSONObject jsonObject) {
		RoleUse2 model = new RoleUse2();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("roleId")) {
			model.setRoleId(jsonObject.getString("roleId"));
		}
		if (jsonObject.containsKey("useType")) {
			model.setUseType(jsonObject.getString("useType"));
		}
		if (jsonObject.containsKey("pid")) {
			model.setPid(jsonObject.getInteger("pid"));
		}
		if (jsonObject.containsKey("treeType")) {
			model.setTreeType(jsonObject.getInteger("treeType"));
		}
		if (jsonObject.containsKey("userchk")) {
			model.setUserchk(jsonObject.getString("userchk"));
		}
		if (jsonObject.containsKey("treeId")) {
			model.setTreeId(jsonObject.getString("treeId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(RoleUse2 model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleId() != null) {
			jsonObject.put("roleId", model.getRoleId());
		}
		if (model.getUseType() != null) {
			jsonObject.put("useType", model.getUseType());
		}
		jsonObject.put("pid", model.getPid());
		jsonObject.put("treeType", model.getTreeType());
		if (model.getUserchk() != null) {
			jsonObject.put("userchk", model.getUserchk());
		}
		if (model.getTreeId() != null) {
			jsonObject.put("treeId", model.getTreeId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(RoleUse2 model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getRoleId() != null) {
			jsonObject.put("roleId", model.getRoleId());
		}
		if (model.getUseType() != null) {
			jsonObject.put("useType", model.getUseType());
		}
		jsonObject.put("pid", model.getPid());
		jsonObject.put("treeType", model.getTreeType());
		if (model.getUserchk() != null) {
			jsonObject.put("userchk", model.getUserchk());
		}
		if (model.getTreeId() != null) {
			jsonObject.put("treeId", model.getTreeId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<RoleUse2> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (RoleUse2 model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<RoleUse2> arrayToList(JSONArray array) {
		java.util.List<RoleUse2> list = new java.util.ArrayList<RoleUse2>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			RoleUse2 model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private RoleUse2JsonFactory() {

	}

}
