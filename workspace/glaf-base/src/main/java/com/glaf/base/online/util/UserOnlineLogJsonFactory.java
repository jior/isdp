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

package com.glaf.base.online.util;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.base.online.domain.*;

public class UserOnlineLogJsonFactory {

	public static UserOnlineLog jsonToObject(JSONObject jsonObject) {
		UserOnlineLog model = new UserOnlineLog();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getLong("id"));
		}
		if (jsonObject.containsKey("actorId")) {
			model.setActorId(jsonObject.getString("actorId"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("loginDate")) {
			model.setLoginDate(jsonObject.getDate("loginDate"));
		}
		if (jsonObject.containsKey("logoutDate")) {
			model.setLogoutDate(jsonObject.getDate("logoutDate"));
		}
		if (jsonObject.containsKey("loginIP")) {
			model.setLoginIP(jsonObject.getString("loginIP"));
		}
		if (jsonObject.containsKey("sessionId")) {
			model.setSessionId(jsonObject.getString("sessionId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(UserOnlineLog model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getActorId() != null) {
			jsonObject.put("actorId", model.getActorId());
			jsonObject.put("actorId_enc", RequestUtils.encodeString(model.getActorId()));
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getLogoutDate() != null) {
			jsonObject
					.put("logoutDate", DateUtils.getDate(model.getLogoutDate()));
			jsonObject.put("logoutDate_date",
					DateUtils.getDate(model.getLogoutDate()));
			jsonObject.put("logoutDate_datetime",
					DateUtils.getDateTime(model.getLogoutDate()));
		}
		if (model.getLoginDate() != null) {
			jsonObject
					.put("loginDate", DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_date",
					DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_datetime",
					DateUtils.getDateTime(model.getLoginDate()));
		}
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}

		if (model.getSessionId() != null) {
			jsonObject.put("sessionId", model.getSessionId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(UserOnlineLog model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getActorId() != null) {
			jsonObject.put("actorId", model.getActorId());
			jsonObject.put("actorId_enc", RequestUtils.encodeString(model.getActorId()));
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getLogoutDate() != null) {
			jsonObject
					.put("logoutDate", DateUtils.getDate(model.getLogoutDate()));
			jsonObject.put("logoutDate_date",
					DateUtils.getDate(model.getLogoutDate()));
			jsonObject.put("logoutDate_datetime",
					DateUtils.getDateTime(model.getLogoutDate()));
		}
		if (model.getLoginDate() != null) {
			jsonObject
					.put("loginDate", DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_date",
					DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_datetime",
					DateUtils.getDateTime(model.getLoginDate()));
		}
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}
		if (model.getSessionId() != null) {
			jsonObject.put("sessionId", model.getSessionId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<UserOnlineLog> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (UserOnlineLog model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<UserOnlineLog> arrayToList(JSONArray array) {
		java.util.List<UserOnlineLog> list = new java.util.ArrayList<UserOnlineLog>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			UserOnlineLog model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private UserOnlineLogJsonFactory() {

	}

}
