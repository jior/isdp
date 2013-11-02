package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellSysDatalinkQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String busiessIdSrc;
	protected String busiessIdSrcLike;
	protected List<String> busiessIdSrcs;
	protected Integer celldotIndexSrc;
	protected Integer celldotIndexSrcGreaterThanOrEqual;
	protected Integer celldotIndexSrcLessThanOrEqual;
	protected List<Integer> celldotIndexSrcs;
	protected String fileidSrc;
	protected String fileidSrcLike;
	protected List<String> fileidSrcs;
	protected String dotnameSrc;
	protected String dotnameSrcLike;
	protected List<String> dotnameSrcs;
	protected String busiessIdDes;
	protected String busiessIdDesLike;
	protected List<String> busiessIdDess;
	protected String buiessnameDes;
	protected String buiessnameDesLike;
	protected List<String> buiessnameDess;
	protected Integer celldotIndexDes;
	protected Integer celldotIndexDesGreaterThanOrEqual;
	protected Integer celldotIndexDesLessThanOrEqual;
	protected List<Integer> celldotIndexDess;
	protected String fileidDes;
	protected String fileidDesLike;
	protected List<String> fileidDess;
	protected String dotnameDes;
	protected String dotnameDesLike;
	protected List<String> dotnameDess;
	protected Integer intlinktype;
	protected Integer intlinktypeGreaterThanOrEqual;
	protected Integer intlinktypeLessThanOrEqual;
	protected List<Integer> intlinktypes;
	protected Integer intdiff1;
	protected Integer intdiff1GreaterThanOrEqual;
	protected Integer intdiff1LessThanOrEqual;
	protected List<Integer> intdiff1s;
	protected Integer intdiff2;
	protected Integer intdiff2GreaterThanOrEqual;
	protected Integer intdiff2LessThanOrEqual;
	protected List<Integer> intdiff2s;
	

	public CellSysDatalinkQuery() {

	}

	public String getBusiessIdSrc() {
		return busiessIdSrc;
	}

	public String getBusiessIdSrcLike() {
		if (busiessIdSrcLike != null && busiessIdSrcLike.trim().length() > 0) {
			if (!busiessIdSrcLike.startsWith("%")) {
				busiessIdSrcLike = "%" + busiessIdSrcLike;
			}
			if (!busiessIdSrcLike.endsWith("%")) {
				busiessIdSrcLike = busiessIdSrcLike + "%";
			}
		}
		return busiessIdSrcLike;
	}

	public List<String> getBusiessIdSrcs() {
		return busiessIdSrcs;
	}

	public Integer getCelldotIndexSrc() {
		return celldotIndexSrc;
	}

	public Integer getCelldotIndexSrcGreaterThanOrEqual() {
		return celldotIndexSrcGreaterThanOrEqual;
	}

	public Integer getCelldotIndexSrcLessThanOrEqual() {
		return celldotIndexSrcLessThanOrEqual;
	}

	public List<Integer> getCelldotIndexSrcs() {
		return celldotIndexSrcs;
	}

	public String getFileidSrc() {
		return fileidSrc;
	}

	public String getFileidSrcLike() {
		if (fileidSrcLike != null && fileidSrcLike.trim().length() > 0) {
			if (!fileidSrcLike.startsWith("%")) {
				fileidSrcLike = "%" + fileidSrcLike;
			}
			if (!fileidSrcLike.endsWith("%")) {
				fileidSrcLike = fileidSrcLike + "%";
			}
		}
		return fileidSrcLike;
	}

	public List<String> getFileidSrcs() {
		return fileidSrcs;
	}

	public String getDotnameSrc() {
		return dotnameSrc;
	}

	public String getDotnameSrcLike() {
		if (dotnameSrcLike != null && dotnameSrcLike.trim().length() > 0) {
			if (!dotnameSrcLike.startsWith("%")) {
				dotnameSrcLike = "%" + dotnameSrcLike;
			}
			if (!dotnameSrcLike.endsWith("%")) {
				dotnameSrcLike = dotnameSrcLike + "%";
			}
		}
		return dotnameSrcLike;
	}

	public List<String> getDotnameSrcs() {
		return dotnameSrcs;
	}

	public String getBusiessIdDes() {
		return busiessIdDes;
	}

	public String getBusiessIdDesLike() {
		if (busiessIdDesLike != null && busiessIdDesLike.trim().length() > 0) {
			if (!busiessIdDesLike.startsWith("%")) {
				busiessIdDesLike = "%" + busiessIdDesLike;
			}
			if (!busiessIdDesLike.endsWith("%")) {
				busiessIdDesLike = busiessIdDesLike + "%";
			}
		}
		return busiessIdDesLike;
	}

	public List<String> getBusiessIdDess() {
		return busiessIdDess;
	}

	public String getBuiessnameDes() {
		return buiessnameDes;
	}

	public String getBuiessnameDesLike() {
		if (buiessnameDesLike != null && buiessnameDesLike.trim().length() > 0) {
			if (!buiessnameDesLike.startsWith("%")) {
				buiessnameDesLike = "%" + buiessnameDesLike;
			}
			if (!buiessnameDesLike.endsWith("%")) {
				buiessnameDesLike = buiessnameDesLike + "%";
			}
		}
		return buiessnameDesLike;
	}

	public List<String> getBuiessnameDess() {
		return buiessnameDess;
	}

	public Integer getCelldotIndexDes() {
		return celldotIndexDes;
	}

	public Integer getCelldotIndexDesGreaterThanOrEqual() {
		return celldotIndexDesGreaterThanOrEqual;
	}

	public Integer getCelldotIndexDesLessThanOrEqual() {
		return celldotIndexDesLessThanOrEqual;
	}

	public List<Integer> getCelldotIndexDess() {
		return celldotIndexDess;
	}

	public String getFileidDes() {
		return fileidDes;
	}

	public String getFileidDesLike() {
		if (fileidDesLike != null && fileidDesLike.trim().length() > 0) {
			if (!fileidDesLike.startsWith("%")) {
				fileidDesLike = "%" + fileidDesLike;
			}
			if (!fileidDesLike.endsWith("%")) {
				fileidDesLike = fileidDesLike + "%";
			}
		}
		return fileidDesLike;
	}

	public List<String> getFileidDess() {
		return fileidDess;
	}

	public String getDotnameDes() {
		return dotnameDes;
	}

	public String getDotnameDesLike() {
		if (dotnameDesLike != null && dotnameDesLike.trim().length() > 0) {
			if (!dotnameDesLike.startsWith("%")) {
				dotnameDesLike = "%" + dotnameDesLike;
			}
			if (!dotnameDesLike.endsWith("%")) {
				dotnameDesLike = dotnameDesLike + "%";
			}
		}
		return dotnameDesLike;
	}

	public List<String> getDotnameDess() {
		return dotnameDess;
	}

	public Integer getIntlinktype() {
		return intlinktype;
	}

	public Integer getIntlinktypeGreaterThanOrEqual() {
		return intlinktypeGreaterThanOrEqual;
	}

	public Integer getIntlinktypeLessThanOrEqual() {
		return intlinktypeLessThanOrEqual;
	}

	public List<Integer> getIntlinktypes() {
		return intlinktypes;
	}

	public Integer getIntdiff1() {
		return intdiff1;
	}

	public Integer getIntdiff1GreaterThanOrEqual() {
		return intdiff1GreaterThanOrEqual;
	}

	public Integer getIntdiff1LessThanOrEqual() {
		return intdiff1LessThanOrEqual;
	}

	public List<Integer> getIntdiff1s() {
		return intdiff1s;
	}

	public Integer getIntdiff2() {
		return intdiff2;
	}

	public Integer getIntdiff2GreaterThanOrEqual() {
		return intdiff2GreaterThanOrEqual;
	}

	public Integer getIntdiff2LessThanOrEqual() {
		return intdiff2LessThanOrEqual;
	}

	public List<Integer> getIntdiff2s() {
		return intdiff2s;
	}

	public void setBusiessIdSrc(String busiessIdSrc) {
		this.busiessIdSrc = busiessIdSrc;
	}

	public void setBusiessIdSrcLike(String busiessIdSrcLike) {
		this.busiessIdSrcLike = busiessIdSrcLike;
	}

	public void setBusiessIdSrcs(List<String> busiessIdSrcs) {
		this.busiessIdSrcs = busiessIdSrcs;
	}

	public void setCelldotIndexSrc(Integer celldotIndexSrc) {
		this.celldotIndexSrc = celldotIndexSrc;
	}

	public void setCelldotIndexSrcGreaterThanOrEqual(
			Integer celldotIndexSrcGreaterThanOrEqual) {
		this.celldotIndexSrcGreaterThanOrEqual = celldotIndexSrcGreaterThanOrEqual;
	}

	public void setCelldotIndexSrcLessThanOrEqual(
			Integer celldotIndexSrcLessThanOrEqual) {
		this.celldotIndexSrcLessThanOrEqual = celldotIndexSrcLessThanOrEqual;
	}

	public void setCelldotIndexSrcs(List<Integer> celldotIndexSrcs) {
		this.celldotIndexSrcs = celldotIndexSrcs;
	}

	public void setFileidSrc(String fileidSrc) {
		this.fileidSrc = fileidSrc;
	}

	public void setFileidSrcLike(String fileidSrcLike) {
		this.fileidSrcLike = fileidSrcLike;
	}

	public void setFileidSrcs(List<String> fileidSrcs) {
		this.fileidSrcs = fileidSrcs;
	}

	public void setDotnameSrc(String dotnameSrc) {
		this.dotnameSrc = dotnameSrc;
	}

	public void setDotnameSrcLike(String dotnameSrcLike) {
		this.dotnameSrcLike = dotnameSrcLike;
	}

	public void setDotnameSrcs(List<String> dotnameSrcs) {
		this.dotnameSrcs = dotnameSrcs;
	}

	public void setBusiessIdDes(String busiessIdDes) {
		this.busiessIdDes = busiessIdDes;
	}

	public void setBusiessIdDesLike(String busiessIdDesLike) {
		this.busiessIdDesLike = busiessIdDesLike;
	}

	public void setBusiessIdDess(List<String> busiessIdDess) {
		this.busiessIdDess = busiessIdDess;
	}

	public void setBuiessnameDes(String buiessnameDes) {
		this.buiessnameDes = buiessnameDes;
	}

	public void setBuiessnameDesLike(String buiessnameDesLike) {
		this.buiessnameDesLike = buiessnameDesLike;
	}

	public void setBuiessnameDess(List<String> buiessnameDess) {
		this.buiessnameDess = buiessnameDess;
	}

	public void setCelldotIndexDes(Integer celldotIndexDes) {
		this.celldotIndexDes = celldotIndexDes;
	}

	public void setCelldotIndexDesGreaterThanOrEqual(
			Integer celldotIndexDesGreaterThanOrEqual) {
		this.celldotIndexDesGreaterThanOrEqual = celldotIndexDesGreaterThanOrEqual;
	}

	public void setCelldotIndexDesLessThanOrEqual(
			Integer celldotIndexDesLessThanOrEqual) {
		this.celldotIndexDesLessThanOrEqual = celldotIndexDesLessThanOrEqual;
	}

	public void setCelldotIndexDess(List<Integer> celldotIndexDess) {
		this.celldotIndexDess = celldotIndexDess;
	}

	public void setFileidDes(String fileidDes) {
		this.fileidDes = fileidDes;
	}

	public void setFileidDesLike(String fileidDesLike) {
		this.fileidDesLike = fileidDesLike;
	}

	public void setFileidDess(List<String> fileidDess) {
		this.fileidDess = fileidDess;
	}

	public void setDotnameDes(String dotnameDes) {
		this.dotnameDes = dotnameDes;
	}

	public void setDotnameDesLike(String dotnameDesLike) {
		this.dotnameDesLike = dotnameDesLike;
	}

	public void setDotnameDess(List<String> dotnameDess) {
		this.dotnameDess = dotnameDess;
	}

	public void setIntlinktype(Integer intlinktype) {
		this.intlinktype = intlinktype;
	}

	public void setIntlinktypeGreaterThanOrEqual(
			Integer intlinktypeGreaterThanOrEqual) {
		this.intlinktypeGreaterThanOrEqual = intlinktypeGreaterThanOrEqual;
	}

	public void setIntlinktypeLessThanOrEqual(Integer intlinktypeLessThanOrEqual) {
		this.intlinktypeLessThanOrEqual = intlinktypeLessThanOrEqual;
	}

	public void setIntlinktypes(List<Integer> intlinktypes) {
		this.intlinktypes = intlinktypes;
	}

	public void setIntdiff1(Integer intdiff1) {
		this.intdiff1 = intdiff1;
	}

	public void setIntdiff1GreaterThanOrEqual(Integer intdiff1GreaterThanOrEqual) {
		this.intdiff1GreaterThanOrEqual = intdiff1GreaterThanOrEqual;
	}

	public void setIntdiff1LessThanOrEqual(Integer intdiff1LessThanOrEqual) {
		this.intdiff1LessThanOrEqual = intdiff1LessThanOrEqual;
	}

	public void setIntdiff1s(List<Integer> intdiff1s) {
		this.intdiff1s = intdiff1s;
	}

	public void setIntdiff2(Integer intdiff2) {
		this.intdiff2 = intdiff2;
	}

	public void setIntdiff2GreaterThanOrEqual(Integer intdiff2GreaterThanOrEqual) {
		this.intdiff2GreaterThanOrEqual = intdiff2GreaterThanOrEqual;
	}

	public void setIntdiff2LessThanOrEqual(Integer intdiff2LessThanOrEqual) {
		this.intdiff2LessThanOrEqual = intdiff2LessThanOrEqual;
	}

	public void setIntdiff2s(List<Integer> intdiff2s) {
		this.intdiff2s = intdiff2s;
	}

	public CellSysDatalinkQuery busiessIdSrc(String busiessIdSrc) {
		if (busiessIdSrc == null) {
			throw new RuntimeException("busiessIdSrc is null");
		}
		this.busiessIdSrc = busiessIdSrc;
		return this;
	}

	public CellSysDatalinkQuery busiessIdSrcLike(String busiessIdSrcLike) {
		if (busiessIdSrcLike == null) {
			throw new RuntimeException("busiessIdSrc is null");
		}
		this.busiessIdSrcLike = busiessIdSrcLike;
		return this;
	}

	public CellSysDatalinkQuery busiessIdSrcs(List<String> busiessIdSrcs) {
		if (busiessIdSrcs == null) {
			throw new RuntimeException("busiessIdSrcs is empty ");
		}
		this.busiessIdSrcs = busiessIdSrcs;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexSrc(Integer celldotIndexSrc) {
		if (celldotIndexSrc == null) {
			throw new RuntimeException("celldotIndexSrc is null");
		}
		this.celldotIndexSrc = celldotIndexSrc;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexSrcGreaterThanOrEqual(
			Integer celldotIndexSrcGreaterThanOrEqual) {
		if (celldotIndexSrcGreaterThanOrEqual == null) {
			throw new RuntimeException("celldotIndexSrc is null");
		}
		this.celldotIndexSrcGreaterThanOrEqual = celldotIndexSrcGreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexSrcLessThanOrEqual(
			Integer celldotIndexSrcLessThanOrEqual) {
		if (celldotIndexSrcLessThanOrEqual == null) {
			throw new RuntimeException("celldotIndexSrc is null");
		}
		this.celldotIndexSrcLessThanOrEqual = celldotIndexSrcLessThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexSrcs(List<Integer> celldotIndexSrcs) {
		if (celldotIndexSrcs == null) {
			throw new RuntimeException("celldotIndexSrcs is empty ");
		}
		this.celldotIndexSrcs = celldotIndexSrcs;
		return this;
	}

	public CellSysDatalinkQuery fileidSrc(String fileidSrc) {
		if (fileidSrc == null) {
			throw new RuntimeException("fileidSrc is null");
		}
		this.fileidSrc = fileidSrc;
		return this;
	}

	public CellSysDatalinkQuery fileidSrcLike(String fileidSrcLike) {
		if (fileidSrcLike == null) {
			throw new RuntimeException("fileidSrc is null");
		}
		this.fileidSrcLike = fileidSrcLike;
		return this;
	}

	public CellSysDatalinkQuery fileidSrcs(List<String> fileidSrcs) {
		if (fileidSrcs == null) {
			throw new RuntimeException("fileidSrcs is empty ");
		}
		this.fileidSrcs = fileidSrcs;
		return this;
	}

	public CellSysDatalinkQuery dotnameSrc(String dotnameSrc) {
		if (dotnameSrc == null) {
			throw new RuntimeException("dotnameSrc is null");
		}
		this.dotnameSrc = dotnameSrc;
		return this;
	}

	public CellSysDatalinkQuery dotnameSrcLike(String dotnameSrcLike) {
		if (dotnameSrcLike == null) {
			throw new RuntimeException("dotnameSrc is null");
		}
		this.dotnameSrcLike = dotnameSrcLike;
		return this;
	}

	public CellSysDatalinkQuery dotnameSrcs(List<String> dotnameSrcs) {
		if (dotnameSrcs == null) {
			throw new RuntimeException("dotnameSrcs is empty ");
		}
		this.dotnameSrcs = dotnameSrcs;
		return this;
	}

	public CellSysDatalinkQuery busiessIdDes(String busiessIdDes) {
		if (busiessIdDes == null) {
			throw new RuntimeException("busiessIdDes is null");
		}
		this.busiessIdDes = busiessIdDes;
		return this;
	}

	public CellSysDatalinkQuery busiessIdDesLike(String busiessIdDesLike) {
		if (busiessIdDesLike == null) {
			throw new RuntimeException("busiessIdDes is null");
		}
		this.busiessIdDesLike = busiessIdDesLike;
		return this;
	}

	public CellSysDatalinkQuery busiessIdDess(List<String> busiessIdDess) {
		if (busiessIdDess == null) {
			throw new RuntimeException("busiessIdDess is empty ");
		}
		this.busiessIdDess = busiessIdDess;
		return this;
	}

	public CellSysDatalinkQuery buiessnameDes(String buiessnameDes) {
		if (buiessnameDes == null) {
			throw new RuntimeException("buiessnameDes is null");
		}
		this.buiessnameDes = buiessnameDes;
		return this;
	}

	public CellSysDatalinkQuery buiessnameDesLike(String buiessnameDesLike) {
		if (buiessnameDesLike == null) {
			throw new RuntimeException("buiessnameDes is null");
		}
		this.buiessnameDesLike = buiessnameDesLike;
		return this;
	}

	public CellSysDatalinkQuery buiessnameDess(List<String> buiessnameDess) {
		if (buiessnameDess == null) {
			throw new RuntimeException("buiessnameDess is empty ");
		}
		this.buiessnameDess = buiessnameDess;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexDes(Integer celldotIndexDes) {
		if (celldotIndexDes == null) {
			throw new RuntimeException("celldotIndexDes is null");
		}
		this.celldotIndexDes = celldotIndexDes;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexDesGreaterThanOrEqual(
			Integer celldotIndexDesGreaterThanOrEqual) {
		if (celldotIndexDesGreaterThanOrEqual == null) {
			throw new RuntimeException("celldotIndexDes is null");
		}
		this.celldotIndexDesGreaterThanOrEqual = celldotIndexDesGreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexDesLessThanOrEqual(
			Integer celldotIndexDesLessThanOrEqual) {
		if (celldotIndexDesLessThanOrEqual == null) {
			throw new RuntimeException("celldotIndexDes is null");
		}
		this.celldotIndexDesLessThanOrEqual = celldotIndexDesLessThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery celldotIndexDess(List<Integer> celldotIndexDess) {
		if (celldotIndexDess == null) {
			throw new RuntimeException("celldotIndexDess is empty ");
		}
		this.celldotIndexDess = celldotIndexDess;
		return this;
	}

	public CellSysDatalinkQuery fileidDes(String fileidDes) {
		if (fileidDes == null) {
			throw new RuntimeException("fileidDes is null");
		}
		this.fileidDes = fileidDes;
		return this;
	}

	public CellSysDatalinkQuery fileidDesLike(String fileidDesLike) {
		if (fileidDesLike == null) {
			throw new RuntimeException("fileidDes is null");
		}
		this.fileidDesLike = fileidDesLike;
		return this;
	}

	public CellSysDatalinkQuery fileidDess(List<String> fileidDess) {
		if (fileidDess == null) {
			throw new RuntimeException("fileidDess is empty ");
		}
		this.fileidDess = fileidDess;
		return this;
	}

	public CellSysDatalinkQuery dotnameDes(String dotnameDes) {
		if (dotnameDes == null) {
			throw new RuntimeException("dotnameDes is null");
		}
		this.dotnameDes = dotnameDes;
		return this;
	}

	public CellSysDatalinkQuery dotnameDesLike(String dotnameDesLike) {
		if (dotnameDesLike == null) {
			throw new RuntimeException("dotnameDes is null");
		}
		this.dotnameDesLike = dotnameDesLike;
		return this;
	}

	public CellSysDatalinkQuery dotnameDess(List<String> dotnameDess) {
		if (dotnameDess == null) {
			throw new RuntimeException("dotnameDess is empty ");
		}
		this.dotnameDess = dotnameDess;
		return this;
	}

	public CellSysDatalinkQuery intlinktype(Integer intlinktype) {
		if (intlinktype == null) {
			throw new RuntimeException("intlinktype is null");
		}
		this.intlinktype = intlinktype;
		return this;
	}

	public CellSysDatalinkQuery intlinktypeGreaterThanOrEqual(
			Integer intlinktypeGreaterThanOrEqual) {
		if (intlinktypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intlinktype is null");
		}
		this.intlinktypeGreaterThanOrEqual = intlinktypeGreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intlinktypeLessThanOrEqual(
			Integer intlinktypeLessThanOrEqual) {
		if (intlinktypeLessThanOrEqual == null) {
			throw new RuntimeException("intlinktype is null");
		}
		this.intlinktypeLessThanOrEqual = intlinktypeLessThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intlinktypes(List<Integer> intlinktypes) {
		if (intlinktypes == null) {
			throw new RuntimeException("intlinktypes is empty ");
		}
		this.intlinktypes = intlinktypes;
		return this;
	}

	public CellSysDatalinkQuery intdiff1(Integer intdiff1) {
		if (intdiff1 == null) {
			throw new RuntimeException("intdiff1 is null");
		}
		this.intdiff1 = intdiff1;
		return this;
	}

	public CellSysDatalinkQuery intdiff1GreaterThanOrEqual(
			Integer intdiff1GreaterThanOrEqual) {
		if (intdiff1GreaterThanOrEqual == null) {
			throw new RuntimeException("intdiff1 is null");
		}
		this.intdiff1GreaterThanOrEqual = intdiff1GreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intdiff1LessThanOrEqual(
			Integer intdiff1LessThanOrEqual) {
		if (intdiff1LessThanOrEqual == null) {
			throw new RuntimeException("intdiff1 is null");
		}
		this.intdiff1LessThanOrEqual = intdiff1LessThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intdiff1s(List<Integer> intdiff1s) {
		if (intdiff1s == null) {
			throw new RuntimeException("intdiff1s is empty ");
		}
		this.intdiff1s = intdiff1s;
		return this;
	}

	public CellSysDatalinkQuery intdiff2(Integer intdiff2) {
		if (intdiff2 == null) {
			throw new RuntimeException("intdiff2 is null");
		}
		this.intdiff2 = intdiff2;
		return this;
	}

	public CellSysDatalinkQuery intdiff2GreaterThanOrEqual(
			Integer intdiff2GreaterThanOrEqual) {
		if (intdiff2GreaterThanOrEqual == null) {
			throw new RuntimeException("intdiff2 is null");
		}
		this.intdiff2GreaterThanOrEqual = intdiff2GreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intdiff2LessThanOrEqual(
			Integer intdiff2LessThanOrEqual) {
		if (intdiff2LessThanOrEqual == null) {
			throw new RuntimeException("intdiff2 is null");
		}
		this.intdiff2LessThanOrEqual = intdiff2LessThanOrEqual;
		return this;
	}

	public CellSysDatalinkQuery intdiff2s(List<Integer> intdiff2s) {
		if (intdiff2s == null) {
			throw new RuntimeException("intdiff2s is empty ");
		}
		this.intdiff2s = intdiff2s;
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
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("busiessIdSrc", "busiess_id_src");
		addColumn("celldotIndexSrc", "celldot_index_src");
		addColumn("fileidSrc", "fileid_src");
		addColumn("dotnameSrc", "dotname_src");
		addColumn("busiessIdDes", "busiess_id_des");
		addColumn("buiessnameDes", "buiessname_des");
		addColumn("celldotIndexDes", "celldot_index_des");
		addColumn("fileidDes", "fileid_des");
		addColumn("dotnameDes", "dotname_des");
		addColumn("intlinktype", "intlinktype");
		addColumn("intdiff1", "intdiff1");
		addColumn("intdiff2", "intdiff2");
	}

}