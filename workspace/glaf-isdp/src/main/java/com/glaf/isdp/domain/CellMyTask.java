package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

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
import com.glaf.isdp.util.CellMyTaskJsonFactory;

/**
 * ÃÓ±Ì»ŒŒÒ
 */
@Entity
@Table(name = "cell_mytask")
public class CellMyTask implements Serializable, JSONable {
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
	 * fillform_id
	 */
	@Column(name = "fillform_id", length = 50)
	protected String fillformId;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * Task_id
	 */
	@Column(name = "task_id", length = 50)
	protected String taskId;

	/**
	 * filedot_fileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * name
	 */
	@Column(name = "name", length = 250)
	protected String name;

	/**
	 * projname
	 */
	@Column(name = "projname", length = 250)
	protected String projname;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * type_index_id
	 */
	@Column(name = "type_index_id")
	protected int typeIndexId;

	/**
	 * page
	 */
	@Column(name = "page")
	protected int page;

	/**
	 * finishint
	 */
	@Column(name = "finishint")
	protected int finishint;

	/**
	 * formtypeint
	 */
	@Column(name = "formtypeint")
	protected int formtypeint;

	/**
	 * flagint
	 */
	@Column(name = "flagint")
	protected int flagint;

	/**
	 * intinflow
	 */
	@Column(name = "intinflow")
	protected int intinflow;

	/**
	 * main_id
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	/**
	 * intlastpage
	 */
	@Column(name = "intlastpage")
	protected int intlastpage;

	public CellMyTask() {

	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getFillformId() {
		return this.fillformId;
	}

	public int getFinishint() {
		return this.finishint;
	}

	public int getFlagint() {
		return this.flagint;
	}

	public int getFormtypeint() {
		return this.formtypeint;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntinflow() {
		return this.intinflow;
	}

	public int getIntlastpage() {
		return this.intlastpage;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMainId() {
		return this.mainId;
	}

	public String getName() {
		return this.name;
	}

	public int getPage() {
		return this.page;
	}

	public String getProjname() {
		return this.projname;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getTopid() {
		return this.topid;
	}

	public int getTypeIndexId() {
		return this.typeIndexId;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFillformId(String fillformId) {
		this.fillformId = fillformId;
	}

	public void setFinishint(int finishint) {
		this.finishint = finishint;
	}

	public void setFlagint(int flagint) {
		this.flagint = flagint;
	}

	public void setFormtypeint(int formtypeint) {
		this.formtypeint = formtypeint;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntinflow(int intinflow) {
		this.intinflow = intinflow;
	}

	public void setIntlastpage(int intlastpage) {
		this.intlastpage = intlastpage;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTypeIndexId(int typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public CellMyTask jsonToObject(JSONObject jsonObject) {
		return CellMyTaskJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellMyTaskJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellMyTaskJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
