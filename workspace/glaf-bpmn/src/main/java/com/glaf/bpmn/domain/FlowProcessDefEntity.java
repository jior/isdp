/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.bpmn.domain;

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
import com.glaf.bpmn.util.FlowProcessDefJsonFactory;

@Entity
@Table(name = "flow_process_d")
public class FlowProcessDefEntity implements Serializable, JSONable {
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
	protected String actorId;

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
	protected List<FlowActivityDefEntity> activities = new ArrayList<FlowActivityDefEntity>();

	@javax.persistence.Transient
	protected List<FlowForwardDefEntity> sequenceFlows = new ArrayList<FlowForwardDefEntity>();

	public FlowProcessDefEntity() {

	}

	public void addActivity(FlowActivityDefEntity act) {
		if (activities == null) {
			activities = new ArrayList<FlowActivityDefEntity>();
		}
		activities.add(act);
	}

	public void addSequenceFlow(FlowForwardDefEntity def) {
		if (sequenceFlows == null) {
			sequenceFlows = new ArrayList<FlowForwardDefEntity>();
		}
		sequenceFlows.add(def);
	}

	public List<FlowActivityDefEntity> getActivities() {
		return activities;
	}

	public String getActorId() {
		return this.actorId;
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

	public List<FlowForwardDefEntity> getSequenceFlows() {
		return sequenceFlows;
	}

	public byte[] getTcadfile() {
		return this.tcadfile;
	}

	public String getVersion() {
		return this.version;
	}

	public void setActivities(List<FlowActivityDefEntity> activities) {
		this.activities = activities;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
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

	public void setSequenceFlows(List<FlowForwardDefEntity> sequenceFlows) {
		this.sequenceFlows = sequenceFlows;
	}

	public void setTcadfile(byte[] tcadfile) {
		this.tcadfile = tcadfile;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public FlowProcessDefEntity jsonToObject(JSONObject jsonObject) {
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
