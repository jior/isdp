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
import com.glaf.isdp.util.TreepnameJsonFactory;

@Entity
@Table(name = "treepname")
public class IsdpTreepname implements Serializable, ITree, JSONable {
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
	 * showid
	 */
	@Column(name = "showid")
	protected int showid;

	/**
	 * ruleId
	 */
	@Column(name = "ruleId", length = 50)
	protected String ruleId;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * fruleId
	 */
	@Column(name = "fruleId", length = 50)
	protected String fruleId;

	/**
	 * wcompany
	 */
	@Column(name = "wcompany", length = 250)
	protected String wcompany;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * sys_id
	 */
	@Column(name = "sys_id", length = 50)
	protected String sysId;

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

	public IsdpTreepname() {

	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public String getFruleId() {
		return this.fruleId;
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
		return this.listno;
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

	public String getRuleId() {
		return this.ruleId;
	}

	public int getShowid() {
		return this.showid;
	}

	public String getSysId() {
		return this.sysId;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setFruleId(String fruleId) {
		this.fruleId = fruleId;
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

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public void setShowid(int showid) {
		this.showid = showid;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public IsdpTreepname jsonToObject(JSONObject jsonObject) {
		return TreepnameJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreepnameJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreepnameJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
