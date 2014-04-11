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
import com.glaf.isdp.util.FlowActivityDefJsonFactory;

@Entity
@Table(name = "flow_activ_d")
public class FlowActivityDef implements Serializable, JSONable {
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
	 * intselectuser
	 */
	@Column(name = "intselectuser")
	protected int intselectuser;

	/**
	 * intusedomain
	 */
	@Column(name = "intusedomain")
	protected int intusedomain;

	public FlowActivityDef() {

	}

	public String getContent() {
		return this.content;
	}

	public String getId() {
		return this.id;
	}

	public int getIntselectuser() {
		return this.intselectuser;
	}

	public int getIntusedomain() {
		return this.intusedomain;
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

	public String getName() {
		return this.name;
	}

	public String getNetroleid() {
		return this.netroleid;
	}

	public String getProcessId() {
		return this.processId;
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

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntselectuser(int intselectuser) {
		this.intselectuser = intselectuser;
	}

	public void setIntusedomain(int intusedomain) {
		this.intusedomain = intusedomain;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setNetroleid(String netroleid) {
		this.netroleid = netroleid;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
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

	public FlowActivityDef jsonToObject(JSONObject jsonObject) {
		return FlowActivityDefJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return FlowActivityDefJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return FlowActivityDefJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
