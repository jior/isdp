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

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.DotuseJsonFactory;

@Entity
@Table(name = "dotuse")
public class IsdpDotuse implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fileID", length = 50, nullable = false)
	protected String fileID;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * projid
	 */
	@Column(name = "projid")
	protected int projid;

	/**
	 * pid
	 */
	@Column(name = "pid")
	protected int pid;

	/**
	 * dotid
	 */
	@Column(name = "dotid", length = 50)
	protected String dotid;

	/**
	 * num
	 */
	@Column(name = "num", length = 10)
	protected String num;

	/**
	 * name
	 */
	@Column(name = "name", length = 255)
	protected String name;

	/**
	 * cman
	 */
	@Column(name = "cman", length = 20)
	protected String cman;

	/**
	 * Ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

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
	 * filesize
	 */
	@Column(name = "filesize")
	protected int filesize;

	/**
	 * vision
	 */
	@Column(name = "vision", length = 100)
	protected String vision;

	/**
	 * savetime
	 */
	@Column(name = "savetime", length = 100)
	protected String savetime;

	/**
	 * remark
	 */
	@Column(name = "remark", length = 200)
	protected String remark;

	/**
	 * dwid
	 */
	@Column(name = "dwid")
	protected int dwid;

	/**
	 * fbid
	 */
	@Column(name = "fbid")
	protected int fbid;

	/**
	 * fxid
	 */
	@Column(name = "fxid")
	protected int fxid;

	/**
	 * jid
	 */
	@Column(name = "jid", length = 50)
	protected String jid;

	/**
	 * flid
	 */
	@Column(name = "flid", length = 50)
	protected String flid;

	/**
	 * topnode
	 */
	@Column(name = "topnode", length = 250)
	protected String topnode;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * type
	 */
	@Column(name = "type")
	protected int type;

	/**
	 * fname
	 */
	@Column(name = "fname", length = 250)
	protected String fname;

	/**
	 * isink
	 */
	@Column(name = "isink", length = 1)
	protected String isink;

	/**
	 * old_id
	 */
	@Column(name = "old_id", length = 50)
	protected String oldId;

	/**
	 * Task_id
	 */
	@Column(name = "task_id", length = 50)
	protected String taskId;

	/**
	 * ischeck
	 */
	@Column(name = "ischeck")
	protected int ischeck;

	public IsdpDotuse() {

	}

	public String getCman() {
		return this.cman;
	}

	public Date getCtime() {
		return ctime;
	}

	public String getDotid() {
		return this.dotid;
	}

	public int getDwid() {
		return this.dwid;
	}

	public int getFbid() {
		return this.fbid;
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

	public String getFlid() {
		return this.flid;
	}

	public String getFname() {
		return this.fname;
	}

	public int getFxid() {
		return this.fxid;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIscheck() {
		return this.ischeck;
	}

	public String getIsink() {
		return this.isink;
	}

	public String getJid() {
		return this.jid;
	}

	public String getName() {
		return this.name;
	}

	public String getNum() {
		return this.num;
	}

	public String getOldId() {
		return this.oldId;
	}

	public int getPid() {
		return this.pid;
	}

	public int getProjid() {
		return this.projid;
	}

	public String getRemark() {
		return this.remark;
	}

	public String getSavetime() {
		return this.savetime;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public int getType() {
		return this.type;
	}

	public String getVision() {
		return this.vision;
	}

	public void setCman(String cman) {
		this.cman = cman;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setDotid(String dotid) {
		this.dotid = dotid;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public void setFbid(int fbid) {
		this.fbid = fbid;
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

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setFxid(int fxid) {
		this.fxid = fxid;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIscheck(int ischeck) {
		this.ischeck = ischeck;
	}

	public void setIsink(String isink) {
		this.isink = isink;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setProjid(int projid) {
		this.projid = projid;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public IsdpDotuse jsonToObject(JSONObject jsonObject) {
		return DotuseJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return DotuseJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DotuseJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
