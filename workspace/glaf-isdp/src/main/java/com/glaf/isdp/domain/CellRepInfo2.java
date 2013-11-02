package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellRepInfo2JsonFactory;

/**
 * 表格信息（从表区域）
 */
@Entity
@Table(name = "cell_repinfo2")
public class CellRepInfo2 implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * frmtype
	 */
	@Column(name = "frmtype", length = 50)
	protected String frmtype;

	/**
	 * type
	 */
	@Column(name = "type")
	protected int type;

	/**
	 * content
	 */
	@Lob
	@Column(name = "content")
	protected String content;

	/**
	 * formula
	 */
	@Lob
	@Column(name = "formula")
	protected String formula;

	/**
	 * ost_tablename
	 */
	@Column(name = "ost_tablename", length = 50)
	protected String ostTablename;

	/**
	 * ost_row 开始行号，从1开始
	 */
	@Column(name = "ost_row")
	protected int ostRow;

	/**
	 * ost_col 开始列号，从1开始
	 */
	@Column(name = "ost_col")
	protected int ostCol;

	/**
	 * ost_rowend 结束行号
	 */
	@Column(name = "ost_rowend")
	protected int ostRowend;

	/**
	 * ost_colend 结束列号
	 */
	@Column(name = "ost_colend")
	protected int ostColend;

	/**
	 * ost_cellid
	 */
	@Column(name = "ost_cellid", length = 20)
	protected String ostCellid;

	/**
	 * filedot_fileid 表格文件定义编号
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * ost_color
	 */
	@Column(name = "ost_color")
	protected int ostColor;

	/**
	 * ost_way
	 */
	@Column(name = "ost_way")
	protected int ostWay;

	/**
	 * role_id
	 */
	@Column(name = "role_id")
	protected int roleId;

	/**
	 * tablename
	 */
	@Column(name = "tablename", length = 50)
	protected String tablename;

	/**
	 * fname
	 */
	@Column(name = "fname", length = 255)
	protected String fname;

	/**
	 * dname
	 */
	@Column(name = "dname", length = 50)
	protected String dname;

	/**
	 * issubtable
	 */
	@Column(name = "issubtable", length = 1)
	protected String issubtable;

	/**
	 * tablename2
	 */
	@Column(name = "tablename2", length = 50)
	protected String tablename2;

	/**
	 * intautoinvalue
	 */
	@Column(name = "intautoinvalue")
	protected int intautoinvalue;

	public CellRepInfo2() {

	}

	public String getContent() {
		return this.content;
	}

	public String getDname() {
		return this.dname;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getFname() {
		return this.fname;
	}

	public String getFormula() {
		return this.formula;
	}

	public String getFrmtype() {
		return this.frmtype;
	}

	public String getId() {
		return this.id;
	}

	public int getIntautoinvalue() {
		return this.intautoinvalue;
	}

	public String getIssubtable() {
		return this.issubtable;
	}

	public String getOstCellid() {
		return this.ostCellid;
	}

	public int getOstCol() {
		return this.ostCol;
	}

	public int getOstColend() {
		return this.ostColend;
	}

	public int getOstColor() {
		return this.ostColor;
	}

	public int getOstRow() {
		return this.ostRow;
	}

	public int getOstRowend() {
		return this.ostRowend;
	}

	public String getOstTablename() {
		return this.ostTablename;
	}

	public int getOstWay() {
		return this.ostWay;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public String getTablename() {
		return this.tablename;
	}

	public String getTablename2() {
		return this.tablename2;
	}

	public int getType() {
		return this.type;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public void setFrmtype(String frmtype) {
		this.frmtype = frmtype;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntautoinvalue(int intautoinvalue) {
		this.intautoinvalue = intautoinvalue;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
	}

	public void setOstCellid(String ostCellid) {
		this.ostCellid = ostCellid;
	}

	public void setOstCol(int ostCol) {
		this.ostCol = ostCol;
	}

	public void setOstColend(int ostColend) {
		this.ostColend = ostColend;
	}

	public void setOstColor(int ostColor) {
		this.ostColor = ostColor;
	}

	public void setOstRow(int ostRow) {
		this.ostRow = ostRow;
	}

	public void setOstRowend(int ostRowend) {
		this.ostRowend = ostRowend;
	}

	public void setOstTablename(String ostTablename) {
		this.ostTablename = ostTablename;
	}

	public void setOstWay(int ostWay) {
		this.ostWay = ostWay;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablename2(String tablename2) {
		this.tablename2 = tablename2;
	}

	public void setType(int type) {
		this.type = type;
	}

	public CellRepInfo2 jsonToObject(JSONObject jsonObject) {
		return CellRepInfo2JsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellRepInfo2JsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellRepInfo2JsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
