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
public class DmsPfileQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected List<String> ids;
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
	protected Date ctimeEnd;
	protected Date ctimeEndGreaterThanOrEqual;
	protected Date ctimeEndLessThanOrEqual;
	protected List<Date> ctimeEnds;
	protected Integer sysListno;
	protected Integer sysListnoGreaterThanOrEqual;
	protected Integer sysListnoLessThanOrEqual;
	protected List<Integer> sysListnos;
	protected Integer sysaddint;
	protected Integer sysaddintGreaterThanOrEqual;
	protected Integer sysaddintLessThanOrEqual;
	protected List<Integer> sysaddints;
	protected Integer chkefileint;
	protected Integer chkefileintGreaterThanOrEqual;
	protected Integer chkefileintLessThanOrEqual;
	protected List<Integer> chkefileints;
	protected Integer projIndex;
	protected Integer projIndexGreaterThanOrEqual;
	protected Integer projIndexLessThanOrEqual;
	protected List<Integer> projIndexs;
	protected Integer noscan;
	protected Integer noscanGreaterThanOrEqual;
	protected Integer noscanLessThanOrEqual;
	protected List<Integer> noscans;
	protected Integer treeParent;
	protected Integer treeParentGreaterThanOrEqual;
	protected Integer treeParentLessThanOrEqual;
	protected List<Integer> treeParents;
	protected Integer treeList;
	protected Integer treeListGreaterThanOrEqual;
	protected Integer treeListLessThanOrEqual;
	protected List<Integer> treeLists;
	protected String treeDliststr;
	protected String treeDliststrLike;
	protected List<String> treeDliststrs;
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
	protected String treenodeLike;

	public DmsPfileQuery() {

	}

	public DmsPfileQuery annotations(String annotations) {
		if (annotations == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotations = annotations;
		return this;
	}

	public DmsPfileQuery annotationsLike(String annotationsLike) {
		if (annotationsLike == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotationsLike = annotationsLike;
		return this;
	}

	public DmsPfileQuery annotationss(List<String> annotationss) {
		if (annotationss == null) {
			throw new RuntimeException("annotationss is empty ");
		}
		this.annotationss = annotationss;
		return this;
	}

	public DmsPfileQuery carriertype(String carriertype) {
		if (carriertype == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertype = carriertype;
		return this;
	}

	public DmsPfileQuery carriertypeLike(String carriertypeLike) {
		if (carriertypeLike == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertypeLike = carriertypeLike;
		return this;
	}

	public DmsPfileQuery carriertypes(List<String> carriertypes) {
		if (carriertypes == null) {
			throw new RuntimeException("carriertypes is empty ");
		}
		this.carriertypes = carriertypes;
		return this;
	}

	public DmsPfileQuery carrieru(String carrieru) {
		if (carrieru == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieru = carrieru;
		return this;
	}

	public DmsPfileQuery carrieruLike(String carrieruLike) {
		if (carrieruLike == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieruLike = carrieruLike;
		return this;
	}

	public DmsPfileQuery carrierus(List<String> carrierus) {
		if (carrierus == null) {
			throw new RuntimeException("carrierus is empty ");
		}
		this.carrierus = carrierus;
		return this;
	}

	public DmsPfileQuery checkupflag(String checkupflag) {
		if (checkupflag == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflag = checkupflag;
		return this;
	}

	public DmsPfileQuery checkupflagLike(String checkupflagLike) {
		if (checkupflagLike == null) {
			throw new RuntimeException("checkupflag is null");
		}
		this.checkupflagLike = checkupflagLike;
		return this;
	}

	public DmsPfileQuery checkupflags(List<String> checkupflags) {
		if (checkupflags == null) {
			throw new RuntimeException("checkupflags is empty ");
		}
		this.checkupflags = checkupflags;
		return this;
	}

	public DmsPfileQuery chkefileint(Integer chkefileint) {
		if (chkefileint == null) {
			throw new RuntimeException("chkefileint is null");
		}
		this.chkefileint = chkefileint;
		return this;
	}

	public DmsPfileQuery chkefileintGreaterThanOrEqual(
			Integer chkefileintGreaterThanOrEqual) {
		if (chkefileintGreaterThanOrEqual == null) {
			throw new RuntimeException("chkefileint is null");
		}
		this.chkefileintGreaterThanOrEqual = chkefileintGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery chkefileintLessThanOrEqual(
			Integer chkefileintLessThanOrEqual) {
		if (chkefileintLessThanOrEqual == null) {
			throw new RuntimeException("chkefileint is null");
		}
		this.chkefileintLessThanOrEqual = chkefileintLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery chkefileints(List<Integer> chkefileints) {
		if (chkefileints == null) {
			throw new RuntimeException("chkefileints is empty ");
		}
		this.chkefileints = chkefileints;
		return this;
	}

	public DmsPfileQuery choosePublishFlag(String choosePublishFlag) {
		if (choosePublishFlag == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlag = choosePublishFlag;
		return this;
	}

	public DmsPfileQuery choosePublishFlagLike(String choosePublishFlagLike) {
		if (choosePublishFlagLike == null) {
			throw new RuntimeException("choosePublishFlag is null");
		}
		this.choosePublishFlagLike = choosePublishFlagLike;
		return this;
	}

	public DmsPfileQuery choosePublishFlags(List<String> choosePublishFlags) {
		if (choosePublishFlags == null) {
			throw new RuntimeException("choosePublishFlags is empty ");
		}
		this.choosePublishFlags = choosePublishFlags;
		return this;
	}

	public DmsPfileQuery choosePublishTime(Long choosePublishTime) {
		if (choosePublishTime == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTime = choosePublishTime;
		return this;
	}

	public DmsPfileQuery choosePublishTimeGreaterThanOrEqual(
			Long choosePublishTimeGreaterThanOrEqual) {
		if (choosePublishTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeGreaterThanOrEqual = choosePublishTimeGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery choosePublishTimeLessThanOrEqual(
			Long choosePublishTimeLessThanOrEqual) {
		if (choosePublishTimeLessThanOrEqual == null) {
			throw new RuntimeException("choosePublishTime is null");
		}
		this.choosePublishTimeLessThanOrEqual = choosePublishTimeLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery choosePublishTimes(List<Long> choosePublishTimes) {
		if (choosePublishTimes == null) {
			throw new RuntimeException("choosePublishTimes is empty ");
		}
		this.choosePublishTimes = choosePublishTimes;
		return this;
	}

	public DmsPfileQuery clistno(Integer clistno) {
		if (clistno == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistno = clistno;
		return this;
	}

	public DmsPfileQuery clistnoGreaterThanOrEqual(
			Integer clistnoGreaterThanOrEqual) {
		if (clistnoGreaterThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoGreaterThanOrEqual = clistnoGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery clistnoLessThanOrEqual(Integer clistnoLessThanOrEqual) {
		if (clistnoLessThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoLessThanOrEqual = clistnoLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery clistnos(List<Integer> clistnos) {
		if (clistnos == null) {
			throw new RuntimeException("clistnos is empty ");
		}
		this.clistnos = clistnos;
		return this;
	}

	public DmsPfileQuery company(String company) {
		if (company == null) {
			throw new RuntimeException("company is null");
		}
		this.company = company;
		return this;
	}

	public DmsPfileQuery companyLike(String companyLike) {
		if (companyLike == null) {
			throw new RuntimeException("company is null");
		}
		this.companyLike = companyLike;
		return this;
	}

	public DmsPfileQuery companys(List<String> companys) {
		if (companys == null) {
			throw new RuntimeException("companys is empty ");
		}
		this.companys = companys;
		return this;
	}

	public DmsPfileQuery cpageno(String cpageno) {
		if (cpageno == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpageno = cpageno;
		return this;
	}

	public DmsPfileQuery cpagenoLike(String cpagenoLike) {
		if (cpagenoLike == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpagenoLike = cpagenoLike;
		return this;
	}

	public DmsPfileQuery cpagenos(List<String> cpagenos) {
		if (cpagenos == null) {
			throw new RuntimeException("cpagenos is empty ");
		}
		this.cpagenos = cpagenos;
		return this;
	}

	public DmsPfileQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public DmsPfileQuery ctimeEnd(Date ctimeEnd) {
		if (ctimeEnd == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEnd = ctimeEnd;
		return this;
	}

	public DmsPfileQuery ctimeEndGreaterThanOrEqual(
			Date ctimeEndGreaterThanOrEqual) {
		if (ctimeEndGreaterThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndGreaterThanOrEqual = ctimeEndGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery ctimeEndLessThanOrEqual(Date ctimeEndLessThanOrEqual) {
		if (ctimeEndLessThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndLessThanOrEqual = ctimeEndLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery ctimeEnds(List<Date> ctimeEnds) {
		if (ctimeEnds == null) {
			throw new RuntimeException("ctimeEnds is empty ");
		}
		this.ctimeEnds = ctimeEnds;
		return this;
	}

	public DmsPfileQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public DmsPfileQuery cvnum(String cvnum) {
		if (cvnum == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnum = cvnum;
		return this;
	}

	public DmsPfileQuery cvnumLike(String cvnumLike) {
		if (cvnumLike == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnumLike = cvnumLike;
		return this;
	}

	public DmsPfileQuery cvnums(List<String> cvnums) {
		if (cvnums == null) {
			throw new RuntimeException("cvnums is empty ");
		}
		this.cvnums = cvnums;
		return this;
	}

	public DmsPfileQuery dotnum(String dotnum) {
		if (dotnum == null) {
			throw new RuntimeException("dotnum is null");
		}
		this.dotnum = dotnum;
		return this;
	}

	public DmsPfileQuery dotnumLike(String dotnumLike) {
		if (dotnumLike == null) {
			throw new RuntimeException("dotnum is null");
		}
		this.dotnumLike = dotnumLike;
		return this;
	}

	public DmsPfileQuery dotnums(List<String> dotnums) {
		if (dotnums == null) {
			throw new RuntimeException("dotnums is empty ");
		}
		this.dotnums = dotnums;
		return this;
	}

	public DmsPfileQuery duty(String duty) {
		if (duty == null) {
			throw new RuntimeException("duty is null");
		}
		this.duty = duty;
		return this;
	}

	public DmsPfileQuery dutyLike(String dutyLike) {
		if (dutyLike == null) {
			throw new RuntimeException("duty is null");
		}
		this.dutyLike = dutyLike;
		return this;
	}

	public DmsPfileQuery dutys(List<String> dutys) {
		if (dutys == null) {
			throw new RuntimeException("dutys is empty ");
		}
		this.dutys = dutys;
		return this;
	}

	public DmsPfileQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public DmsPfileQuery dwidGreaterThanOrEqual(Integer dwidGreaterThanOrEqual) {
		if (dwidGreaterThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidGreaterThanOrEqual = dwidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery dwidLessThanOrEqual(Integer dwidLessThanOrEqual) {
		if (dwidLessThanOrEqual == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwidLessThanOrEqual = dwidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public DmsPfileQuery efile(String efile) {
		if (efile == null) {
			throw new RuntimeException("efile is null");
		}
		this.efile = efile;
		return this;
	}

	public DmsPfileQuery efileLike(String efileLike) {
		if (efileLike == null) {
			throw new RuntimeException("efile is null");
		}
		this.efileLike = efileLike;
		return this;
	}

	public DmsPfileQuery efilenum(Integer efilenum) {
		if (efilenum == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenum = efilenum;
		return this;
	}

	public DmsPfileQuery efilenumGreaterThanOrEqual(
			Integer efilenumGreaterThanOrEqual) {
		if (efilenumGreaterThanOrEqual == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumGreaterThanOrEqual = efilenumGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery efilenumLessThanOrEqual(Integer efilenumLessThanOrEqual) {
		if (efilenumLessThanOrEqual == null) {
			throw new RuntimeException("efilenum is null");
		}
		this.efilenumLessThanOrEqual = efilenumLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery efilenums(List<Integer> efilenums) {
		if (efilenums == null) {
			throw new RuntimeException("efilenums is empty ");
		}
		this.efilenums = efilenums;
		return this;
	}

	public DmsPfileQuery efiles(List<String> efiles) {
		if (efiles == null) {
			throw new RuntimeException("efiles is empty ");
		}
		this.efiles = efiles;
		return this;
	}

	public DmsPfileQuery etime(Date etime) {
		if (etime == null) {
			throw new RuntimeException("etime is null");
		}
		this.etime = etime;
		return this;
	}

	public DmsPfileQuery etimeGreaterThanOrEqual(Date etimeGreaterThanOrEqual) {
		if (etimeGreaterThanOrEqual == null) {
			throw new RuntimeException("etime is null");
		}
		this.etimeGreaterThanOrEqual = etimeGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery etimeLessThanOrEqual(Date etimeLessThanOrEqual) {
		if (etimeLessThanOrEqual == null) {
			throw new RuntimeException("etime is null");
		}
		this.etimeLessThanOrEqual = etimeLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery etimes(List<Date> etimes) {
		if (etimes == null) {
			throw new RuntimeException("etimes is empty ");
		}
		this.etimes = etimes;
		return this;
	}

	public DmsPfileQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public DmsPfileQuery fbidGreaterThanOrEqual(Integer fbidGreaterThanOrEqual) {
		if (fbidGreaterThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidGreaterThanOrEqual = fbidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery fbidLessThanOrEqual(Integer fbidLessThanOrEqual) {
		if (fbidLessThanOrEqual == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbidLessThanOrEqual = fbidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public DmsPfileQuery fileatt(String fileatt) {
		if (fileatt == null) {
			throw new RuntimeException("fileatt is null");
		}
		this.fileatt = fileatt;
		return this;
	}

	public DmsPfileQuery fileattLike(String fileattLike) {
		if (fileattLike == null) {
			throw new RuntimeException("fileatt is null");
		}
		this.fileattLike = fileattLike;
		return this;
	}

	public DmsPfileQuery fileatts(List<String> fileatts) {
		if (fileatts == null) {
			throw new RuntimeException("fileatts is empty ");
		}
		this.fileatts = fileatts;
		return this;
	}

	public DmsPfileQuery filenum(String filenum) {
		if (filenum == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenum = filenum;
		return this;
	}

	public DmsPfileQuery filenumLike(String filenumLike) {
		if (filenumLike == null) {
			throw new RuntimeException("filenum is null");
		}
		this.filenumLike = filenumLike;
		return this;
	}

	public DmsPfileQuery filenums(List<String> filenums) {
		if (filenums == null) {
			throw new RuntimeException("filenums is empty ");
		}
		this.filenums = filenums;
		return this;
	}

	public DmsPfileQuery filetype(String filetype) {
		if (filetype == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetype = filetype;
		return this;
	}

	public DmsPfileQuery filetypeLike(String filetypeLike) {
		if (filetypeLike == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetypeLike = filetypeLike;
		return this;
	}

	public DmsPfileQuery filetypes(List<String> filetypes) {
		if (filetypes == null) {
			throw new RuntimeException("filetypes is empty ");
		}
		this.filetypes = filetypes;
		return this;
	}

	public DmsPfileQuery filingflag(String filingflag) {
		if (filingflag == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflag = filingflag;
		return this;
	}

	public DmsPfileQuery filingflagLike(String filingflagLike) {
		if (filingflagLike == null) {
			throw new RuntimeException("filingflag is null");
		}
		this.filingflagLike = filingflagLike;
		return this;
	}

	public DmsPfileQuery filingflags(List<String> filingflags) {
		if (filingflags == null) {
			throw new RuntimeException("filingflags is empty ");
		}
		this.filingflags = filingflags;
		return this;
	}

	public DmsPfileQuery finishflag(String finishflag) {
		if (finishflag == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflag = finishflag;
		return this;
	}

	public DmsPfileQuery finishflagLike(String finishflagLike) {
		if (finishflagLike == null) {
			throw new RuntimeException("finishflag is null");
		}
		this.finishflagLike = finishflagLike;
		return this;
	}

	public DmsPfileQuery finishflags(List<String> finishflags) {
		if (finishflags == null) {
			throw new RuntimeException("finishflags is empty ");
		}
		this.finishflags = finishflags;
		return this;
	}

	public DmsPfileQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public DmsPfileQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public DmsPfileQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public DmsPfileQuery fontsnum(String fontsnum) {
		if (fontsnum == null) {
			throw new RuntimeException("fontsnum is null");
		}
		this.fontsnum = fontsnum;
		return this;
	}

	public DmsPfileQuery fontsnumLike(String fontsnumLike) {
		if (fontsnumLike == null) {
			throw new RuntimeException("fontsnum is null");
		}
		this.fontsnumLike = fontsnumLike;
		return this;
	}

	public DmsPfileQuery fontsnums(List<String> fontsnums) {
		if (fontsnums == null) {
			throw new RuntimeException("fontsnums is empty ");
		}
		this.fontsnums = fontsnums;
		return this;
	}

	public DmsPfileQuery fromID(String fromID) {
		if (fromID == null) {
			throw new RuntimeException("fromID is null");
		}
		this.fromID = fromID;
		return this;
	}

	public DmsPfileQuery fromIDLike(String fromIDLike) {
		if (fromIDLike == null) {
			throw new RuntimeException("fromID is null");
		}
		this.fromIDLike = fromIDLike;
		return this;
	}

	public DmsPfileQuery fromIDs(List<String> fromIDs) {
		if (fromIDs == null) {
			throw new RuntimeException("fromIDs is empty ");
		}
		this.fromIDs = fromIDs;
		return this;
	}

	public DmsPfileQuery ftime(Date ftime) {
		if (ftime == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftime = ftime;
		return this;
	}

	public DmsPfileQuery ftimeGreaterThanOrEqual(Date ftimeGreaterThanOrEqual) {
		if (ftimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftimeGreaterThanOrEqual = ftimeGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery ftimeLessThanOrEqual(Date ftimeLessThanOrEqual) {
		if (ftimeLessThanOrEqual == null) {
			throw new RuntimeException("ftime is null");
		}
		this.ftimeLessThanOrEqual = ftimeLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery ftimes(List<Date> ftimes) {
		if (ftimes == null) {
			throw new RuntimeException("ftimes is empty ");
		}
		this.ftimes = ftimes;
		return this;
	}

	public DmsPfileQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public DmsPfileQuery fxidGreaterThanOrEqual(Integer fxidGreaterThanOrEqual) {
		if (fxidGreaterThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidGreaterThanOrEqual = fxidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery fxidLessThanOrEqual(Integer fxidLessThanOrEqual) {
		if (fxidLessThanOrEqual == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxidLessThanOrEqual = fxidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery fxids(List<Integer> fxids) {
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

	public Integer getChkefileint() {
		return chkefileint;
	}

	public Integer getChkefileintGreaterThanOrEqual() {
		return chkefileintGreaterThanOrEqual;
	}

	public Integer getChkefileintLessThanOrEqual() {
		return chkefileintLessThanOrEqual;
	}

	public List<Integer> getChkefileints() {
		return chkefileints;
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

	public String getDmsTreenodes() {
		return dmsTreenodes;
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

	public Integer getNoscan() {
		return noscan;
	}

	public Integer getNoscanGreaterThanOrEqual() {
		return noscanGreaterThanOrEqual;
	}

	public Integer getNoscanLessThanOrEqual() {
		return noscanLessThanOrEqual;
	}

	public List<Integer> getNoscans() {
		return noscans;
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
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("efilenum".equals(sortColumn)) {
				orderBy = "E.EFILENUM" + a_x;
			}

			if ("listnum".equals(sortColumn)) {
				orderBy = "E.LISTNUM" + a_x;
			}

			if ("listId".equals(sortColumn)) {
				orderBy = "E.LIST_ID" + a_x;
			}

			if ("indexId".equals(sortColumn)) {
				orderBy = "E.INDEX_ID" + a_x;
			}

			if ("pid".equals(sortColumn)) {
				orderBy = "E.PID" + a_x;
			}

			if ("projid".equals(sortColumn)) {
				orderBy = "E.PROJID" + a_x;
			}

			if ("dwid".equals(sortColumn)) {
				orderBy = "E.DWID" + a_x;
			}

			if ("fbid".equals(sortColumn)) {
				orderBy = "E.FBID" + a_x;
			}

			if ("fxid".equals(sortColumn)) {
				orderBy = "E.FXID" + a_x;
			}

			if ("jid".equals(sortColumn)) {
				orderBy = "E.JID" + a_x;
			}

			if ("flid".equals(sortColumn)) {
				orderBy = "E.FLID" + a_x;
			}

			if ("topnode".equals(sortColumn)) {
				orderBy = "E.TOPNODE" + a_x;
			}

			if ("topnodem".equals(sortColumn)) {
				orderBy = "E.TOPNODEM" + a_x;
			}

			if ("vid".equals(sortColumn)) {
				orderBy = "E.VID" + a_x;
			}

			if ("oldvid".equals(sortColumn)) {
				orderBy = "E.OLDVID" + a_x;
			}

			if ("visflag".equals(sortColumn)) {
				orderBy = "E.VISFLAG" + a_x;
			}

			if ("listno".equals(sortColumn)) {
				orderBy = "E.LISTNO" + a_x;
			}

			if ("filingflag".equals(sortColumn)) {
				orderBy = "E.FILINGFLAG" + a_x;
			}

			if ("saveflag".equals(sortColumn)) {
				orderBy = "E.SAVEFLAG" + a_x;
			}

			if ("openflag".equals(sortColumn)) {
				orderBy = "E.OPENFLAG" + a_x;
			}

			if ("checkupflag".equals(sortColumn)) {
				orderBy = "E.CHECKUPFLAG" + a_x;
			}

			if ("finishflag".equals(sortColumn)) {
				orderBy = "E.FINISHFLAG" + a_x;
			}

			if ("fromID".equals(sortColumn)) {
				orderBy = "E.FROMID" + a_x;
			}

			if ("tname".equals(sortColumn)) {
				orderBy = "E.TNAME" + a_x;
			}

			if ("duty".equals(sortColumn)) {
				orderBy = "E.DUTY" + a_x;
			}

			if ("tagnum".equals(sortColumn)) {
				orderBy = "E.TAGNUM" + a_x;
			}

			if ("filenum".equals(sortColumn)) {
				orderBy = "E.FILENUM" + a_x;
			}

			if ("thematic".equals(sortColumn)) {
				orderBy = "E.THEMATIC" + a_x;
			}

			if ("ctime".equals(sortColumn)) {
				orderBy = "E.CTIME" + a_x;
			}

			if ("pageno".equals(sortColumn)) {
				orderBy = "E.PAGENO" + a_x;
			}

			if ("slevel".equals(sortColumn)) {
				orderBy = "E.SLEVEL" + a_x;
			}

			if ("page".equals(sortColumn)) {
				orderBy = "E.PAGE" + a_x;
			}

			if ("filetype".equals(sortColumn)) {
				orderBy = "E.FILETYPE" + a_x;
			}

			if ("fontsnum".equals(sortColumn)) {
				orderBy = "E.FONTSNUM" + a_x;
			}

			if ("savetime".equals(sortColumn)) {
				orderBy = "E.SAVETIME" + a_x;
			}

			if ("company".equals(sortColumn)) {
				orderBy = "E.COMPANY" + a_x;
			}

			if ("year".equals(sortColumn)) {
				orderBy = "E.YEAR" + a_x;
			}

			if ("fileatt".equals(sortColumn)) {
				orderBy = "E.FILEATT" + a_x;
			}

			if ("annotations".equals(sortColumn)) {
				orderBy = "E.ANNOTATIONS" + a_x;
			}

			if ("carriertype".equals(sortColumn)) {
				orderBy = "E.CARRIERTYPE" + a_x;
			}

			if ("summary".equals(sortColumn)) {
				orderBy = "E.SUMMARY" + a_x;
			}

			if ("ptext".equals(sortColumn)) {
				orderBy = "E.PTEXT" + a_x;
			}

			if ("carrieru".equals(sortColumn)) {
				orderBy = "E.CARRIERU" + a_x;
			}

			if ("glidenum".equals(sortColumn)) {
				orderBy = "E.GLIDENUM" + a_x;
			}

			if ("efile".equals(sortColumn)) {
				orderBy = "E.EFILE" + a_x;
			}

			if ("ftime".equals(sortColumn)) {
				orderBy = "E.FTIME" + a_x;
			}

			if ("totalnum".equals(sortColumn)) {
				orderBy = "E.TOTALNUM" + a_x;
			}

			if ("inputman".equals(sortColumn)) {
				orderBy = "E.INPUTMAN" + a_x;
			}

			if ("etime".equals(sortColumn)) {
				orderBy = "E.ETIME" + a_x;
			}

			if ("dotnum".equals(sortColumn)) {
				orderBy = "E.DOTNUM" + a_x;
			}

			if ("picnum".equals(sortColumn)) {
				orderBy = "E.PICNUM" + a_x;
			}

			if ("recnum".equals(sortColumn)) {
				orderBy = "E.RECNUM" + a_x;
			}

			if ("total".equals(sortColumn)) {
				orderBy = "E.TOTAL" + a_x;
			}

			if ("pagetype".equals(sortColumn)) {
				orderBy = "E.PAGETYPE" + a_x;
			}

			if ("iscom".equals(sortColumn)) {
				orderBy = "E.ISCOM" + a_x;
			}

			if ("islocate".equals(sortColumn)) {
				orderBy = "E.ISLOCATE" + a_x;
			}

			if ("wcompany".equals(sortColumn)) {
				orderBy = "E.WCOMPANY" + a_x;
			}

			if ("wcompanyID".equals(sortColumn)) {
				orderBy = "E.WCOMPANYID" + a_x;
			}

			if ("sendflag".equals(sortColumn)) {
				orderBy = "E.SENDFLAG" + a_x;
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

			if ("jnum".equals(sortColumn)) {
				orderBy = "E.JNUM" + a_x;
			}

			if ("jbnum".equals(sortColumn)) {
				orderBy = "E.JBNUM" + a_x;
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

			if ("clistno".equals(sortColumn)) {
				orderBy = "E.CLISTNO" + a_x;
			}

			if ("cpageno".equals(sortColumn)) {
				orderBy = "E.CPAGENO" + a_x;
			}

			if ("vnum".equals(sortColumn)) {
				orderBy = "E.VNUM" + a_x;
			}

			if ("cvnum".equals(sortColumn)) {
				orderBy = "E.CVNUM" + a_x;
			}

			if ("ctimeEnd".equals(sortColumn)) {
				orderBy = "E.CTIME_END" + a_x;
			}

			if ("sysListno".equals(sortColumn)) {
				orderBy = "E.SYS_LISTNO" + a_x;
			}

			if ("sysaddint".equals(sortColumn)) {
				orderBy = "E.SYSADDINT" + a_x;
			}

			if ("chkefileint".equals(sortColumn)) {
				orderBy = "E.CHKEFILEINT" + a_x;
			}

			if ("projIndex".equals(sortColumn)) {
				orderBy = "E.PROJ_INDEX" + a_x;
			}

			if ("noscan".equals(sortColumn)) {
				orderBy = "E.NOSCAN" + a_x;
			}

			if ("treeParent".equals(sortColumn)) {
				orderBy = "E.TREE_PARENT" + a_x;
			}

			if ("treeList".equals(sortColumn)) {
				orderBy = "E.TREE_LIST" + a_x;
			}

			if ("treeDliststr".equals(sortColumn)) {
				orderBy = "E.TREE_DLISTSTR" + a_x;
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

	public Integer getSysaddint() {
		return sysaddint;
	}

	public Integer getSysaddintGreaterThanOrEqual() {
		return sysaddintGreaterThanOrEqual;
	}

	public Integer getSysaddintLessThanOrEqual() {
		return sysaddintLessThanOrEqual;
	}

	public List<Integer> getSysaddints() {
		return sysaddints;
	}

	public Integer getSysListno() {
		return sysListno;
	}

	public Integer getSysListnoGreaterThanOrEqual() {
		return sysListnoGreaterThanOrEqual;
	}

	public Integer getSysListnoLessThanOrEqual() {
		return sysListnoLessThanOrEqual;
	}

	public List<Integer> getSysListnos() {
		return sysListnos;
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

	public DmsPfileQuery glidenum(String glidenum) {
		if (glidenum == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenum = glidenum;
		return this;
	}

	public DmsPfileQuery glidenumLike(String glidenumLike) {
		if (glidenumLike == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenumLike = glidenumLike;
		return this;
	}

	public DmsPfileQuery glidenums(List<String> glidenums) {
		if (glidenums == null) {
			throw new RuntimeException("glidenums is empty ");
		}
		this.glidenums = glidenums;
		return this;
	}

	public DmsPfileQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public DmsPfileQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery indexIds(List<Integer> indexIds) {
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
		addColumn("efilenum", "EFILENUM");
		addColumn("listnum", "LISTNUM");
		addColumn("listId", "LIST_ID");
		addColumn("indexId", "INDEX_ID");
		addColumn("pid", "PID");
		addColumn("projid", "PROJID");
		addColumn("dwid", "DWID");
		addColumn("fbid", "FBID");
		addColumn("fxid", "FXID");
		addColumn("jid", "JID");
		addColumn("flid", "FLID");
		addColumn("topnode", "TOPNODE");
		addColumn("topnodem", "TOPNODEM");
		addColumn("vid", "VID");
		addColumn("oldvid", "OLDVID");
		addColumn("visflag", "VISFLAG");
		addColumn("listno", "LISTNO");
		addColumn("filingflag", "FILINGFLAG");
		addColumn("saveflag", "SAVEFLAG");
		addColumn("openflag", "OPENFLAG");
		addColumn("checkupflag", "CHECKUPFLAG");
		addColumn("finishflag", "FINISHFLAG");
		addColumn("fromID", "FROMID");
		addColumn("tname", "TNAME");
		addColumn("duty", "DUTY");
		addColumn("tagnum", "TAGNUM");
		addColumn("filenum", "FILENUM");
		addColumn("thematic", "THEMATIC");
		addColumn("ctime", "CTIME");
		addColumn("pageno", "PAGENO");
		addColumn("slevel", "SLEVEL");
		addColumn("page", "PAGE");
		addColumn("filetype", "FILETYPE");
		addColumn("fontsnum", "FONTSNUM");
		addColumn("savetime", "SAVETIME");
		addColumn("company", "COMPANY");
		addColumn("year", "YEAR");
		addColumn("fileatt", "FILEATT");
		addColumn("annotations", "ANNOTATIONS");
		addColumn("carriertype", "CARRIERTYPE");
		addColumn("summary", "SUMMARY");
		addColumn("ptext", "PTEXT");
		addColumn("carrieru", "CARRIERU");
		addColumn("glidenum", "GLIDENUM");
		addColumn("efile", "EFILE");
		addColumn("ftime", "FTIME");
		addColumn("totalnum", "TOTALNUM");
		addColumn("inputman", "INPUTMAN");
		addColumn("etime", "ETIME");
		addColumn("dotnum", "DOTNUM");
		addColumn("picnum", "PICNUM");
		addColumn("recnum", "RECNUM");
		addColumn("total", "TOTAL");
		addColumn("pagetype", "PAGETYPE");
		addColumn("iscom", "ISCOM");
		addColumn("islocate", "ISLOCATE");
		addColumn("wcompany", "WCOMPANY");
		addColumn("wcompanyID", "WCOMPANYID");
		addColumn("sendflag", "SENDFLAG");
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
		addColumn("jnum", "JNUM");
		addColumn("jbnum", "JBNUM");
		addColumn("tnum", "TNUM");
		addColumn("tzoom", "TZOOM");
		addColumn("tflag", "TFLAG");
		addColumn("tdesigner", "TDESIGNER");
		addColumn("tviewer", "TVIEWER");
		addColumn("tassessor", "TASSESSOR");
		addColumn("tvision", "TVISION");
		addColumn("clistno", "CLISTNO");
		addColumn("cpageno", "CPAGENO");
		addColumn("vnum", "VNUM");
		addColumn("cvnum", "CVNUM");
		addColumn("ctimeEnd", "CTIME_END");
		addColumn("sysListno", "SYS_LISTNO");
		addColumn("sysaddint", "SYSADDINT");
		addColumn("chkefileint", "CHKEFILEINT");
		addColumn("projIndex", "PROJ_INDEX");
		addColumn("noscan", "NOSCAN");
		addColumn("treeParent", "TREE_PARENT");
		addColumn("treeList", "TREE_LIST");
		addColumn("treeDliststr", "TREE_DLISTSTR");
		addColumn("choosePublishFlag", "CHOOSEPUBLISHFLAG");
		addColumn("choosePublishTime", "CHOOSEPUBLISHTIME");
		addColumn("publishdiskid", "PUBLISHDISKID");
	}

	public DmsPfileQuery inputman(String inputman) {
		if (inputman == null) {
			throw new RuntimeException("inputman is null");
		}
		this.inputman = inputman;
		return this;
	}

	public DmsPfileQuery inputmanLike(String inputmanLike) {
		if (inputmanLike == null) {
			throw new RuntimeException("inputman is null");
		}
		this.inputmanLike = inputmanLike;
		return this;
	}

	public DmsPfileQuery inputmans(List<String> inputmans) {
		if (inputmans == null) {
			throw new RuntimeException("inputmans is empty ");
		}
		this.inputmans = inputmans;
		return this;
	}

	public DmsPfileQuery iscom(String iscom) {
		if (iscom == null) {
			throw new RuntimeException("iscom is null");
		}
		this.iscom = iscom;
		return this;
	}

	public DmsPfileQuery iscomLike(String iscomLike) {
		if (iscomLike == null) {
			throw new RuntimeException("iscom is null");
		}
		this.iscomLike = iscomLike;
		return this;
	}

	public DmsPfileQuery iscoms(List<String> iscoms) {
		if (iscoms == null) {
			throw new RuntimeException("iscoms is empty ");
		}
		this.iscoms = iscoms;
		return this;
	}

	public DmsPfileQuery islocate(String islocate) {
		if (islocate == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocate = islocate;
		return this;
	}

	public DmsPfileQuery islocateLike(String islocateLike) {
		if (islocateLike == null) {
			throw new RuntimeException("islocate is null");
		}
		this.islocateLike = islocateLike;
		return this;
	}

	public DmsPfileQuery islocates(List<String> islocates) {
		if (islocates == null) {
			throw new RuntimeException("islocates is empty ");
		}
		this.islocates = islocates;
		return this;
	}

	public DmsPfileQuery jactor(String jactor) {
		if (jactor == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactor = jactor;
		return this;
	}

	public DmsPfileQuery jactorLike(String jactorLike) {
		if (jactorLike == null) {
			throw new RuntimeException("jactor is null");
		}
		this.jactorLike = jactorLike;
		return this;
	}

	public DmsPfileQuery jactors(List<String> jactors) {
		if (jactors == null) {
			throw new RuntimeException("jactors is empty ");
		}
		this.jactors = jactors;
		return this;
	}

	public DmsPfileQuery jback(String jback) {
		if (jback == null) {
			throw new RuntimeException("jback is null");
		}
		this.jback = jback;
		return this;
	}

	public DmsPfileQuery jbackLike(String jbackLike) {
		if (jbackLike == null) {
			throw new RuntimeException("jback is null");
		}
		this.jbackLike = jbackLike;
		return this;
	}

	public DmsPfileQuery jbacks(List<String> jbacks) {
		if (jbacks == null) {
			throw new RuntimeException("jbacks is empty ");
		}
		this.jbacks = jbacks;
		return this;
	}

	public DmsPfileQuery jbnum(String jbnum) {
		if (jbnum == null) {
			throw new RuntimeException("jbnum is null");
		}
		this.jbnum = jbnum;
		return this;
	}

	public DmsPfileQuery jbnumLike(String jbnumLike) {
		if (jbnumLike == null) {
			throw new RuntimeException("jbnum is null");
		}
		this.jbnumLike = jbnumLike;
		return this;
	}

	public DmsPfileQuery jbnums(List<String> jbnums) {
		if (jbnums == null) {
			throw new RuntimeException("jbnums is empty ");
		}
		this.jbnums = jbnums;
		return this;
	}

	public DmsPfileQuery jconten(String jconten) {
		if (jconten == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jconten = jconten;
		return this;
	}

	public DmsPfileQuery jcontenLike(String jcontenLike) {
		if (jcontenLike == null) {
			throw new RuntimeException("jconten is null");
		}
		this.jcontenLike = jcontenLike;
		return this;
	}

	public DmsPfileQuery jcontens(List<String> jcontens) {
		if (jcontens == null) {
			throw new RuntimeException("jcontens is empty ");
		}
		this.jcontens = jcontens;
		return this;
	}

	public DmsPfileQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public DmsPfileQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public DmsPfileQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public DmsPfileQuery jman(String jman) {
		if (jman == null) {
			throw new RuntimeException("jman is null");
		}
		this.jman = jman;
		return this;
	}

	public DmsPfileQuery jmanLike(String jmanLike) {
		if (jmanLike == null) {
			throw new RuntimeException("jman is null");
		}
		this.jmanLike = jmanLike;
		return this;
	}

	public DmsPfileQuery jmans(List<String> jmans) {
		if (jmans == null) {
			throw new RuntimeException("jmans is empty ");
		}
		this.jmans = jmans;
		return this;
	}

	public DmsPfileQuery jnum(String jnum) {
		if (jnum == null) {
			throw new RuntimeException("jnum is null");
		}
		this.jnum = jnum;
		return this;
	}

	public DmsPfileQuery jnumLike(String jnumLike) {
		if (jnumLike == null) {
			throw new RuntimeException("jnum is null");
		}
		this.jnumLike = jnumLike;
		return this;
	}

	public DmsPfileQuery jnums(List<String> jnums) {
		if (jnums == null) {
			throw new RuntimeException("jnums is empty ");
		}
		this.jnums = jnums;
		return this;
	}

	public DmsPfileQuery jplace(String jplace) {
		if (jplace == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplace = jplace;
		return this;
	}

	public DmsPfileQuery jplaceLike(String jplaceLike) {
		if (jplaceLike == null) {
			throw new RuntimeException("jplace is null");
		}
		this.jplaceLike = jplaceLike;
		return this;
	}

	public DmsPfileQuery jplaces(List<String> jplaces) {
		if (jplaces == null) {
			throw new RuntimeException("jplaces is empty ");
		}
		this.jplaces = jplaces;
		return this;
	}

	public DmsPfileQuery lcompany(String lcompany) {
		if (lcompany == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompany = lcompany;
		return this;
	}

	public DmsPfileQuery lcompanyLike(String lcompanyLike) {
		if (lcompanyLike == null) {
			throw new RuntimeException("lcompany is null");
		}
		this.lcompanyLike = lcompanyLike;
		return this;
	}

	public DmsPfileQuery lcompanys(List<String> lcompanys) {
		if (lcompanys == null) {
			throw new RuntimeException("lcompanys is empty ");
		}
		this.lcompanys = lcompanys;
		return this;
	}

	public DmsPfileQuery lcontent(String lcontent) {
		if (lcontent == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontent = lcontent;
		return this;
	}

	public DmsPfileQuery lcontentLike(String lcontentLike) {
		if (lcontentLike == null) {
			throw new RuntimeException("lcontent is null");
		}
		this.lcontentLike = lcontentLike;
		return this;
	}

	public DmsPfileQuery lcontents(List<String> lcontents) {
		if (lcontents == null) {
			throw new RuntimeException("lcontents is empty ");
		}
		this.lcontents = lcontents;
		return this;
	}

	public DmsPfileQuery ldate(Date ldate) {
		if (ldate == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldate = ldate;
		return this;
	}

	public DmsPfileQuery ldateGreaterThanOrEqual(Date ldateGreaterThanOrEqual) {
		if (ldateGreaterThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateGreaterThanOrEqual = ldateGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery ldateLessThanOrEqual(Date ldateLessThanOrEqual) {
		if (ldateLessThanOrEqual == null) {
			throw new RuntimeException("ldate is null");
		}
		this.ldateLessThanOrEqual = ldateLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery ldates(List<Date> ldates) {
		if (ldates == null) {
			throw new RuntimeException("ldates is empty ");
		}
		this.ldates = ldates;
		return this;
	}

	public DmsPfileQuery listId(Long listId) {
		if (listId == null) {
			throw new RuntimeException("listId is null");
		}
		this.listId = listId;
		return this;
	}

	public DmsPfileQuery listIdGreaterThanOrEqual(Long listIdGreaterThanOrEqual) {
		if (listIdGreaterThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdGreaterThanOrEqual = listIdGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery listIdLessThanOrEqual(Long listIdLessThanOrEqual) {
		if (listIdLessThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdLessThanOrEqual = listIdLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery listIds(List<Long> listIds) {
		if (listIds == null) {
			throw new RuntimeException("listIds is empty ");
		}
		this.listIds = listIds;
		return this;
	}

	public DmsPfileQuery listno(Integer listno) {
		if (listno == null) {
			throw new RuntimeException("listno is null");
		}
		this.listno = listno;
		return this;
	}

	public DmsPfileQuery listnoGreaterThanOrEqual(
			Integer listnoGreaterThanOrEqual) {
		if (listnoGreaterThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual) {
		if (listnoLessThanOrEqual == null) {
			throw new RuntimeException("listno is null");
		}
		this.listnoLessThanOrEqual = listnoLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery listnos(List<Integer> listnos) {
		if (listnos == null) {
			throw new RuntimeException("listnos is empty ");
		}
		this.listnos = listnos;
		return this;
	}

	public DmsPfileQuery listnum(String listnum) {
		if (listnum == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnum = listnum;
		return this;
	}

	public DmsPfileQuery listnumLike(String listnumLike) {
		if (listnumLike == null) {
			throw new RuntimeException("listnum is null");
		}
		this.listnumLike = listnumLike;
		return this;
	}

	public DmsPfileQuery listnums(List<String> listnums) {
		if (listnums == null) {
			throw new RuntimeException("listnums is empty ");
		}
		this.listnums = listnums;
		return this;
	}

	public DmsPfileQuery llen(String llen) {
		if (llen == null) {
			throw new RuntimeException("llen is null");
		}
		this.llen = llen;
		return this;
	}

	public DmsPfileQuery llenLike(String llenLike) {
		if (llenLike == null) {
			throw new RuntimeException("llen is null");
		}
		this.llenLike = llenLike;
		return this;
	}

	public DmsPfileQuery llens(List<String> llens) {
		if (llens == null) {
			throw new RuntimeException("llens is empty ");
		}
		this.llens = llens;
		return this;
	}

	public DmsPfileQuery lman(String lman) {
		if (lman == null) {
			throw new RuntimeException("lman is null");
		}
		this.lman = lman;
		return this;
	}

	public DmsPfileQuery lmanLike(String lmanLike) {
		if (lmanLike == null) {
			throw new RuntimeException("lman is null");
		}
		this.lmanLike = lmanLike;
		return this;
	}

	public DmsPfileQuery lmans(List<String> lmans) {
		if (lmans == null) {
			throw new RuntimeException("lmans is empty ");
		}
		this.lmans = lmans;
		return this;
	}

	public DmsPfileQuery noscan(Integer noscan) {
		if (noscan == null) {
			throw new RuntimeException("noscan is null");
		}
		this.noscan = noscan;
		return this;
	}

	public DmsPfileQuery noscanGreaterThanOrEqual(
			Integer noscanGreaterThanOrEqual) {
		if (noscanGreaterThanOrEqual == null) {
			throw new RuntimeException("noscan is null");
		}
		this.noscanGreaterThanOrEqual = noscanGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery noscanLessThanOrEqual(Integer noscanLessThanOrEqual) {
		if (noscanLessThanOrEqual == null) {
			throw new RuntimeException("noscan is null");
		}
		this.noscanLessThanOrEqual = noscanLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery noscans(List<Integer> noscans) {
		if (noscans == null) {
			throw new RuntimeException("noscans is empty ");
		}
		this.noscans = noscans;
		return this;
	}

	public DmsPfileQuery oldvid(String oldvid) {
		if (oldvid == null) {
			throw new RuntimeException("oldvid is null");
		}
		this.oldvid = oldvid;
		return this;
	}

	public DmsPfileQuery oldvidLike(String oldvidLike) {
		if (oldvidLike == null) {
			throw new RuntimeException("oldvid is null");
		}
		this.oldvidLike = oldvidLike;
		return this;
	}

	public DmsPfileQuery oldvids(List<String> oldvids) {
		if (oldvids == null) {
			throw new RuntimeException("oldvids is empty ");
		}
		this.oldvids = oldvids;
		return this;
	}

	public DmsPfileQuery openflag(String openflag) {
		if (openflag == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflag = openflag;
		return this;
	}

	public DmsPfileQuery openflagLike(String openflagLike) {
		if (openflagLike == null) {
			throw new RuntimeException("openflag is null");
		}
		this.openflagLike = openflagLike;
		return this;
	}

	public DmsPfileQuery openflags(List<String> openflags) {
		if (openflags == null) {
			throw new RuntimeException("openflags is empty ");
		}
		this.openflags = openflags;
		return this;
	}

	public DmsPfileQuery pageGreaterThanOrEqual(Integer pageGreaterThanOrEqual) {
		if (pageGreaterThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery pageLessThanOrEqual(Integer pageLessThanOrEqual) {
		if (pageLessThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageLessThanOrEqual = pageLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery pageno(String pageno) {
		if (pageno == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pageno = pageno;
		return this;
	}

	public DmsPfileQuery pagenoLike(String pagenoLike) {
		if (pagenoLike == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pagenoLike = pagenoLike;
		return this;
	}

	public DmsPfileQuery pagenos(List<String> pagenos) {
		if (pagenos == null) {
			throw new RuntimeException("pagenos is empty ");
		}
		this.pagenos = pagenos;
		return this;
	}

	public DmsPfileQuery pages(List<Integer> pages) {
		if (pages == null) {
			throw new RuntimeException("pages is empty ");
		}
		this.pages = pages;
		return this;
	}

	public DmsPfileQuery pagetype(String pagetype) {
		if (pagetype == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetype = pagetype;
		return this;
	}

	public DmsPfileQuery pagetypeLike(String pagetypeLike) {
		if (pagetypeLike == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetypeLike = pagetypeLike;
		return this;
	}

	public DmsPfileQuery pagetypes(List<String> pagetypes) {
		if (pagetypes == null) {
			throw new RuntimeException("pagetypes is empty ");
		}
		this.pagetypes = pagetypes;
		return this;
	}

	public DmsPfileQuery picnum(String picnum) {
		if (picnum == null) {
			throw new RuntimeException("picnum is null");
		}
		this.picnum = picnum;
		return this;
	}

	public DmsPfileQuery picnumLike(String picnumLike) {
		if (picnumLike == null) {
			throw new RuntimeException("picnum is null");
		}
		this.picnumLike = picnumLike;
		return this;
	}

	public DmsPfileQuery picnums(List<String> picnums) {
		if (picnums == null) {
			throw new RuntimeException("picnums is empty ");
		}
		this.picnums = picnums;
		return this;
	}

	public DmsPfileQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public DmsPfileQuery pidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		if (pidGreaterThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery pidLessThanOrEqual(Integer pidLessThanOrEqual) {
		if (pidLessThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidLessThanOrEqual = pidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public DmsPfileQuery projid(Integer projid) {
		if (projid == null) {
			throw new RuntimeException("projid is null");
		}
		this.projid = projid;
		return this;
	}

	public DmsPfileQuery projidGreaterThanOrEqual(
			Integer projidGreaterThanOrEqual) {
		if (projidGreaterThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidGreaterThanOrEqual = projidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery projidLessThanOrEqual(Integer projidLessThanOrEqual) {
		if (projidLessThanOrEqual == null) {
			throw new RuntimeException("projid is null");
		}
		this.projidLessThanOrEqual = projidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery projids(List<Integer> projids) {
		if (projids == null) {
			throw new RuntimeException("projids is empty ");
		}
		this.projids = projids;
		return this;
	}

	public DmsPfileQuery projIndex(Integer projIndex) {
		if (projIndex == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndex = projIndex;
		return this;
	}

	public DmsPfileQuery projIndexGreaterThanOrEqual(
			Integer projIndexGreaterThanOrEqual) {
		if (projIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexGreaterThanOrEqual = projIndexGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery projIndexLessThanOrEqual(
			Integer projIndexLessThanOrEqual) {
		if (projIndexLessThanOrEqual == null) {
			throw new RuntimeException("projIndex is null");
		}
		this.projIndexLessThanOrEqual = projIndexLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery projIndexs(List<Integer> projIndexs) {
		if (projIndexs == null) {
			throw new RuntimeException("projIndexs is empty ");
		}
		this.projIndexs = projIndexs;
		return this;
	}

	public DmsPfileQuery ptext(String ptext) {
		if (ptext == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptext = ptext;
		return this;
	}

	public DmsPfileQuery ptextLike(String ptextLike) {
		if (ptextLike == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptextLike = ptextLike;
		return this;
	}

	public DmsPfileQuery ptexts(List<String> ptexts) {
		if (ptexts == null) {
			throw new RuntimeException("ptexts is empty ");
		}
		this.ptexts = ptexts;
		return this;
	}

	public DmsPfileQuery publishdiskid(Integer publishdiskid) {
		if (publishdiskid == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskid = publishdiskid;
		return this;
	}

	public DmsPfileQuery publishdiskidGreaterThanOrEqual(
			Integer publishdiskidGreaterThanOrEqual) {
		if (publishdiskidGreaterThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidGreaterThanOrEqual = publishdiskidGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery publishdiskidLessThanOrEqual(
			Integer publishdiskidLessThanOrEqual) {
		if (publishdiskidLessThanOrEqual == null) {
			throw new RuntimeException("publishdiskid is null");
		}
		this.publishdiskidLessThanOrEqual = publishdiskidLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery publishdiskids(List<Integer> publishdiskids) {
		if (publishdiskids == null) {
			throw new RuntimeException("publishdiskids is empty ");
		}
		this.publishdiskids = publishdiskids;
		return this;
	}

	public DmsPfileQuery recnum(String recnum) {
		if (recnum == null) {
			throw new RuntimeException("recnum is null");
		}
		this.recnum = recnum;
		return this;
	}

	public DmsPfileQuery recnumLike(String recnumLike) {
		if (recnumLike == null) {
			throw new RuntimeException("recnum is null");
		}
		this.recnumLike = recnumLike;
		return this;
	}

	public DmsPfileQuery recnums(List<String> recnums) {
		if (recnums == null) {
			throw new RuntimeException("recnums is empty ");
		}
		this.recnums = recnums;
		return this;
	}

	public DmsPfileQuery saveflag(String saveflag) {
		if (saveflag == null) {
			throw new RuntimeException("saveflag is null");
		}
		this.saveflag = saveflag;
		return this;
	}

	public DmsPfileQuery saveflagLike(String saveflagLike) {
		if (saveflagLike == null) {
			throw new RuntimeException("saveflag is null");
		}
		this.saveflagLike = saveflagLike;
		return this;
	}

	public DmsPfileQuery saveflags(List<String> saveflags) {
		if (saveflags == null) {
			throw new RuntimeException("saveflags is empty ");
		}
		this.saveflags = saveflags;
		return this;
	}

	public DmsPfileQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public DmsPfileQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public DmsPfileQuery savetimes(List<String> savetimes) {
		if (savetimes == null) {
			throw new RuntimeException("savetimes is empty ");
		}
		this.savetimes = savetimes;
		return this;
	}

	public DmsPfileQuery sendflag(String sendflag) {
		if (sendflag == null) {
			throw new RuntimeException("sendflag is null");
		}
		this.sendflag = sendflag;
		return this;
	}

	public DmsPfileQuery sendflagLike(String sendflagLike) {
		if (sendflagLike == null) {
			throw new RuntimeException("sendflag is null");
		}
		this.sendflagLike = sendflagLike;
		return this;
	}

	public DmsPfileQuery sendflags(List<String> sendflags) {
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

	public void setChkefileint(Integer chkefileint) {
		this.chkefileint = chkefileint;
	}

	public void setChkefileintGreaterThanOrEqual(
			Integer chkefileintGreaterThanOrEqual) {
		this.chkefileintGreaterThanOrEqual = chkefileintGreaterThanOrEqual;
	}

	public void setChkefileintLessThanOrEqual(Integer chkefileintLessThanOrEqual) {
		this.chkefileintLessThanOrEqual = chkefileintLessThanOrEqual;
	}

	public void setChkefileints(List<Integer> chkefileints) {
		this.chkefileints = chkefileints;
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

	public void setDmsTreenodes(String dmsTreenodes) {
		this.dmsTreenodes = dmsTreenodes;
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

	public void setNoscan(Integer noscan) {
		this.noscan = noscan;
	}

	public void setNoscanGreaterThanOrEqual(Integer noscanGreaterThanOrEqual) {
		this.noscanGreaterThanOrEqual = noscanGreaterThanOrEqual;
	}

	public void setNoscanLessThanOrEqual(Integer noscanLessThanOrEqual) {
		this.noscanLessThanOrEqual = noscanLessThanOrEqual;
	}

	public void setNoscans(List<Integer> noscans) {
		this.noscans = noscans;
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

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setSummaryLike(String summaryLike) {
		this.summaryLike = summaryLike;
	}

	public void setSummarys(List<String> summarys) {
		this.summarys = summarys;
	}

	public void setSysaddint(Integer sysaddint) {
		this.sysaddint = sysaddint;
	}

	public void setSysaddintGreaterThanOrEqual(
			Integer sysaddintGreaterThanOrEqual) {
		this.sysaddintGreaterThanOrEqual = sysaddintGreaterThanOrEqual;
	}

	public void setSysaddintLessThanOrEqual(Integer sysaddintLessThanOrEqual) {
		this.sysaddintLessThanOrEqual = sysaddintLessThanOrEqual;
	}

	public void setSysaddints(List<Integer> sysaddints) {
		this.sysaddints = sysaddints;
	}

	public void setSysListno(Integer sysListno) {
		this.sysListno = sysListno;
	}

	public void setSysListnoGreaterThanOrEqual(
			Integer sysListnoGreaterThanOrEqual) {
		this.sysListnoGreaterThanOrEqual = sysListnoGreaterThanOrEqual;
	}

	public void setSysListnoLessThanOrEqual(Integer sysListnoLessThanOrEqual) {
		this.sysListnoLessThanOrEqual = sysListnoLessThanOrEqual;
	}

	public void setSysListnos(List<Integer> sysListnos) {
		this.sysListnos = sysListnos;
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

	public void setTreenodeLike(String treenodeLike) {
		this.treenodeLike = treenodeLike;
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

	public DmsPfileQuery slevel(String slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public DmsPfileQuery slevelLike(String slevelLike) {
		if (slevelLike == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLike = slevelLike;
		return this;
	}

	public DmsPfileQuery slevels(List<String> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public DmsPfileQuery summary(String summary) {
		if (summary == null) {
			throw new RuntimeException("summary is null");
		}
		this.summary = summary;
		return this;
	}

	public DmsPfileQuery summaryLike(String summaryLike) {
		if (summaryLike == null) {
			throw new RuntimeException("summary is null");
		}
		this.summaryLike = summaryLike;
		return this;
	}

	public DmsPfileQuery summarys(List<String> summarys) {
		if (summarys == null) {
			throw new RuntimeException("summarys is empty ");
		}
		this.summarys = summarys;
		return this;
	}

	public DmsPfileQuery sysaddint(Integer sysaddint) {
		if (sysaddint == null) {
			throw new RuntimeException("sysaddint is null");
		}
		this.sysaddint = sysaddint;
		return this;
	}

	public DmsPfileQuery sysaddintGreaterThanOrEqual(
			Integer sysaddintGreaterThanOrEqual) {
		if (sysaddintGreaterThanOrEqual == null) {
			throw new RuntimeException("sysaddint is null");
		}
		this.sysaddintGreaterThanOrEqual = sysaddintGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery sysaddintLessThanOrEqual(
			Integer sysaddintLessThanOrEqual) {
		if (sysaddintLessThanOrEqual == null) {
			throw new RuntimeException("sysaddint is null");
		}
		this.sysaddintLessThanOrEqual = sysaddintLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery sysaddints(List<Integer> sysaddints) {
		if (sysaddints == null) {
			throw new RuntimeException("sysaddints is empty ");
		}
		this.sysaddints = sysaddints;
		return this;
	}

	public DmsPfileQuery sysListno(Integer sysListno) {
		if (sysListno == null) {
			throw new RuntimeException("sysListno is null");
		}
		this.sysListno = sysListno;
		return this;
	}

	public DmsPfileQuery sysListnoGreaterThanOrEqual(
			Integer sysListnoGreaterThanOrEqual) {
		if (sysListnoGreaterThanOrEqual == null) {
			throw new RuntimeException("sysListno is null");
		}
		this.sysListnoGreaterThanOrEqual = sysListnoGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery sysListnoLessThanOrEqual(
			Integer sysListnoLessThanOrEqual) {
		if (sysListnoLessThanOrEqual == null) {
			throw new RuntimeException("sysListno is null");
		}
		this.sysListnoLessThanOrEqual = sysListnoLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery sysListnos(List<Integer> sysListnos) {
		if (sysListnos == null) {
			throw new RuntimeException("sysListnos is empty ");
		}
		this.sysListnos = sysListnos;
		return this;
	}

	public DmsPfileQuery tagnum(String tagnum) {
		if (tagnum == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnum = tagnum;
		return this;
	}

	public DmsPfileQuery tagnumLike(String tagnumLike) {
		if (tagnumLike == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnumLike = tagnumLike;
		return this;
	}

	public DmsPfileQuery tagnums(List<String> tagnums) {
		if (tagnums == null) {
			throw new RuntimeException("tagnums is empty ");
		}
		this.tagnums = tagnums;
		return this;
	}

	public DmsPfileQuery tassessor(String tassessor) {
		if (tassessor == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessor = tassessor;
		return this;
	}

	public DmsPfileQuery tassessorLike(String tassessorLike) {
		if (tassessorLike == null) {
			throw new RuntimeException("tassessor is null");
		}
		this.tassessorLike = tassessorLike;
		return this;
	}

	public DmsPfileQuery tassessors(List<String> tassessors) {
		if (tassessors == null) {
			throw new RuntimeException("tassessors is empty ");
		}
		this.tassessors = tassessors;
		return this;
	}

	public DmsPfileQuery tdesigner(String tdesigner) {
		if (tdesigner == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesigner = tdesigner;
		return this;
	}

	public DmsPfileQuery tdesignerLike(String tdesignerLike) {
		if (tdesignerLike == null) {
			throw new RuntimeException("tdesigner is null");
		}
		this.tdesignerLike = tdesignerLike;
		return this;
	}

	public DmsPfileQuery tdesigners(List<String> tdesigners) {
		if (tdesigners == null) {
			throw new RuntimeException("tdesigners is empty ");
		}
		this.tdesigners = tdesigners;
		return this;
	}

	public DmsPfileQuery tflag(String tflag) {
		if (tflag == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflag = tflag;
		return this;
	}

	public DmsPfileQuery tflagLike(String tflagLike) {
		if (tflagLike == null) {
			throw new RuntimeException("tflag is null");
		}
		this.tflagLike = tflagLike;
		return this;
	}

	public DmsPfileQuery tflags(List<String> tflags) {
		if (tflags == null) {
			throw new RuntimeException("tflags is empty ");
		}
		this.tflags = tflags;
		return this;
	}

	public DmsPfileQuery thematic(String thematic) {
		if (thematic == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematic = thematic;
		return this;
	}

	public DmsPfileQuery thematicLike(String thematicLike) {
		if (thematicLike == null) {
			throw new RuntimeException("thematic is null");
		}
		this.thematicLike = thematicLike;
		return this;
	}

	public DmsPfileQuery thematics(List<String> thematics) {
		if (thematics == null) {
			throw new RuntimeException("thematics is empty ");
		}
		this.thematics = thematics;
		return this;
	}

	public DmsPfileQuery tname(String tname) {
		if (tname == null) {
			throw new RuntimeException("tname is null");
		}
		this.tname = tname;
		return this;
	}

	public DmsPfileQuery tnameLike(String tnameLike) {
		if (tnameLike == null) {
			throw new RuntimeException("tname is null");
		}
		this.tnameLike = tnameLike;
		return this;
	}

	public DmsPfileQuery tnames(List<String> tnames) {
		if (tnames == null) {
			throw new RuntimeException("tnames is empty ");
		}
		this.tnames = tnames;
		return this;
	}

	public DmsPfileQuery tnum(String tnum) {
		if (tnum == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnum = tnum;
		return this;
	}

	public DmsPfileQuery tnumLike(String tnumLike) {
		if (tnumLike == null) {
			throw new RuntimeException("tnum is null");
		}
		this.tnumLike = tnumLike;
		return this;
	}

	public DmsPfileQuery tnums(List<String> tnums) {
		if (tnums == null) {
			throw new RuntimeException("tnums is empty ");
		}
		this.tnums = tnums;
		return this;
	}

	public DmsPfileQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public DmsPfileQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public DmsPfileQuery topnodem(String topnodem) {
		if (topnodem == null) {
			throw new RuntimeException("topnodem is null");
		}
		this.topnodem = topnodem;
		return this;
	}

	public DmsPfileQuery topnodemLike(String topnodemLike) {
		if (topnodemLike == null) {
			throw new RuntimeException("topnodem is null");
		}
		this.topnodemLike = topnodemLike;
		return this;
	}

	public DmsPfileQuery topnodems(List<String> topnodems) {
		if (topnodems == null) {
			throw new RuntimeException("topnodems is empty ");
		}
		this.topnodems = topnodems;
		return this;
	}

	public DmsPfileQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public DmsPfileQuery total(Integer total) {
		if (total == null) {
			throw new RuntimeException("total is null");
		}
		this.total = total;
		return this;
	}

	public DmsPfileQuery totalGreaterThanOrEqual(Integer totalGreaterThanOrEqual) {
		if (totalGreaterThanOrEqual == null) {
			throw new RuntimeException("total is null");
		}
		this.totalGreaterThanOrEqual = totalGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery totalLessThanOrEqual(Integer totalLessThanOrEqual) {
		if (totalLessThanOrEqual == null) {
			throw new RuntimeException("total is null");
		}
		this.totalLessThanOrEqual = totalLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery totalnum(String totalnum) {
		if (totalnum == null) {
			throw new RuntimeException("totalnum is null");
		}
		this.totalnum = totalnum;
		return this;
	}

	public DmsPfileQuery totalnumLike(String totalnumLike) {
		if (totalnumLike == null) {
			throw new RuntimeException("totalnum is null");
		}
		this.totalnumLike = totalnumLike;
		return this;
	}

	public DmsPfileQuery totalnums(List<String> totalnums) {
		if (totalnums == null) {
			throw new RuntimeException("totalnums is empty ");
		}
		this.totalnums = totalnums;
		return this;
	}

	public DmsPfileQuery totals(List<Integer> totals) {
		if (totals == null) {
			throw new RuntimeException("totals is empty ");
		}
		this.totals = totals;
		return this;
	}

	public DmsPfileQuery treeDliststr(String treeDliststr) {
		if (treeDliststr == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststr = treeDliststr;
		return this;
	}

	public DmsPfileQuery treeDliststrLike(String treeDliststrLike) {
		if (treeDliststrLike == null) {
			throw new RuntimeException("treeDliststr is null");
		}
		this.treeDliststrLike = treeDliststrLike;
		return this;
	}

	public DmsPfileQuery treeDliststrs(List<String> treeDliststrs) {
		if (treeDliststrs == null) {
			throw new RuntimeException("treeDliststrs is empty ");
		}
		this.treeDliststrs = treeDliststrs;
		return this;
	}

	public DmsPfileQuery treeList(Integer treeList) {
		if (treeList == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeList = treeList;
		return this;
	}

	public DmsPfileQuery treeListGreaterThanOrEqual(
			Integer treeListGreaterThanOrEqual) {
		if (treeListGreaterThanOrEqual == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeListGreaterThanOrEqual = treeListGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery treeListLessThanOrEqual(Integer treeListLessThanOrEqual) {
		if (treeListLessThanOrEqual == null) {
			throw new RuntimeException("treeList is null");
		}
		this.treeListLessThanOrEqual = treeListLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery treeLists(List<Integer> treeLists) {
		if (treeLists == null) {
			throw new RuntimeException("treeLists is empty ");
		}
		this.treeLists = treeLists;
		return this;
	}

	public DmsPfileQuery treeParent(Integer treeParent) {
		if (treeParent == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParent = treeParent;
		return this;
	}

	public DmsPfileQuery treeParentGreaterThanOrEqual(
			Integer treeParentGreaterThanOrEqual) {
		if (treeParentGreaterThanOrEqual == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParentGreaterThanOrEqual = treeParentGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery treeParentLessThanOrEqual(
			Integer treeParentLessThanOrEqual) {
		if (treeParentLessThanOrEqual == null) {
			throw new RuntimeException("treeParent is null");
		}
		this.treeParentLessThanOrEqual = treeParentLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery treeParents(List<Integer> treeParents) {
		if (treeParents == null) {
			throw new RuntimeException("treeParents is empty ");
		}
		this.treeParents = treeParents;
		return this;
	}

	public DmsPfileQuery tviewer(String tviewer) {
		if (tviewer == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewer = tviewer;
		return this;
	}

	public DmsPfileQuery tviewerLike(String tviewerLike) {
		if (tviewerLike == null) {
			throw new RuntimeException("tviewer is null");
		}
		this.tviewerLike = tviewerLike;
		return this;
	}

	public DmsPfileQuery tviewers(List<String> tviewers) {
		if (tviewers == null) {
			throw new RuntimeException("tviewers is empty ");
		}
		this.tviewers = tviewers;
		return this;
	}

	public DmsPfileQuery tvision(String tvision) {
		if (tvision == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvision = tvision;
		return this;
	}

	public DmsPfileQuery tvisionLike(String tvisionLike) {
		if (tvisionLike == null) {
			throw new RuntimeException("tvision is null");
		}
		this.tvisionLike = tvisionLike;
		return this;
	}

	public DmsPfileQuery tvisions(List<String> tvisions) {
		if (tvisions == null) {
			throw new RuntimeException("tvisions is empty ");
		}
		this.tvisions = tvisions;
		return this;
	}

	public DmsPfileQuery tzoom(String tzoom) {
		if (tzoom == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoom = tzoom;
		return this;
	}

	public DmsPfileQuery tzoomLike(String tzoomLike) {
		if (tzoomLike == null) {
			throw new RuntimeException("tzoom is null");
		}
		this.tzoomLike = tzoomLike;
		return this;
	}

	public DmsPfileQuery tzooms(List<String> tzooms) {
		if (tzooms == null) {
			throw new RuntimeException("tzooms is empty ");
		}
		this.tzooms = tzooms;
		return this;
	}

	public DmsPfileQuery vid(String vid) {
		if (vid == null) {
			throw new RuntimeException("vid is null");
		}
		this.vid = vid;
		return this;
	}

	public DmsPfileQuery vidLike(String vidLike) {
		if (vidLike == null) {
			throw new RuntimeException("vid is null");
		}
		this.vidLike = vidLike;
		return this;
	}

	public DmsPfileQuery vids(List<String> vids) {
		if (vids == null) {
			throw new RuntimeException("vids is empty ");
		}
		this.vids = vids;
		return this;
	}

	public DmsPfileQuery visflag(String visflag) {
		if (visflag == null) {
			throw new RuntimeException("visflag is null");
		}
		this.visflag = visflag;
		return this;
	}

	public DmsPfileQuery visflagLike(String visflagLike) {
		if (visflagLike == null) {
			throw new RuntimeException("visflag is null");
		}
		this.visflagLike = visflagLike;
		return this;
	}

	public DmsPfileQuery visflags(List<String> visflags) {
		if (visflags == null) {
			throw new RuntimeException("visflags is empty ");
		}
		this.visflags = visflags;
		return this;
	}

	public DmsPfileQuery vnum(String vnum) {
		if (vnum == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnum = vnum;
		return this;
	}

	public DmsPfileQuery vnumLike(String vnumLike) {
		if (vnumLike == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnumLike = vnumLike;
		return this;
	}

	public DmsPfileQuery vnums(List<String> vnums) {
		if (vnums == null) {
			throw new RuntimeException("vnums is empty ");
		}
		this.vnums = vnums;
		return this;
	}

	public DmsPfileQuery wcompany(String wcompany) {
		if (wcompany == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompany = wcompany;
		return this;
	}

	public DmsPfileQuery wcompanyID(String wcompanyID) {
		if (wcompanyID == null) {
			throw new RuntimeException("wcompanyID is null");
		}
		this.wcompanyID = wcompanyID;
		return this;
	}

	public DmsPfileQuery wcompanyIDLike(String wcompanyIDLike) {
		if (wcompanyIDLike == null) {
			throw new RuntimeException("wcompanyID is null");
		}
		this.wcompanyIDLike = wcompanyIDLike;
		return this;
	}

	public DmsPfileQuery wcompanyIDs(List<String> wcompanyIDs) {
		if (wcompanyIDs == null) {
			throw new RuntimeException("wcompanyIDs is empty ");
		}
		this.wcompanyIDs = wcompanyIDs;
		return this;
	}

	public DmsPfileQuery wcompanyLike(String wcompanyLike) {
		if (wcompanyLike == null) {
			throw new RuntimeException("wcompany is null");
		}
		this.wcompanyLike = wcompanyLike;
		return this;
	}

	public DmsPfileQuery wcompanys(List<String> wcompanys) {
		if (wcompanys == null) {
			throw new RuntimeException("wcompanys is empty ");
		}
		this.wcompanys = wcompanys;
		return this;
	}

	public DmsPfileQuery year(Integer year) {
		if (year == null) {
			throw new RuntimeException("year is null");
		}
		this.year = year;
		return this;
	}

	public DmsPfileQuery yearGreaterThanOrEqual(Integer yearGreaterThanOrEqual) {
		if (yearGreaterThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearGreaterThanOrEqual = yearGreaterThanOrEqual;
		return this;
	}

	public DmsPfileQuery yearLessThanOrEqual(Integer yearLessThanOrEqual) {
		if (yearLessThanOrEqual == null) {
			throw new RuntimeException("year is null");
		}
		this.yearLessThanOrEqual = yearLessThanOrEqual;
		return this;
	}

	public DmsPfileQuery years(List<Integer> years) {
		if (years == null) {
			throw new RuntimeException("years is empty ");
		}
		this.years = years;
		return this;
	}

}