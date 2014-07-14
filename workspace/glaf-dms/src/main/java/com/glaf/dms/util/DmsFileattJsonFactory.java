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
import com.glaf.core.util.DateUtils;
import com.glaf.dms.domain.DmsFileatt;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsFileattJsonFactory {

	public static DmsFileatt jsonToObject(JSONObject jsonObject) {
		DmsFileatt model = new DmsFileatt();
		if (jsonObject.containsKey("fileId")) {
			model.setFileId(jsonObject.getString("fileId"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("actor")) {
			model.setActor(jsonObject.getString("actor"));
		}
		if (jsonObject.containsKey("fname")) {
			model.setFname(jsonObject.getString("fname"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}

		if (jsonObject.containsKey("vision")) {
			model.setVision(jsonObject.getString("vision"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("filesize")) {
			model.setFilesize(jsonObject.getInteger("filesize"));
		}
		if (jsonObject.containsKey("visID")) {
			model.setVisID(jsonObject.getString("visID"));
		}
		if (jsonObject.containsKey("attID")) {
			model.setAttID(jsonObject.getString("attID"));
		}
		if (jsonObject.containsKey("isTextContent")) {
			model.setIsTextContent(jsonObject.getInteger("isTextContent"));
		}
		if (jsonObject.containsKey("textcontent")) {
			model.setTextcontent(jsonObject.getString("textcontent"));
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

	public static JSONObject toJsonObject(DmsFileatt model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileId", model.getFileId());
		jsonObject.put("_fileId_", model.getFileId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getActor() != null) {
			jsonObject.put("actor", model.getActor());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getFileContent() != null) {
			jsonObject.put("fileContent", model.getFileContent());
		}
		if (model.getVision() != null) {
			jsonObject.put("vision", model.getVision());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		jsonObject.put("filesize", model.getFilesize());
		if (model.getVisID() != null) {
			jsonObject.put("visID", model.getVisID());
		}
		if (model.getAttID() != null) {
			jsonObject.put("attID", model.getAttID());
		}
		jsonObject.put("isTextContent", model.getIsTextContent());
		if (model.getTextcontent() != null) {
			jsonObject.put("textcontent", model.getTextcontent());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsFileatt model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("fileId", model.getFileId());
		jsonObject.put("_fileId_", model.getFileId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getActor() != null) {
			jsonObject.put("actor", model.getActor());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getFileContent() != null) {
			jsonObject.put("fileContent", model.getFileContent());
		}
		if (model.getVision() != null) {
			jsonObject.put("vision", model.getVision());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		jsonObject.put("filesize", model.getFilesize());
		if (model.getVisID() != null) {
			jsonObject.put("visID", model.getVisID());
		}
		if (model.getAttID() != null) {
			jsonObject.put("attID", model.getAttID());
		}
		jsonObject.put("isTextContent", model.getIsTextContent());
		if (model.getTextcontent() != null) {
			jsonObject.put("textcontent", model.getTextcontent());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsFileatt> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsFileatt model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsFileatt> arrayToList(JSONArray array) {
		java.util.List<DmsFileatt> list = new java.util.ArrayList<DmsFileatt>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsFileatt model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsFileattJsonFactory() {

	}

}
