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
import com.glaf.dms.domain.DmsTreevmain;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsTreevmainJsonFactory {

	public static DmsTreevmain jsonToObject(JSONObject jsonObject) {
		DmsTreevmain model = new DmsTreevmain();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
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
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getString("filenum"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("vflag")) {
			model.setVflag(jsonObject.getString("vflag"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("ztype")) {
			model.setZtype(jsonObject.getInteger("ztype"));
		}
		if (jsonObject.containsKey("content2")) {
			model.setContent2(jsonObject.getString("content2"));
		}
		if (jsonObject.containsKey("topnode")) {
			model.setTopnode(jsonObject.getString("topnode"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("intendofshow")) {
			model.setIntendofshow(jsonObject.getInteger("intendofshow"));
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

	public static JSONObject toJsonObject(DmsTreevmain model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("intendofshow", model.getIntendofshow());
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsTreevmain model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("intendofshow", model.getIntendofshow());
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsTreevmain> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsTreevmain model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsTreevmain> arrayToList(JSONArray array) {
		java.util.List<DmsTreevmain> list = new java.util.ArrayList<DmsTreevmain>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsTreevmain model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsTreevmainJsonFactory() {

	}

}
