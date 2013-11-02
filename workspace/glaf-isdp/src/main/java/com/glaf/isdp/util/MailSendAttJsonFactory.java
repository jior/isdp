package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.MailSendAtt;

public class MailSendAttJsonFactory {

	public static MailSendAtt jsonToObject(JSONObject jsonObject) {
		MailSendAtt model = new MailSendAtt();
		if (jsonObject.containsKey("fileId")) {
			model.setFileId(jsonObject.getString("fileId"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("fileName")) {
			model.setFileName(jsonObject.getString("fileName"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MailSendAtt model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("fileId", model.getFileId());
		jsonObject.put("_fileId_", model.getFileId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MailSendAtt model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("fileId", model.getFileId());
		jsonObject.put("_fileId_", model.getFileId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getFileName() != null) {
			jsonObject.put("fileName", model.getFileName());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MailSendAtt> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MailSendAtt model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MailSendAtt> arrayToList(JSONArray array) {
		java.util.List<MailSendAtt> list = new java.util.ArrayList<MailSendAtt>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MailSendAtt model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MailSendAttJsonFactory() {

	}

}
