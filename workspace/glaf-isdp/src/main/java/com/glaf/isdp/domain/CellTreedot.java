package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellTreedotJsonFactory;

/**
 * ²Ëµ¥Ê÷£¨°´Å¥£©
 */
@Entity
@Table(name = "cell_treedot")
public class CellTreedot implements Serializable, ITree, JSONable {
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
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * viewtype
	 */
	@Column(name = "viewtype")
	protected int viewtype;

	/**
	 * ismode
	 */
	@Column(name = "ismode", length = 1)
	protected String ismode;

	/**
	 * modetable_id
	 */
	@Column(name = "modetable_id", length = 50)
	protected String modetableId;

	/**
	 * issystem
	 */
	@Column(name = "issystem")
	protected int issystem;

	/**
	 * customData
	 */
	@Column(name = "customData", length = 50)
	protected String customData;

	/**
	 * intsystemselect
	 */
	@Column(name = "intsystemselect")
	protected int intsystemselect;

	/**
	 * intused
	 */
	@Column(name = "intused")
	protected int intused;

	/**
	 * intdel
	 */
	@Column(name = "intdel")
	protected int intdel;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * intoperation
	 */
	@Column(name = "intoperation")
	protected int intoperation;

	/**
	 * picfile
	 */
	@Column(name = "picfile", length = 250)
	protected String picfile;

	/**
	 * file_content
	 */
	@Lob
	@Column(name = "file_content")
	protected byte[] fileContent;

	/**
	 * intMuiFrm
	 */
	@Column(name = "intMuiFrm")
	protected int intMuiFrm;

	/**
	 * intnoshow
	 */
	@Column(name = "intnoshow")
	protected int intnoshow;

	/**
	 * type_basetable
	 */
	@Column(name = "type_basetable", length = 50)
	protected String typeBasetable;

	/**
	 * type_index
	 */
	@Column(name = "type_index")
	protected int typeIndex;

	/**
	 * gid
	 */
	@Column(name = "gid", length = 50)
	protected String gid;

	@javax.persistence.Transient
	protected boolean checked;

	@javax.persistence.Transient
	protected Collection<CellTreedot> children = new ArrayList<CellTreedot>();

	public CellTreedot() {

	}

	public void addChild(CellTreedot child) {
		if (children == null) {
			children = new ArrayList<CellTreedot>();
		}
		children.add(child);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CellTreedot other = (CellTreedot) obj;
		if (indexId != other.indexId)
			return false;
		return true;
	}

	public Collection<CellTreedot> getChildren() {
		return children;
	}

	public String getContent() {
		return this.content;
	}

	public String getCustomData() {
		return this.customData;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public String getGid() {
		return this.gid;
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

	public int getIntdel() {
		return this.intdel;
	}

	public int getIntMuiFrm() {
		return this.intMuiFrm;
	}

	public int getIntnoshow() {
		return this.intnoshow;
	}

	public int getIntoperation() {
		return this.intoperation;
	}

	public int getIntsystemselect() {
		return this.intsystemselect;
	}

	public int getIntused() {
		return this.intused;
	}

	public String getIsmode() {
		return this.ismode;
	}

	public int getIssystem() {
		return this.issystem;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public int getListno() {
		return this.listno;
	}

	public String getModetableId() {
		return this.modetableId;
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

	public String getPicfile() {
		return this.picfile;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getTypeBasetable() {
		return this.typeBasetable;
	}

	public int getTypeIndex() {
		return this.typeIndex;
	}

	public String getTypeTablename() {
		return this.typeTablename;
	}

	public int getViewtype() {
		return this.viewtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + indexId;
		return result;
	}

	public boolean isChecked() {
		return checked;
	}

	public void removeChild(CellTreedot child) {
		if (children != null) {
			children.remove(child);
		}
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setChildren(Collection<CellTreedot> children) {
		this.children = children;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setGid(String gid) {
		this.gid = gid;
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

	public void setIntdel(int intdel) {
		this.intdel = intdel;
	}

	public void setIntMuiFrm(int intMuiFrm) {
		this.intMuiFrm = intMuiFrm;
	}

	public void setIntnoshow(int intnoshow) {
		this.intnoshow = intnoshow;
	}

	public void setIntoperation(int intoperation) {
		this.intoperation = intoperation;
	}

	public void setIntsystemselect(int intsystemselect) {
		this.intsystemselect = intsystemselect;
	}

	public void setIntused(int intused) {
		this.intused = intused;
	}

	public void setIsmode(String ismode) {
		this.ismode = ismode;
	}

	public void setIssystem(int issystem) {
		this.issystem = issystem;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setModetableId(String modetableId) {
		this.modetableId = modetableId;
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

	public void setPicfile(String picfile) {
		this.picfile = picfile;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setTypeBasetable(String typeBasetable) {
		this.typeBasetable = typeBasetable;
	}

	public void setTypeIndex(int typeIndex) {
		this.typeIndex = typeIndex;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setViewtype(int viewtype) {
		this.viewtype = viewtype;
	}

	public CellTreedot jsonToObject(JSONObject jsonObject) {
		return CellTreedotJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellTreedotJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellTreedotJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
