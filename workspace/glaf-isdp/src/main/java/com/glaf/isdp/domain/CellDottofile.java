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
import com.glaf.isdp.util.CellDottofileJsonFactory;

@Entity
@Table(name = "cell_dottofile")
public class CellDottofile implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * treetop_indexid
	 */
	@Column(name = "treetop_indexid")
	protected int treetopIndexid;

	/**
	 * num
	 */
	@Column(name = "num", length = 100)
	protected String num;

	/**
	 * name
	 */
	@Column(name = "name", length = 255)
	protected String name;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	public CellDottofile() {

	}

	public String getId() {
		return this.id;
	}

	public int getListno() {
		return this.listno;
	}

	public String getName() {
		return this.name;
	}

	public String getNum() {
		return this.num;
	}

	public int getTreetopIndexid() {
		return this.treetopIndexid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setTreetopIndexid(int treetopIndexid) {
		this.treetopIndexid = treetopIndexid;
	}

	public CellDottofile jsonToObject(JSONObject jsonObject) {
		return CellDottofileJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellDottofileJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellDottofileJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
