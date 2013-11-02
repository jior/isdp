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
import com.glaf.isdp.util.TreewbsTabJsonFactory;

@Entity
@Table(name = "s_treewbs_tabs")
public class TreewbsTab implements Serializable, JSONable {
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
	 * Tab_index
	 */
	@Column(name = "tab_index")
	protected int tabIndex;

	/**
	 * name
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * oname
	 */
	@Column(name = "oname", length = 200)
	protected String oname;

	public TreewbsTab() {

	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getName() {
		return this.name;
	}

	public String getOname() {
		return this.oname;
	}

	public int getTabIndex() {
		return this.tabIndex;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public void setTabIndex(int tabIndex) {
		this.tabIndex = tabIndex;
	}

	public TreewbsTab jsonToObject(JSONObject jsonObject) {
		return TreewbsTabJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreewbsTabJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreewbsTabJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
