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
import com.glaf.isdp.util.NetDotRoleJsonFactory;

@Entity
@Table(name = "net_dot_role")
public class NetDotRole implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * filedot_fileid
	 */
	@Column(name = "filedot_fileid", length = 50)
	protected String filedotFileid;

	/**
	 * role_id
	 */
	@Column(name = "role_id")
	protected int roleId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	public NetDotRole() {

	}

	public String getFiledotFileid() {
		return this.filedotFileid;
	}

	public String getId() {
		return this.id;
	}

	public int getListno() {
		return this.listno;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public NetDotRole jsonToObject(JSONObject jsonObject) {
		return NetDotRoleJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return NetDotRoleJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return NetDotRoleJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
