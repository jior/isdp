package com.glaf.isdp.domain;

import java.io.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellMenuJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "cell_setmymenu")
public class CellMenu implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * name
	 */
	@Column(name = "name", length = 50)
	protected String name;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 20)
	protected String userid;

	/**
	 * isuselect
	 */
	@Column(name = "isuselect", length = 1)
	protected String isuselect;

	/**
	 * issystem
	 */
	@Column(name = "issystem")
	protected int issystem;

	/**
	 * intused
	 */
	@Column(name = "intused")
	protected int intused;

	/**
	 * busiessId
	 */
	@Column(name = "busiess_id")
	protected String busiessId;

	/**
	 * intdel
	 */
	@Column(name = "intdel")
	protected int intdel;

	public CellMenu() {

	}

	public String getBusiessId() {
		return this.busiessId;
	}

	public String getId() {
		return this.id;
	}

	public int getIntdel() {
		return this.intdel;
	}

	public int getIntused() {
		return this.intused;
	}

	public int getIssystem() {
		return this.issystem;
	}

	public String getIsuselect() {
		return this.isuselect;
	}

	public String getName() {
		return this.name;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntdel(int intdel) {
		this.intdel = intdel;
	}

	public void setIntused(int intused) {
		this.intused = intused;
	}

	public void setIssystem(int issystem) {
		this.issystem = issystem;
	}

	public void setIsuselect(String isuselect) {
		this.isuselect = isuselect;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public CellMenu jsonToObject(JSONObject jsonObject) {
		return CellMenuJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellMenuJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellMenuJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
