package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellUpicInfoQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
  	protected String topid;
  	protected String topidLike;
  	protected List<String> topids;
  	protected Integer indexId;
  	protected Integer indexIdGreaterThanOrEqual;
  	protected Integer indexIdLessThanOrEqual;
  	protected List<Integer> indexIds;
  	protected String taskId;
  	protected String taskIdLike;
  	protected List<String> taskIds;
  	protected Integer pfileflag;
  	protected Integer pfileflagGreaterThanOrEqual;
  	protected Integer pfileflagLessThanOrEqual;
  	protected List<Integer> pfileflags;
  	protected String filedotFileid;
  	protected String filedotFileidLike;
  	protected List<String> filedotFileids;
  	protected Integer listno;
  	protected Integer listnoGreaterThanOrEqual;
  	protected Integer listnoLessThanOrEqual;
  	protected List<Integer> listnos;
  	protected Integer chktotal;
  	protected Integer chktotalGreaterThanOrEqual;
  	protected Integer chktotalLessThanOrEqual;
  	protected List<Integer> chktotals;
  	protected Integer chkresult;
  	protected Integer chkresultGreaterThanOrEqual;
  	protected Integer chkresultLessThanOrEqual;
  	protected List<Integer> chkresults;
  	protected String pfileId;
  	protected String pfileIdLike;
  	protected List<String> pfileIds;
  	protected String userid;
  	protected String useridLike;
  	protected List<String> userids;
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
  	protected Integer roleId;
  	protected Integer roleIdGreaterThanOrEqual;
  	protected Integer roleIdLessThanOrEqual;
  	protected List<Integer> roleIds;
  	protected Integer isfinish;
  	protected Integer isfinishGreaterThanOrEqual;
  	protected Integer isfinishLessThanOrEqual;
  	protected List<Integer> isfinishs;
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
  	protected Integer typeIndexId;
  	protected Integer typeIndexIdGreaterThanOrEqual;
  	protected Integer typeIndexIdLessThanOrEqual;
  	protected List<Integer> typeIndexIds;
  	protected String typeId;
  	protected String typeIdLike;
  	protected List<String> typeIds;
	

    public CellUpicInfoQuery() {

    }


    public String getTopid(){
        return topid;
    }

    public String getTopidLike(){
	    if (topidLike != null && topidLike.trim().length() > 0) {
		if (!topidLike.startsWith("%")) {
		    topidLike = "%" + topidLike;
		}
		if (!topidLike.endsWith("%")) {
		   topidLike = topidLike + "%";
		}
	    }
	return topidLike;
    }

    public List<String> getTopids(){
	return topids;
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


    public String getTaskId(){
        return taskId;
    }

    public String getTaskIdLike(){
	    if (taskIdLike != null && taskIdLike.trim().length() > 0) {
		if (!taskIdLike.startsWith("%")) {
		    taskIdLike = "%" + taskIdLike;
		}
		if (!taskIdLike.endsWith("%")) {
		   taskIdLike = taskIdLike + "%";
		}
	    }
	return taskIdLike;
    }

    public List<String> getTaskIds(){
	return taskIds;
    }


    public Integer getPfileflag(){
        return pfileflag;
    }

    public Integer getPfileflagGreaterThanOrEqual(){
        return pfileflagGreaterThanOrEqual;
    }

    public Integer getPfileflagLessThanOrEqual(){
	return pfileflagLessThanOrEqual;
    }

    public List<Integer> getPfileflags(){
	return pfileflags;
    }


    public String getFiledotFileid(){
        return filedotFileid;
    }

    public String getFiledotFileidLike(){
	    if (filedotFileidLike != null && filedotFileidLike.trim().length() > 0) {
		if (!filedotFileidLike.startsWith("%")) {
		    filedotFileidLike = "%" + filedotFileidLike;
		}
		if (!filedotFileidLike.endsWith("%")) {
		   filedotFileidLike = filedotFileidLike + "%";
		}
	    }
	return filedotFileidLike;
    }

    public List<String> getFiledotFileids(){
	return filedotFileids;
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


    public Integer getChktotal(){
        return chktotal;
    }

    public Integer getChktotalGreaterThanOrEqual(){
        return chktotalGreaterThanOrEqual;
    }

    public Integer getChktotalLessThanOrEqual(){
	return chktotalLessThanOrEqual;
    }

    public List<Integer> getChktotals(){
	return chktotals;
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


    public String getUserid(){
        return userid;
    }

    public String getUseridLike(){
	    if (useridLike != null && useridLike.trim().length() > 0) {
		if (!useridLike.startsWith("%")) {
		    useridLike = "%" + useridLike;
		}
		if (!useridLike.endsWith("%")) {
		   useridLike = useridLike + "%";
		}
	    }
	return useridLike;
    }

    public List<String> getUserids(){
	return userids;
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


    public Integer getRoleId(){
        return roleId;
    }

    public Integer getRoleIdGreaterThanOrEqual(){
        return roleIdGreaterThanOrEqual;
    }

    public Integer getRoleIdLessThanOrEqual(){
	return roleIdLessThanOrEqual;
    }

    public List<Integer> getRoleIds(){
	return roleIds;
    }


    public Integer getIsfinish(){
        return isfinish;
    }

    public Integer getIsfinishGreaterThanOrEqual(){
        return isfinishGreaterThanOrEqual;
    }

    public Integer getIsfinishLessThanOrEqual(){
	return isfinishLessThanOrEqual;
    }

    public List<Integer> getIsfinishs(){
	return isfinishs;
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


    public Integer getTypeIndexId(){
        return typeIndexId;
    }

    public Integer getTypeIndexIdGreaterThanOrEqual(){
        return typeIndexIdGreaterThanOrEqual;
    }

    public Integer getTypeIndexIdLessThanOrEqual(){
	return typeIndexIdLessThanOrEqual;
    }

    public List<Integer> getTypeIndexIds(){
	return typeIndexIds;
    }


    public String getTypeId(){
        return typeId;
    }

    public String getTypeIdLike(){
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

    public List<String> getTypeIds(){
	return typeIds;
    }



    public void setTopid(String topid){
        this.topid = topid;
    }

    public void setTopidLike( String topidLike){
	this.topidLike = topidLike;
    }

    public void setTopids(List<String> topids){
        this.topids = topids;
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


    public void setTaskId(String taskId){
        this.taskId = taskId;
    }

    public void setTaskIdLike( String taskIdLike){
	this.taskIdLike = taskIdLike;
    }

    public void setTaskIds(List<String> taskIds){
        this.taskIds = taskIds;
    }


    public void setPfileflag(Integer pfileflag){
        this.pfileflag = pfileflag;
    }

    public void setPfileflagGreaterThanOrEqual(Integer pfileflagGreaterThanOrEqual){
        this.pfileflagGreaterThanOrEqual = pfileflagGreaterThanOrEqual;
    }

    public void setPfileflagLessThanOrEqual(Integer pfileflagLessThanOrEqual){
	this.pfileflagLessThanOrEqual = pfileflagLessThanOrEqual;
    }

    public void setPfileflags(List<Integer> pfileflags){
        this.pfileflags = pfileflags;
    }


    public void setFiledotFileid(String filedotFileid){
        this.filedotFileid = filedotFileid;
    }

    public void setFiledotFileidLike( String filedotFileidLike){
	this.filedotFileidLike = filedotFileidLike;
    }

    public void setFiledotFileids(List<String> filedotFileids){
        this.filedotFileids = filedotFileids;
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


    public void setChktotal(Integer chktotal){
        this.chktotal = chktotal;
    }

    public void setChktotalGreaterThanOrEqual(Integer chktotalGreaterThanOrEqual){
        this.chktotalGreaterThanOrEqual = chktotalGreaterThanOrEqual;
    }

    public void setChktotalLessThanOrEqual(Integer chktotalLessThanOrEqual){
	this.chktotalLessThanOrEqual = chktotalLessThanOrEqual;
    }

    public void setChktotals(List<Integer> chktotals){
        this.chktotals = chktotals;
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


    public void setUserid(String userid){
        this.userid = userid;
    }

    public void setUseridLike( String useridLike){
	this.useridLike = useridLike;
    }

    public void setUserids(List<String> userids){
        this.userids = userids;
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


    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    public void setRoleIdGreaterThanOrEqual(Integer roleIdGreaterThanOrEqual){
        this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
    }

    public void setRoleIdLessThanOrEqual(Integer roleIdLessThanOrEqual){
	this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
    }

    public void setRoleIds(List<Integer> roleIds){
        this.roleIds = roleIds;
    }


    public void setIsfinish(Integer isfinish){
        this.isfinish = isfinish;
    }

    public void setIsfinishGreaterThanOrEqual(Integer isfinishGreaterThanOrEqual){
        this.isfinishGreaterThanOrEqual = isfinishGreaterThanOrEqual;
    }

    public void setIsfinishLessThanOrEqual(Integer isfinishLessThanOrEqual){
	this.isfinishLessThanOrEqual = isfinishLessThanOrEqual;
    }

    public void setIsfinishs(List<Integer> isfinishs){
        this.isfinishs = isfinishs;
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


    public void setTypeIndexId(Integer typeIndexId){
        this.typeIndexId = typeIndexId;
    }

    public void setTypeIndexIdGreaterThanOrEqual(Integer typeIndexIdGreaterThanOrEqual){
        this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
    }

    public void setTypeIndexIdLessThanOrEqual(Integer typeIndexIdLessThanOrEqual){
	this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
    }

    public void setTypeIndexIds(List<Integer> typeIndexIds){
        this.typeIndexIds = typeIndexIds;
    }


    public void setTypeId(String typeId){
        this.typeId = typeId;
    }

    public void setTypeIdLike( String typeIdLike){
	this.typeIdLike = typeIdLike;
    }

    public void setTypeIds(List<String> typeIds){
        this.typeIds = typeIds;
    }




    public CellUpicInfoQuery topid(String topid){
	if (topid == null) {
	    throw new RuntimeException("topid is null");
        }         
	this.topid = topid;
	return this;
    }

    public CellUpicInfoQuery topidLike( String topidLike){
        if (topidLike == null) {
            throw new RuntimeException("topid is null");
        }
        this.topidLike = topidLike;
        return this;
    }

    public CellUpicInfoQuery topids(List<String> topids){
        if (topids == null) {
            throw new RuntimeException("topids is empty ");
        }
        this.topids = topids;
        return this;
    }


    public CellUpicInfoQuery indexId(Integer indexId){
	if (indexId == null) {
            throw new RuntimeException("indexId is null");
        }         
	this.indexId = indexId;
	return this;
    }

    public CellUpicInfoQuery indexIdGreaterThanOrEqual(Integer indexIdGreaterThanOrEqual){
	if (indexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("indexId is null");
        }         
	this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual){
        if (indexIdLessThanOrEqual == null) {
            throw new RuntimeException("indexId is null");
        }
        this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery indexIds(List<Integer> indexIds){
        if (indexIds == null) {
            throw new RuntimeException("indexIds is empty ");
        }
        this.indexIds = indexIds;
        return this;
    }


    public CellUpicInfoQuery taskId(String taskId){
	if (taskId == null) {
	    throw new RuntimeException("taskId is null");
        }         
	this.taskId = taskId;
	return this;
    }

    public CellUpicInfoQuery taskIdLike( String taskIdLike){
        if (taskIdLike == null) {
            throw new RuntimeException("taskId is null");
        }
        this.taskIdLike = taskIdLike;
        return this;
    }

    public CellUpicInfoQuery taskIds(List<String> taskIds){
        if (taskIds == null) {
            throw new RuntimeException("taskIds is empty ");
        }
        this.taskIds = taskIds;
        return this;
    }


    public CellUpicInfoQuery pfileflag(Integer pfileflag){
	if (pfileflag == null) {
            throw new RuntimeException("pfileflag is null");
        }         
	this.pfileflag = pfileflag;
	return this;
    }

    public CellUpicInfoQuery pfileflagGreaterThanOrEqual(Integer pfileflagGreaterThanOrEqual){
	if (pfileflagGreaterThanOrEqual == null) {
	    throw new RuntimeException("pfileflag is null");
        }         
	this.pfileflagGreaterThanOrEqual = pfileflagGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery pfileflagLessThanOrEqual(Integer pfileflagLessThanOrEqual){
        if (pfileflagLessThanOrEqual == null) {
            throw new RuntimeException("pfileflag is null");
        }
        this.pfileflagLessThanOrEqual = pfileflagLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery pfileflags(List<Integer> pfileflags){
        if (pfileflags == null) {
            throw new RuntimeException("pfileflags is empty ");
        }
        this.pfileflags = pfileflags;
        return this;
    }


    public CellUpicInfoQuery filedotFileid(String filedotFileid){
	if (filedotFileid == null) {
	    throw new RuntimeException("filedotFileid is null");
        }         
	this.filedotFileid = filedotFileid;
	return this;
    }

    public CellUpicInfoQuery filedotFileidLike( String filedotFileidLike){
        if (filedotFileidLike == null) {
            throw new RuntimeException("filedotFileid is null");
        }
        this.filedotFileidLike = filedotFileidLike;
        return this;
    }

    public CellUpicInfoQuery filedotFileids(List<String> filedotFileids){
        if (filedotFileids == null) {
            throw new RuntimeException("filedotFileids is empty ");
        }
        this.filedotFileids = filedotFileids;
        return this;
    }


    public CellUpicInfoQuery listno(Integer listno){
	if (listno == null) {
            throw new RuntimeException("listno is null");
        }         
	this.listno = listno;
	return this;
    }

    public CellUpicInfoQuery listnoGreaterThanOrEqual(Integer listnoGreaterThanOrEqual){
	if (listnoGreaterThanOrEqual == null) {
	    throw new RuntimeException("listno is null");
        }         
	this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery listnoLessThanOrEqual(Integer listnoLessThanOrEqual){
        if (listnoLessThanOrEqual == null) {
            throw new RuntimeException("listno is null");
        }
        this.listnoLessThanOrEqual = listnoLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery listnos(List<Integer> listnos){
        if (listnos == null) {
            throw new RuntimeException("listnos is empty ");
        }
        this.listnos = listnos;
        return this;
    }


    public CellUpicInfoQuery chktotal(Integer chktotal){
	if (chktotal == null) {
            throw new RuntimeException("chktotal is null");
        }         
	this.chktotal = chktotal;
	return this;
    }

    public CellUpicInfoQuery chktotalGreaterThanOrEqual(Integer chktotalGreaterThanOrEqual){
	if (chktotalGreaterThanOrEqual == null) {
	    throw new RuntimeException("chktotal is null");
        }         
	this.chktotalGreaterThanOrEqual = chktotalGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery chktotalLessThanOrEqual(Integer chktotalLessThanOrEqual){
        if (chktotalLessThanOrEqual == null) {
            throw new RuntimeException("chktotal is null");
        }
        this.chktotalLessThanOrEqual = chktotalLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery chktotals(List<Integer> chktotals){
        if (chktotals == null) {
            throw new RuntimeException("chktotals is empty ");
        }
        this.chktotals = chktotals;
        return this;
    }


    public CellUpicInfoQuery chkresult(Integer chkresult){
	if (chkresult == null) {
            throw new RuntimeException("chkresult is null");
        }         
	this.chkresult = chkresult;
	return this;
    }

    public CellUpicInfoQuery chkresultGreaterThanOrEqual(Integer chkresultGreaterThanOrEqual){
	if (chkresultGreaterThanOrEqual == null) {
	    throw new RuntimeException("chkresult is null");
        }         
	this.chkresultGreaterThanOrEqual = chkresultGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery chkresultLessThanOrEqual(Integer chkresultLessThanOrEqual){
        if (chkresultLessThanOrEqual == null) {
            throw new RuntimeException("chkresult is null");
        }
        this.chkresultLessThanOrEqual = chkresultLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery chkresults(List<Integer> chkresults){
        if (chkresults == null) {
            throw new RuntimeException("chkresults is empty ");
        }
        this.chkresults = chkresults;
        return this;
    }


    public CellUpicInfoQuery pfileId(String pfileId){
	if (pfileId == null) {
	    throw new RuntimeException("pfileId is null");
        }         
	this.pfileId = pfileId;
	return this;
    }

    public CellUpicInfoQuery pfileIdLike( String pfileIdLike){
        if (pfileIdLike == null) {
            throw new RuntimeException("pfileId is null");
        }
        this.pfileIdLike = pfileIdLike;
        return this;
    }

    public CellUpicInfoQuery pfileIds(List<String> pfileIds){
        if (pfileIds == null) {
            throw new RuntimeException("pfileIds is empty ");
        }
        this.pfileIds = pfileIds;
        return this;
    }


    public CellUpicInfoQuery userid(String userid){
	if (userid == null) {
	    throw new RuntimeException("userid is null");
        }         
	this.userid = userid;
	return this;
    }

    public CellUpicInfoQuery useridLike( String useridLike){
        if (useridLike == null) {
            throw new RuntimeException("userid is null");
        }
        this.useridLike = useridLike;
        return this;
    }

    public CellUpicInfoQuery userids(List<String> userids){
        if (userids == null) {
            throw new RuntimeException("userids is empty ");
        }
        this.userids = userids;
        return this;
    }


    public CellUpicInfoQuery refillflag(Integer refillflag){
	if (refillflag == null) {
            throw new RuntimeException("refillflag is null");
        }         
	this.refillflag = refillflag;
	return this;
    }

    public CellUpicInfoQuery refillflagGreaterThanOrEqual(Integer refillflagGreaterThanOrEqual){
	if (refillflagGreaterThanOrEqual == null) {
	    throw new RuntimeException("refillflag is null");
        }         
	this.refillflagGreaterThanOrEqual = refillflagGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery refillflagLessThanOrEqual(Integer refillflagLessThanOrEqual){
        if (refillflagLessThanOrEqual == null) {
            throw new RuntimeException("refillflag is null");
        }
        this.refillflagLessThanOrEqual = refillflagLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery refillflags(List<Integer> refillflags){
        if (refillflags == null) {
            throw new RuntimeException("refillflags is empty ");
        }
        this.refillflags = refillflags;
        return this;
    }


    public CellUpicInfoQuery groupid(Integer groupid){
	if (groupid == null) {
            throw new RuntimeException("groupid is null");
        }         
	this.groupid = groupid;
	return this;
    }

    public CellUpicInfoQuery groupidGreaterThanOrEqual(Integer groupidGreaterThanOrEqual){
	if (groupidGreaterThanOrEqual == null) {
	    throw new RuntimeException("groupid is null");
        }         
	this.groupidGreaterThanOrEqual = groupidGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery groupidLessThanOrEqual(Integer groupidLessThanOrEqual){
        if (groupidLessThanOrEqual == null) {
            throw new RuntimeException("groupid is null");
        }
        this.groupidLessThanOrEqual = groupidLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery groupids(List<Integer> groupids){
        if (groupids == null) {
            throw new RuntimeException("groupids is empty ");
        }
        this.groupids = groupids;
        return this;
    }


    public CellUpicInfoQuery oldId(String oldId){
	if (oldId == null) {
	    throw new RuntimeException("oldId is null");
        }         
	this.oldId = oldId;
	return this;
    }

    public CellUpicInfoQuery oldIdLike( String oldIdLike){
        if (oldIdLike == null) {
            throw new RuntimeException("oldId is null");
        }
        this.oldIdLike = oldIdLike;
        return this;
    }

    public CellUpicInfoQuery oldIds(List<String> oldIds){
        if (oldIds == null) {
            throw new RuntimeException("oldIds is empty ");
        }
        this.oldIds = oldIds;
        return this;
    }


    public CellUpicInfoQuery roleId(Integer roleId){
	if (roleId == null) {
            throw new RuntimeException("roleId is null");
        }         
	this.roleId = roleId;
	return this;
    }

    public CellUpicInfoQuery roleIdGreaterThanOrEqual(Integer roleIdGreaterThanOrEqual){
	if (roleIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("roleId is null");
        }         
	this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery roleIdLessThanOrEqual(Integer roleIdLessThanOrEqual){
        if (roleIdLessThanOrEqual == null) {
            throw new RuntimeException("roleId is null");
        }
        this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery roleIds(List<Integer> roleIds){
        if (roleIds == null) {
            throw new RuntimeException("roleIds is empty ");
        }
        this.roleIds = roleIds;
        return this;
    }


    public CellUpicInfoQuery isfinish(Integer isfinish){
	if (isfinish == null) {
            throw new RuntimeException("isfinish is null");
        }         
	this.isfinish = isfinish;
	return this;
    }

    public CellUpicInfoQuery isfinishGreaterThanOrEqual(Integer isfinishGreaterThanOrEqual){
	if (isfinishGreaterThanOrEqual == null) {
	    throw new RuntimeException("isfinish is null");
        }         
	this.isfinishGreaterThanOrEqual = isfinishGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery isfinishLessThanOrEqual(Integer isfinishLessThanOrEqual){
        if (isfinishLessThanOrEqual == null) {
            throw new RuntimeException("isfinish is null");
        }
        this.isfinishLessThanOrEqual = isfinishLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery isfinishs(List<Integer> isfinishs){
        if (isfinishs == null) {
            throw new RuntimeException("isfinishs is empty ");
        }
        this.isfinishs = isfinishs;
        return this;
    }


    public CellUpicInfoQuery tagnum(String tagnum){
	if (tagnum == null) {
	    throw new RuntimeException("tagnum is null");
        }         
	this.tagnum = tagnum;
	return this;
    }

    public CellUpicInfoQuery tagnumLike( String tagnumLike){
        if (tagnumLike == null) {
            throw new RuntimeException("tagnum is null");
        }
        this.tagnumLike = tagnumLike;
        return this;
    }

    public CellUpicInfoQuery tagnums(List<String> tagnums){
        if (tagnums == null) {
            throw new RuntimeException("tagnums is empty ");
        }
        this.tagnums = tagnums;
        return this;
    }


    public CellUpicInfoQuery ctime(Date ctime){
	if (ctime == null) {
            throw new RuntimeException("ctime is null");
        }         
	this.ctime = ctime;
	return this;
    }

    public CellUpicInfoQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual){
	if (ctimeGreaterThanOrEqual == null) {
	    throw new RuntimeException("ctime is null");
        }         
	this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual){
        if (ctimeLessThanOrEqual == null) {
            throw new RuntimeException("ctime is null");
        }
        this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery ctimes(List<Date> ctimes){
        if (ctimes == null) {
            throw new RuntimeException("ctimes is empty ");
        }
        this.ctimes = ctimes;
        return this;
    }


    public CellUpicInfoQuery tname(String tname){
	if (tname == null) {
	    throw new RuntimeException("tname is null");
        }         
	this.tname = tname;
	return this;
    }

    public CellUpicInfoQuery tnameLike( String tnameLike){
        if (tnameLike == null) {
            throw new RuntimeException("tname is null");
        }
        this.tnameLike = tnameLike;
        return this;
    }

    public CellUpicInfoQuery tnames(List<String> tnames){
        if (tnames == null) {
            throw new RuntimeException("tnames is empty ");
        }
        this.tnames = tnames;
        return this;
    }


    public CellUpicInfoQuery page(Integer page){
	if (page == null) {
            throw new RuntimeException("page is null");
        }         
	this.page = page;
	return this;
    }

    public CellUpicInfoQuery pageGreaterThanOrEqual(Integer pageGreaterThanOrEqual){
	if (pageGreaterThanOrEqual == null) {
	    throw new RuntimeException("page is null");
        }         
	this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery pageLessThanOrEqual(Integer pageLessThanOrEqual){
        if (pageLessThanOrEqual == null) {
            throw new RuntimeException("page is null");
        }
        this.pageLessThanOrEqual = pageLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery pages(List<Integer> pages){
        if (pages == null) {
            throw new RuntimeException("pages is empty ");
        }
        this.pages = pages;
        return this;
    }


    public CellUpicInfoQuery duty(String duty){
	if (duty == null) {
	    throw new RuntimeException("duty is null");
        }         
	this.duty = duty;
	return this;
    }

    public CellUpicInfoQuery dutyLike( String dutyLike){
        if (dutyLike == null) {
            throw new RuntimeException("duty is null");
        }
        this.dutyLike = dutyLike;
        return this;
    }

    public CellUpicInfoQuery dutys(List<String> dutys){
        if (dutys == null) {
            throw new RuntimeException("dutys is empty ");
        }
        this.dutys = dutys;
        return this;
    }


    public CellUpicInfoQuery thematic(String thematic){
	if (thematic == null) {
	    throw new RuntimeException("thematic is null");
        }         
	this.thematic = thematic;
	return this;
    }

    public CellUpicInfoQuery thematicLike( String thematicLike){
        if (thematicLike == null) {
            throw new RuntimeException("thematic is null");
        }
        this.thematicLike = thematicLike;
        return this;
    }

    public CellUpicInfoQuery thematics(List<String> thematics){
        if (thematics == null) {
            throw new RuntimeException("thematics is empty ");
        }
        this.thematics = thematics;
        return this;
    }


    public CellUpicInfoQuery annotations(String annotations){
	if (annotations == null) {
	    throw new RuntimeException("annotations is null");
        }         
	this.annotations = annotations;
	return this;
    }

    public CellUpicInfoQuery annotationsLike( String annotationsLike){
        if (annotationsLike == null) {
            throw new RuntimeException("annotations is null");
        }
        this.annotationsLike = annotationsLike;
        return this;
    }

    public CellUpicInfoQuery annotationss(List<String> annotationss){
        if (annotationss == null) {
            throw new RuntimeException("annotationss is empty ");
        }
        this.annotationss = annotationss;
        return this;
    }


    public CellUpicInfoQuery typeIndexId(Integer typeIndexId){
	if (typeIndexId == null) {
            throw new RuntimeException("typeIndexId is null");
        }         
	this.typeIndexId = typeIndexId;
	return this;
    }

    public CellUpicInfoQuery typeIndexIdGreaterThanOrEqual(Integer typeIndexIdGreaterThanOrEqual){
	if (typeIndexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("typeIndexId is null");
        }         
	this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery typeIndexIdLessThanOrEqual(Integer typeIndexIdLessThanOrEqual){
        if (typeIndexIdLessThanOrEqual == null) {
            throw new RuntimeException("typeIndexId is null");
        }
        this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
        return this;
    }

    public CellUpicInfoQuery typeIndexIds(List<Integer> typeIndexIds){
        if (typeIndexIds == null) {
            throw new RuntimeException("typeIndexIds is empty ");
        }
        this.typeIndexIds = typeIndexIds;
        return this;
    }


    public CellUpicInfoQuery typeId(String typeId){
	if (typeId == null) {
	    throw new RuntimeException("typeId is null");
        }         
	this.typeId = typeId;
	return this;
    }

    public CellUpicInfoQuery typeIdLike( String typeIdLike){
        if (typeIdLike == null) {
            throw new RuntimeException("typeId is null");
        }
        this.typeIdLike = typeIdLike;
        return this;
    }

    public CellUpicInfoQuery typeIds(List<String> typeIds){
        if (typeIds == null) {
            throw new RuntimeException("typeIds is empty ");
        }
        this.typeIds = typeIds;
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
        addColumn("topid", "topid");
        addColumn("indexId", "index_id");
        addColumn("taskId", "task_id");
        addColumn("pfileflag", "pfileflag");
        addColumn("filedotFileid", "filedot_fileid");
        addColumn("listno", "listno");
        addColumn("chktotal", "chktotal");
        addColumn("chkresult", "chkresult");
        addColumn("pfileId", "pfile_id");
        addColumn("userid", "userid");
        addColumn("refillflag", "refillflag");
        addColumn("groupid", "groupid");
        addColumn("oldId", "old_id");
        addColumn("roleId", "role_id");
        addColumn("isfinish", "isfinish");
        addColumn("tagnum", "tagnum");
        addColumn("ctime", "ctime");
        addColumn("tname", "tname");
        addColumn("page", "page");
        addColumn("duty", "duty");
        addColumn("thematic", "thematic");
        addColumn("annotations", "annotations");
        addColumn("typeIndexId", "type_index_id");
        addColumn("typeId", "type_id");
    }

}