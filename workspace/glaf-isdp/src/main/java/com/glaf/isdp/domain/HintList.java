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
import com.glaf.isdp.util.HintListJsonFactory;

@Entity
@Table(name = "hintlist")
public class HintList implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * hintid
	 */
	@Column(name = "hintid", length = 50)
	protected String hintid;

	/**
	 * list
	 */
	@Column(name = "list", length = 100)
	protected String list;

	/**
	 * content
	 */
	@Column(name = "content", length = 100)
	protected String content;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * hintdata
	 */
	@Column(name = "hintdata")
	protected int hintdata;

	public HintList() {

	}

	public String getContent() {
		return this.content;
	}

	public int getHintdata() {
		return this.hintdata;
	}

	public String getHintid() {
		return this.hintid;
	}

	public String getId() {
		return this.id;
	}

	public String getList() {
		return this.list;
	}

	public int getListno() {
		return this.listno;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setHintdata(int hintdata) {
		this.hintdata = hintdata;
	}

	public void setHintid(String hintid) {
		this.hintid = hintid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setList(String list) {
		this.list = list;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public HintList jsonToObject(JSONObject jsonObject) {
		return HintListJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return HintListJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return HintListJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
