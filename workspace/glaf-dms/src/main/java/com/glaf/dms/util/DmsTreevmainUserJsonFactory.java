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
import com.glaf.dms.domain.DmsTreevmainUser;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsTreevmainUserJsonFactory {

	public static DmsTreevmainUser jsonToObject(JSONObject jsonObject) {
		DmsTreevmainUser model = new DmsTreevmainUser();
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
		if (jsonObject.containsKey("nodetype")) {
			model.setNodetype(jsonObject.getString("nodetype"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getInteger("fromid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("frmtypeindex")) {
			model.setFrmtypeindex(jsonObject.getInteger("frmtypeindex"));
		}
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("showfrmid")) {
			model.setShowfrmid(jsonObject.getString("showfrmid"));
		}
		if (jsonObject.containsKey("showfrmindexId")) {
			model.setShowfrmindexId(jsonObject.getInteger("showfrmindexId"));
		}
		if (jsonObject.containsKey("dwid")) {
			model.setDwid(jsonObject.getInteger("dwid"));
		}
		if (jsonObject.containsKey("jid")) {
			model.setJid(jsonObject.getString("jid"));
		}
		if (jsonObject.containsKey("flid")) {
			model.setFlid(jsonObject.getString("flid"));
		}
		if (jsonObject.containsKey("ctypeId")) {
			model.setCtypeId(jsonObject.getString("ctypeId"));
		}
		if (jsonObject.containsKey("commIndex")) {
			model.setCommIndex(jsonObject.getInteger("commIndex"));
		}
		if (jsonObject.containsKey("baseIndex")) {
			model.setBaseIndex(jsonObject.getInteger("baseIndex"));
		}
		if (jsonObject.containsKey("commListno")) {
			model.setCommListno(jsonObject.getInteger("commListno"));
		}
		if (jsonObject.containsKey("projListno")) {
			model.setProjListno(jsonObject.getInteger("projListno"));
		}
		if (jsonObject.containsKey("intnoshow")) {
			model.setIntnoshow(jsonObject.getInteger("intnoshow"));
		}
		if (jsonObject.containsKey("projParent")) {
			model.setProjParent(jsonObject.getInteger("projParent"));
		}
		if (jsonObject.containsKey("treeDliststr")) {
			model.setTreeDliststr(jsonObject.getString("treeDliststr"));
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

	public static JSONObject toJsonObject(DmsTreevmainUser model) {
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
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("frmtypeindex", model.getFrmtypeindex());
		jsonObject.put("showid", model.getShowid());
		if (model.getShowfrmid() != null) {
			jsonObject.put("showfrmid", model.getShowfrmid());
		}
		jsonObject.put("showfrmindexId", model.getShowfrmindexId());
		jsonObject.put("dwid", model.getDwid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getCtypeId() != null) {
			jsonObject.put("ctypeId", model.getCtypeId());
		}
		jsonObject.put("commIndex", model.getCommIndex());
		jsonObject.put("baseIndex", model.getBaseIndex());
		jsonObject.put("commListno", model.getCommListno());
		jsonObject.put("projListno", model.getProjListno());
		jsonObject.put("intnoshow", model.getIntnoshow());
		jsonObject.put("projParent", model.getProjParent());
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsTreevmainUser model) {
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
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("frmtypeindex", model.getFrmtypeindex());
		jsonObject.put("showid", model.getShowid());
		if (model.getShowfrmid() != null) {
			jsonObject.put("showfrmid", model.getShowfrmid());
		}
		jsonObject.put("showfrmindexId", model.getShowfrmindexId());
		jsonObject.put("dwid", model.getDwid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getCtypeId() != null) {
			jsonObject.put("ctypeId", model.getCtypeId());
		}
		jsonObject.put("commIndex", model.getCommIndex());
		jsonObject.put("baseIndex", model.getBaseIndex());
		jsonObject.put("commListno", model.getCommListno());
		jsonObject.put("projListno", model.getProjListno());
		jsonObject.put("intnoshow", model.getIntnoshow());
		jsonObject.put("projParent", model.getProjParent());
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsTreevmainUser> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsTreevmainUser model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsTreevmainUser> arrayToList(JSONArray array) {
		java.util.List<DmsTreevmainUser> list = new java.util.ArrayList<DmsTreevmainUser>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsTreevmainUser model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsTreevmainUserJsonFactory() {

	}

}
