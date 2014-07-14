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

package com.glaf.dms.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

/**
 * 
 * 查询类
 * 
 */
public class DmsVolumeQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<String> ids;
	protected Integer listno;
	protected Integer listnoGreaterThanOrEqual;
	protected Integer listnoLessThanOrEqual;
	protected List<Integer> listnos;
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
	protected String vid;
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
	protected String pname;
	protected String pnameLike;
	protected List<String> pnames;
	protected String vflag;
	protected String vflagLike;
	protected List<String> vflags;
	protected String vname;
	protected String vnameLike;
	protected List<String> vnames;
	protected Integer year;
	protected Integer yearGreaterThanOrEqual;
	protected Integer yearLessThanOrEqual;
	protected List<Integer> years;
	protected String glidenum;
	protected String glidenumLike;
	protected List<String> glidenums;
	protected String filingflag;
	protected String filingflagLike;
	protected List<String> filingflags;
	protected String checkupflag;
	protected String checkupflagLike;
	protected List<String> checkupflags;
	protected String openflag;
	protected String openflagLike;
	protected List<String> openflags;
	protected String finishflag;
	protected String finishflagLike;
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
	protected String treenodeLike;
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
	protected String choosePublishFlag;
	protected String choosePublishFlagLike;
	protected List<String> choosePublishFlags;
	protected Long choosePublishTime;
	protected Long choosePublishTimeGreaterThanOrEqual;
	protected Long choosePublishTimeLessThanOrEqual;
	protected List<Long> choosePublishTimes;
	protected Integer publishdiskid;
	protected Integer publishdiskidGreaterThanOrEqual;
	protected Integer publishdiskidLessThanOrEqual;
	protected List<Integer> publishdiskids;
	protected String dmsTreenodes;

	public DmsVolumeQuery() {

	}

	public DmsVolumeQuery annotations(String annotations) {
		if (annotations == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotations = annotations;
		return this;
	}

	public DmsVolumeQuery annotationsLike(String annotationsLike) {
		if (annotationsLike == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotationsLike = annotationsLike;
		return this;
	}

	public DmsVolumeQuery annotationss(List<String> annotationss) {
		if (annotationss == null) {
			throw new RuntimeException("annotationss is empty ");
		}
		this.annotationss = annotationss;
		return this;
	}

	public DmsVolumeQuery assessor(String assessor) {
		if (assessor == null) {
			throw new RuntimeException("assessor is null");
		}
		this.assessor = assessor;
		return this;
	}

	public DmsVolumeQuery assessorLike(String assessorLike) {
		if (assessorLike == null) {
			throw new RuntimeException("assessor is null");
		}
		this.assessorLike = assessorLike;
		return this;
	}

	public DmsVolumeQuery assessors(List<String> assessors) {
		if (assessors == null) {
			throw new RuntimeException("assessors is empty ");
		}
		this.assessors = assessors;
		return this;
	}

	public DmsVolumeQuery atime(Date atime) {
		if (atime == null) {
			throw new RuntimeException("atime is null");
		}
		this.atime = atime;
		return this;
	}

	public DmsVolumeQuery atimeGreaterThanOrEqual(Date atimeGreaterThanOrEqual) {
		if (atimeGreaterThanOrEqual == null) {
			throw new RuntimeException("atime is null");
		}
		this.atimeGreaterThanOrEqual = atimeGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery atimeLessThanOrEqual(Date atimeLessThanOrEqual) {
		if (atimeLessThanOrEqual == null) {
			throw new RuntimeException("atime is null");
		}
		this.atimeLessThanOrEqual = atimeLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery atimes(List<Date> atimes) {
		if (atimes == null) {
			throw new RuntimeException("atimes is empty ");
		}
		this.atimes = atimes;
		return this;
	}

	public DmsVolumeQuery boxnum(String boxnum) {
		if (boxnum == null) {
			throw new RuntimeException("boxnum is null");
		}
		this.boxnum = boxnum;
		return this;
	}

	public DmsVolumeQuery boxnumLike(String boxnumLike) {
		if (boxnumLike == null) {
			throw new RuntimeException("boxnum is null");
		}
		this.boxnumLike = boxnumLike;
		return this;
	}

	public DmsVolumeQuery boxnums(List<String> boxnums) {
		if (boxnums == null) {
			throw new RuntimeException("boxnums is empty ");
		}
		this.boxnums = boxnums;
		return this;
	}

	public DmsVolumeQuery carriertype(String carriertype) {
		if (carriertype == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertype = carriertype;
		return this;
	}

	public DmsVolumeQuery carriertypeLike(String carriertypeLike) {
		if (carriertypeLike == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertypeLike = carriertypeLike;
		return this;
	}

	public DmsVolumeQuery carriertypes(List<String> carriertypes) {
		if (carriertypes == null) {
			throw new RuntimeException("carriertypes is empty ");
		}
		this.carriertypes = carriertypes;
		return this;
	}

	public DmsVolumeQuery checkupflag(String checkupflag) {
		if (checkupflag == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflag = checkupflag;
		return this;
	}

	public DmsVolumeQuery checkupflagLike(String checkupflagLike) {
		if (checkupflagLike == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflagLike = checkupflagLike;
		return this;
	}

	public DmsVolumeQuery checkupflags(List<String> checkupflags) {
		if (checkupflags == null) {
			throw new RuntimeException("checkupflags is empty ");
		}
		this.checkupflags = checkupflags;
		return this;
	}

	public DmsVolumeQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsVolumeQuery choosePublishFlagLike(String choosePublishFlagLike) {
		if (choosePublishFlagLike == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlagLike = choosePublishFlagLike;
		return this;
	}

	public DmsVolumeQuery choosePublishFlags(List<String> choosePublishFlags) {
		if (choosePublishFlags == null) {
			throw new RuntimeException("choosePublishFlags is empty ");
		}
		this.choosePublishFlags = choosePublishFlags;
		return this;
	}

	public DmsVolumeQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsVolumeQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery choosePublishTimes(List<Long> choosePublishTimes) {
		if (choosePublishTimes == null) {
			throw new RuntimeException("choosePublishTimes is empty ");
		}
		this.choosePublishTimes = choosePublishTimes;
		return this;
	}

	public DmsVolumeQuery cman(String cman) {
		if (cman == null) {
			throw new RuntimeException("cman is null");
		}
		this.cman = cman;
		return this;
	}

	public DmsVolumeQuery cmanLike(String cmanLike) {
		if (cmanLike == null) {
			throw new RuntimeException("cman is null");
		}
		this.cmanLike = cmanLike;
		return this;
	}

	public DmsVolumeQuery cmans(List<String> cmans) {
		if (cmans == null) {
			throw new RuntimeException("cmans is empty ");
		}
		this.cmans = cmans;
		return this;
	}

	public DmsVolumeQuery content(String content) {
		if (content == null) {
			throw new RuntimeException("content is null");
		}
		this.content = content;
		return this;
	}

	public DmsVolumeQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public DmsVolumeQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
		return this;
	}

	public DmsVolumeQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public DmsVolumeQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public DmsVolumeQuery efilenum(String efilenum) {
		if (efilenum == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenum = efilenum;
		return this;
	}

	public DmsVolumeQuery efilenumLike(String efilenumLike) {
		if (efilenumLike == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumLike = efilenumLike;
		return this;
	}

	public DmsVolumeQuery efilenums(List<String> efilenums) {
		if (efilenums == null) {
			throw new RuntimeException("efilenums is empty ");
		}
		this.efilenums = efilenums;
		return this;
	}

	public DmsVolumeQuery endday(Date endday) {
		if (endday == null) {
			throw new RuntimeException("endday is null");
		}
		this.endday = endday;
		return this;
	}

	public DmsVolumeQuery enddayGreaterThanOrEqual(Date enddayGreaterThanOrEqual) {
		if (enddayGreaterThanOrEqual == null) {
			throw new RuntimeException("endday is null");
		}
		this.enddayGreaterThanOrEqual = enddayGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery enddayLessThanOrEqual(Date enddayLessThanOrEqual) {
		if (enddayLessThanOrEqual == null) {
			throw new RuntimeException("endday is null");
		}
		this.enddayLessThanOrEqual = enddayLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery enddays(List<Date> enddays) {
		if (enddays == null) {
			throw new RuntimeException("enddays is empty ");
		}
		this.enddays = enddays;
		return this;
	}

	public DmsVolumeQuery filingflag(String filingflag) {
		if (filingflag == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflag = filingflag;
		return this;
	}

	public DmsVolumeQuery filingflagLike(String filingflagLike) {
		if (filingflagLike == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflagLike = filingflagLike;
		return this;
	}

	public DmsVolumeQuery filingflags(List<String> filingflags) {
		if (filingflags == null) {
			throw new RuntimeException("filingflags is empty ");
		}
		this.filingflags = filingflags;
		return this;
	}

	public DmsVolumeQuery finishday(Date finishday) {
		if (finishday == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishday = finishday;
		return this;
	}

	public DmsVolumeQuery finishdayGreaterThanOrEqual(
			Date finishdayGreaterThanOrEqual) {
		if (finishdayGreaterThanOrEqual == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishdayGreaterThanOrEqual = finishdayGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery finishdayLessThanOrEqual(Date finishdayLessThanOrEqual) {
		if (finishdayLessThanOrEqual == null) {
			throw new RuntimeException("finishday is null");
		}
		this.finishdayLessThanOrEqual = finishdayLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery finishdays(List<Date> finishdays) {
		if (finishdays == null) {
			throw new RuntimeException("finishdays is empty ");
		}
		this.finishdays = finishdays;
		return this;
	}

	public DmsVolumeQuery finishflag(String finishflag) {
		if (finishflag == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflag = finishflag;
		return this;
	}

	public DmsVolumeQuery finishflagLike(String finishflagLike) {
		if (finishflagLike == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflagLike = finishflagLike;
		return this;
	}

	public DmsVolumeQuery finishflags(List<String> finishflags) {
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

	public String getChoosePublishFlag() {
		return choosePublishFlag;
	}

	public String getChoosePublishFlagLike() {
		if (choosePublishFlagLike != null
				&& choosePublishFlagLike.trim().length() > 0) {
			if (!choosePublishFlagLike.startsWith("%")) {
				choosePublishFlagLike = "%" + choosePublishFlagLike;
			}
			if (!choosePublishFlagLike.endsWith("%")) {
				choosePublishFlagLike = choosePublishFlagLike + "%";
			}
		}
		return choosePublishFlagLike;
	}

	public List<String> getChoosePublishFlags() {
		return choosePublishFlags;
	}

	public Long getChoosePublishTime() {
		return choosePublishTime;
	}

	public Long getChoosePublishTimeGreaterThanOrEqual() {
		return choosePublishTimeGreaterThanOrEqual;
	}

	public Long getChoosePublishTimeLessThanOrEqual() {
		return choosePublishTimeLessThanOrEqual;
	}

	public List<Long> getChoosePublishTimes() {
		return choosePublishTimes;
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

	public String getDmsTreenodes() {
		return dmsTreenodes;
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
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("listno".equals(sortColumn)) {
				orderBy = "E.LISTNO" + a_x;
			}

			if ("oldid".equals(sortColumn)) {
				orderBy = "E.OLDID" + a_x;
			}

			if ("ruleID".equals(sortColumn)) {
				orderBy = "E.RULEID" + a_x;
			}

			if ("ruleflag".equals(sortColumn)) {
				orderBy = "E.RULEFLAG" + a_x;
			}

			if ("rulepid".equals(sortColumn)) {
				orderBy = "E.RULEPID" + a_x;
			}

			if ("vid".equals(sortColumn)) {
				orderBy = "E.VID" + a_x;
			}

			if ("sumflag".equals(sortColumn)) {
				orderBy = "E.SUMFLAG" + a_x;
			}

			if ("topid".equals(sortColumn)) {
				orderBy = "E.TOPID" + a_x;
			}

			if ("indexId".equals(sortColumn)) {
				orderBy = "E.INDEX_ID" + a_x;
			}

			if ("projid".equals(sortColumn)) {
				orderBy = "E.PROJID" + a_x;
			}

			if ("pid".equals(sortColumn)) {
				orderBy = "E.PID" + a_x;
			}

			if ("pname".equals(sortColumn)) {
				orderBy = "E.PNAME" + a_x;
			}

			if ("vflag".equals(sortColumn)) {
				orderBy = "E.VFLAG" + a_x;
			}

			if ("vname".equals(sortColumn)) {
				orderBy = "E.VNAME" + a_x;
			}

			if ("year".equals(sortColumn)) {
				orderBy = "E.YEAR" + a_x;
			}

			if ("glidenum".equals(sortColumn)) {
				orderBy = "E.GLIDENUM" + a_x;
			}

			if ("filingflag".equals(sortColumn)) {
				orderBy = "E.FILINGFLAG" + a_x;
			}

			if ("checkupflag".equals(sortColumn)) {
				orderBy = "E.CHECKUPFLAG" + a_x;
			}

			if ("openflag".equals(sortColumn)) {
				orderBy = "E.OPENFLAG" + a_x;
			}

			if ("finishflag".equals(sortColumn)) {
				orderBy = "E.FINISHFLAG" + a_x;
			}

			if ("vtagnum".equals(sortColumn)) {
				orderBy = "E.VTAGNUM" + a_x;
			}

			if ("vtype".equals(sortColumn)) {
				orderBy = "E.VTYPE" + a_x;
			}

			if ("vnum".equals(sortColumn)) {
				orderBy = "E.VNUM" + a_x;
			}

			if ("vtmpnum".equals(sortColumn)) {
				orderBy = "E.VTMPNUM" + a_x;
			}

			if ("roomnum".equals(sortColumn)) {
				orderBy = "E.ROOMNUM" + a_x;
			}

			if ("zoonum".equals(sortColumn)) {
				orderBy = "E.ZOONUM" + a_x;
			}

			if ("efilenum".equals(sortColumn)) {
				orderBy = "E.EFILENUM" + a_x;
			}

			if ("boxnum".equals(sortColumn)) {
				orderBy = "E.BOXNUM" + a_x;
			}

			if ("place".equals(sortColumn)) {
				orderBy = "E.PLACE" + a_x;
			}

			if ("tname".equals(sortColumn)) {
				orderBy = "E.TNAME" + a_x;
			}

			if ("wcompany".equals(sortColumn)) {
				orderBy = "E.WCOMPANY" + a_x;
			}

			if ("wdate".equals(sortColumn)) {
				orderBy = "E.WDATE" + a_x;
			}

			if ("carriertype".equals(sortColumn)) {
				orderBy = "E.CARRIERTYPE" + a_x;
			}

			if ("numunit".equals(sortColumn)) {
				orderBy = "E.NUMUNIT" + a_x;
			}

			if ("spec".equals(sortColumn)) {
				orderBy = "E.SPEC" + a_x;
			}

			if ("startday".equals(sortColumn)) {
				orderBy = "E.STARTDAY" + a_x;
			}

			if ("endday".equals(sortColumn)) {
				orderBy = "E.ENDDAY" + a_x;
			}

			if ("savetime".equals(sortColumn)) {
				orderBy = "E.SAVETIME" + a_x;
			}

			if ("slevel".equals(sortColumn)) {
				orderBy = "E.SLEVEL" + a_x;
			}

			if ("thematic".equals(sortColumn)) {
				orderBy = "E.THEMATIC" + a_x;
			}

			if ("annotations".equals(sortColumn)) {
				orderBy = "E.ANNOTATIONS" + a_x;
			}

			if ("totalfile".equals(sortColumn)) {
				orderBy = "E.TOTALFILE" + a_x;
			}

			if ("totalpage".equals(sortColumn)) {
				orderBy = "E.TOTALPAGE" + a_x;
			}

			if ("txtpage".equals(sortColumn)) {
				orderBy = "E.TXTPAGE" + a_x;
			}

			if ("picpage".equals(sortColumn)) {
				orderBy = "E.PICPAGE" + a_x;
			}

			if ("photopage".equals(sortColumn)) {
				orderBy = "E.PHOTOPAGE" + a_x;
			}

			if ("cman".equals(sortColumn)) {
				orderBy = "E.CMAN" + a_x;
			}

			if ("ctime".equals(sortColumn)) {
				orderBy = "E.CTIME" + a_x;
			}

			if ("assessor".equals(sortColumn)) {
				orderBy = "E.ASSESSOR" + a_x;
			}

			if ("atime".equals(sortColumn)) {
				orderBy = "E.ATIME" + a_x;
			}

			if ("content".equals(sortColumn)) {
				orderBy = "E.CONTENT" + a_x;
			}

			if ("islocate".equals(sortColumn)) {
				orderBy = "E.ISLOCATE" + a_x;
			}

			if ("topnode".equals(sortColumn)) {
				orderBy = "E.TOPNODE" + a_x;
			}

			if ("lcontent".equals(sortColumn)) {
				orderBy = "E.LCONTENT" + a_x;
			}

			if ("lcompany".equals(sortColumn)) {
				orderBy = "E.LCOMPANY" + a_x;
			}

			if ("lman".equals(sortColumn)) {
				orderBy = "E.LMAN" + a_x;
			}

			if ("llen".equals(sortColumn)) {
				orderBy = "E.LLEN" + a_x;
			}

			if ("ldate".equals(sortColumn)) {
				orderBy = "E.LDATE" + a_x;
			}

			if ("jconten".equals(sortColumn)) {
				orderBy = "E.JCONTEN" + a_x;
			}

			if ("jplace".equals(sortColumn)) {
				orderBy = "E.JPLACE" + a_x;
			}

			if ("jman".equals(sortColumn)) {
				orderBy = "E.JMAN" + a_x;
			}

			if ("jback".equals(sortColumn)) {
				orderBy = "E.JBACK" + a_x;
			}

			if ("jactor".equals(sortColumn)) {
				orderBy = "E.JACTOR" + a_x;
			}

			if ("tnum".equals(sortColumn)) {
				orderBy = "E.TNUM" + a_x;
			}

			if ("tzoom".equals(sortColumn)) {
				orderBy = "E.TZOOM" + a_x;
			}

			if ("tflag".equals(sortColumn)) {
				orderBy = "E.TFLAG" + a_x;
			}

			if ("tdesigner".equals(sortColumn)) {
				orderBy = "E.TDESIGNER" + a_x;
			}

			if ("tviewer".equals(sortColumn)) {
				orderBy = "E.TVIEWER" + a_x;
			}

			if ("tassessor".equals(sortColumn)) {
				orderBy = "E.TASSESSOR" + a_x;
			}

			if ("tvision".equals(sortColumn)) {
				orderBy = "E.TVISION" + a_x;
			}

			if ("finishday".equals(sortColumn)) {
				orderBy = "E.FINISHDAY" + a_x;
			}

			if ("choosePublishFlag".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHFLAG" + a_x;
			}

			if ("choosePublishTime".equals(sortColumn)) {
				orderBy = "E.CHOOSEPUBLISHTIME" + a_x;
			}

			if ("publishdiskid".equals(sortColumn)) {
				orderBy = "E.PUBLISHDISKID" + a_x;
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

	public String getPname() {
		return pname;
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

	public List<String> getPnames() {
		return pnames;
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

	public Integer getPublishdiskid() {
		return publishdiskid;
	}

	public Integer getPublishdiskidGreaterThanOrEqual() {
		return publishdiskidGreaterThanOrEqual;
	}

	public Integer getPublishdiskidLessThanOrEqual() {
		return publishdiskidLessThanOrEqual;
	}

	public List<Integer> getPublishdiskids() {
		return publishdiskids;
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

	public String getTreenodeLike() {
		if (treenodeLike != null && treenodeLike.trim().length() > 0) {
			if (!treenodeLike.startsWith("%")) {
				treenodeLike = "%" + treenodeLike;
			}
			if (!treenodeLike.endsWith("%")) {
				treenodeLike = treenodeLike + "%";
			}
		}
		return treenodeLike;
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

	public String getVname() {
		return vname;
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

	public List<String> getVnames() {
		return vnames;
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

	public DmsVolumeQuery glidenum(String glidenum) {
		if (glidenum == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenum = glidenum;
		return this;
	}

	public DmsVolumeQuery glidenumLike(String glidenumLike) {
		if (glidenumLike == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenumLike = glidenumLike;
		return this;
	}

	public DmsVolumeQuery glidenums(List<String> glidenums) {
		if (glidenums == null) {
			throw new RuntimeException("glidenums is empty ");
		}
		this.glidenums = glidenums;
		return this;
	}

	public DmsVolumeQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public DmsVolumeQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID");
		addColumn("listno", "LISTNO");
		addColumn("oldid", "OLDID");
		addColumn("ruleID", "RULEID");
		addColumn("ruleflag", "RULEFLAG");
		addColumn("rulepid", "RULEPID");
		addColumn("vid", "VID");
		addColumn("sumflag", "SUMFLAG");
		addColumn("topid", "TOPID");
		addColumn("indexId", "INDEX_ID");
		addColumn("projid", "PROJID");
		addColumn("pid", "PID");
		addColumn("pname", "PNAME");
		addColumn("vflag", "VFLAG");
		addColumn("vname", "VNAME");
		addColumn("year", "YEAR");
		addColumn("glidenum", "GLIDENUM");
		addColumn("filingflag", "FILINGFLAG");
		addColumn("checkupflag", "CHECKUPFLAG");
		addColumn("openflag", "OPENFLAG");
		addColumn("finishflag", "FINISHFLAG");
		addColumn("vtagnum", "VTAGNUM");
		addColumn("vtype", "VTYPE");
		addColumn("vnum", "VNUM");
		addColumn("vtmpnum", "VTMPNUM");
		addColumn("roomnum", "ROOMNUM");
		addColumn("zoonum", "ZOONUM");
		addColumn("efilenum", "EFILENUM");
		addColumn("boxnum", "BOXNUM");
		addColumn("place", "PLACE");
		addColumn("tname", "TNAME");
		addColumn("wcompany", "WCOMPANY");
		addColumn("wdate", "WDATE");
		addColumn("carriertype", "CARRIERTYPE");
		addColumn("numunit", "NUMUNIT");
		addColumn("spec", "SPEC");
		addColumn("startday", "STARTDAY");
		addColumn("endday", "ENDDAY");
		addColumn("savetime", "SAVETIME");
		addColumn("slevel", "SLEVEL");
		addColumn("thematic", "THEMATIC");
		addColumn("annotations", "ANNOTATIONS");
		addColumn("totalfile", "TOTALFILE");
		addColumn("totalpage", "TOTALPAGE");
		addColumn("txtpage", "TXTPAGE");
		addColumn("picpage", "PICPAGE");
		addColumn("photopage", "PHOTOPAGE");
		addColumn("cman", "CMAN");
		addColumn("ctime", "CTIME");
		addColumn("assessor", "ASSESSOR");
		addColumn("atime", "ATIME");
		addColumn("content", "CONTENT");
		addColumn("islocate", "ISLOCATE");
		addColumn("topnode", "TOPNODE");
		addColumn("lcontent", "LCONTENT");
		addColumn("lcompany", "LCOMPANY");
		addColumn("lman", "LMAN");
		addColumn("llen", "LLEN");
		addColumn("ldate", "LDATE");
		addColumn("jconten", "JCONTEN");
		addColumn("jplace", "JPLACE");
		addColumn("jman", "JMAN");
		addColumn("jback", "JBACK");
		addColumn("jactor", "JACTOR");
		addColumn("tnum", "TNUM");
		addColumn("tzoom", "TZOOM");
		addColumn("tflag", "TFLAG");
		addColumn("tdesigner", "TDESIGNER");
		addColumn("tviewer", "TVIEWER");
		addColumn("tassessor", "TASSESSOR");
		addColumn("tvision", "TVISION");
		addColumn("finishday", "FINISHDAY");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

	public DmsVolumeQuery islocate(String islocate) {
		if (islocate == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocate = islocate;
		return this;
	}

	public DmsVolumeQuery islocateLike(String islocateLike) {
		if (islocateLike == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocateLike = islocateLike;
		return this;
	}

	public DmsVolumeQuery islocates(List<String> islocates) {
		if (islocates == null) {
			throw new RuntimeException("islocates is empty ");
		}
		this.islocates = islocates;
		return this;
	}

	public DmsVolumeQuery jactor(String jactor) {
		if (jactor == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactor = jactor;
		return this;
	}

	public DmsVolumeQuery jactorLike(String jactorLike) {
		if (jactorLike == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactorLike = jactorLike;
		return this;
	}

	public DmsVolumeQuery jactors(List<String> jactors) {
		if (jactors == null) {
			throw new RuntimeException("jactors is empty ");
		}
		this.jactors = jactors;
		return this;
	}

	public DmsVolumeQuery jback(String jback) {
		if (jback == null) {
			throw new RuntimeException("jback is null");
		}
		this.jback = jback;
		return this;
	}

	public DmsVolumeQuery jbackLike(String jbackLike) {
		if (jbackLike == null) {
			throw new RuntimeException("jback is null");
		}
		this.jbackLike = jbackLike;
		return this;
	}

	public DmsVolumeQuery jbacks(List<String> jbacks) {
		if (jbacks == null) {
			throw new RuntimeException("jbacks is empty ");
		}
		this.jbacks = jbacks;
		return this;
	}

	public DmsVolumeQuery jconten(String jconten) {
		if (jconten == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jconten = jconten;
		return this;
	}

	public DmsVolumeQuery jcontenLike(String jcontenLike) {
		if (jcontenLike == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jcontenLike = jcontenLike;
		return this;
	}

	public DmsVolumeQuery jcontens(List<String> jcontens) {
		if (jcontens == null) {
			throw new RuntimeException("jcontens is empty ");
		}
		this.jcontens = jcontens;
		return this;
	}

	public DmsVolumeQuery jman(String jman) {
		if (jman == null) {
			throw new RuntimeException("jman is null");
		}
		this.jman = jman;
		return this;
	}

	public DmsVolumeQuery jmanLike(String jmanLike) {
		if (jmanLike == null) {
			throw new RuntimeException("jman is null");
		}
		this.jmanLike = jmanLike;
		return this;
	}

	public DmsVolumeQuery jmans(List<String> jmans) {
		if (jmans == null) {
			throw new RuntimeException("jmans is empty ");
		}
		this.jmans = jmans;
		return this;
	}

	public DmsVolumeQuery jplace(String jplace) {
		if (jplace == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplace = jplace;
		return this;
	}

	public DmsVolumeQuery jplaceLike(String jplaceLike) {
		if (jplaceLike == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplaceLike = jplaceLike;
		return this;
	}

	public DmsVolumeQuery jplaces(List<String> jplaces) {
		if (jplaces == null) {
			throw new RuntimeException("jplaces is empty ");
		}
		this.jplaces = jplaces;
		return this;
	}

	public DmsVolumeQuery lcompany(String lcompany) {
		if (lcompany == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompany = lcompany;
		return this;
	}

	public DmsVolumeQuery lcompanyLike(String lcompanyLike) {
		if (lcompanyLike == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompanyLike = lcompanyLike;
		return this;
	}

	public DmsVolumeQuery lcompanys(List<String> lcompanys) {
		if (lcompanys == null) {
			throw new RuntimeException("lcompanys is empty ");
		}
		this.lcompanys = lcompanys;
		return this;
	}

	public DmsVolumeQuery lcontent(String lcontent) {
		if (lcontent == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontent = lcontent;
		return this;
	}

	public DmsVolumeQuery lcontentLike(String lcontentLike) {
		if (lcontentLike == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontentLike = lcontentLike;
		return this;
	}

	public DmsVolumeQuery lcontents(List<String> lcontents) {
		if (lcontents == null) {
			throw new RuntimeException("lcontents is empty ");
		}
		this.lcontents = lcontents;
		return this;
	}

	public DmsVolumeQuery ldate(Date ldate) {
		if (ldate == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldate = ldate;
		return this;
	}

	public DmsVolumeQuery ldateGreaterThanOrEqual(Date ldateGreaterThanOrEqual) {
		if (ldateGreaterThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateGreaterThanOrEqual = ldateGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery ldateLessThanOrEqual(Date ldateLessThanOrEqual) {
		if (ldateLessThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateLessThanOrEqual = ldateLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery ldates(List<Date> ldates) {
		if (ldates == null) {
			throw new RuntimeException("ldates is empty ");
		}
		this.ldates = ldates;
		return this;
	}

	public DmsVolumeQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public DmsVolumeQuery listnoGreaterThanOrEqual(
			Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public DmsVolumeQuery llen(String llen) {
		if (llen == null) {
			throw new RuntimeException("llen is null");
		}
		this.llen = llen;
		return this;
	}

	public DmsVolumeQuery llenLike(String llenLike) {
		if (llenLike == null) {
			throw new RuntimeException("llen is null");
		}
		this.llenLike = llenLike;
		return this;
	}

	public DmsVolumeQuery llens(List<String> llens) {
		if (llens == null) {
			throw new RuntimeException("llens is empty ");
		}
		this.llens = llens;
		return this;
	}

	public DmsVolumeQuery lman(String lman) {
		if (lman == null) {
			throw new RuntimeException("lman is null");
		}
		this.lman = lman;
		return this;
	}

	public DmsVolumeQuery lmanLike(String lmanLike) {
		if (lmanLike == null) {
			throw new RuntimeException("lman is null");
		}
		this.lmanLike = lmanLike;
		return this;
	}

	public DmsVolumeQuery lmans(List<String> lmans) {
		if (lmans == null) {
			throw new RuntimeException("lmans is empty ");
		}
		this.lmans = lmans;
		return this;
	}

	public DmsVolumeQuery numunit(String numunit) {
		if (numunit == null) {
			throw new RuntimeException("numunit is null");
		}
		this.numunit = numunit;
		return this;
	}

	public DmsVolumeQuery numunitLike(String numunitLike) {
		if (numunitLike == null) {
			throw new RuntimeException("numunit is null");
		}
		this.numunitLike = numunitLike;
		return this;
	}

	public DmsVolumeQuery numunits(List<String> numunits) {
		if (numunits == null) {
			throw new RuntimeException("numunits is empty ");
		}
		this.numunits = numunits;
		return this;
	}

	public DmsVolumeQuery oldid(String oldid) {
		if (oldid == null) {
			throw new RuntimeException("oldid is null");
		}
		this.oldid = oldid;
		return this;
	}

	public DmsVolumeQuery oldidLike(String oldidLike) {
		if (oldidLike == null) {
			throw new RuntimeException("oldid is null");
		}
		this.oldidLike = oldidLike;
		return this;
	}

	public DmsVolumeQuery oldids(List<String> oldids) {
		if (oldids == null) {
			throw new RuntimeException("oldids is empty ");
		}
		this.oldids = oldids;
		return this;
	}

	public DmsVolumeQuery openflag(String openflag) {
		if (openflag == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflag = openflag;
		return this;
	}

	public DmsVolumeQuery openflagLike(String openflagLike) {
		if (openflagLike == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflagLike = openflagLike;
		return this;
	}

	public DmsVolumeQuery openflags(List<String> openflags) {
		if (openflags == null) {
			throw new RuntimeException("openflags is empty ");
		}
		this.openflags = openflags;
		return this;
	}

	public DmsVolumeQuery photopage(Integer photopage) {
		if (photopage == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopage = photopage;
		return this;
	}

	public DmsVolumeQuery photopageGreaterThanOrEqual(
			Integer photopageGreaterThanOrEqual) {
		if (photopageGreaterThanOrEqual == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopageGreaterThanOrEqual = photopageGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery photopageLessThanOrEqual(
			Integer photopageLessThanOrEqual) {
		if (photopageLessThanOrEqual == null) {
			throw new RuntimeException("photopage is null");
		}
		this.photopageLessThanOrEqual = photopageLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery photopages(List<Integer> photopages) {
		if (photopages == null) {
			throw new RuntimeException("photopages is empty ");
		}
		this.photopages = photopages;
		return this;
	}

	public DmsVolumeQuery picpage(Integer picpage) {
		if (picpage == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpage = picpage;
		return this;
	}

	public DmsVolumeQuery picpageGreaterThanOrEqual(
			Integer picpageGreaterThanOrEqual) {
		if (picpageGreaterThanOrEqual == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpageGreaterThanOrEqual = picpageGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery picpageLessThanOrEqual(Integer picpageLessThanOrEqual) {
		if (picpageLessThanOrEqual == null) {
			throw new RuntimeException("picpage is null");
		}
		this.picpageLessThanOrEqual = picpageLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery picpages(List<Integer> picpages) {
		if (picpages == null) {
			throw new RuntimeException("picpages is empty ");
		}
		this.picpages = picpages;
		return this;
	}

	public DmsVolumeQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public DmsVolumeQuery pidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		if (pidGreaterThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery pidLessThanOrEqual(Integer pidLessThanOrEqual) {
		if (pidLessThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidLessThanOrEqual = pidLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public DmsVolumeQuery place(String place) {
		if (place == null) {
			throw new RuntimeException("place is null");
		}
		this.place = place;
		return this;
	}

	public DmsVolumeQuery placeLike(String placeLike) {
		if (placeLike == null) {
			throw new RuntimeException("place is null");
		}
		this.placeLike = placeLike;
		return this;
	}

	public DmsVolumeQuery places(List<String> places) {
		if (places == null) {
			throw new RuntimeException("places is empty ");
		}
		this.places = places;
		return this;
	}

	public DmsVolumeQuery pname(String pname) {
		if (pname == null) {
			throw new RuntimeException("pname is null");
		}
		this.pname = pname;
		return this;
	}

	public DmsVolumeQuery pnameLike(String pnameLike) {
		if (pnameLike == null) {
			throw new RuntimeException("pname is null");
		}
		this.pnameLike = pnameLike;
		return this;
	}

	public DmsVolumeQuery pnames(List<String> pnames) {
		if (pnames == null) {
			throw new RuntimeException("pnames is empty ");
		}
		this.pnames = pnames;
		return this;
	}

	public DmsVolumeQuery projid(Integer projid) {
		if (projid == null) {
			throw new RuntimeException("projid is null");
		}
		this.projid = projid;
		return this;
	}

	public DmsVolumeQuery projidGreaterThanOrEqual(
			Integer projidGreaterThanOrEqual) {
		if (projidGreaterThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidGreaterThanOrEqual = projidGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery projidLessThanOrEqual(Integer projidLessThanOrEqual) {
		if (projidLessThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidLessThanOrEqual = projidLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery projids(List<Integer> projids) {
		if (projids == null) {
			throw new RuntimeException("projids is empty ");
		}
		this.projids = projids;
		return this;
	}

	public DmsVolumeQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public DmsVolumeQuery publishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		if (publishdiskidGreaterThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery publishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		if (publishdiskidLessThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery publishdiskids(List<Integer> publishdiskids) {
		if (publishdiskids == null) {
			throw new RuntimeException("publishdiskids is empty ");
		}
		this.publishdiskids = publishdiskids;
		return this;
	}

	public DmsVolumeQuery roomnum(String roomnum) {
		if (roomnum == null) {
			throw new RuntimeException("roomnum is null");
		}
		this.roomnum = roomnum;
		return this;
	}

	public DmsVolumeQuery roomnumLike(String roomnumLike) {
		if (roomnumLike == null) {
			throw new RuntimeException("roomnum is null");
		}
		this.roomnumLike = roomnumLike;
		return this;
	}

	public DmsVolumeQuery roomnums(List<String> roomnums) {
		if (roomnums == null) {
			throw new RuntimeException("roomnums is empty ");
		}
		this.roomnums = roomnums;
		return this;
	}

	public DmsVolumeQuery ruleflag(String ruleflag) {
		if (ruleflag == null) {
			throw new RuntimeException("ruleflag is null");
		}
		this.ruleflag = ruleflag;
		return this;
	}

	public DmsVolumeQuery ruleflagLike(String ruleflagLike) {
		if (ruleflagLike == null) {
			throw new RuntimeException("ruleflag is null");
		}
		this.ruleflagLike = ruleflagLike;
		return this;
	}

	public DmsVolumeQuery ruleflags(List<String> ruleflags) {
		if (ruleflags == null) {
			throw new RuntimeException("ruleflags is empty ");
		}
		this.ruleflags = ruleflags;
		return this;
	}

	public DmsVolumeQuery ruleID(String ruleID) {
		if (ruleID == null) {
			throw new RuntimeException("ruleID is null");
		}
		this.ruleID = ruleID;
		return this;
	}

	public DmsVolumeQuery ruleIDLike(String ruleIDLike) {
		if (ruleIDLike == null) {
			throw new RuntimeException("ruleID is null");
		}
		this.ruleIDLike = ruleIDLike;
		return this;
	}

	public DmsVolumeQuery ruleIDs(List<String> ruleIDs) {
		if (ruleIDs == null) {
			throw new RuntimeException("ruleIDs is empty ");
		}
		this.ruleIDs = ruleIDs;
		return this;
	}

	public DmsVolumeQuery rulepid(String rulepid) {
		if (rulepid == null) {
			throw new RuntimeException("rulepid is null");
		}
		this.rulepid = rulepid;
		return this;
	}

	public DmsVolumeQuery rulepidLike(String rulepidLike) {
		if (rulepidLike == null) {
			throw new RuntimeException("rulepid is null");
		}
		this.rulepidLike = rulepidLike;
		return this;
	}

	public DmsVolumeQuery rulepids(List<String> rulepids) {
		if (rulepids == null) {
			throw new RuntimeException("rulepids is empty ");
		}
		this.rulepids = rulepids;
		return this;
	}

	public DmsVolumeQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public DmsVolumeQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public DmsVolumeQuery savetimes(List<String> savetimes) {
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

	public void setCheckupflagLike(String checkupflagLike) {
		this.checkupflagLike = checkupflagLike;
	}

	public void setCheckupflags(List<String> checkupflags) {
		this.checkupflags = checkupflags;
	}

	public void setChoosePublishFlag(String choosePublishFlag) {
		this.choosePublishFlag = choosePublishFlag;
	}

	public void setChoosePublishFlagLike(String choosePublishFlagLike) {
		this.choosePublishFlagLike = choosePublishFlagLike;
	}

	public void setChoosePublishFlags(List<String> choosePublishFlags) {
		this.choosePublishFlags = choosePublishFlags;
	}

	public void setChoosePublishTime(Long choosePublishTime) {
		this.choosePublishTime = choosePublishTime;
	}

	public void setChoosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
	}

	public void setChoosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
	}

	public void setChoosePublishTimes(List<Long> choosePublishTimes) {
		this.choosePublishTimes = choosePublishTimes;
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

	public void setDmsTreenodes(String dmsTreenodes) {
		this.dmsTreenodes = dmsTreenodes;
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

	public void setFilingflagLike(String filingflagLike) {
		this.filingflagLike = filingflagLike;
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

	public void setFinishflagLike(String finishflagLike) {
		this.finishflagLike = finishflagLike;
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

	public void setOpenflagLike(String openflagLike) {
		this.openflagLike = openflagLike;
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

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPnameLike(String pnameLike) {
		this.pnameLike = pnameLike;
	}

	public void setPnames(List<String> pnames) {
		this.pnames = pnames;
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

	public void setPublishdiskid(Integer publishdiskid) {
		this.publishdiskid = publishdiskid;
	}

	public void setPublishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
	}

	public void setPublishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
	}

	public void setPublishdiskids(List<Integer> publishdiskids) {
		this.publishdiskids = publishdiskids;
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

	public void setTreenodeLike(String treenodeLike) {
		this.treenodeLike = treenodeLike;
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

	public void setVid(String vid) {
		this.vid = vid;
	}

	public void setVidLike(String vidLike) {
		this.vidLike = vidLike;
	}

	public void setVids(List<String> vids) {
		this.vids = vids;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public void setVnameLike(String vnameLike) {
		this.vnameLike = vnameLike;
	}

	public void setVnames(List<String> vnames) {
		this.vnames = vnames;
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

	public DmsVolumeQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public DmsVolumeQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public DmsVolumeQuery slevels(List<String> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public DmsVolumeQuery spec(String spec) {
		if (spec == null) {
			throw new RuntimeException("spec is null");
		}
		this.spec = spec;
		return this;
	}

	public DmsVolumeQuery specLike(String specLike) {
		if (specLike == null) {
			throw new RuntimeException("spec is null");
		}
		this.specLike = specLike;
		return this;
	}

	public DmsVolumeQuery specs(List<String> specs) {
		if (specs == null) {
			throw new RuntimeException("specs is empty ");
		}
		this.specs = specs;
		return this;
	}

	public DmsVolumeQuery startday(Date startday) {
		if (startday == null) {
			throw new RuntimeException("startday is null");
		}
		this.startday = startday;
		return this;
	}

	public DmsVolumeQuery startdayGreaterThanOrEqual(
			Date startdayGreaterThanOrEqual) {
		if (startdayGreaterThanOrEqual == null) {
			throw new RuntimeException("startday is null");
		}
		this.startdayGreaterThanOrEqual = startdayGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery startdayLessThanOrEqual(Date startdayLessThanOrEqual) {
		if (startdayLessThanOrEqual == null) {
			throw new RuntimeException("startday is null");
		}
		this.startdayLessThanOrEqual = startdayLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery startdays(List<Date> startdays) {
		if (startdays == null) {
			throw new RuntimeException("startdays is empty ");
		}
		this.startdays = startdays;
		return this;
	}

	public DmsVolumeQuery sumflag(String sumflag) {
		if (sumflag == null) {
			throw new RuntimeException("sumflag is null");
		}
		this.sumflag = sumflag;
		return this;
	}

	public DmsVolumeQuery sumflagLike(String sumflagLike) {
		if (sumflagLike == null) {
			throw new RuntimeException("sumflag is null");
		}
		this.sumflagLike = sumflagLike;
		return this;
	}

	public DmsVolumeQuery sumflags(List<String> sumflags) {
		if (sumflags == null) {
			throw new RuntimeException("sumflags is empty ");
		}
		this.sumflags = sumflags;
		return this;
	}

	public DmsVolumeQuery tassessor(String tassessor) {
		if (tassessor == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessor = tassessor;
		return this;
	}

	public DmsVolumeQuery tassessorLike(String tassessorLike) {
		if (tassessorLike == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessorLike = tassessorLike;
		return this;
	}

	public DmsVolumeQuery tassessors(List<String> tassessors) {
		if (tassessors == null) {
			throw new RuntimeException("tassessors is empty ");
		}
		this.tassessors = tassessors;
		return this;
	}

	public DmsVolumeQuery tdesigner(String tdesigner) {
		if (tdesigner == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesigner = tdesigner;
		return this;
	}

	public DmsVolumeQuery tdesignerLike(String tdesignerLike) {
		if (tdesignerLike == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesignerLike = tdesignerLike;
		return this;
	}

	public DmsVolumeQuery tdesigners(List<String> tdesigners) {
		if (tdesigners == null) {
			throw new RuntimeException("tdesigners is empty ");
		}
		this.tdesigners = tdesigners;
		return this;
	}

	public DmsVolumeQuery tflag(String tflag) {
		if (tflag == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflag = tflag;
		return this;
	}

	public DmsVolumeQuery tflagLike(String tflagLike) {
		if (tflagLike == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflagLike = tflagLike;
		return this;
	}

	public DmsVolumeQuery tflags(List<String> tflags) {
		if (tflags == null) {
			throw new RuntimeException("tflags is empty ");
		}
		this.tflags = tflags;
		return this;
	}

	public DmsVolumeQuery thematic(String thematic) {
		if (thematic == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematic = thematic;
		return this;
	}

	public DmsVolumeQuery thematicLike(String thematicLike) {
		if (thematicLike == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematicLike = thematicLike;
		return this;
	}

	public DmsVolumeQuery thematics(List<String> thematics) {
		if (thematics == null) {
			throw new RuntimeException("thematics is empty ");
		}
		this.thematics = thematics;
		return this;
	}

	public DmsVolumeQuery tname(String tname) {
		if (tname == null) {
			throw new RuntimeException("tname is null");
		}
		this.tname = tname;
		return this;
	}

	public DmsVolumeQuery tnameLike(String tnameLike) {
		if (tnameLike == null) {
			throw new RuntimeException("tname is null");
		}
		this.tnameLike = tnameLike;
		return this;
	}

	public DmsVolumeQuery tnames(List<String> tnames) {
		if (tnames == null) {
			throw new RuntimeException("tnames is empty ");
		}
		this.tnames = tnames;
		return this;
	}

	public DmsVolumeQuery tnum(String tnum) {
		if (tnum == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnum = tnum;
		return this;
	}

	public DmsVolumeQuery tnumLike(String tnumLike) {
		if (tnumLike == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnumLike = tnumLike;
		return this;
	}

	public DmsVolumeQuery tnums(List<String> tnums) {
		if (tnums == null) {
			throw new RuntimeException("tnums is empty ");
		}
		this.tnums = tnums;
		return this;
	}

	public DmsVolumeQuery topid(Integer topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public DmsVolumeQuery topidGreaterThanOrEqual(
			Integer topidGreaterThanOrEqual) {
		if (topidGreaterThanOrEqual == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidGreaterThanOrEqual = topidGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery topidLessThanOrEqual(Integer topidLessThanOrEqual) {
		if (topidLessThanOrEqual == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLessThanOrEqual = topidLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery topids(List<Integer> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public DmsVolumeQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public DmsVolumeQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public DmsVolumeQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public DmsVolumeQuery totalfile(Integer totalfile) {
		if (totalfile == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfile = totalfile;
		return this;
	}

	public DmsVolumeQuery totalfileGreaterThanOrEqual(
			Integer totalfileGreaterThanOrEqual) {
		if (totalfileGreaterThanOrEqual == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfileGreaterThanOrEqual = totalfileGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery totalfileLessThanOrEqual(
			Integer totalfileLessThanOrEqual) {
		if (totalfileLessThanOrEqual == null) {
			throw new RuntimeException("totalfile is null");
		}
		this.totalfileLessThanOrEqual = totalfileLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery totalfiles(List<Integer> totalfiles) {
		if (totalfiles == null) {
			throw new RuntimeException("totalfiles is empty ");
		}
		this.totalfiles = totalfiles;
		return this;
	}

	public DmsVolumeQuery totalpage(Integer totalpage) {
		if (totalpage == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpage = totalpage;
		return this;
	}

	public DmsVolumeQuery totalpageGreaterThanOrEqual(
			Integer totalpageGreaterThanOrEqual) {
		if (totalpageGreaterThanOrEqual == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpageGreaterThanOrEqual = totalpageGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery totalpageLessThanOrEqual(
			Integer totalpageLessThanOrEqual) {
		if (totalpageLessThanOrEqual == null) {
			throw new RuntimeException("totalpage is null");
		}
		this.totalpageLessThanOrEqual = totalpageLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery totalpages(List<Integer> totalpages) {
		if (totalpages == null) {
			throw new RuntimeException("totalpages is empty ");
		}
		this.totalpages = totalpages;
		return this;
	}

	public DmsVolumeQuery tviewer(String tviewer) {
		if (tviewer == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewer = tviewer;
		return this;
	}

	public DmsVolumeQuery tviewerLike(String tviewerLike) {
		if (tviewerLike == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewerLike = tviewerLike;
		return this;
	}

	public DmsVolumeQuery tviewers(List<String> tviewers) {
		if (tviewers == null) {
			throw new RuntimeException("tviewers is empty ");
		}
		this.tviewers = tviewers;
		return this;
	}

	public DmsVolumeQuery tvision(String tvision) {
		if (tvision == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvision = tvision;
		return this;
	}

	public DmsVolumeQuery tvisionLike(String tvisionLike) {
		if (tvisionLike == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvisionLike = tvisionLike;
		return this;
	}

	public DmsVolumeQuery tvisions(List<String> tvisions) {
		if (tvisions == null) {
			throw new RuntimeException("tvisions is empty ");
		}
		this.tvisions = tvisions;
		return this;
	}

	public DmsVolumeQuery txtpage(Integer txtpage) {
		if (txtpage == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpage = txtpage;
		return this;
	}

	public DmsVolumeQuery txtpageGreaterThanOrEqual(
			Integer txtpageGreaterThanOrEqual) {
		if (txtpageGreaterThanOrEqual == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpageGreaterThanOrEqual = txtpageGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery txtpageLessThanOrEqual(Integer txtpageLessThanOrEqual) {
		if (txtpageLessThanOrEqual == null) {
			throw new RuntimeException("txtpage is null");
		}
		this.txtpageLessThanOrEqual = txtpageLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery txtpages(List<Integer> txtpages) {
		if (txtpages == null) {
			throw new RuntimeException("txtpages is empty ");
		}
		this.txtpages = txtpages;
		return this;
	}

	public DmsVolumeQuery tzoom(String tzoom) {
		if (tzoom == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoom = tzoom;
		return this;
	}

	public DmsVolumeQuery tzoomLike(String tzoomLike) {
		if (tzoomLike == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoomLike = tzoomLike;
		return this;
	}

	public DmsVolumeQuery tzooms(List<String> tzooms) {
		if (tzooms == null) {
			throw new RuntimeException("tzooms is empty ");
		}
		this.tzooms = tzooms;
		return this;
	}

	public DmsVolumeQuery vflag(String vflag) {
		if (vflag == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflag = vflag;
		return this;
	}

	public DmsVolumeQuery vflagLike(String vflagLike) {
		if (vflagLike == null) {
			throw new RuntimeException("vflag is null");
		}
		this.vflagLike = vflagLike;
		return this;
	}

	public DmsVolumeQuery vflags(List<String> vflags) {
		if (vflags == null) {
			throw new RuntimeException("vflags is empty ");
		}
		this.vflags = vflags;
		return this;
	}

	public DmsVolumeQuery vid(String vid) {
		if (vid == null) {
			throw new RuntimeException("vid is null");
		}
		this.vid = vid;
		return this;
	}

	public DmsVolumeQuery vidLike(String vidLike) {
		if (vidLike == null) {
			throw new RuntimeException("vid is null");
		}
		this.vidLike = vidLike;
		return this;
	}

	public DmsVolumeQuery vids(List<String> vids) {
		if (vids == null) {
			throw new RuntimeException("vids is empty ");
		}
		this.vids = vids;
		return this;
	}

	public DmsVolumeQuery vname(String vname) {
		if (vname == null) {
			throw new RuntimeException("vname is null");
		}
		this.vname = vname;
		return this;
	}

	public DmsVolumeQuery vnameLike(String vnameLike) {
		if (vnameLike == null) {
			throw new RuntimeException("vname is null");
		}
		this.vnameLike = vnameLike;
		return this;
	}

	public DmsVolumeQuery vnames(List<String> vnames) {
		if (vnames == null) {
			throw new RuntimeException("vnames is empty ");
		}
		this.vnames = vnames;
		return this;
	}

	public DmsVolumeQuery vnum(String vnum) {
		if (vnum == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnum = vnum;
		return this;
	}

	public DmsVolumeQuery vnumLike(String vnumLike) {
		if (vnumLike == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnumLike = vnumLike;
		return this;
	}

	public DmsVolumeQuery vnums(List<String> vnums) {
		if (vnums == null) {
			throw new RuntimeException("vnums is empty ");
		}
		this.vnums = vnums;
		return this;
	}

	public DmsVolumeQuery vtagnum(String vtagnum) {
		if (vtagnum == null) {
			throw new RuntimeException("vtagnum is null");
		}
		this.vtagnum = vtagnum;
		return this;
	}

	public DmsVolumeQuery vtagnumLike(String vtagnumLike) {
		if (vtagnumLike == null) {
			throw new RuntimeException("vtagnum is null");
		}
		this.vtagnumLike = vtagnumLike;
		return this;
	}

	public DmsVolumeQuery vtagnums(List<String> vtagnums) {
		if (vtagnums == null) {
			throw new RuntimeException("vtagnums is empty ");
		}
		this.vtagnums = vtagnums;
		return this;
	}

	public DmsVolumeQuery vtmpnum(String vtmpnum) {
		if (vtmpnum == null) {
			throw new RuntimeException("vtmpnum is null");
		}
		this.vtmpnum = vtmpnum;
		return this;
	}

	public DmsVolumeQuery vtmpnumLike(String vtmpnumLike) {
		if (vtmpnumLike == null) {
			throw new RuntimeException("vtmpnum is null");
		}
		this.vtmpnumLike = vtmpnumLike;
		return this;
	}

	public DmsVolumeQuery vtmpnums(List<String> vtmpnums) {
		if (vtmpnums == null) {
			throw new RuntimeException("vtmpnums is empty ");
		}
		this.vtmpnums = vtmpnums;
		return this;
	}

	public DmsVolumeQuery vtype(String vtype) {
		if (vtype == null) {
			throw new RuntimeException("vtype is null");
		}
		this.vtype = vtype;
		return this;
	}

	public DmsVolumeQuery vtypeLike(String vtypeLike) {
		if (vtypeLike == null) {
			throw new RuntimeException("vtype is null");
		}
		this.vtypeLike = vtypeLike;
		return this;
	}

	public DmsVolumeQuery vtypes(List<String> vtypes) {
		if (vtypes == null) {
			throw new RuntimeException("vtypes is empty ");
		}
		this.vtypes = vtypes;
		return this;
	}

	public DmsVolumeQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public DmsVolumeQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public DmsVolumeQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

	public DmsVolumeQuery wdate(Date wdate) {
		if (wdate == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdate = wdate;
		return this;
	}

	public DmsVolumeQuery wdateGreaterThanOrEqual(Date wdateGreaterThanOrEqual) {
		if (wdateGreaterThanOrEqual == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdateGreaterThanOrEqual = wdateGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery wdateLessThanOrEqual(Date wdateLessThanOrEqual) {
		if (wdateLessThanOrEqual == null) {
			throw new RuntimeException("wdate is null");
		}
		this.wdateLessThanOrEqual = wdateLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery wdates(List<Date> wdates) {
		if (wdates == null) {
			throw new RuntimeException("wdates is empty ");
		}
		this.wdates = wdates;
		return this;
	}

	public DmsVolumeQuery year(Integer year) {
		if (year == null) {
			throw new RuntimeException("year is null");
		}
		this.year = year;
		return this;
	}

	public DmsVolumeQuery yearGreaterThanOrEqual(Integer yearGreaterThanOrEqual) {
		if (yearGreaterThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearGreaterThanOrEqual = yearGreaterThanOrEqual;
		return this;
	}

	public DmsVolumeQuery yearLessThanOrEqual(Integer yearLessThanOrEqual) {
		if (yearLessThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearLessThanOrEqual = yearLessThanOrEqual;
		return this;
	}

	public DmsVolumeQuery years(List<Integer> years) {
		if (years == null) {
			throw new RuntimeException("years is empty ");
		}
		this.years = years;
		return this;
	}

	public DmsVolumeQuery zoonum(String zoonum) {
		if (zoonum == null) {
			throw new RuntimeException("zoonum is null");
		}
		this.zoonum = zoonum;
		return this;
	}

	public DmsVolumeQuery zoonumLike(String zoonumLike) {
		if (zoonumLike == null) {
			throw new RuntimeException("zoonum is null");
		}
		this.zoonumLike = zoonumLike;
		return this;
	}

	public DmsVolumeQuery zoonums(List<String> zoonums) {
		if (zoonums == null) {
			throw new RuntimeException("zoonums is empty ");
		}
		this.zoonums = zoonums;
		return this;
	}

}