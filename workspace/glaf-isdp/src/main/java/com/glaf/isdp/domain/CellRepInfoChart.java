package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellRepInfoChartJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "cell_repinfo_chart")
public class CellRepInfoChart implements Serializable, JSONable {
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
	 * nameLine
	 */
	@Column(name = "name_line", length = 200)
	protected String nameLine;

	/**
	 * dnameX
	 */
	@Column(name = "dname_x", length = 50)
	protected String dnameX;

	/**
	 * dnameY
	 */
	@Column(name = "dname_y", length = 50)
	protected String dnameY;

	public CellRepInfoChart() {

	}

	public String getDnameX() {
		return this.dnameX;
	}

	public String getDnameY() {
		return this.dnameY;
	}

	public String getId() {
		return this.id;
	}

	public String getNameLine() {
		return this.nameLine;
	}

	public String getTopid() {
		return this.topid;
	}

	public void setDnameX(String dnameX) {
		this.dnameX = dnameX;
	}

	public void setDnameY(String dnameY) {
		this.dnameY = dnameY;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public CellRepInfoChart jsonToObject(JSONObject jsonObject) {
		return CellRepInfoChartJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellRepInfoChartJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellRepInfoChartJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
