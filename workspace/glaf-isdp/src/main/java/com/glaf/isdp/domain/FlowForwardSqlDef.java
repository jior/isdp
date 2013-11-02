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
import com.glaf.isdp.util.FlowForwardSqlDefJsonFactory;

@Entity
@Table(name = "flow_forward_sql_d")
public class FlowForwardSqlDef implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * process_id
	 */
	@Column(name = "process_id", length = 50)
	protected String processId;

	/**
	 * flow_forward_d
	 */
	@Column(name = "flow_forward_d", length = 50)
	protected String flowForwardD;

	/**
	 * intandor
	 */
	@Column(name = "intandor")
	protected int intandor;

	/**
	 * sqlcon_type
	 */
	@Column(name = "sqlcon_type")
	protected int sqlconType;

	/**
	 * sqlcon_dtype
	 */
	@Column(name = "sqlcon_dtype", length = 20)
	protected String sqlconDtype;

	/**
	 * sqlcon_field
	 */
	@Column(name = "sqlcon_field", length = 50)
	protected String sqlconField;

	/**
	 * strsp
	 */
	@Column(name = "strsp", length = 10)
	protected String strsp;

	/**
	 * sqlcon_value
	 */
	@Column(name = "sqlcon_value", length = 200)
	protected String sqlconValue;

	/**
	 * sqlconshow
	 */
	@Lob
	@Column(name = "sqlconshow")
	protected String sqlconshow;

	/**
	 * issave
	 */
	@Column(name = "issave")
	protected int issave;

	public FlowForwardSqlDef() {

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

	public FlowForwardSqlDef jsonToObject(JSONObject jsonObject) {
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
