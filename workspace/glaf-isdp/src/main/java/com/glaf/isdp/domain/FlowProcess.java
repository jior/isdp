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
import com.glaf.isdp.util.FlowProcessJsonFactory;

@Entity
@Table(name = "flow_process")
public class FlowProcess implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * process_d_id
	 */
	@Column(name = "process_d_id", length = 50)
	protected String processDefId;

	/**
	 * Main_id
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	/**
	 * fileid
	 */
	@Column(name = "fileid", length = 50)
	protected String fileid;

	/**
	 * name
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * content
	 */
	@Column(name = "content", length = 100)
	protected String content;

	/**
	 * actor
	 */
	@Column(name = "actor", length = 40)
	protected String actor;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * version
	 */
	@Column(name = "version", length = 50)
	protected String version;

	/**
	 * state
	 */
	@Column(name = "state")
	protected int state;

	public FlowProcess() {

	}

	public String getActor() {
		return this.actor;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getFileid() {
		return this.fileid;
	}

	public String getId() {
		return this.id;
	}

	public String getMainId() {
		return this.mainId;
	}

	public String getName() {
		return this.name;
	}

	public String getProcessDefId() {
		return this.processDefId;
	}

	public int getState() {
		return this.state;
	}

	public String getVersion() {
		return this.version;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProcessDefId(String processDefId) {
		this.processDefId = processDefId;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public FlowProcess jsonToObject(JSONObject jsonObject) {
		return FlowProcessJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowProcessJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowProcessJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
