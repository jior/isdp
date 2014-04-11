package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellDataFieldJsonFactory;

@Entity
@Table(name = "cell_data_field")
public class CellDataField implements Serializable, JSONable {
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
	 * fieldname
	 */
	@Column(name = "fieldname", length = 50)
	protected String fieldname;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 50)
	protected String userid;

	/**
	 * maxuser
	 */
	@Column(name = "maxuser")
	protected int maxuser;

	/**
	 * maxsys
	 */
	@Column(name = "maxsys")
	protected int maxsys;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * sysnum
	 */
	@Column(name = "sysnum", length = 100)
	protected String sysnum;

	/**
	 * tablename
	 */
	@Column(name = "tablename", length = 50)
	protected String tablename;

	/**
	 * dname
	 */
	@Column(name = "dname", length = 50)
	protected String dname;

	/**
	 * userindex
	 */
	@Column(name = "userindex", length = 50)
	protected String userindex;

	/**
	 * treetablename_b
	 */
	@Column(name = "treetablename_b", length = 50)
	protected String treetablenameB;

	@javax.persistence.Transient
	protected String stringValue;

	@javax.persistence.Transient
	protected int intValue;

	@javax.persistence.Transient
	protected long longValue;

	@javax.persistence.Transient
	protected double doubleValue;

	@javax.persistence.Transient
	protected Date dateValue;

	@javax.persistence.Transient
	protected Object value;

	public CellDataField() {

	}

	public Date getCtime() {
		return this.ctime;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public String getDname() {
		return this.dname;
	}

	public double getDoubleValue() {
		return doubleValue;
	}

	public String getFieldname() {
		return this.fieldname;
	}

	public String getId() {
		return this.id;
	}

	public int getIntValue() {
		return intValue;
	}

	public long getLongValue() {
		return longValue;
	}

	public int getMaxsys() {
		return this.maxsys;
	}

	public int getMaxuser() {
		return this.maxuser;
	}

	public String getStringValue() {
		return stringValue;
	}

	public String getSysnum() {
		return this.sysnum;
	}

	public String getTableid() {
		return this.tableid;
	}

	public String getTablename() {
		return this.tablename;
	}

	public String getTreetablenameB() {
		return this.treetablenameB;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getUserindex() {
		return this.userindex;
	}

	public Object getValue() {
		return value;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setDoubleValue(double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}

	public void setMaxsys(int maxsys) {
		this.maxsys = maxsys;
	}

	public void setMaxuser(int maxuser) {
		this.maxuser = maxuser;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public void setSysnum(String sysnum) {
		this.sysnum = sysnum;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTreetablenameB(String treetablenameB) {
		this.treetablenameB = treetablenameB;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUserindex(String userindex) {
		this.userindex = userindex;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public CellDataField jsonToObject(JSONObject jsonObject) {
		return CellDataFieldJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellDataFieldJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellDataFieldJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
