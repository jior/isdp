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
import com.glaf.isdp.util.TreewbsAutostartJsonFactory;

@Entity
@Table(name = "s_treewbs_autostart")
public class TreewbsAutostart implements Serializable, JSONable {
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

	/**
	 * intstartype
	 */
	@Column(name = "intstartype")
	protected int intstartype;

	/**
	 * intstardelayday
	 */
	@Column(name = "intstardelayday")
	protected int intstardelayday;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	public TreewbsAutostart() {

	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntstardelayday() {
		return this.intstardelayday;
	}

	public int getIntstartype() {
		return this.intstartype;
	}

	public int getInttype() {
		return this.inttype;
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

	public void setIntstardelayday(int intstardelayday) {
		this.intstardelayday = intstardelayday;
	}

	public void setIntstartype(int intstartype) {
		this.intstartype = intstartype;
	}

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public void setWbsindex(int wbsindex) {
		this.wbsindex = wbsindex;
	}

	public TreewbsAutostart jsonToObject(JSONObject jsonObject) {
		return TreewbsAutostartJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreewbsAutostartJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreewbsAutostartJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
