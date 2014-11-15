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
import com.glaf.bpmn.util.FlowProcessJsonFactory;

@Entity
@Table(name = "flow_process")
public class FlowProcessEntity implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流程实例编号
	 */
	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * 流程定义编号
	 */
	@Column(name = "process_d_id", length = 50)
	protected String processDefId;

	/**
	 * 业务编号
	 */
	@Column(name = "main_id", length = 50)
	protected String mainId;

	/**
	 * 模板ID,从中取得依赖转发的数据
	 */
	@Column(name = "fileid", length = 50)
	protected String fileid;

	/**
	 * 流程名称
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * 描述
	 */
	@Column(name = "content", length = 100)
	protected String content;

	/**
	 * 创建者
	 */
	@Column(name = "actor", length = 40)
	protected String actorId;

	/**
	 * 创建日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * 版本
	 */
	@Column(name = "version", length = 50)
	protected String version;

	/**
	 * 状态
	 */
	@Column(name = "state")
	protected int state;

	public FlowProcessEntity() {

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

	public FlowProcessEntity jsonToObject(JSONObject jsonObject) {
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
