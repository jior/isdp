package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class PfileAttQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Long listId;
	protected Long listIdGreaterThanOrEqual;
	protected Long listIdLessThanOrEqual;
	protected List<Long> listIds;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String tname;
	protected String tnameLike;
	protected List<String> tnames;
	protected String duty;
	protected String dutyLike;
	protected List<String> dutys;
	protected String tagnum;
	protected String tagnumLike;
	protected List<String> tagnums;
	protected Date ctime;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected List<Date> ctimes;
	protected String pageno;
	protected String pagenoLike;
	protected List<String> pagenos;
	protected Integer page;
	protected Integer pageGreaterThanOrEqual;
	protected Integer pageLessThanOrEqual;
	protected List<Integer> pages;
	protected String filetype;
	protected String filetypeLike;
	protected List<String> filetypes;
	protected String savetime;
	protected String savetimeLike;
	protected List<String> savetimes;
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
	protected String pagetype;
	protected String pagetypeLike;
	protected List<String> pagetypes;
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
	

	public PfileAttQuery() {

	}

	public PfileAttQuery annotations(String annotations) {
		if (annotations == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotations = annotations;
		return this;
	}

	public PfileAttQuery annotationsLike(String annotationsLike) {
		if (annotationsLike == null) {
			throw new RuntimeException("annotations is null");
		}
		this.annotationsLike = annotationsLike;
		return this;
	}

	public PfileAttQuery annotationss(List<String> annotationss) {
		if (annotationss == null) {
			throw new RuntimeException("annotationss is empty ");
		}
		this.annotationss = annotationss;
		return this;
	}

	public PfileAttQuery carriertype(String carriertype) {
		if (carriertype == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertype = carriertype;
		return this;
	}

	public PfileAttQuery carriertypeLike(String carriertypeLike) {
		if (carriertypeLike == null) {
			throw new RuntimeException("carriertype is null");
		}
		this.carriertypeLike = carriertypeLike;
		return this;
	}

	public PfileAttQuery carriertypes(List<String> carriertypes) {
		if (carriertypes == null) {
			throw new RuntimeException("carriertypes is empty ");
		}
		this.carriertypes = carriertypes;
		return this;
	}

	public PfileAttQuery carrieru(String carrieru) {
		if (carrieru == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieru = carrieru;
		return this;
	}

	public PfileAttQuery carrieruLike(String carrieruLike) {
		if (carrieruLike == null) {
			throw new RuntimeException("carrieru is null");
		}
		this.carrieruLike = carrieruLike;
		return this;
	}

	public PfileAttQuery carrierus(List<String> carrierus) {
		if (carrierus == null) {
			throw new RuntimeException("carrierus is empty ");
		}
		this.carrierus = carrierus;
		return this;
	}

	public PfileAttQuery clistno(Integer clistno) {
		if (clistno == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistno = clistno;
		return this;
	}

	public PfileAttQuery clistnoGreaterThanOrEqual(
			Integer clistnoGreaterThanOrEqual) {
		if (clistnoGreaterThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoGreaterThanOrEqual = clistnoGreaterThanOrEqual;
		return this;
	}

	public PfileAttQuery clistnoLessThanOrEqual(Integer clistnoLessThanOrEqual) {
		if (clistnoLessThanOrEqual == null) {
			throw new RuntimeException("clistno is null");
		}
		this.clistnoLessThanOrEqual = clistnoLessThanOrEqual;
		return this;
	}

	public PfileAttQuery clistnos(List<Integer> clistnos) {
		if (clistnos == null) {
			throw new RuntimeException("clistnos is empty ");
		}
		this.clistnos = clistnos;
		return this;
	}

	public PfileAttQuery cpageno(String cpageno) {
		if (cpageno == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpageno = cpageno;
		return this;
	}

	public PfileAttQuery cpagenoLike(String cpagenoLike) {
		if (cpagenoLike == null) {
			throw new RuntimeException("cpageno is null");
		}
		this.cpagenoLike = cpagenoLike;
		return this;
	}

	public PfileAttQuery cpagenos(List<String> cpagenos) {
		if (cpagenos == null) {
			throw new RuntimeException("cpagenos is empty ");
		}
		this.cpagenos = cpagenos;
		return this;
	}

	public PfileAttQuery ctime(Date ctime) {
		if (ctime == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctime = ctime;
		return this;
	}

	public PfileAttQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public PfileAttQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public PfileAttQuery ctimes(List<Date> ctimes) {
		if (ctimes == null) {
			throw new RuntimeException("ctimes is empty ");
		}
		this.ctimes = ctimes;
		return this;
	}

	public PfileAttQuery cvnum(String cvnum) {
		if (cvnum == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnum = cvnum;
		return this;
	}

	public PfileAttQuery cvnumLike(String cvnumLike) {
		if (cvnumLike == null) {
			throw new RuntimeException("cvnum is null");
		}
		this.cvnumLike = cvnumLike;
		return this;
	}

	public PfileAttQuery cvnums(List<String> cvnums) {
		if (cvnums == null) {
			throw new RuntimeException("cvnums is empty ");
		}
		this.cvnums = cvnums;
		return this;
	}

	public PfileAttQuery duty(String duty) {
		if (duty == null) {
			throw new RuntimeException("duty is null");
		}
		this.duty = duty;
		return this;
	}

	public PfileAttQuery dutyLike(String dutyLike) {
		if (dutyLike == null) {
			throw new RuntimeException("duty is null");
		}
		this.dutyLike = dutyLike;
		return this;
	}

	public PfileAttQuery dutys(List<String> dutys) {
		if (dutys == null) {
			throw new RuntimeException("dutys is empty ");
		}
		this.dutys = dutys;
		return this;
	}

	public PfileAttQuery filetype(String filetype) {
		if (filetype == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetype = filetype;
		return this;
	}

	public PfileAttQuery filetypeLike(String filetypeLike) {
		if (filetypeLike == null) {
			throw new RuntimeException("filetype is null");
		}
		this.filetypeLike = filetypeLike;
		return this;
	}

	public PfileAttQuery filetypes(List<String> filetypes) {
		if (filetypes == null) {
			throw new RuntimeException("filetypes is empty ");
		}
		this.filetypes = filetypes;
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

	public String getTopid() {
		return topid;
	}

	public String getTopidLike() {
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

	public List<String> getTopids() {
		return topids;
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

	public PfileAttQuery glidenum(String glidenum) {
		if (glidenum == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenum = glidenum;
		return this;
	}

	public PfileAttQuery glidenumLike(String glidenumLike) {
		if (glidenumLike == null) {
			throw new RuntimeException("glidenum is null");
		}
		this.glidenumLike = glidenumLike;
		return this;
	}

	public PfileAttQuery glidenums(List<String> glidenums) {
		if (glidenums == null) {
			throw new RuntimeException("glidenums is empty ");
		}
		this.glidenums = glidenums;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("listId", "list_id");
		addColumn("topid", "topid");
		addColumn("tname", "tname");
		addColumn("duty", "duty");
		addColumn("tagnum", "tagnum");
		addColumn("ctime", "ctime");
		addColumn("pageno", "pageno");
		addColumn("page", "page");
		addColumn("filetype", "filetype");
		addColumn("savetime", "savetime");
		addColumn("annotations", "annotations");
		addColumn("carriertype", "carriertype");
		addColumn("summary", "summary");
		addColumn("ptext", "ptext");
		addColumn("carrieru", "carrieru");
		addColumn("glidenum", "glidenum");
		addColumn("pagetype", "pagetype");
		addColumn("clistno", "clistno");
		addColumn("cpageno", "cpageno");
		addColumn("vnum", "vnum");
		addColumn("cvnum", "cvnum");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public PfileAttQuery listId(Long listId) {
		if (listId == null) {
			throw new RuntimeException("listId is null");
		}
		this.listId = listId;
		return this;
	}

	public PfileAttQuery listIdGreaterThanOrEqual(Long listIdGreaterThanOrEqual) {
		if (listIdGreaterThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdGreaterThanOrEqual = listIdGreaterThanOrEqual;
		return this;
	}

	public PfileAttQuery listIdLessThanOrEqual(Long listIdLessThanOrEqual) {
		if (listIdLessThanOrEqual == null) {
			throw new RuntimeException("listId is null");
		}
		this.listIdLessThanOrEqual = listIdLessThanOrEqual;
		return this;
	}

	public PfileAttQuery listIds(List<Long> listIds) {
		if (listIds == null) {
			throw new RuntimeException("listIds is empty ");
		}
		this.listIds = listIds;
		return this;
	}

	public PfileAttQuery page(Integer page) {
		if (page == null) {
			throw new RuntimeException("page is null");
		}
		this.page = page;
		return this;
	}

	public PfileAttQuery pageGreaterThanOrEqual(Integer pageGreaterThanOrEqual) {
		if (pageGreaterThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageGreaterThanOrEqual = pageGreaterThanOrEqual;
		return this;
	}

	public PfileAttQuery pageLessThanOrEqual(Integer pageLessThanOrEqual) {
		if (pageLessThanOrEqual == null) {
			throw new RuntimeException("page is null");
		}
		this.pageLessThanOrEqual = pageLessThanOrEqual;
		return this;
	}

	public PfileAttQuery pageno(String pageno) {
		if (pageno == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pageno = pageno;
		return this;
	}

	public PfileAttQuery pagenoLike(String pagenoLike) {
		if (pagenoLike == null) {
			throw new RuntimeException("pageno is null");
		}
		this.pagenoLike = pagenoLike;
		return this;
	}

	public PfileAttQuery pagenos(List<String> pagenos) {
		if (pagenos == null) {
			throw new RuntimeException("pagenos is empty ");
		}
		this.pagenos = pagenos;
		return this;
	}

	public PfileAttQuery pages(List<Integer> pages) {
		if (pages == null) {
			throw new RuntimeException("pages is empty ");
		}
		this.pages = pages;
		return this;
	}

	public PfileAttQuery pagetype(String pagetype) {
		if (pagetype == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetype = pagetype;
		return this;
	}

	public PfileAttQuery pagetypeLike(String pagetypeLike) {
		if (pagetypeLike == null) {
			throw new RuntimeException("pagetype is null");
		}
		this.pagetypeLike = pagetypeLike;
		return this;
	}

	public PfileAttQuery pagetypes(List<String> pagetypes) {
		if (pagetypes == null) {
			throw new RuntimeException("pagetypes is empty ");
		}
		this.pagetypes = pagetypes;
		return this;
	}

	public PfileAttQuery ptext(String ptext) {
		if (ptext == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptext = ptext;
		return this;
	}

	public PfileAttQuery ptextLike(String ptextLike) {
		if (ptextLike == null) {
			throw new RuntimeException("ptext is null");
		}
		this.ptextLike = ptextLike;
		return this;
	}

	public PfileAttQuery ptexts(List<String> ptexts) {
		if (ptexts == null) {
			throw new RuntimeException("ptexts is empty ");
		}
		this.ptexts = ptexts;
		return this;
	}

	public PfileAttQuery savetime(String savetime) {
		if (savetime == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetime = savetime;
		return this;
	}

	public PfileAttQuery savetimeLike(String savetimeLike) {
		if (savetimeLike == null) {
			throw new RuntimeException("savetime is null");
		}
		this.savetimeLike = savetimeLike;
		return this;
	}

	public PfileAttQuery savetimes(List<String> savetimes) {
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

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public void setDutyLike(String dutyLike) {
		this.dutyLike = dutyLike;
	}

	public void setDutys(List<String> dutys) {
		this.dutys = dutys;
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

	public void setGlidenum(String glidenum) {
		this.glidenum = glidenum;
	}

	public void setGlidenumLike(String glidenumLike) {
		this.glidenumLike = glidenumLike;
	}

	public void setGlidenums(List<String> glidenums) {
		this.glidenums = glidenums;
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

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public void setPtextLike(String ptextLike) {
		this.ptextLike = ptextLike;
	}

	public void setPtexts(List<String> ptexts) {
		this.ptexts = ptexts;
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

	public void setTname(String tname) {
		this.tname = tname;
	}

	public void setTnameLike(String tnameLike) {
		this.tnameLike = tnameLike;
	}

	public void setTnames(List<String> tnames) {
		this.tnames = tnames;
	}

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopidLike(String topidLike) {
		this.topidLike = topidLike;
	}

	public void setTopids(List<String> topids) {
		this.topids = topids;
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

	public PfileAttQuery summary(String summary) {
		if (summary == null) {
			throw new RuntimeException("summary is null");
		}
		this.summary = summary;
		return this;
	}

	public PfileAttQuery summaryLike(String summaryLike) {
		if (summaryLike == null) {
			throw new RuntimeException("summary is null");
		}
		this.summaryLike = summaryLike;
		return this;
	}

	public PfileAttQuery summarys(List<String> summarys) {
		if (summarys == null) {
			throw new RuntimeException("summarys is empty ");
		}
		this.summarys = summarys;
		return this;
	}

	public PfileAttQuery tagnum(String tagnum) {
		if (tagnum == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnum = tagnum;
		return this;
	}

	public PfileAttQuery tagnumLike(String tagnumLike) {
		if (tagnumLike == null) {
			throw new RuntimeException("tagnum is null");
		}
		this.tagnumLike = tagnumLike;
		return this;
	}

	public PfileAttQuery tagnums(List<String> tagnums) {
		if (tagnums == null) {
			throw new RuntimeException("tagnums is empty ");
		}
		this.tagnums = tagnums;
		return this;
	}

	public PfileAttQuery tname(String tname) {
		if (tname == null) {
			throw new RuntimeException("tname is null");
		}
		this.tname = tname;
		return this;
	}

	public PfileAttQuery tnameLike(String tnameLike) {
		if (tnameLike == null) {
			throw new RuntimeException("tname is null");
		}
		this.tnameLike = tnameLike;
		return this;
	}

	public PfileAttQuery tnames(List<String> tnames) {
		if (tnames == null) {
			throw new RuntimeException("tnames is empty ");
		}
		this.tnames = tnames;
		return this;
	}

	public PfileAttQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public PfileAttQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public PfileAttQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public PfileAttQuery vnum(String vnum) {
		if (vnum == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnum = vnum;
		return this;
	}

	public PfileAttQuery vnumLike(String vnumLike) {
		if (vnumLike == null) {
			throw new RuntimeException("vnum is null");
		}
		this.vnumLike = vnumLike;
		return this;
	}

	public PfileAttQuery vnums(List<String> vnums) {
		if (vnums == null) {
			throw new RuntimeException("vnums is empty ");
		}
		this.vnums = vnums;
		return this;
	}

}