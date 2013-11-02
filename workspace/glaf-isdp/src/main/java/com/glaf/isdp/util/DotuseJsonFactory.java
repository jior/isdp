package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.IsdpDotuse;

public class DotuseJsonFactory {

	public static IsdpDotuse jsonToObject(JSONObject jsonObject) {
		IsdpDotuse model = new IsdpDotuse();
		if (jsonObject.containsKey("fileID")) {
			model.setFileID(jsonObject.getString("fileID"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("projid")) {
			model.setProjid(jsonObject.getInteger("projid"));
		}
		if (jsonObject.containsKey("pid")) {
			model.setPid(jsonObject.getInteger("pid"));
		}
		if (jsonObject.containsKey("dotid")) {
			model.setDotid(jsonObject.getString("dotid"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("cman")) {
			model.setCman(jsonObject.getString("cman"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}
		if (jsonObject.containsKey("filesize")) {
			model.setFilesize(jsonObject.getInteger("filesize"));
		}
		if (jsonObject.containsKey("vision")) {
			model.setVision(jsonObject.getString("vision"));
		}
		if (jsonObject.containsKey("savetime")) {
			model.setSavetime(jsonObject.getString("savetime"));
		}
		if (jsonObject.containsKey("remark")) {
			model.setRemark(jsonObject.getString("remark"));
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
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getInteger("type"));
		}
		if (jsonObject.containsKey("fname")) {
			model.setFname(jsonObject.getString("fname"));
		}
		if (jsonObject.containsKey("isink")) {
			model.setIsink(jsonObject.getString("isink"));
		}
		if (jsonObject.containsKey("oldId")) {
			model.setOldId(jsonObject.getString("oldId"));
		}
		if (jsonObject.containsKey("taskId")) {
			model.setTaskId(jsonObject.getString("taskId"));
		}
		if (jsonObject.containsKey("ischeck")) {
			model.setIscheck(jsonObject.getInteger("ischeck"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpDotuse model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("projid", model.getProjid());
		jsonObject.put("pid", model.getPid());
		if (model.getDotid() != null) {
			jsonObject.put("dotid", model.getDotid());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		jsonObject.put("filesize", model.getFilesize());
		if (model.getVision() != null) {
			jsonObject.put("vision", model.getVision());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getRemark() != null) {
			jsonObject.put("remark", model.getRemark());
		}
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
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		jsonObject.put("type", model.getType());
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getIsink() != null) {
			jsonObject.put("isink", model.getIsink());
		}
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		jsonObject.put("ischeck", model.getIscheck());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpDotuse model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("projid", model.getProjid());
		jsonObject.put("pid", model.getPid());
		if (model.getDotid() != null) {
			jsonObject.put("dotid", model.getDotid());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		jsonObject.put("filesize", model.getFilesize());
		if (model.getVision() != null) {
			jsonObject.put("vision", model.getVision());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getRemark() != null) {
			jsonObject.put("remark", model.getRemark());
		}
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
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		jsonObject.put("type", model.getType());
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getIsink() != null) {
			jsonObject.put("isink", model.getIsink());
		}
		if (model.getOldId() != null) {
			jsonObject.put("oldId", model.getOldId());
		}
		if (model.getTaskId() != null) {
			jsonObject.put("taskId", model.getTaskId());
		}
		jsonObject.put("ischeck", model.getIscheck());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpDotuse> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpDotuse model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpDotuse> arrayToList(JSONArray array) {
		java.util.List<IsdpDotuse> list = new java.util.ArrayList<IsdpDotuse>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpDotuse model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DotuseJsonFactory() {

	}

}
