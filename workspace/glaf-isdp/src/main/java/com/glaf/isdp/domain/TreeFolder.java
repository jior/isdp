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
import com.glaf.isdp.util.TreeFolderJsonFactory;

/**
 * 资料管理分类
 */
@Entity
@Table(name = "s_treefolder")
public class TreeFolder implements Serializable, ITree, JSONable {
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
	 * content
	 */
	@Column(name = "content", length = 255)
	protected String content;

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
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 250)
	protected String sindexName;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * filenum
	 */
	@Column(name = "filenum", length = 50)
	protected String filenum;

	/**
	 * ftype
	 */
	@Column(name = "ftype", length = 1)
	protected String ftype;

	/**
	 * ztype
	 */
	@Column(name = "ztype")
	protected int ztype;

	/**
	 * slevel
	 */
	@Column(name = "slevel", length = 30)
	protected String slevel;

	/**
	 * savetime
	 */
	@Column(name = "savetime", length = 10)
	protected String savetime;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	/**
	 * menuindex
	 */
	@Column(name = "menuindex")
	protected int menuindex;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public TreeFolder() {

	}

	public String getContent() {
		return this.content;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getFtype() {
		return this.ftype;
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

	public int getInttype() {
		return this.inttype;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public int getMenuindex() {
		return this.menuindex;
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

	public String getSavetime() {
		return this.savetime;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getSlevel() {
		return this.slevel;
	}

	public int getZtype() {
		return this.ztype;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
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

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setMenuindex(int menuindex) {
		this.menuindex = menuindex;
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

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setZtype(int ztype) {
		this.ztype = ztype;
	}

	public TreeFolder jsonToObject(JSONObject jsonObject) {
		return TreeFolderJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreeFolderJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreeFolderJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
