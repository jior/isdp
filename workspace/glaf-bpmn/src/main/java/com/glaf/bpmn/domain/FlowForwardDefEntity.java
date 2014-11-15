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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.bpmn.util.FlowForwardDefJsonFactory;

@Entity
@Table(name = "flow_forward_d")
public class FlowForwardDefEntity implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * 流程定义编号
	 */
	@Column(name = "process_id", length = 50)
	protected String processId;

	/**
	 * 活动编号
	 */
	@Column(name = "activ_id", length = 50)
	protected String activId;

	/**
	 * 前一步活动编号
	 */
	@Column(name = "activ_pre", length = 50)
	protected String activPre;

	/**
	 * 后一步活动编号
	 */
	@Column(name = "activ_next", length = 50)
	protected String activNext;

	/**
	 * 是否保存了,1为保存,0为没保存
	 */
	@Column(name = "issave")
	protected int issave;

	/**
	 * 是否删除了,1为删除
	 */
	@Column(name = "isdel")
	protected int isdel;

	/**
	 * 顺序号,记录图形号用于查找
	 */
	@Column(name = "listno")
	protected int listno;

	public FlowForwardDefEntity() {

	}

	public String getActivId() {
		return this.activId;
	}

	public String getActivNext() {
		return this.activNext;
	}

	public String getActivPre() {
		return this.activPre;
	}

	public String getId() {
		return this.id;
	}

	public int getIsdel() {
		return this.isdel;
	}

	public int getIssave() {
		return this.issave;
	}

	public int getListno() {
		return this.listno;
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setActivId(String activId) {
		this.activId = activId;
	}

	public void setActivNext(String activNext) {
		this.activNext = activNext;
	}

	public void setActivPre(String activPre) {
		this.activPre = activPre;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIsdel(int isdel) {
		this.isdel = isdel;
	}

	public void setIssave(int issave) {
		this.issave = issave;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public FlowForwardDefEntity jsonToObject(JSONObject jsonObject) {
		return FlowForwardDefJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowForwardDefJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowForwardDefJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
