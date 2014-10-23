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

import java.io.*;
import java.util.*;

import javax.persistence.*;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.base.modules.sys.model.ITree;
import com.glaf.core.base.JSONable;
import com.glaf.bpmn.util.UserTaskJsonFactory;

@Entity
@Table(name = "user_task")
public class UserTask implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id")
	protected int indexId;

	@Column(name = "id", nullable = false)
	protected String id;

	/**
	 * parentId
	 */
	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * actorId
	 */
	@Column(name = "actorId", length = 50)
	protected String actorId;

	/**
	 * name
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * indexName
	 */
	@Column(name = "index_name", length = 200)
	protected String indexName;

	/**
	 * activityId
	 */
	@Column(name = "activityId", length = 50)
	protected String activityId;

	/**
	 * startTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startTime")
	protected Date startTime;

	/**
	 * endTime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "endTime")
	protected Date endTime;

	/**
	 * state
	 */
	@Column(name = "state")
	protected int state;

	/**
	 * timelimit
	 */
	@Column(name = "timelimit")
	protected int timelimit;

	/**
	 * lastModified
	 */
	@Column(name = "lastModified")
	protected long lastModified;

	@Column(name = "listno")
	protected int listno;

	@Column(name = "nlevel")
	protected int level;

	@javax.persistence.Transient
	protected boolean checked;

	@javax.persistence.Transient
	protected String cls;

	public UserTask() {

	}

	public String getActivityId() {
		return this.activityId;
	}

	public String getActorId() {
		return this.actorId;
	}

	public String getCls() {
		return cls;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return indexId;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public long getLastModified() {
		return this.lastModified;
	}

	public int getLevel() {
		return level;
	}

	public int getListno() {
		return listno;
	}

	public String getName() {
		return this.name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public int getState() {
		return this.state;
	}

	public int getTimelimit() {
		return this.timelimit;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void setTimelimit(int timelimit) {
		this.timelimit = timelimit;
	}

	public UserTask jsonToObject(JSONObject jsonObject) {
		return UserTaskJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return UserTaskJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return UserTaskJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
