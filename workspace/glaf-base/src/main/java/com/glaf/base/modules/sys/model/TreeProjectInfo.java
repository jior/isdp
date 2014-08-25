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
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.util.TreeProjectInfoJsonFactory;
import com.glaf.core.base.JSONable;

@Entity
@Table(name = "TREEPINFO")
public class TreeProjectInfo implements Serializable, JSONable, ITree {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "INDEX_ID", nullable = false)
	protected int indexId;

	@Column(name = "ID", length = 100)
	protected String id;

	@Column(name = "NUM", length = 50)
	protected String num;

	@Column(name = "TOP_ID")
	protected Integer topId;

	@Column(name = "PARENT_ID")
	protected int parentId;

	@Column(name = "INDEX_NAME", length = 255)
	protected String indexName;

	@Column(name = "NLEVEL")
	protected Integer nlevel;

	@Column(name = "NODETYPE", length = 1)
	protected String nodeType;

	@Column(name = "FROMID")
	protected Integer fromId;

	@Column(name = "PART_ID")
	protected Integer partId;

	@Column(name = "SHOWID")
	protected Integer showId;

	@Column(name = "SINDEX_NAME", length = 255)
	protected String sindexName;

	@Column(name = "FILENUM")
	protected Integer fileNum;

	@Column(name = "FILENUM0")
	protected Integer fileNum0;

	@Column(name = "FILENUM1")
	protected Integer fileNum1;

	@Column(name = "FILENUM2")
	protected Integer fileNum2;

	@Column(name = "PROJTYPE", length = 1)
	protected String projType;

	@Column(name = "CID", length = 50)
	protected String cid;

	@Column(name = "DWID")
	protected Integer dwid;

	@Column(name = "FXID")
	protected Integer fxid;

	@Column(name = "FBID")
	protected Integer fbid;

	@Column(name = "JID", length = 50)
	protected String jid;

	@Column(name = "FLID", length = 50)
	protected String flid;

	@Column(name = "TOPNODE", length = 250)
	protected String topNode;

	@Column(name = "NODEICO")
	protected Integer nodeIco;

	@Column(name = "OUTFLAG", length = 1)
	protected String outFlag;

	@Column(name = "INFLAG", length = 1)
	protected String inFlag;

	@Column(name = "PASSWORD", length = 10)
	protected String password;

	@Column(name = "LISTNUM", length = 200)
	protected String listNum;

	@Column(name = "WCOMPANY", length = 250)
	protected String wcompany;

	@Column(name = "LISTNO")
	protected Integer listNo;

	@Column(name = "USERNMU", length = 100)
	protected String usernmu;

	@Column(name = "INDEX_ID_OLD")
	protected Integer indexIdOld;

	@Column(name = "PINDEX_ID")
	protected Integer pindexId;

	@Column(name = "FINISHINT")
	protected Integer finishInt;

	@Column(name = "TYPE_TABLENAME", length = 50)
	protected String typeTableName;

	@Column(name = "TREE_DLISTSTR", length = 200)
	protected String treedListStr;

	@Column(name = "PFILES_INDEX")
	protected Integer pfilesIndex;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BDATE")
	protected Date bdate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EDATE")
	protected Date edate;

	@Column(name = "WBSINDEX")
	protected Integer wbsIndex;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BDATE_S")
	protected Date bdates;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EDATE_S")
	protected Date edates;

	@Column(name = "TYPE_ID", length = 50)
	protected String typeId;

	@Column(name = "CELL1")
	protected Integer cell1;

	@Column(name = "CELL2")
	protected Integer cell2;

	@Column(name = "CELL3")
	protected Integer cell3;

	@Column(name = "STRFILELOCATE", length = 50)
	protected String strFileLocate;

	@Column(name = "INTPFILE1")
	protected Integer intpFile1;

	@Column(name = "INTPFILE2")
	protected Integer intpFile2;

	@Column(name = "INTPFILE3")
	protected Integer intpFile3;

	@Column(name = "INTCELLFINISH")
	protected Integer intCellFinish;

	@Column(name = "SYS_ID", length = 50)
	protected String sysId;

	@Column(name = "INDEX_IN")
	protected Integer indexIn;

	@Column(name = "STRBUTTONSTAR", length = 20)
	protected String strButtonStar;

	@Column(name = "INTISUSE")
	protected Integer intIsuse;

	@Column(name = "WBSINDEX_IN")
	protected Integer wbsIndexIn;

	@Column(name = "UINDEX_ID")
	protected Integer uindexId;

	@Column(name = "LISNO_WBS")
	protected Integer lisNoWbs;

	@Column(name = "SYS_ID_ADD", length = 50)
	protected String sysIdAdd;

	@Column(name = "INDEX_IN_ADD")
	protected Integer indexInAdd;

	@Column(name = "createBy", length = 50)
	protected String createBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDate")
	protected Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateDate")
	protected Date updateDate;

	@Column(name = "updateBy", length = 50)
	protected String updateBy;

	@javax.persistence.Transient
	protected Integer treeprojIndexId;
	@javax.persistence.Transient
	protected String treeprojIndexName;
	@javax.persistence.Transient
	protected Integer treeprojParentId;
	@javax.persistence.Transient
	protected String treeprojType;
	@javax.persistence.Transient
	protected TreeProjectInfo parent;
	@javax.persistence.Transient
	protected List<TreeProjectInfo> childrens;

	public TreeProjectInfo() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TreeProjectInfo other = (TreeProjectInfo) obj;
		if (indexId != other.indexId)
			return false;
		return true;
	}

	public Date getBdate() {
		return this.bdate;
	}

	public Date getBdates() {
		return this.bdates;
	}

	public Integer getCell1() {
		return this.cell1;
	}

	public Integer getCell2() {
		return this.cell2;
	}

	public Integer getCell3() {
		return this.cell3;
	}

	public List<TreeProjectInfo> getChildrens() {
		return childrens;
	}

	public String getCid() {
		return this.cid;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public Integer getDwid() {
		return this.dwid;
	}

	public Date getEdate() {
		return this.edate;
	}

	public Date getEdates() {
		return this.edates;
	}

	public Integer getFbid() {
		return this.fbid;
	}

	public Integer getFileNum() {
		return this.fileNum;
	}

	public Integer getFileNum0() {
		return this.fileNum0;
	}

	public Integer getFileNum1() {
		return this.fileNum1;
	}

	public Integer getFileNum2() {
		return this.fileNum2;
	}

	public Integer getFinishInt() {
		return this.finishInt;
	}

	public String getFlid() {
		return this.flid;
	}

	public Integer getFromId() {
		return this.fromId;
	}

	public Integer getFxid() {
		return this.fxid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public Integer getIndexIdOld() {
		return this.indexIdOld;
	}

	public Integer getIndexIn() {
		return this.indexIn;
	}

	public Integer getIndexInAdd() {
		return this.indexInAdd;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public String getInFlag() {
		return this.inFlag;
	}

	public Integer getIntCellFinish() {
		return this.intCellFinish;
	}

	public Integer getIntIsuse() {
		return this.intIsuse;
	}

	public Integer getIntpFile1() {
		return this.intpFile1;
	}

	public Integer getIntpFile2() {
		return this.intpFile2;
	}

	public Integer getIntpFile3() {
		return this.intpFile3;
	}

	public String getJid() {
		return this.jid;
	}

	public int getLevel() {
		return nlevel;
	}

	public Integer getLisNoWbs() {
		return this.lisNoWbs;
	}

	public int getListno() {
		return listNo;
	}

	public Integer getListNo() {
		return this.listNo;
	}

	public String getListNum() {
		return this.listNum;
	}

	public Integer getNlevel() {
		return this.nlevel;
	}

	public Integer getNodeIco() {
		return this.nodeIco;
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public String getNum() {
		return this.num;
	}

	public String getOutFlag() {
		return this.outFlag;
	}

	public TreeProjectInfo getParent() {
		return parent;
	}

	public int getParentId() {
		return this.parentId;
	}

	public Integer getPartId() {
		return this.partId;
	}

	public String getPassword() {
		return this.password;
	}

	public Integer getPfilesIndex() {
		return this.pfilesIndex;
	}

	public Integer getPindexId() {
		return this.pindexId;
	}

	public String getProjType() {
		return this.projType;
	}

	public Integer getShowId() {
		return this.showId;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getStrButtonStar() {
		return this.strButtonStar;
	}

	public String getStrFileLocate() {
		return this.strFileLocate;
	}

	public String getSysId() {
		return this.sysId;
	}

	public String getSysIdAdd() {
		return this.sysIdAdd;
	}

	public Integer getTopId() {
		return this.topId;
	}

	public String getTopNode() {
		return this.topNode;
	}

	public String getTreedListStr() {
		return this.treedListStr;
	}

	public Integer getTreeprojIndexId() {
		return treeprojIndexId;
	}

	public String getTreeprojIndexName() {
		return treeprojIndexName;
	}

	public Integer getTreeprojParentId() {
		return treeprojParentId;
	}

	public String getTreeprojType() {
		return treeprojType;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public String getTypeTableName() {
		return this.typeTableName;
	}

	public Integer getUindexId() {
		return this.uindexId;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public String getUsernmu() {
		return this.usernmu;
	}

	public Integer getWbsIndex() {
		return this.wbsIndex;
	}

	public Integer getWbsIndexIn() {
		return this.wbsIndexIn;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + indexId;
		return result;
	}

	public boolean isChecked() {
		return false;
	}

	public TreeProjectInfo jsonToObject(JSONObject jsonObject) {
		return TreeProjectInfoJsonFactory.jsonToObject(jsonObject);
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public void setBdates(Date bdates) {
		this.bdates = bdates;
	}

	public void setCell1(Integer cell1) {
		this.cell1 = cell1;
	}

	public void setCell2(Integer cell2) {
		this.cell2 = cell2;
	}

	public void setCell3(Integer cell3) {
		this.cell3 = cell3;
	}

	public void setChecked(boolean checked) {

	}

	public void setChildrens(List<TreeProjectInfo> childrens) {
		this.childrens = childrens;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public void setEdates(Date edates) {
		this.edates = edates;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFileNum(Integer fileNum) {
		this.fileNum = fileNum;
	}

	public void setFileNum0(Integer fileNum0) {
		this.fileNum0 = fileNum0;
	}

	public void setFileNum1(Integer fileNum1) {
		this.fileNum1 = fileNum1;
	}

	public void setFileNum2(Integer fileNum2) {
		this.fileNum2 = fileNum2;
	}

	public void setFinishInt(Integer finishInt) {
		this.finishInt = finishInt;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFromId(Integer fromId) {
		this.fromId = fromId;
	}

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdOld(Integer indexIdOld) {
		this.indexIdOld = indexIdOld;
	}

	public void setIndexIn(Integer indexIn) {
		this.indexIn = indexIn;
	}

	public void setIndexInAdd(Integer indexInAdd) {
		this.indexInAdd = indexInAdd;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setInFlag(String inFlag) {
		this.inFlag = inFlag;
	}

	public void setIntCellFinish(Integer intCellFinish) {
		this.intCellFinish = intCellFinish;
	}

	public void setIntIsuse(Integer intIsuse) {
		this.intIsuse = intIsuse;
	}

	public void setIntpFile1(Integer intpFile1) {
		this.intpFile1 = intpFile1;
	}

	public void setIntpFile2(Integer intpFile2) {
		this.intpFile2 = intpFile2;
	}

	public void setIntpFile3(Integer intpFile3) {
		this.intpFile3 = intpFile3;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setLevel(int level) {
		this.nlevel = level;

	}

	public void setLisNoWbs(Integer lisNoWbs) {
		this.lisNoWbs = lisNoWbs;
	}

	public void setListno(int listno) {
		this.listNo = listno;

	}

	public void setListNo(Integer listNo) {
		this.listNo = listNo;
	}

	public void setListNum(String listNum) {
		this.listNum = listNum;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeIco(Integer nodeIco) {
		this.nodeIco = nodeIco;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setOutFlag(String outFlag) {
		this.outFlag = outFlag;
	}

	public void setParent(TreeProjectInfo parent) {
		this.parent = parent;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPfilesIndex(Integer pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setPindexId(Integer pindexId) {
		this.pindexId = pindexId;
	}

	public void setProjType(String projType) {
		this.projType = projType;
	}

	public void setShowId(Integer showId) {
		this.showId = showId;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setStrButtonStar(String strButtonStar) {
		this.strButtonStar = strButtonStar;
	}

	public void setStrFileLocate(String strFileLocate) {
		this.strFileLocate = strFileLocate;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setSysIdAdd(String sysIdAdd) {
		this.sysIdAdd = sysIdAdd;
	}

	public void setTopId(Integer topId) {
		this.topId = topId;
	}

	public void setTopNode(String topNode) {
		this.topNode = topNode;
	}

	public void setTreedListStr(String treedListStr) {
		this.treedListStr = treedListStr;
	}

	public void setTreeprojIndexId(Integer treeprojIndexId) {
		this.treeprojIndexId = treeprojIndexId;
	}

	public void setTreeprojIndexName(String treeprojIndexName) {
		this.treeprojIndexName = treeprojIndexName;
	}

	public void setTreeprojParentId(Integer treeprojParentId) {
		this.treeprojParentId = treeprojParentId;
	}

	public void setTreeprojType(String treeprojType) {
		this.treeprojType = treeprojType;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeTableName(String typeTableName) {
		this.typeTableName = typeTableName;
	}

	public void setUindexId(Integer uindexId) {
		this.uindexId = uindexId;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUsernmu(String usernmu) {
		this.usernmu = usernmu;
	}

	public void setWbsIndex(Integer wbsIndex) {
		this.wbsIndex = wbsIndex;
	}

	public void setWbsIndexIn(Integer wbsIndexIn) {
		this.wbsIndexIn = wbsIndexIn;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public JSONObject toJsonObject() {
		return TreeProjectInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreeProjectInfoJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
