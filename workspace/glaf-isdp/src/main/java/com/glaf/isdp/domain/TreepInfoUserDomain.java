package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.TreepInfoUserDomainJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "treepinfo_u_domain")
public class TreepInfoUserDomain implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * domainindex
	 */
	@Column(name = "domainindex")
	protected Integer domainindex;

	/**
	 * uindexId
	 */
	@Column(name = "uindex_id")
	protected Integer uindexId;

	public TreepInfoUserDomain() {

	}

	public String getId() {
		return this.id;
	}

	public Integer getDomainindex() {
		return this.domainindex;
	}

	public Integer getUindexId() {
		return this.uindexId;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDomainindex(Integer domainindex) {
		this.domainindex = domainindex;
	}

	public void setUindexId(Integer uindexId) {
		this.uindexId = uindexId;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public TreepInfoUserDomain jsonToObject(JSONObject jsonObject) {
		return TreepInfoUserDomainJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreepInfoUserDomainJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreepInfoUserDomainJsonFactory.toObjectNode(this);
	}

}
