package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.FileattJsonFactory;

@Entity
@Table(name = "fileatt")
public class IsdpFileatt implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fileID", length = 50, nullable = false)
	protected String fileID;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * actor
	 */
	@Column(name = "actor", length = 20)
	protected String actor;

	/**
	 * fname
	 */
	@Column(name = "fname", length = 255)
	protected String fname;

	/**
	 * file_name
	 */
	@Column(name = "file_name", length = 255)
	protected String fileName;

	/**
	 * file_content
	 */
	@Lob
	@Column(name = "file_content")
	protected byte[] fileContent;

	/**
	 * vision
	 */
	@Column(name = "vision", length = 50)
	protected String vision;

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
	protected int filesize;

	/**
	 * visID
	 */
	@Column(name = "visID", length = 50)
	protected String visID;

	/**
	 * attID
	 */
	@Column(name = "attID", length = 50)
	protected String attID;

	/**
	 * Istextcontent
	 */
	@Column(name = "Istextcontent")
	protected int istextcontent;

	/**
	 * textcontent
	 */
	@Lob
	@Column(name = "textcontent")
	protected String textcontent;

	public IsdpFileatt() {

	}

	public String getActor() {
		return this.actor;
	}

	public String getAttID() {
		return this.attID;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public String getFileID() {
		return this.fileID;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getFilesize() {
		return this.filesize;
	}

	public String getFname() {
		return this.fname;
	}

	public int getIstextcontent() {
		return this.istextcontent;
	}

	public String getNum() {
		return this.num;
	}

	public String getTextcontent() {
		return this.textcontent;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getVisID() {
		return this.visID;
	}

	public String getVision() {
		return this.vision;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setAttID(String attID) {
		this.attID = attID;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setFileID(String fileID) {
		this.fileID = fileID;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setIstextcontent(int istextcontent) {
		this.istextcontent = istextcontent;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setTextcontent(String textcontent) {
		this.textcontent = textcontent;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setVisID(String visID) {
		this.visID = visID;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public IsdpFileatt jsonToObject(JSONObject jsonObject) {
		return FileattJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FileattJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FileattJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
