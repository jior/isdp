package com.glaf.isdp.domain;

import java.io.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellTableTreeJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 系统内置数据表分类
 */
@Entity
@Table(name = "cell_utabletree")
public class CellTableTree implements Serializable, ITree, JSONable {
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
	 * tabletype
	 */
	@Column(name = "tabletype")
	protected int tabletype;

	/**
	 * intdel
	 */
	@Column(name = "intdel")
	protected int intdel;

	/**
	 * busiessId
	 */
	@Column(name = "busiess_id", length = 50)
	protected String busiessId;

	/**
	 * content
	 */
	@Column(name = "content", length = 250)
	protected String content;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * menuindex
	 */
	@Column(name = "menuindex")
	protected int menuindex;

	/**
	 * domainIndex
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	/**
	 * winWidth
	 */
	@Column(name = "win_width")
	protected int winWidth;

	/**
	 * winHeight
	 */
	@Column(name = "win_height")
	protected int winHeight;

	@javax.persistence.Transient
	protected boolean checked;

	public CellTableTree() {

	}

	public String getBusiessId() {
		return this.busiessId;
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

	public int getIntdel() {
		return this.intdel;
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
		return this.parentId;
	}

	public int getTabletype() {
		return this.tabletype;
	}

	public int getWinHeight() {
		return this.winHeight;
	}

	public int getWinWidth() {
		return this.winWidth;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
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

	public void setIntdel(int intdel) {
		this.intdel = intdel;
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

	public void setTabletype(int tabletype) {
		this.tabletype = tabletype;
	}

	public void setWinHeight(int winHeight) {
		this.winHeight = winHeight;
	}

	public void setWinWidth(int winWidth) {
		this.winWidth = winWidth;
	}

	public CellTableTree jsonToObject(JSONObject jsonObject) {
		return CellTableTreeJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellTableTreeJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellTableTreeJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
