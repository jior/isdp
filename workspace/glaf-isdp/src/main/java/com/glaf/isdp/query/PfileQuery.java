package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class PfileQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer efilenum;
	protected Integer efilenumGreaterThanOrEqual;
	protected Integer efilenumLessThanOrEqual;
	protected List<Integer> efilenums;
	protected String listnum;
	protected String listnumLike;
	protected List<String> listnums;
	protected Long listId;
	protected Long listIdGreaterThanOrEqual;
	protected Long listIdLessThanOrEqual;
	protected List<Long> listIds;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer pid;
	protected Integer pidGreaterThanOrEqual;
	protected Integer pidLessThanOrEqual;
	protected List<Integer> pids;
	protected Integer projid;
	protected Integer projidGreaterThanOrEqual;
	protected Integer projidLessThanOrEqual;
	protected List<Integer> projids;
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
	protected String topnodem;
	protected String topnodemLike;
	protected List<String> topnodems;
	protected String vid;
	protected String vidLike;
	protected List<String> vids;
	protected String oldvid;
	protected String oldvidLike;
	protected List<String> oldvids;
	protected String visflag;
	protected String visflagLike;
	protected List<String> visflags;
	protected Integer listno;
	protected Integer listnoGreaterThanOrEqual;
	protected Integer listnoLessThanOrEqual;
	protected List<Integer> listnos;
	protected String filingflag;
	protected String filingflagLike;
	protected List<String> filingflags;
	protected String saveflag;
	protected String saveflagLike;
	protected List<String> saveflags;
	protected String openflag;
	protected String openflagLike;
	protected List<String> openflags;
	protected String checkupflag;
	protected String checkupflagLike;
	protected List<String> checkupflags;
	protected String finishflag;
	protected String finishflagLike;
	protected List<String> finishflags;
	protected String fromID;
	protected String fromIDLike;
	protected List<String> fromIDs;
	protected String tname;
	protected String tnameLike;
	protected List<String> tnames;
	protected String duty;
	protected String dutyLike;
	protected List<String> dutys;
	protected String tagnum;
	protected String tagnumLike;
	protected List<String> tagnums;
	protected String filenum;
	protected String filenumLike;
	protected List<String> filenums;
	protected String thematic;
	protected String thematicLike;
	protected List<String> thematics;
	protected Date ctime;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected List<Date> ctimes;
	protected String pageno;
	protected String pagenoLike;
	protected List<String> pagenos;
	protected String slevel;
	protected String slevelLike;
	protected List<String> slevels;
	protected Integer page;
	protected Integer pageGreaterThanOrEqual;
	protected Integer pageLessThanOrEqual;
	protected List<Integer> pages;
	protected String filetype;
	protected String filetypeLike;
	protected List<String> filetypes;
	protected String fontsnum;
	protected String fontsnumLike;
	protected List<String> fontsnums;
	protected String savetime;
	protected String savetimeLike;
	protected List<String> savetimes;
	protected String company;
	protected String companyLike;
	protected List<String> companys;
	protected Integer year;
	protected Integer yearGreaterThanOrEqual;
	protected Integer yearLessThanOrEqual;
	protected List<Integer> years;
	protected String fileatt;
	protected String fileattLike;
	protected List<String> fileatts;
	protected String annotations;
	protected String annotationsLike;
	protected List<String> annotationss;
	protected String carriertype;
	protected String carriertypeLike;
	protected List<String> carriertypes;
	protected String summary;
	protected String summaryLike;
	protected List<String> summarys;
	protected String ptext;
	protected String ptextLike;
	protected List<String> ptexts;
	protected String carrieru;
	protected String carrieruLike;
	protected List<String> carrierus;
	protected String glidenum;
	protected String glidenumLike;
	protected List<String> glidenums;
	protected String efile;
	protected String efileLike;
	protected List<String> efiles;
	protected Date ftime;
	protected Date ftimeGreaterThanOrEqual;
	protected Date ftimeLessThanOrEqual;
	protected List<Date> ftimes;
	protected String totalnum;
	protected String totalnumLike;
	protected List<String> totalnums;
	protected String inputman;
	protected String inputmanLike;
	protected List<String> inputmans;
	protected Date etime;
	protected Date etimeGreaterThanOrEqual;
	protected Date etimeLessThanOrEqual;
	protected List<Date> etimes;
	protected String dotnum;
	protected String dotnumLike;
	protected List<String> dotnums;
	protected String picnum;
	protected String picnumLike;
	protected List<String> picnums;
	protected String recnum;
	protected String recnumLike;
	protected List<String> recnums;
	protected Integer total;
	protected Integer totalGreaterThanOrEqual;
	protected Integer totalLessThanOrEqual;
	protected List<Integer> totals;
	protected String pagetype;
	protected String pagetypeLike;
	protected List<String> pagetypes;
	protected String iscom;
	protected String iscomLike;
	protected List<String> iscoms;
	protected String islocate;
	protected String islocateLike;
	protected List<String> islocates;
	protected String wcompany;
	protected String wcompanyLike;
	protected List<String> wcompanys;
	protected String wcompanyID;
	protected String wcompanyIDLike;
	protected List<String> wcompanyIDs;
	protected String sendflag;
	protected String sendflagLike;
	protected List<String> sendflags;
	protected String lcontent;
	protected String lcontentLike;
	protected List<String> lcontents;
	protected String lcompany;
	protected String lcompanyLike;
	protected List<String> lcompanys;
	protected String lman;
	protected String lmanLike;
	protected List<String> lmans;
	protected String llen;
	protected String llenLike;
	protected List<String> llens;
	protected Date ldate;
	protected Date ldateGreaterThanOrEqual;
	protected Date ldateLessThanOrEqual;
	protected List<Date> ldates;
	protected String jconten;
	protected String jcontenLike;
	protected List<String> jcontens;
	protected String jplace;
	protected String jplaceLike;
	protected List<String> jplaces;
	protected String jman;
	protected String jmanLike;
	protected List<String> jmans;
	protected String jback;
	protected String jbackLike;
	protected List<String> jbacks;
	protected String jactor;
	protected String jactorLike;
	protected List<String> jactors;
	protected String jnum;
	protected String jnumLike;
	protected List<String> jnums;
	protected String jbnum;
	protected String jbnumLike;
	protected List<String> jbnums;
	protected String tnum;
	protected String tnumLike;
	protected List<String> tnums;
	protected String tzoom;
	protected String tzoomLike;
	protected List<String> tzooms;
	protected String tflag;
	protected String tflagLike;
	protected List<String> tflags;
	protected String tdesigner;
	protected String tdesignerLike;
	protected List<String> tdesigners;
	protected String tviewer;
	protected String tviewerLike;
	protected List<String> tviewers;
	protected String tassessor;
	protected String tassessorLike;
	protected List<String> tassessors;
	protected String tvision;
	protected String tvisionLike;
	protected List<String> tvisions;
	protected Integer clistno;
	protected Integer clistnoGreaterThanOrEqual;
	protected Integer clistnoLessThanOrEqual;
	protected List<Integer> clistnos;
	protected String cpageno;
	protected String cpagenoLike;
	protected List<String> cpagenos;
	protected String vnum;
	protected String vnumLike;
	protected List<String> vnums;
	protected String cvnum;
	protected String cvnumLike;
	protected List<String> cvnums;
	protected String treeDliststr;
	protected String treeDliststrLike;
	protected List<String> treeDliststrs;
	protected Date ctimeEnd;
	protected Date ctimeEndGreaterThanOrEqual;
	protected Date ctimeEndLessThanOrEqual;
	protected List<Date> ctimeEnds;
	protected Integer projIndex;
	protected Integer projIndexGreaterThanOrEqual;
	protected Integer projIndexLessThanOrEqual;
	protected List<Integer> projIndexs;
	protected Integer treeParent;
	protected Integer treeParentGreaterThanOrEqual;
	protected Integer treeParentLessThanOrEqual;
	protected List<Integer> treeParents;
	protected Integer treeList;
	protected Integer treeListGreaterThanOrEqual;
	protected Integer treeListLessThanOrEqual;
	protected List<Integer> treeLists;
	

	public PfileQuery() {

	}

	public PfileQuery annotations(String annotations) {
		if (annotations == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotations = annotations;
		return this;
	}

	public PfileQuery annotationsLike(String annotationsLike) {
		if (annotationsLike == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotationsLike = annotationsLike;
		return this;
	}

	public PfileQuery annotationss(List<String> annotationss) {
		if (annotationss == null) {
			throw new RuntimeException("annotationss is empty ");
		}
		this.annotationss = annotationss;
		return this;
	}

	public PfileQuery carriertype(String carriertype) {
		if (carriertype == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertype = carriertype;
		return this;
	}

	public PfileQuery carriertypeLike(String carriertypeLike) {
		if (carriertypeLike == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertypeLike = carriertypeLike;
		return this;
	}

	public PfileQuery carriertypes(List<String> carriertypes) {
		if (carriertypes == null) {
			throw new RuntimeException("carriertypes is empty ");
		}
		this.carriertypes = carriertypes;
		return this;
	}

	public PfileQuery carrieru(String carrieru) {
		if (carrieru == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieru = carrieru;
		return this;
	}

	public PfileQuery carrieruLike(String carrieruLike) {
		if (carrieruLike == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieruLike = carrieruLike;
		return this;
	}

	public PfileQuery carrierus(List<String> carrierus) {
		if (carrierus == null) {
			throw new RuntimeException("carrierus is empty ");
		}
		this.carrierus = carrierus;
		return this;
	}

	public PfileQuery checkupflag(String checkupflag) {
		if (checkupflag == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflag = checkupflag;
		return this;
	}

	public PfileQuery checkupflagLike(String checkupflagLike) {
		if (checkupflagLike == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflagLike = checkupflagLike;
		return this;
	}

	public PfileQuery checkupflags(List<String> checkupflags) {
		if (checkupflags == null) {
			throw new RuntimeException("checkupflags is empty ");
		}
		this.checkupflags = checkupflags;
		return this;
	}

	public PfileQuery clistno(Integer clistno) {
		if (clistno == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistno = clistno;
		return this;
	}

	public PfileQuery clistnoGreaterThanOrEqual(
			Integer clistnoGreaterThanOrEqual) {
		if (clistnoGreaterThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoGreaterThanOrEqual = clistnoGreaterThanOrEqual;
		return this;
	}

	public PfileQuery clistnoLessThanOrEqual(Integer clistnoLessThanOrEqual) {
		if (clistnoLessThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoLessThanOrEqual = clistnoLessThanOrEqual;
		return this;
	}

	public PfileQuery clistnos(List<Integer> clistnos) {
		if (clistnos == null) {
			throw new RuntimeException("clistnos is empty ");
		}
		this.clistnos = clistnos;
		return this;
	}

	public PfileQuery company(String company) {
		if (company == null) {
			throw new RuntimeException("company is null");
		}
		this.company = company;
		return this;
	}

	public PfileQuery companyLike(String companyLike) {
		if (companyLike == null) {
			throw new RuntimeException("company is null");
		}
		this.companyLike = companyLike;
		return this;
	}

	public PfileQuery companys(List<String> companys) {
		if (companys == null) {
			throw new RuntimeException("companys is empty ");
		}
		this.companys = companys;
		return this;
	}

	public PfileQuery cpageno(String cpageno) {
		if (cpageno == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpageno = cpageno;
		return this;
	}

	public PfileQuery cpagenoLike(String cpagenoLike) {
		if (cpagenoLike == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpagenoLike = cpagenoLike;
		return this;
	}

	public PfileQuery cpagenos(List<String> cpagenos) {
		if (cpagenos == null) {
			throw new RuntimeException("cpagenos is empty ");
		}
		this.cpagenos = cpagenos;
		return this;
	}

	public PfileQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public PfileQuery ctimeEnd(Date ctimeEnd) {
		if (ctimeEnd == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEnd = ctimeEnd;
		return this;
	}

	public PfileQuery ctimeEndGreaterThanOrEqual(Date ctimeEndGreaterThanOrEqual) {
		if (ctimeEndGreaterThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndGreaterThanOrEqual = ctimeEndGreaterThanOrEqual;
		return this;
	}

	public PfileQuery ctimeEndLessThanOrEqual(Date ctimeEndLessThanOrEqual) {
		if (ctimeEndLessThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndLessThanOrEqual = ctimeEndLessThanOrEqual;
		return this;
	}

	public PfileQuery ctimeEnds(List<Date> ctimeEnds) {
		if (ctimeEnds == null) {
			throw new RuntimeException("ctimeEnds is empty ");
		}
		this.ctimeEnds = ctimeEnds;
		return this;
	}

	public PfileQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public PfileQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public PfileQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public PfileQuery cvnum(String cvnum) {
		if (cvnum == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnum = cvnum;
		return this;
	}

	public PfileQuery cvnumLike(String cvnumLike) {
		if (cvnumLike == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnumLike = cvnumLike;
		return this;
	}

	public PfileQuery cvnums(List<String> cvnums) {
		if (cvnums == null) {
			throw new RuntimeException("cvnums is empty ");
		}
		this.cvnums = cvnums;
		return this;
	}

	public PfileQuery dotnum(String dotnum) {
		if (dotnum == null) {
			throw new RuntimeException("dotnum is null");
		}
		this.dotnum = dotnum;
		return this;
	}

	public PfileQuery dotnumLike(String dotnumLike) {
		if (dotnumLike == null) {
			throw new RuntimeException("dotnum is null");
		}
		this.dotnumLike = dotnumLike;
		return this;
	}

	public PfileQuery dotnums(List<String> dotnums) {
		if (dotnums == null) {
			throw new RuntimeException("dotnums is empty ");
		}
		this.dotnums = dotnums;
		return this;
	}

	public PfileQuery duty(String duty) {
		if (duty == null) {
			throw new RuntimeException("duty is null");
		}
		this.duty = duty;
		return this;
	}

	public PfileQuery dutyLike(String dutyLike) {
		if (dutyLike == null) {
			throw new RuntimeException("duty is null");
		}
		this.dutyLike = dutyLike;
		return this;
	}

	public PfileQuery dutys(List<String> dutys) {
		if (dutys == null) {
			throw new RuntimeException("dutys is empty ");
		}
		this.dutys = dutys;
		return this;
	}

	public PfileQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public PfileQuery dwidGreaterThanOrEqual(Integer dwidGreaterThanOrEqual) {
		if (dwidGreaterThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
		return this;
	}

	public PfileQuery dwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		if (dwidLessThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
		return this;
	}

	public PfileQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public PfileQuery efile(String efile) {
		if (efile == null) {
			throw new RuntimeException("efile is null");
		}
		this.efile = efile;
		return this;
	}

	public PfileQuery efileLike(String efileLike) {
		if (efileLike == null) {
			throw new RuntimeException("efile is null");
		}
		this.efileLike = efileLike;
		return this;
	}

	public PfileQuery efilenum(Integer efilenum) {
		if (efilenum == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenum = efilenum;
		return this;
	}

	public PfileQuery efilenumGreaterThanOrEqual(
			Integer efilenumGreaterThanOrEqual) {
		if (efilenumGreaterThanOrEqual == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumGreaterThanOrEqual = efilenumGreaterThanOrEqual;
		return this;
	}

	public PfileQuery efilenumLessThanOrEqual(Integer efilenumLessThanOrEqual) {
		if (efilenumLessThanOrEqual == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumLessThanOrEqual = efilenumLessThanOrEqual;
		return this;
	}

	public PfileQuery efilenums(List<Integer> efilenums) {
		if (efilenums == null) {
			throw new RuntimeException("efilenums is empty ");
		}
		this.efilenums = efilenums;
		return this;
	}

	public PfileQuery efiles(List<String> efiles) {
		if (efiles == null) {
			throw new RuntimeException("efiles is empty ");
		}
		this.efiles = efiles;
		return this;
	}

	public PfileQuery etime(Date etime) {
		if (etime == null) {
			throw new RuntimeException("etime is null");
		}
		this.etime = etime;
		return this;
	}

	public PfileQuery etimeGreaterThanOrEqual(Date etimeGreaterThanOrEqual) {
		if (etimeGreaterThanOrEqual == null) {
			throw new RuntimeException("etime is null");
		}
		this.etimeGreaterThanOrEqual = etimeGreaterThanOrEqual;
		return this;
	}

	public PfileQuery etimeLessThanOrEqual(Date etimeLessThanOrEqual) {
		if (etimeLessThanOrEqual == null) {
			throw new RuntimeException("etime is null");
		}
		this.etimeLessThanOrEqual = etimeLessThanOrEqual;
		return this;
	}

	public PfileQuery etimes(List<Date> etimes) {
		if (etimes == null) {
			throw new RuntimeException("etimes is empty ");
		}
		this.etimes = etimes;
		return this;
	}

	public PfileQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public PfileQuery fbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		if (fbidGreaterThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
		return this;
	}

	public PfileQuery fbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		if (fbidLessThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
		return this;
	}

	public PfileQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public PfileQuery fileatt(String fileatt) {
		if (fileatt == null) {
			throw new RuntimeException("fileatt is null");
		}
		this.fileatt = fileatt;
		return this;
	}

	public PfileQuery fileattLike(String fileattLike) {
		if (fileattLike == null) {
			throw new RuntimeException("fileatt is null");
		}
		this.fileattLike = fileattLike;
		return this;
	}

	public PfileQuery fileatts(List<String> fileatts) {
		if (fileatts == null) {
			throw new RuntimeException("fileatts is empty ");
		}
		this.fileatts = fileatts;
		return this;
	}

	public PfileQuery filenum(String filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public PfileQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public PfileQuery filenums(List<String> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public PfileQuery filetype(String filetype) {
		if (filetype == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetype = filetype;
		return this;
	}

	public PfileQuery filetypeLike(String filetypeLike) {
		if (filetypeLike == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetypeLike = filetypeLike;
		return this;
	}

	public PfileQuery filetypes(List<String> filetypes) {
		if (filetypes == null) {
			throw new RuntimeException("filetypes is empty ");
		}
		this.filetypes = filetypes;
		return this;
	}

	public PfileQuery filingflag(String filingflag) {
		if (filingflag == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflag = filingflag;
		return this;
	}

	public PfileQuery filingflagLike(String filingflagLike) {
		if (filingflagLike == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflagLike = filingflagLike;
		return this;
	}

	public PfileQuery filingflags(List<String> filingflags) {
		if (filingflags == null) {
			throw new RuntimeException("filingflags is empty ");
		}
		this.filingflags = filingflags;
		return this;
	}

	public PfileQuery finishflag(String finishflag) {
		if (finishflag == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflag = finishflag;
		return this;
	}

	public PfileQuery finishflagLike(String finishflagLike) {
		if (finishflagLike == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflagLike = finishflagLike;
		return this;
	}

	public PfileQuery finishflags(List<String> finishflags) {
		if (finishflags == null) {
			throw new RuntimeException("finishflags is empty ");
		}
		this.finishflags = finishflags;
		return this;
	}

	public PfileQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public PfileQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public PfileQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public PfileQuery fontsnum(String fontsnum) {
		if (fontsnum == null) {
			throw new RuntimeException("fontsnum is null");
		}
		this.fontsnum = fontsnum;
		return this;
	}

	public PfileQuery fontsnumLike(String fontsnumLike) {
		if (fontsnumLike == null) {
			throw new RuntimeException("fontsnum is null");
		}
		this.fontsnumLike = fontsnumLike;
		return this;
	}

	public PfileQuery fontsnums(List<String> fontsnums) {
		if (fontsnums == null) {
			throw new RuntimeException("fontsnums is empty ");
		}
		this.fontsnums = fontsnums;
		return this;
	}

	public PfileQuery fromID(String fromID) {
		if (fromID == null) {
			throw new RuntimeException("fromID is null");
		}
		this.fromID = fromID;
		return this;
	}

	public PfileQuery fromIDLike(String fromIDLike) {
		if (fromIDLike == null) {
			throw new RuntimeException("fromID is null");
		}
		this.fromIDLike = fromIDLike;
		return this;
	}

	public PfileQuery fromIDs(List<String> fromIDs) {
		if (fromIDs == null) {
			throw new RuntimeException("fromIDs is empty ");
		}
		this.fromIDs = fromIDs;
		return this;
	}

	public PfileQuery ftime(Date ftime) {
		if (ftime == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftime = ftime;
		return this;
	}

	public PfileQuery ftimeGreaterThanOrEqual(Date ftimeGreaterThanOrEqual) {
		if (ftimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftimeGreaterThanOrEqual = ftimeGreaterThanOrEqual;
		return this;
	}

	public PfileQuery ftimeLessThanOrEqual(Date ftimeLessThanOrEqual) {
		if (ftimeLessThanOrEqual == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftimeLessThanOrEqual = ftimeLessThanOrEqual;
		return this;
	}

	public PfileQuery ftimes(List<Date> ftimes) {
		if (ftimes == null) {
			throw new RuntimeException("ftimes is empty ");
		}
		this.ftimes = ftimes;
		return this;
	}

	public PfileQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public PfileQuery fxidGreaterThanOrEqual(Integer fxidGreaterThanOrEqual) {
		if (fxidGreaterThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
		return this;
	}

	public PfileQuery fxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		if (fxidLessThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
		return this;
	}

	public PfileQuery fxids(List<Integer> fxids) {
		if (fxids == null) {
			throw new RuntimeException("fxids is empty ");
		}
		this.fxids = fxids;
		return this;
	}

	public String getAnnotations() {
		return annotations;
	}

	public String getAnnotationsLike() {
		if (annotationsLike != null && annotationsLike.trim().length() > 0) {
			if (!annotationsLike.startsWith("%")) {
				annotationsLike = "%" + annotationsLike;
			}
			if (!annotationsLike.endsWith("%")) {
				annotationsLike = annotationsLike + "%";
			}
		}
		return annotationsLike;
	}

	public List<String> getAnnotationss() {
		return annotationss;
	}

	public String getCarriertype() {
		return carriertype;
	}

	public String getCarriertypeLike() {
		if (carriertypeLike != null && carriertypeLike.trim().length() > 0) {
			if (!carriertypeLike.startsWith("%")) {
				carriertypeLike = "%" + carriertypeLike;
			}
			if (!carriertypeLike.endsWith("%")) {
				carriertypeLike = carriertypeLike + "%";
			}
		}
		return carriertypeLike;
	}

	public List<String> getCarriertypes() {
		return carriertypes;
	}

	public String getCarrieru() {
		return carrieru;
	}

	public String getCarrieruLike() {
		if (carrieruLike != null && carrieruLike.trim().length() > 0) {
			if (!carrieruLike.startsWith("%")) {
				carrieruLike = "%" + carrieruLike;
			}
			if (!carrieruLike.endsWith("%")) {
				carrieruLike = carrieruLike + "%";
			}
		}
		return carrieruLike;
	}

	public List<String> getCarrierus() {
		return carrierus;
	}

	public String getCheckupflag() {
		return checkupflag;
	}

	public String getCheckupflagLike() {
		if (checkupflagLike != null && checkupflagLike.trim().length() > 0) {
			if (!checkupflagLike.startsWith("%")) {
				checkupflagLike = "%" + checkupflagLike;
			}
			if (!checkupflagLike.endsWith("%")) {
				checkupflagLike = checkupflagLike + "%";
			}
		}
		return checkupflagLike;
	}

	public List<String> getCheckupflags() {
		return checkupflags;
	}

	public Integer getClistno() {
		return clistno;
	}

	public Integer getClistnoGreaterThanOrEqual() {
		return clistnoGreaterThanOrEqual;
	}

	public Integer getClistnoLessThanOrEqual() {
		return clistnoLessThanOrEqual;
	}

	public List<Integer> getClistnos() {
		return clistnos;
	}

	public String getCompany() {
		return company;
	}

	public String getCompanyLike() {
		if (companyLike != null && companyLike.trim().length() > 0) {
			if (!companyLike.startsWith("%")) {
				companyLike = "%" + companyLike;
			}
			if (!companyLike.endsWith("%")) {
				companyLike = companyLike + "%";
			}
		}
		return companyLike;
	}

	public List<String> getCompanys() {
		return companys;
	}

	public String getCpageno() {
		return cpageno;
	}

	public String getCpagenoLike() {
		if (cpagenoLike != null && cpagenoLike.trim().length() > 0) {
			if (!cpagenoLike.startsWith("%")) {
				cpagenoLike = "%" + cpagenoLike;
			}
			if (!cpagenoLike.endsWith("%")) {
				cpagenoLike = cpagenoLike + "%";
			}
		}
		return cpagenoLike;
	}

	public List<String> getCpagenos() {
		return cpagenos;
	}

	public Date getCtime() {
		return ctime;
	}

	public Date getCtimeEnd() {
		return ctimeEnd;
	}

	public Date getCtimeEndGreaterThanOrEqual() {
		return ctimeEndGreaterThanOrEqual;
	}

	public Date getCtimeEndLessThanOrEqual() {
		return ctimeEndLessThanOrEqual;
	}

	public List<Date> getCtimeEnds() {
		return ctimeEnds;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public List<Date> getCtimes() {
		return ctimes;
	}

	public String getCvnum() {
		return cvnum;
	}

	public String getCvnumLike() {
		if (cvnumLike != null && cvnumLike.trim().length() > 0) {
			if (!cvnumLike.startsWith("%")) {
				cvnumLike = "%" + cvnumLike;
			}
			if (!cvnumLike.endsWith("%")) {
				cvnumLike = cvnumLike + "%";
			}
		}
		return cvnumLike;
	}

	public List<String> getCvnums() {
		return cvnums;
	}

	public String getDotnum() {
		return dotnum;
	}

	public String getDotnumLike() {
		if (dotnumLike != null && dotnumLike.trim().length() > 0) {
			if (!dotnumLike.startsWith("%")) {
				dotnumLike = "%" + dotnumLike;
			}
			if (!dotnumLike.endsWith("%")) {
				dotnumLike = dotnumLike + "%";
			}
		}
		return dotnumLike;
	}

	public List<String> getDotnums() {
		return dotnums;
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

	public String getEfile() {
		return efile;
	}

	public String getEfileLike() {
		if (efileLike != null && efileLike.trim().length() > 0) {
			if (!efileLike.startsWith("%")) {
				efileLike = "%" + efileLike;
			}
			if (!efileLike.endsWith("%")) {
				efileLike = efileLike + "%";
			}
		}
		return efileLike;
	}

	public Integer getEfilenum() {
		return efilenum;
	}

	public Integer getEfilenumGreaterThanOrEqual() {
		return efilenumGreaterThanOrEqual;
	}

	public Integer getEfilenumLessThanOrEqual() {
		return efilenumLessThanOrEqual;
	}

	public List<Integer> getEfilenums() {
		return efilenums;
	}

	public List<String> getEfiles() {
		return efiles;
	}

	public Date getEtime() {
		return etime;
	}

	public Date getEtimeGreaterThanOrEqual() {
		return etimeGreaterThanOrEqual;
	}

	public Date getEtimeLessThanOrEqual() {
		return etimeLessThanOrEqual;
	}

	public List<Date> getEtimes() {
		return etimes;
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

	public String getFileatt() {
		return fileatt;
	}

	public String getFileattLike() {
		if (fileattLike != null && fileattLike.trim().length() > 0) {
			if (!fileattLike.startsWith("%")) {
				fileattLike = "%" + fileattLike;
			}
			if (!fileattLike.endsWith("%")) {
				fileattLike = fileattLike + "%";
			}
		}
		return fileattLike;
	}

	public List<String> getFileatts() {
		return fileatts;
	}

	public String getFilenum() {
		return filenum;
	}

	public String getFilenumLike() {
		if (filenumLike != null && filenumLike.trim().length() > 0) {
			if (!filenumLike.startsWith("%")) {
				filenumLike = "%" + filenumLike;
			}
			if (!filenumLike.endsWith("%")) {
				filenumLike = filenumLike + "%";
			}
		}
		return filenumLike;
	}

	public List<String> getFilenums() {
		return filenums;
	}

	public String getFiletype() {
		return filetype;
	}

	public String getFiletypeLike() {
		if (filetypeLike != null && filetypeLike.trim().length() > 0) {
			if (!filetypeLike.startsWith("%")) {
				filetypeLike = "%" + filetypeLike;
			}
			if (!filetypeLike.endsWith("%")) {
				filetypeLike = filetypeLike + "%";
			}
		}
		return filetypeLike;
	}

	public List<String> getFiletypes() {
		return filetypes;
	}

	public String getFilingflag() {
		return filingflag;
	}

	public String getFilingflagLike() {
		if (filingflagLike != null && filingflagLike.trim().length() > 0) {
			if (!filingflagLike.startsWith("%")) {
				filingflagLike = "%" + filingflagLike;
			}
			if (!filingflagLike.endsWith("%")) {
				filingflagLike = filingflagLike + "%";
			}
		}
		return filingflagLike;
	}

	public List<String> getFilingflags() {
		return filingflags;
	}

	public String getFinishflag() {
		return finishflag;
	}

	public String getFinishflagLike() {
		if (finishflagLike != null && finishflagLike.trim().length() > 0) {
			if (!finishflagLike.startsWith("%")) {
				finishflagLike = "%" + finishflagLike;
			}
			if (!finishflagLike.endsWith("%")) {
				finishflagLike = finishflagLike + "%";
			}
		}
		return finishflagLike;
	}

	public List<String> getFinishflags() {
		return finishflags;
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

	public String getFontsnum() {
		return fontsnum;
	}

	public String getFontsnumLike() {
		if (fontsnumLike != null && fontsnumLike.trim().length() > 0) {
			if (!fontsnumLike.startsWith("%")) {
				fontsnumLike = "%" + fontsnumLike;
			}
			if (!fontsnumLike.endsWith("%")) {
				fontsnumLike = fontsnumLike + "%";
			}
		}
		return fontsnumLike;
	}

	public List<String> getFontsnums() {
		return fontsnums;
	}

	public String getFromID() {
		return fromID;
	}

	public String getFromIDLike() {
		if (fromIDLike != null && fromIDLike.trim().length() > 0) {
			if (!fromIDLike.startsWith("%")) {
				fromIDLike = "%" + fromIDLike;
			}
			if (!fromIDLike.endsWith("%")) {
				fromIDLike = fromIDLike + "%";
			}
		}
		return fromIDLike;
	}

	public List<String> getFromIDs() {
		return fromIDs;
	}

	public Date getFtime() {
		return ftime;
	}

	public Date getFtimeGreaterThanOrEqual() {
		return ftimeGreaterThanOrEqual;
	}

	public Date getFtimeLessThanOrEqual() {
		return ftimeLessThanOrEqual;
	}

	public List<Date> getFtimes() {
		return ftimes;
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

	public String getGlidenum() {
		return glidenum;
	}

	public String getGlidenumLike() {
		if (glidenumLike != null && glidenumLike.trim().length() > 0) {
			if (!glidenumLike.startsWith("%")) {
				glidenumLike = "%" + glidenumLike;
			}
			if (!glidenumLike.endsWith("%")) {
				glidenumLike = glidenumLike + "%";
			}
		}
		return glidenumLike;
	}

	public List<String> getGlidenums() {
		return glidenums;
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

	public String getInputman() {
		return inputman;
	}

	public String getInputmanLike() {
		if (inputmanLike != null && inputmanLike.trim().length() > 0) {
			if (!inputmanLike.startsWith("%")) {
				inputmanLike = "%" + inputmanLike;
			}
			if (!inputmanLike.endsWith("%")) {
				inputmanLike = inputmanLike + "%";
			}
		}
		return inputmanLike;
	}

	public List<String> getInputmans() {
		return inputmans;
	}

	public String getIscom() {
		return iscom;
	}

	public String getIscomLike() {
		if (iscomLike != null && iscomLike.trim().length() > 0) {
			if (!iscomLike.startsWith("%")) {
				iscomLike = "%" + iscomLike;
			}
			if (!iscomLike.endsWith("%")) {
				iscomLike = iscomLike + "%";
			}
		}
		return iscomLike;
	}

	public List<String> getIscoms() {
		return iscoms;
	}

	public String getIslocate() {
		return islocate;
	}

	public String getIslocateLike() {
		if (islocateLike != null && islocateLike.trim().length() > 0) {
			if (!islocateLike.startsWith("%")) {
				islocateLike = "%" + islocateLike;
			}
			if (!islocateLike.endsWith("%")) {
				islocateLike = islocateLike + "%";
			}
		}
		return islocateLike;
	}

	public List<String> getIslocates() {
		return islocates;
	}

	public String getJactor() {
		return jactor;
	}

	public String getJactorLike() {
		if (jactorLike != null && jactorLike.trim().length() > 0) {
			if (!jactorLike.startsWith("%")) {
				jactorLike = "%" + jactorLike;
			}
			if (!jactorLike.endsWith("%")) {
				jactorLike = jactorLike + "%";
			}
		}
		return jactorLike;
	}

	public List<String> getJactors() {
		return jactors;
	}

	public String getJback() {
		return jback;
	}

	public String getJbackLike() {
		if (jbackLike != null && jbackLike.trim().length() > 0) {
			if (!jbackLike.startsWith("%")) {
				jbackLike = "%" + jbackLike;
			}
			if (!jbackLike.endsWith("%")) {
				jbackLike = jbackLike + "%";
			}
		}
		return jbackLike;
	}

	public List<String> getJbacks() {
		return jbacks;
	}

	public String getJbnum() {
		return jbnum;
	}

	public String getJbnumLike() {
		if (jbnumLike != null && jbnumLike.trim().length() > 0) {
			if (!jbnumLike.startsWith("%")) {
				jbnumLike = "%" + jbnumLike;
			}
			if (!jbnumLike.endsWith("%")) {
				jbnumLike = jbnumLike + "%";
			}
		}
		return jbnumLike;
	}

	public List<String> getJbnums() {
		return jbnums;
	}

	public String getJconten() {
		return jconten;
	}

	public String getJcontenLike() {
		if (jcontenLike != null && jcontenLike.trim().length() > 0) {
			if (!jcontenLike.startsWith("%")) {
				jcontenLike = "%" + jcontenLike;
			}
			if (!jcontenLike.endsWith("%")) {
				jcontenLike = jcontenLike + "%";
			}
		}
		return jcontenLike;
	}

	public List<String> getJcontens() {
		return jcontens;
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

	public String getJman() {
		return jman;
	}

	public String getJmanLike() {
		if (jmanLike != null && jmanLike.trim().length() > 0) {
			if (!jmanLike.startsWith("%")) {
				jmanLike = "%" + jmanLike;
			}
			if (!jmanLike.endsWith("%")) {
				jmanLike = jmanLike + "%";
			}
		}
		return jmanLike;
	}

	public List<String> getJmans() {
		return jmans;
	}

	public String getJnum() {
		return jnum;
	}

	public String getJnumLike() {
		if (jnumLike != null && jnumLike.trim().length() > 0) {
			if (!jnumLike.startsWith("%")) {
				jnumLike = "%" + jnumLike;
			}
			if (!jnumLike.endsWith("%")) {
				jnumLike = jnumLike + "%";
			}
		}
		return jnumLike;
	}

	public List<String> getJnums() {
		return jnums;
	}

	public String getJplace() {
		return jplace;
	}

	public String getJplaceLike() {
		if (jplaceLike != null && jplaceLike.trim().length() > 0) {
			if (!jplaceLike.startsWith("%")) {
				jplaceLike = "%" + jplaceLike;
			}
			if (!jplaceLike.endsWith("%")) {
				jplaceLike = jplaceLike + "%";
			}
		}
		return jplaceLike;
	}

	public List<String> getJplaces() {
		return jplaces;
	}

	public String getLcompany() {
		return lcompany;
	}

	public String getLcompanyLike() {
		if (lcompanyLike != null && lcompanyLike.trim().length() > 0) {
			if (!lcompanyLike.startsWith("%")) {
				lcompanyLike = "%" + lcompanyLike;
			}
			if (!lcompanyLike.endsWith("%")) {
				lcompanyLike = lcompanyLike + "%";
			}
		}
		return lcompanyLike;
	}

	public List<String> getLcompanys() {
		return lcompanys;
	}

	public String getLcontent() {
		return lcontent;
	}

	public String getLcontentLike() {
		if (lcontentLike != null && lcontentLike.trim().length() > 0) {
			if (!lcontentLike.startsWith("%")) {
				lcontentLike = "%" + lcontentLike;
			}
			if (!lcontentLike.endsWith("%")) {
				lcontentLike = lcontentLike + "%";
			}
		}
		return lcontentLike;
	}

	public List<String> getLcontents() {
		return lcontents;
	}

	public Date getLdate() {
		return ldate;
	}

	public Date getLdateGreaterThanOrEqual() {
		return ldateGreaterThanOrEqual;
	}

	public Date getLdateLessThanOrEqual() {
		return ldateLessThanOrEqual;
	}

	public List<Date> getLdates() {
		return ldates;
	}

	public Long getListId() {
		return listId;
	}

	public Long getListIdGreaterThanOrEqual() {
		return listIdGreaterThanOrEqual;
	}

	public Long getListIdLessThanOrEqual() {
		return listIdLessThanOrEqual;
	}

	public List<Long> getListIds() {
		return listIds;
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

	public String getLlen() {
		return llen;
	}

	public String getLlenLike() {
		if (llenLike != null && llenLike.trim().length() > 0) {
			if (!llenLike.startsWith("%")) {
				llenLike = "%" + llenLike;
			}
			if (!llenLike.endsWith("%")) {
				llenLike = llenLike + "%";
			}
		}
		return llenLike;
	}

	public List<String> getLlens() {
		return llens;
	}

	public String getLman() {
		return lman;
	}

	public String getLmanLike() {
		if (lmanLike != null && lmanLike.trim().length() > 0) {
			if (!lmanLike.startsWith("%")) {
				lmanLike = "%" + lmanLike;
			}
			if (!lmanLike.endsWith("%")) {
				lmanLike = lmanLike + "%";
			}
		}
		return lmanLike;
	}

	public List<String> getLmans() {
		return lmans;
	}

	public String getOldvid() {
		return oldvid;
	}

	public String getOldvidLike() {
		if (oldvidLike != null && oldvidLike.trim().length() > 0) {
			if (!oldvidLike.startsWith("%")) {
				oldvidLike = "%" + oldvidLike;
			}
			if (!oldvidLike.endsWith("%")) {
				oldvidLike = oldvidLike + "%";
			}
		}
		return oldvidLike;
	}

	public List<String> getOldvids() {
		return oldvids;
	}

	public String getOpenflag() {
		return openflag;
	}

	public String getOpenflagLike() {
		if (openflagLike != null && openflagLike.trim().length() > 0) {
			if (!openflagLike.startsWith("%")) {
				openflagLike = "%" + openflagLike;
			}
			if (!openflagLike.endsWith("%")) {
				openflagLike = openflagLike + "%";
			}
		}
		return openflagLike;
	}

	public List<String> getOpenflags() {
		return openflags;
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

	public Integer getPage() {
		return page;
	}

	public Integer getPageGreaterThanOrEqual() {
		return pageGreaterThanOrEqual;
	}

	public Integer getPageLessThanOrEqual() {
		return pageLessThanOrEqual;
	}

	public String getPageno() {
		return pageno;
	}

	public String getPagenoLike() {
		if (pagenoLike != null && pagenoLike.trim().length() > 0) {
			if (!pagenoLike.startsWith("%")) {
				pagenoLike = "%" + pagenoLike;
			}
			if (!pagenoLike.endsWith("%")) {
				pagenoLike = pagenoLike + "%";
			}
		}
		return pagenoLike;
	}

	public List<String> getPagenos() {
		return pagenos;
	}

	public List<Integer> getPages() {
		return pages;
	}

	public String getPagetype() {
		return pagetype;
	}

	public String getPagetypeLike() {
		if (pagetypeLike != null && pagetypeLike.trim().length() > 0) {
			if (!pagetypeLike.startsWith("%")) {
				pagetypeLike = "%" + pagetypeLike;
			}
			if (!pagetypeLike.endsWith("%")) {
				pagetypeLike = pagetypeLike + "%";
			}
		}
		return pagetypeLike;
	}

	public List<String> getPagetypes() {
		return pagetypes;
	}

	public String getPicnum() {
		return picnum;
	}

	public String getPicnumLike() {
		if (picnumLike != null && picnumLike.trim().length() > 0) {
			if (!picnumLike.startsWith("%")) {
				picnumLike = "%" + picnumLike;
			}
			if (!picnumLike.endsWith("%")) {
				picnumLike = picnumLike + "%";
			}
		}
		return picnumLike;
	}

	public List<String> getPicnums() {
		return picnums;
	}

	public Integer getPid() {
		return pid;
	}

	public Integer getPidGreaterThanOrEqual() {
		return pidGreaterThanOrEqual;
	}

	public Integer getPidLessThanOrEqual() {
		return pidLessThanOrEqual;
	}

	public List<Integer> getPids() {
		return pids;
	}

	public Integer getProjid() {
		return projid;
	}

	public Integer getProjidGreaterThanOrEqual() {
		return projidGreaterThanOrEqual;
	}

	public Integer getProjidLessThanOrEqual() {
		return projidLessThanOrEqual;
	}

	public List<Integer> getProjids() {
		return projids;
	}

	public Integer getProjIndex() {
		return projIndex;
	}

	public Integer getProjIndexGreaterThanOrEqual() {
		return projIndexGreaterThanOrEqual;
	}

	public Integer getProjIndexLessThanOrEqual() {
		return projIndexLessThanOrEqual;
	}

	public List<Integer> getProjIndexs() {
		return projIndexs;
	}

	public String getPtext() {
		return ptext;
	}

	public String getPtextLike() {
		if (ptextLike != null && ptextLike.trim().length() > 0) {
			if (!ptextLike.startsWith("%")) {
				ptextLike = "%" + ptextLike;
			}
			if (!ptextLike.endsWith("%")) {
				ptextLike = ptextLike + "%";
			}
		}
		return ptextLike;
	}

	public List<String> getPtexts() {
		return ptexts;
	}

	public String getRecnum() {
		return recnum;
	}

	public String getRecnumLike() {
		if (recnumLike != null && recnumLike.trim().length() > 0) {
			if (!recnumLike.startsWith("%")) {
				recnumLike = "%" + recnumLike;
			}
			if (!recnumLike.endsWith("%")) {
				recnumLike = recnumLike + "%";
			}
		}
		return recnumLike;
	}

	public List<String> getRecnums() {
		return recnums;
	}

	public String getSaveflag() {
		return saveflag;
	}

	public String getSaveflagLike() {
		if (saveflagLike != null && saveflagLike.trim().length() > 0) {
			if (!saveflagLike.startsWith("%")) {
				saveflagLike = "%" + saveflagLike;
			}
			if (!saveflagLike.endsWith("%")) {
				saveflagLike = saveflagLike + "%";
			}
		}
		return saveflagLike;
	}

	public List<String> getSaveflags() {
		return saveflags;
	}

	public String getSavetime() {
		return savetime;
	}

	public String getSavetimeLike() {
		if (savetimeLike != null && savetimeLike.trim().length() > 0) {
			if (!savetimeLike.startsWith("%")) {
				savetimeLike = "%" + savetimeLike;
			}
			if (!savetimeLike.endsWith("%")) {
				savetimeLike = savetimeLike + "%";
			}
		}
		return savetimeLike;
	}

	public List<String> getSavetimes() {
		return savetimes;
	}

	public String getSendflag() {
		return sendflag;
	}

	public String getSendflagLike() {
		if (sendflagLike != null && sendflagLike.trim().length() > 0) {
			if (!sendflagLike.startsWith("%")) {
				sendflagLike = "%" + sendflagLike;
			}
			if (!sendflagLike.endsWith("%")) {
				sendflagLike = sendflagLike + "%";
			}
		}
		return sendflagLike;
	}

	public List<String> getSendflags() {
		return sendflags;
	}

	public String getSlevel() {
		return slevel;
	}

	public String getSlevelLike() {
		if (slevelLike != null && slevelLike.trim().length() > 0) {
			if (!slevelLike.startsWith("%")) {
				slevelLike = "%" + slevelLike;
			}
			if (!slevelLike.endsWith("%")) {
				slevelLike = slevelLike + "%";
			}
		}
		return slevelLike;
	}

	public List<String> getSlevels() {
		return slevels;
	}

	public String getSummary() {
		return summary;
	}

	public String getSummaryLike() {
		if (summaryLike != null && summaryLike.trim().length() > 0) {
			if (!summaryLike.startsWith("%")) {
				summaryLike = "%" + summaryLike;
			}
			if (!summaryLike.endsWith("%")) {
				summaryLike = summaryLike + "%";
			}
		}
		return summaryLike;
	}

	public List<String> getSummarys() {
		return summarys;
	}

	public String getTagnum() {
		return tagnum;
	}

	public String getTagnumLike() {
		if (tagnumLike != null && tagnumLike.trim().length() > 0) {
			if (!tagnumLike.startsWith("%")) {
				tagnumLike = "%" + tagnumLike;
			}
			if (!tagnumLike.endsWith("%")) {
				tagnumLike = tagnumLike + "%";
			}
		}
		return tagnumLike;
	}

	public List<String> getTagnums() {
		return tagnums;
	}

	public String getTassessor() {
		return tassessor;
	}

	public String getTassessorLike() {
		if (tassessorLike != null && tassessorLike.trim().length() > 0) {
			if (!tassessorLike.startsWith("%")) {
				tassessorLike = "%" + tassessorLike;
			}
			if (!tassessorLike.endsWith("%")) {
				tassessorLike = tassessorLike + "%";
			}
		}
		return tassessorLike;
	}

	public List<String> getTassessors() {
		return tassessors;
	}

	public String getTdesigner() {
		return tdesigner;
	}

	public String getTdesignerLike() {
		if (tdesignerLike != null && tdesignerLike.trim().length() > 0) {
			if (!tdesignerLike.startsWith("%")) {
				tdesignerLike = "%" + tdesignerLike;
			}
			if (!tdesignerLike.endsWith("%")) {
				tdesignerLike = tdesignerLike + "%";
			}
		}
		return tdesignerLike;
	}

	public List<String> getTdesigners() {
		return tdesigners;
	}

	public String getTflag() {
		return tflag;
	}

	public String getTflagLike() {
		if (tflagLike != null && tflagLike.trim().length() > 0) {
			if (!tflagLike.startsWith("%")) {
				tflagLike = "%" + tflagLike;
			}
			if (!tflagLike.endsWith("%")) {
				tflagLike = tflagLike + "%";
			}
		}
		return tflagLike;
	}

	public List<String> getTflags() {
		return tflags;
	}

	public String getThematic() {
		return thematic;
	}

	public String getThematicLike() {
		if (thematicLike != null && thematicLike.trim().length() > 0) {
			if (!thematicLike.startsWith("%")) {
				thematicLike = "%" + thematicLike;
			}
			if (!thematicLike.endsWith("%")) {
				thematicLike = thematicLike + "%";
			}
		}
		return thematicLike;
	}

	public List<String> getThematics() {
		return thematics;
	}

	public String getTname() {
		return tname;
	}

	public String getTnameLike() {
		if (tnameLike != null && tnameLike.trim().length() > 0) {
			if (!tnameLike.startsWith("%")) {
				tnameLike = "%" + tnameLike;
			}
			if (!tnameLike.endsWith("%")) {
				tnameLike = tnameLike + "%";
			}
		}
		return tnameLike;
	}

	public List<String> getTnames() {
		return tnames;
	}

	public String getTnum() {
		return tnum;
	}

	public String getTnumLike() {
		if (tnumLike != null && tnumLike.trim().length() > 0) {
			if (!tnumLike.startsWith("%")) {
				tnumLike = "%" + tnumLike;
			}
			if (!tnumLike.endsWith("%")) {
				tnumLike = tnumLike + "%";
			}
		}
		return tnumLike;
	}

	public List<String> getTnums() {
		return tnums;
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

	public String getTopnodem() {
		return topnodem;
	}

	public String getTopnodemLike() {
		if (topnodemLike != null && topnodemLike.trim().length() > 0) {
			if (!topnodemLike.startsWith("%")) {
				topnodemLike = "%" + topnodemLike;
			}
			if (!topnodemLike.endsWith("%")) {
				topnodemLike = topnodemLike + "%";
			}
		}
		return topnodemLike;
	}

	public List<String> getTopnodems() {
		return topnodems;
	}

	public List<String> getTopnodes() {
		return topnodes;
	}

	public Integer getTotal() {
		return total;
	}

	public Integer getTotalGreaterThanOrEqual() {
		return totalGreaterThanOrEqual;
	}

	public Integer getTotalLessThanOrEqual() {
		return totalLessThanOrEqual;
	}

	public String getTotalnum() {
		return totalnum;
	}

	public String getTotalnumLike() {
		if (totalnumLike != null && totalnumLike.trim().length() > 0) {
			if (!totalnumLike.startsWith("%")) {
				totalnumLike = "%" + totalnumLike;
			}
			if (!totalnumLike.endsWith("%")) {
				totalnumLike = totalnumLike + "%";
			}
		}
		return totalnumLike;
	}

	public List<String> getTotalnums() {
		return totalnums;
	}

	public List<Integer> getTotals() {
		return totals;
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

	public Integer getTreeList() {
		return treeList;
	}

	public Integer getTreeListGreaterThanOrEqual() {
		return treeListGreaterThanOrEqual;
	}

	public Integer getTreeListLessThanOrEqual() {
		return treeListLessThanOrEqual;
	}

	public List<Integer> getTreeLists() {
		return treeLists;
	}

	public Integer getTreeParent() {
		return treeParent;
	}

	public Integer getTreeParentGreaterThanOrEqual() {
		return treeParentGreaterThanOrEqual;
	}

	public Integer getTreeParentLessThanOrEqual() {
		return treeParentLessThanOrEqual;
	}

	public List<Integer> getTreeParents() {
		return treeParents;
	}

	public String getTviewer() {
		return tviewer;
	}

	public String getTviewerLike() {
		if (tviewerLike != null && tviewerLike.trim().length() > 0) {
			if (!tviewerLike.startsWith("%")) {
				tviewerLike = "%" + tviewerLike;
			}
			if (!tviewerLike.endsWith("%")) {
				tviewerLike = tviewerLike + "%";
			}
		}
		return tviewerLike;
	}

	public List<String> getTviewers() {
		return tviewers;
	}

	public String getTvision() {
		return tvision;
	}

	public String getTvisionLike() {
		if (tvisionLike != null && tvisionLike.trim().length() > 0) {
			if (!tvisionLike.startsWith("%")) {
				tvisionLike = "%" + tvisionLike;
			}
			if (!tvisionLike.endsWith("%")) {
				tvisionLike = tvisionLike + "%";
			}
		}
		return tvisionLike;
	}

	public List<String> getTvisions() {
		return tvisions;
	}

	public String getTzoom() {
		return tzoom;
	}

	public String getTzoomLike() {
		if (tzoomLike != null && tzoomLike.trim().length() > 0) {
			if (!tzoomLike.startsWith("%")) {
				tzoomLike = "%" + tzoomLike;
			}
			if (!tzoomLike.endsWith("%")) {
				tzoomLike = tzoomLike + "%";
			}
		}
		return tzoomLike;
	}

	public List<String> getTzooms() {
		return tzooms;
	}

	public String getVid() {
		return vid;
	}

	public String getVidLike() {
		if (vidLike != null && vidLike.trim().length() > 0) {
			if (!vidLike.startsWith("%")) {
				vidLike = "%" + vidLike;
			}
			if (!vidLike.endsWith("%")) {
				vidLike = vidLike + "%";
			}
		}
		return vidLike;
	}

	public List<String> getVids() {
		return vids;
	}

	public String getVisflag() {
		return visflag;
	}

	public String getVisflagLike() {
		if (visflagLike != null && visflagLike.trim().length() > 0) {
			if (!visflagLike.startsWith("%")) {
				visflagLike = "%" + visflagLike;
			}
			if (!visflagLike.endsWith("%")) {
				visflagLike = visflagLike + "%";
			}
		}
		return visflagLike;
	}

	public List<String> getVisflags() {
		return visflags;
	}

	public String getVnum() {
		return vnum;
	}

	public String getVnumLike() {
		if (vnumLike != null && vnumLike.trim().length() > 0) {
			if (!vnumLike.startsWith("%")) {
				vnumLike = "%" + vnumLike;
			}
			if (!vnumLike.endsWith("%")) {
				vnumLike = vnumLike + "%";
			}
		}
		return vnumLike;
	}

	public List<String> getVnums() {
		return vnums;
	}

	public String getWcompany() {
		return wcompany;
	}

	public String getWcompanyID() {
		return wcompanyID;
	}

	public String getWcompanyIDLike() {
		if (wcompanyIDLike != null && wcompanyIDLike.trim().length() > 0) {
			if (!wcompanyIDLike.startsWith("%")) {
				wcompanyIDLike = "%" + wcompanyIDLike;
			}
			if (!wcompanyIDLike.endsWith("%")) {
				wcompanyIDLike = wcompanyIDLike + "%";
			}
		}
		return wcompanyIDLike;
	}

	public List<String> getWcompanyIDs() {
		return wcompanyIDs;
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

	public Integer getYear() {
		return year;
	}

	public Integer getYearGreaterThanOrEqual() {
		return yearGreaterThanOrEqual;
	}

	public Integer getYearLessThanOrEqual() {
		return yearLessThanOrEqual;
	}

	public List<Integer> getYears() {
		return years;
	}

	public PfileQuery glidenum(String glidenum) {
		if (glidenum == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenum = glidenum;
		return this;
	}

	public PfileQuery glidenumLike(String glidenumLike) {
		if (glidenumLike == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenumLike = glidenumLike;
		return this;
	}

	public PfileQuery glidenums(List<String> glidenums) {
		if (glidenums == null) {
			throw new RuntimeException("glidenums is empty ");
		}
		this.glidenums = glidenums;
		return this;
	}

	public PfileQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public PfileQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public PfileQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public PfileQuery indexIds(List<Integer> indexIds) {
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
		addColumn("efilenum", "efilenum");
		addColumn("listnum", "listnum");
		addColumn("listId", "list_id");
		addColumn("indexId", "index_id");
		addColumn("pid", "pid");
		addColumn("projid", "projid");
		addColumn("dwid", "dwid");
		addColumn("fbid", "fbid");
		addColumn("fxid", "fxid");
		addColumn("jid", "jid");
		addColumn("flid", "flid");
		addColumn("topnode", "topnode");
		addColumn("topnodem", "topnodem");
		addColumn("vid", "vid");
		addColumn("oldvid", "oldvid");
		addColumn("visflag", "visflag");
		addColumn("listno", "listno");
		addColumn("filingflag", "filingflag");
		addColumn("saveflag", "saveflag");
		addColumn("openflag", "openflag");
		addColumn("checkupflag", "checkupflag");
		addColumn("finishflag", "finishflag");
		addColumn("fromID", "fromID");
		addColumn("tname", "tname");
		addColumn("duty", "duty");
		addColumn("tagnum", "tagnum");
		addColumn("filenum", "filenum");
		addColumn("thematic", "thematic");
		addColumn("ctime", "ctime");
		addColumn("pageno", "pageno");
		addColumn("slevel", "slevel");
		addColumn("page", "page");
		addColumn("filetype", "filetype");
		addColumn("fontsnum", "fontsnum");
		addColumn("savetime", "savetime");
		addColumn("company", "company");
		addColumn("year", "year");
		addColumn("fileatt", "fileatt");
		addColumn("annotations", "annotations");
		addColumn("carriertype", "carriertype");
		addColumn("summary", "summary");
		addColumn("ptext", "ptext");
		addColumn("carrieru", "carrieru");
		addColumn("glidenum", "glidenum");
		addColumn("efile", "efile");
		addColumn("ftime", "ftime");
		addColumn("totalnum", "totalnum");
		addColumn("inputman", "inputman");
		addColumn("etime", "etime");
		addColumn("dotnum", "dotnum");
		addColumn("picnum", "picnum");
		addColumn("recnum", "recnum");
		addColumn("total", "total");
		addColumn("pagetype", "pagetype");
		addColumn("iscom", "iscom");
		addColumn("islocate", "islocate");
		addColumn("wcompany", "wcompany");
		addColumn("wcompanyID", "wcompanyID");
		addColumn("sendflag", "sendflag");
		addColumn("lcontent", "lcontent");
		addColumn("lcompany", "lcompany");
		addColumn("lman", "lman");
		addColumn("llen", "llen");
		addColumn("ldate", "ldate");
		addColumn("jconten", "jconten");
		addColumn("jplace", "jplace");
		addColumn("jman", "jman");
		addColumn("jback", "jback");
		addColumn("jactor", "jactor");
		addColumn("jnum", "jnum");
		addColumn("jbnum", "jbnum");
		addColumn("tnum", "tnum");
		addColumn("tzoom", "tzoom");
		addColumn("tflag", "tflag");
		addColumn("tdesigner", "tdesigner");
		addColumn("tviewer", "tviewer");
		addColumn("tassessor", "tassessor");
		addColumn("tvision", "tvision");
		addColumn("clistno", "clistno");
		addColumn("cpageno", "cpageno");
		addColumn("vnum", "vnum");
		addColumn("cvnum", "cvnum");
		addColumn("treeDliststr", "tree_dliststr");
		addColumn("ctimeEnd", "ctime_end");
		addColumn("projIndex", "proj_index");
		addColumn("treeParent", "tree_parent");
		addColumn("treeList", "tree_list");
	}

	public PfileQuery inputman(String inputman) {
		if (inputman == null) {
			throw new RuntimeException("inputman is null");
		}
		this.inputman = inputman;
		return this;
	}

	public PfileQuery inputmanLike(String inputmanLike) {
		if (inputmanLike == null) {
			throw new RuntimeException("inputman is null");
		}
		this.inputmanLike = inputmanLike;
		return this;
	}

	public PfileQuery inputmans(List<String> inputmans) {
		if (inputmans == null) {
			throw new RuntimeException("inputmans is empty ");
		}
		this.inputmans = inputmans;
		return this;
	}

	public PfileQuery iscom(String iscom) {
		if (iscom == null) {
			throw new RuntimeException("iscom is null");
		}
		this.iscom = iscom;
		return this;
	}

	public PfileQuery iscomLike(String iscomLike) {
		if (iscomLike == null) {
			throw new RuntimeException("iscom is null");
		}
		this.iscomLike = iscomLike;
		return this;
	}

	public PfileQuery iscoms(List<String> iscoms) {
		if (iscoms == null) {
			throw new RuntimeException("iscoms is empty ");
		}
		this.iscoms = iscoms;
		return this;
	}

	public PfileQuery islocate(String islocate) {
		if (islocate == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocate = islocate;
		return this;
	}

	public PfileQuery islocateLike(String islocateLike) {
		if (islocateLike == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocateLike = islocateLike;
		return this;
	}

	public PfileQuery islocates(List<String> islocates) {
		if (islocates == null) {
			throw new RuntimeException("islocates is empty ");
		}
		this.islocates = islocates;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public PfileQuery jactor(String jactor) {
		if (jactor == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactor = jactor;
		return this;
	}

	public PfileQuery jactorLike(String jactorLike) {
		if (jactorLike == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactorLike = jactorLike;
		return this;
	}

	public PfileQuery jactors(List<String> jactors) {
		if (jactors == null) {
			throw new RuntimeException("jactors is empty ");
		}
		this.jactors = jactors;
		return this;
	}

	public PfileQuery jback(String jback) {
		if (jback == null) {
			throw new RuntimeException("jback is null");
		}
		this.jback = jback;
		return this;
	}

	public PfileQuery jbackLike(String jbackLike) {
		if (jbackLike == null) {
			throw new RuntimeException("jback is null");
		}
		this.jbackLike = jbackLike;
		return this;
	}

	public PfileQuery jbacks(List<String> jbacks) {
		if (jbacks == null) {
			throw new RuntimeException("jbacks is empty ");
		}
		this.jbacks = jbacks;
		return this;
	}

	public PfileQuery jbnum(String jbnum) {
		if (jbnum == null) {
			throw new RuntimeException("jbnum is null");
		}
		this.jbnum = jbnum;
		return this;
	}

	public PfileQuery jbnumLike(String jbnumLike) {
		if (jbnumLike == null) {
			throw new RuntimeException("jbnum is null");
		}
		this.jbnumLike = jbnumLike;
		return this;
	}

	public PfileQuery jbnums(List<String> jbnums) {
		if (jbnums == null) {
			throw new RuntimeException("jbnums is empty ");
		}
		this.jbnums = jbnums;
		return this;
	}

	public PfileQuery jconten(String jconten) {
		if (jconten == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jconten = jconten;
		return this;
	}

	public PfileQuery jcontenLike(String jcontenLike) {
		if (jcontenLike == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jcontenLike = jcontenLike;
		return this;
	}

	public PfileQuery jcontens(List<String> jcontens) {
		if (jcontens == null) {
			throw new RuntimeException("jcontens is empty ");
		}
		this.jcontens = jcontens;
		return this;
	}

	public PfileQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public PfileQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public PfileQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public PfileQuery jman(String jman) {
		if (jman == null) {
			throw new RuntimeException("jman is null");
		}
		this.jman = jman;
		return this;
	}

	public PfileQuery jmanLike(String jmanLike) {
		if (jmanLike == null) {
			throw new RuntimeException("jman is null");
		}
		this.jmanLike = jmanLike;
		return this;
	}

	public PfileQuery jmans(List<String> jmans) {
		if (jmans == null) {
			throw new RuntimeException("jmans is empty ");
		}
		this.jmans = jmans;
		return this;
	}

	public PfileQuery jnum(String jnum) {
		if (jnum == null) {
			throw new RuntimeException("jnum is null");
		}
		this.jnum = jnum;
		return this;
	}

	public PfileQuery jnumLike(String jnumLike) {
		if (jnumLike == null) {
			throw new RuntimeException("jnum is null");
		}
		this.jnumLike = jnumLike;
		return this;
	}

	public PfileQuery jnums(List<String> jnums) {
		if (jnums == null) {
			throw new RuntimeException("jnums is empty ");
		}
		this.jnums = jnums;
		return this;
	}

	public PfileQuery jplace(String jplace) {
		if (jplace == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplace = jplace;
		return this;
	}

	public PfileQuery jplaceLike(String jplaceLike) {
		if (jplaceLike == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplaceLike = jplaceLike;
		return this;
	}

	public PfileQuery jplaces(List<String> jplaces) {
		if (jplaces == null) {
			throw new RuntimeException("jplaces is empty ");
		}
		this.jplaces = jplaces;
		return this;
	}

	public PfileQuery lcompany(String lcompany) {
		if (lcompany == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompany = lcompany;
		return this;
	}

	public PfileQuery lcompanyLike(String lcompanyLike) {
		if (lcompanyLike == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompanyLike = lcompanyLike;
		return this;
	}

	public PfileQuery lcompanys(List<String> lcompanys) {
		if (lcompanys == null) {
			throw new RuntimeException("lcompanys is empty ");
		}
		this.lcompanys = lcompanys;
		return this;
	}

	public PfileQuery lcontent(String lcontent) {
		if (lcontent == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontent = lcontent;
		return this;
	}

	public PfileQuery lcontentLike(String lcontentLike) {
		if (lcontentLike == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontentLike = lcontentLike;
		return this;
	}

	public PfileQuery lcontents(List<String> lcontents) {
		if (lcontents == null) {
			throw new RuntimeException("lcontents is empty ");
		}
		this.lcontents = lcontents;
		return this;
	}

	public PfileQuery ldate(Date ldate) {
		if (ldate == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldate = ldate;
		return this;
	}

	public PfileQuery ldateGreaterThanOrEqual(Date ldateGreaterThanOrEqual) {
		if (ldateGreaterThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateGreaterThanOrEqual = ldateGreaterThanOrEqual;
		return this;
	}

	public PfileQuery ldateLessThanOrEqual(Date ldateLessThanOrEqual) {
		if (ldateLessThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateLessThanOrEqual = ldateLessThanOrEqual;
		return this;
	}

	public PfileQuery ldates(List<Date> ldates) {
		if (ldates == null) {
			throw new RuntimeException("ldates is empty ");
		}
		this.ldates = ldates;
		return this;
	}

	public PfileQuery listId(Long listId) {
		if (listId == null) {
			throw new RuntimeException("listId is null");
		}
		this.listId = listId;
		return this;
	}

	public PfileQuery listIdGreaterThanOrEqual(Long listIdGreaterThanOrEqual) {
		if (listIdGreaterThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdGreaterThanOrEqual = listIdGreaterThanOrEqual;
		return this;
	}

	public PfileQuery listIdLessThanOrEqual(Long listIdLessThanOrEqual) {
		if (listIdLessThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdLessThanOrEqual = listIdLessThanOrEqual;
		return this;
	}

	public PfileQuery listIds(List<Long> listIds) {
		if (listIds == null) {
			throw new RuntimeException("listIds is empty ");
		}
		this.listIds = listIds;
		return this;
	}

	public PfileQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public PfileQuery listnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public PfileQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public PfileQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public PfileQuery listnum(String listnum) {
		if (listnum == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnum = listnum;
		return this;
	}

	public PfileQuery listnumLike(String listnumLike) {
		if (listnumLike == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnumLike = listnumLike;
		return this;
	}

	public PfileQuery listnums(List<String> listnums) {
		if (listnums == null) {
			throw new RuntimeException("listnums is empty ");
		}
		this.listnums = listnums;
		return this;
	}

	public PfileQuery llen(String llen) {
		if (llen == null) {
			throw new RuntimeException("llen is null");
		}
		this.llen = llen;
		return this;
	}

	public PfileQuery llenLike(String llenLike) {
		if (llenLike == null) {
			throw new RuntimeException("llen is null");
		}
		this.llenLike = llenLike;
		return this;
	}

	public PfileQuery llens(List<String> llens) {
		if (llens == null) {
			throw new RuntimeException("llens is empty ");
		}
		this.llens = llens;
		return this;
	}

	public PfileQuery lman(String lman) {
		if (lman == null) {
			throw new RuntimeException("lman is null");
		}
		this.lman = lman;
		return this;
	}

	public PfileQuery lmanLike(String lmanLike) {
		if (lmanLike == null) {
			throw new RuntimeException("lman is null");
		}
		this.lmanLike = lmanLike;
		return this;
	}

	public PfileQuery lmans(List<String> lmans) {
		if (lmans == null) {
			throw new RuntimeException("lmans is empty ");
		}
		this.lmans = lmans;
		return this;
	}

	public PfileQuery oldvid(String oldvid) {
		if (oldvid == null) {
			throw new RuntimeException("oldvid is null");
		}
		this.oldvid = oldvid;
		return this;
	}

	public PfileQuery oldvidLike(String oldvidLike) {
		if (oldvidLike == null) {
			throw new RuntimeException("oldvid is null");
		}
		this.oldvidLike = oldvidLike;
		return this;
	}

	public PfileQuery oldvids(List<String> oldvids) {
		if (oldvids == null) {
			throw new RuntimeException("oldvids is empty ");
		}
		this.oldvids = oldvids;
		return this;
	}

	public PfileQuery openflag(String openflag) {
		if (openflag == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflag = openflag;
		return this;
	}

	public PfileQuery openflagLike(String openflagLike) {
		if (openflagLike == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflagLike = openflagLike;
		return this;
	}

	public PfileQuery openflags(List<String> openflags) {
		if (openflags == null) {
			throw new RuntimeException("openflags is empty ");
		}
		this.openflags = openflags;
		return this;
	}

	public PfileQuery page(Integer page) {
		if (page == null) {
			throw new RuntimeException("page is null");
		}
		this.page = page;
		return this;
	}

	public PfileQuery pageGreaterThanOrEqual(Integer pageGreaterThanOrEqual) {
		if (pageGreaterThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
		return this;
	}

	public PfileQuery pageLessThanOrEqual(Integer pageLessThanOrEqual) {
		if (pageLessThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageLessThanOrEqual = pageLessThanOrEqual;
		return this;
	}

	public PfileQuery pageno(String pageno) {
		if (pageno == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pageno = pageno;
		return this;
	}

	public PfileQuery pagenoLike(String pagenoLike) {
		if (pagenoLike == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pagenoLike = pagenoLike;
		return this;
	}

	public PfileQuery pagenos(List<String> pagenos) {
		if (pagenos == null) {
			throw new RuntimeException("pagenos is empty ");
		}
		this.pagenos = pagenos;
		return this;
	}

	public PfileQuery pages(List<Integer> pages) {
		if (pages == null) {
			throw new RuntimeException("pages is empty ");
		}
		this.pages = pages;
		return this;
	}

	public PfileQuery pagetype(String pagetype) {
		if (pagetype == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetype = pagetype;
		return this;
	}

	public PfileQuery pagetypeLike(String pagetypeLike) {
		if (pagetypeLike == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetypeLike = pagetypeLike;
		return this;
	}

	public PfileQuery pagetypes(List<String> pagetypes) {
		if (pagetypes == null) {
			throw new RuntimeException("pagetypes is empty ");
		}
		this.pagetypes = pagetypes;
		return this;
	}

	public PfileQuery picnum(String picnum) {
		if (picnum == null) {
			throw new RuntimeException("picnum is null");
		}
		this.picnum = picnum;
		return this;
	}

	public PfileQuery picnumLike(String picnumLike) {
		if (picnumLike == null) {
			throw new RuntimeException("picnum is null");
		}
		this.picnumLike = picnumLike;
		return this;
	}

	public PfileQuery picnums(List<String> picnums) {
		if (picnums == null) {
			throw new RuntimeException("picnums is empty ");
		}
		this.picnums = picnums;
		return this;
	}

	public PfileQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public PfileQuery pidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		if (pidGreaterThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
		return this;
	}

	public PfileQuery pidLessThanOrEqual(Integer pidLessThanOrEqual) {
		if (pidLessThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidLessThanOrEqual = pidLessThanOrEqual;
		return this;
	}

	public PfileQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public PfileQuery projid(Integer projid) {
		if (projid == null) {
			throw new RuntimeException("projid is null");
		}
		this.projid = projid;
		return this;
	}

	public PfileQuery projidGreaterThanOrEqual(Integer projidGreaterThanOrEqual) {
		if (projidGreaterThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidGreaterThanOrEqual = projidGreaterThanOrEqual;
		return this;
	}

	public PfileQuery projidLessThanOrEqual(Integer projidLessThanOrEqual) {
		if (projidLessThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidLessThanOrEqual = projidLessThanOrEqual;
		return this;
	}

	public PfileQuery projids(List<Integer> projids) {
		if (projids == null) {
			throw new RuntimeException("projids is empty ");
		}
		this.projids = projids;
		return this;
	}

	public PfileQuery projIndex(Integer projIndex) {
		if (projIndex == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndex = projIndex;
		return this;
	}

	public PfileQuery projIndexGreaterThanOrEqual(
			Integer projIndexGreaterThanOrEqual) {
		if (projIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexGreaterThanOrEqual = projIndexGreaterThanOrEqual;
		return this;
	}

	public PfileQuery projIndexLessThanOrEqual(Integer projIndexLessThanOrEqual) {
		if (projIndexLessThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexLessThanOrEqual = projIndexLessThanOrEqual;
		return this;
	}

	public PfileQuery projIndexs(List<Integer> projIndexs) {
		if (projIndexs == null) {
			throw new RuntimeException("projIndexs is empty ");
		}
		this.projIndexs = projIndexs;
		return this;
	}

	public PfileQuery ptext(String ptext) {
		if (ptext == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptext = ptext;
		return this;
	}

	public PfileQuery ptextLike(String ptextLike) {
		if (ptextLike == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptextLike = ptextLike;
		return this;
	}

	public PfileQuery ptexts(List<String> ptexts) {
		if (ptexts == null) {
			throw new RuntimeException("ptexts is empty ");
		}
		this.ptexts = ptexts;
		return this;
	}

	public PfileQuery recnum(String recnum) {
		if (recnum == null) {
			throw new RuntimeException("recnum is null");
		}
		this.recnum = recnum;
		return this;
	}

	public PfileQuery recnumLike(String recnumLike) {
		if (recnumLike == null) {
			throw new RuntimeException("recnum is null");
		}
		this.recnumLike = recnumLike;
		return this;
	}

	public PfileQuery recnums(List<String> recnums) {
		if (recnums == null) {
			throw new RuntimeException("recnums is empty ");
		}
		this.recnums = recnums;
		return this;
	}

	public PfileQuery saveflag(String saveflag) {
		if (saveflag == null) {
			throw new RuntimeException("saveflag is null");
		}
		this.saveflag = saveflag;
		return this;
	}

	public PfileQuery saveflagLike(String saveflagLike) {
		if (saveflagLike == null) {
			throw new RuntimeException("saveflag is null");
		}
		this.saveflagLike = saveflagLike;
		return this;
	}

	public PfileQuery saveflags(List<String> saveflags) {
		if (saveflags == null) {
			throw new RuntimeException("saveflags is empty ");
		}
		this.saveflags = saveflags;
		return this;
	}

	public PfileQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public PfileQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public PfileQuery savetimes(List<String> savetimes) {
		if (savetimes == null) {
			throw new RuntimeException("savetimes is empty ");
		}
		this.savetimes = savetimes;
		return this;
	}

	public PfileQuery sendflag(String sendflag) {
		if (sendflag == null) {
			throw new RuntimeException("sendflag is null");
		}
		this.sendflag = sendflag;
		return this;
	}

	public PfileQuery sendflagLike(String sendflagLike) {
		if (sendflagLike == null) {
			throw new RuntimeException("sendflag is null");
		}
		this.sendflagLike = sendflagLike;
		return this;
	}

	public PfileQuery sendflags(List<String> sendflags) {
		if (sendflags == null) {
			throw new RuntimeException("sendflags is empty ");
		}
		this.sendflags = sendflags;
		return this;
	}

	public void setAnnotations(String annotations) {
		this.annotations = annotations;
	}

	public void setAnnotationsLike(String annotationsLike) {
		this.annotationsLike = annotationsLike;
	}

	public void setAnnotationss(List<String> annotationss) {
		this.annotationss = annotationss;
	}

	public void setCarriertype(String carriertype) {
		this.carriertype = carriertype;
	}

	public void setCarriertypeLike(String carriertypeLike) {
		this.carriertypeLike = carriertypeLike;
	}

	public void setCarriertypes(List<String> carriertypes) {
		this.carriertypes = carriertypes;
	}

	public void setCarrieru(String carrieru) {
		this.carrieru = carrieru;
	}

	public void setCarrieruLike(String carrieruLike) {
		this.carrieruLike = carrieruLike;
	}

	public void setCarrierus(List<String> carrierus) {
		this.carrierus = carrierus;
	}

	public void setCheckupflag(String checkupflag) {
		this.checkupflag = checkupflag;
	}

	public void setCheckupflagLike(String checkupflagLike) {
		this.checkupflagLike = checkupflagLike;
	}

	public void setCheckupflags(List<String> checkupflags) {
		this.checkupflags = checkupflags;
	}

	public void setClistno(Integer clistno) {
		this.clistno = clistno;
	}

	public void setClistnoGreaterThanOrEqual(Integer clistnoGreaterThanOrEqual) {
		this.clistnoGreaterThanOrEqual = clistnoGreaterThanOrEqual;
	}

	public void setClistnoLessThanOrEqual(Integer clistnoLessThanOrEqual) {
		this.clistnoLessThanOrEqual = clistnoLessThanOrEqual;
	}

	public void setClistnos(List<Integer> clistnos) {
		this.clistnos = clistnos;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setCompanyLike(String companyLike) {
		this.companyLike = companyLike;
	}

	public void setCompanys(List<String> companys) {
		this.companys = companys;
	}

	public void setCpageno(String cpageno) {
		this.cpageno = cpageno;
	}

	public void setCpagenoLike(String cpagenoLike) {
		this.cpagenoLike = cpagenoLike;
	}

	public void setCpagenos(List<String> cpagenos) {
		this.cpagenos = cpagenos;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public void setCtimeEnd(Date ctimeEnd) {
		this.ctimeEnd = ctimeEnd;
	}

	public void setCtimeEndGreaterThanOrEqual(Date ctimeEndGreaterThanOrEqual) {
		this.ctimeEndGreaterThanOrEqual = ctimeEndGreaterThanOrEqual;
	}

	public void setCtimeEndLessThanOrEqual(Date ctimeEndLessThanOrEqual) {
		this.ctimeEndLessThanOrEqual = ctimeEndLessThanOrEqual;
	}

	public void setCtimeEnds(List<Date> ctimeEnds) {
		this.ctimeEnds = ctimeEnds;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setCtimes(List<Date> ctimes) {
		this.ctimes = ctimes;
	}

	public void setCvnum(String cvnum) {
		this.cvnum = cvnum;
	}

	public void setCvnumLike(String cvnumLike) {
		this.cvnumLike = cvnumLike;
	}

	public void setCvnums(List<String> cvnums) {
		this.cvnums = cvnums;
	}

	public void setDotnum(String dotnum) {
		this.dotnum = dotnum;
	}

	public void setDotnumLike(String dotnumLike) {
		this.dotnumLike = dotnumLike;
	}

	public void setDotnums(List<String> dotnums) {
		this.dotnums = dotnums;
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

	public void setEfile(String efile) {
		this.efile = efile;
	}

	public void setEfileLike(String efileLike) {
		this.efileLike = efileLike;
	}

	public void setEfilenum(Integer efilenum) {
		this.efilenum = efilenum;
	}

	public void setEfilenumGreaterThanOrEqual(Integer efilenumGreaterThanOrEqual) {
		this.efilenumGreaterThanOrEqual = efilenumGreaterThanOrEqual;
	}

	public void setEfilenumLessThanOrEqual(Integer efilenumLessThanOrEqual) {
		this.efilenumLessThanOrEqual = efilenumLessThanOrEqual;
	}

	public void setEfilenums(List<Integer> efilenums) {
		this.efilenums = efilenums;
	}

	public void setEfiles(List<String> efiles) {
		this.efiles = efiles;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public void setEtimeGreaterThanOrEqual(Date etimeGreaterThanOrEqual) {
		this.etimeGreaterThanOrEqual = etimeGreaterThanOrEqual;
	}

	public void setEtimeLessThanOrEqual(Date etimeLessThanOrEqual) {
		this.etimeLessThanOrEqual = etimeLessThanOrEqual;
	}

	public void setEtimes(List<Date> etimes) {
		this.etimes = etimes;
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

	public void setFileatt(String fileatt) {
		this.fileatt = fileatt;
	}

	public void setFileattLike(String fileattLike) {
		this.fileattLike = fileattLike;
	}

	public void setFileatts(List<String> fileatts) {
		this.fileatts = fileatts;
	}

	public void setFilenum(String filenum) {
		this.filenum = filenum;
	}

	public void setFilenumLike(String filenumLike) {
		this.filenumLike = filenumLike;
	}

	public void setFilenums(List<String> filenums) {
		this.filenums = filenums;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public void setFiletypeLike(String filetypeLike) {
		this.filetypeLike = filetypeLike;
	}

	public void setFiletypes(List<String> filetypes) {
		this.filetypes = filetypes;
	}

	public void setFilingflag(String filingflag) {
		this.filingflag = filingflag;
	}

	public void setFilingflagLike(String filingflagLike) {
		this.filingflagLike = filingflagLike;
	}

	public void setFilingflags(List<String> filingflags) {
		this.filingflags = filingflags;
	}

	public void setFinishflag(String finishflag) {
		this.finishflag = finishflag;
	}

	public void setFinishflagLike(String finishflagLike) {
		this.finishflagLike = finishflagLike;
	}

	public void setFinishflags(List<String> finishflags) {
		this.finishflags = finishflags;
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

	public void setFontsnum(String fontsnum) {
		this.fontsnum = fontsnum;
	}

	public void setFontsnumLike(String fontsnumLike) {
		this.fontsnumLike = fontsnumLike;
	}

	public void setFontsnums(List<String> fontsnums) {
		this.fontsnums = fontsnums;
	}

	public void setFromID(String fromID) {
		this.fromID = fromID;
	}

	public void setFromIDLike(String fromIDLike) {
		this.fromIDLike = fromIDLike;
	}

	public void setFromIDs(List<String> fromIDs) {
		this.fromIDs = fromIDs;
	}

	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}

	public void setFtimeGreaterThanOrEqual(Date ftimeGreaterThanOrEqual) {
		this.ftimeGreaterThanOrEqual = ftimeGreaterThanOrEqual;
	}

	public void setFtimeLessThanOrEqual(Date ftimeLessThanOrEqual) {
		this.ftimeLessThanOrEqual = ftimeLessThanOrEqual;
	}

	public void setFtimes(List<Date> ftimes) {
		this.ftimes = ftimes;
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

	public void setGlidenum(String glidenum) {
		this.glidenum = glidenum;
	}

	public void setGlidenumLike(String glidenumLike) {
		this.glidenumLike = glidenumLike;
	}

	public void setGlidenums(List<String> glidenums) {
		this.glidenums = glidenums;
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

	public void setInputman(String inputman) {
		this.inputman = inputman;
	}

	public void setInputmanLike(String inputmanLike) {
		this.inputmanLike = inputmanLike;
	}

	public void setInputmans(List<String> inputmans) {
		this.inputmans = inputmans;
	}

	public void setIscom(String iscom) {
		this.iscom = iscom;
	}

	public void setIscomLike(String iscomLike) {
		this.iscomLike = iscomLike;
	}

	public void setIscoms(List<String> iscoms) {
		this.iscoms = iscoms;
	}

	public void setIslocate(String islocate) {
		this.islocate = islocate;
	}

	public void setIslocateLike(String islocateLike) {
		this.islocateLike = islocateLike;
	}

	public void setIslocates(List<String> islocates) {
		this.islocates = islocates;
	}

	public void setJactor(String jactor) {
		this.jactor = jactor;
	}

	public void setJactorLike(String jactorLike) {
		this.jactorLike = jactorLike;
	}

	public void setJactors(List<String> jactors) {
		this.jactors = jactors;
	}

	public void setJback(String jback) {
		this.jback = jback;
	}

	public void setJbackLike(String jbackLike) {
		this.jbackLike = jbackLike;
	}

	public void setJbacks(List<String> jbacks) {
		this.jbacks = jbacks;
	}

	public void setJbnum(String jbnum) {
		this.jbnum = jbnum;
	}

	public void setJbnumLike(String jbnumLike) {
		this.jbnumLike = jbnumLike;
	}

	public void setJbnums(List<String> jbnums) {
		this.jbnums = jbnums;
	}

	public void setJconten(String jconten) {
		this.jconten = jconten;
	}

	public void setJcontenLike(String jcontenLike) {
		this.jcontenLike = jcontenLike;
	}

	public void setJcontens(List<String> jcontens) {
		this.jcontens = jcontens;
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

	public void setJman(String jman) {
		this.jman = jman;
	}

	public void setJmanLike(String jmanLike) {
		this.jmanLike = jmanLike;
	}

	public void setJmans(List<String> jmans) {
		this.jmans = jmans;
	}

	public void setJnum(String jnum) {
		this.jnum = jnum;
	}

	public void setJnumLike(String jnumLike) {
		this.jnumLike = jnumLike;
	}

	public void setJnums(List<String> jnums) {
		this.jnums = jnums;
	}

	public void setJplace(String jplace) {
		this.jplace = jplace;
	}

	public void setJplaceLike(String jplaceLike) {
		this.jplaceLike = jplaceLike;
	}

	public void setJplaces(List<String> jplaces) {
		this.jplaces = jplaces;
	}

	public void setLcompany(String lcompany) {
		this.lcompany = lcompany;
	}

	public void setLcompanyLike(String lcompanyLike) {
		this.lcompanyLike = lcompanyLike;
	}

	public void setLcompanys(List<String> lcompanys) {
		this.lcompanys = lcompanys;
	}

	public void setLcontent(String lcontent) {
		this.lcontent = lcontent;
	}

	public void setLcontentLike(String lcontentLike) {
		this.lcontentLike = lcontentLike;
	}

	public void setLcontents(List<String> lcontents) {
		this.lcontents = lcontents;
	}

	public void setLdate(Date ldate) {
		this.ldate = ldate;
	}

	public void setLdateGreaterThanOrEqual(Date ldateGreaterThanOrEqual) {
		this.ldateGreaterThanOrEqual = ldateGreaterThanOrEqual;
	}

	public void setLdateLessThanOrEqual(Date ldateLessThanOrEqual) {
		this.ldateLessThanOrEqual = ldateLessThanOrEqual;
	}

	public void setLdates(List<Date> ldates) {
		this.ldates = ldates;
	}

	public void setListId(Long listId) {
		this.listId = listId;
	}

	public void setListIdGreaterThanOrEqual(Long listIdGreaterThanOrEqual) {
		this.listIdGreaterThanOrEqual = listIdGreaterThanOrEqual;
	}

	public void setListIdLessThanOrEqual(Long listIdLessThanOrEqual) {
		this.listIdLessThanOrEqual = listIdLessThanOrEqual;
	}

	public void setListIds(List<Long> listIds) {
		this.listIds = listIds;
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

	public void setLlen(String llen) {
		this.llen = llen;
	}

	public void setLlenLike(String llenLike) {
		this.llenLike = llenLike;
	}

	public void setLlens(List<String> llens) {
		this.llens = llens;
	}

	public void setLman(String lman) {
		this.lman = lman;
	}

	public void setLmanLike(String lmanLike) {
		this.lmanLike = lmanLike;
	}

	public void setLmans(List<String> lmans) {
		this.lmans = lmans;
	}

	public void setOldvid(String oldvid) {
		this.oldvid = oldvid;
	}

	public void setOldvidLike(String oldvidLike) {
		this.oldvidLike = oldvidLike;
	}

	public void setOldvids(List<String> oldvids) {
		this.oldvids = oldvids;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public void setOpenflagLike(String openflagLike) {
		this.openflagLike = openflagLike;
	}

	public void setOpenflags(List<String> openflags) {
		this.openflags = openflags;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setPageGreaterThanOrEqual(Integer pageGreaterThanOrEqual) {
		this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
	}

	public void setPageLessThanOrEqual(Integer pageLessThanOrEqual) {
		this.pageLessThanOrEqual = pageLessThanOrEqual;
	}

	public void setPageno(String pageno) {
		this.pageno = pageno;
	}

	public void setPagenoLike(String pagenoLike) {
		this.pagenoLike = pagenoLike;
	}

	public void setPagenos(List<String> pagenos) {
		this.pagenos = pagenos;
	}

	public void setPages(List<Integer> pages) {
		this.pages = pages;
	}

	public void setPagetype(String pagetype) {
		this.pagetype = pagetype;
	}

	public void setPagetypeLike(String pagetypeLike) {
		this.pagetypeLike = pagetypeLike;
	}

	public void setPagetypes(List<String> pagetypes) {
		this.pagetypes = pagetypes;
	}

	public void setPicnum(String picnum) {
		this.picnum = picnum;
	}

	public void setPicnumLike(String picnumLike) {
		this.picnumLike = picnumLike;
	}

	public void setPicnums(List<String> picnums) {
		this.picnums = picnums;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
	}

	public void setPidLessThanOrEqual(Integer pidLessThanOrEqual) {
		this.pidLessThanOrEqual = pidLessThanOrEqual;
	}

	public void setPids(List<Integer> pids) {
		this.pids = pids;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}

	public void setProjidGreaterThanOrEqual(Integer projidGreaterThanOrEqual) {
		this.projidGreaterThanOrEqual = projidGreaterThanOrEqual;
	}

	public void setProjidLessThanOrEqual(Integer projidLessThanOrEqual) {
		this.projidLessThanOrEqual = projidLessThanOrEqual;
	}

	public void setProjids(List<Integer> projids) {
		this.projids = projids;
	}

	public void setProjIndex(Integer projIndex) {
		this.projIndex = projIndex;
	}

	public void setProjIndexGreaterThanOrEqual(
			Integer projIndexGreaterThanOrEqual) {
		this.projIndexGreaterThanOrEqual = projIndexGreaterThanOrEqual;
	}

	public void setProjIndexLessThanOrEqual(Integer projIndexLessThanOrEqual) {
		this.projIndexLessThanOrEqual = projIndexLessThanOrEqual;
	}

	public void setProjIndexs(List<Integer> projIndexs) {
		this.projIndexs = projIndexs;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public void setPtextLike(String ptextLike) {
		this.ptextLike = ptextLike;
	}

	public void setPtexts(List<String> ptexts) {
		this.ptexts = ptexts;
	}

	public void setRecnum(String recnum) {
		this.recnum = recnum;
	}

	public void setRecnumLike(String recnumLike) {
		this.recnumLike = recnumLike;
	}

	public void setRecnums(List<String> recnums) {
		this.recnums = recnums;
	}

	public void setSaveflag(String saveflag) {
		this.saveflag = saveflag;
	}

	public void setSaveflagLike(String saveflagLike) {
		this.saveflagLike = saveflagLike;
	}

	public void setSaveflags(List<String> saveflags) {
		this.saveflags = saveflags;
	}

	public void setSavetime(String savetime) {
		this.savetime = savetime;
	}

	public void setSavetimeLike(String savetimeLike) {
		this.savetimeLike = savetimeLike;
	}

	public void setSavetimes(List<String> savetimes) {
		this.savetimes = savetimes;
	}

	public void setSendflag(String sendflag) {
		this.sendflag = sendflag;
	}

	public void setSendflagLike(String sendflagLike) {
		this.sendflagLike = sendflagLike;
	}

	public void setSendflags(List<String> sendflags) {
		this.sendflags = sendflags;
	}

	public void setSlevel(String slevel) {
		this.slevel = slevel;
	}

	public void setSlevelLike(String slevelLike) {
		this.slevelLike = slevelLike;
	}

	public void setSlevels(List<String> slevels) {
		this.slevels = slevels;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setSummaryLike(String summaryLike) {
		this.summaryLike = summaryLike;
	}

	public void setSummarys(List<String> summarys) {
		this.summarys = summarys;
	}

	public void setTagnum(String tagnum) {
		this.tagnum = tagnum;
	}

	public void setTagnumLike(String tagnumLike) {
		this.tagnumLike = tagnumLike;
	}

	public void setTagnums(List<String> tagnums) {
		this.tagnums = tagnums;
	}

	public void setTassessor(String tassessor) {
		this.tassessor = tassessor;
	}

	public void setTassessorLike(String tassessorLike) {
		this.tassessorLike = tassessorLike;
	}

	public void setTassessors(List<String> tassessors) {
		this.tassessors = tassessors;
	}

	public void setTdesigner(String tdesigner) {
		this.tdesigner = tdesigner;
	}

	public void setTdesignerLike(String tdesignerLike) {
		this.tdesignerLike = tdesignerLike;
	}

	public void setTdesigners(List<String> tdesigners) {
		this.tdesigners = tdesigners;
	}

	public void setTflag(String tflag) {
		this.tflag = tflag;
	}

	public void setTflagLike(String tflagLike) {
		this.tflagLike = tflagLike;
	}

	public void setTflags(List<String> tflags) {
		this.tflags = tflags;
	}

	public void setThematic(String thematic) {
		this.thematic = thematic;
	}

	public void setThematicLike(String thematicLike) {
		this.thematicLike = thematicLike;
	}

	public void setThematics(List<String> thematics) {
		this.thematics = thematics;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTnameLike(String tnameLike) {
		this.tnameLike = tnameLike;
	}

	public void setTnames(List<String> tnames) {
		this.tnames = tnames;
	}

	public void setTnum(String tnum) {
		this.tnum = tnum;
	}

	public void setTnumLike(String tnumLike) {
		this.tnumLike = tnumLike;
	}

	public void setTnums(List<String> tnums) {
		this.tnums = tnums;
	}

	public void setTopnode(String topnode) {
		this.topnode = topnode;
	}

	public void setTopnodeLike(String topnodeLike) {
		this.topnodeLike = topnodeLike;
	}

	public void setTopnodem(String topnodem) {
		this.topnodem = topnodem;
	}

	public void setTopnodemLike(String topnodemLike) {
		this.topnodemLike = topnodemLike;
	}

	public void setTopnodems(List<String> topnodems) {
		this.topnodems = topnodems;
	}

	public void setTopnodes(List<String> topnodes) {
		this.topnodes = topnodes;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void setTotalGreaterThanOrEqual(Integer totalGreaterThanOrEqual) {
		this.totalGreaterThanOrEqual = totalGreaterThanOrEqual;
	}

	public void setTotalLessThanOrEqual(Integer totalLessThanOrEqual) {
		this.totalLessThanOrEqual = totalLessThanOrEqual;
	}

	public void setTotalnum(String totalnum) {
		this.totalnum = totalnum;
	}

	public void setTotalnumLike(String totalnumLike) {
		this.totalnumLike = totalnumLike;
	}

	public void setTotalnums(List<String> totalnums) {
		this.totalnums = totalnums;
	}

	public void setTotals(List<Integer> totals) {
		this.totals = totals;
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

	public void setTreeList(Integer treeList) {
		this.treeList = treeList;
	}

	public void setTreeListGreaterThanOrEqual(Integer treeListGreaterThanOrEqual) {
		this.treeListGreaterThanOrEqual = treeListGreaterThanOrEqual;
	}

	public void setTreeListLessThanOrEqual(Integer treeListLessThanOrEqual) {
		this.treeListLessThanOrEqual = treeListLessThanOrEqual;
	}

	public void setTreeLists(List<Integer> treeLists) {
		this.treeLists = treeLists;
	}

	public void setTreeParent(Integer treeParent) {
		this.treeParent = treeParent;
	}

	public void setTreeParentGreaterThanOrEqual(
			Integer treeParentGreaterThanOrEqual) {
		this.treeParentGreaterThanOrEqual = treeParentGreaterThanOrEqual;
	}

	public void setTreeParentLessThanOrEqual(Integer treeParentLessThanOrEqual) {
		this.treeParentLessThanOrEqual = treeParentLessThanOrEqual;
	}

	public void setTreeParents(List<Integer> treeParents) {
		this.treeParents = treeParents;
	}

	public void setTviewer(String tviewer) {
		this.tviewer = tviewer;
	}

	public void setTviewerLike(String tviewerLike) {
		this.tviewerLike = tviewerLike;
	}

	public void setTviewers(List<String> tviewers) {
		this.tviewers = tviewers;
	}

	public void setTvision(String tvision) {
		this.tvision = tvision;
	}

	public void setTvisionLike(String tvisionLike) {
		this.tvisionLike = tvisionLike;
	}

	public void setTvisions(List<String> tvisions) {
		this.tvisions = tvisions;
	}

	public void setTzoom(String tzoom) {
		this.tzoom = tzoom;
	}

	public void setTzoomLike(String tzoomLike) {
		this.tzoomLike = tzoomLike;
	}

	public void setTzooms(List<String> tzooms) {
		this.tzooms = tzooms;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public void setVidLike(String vidLike) {
		this.vidLike = vidLike;
	}

	public void setVids(List<String> vids) {
		this.vids = vids;
	}

	public void setVisflag(String visflag) {
		this.visflag = visflag;
	}

	public void setVisflagLike(String visflagLike) {
		this.visflagLike = visflagLike;
	}

	public void setVisflags(List<String> visflags) {
		this.visflags = visflags;
	}

	public void setVnum(String vnum) {
		this.vnum = vnum;
	}

	public void setVnumLike(String vnumLike) {
		this.vnumLike = vnumLike;
	}

	public void setVnums(List<String> vnums) {
		this.vnums = vnums;
	}

	public void setWcompany(String wcompany) {
		this.wcompany = wcompany;
	}

	public void setWcompanyID(String wcompanyID) {
		this.wcompanyID = wcompanyID;
	}

	public void setWcompanyIDLike(String wcompanyIDLike) {
		this.wcompanyIDLike = wcompanyIDLike;
	}

	public void setWcompanyIDs(List<String> wcompanyIDs) {
		this.wcompanyIDs = wcompanyIDs;
	}

	public void setWcompanyLike(String wcompanyLike) {
		this.wcompanyLike = wcompanyLike;
	}

	public void setWcompanys(List<String> wcompanys) {
		this.wcompanys = wcompanys;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public void setYearGreaterThanOrEqual(Integer yearGreaterThanOrEqual) {
		this.yearGreaterThanOrEqual = yearGreaterThanOrEqual;
	}

	public void setYearLessThanOrEqual(Integer yearLessThanOrEqual) {
		this.yearLessThanOrEqual = yearLessThanOrEqual;
	}

	public void setYears(List<Integer> years) {
		this.years = years;
	}

	public PfileQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public PfileQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public PfileQuery slevels(List<String> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public PfileQuery summary(String summary) {
		if (summary == null) {
			throw new RuntimeException("summary is null");
		}
		this.summary = summary;
		return this;
	}

	public PfileQuery summaryLike(String summaryLike) {
		if (summaryLike == null) {
			throw new RuntimeException("summary is null");
		}
		this.summaryLike = summaryLike;
		return this;
	}

	public PfileQuery summarys(List<String> summarys) {
		if (summarys == null) {
			throw new RuntimeException("summarys is empty ");
		}
		this.summarys = summarys;
		return this;
	}

	public PfileQuery tagnum(String tagnum) {
		if (tagnum == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnum = tagnum;
		return this;
	}

	public PfileQuery tagnumLike(String tagnumLike) {
		if (tagnumLike == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnumLike = tagnumLike;
		return this;
	}

	public PfileQuery tagnums(List<String> tagnums) {
		if (tagnums == null) {
			throw new RuntimeException("tagnums is empty ");
		}
		this.tagnums = tagnums;
		return this;
	}

	public PfileQuery tassessor(String tassessor) {
		if (tassessor == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessor = tassessor;
		return this;
	}

	public PfileQuery tassessorLike(String tassessorLike) {
		if (tassessorLike == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessorLike = tassessorLike;
		return this;
	}

	public PfileQuery tassessors(List<String> tassessors) {
		if (tassessors == null) {
			throw new RuntimeException("tassessors is empty ");
		}
		this.tassessors = tassessors;
		return this;
	}

	public PfileQuery tdesigner(String tdesigner) {
		if (tdesigner == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesigner = tdesigner;
		return this;
	}

	public PfileQuery tdesignerLike(String tdesignerLike) {
		if (tdesignerLike == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesignerLike = tdesignerLike;
		return this;
	}

	public PfileQuery tdesigners(List<String> tdesigners) {
		if (tdesigners == null) {
			throw new RuntimeException("tdesigners is empty ");
		}
		this.tdesigners = tdesigners;
		return this;
	}

	public PfileQuery tflag(String tflag) {
		if (tflag == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflag = tflag;
		return this;
	}

	public PfileQuery tflagLike(String tflagLike) {
		if (tflagLike == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflagLike = tflagLike;
		return this;
	}

	public PfileQuery tflags(List<String> tflags) {
		if (tflags == null) {
			throw new RuntimeException("tflags is empty ");
		}
		this.tflags = tflags;
		return this;
	}

	public PfileQuery thematic(String thematic) {
		if (thematic == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematic = thematic;
		return this;
	}

	public PfileQuery thematicLike(String thematicLike) {
		if (thematicLike == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematicLike = thematicLike;
		return this;
	}

	public PfileQuery thematics(List<String> thematics) {
		if (thematics == null) {
			throw new RuntimeException("thematics is empty ");
		}
		this.thematics = thematics;
		return this;
	}

	public PfileQuery tname(String tname) {
		if (tname == null) {
			throw new RuntimeException("tname is null");
		}
		this.tname = tname;
		return this;
	}

	public PfileQuery tnameLike(String tnameLike) {
		if (tnameLike == null) {
			throw new RuntimeException("tname is null");
		}
		this.tnameLike = tnameLike;
		return this;
	}

	public PfileQuery tnames(List<String> tnames) {
		if (tnames == null) {
			throw new RuntimeException("tnames is empty ");
		}
		this.tnames = tnames;
		return this;
	}

	public PfileQuery tnum(String tnum) {
		if (tnum == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnum = tnum;
		return this;
	}

	public PfileQuery tnumLike(String tnumLike) {
		if (tnumLike == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnumLike = tnumLike;
		return this;
	}

	public PfileQuery tnums(List<String> tnums) {
		if (tnums == null) {
			throw new RuntimeException("tnums is empty ");
		}
		this.tnums = tnums;
		return this;
	}

	public PfileQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public PfileQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public PfileQuery topnodem(String topnodem) {
		if (topnodem == null) {
			throw new RuntimeException("topnodem is null");
		}
		this.topnodem = topnodem;
		return this;
	}

	public PfileQuery topnodemLike(String topnodemLike) {
		if (topnodemLike == null) {
			throw new RuntimeException("topnodem is null");
		}
		this.topnodemLike = topnodemLike;
		return this;
	}

	public PfileQuery topnodems(List<String> topnodems) {
		if (topnodems == null) {
			throw new RuntimeException("topnodems is empty ");
		}
		this.topnodems = topnodems;
		return this;
	}

	public PfileQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public PfileQuery total(Integer total) {
		if (total == null) {
			throw new RuntimeException("total is null");
		}
		this.total = total;
		return this;
	}

	public PfileQuery totalGreaterThanOrEqual(Integer totalGreaterThanOrEqual) {
		if (totalGreaterThanOrEqual == null) {
			throw new RuntimeException("total is null");
		}
		this.totalGreaterThanOrEqual = totalGreaterThanOrEqual;
		return this;
	}

	public PfileQuery totalLessThanOrEqual(Integer totalLessThanOrEqual) {
		if (totalLessThanOrEqual == null) {
			throw new RuntimeException("total is null");
		}
		this.totalLessThanOrEqual = totalLessThanOrEqual;
		return this;
	}

	public PfileQuery totalnum(String totalnum) {
		if (totalnum == null) {
			throw new RuntimeException("totalnum is null");
		}
		this.totalnum = totalnum;
		return this;
	}

	public PfileQuery totalnumLike(String totalnumLike) {
		if (totalnumLike == null) {
			throw new RuntimeException("totalnum is null");
		}
		this.totalnumLike = totalnumLike;
		return this;
	}

	public PfileQuery totalnums(List<String> totalnums) {
		if (totalnums == null) {
			throw new RuntimeException("totalnums is empty ");
		}
		this.totalnums = totalnums;
		return this;
	}

	public PfileQuery totals(List<Integer> totals) {
		if (totals == null) {
			throw new RuntimeException("totals is empty ");
		}
		this.totals = totals;
		return this;
	}

	public PfileQuery treeDliststr(String treeDliststr) {
		if (treeDliststr == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststr = treeDliststr;
		return this;
	}

	public PfileQuery treeDliststrLike(String treeDliststrLike) {
		if (treeDliststrLike == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststrLike = treeDliststrLike;
		return this;
	}

	public PfileQuery treeDliststrs(List<String> treeDliststrs) {
		if (treeDliststrs == null) {
			throw new RuntimeException("treeDliststrs is empty ");
		}
		this.treeDliststrs = treeDliststrs;
		return this;
	}

	public PfileQuery treeList(Integer treeList) {
		if (treeList == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeList = treeList;
		return this;
	}

	public PfileQuery treeListGreaterThanOrEqual(
			Integer treeListGreaterThanOrEqual) {
		if (treeListGreaterThanOrEqual == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeListGreaterThanOrEqual = treeListGreaterThanOrEqual;
		return this;
	}

	public PfileQuery treeListLessThanOrEqual(Integer treeListLessThanOrEqual) {
		if (treeListLessThanOrEqual == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeListLessThanOrEqual = treeListLessThanOrEqual;
		return this;
	}

	public PfileQuery treeLists(List<Integer> treeLists) {
		if (treeLists == null) {
			throw new RuntimeException("treeLists is empty ");
		}
		this.treeLists = treeLists;
		return this;
	}

	public PfileQuery treeParent(Integer treeParent) {
		if (treeParent == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParent = treeParent;
		return this;
	}

	public PfileQuery treeParentGreaterThanOrEqual(
			Integer treeParentGreaterThanOrEqual) {
		if (treeParentGreaterThanOrEqual == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParentGreaterThanOrEqual = treeParentGreaterThanOrEqual;
		return this;
	}

	public PfileQuery treeParentLessThanOrEqual(
			Integer treeParentLessThanOrEqual) {
		if (treeParentLessThanOrEqual == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParentLessThanOrEqual = treeParentLessThanOrEqual;
		return this;
	}

	public PfileQuery treeParents(List<Integer> treeParents) {
		if (treeParents == null) {
			throw new RuntimeException("treeParents is empty ");
		}
		this.treeParents = treeParents;
		return this;
	}

	public PfileQuery tviewer(String tviewer) {
		if (tviewer == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewer = tviewer;
		return this;
	}

	public PfileQuery tviewerLike(String tviewerLike) {
		if (tviewerLike == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewerLike = tviewerLike;
		return this;
	}

	public PfileQuery tviewers(List<String> tviewers) {
		if (tviewers == null) {
			throw new RuntimeException("tviewers is empty ");
		}
		this.tviewers = tviewers;
		return this;
	}

	public PfileQuery tvision(String tvision) {
		if (tvision == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvision = tvision;
		return this;
	}

	public PfileQuery tvisionLike(String tvisionLike) {
		if (tvisionLike == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvisionLike = tvisionLike;
		return this;
	}

	public PfileQuery tvisions(List<String> tvisions) {
		if (tvisions == null) {
			throw new RuntimeException("tvisions is empty ");
		}
		this.tvisions = tvisions;
		return this;
	}

	public PfileQuery tzoom(String tzoom) {
		if (tzoom == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoom = tzoom;
		return this;
	}

	public PfileQuery tzoomLike(String tzoomLike) {
		if (tzoomLike == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoomLike = tzoomLike;
		return this;
	}

	public PfileQuery tzooms(List<String> tzooms) {
		if (tzooms == null) {
			throw new RuntimeException("tzooms is empty ");
		}
		this.tzooms = tzooms;
		return this;
	}

	public PfileQuery vid(String vid) {
		if (vid == null) {
			throw new RuntimeException("vid is null");
		}
		this.vid = vid;
		return this;
	}

	public PfileQuery vidLike(String vidLike) {
		if (vidLike == null) {
			throw new RuntimeException("vid is null");
		}
		this.vidLike = vidLike;
		return this;
	}

	public PfileQuery vids(List<String> vids) {
		if (vids == null) {
			throw new RuntimeException("vids is empty ");
		}
		this.vids = vids;
		return this;
	}

	public PfileQuery visflag(String visflag) {
		if (visflag == null) {
			throw new RuntimeException("visflag is null");
		}
		this.visflag = visflag;
		return this;
	}

	public PfileQuery visflagLike(String visflagLike) {
		if (visflagLike == null) {
			throw new RuntimeException("visflag is null");
		}
		this.visflagLike = visflagLike;
		return this;
	}

	public PfileQuery visflags(List<String> visflags) {
		if (visflags == null) {
			throw new RuntimeException("visflags is empty ");
		}
		this.visflags = visflags;
		return this;
	}

	public PfileQuery vnum(String vnum) {
		if (vnum == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnum = vnum;
		return this;
	}

	public PfileQuery vnumLike(String vnumLike) {
		if (vnumLike == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnumLike = vnumLike;
		return this;
	}

	public PfileQuery vnums(List<String> vnums) {
		if (vnums == null) {
			throw new RuntimeException("vnums is empty ");
		}
		this.vnums = vnums;
		return this;
	}

	public PfileQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public PfileQuery wcompanyID(String wcompanyID) {
		if (wcompanyID == null) {
			throw new RuntimeException("wcompanyID is null");
		}
		this.wcompanyID = wcompanyID;
		return this;
	}

	public PfileQuery wcompanyIDLike(String wcompanyIDLike) {
		if (wcompanyIDLike == null) {
			throw new RuntimeException("wcompanyID is null");
		}
		this.wcompanyIDLike = wcompanyIDLike;
		return this;
	}

	public PfileQuery wcompanyIDs(List<String> wcompanyIDs) {
		if (wcompanyIDs == null) {
			throw new RuntimeException("wcompanyIDs is empty ");
		}
		this.wcompanyIDs = wcompanyIDs;
		return this;
	}

	public PfileQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public PfileQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

	public PfileQuery year(Integer year) {
		if (year == null) {
			throw new RuntimeException("year is null");
		}
		this.year = year;
		return this;
	}

	public PfileQuery yearGreaterThanOrEqual(Integer yearGreaterThanOrEqual) {
		if (yearGreaterThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearGreaterThanOrEqual = yearGreaterThanOrEqual;
		return this;
	}

	public PfileQuery yearLessThanOrEqual(Integer yearLessThanOrEqual) {
		if (yearLessThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearLessThanOrEqual = yearLessThanOrEqual;
		return this;
	}

	public PfileQuery years(List<Integer> years) {
		if (years == null) {
			throw new RuntimeException("years is empty ");
		}
		this.years = years;
		return this;
	}

}