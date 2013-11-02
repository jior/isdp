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
import com.glaf.isdp.util.ProjectCellAndFileJsonFactory;

@Entity
@Table(name = "proj_cellandfiles")
public class ProjectCellAndFile implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	/**
	 * name
	 */
	@Column(name = "name", length = 200)
	protected String name;

	/**
	 * defId
	 */
	@Column(name = "defId", length = 50)
	protected String defId;

	/**
	 * useId
	 */
	@Column(name = "useId", length = 50)
	protected String useId;

	/**
	 * intPage0
	 */
	@Column(name = "intPage0")
	protected int intPage0;

	/**
	 * intPage1
	 */
	@Column(name = "intPage1")
	protected int intPage1;

	/**
	 * intPage2
	 */
	@Column(name = "intPage2")
	protected int intPage2;

	/**
	 * intfinish
	 */
	@Column(name = "intfinish")
	protected int intfinish;

	@javax.persistence.Transient
	protected String num;

	@javax.persistence.Transient
	protected int sortNo;

	public ProjectCellAndFile() {

	}

	public String getDefId() {
		return this.defId;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIntfinish() {
		return this.intfinish;
	}

	public int getIntPage0() {
		return this.intPage0;
	}

	public int getIntPage1() {
		return this.intPage1;
	}

	public int getIntPage2() {
		return this.intPage2;
	}

	public int getInttype() {
		return this.inttype;
	}

	public String getName() {
		return this.name;
	}

	public String getNum() {
		return num;
	}

	public int getSortNo() {
		return sortNo;
	}

	public String getUseId() {
		return this.useId;
	}

	public void setDefId(String defId) {
		this.defId = defId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIntfinish(int intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntPage0(int intPage0) {
		this.intPage0 = intPage0;
	}

	public void setIntPage1(int intPage1) {
		this.intPage1 = intPage1;
	}

	public void setIntPage2(int intPage2) {
		this.intPage2 = intPage2;
	}

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public ProjectCellAndFile jsonToObject(JSONObject jsonObject) {
		return ProjectCellAndFileJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ProjectCellAndFileJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ProjectCellAndFileJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
