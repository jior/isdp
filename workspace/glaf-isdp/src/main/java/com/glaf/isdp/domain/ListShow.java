package com.glaf.isdp.domain;

import java.io.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.ListShowJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "ListShow")
public class ListShow implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * indexId
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * listId
	 */
	@Column(name = "listId", length = 50)
	protected String listId;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * frmtype
	 */
	@Column(name = "frmtype", length = 30)
	protected String frmtype;

	/**
	 * leftL
	 */
	@Column(name = "left_L")
	protected int leftL;

	/**
	 * topL
	 */
	@Column(name = "top_L")
	protected int topL;

	/**
	 * widthL
	 */
	@Column(name = "width_L")
	protected int widthL;

	/**
	 * heightL
	 */
	@Column(name = "height_L")
	protected int heightL;

	/**
	 * leftC
	 */
	@Column(name = "left_C")
	protected int leftC;

	/**
	 * topC
	 */
	@Column(name = "top_C")
	protected int topC;

	/**
	 * widthC
	 */
	@Column(name = "width_C")
	protected int widthC;

	/**
	 * heightC
	 */
	@Column(name = "height_C")
	protected int heightC;

	public ListShow() {

	}

	public String getFrmtype() {
		return this.frmtype;
	}

	public int getHeightC() {
		return this.heightC;
	}

	public int getHeightL() {
		return this.heightL;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getLeftC() {
		return this.leftC;
	}

	public int getLeftL() {
		return this.leftL;
	}

	public String getListId() {
		return this.listId;
	}

	public int getListno() {
		return this.listno;
	}

	public int getTopC() {
		return this.topC;
	}

	public int getTopL() {
		return this.topL;
	}

	public int getWidthC() {
		return this.widthC;
	}

	public int getWidthL() {
		return this.widthL;
	}

	public void setFrmtype(String frmtype) {
		this.frmtype = frmtype;
	}

	public void setHeightC(int heightC) {
		this.heightC = heightC;
	}

	public void setHeightL(int heightL) {
		this.heightL = heightL;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setLeftC(int leftC) {
		this.leftC = leftC;
	}

	public void setLeftL(int leftL) {
		this.leftL = leftL;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setTopC(int topC) {
		this.topC = topC;
	}

	public void setTopL(int topL) {
		this.topL = topL;
	}

	public void setWidthC(int widthC) {
		this.widthC = widthC;
	}

	public void setWidthL(int widthL) {
		this.widthL = widthL;
	}

	public ListShow jsonToObject(JSONObject jsonObject) {
		return ListShowJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return ListShowJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return ListShowJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
