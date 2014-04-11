package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.FlowProcessDefJsonFactory;

@Entity
@Table(name = "flow_process_d")
public class FlowProcessDef implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

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
	 * tcadfile
	 */
	@Lob
	@Column(name = "tcadfile")
	protected byte[] tcadfile;

	/**
	 * issave
	 */
	@Column(name = "issave")
	protected int issave;

	/**
	 * intflag
	 */
	@Column(name = "intflag")
	protected int intflag;

	@javax.persistence.Transient
	protected List<FlowActivityDef> activities = new ArrayList<FlowActivityDef>();

	@javax.persistence.Transient
	protected List<FlowForwardDef> sequenceFlows = new ArrayList<FlowForwardDef>();

	public FlowProcessDef() {

	}

	public void addActivity(FlowActivityDef act) {
		if (activities == null) {
			activities = new ArrayList<FlowActivityDef>();
		}
		activities.add(act);
	}

	public void addSequenceFlow(FlowForwardDef def) {
		if (sequenceFlows == null) {
			sequenceFlows = new ArrayList<FlowForwardDef>();
		}
		sequenceFlows.add(def);
	}

	public List<FlowActivityDef> getActivities() {
		return activities;
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

	public int getIntflag() {
		return this.intflag;
	}

	public int getIssave() {
		return this.issave;
	}

	public String getMainId() {
		return this.mainId;
	}

	public String getName() {
		return this.name;
	}

	public List<FlowForwardDef> getSequenceFlows() {
		return sequenceFlows;
	}

	public byte[] getTcadfile() {
		return this.tcadfile;
	}

	public String getVersion() {
		return this.version;
	}

	public void setActivities(List<FlowActivityDef> activities) {
		this.activities = activities;
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

	public void setIntflag(int intflag) {
		this.intflag = intflag;
	}

	public void setIssave(int issave) {
		this.issave = issave;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSequenceFlows(List<FlowForwardDef> sequenceFlows) {
		this.sequenceFlows = sequenceFlows;
	}

	public void setTcadfile(byte[] tcadfile) {
		this.tcadfile = tcadfile;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public FlowProcessDef jsonToObject(JSONObject jsonObject) {
		return FlowProcessDefJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowProcessDefJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowProcessDefJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
