package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.isdp.domain.IsdpTreepInfo;

public class TreepInfoJsonFactory {

	public static IsdpTreepInfo jsonToObject(JSONObject jsonObject) {
		IsdpTreepInfo model = new IsdpTreepInfo();
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("topId")) {
			model.setTopId(jsonObject.getInteger("topId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("nodetype")) {
			model.setNodetype(jsonObject.getString("nodetype"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getInteger("fromid"));
		}
		if (jsonObject.containsKey("partId")) {
			model.setPartId(jsonObject.getInteger("partId"));
		}
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getInteger("filenum"));
		}
		if (jsonObject.containsKey("filenum0")) {
			model.setFilenum0(jsonObject.getInteger("filenum0"));
		}
		if (jsonObject.containsKey("filenum1")) {
			model.setFilenum1(jsonObject.getInteger("filenum1"));
		}
		if (jsonObject.containsKey("filenum2")) {
			model.setFilenum2(jsonObject.getInteger("filenum2"));
		}
		if (jsonObject.containsKey("projtype")) {
			model.setProjtype(jsonObject.getString("projtype"));
		}
		if (jsonObject.containsKey("cid")) {
			model.setCid(jsonObject.getString("cid"));
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
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("outflag")) {
			model.setOutflag(jsonObject.getString("outflag"));
		}
		if (jsonObject.containsKey("inflag")) {
			model.setInflag(jsonObject.getString("inflag"));
		}
		if (jsonObject.containsKey("password")) {
			model.setPassword(jsonObject.getString("password"));
		}
		if (jsonObject.containsKey("listnum")) {
			model.setListnum(jsonObject.getString("listnum"));
		}
		if (jsonObject.containsKey("wcompany")) {
			model.setWcompany(jsonObject.getString("wcompany"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("plevel")) {
			model.setPlevel(jsonObject.getInteger("plevel"));
		}
		if (jsonObject.containsKey("usernmu")) {
			model.setUsernmu(jsonObject.getString("usernmu"));
		}
		if (jsonObject.containsKey("indexIdOld")) {
			model.setIndexIdOld(jsonObject.getInteger("indexIdOld"));
		}
		if (jsonObject.containsKey("pindexId")) {
			model.setPindexId(jsonObject.getInteger("pindexId"));
		}
		if (jsonObject.containsKey("finishint")) {
			model.setFinishint(jsonObject.getInteger("finishint"));
		}
		if (jsonObject.containsKey("typeTablename")) {
			model.setTypeTablename(jsonObject.getString("typeTablename"));
		}
		if (jsonObject.containsKey("treeDliststr")) {
			model.setTreeDliststr(jsonObject.getString("treeDliststr"));
		}
		if (jsonObject.containsKey("pfilesIndex")) {
			model.setPfilesIndex(jsonObject.getInteger("pfilesIndex"));
		}
		if (jsonObject.containsKey("bdate")) {
			model.setBdate(jsonObject.getDate("bdate"));
		}
		if (jsonObject.containsKey("edate")) {
			model.setEdate(jsonObject.getDate("edate"));
		}
		if (jsonObject.containsKey("wbsindex")) {
			model.setWbsindex(jsonObject.getInteger("wbsindex"));
		}
		if (jsonObject.containsKey("bdateS")) {
			model.setBdateS(jsonObject.getDate("bdateS"));
		}
		if (jsonObject.containsKey("edateS")) {
			model.setEdateS(jsonObject.getDate("edateS"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}
		if (jsonObject.containsKey("cell1")) {
			model.setCell1(jsonObject.getInteger("cell1"));
		}
		if (jsonObject.containsKey("cell2")) {
			model.setCell2(jsonObject.getInteger("cell2"));
		}
		if (jsonObject.containsKey("cell3")) {
			model.setCell3(jsonObject.getInteger("cell3"));
		}
		if (jsonObject.containsKey("strfileLocate")) {
			model.setStrfileLocate(jsonObject.getString("strfileLocate"));
		}
		if (jsonObject.containsKey("intpfile1")) {
			model.setIntpfile1(jsonObject.getInteger("intpfile1"));
		}
		if (jsonObject.containsKey("intpfile2")) {
			model.setIntpfile2(jsonObject.getInteger("intpfile2"));
		}
		if (jsonObject.containsKey("intpfile3")) {
			model.setIntpfile3(jsonObject.getInteger("intpfile3"));
		}
		if (jsonObject.containsKey("intcellfinish")) {
			model.setIntcellfinish(jsonObject.getInteger("intcellfinish"));
		}
		if (jsonObject.containsKey("sysId")) {
			model.setSysId(jsonObject.getString("sysId"));
		}
		if (jsonObject.containsKey("indexIn")) {
			model.setIndexIn(jsonObject.getInteger("indexIn"));
		}
		if (jsonObject.containsKey("strButtonStar")) {
			model.setStrButtonStar(jsonObject.getString("strButtonStar"));
		}
		if (jsonObject.containsKey("intisuse")) {
			model.setIntisuse(jsonObject.getInteger("intisuse"));
		}
		if (jsonObject.containsKey("wbsindexIn")) {
			model.setWbsindexIn(jsonObject.getInteger("wbsindexIn"));
		}

		return model;
	}

	public static JSONObject toJsonObject(IsdpTreepInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		jsonObject.put("topId", model.getTopId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("partId", model.getPartId());
		jsonObject.put("showid", model.getShowid());
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("filenum", model.getFilenum());
		jsonObject.put("filenum0", model.getFilenum0());
		jsonObject.put("filenum1", model.getFilenum1());
		jsonObject.put("filenum2", model.getFilenum2());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		if (model.getCid() != null) {
			jsonObject.put("cid", model.getCid());
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
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getOutflag() != null) {
			jsonObject.put("outflag", model.getOutflag());
		}
		if (model.getInflag() != null) {
			jsonObject.put("inflag", model.getInflag());
		}
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		if (model.getListnum() != null) {
			jsonObject.put("listnum", model.getListnum());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("plevel", model.getPlevel());
		if (model.getUsernmu() != null) {
			jsonObject.put("usernmu", model.getUsernmu());
		}
		jsonObject.put("indexIdOld", model.getIndexIdOld());
		jsonObject.put("pindexId", model.getPindexId());
		jsonObject.put("finishint", model.getFinishint());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		jsonObject.put("pfilesIndex", model.getPfilesIndex());
		if (model.getBdate() != null) {
			jsonObject.put("bdate", DateUtils.getDate(model.getBdate()));
			jsonObject.put("bdate_date", DateUtils.getDate(model.getBdate()));
			jsonObject.put("bdate_datetime",
					DateUtils.getDateTime(model.getBdate()));
		}
		if (model.getEdate() != null) {
			jsonObject.put("edate", DateUtils.getDate(model.getEdate()));
			jsonObject.put("edate_date", DateUtils.getDate(model.getEdate()));
			jsonObject.put("edate_datetime",
					DateUtils.getDateTime(model.getEdate()));
		}
		jsonObject.put("wbsindex", model.getWbsindex());
		if (model.getBdateS() != null) {
			jsonObject.put("bdateS", DateUtils.getDate(model.getBdateS()));
			jsonObject.put("bdateS_date", DateUtils.getDate(model.getBdateS()));
			jsonObject.put("bdateS_datetime",
					DateUtils.getDateTime(model.getBdateS()));
		}
		if (model.getEdateS() != null) {
			jsonObject.put("edateS", DateUtils.getDate(model.getEdateS()));
			jsonObject.put("edateS_date", DateUtils.getDate(model.getEdateS()));
			jsonObject.put("edateS_datetime",
					DateUtils.getDateTime(model.getEdateS()));
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		jsonObject.put("cell1", model.getCell1());
		jsonObject.put("cell2", model.getCell2());
		jsonObject.put("cell3", model.getCell3());
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		jsonObject.put("intpfile1", model.getIntpfile1());
		jsonObject.put("intpfile2", model.getIntpfile2());
		jsonObject.put("intpfile3", model.getIntpfile3());
		jsonObject.put("intcellfinish", model.getIntcellfinish());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		jsonObject.put("indexIn", model.getIndexIn());
		if (model.getStrButtonStar() != null) {
			jsonObject.put("strButtonStar", model.getStrButtonStar());
		}
		jsonObject.put("intisuse", model.getIntisuse());
		jsonObject.put("wbsindexIn", model.getWbsindexIn());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(IsdpTreepInfo model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("_indexId_", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getId() != null) {
			jsonObject.put("id", model.getId());
			jsonObject.put("_id_", model.getId());
			jsonObject.put("_oid_", model.getId());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		jsonObject.put("topId", model.getTopId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("partId", model.getPartId());
		jsonObject.put("showid", model.getShowid());
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("filenum", model.getFilenum());
		jsonObject.put("filenum0", model.getFilenum0());
		jsonObject.put("filenum1", model.getFilenum1());
		jsonObject.put("filenum2", model.getFilenum2());
		if (model.getProjtype() != null) {
			jsonObject.put("projtype", model.getProjtype());
		}
		if (model.getCid() != null) {
			jsonObject.put("cid", model.getCid());
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
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getOutflag() != null) {
			jsonObject.put("outflag", model.getOutflag());
		}
		if (model.getInflag() != null) {
			jsonObject.put("inflag", model.getInflag());
		}
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		if (model.getListnum() != null) {
			jsonObject.put("listnum", model.getListnum());
		}
		if (model.getWcompany() != null) {
			jsonObject.put("wcompany", model.getWcompany());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("plevel", model.getPlevel());
		if (model.getUsernmu() != null) {
			jsonObject.put("usernmu", model.getUsernmu());
		}
		jsonObject.put("indexIdOld", model.getIndexIdOld());
		jsonObject.put("pindexId", model.getPindexId());
		jsonObject.put("finishint", model.getFinishint());
		if (model.getTypeTablename() != null) {
			jsonObject.put("typeTablename", model.getTypeTablename());
		}
		if (model.getTreeDliststr() != null) {
			jsonObject.put("treeDliststr", model.getTreeDliststr());
		}
		jsonObject.put("pfilesIndex", model.getPfilesIndex());
		if (model.getBdate() != null) {
			jsonObject.put("bdate", DateUtils.getDate(model.getBdate()));
			jsonObject.put("bdate_date", DateUtils.getDate(model.getBdate()));
			jsonObject.put("bdate_datetime",
					DateUtils.getDateTime(model.getBdate()));
		}
		if (model.getEdate() != null) {
			jsonObject.put("edate", DateUtils.getDate(model.getEdate()));
			jsonObject.put("edate_date", DateUtils.getDate(model.getEdate()));
			jsonObject.put("edate_datetime",
					DateUtils.getDateTime(model.getEdate()));
		}
		jsonObject.put("wbsindex", model.getWbsindex());
		if (model.getBdateS() != null) {
			jsonObject.put("bdateS", DateUtils.getDate(model.getBdateS()));
			jsonObject.put("bdateS_date", DateUtils.getDate(model.getBdateS()));
			jsonObject.put("bdateS_datetime",
					DateUtils.getDateTime(model.getBdateS()));
		}
		if (model.getEdateS() != null) {
			jsonObject.put("edateS", DateUtils.getDate(model.getEdateS()));
			jsonObject.put("edateS_date", DateUtils.getDate(model.getEdateS()));
			jsonObject.put("edateS_datetime",
					DateUtils.getDateTime(model.getEdateS()));
		}
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		jsonObject.put("cell1", model.getCell1());
		jsonObject.put("cell2", model.getCell2());
		jsonObject.put("cell3", model.getCell3());
		if (model.getStrfileLocate() != null) {
			jsonObject.put("strfileLocate", model.getStrfileLocate());
		}
		jsonObject.put("intpfile1", model.getIntpfile1());
		jsonObject.put("intpfile2", model.getIntpfile2());
		jsonObject.put("intpfile3", model.getIntpfile3());
		jsonObject.put("intcellfinish", model.getIntcellfinish());
		if (model.getSysId() != null) {
			jsonObject.put("sysId", model.getSysId());
		}
		jsonObject.put("indexIn", model.getIndexIn());
		if (model.getStrButtonStar() != null) {
			jsonObject.put("strButtonStar", model.getStrButtonStar());
		}
		jsonObject.put("intisuse", model.getIntisuse());
		jsonObject.put("wbsindexIn", model.getWbsindexIn());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<IsdpTreepInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (IsdpTreepInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<IsdpTreepInfo> arrayToList(JSONArray array) {
		java.util.List<IsdpTreepInfo> list = new java.util.ArrayList<IsdpTreepInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			IsdpTreepInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreepInfoJsonFactory() {

	}

}
