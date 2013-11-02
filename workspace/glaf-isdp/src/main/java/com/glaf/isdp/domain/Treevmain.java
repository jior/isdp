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
import com.glaf.isdp.util.TreevmainJsonFactory;

@Entity
@Table(name = "treevmain")
public class Treevmain implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * ID
	 */
	@Column(name = "ID", length = 100)
	protected String id;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 255)
	protected String indexName;

	/**
	 * nlevel
	 */
	@Column(name = "nlevel")
	protected int nlevel;

	@javax.persistence.Transient
	protected int listno;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * filenum
	 */
	@Column(name = "filenum", length = 200)
	protected String filenum;

	/**
	 * content
	 */
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * vflag
	 */
	@Column(name = "vflag", length = 1)
	protected String vflag;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

	/**
	 * ztype
	 */
	@Column(name = "ztype")
	protected int ztype;

	/**
	 * content2
	 */
	@Column(name = "content2", length = 200)
	protected String content2;

	/**
	 * topnode
	 */
	@Column(name = "topnode", length = 250)
	protected String topnode;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	@javax.persistence.Transient
	protected boolean checked;

	public Treevmain() {

	}

	public String getContent() {
		return this.content;
	}

	public String getContent2() {
		return this.content2;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getId() {
		return id;
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
		return listno;
	}

	public int getNlevel() {
		return this.nlevel;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public String getNum() {
		return this.num;
	}

	public int getParentId() {
		return parentId;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getVflag() {
		return this.vflag;
	}

	public int getZtype() {
		return this.ztype;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
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

	public void setNlevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(int nodeico) {
		this.nodeico = nodeico;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setZtype(int ztype) {
		this.ztype = ztype;
	}

	public Treevmain jsonToObject(JSONObject jsonObject) {
		return TreevmainJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreevmainJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreevmainJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
