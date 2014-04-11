package com.glaf.isdp.domain;

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
import com.glaf.isdp.util.FlowForwardJsonFactory;

@Entity
@Table(name = "flow_forward")
public class FlowForward implements Serializable, JSONable {
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
	 * activ_d_id
	 */
	@Column(name = "activ_d_id", length = 50)
	protected String activDefId;

	/**
	 * activ_d_next
	 */
	@Column(name = "activ_d_next", length = 50)
	protected String activDefNext;

	/**
	 * sendtype
	 */
	@Column(name = "sendtype")
	protected int sendtype;

	/**
	 * sendtimes
	 */
	@Column(name = "sendtimes")
	protected int sendtimes;

	public FlowForward() {

	}

	public String getActivDefId() {
		return this.activDefId;
	}

	public String getActivDefNext() {
		return this.activDefNext;
	}

	public String getId() {
		return this.id;
	}

	public String getProcessId() {
		return this.processId;
	}

	public int getSendtimes() {
		return this.sendtimes;
	}

	public int getSendtype() {
		return this.sendtype;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setActivDefNext(String activDefNext) {
		this.activDefNext = activDefNext;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setSendtimes(int sendtimes) {
		this.sendtimes = sendtimes;
	}

	public void setSendtype(int sendtype) {
		this.sendtype = sendtype;
	}

	public FlowForward jsonToObject(JSONObject jsonObject) {
		return FlowForwardJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowForwardJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowForwardJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
