package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class VolumeQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String oldid;
	protected String oldidLike;
	protected List<String> oldids;
	protected String ruleID;
	protected String ruleIDLike;
	protected List<String> ruleIDs;
	protected String ruleflag;
	protected String ruleflagLike;
	protected List<String> ruleflags;
	protected String rulepid;
	protected String rulepidLike;
	protected List<String> rulepids;
	protected String vidLike;
	protected List<String> vids;
	protected String sumflag;
	protected String sumflagLike;
	protected List<String> sumflags;
	protected Integer topid;
	protected Integer topidGreaterThanOrEqual;
	protected Integer topidLessThanOrEqual;
	protected List<Integer> topids;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer projid;
	protected Integer projidGreaterThanOrEqual;
	protected Integer projidLessThanOrEqual;
	protected List<Integer> projids;
	protected Integer pid;
	protected Integer pidGreaterThanOrEqual;
	protected Integer pidLessThanOrEqual;
	protected List<Integer> pids;
	protected String pnameLike;
	protected String vflag;
	protected String vflagLike;
	protected List<String> vflags;
	protected String vnameLike;
	protected Integer year;
	protected Integer yearGreaterThanOrEqual;
	protected Integer yearLessThanOrEqual;
	protected List<Integer> years;
	protected String glidenum;
	protected String glidenumLike;
	protected List<String> glidenums;
	protected String filingflag;
	protected List<String> filingflags;
	protected String checkupflag;
	protected List<String> checkupflags;
	protected String openflag;
	protected List<String> openflags;
	protected String finishflag;
	protected List<String> finishflags;
	protected String vtagnum;
	protected String vtagnumLike;
	protected List<String> vtagnums;
	protected String vtype;
	protected String vtypeLike;
	protected List<String> vtypes;
	protected String vnum;
	protected String vnumLike;
	protected List<String> vnums;
	protected String vtmpnum;
	protected String vtmpnumLike;
	protected List<String> vtmpnums;
	protected String roomnum;
	protected String roomnumLike;
	protected List<String> roomnums;
	protected String zoonum;
	protected String zoonumLike;
	protected List<String> zoonums;
	protected String efilenum;
	protected String efilenumLike;
	protected List<String> efilenums;
	protected String boxnum;
	protected String boxnumLike;
	protected List<String> boxnums;
	protected String place;
	protected String placeLike;
	protected List<String> places;
	protected String tname;
	protected String tnameLike;
	protected List<String> tnames;
	protected String wcompany;
	protected String wcompanyLike;
	protected List<String> wcompanys;
	protected Date wdate;
	protected Date wdateGreaterThanOrEqual;
	protected Date wdateLessThanOrEqual;
	protected List<Date> wdates;
	protected String carriertype;
	protected String carriertypeLike;
	protected List<String> carriertypes;
	protected String numunit;
	protected String numunitLike;
	protected List<String> numunits;
	protected String spec;
	protected String specLike;
	protected List<String> specs;
	protected Date startday;
	protected Date startdayGreaterThanOrEqual;
	protected Date startdayLessThanOrEqual;
	protected List<Date> startdays;
	protected Date endday;
	protected Date enddayGreaterThanOrEqual;
	protected Date enddayLessThanOrEqual;
	protected List<Date> enddays;
	protected String savetime;
	protected String savetimeLike;
	protected List<String> savetimes;
	protected String slevel;
	protected String slevelLike;
	protected List<String> slevels;
	protected String thematic;
	protected String thematicLike;
	protected List<String> thematics;
	protected String annotations;
	protected String annotationsLike;
	protected List<String> annotationss;
	protected Integer totalfile;
	protected Integer totalfileGreaterThanOrEqual;
	protected Integer totalfileLessThanOrEqual;
	protected List<Integer> totalfiles;
	protected Integer totalpage;
	protected Integer totalpageGreaterThanOrEqual;
	protected Integer totalpageLessThanOrEqual;
	protected List<Integer> totalpages;
	protected Integer txtpage;
	protected Integer txtpageGreaterThanOrEqual;
	protected Integer txtpageLessThanOrEqual;
	protected List<Integer> txtpages;
	protected Integer picpage;
	protected Integer picpageGreaterThanOrEqual;
	protected Integer picpageLessThanOrEqual;
	protected List<Integer> picpages;
	protected Integer photopage;
	protected Integer photopageGreaterThanOrEqual;
	protected Integer photopageLessThanOrEqual;
	protected List<Integer> photopages;
	protected String cman;
	protected String cmanLike;
	protected List<String> cmans;
	protected Date ctime;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected List<Date> ctimes;
	protected String assessor;
	protected String assessorLike;
	protected List<String> assessors;
	protected Date atime;
	protected Date atimeGreaterThanOrEqual;
	protected Date atimeLessThanOrEqual;
	protected List<Date> atimes;
	protected String content;
	protected String contentLike;
	protected List<String> contents;
	protected String islocate;
	protected String islocateLike;
	protected List<String> islocates;
	protected String topnode;
	protected String topnodeLike;
	protected List<String> topnodes;
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
	protected Date finishday;
	protected Date finishdayGreaterThanOrEqual;
	protected Date finishdayLessThanOrEqual;
	protected List<Date> finishdays;
	

	public VolumeQuery() {

	}

	public VolumeQuery annotations(String annotations) {
		if (annotations == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotations = annotations;
		return this;
	}

	public VolumeQuery annotationsLike(String annotationsLike) {
		if (annotationsLike == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotationsLike = annotationsLike;
		return this;
	}

	public VolumeQuery annotationss(List<String> annotationss) {
		if (annotationss == null) {
			throw new RuntimeException("annotationss is empty ");
		}
		this.annotationss = annotationss;
		return this;
	}

	public VolumeQuery assessor(String assessor) {
		if (assessor == null) {
			throw new RuntimeException("assessor is null");
		}
		this.assessor = assessor;
		return this;
	}

	public VolumeQuery assessorLike(String assessorLike) {
		if (assessorLike == null) {
			throw new RuntimeException("assessor is null");
		}
		this.assessorLike = assessorLike;
		return this;
	}

	public VolumeQuery assessors(List<String> assessors) {
		if (assessors == null) {
			throw new RuntimeException("assessors is empty ");
		}
		this.assessors = assessors;
		return this;
	}

	public VolumeQuery atime(Date atime) {
		if (atime == null) {
			throw new RuntimeException("atime is null");
		}
		this.atime = atime;
		return this;
	}

	public VolumeQuery atimeGreaterThanOrEqual(Date atimeGreaterThanOrEqual) {
		if (atimeGreaterThanOrEqual == null) {
			throw new RuntimeException("atime is null");
		}
		this.atimeGreaterThanOrEqual = atimeGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery atimeLessThanOrEqual(Date atimeLessThanOrEqual) {
		if (atimeLessThanOrEqual == null) {
			throw new RuntimeException("atime is null");
		}
		this.atimeLessThanOrEqual = atimeLessThanOrEqual;
		return this;
	}

	public VolumeQuery atimes(List<Date> atimes) {
		if (atimes == null) {
			throw new RuntimeException("atimes is empty ");
		}
		this.atimes = atimes;
		return this;
	}

	public VolumeQuery boxnum(String boxnum) {
		if (boxnum == null) {
			throw new RuntimeException("boxnum is null");
		}
		this.boxnum = boxnum;
		return this;
	}

	public VolumeQuery boxnumLike(String boxnumLike) {
		if (boxnumLike == null) {
			throw new RuntimeException("boxnum is null");
		}
		this.boxnumLike = boxnumLike;
		return this;
	}

	public VolumeQuery boxnums(List<String> boxnums) {
		if (boxnums == null) {
			throw new RuntimeException("boxnums is empty ");
		}
		this.boxnums = boxnums;
		return this;
	}

	public VolumeQuery carriertype(String carriertype) {
		if (carriertype == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertype = carriertype;
		return this;
	}

	public VolumeQuery carriertypeLike(String carriertypeLike) {
		if (carriertypeLike == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertypeLike = carriertypeLike;
		return this;
	}

	public VolumeQuery carriertypes(List<String> carriertypes) {
		if (carriertypes == null) {
			throw new RuntimeException("carriertypes is empty ");
		}
		this.carriertypes = carriertypes;
		return this;
	}

	public VolumeQuery checkupflag(String checkupflag) {
		if (checkupflag == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflag = checkupflag;
		return this;
	}

	public VolumeQuery checkupflags(List<String> checkupflags) {
		if (checkupflags == null) {
			throw new RuntimeException("checkupflags is empty ");
		}
		this.checkupflags = checkupflags;
		return this;
	}

	public VolumeQuery cman(String cman) {
		if (cman == null) {
			throw new RuntimeException("cman is null");
		}
		this.cman = cman;
		return this;
	}

	public VolumeQuery cmanLike(String cmanLike) {
		if (cmanLike == null) {
			throw new RuntimeException("cman is null");
		}
		this.cmanLike = cmanLike;
		return this;
	}

	public VolumeQuery cmans(List<String> cmans) {
		if (cmans == null) {
			throw new RuntimeException("cmans is empty ");
		}
		this.cmans = cmans;
		return this;
	}

	public VolumeQuery content(String content) {
		if (content == null) {
			throw new RuntimeException("content is null");
		}
		this.content = content;
		return this;
	}

	public VolumeQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public VolumeQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
		return this;
	}

	public VolumeQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public VolumeQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public VolumeQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public VolumeQuery efilenum(String efilenum) {
		if (efilenum == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenum = efilenum;
		return this;
	}

	public VolumeQuery efilenumLike(String efilenumLike) {
		if (efilenumLike == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumLike = efilenumLike;
		return this;
	}

	public VolumeQuery efilenums(List<String> efilenums) {
		if (efilenums == null) {
			throw new RuntimeException("efilenums is empty ");
		}
		this.efilenums = efilenums;
		return this;
	}

	public VolumeQuery endday(Date endday) {
		if (endday == null) {
			throw new RuntimeException("endday is null");
		}
		this.endday = endday;
		return this;
	}

	public VolumeQuery enddayGreaterThanOrEqual(Date enddayGreaterThanOrEqual) {
		if (enddayGreaterThanOrEqual == null) {
			throw new RuntimeException("endday is null");
		}
		this.enddayGreaterThanOrEqual = enddayGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery enddayLessThanOrEqual(Date enddayLessThanOrEqual) {
		if (enddayLessThanOrEqual == null) {
			throw new RuntimeException("endday is null");
		}
		this.enddayLessThanOrEqual = enddayLessThanOrEqual;
		return this;
	}

	public VolumeQuery enddays(List<Date> enddays) {
		if (enddays == null) {
			throw new RuntimeException("enddays is empty ");
		}
		this.enddays = enddays;
		return this;
	}

	public VolumeQuery filingflag(String filingflag) {
		if (filingflag == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflag = filingflag;
		return this;
	}

	public VolumeQuery filingflags(List<String> filingflags) {
		if (filingflags == null) {
			throw new RuntimeException("filingflags is empty ");
		}
		this.filingflags = filingflags;
		return this;
	}

	public VolumeQuery finishday(Date finishday) {
		if (finishday == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishday = finishday;
		return this;
	}

	public VolumeQuery finishdayGreaterThanOrEqual(
			Date finishdayGreaterThanOrEqual) {
		if (finishdayGreaterThanOrEqual == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishdayGreaterThanOrEqual = finishdayGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery finishdayLessThanOrEqual(Date finishdayLessThanOrEqual) {
		if (finishdayLessThanOrEqual == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishdayLessThanOrEqual = finishdayLessThanOrEqual;
		return this;
	}

	public VolumeQuery finishdays(List<Date> finishdays) {
		if (finishdays == null) {
			throw new RuntimeException("finishdays is empty ");
		}
		this.finishdays = finishdays;
		return this;
	}

	public VolumeQuery finishflag(String finishflag) {
		if (finishflag == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflag = finishflag;
		return this;
	}

	public VolumeQuery finishflags(List<String> finishflags) {
		if (finishflags == null) {
			throw new RuntimeException("finishflags is empty ");
		}
		this.finishflags = finishflags;
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

	public String getAssessor() {
		return assessor;
	}

	public String getAssessorLike() {
		if (assessorLike != null && assessorLike.trim().length() > 0) {
			if (!assessorLike.startsWith("%")) {
				assessorLike = "%" + assessorLike;
			}
			if (!assessorLike.endsWith("%")) {
				assessorLike = assessorLike + "%";
			}
		}
		return assessorLike;
	}

	public List<String> getAssessors() {
		return assessors;
	}

	public Date getAtime() {
		return atime;
	}

	public Date getAtimeGreaterThanOrEqual() {
		return atimeGreaterThanOrEqual;
	}

	public Date getAtimeLessThanOrEqual() {
		return atimeLessThanOrEqual;
	}

	public List<Date> getAtimes() {
		return atimes;
	}

	public String getBoxnum() {
		return boxnum;
	}

	public String getBoxnumLike() {
		if (boxnumLike != null && boxnumLike.trim().length() > 0) {
			if (!boxnumLike.startsWith("%")) {
				boxnumLike = "%" + boxnumLike;
			}
			if (!boxnumLike.endsWith("%")) {
				boxnumLike = boxnumLike + "%";
			}
		}
		return boxnumLike;
	}

	public List<String> getBoxnums() {
		return boxnums;
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

	public String getCheckupflag() {
		return checkupflag;
	}

	public List<String> getCheckupflags() {
		return checkupflags;
	}

	public String getCman() {
		return cman;
	}

	public String getCmanLike() {
		if (cmanLike != null && cmanLike.trim().length() > 0) {
			if (!cmanLike.startsWith("%")) {
				cmanLike = "%" + cmanLike;
			}
			if (!cmanLike.endsWith("%")) {
				cmanLike = cmanLike + "%";
			}
		}
		return cmanLike;
	}

	public List<String> getCmans() {
		return cmans;
	}

	public String getContent() {
		return content;
	}

	public String getContentLike() {
		if (contentLike != null && contentLike.trim().length() > 0) {
			if (!contentLike.startsWith("%")) {
				contentLike = "%" + contentLike;
			}
			if (!contentLike.endsWith("%")) {
				contentLike = contentLike + "%";
			}
		}
		return contentLike;
	}

	public List<String> getContents() {
		return contents;
	}

	public Date getCtime() {
		return ctime;
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

	public String getEfilenum() {
		return efilenum;
	}

	public String getEfilenumLike() {
		if (efilenumLike != null && efilenumLike.trim().length() > 0) {
			if (!efilenumLike.startsWith("%")) {
				efilenumLike = "%" + efilenumLike;
			}
			if (!efilenumLike.endsWith("%")) {
				efilenumLike = efilenumLike + "%";
			}
		}
		return efilenumLike;
	}

	public List<String> getEfilenums() {
		return efilenums;
	}

	public Date getEndday() {
		return endday;
	}

	public Date getEnddayGreaterThanOrEqual() {
		return enddayGreaterThanOrEqual;
	}

	public Date getEnddayLessThanOrEqual() {
		return enddayLessThanOrEqual;
	}

	public List<Date> getEnddays() {
		return enddays;
	}

	public String getFilingflag() {
		return filingflag;
	}

	public List<String> getFilingflags() {
		return filingflags;
	}

	public Date getFinishday() {
		return finishday;
	}

	public Date getFinishdayGreaterThanOrEqual() {
		return finishdayGreaterThanOrEqual;
	}

	public Date getFinishdayLessThanOrEqual() {
		return finishdayLessThanOrEqual;
	}

	public List<Date> getFinishdays() {
		return finishdays;
	}

	public String getFinishflag() {
		return finishflag;
	}

	public List<String> getFinishflags() {
		return finishflags;
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

	public String getNumunit() {
		return numunit;
	}

	public String getNumunitLike() {
		if (numunitLike != null && numunitLike.trim().length() > 0) {
			if (!numunitLike.startsWith("%")) {
				numunitLike = "%" + numunitLike;
			}
			if (!numunitLike.endsWith("%")) {
				numunitLike = numunitLike + "%";
			}
		}
		return numunitLike;
	}

	public List<String> getNumunits() {
		return numunits;
	}

	public String getOldid() {
		return oldid;
	}

	public String getOldidLike() {
		if (oldidLike != null && oldidLike.trim().length() > 0) {
			if (!oldidLike.startsWith("%")) {
				oldidLike = "%" + oldidLike;
			}
			if (!oldidLike.endsWith("%")) {
				oldidLike = oldidLike + "%";
			}
		}
		return oldidLike;
	}

	public List<String> getOldids() {
		return oldids;
	}

	public String getOpenflag() {
		return openflag;
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

	public Integer getPhotopage() {
		return photopage;
	}

	public Integer getPhotopageGreaterThanOrEqual() {
		return photopageGreaterThanOrEqual;
	}

	public Integer getPhotopageLessThanOrEqual() {
		return photopageLessThanOrEqual;
	}

	public List<Integer> getPhotopages() {
		return photopages;
	}

	public Integer getPicpage() {
		return picpage;
	}

	public Integer getPicpageGreaterThanOrEqual() {
		return picpageGreaterThanOrEqual;
	}

	public Integer getPicpageLessThanOrEqual() {
		return picpageLessThanOrEqual;
	}

	public List<Integer> getPicpages() {
		return picpages;
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

	public String getPlace() {
		return place;
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

	public String getPnameLike() {
		if (pnameLike != null && pnameLike.trim().length() > 0) {
			if (!pnameLike.startsWith("%")) {
				pnameLike = "%" + pnameLike;
			}
			if (!pnameLike.endsWith("%")) {
				pnameLike = pnameLike + "%";
			}
		}
		return pnameLike;
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

	public String getRoomnum() {
		return roomnum;
	}

	public String getRoomnumLike() {
		if (roomnumLike != null && roomnumLike.trim().length() > 0) {
			if (!roomnumLike.startsWith("%")) {
				roomnumLike = "%" + roomnumLike;
			}
			if (!roomnumLike.endsWith("%")) {
				roomnumLike = roomnumLike + "%";
			}
		}
		return roomnumLike;
	}

	public List<String> getRoomnums() {
		return roomnums;
	}

	public String getRuleflag() {
		return ruleflag;
	}

	public String getRuleflagLike() {
		if (ruleflagLike != null && ruleflagLike.trim().length() > 0) {
			if (!ruleflagLike.startsWith("%")) {
				ruleflagLike = "%" + ruleflagLike;
			}
			if (!ruleflagLike.endsWith("%")) {
				ruleflagLike = ruleflagLike + "%";
			}
		}
		return ruleflagLike;
	}

	public List<String> getRuleflags() {
		return ruleflags;
	}

	public String getRuleID() {
		return ruleID;
	}

	public String getRuleIDLike() {
		if (ruleIDLike != null && ruleIDLike.trim().length() > 0) {
			if (!ruleIDLike.startsWith("%")) {
				ruleIDLike = "%" + ruleIDLike;
			}
			if (!ruleIDLike.endsWith("%")) {
				ruleIDLike = ruleIDLike + "%";
			}
		}
		return ruleIDLike;
	}

	public List<String> getRuleIDs() {
		return ruleIDs;
	}

	public String getRulepid() {
		return rulepid;
	}

	public String getRulepidLike() {
		if (rulepidLike != null && rulepidLike.trim().length() > 0) {
			if (!rulepidLike.startsWith("%")) {
				rulepidLike = "%" + rulepidLike;
			}
			if (!rulepidLike.endsWith("%")) {
				rulepidLike = rulepidLike + "%";
			}
		}
		return rulepidLike;
	}

	public List<String> getRulepids() {
		return rulepids;
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

	public String getSpec() {
		return spec;
	}

	public String getSpecLike() {
		if (specLike != null && specLike.trim().length() > 0) {
			if (!specLike.startsWith("%")) {
				specLike = "%" + specLike;
			}
			if (!specLike.endsWith("%")) {
				specLike = specLike + "%";
			}
		}
		return specLike;
	}

	public List<String> getSpecs() {
		return specs;
	}

	public Date getStartday() {
		return startday;
	}

	public Date getStartdayGreaterThanOrEqual() {
		return startdayGreaterThanOrEqual;
	}

	public Date getStartdayLessThanOrEqual() {
		return startdayLessThanOrEqual;
	}

	public List<Date> getStartdays() {
		return startdays;
	}

	public String getSumflag() {
		return sumflag;
	}

	public String getSumflagLike() {
		if (sumflagLike != null && sumflagLike.trim().length() > 0) {
			if (!sumflagLike.startsWith("%")) {
				sumflagLike = "%" + sumflagLike;
			}
			if (!sumflagLike.endsWith("%")) {
				sumflagLike = sumflagLike + "%";
			}
		}
		return sumflagLike;
	}

	public List<String> getSumflags() {
		return sumflags;
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

	public Integer getTopid() {
		return topid;
	}

	public Integer getTopidGreaterThanOrEqual() {
		return topidGreaterThanOrEqual;
	}

	public Integer getTopidLessThanOrEqual() {
		return topidLessThanOrEqual;
	}

	public List<Integer> getTopids() {
		return topids;
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

	public Integer getTotalfile() {
		return totalfile;
	}

	public Integer getTotalfileGreaterThanOrEqual() {
		return totalfileGreaterThanOrEqual;
	}

	public Integer getTotalfileLessThanOrEqual() {
		return totalfileLessThanOrEqual;
	}

	public List<Integer> getTotalfiles() {
		return totalfiles;
	}

	public Integer getTotalpage() {
		return totalpage;
	}

	public Integer getTotalpageGreaterThanOrEqual() {
		return totalpageGreaterThanOrEqual;
	}

	public Integer getTotalpageLessThanOrEqual() {
		return totalpageLessThanOrEqual;
	}

	public List<Integer> getTotalpages() {
		return totalpages;
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

	public Integer getTxtpage() {
		return txtpage;
	}

	public Integer getTxtpageGreaterThanOrEqual() {
		return txtpageGreaterThanOrEqual;
	}

	public Integer getTxtpageLessThanOrEqual() {
		return txtpageLessThanOrEqual;
	}

	public List<Integer> getTxtpages() {
		return txtpages;
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

	public String getVflag() {
		return vflag;
	}

	public String getVflagLike() {
		if (vflagLike != null && vflagLike.trim().length() > 0) {
			if (!vflagLike.startsWith("%")) {
				vflagLike = "%" + vflagLike;
			}
			if (!vflagLike.endsWith("%")) {
				vflagLike = vflagLike + "%";
			}
		}
		return vflagLike;
	}

	public List<String> getVflags() {
		return vflags;
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

	public String getVnameLike() {
		if (vnameLike != null && vnameLike.trim().length() > 0) {
			if (!vnameLike.startsWith("%")) {
				vnameLike = "%" + vnameLike;
			}
			if (!vnameLike.endsWith("%")) {
				vnameLike = vnameLike + "%";
			}
		}
		return vnameLike;
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

	public String getVtagnum() {
		return vtagnum;
	}

	public String getVtagnumLike() {
		if (vtagnumLike != null && vtagnumLike.trim().length() > 0) {
			if (!vtagnumLike.startsWith("%")) {
				vtagnumLike = "%" + vtagnumLike;
			}
			if (!vtagnumLike.endsWith("%")) {
				vtagnumLike = vtagnumLike + "%";
			}
		}
		return vtagnumLike;
	}

	public List<String> getVtagnums() {
		return vtagnums;
	}

	public String getVtmpnum() {
		return vtmpnum;
	}

	public String getVtmpnumLike() {
		if (vtmpnumLike != null && vtmpnumLike.trim().length() > 0) {
			if (!vtmpnumLike.startsWith("%")) {
				vtmpnumLike = "%" + vtmpnumLike;
			}
			if (!vtmpnumLike.endsWith("%")) {
				vtmpnumLike = vtmpnumLike + "%";
			}
		}
		return vtmpnumLike;
	}

	public List<String> getVtmpnums() {
		return vtmpnums;
	}

	public String getVtype() {
		return vtype;
	}

	public String getVtypeLike() {
		if (vtypeLike != null && vtypeLike.trim().length() > 0) {
			if (!vtypeLike.startsWith("%")) {
				vtypeLike = "%" + vtypeLike;
			}
			if (!vtypeLike.endsWith("%")) {
				vtypeLike = vtypeLike + "%";
			}
		}
		return vtypeLike;
	}

	public List<String> getVtypes() {
		return vtypes;
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

	public Date getWdate() {
		return wdate;
	}

	public Date getWdateGreaterThanOrEqual() {
		return wdateGreaterThanOrEqual;
	}

	public Date getWdateLessThanOrEqual() {
		return wdateLessThanOrEqual;
	}

	public List<Date> getWdates() {
		return wdates;
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

	public String getZoonum() {
		return zoonum;
	}

	public String getZoonumLike() {
		if (zoonumLike != null && zoonumLike.trim().length() > 0) {
			if (!zoonumLike.startsWith("%")) {
				zoonumLike = "%" + zoonumLike;
			}
			if (!zoonumLike.endsWith("%")) {
				zoonumLike = zoonumLike + "%";
			}
		}
		return zoonumLike;
	}

	public List<String> getZoonums() {
		return zoonums;
	}

	public VolumeQuery glidenum(String glidenum) {
		if (glidenum == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenum = glidenum;
		return this;
	}

	public VolumeQuery glidenumLike(String glidenumLike) {
		if (glidenumLike == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenumLike = glidenumLike;
		return this;
	}

	public VolumeQuery glidenums(List<String> glidenums) {
		if (glidenums == null) {
			throw new RuntimeException("glidenums is empty ");
		}
		this.glidenums = glidenums;
		return this;
	}

	public VolumeQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public VolumeQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public VolumeQuery indexIds(List<Integer> indexIds) {
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
		addColumn("listno", "listno");
		addColumn("oldid", "oldid");
		addColumn("ruleID", "ruleID");
		addColumn("ruleflag", "ruleflag");
		addColumn("rulepid", "rulepid");
		addColumn("vid", "vid");
		addColumn("sumflag", "sumflag");
		addColumn("topid", "topid");
		addColumn("indexId", "index_id");
		addColumn("projid", "projid");
		addColumn("pid", "pid");
		addColumn("pname", "pname");
		addColumn("vflag", "vflag");
		addColumn("vname", "vname");
		addColumn("year", "year");
		addColumn("glidenum", "glidenum");
		addColumn("filingflag", "filingflag");
		addColumn("checkupflag", "checkupflag");
		addColumn("openflag", "openflag");
		addColumn("finishflag", "finishflag");
		addColumn("vtagnum", "vtagnum");
		addColumn("vtype", "vtype");
		addColumn("vnum", "vnum");
		addColumn("vtmpnum", "vtmpnum");
		addColumn("roomnum", "roomnum");
		addColumn("zoonum", "zoonum");
		addColumn("efilenum", "efilenum");
		addColumn("boxnum", "boxnum");
		addColumn("place", "place");
		addColumn("tname", "tname");
		addColumn("wcompany", "wcompany");
		addColumn("wdate", "wdate");
		addColumn("carriertype", "carriertype");
		addColumn("numunit", "numunit");
		addColumn("spec", "spec");
		addColumn("startday", "startday");
		addColumn("endday", "endday");
		addColumn("savetime", "savetime");
		addColumn("slevel", "slevel");
		addColumn("thematic", "thematic");
		addColumn("annotations", "annotations");
		addColumn("totalfile", "totalfile");
		addColumn("totalpage", "totalpage");
		addColumn("txtpage", "txtpage");
		addColumn("picpage", "picpage");
		addColumn("photopage", "photopage");
		addColumn("cman", "cman");
		addColumn("ctime", "ctime");
		addColumn("assessor", "assessor");
		addColumn("atime", "atime");
		addColumn("content", "content");
		addColumn("islocate", "islocate");
		addColumn("topnode", "topnode");
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
		addColumn("tnum", "tnum");
		addColumn("tzoom", "tzoom");
		addColumn("tflag", "tflag");
		addColumn("tdesigner", "tdesigner");
		addColumn("tviewer", "tviewer");
		addColumn("tassessor", "tassessor");
		addColumn("tvision", "tvision");
		addColumn("finishday", "finishday");
	}

	public VolumeQuery islocate(String islocate) {
		if (islocate == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocate = islocate;
		return this;
	}

	public VolumeQuery islocateLike(String islocateLike) {
		if (islocateLike == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocateLike = islocateLike;
		return this;
	}

	public VolumeQuery islocates(List<String> islocates) {
		if (islocates == null) {
			throw new RuntimeException("islocates is empty ");
		}
		this.islocates = islocates;
		return this;
	}



	public VolumeQuery jactor(String jactor) {
		if (jactor == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactor = jactor;
		return this;
	}

	public VolumeQuery jactorLike(String jactorLike) {
		if (jactorLike == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactorLike = jactorLike;
		return this;
	}

	public VolumeQuery jactors(List<String> jactors) {
		if (jactors == null) {
			throw new RuntimeException("jactors is empty ");
		}
		this.jactors = jactors;
		return this;
	}

	public VolumeQuery jback(String jback) {
		if (jback == null) {
			throw new RuntimeException("jback is null");
		}
		this.jback = jback;
		return this;
	}

	public VolumeQuery jbackLike(String jbackLike) {
		if (jbackLike == null) {
			throw new RuntimeException("jback is null");
		}
		this.jbackLike = jbackLike;
		return this;
	}

	public VolumeQuery jbacks(List<String> jbacks) {
		if (jbacks == null) {
			throw new RuntimeException("jbacks is empty ");
		}
		this.jbacks = jbacks;
		return this;
	}

	public VolumeQuery jconten(String jconten) {
		if (jconten == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jconten = jconten;
		return this;
	}

	public VolumeQuery jcontenLike(String jcontenLike) {
		if (jcontenLike == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jcontenLike = jcontenLike;
		return this;
	}

	public VolumeQuery jcontens(List<String> jcontens) {
		if (jcontens == null) {
			throw new RuntimeException("jcontens is empty ");
		}
		this.jcontens = jcontens;
		return this;
	}

	public VolumeQuery jman(String jman) {
		if (jman == null) {
			throw new RuntimeException("jman is null");
		}
		this.jman = jman;
		return this;
	}

	public VolumeQuery jmanLike(String jmanLike) {
		if (jmanLike == null) {
			throw new RuntimeException("jman is null");
		}
		this.jmanLike = jmanLike;
		return this;
	}

	public VolumeQuery jmans(List<String> jmans) {
		if (jmans == null) {
			throw new RuntimeException("jmans is empty ");
		}
		this.jmans = jmans;
		return this;
	}

	public VolumeQuery jplace(String jplace) {
		if (jplace == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplace = jplace;
		return this;
	}

	public VolumeQuery jplaceLike(String jplaceLike) {
		if (jplaceLike == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplaceLike = jplaceLike;
		return this;
	}

	public VolumeQuery jplaces(List<String> jplaces) {
		if (jplaces == null) {
			throw new RuntimeException("jplaces is empty ");
		}
		this.jplaces = jplaces;
		return this;
	}

	public VolumeQuery lcompany(String lcompany) {
		if (lcompany == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompany = lcompany;
		return this;
	}

	public VolumeQuery lcompanyLike(String lcompanyLike) {
		if (lcompanyLike == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompanyLike = lcompanyLike;
		return this;
	}

	public VolumeQuery lcompanys(List<String> lcompanys) {
		if (lcompanys == null) {
			throw new RuntimeException("lcompanys is empty ");
		}
		this.lcompanys = lcompanys;
		return this;
	}

	public VolumeQuery lcontent(String lcontent) {
		if (lcontent == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontent = lcontent;
		return this;
	}

	public VolumeQuery lcontentLike(String lcontentLike) {
		if (lcontentLike == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontentLike = lcontentLike;
		return this;
	}

	public VolumeQuery lcontents(List<String> lcontents) {
		if (lcontents == null) {
			throw new RuntimeException("lcontents is empty ");
		}
		this.lcontents = lcontents;
		return this;
	}

	public VolumeQuery ldate(Date ldate) {
		if (ldate == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldate = ldate;
		return this;
	}

	public VolumeQuery ldateGreaterThanOrEqual(Date ldateGreaterThanOrEqual) {
		if (ldateGreaterThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateGreaterThanOrEqual = ldateGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery ldateLessThanOrEqual(Date ldateLessThanOrEqual) {
		if (ldateLessThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateLessThanOrEqual = ldateLessThanOrEqual;
		return this;
	}

	public VolumeQuery ldates(List<Date> ldates) {
		if (ldates == null) {
			throw new RuntimeException("ldates is empty ");
		}
		this.ldates = ldates;
		return this;
	}

	public VolumeQuery llen(String llen) {
		if (llen == null) {
			throw new RuntimeException("llen is null");
		}
		this.llen = llen;
		return this;
	}

	public VolumeQuery llenLike(String llenLike) {
		if (llenLike == null) {
			throw new RuntimeException("llen is null");
		}
		this.llenLike = llenLike;
		return this;
	}

	public VolumeQuery llens(List<String> llens) {
		if (llens == null) {
			throw new RuntimeException("llens is empty ");
		}
		this.llens = llens;
		return this;
	}

	public VolumeQuery lman(String lman) {
		if (lman == null) {
			throw new RuntimeException("lman is null");
		}
		this.lman = lman;
		return this;
	}

	public VolumeQuery lmanLike(String lmanLike) {
		if (lmanLike == null) {
			throw new RuntimeException("lman is null");
		}
		this.lmanLike = lmanLike;
		return this;
	}

	public VolumeQuery lmans(List<String> lmans) {
		if (lmans == null) {
			throw new RuntimeException("lmans is empty ");
		}
		this.lmans = lmans;
		return this;
	}

	public VolumeQuery numunit(String numunit) {
		if (numunit == null) {
			throw new RuntimeException("numunit is null");
		}
		this.numunit = numunit;
		return this;
	}

	public VolumeQuery numunitLike(String numunitLike) {
		if (numunitLike == null) {
			throw new RuntimeException("numunit is null");
		}
		this.numunitLike = numunitLike;
		return this;
	}

	public VolumeQuery numunits(List<String> numunits) {
		if (numunits == null) {
			throw new RuntimeException("numunits is empty ");
		}
		this.numunits = numunits;
		return this;
	}

	public VolumeQuery oldid(String oldid) {
		if (oldid == null) {
			throw new RuntimeException("oldid is null");
		}
		this.oldid = oldid;
		return this;
	}

	public VolumeQuery oldidLike(String oldidLike) {
		if (oldidLike == null) {
			throw new RuntimeException("oldid is null");
		}
		this.oldidLike = oldidLike;
		return this;
	}

	public VolumeQuery oldids(List<String> oldids) {
		if (oldids == null) {
			throw new RuntimeException("oldids is empty ");
		}
		this.oldids = oldids;
		return this;
	}

	public VolumeQuery openflag(String openflag) {
		if (openflag == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflag = openflag;
		return this;
	}

	public VolumeQuery openflags(List<String> openflags) {
		if (openflags == null) {
			throw new RuntimeException("openflags is empty ");
		}
		this.openflags = openflags;
		return this;
	}

	public VolumeQuery photopage(Integer photopage) {
		if (photopage == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopage = photopage;
		return this;
	}

	public VolumeQuery photopageGreaterThanOrEqual(
			Integer photopageGreaterThanOrEqual) {
		if (photopageGreaterThanOrEqual == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopageGreaterThanOrEqual = photopageGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery photopageLessThanOrEqual(Integer photopageLessThanOrEqual) {
		if (photopageLessThanOrEqual == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopageLessThanOrEqual = photopageLessThanOrEqual;
		return this;
	}

	public VolumeQuery photopages(List<Integer> photopages) {
		if (photopages == null) {
			throw new RuntimeException("photopages is empty ");
		}
		this.photopages = photopages;
		return this;
	}

	public VolumeQuery picpage(Integer picpage) {
		if (picpage == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpage = picpage;
		return this;
	}

	public VolumeQuery picpageGreaterThanOrEqual(
			Integer picpageGreaterThanOrEqual) {
		if (picpageGreaterThanOrEqual == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpageGreaterThanOrEqual = picpageGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery picpageLessThanOrEqual(Integer picpageLessThanOrEqual) {
		if (picpageLessThanOrEqual == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpageLessThanOrEqual = picpageLessThanOrEqual;
		return this;
	}

	public VolumeQuery picpages(List<Integer> picpages) {
		if (picpages == null) {
			throw new RuntimeException("picpages is empty ");
		}
		this.picpages = picpages;
		return this;
	}

	public VolumeQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public VolumeQuery pidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		if (pidGreaterThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery pidLessThanOrEqual(Integer pidLessThanOrEqual) {
		if (pidLessThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidLessThanOrEqual = pidLessThanOrEqual;
		return this;
	}

	public VolumeQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public VolumeQuery place(String place) {
		if (place == null) {
			throw new RuntimeException("place is null");
		}
		this.place = place;
		return this;
	}

	public VolumeQuery placeLike(String placeLike) {
		if (placeLike == null) {
			throw new RuntimeException("place is null");
		}
		this.placeLike = placeLike;
		return this;
	}

	public VolumeQuery places(List<String> places) {
		if (places == null) {
			throw new RuntimeException("places is empty ");
		}
		this.places = places;
		return this;
	}

	public VolumeQuery pnameLike(String pnameLike) {
		if (pnameLike == null) {
			throw new RuntimeException("pname is null");
		}
		this.pnameLike = pnameLike;
		return this;
	}

	public VolumeQuery projid(Integer projid) {
		if (projid == null) {
			throw new RuntimeException("projid is null");
		}
		this.projid = projid;
		return this;
	}

	public VolumeQuery projidGreaterThanOrEqual(Integer projidGreaterThanOrEqual) {
		if (projidGreaterThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidGreaterThanOrEqual = projidGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery projidLessThanOrEqual(Integer projidLessThanOrEqual) {
		if (projidLessThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidLessThanOrEqual = projidLessThanOrEqual;
		return this;
	}

	public VolumeQuery projids(List<Integer> projids) {
		if (projids == null) {
			throw new RuntimeException("projids is empty ");
		}
		this.projids = projids;
		return this;
	}

	public VolumeQuery roomnum(String roomnum) {
		if (roomnum == null) {
			throw new RuntimeException("roomnum is null");
		}
		this.roomnum = roomnum;
		return this;
	}

	public VolumeQuery roomnumLike(String roomnumLike) {
		if (roomnumLike == null) {
			throw new RuntimeException("roomnum is null");
		}
		this.roomnumLike = roomnumLike;
		return this;
	}

	public VolumeQuery roomnums(List<String> roomnums) {
		if (roomnums == null) {
			throw new RuntimeException("roomnums is empty ");
		}
		this.roomnums = roomnums;
		return this;
	}

	public VolumeQuery ruleflag(String ruleflag) {
		if (ruleflag == null) {
			throw new RuntimeException("ruleflag is null");
		}
		this.ruleflag = ruleflag;
		return this;
	}

	public VolumeQuery ruleflagLike(String ruleflagLike) {
		if (ruleflagLike == null) {
			throw new RuntimeException("ruleflag is null");
		}
		this.ruleflagLike = ruleflagLike;
		return this;
	}

	public VolumeQuery ruleflags(List<String> ruleflags) {
		if (ruleflags == null) {
			throw new RuntimeException("ruleflags is empty ");
		}
		this.ruleflags = ruleflags;
		return this;
	}

	public VolumeQuery ruleID(String ruleID) {
		if (ruleID == null) {
			throw new RuntimeException("ruleID is null");
		}
		this.ruleID = ruleID;
		return this;
	}

	public VolumeQuery ruleIDLike(String ruleIDLike) {
		if (ruleIDLike == null) {
			throw new RuntimeException("ruleID is null");
		}
		this.ruleIDLike = ruleIDLike;
		return this;
	}

	public VolumeQuery ruleIDs(List<String> ruleIDs) {
		if (ruleIDs == null) {
			throw new RuntimeException("ruleIDs is empty ");
		}
		this.ruleIDs = ruleIDs;
		return this;
	}

	public VolumeQuery rulepid(String rulepid) {
		if (rulepid == null) {
			throw new RuntimeException("rulepid is null");
		}
		this.rulepid = rulepid;
		return this;
	}

	public VolumeQuery rulepidLike(String rulepidLike) {
		if (rulepidLike == null) {
			throw new RuntimeException("rulepid is null");
		}
		this.rulepidLike = rulepidLike;
		return this;
	}

	public VolumeQuery rulepids(List<String> rulepids) {
		if (rulepids == null) {
			throw new RuntimeException("rulepids is empty ");
		}
		this.rulepids = rulepids;
		return this;
	}

	public VolumeQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public VolumeQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public VolumeQuery savetimes(List<String> savetimes) {
		if (savetimes == null) {
			throw new RuntimeException("savetimes is empty ");
		}
		this.savetimes = savetimes;
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

	public void setAssessor(String assessor) {
		this.assessor = assessor;
	}

	public void setAssessorLike(String assessorLike) {
		this.assessorLike = assessorLike;
	}

	public void setAssessors(List<String> assessors) {
		this.assessors = assessors;
	}

	public void setAtime(Date atime) {
		this.atime = atime;
	}

	public void setAtimeGreaterThanOrEqual(Date atimeGreaterThanOrEqual) {
		this.atimeGreaterThanOrEqual = atimeGreaterThanOrEqual;
	}

	public void setAtimeLessThanOrEqual(Date atimeLessThanOrEqual) {
		this.atimeLessThanOrEqual = atimeLessThanOrEqual;
	}

	public void setAtimes(List<Date> atimes) {
		this.atimes = atimes;
	}

	public void setBoxnum(String boxnum) {
		this.boxnum = boxnum;
	}

	public void setBoxnumLike(String boxnumLike) {
		this.boxnumLike = boxnumLike;
	}

	public void setBoxnums(List<String> boxnums) {
		this.boxnums = boxnums;
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

	public void setCheckupflag(String checkupflag) {
		this.checkupflag = checkupflag;
	}

	public void setCheckupflags(List<String> checkupflags) {
		this.checkupflags = checkupflags;
	}

	public void setCman(String cman) {
		this.cman = cman;
	}

	public void setCmanLike(String cmanLike) {
		this.cmanLike = cmanLike;
	}

	public void setCmans(List<String> cmans) {
		this.cmans = cmans;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
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

	public void setEfilenum(String efilenum) {
		this.efilenum = efilenum;
	}

	public void setEfilenumLike(String efilenumLike) {
		this.efilenumLike = efilenumLike;
	}

	public void setEfilenums(List<String> efilenums) {
		this.efilenums = efilenums;
	}

	public void setEndday(Date endday) {
		this.endday = endday;
	}

	public void setEnddayGreaterThanOrEqual(Date enddayGreaterThanOrEqual) {
		this.enddayGreaterThanOrEqual = enddayGreaterThanOrEqual;
	}

	public void setEnddayLessThanOrEqual(Date enddayLessThanOrEqual) {
		this.enddayLessThanOrEqual = enddayLessThanOrEqual;
	}

	public void setEnddays(List<Date> enddays) {
		this.enddays = enddays;
	}

	public void setFilingflag(String filingflag) {
		this.filingflag = filingflag;
	}

	public void setFilingflags(List<String> filingflags) {
		this.filingflags = filingflags;
	}

	public void setFinishday(Date finishday) {
		this.finishday = finishday;
	}

	public void setFinishdayGreaterThanOrEqual(Date finishdayGreaterThanOrEqual) {
		this.finishdayGreaterThanOrEqual = finishdayGreaterThanOrEqual;
	}

	public void setFinishdayLessThanOrEqual(Date finishdayLessThanOrEqual) {
		this.finishdayLessThanOrEqual = finishdayLessThanOrEqual;
	}

	public void setFinishdays(List<Date> finishdays) {
		this.finishdays = finishdays;
	}

	public void setFinishflag(String finishflag) {
		this.finishflag = finishflag;
	}

	public void setFinishflags(List<String> finishflags) {
		this.finishflags = finishflags;
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

	public void setJconten(String jconten) {
		this.jconten = jconten;
	}

	public void setJcontenLike(String jcontenLike) {
		this.jcontenLike = jcontenLike;
	}

	public void setJcontens(List<String> jcontens) {
		this.jcontens = jcontens;
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

	public void setNumunit(String numunit) {
		this.numunit = numunit;
	}

	public void setNumunitLike(String numunitLike) {
		this.numunitLike = numunitLike;
	}

	public void setNumunits(List<String> numunits) {
		this.numunits = numunits;
	}

	public void setOldid(String oldid) {
		this.oldid = oldid;
	}

	public void setOldidLike(String oldidLike) {
		this.oldidLike = oldidLike;
	}

	public void setOldids(List<String> oldids) {
		this.oldids = oldids;
	}

	public void setOpenflag(String openflag) {
		this.openflag = openflag;
	}

	public void setOpenflags(List<String> openflags) {
		this.openflags = openflags;
	}

	public void setPhotopage(Integer photopage) {
		this.photopage = photopage;
	}

	public void setPhotopageGreaterThanOrEqual(
			Integer photopageGreaterThanOrEqual) {
		this.photopageGreaterThanOrEqual = photopageGreaterThanOrEqual;
	}

	public void setPhotopageLessThanOrEqual(Integer photopageLessThanOrEqual) {
		this.photopageLessThanOrEqual = photopageLessThanOrEqual;
	}

	public void setPhotopages(List<Integer> photopages) {
		this.photopages = photopages;
	}

	public void setPicpage(Integer picpage) {
		this.picpage = picpage;
	}

	public void setPicpageGreaterThanOrEqual(Integer picpageGreaterThanOrEqual) {
		this.picpageGreaterThanOrEqual = picpageGreaterThanOrEqual;
	}

	public void setPicpageLessThanOrEqual(Integer picpageLessThanOrEqual) {
		this.picpageLessThanOrEqual = picpageLessThanOrEqual;
	}

	public void setPicpages(List<Integer> picpages) {
		this.picpages = picpages;
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

	public void setPlace(String place) {
		this.place = place;
	}

	public void setPlaceLike(String placeLike) {
		this.placeLike = placeLike;
	}

	public void setPlaces(List<String> places) {
		this.places = places;
	}

	public void setPnameLike(String pnameLike) {
		this.pnameLike = pnameLike;
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

	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}

	public void setRoomnumLike(String roomnumLike) {
		this.roomnumLike = roomnumLike;
	}

	public void setRoomnums(List<String> roomnums) {
		this.roomnums = roomnums;
	}

	public void setRuleflag(String ruleflag) {
		this.ruleflag = ruleflag;
	}

	public void setRuleflagLike(String ruleflagLike) {
		this.ruleflagLike = ruleflagLike;
	}

	public void setRuleflags(List<String> ruleflags) {
		this.ruleflags = ruleflags;
	}

	public void setRuleID(String ruleID) {
		this.ruleID = ruleID;
	}

	public void setRuleIDLike(String ruleIDLike) {
		this.ruleIDLike = ruleIDLike;
	}

	public void setRuleIDs(List<String> ruleIDs) {
		this.ruleIDs = ruleIDs;
	}

	public void setRulepid(String rulepid) {
		this.rulepid = rulepid;
	}

	public void setRulepidLike(String rulepidLike) {
		this.rulepidLike = rulepidLike;
	}

	public void setRulepids(List<String> rulepids) {
		this.rulepids = rulepids;
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

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public void setSpecLike(String specLike) {
		this.specLike = specLike;
	}

	public void setSpecs(List<String> specs) {
		this.specs = specs;
	}

	public void setStartday(Date startday) {
		this.startday = startday;
	}

	public void setStartdayGreaterThanOrEqual(Date startdayGreaterThanOrEqual) {
		this.startdayGreaterThanOrEqual = startdayGreaterThanOrEqual;
	}

	public void setStartdayLessThanOrEqual(Date startdayLessThanOrEqual) {
		this.startdayLessThanOrEqual = startdayLessThanOrEqual;
	}

	public void setStartdays(List<Date> startdays) {
		this.startdays = startdays;
	}

	public void setSumflag(String sumflag) {
		this.sumflag = sumflag;
	}

	public void setSumflagLike(String sumflagLike) {
		this.sumflagLike = sumflagLike;
	}

	public void setSumflags(List<String> sumflags) {
		this.sumflags = sumflags;
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

	public void setTopid(Integer topid) {
		this.topid = topid;
	}

	public void setTopidGreaterThanOrEqual(Integer topidGreaterThanOrEqual) {
		this.topidGreaterThanOrEqual = topidGreaterThanOrEqual;
	}

	public void setTopidLessThanOrEqual(Integer topidLessThanOrEqual) {
		this.topidLessThanOrEqual = topidLessThanOrEqual;
	}

	public void setTopids(List<Integer> topids) {
		this.topids = topids;
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

	public void setTotalfile(Integer totalfile) {
		this.totalfile = totalfile;
	}

	public void setTotalfileGreaterThanOrEqual(
			Integer totalfileGreaterThanOrEqual) {
		this.totalfileGreaterThanOrEqual = totalfileGreaterThanOrEqual;
	}

	public void setTotalfileLessThanOrEqual(Integer totalfileLessThanOrEqual) {
		this.totalfileLessThanOrEqual = totalfileLessThanOrEqual;
	}

	public void setTotalfiles(List<Integer> totalfiles) {
		this.totalfiles = totalfiles;
	}

	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}

	public void setTotalpageGreaterThanOrEqual(
			Integer totalpageGreaterThanOrEqual) {
		this.totalpageGreaterThanOrEqual = totalpageGreaterThanOrEqual;
	}

	public void setTotalpageLessThanOrEqual(Integer totalpageLessThanOrEqual) {
		this.totalpageLessThanOrEqual = totalpageLessThanOrEqual;
	}

	public void setTotalpages(List<Integer> totalpages) {
		this.totalpages = totalpages;
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

	public void setTxtpage(Integer txtpage) {
		this.txtpage = txtpage;
	}

	public void setTxtpageGreaterThanOrEqual(Integer txtpageGreaterThanOrEqual) {
		this.txtpageGreaterThanOrEqual = txtpageGreaterThanOrEqual;
	}

	public void setTxtpageLessThanOrEqual(Integer txtpageLessThanOrEqual) {
		this.txtpageLessThanOrEqual = txtpageLessThanOrEqual;
	}

	public void setTxtpages(List<Integer> txtpages) {
		this.txtpages = txtpages;
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

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public void setVflagLike(String vflagLike) {
		this.vflagLike = vflagLike;
	}

	public void setVflags(List<String> vflags) {
		this.vflags = vflags;
	}

	public void setVidLike(String vidLike) {
		this.vidLike = vidLike;
	}

	public void setVids(List<String> vids) {
		this.vids = vids;
	}

	public void setVnameLike(String vnameLike) {
		this.vnameLike = vnameLike;
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

	public void setVtagnum(String vtagnum) {
		this.vtagnum = vtagnum;
	}

	public void setVtagnumLike(String vtagnumLike) {
		this.vtagnumLike = vtagnumLike;
	}

	public void setVtagnums(List<String> vtagnums) {
		this.vtagnums = vtagnums;
	}

	public void setVtmpnum(String vtmpnum) {
		this.vtmpnum = vtmpnum;
	}

	public void setVtmpnumLike(String vtmpnumLike) {
		this.vtmpnumLike = vtmpnumLike;
	}

	public void setVtmpnums(List<String> vtmpnums) {
		this.vtmpnums = vtmpnums;
	}

	public void setVtype(String vtype) {
		this.vtype = vtype;
	}

	public void setVtypeLike(String vtypeLike) {
		this.vtypeLike = vtypeLike;
	}

	public void setVtypes(List<String> vtypes) {
		this.vtypes = vtypes;
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

	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}

	public void setWdateGreaterThanOrEqual(Date wdateGreaterThanOrEqual) {
		this.wdateGreaterThanOrEqual = wdateGreaterThanOrEqual;
	}

	public void setWdateLessThanOrEqual(Date wdateLessThanOrEqual) {
		this.wdateLessThanOrEqual = wdateLessThanOrEqual;
	}

	public void setWdates(List<Date> wdates) {
		this.wdates = wdates;
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

	public void setZoonum(String zoonum) {
		this.zoonum = zoonum;
	}

	public void setZoonumLike(String zoonumLike) {
		this.zoonumLike = zoonumLike;
	}

	public void setZoonums(List<String> zoonums) {
		this.zoonums = zoonums;
	}

	public VolumeQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public VolumeQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public VolumeQuery slevels(List<String> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public VolumeQuery spec(String spec) {
		if (spec == null) {
			throw new RuntimeException("spec is null");
		}
		this.spec = spec;
		return this;
	}

	public VolumeQuery specLike(String specLike) {
		if (specLike == null) {
			throw new RuntimeException("spec is null");
		}
		this.specLike = specLike;
		return this;
	}

	public VolumeQuery specs(List<String> specs) {
		if (specs == null) {
			throw new RuntimeException("specs is empty ");
		}
		this.specs = specs;
		return this;
	}

	public VolumeQuery startday(Date startday) {
		if (startday == null) {
			throw new RuntimeException("startday is null");
		}
		this.startday = startday;
		return this;
	}

	public VolumeQuery startdayGreaterThanOrEqual(
			Date startdayGreaterThanOrEqual) {
		if (startdayGreaterThanOrEqual == null) {
			throw new RuntimeException("startday is null");
		}
		this.startdayGreaterThanOrEqual = startdayGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery startdayLessThanOrEqual(Date startdayLessThanOrEqual) {
		if (startdayLessThanOrEqual == null) {
			throw new RuntimeException("startday is null");
		}
		this.startdayLessThanOrEqual = startdayLessThanOrEqual;
		return this;
	}

	public VolumeQuery startdays(List<Date> startdays) {
		if (startdays == null) {
			throw new RuntimeException("startdays is empty ");
		}
		this.startdays = startdays;
		return this;
	}

	public VolumeQuery sumflag(String sumflag) {
		if (sumflag == null) {
			throw new RuntimeException("sumflag is null");
		}
		this.sumflag = sumflag;
		return this;
	}

	public VolumeQuery sumflagLike(String sumflagLike) {
		if (sumflagLike == null) {
			throw new RuntimeException("sumflag is null");
		}
		this.sumflagLike = sumflagLike;
		return this;
	}

	public VolumeQuery sumflags(List<String> sumflags) {
		if (sumflags == null) {
			throw new RuntimeException("sumflags is empty ");
		}
		this.sumflags = sumflags;
		return this;
	}

	public VolumeQuery tassessor(String tassessor) {
		if (tassessor == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessor = tassessor;
		return this;
	}

	public VolumeQuery tassessorLike(String tassessorLike) {
		if (tassessorLike == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessorLike = tassessorLike;
		return this;
	}

	public VolumeQuery tassessors(List<String> tassessors) {
		if (tassessors == null) {
			throw new RuntimeException("tassessors is empty ");
		}
		this.tassessors = tassessors;
		return this;
	}

	public VolumeQuery tdesigner(String tdesigner) {
		if (tdesigner == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesigner = tdesigner;
		return this;
	}

	public VolumeQuery tdesignerLike(String tdesignerLike) {
		if (tdesignerLike == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesignerLike = tdesignerLike;
		return this;
	}

	public VolumeQuery tdesigners(List<String> tdesigners) {
		if (tdesigners == null) {
			throw new RuntimeException("tdesigners is empty ");
		}
		this.tdesigners = tdesigners;
		return this;
	}

	public VolumeQuery tflag(String tflag) {
		if (tflag == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflag = tflag;
		return this;
	}

	public VolumeQuery tflagLike(String tflagLike) {
		if (tflagLike == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflagLike = tflagLike;
		return this;
	}

	public VolumeQuery tflags(List<String> tflags) {
		if (tflags == null) {
			throw new RuntimeException("tflags is empty ");
		}
		this.tflags = tflags;
		return this;
	}

	public VolumeQuery thematic(String thematic) {
		if (thematic == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematic = thematic;
		return this;
	}

	public VolumeQuery thematicLike(String thematicLike) {
		if (thematicLike == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematicLike = thematicLike;
		return this;
	}

	public VolumeQuery thematics(List<String> thematics) {
		if (thematics == null) {
			throw new RuntimeException("thematics is empty ");
		}
		this.thematics = thematics;
		return this;
	}

	public VolumeQuery tname(String tname) {
		if (tname == null) {
			throw new RuntimeException("tname is null");
		}
		this.tname = tname;
		return this;
	}

	public VolumeQuery tnameLike(String tnameLike) {
		if (tnameLike == null) {
			throw new RuntimeException("tname is null");
		}
		this.tnameLike = tnameLike;
		return this;
	}

	public VolumeQuery tnames(List<String> tnames) {
		if (tnames == null) {
			throw new RuntimeException("tnames is empty ");
		}
		this.tnames = tnames;
		return this;
	}

	public VolumeQuery tnum(String tnum) {
		if (tnum == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnum = tnum;
		return this;
	}

	public VolumeQuery tnumLike(String tnumLike) {
		if (tnumLike == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnumLike = tnumLike;
		return this;
	}

	public VolumeQuery tnums(List<String> tnums) {
		if (tnums == null) {
			throw new RuntimeException("tnums is empty ");
		}
		this.tnums = tnums;
		return this;
	}

	public VolumeQuery topid(Integer topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public VolumeQuery topidGreaterThanOrEqual(Integer topidGreaterThanOrEqual) {
		if (topidGreaterThanOrEqual == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidGreaterThanOrEqual = topidGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery topidLessThanOrEqual(Integer topidLessThanOrEqual) {
		if (topidLessThanOrEqual == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLessThanOrEqual = topidLessThanOrEqual;
		return this;
	}

	public VolumeQuery topids(List<Integer> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public VolumeQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public VolumeQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public VolumeQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public VolumeQuery totalfile(Integer totalfile) {
		if (totalfile == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfile = totalfile;
		return this;
	}

	public VolumeQuery totalfileGreaterThanOrEqual(
			Integer totalfileGreaterThanOrEqual) {
		if (totalfileGreaterThanOrEqual == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfileGreaterThanOrEqual = totalfileGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery totalfileLessThanOrEqual(Integer totalfileLessThanOrEqual) {
		if (totalfileLessThanOrEqual == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfileLessThanOrEqual = totalfileLessThanOrEqual;
		return this;
	}

	public VolumeQuery totalfiles(List<Integer> totalfiles) {
		if (totalfiles == null) {
			throw new RuntimeException("totalfiles is empty ");
		}
		this.totalfiles = totalfiles;
		return this;
	}

	public VolumeQuery totalpage(Integer totalpage) {
		if (totalpage == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpage = totalpage;
		return this;
	}

	public VolumeQuery totalpageGreaterThanOrEqual(
			Integer totalpageGreaterThanOrEqual) {
		if (totalpageGreaterThanOrEqual == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpageGreaterThanOrEqual = totalpageGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery totalpageLessThanOrEqual(Integer totalpageLessThanOrEqual) {
		if (totalpageLessThanOrEqual == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpageLessThanOrEqual = totalpageLessThanOrEqual;
		return this;
	}

	public VolumeQuery totalpages(List<Integer> totalpages) {
		if (totalpages == null) {
			throw new RuntimeException("totalpages is empty ");
		}
		this.totalpages = totalpages;
		return this;
	}

	public VolumeQuery tviewer(String tviewer) {
		if (tviewer == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewer = tviewer;
		return this;
	}

	public VolumeQuery tviewerLike(String tviewerLike) {
		if (tviewerLike == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewerLike = tviewerLike;
		return this;
	}

	public VolumeQuery tviewers(List<String> tviewers) {
		if (tviewers == null) {
			throw new RuntimeException("tviewers is empty ");
		}
		this.tviewers = tviewers;
		return this;
	}

	public VolumeQuery tvision(String tvision) {
		if (tvision == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvision = tvision;
		return this;
	}

	public VolumeQuery tvisionLike(String tvisionLike) {
		if (tvisionLike == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvisionLike = tvisionLike;
		return this;
	}

	public VolumeQuery tvisions(List<String> tvisions) {
		if (tvisions == null) {
			throw new RuntimeException("tvisions is empty ");
		}
		this.tvisions = tvisions;
		return this;
	}

	public VolumeQuery txtpage(Integer txtpage) {
		if (txtpage == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpage = txtpage;
		return this;
	}

	public VolumeQuery txtpageGreaterThanOrEqual(
			Integer txtpageGreaterThanOrEqual) {
		if (txtpageGreaterThanOrEqual == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpageGreaterThanOrEqual = txtpageGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery txtpageLessThanOrEqual(Integer txtpageLessThanOrEqual) {
		if (txtpageLessThanOrEqual == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpageLessThanOrEqual = txtpageLessThanOrEqual;
		return this;
	}

	public VolumeQuery txtpages(List<Integer> txtpages) {
		if (txtpages == null) {
			throw new RuntimeException("txtpages is empty ");
		}
		this.txtpages = txtpages;
		return this;
	}

	public VolumeQuery tzoom(String tzoom) {
		if (tzoom == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoom = tzoom;
		return this;
	}

	public VolumeQuery tzoomLike(String tzoomLike) {
		if (tzoomLike == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoomLike = tzoomLike;
		return this;
	}

	public VolumeQuery tzooms(List<String> tzooms) {
		if (tzooms == null) {
			throw new RuntimeException("tzooms is empty ");
		}
		this.tzooms = tzooms;
		return this;
	}

	public VolumeQuery vflag(String vflag) {
		if (vflag == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflag = vflag;
		return this;
	}

	public VolumeQuery vflagLike(String vflagLike) {
		if (vflagLike == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflagLike = vflagLike;
		return this;
	}

	public VolumeQuery vflags(List<String> vflags) {
		if (vflags == null) {
			throw new RuntimeException("vflags is empty ");
		}
		this.vflags = vflags;
		return this;
	}

	public VolumeQuery vidLike(String vidLike) {
		if (vidLike == null) {
			throw new RuntimeException("vid is null");
		}
		this.vidLike = vidLike;
		return this;
	}

	public VolumeQuery vids(List<String> vids) {
		if (vids == null) {
			throw new RuntimeException("vids is empty ");
		}
		this.vids = vids;
		return this;
	}

	public VolumeQuery vnameLike(String vnameLike) {
		if (vnameLike == null) {
			throw new RuntimeException("vname is null");
		}
		this.vnameLike = vnameLike;
		return this;
	}

	public VolumeQuery vnum(String vnum) {
		if (vnum == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnum = vnum;
		return this;
	}

	public VolumeQuery vnumLike(String vnumLike) {
		if (vnumLike == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnumLike = vnumLike;
		return this;
	}

	public VolumeQuery vnums(List<String> vnums) {
		if (vnums == null) {
			throw new RuntimeException("vnums is empty ");
		}
		this.vnums = vnums;
		return this;
	}

	public VolumeQuery vtagnum(String vtagnum) {
		if (vtagnum == null) {
			throw new RuntimeException("vtagnum is null");
		}
		this.vtagnum = vtagnum;
		return this;
	}

	public VolumeQuery vtagnumLike(String vtagnumLike) {
		if (vtagnumLike == null) {
			throw new RuntimeException("vtagnum is null");
		}
		this.vtagnumLike = vtagnumLike;
		return this;
	}

	public VolumeQuery vtagnums(List<String> vtagnums) {
		if (vtagnums == null) {
			throw new RuntimeException("vtagnums is empty ");
		}
		this.vtagnums = vtagnums;
		return this;
	}

	public VolumeQuery vtmpnum(String vtmpnum) {
		if (vtmpnum == null) {
			throw new RuntimeException("vtmpnum is null");
		}
		this.vtmpnum = vtmpnum;
		return this;
	}

	public VolumeQuery vtmpnumLike(String vtmpnumLike) {
		if (vtmpnumLike == null) {
			throw new RuntimeException("vtmpnum is null");
		}
		this.vtmpnumLike = vtmpnumLike;
		return this;
	}

	public VolumeQuery vtmpnums(List<String> vtmpnums) {
		if (vtmpnums == null) {
			throw new RuntimeException("vtmpnums is empty ");
		}
		this.vtmpnums = vtmpnums;
		return this;
	}

	public VolumeQuery vtype(String vtype) {
		if (vtype == null) {
			throw new RuntimeException("vtype is null");
		}
		this.vtype = vtype;
		return this;
	}

	public VolumeQuery vtypeLike(String vtypeLike) {
		if (vtypeLike == null) {
			throw new RuntimeException("vtype is null");
		}
		this.vtypeLike = vtypeLike;
		return this;
	}

	public VolumeQuery vtypes(List<String> vtypes) {
		if (vtypes == null) {
			throw new RuntimeException("vtypes is empty ");
		}
		this.vtypes = vtypes;
		return this;
	}

	public VolumeQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public VolumeQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public VolumeQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

	public VolumeQuery wdate(Date wdate) {
		if (wdate == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdate = wdate;
		return this;
	}

	public VolumeQuery wdateGreaterThanOrEqual(Date wdateGreaterThanOrEqual) {
		if (wdateGreaterThanOrEqual == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdateGreaterThanOrEqual = wdateGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery wdateLessThanOrEqual(Date wdateLessThanOrEqual) {
		if (wdateLessThanOrEqual == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdateLessThanOrEqual = wdateLessThanOrEqual;
		return this;
	}

	public VolumeQuery wdates(List<Date> wdates) {
		if (wdates == null) {
			throw new RuntimeException("wdates is empty ");
		}
		this.wdates = wdates;
		return this;
	}

	public VolumeQuery year(Integer year) {
		if (year == null) {
			throw new RuntimeException("year is null");
		}
		this.year = year;
		return this;
	}

	public VolumeQuery yearGreaterThanOrEqual(Integer yearGreaterThanOrEqual) {
		if (yearGreaterThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearGreaterThanOrEqual = yearGreaterThanOrEqual;
		return this;
	}

	public VolumeQuery yearLessThanOrEqual(Integer yearLessThanOrEqual) {
		if (yearLessThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearLessThanOrEqual = yearLessThanOrEqual;
		return this;
	}

	public VolumeQuery years(List<Integer> years) {
		if (years == null) {
			throw new RuntimeException("years is empty ");
		}
		this.years = years;
		return this;
	}

	public VolumeQuery zoonum(String zoonum) {
		if (zoonum == null) {
			throw new RuntimeException("zoonum is null");
		}
		this.zoonum = zoonum;
		return this;
	}

	public VolumeQuery zoonumLike(String zoonumLike) {
		if (zoonumLike == null) {
			throw new RuntimeException("zoonum is null");
		}
		this.zoonumLike = zoonumLike;
		return this;
	}

	public VolumeQuery zoonums(List<String> zoonums) {
		if (zoonums == null) {
			throw new RuntimeException("zoonums is empty ");
		}
		this.zoonums = zoonums;
		return this;
	}

}