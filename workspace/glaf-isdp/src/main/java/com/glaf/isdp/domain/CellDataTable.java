package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.*;

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
import com.glaf.core.domain.ColumnDefinition;
import com.glaf.isdp.util.CellDataTableJsonFactory;

@Entity
@Table(name = "cell_data_table")
public class CellDataTable implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * tablename
	 */
	@Column(name = "tablename", length = 50)
	protected String tablename;

	/**
	 * name
	 */
	@Column(name = "name", length = 255)
	protected String name;

	/**
	 * addtype
	 */
	@Column(name = "addtype")
	protected int addtype;

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
	 * userid
	 */
	@Column(name = "userid", length = 50)
	protected String userid;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * content
	 */
	@Column(name = "content", length = 250)
	protected String content;

	/**
	 * sysnum
	 */
	@Column(name = "sysnum", length = 100)
	protected String sysnum;

	/**
	 * issubtable
	 */
	@Column(name = "issubtable", length = 1)
	protected String issubtable;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * filedot_fileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * win_width
	 */
	@Column(name = "win_width")
	protected int winWidth;

	/**
	 * win_height
	 */
	@Column(name = "win_height")
	protected int winHeight;

	/**
	 * intQuote
	 */
	@Column(name = "intQuote")
	protected int intQuote;

	/**
	 * intLineEdit
	 */
	@Column(name = "intLineEdit")
	protected int intLineEdit;

	/**
	 * printfileid
	 */
	@Column(name = "printfileid", length = 50)
	protected String printfileid;

	@javax.persistence.Transient
	protected List<FieldInterface> fields = new ArrayList<FieldInterface>();

	@javax.persistence.Transient
	protected List<CellDataField> cellDataFields = new ArrayList<CellDataField>();

	@javax.persistence.Transient
	protected ColumnDefinition idColumn;

	@javax.persistence.Transient
	protected List<ColumnDefinition> columns = new ArrayList<ColumnDefinition>();

	public CellDataTable() {

	}

	public void addCellDataField(CellDataField df) {
		if (cellDataFields == null) {
			cellDataFields = new ArrayList<CellDataField>();
		}
		cellDataFields.add(df);
	}

	public void addColumn(ColumnDefinition column) {
		if (columns == null) {
			columns = new ArrayList<ColumnDefinition>();
		}
		columns.add(column);
	}

	public void addField(FieldInterface f) {
		if (fields == null) {
			fields = new ArrayList<FieldInterface>();
		}
		fields.add(f);
	}

	public int getAddtype() {
		return this.addtype;
	}

	public List<CellDataField> getCellDataFields() {
		return cellDataFields;
	}

	public List<ColumnDefinition> getColumns() {
		return columns;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public List<FieldInterface> getFields() {
		return fields;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getId() {
		return this.id;
	}

	public ColumnDefinition getIdColumn() {
		return idColumn;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntLineEdit() {
		return this.intLineEdit;
	}

	public int getIntQuote() {
		return this.intQuote;
	}

	public String getIssubtable() {
		return this.issubtable;
	}

	public int getMaxsys() {
		return this.maxsys;
	}

	public int getMaxuser() {
		return this.maxuser;
	}

	public String getName() {
		return this.name;
	}

	public String getPrintfileid() {
		return this.printfileid;
	}

	public String getSysnum() {
		return this.sysnum;
	}

	public String getTablename() {
		return this.tablename;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getUserid() {
		return this.userid;
	}

	public int getWinHeight() {
		return this.winHeight;
	}

	public int getWinWidth() {
		return this.winWidth;
	}

	public void setAddtype(int addtype) {
		this.addtype = addtype;
	}

	public void setCellDataFields(List<CellDataField> cellDataFields) {
		this.cellDataFields = cellDataFields;
	}

	public void setColumns(List<ColumnDefinition> columns) {
		this.columns = columns;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFields(List<FieldInterface> fields) {
		this.fields = fields;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIdColumn(ColumnDefinition idColumn) {
		this.idColumn = idColumn;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntLineEdit(int intLineEdit) {
		this.intLineEdit = intLineEdit;
	}

	public void setIntQuote(int intQuote) {
		this.intQuote = intQuote;
	}

	public void setIssubtable(String issubtable) {
		this.issubtable = issubtable;
	}

	public void setMaxsys(int maxsys) {
		this.maxsys = maxsys;
	}

	public void setMaxuser(int maxuser) {
		this.maxuser = maxuser;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrintfileid(String printfileid) {
		this.printfileid = printfileid;
	}

	public void setSysnum(String sysnum) {
		this.sysnum = sysnum;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setWinHeight(int winHeight) {
		this.winHeight = winHeight;
	}

	public void setWinWidth(int winWidth) {
		this.winWidth = winWidth;
	}

	public CellDataTable jsonToObject(JSONObject jsonObject) {
		return CellDataTableJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellDataTableJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellDataTableJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
