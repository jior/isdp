package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.MycellTaskSubJsonFactory;

/**
 * 流程启动关系定义表
 */
@Entity
@Table(name = "mycell_tasks_sub")
public class MyCellTaskSub implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * tasks_id
	 */
	@Column(name = "tasks_id", length = 50)
	protected String tasksId;

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
	 * inttasktype
	 */
	@Column(name = "inttasktype")
	protected int inttasktype;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * sname
	 */
	@Column(name = "sname", length = 250)
	protected String sname;

	/**
	 * intistasks
	 */
	@Column(name = "intistasks")
	protected int intistasks;

	/**
	 * intprojprocess
	 */
	@Column(name = "intprojprocess")
	protected int intprojprocess;

	/**
	 * intistype
	 */
	@Column(name = "intistype")
	protected int intistype;

	/**
	 * name_tab
	 */
	@Column(name = "name_tab", length = 200)
	protected String nameTab;

	/**
	 * flowid
	 */
	@Column(name = "flowid", length = 50)
	protected String flowid;

	/**
	 * constr
	 */
	@Lob
	@Column(name = "constr")
	protected String constr;

	/**
	 * intcandelcell
	 */
	@Column(name = "intcandelcell")
	protected Integer intcandelcell;

	/**
	 * intcanAddcell
	 */
	@Column(name = "intcanAddcell")
	protected Integer intcanAddcell;

	/**
	 * intwbsnames
	 */
	@Column(name = "intwbsnames")
	protected Integer intwbsnames;

	public MyCellTaskSub() {

	}

	public String getBusiessId() {
		return this.busiessId;
	}

	public int getCelldotIndex() {
		return this.celldotIndex;
	}

	public String getConstr() {
		return this.constr;
	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getFlowid() {
		return this.flowid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public Integer getIntcanAddcell() {
		return intcanAddcell;
	}

	public Integer getIntcandelcell() {
		return intcandelcell;
	}

	public int getIntistasks() {
		return this.intistasks;
	}

	public int getIntistype() {
		return this.intistype;
	}

	public int getIntprojprocess() {
		return this.intprojprocess;
	}

	public int getInttasktype() {
		return this.inttasktype;
	}

	public Integer getIntwbsnames() {
		return intwbsnames;
	}

	public String getNameTab() {
		return this.nameTab;
	}

	public String getSname() {
		return this.sname;
	}

	public String getTasksId() {
		return this.tasksId;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setCelldotIndex(int celldotIndex) {
		this.celldotIndex = celldotIndex;
	}

	public void setConstr(String constr) {
		this.constr = constr;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFlowid(String flowid) {
		this.flowid = flowid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntcanAddcell(Integer intcanAddcell) {
		this.intcanAddcell = intcanAddcell;
	}

	public void setIntcandelcell(Integer intcandelcell) {
		this.intcandelcell = intcandelcell;
	}

	public void setIntistasks(int intistasks) {
		this.intistasks = intistasks;
	}

	public void setIntistype(int intistype) {
		this.intistype = intistype;
	}

	public void setIntprojprocess(int intprojprocess) {
		this.intprojprocess = intprojprocess;
	}

	public void setInttasktype(int inttasktype) {
		this.inttasktype = inttasktype;
	}

	public void setIntwbsnames(Integer intwbsnames) {
		this.intwbsnames = intwbsnames;
	}

	public void setNameTab(String nameTab) {
		this.nameTab = nameTab;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setTasksId(String tasksId) {
		this.tasksId = tasksId;
	}

	public MyCellTaskSub jsonToObject(JSONObject jsonObject) {
		return MycellTaskSubJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MycellTaskSubJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MycellTaskSubJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
