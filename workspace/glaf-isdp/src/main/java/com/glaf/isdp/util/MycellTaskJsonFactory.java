package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.MyCellTask;

public class MycellTaskJsonFactory {

	public static MyCellTask jsonToObject(JSONObject jsonObject) {
		MyCellTask model = new MyCellTask();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("isused")) {
			model.setIsused(jsonObject.getString("isused"));
		}
		if (jsonObject.containsKey("busiessId")) {
			model.setBusiessId(jsonObject.getString("busiessId"));
		}
		if (jsonObject.containsKey("celldotIndex")) {
			model.setCelldotIndex(jsonObject.getInteger("celldotIndex"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("mname")) {
			model.setMname(jsonObject.getString("mname"));
		}
		if (jsonObject.containsKey("sname")) {
			model.setSname(jsonObject.getString("sname"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("inttype")) {
			model.setInttype(jsonObject.getInteger("inttype"));
		}
		if (jsonObject.containsKey("intcreatetype")) {
			model.setIntcreatetype(jsonObject.getInteger("intcreatetype"));
		}
		if (jsonObject.containsKey("time1")) {
			model.setTime1(jsonObject.getString("time1"));
		}
		if (jsonObject.containsKey("time2")) {
			model.setTime2(jsonObject.getString("time2"));
		}
		if (jsonObject.containsKey("time3")) {
			model.setTime3(jsonObject.getString("time3"));
		}
		if (jsonObject.containsKey("issave")) {
			model.setIssave(jsonObject.getInteger("issave"));
		}
		if (jsonObject.containsKey("isuseworkflow")) {
			model.setIsuseworkflow(jsonObject.getInteger("isuseworkflow"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("intflowortask")) {
			model.setIntflowortask(jsonObject.getInteger("intflowortask"));
		}
		if (jsonObject.containsKey("fileidPress")) {
			model.setFileidPress(jsonObject.getString("fileidPress"));
		}
		if (jsonObject.containsKey("inshowtaskinfo")) {
			model.setInshowtaskinfo(jsonObject.getString("inshowtaskinfo"));
		}
		if (jsonObject.containsKey("filenumid")) {
			model.setFilenumid(jsonObject.getString("filenumid"));
		}

		return model;
	}

	public static JSONObject toJsonObject(MyCellTask model) {
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
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("celldotIndex", model.getCelldotIndex());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getMname() != null) {
			jsonObject.put("mname", model.getMname());
		}
		if (model.getSname() != null) {
			jsonObject.put("sname", model.getSname());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("intcreatetype", model.getIntcreatetype());
		if (model.getTime1() != null) {
			jsonObject.put("time1", model.getTime1());
		}
		if (model.getTime2() != null) {
			jsonObject.put("time2", model.getTime2());
		}
		if (model.getTime3() != null) {
			jsonObject.put("time3", model.getTime3());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isuseworkflow", model.getIsuseworkflow());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("intflowortask", model.getIntflowortask());
		if (model.getFileidPress() != null) {
			jsonObject.put("fileidPress", model.getFileidPress());
		}
		if (model.getInshowtaskinfo() != null) {
			jsonObject.put("inshowtaskinfo", model.getInshowtaskinfo());
		}
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(MyCellTask model) {
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
		if (model.getBusiessId() != null) {
			jsonObject.put("busiessId", model.getBusiessId());
		}
		jsonObject.put("celldotIndex", model.getCelldotIndex());
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		if (model.getMname() != null) {
			jsonObject.put("mname", model.getMname());
		}
		if (model.getSname() != null) {
			jsonObject.put("sname", model.getSname());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		jsonObject.put("inttype", model.getInttype());
		jsonObject.put("intcreatetype", model.getIntcreatetype());
		if (model.getTime1() != null) {
			jsonObject.put("time1", model.getTime1());
		}
		if (model.getTime2() != null) {
			jsonObject.put("time2", model.getTime2());
		}
		if (model.getTime3() != null) {
			jsonObject.put("time3", model.getTime3());
		}
		jsonObject.put("issave", model.getIssave());
		jsonObject.put("isuseworkflow", model.getIsuseworkflow());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("intflowortask", model.getIntflowortask());
		if (model.getFileidPress() != null) {
			jsonObject.put("fileidPress", model.getFileidPress());
		}
		if (model.getInshowtaskinfo() != null) {
			jsonObject.put("inshowtaskinfo", model.getInshowtaskinfo());
		}
		if (model.getFilenumid() != null) {
			jsonObject.put("filenumid", model.getFilenumid());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<MyCellTask> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (MyCellTask model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<MyCellTask> arrayToList(JSONArray array) {
		java.util.List<MyCellTask> list = new java.util.ArrayList<MyCellTask>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			MyCellTask model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private MycellTaskJsonFactory() {

	}

}
