package com.glaf.isdp.domain;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class BaseTree implements java.io.Serializable, ITree {
	private static final long serialVersionUID = 1L;
	protected String id;
	protected int indexId;
	protected int parentId;
	protected String indexName;
	protected int level;
	protected int listno;
	protected boolean checked;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseTree other = (BaseTree) obj;
		if (indexId != other.indexId)
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public int getIndexId() {
		return indexId;
	}

	public String getIndexName() {
		return indexName;
	}

	public int getLevel() {
		return level;
	}

	public int getListno() {
		return listno;
	}

	public int getParentId() {
		return parentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + indexId;
		return result;
	}

	public boolean isChecked() {
		return checked;
	}

	public ITree jsonToObject(JSONObject jsonObject) {
		ITree model = new BaseTree();
		model.setChecked(jsonObject.getBoolean("checked"));
		model.setId(jsonObject.getString("id"));
		model.setIndexId(jsonObject.getInteger("indexId"));
		model.setIndexName(jsonObject.getString("indexName"));
		model.setLevel(jsonObject.getInteger("level"));
		model.setListno(jsonObject.getInteger("listno"));
		model.setParentId(jsonObject.getInteger("parentId"));
		return model;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public JSONObject toJsonObject() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", indexId);
		jsonObject.put("indexId", indexId);
		jsonObject.put("pId", parentId);
		jsonObject.put("parentId", parentId);
		if (id != null) {
			jsonObject.put("_id_", id);
			jsonObject.put("_oid_", id);
		}
		jsonObject.put("name", indexName);
		jsonObject.put("text", indexName);
		jsonObject.put("indexName", indexName);
		jsonObject.put("level", level);
		jsonObject.put("nlevel", level);
		jsonObject.put("listno", listno);
		jsonObject.put("checked", checked);
		return jsonObject;
	}

	public ObjectNode toObjectNode() {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", indexId);
		jsonObject.put("indexId", indexId);
		jsonObject.put("pId", parentId);
		jsonObject.put("parentId", parentId);
		if (id != null) {
			jsonObject.put("_id_", id);
			jsonObject.put("_oid_", id);
		}
		jsonObject.put("name", indexName);
		jsonObject.put("text", indexName);
		jsonObject.put("indexName", indexName);
		jsonObject.put("level", level);
		jsonObject.put("nlevel", level);
		jsonObject.put("listno", listno);
		jsonObject.put("checked", checked);
		return jsonObject;
	}

}
