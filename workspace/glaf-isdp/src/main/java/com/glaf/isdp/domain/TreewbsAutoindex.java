package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.TreewbsAutoindexJsonFactory;

@Entity
@Table(name = "s_treewbs_autoindex")
public class TreewbsAutoindex implements Serializable, JSONable {
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
	 * autoindex
	 */
	@Column(name = "autoindex")
	protected int autoindex;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	/**
	 * index_rule
	 */
	@Column(name = "index_rule")
	protected int indexRule;

	public TreewbsAutoindex() {

	}

	public int getAutoindex() {
		return this.autoindex;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIndexRule() {
		return this.indexRule;
	}

	public int getInttype() {
		return this.inttype;
	}

	public void setAutoindex(int autoindex) {
		this.autoindex = autoindex;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexRule(int indexRule) {
		this.indexRule = indexRule;
	}

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public TreewbsAutoindex jsonToObject(JSONObject jsonObject) {
		return TreewbsAutoindexJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreewbsAutoindexJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreewbsAutoindexJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
