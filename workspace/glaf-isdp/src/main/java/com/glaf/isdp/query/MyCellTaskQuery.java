package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class MyCellTaskQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String nameLike;
	protected String isused;
	protected String busiessId;
	protected String busiessIdLike;
	protected List<String> busiessIds;
	protected Integer celldotIndex;
	protected Integer celldotIndexGreaterThanOrEqual;
	protected Integer celldotIndexLessThanOrEqual;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected String mnameLike;
	protected String snameLike;
	protected String contentLike;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected Integer intcreatetype;
	protected Integer intcreatetypeGreaterThanOrEqual;
	protected Integer intcreatetypeLessThanOrEqual;
	protected String time1;
	protected String time1Like;
	protected List<String> time1s;
	protected String time2;
	protected String time2Like;
	protected List<String> time2s;
	protected String time3;
	protected String time3Like;
	protected List<String> time3s;
	protected Integer issave;
	protected Integer issaveGreaterThanOrEqual;
	protected Integer issaveLessThanOrEqual;
	protected Integer isuseworkflow;
	protected Integer isuseworkflowGreaterThanOrEqual;
	protected Integer isuseworkflowLessThanOrEqual;
	protected List<Integer> isuseworkflows;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer intflowortask;
	protected Integer intflowortaskGreaterThanOrEqual;
	protected Integer intflowortaskLessThanOrEqual;
	protected List<Integer> intflowortasks;
	protected String fileidPress;
	protected String fileidPressLike;
	protected List<String> fileidPresss;
	protected String inshowtaskinfo;
	protected String inshowtaskinfoLike;
	protected List<String> inshowtaskinfos;
	protected String filenumid;
	protected String filenumidLike;
	protected List<String> filenumids;
	

	public MyCellTaskQuery() {

	}

	public MyCellTaskQuery busiessId(String busiessId) {
		if (busiessId == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessId = busiessId;
		return this;
	}

	public MyCellTaskQuery busiessIdLike(String busiessIdLike) {
		if (busiessIdLike == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessIdLike = busiessIdLike;
		return this;
	}

	public MyCellTaskQuery busiessIds(List<String> busiessIds) {
		if (busiessIds == null) {
			throw new RuntimeException("busiessIds is empty ");
		}
		this.busiessIds = busiessIds;
		return this;
	}

	public MyCellTaskQuery celldotIndex(Integer celldotIndex) {
		if (celldotIndex == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndex = celldotIndex;
		return this;
	}

	public MyCellTaskQuery celldotIndexGreaterThanOrEqual(
			Integer celldotIndexGreaterThanOrEqual) {
		if (celldotIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndexGreaterThanOrEqual = celldotIndexGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery celldotIndexLessThanOrEqual(
			Integer celldotIndexLessThanOrEqual) {
		if (celldotIndexLessThanOrEqual == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndexLessThanOrEqual = celldotIndexLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public MyCellTaskQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public MyCellTaskQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public MyCellTaskQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public MyCellTaskQuery fileidPress(String fileidPress) {
		if (fileidPress == null) {
			throw new RuntimeException("fileidPress is null");
		}
		this.fileidPress = fileidPress;
		return this;
	}

	public MyCellTaskQuery fileidPressLike(String fileidPressLike) {
		if (fileidPressLike == null) {
			throw new RuntimeException("fileidPress is null");
		}
		this.fileidPressLike = fileidPressLike;
		return this;
	}

	public MyCellTaskQuery fileidPresss(List<String> fileidPresss) {
		if (fileidPresss == null) {
			throw new RuntimeException("fileidPresss is empty ");
		}
		this.fileidPresss = fileidPresss;
		return this;
	}

	public MyCellTaskQuery filenumid(String filenumid) {
		if (filenumid == null) {
			throw new RuntimeException("filenumid is null");
		}
		this.filenumid = filenumid;
		return this;
	}

	public MyCellTaskQuery filenumidLike(String filenumidLike) {
		if (filenumidLike == null) {
			throw new RuntimeException("filenumid is null");
		}
		this.filenumidLike = filenumidLike;
		return this;
	}

	public MyCellTaskQuery filenumids(List<String> filenumids) {
		if (filenumids == null) {
			throw new RuntimeException("filenumids is empty ");
		}
		this.filenumids = filenumids;
		return this;
	}

	public String getBusiessId() {
		return busiessId;
	}

	public String getBusiessIdLike() {
		if (busiessIdLike != null && busiessIdLike.trim().length() > 0) {
			if (!busiessIdLike.startsWith("%")) {
				busiessIdLike = "%" + busiessIdLike;
			}
			if (!busiessIdLike.endsWith("%")) {
				busiessIdLike = busiessIdLike + "%";
			}
		}
		return busiessIdLike;
	}

	public List<String> getBusiessIds() {
		return busiessIds;
	}

	public Integer getCelldotIndex() {
		return celldotIndex;
	}

	public Integer getCelldotIndexGreaterThanOrEqual() {
		return celldotIndexGreaterThanOrEqual;
	}

	public Integer getCelldotIndexLessThanOrEqual() {
		return celldotIndexLessThanOrEqual;
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

	public String getFiledotFileid() {
		return filedotFileid;
	}

	public String getFiledotFileidLike() {
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

	public List<String> getFiledotFileids() {
		return filedotFileids;
	}

	public String getFileidPress() {
		return fileidPress;
	}

	public String getFileidPressLike() {
		if (fileidPressLike != null && fileidPressLike.trim().length() > 0) {
			if (!fileidPressLike.startsWith("%")) {
				fileidPressLike = "%" + fileidPressLike;
			}
			if (!fileidPressLike.endsWith("%")) {
				fileidPressLike = fileidPressLike + "%";
			}
		}
		return fileidPressLike;
	}

	public List<String> getFileidPresss() {
		return fileidPresss;
	}

	public String getFilenumid() {
		return filenumid;
	}

	public String getFilenumidLike() {
		if (filenumidLike != null && filenumidLike.trim().length() > 0) {
			if (!filenumidLike.startsWith("%")) {
				filenumidLike = "%" + filenumidLike;
			}
			if (!filenumidLike.endsWith("%")) {
				filenumidLike = filenumidLike + "%";
			}
		}
		return filenumidLike;
	}

	public List<String> getFilenumids() {
		return filenumids;
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

	public String getInshowtaskinfo() {
		return inshowtaskinfo;
	}

	public String getInshowtaskinfoLike() {
		if (inshowtaskinfoLike != null
				&& inshowtaskinfoLike.trim().length() > 0) {
			if (!inshowtaskinfoLike.startsWith("%")) {
				inshowtaskinfoLike = "%" + inshowtaskinfoLike;
			}
			if (!inshowtaskinfoLike.endsWith("%")) {
				inshowtaskinfoLike = inshowtaskinfoLike + "%";
			}
		}
		return inshowtaskinfoLike;
	}

	public List<String> getInshowtaskinfos() {
		return inshowtaskinfos;
	}

	public Integer getIntcreatetype() {
		return intcreatetype;
	}

	public Integer getIntcreatetypeGreaterThanOrEqual() {
		return intcreatetypeGreaterThanOrEqual;
	}

	public Integer getIntcreatetypeLessThanOrEqual() {
		return intcreatetypeLessThanOrEqual;
	}

	public Integer getIntflowortask() {
		return intflowortask;
	}

	public Integer getIntflowortaskGreaterThanOrEqual() {
		return intflowortaskGreaterThanOrEqual;
	}

	public Integer getIntflowortaskLessThanOrEqual() {
		return intflowortaskLessThanOrEqual;
	}

	public List<Integer> getIntflowortasks() {
		return intflowortasks;
	}

	public Integer getInttype() {
		return inttype;
	}

	public Integer getInttypeGreaterThanOrEqual() {
		return inttypeGreaterThanOrEqual;
	}

	public Integer getInttypeLessThanOrEqual() {
		return inttypeLessThanOrEqual;
	}

	public List<Integer> getInttypes() {
		return inttypes;
	}

	public Integer getIssave() {
		return issave;
	}

	public Integer getIssaveGreaterThanOrEqual() {
		return issaveGreaterThanOrEqual;
	}

	public Integer getIssaveLessThanOrEqual() {
		return issaveLessThanOrEqual;
	}

	public String getIsused() {
		return isused;
	}

	public Integer getIsuseworkflow() {
		return isuseworkflow;
	}

	public Integer getIsuseworkflowGreaterThanOrEqual() {
		return isuseworkflowGreaterThanOrEqual;
	}

	public Integer getIsuseworkflowLessThanOrEqual() {
		return isuseworkflowLessThanOrEqual;
	}

	public List<Integer> getIsuseworkflows() {
		return isuseworkflows;
	}

	public String getMnameLike() {
		if (mnameLike != null && mnameLike.trim().length() > 0) {
			if (!mnameLike.startsWith("%")) {
				mnameLike = "%" + mnameLike;
			}
			if (!mnameLike.endsWith("%")) {
				mnameLike = mnameLike + "%";
			}
		}
		return mnameLike;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
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

	public String getSnameLike() {
		if (snameLike != null && snameLike.trim().length() > 0) {
			if (!snameLike.startsWith("%")) {
				snameLike = "%" + snameLike;
			}
			if (!snameLike.endsWith("%")) {
				snameLike = snameLike + "%";
			}
		}
		return snameLike;
	}

	public String getTime1() {
		return time1;
	}

	public String getTime1Like() {
		if (time1Like != null && time1Like.trim().length() > 0) {
			if (!time1Like.startsWith("%")) {
				time1Like = "%" + time1Like;
			}
			if (!time1Like.endsWith("%")) {
				time1Like = time1Like + "%";
			}
		}
		return time1Like;
	}

	public List<String> getTime1s() {
		return time1s;
	}

	public String getTime2() {
		return time2;
	}

	public String getTime2Like() {
		if (time2Like != null && time2Like.trim().length() > 0) {
			if (!time2Like.startsWith("%")) {
				time2Like = "%" + time2Like;
			}
			if (!time2Like.endsWith("%")) {
				time2Like = time2Like + "%";
			}
		}
		return time2Like;
	}

	public List<String> getTime2s() {
		return time2s;
	}

	public String getTime3() {
		return time3;
	}

	public String getTime3Like() {
		if (time3Like != null && time3Like.trim().length() > 0) {
			if (!time3Like.startsWith("%")) {
				time3Like = "%" + time3Like;
			}
			if (!time3Like.endsWith("%")) {
				time3Like = time3Like + "%";
			}
		}
		return time3Like;
	}

	public List<String> getTime3s() {
		return time3s;
	}

	public MyCellTaskQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public MyCellTaskQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery indexIds(List<Integer> indexIds) {
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
		addColumn("name", "name");
		addColumn("isused", "isused");
		addColumn("busiessId", "busiess_id");
		addColumn("celldotIndex", "celldot_index");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("mname", "mname");
		addColumn("sname", "sname");
		addColumn("content", "content");
		addColumn("inttype", "inttype");
		addColumn("intcreatetype", "intcreatetype");
		addColumn("time1", "time1");
		addColumn("time2", "time2");
		addColumn("time3", "time3");
		addColumn("issave", "issave");
		addColumn("isuseworkflow", "isuseworkflow");
		addColumn("indexId", "index_id");
		addColumn("intflowortask", "intflowortask");
		addColumn("fileidPress", "fileid_press");
		addColumn("inshowtaskinfo", "inshowtaskinfo");
		addColumn("filenumid", "filenumid");
	}

	public MyCellTaskQuery inshowtaskinfo(String inshowtaskinfo) {
		if (inshowtaskinfo == null) {
			throw new RuntimeException("inshowtaskinfo is null");
		}
		this.inshowtaskinfo = inshowtaskinfo;
		return this;
	}

	public MyCellTaskQuery inshowtaskinfoLike(String inshowtaskinfoLike) {
		if (inshowtaskinfoLike == null) {
			throw new RuntimeException("inshowtaskinfo is null");
		}
		this.inshowtaskinfoLike = inshowtaskinfoLike;
		return this;
	}

	public MyCellTaskQuery inshowtaskinfos(List<String> inshowtaskinfos) {
		if (inshowtaskinfos == null) {
			throw new RuntimeException("inshowtaskinfos is empty ");
		}
		this.inshowtaskinfos = inshowtaskinfos;
		return this;
	}

	public MyCellTaskQuery intcreatetype(Integer intcreatetype) {
		if (intcreatetype == null) {
			throw new RuntimeException("intcreatetype is null");
		}
		this.intcreatetype = intcreatetype;
		return this;
	}

	public MyCellTaskQuery intcreatetypeGreaterThanOrEqual(
			Integer intcreatetypeGreaterThanOrEqual) {
		if (intcreatetypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intcreatetype is null");
		}
		this.intcreatetypeGreaterThanOrEqual = intcreatetypeGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery intcreatetypeLessThanOrEqual(
			Integer intcreatetypeLessThanOrEqual) {
		if (intcreatetypeLessThanOrEqual == null) {
			throw new RuntimeException("intcreatetype is null");
		}
		this.intcreatetypeLessThanOrEqual = intcreatetypeLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery intflowortask(Integer intflowortask) {
		if (intflowortask == null) {
			throw new RuntimeException("intflowortask is null");
		}
		this.intflowortask = intflowortask;
		return this;
	}

	public MyCellTaskQuery intflowortaskGreaterThanOrEqual(
			Integer intflowortaskGreaterThanOrEqual) {
		if (intflowortaskGreaterThanOrEqual == null) {
			throw new RuntimeException("intflowortask is null");
		}
		this.intflowortaskGreaterThanOrEqual = intflowortaskGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery intflowortaskLessThanOrEqual(
			Integer intflowortaskLessThanOrEqual) {
		if (intflowortaskLessThanOrEqual == null) {
			throw new RuntimeException("intflowortask is null");
		}
		this.intflowortaskLessThanOrEqual = intflowortaskLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery intflowortasks(List<Integer> intflowortasks) {
		if (intflowortasks == null) {
			throw new RuntimeException("intflowortasks is empty ");
		}
		this.intflowortasks = intflowortasks;
		return this;
	}

	public MyCellTaskQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public MyCellTaskQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public MyCellTaskQuery issave(Integer issave) {
		if (issave == null) {
			throw new RuntimeException("issave is null");
		}
		this.issave = issave;
		return this;
	}

	public MyCellTaskQuery issaveGreaterThanOrEqual(
			Integer issaveGreaterThanOrEqual) {
		if (issaveGreaterThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery issaveLessThanOrEqual(Integer issaveLessThanOrEqual) {
		if (issaveLessThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public MyCellTaskQuery isused(String isused) {
		if (isused == null) {
			throw new RuntimeException("isused is null");
		}
		this.isused = isused;
		return this;
	}

	public MyCellTaskQuery isuseworkflow(Integer isuseworkflow) {
		if (isuseworkflow == null) {
			throw new RuntimeException("isuseworkflow is null");
		}
		this.isuseworkflow = isuseworkflow;
		return this;
	}

	public MyCellTaskQuery isuseworkflowGreaterThanOrEqual(
			Integer isuseworkflowGreaterThanOrEqual) {
		if (isuseworkflowGreaterThanOrEqual == null) {
			throw new RuntimeException("isuseworkflow is null");
		}
		this.isuseworkflowGreaterThanOrEqual = isuseworkflowGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskQuery isuseworkflowLessThanOrEqual(
			Integer isuseworkflowLessThanOrEqual) {
		if (isuseworkflowLessThanOrEqual == null) {
			throw new RuntimeException("isuseworkflow is null");
		}
		this.isuseworkflowLessThanOrEqual = isuseworkflowLessThanOrEqual;
		return this;
	}

	public MyCellTaskQuery isuseworkflows(List<Integer> isuseworkflows) {
		if (isuseworkflows == null) {
			throw new RuntimeException("isuseworkflows is empty ");
		}
		this.isuseworkflows = isuseworkflows;
		return this;
	}

	public MyCellTaskQuery mnameLike(String mnameLike) {
		if (mnameLike == null) {
			throw new RuntimeException("mname is null");
		}
		this.mnameLike = mnameLike;
		return this;
	}

	public MyCellTaskQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setBusiessIdLike(String busiessIdLike) {
		this.busiessIdLike = busiessIdLike;
	}

	public void setBusiessIds(List<String> busiessIds) {
		this.busiessIds = busiessIds;
	}

	public void setCelldotIndex(Integer celldotIndex) {
		this.celldotIndex = celldotIndex;
	}

	public void setCelldotIndexGreaterThanOrEqual(
			Integer celldotIndexGreaterThanOrEqual) {
		this.celldotIndexGreaterThanOrEqual = celldotIndexGreaterThanOrEqual;
	}

	public void setCelldotIndexLessThanOrEqual(
			Integer celldotIndexLessThanOrEqual) {
		this.celldotIndexLessThanOrEqual = celldotIndexLessThanOrEqual;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFiledotFileidLike(String filedotFileidLike) {
		this.filedotFileidLike = filedotFileidLike;
	}

	public void setFiledotFileids(List<String> filedotFileids) {
		this.filedotFileids = filedotFileids;
	}

	public void setFileidPress(String fileidPress) {
		this.fileidPress = fileidPress;
	}

	public void setFileidPressLike(String fileidPressLike) {
		this.fileidPressLike = fileidPressLike;
	}

	public void setFileidPresss(List<String> fileidPresss) {
		this.fileidPresss = fileidPresss;
	}

	public void setFilenumid(String filenumid) {
		this.filenumid = filenumid;
	}

	public void setFilenumidLike(String filenumidLike) {
		this.filenumidLike = filenumidLike;
	}

	public void setFilenumids(List<String> filenumids) {
		this.filenumids = filenumids;
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

	public void setInshowtaskinfo(String inshowtaskinfo) {
		this.inshowtaskinfo = inshowtaskinfo;
	}

	public void setInshowtaskinfoLike(String inshowtaskinfoLike) {
		this.inshowtaskinfoLike = inshowtaskinfoLike;
	}

	public void setInshowtaskinfos(List<String> inshowtaskinfos) {
		this.inshowtaskinfos = inshowtaskinfos;
	}

	public void setIntcreatetype(Integer intcreatetype) {
		this.intcreatetype = intcreatetype;
	}

	public void setIntcreatetypeGreaterThanOrEqual(
			Integer intcreatetypeGreaterThanOrEqual) {
		this.intcreatetypeGreaterThanOrEqual = intcreatetypeGreaterThanOrEqual;
	}

	public void setIntcreatetypeLessThanOrEqual(
			Integer intcreatetypeLessThanOrEqual) {
		this.intcreatetypeLessThanOrEqual = intcreatetypeLessThanOrEqual;
	}

	public void setIntflowortask(Integer intflowortask) {
		this.intflowortask = intflowortask;
	}

	public void setIntflowortaskGreaterThanOrEqual(
			Integer intflowortaskGreaterThanOrEqual) {
		this.intflowortaskGreaterThanOrEqual = intflowortaskGreaterThanOrEqual;
	}

	public void setIntflowortaskLessThanOrEqual(
			Integer intflowortaskLessThanOrEqual) {
		this.intflowortaskLessThanOrEqual = intflowortaskLessThanOrEqual;
	}

	public void setIntflowortasks(List<Integer> intflowortasks) {
		this.intflowortasks = intflowortasks;
	}

	public void setInttype(Integer inttype) {
		this.inttype = inttype;
	}

	public void setInttypeGreaterThanOrEqual(Integer inttypeGreaterThanOrEqual) {
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
	}

	public void setInttypeLessThanOrEqual(Integer inttypeLessThanOrEqual) {
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
	}

	public void setInttypes(List<Integer> inttypes) {
		this.inttypes = inttypes;
	}

	public void setIssave(Integer issave) {
		this.issave = issave;
	}

	public void setIssaveGreaterThanOrEqual(Integer issaveGreaterThanOrEqual) {
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
	}

	public void setIssaveLessThanOrEqual(Integer issaveLessThanOrEqual) {
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
	}

	public void setIsused(String isused) {
		this.isused = isused;
	}

	public void setIsuseworkflow(Integer isuseworkflow) {
		this.isuseworkflow = isuseworkflow;
	}

	public void setIsuseworkflowGreaterThanOrEqual(
			Integer isuseworkflowGreaterThanOrEqual) {
		this.isuseworkflowGreaterThanOrEqual = isuseworkflowGreaterThanOrEqual;
	}

	public void setIsuseworkflowLessThanOrEqual(
			Integer isuseworkflowLessThanOrEqual) {
		this.isuseworkflowLessThanOrEqual = isuseworkflowLessThanOrEqual;
	}

	public void setIsuseworkflows(List<Integer> isuseworkflows) {
		this.isuseworkflows = isuseworkflows;
	}

	public void setMnameLike(String mnameLike) {
		this.mnameLike = mnameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setSnameLike(String snameLike) {
		this.snameLike = snameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public void setTime1Like(String time1Like) {
		this.time1Like = time1Like;
	}

	public void setTime1s(List<String> time1s) {
		this.time1s = time1s;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public void setTime2Like(String time2Like) {
		this.time2Like = time2Like;
	}

	public void setTime2s(List<String> time2s) {
		this.time2s = time2s;
	}

	public void setTime3(String time3) {
		this.time3 = time3;
	}

	public void setTime3Like(String time3Like) {
		this.time3Like = time3Like;
	}

	public void setTime3s(List<String> time3s) {
		this.time3s = time3s;
	}

	public MyCellTaskQuery snameLike(String snameLike) {
		if (snameLike == null) {
			throw new RuntimeException("sname is null");
		}
		this.snameLike = snameLike;
		return this;
	}

	public MyCellTaskQuery time1(String time1) {
		if (time1 == null) {
			throw new RuntimeException("time1 is null");
		}
		this.time1 = time1;
		return this;
	}

	public MyCellTaskQuery time1Like(String time1Like) {
		if (time1Like == null) {
			throw new RuntimeException("time1 is null");
		}
		this.time1Like = time1Like;
		return this;
	}

	public MyCellTaskQuery time1s(List<String> time1s) {
		if (time1s == null) {
			throw new RuntimeException("time1s is empty ");
		}
		this.time1s = time1s;
		return this;
	}

	public MyCellTaskQuery time2(String time2) {
		if (time2 == null) {
			throw new RuntimeException("time2 is null");
		}
		this.time2 = time2;
		return this;
	}

	public MyCellTaskQuery time2Like(String time2Like) {
		if (time2Like == null) {
			throw new RuntimeException("time2 is null");
		}
		this.time2Like = time2Like;
		return this;
	}

	public MyCellTaskQuery time2s(List<String> time2s) {
		if (time2s == null) {
			throw new RuntimeException("time2s is empty ");
		}
		this.time2s = time2s;
		return this;
	}

	public MyCellTaskQuery time3(String time3) {
		if (time3 == null) {
			throw new RuntimeException("time3 is null");
		}
		this.time3 = time3;
		return this;
	}

	public MyCellTaskQuery time3Like(String time3Like) {
		if (time3Like == null) {
			throw new RuntimeException("time3 is null");
		}
		this.time3Like = time3Like;
		return this;
	}

	public MyCellTaskQuery time3s(List<String> time3s) {
		if (time3s == null) {
			throw new RuntimeException("time3s is empty ");
		}
		this.time3s = time3s;
		return this;
	}

}