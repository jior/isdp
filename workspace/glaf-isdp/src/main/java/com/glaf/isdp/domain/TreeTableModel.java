package com.glaf.isdp.domain;

import java.util.*;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;

public class TreeTableModel extends BaseTree {

	private static final long serialVersionUID = 1L;

	protected String treeId;

	protected Map<String, Object> dataMap = new HashMap<String, Object>();

	public TreeTableModel() {

	}

	public JSONObject toJsonObject() {
		JSONObject jsonObject = super.toJsonObject();
		if (dataMap != null && !dataMap.isEmpty()) {
			Set<Entry<String, Object>> entrySet = dataMap.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				String name = entry.getKey();
				if (jsonObject.containsKey(name)) {
					continue;
				}
				Object value = entry.getValue();
				if (value != null) {
					if (value instanceof Date) {
						Date d = (Date) value;
						jsonObject.put(name, DateUtils.getDate(d));
					} else if (value instanceof Boolean) {
						jsonObject.put(name, (Boolean) value);
					} else if (value instanceof Integer) {
						jsonObject.put(name, (Integer) value);
					} else if (value instanceof Long) {
						jsonObject.put(name, (Long) value);
					} else if (value instanceof Double) {
						jsonObject.put(name, (Double) value);
					} else if (value instanceof Float) {
						jsonObject.put(name, (Float) value);
					} else {
						jsonObject.put(name, value.toString());
					}
				}
			}
		}
		return jsonObject;
	}

	public ObjectNode toObjectNode() {
		ObjectNode jsonObject = super.toObjectNode();
		if (dataMap != null && !dataMap.isEmpty()) {
			Set<Entry<String, Object>> entrySet = dataMap.entrySet();
			for (Entry<String, Object> entry : entrySet) {
				String name = entry.getKey();
				if (jsonObject.has(name)) {
					continue;
				}
				Object value = entry.getValue();
				if (value != null) {
					if (value instanceof Date) {
						Date d = (Date) value;
						jsonObject.put(name, DateUtils.getDate(d));
					} else if (value instanceof Boolean) {
						jsonObject.put(name, (Boolean) value);
					} else if (value instanceof Integer) {
						jsonObject.put(name, (Integer) value);
					} else if (value instanceof Long) {
						jsonObject.put(name, (Long) value);
					} else if (value instanceof Double) {
						jsonObject.put(name, (Double) value);
					} else if (value instanceof Float) {
						jsonObject.put(name, (Float) value);
					} else {
						jsonObject.put(name, value.toString());
					}
				}
			}
		}
		return jsonObject;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public String getTreeId() {
		return treeId;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

}
