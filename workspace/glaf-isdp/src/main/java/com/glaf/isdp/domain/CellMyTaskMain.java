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

import com.glaf.isdp.util.CellMyTaskMainJsonFactory;

/**
 * 流程任务主表（实例）
 */
@Entity
@Table(name = "cell_mytaskmain")
public class CellMyTaskMain implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

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
	 * flagint
	 */
	@Column(name = "flagint")
	protected int flagint;

	/**
	 * mycell_tasks_id
	 */
	@Column(name = "mycell_tasks_id", length = 50)
	protected String mycellTasksId;

	/**
	 * fromtasksid
	 */
	@Column(name = "fromtasksid", length = 50)
	protected String fromtasksid;

	/**
	 * totaskid
	 */
	@Column(name = "totaskid", length = 50)
	protected String totaskid;

	/**
	 * intfinish
	 */
	@Column(name = "intfinish")
	protected int intfinish;

	/**
	 * file_content
	 */
	@Lob
	@Column(name = "file_content")
	protected byte[] fileContent;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * type_id
	 */
	@Column(name = "type_id", length = 50)
	protected String typeId;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 20)
	protected String userid;

	/**
	 * netroleid
	 */
	@Column(name = "netroleid", length = 50)
	protected String netroleid;

	/**
	 * intisflow
	 */
	@Column(name = "intisflow")
	protected int intisflow;

	/**
	 * intStop
	 */
	@Column(name = "intStop")
	protected int intStop;

	/**
	 * filetype_index
	 */
	@Column(name = "filetype_index")
	protected int filetypeIndex;

	public CellMyTaskMain() {

	}

	public Date getCtime() {
		return this.ctime;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public int getFiletypeIndex() {
		return this.filetypeIndex;
	}

	public int getFlagint() {
		return this.flagint;
	}

	public String getFromtasksid() {
		return this.fromtasksid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntfinish() {
		return this.intfinish;
	}

	public int getIntisflow() {
		return this.intisflow;
	}

	public int getIntStop() {
		return this.intStop;
	}

	public int getListno() {
		return this.listno;
	}

	public String getMycellTasksId() {
		return this.mycellTasksId;
	}

	public String getName() {
		return this.name;
	}

	public String getNetroleid() {
		return this.netroleid;
	}

	public String getProjname() {
		return this.projname;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public String getTotaskid() {
		return this.totaskid;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public int getTypeIndexId() {
		return this.typeIndexId;
	}

	public String getTypeTablename() {
		return this.typeTablename;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setFiletypeIndex(int filetypeIndex) {
		this.filetypeIndex = filetypeIndex;
	}

	public void setFlagint(int flagint) {
		this.flagint = flagint;
	}

	public void setFromtasksid(String fromtasksid) {
		this.fromtasksid = fromtasksid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntfinish(int intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntisflow(int intisflow) {
		this.intisflow = intisflow;
	}

	public void setIntStop(int intStop) {
		this.intStop = intStop;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMycellTasksId(String mycellTasksId) {
		this.mycellTasksId = mycellTasksId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNetroleid(String netroleid) {
		this.netroleid = netroleid;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTotaskid(String totaskid) {
		this.totaskid = totaskid;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIndexId(int typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public CellMyTaskMain jsonToObject(JSONObject jsonObject) {
		return CellMyTaskMainJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellMyTaskMainJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellMyTaskMainJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
