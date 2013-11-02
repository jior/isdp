package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.CellCriterion;

public class CellCriterionJsonFactory {

	public static CellCriterion jsonToObject(JSONObject jsonObject) {
		CellCriterion model = new CellCriterion();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("typeint")) {
			model.setTypeint(jsonObject.getInteger("typeint"));
		}
		if (jsonObject.containsKey("type")) {
			model.setType(jsonObject.getString("type"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("unit")) {
			model.setUnit(jsonObject.getString("unit"));
		}
		if (jsonObject.containsKey("alltext")) {
			model.setAlltext(jsonObject.getString("alltext"));
		}
		if (jsonObject.containsKey("chkway")) {
			model.setChkway(jsonObject.getString("chkway"));
		}
		if (jsonObject.containsKey("scale")) {
			model.setScale(jsonObject.getInteger("scale"));
		}
		if (jsonObject.containsKey("usetypeint")) {
			model.setUsetypeint(jsonObject.getInteger("usetypeint"));
		}
		if (jsonObject.containsKey("checktype")) {
			model.setChecktype(jsonObject.getInteger("checktype"));
		}
		if (jsonObject.containsKey("keytext")) {
			model.setKeytext(jsonObject.getString("keytext"));
		}
		if (jsonObject.containsKey("minallow")) {
			model.setMinallow(jsonObject.getString("minallow"));
		}
		if (jsonObject.containsKey("minallowS")) {
			model.setMinallowS(jsonObject.getString("minallowS"));
		}
		if (jsonObject.containsKey("maxallow")) {
			model.setMaxallow(jsonObject.getString("maxallow"));
		}
		if (jsonObject.containsKey("maxallowS")) {
			model.setMaxallowS(jsonObject.getString("maxallowS"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("conint")) {
			model.setConint(jsonObject.getInteger("conint"));
		}
		if (jsonObject.containsKey("conmin")) {
			model.setConmin(jsonObject.getString("conmin"));
		}
		if (jsonObject.containsKey("conminS")) {
			model.setConminS(jsonObject.getString("conminS"));
		}
		if (jsonObject.containsKey("conmax")) {
			model.setConmax(jsonObject.getString("conmax"));
		}
		if (jsonObject.containsKey("conmaxS")) {
			model.setConmaxS(jsonObject.getString("conmaxS"));
		}
		if (jsonObject.containsKey("constr")) {
			model.setConstr(jsonObject.getString("constr"));
		}
		if (jsonObject.containsKey("usingstr")) {
			model.setUsingstr(jsonObject.getString("usingstr"));
		}
		if (jsonObject.containsKey("subnum")) {
			model.setSubnum(jsonObject.getString("subnum"));
		}
		if (jsonObject.containsKey("chkvalueint")) {
			model.setChkvalueint(jsonObject.getInteger("chkvalueint"));
		}
		if (jsonObject.containsKey("strposc")) {
			model.setStrposc(jsonObject.getString("strposc"));
		}
		if (jsonObject.containsKey("strposc2")) {
			model.setStrposc2(jsonObject.getString("strposc2"));
		}
		if (jsonObject.containsKey("strpos")) {
			model.setStrpos(jsonObject.getString("strpos"));
		}
		if (jsonObject.containsKey("strpos2")) {
			model.setStrpos2(jsonObject.getString("strpos2"));
		}
		if (jsonObject.containsKey("chkfield")) {
			model.setChkfield(jsonObject.getString("chkfield"));
		}
		if (jsonObject.containsKey("chkunit")) {
			model.setChkunit(jsonObject.getString("chkunit"));
		}
		if (jsonObject.containsKey("chkfieldId")) {
			model.setChkfieldId(jsonObject.getString("chkfieldId"));
		}
		if (jsonObject.containsKey("chkformual")) {
			model.setChkformual(jsonObject.getString("chkformual"));
		}
		if (jsonObject.containsKey("chkformualD")) {
			model.setChkformualD(jsonObject.getString("chkformualD"));
		}
		if (jsonObject.containsKey("toolsname")) {
			model.setToolsname(jsonObject.getString("toolsname"));
		}
		if (jsonObject.containsKey("constr1")) {
			model.setConstr1(jsonObject.getString("constr1"));
		}
		if (jsonObject.containsKey("constr2")) {
			model.setConstr2(jsonObject.getString("constr2"));
		}
		if (jsonObject.containsKey("ichecknumLess")) {
			model.setIchecknumLess(jsonObject.getString("ichecknumLess"));
		}
		if (jsonObject.containsKey("clevel")) {
			model.setClevel(jsonObject.getString("clevel"));
		}

		return model;
	}

	public static JSONObject toJsonObject(CellCriterion model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("typeint", model.getTypeint());
		if (model.getType() != null) {
			jsonObject.put("type", model.getType());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getUnit() != null) {
			jsonObject.put("unit", model.getUnit());
		}
		if (model.getAlltext() != null) {
			jsonObject.put("alltext", model.getAlltext());
		}
		if (model.getChkway() != null) {
			jsonObject.put("chkway", model.getChkway());
		}
		jsonObject.put("scale", model.getScale());
		jsonObject.put("usetypeint", model.getUsetypeint());
		jsonObject.put("checktype", model.getChecktype());
		if (model.getKeytext() != null) {
			jsonObject.put("keytext", model.getKeytext());
		}
		if (model.getMinallow() != null) {
			jsonObject.put("minallow", model.getMinallow());
		}
		if (model.getMinallowS() != null) {
			jsonObject.put("minallowS", model.getMinallowS());
		}
		if (model.getMaxallow() != null) {
			jsonObject.put("maxallow", model.getMaxallow());
		}
		if (model.getMaxallowS() != null) {
			jsonObject.put("maxallowS", model.getMaxallowS());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("conint", model.getConint());
		if (model.getConmin() != null) {
			jsonObject.put("conmin", model.getConmin());
		}
		if (model.getConminS() != null) {
			jsonObject.put("conminS", model.getConminS());
		}
		if (model.getConmax() != null) {
			jsonObject.put("conmax", model.getConmax());
		}
		if (model.getConmaxS() != null) {
			jsonObject.put("conmaxS", model.getConmaxS());
		}
		if (model.getConstr() != null) {
			jsonObject.put("constr", model.getConstr());
		}
		if (model.getUsingstr() != null) {
			jsonObject.put("usingstr", model.getUsingstr());
		}
		if (model.getSubnum() != null) {
			jsonObject.put("subnum", model.getSubnum());
		}
		jsonObject.put("chkvalueint", model.getChkvalueint());
		if (model.getStrposc() != null) {
			jsonObject.put("strposc", model.getStrposc());
		}
		if (model.getStrposc2() != null) {
			jsonObject.put("strposc2", model.getStrposc2());
		}
		if (model.getStrpos() != null) {
			jsonObject.put("strpos", model.getStrpos());
		}
		if (model.getStrpos2() != null) {
			jsonObject.put("strpos2", model.getStrpos2());
		}
		if (model.getChkfield() != null) {
			jsonObject.put("chkfield", model.getChkfield());
		}
		if (model.getChkunit() != null) {
			jsonObject.put("chkunit", model.getChkunit());
		}
		if (model.getChkfieldId() != null) {
			jsonObject.put("chkfieldId", model.getChkfieldId());
		}
		if (model.getChkformual() != null) {
			jsonObject.put("chkformual", model.getChkformual());
		}
		if (model.getChkformualD() != null) {
			jsonObject.put("chkformualD", model.getChkformualD());
		}
		if (model.getToolsname() != null) {
			jsonObject.put("toolsname", model.getToolsname());
		}
		if (model.getConstr1() != null) {
			jsonObject.put("constr1", model.getConstr1());
		}
		if (model.getConstr2() != null) {
			jsonObject.put("constr2", model.getConstr2());
		}
		if (model.getIchecknumLess() != null) {
			jsonObject.put("ichecknumLess", model.getIchecknumLess());
		}
		if (model.getClevel() != null) {
			jsonObject.put("clevel", model.getClevel());
		}

		return jsonObject;
	}

	public static ObjectNode toObjectNode(CellCriterion model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("typeint", model.getTypeint());
		if (model.getType() != null) {
			jsonObject.put("type", model.getType());
		}
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getUnit() != null) {
			jsonObject.put("unit", model.getUnit());
		}
		if (model.getAlltext() != null) {
			jsonObject.put("alltext", model.getAlltext());
		}
		if (model.getChkway() != null) {
			jsonObject.put("chkway", model.getChkway());
		}
		jsonObject.put("scale", model.getScale());
		jsonObject.put("usetypeint", model.getUsetypeint());
		jsonObject.put("checktype", model.getChecktype());
		if (model.getKeytext() != null) {
			jsonObject.put("keytext", model.getKeytext());
		}
		if (model.getMinallow() != null) {
			jsonObject.put("minallow", model.getMinallow());
		}
		if (model.getMinallowS() != null) {
			jsonObject.put("minallowS", model.getMinallowS());
		}
		if (model.getMaxallow() != null) {
			jsonObject.put("maxallow", model.getMaxallow());
		}
		if (model.getMaxallowS() != null) {
			jsonObject.put("maxallowS", model.getMaxallowS());
		}
		jsonObject.put("listno", model.getListno());
		jsonObject.put("conint", model.getConint());
		if (model.getConmin() != null) {
			jsonObject.put("conmin", model.getConmin());
		}
		if (model.getConminS() != null) {
			jsonObject.put("conminS", model.getConminS());
		}
		if (model.getConmax() != null) {
			jsonObject.put("conmax", model.getConmax());
		}
		if (model.getConmaxS() != null) {
			jsonObject.put("conmaxS", model.getConmaxS());
		}
		if (model.getConstr() != null) {
			jsonObject.put("constr", model.getConstr());
		}
		if (model.getUsingstr() != null) {
			jsonObject.put("usingstr", model.getUsingstr());
		}
		if (model.getSubnum() != null) {
			jsonObject.put("subnum", model.getSubnum());
		}
		jsonObject.put("chkvalueint", model.getChkvalueint());
		if (model.getStrposc() != null) {
			jsonObject.put("strposc", model.getStrposc());
		}
		if (model.getStrposc2() != null) {
			jsonObject.put("strposc2", model.getStrposc2());
		}
		if (model.getStrpos() != null) {
			jsonObject.put("strpos", model.getStrpos());
		}
		if (model.getStrpos2() != null) {
			jsonObject.put("strpos2", model.getStrpos2());
		}
		if (model.getChkfield() != null) {
			jsonObject.put("chkfield", model.getChkfield());
		}
		if (model.getChkunit() != null) {
			jsonObject.put("chkunit", model.getChkunit());
		}
		if (model.getChkfieldId() != null) {
			jsonObject.put("chkfieldId", model.getChkfieldId());
		}
		if (model.getChkformual() != null) {
			jsonObject.put("chkformual", model.getChkformual());
		}
		if (model.getChkformualD() != null) {
			jsonObject.put("chkformualD", model.getChkformualD());
		}
		if (model.getToolsname() != null) {
			jsonObject.put("toolsname", model.getToolsname());
		}
		if (model.getConstr1() != null) {
			jsonObject.put("constr1", model.getConstr1());
		}
		if (model.getConstr2() != null) {
			jsonObject.put("constr2", model.getConstr2());
		}
		if (model.getIchecknumLess() != null) {
			jsonObject.put("ichecknumLess", model.getIchecknumLess());
		}
		if (model.getClevel() != null) {
			jsonObject.put("clevel", model.getClevel());
		}

		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<CellCriterion> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (CellCriterion model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<CellCriterion> arrayToList(JSONArray array) {
		java.util.List<CellCriterion> list = new java.util.ArrayList<CellCriterion>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			CellCriterion model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private CellCriterionJsonFactory() {

	}

}
