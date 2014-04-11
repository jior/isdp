package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.TreewbsNameJsonFactory;

@Entity
@Table(name = "s_treewbs_name")
public class TreewbsName implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * wbsindex
	 */
	@Column(name = "wbsindex")
	protected int wbsindex;

	public TreewbsName() {

	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getWbsindex() {
		return this.wbsindex;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setWbsindex(int wbsindex) {
		this.wbsindex = wbsindex;
	}

	public TreewbsName jsonToObject(JSONObject jsonObject) {
		return TreewbsNameJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreewbsNameJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreewbsNameJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
