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

package com.glaf.bpmn.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.bpmn.domain.UserTask;

public class UserTaskJsonFactory {

	public static UserTask jsonToObject(JSONObject jsonObject) {
		UserTask model = new UserTask();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("actorId")) {
			model.setActorId(jsonObject.getString("actorId"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("activityId")) {
			model.setActivityId(jsonObject.getString("activityId"));
		}
		if (jsonObject.containsKey("startTime")) {
			model.setStartTime(jsonObject.getDate("startTime"));
		}
		if (jsonObject.containsKey("endTime")) {
			model.setEndTime(jsonObject.getDate("endTime"));
		}
		if (jsonObject.containsKey("state")) {
			model.setState(jsonObject.getInteger("state"));
		}
		if (jsonObject.containsKey("timelimit")) {
			model.setTimelimit(jsonObject.getInteger("timelimit"));
		}
		if (jsonObject.containsKey("lastModified")) {
			model.setLastModified(jsonObject.getLong("lastModified"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("level")) {
			model.setLevel(jsonObject.getInteger("level"));
		}

		return model;
	}

	public static JSONObject toJsonObject(UserTask model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
		if (model.getActorId() != null) {
			jsonObject.put("actorId", model.getActorId());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		if (model.getActivityId() != null) {
			jsonObject.put("activityId", model.getActivityId());
		}
		if (model.getStartTime() != null) {
			jsonObject
					.put("startTime", DateUtils.getDate(model.getStartTime()));
			jsonObject.put("startTime_date",
					DateUtils.getDate(model.getStartTime()));
			jsonObject.put("startTime_datetime",
					DateUtils.getDateTime(model.getStartTime()));
		}
		if (model.getEndTime() != null) {
			jsonObject.put("endTime", DateUtils.getDate(model.getEndTime()));
			jsonObject.put("endTime_date",
					DateUtils.getDate(model.getEndTime()));
			jsonObject.put("endTime_datetime",
					DateUtils.getDateTime(model.getEndTime()));
		}
		jsonObject.put("state", model.getState());
		jsonObject.put("timelimit", model.getTimelimit());
		jsonObject.put("lastModified", model.getLastModified());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("level", model.getLevel());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(UserTask model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
		if (model.getActorId() != null) {
			jsonObject.put("actorId", model.getActorId());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		if (model.getActivityId() != null) {
			jsonObject.put("activityId", model.getActivityId());
		}
		if (model.getStartTime() != null) {
			jsonObject
					.put("startTime", DateUtils.getDate(model.getStartTime()));
			jsonObject.put("startTime_date",
					DateUtils.getDate(model.getStartTime()));
			jsonObject.put("startTime_datetime",
					DateUtils.getDateTime(model.getStartTime()));
		}
		if (model.getEndTime() != null) {
			jsonObject.put("endTime", DateUtils.getDate(model.getEndTime()));
			jsonObject.put("endTime_date",
					DateUtils.getDate(model.getEndTime()));
			jsonObject.put("endTime_datetime",
					DateUtils.getDateTime(model.getEndTime()));
		}
		jsonObject.put("state", model.getState());
		jsonObject.put("timelimit", model.getTimelimit());
		jsonObject.put("lastModified", model.getLastModified());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("level", model.getLevel());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<UserTask> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (UserTask model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<UserTask> arrayToList(JSONArray array) {
		java.util.List<UserTask> list = new java.util.ArrayList<UserTask>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			UserTask model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private UserTaskJsonFactory() {

	}

}
