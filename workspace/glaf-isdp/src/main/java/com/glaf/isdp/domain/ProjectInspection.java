package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.ProjectInspectionJsonFactory;

@Entity
@Table(name = "proj_inspection")
public class ProjectInspection implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 100, nullable = false)
	protected String id;

	/**
	 * indexId
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * intflag
	 */
	@Column(name = "intflag")
	protected int intflag;

	/**
	 * cellTmpfiletypeId
	 */
	@Column(name = "cell_tmpfiletype_id", length = 50)
	protected String cellTmpfiletypeId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * chkresult
	 */
	@Column(name = "chkresult")
	protected int chkresult;

	/**
	 * pfileId
	 */
	@Column(name = "pfile_id", length = 50)
	protected String pfileId;

	/**
	 * refillflag
	 */
	@Column(name = "refillflag")
	protected int refillflag;

	/**
	 * groupid
	 */
	@Column(name = "groupid")
	protected int groupid;

	/**
	 * oldId
	 */
	@Column(name = "old_id", length = 50)
	protected String oldId;

	/**
	 * emailId
	 */
	@Column(name = "email_id", length = 50)
	protected String emailId;

	/**
	 * recemailId
	 */
	@Column(name = "recemail_id", length = 50)
	protected String recemailId;

	/**
	 * mainId
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	/**
	 * tagnum
	 */
	@Column(name = "tagnum", length = 50)
	protected String tagnum;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * tname
	 */
	@Column(name = "tname", length = 250)
	protected String tname;

	/**
	 * page
	 */
	@Column(name = "page")
	protected int page;

	/**
	 * duty
	 */
	@Column(name = "duty", length = 100)
	protected String duty;

	/**
	 * thematic
	 */
	@Column(name = "thematic", length = 100)
	protected String thematic;

	/**
	 * annotations
	 */
	@Column(name = "annotations", length = 100)
	protected String annotations;

	public ProjectInspection() {

	}

	public String getAnnotations() {
		return this.annotations;
	}

	public String getCellTmpfiletypeId() {
		return this.cellTmpfiletypeId;
	}

	public int getChkresult() {
		return this.chkresult;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getDuty() {
		return this.duty;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public int getGroupid() {
		return this.groupid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntflag() {
		return this.intflag;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMainId() {
		return this.mainId;
	}

	public String getOldId() {
		return this.oldId;
	}

	public int getPage() {
		return this.page;
	}

	public String getPfileId() {
		return this.pfileId;
	}

	public String getRecemailId() {
		return this.recemailId;
	}

	public int getRefillflag() {
		return this.refillflag;
	}

	public String getTagnum() {
		return this.tagnum;
	}

	public String getThematic() {
		return this.thematic;
	}

	public String getTname() {
		return this.tname;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public void setCellTmpfiletypeId(String cellTmpfiletypeId) {
		this.cellTmpfiletypeId = cellTmpfiletypeId;
	}

	public void setChkresult(int chkresult) {
		this.chkresult = chkresult;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntflag(int intflag) {
		this.intflag = intflag;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPfileId(String pfileId) {
		this.pfileId = pfileId;
	}

	public void setRecemailId(String recemailId) {
		this.recemailId = recemailId;
	}

	public void setRefillflag(int refillflag) {
		this.refillflag = refillflag;
	}

	public void setTagnum(String tagnum) {
		this.tagnum = tagnum;
	}

	public void setThematic(String thematic) {
		this.thematic = thematic;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public ProjectInspection jsonToObject(JSONObject jsonObject) {
		return ProjectInspectionJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ProjectInspectionJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ProjectInspectionJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
