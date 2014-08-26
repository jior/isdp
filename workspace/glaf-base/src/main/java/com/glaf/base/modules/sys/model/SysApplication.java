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

package com.glaf.base.modules.sys.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.util.SysApplicationJsonFactory;
import com.glaf.core.base.ColumnModel;
import com.glaf.core.base.JSONable;

@Entity
@Table(name = "sys_application")
public class SysApplication implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编码
	 */
	@Column(name = "CODE", length = 50)
	protected String code;

	/**
	 * 创建人
	 */
	@Column(name = "CREATEBY", length = 50)
	protected String createBy;

	/**
	 * 创建日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATE")
	protected Date createDate;

	/**
	 * 描述
	 */
	@Column(name = "APPDESC", length = 500)
	protected String desc;

	@javax.persistence.Transient
	private Set<SysFunction> functions = new HashSet<SysFunction>();

	@Id
	@Column(name = "ID", nullable = false)
	protected long id;

	/**
	 * 是否启用
	 */
	@Column(name = "LOCKED")
	protected int locked;

	/**
	 * 名称
	 */
	@Column(name = "NAME", length = 250)
	protected String name;

	@javax.persistence.Transient
	private SysTree node;

	/**
	 * 节点编号
	 */
	@Column(name = "NODEID")
	protected long nodeId;

	/**
	 * 显示菜单
	 */
	@Column(name = "SHOWMENU")
	protected int showMenu;

	/**
	 * 序号
	 */
	@Column(name = "SORT")
	protected int sort;

	/**
	 * 修改人
	 */
	@Column(name = "UPDATEBY", length = 50)
	protected String updateBy;

	/**
	 * 修改日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEDATE")
	protected Date updateDate;

	/**
	 * URL
	 */
	@Column(name = "URL", length = 500)
	protected String url;

	/**
	 * linkType
	 */
	@Column(name = "LINKTYPE", length = 50)
	protected String linkType;

	/**
	 * linkFileName
	 */
	@Column(name = "LINKFILEID", length = 200)
	protected String linkFileId;

	/**
	 * linkFileName
	 */
	@Column(name = "LINKFILENAME", length = 200)
	protected String linkFileName;

	/**
	 * linkParam
	 */
	@Column(name = "LINKPARAM", length = 500)
	protected String linkParam;

	@javax.persistence.Transient
	protected byte[] linkFileContent;

	@Column(name = "REFID1")
	protected Integer refId1;

	@Column(name = "REFNAME1")
	protected String refName1;

	@Column(name = "REFID2")
	protected Integer refId2;

	@Column(name = "REFNAME2")
	protected String refName2;

	@Column(name = "REFID3")
	protected Integer refId3;

	@Column(name = "REFNAME3")
	protected String refName3;

	@Column(name = "REFID4")
	protected Integer refId4;

	@Column(name = "REFNAME4")
	protected String refName4;

	@Column(name = "REFID5")
	protected Integer refId5;

	@Column(name = "REFNAME5")
	protected String refName5;

	@javax.persistence.Transient
	protected List<ColumnModel> extendedColumns = new ArrayList<ColumnModel>();

	public SysApplication() {

	}

	public void addExtendedColumn(ColumnModel cm) {
		if (cm != null) {
			getExtendedColumns().add(cm);
		}
	}

	public String getCode() {
		return code;
	}

	public String getCreateBy() {
		return createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public String getDesc() {
		return desc;
	}

	public List<ColumnModel> getExtendedColumns() {
		if (extendedColumns == null) {
			extendedColumns = new ArrayList<ColumnModel>();
		}
		return extendedColumns;
	}

	public Set<SysFunction> getFunctions() {
		return functions;
	}

	public long getId() {
		return id;
	}

	public byte[] getLinkFileContent() {
		return linkFileContent;
	}

	public String getLinkFileId() {
		return linkFileId;
	}

	public String getLinkFileName() {
		return linkFileName;
	}

	public String getLinkParam() {
		return linkParam;
	}

	public String getLinkType() {
		return linkType;
	}

	public int getLocked() {
		return locked;
	}

	public String getName() {
		return name;
	}

	public SysTree getNode() {
		return node;
	}

	public long getNodeId() {
		return nodeId;
	}

	public Integer getRefId1() {
		return refId1;
	}

	public Integer getRefId2() {
		return refId2;
	}

	public Integer getRefId3() {
		return refId3;
	}

	public Integer getRefId4() {
		return refId4;
	}

	public Integer getRefId5() {
		return refId5;
	}

	public String getRefName1() {
		return refName1;
	}

	public String getRefName2() {
		return refName2;
	}

	public String getRefName3() {
		return refName3;
	}

	public String getRefName4() {
		return refName4;
	}

	public String getRefName5() {
		return refName5;
	}

	public int getShowMenu() {
		return showMenu;
	}

	public int getSort() {
		return sort;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public String getUrl() {
		return url;
	}

	public SysApplication jsonToObject(JSONObject jsonObject) {
		return SysApplicationJsonFactory.jsonToObject(jsonObject);
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public void setExtendedColumns(List<ColumnModel> extendedColumns) {
		this.extendedColumns = extendedColumns;
	}

	public void setFunctions(Set<SysFunction> functions) {
		this.functions = functions;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setLinkFileContent(byte[] linkFileContent) {
		this.linkFileContent = linkFileContent;
	}

	public void setLinkFileId(String linkFileId) {
		this.linkFileId = linkFileId;
	}

	public void setLinkFileName(String linkFileName) {
		this.linkFileName = linkFileName;
	}

	public void setLinkParam(String linkParam) {
		this.linkParam = linkParam;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNode(SysTree node) {
		this.node = node;
	}

	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public void setRefId1(Integer refId1) {
		this.refId1 = refId1;
	}

	public void setRefId2(Integer refId2) {
		this.refId2 = refId2;
	}

	public void setRefId3(Integer refId3) {
		this.refId3 = refId3;
	}

	public void setRefId4(Integer refId4) {
		this.refId4 = refId4;
	}

	public void setRefId5(Integer refId5) {
		this.refId5 = refId5;
	}

	public void setRefName1(String refName1) {
		this.refName1 = refName1;
	}

	public void setRefName2(String refName2) {
		this.refName2 = refName2;
	}

	public void setRefName3(String refName3) {
		this.refName3 = refName3;
	}

	public void setRefName4(String refName4) {
		this.refName4 = refName4;
	}

	public void setRefName5(String refName5) {
		this.refName5 = refName5;
	}

	public void setShowMenu(int showMenu) {
		this.showMenu = showMenu;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public JSONObject toJsonObject() {
		return SysApplicationJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return SysApplicationJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return toJsonObject().toJSONString();
	}
}