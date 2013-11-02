package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellHintlistJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "cell_hintlist")
public class CellHintlist implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * indexId
	 */
	@Column(name = "index_id")
	protected Integer indexId;

	/**
	 * hint
	 */
	@Column(name = "hint", length = 250)
	protected String hint;

	public CellHintlist() {

	}

	public String getHint() {
		return this.hint;
	}

	public String getId() {
		return this.id;
	}

	public Integer getIndexId() {
		return this.indexId;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public CellHintlist jsonToObject(JSONObject jsonObject) {
		return CellHintlistJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellHintlistJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellHintlistJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
