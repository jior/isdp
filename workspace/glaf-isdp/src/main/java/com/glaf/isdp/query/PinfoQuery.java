package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class PinfoQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String itemnum;
	protected String itemnumLike;
	protected List<String> itemnums;
	protected String dtag;
	protected String dtagLike;
	protected List<String> dtags;
	protected String ftag;
	protected String ftagLike;
	protected List<String> ftags;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected String allname;
	protected String allnameLike;
	protected List<String> allnames;
	protected String bcompany;
	protected String bcompanyLike;
	protected List<String> bcompanys;
	protected String ccompany;
	protected String ccompanyLike;
	protected List<String> ccompanys;
	protected String dcompany;
	protected String dcompanyLike;
	protected List<String> dcompanys;
	protected String concompany;
	protected String concompanyLike;
	protected List<String> concompanys;
	protected String icompany;
	protected String icompanyLike;
	protected List<String> icompanys;
	protected String cmark;
	protected String cmarkLike;
	protected List<String> cmarks;
	protected String pmark;
	protected String pmarkLike;
	protected List<String> pmarks;
	protected String tpmark;
	protected String tpmarkLike;
	protected List<String> tpmarks;
	protected String tmark;
	protected String tmarkLike;
	protected List<String> tmarks;
	protected String conmark;
	protected String conmarkLike;
	protected List<String> conmarks;
	protected String mapnum;
	protected String mapnumLike;
	protected List<String> mapnums;
	protected String constart;
	protected String constartLike;
	protected List<String> constarts;
	protected String conend;
	protected String conendLike;
	protected List<String> conends;
	protected Long totallen;
	protected Long totallenGreaterThanOrEqual;
	protected Long totallenLessThanOrEqual;
	protected List<Long> totallens;
	protected Date startdate;
	protected Date startdateGreaterThanOrEqual;
	protected Date startdateLessThanOrEqual;
	protected List<Date> startdates;
	protected Date enddate;
	protected Date enddateGreaterThanOrEqual;
	protected Date enddateLessThanOrEqual;
	protected List<Date> enddates;
	protected Long cost;
	protected Long costGreaterThanOrEqual;
	protected Long costLessThanOrEqual;
	protected List<Long> costs;
	protected Long balance;
	protected Long balanceGreaterThanOrEqual;
	protected Long balanceLessThanOrEqual;
	protected List<Long> balances;
	protected String pmannager;
	protected String pmannagerLike;
	protected List<String> pmannagers;
	protected String enginee;
	protected String engineeLike;
	protected List<String> enginees;
	protected String owner;
	protected String ownerLike;
	protected List<String> owners;
	protected Date plandate;
	protected Date plandateGreaterThanOrEqual;
	protected Date plandateLessThanOrEqual;
	protected List<Date> plandates;
	protected Integer hintday;
	protected Integer hintdayGreaterThanOrEqual;
	protected Integer hintdayLessThanOrEqual;
	protected List<Integer> hintdays;
	protected String duty;
	protected String dutyLike;
	protected List<String> dutys;
	protected Date removedate;
	protected Date removedateGreaterThanOrEqual;
	protected Date removedateLessThanOrEqual;
	protected List<Date> removedates;
	protected String removeduty;
	protected String removedutyLike;
	protected List<String> removedutys;
	protected String removefile;
	protected String removefileLike;
	protected List<String> removefiles;
	protected String partproj;
	protected String partprojLike;
	protected List<String> partprojs;
	protected String cnum;
	protected String cnumLike;
	protected List<String> cnums;
	protected String concompany2;
	protected String concompany2Like;
	protected List<String> concompany2s;
	protected String icompany2;
	protected String icompany2Like;
	protected List<String> icompany2s;
	protected Long mileage;
	protected Long mileageGreaterThanOrEqual;
	protected Long mileageLessThanOrEqual;
	protected List<Long> mileages;
	protected String place;
	protected String placeLike;
	protected List<String> places;
	protected Long place1;
	protected Long place1GreaterThanOrEqual;
	protected Long place1LessThanOrEqual;
	protected List<Long> place1s;
	protected Long place2;
	protected Long place2GreaterThanOrEqual;
	protected Long place2LessThanOrEqual;
	protected List<Long> place2s;
	protected Long place3;
	protected Long place3GreaterThanOrEqual;
	protected Long place3LessThanOrEqual;
	protected List<Long> place3s;
	protected Long place4;
	protected Long place4GreaterThanOrEqual;
	protected Long place4LessThanOrEqual;
	protected List<Long> place4s;
	protected String setplace;
	protected String setplaceLike;
	protected List<String> setplaces;
	protected String settemp;
	protected String settempLike;
	protected List<String> settemps;
	protected String bdnum;
	protected String bdnumLike;
	protected List<String> bdnums;
	protected String dtnum;
	protected String dtnumLike;
	protected List<String> dtnums;
	protected String pinfoUser2;
	protected String pinfoUser2Like;
	protected List<String> pinfoUser2s;
	protected Long pinfoUser3;
	protected Long pinfoUser3GreaterThanOrEqual;
	protected Long pinfoUser3LessThanOrEqual;
	protected List<Long> pinfoUser3s;
	protected Long pinfoUser4;
	protected Long pinfoUser4GreaterThanOrEqual;
	protected Long pinfoUser4LessThanOrEqual;
	protected List<Long> pinfoUser4s;
	protected String pinfoUser5;
	protected String pinfoUser5Like;
	protected List<String> pinfoUser5s;
	protected Integer pinfoUser6;
	protected Integer pinfoUser6GreaterThanOrEqual;
	protected Integer pinfoUser6LessThanOrEqual;
	protected List<Integer> pinfoUser6s;
	protected Long pinfoUser7;
	protected Long pinfoUser7GreaterThanOrEqual;
	protected Long pinfoUser7LessThanOrEqual;
	protected List<Long> pinfoUser7s;
	protected Long pinfoUser8;
	protected Long pinfoUser8GreaterThanOrEqual;
	protected Long pinfoUser8LessThanOrEqual;
	protected List<Long> pinfoUser8s;
	protected String pinfoUser9;
	protected String pinfoUser9Like;
	protected List<String> pinfoUser9s;
	protected String pinfoUser10;
	protected String pinfoUser10Like;
	protected List<String> pinfoUser10s;
	

	public PinfoQuery() {

	}

	public PinfoQuery allname(String allname) {
		if (allname == null) {
			throw new RuntimeException("allname is null");
		}
		this.allname = allname;
		return this;
	}

	public PinfoQuery allnameLike(String allnameLike) {
		if (allnameLike == null) {
			throw new RuntimeException("allname is null");
		}
		this.allnameLike = allnameLike;
		return this;
	}

	public PinfoQuery allnames(List<String> allnames) {
		if (allnames == null) {
			throw new RuntimeException("allnames is empty ");
		}
		this.allnames = allnames;
		return this;
	}

	public PinfoQuery balance(Long balance) {
		if (balance == null) {
			throw new RuntimeException("balance is null");
		}
		this.balance = balance;
		return this;
	}

	public PinfoQuery balanceGreaterThanOrEqual(Long balanceGreaterThanOrEqual) {
		if (balanceGreaterThanOrEqual == null) {
			throw new RuntimeException("balance is null");
		}
		this.balanceGreaterThanOrEqual = balanceGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery balanceLessThanOrEqual(Long balanceLessThanOrEqual) {
		if (balanceLessThanOrEqual == null) {
			throw new RuntimeException("balance is null");
		}
		this.balanceLessThanOrEqual = balanceLessThanOrEqual;
		return this;
	}

	public PinfoQuery balances(List<Long> balances) {
		if (balances == null) {
			throw new RuntimeException("balances is empty ");
		}
		this.balances = balances;
		return this;
	}

	public PinfoQuery bcompany(String bcompany) {
		if (bcompany == null) {
			throw new RuntimeException("bcompany is null");
		}
		this.bcompany = bcompany;
		return this;
	}

	public PinfoQuery bcompanyLike(String bcompanyLike) {
		if (bcompanyLike == null) {
			throw new RuntimeException("bcompany is null");
		}
		this.bcompanyLike = bcompanyLike;
		return this;
	}

	public PinfoQuery bcompanys(List<String> bcompanys) {
		if (bcompanys == null) {
			throw new RuntimeException("bcompanys is empty ");
		}
		this.bcompanys = bcompanys;
		return this;
	}

	public PinfoQuery bdnum(String bdnum) {
		if (bdnum == null) {
			throw new RuntimeException("bdnum is null");
		}
		this.bdnum = bdnum;
		return this;
	}

	public PinfoQuery bdnumLike(String bdnumLike) {
		if (bdnumLike == null) {
			throw new RuntimeException("bdnum is null");
		}
		this.bdnumLike = bdnumLike;
		return this;
	}

	public PinfoQuery bdnums(List<String> bdnums) {
		if (bdnums == null) {
			throw new RuntimeException("bdnums is empty ");
		}
		this.bdnums = bdnums;
		return this;
	}

	public PinfoQuery ccompany(String ccompany) {
		if (ccompany == null) {
			throw new RuntimeException("ccompany is null");
		}
		this.ccompany = ccompany;
		return this;
	}

	public PinfoQuery ccompanyLike(String ccompanyLike) {
		if (ccompanyLike == null) {
			throw new RuntimeException("ccompany is null");
		}
		this.ccompanyLike = ccompanyLike;
		return this;
	}

	public PinfoQuery ccompanys(List<String> ccompanys) {
		if (ccompanys == null) {
			throw new RuntimeException("ccompanys is empty ");
		}
		this.ccompanys = ccompanys;
		return this;
	}

	public PinfoQuery cmark(String cmark) {
		if (cmark == null) {
			throw new RuntimeException("cmark is null");
		}
		this.cmark = cmark;
		return this;
	}

	public PinfoQuery cmarkLike(String cmarkLike) {
		if (cmarkLike == null) {
			throw new RuntimeException("cmark is null");
		}
		this.cmarkLike = cmarkLike;
		return this;
	}

	public PinfoQuery cmarks(List<String> cmarks) {
		if (cmarks == null) {
			throw new RuntimeException("cmarks is empty ");
		}
		this.cmarks = cmarks;
		return this;
	}

	public PinfoQuery cnum(String cnum) {
		if (cnum == null) {
			throw new RuntimeException("cnum is null");
		}
		this.cnum = cnum;
		return this;
	}

	public PinfoQuery cnumLike(String cnumLike) {
		if (cnumLike == null) {
			throw new RuntimeException("cnum is null");
		}
		this.cnumLike = cnumLike;
		return this;
	}

	public PinfoQuery cnums(List<String> cnums) {
		if (cnums == null) {
			throw new RuntimeException("cnums is empty ");
		}
		this.cnums = cnums;
		return this;
	}

	public PinfoQuery concompany(String concompany) {
		if (concompany == null) {
			throw new RuntimeException("concompany is null");
		}
		this.concompany = concompany;
		return this;
	}

	public PinfoQuery concompany2(String concompany2) {
		if (concompany2 == null) {
			throw new RuntimeException("concompany2 is null");
		}
		this.concompany2 = concompany2;
		return this;
	}

	public PinfoQuery concompany2Like(String concompany2Like) {
		if (concompany2Like == null) {
			throw new RuntimeException("concompany2 is null");
		}
		this.concompany2Like = concompany2Like;
		return this;
	}

	public PinfoQuery concompany2s(List<String> concompany2s) {
		if (concompany2s == null) {
			throw new RuntimeException("concompany2s is empty ");
		}
		this.concompany2s = concompany2s;
		return this;
	}

	public PinfoQuery concompanyLike(String concompanyLike) {
		if (concompanyLike == null) {
			throw new RuntimeException("concompany is null");
		}
		this.concompanyLike = concompanyLike;
		return this;
	}

	public PinfoQuery concompanys(List<String> concompanys) {
		if (concompanys == null) {
			throw new RuntimeException("concompanys is empty ");
		}
		this.concompanys = concompanys;
		return this;
	}

	public PinfoQuery conend(String conend) {
		if (conend == null) {
			throw new RuntimeException("conend is null");
		}
		this.conend = conend;
		return this;
	}

	public PinfoQuery conendLike(String conendLike) {
		if (conendLike == null) {
			throw new RuntimeException("conend is null");
		}
		this.conendLike = conendLike;
		return this;
	}

	public PinfoQuery conends(List<String> conends) {
		if (conends == null) {
			throw new RuntimeException("conends is empty ");
		}
		this.conends = conends;
		return this;
	}

	public PinfoQuery conmark(String conmark) {
		if (conmark == null) {
			throw new RuntimeException("conmark is null");
		}
		this.conmark = conmark;
		return this;
	}

	public PinfoQuery conmarkLike(String conmarkLike) {
		if (conmarkLike == null) {
			throw new RuntimeException("conmark is null");
		}
		this.conmarkLike = conmarkLike;
		return this;
	}

	public PinfoQuery conmarks(List<String> conmarks) {
		if (conmarks == null) {
			throw new RuntimeException("conmarks is empty ");
		}
		this.conmarks = conmarks;
		return this;
	}

	public PinfoQuery constart(String constart) {
		if (constart == null) {
			throw new RuntimeException("constart is null");
		}
		this.constart = constart;
		return this;
	}

	public PinfoQuery constartLike(String constartLike) {
		if (constartLike == null) {
			throw new RuntimeException("constart is null");
		}
		this.constartLike = constartLike;
		return this;
	}

	public PinfoQuery constarts(List<String> constarts) {
		if (constarts == null) {
			throw new RuntimeException("constarts is empty ");
		}
		this.constarts = constarts;
		return this;
	}

	public PinfoQuery cost(Long cost) {
		if (cost == null) {
			throw new RuntimeException("cost is null");
		}
		this.cost = cost;
		return this;
	}

	public PinfoQuery costGreaterThanOrEqual(Long costGreaterThanOrEqual) {
		if (costGreaterThanOrEqual == null) {
			throw new RuntimeException("cost is null");
		}
		this.costGreaterThanOrEqual = costGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery costLessThanOrEqual(Long costLessThanOrEqual) {
		if (costLessThanOrEqual == null) {
			throw new RuntimeException("cost is null");
		}
		this.costLessThanOrEqual = costLessThanOrEqual;
		return this;
	}

	public PinfoQuery costs(List<Long> costs) {
		if (costs == null) {
			throw new RuntimeException("costs is empty ");
		}
		this.costs = costs;
		return this;
	}

	public PinfoQuery dcompany(String dcompany) {
		if (dcompany == null) {
			throw new RuntimeException("dcompany is null");
		}
		this.dcompany = dcompany;
		return this;
	}

	public PinfoQuery dcompanyLike(String dcompanyLike) {
		if (dcompanyLike == null) {
			throw new RuntimeException("dcompany is null");
		}
		this.dcompanyLike = dcompanyLike;
		return this;
	}

	public PinfoQuery dcompanys(List<String> dcompanys) {
		if (dcompanys == null) {
			throw new RuntimeException("dcompanys is empty ");
		}
		this.dcompanys = dcompanys;
		return this;
	}

	public PinfoQuery dtag(String dtag) {
		if (dtag == null) {
			throw new RuntimeException("dtag is null");
		}
		this.dtag = dtag;
		return this;
	}

	public PinfoQuery dtagLike(String dtagLike) {
		if (dtagLike == null) {
			throw new RuntimeException("dtag is null");
		}
		this.dtagLike = dtagLike;
		return this;
	}

	public PinfoQuery dtags(List<String> dtags) {
		if (dtags == null) {
			throw new RuntimeException("dtags is empty ");
		}
		this.dtags = dtags;
		return this;
	}

	public PinfoQuery dtnum(String dtnum) {
		if (dtnum == null) {
			throw new RuntimeException("dtnum is null");
		}
		this.dtnum = dtnum;
		return this;
	}

	public PinfoQuery dtnumLike(String dtnumLike) {
		if (dtnumLike == null) {
			throw new RuntimeException("dtnum is null");
		}
		this.dtnumLike = dtnumLike;
		return this;
	}

	public PinfoQuery dtnums(List<String> dtnums) {
		if (dtnums == null) {
			throw new RuntimeException("dtnums is empty ");
		}
		this.dtnums = dtnums;
		return this;
	}

	public PinfoQuery duty(String duty) {
		if (duty == null) {
			throw new RuntimeException("duty is null");
		}
		this.duty = duty;
		return this;
	}

	public PinfoQuery dutyLike(String dutyLike) {
		if (dutyLike == null) {
			throw new RuntimeException("duty is null");
		}
		this.dutyLike = dutyLike;
		return this;
	}

	public PinfoQuery dutys(List<String> dutys) {
		if (dutys == null) {
			throw new RuntimeException("dutys is empty ");
		}
		this.dutys = dutys;
		return this;
	}

	public PinfoQuery enddate(Date enddate) {
		if (enddate == null) {
			throw new RuntimeException("enddate is null");
		}
		this.enddate = enddate;
		return this;
	}

	public PinfoQuery enddateGreaterThanOrEqual(Date enddateGreaterThanOrEqual) {
		if (enddateGreaterThanOrEqual == null) {
			throw new RuntimeException("enddate is null");
		}
		this.enddateGreaterThanOrEqual = enddateGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery enddateLessThanOrEqual(Date enddateLessThanOrEqual) {
		if (enddateLessThanOrEqual == null) {
			throw new RuntimeException("enddate is null");
		}
		this.enddateLessThanOrEqual = enddateLessThanOrEqual;
		return this;
	}

	public PinfoQuery enddates(List<Date> enddates) {
		if (enddates == null) {
			throw new RuntimeException("enddates is empty ");
		}
		this.enddates = enddates;
		return this;
	}

	public PinfoQuery enginee(String enginee) {
		if (enginee == null) {
			throw new RuntimeException("enginee is null");
		}
		this.enginee = enginee;
		return this;
	}

	public PinfoQuery engineeLike(String engineeLike) {
		if (engineeLike == null) {
			throw new RuntimeException("enginee is null");
		}
		this.engineeLike = engineeLike;
		return this;
	}

	public PinfoQuery enginees(List<String> enginees) {
		if (enginees == null) {
			throw new RuntimeException("enginees is empty ");
		}
		this.enginees = enginees;
		return this;
	}

	public PinfoQuery ftag(String ftag) {
		if (ftag == null) {
			throw new RuntimeException("ftag is null");
		}
		this.ftag = ftag;
		return this;
	}

	public PinfoQuery ftagLike(String ftagLike) {
		if (ftagLike == null) {
			throw new RuntimeException("ftag is null");
		}
		this.ftagLike = ftagLike;
		return this;
	}

	public PinfoQuery ftags(List<String> ftags) {
		if (ftags == null) {
			throw new RuntimeException("ftags is empty ");
		}
		this.ftags = ftags;
		return this;
	}

	public String getAllname() {
		return allname;
	}

	public String getAllnameLike() {
		if (allnameLike != null && allnameLike.trim().length() > 0) {
			if (!allnameLike.startsWith("%")) {
				allnameLike = "%" + allnameLike;
			}
			if (!allnameLike.endsWith("%")) {
				allnameLike = allnameLike + "%";
			}
		}
		return allnameLike;
	}

	public List<String> getAllnames() {
		return allnames;
	}

	public Long getBalance() {
		return balance;
	}

	public Long getBalanceGreaterThanOrEqual() {
		return balanceGreaterThanOrEqual;
	}

	public Long getBalanceLessThanOrEqual() {
		return balanceLessThanOrEqual;
	}

	public List<Long> getBalances() {
		return balances;
	}

	public String getBcompany() {
		return bcompany;
	}

	public String getBcompanyLike() {
		if (bcompanyLike != null && bcompanyLike.trim().length() > 0) {
			if (!bcompanyLike.startsWith("%")) {
				bcompanyLike = "%" + bcompanyLike;
			}
			if (!bcompanyLike.endsWith("%")) {
				bcompanyLike = bcompanyLike + "%";
			}
		}
		return bcompanyLike;
	}

	public List<String> getBcompanys() {
		return bcompanys;
	}

	public String getBdnum() {
		return bdnum;
	}

	public String getBdnumLike() {
		if (bdnumLike != null && bdnumLike.trim().length() > 0) {
			if (!bdnumLike.startsWith("%")) {
				bdnumLike = "%" + bdnumLike;
			}
			if (!bdnumLike.endsWith("%")) {
				bdnumLike = bdnumLike + "%";
			}
		}
		return bdnumLike;
	}

	public List<String> getBdnums() {
		return bdnums;
	}

	public String getCcompany() {
		return ccompany;
	}

	public String getCcompanyLike() {
		if (ccompanyLike != null && ccompanyLike.trim().length() > 0) {
			if (!ccompanyLike.startsWith("%")) {
				ccompanyLike = "%" + ccompanyLike;
			}
			if (!ccompanyLike.endsWith("%")) {
				ccompanyLike = ccompanyLike + "%";
			}
		}
		return ccompanyLike;
	}

	public List<String> getCcompanys() {
		return ccompanys;
	}

	public String getCmark() {
		return cmark;
	}

	public String getCmarkLike() {
		if (cmarkLike != null && cmarkLike.trim().length() > 0) {
			if (!cmarkLike.startsWith("%")) {
				cmarkLike = "%" + cmarkLike;
			}
			if (!cmarkLike.endsWith("%")) {
				cmarkLike = cmarkLike + "%";
			}
		}
		return cmarkLike;
	}

	public List<String> getCmarks() {
		return cmarks;
	}

	public String getCnum() {
		return cnum;
	}

	public String getCnumLike() {
		if (cnumLike != null && cnumLike.trim().length() > 0) {
			if (!cnumLike.startsWith("%")) {
				cnumLike = "%" + cnumLike;
			}
			if (!cnumLike.endsWith("%")) {
				cnumLike = cnumLike + "%";
			}
		}
		return cnumLike;
	}

	public List<String> getCnums() {
		return cnums;
	}

	public String getConcompany() {
		return concompany;
	}

	public String getConcompany2() {
		return concompany2;
	}

	public String getConcompany2Like() {
		if (concompany2Like != null && concompany2Like.trim().length() > 0) {
			if (!concompany2Like.startsWith("%")) {
				concompany2Like = "%" + concompany2Like;
			}
			if (!concompany2Like.endsWith("%")) {
				concompany2Like = concompany2Like + "%";
			}
		}
		return concompany2Like;
	}

	public List<String> getConcompany2s() {
		return concompany2s;
	}

	public String getConcompanyLike() {
		if (concompanyLike != null && concompanyLike.trim().length() > 0) {
			if (!concompanyLike.startsWith("%")) {
				concompanyLike = "%" + concompanyLike;
			}
			if (!concompanyLike.endsWith("%")) {
				concompanyLike = concompanyLike + "%";
			}
		}
		return concompanyLike;
	}

	public List<String> getConcompanys() {
		return concompanys;
	}

	public String getConend() {
		return conend;
	}

	public String getConendLike() {
		if (conendLike != null && conendLike.trim().length() > 0) {
			if (!conendLike.startsWith("%")) {
				conendLike = "%" + conendLike;
			}
			if (!conendLike.endsWith("%")) {
				conendLike = conendLike + "%";
			}
		}
		return conendLike;
	}

	public List<String> getConends() {
		return conends;
	}

	public String getConmark() {
		return conmark;
	}

	public String getConmarkLike() {
		if (conmarkLike != null && conmarkLike.trim().length() > 0) {
			if (!conmarkLike.startsWith("%")) {
				conmarkLike = "%" + conmarkLike;
			}
			if (!conmarkLike.endsWith("%")) {
				conmarkLike = conmarkLike + "%";
			}
		}
		return conmarkLike;
	}

	public List<String> getConmarks() {
		return conmarks;
	}

	public String getConstart() {
		return constart;
	}

	public String getConstartLike() {
		if (constartLike != null && constartLike.trim().length() > 0) {
			if (!constartLike.startsWith("%")) {
				constartLike = "%" + constartLike;
			}
			if (!constartLike.endsWith("%")) {
				constartLike = constartLike + "%";
			}
		}
		return constartLike;
	}

	public List<String> getConstarts() {
		return constarts;
	}

	public Long getCost() {
		return cost;
	}

	public Long getCostGreaterThanOrEqual() {
		return costGreaterThanOrEqual;
	}

	public Long getCostLessThanOrEqual() {
		return costLessThanOrEqual;
	}

	public List<Long> getCosts() {
		return costs;
	}

	public String getDcompany() {
		return dcompany;
	}

	public String getDcompanyLike() {
		if (dcompanyLike != null && dcompanyLike.trim().length() > 0) {
			if (!dcompanyLike.startsWith("%")) {
				dcompanyLike = "%" + dcompanyLike;
			}
			if (!dcompanyLike.endsWith("%")) {
				dcompanyLike = dcompanyLike + "%";
			}
		}
		return dcompanyLike;
	}

	public List<String> getDcompanys() {
		return dcompanys;
	}

	public String getDtag() {
		return dtag;
	}

	public String getDtagLike() {
		if (dtagLike != null && dtagLike.trim().length() > 0) {
			if (!dtagLike.startsWith("%")) {
				dtagLike = "%" + dtagLike;
			}
			if (!dtagLike.endsWith("%")) {
				dtagLike = dtagLike + "%";
			}
		}
		return dtagLike;
	}

	public List<String> getDtags() {
		return dtags;
	}

	public String getDtnum() {
		return dtnum;
	}

	public String getDtnumLike() {
		if (dtnumLike != null && dtnumLike.trim().length() > 0) {
			if (!dtnumLike.startsWith("%")) {
				dtnumLike = "%" + dtnumLike;
			}
			if (!dtnumLike.endsWith("%")) {
				dtnumLike = dtnumLike + "%";
			}
		}
		return dtnumLike;
	}

	public List<String> getDtnums() {
		return dtnums;
	}

	public String getDuty() {
		return duty;
	}

	public String getDutyLike() {
		if (dutyLike != null && dutyLike.trim().length() > 0) {
			if (!dutyLike.startsWith("%")) {
				dutyLike = "%" + dutyLike;
			}
			if (!dutyLike.endsWith("%")) {
				dutyLike = dutyLike + "%";
			}
		}
		return dutyLike;
	}

	public List<String> getDutys() {
		return dutys;
	}

	public Date getEnddate() {
		return enddate;
	}

	public Date getEnddateGreaterThanOrEqual() {
		return enddateGreaterThanOrEqual;
	}

	public Date getEnddateLessThanOrEqual() {
		return enddateLessThanOrEqual;
	}

	public List<Date> getEnddates() {
		return enddates;
	}

	public String getEnginee() {
		return enginee;
	}

	public String getEngineeLike() {
		if (engineeLike != null && engineeLike.trim().length() > 0) {
			if (!engineeLike.startsWith("%")) {
				engineeLike = "%" + engineeLike;
			}
			if (!engineeLike.endsWith("%")) {
				engineeLike = engineeLike + "%";
			}
		}
		return engineeLike;
	}

	public List<String> getEnginees() {
		return enginees;
	}

	public String getFtag() {
		return ftag;
	}

	public String getFtagLike() {
		if (ftagLike != null && ftagLike.trim().length() > 0) {
			if (!ftagLike.startsWith("%")) {
				ftagLike = "%" + ftagLike;
			}
			if (!ftagLike.endsWith("%")) {
				ftagLike = ftagLike + "%";
			}
		}
		return ftagLike;
	}

	public List<String> getFtags() {
		return ftags;
	}

	public Integer getHintday() {
		return hintday;
	}

	public Integer getHintdayGreaterThanOrEqual() {
		return hintdayGreaterThanOrEqual;
	}

	public Integer getHintdayLessThanOrEqual() {
		return hintdayLessThanOrEqual;
	}

	public List<Integer> getHintdays() {
		return hintdays;
	}

	public String getIcompany() {
		return icompany;
	}

	public String getIcompany2() {
		return icompany2;
	}

	public String getIcompany2Like() {
		if (icompany2Like != null && icompany2Like.trim().length() > 0) {
			if (!icompany2Like.startsWith("%")) {
				icompany2Like = "%" + icompany2Like;
			}
			if (!icompany2Like.endsWith("%")) {
				icompany2Like = icompany2Like + "%";
			}
		}
		return icompany2Like;
	}

	public List<String> getIcompany2s() {
		return icompany2s;
	}

	public String getIcompanyLike() {
		if (icompanyLike != null && icompanyLike.trim().length() > 0) {
			if (!icompanyLike.startsWith("%")) {
				icompanyLike = "%" + icompanyLike;
			}
			if (!icompanyLike.endsWith("%")) {
				icompanyLike = icompanyLike + "%";
			}
		}
		return icompanyLike;
	}

	public List<String> getIcompanys() {
		return icompanys;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public Integer getIndexIdGreaterThanOrEqual() {
		return indexIdGreaterThanOrEqual;
	}

	public Integer getIndexIdLessThanOrEqual() {
		return indexIdLessThanOrEqual;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getItemnum() {
		return itemnum;
	}

	public String getItemnumLike() {
		if (itemnumLike != null && itemnumLike.trim().length() > 0) {
			if (!itemnumLike.startsWith("%")) {
				itemnumLike = "%" + itemnumLike;
			}
			if (!itemnumLike.endsWith("%")) {
				itemnumLike = itemnumLike + "%";
			}
		}
		return itemnumLike;
	}

	public List<String> getItemnums() {
		return itemnums;
	}

	public String getMapnum() {
		return mapnum;
	}

	public String getMapnumLike() {
		if (mapnumLike != null && mapnumLike.trim().length() > 0) {
			if (!mapnumLike.startsWith("%")) {
				mapnumLike = "%" + mapnumLike;
			}
			if (!mapnumLike.endsWith("%")) {
				mapnumLike = mapnumLike + "%";
			}
		}
		return mapnumLike;
	}

	public List<String> getMapnums() {
		return mapnums;
	}

	public Long getMileage() {
		return mileage;
	}

	public Long getMileageGreaterThanOrEqual() {
		return mileageGreaterThanOrEqual;
	}

	public Long getMileageLessThanOrEqual() {
		return mileageLessThanOrEqual;
	}

	public List<Long> getMileages() {
		return mileages;
	}

	public String getName() {
		return name;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
	}

	public List<String> getNames() {
		return names;
	}

	public String getOrderBy() {
		if (sortField != null) {
			String a_x = " asc ";
			if (getSortOrder()!= null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	public String getOwner() {
		return owner;
	}

	public String getOwnerLike() {
		if (ownerLike != null && ownerLike.trim().length() > 0) {
			if (!ownerLike.startsWith("%")) {
				ownerLike = "%" + ownerLike;
			}
			if (!ownerLike.endsWith("%")) {
				ownerLike = ownerLike + "%";
			}
		}
		return ownerLike;
	}

	public List<String> getOwners() {
		return owners;
	}

	public String getPartproj() {
		return partproj;
	}

	public String getPartprojLike() {
		if (partprojLike != null && partprojLike.trim().length() > 0) {
			if (!partprojLike.startsWith("%")) {
				partprojLike = "%" + partprojLike;
			}
			if (!partprojLike.endsWith("%")) {
				partprojLike = partprojLike + "%";
			}
		}
		return partprojLike;
	}

	public List<String> getPartprojs() {
		return partprojs;
	}

	public String getPinfoUser10() {
		return pinfoUser10;
	}

	public String getPinfoUser10Like() {
		if (pinfoUser10Like != null && pinfoUser10Like.trim().length() > 0) {
			if (!pinfoUser10Like.startsWith("%")) {
				pinfoUser10Like = "%" + pinfoUser10Like;
			}
			if (!pinfoUser10Like.endsWith("%")) {
				pinfoUser10Like = pinfoUser10Like + "%";
			}
		}
		return pinfoUser10Like;
	}

	public List<String> getPinfoUser10s() {
		return pinfoUser10s;
	}

	public String getPinfoUser2() {
		return pinfoUser2;
	}

	public String getPinfoUser2Like() {
		if (pinfoUser2Like != null && pinfoUser2Like.trim().length() > 0) {
			if (!pinfoUser2Like.startsWith("%")) {
				pinfoUser2Like = "%" + pinfoUser2Like;
			}
			if (!pinfoUser2Like.endsWith("%")) {
				pinfoUser2Like = pinfoUser2Like + "%";
			}
		}
		return pinfoUser2Like;
	}

	public List<String> getPinfoUser2s() {
		return pinfoUser2s;
	}

	public Long getPinfoUser3() {
		return pinfoUser3;
	}

	public Long getPinfoUser3GreaterThanOrEqual() {
		return pinfoUser3GreaterThanOrEqual;
	}

	public Long getPinfoUser3LessThanOrEqual() {
		return pinfoUser3LessThanOrEqual;
	}

	public List<Long> getPinfoUser3s() {
		return pinfoUser3s;
	}

	public Long getPinfoUser4() {
		return pinfoUser4;
	}

	public Long getPinfoUser4GreaterThanOrEqual() {
		return pinfoUser4GreaterThanOrEqual;
	}

	public Long getPinfoUser4LessThanOrEqual() {
		return pinfoUser4LessThanOrEqual;
	}

	public List<Long> getPinfoUser4s() {
		return pinfoUser4s;
	}

	public String getPinfoUser5() {
		return pinfoUser5;
	}

	public String getPinfoUser5Like() {
		if (pinfoUser5Like != null && pinfoUser5Like.trim().length() > 0) {
			if (!pinfoUser5Like.startsWith("%")) {
				pinfoUser5Like = "%" + pinfoUser5Like;
			}
			if (!pinfoUser5Like.endsWith("%")) {
				pinfoUser5Like = pinfoUser5Like + "%";
			}
		}
		return pinfoUser5Like;
	}

	public List<String> getPinfoUser5s() {
		return pinfoUser5s;
	}

	public Integer getPinfoUser6() {
		return pinfoUser6;
	}

	public Integer getPinfoUser6GreaterThanOrEqual() {
		return pinfoUser6GreaterThanOrEqual;
	}

	public Integer getPinfoUser6LessThanOrEqual() {
		return pinfoUser6LessThanOrEqual;
	}

	public List<Integer> getPinfoUser6s() {
		return pinfoUser6s;
	}

	public Long getPinfoUser7() {
		return pinfoUser7;
	}

	public Long getPinfoUser7GreaterThanOrEqual() {
		return pinfoUser7GreaterThanOrEqual;
	}

	public Long getPinfoUser7LessThanOrEqual() {
		return pinfoUser7LessThanOrEqual;
	}

	public List<Long> getPinfoUser7s() {
		return pinfoUser7s;
	}

	public Long getPinfoUser8() {
		return pinfoUser8;
	}

	public Long getPinfoUser8GreaterThanOrEqual() {
		return pinfoUser8GreaterThanOrEqual;
	}

	public Long getPinfoUser8LessThanOrEqual() {
		return pinfoUser8LessThanOrEqual;
	}

	public List<Long> getPinfoUser8s() {
		return pinfoUser8s;
	}

	public String getPinfoUser9() {
		return pinfoUser9;
	}

	public String getPinfoUser9Like() {
		if (pinfoUser9Like != null && pinfoUser9Like.trim().length() > 0) {
			if (!pinfoUser9Like.startsWith("%")) {
				pinfoUser9Like = "%" + pinfoUser9Like;
			}
			if (!pinfoUser9Like.endsWith("%")) {
				pinfoUser9Like = pinfoUser9Like + "%";
			}
		}
		return pinfoUser9Like;
	}

	public List<String> getPinfoUser9s() {
		return pinfoUser9s;
	}

	public String getPlace() {
		return place;
	}

	public Long getPlace1() {
		return place1;
	}

	public Long getPlace1GreaterThanOrEqual() {
		return place1GreaterThanOrEqual;
	}

	public Long getPlace1LessThanOrEqual() {
		return place1LessThanOrEqual;
	}

	public List<Long> getPlace1s() {
		return place1s;
	}

	public Long getPlace2() {
		return place2;
	}

	public Long getPlace2GreaterThanOrEqual() {
		return place2GreaterThanOrEqual;
	}

	public Long getPlace2LessThanOrEqual() {
		return place2LessThanOrEqual;
	}

	public List<Long> getPlace2s() {
		return place2s;
	}

	public Long getPlace3() {
		return place3;
	}

	public Long getPlace3GreaterThanOrEqual() {
		return place3GreaterThanOrEqual;
	}

	public Long getPlace3LessThanOrEqual() {
		return place3LessThanOrEqual;
	}

	public List<Long> getPlace3s() {
		return place3s;
	}

	public Long getPlace4() {
		return place4;
	}

	public Long getPlace4GreaterThanOrEqual() {
		return place4GreaterThanOrEqual;
	}

	public Long getPlace4LessThanOrEqual() {
		return place4LessThanOrEqual;
	}

	public List<Long> getPlace4s() {
		return place4s;
	}

	public String getPlaceLike() {
		if (placeLike != null && placeLike.trim().length() > 0) {
			if (!placeLike.startsWith("%")) {
				placeLike = "%" + placeLike;
			}
			if (!placeLike.endsWith("%")) {
				placeLike = placeLike + "%";
			}
		}
		return placeLike;
	}

	public List<String> getPlaces() {
		return places;
	}

	public Date getPlandate() {
		return plandate;
	}

	public Date getPlandateGreaterThanOrEqual() {
		return plandateGreaterThanOrEqual;
	}

	public Date getPlandateLessThanOrEqual() {
		return plandateLessThanOrEqual;
	}

	public List<Date> getPlandates() {
		return plandates;
	}

	public String getPmannager() {
		return pmannager;
	}

	public String getPmannagerLike() {
		if (pmannagerLike != null && pmannagerLike.trim().length() > 0) {
			if (!pmannagerLike.startsWith("%")) {
				pmannagerLike = "%" + pmannagerLike;
			}
			if (!pmannagerLike.endsWith("%")) {
				pmannagerLike = pmannagerLike + "%";
			}
		}
		return pmannagerLike;
	}

	public List<String> getPmannagers() {
		return pmannagers;
	}

	public String getPmark() {
		return pmark;
	}

	public String getPmarkLike() {
		if (pmarkLike != null && pmarkLike.trim().length() > 0) {
			if (!pmarkLike.startsWith("%")) {
				pmarkLike = "%" + pmarkLike;
			}
			if (!pmarkLike.endsWith("%")) {
				pmarkLike = pmarkLike + "%";
			}
		}
		return pmarkLike;
	}

	public List<String> getPmarks() {
		return pmarks;
	}

	public Date getRemovedate() {
		return removedate;
	}

	public Date getRemovedateGreaterThanOrEqual() {
		return removedateGreaterThanOrEqual;
	}

	public Date getRemovedateLessThanOrEqual() {
		return removedateLessThanOrEqual;
	}

	public List<Date> getRemovedates() {
		return removedates;
	}

	public String getRemoveduty() {
		return removeduty;
	}

	public String getRemovedutyLike() {
		if (removedutyLike != null && removedutyLike.trim().length() > 0) {
			if (!removedutyLike.startsWith("%")) {
				removedutyLike = "%" + removedutyLike;
			}
			if (!removedutyLike.endsWith("%")) {
				removedutyLike = removedutyLike + "%";
			}
		}
		return removedutyLike;
	}

	public List<String> getRemovedutys() {
		return removedutys;
	}

	public String getRemovefile() {
		return removefile;
	}

	public String getRemovefileLike() {
		if (removefileLike != null && removefileLike.trim().length() > 0) {
			if (!removefileLike.startsWith("%")) {
				removefileLike = "%" + removefileLike;
			}
			if (!removefileLike.endsWith("%")) {
				removefileLike = removefileLike + "%";
			}
		}
		return removefileLike;
	}

	public List<String> getRemovefiles() {
		return removefiles;
	}

	public String getSetplace() {
		return setplace;
	}

	public String getSetplaceLike() {
		if (setplaceLike != null && setplaceLike.trim().length() > 0) {
			if (!setplaceLike.startsWith("%")) {
				setplaceLike = "%" + setplaceLike;
			}
			if (!setplaceLike.endsWith("%")) {
				setplaceLike = setplaceLike + "%";
			}
		}
		return setplaceLike;
	}

	public List<String> getSetplaces() {
		return setplaces;
	}

	public String getSettemp() {
		return settemp;
	}

	public String getSettempLike() {
		if (settempLike != null && settempLike.trim().length() > 0) {
			if (!settempLike.startsWith("%")) {
				settempLike = "%" + settempLike;
			}
			if (!settempLike.endsWith("%")) {
				settempLike = settempLike + "%";
			}
		}
		return settempLike;
	}

	public List<String> getSettemps() {
		return settemps;
	}

	public Date getStartdate() {
		return startdate;
	}

	public Date getStartdateGreaterThanOrEqual() {
		return startdateGreaterThanOrEqual;
	}

	public Date getStartdateLessThanOrEqual() {
		return startdateLessThanOrEqual;
	}

	public List<Date> getStartdates() {
		return startdates;
	}

	public String getTmark() {
		return tmark;
	}

	public String getTmarkLike() {
		if (tmarkLike != null && tmarkLike.trim().length() > 0) {
			if (!tmarkLike.startsWith("%")) {
				tmarkLike = "%" + tmarkLike;
			}
			if (!tmarkLike.endsWith("%")) {
				tmarkLike = tmarkLike + "%";
			}
		}
		return tmarkLike;
	}

	public List<String> getTmarks() {
		return tmarks;
	}

	public Long getTotallen() {
		return totallen;
	}

	public Long getTotallenGreaterThanOrEqual() {
		return totallenGreaterThanOrEqual;
	}

	public Long getTotallenLessThanOrEqual() {
		return totallenLessThanOrEqual;
	}

	public List<Long> getTotallens() {
		return totallens;
	}

	public String getTpmark() {
		return tpmark;
	}

	public String getTpmarkLike() {
		if (tpmarkLike != null && tpmarkLike.trim().length() > 0) {
			if (!tpmarkLike.startsWith("%")) {
				tpmarkLike = "%" + tpmarkLike;
			}
			if (!tpmarkLike.endsWith("%")) {
				tpmarkLike = tpmarkLike + "%";
			}
		}
		return tpmarkLike;
	}

	public List<String> getTpmarks() {
		return tpmarks;
	}

	public PinfoQuery hintday(Integer hintday) {
		if (hintday == null) {
			throw new RuntimeException("hintday is null");
		}
		this.hintday = hintday;
		return this;
	}

	public PinfoQuery hintdayGreaterThanOrEqual(
			Integer hintdayGreaterThanOrEqual) {
		if (hintdayGreaterThanOrEqual == null) {
			throw new RuntimeException("hintday is null");
		}
		this.hintdayGreaterThanOrEqual = hintdayGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery hintdayLessThanOrEqual(Integer hintdayLessThanOrEqual) {
		if (hintdayLessThanOrEqual == null) {
			throw new RuntimeException("hintday is null");
		}
		this.hintdayLessThanOrEqual = hintdayLessThanOrEqual;
		return this;
	}

	public PinfoQuery hintdays(List<Integer> hintdays) {
		if (hintdays == null) {
			throw new RuntimeException("hintdays is empty ");
		}
		this.hintdays = hintdays;
		return this;
	}

	public PinfoQuery icompany(String icompany) {
		if (icompany == null) {
			throw new RuntimeException("icompany is null");
		}
		this.icompany = icompany;
		return this;
	}

	public PinfoQuery icompany2(String icompany2) {
		if (icompany2 == null) {
			throw new RuntimeException("icompany2 is null");
		}
		this.icompany2 = icompany2;
		return this;
	}

	public PinfoQuery icompany2Like(String icompany2Like) {
		if (icompany2Like == null) {
			throw new RuntimeException("icompany2 is null");
		}
		this.icompany2Like = icompany2Like;
		return this;
	}

	public PinfoQuery icompany2s(List<String> icompany2s) {
		if (icompany2s == null) {
			throw new RuntimeException("icompany2s is empty ");
		}
		this.icompany2s = icompany2s;
		return this;
	}

	public PinfoQuery icompanyLike(String icompanyLike) {
		if (icompanyLike == null) {
			throw new RuntimeException("icompany is null");
		}
		this.icompanyLike = icompanyLike;
		return this;
	}

	public PinfoQuery icompanys(List<String> icompanys) {
		if (icompanys == null) {
			throw new RuntimeException("icompanys is empty ");
		}
		this.icompanys = icompanys;
		return this;
	}

	public PinfoQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public PinfoQuery indexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public PinfoQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("indexId", "index_id");
		addColumn("itemnum", "itemnum");
		addColumn("dtag", "dtag");
		addColumn("ftag", "ftag");
		addColumn("name", "name");
		addColumn("allname", "allname");
		addColumn("bcompany", "bcompany");
		addColumn("ccompany", "ccompany");
		addColumn("dcompany", "dcompany");
		addColumn("concompany", "concompany");
		addColumn("icompany", "icompany");
		addColumn("cmark", "cmark");
		addColumn("pmark", "pmark");
		addColumn("tpmark", "tpmark");
		addColumn("tmark", "tmark");
		addColumn("conmark", "conmark");
		addColumn("mapnum", "mapnum");
		addColumn("constart", "constart");
		addColumn("conend", "conend");
		addColumn("totallen", "totallen");
		addColumn("startdate", "startdate");
		addColumn("enddate", "enddate");
		addColumn("cost", "cost");
		addColumn("balance", "balance");
		addColumn("pmannager", "pmannager");
		addColumn("enginee", "enginee");
		addColumn("owner", "owner");
		addColumn("plandate", "plandate");
		addColumn("hintday", "hintday");
		addColumn("duty", "duty");
		addColumn("removedate", "removedate");
		addColumn("removeduty", "removeduty");
		addColumn("removefile", "removefile");
		addColumn("partproj", "partproj");
		addColumn("cnum", "cnum");
		addColumn("concompany2", "concompany2");
		addColumn("icompany2", "icompany2");
		addColumn("mileage", "mileage");
		addColumn("place", "place");
		addColumn("place1", "place1");
		addColumn("place2", "place2");
		addColumn("place3", "place3");
		addColumn("place4", "place4");
		addColumn("setplace", "setplace");
		addColumn("settemp", "settemp");
		addColumn("bdnum", "bdnum");
		addColumn("dtnum", "dtnum");
		addColumn("pinfoUser2", "pinfo_user2");
		addColumn("pinfoUser3", "pinfo_user3");
		addColumn("pinfoUser4", "pinfo_user4");
		addColumn("pinfoUser5", "pinfo_user5");
		addColumn("pinfoUser6", "pinfo_user6");
		addColumn("pinfoUser7", "pinfo_user7");
		addColumn("pinfoUser8", "pinfo_user8");
		addColumn("pinfoUser9", "pinfo_user9");
		addColumn("pinfoUser10", "pinfo_user10");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public PinfoQuery itemnum(String itemnum) {
		if (itemnum == null) {
			throw new RuntimeException("itemnum is null");
		}
		this.itemnum = itemnum;
		return this;
	}

	public PinfoQuery itemnumLike(String itemnumLike) {
		if (itemnumLike == null) {
			throw new RuntimeException("itemnum is null");
		}
		this.itemnumLike = itemnumLike;
		return this;
	}

	public PinfoQuery itemnums(List<String> itemnums) {
		if (itemnums == null) {
			throw new RuntimeException("itemnums is empty ");
		}
		this.itemnums = itemnums;
		return this;
	}

	public PinfoQuery mapnum(String mapnum) {
		if (mapnum == null) {
			throw new RuntimeException("mapnum is null");
		}
		this.mapnum = mapnum;
		return this;
	}

	public PinfoQuery mapnumLike(String mapnumLike) {
		if (mapnumLike == null) {
			throw new RuntimeException("mapnum is null");
		}
		this.mapnumLike = mapnumLike;
		return this;
	}

	public PinfoQuery mapnums(List<String> mapnums) {
		if (mapnums == null) {
			throw new RuntimeException("mapnums is empty ");
		}
		this.mapnums = mapnums;
		return this;
	}

	public PinfoQuery mileage(Long mileage) {
		if (mileage == null) {
			throw new RuntimeException("mileage is null");
		}
		this.mileage = mileage;
		return this;
	}

	public PinfoQuery mileageGreaterThanOrEqual(Long mileageGreaterThanOrEqual) {
		if (mileageGreaterThanOrEqual == null) {
			throw new RuntimeException("mileage is null");
		}
		this.mileageGreaterThanOrEqual = mileageGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery mileageLessThanOrEqual(Long mileageLessThanOrEqual) {
		if (mileageLessThanOrEqual == null) {
			throw new RuntimeException("mileage is null");
		}
		this.mileageLessThanOrEqual = mileageLessThanOrEqual;
		return this;
	}

	public PinfoQuery mileages(List<Long> mileages) {
		if (mileages == null) {
			throw new RuntimeException("mileages is empty ");
		}
		this.mileages = mileages;
		return this;
	}

	public PinfoQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public PinfoQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public PinfoQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public PinfoQuery owner(String owner) {
		if (owner == null) {
			throw new RuntimeException("owner is null");
		}
		this.owner = owner;
		return this;
	}

	public PinfoQuery ownerLike(String ownerLike) {
		if (ownerLike == null) {
			throw new RuntimeException("owner is null");
		}
		this.ownerLike = ownerLike;
		return this;
	}

	public PinfoQuery owners(List<String> owners) {
		if (owners == null) {
			throw new RuntimeException("owners is empty ");
		}
		this.owners = owners;
		return this;
	}

	public PinfoQuery partproj(String partproj) {
		if (partproj == null) {
			throw new RuntimeException("partproj is null");
		}
		this.partproj = partproj;
		return this;
	}

	public PinfoQuery partprojLike(String partprojLike) {
		if (partprojLike == null) {
			throw new RuntimeException("partproj is null");
		}
		this.partprojLike = partprojLike;
		return this;
	}

	public PinfoQuery partprojs(List<String> partprojs) {
		if (partprojs == null) {
			throw new RuntimeException("partprojs is empty ");
		}
		this.partprojs = partprojs;
		return this;
	}

	public PinfoQuery pinfoUser10(String pinfoUser10) {
		if (pinfoUser10 == null) {
			throw new RuntimeException("pinfoUser10 is null");
		}
		this.pinfoUser10 = pinfoUser10;
		return this;
	}

	public PinfoQuery pinfoUser10Like(String pinfoUser10Like) {
		if (pinfoUser10Like == null) {
			throw new RuntimeException("pinfoUser10 is null");
		}
		this.pinfoUser10Like = pinfoUser10Like;
		return this;
	}

	public PinfoQuery pinfoUser10s(List<String> pinfoUser10s) {
		if (pinfoUser10s == null) {
			throw new RuntimeException("pinfoUser10s is empty ");
		}
		this.pinfoUser10s = pinfoUser10s;
		return this;
	}

	public PinfoQuery pinfoUser2(String pinfoUser2) {
		if (pinfoUser2 == null) {
			throw new RuntimeException("pinfoUser2 is null");
		}
		this.pinfoUser2 = pinfoUser2;
		return this;
	}

	public PinfoQuery pinfoUser2Like(String pinfoUser2Like) {
		if (pinfoUser2Like == null) {
			throw new RuntimeException("pinfoUser2 is null");
		}
		this.pinfoUser2Like = pinfoUser2Like;
		return this;
	}

	public PinfoQuery pinfoUser2s(List<String> pinfoUser2s) {
		if (pinfoUser2s == null) {
			throw new RuntimeException("pinfoUser2s is empty ");
		}
		this.pinfoUser2s = pinfoUser2s;
		return this;
	}

	public PinfoQuery pinfoUser3(Long pinfoUser3) {
		if (pinfoUser3 == null) {
			throw new RuntimeException("pinfoUser3 is null");
		}
		this.pinfoUser3 = pinfoUser3;
		return this;
	}

	public PinfoQuery pinfoUser3GreaterThanOrEqual(
			Long pinfoUser3GreaterThanOrEqual) {
		if (pinfoUser3GreaterThanOrEqual == null) {
			throw new RuntimeException("pinfoUser3 is null");
		}
		this.pinfoUser3GreaterThanOrEqual = pinfoUser3GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser3LessThanOrEqual(Long pinfoUser3LessThanOrEqual) {
		if (pinfoUser3LessThanOrEqual == null) {
			throw new RuntimeException("pinfoUser3 is null");
		}
		this.pinfoUser3LessThanOrEqual = pinfoUser3LessThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser3s(List<Long> pinfoUser3s) {
		if (pinfoUser3s == null) {
			throw new RuntimeException("pinfoUser3s is empty ");
		}
		this.pinfoUser3s = pinfoUser3s;
		return this;
	}

	public PinfoQuery pinfoUser4(Long pinfoUser4) {
		if (pinfoUser4 == null) {
			throw new RuntimeException("pinfoUser4 is null");
		}
		this.pinfoUser4 = pinfoUser4;
		return this;
	}

	public PinfoQuery pinfoUser4GreaterThanOrEqual(
			Long pinfoUser4GreaterThanOrEqual) {
		if (pinfoUser4GreaterThanOrEqual == null) {
			throw new RuntimeException("pinfoUser4 is null");
		}
		this.pinfoUser4GreaterThanOrEqual = pinfoUser4GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser4LessThanOrEqual(Long pinfoUser4LessThanOrEqual) {
		if (pinfoUser4LessThanOrEqual == null) {
			throw new RuntimeException("pinfoUser4 is null");
		}
		this.pinfoUser4LessThanOrEqual = pinfoUser4LessThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser4s(List<Long> pinfoUser4s) {
		if (pinfoUser4s == null) {
			throw new RuntimeException("pinfoUser4s is empty ");
		}
		this.pinfoUser4s = pinfoUser4s;
		return this;
	}

	public PinfoQuery pinfoUser5(String pinfoUser5) {
		if (pinfoUser5 == null) {
			throw new RuntimeException("pinfoUser5 is null");
		}
		this.pinfoUser5 = pinfoUser5;
		return this;
	}

	public PinfoQuery pinfoUser5Like(String pinfoUser5Like) {
		if (pinfoUser5Like == null) {
			throw new RuntimeException("pinfoUser5 is null");
		}
		this.pinfoUser5Like = pinfoUser5Like;
		return this;
	}

	public PinfoQuery pinfoUser5s(List<String> pinfoUser5s) {
		if (pinfoUser5s == null) {
			throw new RuntimeException("pinfoUser5s is empty ");
		}
		this.pinfoUser5s = pinfoUser5s;
		return this;
	}

	public PinfoQuery pinfoUser6(Integer pinfoUser6) {
		if (pinfoUser6 == null) {
			throw new RuntimeException("pinfoUser6 is null");
		}
		this.pinfoUser6 = pinfoUser6;
		return this;
	}

	public PinfoQuery pinfoUser6GreaterThanOrEqual(
			Integer pinfoUser6GreaterThanOrEqual) {
		if (pinfoUser6GreaterThanOrEqual == null) {
			throw new RuntimeException("pinfoUser6 is null");
		}
		this.pinfoUser6GreaterThanOrEqual = pinfoUser6GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser6LessThanOrEqual(
			Integer pinfoUser6LessThanOrEqual) {
		if (pinfoUser6LessThanOrEqual == null) {
			throw new RuntimeException("pinfoUser6 is null");
		}
		this.pinfoUser6LessThanOrEqual = pinfoUser6LessThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser6s(List<Integer> pinfoUser6s) {
		if (pinfoUser6s == null) {
			throw new RuntimeException("pinfoUser6s is empty ");
		}
		this.pinfoUser6s = pinfoUser6s;
		return this;
	}

	public PinfoQuery pinfoUser7(Long pinfoUser7) {
		if (pinfoUser7 == null) {
			throw new RuntimeException("pinfoUser7 is null");
		}
		this.pinfoUser7 = pinfoUser7;
		return this;
	}

	public PinfoQuery pinfoUser7GreaterThanOrEqual(
			Long pinfoUser7GreaterThanOrEqual) {
		if (pinfoUser7GreaterThanOrEqual == null) {
			throw new RuntimeException("pinfoUser7 is null");
		}
		this.pinfoUser7GreaterThanOrEqual = pinfoUser7GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser7LessThanOrEqual(Long pinfoUser7LessThanOrEqual) {
		if (pinfoUser7LessThanOrEqual == null) {
			throw new RuntimeException("pinfoUser7 is null");
		}
		this.pinfoUser7LessThanOrEqual = pinfoUser7LessThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser7s(List<Long> pinfoUser7s) {
		if (pinfoUser7s == null) {
			throw new RuntimeException("pinfoUser7s is empty ");
		}
		this.pinfoUser7s = pinfoUser7s;
		return this;
	}

	public PinfoQuery pinfoUser8(Long pinfoUser8) {
		if (pinfoUser8 == null) {
			throw new RuntimeException("pinfoUser8 is null");
		}
		this.pinfoUser8 = pinfoUser8;
		return this;
	}

	public PinfoQuery pinfoUser8GreaterThanOrEqual(
			Long pinfoUser8GreaterThanOrEqual) {
		if (pinfoUser8GreaterThanOrEqual == null) {
			throw new RuntimeException("pinfoUser8 is null");
		}
		this.pinfoUser8GreaterThanOrEqual = pinfoUser8GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser8LessThanOrEqual(Long pinfoUser8LessThanOrEqual) {
		if (pinfoUser8LessThanOrEqual == null) {
			throw new RuntimeException("pinfoUser8 is null");
		}
		this.pinfoUser8LessThanOrEqual = pinfoUser8LessThanOrEqual;
		return this;
	}

	public PinfoQuery pinfoUser8s(List<Long> pinfoUser8s) {
		if (pinfoUser8s == null) {
			throw new RuntimeException("pinfoUser8s is empty ");
		}
		this.pinfoUser8s = pinfoUser8s;
		return this;
	}

	public PinfoQuery pinfoUser9(String pinfoUser9) {
		if (pinfoUser9 == null) {
			throw new RuntimeException("pinfoUser9 is null");
		}
		this.pinfoUser9 = pinfoUser9;
		return this;
	}

	public PinfoQuery pinfoUser9Like(String pinfoUser9Like) {
		if (pinfoUser9Like == null) {
			throw new RuntimeException("pinfoUser9 is null");
		}
		this.pinfoUser9Like = pinfoUser9Like;
		return this;
	}

	public PinfoQuery pinfoUser9s(List<String> pinfoUser9s) {
		if (pinfoUser9s == null) {
			throw new RuntimeException("pinfoUser9s is empty ");
		}
		this.pinfoUser9s = pinfoUser9s;
		return this;
	}

	public PinfoQuery place(String place) {
		if (place == null) {
			throw new RuntimeException("place is null");
		}
		this.place = place;
		return this;
	}

	public PinfoQuery place1(Long place1) {
		if (place1 == null) {
			throw new RuntimeException("place1 is null");
		}
		this.place1 = place1;
		return this;
	}

	public PinfoQuery place1GreaterThanOrEqual(Long place1GreaterThanOrEqual) {
		if (place1GreaterThanOrEqual == null) {
			throw new RuntimeException("place1 is null");
		}
		this.place1GreaterThanOrEqual = place1GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery place1LessThanOrEqual(Long place1LessThanOrEqual) {
		if (place1LessThanOrEqual == null) {
			throw new RuntimeException("place1 is null");
		}
		this.place1LessThanOrEqual = place1LessThanOrEqual;
		return this;
	}

	public PinfoQuery place1s(List<Long> place1s) {
		if (place1s == null) {
			throw new RuntimeException("place1s is empty ");
		}
		this.place1s = place1s;
		return this;
	}

	public PinfoQuery place2(Long place2) {
		if (place2 == null) {
			throw new RuntimeException("place2 is null");
		}
		this.place2 = place2;
		return this;
	}

	public PinfoQuery place2GreaterThanOrEqual(Long place2GreaterThanOrEqual) {
		if (place2GreaterThanOrEqual == null) {
			throw new RuntimeException("place2 is null");
		}
		this.place2GreaterThanOrEqual = place2GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery place2LessThanOrEqual(Long place2LessThanOrEqual) {
		if (place2LessThanOrEqual == null) {
			throw new RuntimeException("place2 is null");
		}
		this.place2LessThanOrEqual = place2LessThanOrEqual;
		return this;
	}

	public PinfoQuery place2s(List<Long> place2s) {
		if (place2s == null) {
			throw new RuntimeException("place2s is empty ");
		}
		this.place2s = place2s;
		return this;
	}

	public PinfoQuery place3(Long place3) {
		if (place3 == null) {
			throw new RuntimeException("place3 is null");
		}
		this.place3 = place3;
		return this;
	}

	public PinfoQuery place3GreaterThanOrEqual(Long place3GreaterThanOrEqual) {
		if (place3GreaterThanOrEqual == null) {
			throw new RuntimeException("place3 is null");
		}
		this.place3GreaterThanOrEqual = place3GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery place3LessThanOrEqual(Long place3LessThanOrEqual) {
		if (place3LessThanOrEqual == null) {
			throw new RuntimeException("place3 is null");
		}
		this.place3LessThanOrEqual = place3LessThanOrEqual;
		return this;
	}

	public PinfoQuery place3s(List<Long> place3s) {
		if (place3s == null) {
			throw new RuntimeException("place3s is empty ");
		}
		this.place3s = place3s;
		return this;
	}

	public PinfoQuery place4(Long place4) {
		if (place4 == null) {
			throw new RuntimeException("place4 is null");
		}
		this.place4 = place4;
		return this;
	}

	public PinfoQuery place4GreaterThanOrEqual(Long place4GreaterThanOrEqual) {
		if (place4GreaterThanOrEqual == null) {
			throw new RuntimeException("place4 is null");
		}
		this.place4GreaterThanOrEqual = place4GreaterThanOrEqual;
		return this;
	}

	public PinfoQuery place4LessThanOrEqual(Long place4LessThanOrEqual) {
		if (place4LessThanOrEqual == null) {
			throw new RuntimeException("place4 is null");
		}
		this.place4LessThanOrEqual = place4LessThanOrEqual;
		return this;
	}

	public PinfoQuery place4s(List<Long> place4s) {
		if (place4s == null) {
			throw new RuntimeException("place4s is empty ");
		}
		this.place4s = place4s;
		return this;
	}

	public PinfoQuery placeLike(String placeLike) {
		if (placeLike == null) {
			throw new RuntimeException("place is null");
		}
		this.placeLike = placeLike;
		return this;
	}

	public PinfoQuery places(List<String> places) {
		if (places == null) {
			throw new RuntimeException("places is empty ");
		}
		this.places = places;
		return this;
	}

	public PinfoQuery plandate(Date plandate) {
		if (plandate == null) {
			throw new RuntimeException("plandate is null");
		}
		this.plandate = plandate;
		return this;
	}

	public PinfoQuery plandateGreaterThanOrEqual(Date plandateGreaterThanOrEqual) {
		if (plandateGreaterThanOrEqual == null) {
			throw new RuntimeException("plandate is null");
		}
		this.plandateGreaterThanOrEqual = plandateGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery plandateLessThanOrEqual(Date plandateLessThanOrEqual) {
		if (plandateLessThanOrEqual == null) {
			throw new RuntimeException("plandate is null");
		}
		this.plandateLessThanOrEqual = plandateLessThanOrEqual;
		return this;
	}

	public PinfoQuery plandates(List<Date> plandates) {
		if (plandates == null) {
			throw new RuntimeException("plandates is empty ");
		}
		this.plandates = plandates;
		return this;
	}

	public PinfoQuery pmannager(String pmannager) {
		if (pmannager == null) {
			throw new RuntimeException("pmannager is null");
		}
		this.pmannager = pmannager;
		return this;
	}

	public PinfoQuery pmannagerLike(String pmannagerLike) {
		if (pmannagerLike == null) {
			throw new RuntimeException("pmannager is null");
		}
		this.pmannagerLike = pmannagerLike;
		return this;
	}

	public PinfoQuery pmannagers(List<String> pmannagers) {
		if (pmannagers == null) {
			throw new RuntimeException("pmannagers is empty ");
		}
		this.pmannagers = pmannagers;
		return this;
	}

	public PinfoQuery pmark(String pmark) {
		if (pmark == null) {
			throw new RuntimeException("pmark is null");
		}
		this.pmark = pmark;
		return this;
	}

	public PinfoQuery pmarkLike(String pmarkLike) {
		if (pmarkLike == null) {
			throw new RuntimeException("pmark is null");
		}
		this.pmarkLike = pmarkLike;
		return this;
	}

	public PinfoQuery pmarks(List<String> pmarks) {
		if (pmarks == null) {
			throw new RuntimeException("pmarks is empty ");
		}
		this.pmarks = pmarks;
		return this;
	}

	public PinfoQuery removedate(Date removedate) {
		if (removedate == null) {
			throw new RuntimeException("removedate is null");
		}
		this.removedate = removedate;
		return this;
	}

	public PinfoQuery removedateGreaterThanOrEqual(
			Date removedateGreaterThanOrEqual) {
		if (removedateGreaterThanOrEqual == null) {
			throw new RuntimeException("removedate is null");
		}
		this.removedateGreaterThanOrEqual = removedateGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery removedateLessThanOrEqual(Date removedateLessThanOrEqual) {
		if (removedateLessThanOrEqual == null) {
			throw new RuntimeException("removedate is null");
		}
		this.removedateLessThanOrEqual = removedateLessThanOrEqual;
		return this;
	}

	public PinfoQuery removedates(List<Date> removedates) {
		if (removedates == null) {
			throw new RuntimeException("removedates is empty ");
		}
		this.removedates = removedates;
		return this;
	}

	public PinfoQuery removeduty(String removeduty) {
		if (removeduty == null) {
			throw new RuntimeException("removeduty is null");
		}
		this.removeduty = removeduty;
		return this;
	}

	public PinfoQuery removedutyLike(String removedutyLike) {
		if (removedutyLike == null) {
			throw new RuntimeException("removeduty is null");
		}
		this.removedutyLike = removedutyLike;
		return this;
	}

	public PinfoQuery removedutys(List<String> removedutys) {
		if (removedutys == null) {
			throw new RuntimeException("removedutys is empty ");
		}
		this.removedutys = removedutys;
		return this;
	}

	public PinfoQuery removefile(String removefile) {
		if (removefile == null) {
			throw new RuntimeException("removefile is null");
		}
		this.removefile = removefile;
		return this;
	}

	public PinfoQuery removefileLike(String removefileLike) {
		if (removefileLike == null) {
			throw new RuntimeException("removefile is null");
		}
		this.removefileLike = removefileLike;
		return this;
	}

	public PinfoQuery removefiles(List<String> removefiles) {
		if (removefiles == null) {
			throw new RuntimeException("removefiles is empty ");
		}
		this.removefiles = removefiles;
		return this;
	}

	public void setAllname(String allname) {
		this.allname = allname;
	}

	public void setAllnameLike(String allnameLike) {
		this.allnameLike = allnameLike;
	}

	public void setAllnames(List<String> allnames) {
		this.allnames = allnames;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public void setBalanceGreaterThanOrEqual(Long balanceGreaterThanOrEqual) {
		this.balanceGreaterThanOrEqual = balanceGreaterThanOrEqual;
	}

	public void setBalanceLessThanOrEqual(Long balanceLessThanOrEqual) {
		this.balanceLessThanOrEqual = balanceLessThanOrEqual;
	}

	public void setBalances(List<Long> balances) {
		this.balances = balances;
	}

	public void setBcompany(String bcompany) {
		this.bcompany = bcompany;
	}

	public void setBcompanyLike(String bcompanyLike) {
		this.bcompanyLike = bcompanyLike;
	}

	public void setBcompanys(List<String> bcompanys) {
		this.bcompanys = bcompanys;
	}

	public void setBdnum(String bdnum) {
		this.bdnum = bdnum;
	}

	public void setBdnumLike(String bdnumLike) {
		this.bdnumLike = bdnumLike;
	}

	public void setBdnums(List<String> bdnums) {
		this.bdnums = bdnums;
	}

	public void setCcompany(String ccompany) {
		this.ccompany = ccompany;
	}

	public void setCcompanyLike(String ccompanyLike) {
		this.ccompanyLike = ccompanyLike;
	}

	public void setCcompanys(List<String> ccompanys) {
		this.ccompanys = ccompanys;
	}

	public void setCmark(String cmark) {
		this.cmark = cmark;
	}

	public void setCmarkLike(String cmarkLike) {
		this.cmarkLike = cmarkLike;
	}

	public void setCmarks(List<String> cmarks) {
		this.cmarks = cmarks;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public void setCnumLike(String cnumLike) {
		this.cnumLike = cnumLike;
	}

	public void setCnums(List<String> cnums) {
		this.cnums = cnums;
	}

	public void setConcompany(String concompany) {
		this.concompany = concompany;
	}

	public void setConcompany2(String concompany2) {
		this.concompany2 = concompany2;
	}

	public void setConcompany2Like(String concompany2Like) {
		this.concompany2Like = concompany2Like;
	}

	public void setConcompany2s(List<String> concompany2s) {
		this.concompany2s = concompany2s;
	}

	public void setConcompanyLike(String concompanyLike) {
		this.concompanyLike = concompanyLike;
	}

	public void setConcompanys(List<String> concompanys) {
		this.concompanys = concompanys;
	}

	public void setConend(String conend) {
		this.conend = conend;
	}

	public void setConendLike(String conendLike) {
		this.conendLike = conendLike;
	}

	public void setConends(List<String> conends) {
		this.conends = conends;
	}

	public void setConmark(String conmark) {
		this.conmark = conmark;
	}

	public void setConmarkLike(String conmarkLike) {
		this.conmarkLike = conmarkLike;
	}

	public void setConmarks(List<String> conmarks) {
		this.conmarks = conmarks;
	}

	public void setConstart(String constart) {
		this.constart = constart;
	}

	public void setConstartLike(String constartLike) {
		this.constartLike = constartLike;
	}

	public void setConstarts(List<String> constarts) {
		this.constarts = constarts;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public void setCostGreaterThanOrEqual(Long costGreaterThanOrEqual) {
		this.costGreaterThanOrEqual = costGreaterThanOrEqual;
	}

	public void setCostLessThanOrEqual(Long costLessThanOrEqual) {
		this.costLessThanOrEqual = costLessThanOrEqual;
	}

	public void setCosts(List<Long> costs) {
		this.costs = costs;
	}

	public void setDcompany(String dcompany) {
		this.dcompany = dcompany;
	}

	public void setDcompanyLike(String dcompanyLike) {
		this.dcompanyLike = dcompanyLike;
	}

	public void setDcompanys(List<String> dcompanys) {
		this.dcompanys = dcompanys;
	}

	public void setDtag(String dtag) {
		this.dtag = dtag;
	}

	public void setDtagLike(String dtagLike) {
		this.dtagLike = dtagLike;
	}

	public void setDtags(List<String> dtags) {
		this.dtags = dtags;
	}

	public void setDtnum(String dtnum) {
		this.dtnum = dtnum;
	}

	public void setDtnumLike(String dtnumLike) {
		this.dtnumLike = dtnumLike;
	}

	public void setDtnums(List<String> dtnums) {
		this.dtnums = dtnums;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setDutyLike(String dutyLike) {
		this.dutyLike = dutyLike;
	}

	public void setDutys(List<String> dutys) {
		this.dutys = dutys;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public void setEnddateGreaterThanOrEqual(Date enddateGreaterThanOrEqual) {
		this.enddateGreaterThanOrEqual = enddateGreaterThanOrEqual;
	}

	public void setEnddateLessThanOrEqual(Date enddateLessThanOrEqual) {
		this.enddateLessThanOrEqual = enddateLessThanOrEqual;
	}

	public void setEnddates(List<Date> enddates) {
		this.enddates = enddates;
	}

	public void setEnginee(String enginee) {
		this.enginee = enginee;
	}

	public void setEngineeLike(String engineeLike) {
		this.engineeLike = engineeLike;
	}

	public void setEnginees(List<String> enginees) {
		this.enginees = enginees;
	}

	public void setFtag(String ftag) {
		this.ftag = ftag;
	}

	public void setFtagLike(String ftagLike) {
		this.ftagLike = ftagLike;
	}

	public void setFtags(List<String> ftags) {
		this.ftags = ftags;
	}

	public void setHintday(Integer hintday) {
		this.hintday = hintday;
	}

	public void setHintdayGreaterThanOrEqual(Integer hintdayGreaterThanOrEqual) {
		this.hintdayGreaterThanOrEqual = hintdayGreaterThanOrEqual;
	}

	public void setHintdayLessThanOrEqual(Integer hintdayLessThanOrEqual) {
		this.hintdayLessThanOrEqual = hintdayLessThanOrEqual;
	}

	public void setHintdays(List<Integer> hintdays) {
		this.hintdays = hintdays;
	}

	public void setIcompany(String icompany) {
		this.icompany = icompany;
	}

	public void setIcompany2(String icompany2) {
		this.icompany2 = icompany2;
	}

	public void setIcompany2Like(String icompany2Like) {
		this.icompany2Like = icompany2Like;
	}

	public void setIcompany2s(List<String> icompany2s) {
		this.icompany2s = icompany2s;
	}

	public void setIcompanyLike(String icompanyLike) {
		this.icompanyLike = icompanyLike;
	}

	public void setIcompanys(List<String> icompanys) {
		this.icompanys = icompanys;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual) {
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
	}

	public void setIndexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setItemnum(String itemnum) {
		this.itemnum = itemnum;
	}

	public void setItemnumLike(String itemnumLike) {
		this.itemnumLike = itemnumLike;
	}

	public void setItemnums(List<String> itemnums) {
		this.itemnums = itemnums;
	}

	public void setMapnum(String mapnum) {
		this.mapnum = mapnum;
	}

	public void setMapnumLike(String mapnumLike) {
		this.mapnumLike = mapnumLike;
	}

	public void setMapnums(List<String> mapnums) {
		this.mapnums = mapnums;
	}

	public void setMileage(Long mileage) {
		this.mileage = mileage;
	}

	public void setMileageGreaterThanOrEqual(Long mileageGreaterThanOrEqual) {
		this.mileageGreaterThanOrEqual = mileageGreaterThanOrEqual;
	}

	public void setMileageLessThanOrEqual(Long mileageLessThanOrEqual) {
		this.mileageLessThanOrEqual = mileageLessThanOrEqual;
	}

	public void setMileages(List<Long> mileages) {
		this.mileages = mileages;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setOwnerLike(String ownerLike) {
		this.ownerLike = ownerLike;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public void setPartproj(String partproj) {
		this.partproj = partproj;
	}

	public void setPartprojLike(String partprojLike) {
		this.partprojLike = partprojLike;
	}

	public void setPartprojs(List<String> partprojs) {
		this.partprojs = partprojs;
	}

	public void setPinfoUser10(String pinfoUser10) {
		this.pinfoUser10 = pinfoUser10;
	}

	public void setPinfoUser10Like(String pinfoUser10Like) {
		this.pinfoUser10Like = pinfoUser10Like;
	}

	public void setPinfoUser10s(List<String> pinfoUser10s) {
		this.pinfoUser10s = pinfoUser10s;
	}

	public void setPinfoUser2(String pinfoUser2) {
		this.pinfoUser2 = pinfoUser2;
	}

	public void setPinfoUser2Like(String pinfoUser2Like) {
		this.pinfoUser2Like = pinfoUser2Like;
	}

	public void setPinfoUser2s(List<String> pinfoUser2s) {
		this.pinfoUser2s = pinfoUser2s;
	}

	public void setPinfoUser3(Long pinfoUser3) {
		this.pinfoUser3 = pinfoUser3;
	}

	public void setPinfoUser3GreaterThanOrEqual(
			Long pinfoUser3GreaterThanOrEqual) {
		this.pinfoUser3GreaterThanOrEqual = pinfoUser3GreaterThanOrEqual;
	}

	public void setPinfoUser3LessThanOrEqual(Long pinfoUser3LessThanOrEqual) {
		this.pinfoUser3LessThanOrEqual = pinfoUser3LessThanOrEqual;
	}

	public void setPinfoUser3s(List<Long> pinfoUser3s) {
		this.pinfoUser3s = pinfoUser3s;
	}

	public void setPinfoUser4(Long pinfoUser4) {
		this.pinfoUser4 = pinfoUser4;
	}

	public void setPinfoUser4GreaterThanOrEqual(
			Long pinfoUser4GreaterThanOrEqual) {
		this.pinfoUser4GreaterThanOrEqual = pinfoUser4GreaterThanOrEqual;
	}

	public void setPinfoUser4LessThanOrEqual(Long pinfoUser4LessThanOrEqual) {
		this.pinfoUser4LessThanOrEqual = pinfoUser4LessThanOrEqual;
	}

	public void setPinfoUser4s(List<Long> pinfoUser4s) {
		this.pinfoUser4s = pinfoUser4s;
	}

	public void setPinfoUser5(String pinfoUser5) {
		this.pinfoUser5 = pinfoUser5;
	}

	public void setPinfoUser5Like(String pinfoUser5Like) {
		this.pinfoUser5Like = pinfoUser5Like;
	}

	public void setPinfoUser5s(List<String> pinfoUser5s) {
		this.pinfoUser5s = pinfoUser5s;
	}

	public void setPinfoUser6(Integer pinfoUser6) {
		this.pinfoUser6 = pinfoUser6;
	}

	public void setPinfoUser6GreaterThanOrEqual(
			Integer pinfoUser6GreaterThanOrEqual) {
		this.pinfoUser6GreaterThanOrEqual = pinfoUser6GreaterThanOrEqual;
	}

	public void setPinfoUser6LessThanOrEqual(Integer pinfoUser6LessThanOrEqual) {
		this.pinfoUser6LessThanOrEqual = pinfoUser6LessThanOrEqual;
	}

	public void setPinfoUser6s(List<Integer> pinfoUser6s) {
		this.pinfoUser6s = pinfoUser6s;
	}

	public void setPinfoUser7(Long pinfoUser7) {
		this.pinfoUser7 = pinfoUser7;
	}

	public void setPinfoUser7GreaterThanOrEqual(
			Long pinfoUser7GreaterThanOrEqual) {
		this.pinfoUser7GreaterThanOrEqual = pinfoUser7GreaterThanOrEqual;
	}

	public void setPinfoUser7LessThanOrEqual(Long pinfoUser7LessThanOrEqual) {
		this.pinfoUser7LessThanOrEqual = pinfoUser7LessThanOrEqual;
	}

	public void setPinfoUser7s(List<Long> pinfoUser7s) {
		this.pinfoUser7s = pinfoUser7s;
	}

	public void setPinfoUser8(Long pinfoUser8) {
		this.pinfoUser8 = pinfoUser8;
	}

	public void setPinfoUser8GreaterThanOrEqual(
			Long pinfoUser8GreaterThanOrEqual) {
		this.pinfoUser8GreaterThanOrEqual = pinfoUser8GreaterThanOrEqual;
	}

	public void setPinfoUser8LessThanOrEqual(Long pinfoUser8LessThanOrEqual) {
		this.pinfoUser8LessThanOrEqual = pinfoUser8LessThanOrEqual;
	}

	public void setPinfoUser8s(List<Long> pinfoUser8s) {
		this.pinfoUser8s = pinfoUser8s;
	}

	public void setPinfoUser9(String pinfoUser9) {
		this.pinfoUser9 = pinfoUser9;
	}

	public void setPinfoUser9Like(String pinfoUser9Like) {
		this.pinfoUser9Like = pinfoUser9Like;
	}

	public void setPinfoUser9s(List<String> pinfoUser9s) {
		this.pinfoUser9s = pinfoUser9s;
	}

	public PinfoQuery setplace(String setplace) {
		if (setplace == null) {
			throw new RuntimeException("setplace is null");
		}
		this.setplace = setplace;
		return this;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPlace1(Long place1) {
		this.place1 = place1;
	}

	public void setPlace1GreaterThanOrEqual(Long place1GreaterThanOrEqual) {
		this.place1GreaterThanOrEqual = place1GreaterThanOrEqual;
	}

	public void setPlace1LessThanOrEqual(Long place1LessThanOrEqual) {
		this.place1LessThanOrEqual = place1LessThanOrEqual;
	}

	public void setPlace1s(List<Long> place1s) {
		this.place1s = place1s;
	}

	public void setPlace2(Long place2) {
		this.place2 = place2;
	}

	public void setPlace2GreaterThanOrEqual(Long place2GreaterThanOrEqual) {
		this.place2GreaterThanOrEqual = place2GreaterThanOrEqual;
	}

	public void setPlace2LessThanOrEqual(Long place2LessThanOrEqual) {
		this.place2LessThanOrEqual = place2LessThanOrEqual;
	}

	public void setPlace2s(List<Long> place2s) {
		this.place2s = place2s;
	}

	public void setPlace3(Long place3) {
		this.place3 = place3;
	}

	public void setPlace3GreaterThanOrEqual(Long place3GreaterThanOrEqual) {
		this.place3GreaterThanOrEqual = place3GreaterThanOrEqual;
	}

	public void setPlace3LessThanOrEqual(Long place3LessThanOrEqual) {
		this.place3LessThanOrEqual = place3LessThanOrEqual;
	}

	public void setPlace3s(List<Long> place3s) {
		this.place3s = place3s;
	}

	public void setPlace4(Long place4) {
		this.place4 = place4;
	}

	public void setPlace4GreaterThanOrEqual(Long place4GreaterThanOrEqual) {
		this.place4GreaterThanOrEqual = place4GreaterThanOrEqual;
	}

	public void setPlace4LessThanOrEqual(Long place4LessThanOrEqual) {
		this.place4LessThanOrEqual = place4LessThanOrEqual;
	}

	public void setPlace4s(List<Long> place4s) {
		this.place4s = place4s;
	}

	public PinfoQuery setplaceLike(String setplaceLike) {
		if (setplaceLike == null) {
			throw new RuntimeException("setplace is null");
		}
		this.setplaceLike = setplaceLike;
		return this;
	}

	public void setPlaceLike(String placeLike) {
		this.placeLike = placeLike;
	}

	public PinfoQuery setplaces(List<String> setplaces) {
		if (setplaces == null) {
			throw new RuntimeException("setplaces is empty ");
		}
		this.setplaces = setplaces;
		return this;
	}

	public void setPlaces(List<String> places) {
		this.places = places;
	}

	public void setPlandate(Date plandate) {
		this.plandate = plandate;
	}

	public void setPlandateGreaterThanOrEqual(Date plandateGreaterThanOrEqual) {
		this.plandateGreaterThanOrEqual = plandateGreaterThanOrEqual;
	}

	public void setPlandateLessThanOrEqual(Date plandateLessThanOrEqual) {
		this.plandateLessThanOrEqual = plandateLessThanOrEqual;
	}

	public void setPlandates(List<Date> plandates) {
		this.plandates = plandates;
	}

	public void setPmannager(String pmannager) {
		this.pmannager = pmannager;
	}

	public void setPmannagerLike(String pmannagerLike) {
		this.pmannagerLike = pmannagerLike;
	}

	public void setPmannagers(List<String> pmannagers) {
		this.pmannagers = pmannagers;
	}

	public void setPmark(String pmark) {
		this.pmark = pmark;
	}

	public void setPmarkLike(String pmarkLike) {
		this.pmarkLike = pmarkLike;
	}

	public void setPmarks(List<String> pmarks) {
		this.pmarks = pmarks;
	}

	public void setRemovedate(Date removedate) {
		this.removedate = removedate;
	}

	public void setRemovedateGreaterThanOrEqual(
			Date removedateGreaterThanOrEqual) {
		this.removedateGreaterThanOrEqual = removedateGreaterThanOrEqual;
	}

	public void setRemovedateLessThanOrEqual(Date removedateLessThanOrEqual) {
		this.removedateLessThanOrEqual = removedateLessThanOrEqual;
	}

	public void setRemovedates(List<Date> removedates) {
		this.removedates = removedates;
	}

	public void setRemoveduty(String removeduty) {
		this.removeduty = removeduty;
	}

	public void setRemovedutyLike(String removedutyLike) {
		this.removedutyLike = removedutyLike;
	}

	public void setRemovedutys(List<String> removedutys) {
		this.removedutys = removedutys;
	}

	public void setRemovefile(String removefile) {
		this.removefile = removefile;
	}

	public void setRemovefileLike(String removefileLike) {
		this.removefileLike = removefileLike;
	}

	public void setRemovefiles(List<String> removefiles) {
		this.removefiles = removefiles;
	}

	public void setSetplace(String setplace) {
		this.setplace = setplace;
	}

	public void setSetplaceLike(String setplaceLike) {
		this.setplaceLike = setplaceLike;
	}

	public void setSetplaces(List<String> setplaces) {
		this.setplaces = setplaces;
	}

	public void setSettemp(String settemp) {
		this.settemp = settemp;
	}

	public void setSettempLike(String settempLike) {
		this.settempLike = settempLike;
	}

	public void setSettemps(List<String> settemps) {
		this.settemps = settemps;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public void setStartdateGreaterThanOrEqual(Date startdateGreaterThanOrEqual) {
		this.startdateGreaterThanOrEqual = startdateGreaterThanOrEqual;
	}

	public void setStartdateLessThanOrEqual(Date startdateLessThanOrEqual) {
		this.startdateLessThanOrEqual = startdateLessThanOrEqual;
	}

	public void setStartdates(List<Date> startdates) {
		this.startdates = startdates;
	}

	public PinfoQuery settemp(String settemp) {
		if (settemp == null) {
			throw new RuntimeException("settemp is null");
		}
		this.settemp = settemp;
		return this;
	}

	public PinfoQuery settempLike(String settempLike) {
		if (settempLike == null) {
			throw new RuntimeException("settemp is null");
		}
		this.settempLike = settempLike;
		return this;
	}

	public PinfoQuery settemps(List<String> settemps) {
		if (settemps == null) {
			throw new RuntimeException("settemps is empty ");
		}
		this.settemps = settemps;
		return this;
	}

	public void setTmark(String tmark) {
		this.tmark = tmark;
	}

	public void setTmarkLike(String tmarkLike) {
		this.tmarkLike = tmarkLike;
	}

	public void setTmarks(List<String> tmarks) {
		this.tmarks = tmarks;
	}

	public void setTotallen(Long totallen) {
		this.totallen = totallen;
	}

	public void setTotallenGreaterThanOrEqual(Long totallenGreaterThanOrEqual) {
		this.totallenGreaterThanOrEqual = totallenGreaterThanOrEqual;
	}

	public void setTotallenLessThanOrEqual(Long totallenLessThanOrEqual) {
		this.totallenLessThanOrEqual = totallenLessThanOrEqual;
	}

	public void setTotallens(List<Long> totallens) {
		this.totallens = totallens;
	}

	public void setTpmark(String tpmark) {
		this.tpmark = tpmark;
	}

	public void setTpmarkLike(String tpmarkLike) {
		this.tpmarkLike = tpmarkLike;
	}

	public void setTpmarks(List<String> tpmarks) {
		this.tpmarks = tpmarks;
	}

	public PinfoQuery startdate(Date startdate) {
		if (startdate == null) {
			throw new RuntimeException("startdate is null");
		}
		this.startdate = startdate;
		return this;
	}

	public PinfoQuery startdateGreaterThanOrEqual(
			Date startdateGreaterThanOrEqual) {
		if (startdateGreaterThanOrEqual == null) {
			throw new RuntimeException("startdate is null");
		}
		this.startdateGreaterThanOrEqual = startdateGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery startdateLessThanOrEqual(Date startdateLessThanOrEqual) {
		if (startdateLessThanOrEqual == null) {
			throw new RuntimeException("startdate is null");
		}
		this.startdateLessThanOrEqual = startdateLessThanOrEqual;
		return this;
	}

	public PinfoQuery startdates(List<Date> startdates) {
		if (startdates == null) {
			throw new RuntimeException("startdates is empty ");
		}
		this.startdates = startdates;
		return this;
	}

	public PinfoQuery tmark(String tmark) {
		if (tmark == null) {
			throw new RuntimeException("tmark is null");
		}
		this.tmark = tmark;
		return this;
	}

	public PinfoQuery tmarkLike(String tmarkLike) {
		if (tmarkLike == null) {
			throw new RuntimeException("tmark is null");
		}
		this.tmarkLike = tmarkLike;
		return this;
	}

	public PinfoQuery tmarks(List<String> tmarks) {
		if (tmarks == null) {
			throw new RuntimeException("tmarks is empty ");
		}
		this.tmarks = tmarks;
		return this;
	}

	public PinfoQuery totallen(Long totallen) {
		if (totallen == null) {
			throw new RuntimeException("totallen is null");
		}
		this.totallen = totallen;
		return this;
	}

	public PinfoQuery totallenGreaterThanOrEqual(Long totallenGreaterThanOrEqual) {
		if (totallenGreaterThanOrEqual == null) {
			throw new RuntimeException("totallen is null");
		}
		this.totallenGreaterThanOrEqual = totallenGreaterThanOrEqual;
		return this;
	}

	public PinfoQuery totallenLessThanOrEqual(Long totallenLessThanOrEqual) {
		if (totallenLessThanOrEqual == null) {
			throw new RuntimeException("totallen is null");
		}
		this.totallenLessThanOrEqual = totallenLessThanOrEqual;
		return this;
	}

	public PinfoQuery totallens(List<Long> totallens) {
		if (totallens == null) {
			throw new RuntimeException("totallens is empty ");
		}
		this.totallens = totallens;
		return this;
	}

	public PinfoQuery tpmark(String tpmark) {
		if (tpmark == null) {
			throw new RuntimeException("tpmark is null");
		}
		this.tpmark = tpmark;
		return this;
	}

	public PinfoQuery tpmarkLike(String tpmarkLike) {
		if (tpmarkLike == null) {
			throw new RuntimeException("tpmark is null");
		}
		this.tpmarkLike = tpmarkLike;
		return this;
	}

	public PinfoQuery tpmarks(List<String> tpmarks) {
		if (tpmarks == null) {
			throw new RuntimeException("tpmarks is empty ");
		}
		this.tpmarks = tpmarks;
		return this;
	}

}