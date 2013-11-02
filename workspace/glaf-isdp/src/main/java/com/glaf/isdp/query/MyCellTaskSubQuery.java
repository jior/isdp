package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class MyCellTaskSubQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String tasksId;
	protected String tasksIdLike;
	protected List<String> tasksIds;
	protected String busiessId;
	protected String busiessIdLike;
	protected List<String> busiessIds;
	protected Integer celldotIndex;
	protected Integer celldotIndexGreaterThanOrEqual;
	protected Integer celldotIndexLessThanOrEqual;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected Integer inttasktype;
	protected Integer inttasktypeGreaterThanOrEqual;
	protected Integer inttasktypeLessThanOrEqual;
	protected List<Integer> inttasktypes;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String snameLike;
	protected Integer intistasks;
	protected Integer intistasksGreaterThanOrEqual;
	protected Integer intistasksLessThanOrEqual;
	protected List<Integer> intistaskss;
	protected Integer intprojprocess;
	protected Integer intprojprocessGreaterThanOrEqual;
	protected Integer intprojprocessLessThanOrEqual;
	protected List<Integer> intprojprocesss;
	protected Integer intistype;
	protected Integer intistypeGreaterThanOrEqual;
	protected Integer intistypeLessThanOrEqual;
	protected List<Integer> intistypes;
	protected String nameTabLike;
	protected String flowid;
	protected String flowidLike;
	protected List<String> flowids;
	protected String constrLike;
	

	public MyCellTaskSubQuery() {

	}

	public MyCellTaskSubQuery busiessId(String busiessId) {
		if (busiessId == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessId = busiessId;
		return this;
	}

	public MyCellTaskSubQuery busiessIdLike(String busiessIdLike) {
		if (busiessIdLike == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessIdLike = busiessIdLike;
		return this;
	}

	public MyCellTaskSubQuery busiessIds(List<String> busiessIds) {
		if (busiessIds == null) {
			throw new RuntimeException("busiessIds is empty ");
		}
		this.busiessIds = busiessIds;
		return this;
	}

	public MyCellTaskSubQuery celldotIndex(Integer celldotIndex) {
		if (celldotIndex == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndex = celldotIndex;
		return this;
	}

	public MyCellTaskSubQuery celldotIndexGreaterThanOrEqual(
			Integer celldotIndexGreaterThanOrEqual) {
		if (celldotIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndexGreaterThanOrEqual = celldotIndexGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery celldotIndexLessThanOrEqual(
			Integer celldotIndexLessThanOrEqual) {
		if (celldotIndexLessThanOrEqual == null) {
			throw new RuntimeException("celldotIndex is null");
		}
		this.celldotIndexLessThanOrEqual = celldotIndexLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery constrLike(String constrLike) {
		if (constrLike == null) {
			throw new RuntimeException("constr is null");
		}
		this.constrLike = constrLike;
		return this;
	}

	public MyCellTaskSubQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public MyCellTaskSubQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public MyCellTaskSubQuery flowid(String flowid) {
		if (flowid == null) {
			throw new RuntimeException("flowid is null");
		}
		this.flowid = flowid;
		return this;
	}

	public MyCellTaskSubQuery flowidLike(String flowidLike) {
		if (flowidLike == null) {
			throw new RuntimeException("flowid is null");
		}
		this.flowidLike = flowidLike;
		return this;
	}

	public MyCellTaskSubQuery flowids(List<String> flowids) {
		if (flowids == null) {
			throw new RuntimeException("flowids is empty ");
		}
		this.flowids = flowids;
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

	public String getConstrLike() {
		if (constrLike != null && constrLike.trim().length() > 0) {
			if (!constrLike.startsWith("%")) {
				constrLike = "%" + constrLike;
			}
			if (!constrLike.endsWith("%")) {
				constrLike = constrLike + "%";
			}
		}
		return constrLike;
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

	public String getFlowid() {
		return flowid;
	}

	public String getFlowidLike() {
		if (flowidLike != null && flowidLike.trim().length() > 0) {
			if (!flowidLike.startsWith("%")) {
				flowidLike = "%" + flowidLike;
			}
			if (!flowidLike.endsWith("%")) {
				flowidLike = flowidLike + "%";
			}
		}
		return flowidLike;
	}

	public List<String> getFlowids() {
		return flowids;
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

	public Integer getIntistasks() {
		return intistasks;
	}

	public Integer getIntistasksGreaterThanOrEqual() {
		return intistasksGreaterThanOrEqual;
	}

	public Integer getIntistasksLessThanOrEqual() {
		return intistasksLessThanOrEqual;
	}

	public List<Integer> getIntistaskss() {
		return intistaskss;
	}

	public Integer getIntistype() {
		return intistype;
	}

	public Integer getIntistypeGreaterThanOrEqual() {
		return intistypeGreaterThanOrEqual;
	}

	public Integer getIntistypeLessThanOrEqual() {
		return intistypeLessThanOrEqual;
	}

	public List<Integer> getIntistypes() {
		return intistypes;
	}

	public Integer getIntprojprocess() {
		return intprojprocess;
	}

	public Integer getIntprojprocessGreaterThanOrEqual() {
		return intprojprocessGreaterThanOrEqual;
	}

	public Integer getIntprojprocessLessThanOrEqual() {
		return intprojprocessLessThanOrEqual;
	}

	public List<Integer> getIntprojprocesss() {
		return intprojprocesss;
	}

	public Integer getInttasktype() {
		return inttasktype;
	}

	public Integer getInttasktypeGreaterThanOrEqual() {
		return inttasktypeGreaterThanOrEqual;
	}

	public Integer getInttasktypeLessThanOrEqual() {
		return inttasktypeLessThanOrEqual;
	}

	public List<Integer> getInttasktypes() {
		return inttasktypes;
	}

	public String getNameTabLike() {
		if (nameTabLike != null && nameTabLike.trim().length() > 0) {
			if (!nameTabLike.startsWith("%")) {
				nameTabLike = "%" + nameTabLike;
			}
			if (!nameTabLike.endsWith("%")) {
				nameTabLike = nameTabLike + "%";
			}
		}
		return nameTabLike;
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

	public String getTasksId() {
		return tasksId;
	}

	public String getTasksIdLike() {
		if (tasksIdLike != null && tasksIdLike.trim().length() > 0) {
			if (!tasksIdLike.startsWith("%")) {
				tasksIdLike = "%" + tasksIdLike;
			}
			if (!tasksIdLike.endsWith("%")) {
				tasksIdLike = tasksIdLike + "%";
			}
		}
		return tasksIdLike;
	}

	public List<String> getTasksIds() {
		return tasksIds;
	}

	public MyCellTaskSubQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public MyCellTaskSubQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery indexIds(List<Integer> indexIds) {
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
		addColumn("tasksId", "tasks_id");
		addColumn("busiessId", "busiess_id");
		addColumn("celldotIndex", "celldot_index");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("inttasktype", "inttasktype");
		addColumn("indexId", "index_id");
		addColumn("sname", "sname");
		addColumn("intistasks", "intistasks");
		addColumn("intprojprocess", "intprojprocess");
		addColumn("intistype", "intistype");
		addColumn("nameTab", "name_tab");
		addColumn("flowid", "flowid");
		addColumn("constr", "constr");
	}

	public MyCellTaskSubQuery intistasks(Integer intistasks) {
		if (intistasks == null) {
			throw new RuntimeException("intistasks is null");
		}
		this.intistasks = intistasks;
		return this;
	}

	public MyCellTaskSubQuery intistasksGreaterThanOrEqual(
			Integer intistasksGreaterThanOrEqual) {
		if (intistasksGreaterThanOrEqual == null) {
			throw new RuntimeException("intistasks is null");
		}
		this.intistasksGreaterThanOrEqual = intistasksGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intistasksLessThanOrEqual(
			Integer intistasksLessThanOrEqual) {
		if (intistasksLessThanOrEqual == null) {
			throw new RuntimeException("intistasks is null");
		}
		this.intistasksLessThanOrEqual = intistasksLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intistaskss(List<Integer> intistaskss) {
		if (intistaskss == null) {
			throw new RuntimeException("intistaskss is empty ");
		}
		this.intistaskss = intistaskss;
		return this;
	}

	public MyCellTaskSubQuery intistype(Integer intistype) {
		if (intistype == null) {
			throw new RuntimeException("intistype is null");
		}
		this.intistype = intistype;
		return this;
	}

	public MyCellTaskSubQuery intistypeGreaterThanOrEqual(
			Integer intistypeGreaterThanOrEqual) {
		if (intistypeGreaterThanOrEqual == null) {
			throw new RuntimeException("intistype is null");
		}
		this.intistypeGreaterThanOrEqual = intistypeGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intistypeLessThanOrEqual(
			Integer intistypeLessThanOrEqual) {
		if (intistypeLessThanOrEqual == null) {
			throw new RuntimeException("intistype is null");
		}
		this.intistypeLessThanOrEqual = intistypeLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intistypes(List<Integer> intistypes) {
		if (intistypes == null) {
			throw new RuntimeException("intistypes is empty ");
		}
		this.intistypes = intistypes;
		return this;
	}

	public MyCellTaskSubQuery intprojprocess(Integer intprojprocess) {
		if (intprojprocess == null) {
			throw new RuntimeException("intprojprocess is null");
		}
		this.intprojprocess = intprojprocess;
		return this;
	}

	public MyCellTaskSubQuery intprojprocessGreaterThanOrEqual(
			Integer intprojprocessGreaterThanOrEqual) {
		if (intprojprocessGreaterThanOrEqual == null) {
			throw new RuntimeException("intprojprocess is null");
		}
		this.intprojprocessGreaterThanOrEqual = intprojprocessGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intprojprocessLessThanOrEqual(
			Integer intprojprocessLessThanOrEqual) {
		if (intprojprocessLessThanOrEqual == null) {
			throw new RuntimeException("intprojprocess is null");
		}
		this.intprojprocessLessThanOrEqual = intprojprocessLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery intprojprocesss(List<Integer> intprojprocesss) {
		if (intprojprocesss == null) {
			throw new RuntimeException("intprojprocesss is empty ");
		}
		this.intprojprocesss = intprojprocesss;
		return this;
	}

	public MyCellTaskSubQuery inttasktype(Integer inttasktype) {
		if (inttasktype == null) {
			throw new RuntimeException("inttasktype is null");
		}
		this.inttasktype = inttasktype;
		return this;
	}

	public MyCellTaskSubQuery inttasktypeGreaterThanOrEqual(
			Integer inttasktypeGreaterThanOrEqual) {
		if (inttasktypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttasktype is null");
		}
		this.inttasktypeGreaterThanOrEqual = inttasktypeGreaterThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery inttasktypeLessThanOrEqual(
			Integer inttasktypeLessThanOrEqual) {
		if (inttasktypeLessThanOrEqual == null) {
			throw new RuntimeException("inttasktype is null");
		}
		this.inttasktypeLessThanOrEqual = inttasktypeLessThanOrEqual;
		return this;
	}

	public MyCellTaskSubQuery inttasktypes(List<Integer> inttasktypes) {
		if (inttasktypes == null) {
			throw new RuntimeException("inttasktypes is empty ");
		}
		this.inttasktypes = inttasktypes;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public MyCellTaskSubQuery nameTabLike(String nameTabLike) {
		if (nameTabLike == null) {
			throw new RuntimeException("nameTab is null");
		}
		this.nameTabLike = nameTabLike;
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

	public void setConstrLike(String constrLike) {
		this.constrLike = constrLike;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFiledotFileidLike(String filedotFileidLike) {
		this.filedotFileidLike = filedotFileidLike;
	}

	public void setFlowid(String flowid) {
		this.flowid = flowid;
	}

	public void setFlowidLike(String flowidLike) {
		this.flowidLike = flowidLike;
	}

	public void setFlowids(List<String> flowids) {
		this.flowids = flowids;
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

	public void setIntistasks(Integer intistasks) {
		this.intistasks = intistasks;
	}

	public void setIntistasksGreaterThanOrEqual(
			Integer intistasksGreaterThanOrEqual) {
		this.intistasksGreaterThanOrEqual = intistasksGreaterThanOrEqual;
	}

	public void setIntistasksLessThanOrEqual(Integer intistasksLessThanOrEqual) {
		this.intistasksLessThanOrEqual = intistasksLessThanOrEqual;
	}

	public void setIntistaskss(List<Integer> intistaskss) {
		this.intistaskss = intistaskss;
	}

	public void setIntistype(Integer intistype) {
		this.intistype = intistype;
	}

	public void setIntistypeGreaterThanOrEqual(
			Integer intistypeGreaterThanOrEqual) {
		this.intistypeGreaterThanOrEqual = intistypeGreaterThanOrEqual;
	}

	public void setIntistypeLessThanOrEqual(Integer intistypeLessThanOrEqual) {
		this.intistypeLessThanOrEqual = intistypeLessThanOrEqual;
	}

	public void setIntistypes(List<Integer> intistypes) {
		this.intistypes = intistypes;
	}

	public void setIntprojprocess(Integer intprojprocess) {
		this.intprojprocess = intprojprocess;
	}

	public void setIntprojprocessGreaterThanOrEqual(
			Integer intprojprocessGreaterThanOrEqual) {
		this.intprojprocessGreaterThanOrEqual = intprojprocessGreaterThanOrEqual;
	}

	public void setIntprojprocessLessThanOrEqual(
			Integer intprojprocessLessThanOrEqual) {
		this.intprojprocessLessThanOrEqual = intprojprocessLessThanOrEqual;
	}

	public void setIntprojprocesss(List<Integer> intprojprocesss) {
		this.intprojprocesss = intprojprocesss;
	}

	public void setInttasktype(Integer inttasktype) {
		this.inttasktype = inttasktype;
	}

	public void setInttasktypeGreaterThanOrEqual(
			Integer inttasktypeGreaterThanOrEqual) {
		this.inttasktypeGreaterThanOrEqual = inttasktypeGreaterThanOrEqual;
	}

	public void setInttasktypeLessThanOrEqual(Integer inttasktypeLessThanOrEqual) {
		this.inttasktypeLessThanOrEqual = inttasktypeLessThanOrEqual;
	}

	public void setInttasktypes(List<Integer> inttasktypes) {
		this.inttasktypes = inttasktypes;
	}

	public void setNameTabLike(String nameTabLike) {
		this.nameTabLike = nameTabLike;
	}

	public void setSnameLike(String snameLike) {
		this.snameLike = snameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTasksId(String tasksId) {
		this.tasksId = tasksId;
	}

	public void setTasksIdLike(String tasksIdLike) {
		this.tasksIdLike = tasksIdLike;
	}

	public void setTasksIds(List<String> tasksIds) {
		this.tasksIds = tasksIds;
	}

	public MyCellTaskSubQuery snameLike(String snameLike) {
		if (snameLike == null) {
			throw new RuntimeException("sname is null");
		}
		this.snameLike = snameLike;
		return this;
	}

	public MyCellTaskSubQuery tasksId(String tasksId) {
		if (tasksId == null) {
			throw new RuntimeException("tasksId is null");
		}
		this.tasksId = tasksId;
		return this;
	}

	public MyCellTaskSubQuery tasksIdLike(String tasksIdLike) {
		if (tasksIdLike == null) {
			throw new RuntimeException("tasksId is null");
		}
		this.tasksIdLike = tasksIdLike;
		return this;
	}

	public MyCellTaskSubQuery tasksIds(List<String> tasksIds) {
		if (tasksIds == null) {
			throw new RuntimeException("tasksIds is empty ");
		}
		this.tasksIds = tasksIds;
		return this;
	}

}