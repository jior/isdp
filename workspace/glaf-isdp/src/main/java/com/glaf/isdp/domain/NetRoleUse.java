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
import com.glaf.isdp.util.NetRoleUseJsonFactory;

/**
 * 角色用户关联表
 */
@Entity
@Table(name = "net_roleuse")
public class NetRoleUse implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected int id;

	/**
	 * roleid 角色编号
	 */
	@Column(name = "roleid")
	protected int roleid;

	/**
	 * cell_treedot表（菜单树）的index_id（主键）
	 */
	@Column(name = "celltreedot_index")
	protected int celltreedotIndex;

	/**
	 * intuserper
	 */
	@Column(name = "intuserper")
	protected int intuserper;

	public NetRoleUse() {

	}

	public int getCelltreedotIndex() {
		return this.celltreedotIndex;
	}

	public int getId() {
		return this.id;
	}

	public int getIntuserper() {
		return this.intuserper;
	}

	public int getRoleid() {
		return this.roleid;
	}

	public void setCelltreedotIndex(int celltreedotIndex) {
		this.celltreedotIndex = celltreedotIndex;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIntuserper(int intuserper) {
		this.intuserper = intuserper;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public NetRoleUse jsonToObject(JSONObject jsonObject) {
		return NetRoleUseJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return NetRoleUseJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return NetRoleUseJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
