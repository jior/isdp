package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.domain.UserInfo;

public class UserInfoJsonFactory {

	public static UserInfo jsonToObject(JSONObject jsonObject) {
		UserInfo model = new UserInfo();
		if (jsonObject.containsKey("actorId")) {
			model.setActorId(jsonObject.getString("actorId"));
			model.setUserId(jsonObject.getString("actorId"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}

		if (jsonObject.containsKey("createDate")) {
			model.setCreateDate(jsonObject.getDate("createDate"));
		}
		if (jsonObject.containsKey("etime")) {
			model.setEtime(jsonObject.getDate("etime"));
		}
		if (jsonObject.containsKey("status")) {
			model.setStatus(jsonObject.getString("status"));
		}
		if (jsonObject.containsKey("isSystem")) {
			model.setIsSystem(jsonObject.getString("isSystem"));
		}
		if (jsonObject.containsKey("setpruv")) {
			model.setSetpruv(jsonObject.getString("setpruv"));
		}
		if (jsonObject.containsKey("remark")) {
			model.setRemark(jsonObject.getString("remark"));
		}
		if (jsonObject.containsKey("slevel")) {
			model.setSlevel(jsonObject.getInteger("slevel"));
		}
		if (jsonObject.containsKey("isBind")) {
			model.setIsBind(jsonObject.getString("isBind"));
		}
		if (jsonObject.containsKey("computerId")) {
			model.setComputerId(jsonObject.getString("computerId"));
		}
		if (jsonObject.containsKey("mail")) {
			model.setMail(jsonObject.getString("mail"));
		}
		if (jsonObject.containsKey("mailUser")) {
			model.setMailUser(jsonObject.getString("mailUser"));
		}
		if (jsonObject.containsKey("mailPwd")) {
			model.setMailPwd(jsonObject.getString("mailPwd"));
		}
		if (jsonObject.containsKey("mobile")) {
			model.setMobile(jsonObject.getString("mobile"));
		}
		if (jsonObject.containsKey("intRemote")) {
			model.setIntRemote(jsonObject.getInteger("intRemote"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}
		if (jsonObject.containsKey("intVirtual")) {
			model.setIntVirtual(jsonObject.getInteger("intVirtual"));
		}
		if (jsonObject.containsKey("intallwbs")) {
			model.setIntallwbs(jsonObject.getInteger("intallwbs"));
		}
		if (jsonObject.containsKey("loginIP")) {
			model.setLoginIP(jsonObject.getString("loginIP"));
		}
		if (jsonObject.containsKey("lastLoginDate")) {
			model.setLastLoginDate(jsonObject.getDate("lastLoginDate"));
		}
		if (jsonObject.containsKey("loginRetry")) {
			model.setLoginRetry(jsonObject.getInteger("loginRetry"));
		}

		return model;
	}

	public static JSONObject toJsonObject(UserInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("actorId", model.getActorId());
		jsonObject.put("userId", model.getActorId());
		jsonObject.put("_actorId_", model.getActorId());
		jsonObject.put("userId_enc",
				RequestUtils.encodeString(model.getActorId()));
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}

		if (model.getCreateDate() != null) {
			jsonObject.put("createDate",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(model.getCreateDate()));
		}
		if (model.getEtime() != null) {
			jsonObject.put("etime", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_date", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_datetime",
					DateUtils.getDateTime(model.getEtime()));
		}
		if (model.getStatus() != null) {
			jsonObject.put("status", model.getStatus());
		}
		if (model.getIsSystem() != null) {
			jsonObject.put("isSystem", model.getIsSystem());
			jsonObject.put("adminFlag", model.getIsSystem());
		}
		if (model.getSetpruv() != null) {
			jsonObject.put("setpruv", model.getSetpruv());
		}
		if (model.getRemark() != null) {
			jsonObject.put("remark", model.getRemark());
		}
		jsonObject.put("slevel", model.getSlevel());
		if (model.getIsBind() != null) {
			jsonObject.put("isBind", model.getIsBind());
		}
		if (model.getComputerId() != null) {
			jsonObject.put("computerId", model.getComputerId());
		}
		if (model.getMail() != null) {
			jsonObject.put("mail", model.getMail());
		}
		if (model.getMailUser() != null) {
			jsonObject.put("mailUser", model.getMailUser());
		}
		if (model.getMailPwd() != null) {
			jsonObject.put("mailPwd", model.getMailPwd());
		}
		if (model.getMobile() != null) {
			jsonObject.put("mobile", model.getMobile());
		}
		jsonObject.put("intRemote", model.getIntRemote());
		jsonObject.put("domainIndex", model.getDomainIndex());
		jsonObject.put("intVirtual", model.getIntVirtual());
		jsonObject.put("intallwbs", model.getIntallwbs());
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}
		if (model.getLastLoginDate() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_date",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_datetime",
					DateUtils.getDateTime(model.getLastLoginDate()));
		}
		jsonObject.put("loginRetry", model.getLoginRetry());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(UserInfo model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("actorId", model.getActorId());
		jsonObject.put("userId", model.getActorId());
		jsonObject.put("_actorId_", model.getActorId());
		jsonObject.put("userId_enc",
				RequestUtils.encodeString(model.getActorId()));
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}

		if (model.getCreateDate() != null) {
			jsonObject.put("createDate",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(model.getCreateDate()));
		}
		if (model.getEtime() != null) {
			jsonObject.put("etime", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_date", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_datetime",
					DateUtils.getDateTime(model.getEtime()));
		}
		if (model.getStatus() != null) {
			jsonObject.put("status", model.getStatus());
		}
		if (model.getIsSystem() != null) {
			jsonObject.put("isSystem", model.getIsSystem());
			jsonObject.put("adminFlag", model.getIsSystem());
		}
		if (model.getSetpruv() != null) {
			jsonObject.put("setpruv", model.getSetpruv());
		}
		if (model.getRemark() != null) {
			jsonObject.put("remark", model.getRemark());
		}
		jsonObject.put("slevel", model.getSlevel());
		if (model.getIsBind() != null) {
			jsonObject.put("isBind", model.getIsBind());
		}
		if (model.getComputerId() != null) {
			jsonObject.put("computerId", model.getComputerId());
		}
		if (model.getMail() != null) {
			jsonObject.put("mail", model.getMail());
		}
		if (model.getMailUser() != null) {
			jsonObject.put("mailUser", model.getMailUser());
		}
		if (model.getMailPwd() != null) {
			jsonObject.put("mailPwd", model.getMailPwd());
		}
		if (model.getMobile() != null) {
			jsonObject.put("mobile", model.getMobile());
		}
		jsonObject.put("intRemote", model.getIntRemote());
		jsonObject.put("domainIndex", model.getDomainIndex());
		jsonObject.put("intVirtual", model.getIntVirtual());
		jsonObject.put("intallwbs", model.getIntallwbs());
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}
		if (model.getLastLoginDate() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_date",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_datetime",
					DateUtils.getDateTime(model.getLastLoginDate()));
		}
		jsonObject.put("loginRetry", model.getLoginRetry());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<UserInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (UserInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<UserInfo> arrayToList(JSONArray array) {
		java.util.List<UserInfo> list = new java.util.ArrayList<UserInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			UserInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private UserInfoJsonFactory() {

	}

}
