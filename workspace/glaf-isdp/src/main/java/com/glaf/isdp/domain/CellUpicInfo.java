package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellUpicInfoJsonFactory;

@Entity
@Table(name = "cell_upicinfo")
public class CellUpicInfo implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * indexId
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * TaskId
	 */
	@Column(name = "task_id", length = 50)
	protected String taskId;

	/**
	 * pfileflag
	 */
	@Column(name = "pfileflag")
	protected int pfileflag;

	/**
	 * filedotFileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * chktotal
	 */
	@Column(name = "chktotal")
	protected int chktotal;

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
	 * userid
	 */
	@Column(name = "userid", length = 50)
	protected String userid;

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
	 * roleId
	 */
	@Column(name = "role_id")
	protected int roleId;

	/**
	 * isfinish
	 */
	@Column(name = "isfinish")
	protected int isfinish;

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

	/**
	 * typeIndexId
	 */
	@Column(name = "type_index_id")
	protected int typeIndexId;

	/**
	 * typeId
	 */
	@Column(name = "type_id", length = 50)
	protected String typeId;

	public CellUpicInfo() {

	}

	public String getAnnotations() {
		return this.annotations;
	}

	public int getChkresult() {
		return this.chkresult;
	}

	public int getChktotal() {
		return this.chktotal;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getDuty() {
		return this.duty;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
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

	public int getIsfinish() {
		return this.isfinish;
	}

	public int getListno() {
		return this.listno;
	}

	public String getOldId() {
		return this.oldId;
	}

	public int getPage() {
		return this.page;
	}

	public int getPfileflag() {
		return this.pfileflag;
	}

	public String getPfileId() {
		return this.pfileId;
	}

	public int getRefillflag() {
		return this.refillflag;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public String getTagnum() {
		return this.tagnum;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getThematic() {
		return this.thematic;
	}

	public String getTname() {
		return this.tname;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public int getTypeIndexId() {
		return this.typeIndexId;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public void setChkresult(int chkresult) {
		this.chkresult = chkresult;
	}

	public void setChktotal(int chktotal) {
		this.chktotal = chktotal;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
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

	public void setIsfinish(int isfinish) {
		this.isfinish = isfinish;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPfileflag(int pfileflag) {
		this.pfileflag = pfileflag;
	}

	public void setPfileId(String pfileId) {
		this.pfileId = pfileId;
	}

	public void setRefillflag(int refillflag) {
		this.refillflag = refillflag;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setTagnum(String tagnum) {
		this.tagnum = tagnum;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setThematic(String thematic) {
		this.thematic = thematic;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIndexId(int typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public CellUpicInfo jsonToObject(JSONObject jsonObject) {
		return CellUpicInfoJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellUpicInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellUpicInfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
