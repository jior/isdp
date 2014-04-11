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
import com.glaf.isdp.util.MycellTaskJsonFactory;

/**
 * 流程定义主表
 */
@Entity
@Table(name = "mycell_tasks")
public class MyCellTask implements Serializable, JSONable {
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
	 * busiess_id
	 */
	@Column(name = "busiess_id", length = 50)
	protected String busiessId;

	/**
	 * celldot_index
	 */
	@Column(name = "celldot_index")
	protected int celldotIndex;

	/**
	 * filedot_fileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * mname
	 */
	@Column(name = "mname", length = 250)
	protected String mname;

	/**
	 * sname
	 */
	@Lob
	@Column(name = "sname")
	protected String sname;

	/**
	 * content
	 */
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	/**
	 * intcreatetype
	 */
	@Column(name = "intcreatetype")
	protected int intcreatetype;

	/**
	 * time1
	 */
	@Column(name = "time1", length = 20)
	protected String time1;

	/**
	 * time2
	 */
	@Column(name = "time2", length = 20)
	protected String time2;

	/**
	 * time3
	 */
	@Column(name = "time3", length = 20)
	protected String time3;

	/**
	 * issave
	 */
	@Column(name = "issave")
	protected int issave;

	/**
	 * isuseworkflow
	 */
	@Column(name = "isuseworkflow")
	protected int isuseworkflow;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * intflowortask
	 */
	@Column(name = "intflowortask")
	protected int intflowortask;

	/**
	 * fileid_press
	 */
	@Column(name = "fileid_press", length = 250)
	protected String fileidPress;

	/**
	 * inshowtaskinfo
	 */
	@Column(name = "inshowtaskinfo", length = 1)
	protected String inshowtaskinfo;

	/**
	 * filenumid
	 */
	@Column(name = "filenumid", length = 50)
	protected String filenumid;

	public MyCellTask() {

	}

	public String getBusiessId() {
		return this.busiessId;
	}

	public int getCelldotIndex() {
		return this.celldotIndex;
	}

	public String getContent() {
		return this.content;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getFileidPress() {
		return this.fileidPress;
	}

	public String getFilenumid() {
		return this.filenumid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getInshowtaskinfo() {
		return this.inshowtaskinfo;
	}

	public int getIntcreatetype() {
		return this.intcreatetype;
	}

	public int getIntflowortask() {
		return this.intflowortask;
	}

	public int getInttype() {
		return this.inttype;
	}

	public int getIssave() {
		return this.issave;
	}

	public String getIsused() {
		return this.isused;
	}

	public int getIsuseworkflow() {
		return this.isuseworkflow;
	}

	public String getMname() {
		return this.mname;
	}

	public String getName() {
		return this.name;
	}

	public String getSname() {
		return this.sname;
	}

	public String getTime1() {
		return this.time1;
	}

	public String getTime2() {
		return this.time2;
	}

	public String getTime3() {
		return this.time3;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setCelldotIndex(int celldotIndex) {
		this.celldotIndex = celldotIndex;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFileidPress(String fileidPress) {
		this.fileidPress = fileidPress;
	}

	public void setFilenumid(String filenumid) {
		this.filenumid = filenumid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setInshowtaskinfo(String inshowtaskinfo) {
		this.inshowtaskinfo = inshowtaskinfo;
	}

	public void setIntcreatetype(int intcreatetype) {
		this.intcreatetype = intcreatetype;
	}

	public void setIntflowortask(int intflowortask) {
		this.intflowortask = intflowortask;
	}

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public void setIssave(int issave) {
		this.issave = issave;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public void setIsuseworkflow(int isuseworkflow) {
		this.isuseworkflow = isuseworkflow;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public void setTime3(String time3) {
		this.time3 = time3;
	}

	public MyCellTask jsonToObject(JSONObject jsonObject) {
		return MycellTaskJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MycellTaskJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MycellTaskJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
