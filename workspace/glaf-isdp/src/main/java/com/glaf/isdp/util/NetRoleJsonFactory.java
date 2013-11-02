package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.NetRole;

public class NetRoleJsonFactory {

	public static NetRole jsonToObject(JSONObject jsonObject) {
		NetRole model = new NetRole();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getInteger("id"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("rolename")) {
			model.setRolename(jsonObject.getString("rolename"));
		}
		if (jsonObject.containsKey("roleuse")) {
			model.setRoleuse(jsonObject.getInteger("roleuse"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("roletype")) {
			model.setRoletype(jsonObject.getInteger("roletype"));
		}
		if (jsonObject.containsKey("busiessId")) {
			model.setBusiessId(jsonObject.getString("busiessId"));
		}
		if (jsonObject.containsKey("tasksort")) {
			model.setTasksort(jsonObject.getInteger("tasksort"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(NetRole model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("listno", model.getListno());
		if (model.getRolename() != null) {
			jsonObject.put("rolename", model.getRolename());
		}
		jsonObject.put("roleuse", model.getRoleuse());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("roletype", model.getRoletype());
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("tasksort", model.getTasksort());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(NetRole model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("listno", model.getListno());
		if (model.getRolename() != null) {
			jsonObject.put("rolename", model.getRolename());
		}
		jsonObject.put("roleuse", model.getRoleuse());
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("roletype", model.getRoletype());
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("tasksort", model.getTasksort());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<NetRole> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (NetRole model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<NetRole> arrayToList(JSONArray array) {
		java.util.List<NetRole> list = new java.util.ArrayList<NetRole>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			NetRole model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private NetRoleJsonFactory() {

	}

}
