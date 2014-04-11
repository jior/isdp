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
import com.glaf.isdp.util.HintJsonFactory;

@Entity
@Table(name = "hint")
public class Hint implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * hint
	 */
	@Column(name = "hint", length = 250)
	protected String hint;

	public Hint() {

	}

	public String getHint() {
		return this.hint;
	}

	public String getId() {
		return this.id;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Hint jsonToObject(JSONObject jsonObject) {
		return HintJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return HintJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return HintJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
