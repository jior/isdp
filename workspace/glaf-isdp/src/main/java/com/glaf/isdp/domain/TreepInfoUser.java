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
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.TreepInfoUserJsonFactory;

@Entity
@Table(name = "treepinfo_u")
public class TreepInfoUser implements Serializable, ITree, JSONable {
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
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

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
	 * showid
	 */
	@Column(name = "showid")
	protected int showid;

	/**
	 * projtype
	 */
	@Column(name = "projtype", length = 1)
	protected String projtype;

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
	 * part_id
	 */
	@Column(name = "part_id")
	protected int partId;

	/**
	 * pfiles_index
	 */
	@Column(name = "pfiles_index")
	protected int pfilesIndex;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * strfileLocate
	 */
	@Column(name = "strfileLocate", length = 50)
	protected String strfileLocate;

	@javax.persistence.Transient
	protected boolean checked;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public TreepInfoUser() {

	}

	public int getFromid() {
		return this.fromid;
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

	public int getPartId() {
		return this.partId;
	}

	public int getPfilesIndex() {
		return this.pfilesIndex;
	}

	public String getProjtype() {
		return this.projtype;
	}

	public int getShowid() {
		return this.showid;
	}

	public String getStrfileLocate() {
		return this.strfileLocate;
	}

	public String getTypeTablename() {
		return this.typeTablename;
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

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public void setPfilesIndex(int pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public void setShowid(int showid) {
		this.showid = showid;
	}

	public void setStrfileLocate(String strfileLocate) {
		this.strfileLocate = strfileLocate;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public TreepInfoUser jsonToObject(JSONObject jsonObject) {
		return TreepInfoUserJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreepInfoUserJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreepInfoUserJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
