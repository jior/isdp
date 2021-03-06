/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysFunction;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.SysUserRole;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.RequestUtils;

public class SysUserJsonFactory {

	public static java.util.List<SysUser> arrayToList(JSONArray array) {
		java.util.List<SysUser> list = new java.util.ArrayList<SysUser>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			SysUser model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	public static SysUser jsonToObject(JSONObject jsonObject) {
		SysUser model = new SysUser();

		if (jsonObject.containsKey("actorId")) {
			model.setActorId(jsonObject.getString("actorId"));
		}
		if (jsonObject.containsKey("account")) {
			model.setActorId(jsonObject.getString("account"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}

		if (jsonObject.containsKey("evection")) {
			model.setEvection(jsonObject.getIntValue("evection"));
		}

		if (jsonObject.containsKey("gender")) {
			model.setGender(jsonObject.getIntValue("gender"));
		}

		if (jsonObject.containsKey("userType")) {
			model.setUserType(jsonObject.getIntValue("userType"));
		}

		if (jsonObject.containsKey("accountType")) {
			model.setAccountType(jsonObject.getIntValue("accountType"));
		}

		if (jsonObject.containsKey("dumpFlag")) {
			model.setDumpFlag(jsonObject.getIntValue("dumpFlag"));
		}

		if (jsonObject.containsKey("createDate")) {
			model.setCreateDate(jsonObject.getDate("createDate"));
		}

		if (jsonObject.containsKey("createBy")) {
			model.setCreateBy(jsonObject.getString("createBy"));
		}
		if (jsonObject.containsKey("updateBy")) {
			model.setUpdateBy(jsonObject.getString("updateBy"));
		}
		if (jsonObject.containsKey("updateDate")) {
			model.setUpdateDate(jsonObject.getDate("updateDate"));
		}

		if (jsonObject.containsKey("lastLoginTime")) {
			model.setLastLoginTime(jsonObject.getDate("lastLoginTime"));
		}

		if (jsonObject.containsKey("lastLoginIP")) {
			model.setLastLoginIP(jsonObject.getString("lastLoginIP"));
		}

		if (jsonObject.containsKey("remark")) {
			model.setRemark(jsonObject.getString("remark"));
		}

		if (jsonObject.containsKey("deptId")) {
			model.setDeptId(jsonObject.getInteger("deptId"));
		}

		if (jsonObject.containsKey("mail")) {
			model.setMail(jsonObject.getString("mail"));
		}

		if (jsonObject.containsKey("mobile")) {
			model.setMobile(jsonObject.getString("mobile"));
		}

		if (jsonObject.containsKey("telephone")) {
			model.setTelephone(jsonObject.getString("telephone"));
		}

		if (jsonObject.containsKey("headship")) {
			model.setHeadship(jsonObject.getString("headship"));
		}

		if (jsonObject.containsKey("superiorIds")) {
			model.setSuperiorIds(jsonObject.getString("superiorIds"));
		}

		if (jsonObject.containsKey("status")) {
			model.setStatus(jsonObject.getString("status"));
		}

		if (jsonObject.containsKey("adminFlag")) {
			model.setAdminFlag(jsonObject.getString("adminFlag"));
		}

		if (jsonObject.containsKey("userRoles")) {
			JSONArray array = jsonObject.getJSONArray("userRoles");
			if (array != null && !array.isEmpty()) {
				for (int i = 0; i < array.size(); i++) {
					JSONObject json = array.getJSONObject(i);
					SysUserRole r = SysUserRoleJsonFactory.jsonToObject(json);
					model.getUserRoles().add(r);
				}
			}
		}

		if (jsonObject.containsKey("roles")) {
			JSONArray array = jsonObject.getJSONArray("roles");
			if (array != null && !array.isEmpty()) {
				for (int i = 0; i < array.size(); i++) {
					JSONObject json = array.getJSONObject(i);
					SysRole r = SysRoleJsonFactory.jsonToObject(json);
					model.getRoles().add(r);
				}
			}
		}

		if (jsonObject.containsKey("functions")) {
			JSONArray array = jsonObject.getJSONArray("functions");
			if (array != null && !array.isEmpty()) {
				for (int i = 0; i < array.size(); i++) {
					JSONObject json = array.getJSONObject(i);
					SysFunction r = SysFunctionJsonFactory.jsonToObject(json);
					model.getFunctions().add(r);
				}
			}
		}

		if (jsonObject.containsKey("apps")) {
			JSONArray array = jsonObject.getJSONArray("apps");
			if (array != null && !array.isEmpty()) {
				for (int i = 0; i < array.size(); i++) {
					JSONObject json = array.getJSONObject(i);
					SysApplication r = SysApplicationJsonFactory
							.jsonToObject(json);
					model.getApps().add(r);
				}
			}
		}

		return model;
	}

	public static JSONArray listToArray(java.util.List<SysUser> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (SysUser model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static JSONObject toJsonObject(SysUser user) {
		JSONObject jsonObject = new JSONObject();

		jsonObject.put("actorId", user.getAccount());
		jsonObject.put("actorId_enc",
				RequestUtils.encodeString(user.getAccount()));
		jsonObject.put("userId", user.getAccount());
		jsonObject.put("userId_enc",
				RequestUtils.encodeString(user.getAccount()));

		jsonObject.put("name", user.getName());
		jsonObject.put("locked", user.getStatus());
		jsonObject.put("status", user.getStatus());

		if (user.getDepartment() != null) {
			jsonObject.put("deptId", user.getDepartment().getId());
			jsonObject.put("deptName", user.getDepartment().getName());
		} else {
			jsonObject.put("deptId", user.getDeptId());
		}
		jsonObject.put("accountType", user.getAccountType());
		jsonObject.put("userType", user.getUserType());
		jsonObject.put("dumpFlag", user.getDumpFlag());
		jsonObject.put("gender", user.getGender());
		jsonObject.put("evection", user.getEvection());
		jsonObject.put("superiorIds", user.getSuperiorIds());

		jsonObject.put("fax", user.getFax());
		jsonObject.put("telephone", user.getTelephone());
		jsonObject.put("headship", user.getHeadship());
		jsonObject.put("adminFlag", user.getAdminFlag());

		if (user.getEmail() != null) {
			jsonObject.put("mail", user.getEmail());
			jsonObject.put("email", user.getEmail());
		}
		if (user.getMobile() != null) {
			jsonObject.put("mobile", user.getMobile());
		}
		if (user.getLastLoginTime() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDateTime(user.getLastLoginDate()));
			jsonObject.put("lastLoginTime",
					DateUtils.getDateTime(user.getLastLoginDate()));
		}

		if (user.getLastLoginIP() != null) {
			jsonObject.put("loginIP", user.getLastLoginIP());
		}

		if (user.getCreateBy() != null) {
			jsonObject.put("createBy", user.getCreateBy());
		}
		if (user.getCreateTime() != null) {
			jsonObject.put("createTime",
					DateUtils.getDate(user.getCreateTime()));
			jsonObject.put("createDate",
					DateUtils.getDate(user.getCreateTime()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(user.getCreateTime()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(user.getCreateTime()));
		}

		if (user.getUpdateBy() != null) {
			jsonObject.put("updateBy", user.getUpdateBy());
		}
		if (user.getUpdateDate() != null) {
			jsonObject.put("updateDate",
					DateUtils.getDate(user.getUpdateDate()));
			jsonObject.put("updateDate_date",
					DateUtils.getDate(user.getUpdateDate()));
			jsonObject.put("updateDate_datetime",
					DateUtils.getDateTime(user.getUpdateDate()));
		}

		if (user.getUserRoles() != null && !user.getUserRoles().isEmpty()) {
			JSONArray array = new JSONArray();
			for (SysUserRole sysUserRole : user.getUserRoles()) {
				array.add(sysUserRole.toJsonObject());
			}
			jsonObject.put("userRoles", array);
		}

		if (user.getRoles() != null && !user.getRoles().isEmpty()) {
			JSONArray array = new JSONArray();
			for (SysRole sysole : user.getRoles()) {
				array.add(sysole.toJsonObject());
			}
			jsonObject.put("roles", array);
		}

		if (user.getFunctions() != null && !user.getFunctions().isEmpty()) {
			JSONArray array = new JSONArray();
			for (SysFunction sysFunction : user.getFunctions()) {
				array.add(sysFunction.toJsonObject());
			}
			//jsonObject.put("functions", array);
		}

		if (user.getApps() != null && !user.getApps().isEmpty()) {
			JSONArray array = new JSONArray();
			for (SysApplication app : user.getApps()) {
				array.add(app.toJsonObject());
			}
			//jsonObject.put("apps", array);
		}

		return jsonObject;
	}

	public static ObjectNode toObjectNode(SysUser user) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();

		jsonObject.put("actorId", user.getAccount());
		jsonObject.put("actorId_enc",
				RequestUtils.encodeString(user.getAccount()));
		jsonObject.put("userId", user.getAccount());
		jsonObject.put("userId_enc",
				RequestUtils.encodeString(user.getAccount()));

		jsonObject.put("name", user.getName());
		jsonObject.put("locked", user.getStatus());
		jsonObject.put("status", user.getStatus());

		if (user.getDepartment() != null) {
			jsonObject.put("deptId", user.getDepartment().getId());
			jsonObject.put("deptName", user.getDepartment().getName());
		} else {
			jsonObject.put("deptId", user.getDeptId());
		}

		jsonObject.put("accountType", user.getAccountType());
		jsonObject.put("userType", user.getUserType());
		jsonObject.put("dumpFlag", user.getDumpFlag());
		jsonObject.put("gender", user.getGender());
		jsonObject.put("evection", user.getEvection());
		jsonObject.put("superiorIds", user.getSuperiorIds());

		jsonObject.put("fax", user.getFax());
		jsonObject.put("telephone", user.getTelephone());
		jsonObject.put("headship", user.getHeadship());
		jsonObject.put("adminFlag", user.getAdminFlag());

		if (user.getEmail() != null) {
			jsonObject.put("mail", user.getEmail());
			jsonObject.put("email", user.getEmail());
		}
		if (user.getMobile() != null) {
			jsonObject.put("mobile", user.getMobile());
		}
		if (user.getLastLoginTime() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDateTime(user.getLastLoginDate()));
			jsonObject.put("lastLoginTime",
					DateUtils.getDateTime(user.getLastLoginDate()));
		}
		if (user.getLastLoginIP() != null) {
			jsonObject.put("loginIP", user.getLastLoginIP());
		}

		if (user.getCreateBy() != null) {
			jsonObject.put("createBy", user.getCreateBy());
		}
		if (user.getUpdateBy() != null) {
			jsonObject.put("updateBy", user.getUpdateBy());
		}
		if (user.getUpdateDate() != null) {
			jsonObject.put("updateDate",
					DateUtils.getDate(user.getUpdateDate()));
			jsonObject.put("updateDate_date",
					DateUtils.getDate(user.getUpdateDate()));
			jsonObject.put("updateDate_datetime",
					DateUtils.getDateTime(user.getUpdateDate()));
		}

		if (user.getUserRoles() != null && !user.getUserRoles().isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (SysUserRole sysUserRole : user.getUserRoles()) {
				array.add(sysUserRole.toObjectNode());
			}
			jsonObject.set("userRoles", array);
		}

		if (user.getRoles() != null && !user.getRoles().isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (SysRole sysRole : user.getRoles()) {
				array.add(sysRole.toObjectNode());
			}
			jsonObject.set("roles", array);
		}

		if (user.getFunctions() != null && !user.getFunctions().isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (SysFunction sysFunction : user.getFunctions()) {
				array.add(sysFunction.toObjectNode());
			}
			//jsonObject.set("functions", array);
		}

		if (user.getApps() != null && !user.getApps().isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (SysApplication app : user.getApps()) {
				array.add(app.toObjectNode());
			}
			//jsonObject.set("apps", array);
		}

		return jsonObject;
	}

	private SysUserJsonFactory() {

	}

}
