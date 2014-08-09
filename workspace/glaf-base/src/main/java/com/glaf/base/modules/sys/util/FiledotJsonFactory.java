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
import com.glaf.core.util.DateUtils;
import com.glaf.base.modules.sys.model.Filedot;

public class FiledotJsonFactory {

	public static Filedot jsonToObject(JSONObject jsonObject) {
		Filedot model = new Filedot();
		if (jsonObject.containsKey("fileID")) {
			model.setFileID(jsonObject.getString("fileID"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("fbelong")) {
			model.setFbelong(jsonObject.getString("fbelong"));
		}
		if (jsonObject.containsKey("fnum")) {
			model.setFnum(jsonObject.getString("fnum"));
		}
		if (jsonObject.containsKey("pbelong")) {
			model.setPbelong(jsonObject.getString("pbelong"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("fname")) {
			model.setFname(jsonObject.getString("fname"));
		}
		if (jsonObject.containsKey("dotname")) {
			model.setDotname(jsonObject.getString("dotname"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("dtime")) {
			model.setDtime(jsonObject.getDate("dtime"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}
		if (jsonObject.containsKey("filesize")) {
			model.setFilesize(jsonObject.getInteger("filesize"));
		}
		if (jsonObject.containsKey("dwid")) {
			model.setDwid(jsonObject.getInteger("dwid"));
		}
		if (jsonObject.containsKey("fbid")) {
			model.setFbid(jsonObject.getInteger("fbid"));
		}
		if (jsonObject.containsKey("fxid")) {
			model.setFxid(jsonObject.getInteger("fxid"));
		}
		if (jsonObject.containsKey("jid")) {
			model.setJid(jsonObject.getString("jid"));
		}
		if (jsonObject.containsKey("flid")) {
			model.setFlid(jsonObject.getString("flid"));
		}
		if (jsonObject.containsKey("topnode")) {
			model.setTopnode(jsonObject.getString("topnode"));
		}
		if (jsonObject.containsKey("cman")) {
			model.setCman(jsonObject.getString("cman"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("listflag")) {
			model.setListflag(jsonObject.getString("listflag"));
		}
		if (jsonObject.containsKey("tofile")) {
			model.setTofile(jsonObject.getInteger("tofile"));
		}
		if (jsonObject.containsKey("isink")) {
			model.setIsink(jsonObject.getString("isink"));
		}
		if (jsonObject.containsKey("dottype")) {
			model.setDottype(jsonObject.getInteger("dottype"));
		}
		if (jsonObject.containsKey("ctimedname")) {
			model.setCtimedname(jsonObject.getString("ctimedname"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getInteger("type"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("utreeIndex")) {
			model.setUtreeIndex(jsonObject.getInteger("utreeIndex"));
		}
		if (jsonObject.containsKey("isquan")) {
			model.setIsquan(jsonObject.getString("isquan"));
		}
		if (jsonObject.containsKey("intsysform")) {
			model.setIntsysform(jsonObject.getInteger("intsysform"));
		}

		return model;
	}

	public static JSONObject toJsonObject(Filedot model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getFbelong() != null) {
			jsonObject.put("fbelong", model.getFbelong());
		}
		if (model.getFnum() != null) {
			jsonObject.put("fnum", model.getFnum());
		}
		if (model.getPbelong() != null) {
			jsonObject.put("pbelong", model.getPbelong());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDotname() != null) {
			jsonObject.put("dotname", model.getDotname());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getDtime() != null) {
			jsonObject.put("dtime", DateUtils.getDate(model.getDtime()));
			jsonObject.put("dtime_date", DateUtils.getDate(model.getDtime()));
			jsonObject.put("dtime_datetime",
					DateUtils.getDateTime(model.getDtime()));
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		jsonObject.put("filesize", model.getFilesize());
		jsonObject.put("dwid", model.getDwid());
		jsonObject.put("fbid", model.getFbid());
		jsonObject.put("fxid", model.getFxid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getListflag() != null) {
			jsonObject.put("listflag", model.getListflag());
		}
		jsonObject.put("tofile", model.getTofile());
		if (model.getIsink() != null) {
			jsonObject.put("isink", model.getIsink());
		}
		jsonObject.put("dottype", model.getDottype());
		if (model.getCtimedname() != null) {
			jsonObject.put("ctimedname", model.getCtimedname());
		}
		jsonObject.put("type", model.getType());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("utreeIndex", model.getUtreeIndex());
		if (model.getIsquan() != null) {
			jsonObject.put("isquan", model.getIsquan());
		}
		jsonObject.put("intsysform", model.getIntsysform());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(Filedot model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getFbelong() != null) {
			jsonObject.put("fbelong", model.getFbelong());
		}
		if (model.getFnum() != null) {
			jsonObject.put("fnum", model.getFnum());
		}
		if (model.getPbelong() != null) {
			jsonObject.put("pbelong", model.getPbelong());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDotname() != null) {
			jsonObject.put("dotname", model.getDotname());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getDtime() != null) {
			jsonObject.put("dtime", DateUtils.getDate(model.getDtime()));
			jsonObject.put("dtime_date", DateUtils.getDate(model.getDtime()));
			jsonObject.put("dtime_datetime",
					DateUtils.getDateTime(model.getDtime()));
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		jsonObject.put("filesize", model.getFilesize());
		jsonObject.put("dwid", model.getDwid());
		jsonObject.put("fbid", model.getFbid());
		jsonObject.put("fxid", model.getFxid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getListflag() != null) {
			jsonObject.put("listflag", model.getListflag());
		}
		jsonObject.put("tofile", model.getTofile());
		if (model.getIsink() != null) {
			jsonObject.put("isink", model.getIsink());
		}
		jsonObject.put("dottype", model.getDottype());
		if (model.getCtimedname() != null) {
			jsonObject.put("ctimedname", model.getCtimedname());
		}
		jsonObject.put("type", model.getType());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("utreeIndex", model.getUtreeIndex());
		if (model.getIsquan() != null) {
			jsonObject.put("isquan", model.getIsquan());
		}
		jsonObject.put("intsysform", model.getIntsysform());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<Filedot> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (Filedot model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<Filedot> arrayToList(JSONArray array) {
		java.util.List<Filedot> list = new java.util.ArrayList<Filedot>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			Filedot model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FiledotJsonFactory() {

	}

}
