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
import com.glaf.isdp.util.CellCriterionTreeJsonFactory;

/**
 * 工程规范
 */
@Entity
@Table(name = "cell_criterion_tree")
public class CellCriterionTree implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * treeproj_index
	 */
	@Column(name = "treeproj_index")
	protected int treeprojIndex;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 250)
	protected String indexName;

	/**
	 * content
	 */
	@Column(name = "content", length = 250)
	protected String content;

	/**
	 * isuse
	 */
	@Column(name = "isuse")
	protected int isuse;

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
	 * id
	 */
	@Column(name = "id", length = 100)
	protected String id;

	/**
	 * inttype
	 */
	@Column(name = "inttype")
	protected int inttype;

	@javax.persistence.Transient
	protected int nlevel;

	@javax.persistence.Transient
	protected boolean checked;

	public CellCriterionTree() {

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

	public int getInttype() {
		return this.inttype;
	}

	public int getIsuse() {
		return this.isuse;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
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

	public int getTreeprojIndex() {
		return this.treeprojIndex;
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

	public void setIsuse(int isuse) {
		this.isuse = isuse;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
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

	public void setTreeprojIndex(int treeprojIndex) {
		this.treeprojIndex = treeprojIndex;
	}

	public CellCriterionTree jsonToObject(JSONObject jsonObject) {
		return CellCriterionTreeJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellCriterionTreeJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellCriterionTreeJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
