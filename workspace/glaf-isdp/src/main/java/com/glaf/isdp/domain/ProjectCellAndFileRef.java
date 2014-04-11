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
import com.glaf.isdp.util.ProjectCellAndFileRefJsonFactory;

@Entity
@Table(name = "proj_cellandfiles_cell")
public class ProjectCellAndFileRef implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * pfileid
	 */
	@Column(name = "pfileid", length = 50)
	protected String pfileid;

	/**
	 * cellid
	 */
	@Column(name = "cellid", length = 50)
	protected String cellid;

	public ProjectCellAndFileRef() {

	}

	public String getCellid() {
		return this.cellid;
	}

	public String getId() {
		return this.id;
	}

	public String getPfileid() {
		return this.pfileid;
	}

	public void setCellid(String cellid) {
		this.cellid = cellid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPfileid(String pfileid) {
		this.pfileid = pfileid;
	}

	public ProjectCellAndFileRef jsonToObject(JSONObject jsonObject) {
		return ProjectCellAndFileRefJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ProjectCellAndFileRefJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ProjectCellAndFileRefJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
