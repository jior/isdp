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
import com.glaf.dms.util.DmsTreevmainUserJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "TREEVMAIN_U")
public class DmsTreevmainUser implements Serializable, JSONable {
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

	@Column(name = "NODETYPE", length = 1)
	protected String nodetype;

	@Column(name = "FROMID")
	protected Integer fromid;

	@Column(name = "LISTNO")
	protected Integer listno;

	@Column(name = "FRMTYPEINDEX")
	protected Integer frmtypeindex;

	@Column(name = "SHOWID")
	protected Integer showid;

	@Column(name = "SHOWFRMID", length = 50)
	protected String showfrmid;

	@Column(name = "SHOWFRMINDEX_ID")
	protected Integer showfrmindexId;

	@Column(name = "DWID")
	protected Integer dwid;

	@Column(name = "JID", length = 50)
	protected String jid;

	@Column(name = "FLID", length = 50)
	protected String flid;

	@Column(name = "CTYPE_ID", length = 50)
	protected String ctypeId;

	@Column(name = "COMM_INDEX")
	protected Integer commIndex;

	@Column(name = "BASE_INDEX")
	protected Integer baseIndex;

	@Column(name = "COMM_LISTNO")
	protected Integer commListno;

	@Column(name = "PROJ_LISTNO")
	protected Integer projListno;

	@Column(name = "INTNOSHOW")
	protected Integer intnoshow;

	@Column(name = "PROJ_PARENT")
	protected Integer projParent;

	@Column(name = "TREE_DLISTSTR", length = 200)
	protected String treeDliststr;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsTreevmainUser() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsTreevmainUser other = (DmsTreevmainUser) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getBaseIndex() {
		return this.baseIndex;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public Integer getCommIndex() {
		return this.commIndex;
	}

	public Integer getCommListno() {
		return this.commListno;
	}

	public String getContent() {
		return this.content;
	}

	public String getContent2() {
		return this.content2;
	}

	public String getCtypeId() {
		return this.ctypeId;
	}

	public Integer getDwid() {
		return this.dwid;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getFlid() {
		return this.flid;
	}

	public Integer getFrmtypeindex() {
		return this.frmtypeindex;
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

	public Integer getIntnoshow() {
		return this.intnoshow;
	}

	public String getJid() {
		return this.jid;
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

	public String getNodetype() {
		return this.nodetype;
	}

	public String getNum() {
		return this.num;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public Integer getProjListno() {
		return this.projListno;
	}

	public Integer getProjParent() {
		return this.projParent;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	public String getShowfrmid() {
		return this.showfrmid;
	}

	public Integer getShowfrmindexId() {
		return this.showfrmindexId;
	}

	public Integer getShowid() {
		return this.showid;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getTreeDliststr() {
		return this.treeDliststr;
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

	public DmsTreevmainUser jsonToObject(JSONObject jsonObject) {
		return DmsTreevmainUserJsonFactory.jsonToObject(jsonObject);
	}

	public void setBaseIndex(Integer baseIndex) {
		this.baseIndex = baseIndex;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setCommIndex(Integer commIndex) {
		this.commIndex = commIndex;
	}

	public void setCommListno(Integer commListno) {
		this.commListno = commListno;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContent2(String content2) {
		this.content2 = content2;
	}

	public void setCtypeId(String ctypeId) {
		this.ctypeId = ctypeId;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFrmtypeindex(Integer frmtypeindex) {
		this.frmtypeindex = frmtypeindex;
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

	public void setIntnoshow(Integer intnoshow) {
		this.intnoshow = intnoshow;
	}

	public void setJid(String jid) {
		this.jid = jid;
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

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public void setProjListno(Integer projListno) {
		this.projListno = projListno;
	}

	public void setProjParent(Integer projParent) {
		this.projParent = projParent;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setShowfrmid(String showfrmid) {
		this.showfrmid = showfrmid;
	}

	public void setShowfrmindexId(Integer showfrmindexId) {
		this.showfrmindexId = showfrmindexId;
	}

	public void setShowid(Integer showid) {
		this.showid = showid;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setZtype(Integer ztype) {
		this.ztype = ztype;
	}

	public JSONObject toJsonObject() {
		return DmsTreevmainUserJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsTreevmainUserJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
