package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.TreetopJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 文件报审分类
 */
@Entity
@Table(name = "treetop")
public class Treetop implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", length = 50, nullable = false)
	protected int indexId;

	/**
	 * id
	 */
	@Column(name = "id", length = 100)
	protected String id;

	/**
	 * parentId
	 */
	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * indexName
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
	@Column(name = "content", length = 200)
	protected String content;

	/**
	 * ftype
	 */
	@Column(name = "ftype", length = 1)
	protected String ftype;

	/**
	 * sindexName
	 */
	@Column(name = "sindex_name", length = 255)
	protected String secondIndexName;

	/**
	 * filenum
	 */
	@Column(name = "filenum", length = 200)
	protected String filenum;

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
	 * isnotshow
	 */
	@Column(name = "isnotshow", length = 1)
	protected String isnotshow;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * filenumid
	 */
	@Column(name = "filenumid", length = 50)
	protected String filenumid;

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

	@javax.persistence.Transient
	protected int listno;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public Treetop() {

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

	public String getFilenumid() {
		return this.filenumid;
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

	public String getIsnotshow() {
		return this.isnotshow;
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
		return this.parentId;
	}

	public String getSavetime() {
		return this.savetime;
	}

	public String getSecondIndexName() {
		return this.secondIndexName;
	}

	public String getSlevel() {
		return this.slevel;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public int getZtype() {
		return this.ztype;
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

	public void setFilenumid(String filenumid) {
		this.filenumid = filenumid;
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

	public void setIsnotshow(String isnotshow) {
		this.isnotshow = isnotshow;
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

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSecondIndexName(String secondIndexName) {
		this.secondIndexName = secondIndexName;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setZtype(int ztype) {
		this.ztype = ztype;
	}

	public Treetop jsonToObject(JSONObject jsonObject) {
		return TreetopJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreetopJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreetopJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
