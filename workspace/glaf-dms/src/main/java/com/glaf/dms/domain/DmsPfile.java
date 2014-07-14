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
import com.glaf.dms.util.DmsPfileJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "PFILE")
public class DmsPfile implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false)
	protected String id;

	@Column(name = "EFILENUM")
	protected Integer efilenum;

	@Column(name = "LISTNUM", length = 100)
	protected String listnum;

	@Column(name = "LIST_ID")
	protected Long listId;

	@Column(name = "INDEX_ID")
	protected Integer indexId;

	@Column(name = "PID")
	protected Integer pid;

	@Column(name = "PROJID")
	protected Integer projid;

	@Column(name = "DWID")
	protected Integer dwid;

	@Column(name = "FBID")
	protected Integer fbid;

	@Column(name = "FXID")
	protected Integer fxid;

	@Column(name = "JID", length = 50)
	protected String jid;

	@Column(name = "FLID", length = 50)
	protected String flid;

	@Column(name = "TOPNODE", length = 150)
	protected String topnode;

	@Column(name = "TOPNODEM", length = 150)
	protected String topnodem;

	@Column(name = "VID", length = 50)
	protected String vid;

	@Column(name = "OLDVID", length = 50)
	protected String oldvid;

	@Column(name = "VISFLAG", length = 1)
	protected String visflag;

	@Column(name = "LISTNO")
	protected Integer listno;

	@Column(name = "FILINGFLAG", length = 1)
	protected String filingflag;

	@Column(name = "SAVEFLAG", length = 1)
	protected String saveflag;

	@Column(name = "OPENFLAG", length = 1)
	protected String openflag;

	@Column(name = "CHECKUPFLAG", length = 1)
	protected String checkupflag;

	@Column(name = "FINISHFLAG", length = 1)
	protected String finishflag;

	@Column(name = "FROMID", length = 50)
	protected String fromID;

	@Column(name = "TNAME", length = 250)
	protected String tname;

	@Column(name = "DUTY", length = 100)
	protected String duty;

	@Column(name = "TAGNUM", length = 50)
	protected String tagnum;

	@Column(name = "FILENUM", length = 50)
	protected String filenum;

	@Column(name = "THEMATIC", length = 100)
	protected String thematic;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTIME")
	protected Date ctime;

	@Column(name = "PAGENO", length = 20)
	protected String pageno;

	@Column(name = "SLEVEL", length = 30)
	protected String slevel;

	@Column(name = "PAGE")
	protected Integer page;

	@Column(name = "FILETYPE", length = 50)
	protected String filetype;

	@Column(name = "FONTSNUM", length = 30)
	protected String fontsnum;

	@Column(name = "SAVETIME", length = 10)
	protected String savetime;

	@Column(name = "COMPANY", length = 250)
	protected String company;

	@Column(name = "YEAR")
	protected Integer year;

	@Column(name = "FILEATT", length = 50)
	protected String fileatt;

	@Column(name = "ANNOTATIONS", length = 100)
	protected String annotations;

	@Column(name = "CARRIERTYPE", length = 50)
	protected String carriertype;

	@Column(name = "SUMMARY", length = 200)
	protected String summary;

	@Column(name = "PTEXT", length = 30)
	protected String ptext;

	@Column(name = "CARRIERU", length = 50)
	protected String carrieru;

	@Column(name = "GLIDENUM", length = 50)
	protected String glidenum;

	@Column(name = "EFILE", length = 50)
	protected String efile;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FTIME")
	protected Date ftime;

	@Column(name = "TOTALNUM", length = 50)
	protected String totalnum;

	@Column(name = "INPUTMAN", length = 20)
	protected String inputman;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ETIME")
	protected Date etime;

	@Column(name = "DOTNUM", length = 20)
	protected String dotnum;

	@Column(name = "PICNUM", length = 30)
	protected String picnum;

	@Column(name = "RECNUM", length = 20)
	protected String recnum;

	@Column(name = "TOTAL")
	protected Integer total;

	@Column(name = "PAGETYPE", length = 100)
	protected String pagetype;

	@Column(name = "ISCOM", length = 1)
	protected String iscom;

	@Column(name = "ISLOCATE", length = 1)
	protected String islocate;

	@Column(name = "WCOMPANY", length = 200)
	protected String wcompany;

	@Column(name = "WCOMPANYID", length = 50)
	protected String wcompanyID;

	@Column(name = "SENDFLAG", length = 1)
	protected String sendflag;

	@Column(name = "LCONTENT", length = 100)
	protected String lcontent;

	@Column(name = "LCOMPANY", length = 250)
	protected String lcompany;

	@Column(name = "LMAN", length = 50)
	protected String lman;

	@Column(name = "LLEN", length = 50)
	protected String llen;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LDATE")
	protected Date ldate;

	@Column(name = "JCONTEN", length = 100)
	protected String jconten;

	@Column(name = "JPLACE", length = 100)
	protected String jplace;

	@Column(name = "JMAN", length = 50)
	protected String jman;

	@Column(name = "JBACK", length = 50)
	protected String jback;

	@Column(name = "JACTOR", length = 50)
	protected String jactor;

	@Column(name = "JNUM", length = 30)
	protected String jnum;

	@Column(name = "JBNUM", length = 30)
	protected String jbnum;

	@Column(name = "TNUM", length = 50)
	protected String tnum;

	@Column(name = "TZOOM", length = 20)
	protected String tzoom;

	@Column(name = "TFLAG", length = 30)
	protected String tflag;

	@Column(name = "TDESIGNER", length = 20)
	protected String tdesigner;

	@Column(name = "TVIEWER", length = 200)
	protected String tviewer;

	@Column(name = "TASSESSOR", length = 20)
	protected String tassessor;

	@Column(name = "TVISION", length = 20)
	protected String tvision;

	@Column(name = "CLISTNO")
	protected Integer clistno;

	@Column(name = "CPAGENO", length = 20)
	protected String cpageno;

	@Column(name = "VNUM", length = 200)
	protected String vnum;

	@Column(name = "CVNUM", length = 200)
	protected String cvnum;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTIME_END")
	protected Date ctimeEnd;

	@Column(name = "SYS_LISTNO")
	protected Integer sysListno;

	@Column(name = "SYSADDINT")
	protected Integer sysaddint;

	@Column(name = "CHKEFILEINT")
	protected Integer chkefileint;

	@Column(name = "PROJ_INDEX")
	protected Integer projIndex;

	@Column(name = "NOSCAN")
	protected Integer noscan;

	@Column(name = "TREE_PARENT")
	protected Integer treeParent;

	@Column(name = "TREE_LIST")
	protected Integer treeList;

	@Column(name = "TREE_DLISTSTR", length = 200)
	protected String treeDliststr;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsPfile() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsPfile other = (DmsPfile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
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

	public String getCheckupflag() {
		return this.checkupflag;
	}

	public Integer getChkefileint() {
		return this.chkefileint;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public Integer getClistno() {
		return this.clistno;
	}

	public String getCompany() {
		return this.company;
	}

	public String getCpageno() {
		return this.cpageno;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public Date getCtimeEnd() {
		return this.ctimeEnd;
	}

	public String getCvnum() {
		return this.cvnum;
	}

	public String getDotnum() {
		return this.dotnum;
	}

	public String getDuty() {
		return this.duty;
	}

	public Integer getDwid() {
		return this.dwid;
	}

	public String getEfile() {
		return this.efile;
	}

	public Integer getEfilenum() {
		return this.efilenum;
	}

	public Date getEtime() {
		return this.etime;
	}

	public Integer getFbid() {
		return this.fbid;
	}

	public String getFileatt() {
		return this.fileatt;
	}

	public String getFilenum() {
		return this.filenum;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public String getFilingflag() {
		return this.filingflag;
	}

	public String getFinishflag() {
		return this.finishflag;
	}

	public String getFlid() {
		return this.flid;
	}

	public String getFontsnum() {
		return this.fontsnum;
	}

	public String getFromID() {
		return this.fromID;
	}

	public Date getFtime() {
		return this.ftime;
	}

	public Integer getFxid() {
		return this.fxid;
	}

	public String getGlidenum() {
		return this.glidenum;
	}

	public String getId() {
		return this.id;
	}

	public Integer getIndexId() {
		return this.indexId;
	}

	public String getInputman() {
		return this.inputman;
	}

	public String getIscom() {
		return this.iscom;
	}

	public String getIslocate() {
		return this.islocate;
	}

	public String getJactor() {
		return this.jactor;
	}

	public String getJback() {
		return this.jback;
	}

	public String getJbnum() {
		return this.jbnum;
	}

	public String getJconten() {
		return this.jconten;
	}

	public String getJid() {
		return this.jid;
	}

	public String getJman() {
		return this.jman;
	}

	public String getJnum() {
		return this.jnum;
	}

	public String getJplace() {
		return this.jplace;
	}

	public String getLcompany() {
		return this.lcompany;
	}

	public String getLcontent() {
		return this.lcontent;
	}

	public Date getLdate() {
		return this.ldate;
	}

	public Long getListId() {
		return this.listId;
	}

	public Integer getListno() {
		return this.listno;
	}

	public String getListnum() {
		return this.listnum;
	}

	public String getLlen() {
		return this.llen;
	}

	public String getLman() {
		return this.lman;
	}

	public Integer getNoscan() {
		return this.noscan;
	}

	public String getOldvid() {
		return this.oldvid;
	}

	public String getOpenflag() {
		return this.openflag;
	}

	public Integer getPage() {
		return this.page;
	}

	public String getPageno() {
		return this.pageno;
	}

	public String getPagetype() {
		return this.pagetype;
	}

	public String getPicnum() {
		return this.picnum;
	}

	public Integer getPid() {
		return this.pid;
	}

	public Integer getProjid() {
		return this.projid;
	}

	public Integer getProjIndex() {
		return this.projIndex;
	}

	public String getPtext() {
		return this.ptext;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	public String getRecnum() {
		return this.recnum;
	}

	public String getSaveflag() {
		return this.saveflag;
	}

	public String getSavetime() {
		return this.savetime;
	}

	public String getSendflag() {
		return this.sendflag;
	}

	public String getSlevel() {
		return this.slevel;
	}

	public String getSummary() {
		return this.summary;
	}

	public Integer getSysaddint() {
		return this.sysaddint;
	}

	public Integer getSysListno() {
		return this.sysListno;
	}

	public String getTagnum() {
		return this.tagnum;
	}

	public String getTassessor() {
		return this.tassessor;
	}

	public String getTdesigner() {
		return this.tdesigner;
	}

	public String getTflag() {
		return this.tflag;
	}

	public String getThematic() {
		return this.thematic;
	}

	public String getTname() {
		return this.tname;
	}

	public String getTnum() {
		return this.tnum;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getTopnodem() {
		return this.topnodem;
	}

	public Integer getTotal() {
		return this.total;
	}

	public String getTotalnum() {
		return this.totalnum;
	}

	public String getTreeDliststr() {
		return this.treeDliststr;
	}

	public Integer getTreeList() {
		return this.treeList;
	}

	public Integer getTreeParent() {
		return this.treeParent;
	}

	public String getTviewer() {
		return this.tviewer;
	}

	public String getTvision() {
		return this.tvision;
	}

	public String getTzoom() {
		return this.tzoom;
	}

	public String getVid() {
		return this.vid;
	}

	public String getVisflag() {
		return this.visflag;
	}

	public String getVnum() {
		return this.vnum;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	public String getWcompanyID() {
		return this.wcompanyID;
	}

	public Integer getYear() {
		return this.year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public DmsPfile jsonToObject(JSONObject jsonObject) {
		return DmsPfileJsonFactory.jsonToObject(jsonObject);
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

	public void setCheckupflag(String checkupflag) {
		this.checkupflag = checkupflag;
	}

	public void setChkefileint(Integer chkefileint) {
		this.chkefileint = chkefileint;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setClistno(Integer clistno) {
		this.clistno = clistno;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCpageno(String cpageno) {
		this.cpageno = cpageno;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setCtimeEnd(Date ctimeEnd) {
		this.ctimeEnd = ctimeEnd;
	}

	public void setCvnum(String cvnum) {
		this.cvnum = cvnum;
	}

	public void setDotnum(String dotnum) {
		this.dotnum = dotnum;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setEfile(String efile) {
		this.efile = efile;
	}

	public void setEfilenum(Integer efilenum) {
		this.efilenum = efilenum;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFileatt(String fileatt) {
		this.fileatt = fileatt;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public void setFilingflag(String filingflag) {
		this.filingflag = filingflag;
	}

	public void setFinishflag(String finishflag) {
		this.finishflag = finishflag;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFontsnum(String fontsnum) {
		this.fontsnum = fontsnum;
	}

	public void setFromID(String fromID) {
		this.fromID = fromID;
	}

	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setGlidenum(String glidenum) {
		this.glidenum = glidenum;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setInputman(String inputman) {
		this.inputman = inputman;
	}

	public void setIscom(String iscom) {
		this.iscom = iscom;
	}

	public void setIslocate(String islocate) {
		this.islocate = islocate;
	}

	public void setJactor(String jactor) {
		this.jactor = jactor;
	}

	public void setJback(String jback) {
		this.jback = jback;
	}

	public void setJbnum(String jbnum) {
		this.jbnum = jbnum;
	}

	public void setJconten(String jconten) {
		this.jconten = jconten;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setJman(String jman) {
		this.jman = jman;
	}

	public void setJnum(String jnum) {
		this.jnum = jnum;
	}

	public void setJplace(String jplace) {
		this.jplace = jplace;
	}

	public void setLcompany(String lcompany) {
		this.lcompany = lcompany;
	}

	public void setLcontent(String lcontent) {
		this.lcontent = lcontent;
	}

	public void setLdate(Date ldate) {
		this.ldate = ldate;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public void setListno(Integer listno) {
		this.listno = listno;
	}

	public void setListnum(String listnum) {
		this.listnum = listnum;
	}

	public void setLlen(String llen) {
		this.llen = llen;
	}

	public void setLman(String lman) {
		this.lman = lman;
	}

	public void setNoscan(Integer noscan) {
		this.noscan = noscan;
	}

	public void setOldvid(String oldvid) {
		this.oldvid = oldvid;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	public void setPagetype(String pagetype) {
		this.pagetype = pagetype;
	}

	public void setPicnum(String picnum) {
		this.picnum = picnum;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}

	public void setProjIndex(Integer projIndex) {
		this.projIndex = projIndex;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setRecnum(String recnum) {
		this.recnum = recnum;
	}

	public void setSaveflag(String saveflag) {
		this.saveflag = saveflag;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSendflag(String sendflag) {
		this.sendflag = sendflag;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setSysaddint(Integer sysaddint) {
		this.sysaddint = sysaddint;
	}

	public void setSysListno(Integer sysListno) {
		this.sysListno = sysListno;
	}

	public void setTagnum(String tagnum) {
		this.tagnum = tagnum;
	}

	public void setTassessor(String tassessor) {
		this.tassessor = tassessor;
	}

	public void setTdesigner(String tdesigner) {
		this.tdesigner = tdesigner;
	}

	public void setTflag(String tflag) {
		this.tflag = tflag;
	}

	public void setThematic(String thematic) {
		this.thematic = thematic;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTnum(String tnum) {
		this.tnum = tnum;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodem(String topnodem) {
		this.topnodem = topnodem;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void setTotalnum(String totalnum) {
		this.totalnum = totalnum;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setTreeList(Integer treeList) {
		this.treeList = treeList;
	}

	public void setTreeParent(Integer treeParent) {
		this.treeParent = treeParent;
	}

	public void setTviewer(String tviewer) {
		this.tviewer = tviewer;
	}

	public void setTvision(String tvision) {
		this.tvision = tvision;
	}

	public void setTzoom(String tzoom) {
		this.tzoom = tzoom;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public void setVisflag(String visflag) {
		this.visflag = visflag;
	}

	public void setVnum(String vnum) {
		this.vnum = vnum;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public void setWcompanyID(String wcompanyID) {
		this.wcompanyID = wcompanyID;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public JSONObject toJsonObject() {
		return DmsPfileJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsPfileJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
