package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.IsdpFileatt;

public class FileattJsonFactory {

	public static IsdpFileatt jsonToObject(JSONObject jsonObject) {
		IsdpFileatt model = new IsdpFileatt();
		if (jsonObject.containsKey("fileID")) {
			model.setFileID(jsonObject.getString("fileID"));
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
		if (jsonObject.containsKey("istextcontent")) {
			model.setIstextcontent(jsonObject.getInteger("istextcontent"));
		}
		if (jsonObject.containsKey("textcontent")) {
			model.setTextcontent(jsonObject.getString("textcontent"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpFileatt model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
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
		jsonObject.put("istextcontent", model.getIstextcontent());
		if (model.getTextcontent() != null) {
			jsonObject.put("textcontent", model.getTextcontent());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpFileatt model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("fileID", model.getFileID());
		jsonObject.put("_fileID_", model.getFileID());
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
		jsonObject.put("istextcontent", model.getIstextcontent());
		if (model.getTextcontent() != null) {
			jsonObject.put("textcontent", model.getTextcontent());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpFileatt> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpFileatt model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpFileatt> arrayToList(JSONArray array) {
		java.util.List<IsdpFileatt> list = new java.util.ArrayList<IsdpFileatt>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpFileatt model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FileattJsonFactory() {

	}

}
