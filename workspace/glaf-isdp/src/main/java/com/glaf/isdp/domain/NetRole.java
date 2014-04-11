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
import com.glaf.isdp.util.NetRoleJsonFactory;

@Entity
@Table(name = "net_role")
public class NetRole implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected int id;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * rolename
	 */
	@Column(name = "rolename", length = 100)
	protected String rolename;

	/**
	 * roleuse
	 */
	@Column(name = "roleuse")
	protected int roleuse;

	/**
	 * content
	 */
	@Column(name = "content", length = 250)
	protected String content;

	/**
	 * roletype
	 */
	@Column(name = "roletype")
	protected int roletype;

	/**
	 * busiess_id
	 */
	@Column(name = "busiess_id", length = 50)
	protected String busiessId;

	/**
	 * tasksort
	 */
	@Column(name = "tasksort")
	protected int tasksort;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	@javax.persistence.Transient
	protected int sortNo;

	public NetRole() {

	}

	public String getBusiessId() {
		return this.busiessId;
	}

	public String getContent() {
		return this.content;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public int getId() {
		return this.id;
	}

	public int getListno() {
		return this.listno;
	}

	public String getName() {
		return this.rolename;
	}

	public String getRolename() {
		return this.rolename;
	}

	public int getRoletype() {
		return this.roletype;
	}

	public int getRoleuse() {
		return this.roleuse;
	}

	public int getSortNo() {
		return sortNo;
	}

	public int getTasksort() {
		return this.tasksort;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setName(String rolename) {
		this.rolename = rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setRoletype(int roletype) {
		this.roletype = roletype;
	}

	public void setRoleuse(int roleuse) {
		this.roleuse = roleuse;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public void setTasksort(int tasksort) {
		this.tasksort = tasksort;
	}

	public NetRole jsonToObject(JSONObject jsonObject) {
		return NetRoleJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return NetRoleJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return NetRoleJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
