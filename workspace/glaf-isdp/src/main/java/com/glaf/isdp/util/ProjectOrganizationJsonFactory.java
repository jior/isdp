package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.ProjectOrganization;

public class ProjectOrganizationJsonFactory {

	public static ProjectOrganization jsonToObject(JSONObject jsonObject) {
		ProjectOrganization model = new ProjectOrganization();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("flag")) {
			model.setFlag(jsonObject.getInteger("flag"));
		}
		if (jsonObject.containsKey("sysId")) {
			model.setSysId(jsonObject.getString("sysId"));
		}
		if (jsonObject.containsKey("projectName")) {
			model.setProjectName(jsonObject.getString("projectName"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("dbname")) {
			model.setDbname(jsonObject.getString("dbname"));
		}
		if (jsonObject.containsKey("serverName")) {
			model.setServerName(jsonObject.getString("serverName"));
		}
		if (jsonObject.containsKey("user")) {
			model.setUser(jsonObject.getString("user"));
		}
		if (jsonObject.containsKey("password")) {
			model.setPassword(jsonObject.getString("password"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("email")) {
			model.setEmail(jsonObject.getString("email"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("line")) {
			model.setLine(jsonObject.getInteger("line"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}
		if (jsonObject.containsKey("intLocal")) {
			model.setIntLocal(jsonObject.getInteger("intLocal"));
		}
		if (jsonObject.containsKey("emailPsw")) {
			model.setEmailPsw(jsonObject.getString("emailPsw"));
		}
		if (jsonObject.containsKey("connected")) {
			model.setConnected(jsonObject.getInteger("connected"));
		}
		if (jsonObject.containsKey("emailS")) {
			model.setEmailS(jsonObject.getString("emailS"));
		}
		if (jsonObject.containsKey("orgLevel")) {
			model.setOrgLevel(jsonObject.getInteger("orgLevel"));
		}
		if (jsonObject.containsKey("sendType")) {
			model.setSendType(jsonObject.getInteger("sendType"));
		}
		if (jsonObject.containsKey("emailBackup")) {
			model.setEmailBackup(jsonObject.getString("emailBackup"));
		}
		if (jsonObject.containsKey("emailImplement")) {
			model.setEmailImplement(jsonObject.getString("emailImplement"));
		}

		return model;
	}

	public static JSONObject toJsonObject(ProjectOrganization model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("flag", model.getFlag());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		if (model.getProjectName() != null) {
			jsonObject.put("projectName", model.getProjectName());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getDbname() != null) {
			jsonObject.put("dbname", model.getDbname());
		}
		if (model.getServerName() != null) {
			jsonObject.put("serverName", model.getServerName());
		}
		if (model.getUser() != null) {
			jsonObject.put("user", model.getUser());
		}
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("line", model.getLine());
		jsonObject.put("domainIndex", model.getDomainIndex());
		jsonObject.put("intLocal", model.getIntLocal());
		if (model.getEmailPsw() != null) {
			jsonObject.put("emailPsw", model.getEmailPsw());
		}
		jsonObject.put("connected", model.getConnected());
		if (model.getEmailS() != null) {
			jsonObject.put("emailS", model.getEmailS());
		}
		jsonObject.put("orgLevel", model.getOrgLevel());
		jsonObject.put("sendType", model.getSendType());
		if (model.getEmailBackup() != null) {
			jsonObject.put("emailBackup", model.getEmailBackup());
		}
		if (model.getEmailImplement() != null) {
			jsonObject.put("emailImplement", model.getEmailImplement());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(ProjectOrganization model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("flag", model.getFlag());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		if (model.getProjectName() != null) {
			jsonObject.put("projectName", model.getProjectName());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getDbname() != null) {
			jsonObject.put("dbname", model.getDbname());
		}
		if (model.getServerName() != null) {
			jsonObject.put("serverName", model.getServerName());
		}
		if (model.getUser() != null) {
			jsonObject.put("user", model.getUser());
		}
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		jsonObject.put("parentId", model.getParentId());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("line", model.getLine());
		jsonObject.put("domainIndex", model.getDomainIndex());
		jsonObject.put("intLocal", model.getIntLocal());
		if (model.getEmailPsw() != null) {
			jsonObject.put("emailPsw", model.getEmailPsw());
		}
		jsonObject.put("connected", model.getConnected());
		if (model.getEmailS() != null) {
			jsonObject.put("emailS", model.getEmailS());
		}
		jsonObject.put("orgLevel", model.getOrgLevel());
		jsonObject.put("sendType", model.getSendType());
		if (model.getEmailBackup() != null) {
			jsonObject.put("emailBackup", model.getEmailBackup());
		}
		if (model.getEmailImplement() != null) {
			jsonObject.put("emailImplement", model.getEmailImplement());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<ProjectOrganization> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (ProjectOrganization model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<ProjectOrganization> arrayToList(
			JSONArray array) {
		java.util.List<ProjectOrganization> list = new java.util.ArrayList<ProjectOrganization>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			ProjectOrganization model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private ProjectOrganizationJsonFactory() {

	}

}
