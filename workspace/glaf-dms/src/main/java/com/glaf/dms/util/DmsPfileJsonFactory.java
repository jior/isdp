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
import com.glaf.dms.domain.DmsPfile;

/**
 * 
 * JSON工厂类
 * 
 */
public class DmsPfileJsonFactory {

	public static DmsPfile jsonToObject(JSONObject jsonObject) {
		DmsPfile model = new DmsPfile();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("efilenum")) {
			model.setEfilenum(jsonObject.getInteger("efilenum"));
		}
		if (jsonObject.containsKey("listnum")) {
			model.setListnum(jsonObject.getString("listnum"));
		}
		if (jsonObject.containsKey("listId")) {
			model.setListId(jsonObject.getLong("listId"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("pid")) {
			model.setPid(jsonObject.getInteger("pid"));
		}
		if (jsonObject.containsKey("projid")) {
			model.setProjid(jsonObject.getInteger("projid"));
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
		if (jsonObject.containsKey("topnodem")) {
			model.setTopnodem(jsonObject.getString("topnodem"));
		}
		if (jsonObject.containsKey("vid")) {
			model.setVid(jsonObject.getString("vid"));
		}
		if (jsonObject.containsKey("oldvid")) {
			model.setOldvid(jsonObject.getString("oldvid"));
		}
		if (jsonObject.containsKey("visflag")) {
			model.setVisflag(jsonObject.getString("visflag"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("filingflag")) {
			model.setFilingflag(jsonObject.getString("filingflag"));
		}
		if (jsonObject.containsKey("saveflag")) {
			model.setSaveflag(jsonObject.getString("saveflag"));
		}
		if (jsonObject.containsKey("openflag")) {
			model.setOpenflag(jsonObject.getString("openflag"));
		}
		if (jsonObject.containsKey("checkupflag")) {
			model.setCheckupflag(jsonObject.getString("checkupflag"));
		}
		if (jsonObject.containsKey("finishflag")) {
			model.setFinishflag(jsonObject.getString("finishflag"));
		}
		if (jsonObject.containsKey("fromID")) {
			model.setFromID(jsonObject.getString("fromID"));
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
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getString("filenum"));
		}
		if (jsonObject.containsKey("thematic")) {
			model.setThematic(jsonObject.getString("thematic"));
		}
		if (jsonObject.containsKey("ctime")) {
			model.setCtime(jsonObject.getDate("ctime"));
		}
		if (jsonObject.containsKey("pageno")) {
			model.setPageno(jsonObject.getString("pageno"));
		}
		if (jsonObject.containsKey("slevel")) {
			model.setSlevel(jsonObject.getString("slevel"));
		}
		if (jsonObject.containsKey("page")) {
			model.setPage(jsonObject.getInteger("page"));
		}
		if (jsonObject.containsKey("filetype")) {
			model.setFiletype(jsonObject.getString("filetype"));
		}
		if (jsonObject.containsKey("fontsnum")) {
			model.setFontsnum(jsonObject.getString("fontsnum"));
		}
		if (jsonObject.containsKey("savetime")) {
			model.setSavetime(jsonObject.getString("savetime"));
		}
		if (jsonObject.containsKey("company")) {
			model.setCompany(jsonObject.getString("company"));
		}
		if (jsonObject.containsKey("year")) {
			model.setYear(jsonObject.getInteger("year"));
		}
		if (jsonObject.containsKey("fileatt")) {
			model.setFileatt(jsonObject.getString("fileatt"));
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
		if (jsonObject.containsKey("efile")) {
			model.setEfile(jsonObject.getString("efile"));
		}
		if (jsonObject.containsKey("ftime")) {
			model.setFtime(jsonObject.getDate("ftime"));
		}
		if (jsonObject.containsKey("totalnum")) {
			model.setTotalnum(jsonObject.getString("totalnum"));
		}
		if (jsonObject.containsKey("inputman")) {
			model.setInputman(jsonObject.getString("inputman"));
		}
		if (jsonObject.containsKey("etime")) {
			model.setEtime(jsonObject.getDate("etime"));
		}
		if (jsonObject.containsKey("dotnum")) {
			model.setDotnum(jsonObject.getString("dotnum"));
		}
		if (jsonObject.containsKey("picnum")) {
			model.setPicnum(jsonObject.getString("picnum"));
		}
		if (jsonObject.containsKey("recnum")) {
			model.setRecnum(jsonObject.getString("recnum"));
		}
		if (jsonObject.containsKey("total")) {
			model.setTotal(jsonObject.getInteger("total"));
		}
		if (jsonObject.containsKey("pagetype")) {
			model.setPagetype(jsonObject.getString("pagetype"));
		}
		if (jsonObject.containsKey("iscom")) {
			model.setIscom(jsonObject.getString("iscom"));
		}
		if (jsonObject.containsKey("islocate")) {
			model.setIslocate(jsonObject.getString("islocate"));
		}
		if (jsonObject.containsKey("wcompany")) {
			model.setWcompany(jsonObject.getString("wcompany"));
		}
		if (jsonObject.containsKey("wcompanyID")) {
			model.setWcompanyID(jsonObject.getString("wcompanyID"));
		}
		if (jsonObject.containsKey("sendflag")) {
			model.setSendflag(jsonObject.getString("sendflag"));
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
		if (jsonObject.containsKey("jnum")) {
			model.setJnum(jsonObject.getString("jnum"));
		}
		if (jsonObject.containsKey("jbnum")) {
			model.setJbnum(jsonObject.getString("jbnum"));
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
		if (jsonObject.containsKey("ctimeEnd")) {
			model.setCtimeEnd(jsonObject.getDate("ctimeEnd"));
		}
		if (jsonObject.containsKey("sysListno")) {
			model.setSysListno(jsonObject.getInteger("sysListno"));
		}
		if (jsonObject.containsKey("sysaddint")) {
			model.setSysaddint(jsonObject.getInteger("sysaddint"));
		}
		if (jsonObject.containsKey("chkefileint")) {
			model.setChkefileint(jsonObject.getInteger("chkefileint"));
		}
		if (jsonObject.containsKey("projIndex")) {
			model.setProjIndex(jsonObject.getInteger("projIndex"));
		}
		if (jsonObject.containsKey("noscan")) {
			model.setNoscan(jsonObject.getInteger("noscan"));
		}
		if (jsonObject.containsKey("treeParent")) {
			model.setTreeParent(jsonObject.getInteger("treeParent"));
		}
		if (jsonObject.containsKey("treeList")) {
			model.setTreeList(jsonObject.getInteger("treeList"));
		}
		if (jsonObject.containsKey("treeDliststr")) {
			model.setTreeDliststr(jsonObject.getString("treeDliststr"));
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

	public static JSONObject toJsonObject(DmsPfile model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("efilenum", model.getEfilenum());
		if (model.getListnum() != null) {
			jsonObject.put("listnum", model.getListnum());
		}
		jsonObject.put("listId", model.getListId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("pid", model.getPid());
		jsonObject.put("projid", model.getProjid());
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
		if (model.getTopnodem() != null) {
			jsonObject.put("topnodem", model.getTopnodem());
		}
		if (model.getVid() != null) {
			jsonObject.put("vid", model.getVid());
		}
		if (model.getOldvid() != null) {
			jsonObject.put("oldvid", model.getOldvid());
		}
		if (model.getVisflag() != null) {
			jsonObject.put("visflag", model.getVisflag());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getFilingflag() != null) {
			jsonObject.put("filingflag", model.getFilingflag());
		}
		if (model.getSaveflag() != null) {
			jsonObject.put("saveflag", model.getSaveflag());
		}
		if (model.getOpenflag() != null) {
			jsonObject.put("openflag", model.getOpenflag());
		}
		if (model.getCheckupflag() != null) {
			jsonObject.put("checkupflag", model.getCheckupflag());
		}
		if (model.getFinishflag() != null) {
			jsonObject.put("finishflag", model.getFinishflag());
		}
		if (model.getFromID() != null) {
			jsonObject.put("fromID", model.getFromID());
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
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
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
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		jsonObject.put("page", model.getPage());
		if (model.getFiletype() != null) {
			jsonObject.put("filetype", model.getFiletype());
		}
		if (model.getFontsnum() != null) {
			jsonObject.put("fontsnum", model.getFontsnum());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getCompany() != null) {
			jsonObject.put("company", model.getCompany());
		}
		jsonObject.put("year", model.getYear());
		if (model.getFileatt() != null) {
			jsonObject.put("fileatt", model.getFileatt());
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
		if (model.getEfile() != null) {
			jsonObject.put("efile", model.getEfile());
		}
		if (model.getFtime() != null) {
			jsonObject.put("ftime", DateUtils.getDate(model.getFtime()));
			jsonObject.put("ftime_date", DateUtils.getDate(model.getFtime()));
			jsonObject.put("ftime_datetime",
					DateUtils.getDateTime(model.getFtime()));
		}
		if (model.getTotalnum() != null) {
			jsonObject.put("totalnum", model.getTotalnum());
		}
		if (model.getInputman() != null) {
			jsonObject.put("inputman", model.getInputman());
		}
		if (model.getEtime() != null) {
			jsonObject.put("etime", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_date", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_datetime",
					DateUtils.getDateTime(model.getEtime()));
		}
		if (model.getDotnum() != null) {
			jsonObject.put("dotnum", model.getDotnum());
		}
		if (model.getPicnum() != null) {
			jsonObject.put("picnum", model.getPicnum());
		}
		if (model.getRecnum() != null) {
			jsonObject.put("recnum", model.getRecnum());
		}
		jsonObject.put("total", model.getTotal());
		if (model.getPagetype() != null) {
			jsonObject.put("pagetype", model.getPagetype());
		}
		if (model.getIscom() != null) {
			jsonObject.put("iscom", model.getIscom());
		}
		if (model.getIslocate() != null) {
			jsonObject.put("islocate", model.getIslocate());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		if (model.getWcompanyID() != null) {
			jsonObject.put("wcompanyID", model.getWcompanyID());
		}
		if (model.getSendflag() != null) {
			jsonObject.put("sendflag", model.getSendflag());
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
		if (model.getJnum() != null) {
			jsonObject.put("jnum", model.getJnum());
		}
		if (model.getJbnum() != null) {
			jsonObject.put("jbnum", model.getJbnum());
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
		if (model.getCtimeEnd() != null) {
			jsonObject.put("ctimeEnd", DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_date",
					DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_datetime",
					DateUtils.getDateTime(model.getCtimeEnd()));
		}
		jsonObject.put("sysListno", model.getSysListno());
		jsonObject.put("sysaddint", model.getSysaddint());
		jsonObject.put("chkefileint", model.getChkefileint());
		jsonObject.put("projIndex", model.getProjIndex());
		jsonObject.put("noscan", model.getNoscan());
		jsonObject.put("treeParent", model.getTreeParent());
		jsonObject.put("treeList", model.getTreeList());
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(DmsPfile model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("efilenum", model.getEfilenum());
		if (model.getListnum() != null) {
			jsonObject.put("listnum", model.getListnum());
		}
		jsonObject.put("listId", model.getListId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("pid", model.getPid());
		jsonObject.put("projid", model.getProjid());
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
		if (model.getTopnodem() != null) {
			jsonObject.put("topnodem", model.getTopnodem());
		}
		if (model.getVid() != null) {
			jsonObject.put("vid", model.getVid());
		}
		if (model.getOldvid() != null) {
			jsonObject.put("oldvid", model.getOldvid());
		}
		if (model.getVisflag() != null) {
			jsonObject.put("visflag", model.getVisflag());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getFilingflag() != null) {
			jsonObject.put("filingflag", model.getFilingflag());
		}
		if (model.getSaveflag() != null) {
			jsonObject.put("saveflag", model.getSaveflag());
		}
		if (model.getOpenflag() != null) {
			jsonObject.put("openflag", model.getOpenflag());
		}
		if (model.getCheckupflag() != null) {
			jsonObject.put("checkupflag", model.getCheckupflag());
		}
		if (model.getFinishflag() != null) {
			jsonObject.put("finishflag", model.getFinishflag());
		}
		if (model.getFromID() != null) {
			jsonObject.put("fromID", model.getFromID());
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
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getThematic() != null) {
			jsonObject.put("thematic", model.getThematic());
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
		if (model.getSlevel() != null) {
			jsonObject.put("slevel", model.getSlevel());
		}
		jsonObject.put("page", model.getPage());
		if (model.getFiletype() != null) {
			jsonObject.put("filetype", model.getFiletype());
		}
		if (model.getFontsnum() != null) {
			jsonObject.put("fontsnum", model.getFontsnum());
		}
		if (model.getSavetime() != null) {
			jsonObject.put("savetime", model.getSavetime());
		}
		if (model.getCompany() != null) {
			jsonObject.put("company", model.getCompany());
		}
		jsonObject.put("year", model.getYear());
		if (model.getFileatt() != null) {
			jsonObject.put("fileatt", model.getFileatt());
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
		if (model.getEfile() != null) {
			jsonObject.put("efile", model.getEfile());
		}
		if (model.getFtime() != null) {
			jsonObject.put("ftime", DateUtils.getDate(model.getFtime()));
			jsonObject.put("ftime_date", DateUtils.getDate(model.getFtime()));
			jsonObject.put("ftime_datetime",
					DateUtils.getDateTime(model.getFtime()));
		}
		if (model.getTotalnum() != null) {
			jsonObject.put("totalnum", model.getTotalnum());
		}
		if (model.getInputman() != null) {
			jsonObject.put("inputman", model.getInputman());
		}
		if (model.getEtime() != null) {
			jsonObject.put("etime", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_date", DateUtils.getDate(model.getEtime()));
			jsonObject.put("etime_datetime",
					DateUtils.getDateTime(model.getEtime()));
		}
		if (model.getDotnum() != null) {
			jsonObject.put("dotnum", model.getDotnum());
		}
		if (model.getPicnum() != null) {
			jsonObject.put("picnum", model.getPicnum());
		}
		if (model.getRecnum() != null) {
			jsonObject.put("recnum", model.getRecnum());
		}
		jsonObject.put("total", model.getTotal());
		if (model.getPagetype() != null) {
			jsonObject.put("pagetype", model.getPagetype());
		}
		if (model.getIscom() != null) {
			jsonObject.put("iscom", model.getIscom());
		}
		if (model.getIslocate() != null) {
			jsonObject.put("islocate", model.getIslocate());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		if (model.getWcompanyID() != null) {
			jsonObject.put("wcompanyID", model.getWcompanyID());
		}
		if (model.getSendflag() != null) {
			jsonObject.put("sendflag", model.getSendflag());
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
		if (model.getJnum() != null) {
			jsonObject.put("jnum", model.getJnum());
		}
		if (model.getJbnum() != null) {
			jsonObject.put("jbnum", model.getJbnum());
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
		if (model.getCtimeEnd() != null) {
			jsonObject.put("ctimeEnd", DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_date",
					DateUtils.getDate(model.getCtimeEnd()));
			jsonObject.put("ctimeEnd_datetime",
					DateUtils.getDateTime(model.getCtimeEnd()));
		}
		jsonObject.put("sysListno", model.getSysListno());
		jsonObject.put("sysaddint", model.getSysaddint());
		jsonObject.put("chkefileint", model.getChkefileint());
		jsonObject.put("projIndex", model.getProjIndex());
		jsonObject.put("noscan", model.getNoscan());
		jsonObject.put("treeParent", model.getTreeParent());
		jsonObject.put("treeList", model.getTreeList());
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		if (model.getChoosePublishFlag() != null) {
			jsonObject.put("choosePublishFlag", model.getChoosePublishFlag());
		}
		jsonObject.put("choosePublishTime", model.getChoosePublishTime());
		jsonObject.put("publishdiskid", model.getPublishdiskid());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<DmsPfile> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (DmsPfile model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<DmsPfile> arrayToList(JSONArray array) {
		java.util.List<DmsPfile> list = new java.util.ArrayList<DmsPfile>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			DmsPfile model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private DmsPfileJsonFactory() {

	}

}
