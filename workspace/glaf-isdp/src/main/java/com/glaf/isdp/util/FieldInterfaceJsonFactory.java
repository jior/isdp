package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.FieldInterface;

public class FieldInterfaceJsonFactory {

	public static FieldInterface jsonToObject(JSONObject jsonObject) {
		FieldInterface model = new FieldInterface();
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
		if (jsonObject.containsKey("isallwidth")) {
			model.setIsallwidth(jsonObject.getString("isallwidth"));
		}
		if (jsonObject.containsKey("istname")) {
			model.setIstname(jsonObject.getString("istname"));
		}
		if (jsonObject.containsKey("importType")) {
			model.setImportType(jsonObject.getInteger("importType"));
		}
		if (jsonObject.containsKey("datapoint")) {
			model.setDatapoint(jsonObject.getInteger("datapoint"));
		}

		return model;
	}

	public static JSONObject toJsonObject(FieldInterface model) {
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
		if (model.getIsallwidth() != null) {
			jsonObject.put("isallwidth", model.getIsallwidth());
		}
		if (model.getIstname() != null) {
			jsonObject.put("istname", model.getIstname());
		}
		jsonObject.put("importType", model.getImportType());
		jsonObject.put("datapoint", model.getDatapoint());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(FieldInterface model) {
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
		if (model.getIsallwidth() != null) {
			jsonObject.put("isallwidth", model.getIsallwidth());
		}
		if (model.getIstname() != null) {
			jsonObject.put("istname", model.getIstname());
		}
		jsonObject.put("importType", model.getImportType());
		jsonObject.put("datapoint", model.getDatapoint());
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<FieldInterface> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (FieldInterface model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<FieldInterface> arrayToList(JSONArray array) {
		java.util.List<FieldInterface> list = new java.util.ArrayList<FieldInterface>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			FieldInterface model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private FieldInterfaceJsonFactory() {

	}

}
