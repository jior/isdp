package com.glaf.isdp.domain;

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

import com.glaf.isdp.util.PfileJsonFactory;

@Entity
@Table(name = "pfile")
public class IsdpPfile implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * efilenum
	 */
	@Column(name = "efilenum")
	protected int efilenum;

	/**
	 * listnum
	 */
	@Column(name = "listnum", length = 100)
	protected String listnum;

	/**
	 * list_id
	 */
	@Column(name = "list_id")
	protected Long listId;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * pid
	 */
	@Column(name = "pid")
	protected int pid;

	/**
	 * projid
	 */
	@Column(name = "projid")
	protected int projid;

	/**
	 * dwid
	 */
	@Column(name = "dwid")
	protected int dwid;

	/**
	 * fbid
	 */
	@Column(name = "fbid")
	protected int fbid;

	/**
	 * fxid
	 */
	@Column(name = "fxid")
	protected int fxid;

	/**
	 * jid
	 */
	@Column(name = "jid", length = 50)
	protected String jid;

	/**
	 * flid
	 */
	@Column(name = "flid", length = 50)
	protected String flid;

	/**
	 * topnode
	 */
	@Column(name = "topnode", length = 150)
	protected String topnode;

	/**
	 * topnodem
	 */
	@Column(name = "topnodem", length = 150)
	protected String topnodem;

	/**
	 * vid
	 */
	@Column(name = "vid", length = 50)
	protected String vid;

	/**
	 * oldvid
	 */
	@Column(name = "oldvid", length = 50)
	protected String oldvid;

	/**
	 * visflag
	 */
	@Column(name = "visflag", length = 1)
	protected String visflag;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * filingflag
	 */
	@Column(name = "filingflag", length = 1)
	protected String filingflag;

	/**
	 * saveflag
	 */
	@Column(name = "saveflag", length = 1)
	protected String saveflag;

	/**
	 * openflag
	 */
	@Column(name = "openflag", length = 1)
	protected String openflag;

	/**
	 * checkupflag
	 */
	@Column(name = "checkupflag", length = 1)
	protected String checkupflag;

	/**
	 * finishflag
	 */
	@Column(name = "finishflag", length = 1)
	protected String finishflag;

	/**
	 * fromID
	 */
	@Column(name = "fromID", length = 50)
	protected String fromID;

	/**
	 * tname
	 */
	@Column(name = "tname", length = 250)
	protected String tname;

	/**
	 * duty
	 */
	@Column(name = "duty", length = 100)
	protected String duty;

	/**
	 * tagnum
	 */
	@Column(name = "tagnum", length = 50)
	protected String tagnum;

	/**
	 * filenum
	 */
	@Column(name = "filenum", length = 50)
	protected String filenum;

	/**
	 * thematic
	 */
	@Column(name = "thematic", length = 100)
	protected String thematic;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date ctime;

	/**
	 * pageno
	 */
	@Column(name = "pageno", length = 20)
	protected String pageno;

	/**
	 * slevel
	 */
	@Column(name = "slevel", length = 30)
	protected String slevel;

	/**
	 * page
	 */
	@Column(name = "page")
	protected int page;

	/**
	 * filetype
	 */
	@Column(name = "filetype", length = 50)
	protected String filetype;

	/**
	 * fontsnum
	 */
	@Column(name = "fontsnum", length = 30)
	protected String fontsnum;

	/**
	 * savetime
	 */
	@Column(name = "savetime", length = 10)
	protected String savetime;

	/**
	 * company
	 */
	@Column(name = "company", length = 250)
	protected String company;

	/**
	 * year
	 */
	@Column(name = "year")
	protected int year;

	/**
	 * fileatt
	 */
	@Column(name = "fileatt", length = 50)
	protected String fileatt;

	/**
	 * annotations
	 */
	@Column(name = "annotations", length = 100)
	protected String annotations;

	/**
	 * carriertype
	 */
	@Column(name = "carriertype", length = 50)
	protected String carriertype;

	/**
	 * summary
	 */
	@Column(name = "summary", length = 200)
	protected String summary;

	/**
	 * ptext
	 */
	@Column(name = "ptext", length = 30)
	protected String ptext;

	/**
	 * carrieru
	 */
	@Column(name = "carrieru", length = 50)
	protected String carrieru;

	/**
	 * glidenum
	 */
	@Column(name = "glidenum", length = 50)
	protected String glidenum;

	/**
	 * efile
	 */
	@Column(name = "efile", length = 50)
	protected String efile;

	/**
	 * ftime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ftime")
	protected Date ftime;

	/**
	 * totalnum
	 */
	@Column(name = "totalnum", length = 50)
	protected String totalnum;

	/**
	 * inputman
	 */
	@Column(name = "inputman", length = 20)
	protected String inputman;

	/**
	 * etime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "etime")
	protected Date etime;

	/**
	 * dotnum
	 */
	@Column(name = "dotnum", length = 20)
	protected String dotnum;

	/**
	 * picnum
	 */
	@Column(name = "picnum", length = 30)
	protected String picnum;

	/**
	 * recnum
	 */
	@Column(name = "recnum", length = 20)
	protected String recnum;

	/**
	 * total
	 */
	@Column(name = "total")
	protected int total;

	/**
	 * pagetype
	 */
	@Column(name = "pagetype", length = 100)
	protected String pagetype;

	/**
	 * iscom
	 */
	@Column(name = "iscom", length = 1)
	protected String iscom;

	/**
	 * islocate
	 */
	@Column(name = "islocate", length = 1)
	protected String islocate;

	/**
	 * wcompany
	 */
	@Column(name = "wcompany", length = 200)
	protected String wcompany;

	/**
	 * wcompanyID
	 */
	@Column(name = "wcompanyID", length = 50)
	protected String wcompanyID;

	/**
	 * sendflag
	 */
	@Column(name = "sendflag", length = 1)
	protected String sendflag;

	/**
	 * lcontent
	 */
	@Column(name = "lcontent", length = 100)
	protected String lcontent;

	/**
	 * lcompany
	 */
	@Column(name = "lcompany", length = 250)
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
	@Column(name = "jman", length = 50)
	protected String jman;

	/**
	 * jback
	 */
	@Column(name = "jback", length = 50)
	protected String jback;

	/**
	 * jactor
	 */
	@Column(name = "jactor", length = 50)
	protected String jactor;

	/**
	 * jnum
	 */
	@Column(name = "jnum", length = 30)
	protected String jnum;

	/**
	 * jbnum
	 */
	@Column(name = "jbnum", length = 30)
	protected String jbnum;

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
	@Column(name = "tviewer", length = 200)
	protected String tviewer;

	/**
	 * tassessor
	 */
	@Column(name = "tassessor", length = 20)
	protected String tassessor;

	/**
	 * tvision
	 */
	@Column(name = "tvision", length = 20)
	protected String tvision;

	/**
	 * clistno
	 */
	@Column(name = "clistno")
	protected int clistno;

	/**
	 * cpageno
	 */
	@Column(name = "cpageno", length = 20)
	protected String cpageno;

	/**
	 * vnum
	 */
	@Column(name = "vnum", length = 200)
	protected String vnum;

	/**
	 * cvnum
	 */
	@Column(name = "cvnum", length = 200)
	protected String cvnum;

	/**
	 * tree_dliststr
	 */
	@Column(name = "tree_dliststr", length = 50)
	protected String treeDliststr;

	/**
	 * ctime_end
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime_end")
	protected Date ctimeEnd;

	/**
	 * proj_index
	 */
	@Column(name = "proj_index")
	protected int projIndex;

	/**
	 * tree_parent
	 */
	@Column(name = "tree_parent")
	protected int treeParent;

	/**
	 * tree_list
	 */
	@Column(name = "tree_list")
	protected int treeList;

	public IsdpPfile() {

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

	public int getClistno() {
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

	public int getDwid() {
		return this.dwid;
	}

	public String getEfile() {
		return this.efile;
	}

	public int getEfilenum() {
		return this.efilenum;
	}

	public Date getEtime() {
		return this.etime;
	}

	public int getFbid() {
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

	public int getFxid() {
		return this.fxid;
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

	public int getListno() {
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

	public String getOldvid() {
		return this.oldvid;
	}

	public String getOpenflag() {
		return this.openflag;
	}

	public int getPage() {
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

	public int getPid() {
		return this.pid;
	}

	public int getProjid() {
		return this.projid;
	}

	public int getProjIndex() {
		return this.projIndex;
	}

	public String getPtext() {
		return this.ptext;
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

	public int getTotal() {
		return this.total;
	}

	public String getTotalnum() {
		return this.totalnum;
	}

	public String getTreeDliststr() {
		return this.treeDliststr;
	}

	public int getTreeList() {
		return this.treeList;
	}

	public int getTreeParent() {
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

	public int getYear() {
		return this.year;
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

	public void setClistno(int clistno) {
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

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public void setEfile(String efile) {
		this.efile = efile;
	}

	public void setEfilenum(int efilenum) {
		this.efilenum = efilenum;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public void setFbid(int fbid) {
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

	public void setFxid(int fxid) {
		this.fxid = fxid;
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

	public void setListno(int listno) {
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

	public void setOldvid(String oldvid) {
		this.oldvid = oldvid;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public void setPage(int page) {
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

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setProjid(int projid) {
		this.projid = projid;
	}

	public void setProjIndex(int projIndex) {
		this.projIndex = projIndex;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
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

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotalnum(String totalnum) {
		this.totalnum = totalnum;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setTreeList(int treeList) {
		this.treeList = treeList;
	}

	public void setTreeParent(int treeParent) {
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

	public void setYear(int year) {
		this.year = year;
	}

	public IsdpPfile jsonToObject(JSONObject jsonObject) {
		return PfileJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return PfileJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return PfileJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
