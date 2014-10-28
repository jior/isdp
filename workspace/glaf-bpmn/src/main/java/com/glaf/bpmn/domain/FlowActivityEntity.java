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

import com.glaf.bpmn.util.FlowActivityJsonFactory;

@Entity
@Table(name = "flow_activ")
public class FlowActivityEntity implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * activ_d_id
	 */
	@Column(name = "activ_d_id", length = 50)
	protected String activDefId;

	@javax.persistence.Transient
	protected String activDefName;

	/**
	 * process_id
	 */
	@Column(name = "process_id", length = 50)
	protected String processId;

	/**
	 * typeofact
	 */
	@Column(name = "typeofact", length = 20)
	protected String typeofact;

	/**
	 * name
	 */
	@Column(name = "name", length = 100)
	protected String name;

	/**
	 * content
	 */
	@Column(name = "content", length = 100)
	protected String content;

	/**
	 * strfuntion
	 */
	@Column(name = "strfuntion", length = 200)
	protected String strfuntion;

	/**
	 * netroleid
	 */
	@Column(name = "netroleid", length = 50)
	protected String netroleid;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 50)
	protected String userId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * timelimit
	 */
	@Column(name = "timelimit")
	protected Double timelimit;

	/**
	 * ctime_start
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime_start")
	protected Date ctimeStart;

	/**
	 * ctime_end
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime_end")
	protected Date ctimeEnd;

	/**
	 * state
	 */
	@Column(name = "state")
	protected int state;

	/**
	 * intback
	 */
	@Column(name = "intback")
	protected int intback;

	public FlowActivityEntity() {

	}

	public String getActivDefId() {
		return this.activDefId;
	}

	public String getActivDefName() {
		return activDefName;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtimeEnd() {
		return this.ctimeEnd;
	}

	public Date getCtimeStart() {
		return this.ctimeStart;
	}

	public String getId() {
		return this.id;
	}

	public int getIntback() {
		return this.intback;
	}

	public int getListno() {
		return this.listno;
	}

	public String getName() {
		return this.name;
	}

	public String getNetroleid() {
		return this.netroleid;
	}

	public String getProcessId() {
		return this.processId;
	}

	public int getState() {
		return this.state;
	}

	public String getStrfuntion() {
		return this.strfuntion;
	}

	public Double getTimelimit() {
		return this.timelimit;
	}

	public String getTypeofact() {
		return this.typeofact;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setActivDefName(String activDefName) {
		this.activDefName = activDefName;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtimeEnd(Date ctimeEnd) {
		this.ctimeEnd = ctimeEnd;
	}

	public void setCtimeStart(Date ctimeStart) {
		this.ctimeStart = ctimeStart;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntback(int intback) {
		this.intback = intback;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNetroleid(String netroleid) {
		this.netroleid = netroleid;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setStrfuntion(String strfuntion) {
		this.strfuntion = strfuntion;
	}

	public void setTimelimit(Double timelimit) {
		this.timelimit = timelimit;
	}

	public void setTypeofact(String typeofact) {
		this.typeofact = typeofact;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public FlowActivityEntity jsonToObject(JSONObject jsonObject) {
		return FlowActivityJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowActivityJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowActivityJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}