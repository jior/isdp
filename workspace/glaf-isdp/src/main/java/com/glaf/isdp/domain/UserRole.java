package com.glaf.isdp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.UserRoleJsonFactory;

@Entity
@Table(name = "userrole")
public class UserRole implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 50, nullable = false)
	protected String id;

	/**
	 * roleid
	 */
	@Column(name = "roleid", length = 255)
	protected String roleid;

	/**
	 * userid
	 */
	@Column(name = "userid", length = 255)
	protected String userid;

	/**
	 * Rsysid
	 */
	@Column(name = "Rsysid", length = 50)
	protected String rsysid;

	/**
	 * Ruserid
	 */
	@Column(name = "Ruserid", length = 20)
	protected String ruserid;

	public UserRole() {

	}

	public String getId() {
		return id;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public String getRsysid() {
		return rsysid;
	}

	public String getRuserid() {
		return ruserid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public void setRsysid(String rsysid) {
		this.rsysid = rsysid;
	}

	public void setRuserid(String ruserid) {
		this.ruserid = ruserid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public UserRole jsonToObject(JSONObject jsonObject) {
		return UserRoleJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return UserRoleJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return UserRoleJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
