package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.MailRec;

public class MailRecJsonFactory {

	public static MailRec jsonToObject(JSONObject jsonObject) {
		MailRec model = new MailRec();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("email")) {
			model.setEmail(jsonObject.getString("email"));
		}
		if (jsonObject.containsKey("msgId")) {
			model.setMsgId(jsonObject.getString("msgId"));
		}
		if (jsonObject.containsKey("inReplyTo")) {
			model.setInReplyTo(jsonObject.getString("inReplyTo"));
		}
		if (jsonObject.containsKey("from")) {
			model.setFrom(jsonObject.getString("from"));
		}
		if (jsonObject.containsKey("to")) {
			model.setTo(jsonObject.getString("to"));
		}
		if (jsonObject.containsKey("cc")) {
			model.setCc(jsonObject.getString("cc"));
		}
		if (jsonObject.containsKey("date")) {
			model.setDate(jsonObject.getDate("date"));
		}
		if (jsonObject.containsKey("subject")) {
			model.setSubject(jsonObject.getString("subject"));
		}
		if (jsonObject.containsKey("replyTo")) {
			model.setReplyTo(jsonObject.getString("replyTo"));
		}
		if (jsonObject.containsKey("text")) {
			model.setText(jsonObject.getString("text"));
		}
		if (jsonObject.containsKey("html")) {
			model.setHtml(jsonObject.getString("html"));
		}
		if (jsonObject.containsKey("guidFrom")) {
			model.setGuidFrom(jsonObject.getString("guidFrom"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MailRec model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		if (model.getMsgId() != null) {
			jsonObject.put("msgId", model.getMsgId());
		}
		if (model.getInReplyTo() != null) {
			jsonObject.put("inReplyTo", model.getInReplyTo());
		}
		if (model.getFrom() != null) {
			jsonObject.put("from", model.getFrom());
		}
		if (model.getTo() != null) {
			jsonObject.put("to", model.getTo());
		}
		if (model.getCc() != null) {
			jsonObject.put("cc", model.getCc());
		}
		if (model.getDate() != null) {
			jsonObject.put("date", DateUtils.getDate(model.getDate()));
			jsonObject.put("date_date", DateUtils.getDate(model.getDate()));
			jsonObject.put("date_datetime",
					DateUtils.getDateTime(model.getDate()));
		}
		if (model.getSubject() != null) {
			jsonObject.put("subject", model.getSubject());
		}
		if (model.getReplyTo() != null) {
			jsonObject.put("replyTo", model.getReplyTo());
		}
		if (model.getText() != null) {
			jsonObject.put("text", model.getText());
		}
		if (model.getHtml() != null) {
			jsonObject.put("html", model.getHtml());
		}
		if (model.getGuidFrom() != null) {
			jsonObject.put("guidFrom", model.getGuidFrom());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MailRec model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		}
		if (model.getMsgId() != null) {
			jsonObject.put("msgId", model.getMsgId());
		}
		if (model.getInReplyTo() != null) {
			jsonObject.put("inReplyTo", model.getInReplyTo());
		}
		if (model.getFrom() != null) {
			jsonObject.put("from", model.getFrom());
		}
		if (model.getTo() != null) {
			jsonObject.put("to", model.getTo());
		}
		if (model.getCc() != null) {
			jsonObject.put("cc", model.getCc());
		}
		if (model.getDate() != null) {
			jsonObject.put("date", DateUtils.getDate(model.getDate()));
			jsonObject.put("date_date", DateUtils.getDate(model.getDate()));
			jsonObject.put("date_datetime",
					DateUtils.getDateTime(model.getDate()));
		}
		if (model.getSubject() != null) {
			jsonObject.put("subject", model.getSubject());
		}
		if (model.getReplyTo() != null) {
			jsonObject.put("replyTo", model.getReplyTo());
		}
		if (model.getText() != null) {
			jsonObject.put("text", model.getText());
		}
		if (model.getHtml() != null) {
			jsonObject.put("html", model.getHtml());
		}
		if (model.getGuidFrom() != null) {
			jsonObject.put("guidFrom", model.getGuidFrom());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MailRec> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MailRec model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MailRec> arrayToList(JSONArray array) {
		java.util.List<MailRec> list = new java.util.ArrayList<MailRec>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MailRec model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MailRecJsonFactory() {

	}

}
