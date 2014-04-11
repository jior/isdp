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
import com.glaf.isdp.util.TreeProjectParJsonFactory;

@Entity
@Table(name = "treeproj_par")
public class TreeProjectPar implements Serializable, JSONable {
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
	 * treeproj_par_user1
	 */
	@Column(name = "treeproj_par_user1")
	protected int treeprojParUser1;

	public TreeProjectPar() {

	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getTreeProjectParUser1() {
		return this.treeprojParUser1;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setTreeProjectParUser1(int treeprojParUser1) {
		this.treeprojParUser1 = treeprojParUser1;
	}

	public TreeProjectPar jsonToObject(JSONObject jsonObject) {
		return TreeProjectParJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreeProjectParJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreeProjectParJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
