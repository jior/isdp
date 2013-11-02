package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FiledotQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected List<Integer> indexIds;
	protected String fbelong;
	protected String fbelongLike;
	protected List<String> fbelongs;
	protected String fnum;
	protected String fnumLike;
	protected List<String> fnums;
	protected String pbelong;
	protected String pbelongLike;
	protected List<String> pbelongs;
	protected String numLike;
	protected String fnameLike;
	protected String dotnameLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Date dtimeGreaterThanOrEqual;
	protected Date dtimeLessThanOrEqual;
	protected String fileNameLike;
	protected Integer dwid;
	protected List<Integer> dwids;
	protected Integer fbid;
	protected List<Integer> fbids;
	protected Integer fxid;
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
	protected String cmanLike;
	protected String contentLike;
	protected String listflag;
	protected String listflagLike;
	protected List<String> listflags;
	protected String isink;
	protected String isinkLike;
	protected List<String> isinks;
	protected Integer dottype;
	protected List<Integer> dottypes;
	protected String ctimedname;
	protected String ctimednameLike;
	protected List<String> ctimednames;
	protected Integer type;
	protected List<Integer> types;
	protected Integer utreeIndex;
	protected List<Integer> utreeIndexs;
	protected String isquan;
	protected String isquanLike;
	protected List<String> isquans;
	protected Integer intsysform;
	protected List<Integer> intsysforms;
	

	public FiledotQuery() {

	}

	public FiledotQuery cmanLike(String cmanLike) {
		if (cmanLike == null) {
			throw new RuntimeException("cman is null");
		}
		this.cmanLike = cmanLike;
		return this;
	}

	public FiledotQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public FiledotQuery ctimedname(String ctimedname) {
		if (ctimedname == null) {
			throw new RuntimeException("ctimedname is null");
		}
		this.ctimedname = ctimedname;
		return this;
	}

	public FiledotQuery ctimednameLike(String ctimednameLike) {
		if (ctimednameLike == null) {
			throw new RuntimeException("ctimedname is null");
		}
		this.ctimednameLike = ctimednameLike;
		return this;
	}

	public FiledotQuery ctimednames(List<String> ctimednames) {
		if (ctimednames == null) {
			throw new RuntimeException("ctimednames is empty ");
		}
		this.ctimednames = ctimednames;
		return this;
	}

	public FiledotQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public FiledotQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public FiledotQuery dotnameLike(String dotnameLike) {
		if (dotnameLike == null) {
			throw new RuntimeException("dotname is null");
		}
		this.dotnameLike = dotnameLike;
		return this;
	}

	public FiledotQuery dottype(Integer dottype) {
		if (dottype == null) {
			throw new RuntimeException("dottype is null");
		}
		this.dottype = dottype;
		return this;
	}

	public FiledotQuery dottypes(List<Integer> dottypes) {
		if (dottypes == null) {
			throw new RuntimeException("dottypes is empty ");
		}
		this.dottypes = dottypes;
		return this;
	}

	public FiledotQuery dtimeGreaterThanOrEqual(Date dtimeGreaterThanOrEqual) {
		if (dtimeGreaterThanOrEqual == null) {
			throw new RuntimeException("dtime is null");
		}
		this.dtimeGreaterThanOrEqual = dtimeGreaterThanOrEqual;
		return this;
	}

	public FiledotQuery dtimeLessThanOrEqual(Date dtimeLessThanOrEqual) {
		if (dtimeLessThanOrEqual == null) {
			throw new RuntimeException("dtime is null");
		}
		this.dtimeLessThanOrEqual = dtimeLessThanOrEqual;
		return this;
	}

	public FiledotQuery dwid(Integer dwid) {
		if (dwid == null) {
			throw new RuntimeException("dwid is null");
		}
		this.dwid = dwid;
		return this;
	}

	public FiledotQuery dwids(List<Integer> dwids) {
		if (dwids == null) {
			throw new RuntimeException("dwids is empty ");
		}
		this.dwids = dwids;
		return this;
	}

	public FiledotQuery fbelong(String fbelong) {
		if (fbelong == null) {
			throw new RuntimeException("fbelong is null");
		}
		this.fbelong = fbelong;
		return this;
	}

	public FiledotQuery fbelongLike(String fbelongLike) {
		if (fbelongLike == null) {
			throw new RuntimeException("fbelong is null");
		}
		this.fbelongLike = fbelongLike;
		return this;
	}

	public FiledotQuery fbelongs(List<String> fbelongs) {
		if (fbelongs == null) {
			throw new RuntimeException("fbelongs is empty ");
		}
		this.fbelongs = fbelongs;
		return this;
	}

	public FiledotQuery fbid(Integer fbid) {
		if (fbid == null) {
			throw new RuntimeException("fbid is null");
		}
		this.fbid = fbid;
		return this;
	}

	public FiledotQuery fbids(List<Integer> fbids) {
		if (fbids == null) {
			throw new RuntimeException("fbids is empty ");
		}
		this.fbids = fbids;
		return this;
	}

	public FiledotQuery fileNameLike(String fileNameLike) {
		if (fileNameLike == null) {
			throw new RuntimeException("fileName is null");
		}
		this.fileNameLike = fileNameLike;
		return this;
	}

	public FiledotQuery flid(String flid) {
		if (flid == null) {
			throw new RuntimeException("flid is null");
		}
		this.flid = flid;
		return this;
	}

	public FiledotQuery flidLike(String flidLike) {
		if (flidLike == null) {
			throw new RuntimeException("flid is null");
		}
		this.flidLike = flidLike;
		return this;
	}

	public FiledotQuery flids(List<String> flids) {
		if (flids == null) {
			throw new RuntimeException("flids is empty ");
		}
		this.flids = flids;
		return this;
	}

	public FiledotQuery fnameLike(String fnameLike) {
		if (fnameLike == null) {
			throw new RuntimeException("fname is null");
		}
		this.fnameLike = fnameLike;
		return this;
	}

	public FiledotQuery fnum(String fnum) {
		if (fnum == null) {
			throw new RuntimeException("fnum is null");
		}
		this.fnum = fnum;
		return this;
	}

	public FiledotQuery fnumLike(String fnumLike) {
		if (fnumLike == null) {
			throw new RuntimeException("fnum is null");
		}
		this.fnumLike = fnumLike;
		return this;
	}

	public FiledotQuery fnums(List<String> fnums) {
		if (fnums == null) {
			throw new RuntimeException("fnums is empty ");
		}
		this.fnums = fnums;
		return this;
	}

	public FiledotQuery fxid(Integer fxid) {
		if (fxid == null) {
			throw new RuntimeException("fxid is null");
		}
		this.fxid = fxid;
		return this;
	}

	public FiledotQuery fxids(List<Integer> fxids) {
		if (fxids == null) {
			throw new RuntimeException("fxids is empty ");
		}
		this.fxids = fxids;
		return this;
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

	public String getCtimedname() {
		return ctimedname;
	}

	public String getCtimednameLike() {
		if (ctimednameLike != null && ctimednameLike.trim().length() > 0) {
			if (!ctimednameLike.startsWith("%")) {
				ctimednameLike = "%" + ctimednameLike;
			}
			if (!ctimednameLike.endsWith("%")) {
				ctimednameLike = ctimednameLike + "%";
			}
		}
		return ctimednameLike;
	}

	public List<String> getCtimednames() {
		return ctimednames;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public String getDotnameLike() {
		if (dotnameLike != null && dotnameLike.trim().length() > 0) {
			if (!dotnameLike.startsWith("%")) {
				dotnameLike = "%" + dotnameLike;
			}
			if (!dotnameLike.endsWith("%")) {
				dotnameLike = dotnameLike + "%";
			}
		}
		return dotnameLike;
	}

	public Integer getDottype() {
		return dottype;
	}

	public List<Integer> getDottypes() {
		return dottypes;
	}

	public Date getDtimeGreaterThanOrEqual() {
		return dtimeGreaterThanOrEqual;
	}

	public Date getDtimeLessThanOrEqual() {
		return dtimeLessThanOrEqual;
	}

	public Integer getDwid() {
		return dwid;
	}

	public List<Integer> getDwids() {
		return dwids;
	}

	public String getFbelong() {
		return fbelong;
	}

	public String getFbelongLike() {
		if (fbelongLike != null && fbelongLike.trim().length() > 0) {
			if (!fbelongLike.startsWith("%")) {
				fbelongLike = "%" + fbelongLike;
			}
			if (!fbelongLike.endsWith("%")) {
				fbelongLike = fbelongLike + "%";
			}
		}
		return fbelongLike;
	}

	public List<String> getFbelongs() {
		return fbelongs;
	}

	public Integer getFbid() {
		return fbid;
	}

	public List<Integer> getFbids() {
		return fbids;
	}

	public String getFileNameLike() {
		if (fileNameLike != null && fileNameLike.trim().length() > 0) {
			if (!fileNameLike.startsWith("%")) {
				fileNameLike = "%" + fileNameLike;
			}
			if (!fileNameLike.endsWith("%")) {
				fileNameLike = fileNameLike + "%";
			}
		}
		return fileNameLike;
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

	public String getFnameLike() {
		if (fnameLike != null && fnameLike.trim().length() > 0) {
			if (!fnameLike.startsWith("%")) {
				fnameLike = "%" + fnameLike;
			}
			if (!fnameLike.endsWith("%")) {
				fnameLike = fnameLike + "%";
			}
		}
		return fnameLike;
	}

	public String getFnum() {
		return fnum;
	}

	public String getFnumLike() {
		if (fnumLike != null && fnumLike.trim().length() > 0) {
			if (!fnumLike.startsWith("%")) {
				fnumLike = "%" + fnumLike;
			}
			if (!fnumLike.endsWith("%")) {
				fnumLike = fnumLike + "%";
			}
		}
		return fnumLike;
	}

	public List<String> getFnums() {
		return fnums;
	}

	public Integer getFxid() {
		return fxid;
	}

	public List<Integer> getFxids() {
		return fxids;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public Integer getIntsysform() {
		return intsysform;
	}

	public List<Integer> getIntsysforms() {
		return intsysforms;
	}

	public String getIsink() {
		return isink;
	}

	public String getIsinkLike() {
		if (isinkLike != null && isinkLike.trim().length() > 0) {
			if (!isinkLike.startsWith("%")) {
				isinkLike = "%" + isinkLike;
			}
			if (!isinkLike.endsWith("%")) {
				isinkLike = isinkLike + "%";
			}
		}
		return isinkLike;
	}

	public List<String> getIsinks() {
		return isinks;
	}

	public String getIsquan() {
		return isquan;
	}

	public String getIsquanLike() {
		if (isquanLike != null && isquanLike.trim().length() > 0) {
			if (!isquanLike.startsWith("%")) {
				isquanLike = "%" + isquanLike;
			}
			if (!isquanLike.endsWith("%")) {
				isquanLike = isquanLike + "%";
			}
		}
		return isquanLike;
	}

	public List<String> getIsquans() {
		return isquans;
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

	public String getListflag() {
		return listflag;
	}

	public String getListflagLike() {
		if (listflagLike != null && listflagLike.trim().length() > 0) {
			if (!listflagLike.startsWith("%")) {
				listflagLike = "%" + listflagLike;
			}
			if (!listflagLike.endsWith("%")) {
				listflagLike = listflagLike + "%";
			}
		}
		return listflagLike;
	}

	public List<String> getListflags() {
		return listflags;
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

	public String getPbelong() {
		return pbelong;
	}

	public String getPbelongLike() {
		if (pbelongLike != null && pbelongLike.trim().length() > 0) {
			if (!pbelongLike.startsWith("%")) {
				pbelongLike = "%" + pbelongLike;
			}
			if (!pbelongLike.endsWith("%")) {
				pbelongLike = pbelongLike + "%";
			}
		}
		return pbelongLike;
	}

	public List<String> getPbelongs() {
		return pbelongs;
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

	public Integer getType() {
		return type;
	}

	public List<Integer> getTypes() {
		return types;
	}

	public Integer getUtreeIndex() {
		return utreeIndex;
	}

	public List<Integer> getUtreeIndexs() {
		return utreeIndexs;
	}

	public FiledotQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public FiledotQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("fileID", "fileID");
		addColumn("indexId", "index_id");
		addColumn("fbelong", "fbelong");
		addColumn("fnum", "fnum");
		addColumn("pbelong", "pbelong");
		addColumn("num", "num");
		addColumn("fname", "fname");
		addColumn("dotname", "dotname");
		addColumn("ctime", "Ctime");
		addColumn("dtime", "dtime");
		addColumn("fileName", "file_name");
		addColumn("filesize", "filesize");
		addColumn("dwid", "dwid");
		addColumn("fbid", "fbid");
		addColumn("fxid", "fxid");
		addColumn("jid", "jid");
		addColumn("flid", "flid");
		addColumn("topnode", "topnode");
		addColumn("cman", "cman");
		addColumn("content", "content");
		addColumn("listflag", "listflag");
		addColumn("tofile", "tofile");
		addColumn("isink", "isink");
		addColumn("dottype", "dottype");
		addColumn("ctimedname", "ctimedname");
		addColumn("type", "type");
		addColumn("listno", "listno");
		addColumn("utreeIndex", "utree_index");
		addColumn("isquan", "isquan");
		addColumn("intsysform", "intsysform");
	}

	public FiledotQuery intsysform(Integer intsysform) {
		if (intsysform == null) {
			throw new RuntimeException("intsysform is null");
		}
		this.intsysform = intsysform;
		return this;
	}

	public FiledotQuery intsysforms(List<Integer> intsysforms) {
		if (intsysforms == null) {
			throw new RuntimeException("intsysforms is empty ");
		}
		this.intsysforms = intsysforms;
		return this;
	}

	public FiledotQuery isink(String isink) {
		if (isink == null) {
			throw new RuntimeException("isink is null");
		}
		this.isink = isink;
		return this;
	}

	public FiledotQuery isinkLike(String isinkLike) {
		if (isinkLike == null) {
			throw new RuntimeException("isink is null");
		}
		this.isinkLike = isinkLike;
		return this;
	}

	public FiledotQuery isinks(List<String> isinks) {
		if (isinks == null) {
			throw new RuntimeException("isinks is empty ");
		}
		this.isinks = isinks;
		return this;
	}

	public FiledotQuery isquan(String isquan) {
		if (isquan == null) {
			throw new RuntimeException("isquan is null");
		}
		this.isquan = isquan;
		return this;
	}

	public FiledotQuery isquanLike(String isquanLike) {
		if (isquanLike == null) {
			throw new RuntimeException("isquan is null");
		}
		this.isquanLike = isquanLike;
		return this;
	}

	public FiledotQuery isquans(List<String> isquans) {
		if (isquans == null) {
			throw new RuntimeException("isquans is empty ");
		}
		this.isquans = isquans;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FiledotQuery jid(String jid) {
		if (jid == null) {
			throw new RuntimeException("jid is null");
		}
		this.jid = jid;
		return this;
	}

	public FiledotQuery jidLike(String jidLike) {
		if (jidLike == null) {
			throw new RuntimeException("jid is null");
		}
		this.jidLike = jidLike;
		return this;
	}

	public FiledotQuery jids(List<String> jids) {
		if (jids == null) {
			throw new RuntimeException("jids is empty ");
		}
		this.jids = jids;
		return this;
	}

	public FiledotQuery listflag(String listflag) {
		if (listflag == null) {
			throw new RuntimeException("listflag is null");
		}
		this.listflag = listflag;
		return this;
	}

	public FiledotQuery listflagLike(String listflagLike) {
		if (listflagLike == null) {
			throw new RuntimeException("listflag is null");
		}
		this.listflagLike = listflagLike;
		return this;
	}

	public FiledotQuery listflags(List<String> listflags) {
		if (listflags == null) {
			throw new RuntimeException("listflags is empty ");
		}
		this.listflags = listflags;
		return this;
	}

	public FiledotQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public FiledotQuery pbelong(String pbelong) {
		if (pbelong == null) {
			throw new RuntimeException("pbelong is null");
		}
		this.pbelong = pbelong;
		return this;
	}

	public FiledotQuery pbelongLike(String pbelongLike) {
		if (pbelongLike == null) {
			throw new RuntimeException("pbelong is null");
		}
		this.pbelongLike = pbelongLike;
		return this;
	}

	public FiledotQuery pbelongs(List<String> pbelongs) {
		if (pbelongs == null) {
			throw new RuntimeException("pbelongs is empty ");
		}
		this.pbelongs = pbelongs;
		return this;
	}

	public void setCmanLike(String cmanLike) {
		this.cmanLike = cmanLike;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setCtimedname(String ctimedname) {
		this.ctimedname = ctimedname;
	}

	public void setCtimednameLike(String ctimednameLike) {
		this.ctimednameLike = ctimednameLike;
	}

	public void setCtimednames(List<String> ctimednames) {
		this.ctimednames = ctimednames;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setDotnameLike(String dotnameLike) {
		this.dotnameLike = dotnameLike;
	}

	public void setDottype(Integer dottype) {
		this.dottype = dottype;
	}

	public void setDottypes(List<Integer> dottypes) {
		this.dottypes = dottypes;
	}

	public void setDtimeGreaterThanOrEqual(Date dtimeGreaterThanOrEqual) {
		this.dtimeGreaterThanOrEqual = dtimeGreaterThanOrEqual;
	}

	public void setDtimeLessThanOrEqual(Date dtimeLessThanOrEqual) {
		this.dtimeLessThanOrEqual = dtimeLessThanOrEqual;
	}

	public void setDwid(Integer dwid) {
		this.dwid = dwid;
	}

	public void setDwids(List<Integer> dwids) {
		this.dwids = dwids;
	}

	public void setFbelong(String fbelong) {
		this.fbelong = fbelong;
	}

	public void setFbelongLike(String fbelongLike) {
		this.fbelongLike = fbelongLike;
	}

	public void setFbelongs(List<String> fbelongs) {
		this.fbelongs = fbelongs;
	}

	public void setFbid(Integer fbid) {
		this.fbid = fbid;
	}

	public void setFbids(List<Integer> fbids) {
		this.fbids = fbids;
	}

	public void setFileNameLike(String fileNameLike) {
		this.fileNameLike = fileNameLike;
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

	public void setFnameLike(String fnameLike) {
		this.fnameLike = fnameLike;
	}

	public void setFnum(String fnum) {
		this.fnum = fnum;
	}

	public void setFnumLike(String fnumLike) {
		this.fnumLike = fnumLike;
	}

	public void setFnums(List<String> fnums) {
		this.fnums = fnums;
	}

	public void setFxid(Integer fxid) {
		this.fxid = fxid;
	}

	public void setFxids(List<Integer> fxids) {
		this.fxids = fxids;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setIntsysform(Integer intsysform) {
		this.intsysform = intsysform;
	}

	public void setIntsysforms(List<Integer> intsysforms) {
		this.intsysforms = intsysforms;
	}

	public void setIsink(String isink) {
		this.isink = isink;
	}

	public void setIsinkLike(String isinkLike) {
		this.isinkLike = isinkLike;
	}

	public void setIsinks(List<String> isinks) {
		this.isinks = isinks;
	}

	public void setIsquan(String isquan) {
		this.isquan = isquan;
	}

	public void setIsquanLike(String isquanLike) {
		this.isquanLike = isquanLike;
	}

	public void setIsquans(List<String> isquans) {
		this.isquans = isquans;
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

	public void setListflag(String listflag) {
		this.listflag = listflag;
	}

	public void setListflagLike(String listflagLike) {
		this.listflagLike = listflagLike;
	}

	public void setListflags(List<String> listflags) {
		this.listflags = listflags;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setPbelong(String pbelong) {
		this.pbelong = pbelong;
	}

	public void setPbelongLike(String pbelongLike) {
		this.pbelongLike = pbelongLike;
	}

	public void setPbelongs(List<String> pbelongs) {
		this.pbelongs = pbelongs;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	public void setType(Integer type) {
		this.type = type;
	}

	public void setTypes(List<Integer> types) {
		this.types = types;
	}

	public void setUtreeIndex(Integer utreeIndex) {
		this.utreeIndex = utreeIndex;
	}

	public void setUtreeIndexs(List<Integer> utreeIndexs) {
		this.utreeIndexs = utreeIndexs;
	}

	public FiledotQuery topnode(String topnode) {
		if (topnode == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnode = topnode;
		return this;
	}

	public FiledotQuery topnodeLike(String topnodeLike) {
		if (topnodeLike == null) {
			throw new RuntimeException("topnode is null");
		}
		this.topnodeLike = topnodeLike;
		return this;
	}

	public FiledotQuery topnodes(List<String> topnodes) {
		if (topnodes == null) {
			throw new RuntimeException("topnodes is empty ");
		}
		this.topnodes = topnodes;
		return this;
	}

	public FiledotQuery type(Integer type) {
		if (type == null) {
			throw new RuntimeException("type is null");
		}
		this.type = type;
		return this;
	}

	public FiledotQuery types(List<Integer> types) {
		if (types == null) {
			throw new RuntimeException("types is empty ");
		}
		this.types = types;
		return this;
	}

	public FiledotQuery utreeIndex(Integer utreeIndex) {
		if (utreeIndex == null) {
			throw new RuntimeException("utreeIndex is null");
		}
		this.utreeIndex = utreeIndex;
		return this;
	}

	public FiledotQuery utreeIndexs(List<Integer> utreeIndexs) {
		if (utreeIndexs == null) {
			throw new RuntimeException("utreeIndexs is empty ");
		}
		this.utreeIndexs = utreeIndexs;
		return this;
	}

}