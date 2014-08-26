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
import com.glaf.core.util.DateUtils;

public class SysApplicationJsonFactory {

	public static java.util.List<SysApplication> arrayToList(JSONArray array) {
		java.util.List<SysApplication> list = new java.util.ArrayList<SysApplication>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			SysApplication model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	public static SysApplication jsonToObject(JSONObject jsonObject) {
		SysApplication model = new SysApplication();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getLong("id"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("desc")) {
			model.setDesc(jsonObject.getString("desc"));
		}
		if (jsonObject.containsKey("url")) {
			model.setUrl(jsonObject.getString("url"));
		}
		if (jsonObject.containsKey("code")) {
			model.setCode(jsonObject.getString("code"));
		}

		if (jsonObject.containsKey("locked")) {
			model.setLocked(jsonObject.getInteger("locked"));
		}

		if (jsonObject.containsKey("refId1")) {
			model.setRefId1(jsonObject.getInteger("refId1"));
		}

		if (jsonObject.containsKey("refName1")) {
			model.setRefName1(jsonObject.getString("refName1"));
		}

		if (jsonObject.containsKey("refId2")) {
			model.setRefId2(jsonObject.getInteger("refId2"));
		}

		if (jsonObject.containsKey("refName2")) {
			model.setRefName2(jsonObject.getString("refName2"));
		}

		if (jsonObject.containsKey("refId3")) {
			model.setRefId3(jsonObject.getInteger("refId3"));
		}

		if (jsonObject.containsKey("refName3")) {
			model.setRefName3(jsonObject.getString("refName3"));
		}

		if (jsonObject.containsKey("refId4")) {
			model.setRefId4(jsonObject.getInteger("refId4"));
		}

		if (jsonObject.containsKey("refName4")) {
			model.setRefName4(jsonObject.getString("refName4"));
		}

		if (jsonObject.containsKey("refId5")) {
			model.setRefId5(jsonObject.getInteger("refId5"));
		}

		if (jsonObject.containsKey("refName5")) {
			model.setRefName5(jsonObject.getString("refName5"));
		}

		if (jsonObject.containsKey("sort")) {
			model.setSort(jsonObject.getInteger("sort"));
		}
		if (jsonObject.containsKey("showMenu")) {
			model.setShowMenu(jsonObject.getInteger("showMenu"));
		}
		if (jsonObject.containsKey("nodeId")) {
			model.setNodeId(jsonObject.getLong("nodeId"));
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

		if (jsonObject.containsKey("linkType")) {
			model.setLinkType(jsonObject.getString("linkType"));
		}

		if (jsonObject.containsKey("linkFileName")) {
			model.setLinkFileName(jsonObject.getString("linkFileName"));
		}

		if (jsonObject.containsKey("linkFileId")) {
			model.setLinkFileId(jsonObject.getString("linkFileId"));
		}

		if (jsonObject.containsKey("linkParam")) {
			model.setLinkParam(jsonObject.getString("linkParam"));
		}

		if (jsonObject.containsKey("functions")) {
			JSONArray array = jsonObject.getJSONArray("functions");
			if (array != null && !array.isEmpty()) {
				for (int i = 0, len = array.size(); i < len; i++) {
					JSONObject json = array.getJSONObject(i);
					SysFunction f = SysFunctionJsonFactory.jsonToObject(json);
					model.getFunctions().add(f);
				}
			}
		}

		return model;
	}

	public static JSONArray listToArray(java.util.List<SysApplication> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (SysApplication model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static JSONObject toJsonObject(SysApplication model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getDesc() != null) {
			jsonObject.put("desc", model.getDesc());
		}
		if (model.getUrl() != null) {
			jsonObject.put("url", model.getUrl());
		}
		if (model.getCode() != null) {
			jsonObject.put("code", model.getCode());
		}
		jsonObject.put("sort", model.getSort());
		jsonObject.put("showMenu", model.getShowMenu());
		jsonObject.put("nodeId", model.getNodeId());
		jsonObject.put("locked", model.getLocked());

		if (model.getRefId1() != null) {
			jsonObject.put("refId1", model.getRefId1());
		}

		if (model.getRefId2() != null) {
			jsonObject.put("refId2", model.getRefId2());
		}

		if (model.getRefId3() != null) {
			jsonObject.put("refId3", model.getRefId3());
		}

		if (model.getRefId4() != null) {
			jsonObject.put("refId4", model.getRefId4());
		}

		if (model.getRefId5() != null) {
			jsonObject.put("refId5", model.getRefId5());
		}

		if (model.getRefName1() != null) {
			jsonObject.put("refName1", model.getRefName1());
		}

		if (model.getRefName2() != null) {
			jsonObject.put("refName2", model.getRefName2());
		}

		if (model.getRefName3() != null) {
			jsonObject.put("refName3", model.getRefName3());
		}

		if (model.getRefName4() != null) {
			jsonObject.put("refName4", model.getRefName4());
		}

		if (model.getRefName5() != null) {
			jsonObject.put("refName5", model.getRefName5());
		}

		if (model.getLinkType() != null) {
			jsonObject.put("linkType", model.getLinkType());
		}

		if (model.getLinkFileId() != null) {
			jsonObject.put("linkFileId", model.getLinkFileId());
		}

		if (model.getLinkFileName() != null) {
			jsonObject.put("linkFileName", model.getLinkFileName());
		}

		if (model.getLinkParam() != null) {
			jsonObject.put("linkParam", model.getLinkParam());
		}

		if (model.getCreateDate() != null) {
			jsonObject.put("createDate",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(model.getCreateDate()));
		}
		if (model.getCreateBy() != null) {
			jsonObject.put("createBy", model.getCreateBy());
		}
		if (model.getUpdateBy() != null) {
			jsonObject.put("updateBy", model.getUpdateBy());
		}
		if (model.getUpdateDate() != null) {
			jsonObject.put("updateDate",
					DateUtils.getDate(model.getUpdateDate()));
			jsonObject.put("updateDate_date",
					DateUtils.getDate(model.getUpdateDate()));
			jsonObject.put("updateDate_datetime",
					DateUtils.getDateTime(model.getUpdateDate()));
		}

		if (model.getFunctions() != null && !model.getFunctions().isEmpty()) {
			JSONArray array = new JSONArray();
			for (SysFunction f : model.getFunctions()) {
				array.add(f.toJsonObject());
			}
			jsonObject.put("functions", array);
		}

		return jsonObject;
	}

	public static ObjectNode toObjectNode(SysApplication model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getDesc() != null) {
			jsonObject.put("desc", model.getDesc());
		}
		if (model.getUrl() != null) {
			jsonObject.put("url", model.getUrl());
		}
		if (model.getCode() != null) {
			jsonObject.put("code", model.getCode());
		}
		jsonObject.put("sort", model.getSort());
		jsonObject.put("showMenu", model.getShowMenu());
		jsonObject.put("nodeId", model.getNodeId());
		jsonObject.put("locked", model.getLocked());

		if (model.getRefId1() != null) {
			jsonObject.put("refId1", model.getRefId1());
		}

		if (model.getRefId2() != null) {
			jsonObject.put("refId2", model.getRefId2());
		}

		if (model.getRefId3() != null) {
			jsonObject.put("refId3", model.getRefId3());
		}

		if (model.getRefId4() != null) {
			jsonObject.put("refId4", model.getRefId4());
		}

		if (model.getRefId5() != null) {
			jsonObject.put("refId5", model.getRefId5());
		}

		if (model.getRefName1() != null) {
			jsonObject.put("refName1", model.getRefName1());
		}

		if (model.getRefName2() != null) {
			jsonObject.put("refName2", model.getRefName2());
		}

		if (model.getRefName3() != null) {
			jsonObject.put("refName3", model.getRefName3());
		}

		if (model.getRefName4() != null) {
			jsonObject.put("refName4", model.getRefName4());
		}

		if (model.getRefName5() != null) {
			jsonObject.put("refName5", model.getRefName5());
		}

		if (model.getLinkType() != null) {
			jsonObject.put("linkType", model.getLinkType());
		}

		if (model.getLinkFileId() != null) {
			jsonObject.put("linkFileId", model.getLinkFileId());
		}

		if (model.getLinkFileName() != null) {
			jsonObject.put("linkFileName", model.getLinkFileName());
		}

		if (model.getLinkParam() != null) {
			jsonObject.put("linkParam", model.getLinkParam());
		}

		if (model.getCreateBy() != null) {
			jsonObject.put("createBy", model.getCreateBy());
		}
		if (model.getUpdateBy() != null) {
			jsonObject.put("updateBy", model.getUpdateBy());
		}
		if (model.getUpdateDate() != null) {
			jsonObject.put("updateDate",
					DateUtils.getDate(model.getUpdateDate()));
			jsonObject.put("updateDate_date",
					DateUtils.getDate(model.getUpdateDate()));
			jsonObject.put("updateDate_datetime",
					DateUtils.getDateTime(model.getUpdateDate()));
		}
		if (model.getFunctions() != null && !model.getFunctions().isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (SysFunction f : model.getFunctions()) {
				array.add(f.toObjectNode());
			}
			jsonObject.set("functions", array);
		}
		return jsonObject;
	}

	private SysApplicationJsonFactory() {

	}

}
