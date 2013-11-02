package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellRepInfo;

public class CellRepInfoJsonFactory {

	public static CellRepInfo jsonToObject(JSONObject jsonObject) {
		CellRepInfo model = new CellRepInfo();
		if (jsonObject.containsKey("listId")) {
			model.setListId(jsonObject.getString("listId"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getString("indexId"));
		}
		if (jsonObject.containsKey("frmtype")) {
			model.setFrmtype(jsonObject.getString("frmtype"));
		}
		if (jsonObject.containsKey("issystem")) {
			model.setIssystem(jsonObject.getString("issystem"));
		}
		if (jsonObject.containsKey("fname")) {
			model.setFname(jsonObject.getString("fname"));
		}
		if (jsonObject.containsKey("dname")) {
			model.setDname(jsonObject.getString("dname"));
		}
		if (jsonObject.containsKey("dtype")) {
			model.setDtype(jsonObject.getString("dtype"));
		}
		if (jsonObject.containsKey("showtype")) {
			model.setShowtype(jsonObject.getString("showtype"));
		}
		if (jsonObject.containsKey("strlen")) {
			model.setStrlen(jsonObject.getInteger("strlen"));
		}
		if (jsonObject.containsKey("form")) {
			model.setForm(jsonObject.getString("form"));
		}
		if (jsonObject.containsKey("intype")) {
			model.setIntype(jsonObject.getString("intype"));
		}
		if (jsonObject.containsKey("hintID")) {
			model.setHintID(jsonObject.getString("hintID"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("ztype")) {
			model.setZtype(jsonObject.getString("ztype"));
		}
		if (jsonObject.containsKey("ismustfill")) {
			model.setIsmustfill(jsonObject.getString("ismustfill"));
		}
		if (jsonObject.containsKey("isListShow")) {
			model.setIsListShow(jsonObject.getString("isListShow"));
		}
		if (jsonObject.containsKey("listweigth")) {
			model.setListweigth(jsonObject.getInteger("listweigth"));
		}
		if (jsonObject.containsKey("panid")) {
			model.setPanid(jsonObject.getString("panid"));
		}
		if (jsonObject.containsKey("isallwidth")) {
			model.setIsallwidth(jsonObject.getString("isallwidth"));
		}
		if (jsonObject.containsKey("istname")) {
			model.setIstname(jsonObject.getString("istname"));
		}
		if (jsonObject.containsKey("filedotFileid")) {
			model.setFiledotFileid(jsonObject.getString("filedotFileid"));
		}
		if (jsonObject.containsKey("datapoint")) {
			model.setDatapoint(jsonObject.getInteger("datapoint"));
		}
		if (jsonObject.containsKey("defaultvalue")) {
			model.setDefaultvalue(jsonObject.getString("defaultvalue"));
		}
		if (jsonObject.containsKey("issubtable")) {
			model.setIssubtable(jsonObject.getString("issubtable"));
		}
		if (jsonObject.containsKey("isdataonly")) {
			model.setIsdataonly(jsonObject.getString("isdataonly"));
		}
		if (jsonObject.containsKey("checktype")) {
			model.setChecktype(jsonObject.getInteger("checktype"));
		}
		if (jsonObject.containsKey("orderid")) {
			model.setOrderid(jsonObject.getString("orderid"));
		}
		if (jsonObject.containsKey("celltype")) {
			model.setCelltype(jsonObject.getInteger("celltype"));
		}
		if (jsonObject.containsKey("ostTablename")) {
			model.setOstTablename(jsonObject.getString("ostTablename"));
		}
		if (jsonObject.containsKey("ostRow")) {
			model.setOstRow(jsonObject.getInteger("ostRow"));
		}
		if (jsonObject.containsKey("ostCol")) {
			model.setOstCol(jsonObject.getInteger("ostCol"));
		}
		if (jsonObject.containsKey("hintlist")) {
			model.setHintlist(jsonObject.getString("hintlist"));
		}
		if (jsonObject.containsKey("ostCellid")) {
			model.setOstCellid(jsonObject.getString("ostCellid"));
		}
		if (jsonObject.containsKey("olddname")) {
			model.setOlddname(jsonObject.getString("olddname"));
		}
		if (jsonObject.containsKey("ostCellname")) {
			model.setOstCellname(jsonObject.getString("ostCellname"));
		}
		if (jsonObject.containsKey("ostFormula")) {
			model.setOstFormula(jsonObject.getString("ostFormula"));
		}
		if (jsonObject.containsKey("ostColor")) {
			model.setOstColor(jsonObject.getInteger("ostColor"));
		}
		if (jsonObject.containsKey("ostSumtype")) {
			model.setOstSumtype(jsonObject.getInteger("ostSumtype"));
		}
		if (jsonObject.containsKey("dataTablename")) {
			model.setDataTablename(jsonObject.getString("dataTablename"));
		}
		if (jsonObject.containsKey("dataFieldname")) {
			model.setDataFieldname(jsonObject.getString("dataFieldname"));
		}
		if (jsonObject.containsKey("orderCon")) {
			model.setOrderCon(jsonObject.getInteger("orderCon"));
		}
		if (jsonObject.containsKey("connum")) {
			model.setConnum(jsonObject.getInteger("connum"));
		}
		if (jsonObject.containsKey("nodeIndex")) {
			model.setNodeIndex(jsonObject.getInteger("nodeIndex"));
		}
		if (jsonObject.containsKey("typeId")) {
			model.setTypeId(jsonObject.getString("typeId"));
		}
		if (jsonObject.containsKey("userindex")) {
			model.setUserindex(jsonObject.getString("userindex"));
		}
		if (jsonObject.containsKey("orderIndex")) {
			model.setOrderIndex(jsonObject.getInteger("orderIndex"));
		}
		if (jsonObject.containsKey("parentDname")) {
			model.setParentDname(jsonObject.getString("parentDname"));
		}
		if (jsonObject.containsKey("sysauto")) {
			model.setSysauto(jsonObject.getInteger("sysauto"));
		}
		if (jsonObject.containsKey("orderIndexF")) {
			model.setOrderIndexF(jsonObject.getInteger("orderIndexF"));
		}
		if (jsonObject.containsKey("orderidF")) {
			model.setOrderidF(jsonObject.getString("orderidF"));
		}
		if (jsonObject.containsKey("orderConF")) {
			model.setOrderConF(jsonObject.getInteger("orderConF"));
		}
		if (jsonObject.containsKey("isprintvalue")) {
			model.setIsprintvalue(jsonObject.getInteger("isprintvalue"));
		}
		if (jsonObject.containsKey("isshowvalueonlast")) {
			model.setIsshowvalueonlast(jsonObject
					.getInteger("isshowvalueonlast"));
		}
		if (jsonObject.containsKey("isBankRoundType")) {
			model.setIsBankRoundType(jsonObject.getInteger("isBankRoundType"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellRepInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("listId", model.getListId());
		jsonObject.put("_listId_", model.getListId());
		if (model.getIndexId() != null) {
			jsonObject.put("indexId", model.getIndexId());
		}
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		if (model.getIssystem() != null) {
			jsonObject.put("issystem", model.getIssystem());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getDtype() != null) {
			jsonObject.put("dtype", model.getDtype());
		}
		if (model.getShowtype() != null) {
			jsonObject.put("showtype", model.getShowtype());
		}
		jsonObject.put("strlen", model.getStrlen());
		if (model.getForm() != null) {
			jsonObject.put("form", model.getForm());
		}
		if (model.getIntype() != null) {
			jsonObject.put("intype", model.getIntype());
		}
		if (model.getHintID() != null) {
			jsonObject.put("hintID", model.getHintID());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getZtype() != null) {
			jsonObject.put("ztype", model.getZtype());
		}
		if (model.getIsmustfill() != null) {
			jsonObject.put("ismustfill", model.getIsmustfill());
		}
		if (model.getIsListShow() != null) {
			jsonObject.put("isListShow", model.getIsListShow());
		}
		jsonObject.put("listweigth", model.getListweigth());
		if (model.getPanid() != null) {
			jsonObject.put("panid", model.getPanid());
		}
		if (model.getIsallwidth() != null) {
			jsonObject.put("isallwidth", model.getIsallwidth());
		}
		if (model.getIstname() != null) {
			jsonObject.put("istname", model.getIstname());
		}
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("datapoint", model.getDatapoint());
		if (model.getDefaultvalue() != null) {
			jsonObject.put("defaultvalue", model.getDefaultvalue());
		}
		if (model.getIssubtable() != null) {
			jsonObject.put("issubtable", model.getIssubtable());
		}
		if (model.getIsdataonly() != null) {
			jsonObject.put("isdataonly", model.getIsdataonly());
		}
		jsonObject.put("checktype", model.getChecktype());
		if (model.getOrderid() != null) {
			jsonObject.put("orderid", model.getOrderid());
		}
		jsonObject.put("celltype", model.getCelltype());
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		if (model.getHintlist() != null) {
			jsonObject.put("hintlist", model.getHintlist());
		}
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getOlddname() != null) {
			jsonObject.put("olddname", model.getOlddname());
		}
		if (model.getOstCellname() != null) {
			jsonObject.put("ostCellname", model.getOstCellname());
		}
		if (model.getOstFormula() != null) {
			jsonObject.put("ostFormula", model.getOstFormula());
		}
		jsonObject.put("ostColor", model.getOstColor());
		jsonObject.put("ostSumtype", model.getOstSumtype());
		if (model.getDataTablename() != null) {
			jsonObject.put("dataTablename", model.getDataTablename());
		}
		if (model.getDataFieldname() != null) {
			jsonObject.put("dataFieldname", model.getDataFieldname());
		}
		jsonObject.put("orderCon", model.getOrderCon());
		jsonObject.put("connum", model.getConnum());
		jsonObject.put("nodeIndex", model.getNodeIndex());
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		if (model.getUserindex() != null) {
			jsonObject.put("userindex", model.getUserindex());
		}
		jsonObject.put("orderIndex", model.getOrderIndex());
		if (model.getParentDname() != null) {
			jsonObject.put("parentDname", model.getParentDname());
		}
		jsonObject.put("sysauto", model.getSysauto());
		jsonObject.put("orderIndexF", model.getOrderIndexF());
		if (model.getOrderidF() != null) {
			jsonObject.put("orderidF", model.getOrderidF());
		}
		jsonObject.put("orderConF", model.getOrderConF());
		jsonObject.put("isprintvalue", model.getIsprintvalue());
		jsonObject.put("isshowvalueonlast", model.getIsshowvalueonlast());
		jsonObject.put("isBankRoundType", model.getIsBankRoundType());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellRepInfo model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("listId", model.getListId());
		jsonObject.put("_listId_", model.getListId());
		if (model.getIndexId() != null) {
			jsonObject.put("indexId", model.getIndexId());
		}
		if (model.getFrmtype() != null) {
			jsonObject.put("frmtype", model.getFrmtype());
		}
		if (model.getIssystem() != null) {
			jsonObject.put("issystem", model.getIssystem());
		}
		if (model.getFname() != null) {
			jsonObject.put("fname", model.getFname());
		}
		if (model.getDname() != null) {
			jsonObject.put("dname", model.getDname());
		}
		if (model.getDtype() != null) {
			jsonObject.put("dtype", model.getDtype());
		}
		if (model.getShowtype() != null) {
			jsonObject.put("showtype", model.getShowtype());
		}
		jsonObject.put("strlen", model.getStrlen());
		if (model.getForm() != null) {
			jsonObject.put("form", model.getForm());
		}
		if (model.getIntype() != null) {
			jsonObject.put("intype", model.getIntype());
		}
		if (model.getHintID() != null) {
			jsonObject.put("hintID", model.getHintID());
		}
		jsonObject.put("listno", model.getListno());
		if (model.getZtype() != null) {
			jsonObject.put("ztype", model.getZtype());
		}
		if (model.getIsmustfill() != null) {
			jsonObject.put("ismustfill", model.getIsmustfill());
		}
		if (model.getIsListShow() != null) {
			jsonObject.put("isListShow", model.getIsListShow());
		}
		jsonObject.put("listweigth", model.getListweigth());
		if (model.getPanid() != null) {
			jsonObject.put("panid", model.getPanid());
		}
		if (model.getIsallwidth() != null) {
			jsonObject.put("isallwidth", model.getIsallwidth());
		}
		if (model.getIstname() != null) {
			jsonObject.put("istname", model.getIstname());
		}
		if (model.getFiledotFileid() != null) {
			jsonObject.put("filedotFileid", model.getFiledotFileid());
		}
		jsonObject.put("datapoint", model.getDatapoint());
		if (model.getDefaultvalue() != null) {
			jsonObject.put("defaultvalue", model.getDefaultvalue());
		}
		if (model.getIssubtable() != null) {
			jsonObject.put("issubtable", model.getIssubtable());
		}
		if (model.getIsdataonly() != null) {
			jsonObject.put("isdataonly", model.getIsdataonly());
		}
		jsonObject.put("checktype", model.getChecktype());
		if (model.getOrderid() != null) {
			jsonObject.put("orderid", model.getOrderid());
		}
		jsonObject.put("celltype", model.getCelltype());
		if (model.getOstTablename() != null) {
			jsonObject.put("ostTablename", model.getOstTablename());
		}
		jsonObject.put("ostRow", model.getOstRow());
		jsonObject.put("ostCol", model.getOstCol());
		if (model.getHintlist() != null) {
			jsonObject.put("hintlist", model.getHintlist());
		}
		if (model.getOstCellid() != null) {
			jsonObject.put("ostCellid", model.getOstCellid());
		}
		if (model.getOlddname() != null) {
			jsonObject.put("olddname", model.getOlddname());
		}
		if (model.getOstCellname() != null) {
			jsonObject.put("ostCellname", model.getOstCellname());
		}
		if (model.getOstFormula() != null) {
			jsonObject.put("ostFormula", model.getOstFormula());
		}
		jsonObject.put("ostColor", model.getOstColor());
		jsonObject.put("ostSumtype", model.getOstSumtype());
		if (model.getDataTablename() != null) {
			jsonObject.put("dataTablename", model.getDataTablename());
		}
		if (model.getDataFieldname() != null) {
			jsonObject.put("dataFieldname", model.getDataFieldname());
		}
		jsonObject.put("orderCon", model.getOrderCon());
		jsonObject.put("connum", model.getConnum());
		jsonObject.put("nodeIndex", model.getNodeIndex());
		if (model.getTypeId() != null) {
			jsonObject.put("typeId", model.getTypeId());
		}
		if (model.getUserindex() != null) {
			jsonObject.put("userindex", model.getUserindex());
		}
		jsonObject.put("orderIndex", model.getOrderIndex());
		if (model.getParentDname() != null) {
			jsonObject.put("parentDname", model.getParentDname());
		}
		jsonObject.put("sysauto", model.getSysauto());
		jsonObject.put("orderIndexF", model.getOrderIndexF());
		if (model.getOrderidF() != null) {
			jsonObject.put("orderidF", model.getOrderidF());
		}
		jsonObject.put("orderConF", model.getOrderConF());
		jsonObject.put("isprintvalue", model.getIsprintvalue());
		jsonObject.put("isshowvalueonlast", model.getIsshowvalueonlast());
		jsonObject.put("isBankRoundType", model.getIsBankRoundType());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellRepInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellRepInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellRepInfo> arrayToList(JSONArray array) {
		java.util.List<CellRepInfo> list = new java.util.ArrayList<CellRepInfo>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellRepInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellRepInfoJsonFactory() {

	}

}
