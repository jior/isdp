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
import com.glaf.isdp.util.TreeProjectJsonFactory;

/**
 * 工程分类结构树
 * 
 */
@Entity
@Table(name = "treeproj")
public class TreeProject implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", length = 50, nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * ID
	 */
	@Column(name = "ID", length = 100)
	protected String id;

	/**
	 * top_id
	 */
	@Column(name = "top_id")
	protected int topId;

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
	@Column(name = "num", length = 255)
	protected String num;

	/**
	 * content
	 */
	@Column(name = "content", length = 240)
	protected String content;

	/**
	 * useId
	 */
	@Column(name = "useId", length = 50)
	protected String useId;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

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
	 * projtype
	 */
	@Column(name = "projtype", length = 1)
	protected String projtype;

	/**
	 * unitnum
	 */
	@Column(name = "unitnum", length = 50)
	protected String unitnum;

	/**
	 * showid
	 */
	@Column(name = "showid")
	protected int showid;

	/**
	 * scale_q
	 */
	@Column(name = "scale_q")
	protected Double scaleQ;

	/**
	 * ispegwork
	 */
	@Column(name = "ispegwork", length = 1)
	protected String ispegwork;

	/**
	 * treeproj_user2
	 */
	@Column(name = "treeproj_user2", length = 1000)
	protected String treeprojUser2;

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

	public TreeProject() {

	}

	public String getContent() {
		return this.content;
	}

	public String getContent2() {
		return this.content2;
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

	public String getIspegwork() {
		return this.ispegwork;
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

	public String getProjtype() {
		return this.projtype;
	}

	public Double getScaleQ() {
		return this.scaleQ;
	}

	public int getShowid() {
		return this.showid;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public int getTopId() {
		return this.topId;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getTreeProjectUser2() {
		return this.treeprojUser2;
	}

	public String getTreeprojUser2() {
		return treeprojUser2;
	}

	public String getUnitnum() {
		return this.unitnum;
	}

	public String getUseId() {
		return this.useId;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
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

	public void setIspegwork(String ispegwork) {
		this.ispegwork = ispegwork;
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

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public void setScaleQ(Double scaleQ) {
		this.scaleQ = scaleQ;
	}

	public void setShowid(int showid) {
		this.showid = showid;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setTopId(int topId) {
		this.topId = topId;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTreeProjectUser2(String treeprojUser2) {
		this.treeprojUser2 = treeprojUser2;
	}

	public void setTreeprojUser2(String treeprojUser2) {
		this.treeprojUser2 = treeprojUser2;
	}

	public void setUnitnum(String unitnum) {
		this.unitnum = unitnum;
	}

	public void setUseId(String useId) {
		this.useId = useId;
	}

	public TreeProject jsonToObject(JSONObject jsonObject) {
		return TreeProjectJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreeProjectJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreeProjectJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
