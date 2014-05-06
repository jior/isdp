package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.MycellBusiessJsonFactory;

/**
 * 业务模板
 */
@Entity
@Table(name = "mycell_busiess")
public class MyCellBusiess implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * name
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * isused
	 */
	@Column(name = "isused", length = 1)
	protected String isused;

	/**
	 * content
	 */
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * intsystype
	 */
	@Column(name = "intsystype")
	protected int intsystype;

	/**
	 * picfile
	 */
	@Column(name = "picfile", length = 250)
	protected String picfile;

	/**
	 * file_content
	 */
	@Lob
	@Column(name = "file_content")
	protected byte[] fileContent;

	/**
	 * picfile_welcom
	 */
	@Column(name = "picfile_welcom", length = 250)
	protected String picfileWelcom;

	/**
	 * file_content_w
	 */
	@Lob
	@Column(name = "file_content_w")
	protected byte[] fileContentW;

	/**
	 * picfile_main
	 */
	@Column(name = "picfile_main", length = 250)
	protected String picfileMain;

	/**
	 * file_content_m
	 */
	@Lob
	@Column(name = "file_content_m")
	protected byte[] fileContentM;

	/**
	 * picfile_login
	 */
	@Column(name = "picfile_login", length = 250)
	protected String picfileLogin;

	/**
	 * file_content_l
	 */
	@Lob
	@Column(name = "file_content_l")
	protected byte[] fileContentL;

	/**
	 * sysbuiesstypes_id
	 */
	@Column(name = "sysbuiesstypes_id", length = 50)
	protected String sysbuiesstypesId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	@javax.persistence.Transient
	protected boolean checked;

	public MyCellBusiess() {

	}

	public String getContent() {
		return this.content;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public byte[] getFileContentL() {
		return this.fileContentL;
	}

	public byte[] getFileContentM() {
		return this.fileContentM;
	}

	public byte[] getFileContentW() {
		return this.fileContentW;
	}

	public String getId() {
		return this.id;
	}

	public int getIntsystype() {
		return this.intsystype;
	}

	public String getIsused() {
		return this.isused;
	}

	public int getListno() {
		return this.listno;
	}

	public String getName() {
		return this.name;
	}

	public String getPicfile() {
		return this.picfile;
	}

	public String getPicfileLogin() {
		return this.picfileLogin;
	}

	public String getPicfileMain() {
		return this.picfileMain;
	}

	public String getPicfileWelcom() {
		return this.picfileWelcom;
	}

	public String getSysbuiesstypesId() {
		return this.sysbuiesstypesId;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setFileContentL(byte[] fileContentL) {
		this.fileContentL = fileContentL;
	}

	public void setFileContentM(byte[] fileContentM) {
		this.fileContentM = fileContentM;
	}

	public void setFileContentW(byte[] fileContentW) {
		this.fileContentW = fileContentW;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntsystype(int intsystype) {
		this.intsystype = intsystype;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPicfile(String picfile) {
		this.picfile = picfile;
	}

	public void setPicfileLogin(String picfileLogin) {
		this.picfileLogin = picfileLogin;
	}

	public void setPicfileMain(String picfileMain) {
		this.picfileMain = picfileMain;
	}

	public void setPicfileWelcom(String picfileWelcom) {
		this.picfileWelcom = picfileWelcom;
	}

	public void setSysbuiesstypesId(String sysbuiesstypesId) {
		this.sysbuiesstypesId = sysbuiesstypesId;
	}

	public MyCellBusiess jsonToObject(JSONObject jsonObject) {
		return MycellBusiessJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MycellBusiessJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MycellBusiessJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
