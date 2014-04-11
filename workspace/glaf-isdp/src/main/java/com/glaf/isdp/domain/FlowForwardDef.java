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
import com.glaf.isdp.util.FlowForwardDefJsonFactory;

@Entity
@Table(name = "flow_forward_d")
public class FlowForwardDef implements Serializable, JSONable {
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
	 * activ_id
	 */
	@Column(name = "activ_id", length = 50)
	protected String activId;

	/**
	 * activ_pre
	 */
	@Column(name = "activ_pre", length = 50)
	protected String activPre;

	/**
	 * activ_next
	 */
	@Column(name = "activ_next", length = 50)
	protected String activNext;

	/**
	 * issave
	 */
	@Column(name = "issave")
	protected int issave;

	/**
	 * isdel
	 */
	@Column(name = "isdel")
	protected int isdel;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	public FlowForwardDef() {

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

	public FlowForwardDef jsonToObject(JSONObject jsonObject) {
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
