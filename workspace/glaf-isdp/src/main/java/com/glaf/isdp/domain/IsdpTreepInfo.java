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

import com.glaf.isdp.util.TreepInfoJsonFactory;

@Entity
@Table(name = "treepinfo")
public class IsdpTreepInfo implements Serializable, ITree, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "index_id", nullable = false)
	protected int indexId;

	@Column(name = "parent_id")
	protected int parentId;

	/**
	 * id
	 */
	@Column(name = "id", length = 100)
	protected String id;

	/**
	 * num
	 */
	@Column(name = "num", length = 50)
	protected String num;

	/**
	 * top_id
	 */
	@Column(name = "top_id")
	protected int topId;

	/**
	 * index_name
	 */
	@Column(name = "index_name", length = 255)
	protected String indexName;

	/**
	 * nlevel
	 */
	@Column(name = "nlevel")
	protected int nlevel;

	/**
	 * nodetype
	 */
	@Column(name = "nodetype", length = 1)
	protected String nodetype;

	/**
	 * fromid
	 */
	@Column(name = "fromid")
	protected int fromid;

	/**
	 * part_id
	 */
	@Column(name = "part_id")
	protected int partId;

	/**
	 * showid
	 */
	@Column(name = "showid")
	protected int showid;

	/**
	 * sindex_name
	 */
	@Column(name = "sindex_name", length = 255)
	protected String sindexName;

	/**
	 * filenum
	 */
	@Column(name = "filenum")
	protected int filenum;

	/**
	 * filenum0
	 */
	@Column(name = "filenum0")
	protected int filenum0;

	/**
	 * filenum1
	 */
	@Column(name = "filenum1")
	protected int filenum1;

	/**
	 * filenum2
	 */
	@Column(name = "filenum2")
	protected int filenum2;

	/**
	 * projtype
	 */
	@Column(name = "projtype", length = 1)
	protected String projtype;

	/**
	 * cid
	 */
	@Column(name = "cid", length = 50)
	protected String cid;

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
	@Column(name = "topnode", length = 250)
	protected String topnode;

	/**
	 * nodeico
	 */
	@Column(name = "nodeico")
	protected int nodeico;

	/**
	 * outflag
	 */
	@Column(name = "outflag", length = 1)
	protected String outflag;

	/**
	 * inflag
	 */
	@Column(name = "inflag", length = 1)
	protected String inflag;

	/**
	 * password
	 */
	@Column(name = "password", length = 10)
	protected String password;

	/**
	 * listnum
	 */
	@Column(name = "listnum", length = 200)
	protected String listnum;

	/**
	 * wcompany
	 */
	@Column(name = "wcompany", length = 250)
	protected String wcompany;

	/**
	 * listno
	 */
	@Column(name = "listno")
	protected int listno;

	/**
	 * plevel
	 */
	@Column(name = "plevel")
	protected int plevel;

	/**
	 * usernmu
	 */
	@Column(name = "usernmu", length = 100)
	protected String usernmu;

	/**
	 * index_id_old
	 */
	@Column(name = "index_id_old")
	protected int indexIdOld;

	/**
	 * pindex_id
	 */
	@Column(name = "pindex_id")
	protected int pindexId;

	/**
	 * finishint
	 */
	@Column(name = "finishint")
	protected int finishint;

	/**
	 * type_tablename
	 */
	@Column(name = "type_tablename", length = 50)
	protected String typeTablename;

	/**
	 * tree_dliststr
	 */
	@Column(name = "tree_dliststr", length = 200)
	protected String treeDliststr;

	/**
	 * pfiles_index
	 */
	@Column(name = "pfiles_index")
	protected int pfilesIndex;

	/**
	 * bdate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bdate")
	protected Date bdate;

	/**
	 * edate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edate")
	protected Date edate;

	/**
	 * wbsindex
	 */
	@Column(name = "wbsindex")
	protected int wbsindex;

	/**
	 * bdate_s
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "bdate_s")
	protected Date bdateS;

	/**
	 * edate_s
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "edate_s")
	protected Date edateS;

	/**
	 * type_id
	 */
	@Column(name = "type_id", length = 50)
	protected String typeId;

	/**
	 * cell1
	 */
	@Column(name = "cell1")
	protected int cell1;

	/**
	 * cell2
	 */
	@Column(name = "cell2")
	protected int cell2;

	/**
	 * cell3
	 */
	@Column(name = "cell3")
	protected int cell3;

	/**
	 * strfileLocate
	 */
	@Column(name = "strfileLocate", length = 50)
	protected String strfileLocate;

	/**
	 * intpfile1
	 */
	@Column(name = "intpfile1")
	protected int intpfile1;

	/**
	 * intpfile2
	 */
	@Column(name = "intpfile2")
	protected int intpfile2;

	/**
	 * intpfile3
	 */
	@Column(name = "intpfile3")
	protected int intpfile3;

	/**
	 * intcellfinish
	 */
	@Column(name = "intcellfinish")
	protected int intcellfinish;

	/**
	 * sys_id
	 */
	@Column(name = "sys_id", length = 50)
	protected String sysId;

	/**
	 * index_in
	 */
	@Column(name = "index_in")
	protected int indexIn;

	/**
	 * strButtonStar
	 */
	@Column(name = "strButtonStar", length = 20)
	protected String strButtonStar;

	/**
	 * intisuse
	 */
	@Column(name = "intisuse")
	protected int intisuse;

	/**
	 * wbsindex_in
	 */
	@Column(name = "wbsindex_in")
	protected int wbsindexIn;

	/**
	 * uindexId
	 */
	@Column(name = "uindex_id")
	protected Integer uindexId;

	/**
	 * domainIndex
	 */
	@Column(name = "domain_index")
	protected Integer domainIndex;

	@Column(name = "lisno_wbs")
	protected Integer lisnoWbs;

	@javax.persistence.Transient
	protected boolean checked;

	public IsdpTreepInfo() {

	}

	public Date getBdate() {
		return this.bdate;
	}

	public Date getBdateS() {
		return this.bdateS;
	}

	public int getCell1() {
		return this.cell1;
	}

	public int getCell2() {
		return this.cell2;
	}

	public int getCell3() {
		return this.cell3;
	}

	public String getCid() {
		return this.cid;
	}

	public Integer getDomainIndex() {
		return domainIndex;
	}

	public int getDwid() {
		return this.dwid;
	}

	public Date getEdate() {
		return this.edate;
	}

	public Date getEdateS() {
		return this.edateS;
	}

	public int getFbid() {
		return this.fbid;
	}

	public int getFilenum() {
		return this.filenum;
	}

	public int getFilenum0() {
		return this.filenum0;
	}

	public int getFilenum1() {
		return this.filenum1;
	}

	public int getFilenum2() {
		return this.filenum2;
	}

	public int getFinishint() {
		return this.finishint;
	}

	public String getFlid() {
		return this.flid;
	}

	public int getFromid() {
		return this.fromid;
	}

	public int getFxid() {
		return this.fxid;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public int getIndexIdOld() {
		return this.indexIdOld;
	}

	public int getIndexIn() {
		return this.indexIn;
	}

	public String getIndexName() {
		return this.indexName;
	}

	public String getInflag() {
		return this.inflag;
	}

	public int getIntcellfinish() {
		return this.intcellfinish;
	}

	public int getIntisuse() {
		return this.intisuse;
	}

	public int getIntpfile1() {
		return this.intpfile1;
	}

	public int getIntpfile2() {
		return this.intpfile2;
	}

	public int getIntpfile3() {
		return this.intpfile3;
	}

	public String getJid() {
		return this.jid;
	}

	public int getLevel() {
		return this.nlevel;
	}

	public Integer getLisnoWbs() {
		return lisnoWbs;
	}

	public int getListno() {
		return this.listno;
	}

	public String getListnum() {
		return this.listnum;
	}

	public int getNlevel() {
		return this.nlevel;
	}

	public int getNodeico() {
		return this.nodeico;
	}

	public String getNodetype() {
		return this.nodetype;
	}

	public String getNum() {
		return this.num;
	}

	public String getOutflag() {
		return this.outflag;
	}

	public int getParentId() {
		return parentId;
	}

	public int getPartId() {
		return this.partId;
	}

	public String getPassword() {
		return this.password;
	}

	public int getPfilesIndex() {
		return this.pfilesIndex;
	}

	public int getPindexId() {
		return this.pindexId;
	}

	public int getPlevel() {
		return this.plevel;
	}

	public String getProjtype() {
		return this.projtype;
	}

	public int getShowid() {
		return this.showid;
	}

	public String getSindexName() {
		return this.sindexName;
	}

	public String getStrButtonStar() {
		return this.strButtonStar;
	}

	public String getStrfileLocate() {
		return this.strfileLocate;
	}

	public String getSysId() {
		return this.sysId;
	}

	public int getTopId() {
		return this.topId;
	}

	public String getTopnode() {
		return this.topnode;
	}

	public String getTreeDliststr() {
		return this.treeDliststr;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public String getTypeTablename() {
		return this.typeTablename;
	}

	public Integer getUindexId() {
		return uindexId;
	}

	public String getUsernmu() {
		return this.usernmu;
	}

	public int getWbsindex() {
		return this.wbsindex;
	}

	public int getWbsindexIn() {
		return this.wbsindexIn;
	}

	public String getWcompany() {
		return this.wcompany;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public void setBdateS(Date bdateS) {
		this.bdateS = bdateS;
	}

	public void setCell1(int cell1) {
		this.cell1 = cell1;
	}

	public void setCell2(int cell2) {
		this.cell2 = cell2;
	}

	public void setCell3(int cell3) {
		this.cell3 = cell3;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setDomainIndex(Integer domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setDwid(int dwid) {
		this.dwid = dwid;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public void setEdateS(Date edateS) {
		this.edateS = edateS;
	}

	public void setFbid(int fbid) {
		this.fbid = fbid;
	}

	public void setFilenum(int filenum) {
		this.filenum = filenum;
	}

	public void setFilenum0(int filenum0) {
		this.filenum0 = filenum0;
	}

	public void setFilenum1(int filenum1) {
		this.filenum1 = filenum1;
	}

	public void setFilenum2(int filenum2) {
		this.filenum2 = filenum2;
	}

	public void setFinishint(int finishint) {
		this.finishint = finishint;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFromid(int fromid) {
		this.fromid = fromid;
	}

	public void setFxid(int fxid) {
		this.fxid = fxid;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdOld(int indexIdOld) {
		this.indexIdOld = indexIdOld;
	}

	public void setIndexIn(int indexIn) {
		this.indexIn = indexIn;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public void setInflag(String inflag) {
		this.inflag = inflag;
	}

	public void setIntcellfinish(int intcellfinish) {
		this.intcellfinish = intcellfinish;
	}

	public void setIntisuse(int intisuse) {
		this.intisuse = intisuse;
	}

	public void setIntpfile1(int intpfile1) {
		this.intpfile1 = intpfile1;
	}

	public void setIntpfile2(int intpfile2) {
		this.intpfile2 = intpfile2;
	}

	public void setIntpfile3(int intpfile3) {
		this.intpfile3 = intpfile3;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setLevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setLisnoWbs(Integer lisnoWbs) {
		this.lisnoWbs = lisnoWbs;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setListnum(String listnum) {
		this.listnum = listnum;
	}

	public void setNlevel(int nlevel) {
		this.nlevel = nlevel;
	}

	public void setNodeico(int nodeico) {
		this.nodeico = nodeico;
	}

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setOutflag(String outflag) {
		this.outflag = outflag;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public void setPartId(int partId) {
		this.partId = partId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPfilesIndex(int pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setPindexId(int pindexId) {
		this.pindexId = pindexId;
	}

	public void setPlevel(int plevel) {
		this.plevel = plevel;
	}

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public void setShowid(int showid) {
		this.showid = showid;
	}

	public void setSindexName(String sindexName) {
		this.sindexName = sindexName;
	}

	public void setStrButtonStar(String strButtonStar) {
		this.strButtonStar = strButtonStar;
	}

	public void setStrfileLocate(String strfileLocate) {
		this.strfileLocate = strfileLocate;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setTopId(int topId) {
		this.topId = topId;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setUindexId(Integer uindexId) {
		this.uindexId = uindexId;
	}

	public void setUsernmu(String usernmu) {
		this.usernmu = usernmu;
	}

	public void setWbsindex(int wbsindex) {
		this.wbsindex = wbsindex;
	}

	public void setWbsindexIn(int wbsindexIn) {
		this.wbsindexIn = wbsindexIn;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public IsdpTreepInfo jsonToObject(JSONObject jsonObject) {
		return TreepInfoJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return TreepInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return TreepInfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
