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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.dms.util.DmsTreevmainJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "TREEVMAIN")
public class DmsTreevmain implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false)
	protected String id;

	@Column(name = "INDEX_ID")
	protected Integer indexId;

	@Column(name = "PARENT_ID")
	protected Integer parentId;

	@Column(name = "INDEX_NAME", length = 255)
	protected String indexName;

	@Column(name = "NLEVEL")
	protected Integer nlevel;

	@Column(name = "NUM", length = 50)
	protected String num;

	@Column(name = "FILENUM", length = 200)
	protected String filenum;

	@Column(name = "CONTENT", length = 200)
	protected String content;

	@Column(name = "VFLAG", length = 1)
	protected String vflag;

	@Column(name = "SINDEX_NAME", length = 255)
	protected String sindexName;

	@Column(name = "ZTYPE")
	protected Integer ztype;

	@Column(name = "CONTENT2", length = 200)
	protected String content2;

	@Column(name = "TOPNODE", length = 250)
	protected String topnode;

	@Column(name = "NODEICO")
	protected Integer nodeico;

	@Column(name = "INTENDOFSHOW")
	protected Integer intendofshow;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsTreevmain() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsTreevmain other = (DmsTreevmain) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public String getContent() {
		return this.content;
	}

	public String getContent2() {
		return this.content2;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getId() {
		return this.id;
	}

	public Integer getIndexId() {
		return this.indexId;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public Integer getIntendofshow() {
		return this.intendofshow;
	}

	public Integer getNlevel() {
		return this.nlevel;
	}

	public Integer getNodeico() {
		return this.nodeico;
	}

	public String getNum() {
		return this.num;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getVflag() {
		return this.vflag;
	}

	public Integer getZtype() {
		return this.ztype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public DmsTreevmain jsonToObject(JSONObject jsonObject) {
		return DmsTreevmainJsonFactory.jsonToObject(jsonObject);
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setIntendofshow(Integer intendofshow) {
		this.intendofshow = intendofshow;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(Integer nodeico) {
		this.nodeico = nodeico;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setZtype(Integer ztype) {
		this.ztype = ztype;
	}

	public JSONObject toJsonObject() {
		return DmsTreevmainJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsTreevmainJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
