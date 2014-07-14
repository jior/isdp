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
import com.glaf.dms.util.DmsTreevmainCommJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "TREEVMAIN_COMM")
public class DmsTreevmainComm implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "INDEX_ID", nullable = false)
	protected Integer indexId;

	@Column(name = "ID", length = 100)
	protected String id;

	@Column(name = "PARENT_ID")
	protected Integer parentId;

	@Column(name = "INDEX_NAME", length = 255)
	protected String indexName;

	@Column(name = "NLEVEL")
	protected Integer nlevel;

	@Column(name = "NODETYPE")
	protected Integer nodetype;

	@Column(name = "FROMID")
	protected Integer fromid;

	@Column(name = "NODEICO")
	protected Integer nodeico;

	@Column(name = "LISTNO")
	protected Integer listno;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsTreevmainComm() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsTreevmainComm other = (DmsTreevmainComm) obj;
		if (indexId == null) {
			if (other.indexId != null)
				return false;
		} else if (!indexId.equals(other.indexId))
			return false;
		return true;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public Integer getFromid() {
		return this.fromid;
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

	public Integer getListno() {
		return this.listno;
	}

	public Integer getNlevel() {
		return this.nlevel;
	}

	public Integer getNodeico() {
		return this.nodeico;
	}

	public Integer getNodetype() {
		return this.nodetype;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((indexId == null) ? 0 : indexId.hashCode());
		return result;
	}

	public DmsTreevmainComm jsonToObject(JSONObject jsonObject) {
		return DmsTreevmainCommJsonFactory.jsonToObject(jsonObject);
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setFromid(Integer fromid) {
		this.fromid = fromid;
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

	public void setListno(Integer listno) {
		this.listno = listno;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(Integer nodeico) {
		this.nodeico = nodeico;
	}

	public void setNodetype(Integer nodetype) {
		this.nodetype = nodetype;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public JSONObject toJsonObject() {
		return DmsTreevmainCommJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsTreevmainCommJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
