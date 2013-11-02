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
import com.glaf.isdp.util.TreepurJsonFactory;

@Entity
@Table(name = "treepur")
public class Treepur implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 255)
	protected String indexName;

	/**
	 * modulenum
	 */
	@Column(name = "modulenum")
	protected int modulenum;

	/**
	 * content
	 */
	@Column(name = "content", length = 255)
	protected String content;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	@javax.persistence.Transient
	protected int nlevel;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Treepur() {

	}

	public String getContent() {
		return this.content;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public int getModulenum() {
		return this.modulenum;
	}

	public int getParentId() {
		return parentId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setModulenum(int modulenum) {
		this.modulenum = modulenum;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public Treepur jsonToObject(JSONObject jsonObject) {
		return TreepurJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreepurJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreepurJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
