package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

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
import com.glaf.core.base.JSONable;

import com.glaf.isdp.util.VolumeJsonFactory;

@Entity
@Table(name = "volume")
public class Volume implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * oldid
	 */
	@Column(name = "oldid", length = 50)
	protected String oldid;

	/**
	 * ruleID
	 */
	@Column(name = "ruleID", length = 50)
	protected String ruleID;

	/**
	 * ruleflag
	 */
	@Column(name = "ruleflag", length = 1)
	protected String ruleflag;

	/**
	 * rulepid
	 */
	@Column(name = "rulepid", length = 50)
	protected String rulepid;

	/**
	 * vid
	 */
	@Column(name = "vid", length = 50)
	protected String vid;

	/**
	 * sumflag
	 */
	@Column(name = "sumflag", length = 1)
	protected String sumflag;

	/**
	 * topid
	 */
	@Column(name = "topid")
	protected int topid;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * projid
	 */
	@Column(name = "projid")
	protected int projid;

	/**
	 * pid
	 */
	@Column(name = "pid")
	protected int pid;

	/**
	 * pname
	 */
	@Column(name = "pname", length = 200)
	protected String pname;

	/**
	 * vflag
	 */
	@Column(name = "vflag", length = 1)
	protected String vflag;

	/**
	 * vname
	 */
	@Column(name = "vname", length = 200)
	protected String vname;

	/**
	 * year
	 */
	@Column(name = "year")
	protected int year;

	/**
	 * glidenum
	 */
	@Column(name = "glidenum", length = 20)
	protected String glidenum;

	/**
	 * filingflag
	 */
	@Column(name = "filingflag", length = 1)
	protected String filingflag;

	/**
	 * checkupflag
	 */
	@Column(name = "checkupflag", length = 1)
	protected String checkupflag;

	/**
	 * openflag
	 */
	@Column(name = "openflag", length = 1)
	protected String openflag;

	/**
	 * finishflag
	 */
	@Column(name = "finishflag", length = 1)
	protected String finishflag;

	/**
	 * vtagnum
	 */
	@Column(name = "vtagnum", length = 20)
	protected String vtagnum;

	/**
	 * vtype
	 */
	@Column(name = "vtype", length = 50)
	protected String vtype;

	/**
	 * vnum
	 */
	@Column(name = "vnum", length = 200)
	protected String vnum;

	/**
	 * vtmpnum
	 */
	@Column(name = "vtmpnum", length = 100)
	protected String vtmpnum;

	/**
	 * roomnum
	 */
	@Column(name = "roomnum", length = 20)
	protected String roomnum;

	/**
	 * zoonum
	 */
	@Column(name = "zoonum", length = 20)
	protected String zoonum;

	/**
	 * efilenum
	 */
	@Column(name = "efilenum", length = 20)
	protected String efilenum;

	/**
	 * boxnum
	 */
	@Column(name = "boxnum", length = 20)
	protected String boxnum;

	/**
	 * place
	 */
	@Column(name = "place", length = 12)
	protected String place;

	/**
	 * tname
	 */
	@Column(name = "tname", length = 100)
	protected String tname;

	/**
	 * wcompany
	 */
	@Column(name = "wcompany", length = 200)
	protected String wcompany;

	/**
	 * wdate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "wdate")
	protected Date wdate;

	/**
	 * carriertype
	 */
	@Column(name = "carriertype", length = 50)
	protected String carriertype;

	/**
	 * numunit
	 */
	@Column(name = "numunit", length = 20)
	protected String numunit;

	/**
	 * spec
	 */
	@Column(name = "spec", length = 20)
	protected String spec;

	/**
	 * startday
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startday")
	protected Date startday;

	/**
	 * endday
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "endday")
	protected Date endday;

	/**
	 * savetime
	 */
	@Column(name = "savetime", length = 20)
	protected String savetime;

	/**
	 * slevel
	 */
	@Column(name = "slevel", length = 20)
	protected String slevel;

	/**
	 * thematic
	 */
	@Column(name = "thematic", length = 20)
	protected String thematic;

	/**
	 * annotations
	 */
	@Column(name = "annotations", length = 100)
	protected String annotations;

	/**
	 * totalfile
	 */
	@Column(name = "totalfile")
	protected int totalfile;

	/**
	 * totalpage
	 */
	@Column(name = "totalpage")
	protected int totalpage;

	/**
	 * txtpage
	 */
	@Column(name = "txtpage")
	protected int txtpage;

	/**
	 * picpage
	 */
	@Column(name = "picpage")
	protected int picpage;

	/**
	 * photopage
	 */
	@Column(name = "photopage")
	protected int photopage;

	/**
	 * cman
	 */
	@Column(name = "cman", length = 20)
	protected String cman;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * assessor
	 */
	@Column(name = "assessor", length = 20)
	protected String assessor;

	/**
	 * atime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "atime")
	protected Date atime;

	/**
	 * content
	 */
	@Column(name = "content", length = 100)
	protected String content;

	/**
	 * islocate
	 */
	@Column(name = "islocate", length = 1)
	protected String islocate;

	/**
	 * topnode
	 */
	@Column(name = "topnode", length = 150)
	protected String topnode;

	/**
	 * lcontent
	 */
	@Column(name = "lcontent", length = 100)
	protected String lcontent;

	/**
	 * lcompany
	 */
	@Column(name = "lcompany", length = 100)
	protected String lcompany;

	/**
	 * lman
	 */
	@Column(name = "lman", length = 50)
	protected String lman;

	/**
	 * llen
	 */
	@Column(name = "llen", length = 50)
	protected String llen;

	/**
	 * ldate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ldate")
	protected Date ldate;

	/**
	 * jconten
	 */
	@Column(name = "jconten", length = 100)
	protected String jconten;

	/**
	 * jplace
	 */
	@Column(name = "jplace", length = 100)
	protected String jplace;

	/**
	 * jman
	 */
	@Column(name = "jman", length = 100)
	protected String jman;

	/**
	 * jback
	 */
	@Column(name = "jback", length = 100)
	protected String jback;

	/**
	 * jactor
	 */
	@Column(name = "jactor", length = 50)
	protected String jactor;

	/**
	 * tnum
	 */
	@Column(name = "tnum", length = 50)
	protected String tnum;

	/**
	 * tzoom
	 */
	@Column(name = "tzoom", length = 20)
	protected String tzoom;

	/**
	 * tflag
	 */
	@Column(name = "tflag", length = 30)
	protected String tflag;

	/**
	 * tdesigner
	 */
	@Column(name = "tdesigner", length = 20)
	protected String tdesigner;

	/**
	 * tviewer
	 */
	@Column(name = "tviewer", length = 100)
	protected String tviewer;

	/**
	 * tassessor
	 */
	@Column(name = "tassessor", length = 20)
	protected String tassessor;

	/**
	 * tvision
	 */
	@Column(name = "tvision", length = 50)
	protected String tvision;

	/**
	 * finishday
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "finishday")
	protected Date finishday;

	public Volume() {

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

	public int getIndexId() {
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

	public int getListno() {
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

	public int getPhotopage() {
		return this.photopage;
	}

	public int getPicpage() {
		return this.picpage;
	}

	public int getPid() {
		return this.pid;
	}

	public String getPlace() {
		return this.place;
	}

	public String getPname() {
		return this.pname;
	}

	public int getProjid() {
		return this.projid;
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

	public int getTopid() {
		return this.topid;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public int getTotalfile() {
		return this.totalfile;
	}

	public int getTotalpage() {
		return this.totalpage;
	}

	public String getTviewer() {
		return this.tviewer;
	}

	public String getTvision() {
		return this.tvision;
	}

	public int getTxtpage() {
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

	public int getYear() {
		return this.year;
	}

	public String getZoonum() {
		return this.zoonum;
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

	public void setIndexId(int indexId) {
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

	public void setListno(int listno) {
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

	public void setPhotopage(int photopage) {
		this.photopage = photopage;
	}

	public void setPicpage(int picpage) {
		this.picpage = picpage;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setProjid(int projid) {
		this.projid = projid;
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

	public void setTopid(int topid) {
		this.topid = topid;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTotalfile(int totalfile) {
		this.totalfile = totalfile;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public void setTviewer(String tviewer) {
		this.tviewer = tviewer;
	}

	public void setTvision(String tvision) {
		this.tvision = tvision;
	}

	public void setTxtpage(int txtpage) {
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

	public void setYear(int year) {
		this.year = year;
	}

	public void setZoonum(String zoonum) {
		this.zoonum = zoonum;
	}

	public Volume jsonToObject(JSONObject jsonObject) {
		return VolumeJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return VolumeJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return VolumeJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
