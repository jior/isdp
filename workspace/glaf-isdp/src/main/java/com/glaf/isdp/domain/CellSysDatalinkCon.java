package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellSysDatalinkConJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "cell_sysdatalink_con")
public class CellSysDatalinkCon implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * sysdatalinkId
	 */
	@Column(name = "sysdatalink_id", length = 50)
	protected String sysdatalinkId;

	/**
	 * intandor
	 */
	@Column(name = "intandor")
	protected Integer intandor;

	/**
	 * sqlconshow
	 */
	@Lob
	@Column(name = "sqlconshow")
	protected String sqlconshow;

	/**
	 * sqlcon
	 */
	@Lob
	@Column(name = "sqlcon")
	protected String sqlcon;

	public CellSysDatalinkCon() {

	}

	public String getId() {
		return this.id;
	}

	public Integer getIntandor() {
		return this.intandor;
	}

	public String getSqlcon() {
		return this.sqlcon;
	}

	public String getSqlconshow() {
		return this.sqlconshow;
	}

	public String getSysdatalinkId() {
		return this.sysdatalinkId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntandor(Integer intandor) {
		this.intandor = intandor;
	}

	public void setSqlcon(String sqlcon) {
		this.sqlcon = sqlcon;
	}

	public void setSqlconshow(String sqlconshow) {
		this.sqlconshow = sqlconshow;
	}

	public void setSysdatalinkId(String sysdatalinkId) {
		this.sysdatalinkId = sysdatalinkId;
	}

	public CellSysDatalinkCon jsonToObject(JSONObject jsonObject) {
		return CellSysDatalinkConJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellSysDatalinkConJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellSysDatalinkConJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
