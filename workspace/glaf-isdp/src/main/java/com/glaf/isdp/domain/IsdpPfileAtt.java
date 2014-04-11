package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;

import com.glaf.isdp.util.PfileAttJsonFactory;

@Entity
@Table(name = "pfile_att")
public class IsdpPfileAtt implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * list_id
	 */
	@Column(name = "list_id")
	protected Long listId;

	/**
	 * topid
	 */
	@Column(name = "topid", length = 50)
	protected String topid;

	/**
	 * tname
	 */
	@Column(name = "tname", length = 1000)
	protected String tname;

	/**
	 * duty
	 */
	@Column(name = "duty", length = 100)
	protected String duty;

	/**
	 * tagnum
	 */
	@Column(name = "tagnum", length = 50)
	protected String tagnum;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * pageno
	 */
	@Column(name = "pageno", length = 20)
	protected String pageno;

	/**
	 * page
	 */
	@Column(name = "page")
	protected int page;

	/**
	 * filetype
	 */
	@Column(name = "filetype", length = 50)
	protected String filetype;

	/**
	 * savetime
	 */
	@Column(name = "savetime", length = 10)
	protected String savetime;

	/**
	 * annotations
	 */
	@Column(name = "annotations", length = 100)
	protected String annotations;

	/**
	 * carriertype
	 */
	@Column(name = "carriertype", length = 50)
	protected String carriertype;

	/**
	 * summary
	 */
	@Column(name = "summary", length = 200)
	protected String summary;

	/**
	 * ptext
	 */
	@Column(name = "ptext", length = 30)
	protected String ptext;

	/**
	 * carrieru
	 */
	@Column(name = "carrieru", length = 50)
	protected String carrieru;

	/**
	 * glidenum
	 */
	@Column(name = "glidenum", length = 50)
	protected String glidenum;

	/**
	 * pagetype
	 */
	@Column(name = "pagetype", length = 100)
	protected String pagetype;

	/**
	 * clistno
	 */
	@Column(name = "clistno")
	protected int clistno;

	/**
	 * cpageno
	 */
	@Column(name = "cpageno", length = 20)
	protected String cpageno;

	/**
	 * vnum
	 */
	@Column(name = "vnum", length = 200)
	protected String vnum;

	/**
	 * cvnum
	 */
	@Column(name = "cvnum", length = 200)
	protected String cvnum;

	public IsdpPfileAtt() {

	}

	public String getAnnotations() {
		return this.annotations;
	}

	public String getCarriertype() {
		return this.carriertype;
	}

	public String getCarrieru() {
		return this.carrieru;
	}

	public int getClistno() {
		return this.clistno;
	}

	public String getCpageno() {
		return this.cpageno;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getCvnum() {
		return this.cvnum;
	}

	public String getDuty() {
		return this.duty;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public String getGlidenum() {
		return this.glidenum;
	}

	public String getId() {
		return this.id;
	}

	public Long getListId() {
		return this.listId;
	}

	public int getPage() {
		return this.page;
	}

	public String getPageno() {
		return this.pageno;
	}

	public String getPagetype() {
		return this.pagetype;
	}

	public String getPtext() {
		return this.ptext;
	}

	public String getSavetime() {
		return this.savetime;
	}

	public String getSummary() {
		return this.summary;
	}

	public String getTagnum() {
		return this.tagnum;
	}

	public String getTname() {
		return this.tname;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getVnum() {
		return this.vnum;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public void setCarriertype(String carriertype) {
		this.carriertype = carriertype;
	}

	public void setCarrieru(String carrieru) {
		this.carrieru = carrieru;
	}

	public void setClistno(int clistno) {
		this.clistno = clistno;
	}

	public void setCpageno(String cpageno) {
		this.cpageno = cpageno;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setCvnum(String cvnum) {
		this.cvnum = cvnum;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public void setGlidenum(String glidenum) {
		this.glidenum = glidenum;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	public void setPagetype(String pagetype) {
		this.pagetype = pagetype;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setTagnum(String tagnum) {
		this.tagnum = tagnum;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setVnum(String vnum) {
		this.vnum = vnum;
	}

	public IsdpPfileAtt jsonToObject(JSONObject jsonObject) {
		return PfileAttJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return PfileAttJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return PfileAttJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
