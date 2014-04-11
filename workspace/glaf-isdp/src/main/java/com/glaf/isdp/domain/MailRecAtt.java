package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.MailRecAttJsonFactory;

@Entity
@Table(name = "email_recatt")
public class MailRecAtt implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fileId", length = 50, nullable = false)
	protected String fileId;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 100)
	protected String topid;

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
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * filesize
	 */
	@Column(name = "filesize")
	protected Integer filesize;

	public MailRecAtt() {

	}

	public String getFileId() {
		return this.fileId;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getFileName() {
		return this.fileName;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public Integer getFilesize() {
		return this.filesize;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public MailRecAtt jsonToObject(JSONObject jsonObject) {
		return MailRecAttJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MailRecAttJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MailRecAttJsonFactory.toObjectNode(this);
	}

}
