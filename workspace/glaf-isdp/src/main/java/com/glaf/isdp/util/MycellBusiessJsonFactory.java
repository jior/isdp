package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.MyCellBusiess;

public class MycellBusiessJsonFactory {

	public static MyCellBusiess jsonToObject(JSONObject jsonObject) {
		MyCellBusiess model = new MyCellBusiess();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("isused")) {
			model.setIsused(jsonObject.getString("isused"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("intsystype")) {
			model.setIntsystype(jsonObject.getInteger("intsystype"));
		}
		if (jsonObject.containsKey("picfile")) {
			model.setPicfile(jsonObject.getString("picfile"));
		}
		if (jsonObject.containsKey("picfileWelcom")) {
			model.setPicfileWelcom(jsonObject.getString("picfileWelcom"));
		}
		if (jsonObject.containsKey("picfileMain")) {
			model.setPicfileMain(jsonObject.getString("picfileMain"));
		}
		if (jsonObject.containsKey("picfileLogin")) {
			model.setPicfileLogin(jsonObject.getString("picfileLogin"));
		}
		if (jsonObject.containsKey("sysbuiesstypesId")) {
			model.setSysbuiesstypesId(jsonObject.getString("sysbuiesstypesId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("domainIndex")) {
			model.setDomainIndex(jsonObject.getInteger("domainIndex"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MyCellBusiess model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getIsused() != null) {
			jsonObject.put("isused", model.getIsused());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("intsystype", model.getIntsystype());
		if (model.getPicfile() != null) {
			jsonObject.put("picfile", model.getPicfile());
		}
		if (model.getPicfileWelcom() != null) {
			jsonObject.put("picfileWelcom", model.getPicfileWelcom());
		}
		if (model.getPicfileMain() != null) {
			jsonObject.put("picfileMain", model.getPicfileMain());
		}
		if (model.getPicfileLogin() != null) {
			jsonObject.put("picfileLogin", model.getPicfileLogin());
		}
		if (model.getSysbuiesstypesId() != null) {
			jsonObject.put("sysbuiesstypesId", model.getSysbuiesstypesId());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MyCellBusiess model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getIsused() != null) {
			jsonObject.put("isused", model.getIsused());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("intsystype", model.getIntsystype());
		if (model.getPicfile() != null) {
			jsonObject.put("picfile", model.getPicfile());
		}
		if (model.getPicfileWelcom() != null) {
			jsonObject.put("picfileWelcom", model.getPicfileWelcom());
		}
		if (model.getPicfileMain() != null) {
			jsonObject.put("picfileMain", model.getPicfileMain());
		}
		if (model.getPicfileLogin() != null) {
			jsonObject.put("picfileLogin", model.getPicfileLogin());
		}
		if (model.getSysbuiesstypesId() != null) {
			jsonObject.put("sysbuiesstypesId", model.getSysbuiesstypesId());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("domainIndex", model.getDomainIndex());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MyCellBusiess> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MyCellBusiess model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MyCellBusiess> arrayToList(JSONArray array) {
		java.util.List<MyCellBusiess> list = new java.util.ArrayList<MyCellBusiess>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MyCellBusiess model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MycellBusiessJsonFactory() {

	}

}
