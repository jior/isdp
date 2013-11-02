package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.MailNewJsonFactory;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

@Entity
@Table(name = "email_news")
public class MailNew implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * email
	 */
	@Column(name = "email", length = 50)
	protected String email;

	/**
	 * emailId
	 */
	@Column(name = "email_Id", length = 50)
	protected String emailId;

	/**
	 * intrec
	 */
	@Column(name = "intrec")
	protected Integer intrec;

	public MailNew() {

	}

	public String getId() {
		return this.id;
	}

	public String getEmail() {
		return this.email;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public Integer getIntrec() {
		return this.intrec;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setIntrec(Integer intrec) {
		this.intrec = intrec;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public MailNew jsonToObject(JSONObject jsonObject) {
		return MailNewJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MailNewJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MailNewJsonFactory.toObjectNode(this);
	}

}
