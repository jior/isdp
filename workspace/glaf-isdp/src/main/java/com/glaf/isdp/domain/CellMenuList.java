package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellMenuListJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "cell_setmymenulst")
public class CellMenuList implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * indexId
	 */
	@Column(name = "index_id")
	protected Integer indexId;

	public CellMenuList() {

	}

	public String getId() {
		return this.id;
	}

	public Integer getIndexId() {
		return this.indexId;
	}

	public String getTopid() {
		return this.topid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public CellMenuList jsonToObject(JSONObject jsonObject) {
		return CellMenuListJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellMenuListJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellMenuListJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
