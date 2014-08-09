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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.Treedot;

public class TreedotJsonFactory {

	public static Treedot jsonToObject(JSONObject jsonObject) {
		Treedot model = new Treedot();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
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
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("menuid")) {
			model.setMenuid(jsonObject.getInteger("menuid"));
		}
		if (jsonObject.containsKey("isend")) {
			model.setIsend(jsonObject.getInteger("isend"));
		}
		if (jsonObject.containsKey("sysmenuid")) {
			model.setSysmenuid(jsonObject.getString("sysmenuid"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getInteger("type"));
		}
		if (jsonObject.containsKey("filenumid")) {
			model.setFilenumid(jsonObject.getString("filenumid"));
		}
		if (jsonObject.containsKey("filenumid2")) {
			model.setFilenumid2(jsonObject.getString("filenumid2"));
		}
		if (jsonObject.containsKey("projIndex")) {
			model.setProjIndex(jsonObject.getInteger("projIndex"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Treedot model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("menuid", model.getMenuid());
		jsonObject.put("isend", model.getIsend());
		if (model.getSysmenuid() != null) {
			jsonObject.put("sysmenuid", model.getSysmenuid());
		}
		jsonObject.put("type", model.getType());
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		if (model.getFilenumid2() != null) {
			jsonObject.put("filenumid2", model.getFilenumid2());
		}
		jsonObject.put("projIndex", model.getProjIndex());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Treedot model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("nodeico", model.getNodeico());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("menuid", model.getMenuid());
		jsonObject.put("isend", model.getIsend());
		if (model.getSysmenuid() != null) {
			jsonObject.put("sysmenuid", model.getSysmenuid());
		}
		jsonObject.put("type", model.getType());
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		if (model.getFilenumid2() != null) {
			jsonObject.put("filenumid2", model.getFilenumid2());
		}
		jsonObject.put("projIndex", model.getProjIndex());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Treedot> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Treedot model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Treedot> arrayToList(JSONArray array) {
		java.util.List<Treedot> list = new java.util.ArrayList<Treedot>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Treedot model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreedotJsonFactory() {

	}

}
