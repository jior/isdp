package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.IsdpPinfo;

public class PinfoJsonFactory {

	public static IsdpPinfo jsonToObject(JSONObject jsonObject) {
		IsdpPinfo model = new IsdpPinfo();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("itemnum")) {
			model.setItemnum(jsonObject.getString("itemnum"));
		}
		if (jsonObject.containsKey("dtag")) {
			model.setDtag(jsonObject.getString("dtag"));
		}
		if (jsonObject.containsKey("ftag")) {
			model.setFtag(jsonObject.getString("ftag"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("allname")) {
			model.setAllname(jsonObject.getString("allname"));
		}
		if (jsonObject.containsKey("bcompany")) {
			model.setBcompany(jsonObject.getString("bcompany"));
		}
		if (jsonObject.containsKey("ccompany")) {
			model.setCcompany(jsonObject.getString("ccompany"));
		}
		if (jsonObject.containsKey("dcompany")) {
			model.setDcompany(jsonObject.getString("dcompany"));
		}
		if (jsonObject.containsKey("concompany")) {
			model.setConcompany(jsonObject.getString("concompany"));
		}
		if (jsonObject.containsKey("icompany")) {
			model.setIcompany(jsonObject.getString("icompany"));
		}
		if (jsonObject.containsKey("cmark")) {
			model.setCmark(jsonObject.getString("cmark"));
		}
		if (jsonObject.containsKey("pmark")) {
			model.setPmark(jsonObject.getString("pmark"));
		}
		if (jsonObject.containsKey("tpmark")) {
			model.setTpmark(jsonObject.getString("tpmark"));
		}
		if (jsonObject.containsKey("tmark")) {
			model.setTmark(jsonObject.getString("tmark"));
		}
		if (jsonObject.containsKey("conmark")) {
			model.setConmark(jsonObject.getString("conmark"));
		}
		if (jsonObject.containsKey("mapnum")) {
			model.setMapnum(jsonObject.getString("mapnum"));
		}
		if (jsonObject.containsKey("constart")) {
			model.setConstart(jsonObject.getString("constart"));
		}
		if (jsonObject.containsKey("conend")) {
			model.setConend(jsonObject.getString("conend"));
		}
		if (jsonObject.containsKey("startdate")) {
			model.setStartdate(jsonObject.getDate("startdate"));
		}
		if (jsonObject.containsKey("enddate")) {
			model.setEnddate(jsonObject.getDate("enddate"));
		}
		if (jsonObject.containsKey("pmannager")) {
			model.setPmannager(jsonObject.getString("pmannager"));
		}
		if (jsonObject.containsKey("enginee")) {
			model.setEnginee(jsonObject.getString("enginee"));
		}
		if (jsonObject.containsKey("owner")) {
			model.setOwner(jsonObject.getString("owner"));
		}
		if (jsonObject.containsKey("plandate")) {
			model.setPlandate(jsonObject.getDate("plandate"));
		}
		if (jsonObject.containsKey("hintday")) {
			model.setHintday(jsonObject.getInteger("hintday"));
		}
		if (jsonObject.containsKey("duty")) {
			model.setDuty(jsonObject.getString("duty"));
		}
		if (jsonObject.containsKey("removedate")) {
			model.setRemovedate(jsonObject.getDate("removedate"));
		}
		if (jsonObject.containsKey("removeduty")) {
			model.setRemoveduty(jsonObject.getString("removeduty"));
		}
		if (jsonObject.containsKey("removefile")) {
			model.setRemovefile(jsonObject.getString("removefile"));
		}
		if (jsonObject.containsKey("partproj")) {
			model.setPartproj(jsonObject.getString("partproj"));
		}
		if (jsonObject.containsKey("cnum")) {
			model.setCnum(jsonObject.getString("cnum"));
		}
		if (jsonObject.containsKey("concompany2")) {
			model.setConcompany2(jsonObject.getString("concompany2"));
		}
		if (jsonObject.containsKey("icompany2")) {
			model.setIcompany2(jsonObject.getString("icompany2"));
		}
		if (jsonObject.containsKey("place")) {
			model.setPlace(jsonObject.getString("place"));
		}
		if (jsonObject.containsKey("setplace")) {
			model.setSetplace(jsonObject.getString("setplace"));
		}
		if (jsonObject.containsKey("settemp")) {
			model.setSettemp(jsonObject.getString("settemp"));
		}
		if (jsonObject.containsKey("bdnum")) {
			model.setBdnum(jsonObject.getString("bdnum"));
		}
		if (jsonObject.containsKey("dtnum")) {
			model.setDtnum(jsonObject.getString("dtnum"));
		}
		if (jsonObject.containsKey("pinfoUser2")) {
			model.setPinfoUser2(jsonObject.getString("pinfoUser2"));
		}
		if (jsonObject.containsKey("pinfoUser5")) {
			model.setPinfoUser5(jsonObject.getString("pinfoUser5"));
		}
		if (jsonObject.containsKey("pinfoUser6")) {
			model.setPinfoUser6(jsonObject.getInteger("pinfoUser6"));
		}
		if (jsonObject.containsKey("pinfoUser9")) {
			model.setPinfoUser9(jsonObject.getString("pinfoUser9"));
		}
		if (jsonObject.containsKey("pinfoUser10")) {
			model.setPinfoUser10(jsonObject.getString("pinfoUser10"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpPinfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getItemnum() != null) {
			jsonObject.put("itemnum", model.getItemnum());
		}
		if (model.getDtag() != null) {
			jsonObject.put("dtag", model.getDtag());
		}
		if (model.getFtag() != null) {
			jsonObject.put("ftag", model.getFtag());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getAllname() != null) {
			jsonObject.put("allname", model.getAllname());
		}
		if (model.getBcompany() != null) {
			jsonObject.put("bcompany", model.getBcompany());
		}
		if (model.getCcompany() != null) {
			jsonObject.put("ccompany", model.getCcompany());
		}
		if (model.getDcompany() != null) {
			jsonObject.put("dcompany", model.getDcompany());
		}
		if (model.getConcompany() != null) {
			jsonObject.put("concompany", model.getConcompany());
		}
		if (model.getIcompany() != null) {
			jsonObject.put("icompany", model.getIcompany());
		}
		if (model.getCmark() != null) {
			jsonObject.put("cmark", model.getCmark());
		}
		if (model.getPmark() != null) {
			jsonObject.put("pmark", model.getPmark());
		}
		if (model.getTpmark() != null) {
			jsonObject.put("tpmark", model.getTpmark());
		}
		if (model.getTmark() != null) {
			jsonObject.put("tmark", model.getTmark());
		}
		if (model.getConmark() != null) {
			jsonObject.put("conmark", model.getConmark());
		}
		if (model.getMapnum() != null) {
			jsonObject.put("mapnum", model.getMapnum());
		}
		if (model.getConstart() != null) {
			jsonObject.put("constart", model.getConstart());
		}
		if (model.getConend() != null) {
			jsonObject.put("conend", model.getConend());
		}
		if (model.getStartdate() != null) {
			jsonObject
					.put("startdate", DateUtils.getDate(model.getStartdate()));
			jsonObject.put("startdate_date",
					DateUtils.getDate(model.getStartdate()));
			jsonObject.put("startdate_datetime",
					DateUtils.getDateTime(model.getStartdate()));
		}
		if (model.getEnddate() != null) {
			jsonObject.put("enddate", DateUtils.getDate(model.getEnddate()));
			jsonObject.put("enddate_date",
					DateUtils.getDate(model.getEnddate()));
			jsonObject.put("enddate_datetime",
					DateUtils.getDateTime(model.getEnddate()));
		}
		if (model.getPmannager() != null) {
			jsonObject.put("pmannager", model.getPmannager());
		}
		if (model.getEnginee() != null) {
			jsonObject.put("enginee", model.getEnginee());
		}
		if (model.getOwner() != null) {
			jsonObject.put("owner", model.getOwner());
		}
		if (model.getPlandate() != null) {
			jsonObject.put("plandate", DateUtils.getDate(model.getPlandate()));
			jsonObject.put("plandate_date",
					DateUtils.getDate(model.getPlandate()));
			jsonObject.put("plandate_datetime",
					DateUtils.getDateTime(model.getPlandate()));
		}
		jsonObject.put("hintday", model.getHintday());
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getRemovedate() != null) {
			jsonObject.put("removedate",
					DateUtils.getDate(model.getRemovedate()));
			jsonObject.put("removedate_date",
					DateUtils.getDate(model.getRemovedate()));
			jsonObject.put("removedate_datetime",
					DateUtils.getDateTime(model.getRemovedate()));
		}
		if (model.getRemoveduty() != null) {
			jsonObject.put("removeduty", model.getRemoveduty());
		}
		if (model.getRemovefile() != null) {
			jsonObject.put("removefile", model.getRemovefile());
		}
		if (model.getPartproj() != null) {
			jsonObject.put("partproj", model.getPartproj());
		}
		if (model.getCnum() != null) {
			jsonObject.put("cnum", model.getCnum());
		}
		if (model.getConcompany2() != null) {
			jsonObject.put("concompany2", model.getConcompany2());
		}
		if (model.getIcompany2() != null) {
			jsonObject.put("icompany2", model.getIcompany2());
		}
		if (model.getPlace() != null) {
			jsonObject.put("place", model.getPlace());
		}
		if (model.getSetplace() != null) {
			jsonObject.put("setplace", model.getSetplace());
		}
		if (model.getSettemp() != null) {
			jsonObject.put("settemp", model.getSettemp());
		}
		if (model.getBdnum() != null) {
			jsonObject.put("bdnum", model.getBdnum());
		}
		if (model.getDtnum() != null) {
			jsonObject.put("dtnum", model.getDtnum());
		}
		if (model.getPinfoUser2() != null) {
			jsonObject.put("pinfoUser2", model.getPinfoUser2());
		}
		if (model.getPinfoUser5() != null) {
			jsonObject.put("pinfoUser5", model.getPinfoUser5());
		}
		jsonObject.put("pinfoUser6", model.getPinfoUser6());
		if (model.getPinfoUser9() != null) {
			jsonObject.put("pinfoUser9", model.getPinfoUser9());
		}
		if (model.getPinfoUser10() != null) {
			jsonObject.put("pinfoUser10", model.getPinfoUser10());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpPinfo model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		if (model.getItemnum() != null) {
			jsonObject.put("itemnum", model.getItemnum());
		}
		if (model.getDtag() != null) {
			jsonObject.put("dtag", model.getDtag());
		}
		if (model.getFtag() != null) {
			jsonObject.put("ftag", model.getFtag());
		}
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		}
		if (model.getAllname() != null) {
			jsonObject.put("allname", model.getAllname());
		}
		if (model.getBcompany() != null) {
			jsonObject.put("bcompany", model.getBcompany());
		}
		if (model.getCcompany() != null) {
			jsonObject.put("ccompany", model.getCcompany());
		}
		if (model.getDcompany() != null) {
			jsonObject.put("dcompany", model.getDcompany());
		}
		if (model.getConcompany() != null) {
			jsonObject.put("concompany", model.getConcompany());
		}
		if (model.getIcompany() != null) {
			jsonObject.put("icompany", model.getIcompany());
		}
		if (model.getCmark() != null) {
			jsonObject.put("cmark", model.getCmark());
		}
		if (model.getPmark() != null) {
			jsonObject.put("pmark", model.getPmark());
		}
		if (model.getTpmark() != null) {
			jsonObject.put("tpmark", model.getTpmark());
		}
		if (model.getTmark() != null) {
			jsonObject.put("tmark", model.getTmark());
		}
		if (model.getConmark() != null) {
			jsonObject.put("conmark", model.getConmark());
		}
		if (model.getMapnum() != null) {
			jsonObject.put("mapnum", model.getMapnum());
		}
		if (model.getConstart() != null) {
			jsonObject.put("constart", model.getConstart());
		}
		if (model.getConend() != null) {
			jsonObject.put("conend", model.getConend());
		}
		if (model.getStartdate() != null) {
			jsonObject
					.put("startdate", DateUtils.getDate(model.getStartdate()));
			jsonObject.put("startdate_date",
					DateUtils.getDate(model.getStartdate()));
			jsonObject.put("startdate_datetime",
					DateUtils.getDateTime(model.getStartdate()));
		}
		if (model.getEnddate() != null) {
			jsonObject.put("enddate", DateUtils.getDate(model.getEnddate()));
			jsonObject.put("enddate_date",
					DateUtils.getDate(model.getEnddate()));
			jsonObject.put("enddate_datetime",
					DateUtils.getDateTime(model.getEnddate()));
		}
		if (model.getPmannager() != null) {
			jsonObject.put("pmannager", model.getPmannager());
		}
		if (model.getEnginee() != null) {
			jsonObject.put("enginee", model.getEnginee());
		}
		if (model.getOwner() != null) {
			jsonObject.put("owner", model.getOwner());
		}
		if (model.getPlandate() != null) {
			jsonObject.put("plandate", DateUtils.getDate(model.getPlandate()));
			jsonObject.put("plandate_date",
					DateUtils.getDate(model.getPlandate()));
			jsonObject.put("plandate_datetime",
					DateUtils.getDateTime(model.getPlandate()));
		}
		jsonObject.put("hintday", model.getHintday());
		if (model.getDuty() != null) {
			jsonObject.put("duty", model.getDuty());
		}
		if (model.getRemovedate() != null) {
			jsonObject.put("removedate",
					DateUtils.getDate(model.getRemovedate()));
			jsonObject.put("removedate_date",
					DateUtils.getDate(model.getRemovedate()));
			jsonObject.put("removedate_datetime",
					DateUtils.getDateTime(model.getRemovedate()));
		}
		if (model.getRemoveduty() != null) {
			jsonObject.put("removeduty", model.getRemoveduty());
		}
		if (model.getRemovefile() != null) {
			jsonObject.put("removefile", model.getRemovefile());
		}
		if (model.getPartproj() != null) {
			jsonObject.put("partproj", model.getPartproj());
		}
		if (model.getCnum() != null) {
			jsonObject.put("cnum", model.getCnum());
		}
		if (model.getConcompany2() != null) {
			jsonObject.put("concompany2", model.getConcompany2());
		}
		if (model.getIcompany2() != null) {
			jsonObject.put("icompany2", model.getIcompany2());
		}
		if (model.getPlace() != null) {
			jsonObject.put("place", model.getPlace());
		}
		if (model.getSetplace() != null) {
			jsonObject.put("setplace", model.getSetplace());
		}
		if (model.getSettemp() != null) {
			jsonObject.put("settemp", model.getSettemp());
		}
		if (model.getBdnum() != null) {
			jsonObject.put("bdnum", model.getBdnum());
		}
		if (model.getDtnum() != null) {
			jsonObject.put("dtnum", model.getDtnum());
		}
		if (model.getPinfoUser2() != null) {
			jsonObject.put("pinfoUser2", model.getPinfoUser2());
		}
		if (model.getPinfoUser5() != null) {
			jsonObject.put("pinfoUser5", model.getPinfoUser5());
		}
		jsonObject.put("pinfoUser6", model.getPinfoUser6());
		if (model.getPinfoUser9() != null) {
			jsonObject.put("pinfoUser9", model.getPinfoUser9());
		}
		if (model.getPinfoUser10() != null) {
			jsonObject.put("pinfoUser10", model.getPinfoUser10());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpPinfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpPinfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpPinfo> arrayToList(JSONArray array) {
		java.util.List<IsdpPinfo> list = new java.util.ArrayList<IsdpPinfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpPinfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private PinfoJsonFactory() {

	}

}
