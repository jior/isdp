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
import com.glaf.dms.util.DmsVolumeJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "VOLUME")
public class DmsVolume implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false)
	protected String id;

	@Column(name = "LISTNO")
	protected Integer listno;

	@Column(name = "OLDID", length = 50)
	protected String oldid;

	@Column(name = "RULEID", length = 50)
	protected String ruleID;

	@Column(name = "RULEFLAG", length = 1)
	protected String ruleflag;

	@Column(name = "RULEPID", length = 50)
	protected String rulepid;

	@Column(name = "VID", length = 50)
	protected String vid;

	@Column(name = "SUMFLAG", length = 1)
	protected String sumflag;

	@Column(name = "TOPID")
	protected Integer topid;

	@Column(name = "INDEX_ID")
	protected Integer indexId;

	@Column(name = "PROJID")
	protected Integer projid;

	@Column(name = "PID")
	protected Integer pid;

	@Column(name = "PNAME", length = 200)
	protected String pname;

	@Column(name = "VFLAG", length = 1)
	protected String vflag;

	@Column(name = "VNAME", length = 200)
	protected String vname;

	@Column(name = "YEAR")
	protected Integer year;

	@Column(name = "GLIDENUM", length = 20)
	protected String glidenum;

	@Column(name = "FILINGFLAG", length = 1)
	protected String filingflag;

	@Column(name = "CHECKUPFLAG", length = 1)
	protected String checkupflag;

	@Column(name = "OPENFLAG", length = 1)
	protected String openflag;

	@Column(name = "FINISHFLAG", length = 1)
	protected String finishflag;

	@Column(name = "VTAGNUM", length = 20)
	protected String vtagnum;

	@Column(name = "VTYPE", length = 50)
	protected String vtype;

	@Column(name = "VNUM", length = 150)
	protected String vnum;

	@Column(name = "VTMPNUM", length = 150)
	protected String vtmpnum;

	@Column(name = "ROOMNUM", length = 20)
	protected String roomnum;

	@Column(name = "ZOONUM", length = 20)
	protected String zoonum;

	@Column(name = "EFILENUM", length = 20)
	protected String efilenum;

	@Column(name = "BOXNUM", length = 20)
	protected String boxnum;

	@Column(name = "PLACE", length = 12)
	protected String place;

	@Column(name = "TNAME", length = 100)
	protected String tname;

	@Column(name = "WCOMPANY", length = 200)
	protected String wcompany;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "WDATE")
	protected Date wdate;

	@Column(name = "CARRIERTYPE", length = 50)
	protected String carriertype;

	@Column(name = "NUMUNIT", length = 20)
	protected String numunit;

	@Column(name = "SPEC", length = 20)
	protected String spec;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDAY")
	protected Date startday;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ENDDAY")
	protected Date endday;

	@Column(name = "SAVETIME", length = 20)
	protected String savetime;

	@Column(name = "SLEVEL", length = 20)
	protected String slevel;

	@Column(name = "THEMATIC", length = 20)
	protected String thematic;

	@Column(name = "ANNOTATIONS", length = 100)
	protected String annotations;

	@Column(name = "TOTALFILE")
	protected Integer totalfile;

	@Column(name = "TOTALPAGE")
	protected Integer totalpage;

	@Column(name = "TXTPAGE")
	protected Integer txtpage;

	@Column(name = "PICPAGE")
	protected Integer picpage;

	@Column(name = "PHOTOPAGE")
	protected Integer photopage;

	@Column(name = "CMAN", length = 20)
	protected String cman;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTIME")
	protected Date ctime;

	@Column(name = "ASSESSOR", length = 20)
	protected String assessor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ATIME")
	protected Date atime;

	@Column(name = "CONTENT", length = 100)
	protected String content;

	@Column(name = "ISLOCATE", length = 1)
	protected String islocate;

	@Column(name = "TOPNODE", length = 150)
	protected String topnode;

	@Column(name = "LCONTENT", length = 100)
	protected String lcontent;

	@Column(name = "LCOMPANY", length = 100)
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

	@Column(name = "JMAN", length = 100)
	protected String jman;

	@Column(name = "JBACK", length = 100)
	protected String jback;

	@Column(name = "JACTOR", length = 50)
	protected String jactor;

	@Column(name = "TNUM", length = 50)
	protected String tnum;

	@Column(name = "TZOOM", length = 20)
	protected String tzoom;

	@Column(name = "TFLAG", length = 30)
	protected String tflag;

	@Column(name = "TDESIGNER", length = 20)
	protected String tdesigner;

	@Column(name = "TVIEWER", length = 100)
	protected String tviewer;

	@Column(name = "TASSESSOR", length = 20)
	protected String tassessor;

	@Column(name = "TVISION", length = 50)
	protected String tvision;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FINISHDAY")
	protected Date finishday;

	@Column(name = "CHOOSEPUBLISHFLAG", length = 10)
	protected String choosePublishFlag;

	@Column(name = "CHOOSEPUBLISHTIME")
	protected Long choosePublishTime;

	@Column(name = "PUBLISHDISKID")
	protected Integer publishdiskid;

	public DmsVolume() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DmsVolume other = (DmsVolume) obj;
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

	public String getAssessor() {
		return this.assessor;
	}

	public Date getAtime() {
		return this.atime;
	}

	public String getBoxnum() {
		return this.boxnum;
	}

	public String getCarriertype() {
		return this.carriertype;
	}

	public String getCheckupflag() {
		return this.checkupflag;
	}

	public String getChoosePublishFlag() {
		return this.choosePublishFlag;
	}

	public Long getChoosePublishTime() {
		return this.choosePublishTime;
	}

	public String getCman() {
		return this.cman;
	}

	public String getContent() {
		return this.content;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public String getEfilenum() {
		return this.efilenum;
	}

	public Date getEndday() {
		return this.endday;
	}

	public String getFilingflag() {
		return this.filingflag;
	}

	public Date getFinishday() {
		return this.finishday;
	}

	public String getFinishflag() {
		return this.finishflag;
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

	public String getIslocate() {
		return this.islocate;
	}

	public String getJactor() {
		return this.jactor;
	}

	public String getJback() {
		return this.jback;
	}

	public String getJconten() {
		return this.jconten;
	}

	public String getJman() {
		return this.jman;
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

	public Integer getListno() {
		return this.listno;
	}

	public String getLlen() {
		return this.llen;
	}

	public String getLman() {
		return this.lman;
	}

	public String getNumunit() {
		return this.numunit;
	}

	public String getOldid() {
		return this.oldid;
	}

	public String getOpenflag() {
		return this.openflag;
	}

	public Integer getPhotopage() {
		return this.photopage;
	}

	public Integer getPicpage() {
		return this.picpage;
	}

	public Integer getPid() {
		return this.pid;
	}

	public String getPlace() {
		return this.place;
	}

	public String getPname() {
		return this.pname;
	}

	public Integer getProjid() {
		return this.projid;
	}

	public Integer getPublishdiskid() {
		return this.publishdiskid;
	}

	public String getRoomnum() {
		return this.roomnum;
	}

	public String getRuleflag() {
		return this.ruleflag;
	}

	public String getRuleID() {
		return this.ruleID;
	}

	public String getRulepid() {
		return this.rulepid;
	}

	public String getSavetime() {
		return this.savetime;
	}

	public String getSlevel() {
		return this.slevel;
	}

	public String getSpec() {
		return this.spec;
	}

	public Date getStartday() {
		return this.startday;
	}

	public String getSumflag() {
		return this.sumflag;
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

	public Integer getTopid() {
		return this.topid;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public Integer getTotalfile() {
		return this.totalfile;
	}

	public Integer getTotalpage() {
		return this.totalpage;
	}

	public String getTviewer() {
		return this.tviewer;
	}

	public String getTvision() {
		return this.tvision;
	}

	public Integer getTxtpage() {
		return this.txtpage;
	}

	public String getTzoom() {
		return this.tzoom;
	}

	public String getVflag() {
		return this.vflag;
	}

	public String getVid() {
		return this.vid;
	}

	public String getVname() {
		return this.vname;
	}

	public String getVnum() {
		return this.vnum;
	}

	public String getVtagnum() {
		return this.vtagnum;
	}

	public String getVtmpnum() {
		return this.vtmpnum;
	}

	public String getVtype() {
		return this.vtype;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	public Date getWdate() {
		return this.wdate;
	}

	public Integer getYear() {
		return this.year;
	}

	public String getZoonum() {
		return this.zoonum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public DmsVolume jsonToObject(JSONObject jsonObject) {
		return DmsVolumeJsonFactory.jsonToObject(jsonObject);
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public void setAssessor(String assessor) {
		this.assessor = assessor;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	public void setBoxnum(String boxnum) {
		this.boxnum = boxnum;
	}

	public void setCarriertype(String carriertype) {
		this.carriertype = carriertype;
	}

	public void setCheckupflag(String checkupflag) {
		this.checkupflag = checkupflag;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setCman(String cman) {
		this.cman = cman;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setEfilenum(String efilenum) {
		this.efilenum = efilenum;
	}

	public void setEndday(Date endday) {
		this.endday = endday;
	}

	public void setFilingflag(String filingflag) {
		this.filingflag = filingflag;
	}

	public void setFinishday(Date finishday) {
		this.finishday = finishday;
	}

	public void setFinishflag(String finishflag) {
		this.finishflag = finishflag;
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

	public void setIslocate(String islocate) {
		this.islocate = islocate;
	}

	public void setJactor(String jactor) {
		this.jactor = jactor;
	}

	public void setJback(String jback) {
		this.jback = jback;
	}

	public void setJconten(String jconten) {
		this.jconten = jconten;
	}

	public void setJman(String jman) {
		this.jman = jman;
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

	public void setListno(Integer listno) {
		this.listno = listno;
	}

	public void setLlen(String llen) {
		this.llen = llen;
	}

	public void setLman(String lman) {
		this.lman = lman;
	}

	public void setNumunit(String numunit) {
		this.numunit = numunit;
	}

	public void setOldid(String oldid) {
		this.oldid = oldid;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public void setPhotopage(Integer photopage) {
		this.photopage = photopage;
	}

	public void setPicpage(Integer picpage) {
		this.picpage = picpage;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	public void setRuleflag(String ruleflag) {
		this.ruleflag = ruleflag;
	}

	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public void setRulepid(String rulepid) {
		this.rulepid = rulepid;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public void setSumflag(String sumflag) {
		this.sumflag = sumflag;
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

	public void setTopid(Integer topid) {
		this.topid = topid;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTotalfile(Integer totalfile) {
		this.totalfile = totalfile;
	}

	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}

	public void setTviewer(String tviewer) {
		this.tviewer = tviewer;
	}

	public void setTvision(String tvision) {
		this.tvision = tvision;
	}

	public void setTxtpage(Integer txtpage) {
		this.txtpage = txtpage;
	}

	public void setTzoom(String tzoom) {
		this.tzoom = tzoom;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public void setVnum(String vnum) {
		this.vnum = vnum;
	}

	public void setVtagnum(String vtagnum) {
		this.vtagnum = vtagnum;
	}

	public void setVtmpnum(String vtmpnum) {
		this.vtmpnum = vtmpnum;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setZoonum(String zoonum) {
		this.zoonum = zoonum;
	}

	public JSONObject toJsonObject() {
		return DmsVolumeJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return DmsVolumeJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
