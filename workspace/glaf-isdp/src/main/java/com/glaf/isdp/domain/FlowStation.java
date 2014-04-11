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
import com.glaf.isdp.util.FlowStationJsonFactory;

@Entity
@Table(name = "flow_station")
public class FlowStation implements Serializable, JSONable {
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

	public FlowStation() {

	}

	public String getActivDefId() {
		return this.activDefId;
	}

	public String getId() {
		return this.id;
	}

	public String getProcessId() {
		return this.processId;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public FlowStation jsonToObject(JSONObject jsonObject) {
		return FlowStationJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowStationJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowStationJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
