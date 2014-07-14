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

package com.glaf.dms.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.dms.domain.DmsTreevmainComm;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsTreevmainCommJsonFactory {

	public static DmsTreevmainComm jsonToObject(JSONObject jsonObject) {
		DmsTreevmainComm model = new DmsTreevmainComm();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("nodetype")) {
			model.setNodetype(jsonObject.getInteger("nodetype"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getInteger("fromid"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("choosePublishFlag")) {
			model.setChoosePublishFlag(jsonObject
					.getString("choosePublishFlag"));
		}
		if (jsonObject.containsKey("choosePublishTime")) {
			model.setChoosePublishTime(jsonObject.getLong("choosePublishTime"));
		}
		if (jsonObject.containsKey("publishdiskid")) {
			model.setPublishdiskid(jsonObject.getInteger("publishdiskid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(DmsTreevmainComm model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("nodetype", model.getNodetype());
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsTreevmainComm model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		jsonObject.put("nodetype", model.getNodetype());
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsTreevmainComm> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsTreevmainComm model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsTreevmainComm> arrayToList(JSONArray array) {
		java.util.List<DmsTreevmainComm> list = new java.util.ArrayList<DmsTreevmainComm>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsTreevmainComm model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsTreevmainCommJsonFactory() {

	}

}
