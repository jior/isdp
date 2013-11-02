package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellTcadbmpJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "cell_tcadbmp")
public class CellTcadbmp implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * filetype
	 */
	@Column(name = "filetype")
	protected Integer filetype;

	/**
	 * fileid
	 */
	@Column(name = "fileid", length = 50)
	protected String fileid;

	/**
	 * ostTablename
	 */
	@Column(name = "ost_tablename", length = 50)
	protected String ostTablename;

	/**
	 * ostRow
	 */
	@Column(name = "ost_row")
	protected Integer ostRow;

	/**
	 * ostCol
	 */
	@Column(name = "ost_col")
	protected Integer ostCol;

	/**
	 * ostCellid
	 */
	@Column(name = "ost_cellid", length = 20)
	protected String ostCellid;

	/**
	 * fileName
	 */
	@Column(name = "file_name", length = 255)
	protected String fileName;

	/**
	 * fileContent
	 */
	@Lob
	@Column(name = "file_content")
	protected byte[] fileContent;

	/**
	 * oldContent
	 */
	@Lob
	@Column(name = "old_content")
	protected byte[] oldContent;

	public CellTcadbmp() {

	}

	public String getId() {
		return this.id;
	}

	public Integer getFiletype() {
		return this.filetype;
	}

	public String getFileid() {
		return this.fileid;
	}

	public String getOstTablename() {
		return this.ostTablename;
	}

	public Integer getOstRow() {
		return this.ostRow;
	}

	public Integer getOstCol() {
		return this.ostCol;
	}

	public String getOstCellid() {
		return this.ostCellid;
	}

	public String getFileName() {
		return this.fileName;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public byte[] getOldContent() {
		return this.oldContent;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFiletype(Integer filetype) {
		this.filetype = filetype;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public void setOstTablename(String ostTablename) {
		this.ostTablename = ostTablename;
	}

	public void setOstRow(Integer ostRow) {
		this.ostRow = ostRow;
	}

	public void setOstCol(Integer ostCol) {
		this.ostCol = ostCol;
	}

	public void setOstCellid(String ostCellid) {
		this.ostCellid = ostCellid;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setOldContent(byte[] oldContent) {
		this.oldContent = oldContent;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public CellTcadbmp jsonToObject(JSONObject jsonObject) {
		return CellTcadbmpJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellTcadbmpJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellTcadbmpJsonFactory.toObjectNode(this);
	}
}
