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
import com.glaf.base.modules.sys.model.CellTreedot;

public class CellTreedotJsonFactory {

	public static CellTreedot jsonToObject(JSONObject jsonObject) {
		CellTreedot model = new CellTreedot();
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
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("viewtype")) {
			model.setViewtype(jsonObject.getInteger("viewtype"));
		}
		if (jsonObject.containsKey("ismode")) {
			model.setIsmode(jsonObject.getString("ismode"));
		}
		if (jsonObject.containsKey("modetableId")) {
			model.setModetableId(jsonObject.getString("modetableId"));
		}
		if (jsonObject.containsKey("issystem")) {
			model.setIssystem(jsonObject.getInteger("issystem"));
		}
		if (jsonObject.containsKey("customData")) {
			model.setCustomData(jsonObject.getString("customData"));
		}
		if (jsonObject.containsKey("intsystemselect")) {
			model.setIntsystemselect(jsonObject.getInteger("intsystemselect"));
		}
		if (jsonObject.containsKey("intused")) {
			model.setIntused(jsonObject.getInteger("intused"));
		}
		if (jsonObject.containsKey("intdel")) {
			model.setIntdel(jsonObject.getInteger("intdel"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("intoperation")) {
			model.setIntoperation(jsonObject.getInteger("intoperation"));
		}
		if (jsonObject.containsKey("picfile")) {
			model.setPicfile(jsonObject.getString("picfile"));
		}
		if (jsonObject.containsKey("intMuiFrm")) {
			model.setIntMuiFrm(jsonObject.getInteger("intMuiFrm"));
		}
		if (jsonObject.containsKey("intnoshow")) {
			model.setIntnoshow(jsonObject.getInteger("intnoshow"));
		}
		if (jsonObject.containsKey("typeBasetable")) {
			model.setTypeBasetable(jsonObject.getString("typeBasetable"));
		}
		if (jsonObject.containsKey("typeIndex")) {
			model.setTypeIndex(jsonObject.getInteger("typeIndex"));
		}
		if (jsonObject.containsKey("gid")) {
			model.setGid(jsonObject.getString("gid"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}
		if (jsonObject.containsKey("linkFileName")) {
			model.setLinkFileName(jsonObject.getString("linkFileName"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellTreedot model) {
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
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("viewtype", model.getViewtype());
		if (model.getIsmode() != null) {
			jsonObject.put("ismode", model.getIsmode());
		}
		if (model.getModetableId() != null) {
			jsonObject.put("modetableId", model.getModetableId());
		}
		jsonObject.put("issystem", model.getIssystem());
		if (model.getCustomData() != null) {
			jsonObject.put("customData", model.getCustomData());
		}
		jsonObject.put("intsystemselect", model.getIntsystemselect());
		jsonObject.put("intused", model.getIntused());
		jsonObject.put("intdel", model.getIntdel());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		jsonObject.put("intoperation", model.getIntoperation());
		if (model.getPicfile() != null) {
			jsonObject.put("picfile", model.getPicfile());
		}
		jsonObject.put("intMuiFrm", model.getIntMuiFrm());
		jsonObject.put("intnoshow", model.getIntnoshow());
		if (model.getTypeBasetable() != null) {
			jsonObject.put("typeBasetable", model.getTypeBasetable());
		}
		jsonObject.put("typeIndex", model.getTypeIndex());
		if (model.getGid() != null) {
			jsonObject.put("gid", model.getGid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getLinkFileName() != null) {
			jsonObject.put("linkFileName", model.getLinkFileName());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellTreedot model) {
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
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("viewtype", model.getViewtype());
		if (model.getIsmode() != null) {
			jsonObject.put("ismode", model.getIsmode());
		}
		if (model.getModetableId() != null) {
			jsonObject.put("modetableId", model.getModetableId());
		}
		jsonObject.put("issystem", model.getIssystem());
		if (model.getCustomData() != null) {
			jsonObject.put("customData", model.getCustomData());
		}
		jsonObject.put("intsystemselect", model.getIntsystemselect());
		jsonObject.put("intused", model.getIntused());
		jsonObject.put("intdel", model.getIntdel());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		jsonObject.put("intoperation", model.getIntoperation());
		if (model.getPicfile() != null) {
			jsonObject.put("picfile", model.getPicfile());
		}
		jsonObject.put("intMuiFrm", model.getIntMuiFrm());
		jsonObject.put("intnoshow", model.getIntnoshow());
		if (model.getTypeBasetable() != null) {
			jsonObject.put("typeBasetable", model.getTypeBasetable());
		}
		jsonObject.put("typeIndex", model.getTypeIndex());
		if (model.getGid() != null) {
			jsonObject.put("gid", model.getGid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getLinkFileName() != null) {
			jsonObject.put("linkFileName", model.getLinkFileName());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellTreedot> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellTreedot model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellTreedot> arrayToList(JSONArray array) {
		java.util.List<CellTreedot> list = new java.util.ArrayList<CellTreedot>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellTreedot model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellTreedotJsonFactory() {

	}

}
