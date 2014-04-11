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
import com.glaf.isdp.util.TreevmainUserJsonFactory;

@Entity
@Table(name = "treevmain_u")
public class TreevmainUser implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 50, nullable = false)
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

	/**
	 * nodetype
	 */
	@Column(name = "nodetype", length = 1)
	protected String nodetype;

	/**
	 * fromid
	 */
	@Column(name = "fromid")
	protected int fromid;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * frmtypeindex
	 */
	@Column(name = "frmtypeindex")
	protected int frmtypeindex;

	/**
	 * showid
	 */
	@Column(name = "showid")
	protected int showid;

	/**
	 * showfrmid
	 */
	@Column(name = "showfrmid", length = 50)
	protected String showfrmid;

	/**
	 * showfrmindex_id
	 */
	@Column(name = "showfrmindex_id")
	protected int showfrmindexId;

	/**
	 * dwid
	 */
	@Column(name = "dwid")
	protected int dwid;

	/**
	 * jid
	 */
	@Column(name = "jid", length = 50)
	protected String jid;

	/**
	 * flid
	 */
	@Column(name = "flid", length = 50)
	protected String flid;

	/**
	 * ctype_id
	 */
	@Column(name = "ctype_id", length = 50)
	protected String ctypeId;

	@javax.persistence.Transient
	protected boolean checked;

	public TreevmainUser() {

	}

	public String getContent() {
		return this.content;
	}

	public String getContent2() {
		return this.content2;
	}

	public String getCtypeId() {
		return this.ctypeId;
	}

	public int getDwid() {
		return this.dwid;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getFlid() {
		return this.flid;
	}

	public int getFrmtypeindex() {
		return this.frmtypeindex;
	}

	public int getFromid() {
		return this.fromid;
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

	public String getJid() {
		return this.jid;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public int getNlevel() {
		return this.nlevel;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public String getNodetype() {
		return this.nodetype;
	}

	public String getNum() {
		return this.num;
	}

	public int getParentId() {
		return parentId;
	}

	public String getShowfrmid() {
		return this.showfrmid;
	}

	public int getShowfrmindexId() {
		return this.showfrmindexId;
	}

	public int getShowid() {
		return this.showid;
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

	public void setCtypeId(String ctypeId) {
		this.ctypeId = ctypeId;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFrmtypeindex(int frmtypeindex) {
		this.frmtypeindex = frmtypeindex;
	}

	public void setFromid(int fromid) {
		this.fromid = fromid;
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

	public void setJid(String jid) {
		this.jid = jid;
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

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setShowfrmid(String showfrmid) {
		this.showfrmid = showfrmid;
	}

	public void setShowfrmindexId(int showfrmindexId) {
		this.showfrmindexId = showfrmindexId;
	}

	public void setShowid(int showid) {
		this.showid = showid;
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

	public TreevmainUser jsonToObject(JSONObject jsonObject) {
		return TreevmainUserJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreevmainUserJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreevmainUserJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
