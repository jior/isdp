package com.glaf.isdp.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.domain.TreevmainUser;

public class TreevmainUserJsonFactory {

	public static TreevmainUser jsonToObject(JSONObject jsonObject) {
		TreevmainUser model = new TreevmainUser();
		if (jsonObject.containsKey("id")) {
			model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getInteger("indexId"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getInteger("parentId"));
		}
		if (jsonObject.containsKey("indexName")) {
			model.setIndexName(jsonObject.getString("indexName"));
		}
		if (jsonObject.containsKey("nlevel")) {
			model.setNlevel(jsonObject.getInteger("nlevel"));
		}
		if (jsonObject.containsKey("num")) {
			model.setNum(jsonObject.getString("num"));
		}
		if (jsonObject.containsKey("filenum")) {
			model.setFilenum(jsonObject.getString("filenum"));
		}
		if (jsonObject.containsKey("content")) {
			model.setContent(jsonObject.getString("content"));
		}
		if (jsonObject.containsKey("vflag")) {
			model.setVflag(jsonObject.getString("vflag"));
		}
		if (jsonObject.containsKey("sindexName")) {
			model.setSindexName(jsonObject.getString("sindexName"));
		}
		if (jsonObject.containsKey("ztype")) {
			model.setZtype(jsonObject.getInteger("ztype"));
		}
		if (jsonObject.containsKey("content2")) {
			model.setContent2(jsonObject.getString("content2"));
		}
		if (jsonObject.containsKey("topnode")) {
			model.setTopnode(jsonObject.getString("topnode"));
		}
		if (jsonObject.containsKey("nodeico")) {
			model.setNodeico(jsonObject.getInteger("nodeico"));
		}
		if (jsonObject.containsKey("nodetype")) {
			model.setNodetype(jsonObject.getString("nodetype"));
		}
		if (jsonObject.containsKey("fromid")) {
			model.setFromid(jsonObject.getInteger("fromid"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getInteger("listno"));
		}
		if (jsonObject.containsKey("frmtypeindex")) {
			model.setFrmtypeindex(jsonObject.getInteger("frmtypeindex"));
		}
		if (jsonObject.containsKey("showid")) {
			model.setShowid(jsonObject.getInteger("showid"));
		}
		if (jsonObject.containsKey("showfrmid")) {
			model.setShowfrmid(jsonObject.getString("showfrmid"));
		}
		if (jsonObject.containsKey("showfrmindexId")) {
			model.setShowfrmindexId(jsonObject.getInteger("showfrmindexId"));
		}
		if (jsonObject.containsKey("dwid")) {
			model.setDwid(jsonObject.getInteger("dwid"));
		}
		if (jsonObject.containsKey("jid")) {
			model.setJid(jsonObject.getString("jid"));
		}
		if (jsonObject.containsKey("flid")) {
			model.setFlid(jsonObject.getString("flid"));
		}
		if (jsonObject.containsKey("ctypeId")) {
			model.setCtypeId(jsonObject.getString("ctypeId"));
		}

		return model;
	}

	public static JSONObject toJsonObject(TreevmainUser model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("frmtypeindex", model.getFrmtypeindex());
		jsonObject.put("showid", model.getShowid());
		if (model.getShowfrmid() != null) {
			jsonObject.put("showfrmid", model.getShowfrmid());
		}
		jsonObject.put("showfrmindexId", model.getShowfrmindexId());
		jsonObject.put("dwid", model.getDwid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getCtypeId() != null) {
			jsonObject.put("ctypeId", model.getCtypeId());
		}
		return jsonObject;
	}

	public static ObjectNode toObjectNode(TreevmainUser model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		jsonObject.put("indexId", model.getIndexId());
		jsonObject.put("parentId", model.getParentId());
		if (model.getIndexName() != null) {
			jsonObject.put("indexName", model.getIndexName());
		}
		jsonObject.put("nlevel", model.getNlevel());
		if (model.getNum() != null) {
			jsonObject.put("num", model.getNum());
		}
		if (model.getFilenum() != null) {
			jsonObject.put("filenum", model.getFilenum());
		}
		if (model.getContent() != null) {
			jsonObject.put("content", model.getContent());
		}
		if (model.getVflag() != null) {
			jsonObject.put("vflag", model.getVflag());
		}
		if (model.getSindexName() != null) {
			jsonObject.put("sindexName", model.getSindexName());
		}
		jsonObject.put("ztype", model.getZtype());
		if (model.getContent2() != null) {
			jsonObject.put("content2", model.getContent2());
		}
		if (model.getTopnode() != null) {
			jsonObject.put("topnode", model.getTopnode());
		}
		jsonObject.put("nodeico", model.getNodeico());
		if (model.getNodetype() != null) {
			jsonObject.put("nodetype", model.getNodetype());
		}
		jsonObject.put("fromid", model.getFromid());
		jsonObject.put("listno", model.getListno());
		jsonObject.put("frmtypeindex", model.getFrmtypeindex());
		jsonObject.put("showid", model.getShowid());
		if (model.getShowfrmid() != null) {
			jsonObject.put("showfrmid", model.getShowfrmid());
		}
		jsonObject.put("showfrmindexId", model.getShowfrmindexId());
		jsonObject.put("dwid", model.getDwid());
		if (model.getJid() != null) {
			jsonObject.put("jid", model.getJid());
		}
		if (model.getFlid() != null) {
			jsonObject.put("flid", model.getFlid());
		}
		if (model.getCtypeId() != null) {
			jsonObject.put("ctypeId", model.getCtypeId());
		}
		return jsonObject;
	}

	public static JSONArray listToArray(java.util.List<TreevmainUser> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (TreevmainUser model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<TreevmainUser> arrayToList(JSONArray array) {
		java.util.List<TreevmainUser> list = new java.util.ArrayList<TreevmainUser>();
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			TreevmainUser model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	private TreevmainUserJsonFactory() {

	}

}
