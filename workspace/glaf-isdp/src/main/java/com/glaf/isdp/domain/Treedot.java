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
import com.glaf.isdp.util.TreedotJsonFactory;

/**
 * ±í¸ñÊ÷
 */
@Entity
@Table(name = "treedot")
public class Treedot implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * id
	 */
	@Column(name = "id", length = 100)
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

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * content
	 */
	@Column(name = "content", length = 255)
	protected String content;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * menuid
	 */
	@Column(name = "menuid")
	protected int menuid;

	/**
	 * isend
	 */
	@Column(name = "isend")
	protected int isend;

	/**
	 * sysmenuid
	 */
	@Column(name = "sysmenuid", length = 500)
	protected String sysmenuid;

	/**
	 * type
	 */
	@Column(name = "type")
	protected int type;

	/**
	 * filenumid
	 */
	@Column(name = "filenumid", length = 50)
	protected String filenumid;

	/**
	 * filenumid2
	 */
	@Column(name = "filenumid2", length = 50)
	protected String filenumid2;

	/**
	 * proj_index
	 */
	@Column(name = "proj_index")
	protected int projIndex;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Treedot() {

	}

	public String getContent() {
		return this.content;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public String getFilenumid() {
		return this.filenumid;
	}

	public String getFilenumid2() {
		return this.filenumid2;
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

	public int getIsend() {
		return this.isend;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public int getMenuid() {
		return this.menuid;
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

	public int getProjIndex() {
		return this.projIndex;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getSysmenuid() {
		return this.sysmenuid;
	}

	public int getType() {
		return this.type;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setFilenumid(String filenumid) {
		this.filenumid = filenumid;
	}

	public void setFilenumid2(String filenumid2) {
		this.filenumid2 = filenumid2;
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

	public void setIsend(int isend) {
		this.isend = isend;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMenuid(int menuid) {
		this.menuid = menuid;
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

	public void setProjIndex(int projIndex) {
		this.projIndex = projIndex;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setSysmenuid(String sysmenuid) {
		this.sysmenuid = sysmenuid;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Treedot jsonToObject(JSONObject jsonObject) {
		return TreedotJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreedotJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreedotJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
