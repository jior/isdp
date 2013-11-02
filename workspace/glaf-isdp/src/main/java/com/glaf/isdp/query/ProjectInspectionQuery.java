package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ProjectInspectionQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
  	protected Integer indexId;
  	protected Integer indexIdGreaterThanOrEqual;
  	protected Integer indexIdLessThanOrEqual;
  	protected List<Integer> indexIds;
  	protected Integer intflag;
  	protected Integer intflagGreaterThanOrEqual;
  	protected Integer intflagLessThanOrEqual;
  	protected List<Integer> intflags;
  	protected String cellTmpfiletypeId;
  	protected String cellTmpfiletypeIdLike;
  	protected List<String> cellTmpfiletypeIds;
  	protected Integer listno;
  	protected Integer listnoGreaterThanOrEqual;
  	protected Integer listnoLessThanOrEqual;
  	protected List<Integer> listnos;
  	protected Integer chkresult;
  	protected Integer chkresultGreaterThanOrEqual;
  	protected Integer chkresultLessThanOrEqual;
  	protected List<Integer> chkresults;
  	protected String pfileId;
  	protected String pfileIdLike;
  	protected List<String> pfileIds;
  	protected Integer refillflag;
  	protected Integer refillflagGreaterThanOrEqual;
  	protected Integer refillflagLessThanOrEqual;
  	protected List<Integer> refillflags;
  	protected Integer groupid;
  	protected Integer groupidGreaterThanOrEqual;
  	protected Integer groupidLessThanOrEqual;
  	protected List<Integer> groupids;
  	protected String oldId;
  	protected String oldIdLike;
  	protected List<String> oldIds;
  	protected String emailId;
  	protected String emailIdLike;
  	protected List<String> emailIds;
  	protected String recemailId;
  	protected String recemailIdLike;
  	protected List<String> recemailIds;
  	protected String mainId;
  	protected String mainIdLike;
  	protected List<String> mainIds;
  	protected String tagnum;
  	protected String tagnumLike;
  	protected List<String> tagnums;
  	protected Date ctime;
  	protected Date ctimeGreaterThanOrEqual;
  	protected Date ctimeLessThanOrEqual;
  	protected List<Date> ctimes;
  	protected String tname;
  	protected String tnameLike;
  	protected List<String> tnames;
  	protected Integer page;
  	protected Integer pageGreaterThanOrEqual;
  	protected Integer pageLessThanOrEqual;
  	protected List<Integer> pages;
  	protected String duty;
  	protected String dutyLike;
  	protected List<String> dutys;
  	protected String thematic;
  	protected String thematicLike;
  	protected List<String> thematics;
  	protected String annotations;
  	protected String annotationsLike;
  	protected List<String> annotationss;
	

    public ProjectInspectionQuery() {

    }


    public Integer getIndexId(){
        return indexId;
    }

    public Integer getIndexIdGreaterThanOrEqual(){
        return indexIdGreaterThanOrEqual;
    }

    public Integer getIndexIdLessThanOrEqual(){
	return indexIdLessThanOrEqual;
    }

    public List<Integer> getIndexIds(){
	return indexIds;
    }


    public Integer getIntflag(){
        return intflag;
    }

    public Integer getIntflagGreaterThanOrEqual(){
        return intflagGreaterThanOrEqual;
    }

    public Integer getIntflagLessThanOrEqual(){
	return intflagLessThanOrEqual;
    }

    public List<Integer> getIntflags(){
	return intflags;
    }


    public String getCellTmpfiletypeId(){
        return cellTmpfiletypeId;
    }

    public String getCellTmpfiletypeIdLike(){
	    if (cellTmpfiletypeIdLike != null && cellTmpfiletypeIdLike.trim().length() > 0) {
		if (!cellTmpfiletypeIdLike.startsWith("%")) {
		    cellTmpfiletypeIdLike = "%" + cellTmpfiletypeIdLike;
		}
		if (!cellTmpfiletypeIdLike.endsWith("%")) {
		   cellTmpfiletypeIdLike = cellTmpfiletypeIdLike + "%";
		}
	    }
	return cellTmpfiletypeIdLike;
    }

    public List<String> getCellTmpfiletypeIds(){
	return cellTmpfiletypeIds;
    }


    public Integer getListno(){
        return listno;
    }

    public Integer getListnoGreaterThanOrEqual(){
        return listnoGreaterThanOrEqual;
    }

    public Integer getListnoLessThanOrEqual(){
	return listnoLessThanOrEqual;
    }

    public List<Integer> getListnos(){
	return listnos;
    }


    public Integer getChkresult(){
        return chkresult;
    }

    public Integer getChkresultGreaterThanOrEqual(){
        return chkresultGreaterThanOrEqual;
    }

    public Integer getChkresultLessThanOrEqual(){
	return chkresultLessThanOrEqual;
    }

    public List<Integer> getChkresults(){
	return chkresults;
    }


    public String getPfileId(){
        return pfileId;
    }

    public String getPfileIdLike(){
	    if (pfileIdLike != null && pfileIdLike.trim().length() > 0) {
		if (!pfileIdLike.startsWith("%")) {
		    pfileIdLike = "%" + pfileIdLike;
		}
		if (!pfileIdLike.endsWith("%")) {
		   pfileIdLike = pfileIdLike + "%";
		}
	    }
	return pfileIdLike;
    }

    public List<String> getPfileIds(){
	return pfileIds;
    }


    public Integer getRefillflag(){
        return refillflag;
    }

    public Integer getRefillflagGreaterThanOrEqual(){
        return refillflagGreaterThanOrEqual;
    }

    public Integer getRefillflagLessThanOrEqual(){
	return refillflagLessThanOrEqual;
    }

    public List<Integer> getRefillflags(){
	return refillflags;
    }


    public Integer getGroupid(){
        return groupid;
    }

    public Integer getGroupidGreaterThanOrEqual(){
        return groupidGreaterThanOrEqual;
    }

    public Integer getGroupidLessThanOrEqual(){
	return groupidLessThanOrEqual;
    }

    public List<Integer> getGroupids(){
	return groupids;
    }


    public String getOldId(){
        return oldId;
    }

    public String getOldIdLike(){
	    if (oldIdLike != null && oldIdLike.trim().length() > 0) {
		if (!oldIdLike.startsWith("%")) {
		    oldIdLike = "%" + oldIdLike;
		}
		if (!oldIdLike.endsWith("%")) {
		   oldIdLike = oldIdLike + "%";
		}
	    }
	return oldIdLike;
    }

    public List<String> getOldIds(){
	return oldIds;
    }


    public String getEmailId(){
        return emailId;
    }

    public String getEmailIdLike(){
	    if (emailIdLike != null && emailIdLike.trim().length() > 0) {
		if (!emailIdLike.startsWith("%")) {
		    emailIdLike = "%" + emailIdLike;
		}
		if (!emailIdLike.endsWith("%")) {
		   emailIdLike = emailIdLike + "%";
		}
	    }
	return emailIdLike;
    }

    public List<String> getEmailIds(){
	return emailIds;
    }


    public String getRecemailId(){
        return recemailId;
    }

    public String getRecemailIdLike(){
	    if (recemailIdLike != null && recemailIdLike.trim().length() > 0) {
		if (!recemailIdLike.startsWith("%")) {
		    recemailIdLike = "%" + recemailIdLike;
		}
		if (!recemailIdLike.endsWith("%")) {
		   recemailIdLike = recemailIdLike + "%";
		}
	    }
	return recemailIdLike;
    }

    public List<String> getRecemailIds(){
	return recemailIds;
    }


    public String getMainId(){
        return mainId;
    }

    public String getMainIdLike(){
	    if (mainIdLike != null && mainIdLike.trim().length() > 0) {
		if (!mainIdLike.startsWith("%")) {
		    mainIdLike = "%" + mainIdLike;
		}
		if (!mainIdLike.endsWith("%")) {
		   mainIdLike = mainIdLike + "%";
		}
	    }
	return mainIdLike;
    }

    public List<String> getMainIds(){
	return mainIds;
    }


    public String getTagnum(){
        return tagnum;
    }

    public String getTagnumLike(){
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

    public List<String> getTagnums(){
	return tagnums;
    }


    public Date getCtime(){
        return ctime;
    }

    public Date getCtimeGreaterThanOrEqual(){
        return ctimeGreaterThanOrEqual;
    }

    public Date getCtimeLessThanOrEqual(){
	return ctimeLessThanOrEqual;
    }

    public List<Date> getCtimes(){
	return ctimes;
    }


    public String getTname(){
        return tname;
    }

    public String getTnameLike(){
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

    public List<String> getTnames(){
	return tnames;
    }


    public Integer getPage(){
        return page;
    }

    public Integer getPageGreaterThanOrEqual(){
        return pageGreaterThanOrEqual;
    }

    public Integer getPageLessThanOrEqual(){
	return pageLessThanOrEqual;
    }

    public List<Integer> getPages(){
	return pages;
    }


    public String getDuty(){
        return duty;
    }

    public String getDutyLike(){
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

    public List<String> getDutys(){
	return dutys;
    }


    public String getThematic(){
        return thematic;
    }

    public String getThematicLike(){
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

    public List<String> getThematics(){
	return thematics;
    }


    public String getAnnotations(){
        return annotations;
    }

    public String getAnnotationsLike(){
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

    public List<String> getAnnotationss(){
	return annotationss;
    }



    public void setIndexId(Integer indexId){
        this.indexId = indexId;
    }

    public void setIndexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual){
        this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
    }

    public void setIndexIdLessThanOrEqual(Integer indexIdLessThanOrEqual){
	this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
    }

    public void setIndexIds(List<Integer> indexIds){
        this.indexIds = indexIds;
    }


    public void setIntflag(Integer intflag){
        this.intflag = intflag;
    }

    public void setIntflagGreaterThanOrEqual(Integer intflagGreaterThanOrEqual){
        this.intflagGreaterThanOrEqual = intflagGreaterThanOrEqual;
    }

    public void setIntflagLessThanOrEqual(Integer intflagLessThanOrEqual){
	this.intflagLessThanOrEqual = intflagLessThanOrEqual;
    }

    public void setIntflags(List<Integer> intflags){
        this.intflags = intflags;
    }


    public void setCellTmpfiletypeId(String cellTmpfiletypeId){
        this.cellTmpfiletypeId = cellTmpfiletypeId;
    }

    public void setCellTmpfiletypeIdLike( String cellTmpfiletypeIdLike){
	this.cellTmpfiletypeIdLike = cellTmpfiletypeIdLike;
    }

    public void setCellTmpfiletypeIds(List<String> cellTmpfiletypeIds){
        this.cellTmpfiletypeIds = cellTmpfiletypeIds;
    }


    public void setListno(Integer listno){
        this.listno = listno;
    }

    public void setListnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual){
        this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
    }

    public void setListnoLessThanOrEqual(Integer listnoLessThanOrEqual){
	this.listnoLessThanOrEqual = listnoLessThanOrEqual;
    }

    public void setListnos(List<Integer> listnos){
        this.listnos = listnos;
    }


    public void setChkresult(Integer chkresult){
        this.chkresult = chkresult;
    }

    public void setChkresultGreaterThanOrEqual(Integer chkresultGreaterThanOrEqual){
        this.chkresultGreaterThanOrEqual = chkresultGreaterThanOrEqual;
    }

    public void setChkresultLessThanOrEqual(Integer chkresultLessThanOrEqual){
	this.chkresultLessThanOrEqual = chkresultLessThanOrEqual;
    }

    public void setChkresults(List<Integer> chkresults){
        this.chkresults = chkresults;
    }


    public void setPfileId(String pfileId){
        this.pfileId = pfileId;
    }

    public void setPfileIdLike( String pfileIdLike){
	this.pfileIdLike = pfileIdLike;
    }

    public void setPfileIds(List<String> pfileIds){
        this.pfileIds = pfileIds;
    }


    public void setRefillflag(Integer refillflag){
        this.refillflag = refillflag;
    }

    public void setRefillflagGreaterThanOrEqual(Integer refillflagGreaterThanOrEqual){
        this.refillflagGreaterThanOrEqual = refillflagGreaterThanOrEqual;
    }

    public void setRefillflagLessThanOrEqual(Integer refillflagLessThanOrEqual){
	this.refillflagLessThanOrEqual = refillflagLessThanOrEqual;
    }

    public void setRefillflags(List<Integer> refillflags){
        this.refillflags = refillflags;
    }


    public void setGroupid(Integer groupid){
        this.groupid = groupid;
    }

    public void setGroupidGreaterThanOrEqual(Integer groupidGreaterThanOrEqual){
        this.groupidGreaterThanOrEqual = groupidGreaterThanOrEqual;
    }

    public void setGroupidLessThanOrEqual(Integer groupidLessThanOrEqual){
	this.groupidLessThanOrEqual = groupidLessThanOrEqual;
    }

    public void setGroupids(List<Integer> groupids){
        this.groupids = groupids;
    }


    public void setOldId(String oldId){
        this.oldId = oldId;
    }

    public void setOldIdLike( String oldIdLike){
	this.oldIdLike = oldIdLike;
    }

    public void setOldIds(List<String> oldIds){
        this.oldIds = oldIds;
    }


    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

    public void setEmailIdLike( String emailIdLike){
	this.emailIdLike = emailIdLike;
    }

    public void setEmailIds(List<String> emailIds){
        this.emailIds = emailIds;
    }


    public void setRecemailId(String recemailId){
        this.recemailId = recemailId;
    }

    public void setRecemailIdLike( String recemailIdLike){
	this.recemailIdLike = recemailIdLike;
    }

    public void setRecemailIds(List<String> recemailIds){
        this.recemailIds = recemailIds;
    }


    public void setMainId(String mainId){
        this.mainId = mainId;
    }

    public void setMainIdLike( String mainIdLike){
	this.mainIdLike = mainIdLike;
    }

    public void setMainIds(List<String> mainIds){
        this.mainIds = mainIds;
    }


    public void setTagnum(String tagnum){
        this.tagnum = tagnum;
    }

    public void setTagnumLike( String tagnumLike){
	this.tagnumLike = tagnumLike;
    }

    public void setTagnums(List<String> tagnums){
        this.tagnums = tagnums;
    }


    public void setCtime(Date ctime){
        this.ctime = ctime;
    }

    public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual){
        this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
    }

    public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual){
	this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
    }

    public void setCtimes(List<Date> ctimes){
        this.ctimes = ctimes;
    }


    public void setTname(String tname){
        this.tname = tname;
    }

    public void setTnameLike( String tnameLike){
	this.tnameLike = tnameLike;
    }

    public void setTnames(List<String> tnames){
        this.tnames = tnames;
    }


    public void setPage(Integer page){
        this.page = page;
    }

    public void setPageGreaterThanOrEqual(Integer pageGreaterThanOrEqual){
        this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
    }

    public void setPageLessThanOrEqual(Integer pageLessThanOrEqual){
	this.pageLessThanOrEqual = pageLessThanOrEqual;
    }

    public void setPages(List<Integer> pages){
        this.pages = pages;
    }


    public void setDuty(String duty){
        this.duty = duty;
    }

    public void setDutyLike( String dutyLike){
	this.dutyLike = dutyLike;
    }

    public void setDutys(List<String> dutys){
        this.dutys = dutys;
    }


    public void setThematic(String thematic){
        this.thematic = thematic;
    }

    public void setThematicLike( String thematicLike){
	this.thematicLike = thematicLike;
    }

    public void setThematics(List<String> thematics){
        this.thematics = thematics;
    }


    public void setAnnotations(String annotations){
        this.annotations = annotations;
    }

    public void setAnnotationsLike( String annotationsLike){
	this.annotationsLike = annotationsLike;
    }

    public void setAnnotationss(List<String> annotationss){
        this.annotationss = annotationss;
    }




    public ProjectInspectionQuery indexId(Integer indexId){
	if (indexId == null) {
            throw new RuntimeException("indexId is null");
        }         
	this.indexId = indexId;
	return this;
    }

    public ProjectInspectionQuery indexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual){
	if (indexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("indexId is null");
        }         
	this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual){
        if (indexIdLessThanOrEqual == null) {
            throw new RuntimeException("indexId is null");
        }
        this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery indexIds(List<Integer> indexIds){
        if (indexIds == null) {
            throw new RuntimeException("indexIds is empty ");
        }
        this.indexIds = indexIds;
        return this;
    }


    public ProjectInspectionQuery intflag(Integer intflag){
	if (intflag == null) {
            throw new RuntimeException("intflag is null");
        }         
	this.intflag = intflag;
	return this;
    }

    public ProjectInspectionQuery intflagGreaterThanOrEqual(Integer intflagGreaterThanOrEqual){
	if (intflagGreaterThanOrEqual == null) {
	    throw new RuntimeException("intflag is null");
        }         
	this.intflagGreaterThanOrEqual = intflagGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery intflagLessThanOrEqual(Integer intflagLessThanOrEqual){
        if (intflagLessThanOrEqual == null) {
            throw new RuntimeException("intflag is null");
        }
        this.intflagLessThanOrEqual = intflagLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery intflags(List<Integer> intflags){
        if (intflags == null) {
            throw new RuntimeException("intflags is empty ");
        }
        this.intflags = intflags;
        return this;
    }


    public ProjectInspectionQuery cellTmpfiletypeId(String cellTmpfiletypeId){
	if (cellTmpfiletypeId == null) {
	    throw new RuntimeException("cellTmpfiletypeId is null");
        }         
	this.cellTmpfiletypeId = cellTmpfiletypeId;
	return this;
    }

    public ProjectInspectionQuery cellTmpfiletypeIdLike( String cellTmpfiletypeIdLike){
        if (cellTmpfiletypeIdLike == null) {
            throw new RuntimeException("cellTmpfiletypeId is null");
        }
        this.cellTmpfiletypeIdLike = cellTmpfiletypeIdLike;
        return this;
    }

    public ProjectInspectionQuery cellTmpfiletypeIds(List<String> cellTmpfiletypeIds){
        if (cellTmpfiletypeIds == null) {
            throw new RuntimeException("cellTmpfiletypeIds is empty ");
        }
        this.cellTmpfiletypeIds = cellTmpfiletypeIds;
        return this;
    }


    public ProjectInspectionQuery listno(Integer listno){
	if (listno == null) {
            throw new RuntimeException("listno is null");
        }         
	this.listno = listno;
	return this;
    }

    public ProjectInspectionQuery listnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual){
	if (listnoGreaterThanOrEqual == null) {
	    throw new RuntimeException("listno is null");
        }         
	this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual){
        if (listnoLessThanOrEqual == null) {
            throw new RuntimeException("listno is null");
        }
        this.listnoLessThanOrEqual = listnoLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery listnos(List<Integer> listnos){
        if (listnos == null) {
            throw new RuntimeException("listnos is empty ");
        }
        this.listnos = listnos;
        return this;
    }


    public ProjectInspectionQuery chkresult(Integer chkresult){
	if (chkresult == null) {
            throw new RuntimeException("chkresult is null");
        }         
	this.chkresult = chkresult;
	return this;
    }

    public ProjectInspectionQuery chkresultGreaterThanOrEqual(Integer chkresultGreaterThanOrEqual){
	if (chkresultGreaterThanOrEqual == null) {
	    throw new RuntimeException("chkresult is null");
        }         
	this.chkresultGreaterThanOrEqual = chkresultGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery chkresultLessThanOrEqual(Integer chkresultLessThanOrEqual){
        if (chkresultLessThanOrEqual == null) {
            throw new RuntimeException("chkresult is null");
        }
        this.chkresultLessThanOrEqual = chkresultLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery chkresults(List<Integer> chkresults){
        if (chkresults == null) {
            throw new RuntimeException("chkresults is empty ");
        }
        this.chkresults = chkresults;
        return this;
    }


    public ProjectInspectionQuery pfileId(String pfileId){
	if (pfileId == null) {
	    throw new RuntimeException("pfileId is null");
        }         
	this.pfileId = pfileId;
	return this;
    }

    public ProjectInspectionQuery pfileIdLike( String pfileIdLike){
        if (pfileIdLike == null) {
            throw new RuntimeException("pfileId is null");
        }
        this.pfileIdLike = pfileIdLike;
        return this;
    }

    public ProjectInspectionQuery pfileIds(List<String> pfileIds){
        if (pfileIds == null) {
            throw new RuntimeException("pfileIds is empty ");
        }
        this.pfileIds = pfileIds;
        return this;
    }


    public ProjectInspectionQuery refillflag(Integer refillflag){
	if (refillflag == null) {
            throw new RuntimeException("refillflag is null");
        }         
	this.refillflag = refillflag;
	return this;
    }

    public ProjectInspectionQuery refillflagGreaterThanOrEqual(Integer refillflagGreaterThanOrEqual){
	if (refillflagGreaterThanOrEqual == null) {
	    throw new RuntimeException("refillflag is null");
        }         
	this.refillflagGreaterThanOrEqual = refillflagGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery refillflagLessThanOrEqual(Integer refillflagLessThanOrEqual){
        if (refillflagLessThanOrEqual == null) {
            throw new RuntimeException("refillflag is null");
        }
        this.refillflagLessThanOrEqual = refillflagLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery refillflags(List<Integer> refillflags){
        if (refillflags == null) {
            throw new RuntimeException("refillflags is empty ");
        }
        this.refillflags = refillflags;
        return this;
    }


    public ProjectInspectionQuery groupid(Integer groupid){
	if (groupid == null) {
            throw new RuntimeException("groupid is null");
        }         
	this.groupid = groupid;
	return this;
    }

    public ProjectInspectionQuery groupidGreaterThanOrEqual(Integer groupidGreaterThanOrEqual){
	if (groupidGreaterThanOrEqual == null) {
	    throw new RuntimeException("groupid is null");
        }         
	this.groupidGreaterThanOrEqual = groupidGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery groupidLessThanOrEqual(Integer groupidLessThanOrEqual){
        if (groupidLessThanOrEqual == null) {
            throw new RuntimeException("groupid is null");
        }
        this.groupidLessThanOrEqual = groupidLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery groupids(List<Integer> groupids){
        if (groupids == null) {
            throw new RuntimeException("groupids is empty ");
        }
        this.groupids = groupids;
        return this;
    }


    public ProjectInspectionQuery oldId(String oldId){
	if (oldId == null) {
	    throw new RuntimeException("oldId is null");
        }         
	this.oldId = oldId;
	return this;
    }

    public ProjectInspectionQuery oldIdLike( String oldIdLike){
        if (oldIdLike == null) {
            throw new RuntimeException("oldId is null");
        }
        this.oldIdLike = oldIdLike;
        return this;
    }

    public ProjectInspectionQuery oldIds(List<String> oldIds){
        if (oldIds == null) {
            throw new RuntimeException("oldIds is empty ");
        }
        this.oldIds = oldIds;
        return this;
    }


    public ProjectInspectionQuery emailId(String emailId){
	if (emailId == null) {
	    throw new RuntimeException("emailId is null");
        }         
	this.emailId = emailId;
	return this;
    }

    public ProjectInspectionQuery emailIdLike( String emailIdLike){
        if (emailIdLike == null) {
            throw new RuntimeException("emailId is null");
        }
        this.emailIdLike = emailIdLike;
        return this;
    }

    public ProjectInspectionQuery emailIds(List<String> emailIds){
        if (emailIds == null) {
            throw new RuntimeException("emailIds is empty ");
        }
        this.emailIds = emailIds;
        return this;
    }


    public ProjectInspectionQuery recemailId(String recemailId){
	if (recemailId == null) {
	    throw new RuntimeException("recemailId is null");
        }         
	this.recemailId = recemailId;
	return this;
    }

    public ProjectInspectionQuery recemailIdLike( String recemailIdLike){
        if (recemailIdLike == null) {
            throw new RuntimeException("recemailId is null");
        }
        this.recemailIdLike = recemailIdLike;
        return this;
    }

    public ProjectInspectionQuery recemailIds(List<String> recemailIds){
        if (recemailIds == null) {
            throw new RuntimeException("recemailIds is empty ");
        }
        this.recemailIds = recemailIds;
        return this;
    }


    public ProjectInspectionQuery mainId(String mainId){
	if (mainId == null) {
	    throw new RuntimeException("mainId is null");
        }         
	this.mainId = mainId;
	return this;
    }

    public ProjectInspectionQuery mainIdLike( String mainIdLike){
        if (mainIdLike == null) {
            throw new RuntimeException("mainId is null");
        }
        this.mainIdLike = mainIdLike;
        return this;
    }

    public ProjectInspectionQuery mainIds(List<String> mainIds){
        if (mainIds == null) {
            throw new RuntimeException("mainIds is empty ");
        }
        this.mainIds = mainIds;
        return this;
    }


    public ProjectInspectionQuery tagnum(String tagnum){
	if (tagnum == null) {
	    throw new RuntimeException("tagnum is null");
        }         
	this.tagnum = tagnum;
	return this;
    }

    public ProjectInspectionQuery tagnumLike( String tagnumLike){
        if (tagnumLike == null) {
            throw new RuntimeException("tagnum is null");
        }
        this.tagnumLike = tagnumLike;
        return this;
    }

    public ProjectInspectionQuery tagnums(List<String> tagnums){
        if (tagnums == null) {
            throw new RuntimeException("tagnums is empty ");
        }
        this.tagnums = tagnums;
        return this;
    }


    public ProjectInspectionQuery ctime(Date ctime){
	if (ctime == null) {
            throw new RuntimeException("ctime is null");
        }         
	this.ctime = ctime;
	return this;
    }

    public ProjectInspectionQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual){
	if (ctimeGreaterThanOrEqual == null) {
	    throw new RuntimeException("ctime is null");
        }         
	this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual){
        if (ctimeLessThanOrEqual == null) {
            throw new RuntimeException("ctime is null");
        }
        this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery ctimes(List<Date> ctimes){
        if (ctimes == null) {
            throw new RuntimeException("ctimes is empty ");
        }
        this.ctimes = ctimes;
        return this;
    }


    public ProjectInspectionQuery tname(String tname){
	if (tname == null) {
	    throw new RuntimeException("tname is null");
        }         
	this.tname = tname;
	return this;
    }

    public ProjectInspectionQuery tnameLike( String tnameLike){
        if (tnameLike == null) {
            throw new RuntimeException("tname is null");
        }
        this.tnameLike = tnameLike;
        return this;
    }

    public ProjectInspectionQuery tnames(List<String> tnames){
        if (tnames == null) {
            throw new RuntimeException("tnames is empty ");
        }
        this.tnames = tnames;
        return this;
    }


    public ProjectInspectionQuery page(Integer page){
	if (page == null) {
            throw new RuntimeException("page is null");
        }         
	this.page = page;
	return this;
    }

    public ProjectInspectionQuery pageGreaterThanOrEqual(Integer pageGreaterThanOrEqual){
	if (pageGreaterThanOrEqual == null) {
	    throw new RuntimeException("page is null");
        }         
	this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery pageLessThanOrEqual(Integer pageLessThanOrEqual){
        if (pageLessThanOrEqual == null) {
            throw new RuntimeException("page is null");
        }
        this.pageLessThanOrEqual = pageLessThanOrEqual;
        return this;
    }

    public ProjectInspectionQuery pages(List<Integer> pages){
        if (pages == null) {
            throw new RuntimeException("pages is empty ");
        }
        this.pages = pages;
        return this;
    }


    public ProjectInspectionQuery duty(String duty){
	if (duty == null) {
	    throw new RuntimeException("duty is null");
        }         
	this.duty = duty;
	return this;
    }

    public ProjectInspectionQuery dutyLike( String dutyLike){
        if (dutyLike == null) {
            throw new RuntimeException("duty is null");
        }
        this.dutyLike = dutyLike;
        return this;
    }

    public ProjectInspectionQuery dutys(List<String> dutys){
        if (dutys == null) {
            throw new RuntimeException("dutys is empty ");
        }
        this.dutys = dutys;
        return this;
    }


    public ProjectInspectionQuery thematic(String thematic){
	if (thematic == null) {
	    throw new RuntimeException("thematic is null");
        }         
	this.thematic = thematic;
	return this;
    }

    public ProjectInspectionQuery thematicLike( String thematicLike){
        if (thematicLike == null) {
            throw new RuntimeException("thematic is null");
        }
        this.thematicLike = thematicLike;
        return this;
    }

    public ProjectInspectionQuery thematics(List<String> thematics){
        if (thematics == null) {
            throw new RuntimeException("thematics is empty ");
        }
        this.thematics = thematics;
        return this;
    }


    public ProjectInspectionQuery annotations(String annotations){
	if (annotations == null) {
	    throw new RuntimeException("annotations is null");
        }         
	this.annotations = annotations;
	return this;
    }

    public ProjectInspectionQuery annotationsLike( String annotationsLike){
        if (annotationsLike == null) {
            throw new RuntimeException("annotations is null");
        }
        this.annotationsLike = annotationsLike;
        return this;
    }

    public ProjectInspectionQuery annotationss(List<String> annotationss){
        if (annotationss == null) {
            throw new RuntimeException("annotationss is empty ");
        }
        this.annotationss = annotationss;
        return this;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
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

    @Override
    public void initQueryColumns(){
        super.initQueryColumns();
        addColumn("id", "id");
        addColumn("indexId", "index_id");
        addColumn("intflag", "intflag");
        addColumn("cellTmpfiletypeId", "cell_tmpfiletype_id");
        addColumn("listno", "listno");
        addColumn("chkresult", "chkresult");
        addColumn("pfileId", "pfile_id");
        addColumn("refillflag", "refillflag");
        addColumn("groupid", "groupid");
        addColumn("oldId", "old_id");
        addColumn("emailId", "email_id");
        addColumn("recemailId", "recemail_id");
        addColumn("mainId", "main_id");
        addColumn("tagnum", "tagnum");
        addColumn("ctime", "ctime");
        addColumn("tname", "tname");
        addColumn("page", "page");
        addColumn("duty", "duty");
        addColumn("thematic", "thematic");
        addColumn("annotations", "annotations");
    }

}