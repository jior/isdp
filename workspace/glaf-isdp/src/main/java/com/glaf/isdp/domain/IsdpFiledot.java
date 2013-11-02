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

import com.glaf.isdp.util.FiledotJsonFactory;

/**
 * 表格文件信息
 */
@Entity
@Table(name = "filedot")
public class IsdpFiledot implements Serializable, JSONable {
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
	 * fbelong
	 */
	@Column(name = "fbelong", length = 250)
	protected String fbelong;

	/**
	 * fnum
	 */
	@Column(name = "fnum", length = 50)
	protected String fnum;

	/**
	 * pbelong
	 */
	@Column(name = "pbelong", length = 200)
	protected String pbelong;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * fname
	 */
	@Column(name = "fname", length = 255)
	protected String fname;

	/**
	 * dotname
	 */
	@Column(name = "dotname", length = 255)
	protected String dotname;

	/**
	 * Ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * dtime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtime")
	protected Date dtime;

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
	 * cman
	 */
	@Column(name = "cman", length = 20)
	protected String cman;

	/**
	 * content
	 */
	@Column(name = "content", length = 250)
	protected String content;

	/**
	 * listflag
	 */
	@Column(name = "listflag", length = 1)
	protected String listflag;

	/**
	 * tofile
	 */
	@Column(name = "tofile")
	protected int tofile;

	/**
	 * isink
	 */
	@Column(name = "isink", length = 1)
	protected String isink;

	/**
	 * dottype
	 */
	@Column(name = "dottype")
	protected int dottype;

	/**
	 * ctimedname
	 */
	@Column(name = "ctimedname", length = 50)
	protected String ctimedname;

	/**
	 * type
	 */
	@Column(name = "type")
	protected int type;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * utree_index
	 */
	@Column(name = "utree_index")
	protected int utreeIndex;

	/**
	 * isquan
	 */
	@Column(name = "isquan", length = 1)
	protected String isquan;

	/**
	 * intsysform
	 */
	@Column(name = "intsysform")
	protected int intsysform;

	@javax.persistence.Transient
	protected int inttasktype;

	public IsdpFiledot() {

	}

	public String getCman() {
		return this.cman;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getCtimedname() {
		return this.ctimedname;
	}

	public String getDotname() {
		return this.dotname;
	}

	public int getDottype() {
		return this.dottype;
	}

	public Date getDtime() {
		return this.dtime;
	}

	public int getDwid() {
		return this.dwid;
	}

	public String getFbelong() {
		return this.fbelong;
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

	public String getFnum() {
		return this.fnum;
	}

	public int getFxid() {
		return this.fxid;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntsysform() {
		return this.intsysform;
	}

	public int getInttasktype() {
		return inttasktype;
	}

	public String getIsink() {
		return this.isink;
	}

	public String getIsquan() {
		return this.isquan;
	}

	public String getJid() {
		return this.jid;
	}

	public String getListflag() {
		return this.listflag;
	}

	public int getListno() {
		return this.listno;
	}

	public String getNum() {
		return this.num;
	}

	public String getPbelong() {
		return this.pbelong;
	}

	public int getTofile() {
		return this.tofile;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public int getType() {
		return this.type;
	}

	public int getUtreeIndex() {
		return this.utreeIndex;
	}

	public void setCman(String cman) {
		this.cman = cman;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setCtimedname(String ctimedname) {
		this.ctimedname = ctimedname;
	}

	public void setDotname(String dotname) {
		this.dotname = dotname;
	}

	public void setDottype(int dottype) {
		this.dottype = dottype;
	}

	public void setDtime(Date dtime) {
		this.dtime = dtime;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public void setFbelong(String fbelong) {
		this.fbelong = fbelong;
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

	public void setFnum(String fnum) {
		this.fnum = fnum;
	}

	public void setFxid(int fxid) {
		this.fxid = fxid;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntsysform(int intsysform) {
		this.intsysform = intsysform;
	}

	public void setInttasktype(int inttasktype) {
		this.inttasktype = inttasktype;
	}

	public void setIsink(String isink) {
		this.isink = isink;
	}

	public void setIsquan(String isquan) {
		this.isquan = isquan;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setListflag(String listflag) {
		this.listflag = listflag;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setPbelong(String pbelong) {
		this.pbelong = pbelong;
	}

	public void setTofile(int tofile) {
		this.tofile = tofile;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setUtreeIndex(int utreeIndex) {
		this.utreeIndex = utreeIndex;
	}

	public IsdpFiledot jsonToObject(JSONObject jsonObject) {
		return FiledotJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FiledotJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FiledotJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
