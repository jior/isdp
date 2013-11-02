package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.glaf.core.base.JSONable;

import com.glaf.isdp.util.MailRecJsonFactory;

@Entity
@Table(name = "email_rec")
public class MailRec implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * email
	 */
	@Column(name = "email", length = 100)
	protected String email;

	/**
	 * msgId
	 */
	@Column(name = "msgId", length = 200)
	protected String msgId;

	/**
	 * Inreplyto
	 */
	@Column(name = "inreplyto", length = 100)
	protected String inReplyTo;

	/**
	 * From
	 */
	@Column(name = "From", length = 100)
	protected String from;

	/**
	 * To
	 */
	@Column(name = "To", length = 1000)
	protected String to;

	/**
	 * CC
	 */
	@Column(name = "CC", length = 1000)
	protected String cc;

	/**
	 * Date
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Date")
	protected Date date;

	/**
	 * Subject
	 */
	@Column(name = "Subject", length = 250)
	protected String subject;

	/**
	 * replyto
	 */
	@Column(name = "replyto", length = 100)
	protected String replyTo;

	/**
	 * Text
	 */
	@Lob
	@Column(name = "Text")
	protected String text;

	/**
	 * HTML
	 */
	@Lob
	@Column(name = "HTML")
	protected String html;

	/**
	 * intflag
	 */
	@Column(name = "intflag")
	protected Integer intflag;

	/**
	 * GUIDFrom
	 */
	@Column(name = "guid_from", length = 50)
	protected String guidFrom;

	@javax.persistence.Transient
	protected List<MailRecAtt> files = new ArrayList<MailRecAtt>();

	public MailRec() {

	}

	public void addFile(MailRecAtt file) {
		if (files == null) {
			files = new ArrayList<MailRecAtt>();
		}
		files.add(file);
	}

	public String getCc() {
		return this.cc;
	}

	public Date getDate() {
		return this.date;
	}

	public String getEmail() {
		return this.email;
	}

	public List<MailRecAtt> getFiles() {
		return files;
	}

	public String getFrom() {
		return this.from;
	}

	public String getGuidFrom() {
		return this.guidFrom;
	}

	public String getHtml() {
		return this.html;
	}

	public String getId() {
		return this.id;
	}

	public String getInReplyTo() {
		return this.inReplyTo;
	}

	public Integer getIntflag() {
		return this.intflag;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public String getReplyTo() {
		return this.replyTo;
	}

	public String getSubject() {
		return this.subject;
	}

	public String getText() {
		return this.text;
	}

	public String getTo() {
		return this.to;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFiles(List<MailRecAtt> files) {
		this.files = files;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setGuidFrom(String guidFrom) {
		this.guidFrom = guidFrom;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public void setIntflag(Integer intflag) {
		this.intflag = intflag;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public MailRec jsonToObject(JSONObject jsonObject) {
		return MailRecJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MailRecJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MailRecJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
