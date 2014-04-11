package com.glaf.isdp.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.glaf.core.base.JSONable;

import com.glaf.isdp.util.MailSendJsonFactory;

@Entity
@Table(name = "email_send")
public class MailSend implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * msgId
	 */
	@Column(name = "msgId", length = 100)
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
	@Column(name = "To", length = 100)
	protected String to;

	/**
	 * CC
	 */
	@Column(name = "CC", length = 100)
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
	@Column(name = "Subject", length = 100)
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
	 * email
	 */
	@Column(name = "email", length = 50)
	protected String email;

	public MailSend() {

	}

	public String getId() {
		return this.id;
	}

	public String getMsgId() {
		return this.msgId;
	}

	public String getInReplyTo() {
		return this.inReplyTo;
	}

	public String getFrom() {
		return this.from;
	}

	public String getTo() {
		return this.to;
	}

	public String getCc() {
		return this.cc;
	}

	public Date getDate() {
		return this.date;
	}

	public String getSubject() {
		return this.subject;
	}

	public String getReplyTo() {
		return this.replyTo;
	}

	public String getText() {
		return this.text;
	}

	public String getHtml() {
		return this.html;
	}

	public Integer getIntflag() {
		return this.intflag;
	}

	public String getEmail() {
		return this.email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public void setInReplyTo(String inReplyTo) {
		this.inReplyTo = inReplyTo;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setReplyTo(String replyTo) {
		this.replyTo = replyTo;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public void setIntflag(Integer intflag) {
		this.intflag = intflag;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public MailSend jsonToObject(JSONObject jsonObject) {
		return MailSendJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return MailSendJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MailSendJsonFactory.toObjectNode(this);
	}

}
