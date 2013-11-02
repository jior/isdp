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
import com.glaf.isdp.util.TreewbsJsonFactory;

@Entity
@Table(name = "s_treewbs")
public class Treewbs implements Serializable, ITree, JSONable {
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
	@Column(name = "num", length = 20)
	protected String num;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 255)
	protected String indexName;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

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
	 * pindex_id
	 */
	@Column(name = "pindex_id")
	protected int pindexId;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * intusetname
	 */
	@Column(name = "intusetname")
	protected int intusetname;

	/**
	 * intstartype
	 */
	@Column(name = "intstartype")
	protected int intstartype;

	/**
	 * intstardelayday
	 */
	@Column(name = "intstardelayday")
	protected int intstardelayday;

	/**
	 * intstart_a
	 */
	@Column(name = "intstart_a")
	protected int intstartA;

	/**
	 * intstart_p
	 */
	@Column(name = "intstart_p")
	protected int intstartP;

	/**
	 * intend_a
	 */
	@Column(name = "intend_a")
	protected int intendA;

	/**
	 * intend_p
	 */
	@Column(name = "intend_p")
	protected int intendP;

	/**
	 * intneednode
	 */
	@Column(name = "intneednode")
	protected int intneednode;

	/**
	 * intusetnum
	 */
	@Column(name = "intusetnum")
	protected int intusetnum;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	/**
	 * strfileLocate
	 */
	@Column(name = "strfileLocate", length = 50)
	protected String strfileLocate;

	/**
	 * intnodetype
	 */
	@Column(name = "intnodetype")
	protected int intnodetype;

	/**
	 * intloadfile
	 */
	@Column(name = "intloadfile")
	protected int intloadfile;

	/**
	 * intorglevel
	 */
	@Column(name = "intorglevel")
	protected int intorglevel;

	/**
	 * uindex_id
	 */
	@Column(name = "uindex_id")
	protected int uindexId;

	/**
	 * intstartnode
	 */
	@Column(name = "intstartnode")
	protected Integer intstartnode;

	/**
	 * intrename
	 */
	@Column(name = "intrename")
	protected Integer intrename;

	/**
	 * intsptotal
	 */
	@Column(name = "intsptotal")
	protected Integer intsptotal;

	@javax.persistence.Transient
	protected boolean checked;

	public Treewbs() {

	}

	public Integer getIntsptotal() {
		return intsptotal;
	}

	public void setIntsptotal(Integer intsptotal) {
		this.intsptotal = intsptotal;
	}

	public String getContent() {
		return this.content;
	}

	public int getDomainIndex() {
		return this.domainIndex;
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

	public int getIntendA() {
		return this.intendA;
	}

	public int getIntendP() {
		return this.intendP;
	}

	public int getIntloadfile() {
		return this.intloadfile;
	}

	public int getIntneednode() {
		return this.intneednode;
	}

	public int getIntnodetype() {
		return this.intnodetype;
	}

	public int getIntorglevel() {
		return this.intorglevel;
	}

	public Integer getIntrename() {
		return intrename;
	}

	public int getIntstardelayday() {
		return this.intstardelayday;
	}

	public int getIntstartA() {
		return this.intstartA;
	}

	public Integer getIntstartnode() {
		return intstartnode;
	}

	public int getIntstartP() {
		return this.intstartP;
	}

	public int getIntstartype() {
		return this.intstartype;
	}

	public int getInttype() {
		return this.inttype;
	}

	public int getIntusetname() {
		return this.intusetname;
	}

	public int getIntusetnum() {
		return this.intusetnum;
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

	public int getPindexId() {
		return this.pindexId;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getStrfileLocate() {
		return this.strfileLocate;
	}

	public String getTypeTablename() {
		return this.typeTablename;
	}

	public int getUindexId() {
		return this.uindexId;
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

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
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

	public void setIntendA(int intendA) {
		this.intendA = intendA;
	}

	public void setIntendP(int intendP) {
		this.intendP = intendP;
	}

	public void setIntloadfile(int intloadfile) {
		this.intloadfile = intloadfile;
	}

	public void setIntneednode(int intneednode) {
		this.intneednode = intneednode;
	}

	public void setIntnodetype(int intnodetype) {
		this.intnodetype = intnodetype;
	}

	public void setIntorglevel(int intorglevel) {
		this.intorglevel = intorglevel;
	}

	public void setIntrename(Integer intrename) {
		this.intrename = intrename;
	}

	public void setIntstardelayday(int intstardelayday) {
		this.intstardelayday = intstardelayday;
	}

	public void setIntstartA(int intstartA) {
		this.intstartA = intstartA;
	}

	public void setIntstartnode(Integer intstartnode) {
		this.intstartnode = intstartnode;
	}

	public void setIntstartP(int intstartP) {
		this.intstartP = intstartP;
	}

	public void setIntstartype(int intstartype) {
		this.intstartype = intstartype;
	}

	public void setInttype(int inttype) {
		this.inttype = inttype;
	}

	public void setIntusetname(int intusetname) {
		this.intusetname = intusetname;
	}

	public void setIntusetnum(int intusetnum) {
		this.intusetnum = intusetnum;
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

	public void setPindexId(int pindexId) {
		this.pindexId = pindexId;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setStrfileLocate(String strfileLocate) {
		this.strfileLocate = strfileLocate;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setUindexId(int uindexId) {
		this.uindexId = uindexId;
	}

	public Treewbs jsonToObject(JSONObject jsonObject) {
		return TreewbsJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreewbsJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreewbsJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
