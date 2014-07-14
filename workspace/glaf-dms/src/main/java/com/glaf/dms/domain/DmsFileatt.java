/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.dms.domain;

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
import com.glaf.dms.util.DmsFileattJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "FILEATT")
public class DmsFileatt implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FILEID", nullable = false)
	protected String fileId;

	@Column(name = "TOPID", length = 50)
	protected String topid;

	@Column(name = "NUM", length = 50)
	protected String num;

	@Column(name = "ACTOR", length = 20)
	protected String actor;

	@Column(name = "FNAME", length = 255)
	protected String fname;

	@Column(name = "FILE_NAME", length = 255)
	protected String fileName;

	@Column(name = "FILE_CONTENT")
	protected byte[] fileContent;

	@Column(name = "VISION", length = 50)
	protected String vision;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTIME")
	protected Date ctime;

	@Column(name = "FILESIZE")
	protected Integer filesize;

	@Column(name = "VISID", length = 50)
	protected String visID;

	@Column(name = "ATTID", length = 50)
	protected String attID;

	@Column(name = "ISTEXTCONTENT")
	protected Integer isTextContent;

	@javax.persistence.Lob
	@Column(name = "TEXTCONTENT")
	protected String textcontent;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsFileatt() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsFileatt other = (DmsFileatt) obj;
		if (fileId == null) {
			if (other.fileId != null)
				return false;
		} else if (!fileId.equals(other.fileId))
			return false;
		return true;
	}

	public String getActor() {
		return this.actor;
	}

	public String getAttID() {
		return this.attID;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public String getFileId() {
		return this.fileId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public Integer getFilesize() {
		return this.filesize;
	}

	public String getFname() {
		return this.fname;
	}

	public Integer getIsTextContent() {
		return this.isTextContent;
	}

	public String getNum() {
		return this.num;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	public String getTextcontent() {
		return this.textcontent;
	}

	public String getTopid() {
		return this.topid;
	}

	public String getVisID() {
		return this.visID;
	}

	public String getVision() {
		return this.vision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileId == null) ? 0 : fileId.hashCode());
		return result;
	}

	public DmsFileatt jsonToObject(JSONObject jsonObject) {
		return DmsFileattJsonFactory.jsonToObject(jsonObject);
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setAttID(String attID) {
		this.attID = attID;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFilesize(Integer filesize) {
		this.filesize = filesize;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setIsTextContent(Integer isTextContent) {
		this.isTextContent = isTextContent;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setTextcontent(String textcontent) {
		this.textcontent = textcontent;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setVisID(String visID) {
		this.visID = visID;
	}

	public void setVision(String vision) {
		this.vision = vision;
	}

	public JSONObject toJsonObject() {
		return DmsFileattJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsFileattJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
