package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.IsdpPfileAtt;

public class PfileAttJsonFactory {

	public static IsdpPfileAtt jsonToObject(JSONObject jsonObject) {
		IsdpPfileAtt model = new IsdpPfileAtt();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("tname")) {
			model.setTname(jsonObject.getString("tname"));
		}
		if (jsonObject.containsKey("duty")) {
			model.setDuty(jsonObject.getString("duty"));
		}
		if (jsonObject.containsKey("tagnum")) {
			model.setTagnum(jsonObject.getString("tagnum"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("pageno")) {
			model.setPageno(jsonObject.getString("pageno"));
		}
		if (jsonObject.containsKey("page")) {
			model.setPage(jsonObject.getInteger("page"));
		}
		if (jsonObject.containsKey("filetype")) {
			model.setFiletype(jsonObject.getString("filetype"));
		}
		if (jsonObject.containsKey("savetime")) {
			model.setSavetime(jsonObject.getString("savetime"));
		}
		if (jsonObject.containsKey("annotations")) {
			model.setAnnotations(jsonObject.getString("annotations"));
		}
		if (jsonObject.containsKey("carriertype")) {
			model.setCarriertype(jsonObject.getString("carriertype"));
		}
		if (jsonObject.containsKey("summary")) {
			model.setSummary(jsonObject.getString("summary"));
		}
		if (jsonObject.containsKey("ptext")) {
			model.setPtext(jsonObject.getString("ptext"));
		}
		if (jsonObject.containsKey("carrieru")) {
			model.setCarrieru(jsonObject.getString("carrieru"));
		}
		if (jsonObject.containsKey("glidenum")) {
			model.setGlidenum(jsonObject.getString("glidenum"));
		}
		if (jsonObject.containsKey("pagetype")) {
			model.setPagetype(jsonObject.getString("pagetype"));
		}
		if (jsonObject.containsKey("clistno")) {
			model.setClistno(jsonObject.getInteger("clistno"));
		}
		if (jsonObject.containsKey("cpageno")) {
			model.setCpageno(jsonObject.getString("cpageno"));
		}
		if (jsonObject.containsKey("vnum")) {
			model.setVnum(jsonObject.getString("vnum"));
		}
		if (jsonObject.containsKey("cvnum")) {
			model.setCvnum(jsonObject.getString("cvnum"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpPfileAtt model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getTagnum() != null) {
			jsonObject.put("tagnum", model.getTagnum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getPageno() != null) {
			jsonObject.put("pageno", model.getPageno());
		}
		jsonObject.put("page", model.getPage());
		if (model.getFiletype() != null) {
			jsonObject.put("filetype", model.getFiletype());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		if (model.getCarriertype() != null) {
			jsonObject.put("carriertype", model.getCarriertype());
		}
		if (model.getSummary() != null) {
			jsonObject.put("summary", model.getSummary());
		}
		if (model.getPtext() != null) {
			jsonObject.put("ptext", model.getPtext());
		}
		if (model.getCarrieru() != null) {
			jsonObject.put("carrieru", model.getCarrieru());
		}
		if (model.getGlidenum() != null) {
			jsonObject.put("glidenum", model.getGlidenum());
		}
		if (model.getPagetype() != null) {
			jsonObject.put("pagetype", model.getPagetype());
		}
		jsonObject.put("clistno", model.getClistno());
		if (model.getCpageno() != null) {
			jsonObject.put("cpageno", model.getCpageno());
		}
		if (model.getVnum() != null) {
			jsonObject.put("vnum", model.getVnum());
		}
		if (model.getCvnum() != null) {
			jsonObject.put("cvnum", model.getCvnum());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpPfileAtt model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getTagnum() != null) {
			jsonObject.put("tagnum", model.getTagnum());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getPageno() != null) {
			jsonObject.put("pageno", model.getPageno());
		}
		jsonObject.put("page", model.getPage());
		if (model.getFiletype() != null) {
			jsonObject.put("filetype", model.getFiletype());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		if (model.getCarriertype() != null) {
			jsonObject.put("carriertype", model.getCarriertype());
		}
		if (model.getSummary() != null) {
			jsonObject.put("summary", model.getSummary());
		}
		if (model.getPtext() != null) {
			jsonObject.put("ptext", model.getPtext());
		}
		if (model.getCarrieru() != null) {
			jsonObject.put("carrieru", model.getCarrieru());
		}
		if (model.getGlidenum() != null) {
			jsonObject.put("glidenum", model.getGlidenum());
		}
		if (model.getPagetype() != null) {
			jsonObject.put("pagetype", model.getPagetype());
		}
		jsonObject.put("clistno", model.getClistno());
		if (model.getCpageno() != null) {
			jsonObject.put("cpageno", model.getCpageno());
		}
		if (model.getVnum() != null) {
			jsonObject.put("vnum", model.getVnum());
		}
		if (model.getCvnum() != null) {
			jsonObject.put("cvnum", model.getCvnum());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpPfileAtt> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpPfileAtt model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpPfileAtt> arrayToList(JSONArray array) {
		java.util.List<IsdpPfileAtt> list = new java.util.ArrayList<IsdpPfileAtt>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpPfileAtt model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private PfileAttJsonFactory() {

	}

}
