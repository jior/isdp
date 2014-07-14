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
import com.glaf.dms.domain.DmsVolume;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsVolumeJsonFactory {

	public static DmsVolume jsonToObject(JSONObject jsonObject) {
		DmsVolume model = new DmsVolume();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("oldid")) {
			model.setOldid(jsonObject.getString("oldid"));
		}
		if (jsonObject.containsKey("ruleID")) {
			model.setRuleID(jsonObject.getString("ruleID"));
		}
		if (jsonObject.containsKey("ruleflag")) {
			model.setRuleflag(jsonObject.getString("ruleflag"));
		}
		if (jsonObject.containsKey("rulepid")) {
			model.setRulepid(jsonObject.getString("rulepid"));
		}
		if (jsonObject.containsKey("vid")) {
			model.setVid(jsonObject.getString("vid"));
		}
		if (jsonObject.containsKey("sumflag")) {
			model.setSumflag(jsonObject.getString("sumflag"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getInteger("topid"));
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
		if (jsonObject.containsKey("pname")) {
			model.setPname(jsonObject.getString("pname"));
		}
		if (jsonObject.containsKey("vflag")) {
			model.setVflag(jsonObject.getString("vflag"));
		}
		if (jsonObject.containsKey("vname")) {
			model.setVname(jsonObject.getString("vname"));
		}
		if (jsonObject.containsKey("year")) {
			model.setYear(jsonObject.getInteger("year"));
		}
		if (jsonObject.containsKey("glidenum")) {
			model.setGlidenum(jsonObject.getString("glidenum"));
		}
		if (jsonObject.containsKey("filingflag")) {
			model.setFilingflag(jsonObject.getString("filingflag"));
		}
		if (jsonObject.containsKey("checkupflag")) {
			model.setCheckupflag(jsonObject.getString("checkupflag"));
		}
		if (jsonObject.containsKey("openflag")) {
			model.setOpenflag(jsonObject.getString("openflag"));
		}
		if (jsonObject.containsKey("finishflag")) {
			model.setFinishflag(jsonObject.getString("finishflag"));
		}
		if (jsonObject.containsKey("vtagnum")) {
			model.setVtagnum(jsonObject.getString("vtagnum"));
		}
		if (jsonObject.containsKey("vtype")) {
			model.setVtype(jsonObject.getString("vtype"));
		}
		if (jsonObject.containsKey("vnum")) {
			model.setVnum(jsonObject.getString("vnum"));
		}
		if (jsonObject.containsKey("vtmpnum")) {
			model.setVtmpnum(jsonObject.getString("vtmpnum"));
		}
		if (jsonObject.containsKey("roomnum")) {
			model.setRoomnum(jsonObject.getString("roomnum"));
		}
		if (jsonObject.containsKey("zoonum")) {
			model.setZoonum(jsonObject.getString("zoonum"));
		}
		if (jsonObject.containsKey("efilenum")) {
			model.setEfilenum(jsonObject.getString("efilenum"));
		}
		if (jsonObject.containsKey("boxnum")) {
			model.setBoxnum(jsonObject.getString("boxnum"));
		}
		if (jsonObject.containsKey("place")) {
			model.setPlace(jsonObject.getString("place"));
		}
		if (jsonObject.containsKey("tname")) {
			model.setTname(jsonObject.getString("tname"));
		}
		if (jsonObject.containsKey("wcompany")) {
			model.setWcompany(jsonObject.getString("wcompany"));
		}
		if (jsonObject.containsKey("wdate")) {
			model.setWdate(jsonObject.getDate("wdate"));
		}
		if (jsonObject.containsKey("carriertype")) {
			model.setCarriertype(jsonObject.getString("carriertype"));
		}
		if (jsonObject.containsKey("numunit")) {
			model.setNumunit(jsonObject.getString("numunit"));
		}
		if (jsonObject.containsKey("spec")) {
			model.setSpec(jsonObject.getString("spec"));
		}
		if (jsonObject.containsKey("startday")) {
			model.setStartday(jsonObject.getDate("startday"));
		}
		if (jsonObject.containsKey("endday")) {
			model.setEndday(jsonObject.getDate("endday"));
		}
		if (jsonObject.containsKey("savetime")) {
			model.setSavetime(jsonObject.getString("savetime"));
		}
		if (jsonObject.containsKey("slevel")) {
			model.setSlevel(jsonObject.getString("slevel"));
		}
		if (jsonObject.containsKey("thematic")) {
			model.setThematic(jsonObject.getString("thematic"));
		}
		if (jsonObject.containsKey("annotations")) {
			model.setAnnotations(jsonObject.getString("annotations"));
		}
		if (jsonObject.containsKey("totalfile")) {
			model.setTotalfile(jsonObject.getInteger("totalfile"));
		}
		if (jsonObject.containsKey("totalpage")) {
			model.setTotalpage(jsonObject.getInteger("totalpage"));
		}
		if (jsonObject.containsKey("txtpage")) {
			model.setTxtpage(jsonObject.getInteger("txtpage"));
		}
		if (jsonObject.containsKey("picpage")) {
			model.setPicpage(jsonObject.getInteger("picpage"));
		}
		if (jsonObject.containsKey("photopage")) {
			model.setPhotopage(jsonObject.getInteger("photopage"));
		}
		if (jsonObject.containsKey("cman")) {
			model.setCman(jsonObject.getString("cman"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("assessor")) {
			model.setAssessor(jsonObject.getString("assessor"));
		}
		if (jsonObject.containsKey("atime")) {
			model.setAtime(jsonObject.getDate("atime"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("islocate")) {
			model.setIslocate(jsonObject.getString("islocate"));
		}
		if (jsonObject.containsKey("topnode")) {
			model.setTopnode(jsonObject.getString("topnode"));
		}
		if (jsonObject.containsKey("lcontent")) {
			model.setLcontent(jsonObject.getString("lcontent"));
		}
		if (jsonObject.containsKey("lcompany")) {
			model.setLcompany(jsonObject.getString("lcompany"));
		}
		if (jsonObject.containsKey("lman")) {
			model.setLman(jsonObject.getString("lman"));
		}
		if (jsonObject.containsKey("llen")) {
			model.setLlen(jsonObject.getString("llen"));
		}
		if (jsonObject.containsKey("ldate")) {
			model.setLdate(jsonObject.getDate("ldate"));
		}
		if (jsonObject.containsKey("jconten")) {
			model.setJconten(jsonObject.getString("jconten"));
		}
		if (jsonObject.containsKey("jplace")) {
			model.setJplace(jsonObject.getString("jplace"));
		}
		if (jsonObject.containsKey("jman")) {
			model.setJman(jsonObject.getString("jman"));
		}
		if (jsonObject.containsKey("jback")) {
			model.setJback(jsonObject.getString("jback"));
		}
		if (jsonObject.containsKey("jactor")) {
			model.setJactor(jsonObject.getString("jactor"));
		}
		if (jsonObject.containsKey("tnum")) {
			model.setTnum(jsonObject.getString("tnum"));
		}
		if (jsonObject.containsKey("tzoom")) {
			model.setTzoom(jsonObject.getString("tzoom"));
		}
		if (jsonObject.containsKey("tflag")) {
			model.setTflag(jsonObject.getString("tflag"));
		}
		if (jsonObject.containsKey("tdesigner")) {
			model.setTdesigner(jsonObject.getString("tdesigner"));
		}
		if (jsonObject.containsKey("tviewer")) {
			model.setTviewer(jsonObject.getString("tviewer"));
		}
		if (jsonObject.containsKey("tassessor")) {
			model.setTassessor(jsonObject.getString("tassessor"));
		}
		if (jsonObject.containsKey("tvision")) {
			model.setTvision(jsonObject.getString("tvision"));
		}
		if (jsonObject.containsKey("finishday")) {
			model.setFinishday(jsonObject.getDate("finishday"));
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

	public static JSONObject toJsonObject(DmsVolume model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("listno", model.getListno());
		if (model.getOldid() != null) {
			jsonObject.put("oldid", model.getOldid());
		}
		if (model.getRuleID() != null) {
			jsonObject.put("ruleID", model.getRuleID());
		}
		if (model.getRuleflag() != null) {
			jsonObject.put("ruleflag", model.getRuleflag());
		}
		if (model.getRulepid() != null) {
			jsonObject.put("rulepid", model.getRulepid());
		}
		if (model.getVid() != null) {
			jsonObject.put("vid", model.getVid());
		}
		if (model.getSumflag() != null) {
			jsonObject.put("sumflag", model.getSumflag());
		}
		jsonObject.put("topid", model.getTopid());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("projid", model.getProjid());
		jsonObject.put("pid", model.getPid());
		if (model.getPname() != null) {
			jsonObject.put("pname", model.getPname());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getVname() != null) {
			jsonObject.put("vname", model.getVname());
		}
		jsonObject.put("year", model.getYear());
		if (model.getGlidenum() != null) {
			jsonObject.put("glidenum", model.getGlidenum());
		}
		if (model.getFilingflag() != null) {
			jsonObject.put("filingflag", model.getFilingflag());
		}
		if (model.getCheckupflag() != null) {
			jsonObject.put("checkupflag", model.getCheckupflag());
		}
		if (model.getOpenflag() != null) {
			jsonObject.put("openflag", model.getOpenflag());
		}
		if (model.getFinishflag() != null) {
			jsonObject.put("finishflag", model.getFinishflag());
		}
		if (model.getVtagnum() != null) {
			jsonObject.put("vtagnum", model.getVtagnum());
		}
		if (model.getVtype() != null) {
			jsonObject.put("vtype", model.getVtype());
		}
		if (model.getVnum() != null) {
			jsonObject.put("vnum", model.getVnum());
		}
		if (model.getVtmpnum() != null) {
			jsonObject.put("vtmpnum", model.getVtmpnum());
		}
		if (model.getRoomnum() != null) {
			jsonObject.put("roomnum", model.getRoomnum());
		}
		if (model.getZoonum() != null) {
			jsonObject.put("zoonum", model.getZoonum());
		}
		if (model.getEfilenum() != null) {
			jsonObject.put("efilenum", model.getEfilenum());
		}
		if (model.getBoxnum() != null) {
			jsonObject.put("boxnum", model.getBoxnum());
		}
		if (model.getPlace() != null) {
			jsonObject.put("place", model.getPlace());
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		if (model.getWdate() != null) {
			jsonObject.put("wdate", DateUtils.getDate(model.getWdate()));
			jsonObject.put("wdate_date", DateUtils.getDate(model.getWdate()));
			jsonObject.put("wdate_datetime",
					DateUtils.getDateTime(model.getWdate()));
		}
		if (model.getCarriertype() != null) {
			jsonObject.put("carriertype", model.getCarriertype());
		}
		if (model.getNumunit() != null) {
			jsonObject.put("numunit", model.getNumunit());
		}
		if (model.getSpec() != null) {
			jsonObject.put("spec", model.getSpec());
		}
		if (model.getStartday() != null) {
			jsonObject.put("startday", DateUtils.getDate(model.getStartday()));
			jsonObject.put("startday_date",
					DateUtils.getDate(model.getStartday()));
			jsonObject.put("startday_datetime",
					DateUtils.getDateTime(model.getStartday()));
		}
		if (model.getEndday() != null) {
			jsonObject.put("endday", DateUtils.getDate(model.getEndday()));
			jsonObject.put("endday_date", DateUtils.getDate(model.getEndday()));
			jsonObject.put("endday_datetime",
					DateUtils.getDateTime(model.getEndday()));
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		jsonObject.put("totalfile", model.getTotalfile());
		jsonObject.put("totalpage", model.getTotalpage());
		jsonObject.put("txtpage", model.getTxtpage());
		jsonObject.put("picpage", model.getPicpage());
		jsonObject.put("photopage", model.getPhotopage());
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getAssessor() != null) {
			jsonObject.put("assessor", model.getAssessor());
		}
		if (model.getAtime() != null) {
			jsonObject.put("atime", DateUtils.getDate(model.getAtime()));
			jsonObject.put("atime_date", DateUtils.getDate(model.getAtime()));
			jsonObject.put("atime_datetime",
					DateUtils.getDateTime(model.getAtime()));
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getIslocate() != null) {
			jsonObject.put("islocate", model.getIslocate());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getLcontent() != null) {
			jsonObject.put("lcontent", model.getLcontent());
		}
		if (model.getLcompany() != null) {
			jsonObject.put("lcompany", model.getLcompany());
		}
		if (model.getLman() != null) {
			jsonObject.put("lman", model.getLman());
		}
		if (model.getLlen() != null) {
			jsonObject.put("llen", model.getLlen());
		}
		if (model.getLdate() != null) {
			jsonObject.put("ldate", DateUtils.getDate(model.getLdate()));
			jsonObject.put("ldate_date", DateUtils.getDate(model.getLdate()));
			jsonObject.put("ldate_datetime",
					DateUtils.getDateTime(model.getLdate()));
		}
		if (model.getJconten() != null) {
			jsonObject.put("jconten", model.getJconten());
		}
		if (model.getJplace() != null) {
			jsonObject.put("jplace", model.getJplace());
		}
		if (model.getJman() != null) {
			jsonObject.put("jman", model.getJman());
		}
		if (model.getJback() != null) {
			jsonObject.put("jback", model.getJback());
		}
		if (model.getJactor() != null) {
			jsonObject.put("jactor", model.getJactor());
		}
		if (model.getTnum() != null) {
			jsonObject.put("tnum", model.getTnum());
		}
		if (model.getTzoom() != null) {
			jsonObject.put("tzoom", model.getTzoom());
		}
		if (model.getTflag() != null) {
			jsonObject.put("tflag", model.getTflag());
		}
		if (model.getTdesigner() != null) {
			jsonObject.put("tdesigner", model.getTdesigner());
		}
		if (model.getTviewer() != null) {
			jsonObject.put("tviewer", model.getTviewer());
		}
		if (model.getTassessor() != null) {
			jsonObject.put("tassessor", model.getTassessor());
		}
		if (model.getTvision() != null) {
			jsonObject.put("tvision", model.getTvision());
		}
		if (model.getFinishday() != null) {
			jsonObject
					.put("finishday", DateUtils.getDate(model.getFinishday()));
			jsonObject.put("finishday_date",
					DateUtils.getDate(model.getFinishday()));
			jsonObject.put("finishday_datetime",
					DateUtils.getDateTime(model.getFinishday()));
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsVolume model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("listno", model.getListno());
		if (model.getOldid() != null) {
			jsonObject.put("oldid", model.getOldid());
		}
		if (model.getRuleID() != null) {
			jsonObject.put("ruleID", model.getRuleID());
		}
		if (model.getRuleflag() != null) {
			jsonObject.put("ruleflag", model.getRuleflag());
		}
		if (model.getRulepid() != null) {
			jsonObject.put("rulepid", model.getRulepid());
		}
		if (model.getVid() != null) {
			jsonObject.put("vid", model.getVid());
		}
		if (model.getSumflag() != null) {
			jsonObject.put("sumflag", model.getSumflag());
		}
		jsonObject.put("topid", model.getTopid());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("projid", model.getProjid());
		jsonObject.put("pid", model.getPid());
		if (model.getPname() != null) {
			jsonObject.put("pname", model.getPname());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getVname() != null) {
			jsonObject.put("vname", model.getVname());
		}
		jsonObject.put("year", model.getYear());
		if (model.getGlidenum() != null) {
			jsonObject.put("glidenum", model.getGlidenum());
		}
		if (model.getFilingflag() != null) {
			jsonObject.put("filingflag", model.getFilingflag());
		}
		if (model.getCheckupflag() != null) {
			jsonObject.put("checkupflag", model.getCheckupflag());
		}
		if (model.getOpenflag() != null) {
			jsonObject.put("openflag", model.getOpenflag());
		}
		if (model.getFinishflag() != null) {
			jsonObject.put("finishflag", model.getFinishflag());
		}
		if (model.getVtagnum() != null) {
			jsonObject.put("vtagnum", model.getVtagnum());
		}
		if (model.getVtype() != null) {
			jsonObject.put("vtype", model.getVtype());
		}
		if (model.getVnum() != null) {
			jsonObject.put("vnum", model.getVnum());
		}
		if (model.getVtmpnum() != null) {
			jsonObject.put("vtmpnum", model.getVtmpnum());
		}
		if (model.getRoomnum() != null) {
			jsonObject.put("roomnum", model.getRoomnum());
		}
		if (model.getZoonum() != null) {
			jsonObject.put("zoonum", model.getZoonum());
		}
		if (model.getEfilenum() != null) {
			jsonObject.put("efilenum", model.getEfilenum());
		}
		if (model.getBoxnum() != null) {
			jsonObject.put("boxnum", model.getBoxnum());
		}
		if (model.getPlace() != null) {
			jsonObject.put("place", model.getPlace());
		}
		if (model.getTname() != null) {
			jsonObject.put("tname", model.getTname());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		if (model.getWdate() != null) {
			jsonObject.put("wdate", DateUtils.getDate(model.getWdate()));
			jsonObject.put("wdate_date", DateUtils.getDate(model.getWdate()));
			jsonObject.put("wdate_datetime",
					DateUtils.getDateTime(model.getWdate()));
		}
		if (model.getCarriertype() != null) {
			jsonObject.put("carriertype", model.getCarriertype());
		}
		if (model.getNumunit() != null) {
			jsonObject.put("numunit", model.getNumunit());
		}
		if (model.getSpec() != null) {
			jsonObject.put("spec", model.getSpec());
		}
		if (model.getStartday() != null) {
			jsonObject.put("startday", DateUtils.getDate(model.getStartday()));
			jsonObject.put("startday_date",
					DateUtils.getDate(model.getStartday()));
			jsonObject.put("startday_datetime",
					DateUtils.getDateTime(model.getStartday()));
		}
		if (model.getEndday() != null) {
			jsonObject.put("endday", DateUtils.getDate(model.getEndday()));
			jsonObject.put("endday_date", DateUtils.getDate(model.getEndday()));
			jsonObject.put("endday_datetime",
					DateUtils.getDateTime(model.getEndday()));
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
		}
		if (model.getAnnotations() != null) {
			jsonObject.put("annotations", model.getAnnotations());
		}
		jsonObject.put("totalfile", model.getTotalfile());
		jsonObject.put("totalpage", model.getTotalpage());
		jsonObject.put("txtpage", model.getTxtpage());
		jsonObject.put("picpage", model.getPicpage());
		jsonObject.put("photopage", model.getPhotopage());
		if (model.getCman() != null) {
			jsonObject.put("cman", model.getCman());
		}
		if (model.getCtime() != null) {
			jsonObject.put("ctime", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_date", DateUtils.getDate(model.getCtime()));
			jsonObject.put("ctime_datetime",
					DateUtils.getDateTime(model.getCtime()));
		}
		if (model.getAssessor() != null) {
			jsonObject.put("assessor", model.getAssessor());
		}
		if (model.getAtime() != null) {
			jsonObject.put("atime", DateUtils.getDate(model.getAtime()));
			jsonObject.put("atime_date", DateUtils.getDate(model.getAtime()));
			jsonObject.put("atime_datetime",
					DateUtils.getDateTime(model.getAtime()));
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getIslocate() != null) {
			jsonObject.put("islocate", model.getIslocate());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		if (model.getLcontent() != null) {
			jsonObject.put("lcontent", model.getLcontent());
		}
		if (model.getLcompany() != null) {
			jsonObject.put("lcompany", model.getLcompany());
		}
		if (model.getLman() != null) {
			jsonObject.put("lman", model.getLman());
		}
		if (model.getLlen() != null) {
			jsonObject.put("llen", model.getLlen());
		}
		if (model.getLdate() != null) {
			jsonObject.put("ldate", DateUtils.getDate(model.getLdate()));
			jsonObject.put("ldate_date", DateUtils.getDate(model.getLdate()));
			jsonObject.put("ldate_datetime",
					DateUtils.getDateTime(model.getLdate()));
		}
		if (model.getJconten() != null) {
			jsonObject.put("jconten", model.getJconten());
		}
		if (model.getJplace() != null) {
			jsonObject.put("jplace", model.getJplace());
		}
		if (model.getJman() != null) {
			jsonObject.put("jman", model.getJman());
		}
		if (model.getJback() != null) {
			jsonObject.put("jback", model.getJback());
		}
		if (model.getJactor() != null) {
			jsonObject.put("jactor", model.getJactor());
		}
		if (model.getTnum() != null) {
			jsonObject.put("tnum", model.getTnum());
		}
		if (model.getTzoom() != null) {
			jsonObject.put("tzoom", model.getTzoom());
		}
		if (model.getTflag() != null) {
			jsonObject.put("tflag", model.getTflag());
		}
		if (model.getTdesigner() != null) {
			jsonObject.put("tdesigner", model.getTdesigner());
		}
		if (model.getTviewer() != null) {
			jsonObject.put("tviewer", model.getTviewer());
		}
		if (model.getTassessor() != null) {
			jsonObject.put("tassessor", model.getTassessor());
		}
		if (model.getTvision() != null) {
			jsonObject.put("tvision", model.getTvision());
		}
		if (model.getFinishday() != null) {
			jsonObject
					.put("finishday", DateUtils.getDate(model.getFinishday()));
			jsonObject.put("finishday_date",
					DateUtils.getDate(model.getFinishday()));
			jsonObject.put("finishday_datetime",
					DateUtils.getDateTime(model.getFinishday()));
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsVolume> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsVolume model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsVolume> arrayToList(JSONArray array) {
		java.util.List<DmsVolume> list = new java.util.ArrayList<DmsVolume>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsVolume model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsVolumeJsonFactory() {

	}

}
