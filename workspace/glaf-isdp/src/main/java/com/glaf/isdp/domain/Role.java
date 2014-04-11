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
import com.glaf.isdp.util.RoleJsonFactory;

@Entity
@Table(name = "role")
public class Role implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 50, nullable = false)
	protected String id;

	/**
	 * roleName
	 */
	@Column(name = "roleName", length = 255)
	protected String roleName;

	/**
	 * roletype
	 */
	@Column(name = "roletype", length = 1)
	protected String roletype;

	/**
	 * content
	 */
	@Column(name = "content", length = 255)
	protected String content;

	/**
	 * alldata
	 */
	@Column(name = "alldata", length = 100)
	protected String alldata;

	public Role() {

	}

	public String getAlldata() {
		return this.alldata;
	}

	public String getContent() {
		return this.content;
	}

	public String getId() {
		return id;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public String getRoletype() {
		return this.roletype;
	}

	public void setAlldata(String alldata) {
		this.alldata = alldata;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

	public Role jsonToObject(JSONObject jsonObject) {
		return RoleJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return RoleJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return RoleJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
