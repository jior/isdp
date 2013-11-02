package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.isdp.util.CellDataVirtableJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "cell_data_virtables")
public class CellDataVirtable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * tableid
	 */
	@Column(name = "tableid", length = 50)
	protected String tableid;

	/**
	 * desid
	 */
	@Column(name = "desid", length = 50)
	protected String desid;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected Integer inttype;

	/**
	 * lstname
	 */
	@Column(name = "lstname", length = 250)
	protected String lstname;

	/**
	 * content
	 */
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * intsave
	 */
	@Column(name = "intsave")
	protected Integer intsave;

	public CellDataVirtable() {

	}

	public String getContent() {
		return this.content;
	}

	public String getDesid() {
		return this.desid;
	}

	public String getId() {
		return this.id;
	}

	public Integer getIntsave() {
		return this.intsave;
	}

	public Integer getInttype() {
		return this.inttype;
	}

	public String getLstname() {
		return this.lstname;
	}

	public String getTableid() {
		return this.tableid;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDesid(String desid) {
		this.desid = desid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntsave(Integer intsave) {
		this.intsave = intsave;
	}

	public void setInttype(Integer inttype) {
		this.inttype = inttype;
	}

	public void setLstname(String lstname) {
		this.lstname = lstname;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid;
	}

	public CellDataVirtable jsonToObject(JSONObject jsonObject) {
		return CellDataVirtableJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellDataVirtableJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellDataVirtableJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
