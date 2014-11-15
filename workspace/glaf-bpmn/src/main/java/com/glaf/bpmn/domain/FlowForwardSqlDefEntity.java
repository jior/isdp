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
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.bpmn.util.FlowForwardSqlDefJsonFactory;

@Entity
@Table(name = "flow_forward_sql_d")
public class FlowForwardSqlDefEntity implements Serializable, JSONable {
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
	 * 活动条件转发ID
	 */
	@Column(name = "flow_forward_d", length = 50)
	protected String flowForwardD;

	/**
	 * intandor
	 */
	@Column(name = "intandor")
	protected int intandor;

	/**
	 * 条件类型,0为任务单条件,1为外接条件
	 */
	@Column(name = "sqlcon_type")
	protected int sqlconType;

	/**
	 * 字段类型
	 */
	@Column(name = "sqlcon_dtype", length = 20)
	protected String sqlconDtype;

	/**
	 * 转发条件,字段
	 */
	@Column(name = "sqlcon_field", length = 50)
	protected String sqlconField;

	/**
	 * 条件
	 */
	@Column(name = "strsp", length = 10)
	protected String strsp;

	/**
	 * 值
	 */
	@Column(name = "sqlcon_value", length = 200)
	protected String sqlconValue;

	/**
	 * 转发条件显示
	 */
	@Lob
	@Column(name = "sqlconshow")
	protected String sqlconshow;

	/**
	 * 是否保存了,1为保存,0为没保存
	 */
	@Column(name = "issave")
	protected int issave;

	public FlowForwardSqlDefEntity() {

	}

	public String getFlowForwardD() {
		return this.flowForwardD;
	}

	public String getId() {
		return this.id;
	}

	public int getIntandor() {
		return this.intandor;
	}

	public int getIssave() {
		return this.issave;
	}

	public String getProcessId() {
		return this.processId;
	}

	public String getSqlconDtype() {
		return this.sqlconDtype;
	}

	public String getSqlconField() {
		return this.sqlconField;
	}

	public String getSqlconshow() {
		return this.sqlconshow;
	}

	public int getSqlconType() {
		return this.sqlconType;
	}

	public String getSqlconValue() {
		return this.sqlconValue;
	}

	public String getStrsp() {
		return this.strsp;
	}

	public void setFlowForwardD(String flowForwardD) {
		this.flowForwardD = flowForwardD;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntandor(int intandor) {
		this.intandor = intandor;
	}

	public void setIssave(int issave) {
		this.issave = issave;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setSqlconDtype(String sqlconDtype) {
		this.sqlconDtype = sqlconDtype;
	}

	public void setSqlconField(String sqlconField) {
		this.sqlconField = sqlconField;
	}

	public void setSqlconshow(String sqlconshow) {
		this.sqlconshow = sqlconshow;
	}

	public void setSqlconType(int sqlconType) {
		this.sqlconType = sqlconType;
	}

	public void setSqlconValue(String sqlconValue) {
		this.sqlconValue = sqlconValue;
	}

	public void setStrsp(String strsp) {
		this.strsp = strsp;
	}

	public FlowForwardSqlDefEntity jsonToObject(JSONObject jsonObject) {
		return FlowForwardSqlDefJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowForwardSqlDefJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowForwardSqlDefJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
