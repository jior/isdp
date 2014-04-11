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
import com.glaf.isdp.util.RoleUseJsonFactory;

/**
 * 角色用到的功能权限
 */
@Entity
@Table(name = "roleuse")
public class RoleUse implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * roleId
	 */
	@Column(name = "roleId", length = 50)
	protected String roleId;

	/**
	 * usetype
	 */
	@Column(name = "usetype", length = 1)
	protected String usetype;

	/**
	 * pid
	 */
	@Column(name = "pid")
	protected int pid;

	public RoleUse() {

	}

	public String getId() {
		return this.id;
	}

	public int getPid() {
		return this.pid;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public String getUsetype() {
		return this.usetype;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public void setUsetype(String usetype) {
		this.usetype = usetype;
	}

	public RoleUse jsonToObject(JSONObject jsonObject) {
		return RoleUseJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return RoleUseJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return RoleUseJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
