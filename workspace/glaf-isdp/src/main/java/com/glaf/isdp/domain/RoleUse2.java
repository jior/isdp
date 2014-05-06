package com.glaf.isdp.domain;

import java.io.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.RoleUse2JsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "roleuse2")
public class RoleUse2 implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * roleId
	 */
	@Column(name = "roleID", length = 50)
	protected String roleId;

	/**
	 * useType
	 */
	@Column(name = "usetype", length = 1)
	protected String useType;

	/**
	 * pid
	 */
	@Column(name = "pid")
	protected int pid;

	/**
	 * treeType
	 */
	@Column(name = "treetype")
	protected int treeType;

	/**
	 * userchk
	 */
	@Column(name = "userchk", length = 1)
	protected String userchk;

	/**
	 * treeId 当roleId取值是角色（net_role的id字段）时关联cell_setmymenu表的id字段（或busiess_id?）
	 */
	@Column(name = "treeid", length = 250)
	protected String treeId;

	public RoleUse2() {

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

	public String getTreeId() {
		return this.treeId;
	}

	public int getTreeType() {
		return this.treeType;
	}

	public String getUserchk() {
		return this.userchk;
	}

	public String getUseType() {
		return this.useType;
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

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	public void setTreeType(int treeType) {
		this.treeType = treeType;
	}

	public void setUserchk(String userchk) {
		this.userchk = userchk;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public RoleUse2 jsonToObject(JSONObject jsonObject) {
		return RoleUse2JsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return RoleUse2JsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return RoleUse2JsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
