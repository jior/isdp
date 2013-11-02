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

import com.glaf.isdp.util.PinfoJsonFactory;

@Entity
@Table(name = "pinfo")
public class IsdpPinfo implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50, nullable = false)
	protected String id;

	/**
	 * index_id
	 */
	@Column(name = "index_id")
	protected int indexId;

	/**
	 * itemnum
	 */
	@Column(name = "itemnum", length = 50)
	protected String itemnum;

	/**
	 * dtag
	 */
	@Column(name = "dtag", length = 1)
	protected String dtag;

	/**
	 * ftag
	 */
	@Column(name = "ftag", length = 1)
	protected String ftag;

	/**
	 * name
	 */
	@Column(name = "name", length = 100)
	protected String name;

	/**
	 * allname
	 */
	@Column(name = "allname", length = 100)
	protected String allname;

	/**
	 * bcompany
	 */
	@Column(name = "bcompany", length = 100)
	protected String bcompany;

	/**
	 * ccompany
	 */
	@Column(name = "ccompany", length = 100)
	protected String ccompany;

	/**
	 * dcompany
	 */
	@Column(name = "dcompany", length = 100)
	protected String dcompany;

	/**
	 * concompany
	 */
	@Column(name = "concompany", length = 100)
	protected String concompany;

	/**
	 * icompany
	 */
	@Column(name = "icompany", length = 100)
	protected String icompany;

	/**
	 * cmark
	 */
	@Column(name = "cmark", length = 30)
	protected String cmark;

	/**
	 * pmark
	 */
	@Column(name = "pmark", length = 30)
	protected String pmark;

	/**
	 * tpmark
	 */
	@Column(name = "tpmark", length = 30)
	protected String tpmark;

	/**
	 * tmark
	 */
	@Column(name = "tmark", length = 30)
	protected String tmark;

	/**
	 * conmark
	 */
	@Column(name = "conmark", length = 30)
	protected String conmark;

	/**
	 * mapnum
	 */
	@Column(name = "mapnum", length = 30)
	protected String mapnum;

	/**
	 * constart
	 */
	@Column(name = "constart", length = 100)
	protected String constart;

	/**
	 * conend
	 */
	@Column(name = "conend", length = 100)
	protected String conend;

	/**
	 * totallen
	 */
	@Column(name = "totallen")
	protected Double totallen;

	/**
	 * startdate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	protected Date startdate;

	/**
	 * enddate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate")
	protected Date enddate;

	/**
	 * cost
	 */
	@Column(name = "cost")
	protected Double cost;

	/**
	 * balance
	 */
	@Column(name = "balance")
	protected Double balance;

	/**
	 * pmannager
	 */
	@Column(name = "pmannager", length = 20)
	protected String pmannager;

	/**
	 * enginee
	 */
	@Column(name = "enginee", length = 20)
	protected String enginee;

	/**
	 * owner
	 */
	@Column(name = "owner", length = 20)
	protected String owner;

	/**
	 * plandate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "plandate")
	protected Date plandate;

	/**
	 * hintday
	 */
	@Column(name = "hintday")
	protected int hintday;

	/**
	 * duty
	 */
	@Column(name = "duty", length = 20)
	protected String duty;

	/**
	 * removedate
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "removedate")
	protected Date removedate;

	/**
	 * removeduty
	 */
	@Column(name = "removeduty", length = 20)
	protected String removeduty;

	/**
	 * removefile
	 */
	@Column(name = "removefile", length = 50)
	protected String removefile;

	/**
	 * partproj
	 */
	@Column(name = "partproj", length = 100)
	protected String partproj;

	/**
	 * cnum
	 */
	@Column(name = "cnum", length = 20)
	protected String cnum;

	/**
	 * concompany2
	 */
	@Column(name = "concompany2", length = 100)
	protected String concompany2;

	/**
	 * icompany2
	 */
	@Column(name = "icompany2", length = 100)
	protected String icompany2;

	/**
	 * mileage
	 */
	@Column(name = "mileage")
	protected Double mileage;

	/**
	 * place
	 */
	@Column(name = "place", length = 100)
	protected String place;

	/**
	 * place1
	 */
	@Column(name = "place1")
	protected Double place1;

	/**
	 * place2
	 */
	@Column(name = "place2")
	protected Double place2;

	/**
	 * place3
	 */
	@Column(name = "place3")
	protected Double place3;

	/**
	 * place4
	 */
	@Column(name = "place4")
	protected Double place4;

	/**
	 * setplace
	 */
	@Column(name = "setplace", length = 20)
	protected String setplace;

	/**
	 * settemp
	 */
	@Column(name = "settemp", length = 20)
	protected String settemp;

	/**
	 * bdnum
	 */
	@Column(name = "bdnum", length = 50)
	protected String bdnum;

	/**
	 * dtnum
	 */
	@Column(name = "dtnum", length = 50)
	protected String dtnum;

	/**
	 * pinfo_user2
	 */
	@Column(name = "pinfo_user2", length = 100)
	protected String pinfoUser2;

	/**
	 * pinfo_user3
	 */
	@Column(name = "pinfo_user3")
	protected Double pinfoUser3;

	/**
	 * pinfo_user4
	 */
	@Column(name = "pinfo_user4")
	protected Double pinfoUser4;

	/**
	 * pinfo_user5
	 */
	@Column(name = "pinfo_user5", length = 20)
	protected String pinfoUser5;

	/**
	 * pinfo_user6
	 */
	@Column(name = "pinfo_user6")
	protected int pinfoUser6;

	/**
	 * pinfo_user7
	 */
	@Column(name = "pinfo_user7")
	protected Double pinfoUser7;

	/**
	 * pinfo_user8
	 */
	@Column(name = "pinfo_user8")
	protected Double pinfoUser8;

	/**
	 * pinfo_user9
	 */
	@Column(name = "pinfo_user9", length = 200)
	protected String pinfoUser9;

	/**
	 * pinfo_user10
	 */
	@Column(name = "pinfo_user10", length = 100)
	protected String pinfoUser10;

	public IsdpPinfo() {

	}

	public String getAllname() {
		return this.allname;
	}

	public Double getBalance() {
		return this.balance;
	}

	public String getBcompany() {
		return this.bcompany;
	}

	public String getBdnum() {
		return this.bdnum;
	}

	public String getCcompany() {
		return this.ccompany;
	}

	public String getCmark() {
		return this.cmark;
	}

	public String getCnum() {
		return this.cnum;
	}

	public String getConcompany() {
		return this.concompany;
	}

	public String getConcompany2() {
		return this.concompany2;
	}

	public String getConend() {
		return this.conend;
	}

	public String getConmark() {
		return this.conmark;
	}

	public String getConstart() {
		return this.constart;
	}

	public Double getCost() {
		return this.cost;
	}

	public String getDcompany() {
		return this.dcompany;
	}

	public String getDtag() {
		return this.dtag;
	}

	public String getDtnum() {
		return this.dtnum;
	}

	public String getDuty() {
		return this.duty;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public String getEnginee() {
		return this.enginee;
	}

	public String getFtag() {
		return this.ftag;
	}

	public int getHintday() {
		return this.hintday;
	}

	public String getIcompany() {
		return this.icompany;
	}

	public String getIcompany2() {
		return this.icompany2;
	}

	public String getId() {
		return this.id;
	}

	public int getIndexId() {
		return this.indexId;
	}

	public String getItemnum() {
		return this.itemnum;
	}

	public String getMapnum() {
		return this.mapnum;
	}

	public Double getMileage() {
		return this.mileage;
	}

	public String getName() {
		return this.name;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getPartproj() {
		return this.partproj;
	}

	public String getPinfoUser10() {
		return this.pinfoUser10;
	}

	public String getPinfoUser2() {
		return this.pinfoUser2;
	}

	public Double getPinfoUser3() {
		return this.pinfoUser3;
	}

	public Double getPinfoUser4() {
		return this.pinfoUser4;
	}

	public String getPinfoUser5() {
		return this.pinfoUser5;
	}

	public int getPinfoUser6() {
		return this.pinfoUser6;
	}

	public Double getPinfoUser7() {
		return this.pinfoUser7;
	}

	public Double getPinfoUser8() {
		return this.pinfoUser8;
	}

	public String getPinfoUser9() {
		return this.pinfoUser9;
	}

	public String getPlace() {
		return this.place;
	}

	public Double getPlace1() {
		return this.place1;
	}

	public Double getPlace2() {
		return this.place2;
	}

	public Double getPlace3() {
		return this.place3;
	}

	public Double getPlace4() {
		return this.place4;
	}

	public Date getPlandate() {
		return this.plandate;
	}

	public String getPmannager() {
		return this.pmannager;
	}

	public String getPmark() {
		return this.pmark;
	}

	public Date getRemovedate() {
		return this.removedate;
	}

	public String getRemoveduty() {
		return this.removeduty;
	}

	public String getRemovefile() {
		return this.removefile;
	}

	public String getSetplace() {
		return this.setplace;
	}

	public String getSettemp() {
		return this.settemp;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public String getTmark() {
		return this.tmark;
	}

	public Double getTotallen() {
		return this.totallen;
	}

	public String getTpmark() {
		return this.tpmark;
	}

	public void setAllname(String allname) {
		this.allname = allname;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void setBcompany(String bcompany) {
		this.bcompany = bcompany;
	}

	public void setBdnum(String bdnum) {
		this.bdnum = bdnum;
	}

	public void setCcompany(String ccompany) {
		this.ccompany = ccompany;
	}

	public void setCmark(String cmark) {
		this.cmark = cmark;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public void setConcompany(String concompany) {
		this.concompany = concompany;
	}

	public void setConcompany2(String concompany2) {
		this.concompany2 = concompany2;
	}

	public void setConend(String conend) {
		this.conend = conend;
	}

	public void setConmark(String conmark) {
		this.conmark = conmark;
	}

	public void setConstart(String constart) {
		this.constart = constart;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public void setDcompany(String dcompany) {
		this.dcompany = dcompany;
	}

	public void setDtag(String dtag) {
		this.dtag = dtag;
	}

	public void setDtnum(String dtnum) {
		this.dtnum = dtnum;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public void setEnginee(String enginee) {
		this.enginee = enginee;
	}

	public void setFtag(String ftag) {
		this.ftag = ftag;
	}

	public void setHintday(int hintday) {
		this.hintday = hintday;
	}

	public void setIcompany(String icompany) {
		this.icompany = icompany;
	}

	public void setIcompany2(String icompany2) {
		this.icompany2 = icompany2;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}

	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
	}

	public void setMapnum(String mapnum) {
		this.mapnum = mapnum;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setPartproj(String partproj) {
		this.partproj = partproj;
	}

	public void setPinfoUser10(String pinfoUser10) {
		this.pinfoUser10 = pinfoUser10;
	}

	public void setPinfoUser2(String pinfoUser2) {
		this.pinfoUser2 = pinfoUser2;
	}

	public void setPinfoUser3(Double pinfoUser3) {
		this.pinfoUser3 = pinfoUser3;
	}

	public void setPinfoUser4(Double pinfoUser4) {
		this.pinfoUser4 = pinfoUser4;
	}

	public void setPinfoUser5(String pinfoUser5) {
		this.pinfoUser5 = pinfoUser5;
	}

	public void setPinfoUser6(int pinfoUser6) {
		this.pinfoUser6 = pinfoUser6;
	}

	public void setPinfoUser7(Double pinfoUser7) {
		this.pinfoUser7 = pinfoUser7;
	}

	public void setPinfoUser8(Double pinfoUser8) {
		this.pinfoUser8 = pinfoUser8;
	}

	public void setPinfoUser9(String pinfoUser9) {
		this.pinfoUser9 = pinfoUser9;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPlace1(Double place1) {
		this.place1 = place1;
	}

	public void setPlace2(Double place2) {
		this.place2 = place2;
	}

	public void setPlace3(Double place3) {
		this.place3 = place3;
	}

	public void setPlace4(Double place4) {
		this.place4 = place4;
	}

	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}

	public void setPmannager(String pmannager) {
		this.pmannager = pmannager;
	}

	public void setPmark(String pmark) {
		this.pmark = pmark;
	}

	public void setRemovedate(Date removedate) {
		this.removedate = removedate;
	}

	public void setRemoveduty(String removeduty) {
		this.removeduty = removeduty;
	}

	public void setRemovefile(String removefile) {
		this.removefile = removefile;
	}

	public void setSetplace(String setplace) {
		this.setplace = setplace;
	}

	public void setSettemp(String settemp) {
		this.settemp = settemp;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public void setTmark(String tmark) {
		this.tmark = tmark;
	}

	public void setTotallen(Double totallen) {
		this.totallen = totallen;
	}

	public void setTpmark(String tpmark) {
		this.tpmark = tpmark;
	}

	public IsdpPinfo jsonToObject(JSONObject jsonObject) {
		return PinfoJsonFactory.jsonToObject(jsonObject);
	}

	public JSONObject toJsonObject() {
		return PinfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return PinfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
