package com.glaf.isdp.domain;

import java.io.*;

import javax.persistence.*;
import com.alibaba.fastjson.*;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.isdp.util.CellSysDatalinkJsonFactory;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table(name = "cell_sysdatalink")
public class CellSysDatalink implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * busiessIdSrc
	 */
	@Column(name = "busiess_id_src", length = 50)
	protected String busiessIdSrc;

	/**
	 * celldotIndexSrc
	 */
	@Column(name = "celldot_index_src")
	protected Integer celldotIndexSrc;

	/**
	 * fileidSrc
	 */
	@Column(name = "fileid_src", length = 50)
	protected String fileidSrc;

	/**
	 * dotnameSrc
	 */
	@Column(name = "dotname_src", length = 200)
	protected String dotnameSrc;

	/**
	 * busiessIdDes
	 */
	@Column(name = "busiess_id_des", length = 50)
	protected String busiessIdDes;

	/**
	 * buiessnameDes
	 */
	@Column(name = "buiessname_des", length = 200)
	protected String buiessnameDes;

	/**
	 * celldotIndexDes
	 */
	@Column(name = "celldot_index_des")
	protected Integer celldotIndexDes;

	/**
	 * fileidDes
	 */
	@Column(name = "fileid_des", length = 50)
	protected String fileidDes;

	/**
	 * dotnameDes
	 */
	@Column(name = "dotname_des", length = 200)
	protected String dotnameDes;

	/**
	 * intlinktype
	 */
	@Column(name = "intlinktype")
	protected Integer intlinktype;

	/**
	 * intdiff1
	 */
	@Column(name = "intdiff1")
	protected Integer intdiff1;

	/**
	 * intdiff2
	 */
	@Column(name = "intdiff2")
	protected Integer intdiff2;

	public CellSysDatalink() {

	}

	public String getBuiessnameDes() {
		return this.buiessnameDes;
	}

	public String getBusiessIdDes() {
		return this.busiessIdDes;
	}

	public String getBusiessIdSrc() {
		return this.busiessIdSrc;
	}

	public Integer getCelldotIndexDes() {
		return this.celldotIndexDes;
	}

	public Integer getCelldotIndexSrc() {
		return this.celldotIndexSrc;
	}

	public String getDotnameDes() {
		return this.dotnameDes;
	}

	public String getDotnameSrc() {
		return this.dotnameSrc;
	}

	public String getFileidDes() {
		return this.fileidDes;
	}

	public String getFileidSrc() {
		return this.fileidSrc;
	}

	public String getId() {
		return this.id;
	}

	public Integer getIntdiff1() {
		return this.intdiff1;
	}

	public Integer getIntdiff2() {
		return this.intdiff2;
	}

	public Integer getIntlinktype() {
		return this.intlinktype;
	}

	public void setBuiessnameDes(String buiessnameDes) {
		this.buiessnameDes = buiessnameDes;
	}

	public void setBusiessIdDes(String busiessIdDes) {
		this.busiessIdDes = busiessIdDes;
	}

	public void setBusiessIdSrc(String busiessIdSrc) {
		this.busiessIdSrc = busiessIdSrc;
	}

	public void setCelldotIndexDes(Integer celldotIndexDes) {
		this.celldotIndexDes = celldotIndexDes;
	}

	public void setCelldotIndexSrc(Integer celldotIndexSrc) {
		this.celldotIndexSrc = celldotIndexSrc;
	}

	public void setDotnameDes(String dotnameDes) {
		this.dotnameDes = dotnameDes;
	}

	public void setDotnameSrc(String dotnameSrc) {
		this.dotnameSrc = dotnameSrc;
	}

	public void setFileidDes(String fileidDes) {
		this.fileidDes = fileidDes;
	}

	public void setFileidSrc(String fileidSrc) {
		this.fileidSrc = fileidSrc;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIntdiff1(Integer intdiff1) {
		this.intdiff1 = intdiff1;
	}

	public void setIntdiff2(Integer intdiff2) {
		this.intdiff2 = intdiff2;
	}

	public void setIntlinktype(Integer intlinktype) {
		this.intlinktype = intlinktype;
	}

	public CellSysDatalink jsonToObject(JSONObject jsonObject) {
		return CellSysDatalinkJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return CellSysDatalinkJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return CellSysDatalinkJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
