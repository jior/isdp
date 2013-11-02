package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreepInfoQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected String numLike;
	protected Integer topId;
	protected Integer topIdGreaterThanOrEqual;
	protected Integer topIdLessThanOrEqual;
	protected List<Integer> topIds;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String nodetype;
	protected String nodetypeLike;
	protected List<String> nodetypes;
	protected Integer fromid;
	protected Integer fromidGreaterThanOrEqual;
	protected Integer fromidLessThanOrEqual;
	protected List<Integer> fromids;
	protected Integer partId;
	protected Integer partIdGreaterThanOrEqual;
	protected Integer partIdLessThanOrEqual;
	protected List<Integer> partIds;
	protected Integer showid;
	protected Integer showidGreaterThanOrEqual;
	protected Integer showidLessThanOrEqual;
	protected List<Integer> showids;
	protected String sindexNameLike;
	protected Integer filenum;
	protected Integer filenumGreaterThanOrEqual;
	protected Integer filenumLessThanOrEqual;
	protected List<Integer> filenums;
	protected Integer filenum0;
	protected Integer filenum0GreaterThanOrEqual;
	protected Integer filenum0LessThanOrEqual;
	protected List<Integer> filenum0s;
	protected Integer filenum1;
	protected Integer filenum1GreaterThanOrEqual;
	protected Integer filenum1LessThanOrEqual;
	protected List<Integer> filenum1s;
	protected Integer filenum2;
	protected Integer filenum2GreaterThanOrEqual;
	protected Integer filenum2LessThanOrEqual;
	protected List<Integer> filenum2s;
	protected String projtype;
	protected String projtypeLike;
	protected List<String> projtypes;
	protected String cid;
	protected String cidLike;
	protected List<String> cids;
	protected Integer dwid;
	protected Integer dwidGreaterThanOrEqual;
	protected Integer dwidLessThanOrEqual;
	protected List<Integer> dwids;
	protected Integer fbid;
	protected Integer fbidGreaterThanOrEqual;
	protected Integer fbidLessThanOrEqual;
	protected List<Integer> fbids;
	protected Integer fxid;
	protected Integer fxidGreaterThanOrEqual;
	protected Integer fxidLessThanOrEqual;
	protected List<Integer> fxids;
	protected String jid;
	protected String jidLike;
	protected List<String> jids;
	protected String flid;
	protected String flidLike;
	protected List<String> flids;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
	protected Integer nodeico;
	protected Integer nodeicoGreaterThanOrEqual;
	protected Integer nodeicoLessThanOrEqual;
	protected List<Integer> nodeicos;
	protected String outflag;
	protected String outflagLike;
	protected List<String> outflags;
	protected String inflag;
	protected String inflagLike;
	protected List<String> inflags;
	protected String password;
	protected String passwordLike;
	protected List<String> passwords;
	protected String listnum;
	protected String listnumLike;
	protected List<String> listnums;
	protected String wcompany;
	protected String wcompanyLike;
	protected List<String> wcompanys;
	protected Integer listno;
	protected Integer listnoGreaterThanOrEqual;
	protected Integer listnoLessThanOrEqual;
	protected List<Integer> listnos;
	protected Integer plevel;
	protected Integer plevelGreaterThanOrEqual;
	protected Integer plevelLessThanOrEqual;
	protected List<Integer> plevels;
	protected String usernmu;
	protected String usernmuLike;
	protected List<String> usernmus;
	protected Integer indexIdOld;
	protected Integer indexIdOldGreaterThanOrEqual;
	protected Integer indexIdOldLessThanOrEqual;
	protected List<Integer> indexIdOlds;
	protected Integer pindexId;
	protected Integer pindexIdGreaterThanOrEqual;
	protected Integer pindexIdLessThanOrEqual;
	protected List<Integer> pindexIds;
	protected Integer finishint;
	protected Integer finishintGreaterThanOrEqual;
	protected Integer finishintLessThanOrEqual;
	protected List<Integer> finishints;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected String treeDliststr;
	protected String treeDliststrLike;
	protected List<String> treeDliststrs;
	protected Integer pfilesIndex;
	protected Integer pfilesIndexGreaterThanOrEqual;
	protected Integer pfilesIndexLessThanOrEqual;
	protected List<Integer> pfilesIndexs;
	protected Date bdate;
	protected Date bdateGreaterThanOrEqual;
	protected Date bdateLessThanOrEqual;
	protected List<Date> bdates;
	protected Date edate;
	protected Date edateGreaterThanOrEqual;
	protected Date edateLessThanOrEqual;
	protected List<Date> edates;
	protected Integer wbsindex;
	protected Integer wbsindexGreaterThanOrEqual;
	protected Integer wbsindexLessThanOrEqual;
	protected List<Integer> wbsindexs;
	protected Date bdateS;
	protected Date bdateSGreaterThanOrEqual;
	protected Date bdateSLessThanOrEqual;
	protected List<Date> bdateSs;
	protected Date edateS;
	protected Date edateSGreaterThanOrEqual;
	protected Date edateSLessThanOrEqual;
	protected List<Date> edateSs;
	protected String typeId;
	protected String typeIdLike;
	protected List<String> typeIds;
	protected Integer cell1;
	protected Integer cell1GreaterThanOrEqual;
	protected Integer cell1LessThanOrEqual;
	protected List<Integer> cell1s;
	protected Integer cell2;
	protected Integer cell2GreaterThanOrEqual;
	protected Integer cell2LessThanOrEqual;
	protected List<Integer> cell2s;
	protected Integer cell3;
	protected Integer cell3GreaterThanOrEqual;
	protected Integer cell3LessThanOrEqual;
	protected List<Integer> cell3s;
	protected String strfileLocate;
	protected String strfileLocateLike;
	protected List<String> strfileLocates;
	protected Integer intpfile1;
	protected Integer intpfile1GreaterThanOrEqual;
	protected Integer intpfile1LessThanOrEqual;
	protected List<Integer> intpfile1s;
	protected Integer intpfile2;
	protected Integer intpfile2GreaterThanOrEqual;
	protected Integer intpfile2LessThanOrEqual;
	protected List<Integer> intpfile2s;
	protected Integer intpfile3;
	protected Integer intpfile3GreaterThanOrEqual;
	protected Integer intpfile3LessThanOrEqual;
	protected List<Integer> intpfile3s;
	protected Integer intcellfinish;
	protected Integer intcellfinishGreaterThanOrEqual;
	protected Integer intcellfinishLessThanOrEqual;
	protected List<Integer> intcellfinishs;
	protected String sysId;
	protected String sysIdLike;
	protected List<String> sysIds;
	protected Integer indexIn;
	protected Integer indexInGreaterThanOrEqual;
	protected Integer indexInLessThanOrEqual;
	protected List<Integer> indexIns;
	protected String strButtonStar;
	protected String strButtonStarLike;
	protected List<String> strButtonStars;
	protected Integer intisuse;
	protected Integer intisuseGreaterThanOrEqual;
	protected Integer intisuseLessThanOrEqual;
	protected List<Integer> intisuses;
	protected Integer wbsindexIn;
	protected Integer wbsindexInGreaterThanOrEqual;
	protected Integer wbsindexInLessThanOrEqual;
	protected List<Integer> wbsindexIns;
	

	public TreepInfoQuery() {

	}

	public TreepInfoQuery showidGreaterThanOrEqual(
			Integer showidGreaterThanOrEqual) {
		if (showidGreaterThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery bdate(Date bdate) {
		if (bdate == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdate = bdate;
		return this;
	}

	public TreepInfoQuery bdateGreaterThanOrEqual(Date bdateGreaterThanOrEqual) {
		if (bdateGreaterThanOrEqual == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdateGreaterThanOrEqual = bdateGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery bdateLessThanOrEqual(Date bdateLessThanOrEqual) {
		if (bdateLessThanOrEqual == null) {
			throw new RuntimeException("bdate is null");
		}
		this.bdateLessThanOrEqual = bdateLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery bdates(List<Date> bdates) {
		if (bdates == null) {
			throw new RuntimeException("bdates is empty ");
		}
		this.bdates = bdates;
		return this;
	}

	public TreepInfoQuery bdateS(Date bdateS) {
		if (bdateS == null) {
			throw new RuntimeException("bdateS is null");
		}
		this.bdateS = bdateS;
		return this;
	}

	public TreepInfoQuery bdateSGreaterThanOrEqual(Date bdateSGreaterThanOrEqual) {
		if (bdateSGreaterThanOrEqual == null) {
			throw new RuntimeException("bdateS is null");
		}
		this.bdateSGreaterThanOrEqual = bdateSGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery bdateSLessThanOrEqual(Date bdateSLessThanOrEqual) {
		if (bdateSLessThanOrEqual == null) {
			throw new RuntimeException("bdateS is null");
		}
		this.bdateSLessThanOrEqual = bdateSLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery bdateSs(List<Date> bdateSs) {
		if (bdateSs == null) {
			throw new RuntimeException("bdateSs is empty ");
		}
		this.bdateSs = bdateSs;
		return this;
	}

	public TreepInfoQuery cell1(Integer cell1) {
		if (cell1 == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1 = cell1;
		return this;
	}

	public TreepInfoQuery cell1GreaterThanOrEqual(
			Integer cell1GreaterThanOrEqual) {
		if (cell1GreaterThanOrEqual == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1GreaterThanOrEqual = cell1GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell1LessThanOrEqual(Integer cell1LessThanOrEqual) {
		if (cell1LessThanOrEqual == null) {
			throw new RuntimeException("cell1 is null");
		}
		this.cell1LessThanOrEqual = cell1LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell1s(List<Integer> cell1s) {
		if (cell1s == null) {
			throw new RuntimeException("cell1s is empty ");
		}
		this.cell1s = cell1s;
		return this;
	}

	public TreepInfoQuery cell2(Integer cell2) {
		if (cell2 == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2 = cell2;
		return this;
	}

	public TreepInfoQuery cell2GreaterThanOrEqual(
			Integer cell2GreaterThanOrEqual) {
		if (cell2GreaterThanOrEqual == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2GreaterThanOrEqual = cell2GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell2LessThanOrEqual(Integer cell2LessThanOrEqual) {
		if (cell2LessThanOrEqual == null) {
			throw new RuntimeException("cell2 is null");
		}
		this.cell2LessThanOrEqual = cell2LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell2s(List<Integer> cell2s) {
		if (cell2s == null) {
			throw new RuntimeException("cell2s is empty ");
		}
		this.cell2s = cell2s;
		return this;
	}

	public TreepInfoQuery cell3(Integer cell3) {
		if (cell3 == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3 = cell3;
		return this;
	}

	public TreepInfoQuery cell3GreaterThanOrEqual(
			Integer cell3GreaterThanOrEqual) {
		if (cell3GreaterThanOrEqual == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3GreaterThanOrEqual = cell3GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell3LessThanOrEqual(Integer cell3LessThanOrEqual) {
		if (cell3LessThanOrEqual == null) {
			throw new RuntimeException("cell3 is null");
		}
		this.cell3LessThanOrEqual = cell3LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery cell3s(List<Integer> cell3s) {
		if (cell3s == null) {
			throw new RuntimeException("cell3s is empty ");
		}
		this.cell3s = cell3s;
		return this;
	}

	public TreepInfoQuery cid(String cid) {
		if (cid == null) {
			throw new RuntimeException("cid is null");
		}
		this.cid = cid;
		return this;
	}

	public TreepInfoQuery cidLike(String cidLike) {
		if (cidLike == null) {
			throw new RuntimeException("cid is null");
		}
		this.cidLike = cidLike;
		return this;
	}

	public TreepInfoQuery cids(List<String> cids) {
		if (cids == null) {
			throw new RuntimeException("cids is empty ");
		}
		this.cids = cids;
		return this;
	}

	public TreepInfoQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public TreepInfoQuery dwidGreaterThanOrEqual(Integer dwidGreaterThanOrEqual) {
		if (dwidGreaterThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery dwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		if (dwidLessThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public TreepInfoQuery edate(Date edate) {
		if (edate == null) {
			throw new RuntimeException("edate is null");
		}
		this.edate = edate;
		return this;
	}

	public TreepInfoQuery edateGreaterThanOrEqual(Date edateGreaterThanOrEqual) {
		if (edateGreaterThanOrEqual == null) {
			throw new RuntimeException("edate is null");
		}
		this.edateGreaterThanOrEqual = edateGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery edateLessThanOrEqual(Date edateLessThanOrEqual) {
		if (edateLessThanOrEqual == null) {
			throw new RuntimeException("edate is null");
		}
		this.edateLessThanOrEqual = edateLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery edates(List<Date> edates) {
		if (edates == null) {
			throw new RuntimeException("edates is empty ");
		}
		this.edates = edates;
		return this;
	}

	public TreepInfoQuery edateS(Date edateS) {
		if (edateS == null) {
			throw new RuntimeException("edateS is null");
		}
		this.edateS = edateS;
		return this;
	}

	public TreepInfoQuery edateSGreaterThanOrEqual(Date edateSGreaterThanOrEqual) {
		if (edateSGreaterThanOrEqual == null) {
			throw new RuntimeException("edateS is null");
		}
		this.edateSGreaterThanOrEqual = edateSGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery edateSLessThanOrEqual(Date edateSLessThanOrEqual) {
		if (edateSLessThanOrEqual == null) {
			throw new RuntimeException("edateS is null");
		}
		this.edateSLessThanOrEqual = edateSLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery edateSs(List<Date> edateSs) {
		if (edateSs == null) {
			throw new RuntimeException("edateSs is empty ");
		}
		this.edateSs = edateSs;
		return this;
	}

	public TreepInfoQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public TreepInfoQuery fbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		if (fbidGreaterThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery fbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		if (fbidLessThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public TreepInfoQuery filenum(Integer filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public TreepInfoQuery filenum0(Integer filenum0) {
		if (filenum0 == null) {
			throw new RuntimeException("filenum0 is null");
		}
		this.filenum0 = filenum0;
		return this;
	}

	public TreepInfoQuery filenum0GreaterThanOrEqual(
			Integer filenum0GreaterThanOrEqual) {
		if (filenum0GreaterThanOrEqual == null) {
			throw new RuntimeException("filenum0 is null");
		}
		this.filenum0GreaterThanOrEqual = filenum0GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum0LessThanOrEqual(
			Integer filenum0LessThanOrEqual) {
		if (filenum0LessThanOrEqual == null) {
			throw new RuntimeException("filenum0 is null");
		}
		this.filenum0LessThanOrEqual = filenum0LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum0s(List<Integer> filenum0s) {
		if (filenum0s == null) {
			throw new RuntimeException("filenum0s is empty ");
		}
		this.filenum0s = filenum0s;
		return this;
	}

	public TreepInfoQuery filenum1(Integer filenum1) {
		if (filenum1 == null) {
			throw new RuntimeException("filenum1 is null");
		}
		this.filenum1 = filenum1;
		return this;
	}

	public TreepInfoQuery filenum1GreaterThanOrEqual(
			Integer filenum1GreaterThanOrEqual) {
		if (filenum1GreaterThanOrEqual == null) {
			throw new RuntimeException("filenum1 is null");
		}
		this.filenum1GreaterThanOrEqual = filenum1GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum1LessThanOrEqual(
			Integer filenum1LessThanOrEqual) {
		if (filenum1LessThanOrEqual == null) {
			throw new RuntimeException("filenum1 is null");
		}
		this.filenum1LessThanOrEqual = filenum1LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum1s(List<Integer> filenum1s) {
		if (filenum1s == null) {
			throw new RuntimeException("filenum1s is empty ");
		}
		this.filenum1s = filenum1s;
		return this;
	}

	public TreepInfoQuery filenum2(Integer filenum2) {
		if (filenum2 == null) {
			throw new RuntimeException("filenum2 is null");
		}
		this.filenum2 = filenum2;
		return this;
	}

	public TreepInfoQuery filenum2GreaterThanOrEqual(
			Integer filenum2GreaterThanOrEqual) {
		if (filenum2GreaterThanOrEqual == null) {
			throw new RuntimeException("filenum2 is null");
		}
		this.filenum2GreaterThanOrEqual = filenum2GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum2LessThanOrEqual(
			Integer filenum2LessThanOrEqual) {
		if (filenum2LessThanOrEqual == null) {
			throw new RuntimeException("filenum2 is null");
		}
		this.filenum2LessThanOrEqual = filenum2LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenum2s(List<Integer> filenum2s) {
		if (filenum2s == null) {
			throw new RuntimeException("filenum2s is empty ");
		}
		this.filenum2s = filenum2s;
		return this;
	}

	public TreepInfoQuery filenumGreaterThanOrEqual(
			Integer filenumGreaterThanOrEqual) {
		if (filenumGreaterThanOrEqual == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumGreaterThanOrEqual = filenumGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenumLessThanOrEqual(Integer filenumLessThanOrEqual) {
		if (filenumLessThanOrEqual == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLessThanOrEqual = filenumLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery filenums(List<Integer> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public TreepInfoQuery finishint(Integer finishint) {
		if (finishint == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishint = finishint;
		return this;
	}

	public TreepInfoQuery finishintGreaterThanOrEqual(
			Integer finishintGreaterThanOrEqual) {
		if (finishintGreaterThanOrEqual == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishintGreaterThanOrEqual = finishintGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery finishintLessThanOrEqual(
			Integer finishintLessThanOrEqual) {
		if (finishintLessThanOrEqual == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishintLessThanOrEqual = finishintLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery finishints(List<Integer> finishints) {
		if (finishints == null) {
			throw new RuntimeException("finishints is empty ");
		}
		this.finishints = finishints;
		return this;
	}

	public TreepInfoQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public TreepInfoQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public TreepInfoQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public TreepInfoQuery fromid(Integer fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public TreepInfoQuery fromidGreaterThanOrEqual(
			Integer fromidGreaterThanOrEqual) {
		if (fromidGreaterThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery fromidLessThanOrEqual(Integer fromidLessThanOrEqual) {
		if (fromidLessThanOrEqual == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery fromids(List<Integer> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
		return this;
	}

	public TreepInfoQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public TreepInfoQuery fxidGreaterThanOrEqual(Integer fxidGreaterThanOrEqual) {
		if (fxidGreaterThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery fxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		if (fxidLessThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery fxids(List<Integer> fxids) {
		if (fxids == null) {
			throw new RuntimeException("fxids is empty ");
		}
		this.fxids = fxids;
		return this;
	}

	public Date getBdate() {
		return bdate;
	}

	public Date getBdateGreaterThanOrEqual() {
		return bdateGreaterThanOrEqual;
	}

	public Date getBdateLessThanOrEqual() {
		return bdateLessThanOrEqual;
	}

	public List<Date> getBdates() {
		return bdates;
	}

	public Date getBdateS() {
		return bdateS;
	}

	public Date getBdateSGreaterThanOrEqual() {
		return bdateSGreaterThanOrEqual;
	}

	public Date getBdateSLessThanOrEqual() {
		return bdateSLessThanOrEqual;
	}

	public List<Date> getBdateSs() {
		return bdateSs;
	}

	public Integer getCell1() {
		return cell1;
	}

	public Integer getCell1GreaterThanOrEqual() {
		return cell1GreaterThanOrEqual;
	}

	public Integer getCell1LessThanOrEqual() {
		return cell1LessThanOrEqual;
	}

	public List<Integer> getCell1s() {
		return cell1s;
	}

	public Integer getCell2() {
		return cell2;
	}

	public Integer getCell2GreaterThanOrEqual() {
		return cell2GreaterThanOrEqual;
	}

	public Integer getCell2LessThanOrEqual() {
		return cell2LessThanOrEqual;
	}

	public List<Integer> getCell2s() {
		return cell2s;
	}

	public Integer getCell3() {
		return cell3;
	}

	public Integer getCell3GreaterThanOrEqual() {
		return cell3GreaterThanOrEqual;
	}

	public Integer getCell3LessThanOrEqual() {
		return cell3LessThanOrEqual;
	}

	public List<Integer> getCell3s() {
		return cell3s;
	}

	public String getCid() {
		return cid;
	}

	public String getCidLike() {
		if (cidLike != null && cidLike.trim().length() > 0) {
			if (!cidLike.startsWith("%")) {
				cidLike = "%" + cidLike;
			}
			if (!cidLike.endsWith("%")) {
				cidLike = cidLike + "%";
			}
		}
		return cidLike;
	}

	public List<String> getCids() {
		return cids;
	}

	public Integer getDwid() {
		return dwid;
	}

	public Integer getDwidGreaterThanOrEqual() {
		return dwidGreaterThanOrEqual;
	}

	public Integer getDwidLessThanOrEqual() {
		return dwidLessThanOrEqual;
	}

	public List<Integer> getDwids() {
		return dwids;
	}

	public Date getEdate() {
		return edate;
	}

	public Date getEdateGreaterThanOrEqual() {
		return edateGreaterThanOrEqual;
	}

	public Date getEdateLessThanOrEqual() {
		return edateLessThanOrEqual;
	}

	public List<Date> getEdates() {
		return edates;
	}

	public Date getEdateS() {
		return edateS;
	}

	public Date getEdateSGreaterThanOrEqual() {
		return edateSGreaterThanOrEqual;
	}

	public Date getEdateSLessThanOrEqual() {
		return edateSLessThanOrEqual;
	}

	public List<Date> getEdateSs() {
		return edateSs;
	}

	public Integer getFbid() {
		return fbid;
	}

	public Integer getFbidGreaterThanOrEqual() {
		return fbidGreaterThanOrEqual;
	}

	public Integer getFbidLessThanOrEqual() {
		return fbidLessThanOrEqual;
	}

	public List<Integer> getFbids() {
		return fbids;
	}

	public Integer getFilenum() {
		return filenum;
	}

	public Integer getFilenum0() {
		return filenum0;
	}

	public Integer getFilenum0GreaterThanOrEqual() {
		return filenum0GreaterThanOrEqual;
	}

	public Integer getFilenum0LessThanOrEqual() {
		return filenum0LessThanOrEqual;
	}

	public List<Integer> getFilenum0s() {
		return filenum0s;
	}

	public Integer getFilenum1() {
		return filenum1;
	}

	public Integer getFilenum1GreaterThanOrEqual() {
		return filenum1GreaterThanOrEqual;
	}

	public Integer getFilenum1LessThanOrEqual() {
		return filenum1LessThanOrEqual;
	}

	public List<Integer> getFilenum1s() {
		return filenum1s;
	}

	public Integer getFilenum2() {
		return filenum2;
	}

	public Integer getFilenum2GreaterThanOrEqual() {
		return filenum2GreaterThanOrEqual;
	}

	public Integer getFilenum2LessThanOrEqual() {
		return filenum2LessThanOrEqual;
	}

	public List<Integer> getFilenum2s() {
		return filenum2s;
	}

	public Integer getFilenumGreaterThanOrEqual() {
		return filenumGreaterThanOrEqual;
	}

	public Integer getFilenumLessThanOrEqual() {
		return filenumLessThanOrEqual;
	}

	public List<Integer> getFilenums() {
		return filenums;
	}

	public Integer getFinishint() {
		return finishint;
	}

	public Integer getFinishintGreaterThanOrEqual() {
		return finishintGreaterThanOrEqual;
	}

	public Integer getFinishintLessThanOrEqual() {
		return finishintLessThanOrEqual;
	}

	public List<Integer> getFinishints() {
		return finishints;
	}

	public String getFlid() {
		return flid;
	}

	public String getFlidLike() {
		if (flidLike != null && flidLike.trim().length() > 0) {
			if (!flidLike.startsWith("%")) {
				flidLike = "%" + flidLike;
			}
			if (!flidLike.endsWith("%")) {
				flidLike = flidLike + "%";
			}
		}
		return flidLike;
	}

	public List<String> getFlids() {
		return flids;
	}

	public Integer getFromid() {
		return fromid;
	}

	public Integer getFromidGreaterThanOrEqual() {
		return fromidGreaterThanOrEqual;
	}

	public Integer getFromidLessThanOrEqual() {
		return fromidLessThanOrEqual;
	}

	public List<Integer> getFromids() {
		return fromids;
	}

	public Integer getFxid() {
		return fxid;
	}

	public Integer getFxidGreaterThanOrEqual() {
		return fxidGreaterThanOrEqual;
	}

	public Integer getFxidLessThanOrEqual() {
		return fxidLessThanOrEqual;
	}

	public List<Integer> getFxids() {
		return fxids;
	}

	public String getIdLike() {
		if (idLike != null && idLike.trim().length() > 0) {
			if (!idLike.startsWith("%")) {
				idLike = "%" + idLike;
			}
			if (!idLike.endsWith("%")) {
				idLike = idLike + "%";
			}
		}
		return idLike;
	}

	public List<String> getIds() {
		return ids;
	}

	public Integer getIndexIdOld() {
		return indexIdOld;
	}

	public Integer getIndexIdOldGreaterThanOrEqual() {
		return indexIdOldGreaterThanOrEqual;
	}

	public Integer getIndexIdOldLessThanOrEqual() {
		return indexIdOldLessThanOrEqual;
	}

	public List<Integer> getIndexIdOlds() {
		return indexIdOlds;
	}

	public Integer getIndexIn() {
		return indexIn;
	}

	public Integer getIndexInGreaterThanOrEqual() {
		return indexInGreaterThanOrEqual;
	}

	public Integer getIndexInLessThanOrEqual() {
		return indexInLessThanOrEqual;
	}

	public List<Integer> getIndexIns() {
		return indexIns;
	}

	public String getIndexNameLike() {
		if (indexNameLike != null && indexNameLike.trim().length() > 0) {
			if (!indexNameLike.startsWith("%")) {
				indexNameLike = "%" + indexNameLike;
			}
			if (!indexNameLike.endsWith("%")) {
				indexNameLike = indexNameLike + "%";
			}
		}
		return indexNameLike;
	}

	public String getInflag() {
		return inflag;
	}

	public String getInflagLike() {
		if (inflagLike != null && inflagLike.trim().length() > 0) {
			if (!inflagLike.startsWith("%")) {
				inflagLike = "%" + inflagLike;
			}
			if (!inflagLike.endsWith("%")) {
				inflagLike = inflagLike + "%";
			}
		}
		return inflagLike;
	}

	public List<String> getInflags() {
		return inflags;
	}

	public Integer getIntcellfinish() {
		return intcellfinish;
	}

	public Integer getIntcellfinishGreaterThanOrEqual() {
		return intcellfinishGreaterThanOrEqual;
	}

	public Integer getIntcellfinishLessThanOrEqual() {
		return intcellfinishLessThanOrEqual;
	}

	public List<Integer> getIntcellfinishs() {
		return intcellfinishs;
	}

	public Integer getIntisuse() {
		return intisuse;
	}

	public Integer getIntisuseGreaterThanOrEqual() {
		return intisuseGreaterThanOrEqual;
	}

	public Integer getIntisuseLessThanOrEqual() {
		return intisuseLessThanOrEqual;
	}

	public List<Integer> getIntisuses() {
		return intisuses;
	}

	public Integer getIntpfile1() {
		return intpfile1;
	}

	public Integer getIntpfile1GreaterThanOrEqual() {
		return intpfile1GreaterThanOrEqual;
	}

	public Integer getIntpfile1LessThanOrEqual() {
		return intpfile1LessThanOrEqual;
	}

	public List<Integer> getIntpfile1s() {
		return intpfile1s;
	}

	public Integer getIntpfile2() {
		return intpfile2;
	}

	public Integer getIntpfile2GreaterThanOrEqual() {
		return intpfile2GreaterThanOrEqual;
	}

	public Integer getIntpfile2LessThanOrEqual() {
		return intpfile2LessThanOrEqual;
	}

	public List<Integer> getIntpfile2s() {
		return intpfile2s;
	}

	public Integer getIntpfile3() {
		return intpfile3;
	}

	public Integer getIntpfile3GreaterThanOrEqual() {
		return intpfile3GreaterThanOrEqual;
	}

	public Integer getIntpfile3LessThanOrEqual() {
		return intpfile3LessThanOrEqual;
	}

	public List<Integer> getIntpfile3s() {
		return intpfile3s;
	}

	public String getJid() {
		return jid;
	}

	public String getJidLike() {
		if (jidLike != null && jidLike.trim().length() > 0) {
			if (!jidLike.startsWith("%")) {
				jidLike = "%" + jidLike;
			}
			if (!jidLike.endsWith("%")) {
				jidLike = jidLike + "%";
			}
		}
		return jidLike;
	}

	public List<String> getJids() {
		return jids;
	}

	public Integer getListno() {
		return listno;
	}

	public Integer getListnoGreaterThanOrEqual() {
		return listnoGreaterThanOrEqual;
	}

	public Integer getListnoLessThanOrEqual() {
		return listnoLessThanOrEqual;
	}

	public List<Integer> getListnos() {
		return listnos;
	}

	public String getListnum() {
		return listnum;
	}

	public String getListnumLike() {
		if (listnumLike != null && listnumLike.trim().length() > 0) {
			if (!listnumLike.startsWith("%")) {
				listnumLike = "%" + listnumLike;
			}
			if (!listnumLike.endsWith("%")) {
				listnumLike = listnumLike + "%";
			}
		}
		return listnumLike;
	}

	public List<String> getListnums() {
		return listnums;
	}

	public Integer getNlevel() {
		return nlevel;
	}

	public Integer getNlevelGreaterThanOrEqual() {
		return nlevelGreaterThanOrEqual;
	}

	public Integer getNlevelLessThanOrEqual() {
		return nlevelLessThanOrEqual;
	}

	public List<Integer> getNlevels() {
		return nlevels;
	}

	public Integer getNodeico() {
		return nodeico;
	}

	public Integer getNodeicoGreaterThanOrEqual() {
		return nodeicoGreaterThanOrEqual;
	}

	public Integer getNodeicoLessThanOrEqual() {
		return nodeicoLessThanOrEqual;
	}

	public List<Integer> getNodeicos() {
		return nodeicos;
	}

	public String getNodetype() {
		return nodetype;
	}

	public String getNodetypeLike() {
		if (nodetypeLike != null && nodetypeLike.trim().length() > 0) {
			if (!nodetypeLike.startsWith("%")) {
				nodetypeLike = "%" + nodetypeLike;
			}
			if (!nodetypeLike.endsWith("%")) {
				nodetypeLike = nodetypeLike + "%";
			}
		}
		return nodetypeLike;
	}

	public List<String> getNodetypes() {
		return nodetypes;
	}

	public String getNumLike() {
		if (numLike != null && numLike.trim().length() > 0) {
			if (!numLike.startsWith("%")) {
				numLike = "%" + numLike;
			}
			if (!numLike.endsWith("%")) {
				numLike = numLike + "%";
			}
		}
		return numLike;
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

	public String getOutflag() {
		return outflag;
	}

	public String getOutflagLike() {
		if (outflagLike != null && outflagLike.trim().length() > 0) {
			if (!outflagLike.startsWith("%")) {
				outflagLike = "%" + outflagLike;
			}
			if (!outflagLike.endsWith("%")) {
				outflagLike = outflagLike + "%";
			}
		}
		return outflagLike;
	}

	public List<String> getOutflags() {
		return outflags;
	}

	public Integer getPartId() {
		return partId;
	}

	public Integer getPartIdGreaterThanOrEqual() {
		return partIdGreaterThanOrEqual;
	}

	public Integer getPartIdLessThanOrEqual() {
		return partIdLessThanOrEqual;
	}

	public List<Integer> getPartIds() {
		return partIds;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordLike() {
		if (passwordLike != null && passwordLike.trim().length() > 0) {
			if (!passwordLike.startsWith("%")) {
				passwordLike = "%" + passwordLike;
			}
			if (!passwordLike.endsWith("%")) {
				passwordLike = passwordLike + "%";
			}
		}
		return passwordLike;
	}

	public List<String> getPasswords() {
		return passwords;
	}

	public Integer getPfilesIndex() {
		return pfilesIndex;
	}

	public Integer getPfilesIndexGreaterThanOrEqual() {
		return pfilesIndexGreaterThanOrEqual;
	}

	public Integer getPfilesIndexLessThanOrEqual() {
		return pfilesIndexLessThanOrEqual;
	}

	public List<Integer> getPfilesIndexs() {
		return pfilesIndexs;
	}

	public Integer getPindexId() {
		return pindexId;
	}

	public Integer getPindexIdGreaterThanOrEqual() {
		return pindexIdGreaterThanOrEqual;
	}

	public Integer getPindexIdLessThanOrEqual() {
		return pindexIdLessThanOrEqual;
	}

	public List<Integer> getPindexIds() {
		return pindexIds;
	}

	public Integer getPlevel() {
		return plevel;
	}

	public Integer getPlevelGreaterThanOrEqual() {
		return plevelGreaterThanOrEqual;
	}

	public Integer getPlevelLessThanOrEqual() {
		return plevelLessThanOrEqual;
	}

	public List<Integer> getPlevels() {
		return plevels;
	}

	public String getProjtype() {
		return projtype;
	}

	public String getProjtypeLike() {
		if (projtypeLike != null && projtypeLike.trim().length() > 0) {
			if (!projtypeLike.startsWith("%")) {
				projtypeLike = "%" + projtypeLike;
			}
			if (!projtypeLike.endsWith("%")) {
				projtypeLike = projtypeLike + "%";
			}
		}
		return projtypeLike;
	}

	public List<String> getProjtypes() {
		return projtypes;
	}

	public Integer getShowid() {
		return showid;
	}

	public Integer getShowidGreaterThanOrEqual() {
		return showidGreaterThanOrEqual;
	}

	public Integer getShowidLessThanOrEqual() {
		return showidLessThanOrEqual;
	}

	public List<Integer> getShowids() {
		return showids;
	}

	public String getSindexNameLike() {
		if (sindexNameLike != null && sindexNameLike.trim().length() > 0) {
			if (!sindexNameLike.startsWith("%")) {
				sindexNameLike = "%" + sindexNameLike;
			}
			if (!sindexNameLike.endsWith("%")) {
				sindexNameLike = sindexNameLike + "%";
			}
		}
		return sindexNameLike;
	}

	public String getStrButtonStar() {
		return strButtonStar;
	}

	public String getStrButtonStarLike() {
		if (strButtonStarLike != null && strButtonStarLike.trim().length() > 0) {
			if (!strButtonStarLike.startsWith("%")) {
				strButtonStarLike = "%" + strButtonStarLike;
			}
			if (!strButtonStarLike.endsWith("%")) {
				strButtonStarLike = strButtonStarLike + "%";
			}
		}
		return strButtonStarLike;
	}

	public List<String> getStrButtonStars() {
		return strButtonStars;
	}

	public String getStrfileLocate() {
		return strfileLocate;
	}

	public String getStrfileLocateLike() {
		if (strfileLocateLike != null && strfileLocateLike.trim().length() > 0) {
			if (!strfileLocateLike.startsWith("%")) {
				strfileLocateLike = "%" + strfileLocateLike;
			}
			if (!strfileLocateLike.endsWith("%")) {
				strfileLocateLike = strfileLocateLike + "%";
			}
		}
		return strfileLocateLike;
	}

	public List<String> getStrfileLocates() {
		return strfileLocates;
	}

	public String getSysId() {
		return sysId;
	}

	public String getSysIdLike() {
		if (sysIdLike != null && sysIdLike.trim().length() > 0) {
			if (!sysIdLike.startsWith("%")) {
				sysIdLike = "%" + sysIdLike;
			}
			if (!sysIdLike.endsWith("%")) {
				sysIdLike = sysIdLike + "%";
			}
		}
		return sysIdLike;
	}

	public List<String> getSysIds() {
		return sysIds;
	}

	public Integer getTopId() {
		return topId;
	}

	public Integer getTopIdGreaterThanOrEqual() {
		return topIdGreaterThanOrEqual;
	}

	public Integer getTopIdLessThanOrEqual() {
		return topIdLessThanOrEqual;
	}

	public List<Integer> getTopIds() {
		return topIds;
	}

	public String getTopnode() {
		return topnode;
	}

	public String getTopnodeLike() {
		if (topnodeLike != null && topnodeLike.trim().length() > 0) {
			if (!topnodeLike.startsWith("%")) {
				topnodeLike = "%" + topnodeLike;
			}
			if (!topnodeLike.endsWith("%")) {
				topnodeLike = topnodeLike + "%";
			}
		}
		return topnodeLike;
	}

	public List<String> getTopnodes() {
		return topnodes;
	}

	public String getTreeDliststr() {
		return treeDliststr;
	}

	public String getTreeDliststrLike() {
		if (treeDliststrLike != null && treeDliststrLike.trim().length() > 0) {
			if (!treeDliststrLike.startsWith("%")) {
				treeDliststrLike = "%" + treeDliststrLike;
			}
			if (!treeDliststrLike.endsWith("%")) {
				treeDliststrLike = treeDliststrLike + "%";
			}
		}
		return treeDliststrLike;
	}

	public List<String> getTreeDliststrs() {
		return treeDliststrs;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getTypeIdLike() {
		if (typeIdLike != null && typeIdLike.trim().length() > 0) {
			if (!typeIdLike.startsWith("%")) {
				typeIdLike = "%" + typeIdLike;
			}
			if (!typeIdLike.endsWith("%")) {
				typeIdLike = typeIdLike + "%";
			}
		}
		return typeIdLike;
	}

	public List<String> getTypeIds() {
		return typeIds;
	}

	public String getTypeTablename() {
		return typeTablename;
	}

	public String getTypeTablenameLike() {
		if (typeTablenameLike != null && typeTablenameLike.trim().length() > 0) {
			if (!typeTablenameLike.startsWith("%")) {
				typeTablenameLike = "%" + typeTablenameLike;
			}
			if (!typeTablenameLike.endsWith("%")) {
				typeTablenameLike = typeTablenameLike + "%";
			}
		}
		return typeTablenameLike;
	}

	public List<String> getTypeTablenames() {
		return typeTablenames;
	}

	public String getUsernmu() {
		return usernmu;
	}

	public String getUsernmuLike() {
		if (usernmuLike != null && usernmuLike.trim().length() > 0) {
			if (!usernmuLike.startsWith("%")) {
				usernmuLike = "%" + usernmuLike;
			}
			if (!usernmuLike.endsWith("%")) {
				usernmuLike = usernmuLike + "%";
			}
		}
		return usernmuLike;
	}

	public List<String> getUsernmus() {
		return usernmus;
	}

	public Integer getWbsindex() {
		return wbsindex;
	}

	public Integer getWbsindexGreaterThanOrEqual() {
		return wbsindexGreaterThanOrEqual;
	}

	public Integer getWbsindexIn() {
		return wbsindexIn;
	}

	public Integer getWbsindexInGreaterThanOrEqual() {
		return wbsindexInGreaterThanOrEqual;
	}

	public Integer getWbsindexInLessThanOrEqual() {
		return wbsindexInLessThanOrEqual;
	}

	public List<Integer> getWbsindexIns() {
		return wbsindexIns;
	}

	public Integer getWbsindexLessThanOrEqual() {
		return wbsindexLessThanOrEqual;
	}

	public List<Integer> getWbsindexs() {
		return wbsindexs;
	}

	public String getWcompany() {
		return wcompany;
	}

	public String getWcompanyLike() {
		if (wcompanyLike != null && wcompanyLike.trim().length() > 0) {
			if (!wcompanyLike.startsWith("%")) {
				wcompanyLike = "%" + wcompanyLike;
			}
			if (!wcompanyLike.endsWith("%")) {
				wcompanyLike = wcompanyLike + "%";
			}
		}
		return wcompanyLike;
	}

	public List<String> getWcompanys() {
		return wcompanys;
	}

	public TreepInfoQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public TreepInfoQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public TreepInfoQuery indexIdOld(Integer indexIdOld) {
		if (indexIdOld == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOld = indexIdOld;
		return this;
	}

	public TreepInfoQuery indexIdOldGreaterThanOrEqual(
			Integer indexIdOldGreaterThanOrEqual) {
		if (indexIdOldGreaterThanOrEqual == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOldGreaterThanOrEqual = indexIdOldGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery indexIdOldLessThanOrEqual(
			Integer indexIdOldLessThanOrEqual) {
		if (indexIdOldLessThanOrEqual == null) {
			throw new RuntimeException("indexIdOld is null");
		}
		this.indexIdOldLessThanOrEqual = indexIdOldLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery indexIdOlds(List<Integer> indexIdOlds) {
		if (indexIdOlds == null) {
			throw new RuntimeException("indexIdOlds is empty ");
		}
		this.indexIdOlds = indexIdOlds;
		return this;
	}

	public TreepInfoQuery indexIn(Integer indexIn) {
		if (indexIn == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexIn = indexIn;
		return this;
	}

	public TreepInfoQuery indexInGreaterThanOrEqual(
			Integer indexInGreaterThanOrEqual) {
		if (indexInGreaterThanOrEqual == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexInGreaterThanOrEqual = indexInGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery indexInLessThanOrEqual(Integer indexInLessThanOrEqual) {
		if (indexInLessThanOrEqual == null) {
			throw new RuntimeException("indexIn is null");
		}
		this.indexInLessThanOrEqual = indexInLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery indexIns(List<Integer> indexIns) {
		if (indexIns == null) {
			throw new RuntimeException("indexIns is empty ");
		}
		this.indexIns = indexIns;
		return this;
	}

	public TreepInfoQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	public TreepInfoQuery inflag(String inflag) {
		if (inflag == null) {
			throw new RuntimeException("inflag is null");
		}
		this.inflag = inflag;
		return this;
	}

	public TreepInfoQuery inflagLike(String inflagLike) {
		if (inflagLike == null) {
			throw new RuntimeException("inflag is null");
		}
		this.inflagLike = inflagLike;
		return this;
	}

	public TreepInfoQuery inflags(List<String> inflags) {
		if (inflags == null) {
			throw new RuntimeException("inflags is empty ");
		}
		this.inflags = inflags;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("indexId", "index_id");
		addColumn("id", "id");
		addColumn("num", "num");
		addColumn("topId", "top_id");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("nodetype", "nodetype");
		addColumn("fromid", "fromid");
		addColumn("partId", "part_id");
		addColumn("showid", "showid");
		addColumn("sindexName", "sindex_name");
		addColumn("filenum", "filenum");
		addColumn("filenum0", "filenum0");
		addColumn("filenum1", "filenum1");
		addColumn("filenum2", "filenum2");
		addColumn("projtype", "projtype");
		addColumn("cid", "cid");
		addColumn("dwid", "dwid");
		addColumn("fbid", "fbid");
		addColumn("fxid", "fxid");
		addColumn("jid", "jid");
		addColumn("flid", "flid");
		addColumn("topnode", "topnode");
		addColumn("nodeico", "nodeico");
		addColumn("outflag", "outflag");
		addColumn("inflag", "inflag");
		addColumn("password", "password");
		addColumn("listnum", "listnum");
		addColumn("wcompany", "wcompany");
		addColumn("listno", "listno");
		addColumn("plevel", "plevel");
		addColumn("usernmu", "usernmu");
		addColumn("indexIdOld", "index_id_old");
		addColumn("pindexId", "pindex_id");
		addColumn("finishint", "finishint");
		addColumn("typeTablename", "type_tablename");
		addColumn("treeDliststr", "tree_dliststr");
		addColumn("pfilesIndex", "pfiles_index");
		addColumn("bdate", "bdate");
		addColumn("edate", "edate");
		addColumn("wbsindex", "wbsindex");
		addColumn("bdateS", "bdate_s");
		addColumn("edateS", "edate_s");
		addColumn("typeId", "type_id");
		addColumn("cell1", "cell1");
		addColumn("cell2", "cell2");
		addColumn("cell3", "cell3");
		addColumn("strfileLocate", "strfileLocate");
		addColumn("intpfile1", "intpfile1");
		addColumn("intpfile2", "intpfile2");
		addColumn("intpfile3", "intpfile3");
		addColumn("intcellfinish", "intcellfinish");
		addColumn("sysId", "sys_id");
		addColumn("indexIn", "index_in");
		addColumn("strButtonStar", "strButtonStar");
		addColumn("intisuse", "intisuse");
		addColumn("wbsindexIn", "wbsindex_in");
	}

	public TreepInfoQuery intcellfinish(Integer intcellfinish) {
		if (intcellfinish == null) {
			throw new RuntimeException("intcellfinish is null");
		}
		this.intcellfinish = intcellfinish;
		return this;
	}

	public TreepInfoQuery intcellfinishGreaterThanOrEqual(
			Integer intcellfinishGreaterThanOrEqual) {
		if (intcellfinishGreaterThanOrEqual == null) {
			throw new RuntimeException("intcellfinish is null");
		}
		this.intcellfinishGreaterThanOrEqual = intcellfinishGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery intcellfinishLessThanOrEqual(
			Integer intcellfinishLessThanOrEqual) {
		if (intcellfinishLessThanOrEqual == null) {
			throw new RuntimeException("intcellfinish is null");
		}
		this.intcellfinishLessThanOrEqual = intcellfinishLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery intcellfinishs(List<Integer> intcellfinishs) {
		if (intcellfinishs == null) {
			throw new RuntimeException("intcellfinishs is empty ");
		}
		this.intcellfinishs = intcellfinishs;
		return this;
	}

	public TreepInfoQuery intisuse(Integer intisuse) {
		if (intisuse == null) {
			throw new RuntimeException("intisuse is null");
		}
		this.intisuse = intisuse;
		return this;
	}

	public TreepInfoQuery intisuseGreaterThanOrEqual(
			Integer intisuseGreaterThanOrEqual) {
		if (intisuseGreaterThanOrEqual == null) {
			throw new RuntimeException("intisuse is null");
		}
		this.intisuseGreaterThanOrEqual = intisuseGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery intisuseLessThanOrEqual(
			Integer intisuseLessThanOrEqual) {
		if (intisuseLessThanOrEqual == null) {
			throw new RuntimeException("intisuse is null");
		}
		this.intisuseLessThanOrEqual = intisuseLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery intisuses(List<Integer> intisuses) {
		if (intisuses == null) {
			throw new RuntimeException("intisuses is empty ");
		}
		this.intisuses = intisuses;
		return this;
	}

	public TreepInfoQuery intpfile1(Integer intpfile1) {
		if (intpfile1 == null) {
			throw new RuntimeException("intpfile1 is null");
		}
		this.intpfile1 = intpfile1;
		return this;
	}

	public TreepInfoQuery intpfile1GreaterThanOrEqual(
			Integer intpfile1GreaterThanOrEqual) {
		if (intpfile1GreaterThanOrEqual == null) {
			throw new RuntimeException("intpfile1 is null");
		}
		this.intpfile1GreaterThanOrEqual = intpfile1GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile1LessThanOrEqual(
			Integer intpfile1LessThanOrEqual) {
		if (intpfile1LessThanOrEqual == null) {
			throw new RuntimeException("intpfile1 is null");
		}
		this.intpfile1LessThanOrEqual = intpfile1LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile1s(List<Integer> intpfile1s) {
		if (intpfile1s == null) {
			throw new RuntimeException("intpfile1s is empty ");
		}
		this.intpfile1s = intpfile1s;
		return this;
	}

	public TreepInfoQuery intpfile2(Integer intpfile2) {
		if (intpfile2 == null) {
			throw new RuntimeException("intpfile2 is null");
		}
		this.intpfile2 = intpfile2;
		return this;
	}

	public TreepInfoQuery intpfile2GreaterThanOrEqual(
			Integer intpfile2GreaterThanOrEqual) {
		if (intpfile2GreaterThanOrEqual == null) {
			throw new RuntimeException("intpfile2 is null");
		}
		this.intpfile2GreaterThanOrEqual = intpfile2GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile2LessThanOrEqual(
			Integer intpfile2LessThanOrEqual) {
		if (intpfile2LessThanOrEqual == null) {
			throw new RuntimeException("intpfile2 is null");
		}
		this.intpfile2LessThanOrEqual = intpfile2LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile2s(List<Integer> intpfile2s) {
		if (intpfile2s == null) {
			throw new RuntimeException("intpfile2s is empty ");
		}
		this.intpfile2s = intpfile2s;
		return this;
	}

	public TreepInfoQuery intpfile3(Integer intpfile3) {
		if (intpfile3 == null) {
			throw new RuntimeException("intpfile3 is null");
		}
		this.intpfile3 = intpfile3;
		return this;
	}

	public TreepInfoQuery intpfile3GreaterThanOrEqual(
			Integer intpfile3GreaterThanOrEqual) {
		if (intpfile3GreaterThanOrEqual == null) {
			throw new RuntimeException("intpfile3 is null");
		}
		this.intpfile3GreaterThanOrEqual = intpfile3GreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile3LessThanOrEqual(
			Integer intpfile3LessThanOrEqual) {
		if (intpfile3LessThanOrEqual == null) {
			throw new RuntimeException("intpfile3 is null");
		}
		this.intpfile3LessThanOrEqual = intpfile3LessThanOrEqual;
		return this;
	}

	public TreepInfoQuery intpfile3s(List<Integer> intpfile3s) {
		if (intpfile3s == null) {
			throw new RuntimeException("intpfile3s is empty ");
		}
		this.intpfile3s = intpfile3s;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreepInfoQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public TreepInfoQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public TreepInfoQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public TreepInfoQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public TreepInfoQuery listnoGreaterThanOrEqual(
			Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public TreepInfoQuery listnum(String listnum) {
		if (listnum == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnum = listnum;
		return this;
	}

	public TreepInfoQuery listnumLike(String listnumLike) {
		if (listnumLike == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnumLike = listnumLike;
		return this;
	}

	public TreepInfoQuery listnums(List<String> listnums) {
		if (listnums == null) {
			throw new RuntimeException("listnums is empty ");
		}
		this.listnums = listnums;
		return this;
	}

	public TreepInfoQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public TreepInfoQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery nlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public TreepInfoQuery nodeico(Integer nodeico) {
		if (nodeico == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeico = nodeico;
		return this;
	}

	public TreepInfoQuery nodeicoGreaterThanOrEqual(
			Integer nodeicoGreaterThanOrEqual) {
		if (nodeicoGreaterThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery nodeicoLessThanOrEqual(Integer nodeicoLessThanOrEqual) {
		if (nodeicoLessThanOrEqual == null) {
			throw new RuntimeException("nodeico is null");
		}
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery nodeicos(List<Integer> nodeicos) {
		if (nodeicos == null) {
			throw new RuntimeException("nodeicos is empty ");
		}
		this.nodeicos = nodeicos;
		return this;
	}

	public TreepInfoQuery nodetype(String nodetype) {
		if (nodetype == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetype = nodetype;
		return this;
	}

	public TreepInfoQuery nodetypeLike(String nodetypeLike) {
		if (nodetypeLike == null) {
			throw new RuntimeException("nodetype is null");
		}
		this.nodetypeLike = nodetypeLike;
		return this;
	}

	public TreepInfoQuery nodetypes(List<String> nodetypes) {
		if (nodetypes == null) {
			throw new RuntimeException("nodetypes is empty ");
		}
		this.nodetypes = nodetypes;
		return this;
	}

	public TreepInfoQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public TreepInfoQuery outflag(String outflag) {
		if (outflag == null) {
			throw new RuntimeException("outflag is null");
		}
		this.outflag = outflag;
		return this;
	}

	public TreepInfoQuery outflagLike(String outflagLike) {
		if (outflagLike == null) {
			throw new RuntimeException("outflag is null");
		}
		this.outflagLike = outflagLike;
		return this;
	}

	public TreepInfoQuery outflags(List<String> outflags) {
		if (outflags == null) {
			throw new RuntimeException("outflags is empty ");
		}
		this.outflags = outflags;
		return this;
	}

	public TreepInfoQuery partId(Integer partId) {
		if (partId == null) {
			throw new RuntimeException("partId is null");
		}
		this.partId = partId;
		return this;
	}

	public TreepInfoQuery partIdGreaterThanOrEqual(
			Integer partIdGreaterThanOrEqual) {
		if (partIdGreaterThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery partIdLessThanOrEqual(Integer partIdLessThanOrEqual) {
		if (partIdLessThanOrEqual == null) {
			throw new RuntimeException("partId is null");
		}
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery partIds(List<Integer> partIds) {
		if (partIds == null) {
			throw new RuntimeException("partIds is empty ");
		}
		this.partIds = partIds;
		return this;
	}

	public TreepInfoQuery password(String password) {
		if (password == null) {
			throw new RuntimeException("password is null");
		}
		this.password = password;
		return this;
	}

	public TreepInfoQuery passwordLike(String passwordLike) {
		if (passwordLike == null) {
			throw new RuntimeException("password is null");
		}
		this.passwordLike = passwordLike;
		return this;
	}

	public TreepInfoQuery passwords(List<String> passwords) {
		if (passwords == null) {
			throw new RuntimeException("passwords is empty ");
		}
		this.passwords = passwords;
		return this;
	}

	public TreepInfoQuery pfilesIndex(Integer pfilesIndex) {
		if (pfilesIndex == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndex = pfilesIndex;
		return this;
	}

	public TreepInfoQuery pfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		if (pfilesIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery pfilesIndexLessThanOrEqual(
			Integer pfilesIndexLessThanOrEqual) {
		if (pfilesIndexLessThanOrEqual == null) {
			throw new RuntimeException("pfilesIndex is null");
		}
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery pfilesIndexs(List<Integer> pfilesIndexs) {
		if (pfilesIndexs == null) {
			throw new RuntimeException("pfilesIndexs is empty ");
		}
		this.pfilesIndexs = pfilesIndexs;
		return this;
	}

	public TreepInfoQuery pindexId(Integer pindexId) {
		if (pindexId == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexId = pindexId;
		return this;
	}

	public TreepInfoQuery pindexIdGreaterThanOrEqual(
			Integer pindexIdGreaterThanOrEqual) {
		if (pindexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdGreaterThanOrEqual = pindexIdGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery pindexIdLessThanOrEqual(
			Integer pindexIdLessThanOrEqual) {
		if (pindexIdLessThanOrEqual == null) {
			throw new RuntimeException("pindexId is null");
		}
		this.pindexIdLessThanOrEqual = pindexIdLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery pindexIds(List<Integer> pindexIds) {
		if (pindexIds == null) {
			throw new RuntimeException("pindexIds is empty ");
		}
		this.pindexIds = pindexIds;
		return this;
	}

	public TreepInfoQuery plevel(Integer plevel) {
		if (plevel == null) {
			throw new RuntimeException("plevel is null");
		}
		this.plevel = plevel;
		return this;
	}

	public TreepInfoQuery plevelGreaterThanOrEqual(
			Integer plevelGreaterThanOrEqual) {
		if (plevelGreaterThanOrEqual == null) {
			throw new RuntimeException("plevel is null");
		}
		this.plevelGreaterThanOrEqual = plevelGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery plevelLessThanOrEqual(Integer plevelLessThanOrEqual) {
		if (plevelLessThanOrEqual == null) {
			throw new RuntimeException("plevel is null");
		}
		this.plevelLessThanOrEqual = plevelLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery plevels(List<Integer> plevels) {
		if (plevels == null) {
			throw new RuntimeException("plevels is empty ");
		}
		this.plevels = plevels;
		return this;
	}

	public TreepInfoQuery projtype(String projtype) {
		if (projtype == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtype = projtype;
		return this;
	}

	public TreepInfoQuery projtypeLike(String projtypeLike) {
		if (projtypeLike == null) {
			throw new RuntimeException("projtype is null");
		}
		this.projtypeLike = projtypeLike;
		return this;
	}

	public TreepInfoQuery projtypes(List<String> projtypes) {
		if (projtypes == null) {
			throw new RuntimeException("projtypes is empty ");
		}
		this.projtypes = projtypes;
		return this;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public void setBdateGreaterThanOrEqual(Date bdateGreaterThanOrEqual) {
		this.bdateGreaterThanOrEqual = bdateGreaterThanOrEqual;
	}

	public void setBdateLessThanOrEqual(Date bdateLessThanOrEqual) {
		this.bdateLessThanOrEqual = bdateLessThanOrEqual;
	}

	public void setBdates(List<Date> bdates) {
		this.bdates = bdates;
	}

	public void setBdateS(Date bdateS) {
		this.bdateS = bdateS;
	}

	public void setBdateSGreaterThanOrEqual(Date bdateSGreaterThanOrEqual) {
		this.bdateSGreaterThanOrEqual = bdateSGreaterThanOrEqual;
	}

	public void setBdateSLessThanOrEqual(Date bdateSLessThanOrEqual) {
		this.bdateSLessThanOrEqual = bdateSLessThanOrEqual;
	}

	public void setBdateSs(List<Date> bdateSs) {
		this.bdateSs = bdateSs;
	}

	public void setCell1(Integer cell1) {
		this.cell1 = cell1;
	}

	public void setCell1GreaterThanOrEqual(Integer cell1GreaterThanOrEqual) {
		this.cell1GreaterThanOrEqual = cell1GreaterThanOrEqual;
	}

	public void setCell1LessThanOrEqual(Integer cell1LessThanOrEqual) {
		this.cell1LessThanOrEqual = cell1LessThanOrEqual;
	}

	public void setCell1s(List<Integer> cell1s) {
		this.cell1s = cell1s;
	}

	public void setCell2(Integer cell2) {
		this.cell2 = cell2;
	}

	public void setCell2GreaterThanOrEqual(Integer cell2GreaterThanOrEqual) {
		this.cell2GreaterThanOrEqual = cell2GreaterThanOrEqual;
	}

	public void setCell2LessThanOrEqual(Integer cell2LessThanOrEqual) {
		this.cell2LessThanOrEqual = cell2LessThanOrEqual;
	}

	public void setCell2s(List<Integer> cell2s) {
		this.cell2s = cell2s;
	}

	public void setCell3(Integer cell3) {
		this.cell3 = cell3;
	}

	public void setCell3GreaterThanOrEqual(Integer cell3GreaterThanOrEqual) {
		this.cell3GreaterThanOrEqual = cell3GreaterThanOrEqual;
	}

	public void setCell3LessThanOrEqual(Integer cell3LessThanOrEqual) {
		this.cell3LessThanOrEqual = cell3LessThanOrEqual;
	}

	public void setCell3s(List<Integer> cell3s) {
		this.cell3s = cell3s;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public void setCidLike(String cidLike) {
		this.cidLike = cidLike;
	}

	public void setCids(List<String> cids) {
		this.cids = cids;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setDwidGreaterThanOrEqual(Integer dwidGreaterThanOrEqual) {
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
	}

	public void setDwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
	}

	public void setDwids(List<Integer> dwids) {
		this.dwids = dwids;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public void setEdateGreaterThanOrEqual(Date edateGreaterThanOrEqual) {
		this.edateGreaterThanOrEqual = edateGreaterThanOrEqual;
	}

	public void setEdateLessThanOrEqual(Date edateLessThanOrEqual) {
		this.edateLessThanOrEqual = edateLessThanOrEqual;
	}

	public void setEdates(List<Date> edates) {
		this.edates = edates;
	}

	public void setEdateS(Date edateS) {
		this.edateS = edateS;
	}

	public void setEdateSGreaterThanOrEqual(Date edateSGreaterThanOrEqual) {
		this.edateSGreaterThanOrEqual = edateSGreaterThanOrEqual;
	}

	public void setEdateSLessThanOrEqual(Date edateSLessThanOrEqual) {
		this.edateSLessThanOrEqual = edateSLessThanOrEqual;
	}

	public void setEdateSs(List<Date> edateSs) {
		this.edateSs = edateSs;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
	}

	public void setFbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
	}

	public void setFbids(List<Integer> fbids) {
		this.fbids = fbids;
	}

	public void setFilenum(Integer filenum) {
		this.filenum = filenum;
	}

	public void setFilenum0(Integer filenum0) {
		this.filenum0 = filenum0;
	}

	public void setFilenum0GreaterThanOrEqual(Integer filenum0GreaterThanOrEqual) {
		this.filenum0GreaterThanOrEqual = filenum0GreaterThanOrEqual;
	}

	public void setFilenum0LessThanOrEqual(Integer filenum0LessThanOrEqual) {
		this.filenum0LessThanOrEqual = filenum0LessThanOrEqual;
	}

	public void setFilenum0s(List<Integer> filenum0s) {
		this.filenum0s = filenum0s;
	}

	public void setFilenum1(Integer filenum1) {
		this.filenum1 = filenum1;
	}

	public void setFilenum1GreaterThanOrEqual(Integer filenum1GreaterThanOrEqual) {
		this.filenum1GreaterThanOrEqual = filenum1GreaterThanOrEqual;
	}

	public void setFilenum1LessThanOrEqual(Integer filenum1LessThanOrEqual) {
		this.filenum1LessThanOrEqual = filenum1LessThanOrEqual;
	}

	public void setFilenum1s(List<Integer> filenum1s) {
		this.filenum1s = filenum1s;
	}

	public void setFilenum2(Integer filenum2) {
		this.filenum2 = filenum2;
	}

	public void setFilenum2GreaterThanOrEqual(Integer filenum2GreaterThanOrEqual) {
		this.filenum2GreaterThanOrEqual = filenum2GreaterThanOrEqual;
	}

	public void setFilenum2LessThanOrEqual(Integer filenum2LessThanOrEqual) {
		this.filenum2LessThanOrEqual = filenum2LessThanOrEqual;
	}

	public void setFilenum2s(List<Integer> filenum2s) {
		this.filenum2s = filenum2s;
	}

	public void setFilenumGreaterThanOrEqual(Integer filenumGreaterThanOrEqual) {
		this.filenumGreaterThanOrEqual = filenumGreaterThanOrEqual;
	}

	public void setFilenumLessThanOrEqual(Integer filenumLessThanOrEqual) {
		this.filenumLessThanOrEqual = filenumLessThanOrEqual;
	}

	public void setFilenums(List<Integer> filenums) {
		this.filenums = filenums;
	}

	public void setFinishint(Integer finishint) {
		this.finishint = finishint;
	}

	public void setFinishintGreaterThanOrEqual(
			Integer finishintGreaterThanOrEqual) {
		this.finishintGreaterThanOrEqual = finishintGreaterThanOrEqual;
	}

	public void setFinishintLessThanOrEqual(Integer finishintLessThanOrEqual) {
		this.finishintLessThanOrEqual = finishintLessThanOrEqual;
	}

	public void setFinishints(List<Integer> finishints) {
		this.finishints = finishints;
	}

	public void setFlid(String flid) {
		this.flid = flid;
	}

	public void setFlidLike(String flidLike) {
		this.flidLike = flidLike;
	}

	public void setFlids(List<String> flids) {
		this.flids = flids;
	}

	public void setFromid(Integer fromid) {
		this.fromid = fromid;
	}

	public void setFromidGreaterThanOrEqual(Integer fromidGreaterThanOrEqual) {
		this.fromidGreaterThanOrEqual = fromidGreaterThanOrEqual;
	}

	public void setFromidLessThanOrEqual(Integer fromidLessThanOrEqual) {
		this.fromidLessThanOrEqual = fromidLessThanOrEqual;
	}

	public void setFromids(List<Integer> fromids) {
		this.fromids = fromids;
	}

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setFxidGreaterThanOrEqual(Integer fxidGreaterThanOrEqual) {
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
	}

	public void setFxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
	}

	public void setFxids(List<Integer> fxids) {
		this.fxids = fxids;
	}

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public void setIndexIdOld(Integer indexIdOld) {
		this.indexIdOld = indexIdOld;
	}

	public void setIndexIdOldGreaterThanOrEqual(
			Integer indexIdOldGreaterThanOrEqual) {
		this.indexIdOldGreaterThanOrEqual = indexIdOldGreaterThanOrEqual;
	}

	public void setIndexIdOldLessThanOrEqual(Integer indexIdOldLessThanOrEqual) {
		this.indexIdOldLessThanOrEqual = indexIdOldLessThanOrEqual;
	}

	public void setIndexIdOlds(List<Integer> indexIdOlds) {
		this.indexIdOlds = indexIdOlds;
	}

	public void setIndexIn(Integer indexIn) {
		this.indexIn = indexIn;
	}

	public void setIndexInGreaterThanOrEqual(Integer indexInGreaterThanOrEqual) {
		this.indexInGreaterThanOrEqual = indexInGreaterThanOrEqual;
	}

	public void setIndexInLessThanOrEqual(Integer indexInLessThanOrEqual) {
		this.indexInLessThanOrEqual = indexInLessThanOrEqual;
	}

	public void setIndexIns(List<Integer> indexIns) {
		this.indexIns = indexIns;
	}

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setInflag(String inflag) {
		this.inflag = inflag;
	}

	public void setInflagLike(String inflagLike) {
		this.inflagLike = inflagLike;
	}

	public void setInflags(List<String> inflags) {
		this.inflags = inflags;
	}

	public void setIntcellfinish(Integer intcellfinish) {
		this.intcellfinish = intcellfinish;
	}

	public void setIntcellfinishGreaterThanOrEqual(
			Integer intcellfinishGreaterThanOrEqual) {
		this.intcellfinishGreaterThanOrEqual = intcellfinishGreaterThanOrEqual;
	}

	public void setIntcellfinishLessThanOrEqual(
			Integer intcellfinishLessThanOrEqual) {
		this.intcellfinishLessThanOrEqual = intcellfinishLessThanOrEqual;
	}

	public void setIntcellfinishs(List<Integer> intcellfinishs) {
		this.intcellfinishs = intcellfinishs;
	}

	public void setIntisuse(Integer intisuse) {
		this.intisuse = intisuse;
	}

	public void setIntisuseGreaterThanOrEqual(Integer intisuseGreaterThanOrEqual) {
		this.intisuseGreaterThanOrEqual = intisuseGreaterThanOrEqual;
	}

	public void setIntisuseLessThanOrEqual(Integer intisuseLessThanOrEqual) {
		this.intisuseLessThanOrEqual = intisuseLessThanOrEqual;
	}

	public void setIntisuses(List<Integer> intisuses) {
		this.intisuses = intisuses;
	}

	public void setIntpfile1(Integer intpfile1) {
		this.intpfile1 = intpfile1;
	}

	public void setIntpfile1GreaterThanOrEqual(
			Integer intpfile1GreaterThanOrEqual) {
		this.intpfile1GreaterThanOrEqual = intpfile1GreaterThanOrEqual;
	}

	public void setIntpfile1LessThanOrEqual(Integer intpfile1LessThanOrEqual) {
		this.intpfile1LessThanOrEqual = intpfile1LessThanOrEqual;
	}

	public void setIntpfile1s(List<Integer> intpfile1s) {
		this.intpfile1s = intpfile1s;
	}

	public void setIntpfile2(Integer intpfile2) {
		this.intpfile2 = intpfile2;
	}

	public void setIntpfile2GreaterThanOrEqual(
			Integer intpfile2GreaterThanOrEqual) {
		this.intpfile2GreaterThanOrEqual = intpfile2GreaterThanOrEqual;
	}

	public void setIntpfile2LessThanOrEqual(Integer intpfile2LessThanOrEqual) {
		this.intpfile2LessThanOrEqual = intpfile2LessThanOrEqual;
	}

	public void setIntpfile2s(List<Integer> intpfile2s) {
		this.intpfile2s = intpfile2s;
	}

	public void setIntpfile3(Integer intpfile3) {
		this.intpfile3 = intpfile3;
	}

	public void setIntpfile3GreaterThanOrEqual(
			Integer intpfile3GreaterThanOrEqual) {
		this.intpfile3GreaterThanOrEqual = intpfile3GreaterThanOrEqual;
	}

	public void setIntpfile3LessThanOrEqual(Integer intpfile3LessThanOrEqual) {
		this.intpfile3LessThanOrEqual = intpfile3LessThanOrEqual;
	}

	public void setIntpfile3s(List<Integer> intpfile3s) {
		this.intpfile3s = intpfile3s;
	}

	public void setJid(String jid) {
		this.jid = jid;
	}

	public void setJidLike(String jidLike) {
		this.jidLike = jidLike;
	}

	public void setJids(List<String> jids) {
		this.jids = jids;
	}

	public void setListno(Integer listno) {
		this.listno = listno;
	}

	public void setListnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual) {
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
	}

	public void setListnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
	}

	public void setListnos(List<Integer> listnos) {
		this.listnos = listnos;
	}

	public void setListnum(String listnum) {
		this.listnum = listnum;
	}

	public void setListnumLike(String listnumLike) {
		this.listnumLike = listnumLike;
	}

	public void setListnums(List<String> listnums) {
		this.listnums = listnums;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNlevelGreaterThanOrEqual(Integer nlevelGreaterThanOrEqual) {
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
	}

	public void setNlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
	}

	public void setNlevels(List<Integer> nlevels) {
		this.nlevels = nlevels;
	}

	public void setNodeico(Integer nodeico) {
		this.nodeico = nodeico;
	}

	public void setNodeicoGreaterThanOrEqual(Integer nodeicoGreaterThanOrEqual) {
		this.nodeicoGreaterThanOrEqual = nodeicoGreaterThanOrEqual;
	}

	public void setNodeicoLessThanOrEqual(Integer nodeicoLessThanOrEqual) {
		this.nodeicoLessThanOrEqual = nodeicoLessThanOrEqual;
	}

	public void setNodeicos(List<Integer> nodeicos) {
		this.nodeicos = nodeicos;
	}

	public void setNodetype(String nodetype) {
		this.nodetype = nodetype;
	}

	public void setNodetypeLike(String nodetypeLike) {
		this.nodetypeLike = nodetypeLike;
	}

	public void setNodetypes(List<String> nodetypes) {
		this.nodetypes = nodetypes;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setOutflag(String outflag) {
		this.outflag = outflag;
	}

	public void setOutflagLike(String outflagLike) {
		this.outflagLike = outflagLike;
	}

	public void setOutflags(List<String> outflags) {
		this.outflags = outflags;
	}

	public void setPartId(Integer partId) {
		this.partId = partId;
	}

	public void setPartIdGreaterThanOrEqual(Integer partIdGreaterThanOrEqual) {
		this.partIdGreaterThanOrEqual = partIdGreaterThanOrEqual;
	}

	public void setPartIdLessThanOrEqual(Integer partIdLessThanOrEqual) {
		this.partIdLessThanOrEqual = partIdLessThanOrEqual;
	}

	public void setPartIds(List<Integer> partIds) {
		this.partIds = partIds;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordLike(String passwordLike) {
		this.passwordLike = passwordLike;
	}

	public void setPasswords(List<String> passwords) {
		this.passwords = passwords;
	}

	public void setPfilesIndex(Integer pfilesIndex) {
		this.pfilesIndex = pfilesIndex;
	}

	public void setPfilesIndexGreaterThanOrEqual(
			Integer pfilesIndexGreaterThanOrEqual) {
		this.pfilesIndexGreaterThanOrEqual = pfilesIndexGreaterThanOrEqual;
	}

	public void setPfilesIndexLessThanOrEqual(Integer pfilesIndexLessThanOrEqual) {
		this.pfilesIndexLessThanOrEqual = pfilesIndexLessThanOrEqual;
	}

	public void setPfilesIndexs(List<Integer> pfilesIndexs) {
		this.pfilesIndexs = pfilesIndexs;
	}

	public void setPindexId(Integer pindexId) {
		this.pindexId = pindexId;
	}

	public void setPindexIdGreaterThanOrEqual(Integer pindexIdGreaterThanOrEqual) {
		this.pindexIdGreaterThanOrEqual = pindexIdGreaterThanOrEqual;
	}

	public void setPindexIdLessThanOrEqual(Integer pindexIdLessThanOrEqual) {
		this.pindexIdLessThanOrEqual = pindexIdLessThanOrEqual;
	}

	public void setPindexIds(List<Integer> pindexIds) {
		this.pindexIds = pindexIds;
	}

	public void setPlevel(Integer plevel) {
		this.plevel = plevel;
	}

	public void setPlevelGreaterThanOrEqual(Integer plevelGreaterThanOrEqual) {
		this.plevelGreaterThanOrEqual = plevelGreaterThanOrEqual;
	}

	public void setPlevelLessThanOrEqual(Integer plevelLessThanOrEqual) {
		this.plevelLessThanOrEqual = plevelLessThanOrEqual;
	}

	public void setPlevels(List<Integer> plevels) {
		this.plevels = plevels;
	}

	public void setProjtype(String projtype) {
		this.projtype = projtype;
	}

	public void setProjtypeLike(String projtypeLike) {
		this.projtypeLike = projtypeLike;
	}

	public void setProjtypes(List<String> projtypes) {
		this.projtypes = projtypes;
	}

	public void setShowid(Integer showid) {
		this.showid = showid;
	}

	public void setShowidGreaterThanOrEqual(Integer showidGreaterThanOrEqual) {
		this.showidGreaterThanOrEqual = showidGreaterThanOrEqual;
	}

	public void setShowidLessThanOrEqual(Integer showidLessThanOrEqual) {
		this.showidLessThanOrEqual = showidLessThanOrEqual;
	}

	public void setShowids(List<Integer> showids) {
		this.showids = showids;
	}

	public void setSindexNameLike(String sindexNameLike) {
		this.sindexNameLike = sindexNameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStrButtonStar(String strButtonStar) {
		this.strButtonStar = strButtonStar;
	}

	public void setStrButtonStarLike(String strButtonStarLike) {
		this.strButtonStarLike = strButtonStarLike;
	}

	public void setStrButtonStars(List<String> strButtonStars) {
		this.strButtonStars = strButtonStars;
	}

	public void setStrfileLocate(String strfileLocate) {
		this.strfileLocate = strfileLocate;
	}

	public void setStrfileLocateLike(String strfileLocateLike) {
		this.strfileLocateLike = strfileLocateLike;
	}

	public void setStrfileLocates(List<String> strfileLocates) {
		this.strfileLocates = strfileLocates;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setSysIdLike(String sysIdLike) {
		this.sysIdLike = sysIdLike;
	}

	public void setSysIds(List<String> sysIds) {
		this.sysIds = sysIds;
	}

	public void setTopId(Integer topId) {
		this.topId = topId;
	}

	public void setTopIdGreaterThanOrEqual(Integer topIdGreaterThanOrEqual) {
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
	}

	public void setTopIdLessThanOrEqual(Integer topIdLessThanOrEqual) {
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
	}

	public void setTopIds(List<Integer> topIds) {
		this.topIds = topIds;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
	}

	public void setTreeDliststr(String treeDliststr) {
		this.treeDliststr = treeDliststr;
	}

	public void setTreeDliststrLike(String treeDliststrLike) {
		this.treeDliststrLike = treeDliststrLike;
	}

	public void setTreeDliststrs(List<String> treeDliststrs) {
		this.treeDliststrs = treeDliststrs;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIdLike(String typeIdLike) {
		this.typeIdLike = typeIdLike;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setTypeTablenameLike(String typeTablenameLike) {
		this.typeTablenameLike = typeTablenameLike;
	}

	public void setTypeTablenames(List<String> typeTablenames) {
		this.typeTablenames = typeTablenames;
	}

	public void setUsernmu(String usernmu) {
		this.usernmu = usernmu;
	}

	public void setUsernmuLike(String usernmuLike) {
		this.usernmuLike = usernmuLike;
	}

	public void setUsernmus(List<String> usernmus) {
		this.usernmus = usernmus;
	}

	public void setWbsindex(Integer wbsindex) {
		this.wbsindex = wbsindex;
	}

	public void setWbsindexGreaterThanOrEqual(Integer wbsindexGreaterThanOrEqual) {
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
	}

	public void setWbsindexIn(Integer wbsindexIn) {
		this.wbsindexIn = wbsindexIn;
	}

	public void setWbsindexInGreaterThanOrEqual(
			Integer wbsindexInGreaterThanOrEqual) {
		this.wbsindexInGreaterThanOrEqual = wbsindexInGreaterThanOrEqual;
	}

	public void setWbsindexInLessThanOrEqual(Integer wbsindexInLessThanOrEqual) {
		this.wbsindexInLessThanOrEqual = wbsindexInLessThanOrEqual;
	}

	public void setWbsindexIns(List<Integer> wbsindexIns) {
		this.wbsindexIns = wbsindexIns;
	}

	public void setWbsindexLessThanOrEqual(Integer wbsindexLessThanOrEqual) {
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
	}

	public void setWbsindexs(List<Integer> wbsindexs) {
		this.wbsindexs = wbsindexs;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public void setWcompanyLike(String wcompanyLike) {
		this.wcompanyLike = wcompanyLike;
	}

	public void setWcompanys(List<String> wcompanys) {
		this.wcompanys = wcompanys;
	}

	public TreepInfoQuery showid(Integer showid) {
		if (showid == null) {
			throw new RuntimeException("showid is null");
		}
		this.showid = showid;
		return this;
	}

	public TreepInfoQuery showidLessThanOrEqual(Integer showidLessThanOrEqual) {
		if (showidLessThanOrEqual == null) {
			throw new RuntimeException("showid is null");
		}
		this.showidLessThanOrEqual = showidLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery showids(List<Integer> showids) {
		if (showids == null) {
			throw new RuntimeException("showids is empty ");
		}
		this.showids = showids;
		return this;
	}

	public TreepInfoQuery sindexNameLike(String sindexNameLike) {
		if (sindexNameLike == null) {
			throw new RuntimeException("sindexName is null");
		}
		this.sindexNameLike = sindexNameLike;
		return this;
	}

	public TreepInfoQuery strButtonStar(String strButtonStar) {
		if (strButtonStar == null) {
			throw new RuntimeException("strButtonStar is null");
		}
		this.strButtonStar = strButtonStar;
		return this;
	}

	public TreepInfoQuery strButtonStarLike(String strButtonStarLike) {
		if (strButtonStarLike == null) {
			throw new RuntimeException("strButtonStar is null");
		}
		this.strButtonStarLike = strButtonStarLike;
		return this;
	}

	public TreepInfoQuery strButtonStars(List<String> strButtonStars) {
		if (strButtonStars == null) {
			throw new RuntimeException("strButtonStars is empty ");
		}
		this.strButtonStars = strButtonStars;
		return this;
	}

	public TreepInfoQuery strfileLocate(String strfileLocate) {
		if (strfileLocate == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocate = strfileLocate;
		return this;
	}

	public TreepInfoQuery strfileLocateLike(String strfileLocateLike) {
		if (strfileLocateLike == null) {
			throw new RuntimeException("strfileLocate is null");
		}
		this.strfileLocateLike = strfileLocateLike;
		return this;
	}

	public TreepInfoQuery strfileLocates(List<String> strfileLocates) {
		if (strfileLocates == null) {
			throw new RuntimeException("strfileLocates is empty ");
		}
		this.strfileLocates = strfileLocates;
		return this;
	}

	public TreepInfoQuery sysId(String sysId) {
		if (sysId == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysId = sysId;
		return this;
	}

	public TreepInfoQuery sysIdLike(String sysIdLike) {
		if (sysIdLike == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysIdLike = sysIdLike;
		return this;
	}

	public TreepInfoQuery sysIds(List<String> sysIds) {
		if (sysIds == null) {
			throw new RuntimeException("sysIds is empty ");
		}
		this.sysIds = sysIds;
		return this;
	}

	public TreepInfoQuery topId(Integer topId) {
		if (topId == null) {
			throw new RuntimeException("topId is null");
		}
		this.topId = topId;
		return this;
	}

	public TreepInfoQuery topIdGreaterThanOrEqual(
			Integer topIdGreaterThanOrEqual) {
		if (topIdGreaterThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdGreaterThanOrEqual = topIdGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery topIdLessThanOrEqual(Integer topIdLessThanOrEqual) {
		if (topIdLessThanOrEqual == null) {
			throw new RuntimeException("topId is null");
		}
		this.topIdLessThanOrEqual = topIdLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery topIds(List<Integer> topIds) {
		if (topIds == null) {
			throw new RuntimeException("topIds is empty ");
		}
		this.topIds = topIds;
		return this;
	}

	public TreepInfoQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public TreepInfoQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public TreepInfoQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public TreepInfoQuery treeDliststr(String treeDliststr) {
		if (treeDliststr == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststr = treeDliststr;
		return this;
	}

	public TreepInfoQuery treeDliststrLike(String treeDliststrLike) {
		if (treeDliststrLike == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststrLike = treeDliststrLike;
		return this;
	}

	public TreepInfoQuery treeDliststrs(List<String> treeDliststrs) {
		if (treeDliststrs == null) {
			throw new RuntimeException("treeDliststrs is empty ");
		}
		this.treeDliststrs = treeDliststrs;
		return this;
	}

	public TreepInfoQuery typeId(String typeId) {
		if (typeId == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeId = typeId;
		return this;
	}

	public TreepInfoQuery typeIdLike(String typeIdLike) {
		if (typeIdLike == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeIdLike = typeIdLike;
		return this;
	}

	public TreepInfoQuery typeIds(List<String> typeIds) {
		if (typeIds == null) {
			throw new RuntimeException("typeIds is empty ");
		}
		this.typeIds = typeIds;
		return this;
	}

	public TreepInfoQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public TreepInfoQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public TreepInfoQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

	public TreepInfoQuery usernmu(String usernmu) {
		if (usernmu == null) {
			throw new RuntimeException("usernmu is null");
		}
		this.usernmu = usernmu;
		return this;
	}

	public TreepInfoQuery usernmuLike(String usernmuLike) {
		if (usernmuLike == null) {
			throw new RuntimeException("usernmu is null");
		}
		this.usernmuLike = usernmuLike;
		return this;
	}

	public TreepInfoQuery usernmus(List<String> usernmus) {
		if (usernmus == null) {
			throw new RuntimeException("usernmus is empty ");
		}
		this.usernmus = usernmus;
		return this;
	}

	public TreepInfoQuery wbsindex(Integer wbsindex) {
		if (wbsindex == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindex = wbsindex;
		return this;
	}

	public TreepInfoQuery wbsindexGreaterThanOrEqual(
			Integer wbsindexGreaterThanOrEqual) {
		if (wbsindexGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery wbsindexIn(Integer wbsindexIn) {
		if (wbsindexIn == null) {
			throw new RuntimeException("wbsindexIn is null");
		}
		this.wbsindexIn = wbsindexIn;
		return this;
	}

	public TreepInfoQuery wbsindexInGreaterThanOrEqual(
			Integer wbsindexInGreaterThanOrEqual) {
		if (wbsindexInGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsindexIn is null");
		}
		this.wbsindexInGreaterThanOrEqual = wbsindexInGreaterThanOrEqual;
		return this;
	}

	public TreepInfoQuery wbsindexInLessThanOrEqual(
			Integer wbsindexInLessThanOrEqual) {
		if (wbsindexInLessThanOrEqual == null) {
			throw new RuntimeException("wbsindexIn is null");
		}
		this.wbsindexInLessThanOrEqual = wbsindexInLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery wbsindexIns(List<Integer> wbsindexIns) {
		if (wbsindexIns == null) {
			throw new RuntimeException("wbsindexIns is empty ");
		}
		this.wbsindexIns = wbsindexIns;
		return this;
	}

	public TreepInfoQuery wbsindexLessThanOrEqual(
			Integer wbsindexLessThanOrEqual) {
		if (wbsindexLessThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
		return this;
	}

	public TreepInfoQuery wbsindexs(List<Integer> wbsindexs) {
		if (wbsindexs == null) {
			throw new RuntimeException("wbsindexs is empty ");
		}
		this.wbsindexs = wbsindexs;
		return this;
	}

	public TreepInfoQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public TreepInfoQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public TreepInfoQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

}