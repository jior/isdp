package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellMyTaskMainQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String taskId;
	protected String taskIdLike;
	protected List<String> taskIds;
	protected String nameLike;
	protected String projnameLike;
	protected Integer typeIndexId;
	protected Integer typeIndexIdGreaterThanOrEqual;
	protected Integer typeIndexIdLessThanOrEqual;
	protected List<Integer> typeIndexIds;
	protected Integer flagint;
	protected Integer flagintGreaterThanOrEqual;
	protected Integer flagintLessThanOrEqual;
	protected List<Integer> flagints;
	protected String mycellTasksId;
	protected String mycellTasksIdLike;
	protected List<String> mycellTasksIds;
	protected String fromtasksid;
	protected String fromtasksidLike;
	protected List<String> fromtasksids;
	protected String totaskid;
	protected String totaskidLike;
	protected List<String> totaskids;
	protected Integer intfinish;
	protected Integer intfinishGreaterThanOrEqual;
	protected Integer intfinishLessThanOrEqual;
	protected List<Integer> intfinishs;
	protected String typeTablename;
	protected String typeTablenameLike;
	protected List<String> typeTablenames;
	protected String typeId;
	protected String typeIdLike;
	protected List<String> typeIds;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected String netroleid;
	protected String netroleidLike;
	protected List<String> netroleids;
	protected Integer intisflow;
	protected Integer intisflowGreaterThanOrEqual;
	protected Integer intisflowLessThanOrEqual;
	protected List<Integer> intisflows;
	protected Integer intStop;
	protected Integer intStopGreaterThanOrEqual;
	protected Integer intStopLessThanOrEqual;
	protected List<Integer> intStops;
	protected Integer filetypeIndex;
	protected Integer filetypeIndexGreaterThanOrEqual;
	protected Integer filetypeIndexLessThanOrEqual;
	protected List<Integer> filetypeIndexs;
	

	public CellMyTaskMainQuery() {

	}

	public CellMyTaskMainQuery ctimeGreaterThanOrEqual(
			Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery filetypeIndex(Integer filetypeIndex) {
		if (filetypeIndex == null) {
			throw new RuntimeException("filetypeIndex is null");
		}
		this.filetypeIndex = filetypeIndex;
		return this;
	}

	public CellMyTaskMainQuery filetypeIndexGreaterThanOrEqual(
			Integer filetypeIndexGreaterThanOrEqual) {
		if (filetypeIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("filetypeIndex is null");
		}
		this.filetypeIndexGreaterThanOrEqual = filetypeIndexGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery filetypeIndexLessThanOrEqual(
			Integer filetypeIndexLessThanOrEqual) {
		if (filetypeIndexLessThanOrEqual == null) {
			throw new RuntimeException("filetypeIndex is null");
		}
		this.filetypeIndexLessThanOrEqual = filetypeIndexLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery filetypeIndexs(List<Integer> filetypeIndexs) {
		if (filetypeIndexs == null) {
			throw new RuntimeException("filetypeIndexs is empty ");
		}
		this.filetypeIndexs = filetypeIndexs;
		return this;
	}

	public CellMyTaskMainQuery flagint(Integer flagint) {
		if (flagint == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagint = flagint;
		return this;
	}

	public CellMyTaskMainQuery flagintGreaterThanOrEqual(
			Integer flagintGreaterThanOrEqual) {
		if (flagintGreaterThanOrEqual == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagintGreaterThanOrEqual = flagintGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery flagintLessThanOrEqual(
			Integer flagintLessThanOrEqual) {
		if (flagintLessThanOrEqual == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagintLessThanOrEqual = flagintLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery flagints(List<Integer> flagints) {
		if (flagints == null) {
			throw new RuntimeException("flagints is empty ");
		}
		this.flagints = flagints;
		return this;
	}

	public CellMyTaskMainQuery fromtasksid(String fromtasksid) {
		if (fromtasksid == null) {
			throw new RuntimeException("fromtasksid is null");
		}
		this.fromtasksid = fromtasksid;
		return this;
	}

	public CellMyTaskMainQuery fromtasksidLike(String fromtasksidLike) {
		if (fromtasksidLike == null) {
			throw new RuntimeException("fromtasksid is null");
		}
		this.fromtasksidLike = fromtasksidLike;
		return this;
	}

	public CellMyTaskMainQuery fromtasksids(List<String> fromtasksids) {
		if (fromtasksids == null) {
			throw new RuntimeException("fromtasksids is empty ");
		}
		this.fromtasksids = fromtasksids;
		return this;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public Integer getFiletypeIndex() {
		return filetypeIndex;
	}

	public Integer getFiletypeIndexGreaterThanOrEqual() {
		return filetypeIndexGreaterThanOrEqual;
	}

	public Integer getFiletypeIndexLessThanOrEqual() {
		return filetypeIndexLessThanOrEqual;
	}

	public List<Integer> getFiletypeIndexs() {
		return filetypeIndexs;
	}

	public Integer getFlagint() {
		return flagint;
	}

	public Integer getFlagintGreaterThanOrEqual() {
		return flagintGreaterThanOrEqual;
	}

	public Integer getFlagintLessThanOrEqual() {
		return flagintLessThanOrEqual;
	}

	public List<Integer> getFlagints() {
		return flagints;
	}

	public String getFromtasksid() {
		return fromtasksid;
	}

	public String getFromtasksidLike() {
		if (fromtasksidLike != null && fromtasksidLike.trim().length() > 0) {
			if (!fromtasksidLike.startsWith("%")) {
				fromtasksidLike = "%" + fromtasksidLike;
			}
			if (!fromtasksidLike.endsWith("%")) {
				fromtasksidLike = fromtasksidLike + "%";
			}
		}
		return fromtasksidLike;
	}

	public List<String> getFromtasksids() {
		return fromtasksids;
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

	public Integer getIntfinish() {
		return intfinish;
	}

	public Integer getIntfinishGreaterThanOrEqual() {
		return intfinishGreaterThanOrEqual;
	}

	public Integer getIntfinishLessThanOrEqual() {
		return intfinishLessThanOrEqual;
	}

	public List<Integer> getIntfinishs() {
		return intfinishs;
	}

	public Integer getIntisflow() {
		return intisflow;
	}

	public Integer getIntisflowGreaterThanOrEqual() {
		return intisflowGreaterThanOrEqual;
	}

	public Integer getIntisflowLessThanOrEqual() {
		return intisflowLessThanOrEqual;
	}

	public List<Integer> getIntisflows() {
		return intisflows;
	}

	public Integer getIntStop() {
		return intStop;
	}

	public Integer getIntStopGreaterThanOrEqual() {
		return intStopGreaterThanOrEqual;
	}

	public Integer getIntStopLessThanOrEqual() {
		return intStopLessThanOrEqual;
	}

	public List<Integer> getIntStops() {
		return intStops;
	}

	public String getMycellTasksId() {
		return mycellTasksId;
	}

	public String getMycellTasksIdLike() {
		if (mycellTasksIdLike != null && mycellTasksIdLike.trim().length() > 0) {
			if (!mycellTasksIdLike.startsWith("%")) {
				mycellTasksIdLike = "%" + mycellTasksIdLike;
			}
			if (!mycellTasksIdLike.endsWith("%")) {
				mycellTasksIdLike = mycellTasksIdLike + "%";
			}
		}
		return mycellTasksIdLike;
	}

	public List<String> getMycellTasksIds() {
		return mycellTasksIds;
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

	public String getNetroleid() {
		return netroleid;
	}

	public String getNetroleidLike() {
		if (netroleidLike != null && netroleidLike.trim().length() > 0) {
			if (!netroleidLike.startsWith("%")) {
				netroleidLike = "%" + netroleidLike;
			}
			if (!netroleidLike.endsWith("%")) {
				netroleidLike = netroleidLike + "%";
			}
		}
		return netroleidLike;
	}

	public List<String> getNetroleids() {
		return netroleids;
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

	public String getProjnameLike() {
		if (projnameLike != null && projnameLike.trim().length() > 0) {
			if (!projnameLike.startsWith("%")) {
				projnameLike = "%" + projnameLike;
			}
			if (!projnameLike.endsWith("%")) {
				projnameLike = projnameLike + "%";
			}
		}
		return projnameLike;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getTaskIdLike() {
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

	public List<String> getTaskIds() {
		return taskIds;
	}

	public String getTotaskid() {
		return totaskid;
	}

	public String getTotaskidLike() {
		if (totaskidLike != null && totaskidLike.trim().length() > 0) {
			if (!totaskidLike.startsWith("%")) {
				totaskidLike = "%" + totaskidLike;
			}
			if (!totaskidLike.endsWith("%")) {
				totaskidLike = totaskidLike + "%";
			}
		}
		return totaskidLike;
	}

	public List<String> getTotaskids() {
		return totaskids;
	}

	public String getTypeId() {
		return typeId;
	}

	public String getTypeIdLike() {
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

	public List<String> getTypeIds() {
		return typeIds;
	}

	public Integer getTypeIndexId() {
		return typeIndexId;
	}

	public Integer getTypeIndexIdGreaterThanOrEqual() {
		return typeIndexIdGreaterThanOrEqual;
	}

	public Integer getTypeIndexIdLessThanOrEqual() {
		return typeIndexIdLessThanOrEqual;
	}

	public List<Integer> getTypeIndexIds() {
		return typeIndexIds;
	}

	public String getTypeTablename() {
		return typeTablename;
	}

	public String getTypeTablenameLike() {
		if (typeTablenameLike != null && typeTablenameLike.trim().length() > 0) {
			if (!typeTablenameLike.startsWith("%")) {
				typeTablenameLike = "%" + typeTablenameLike;
			}
			if (!typeTablenameLike.endsWith("%")) {
				typeTablenameLike = typeTablenameLike + "%";
			}
		}
		return typeTablenameLike;
	}

	public List<String> getTypeTablenames() {
		return typeTablenames;
	}

	public String getUserid() {
		return userid;
	}

	public String getUseridLike() {
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

	public List<String> getUserids() {
		return userids;
	}

	public CellMyTaskMainQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellMyTaskMainQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery indexIds(List<Integer> indexIds) {
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
		addColumn("ctime", "ctime");
		addColumn("indexId", "index_id");
		addColumn("taskId", "Task_id");
		addColumn("name", "name");
		addColumn("projname", "projname");
		addColumn("listno", "listno");
		addColumn("typeIndexId", "type_index_id");
		addColumn("flagint", "flagint");
		addColumn("mycellTasksId", "mycell_tasks_id");
		addColumn("fromtasksid", "fromtasksid");
		addColumn("totaskid", "totaskid");
		addColumn("intfinish", "intfinish");
		addColumn("typeTablename", "type_tablename");
		addColumn("typeId", "type_id");
		addColumn("userid", "userid");
		addColumn("netroleid", "netroleid");
		addColumn("intisflow", "intisflow");
		addColumn("intStop", "intStop");
		addColumn("filetypeIndex", "filetype_index");
	}

	public CellMyTaskMainQuery intfinish(Integer intfinish) {
		if (intfinish == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinish = intfinish;
		return this;
	}

	public CellMyTaskMainQuery intfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		if (intfinishGreaterThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intfinishLessThanOrEqual(
			Integer intfinishLessThanOrEqual) {
		if (intfinishLessThanOrEqual == null) {
			throw new RuntimeException("intfinish is null");
		}
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intfinishs(List<Integer> intfinishs) {
		if (intfinishs == null) {
			throw new RuntimeException("intfinishs is empty ");
		}
		this.intfinishs = intfinishs;
		return this;
	}

	public CellMyTaskMainQuery intisflow(Integer intisflow) {
		if (intisflow == null) {
			throw new RuntimeException("intisflow is null");
		}
		this.intisflow = intisflow;
		return this;
	}

	public CellMyTaskMainQuery intisflowGreaterThanOrEqual(
			Integer intisflowGreaterThanOrEqual) {
		if (intisflowGreaterThanOrEqual == null) {
			throw new RuntimeException("intisflow is null");
		}
		this.intisflowGreaterThanOrEqual = intisflowGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intisflowLessThanOrEqual(
			Integer intisflowLessThanOrEqual) {
		if (intisflowLessThanOrEqual == null) {
			throw new RuntimeException("intisflow is null");
		}
		this.intisflowLessThanOrEqual = intisflowLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intisflows(List<Integer> intisflows) {
		if (intisflows == null) {
			throw new RuntimeException("intisflows is empty ");
		}
		this.intisflows = intisflows;
		return this;
	}

	public CellMyTaskMainQuery intStop(Integer intStop) {
		if (intStop == null) {
			throw new RuntimeException("intStop is null");
		}
		this.intStop = intStop;
		return this;
	}

	public CellMyTaskMainQuery intStopGreaterThanOrEqual(
			Integer intStopGreaterThanOrEqual) {
		if (intStopGreaterThanOrEqual == null) {
			throw new RuntimeException("intStop is null");
		}
		this.intStopGreaterThanOrEqual = intStopGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intStopLessThanOrEqual(
			Integer intStopLessThanOrEqual) {
		if (intStopLessThanOrEqual == null) {
			throw new RuntimeException("intStop is null");
		}
		this.intStopLessThanOrEqual = intStopLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery intStops(List<Integer> intStops) {
		if (intStops == null) {
			throw new RuntimeException("intStops is empty ");
		}
		this.intStops = intStops;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellMyTaskMainQuery mycellTasksId(String mycellTasksId) {
		if (mycellTasksId == null) {
			throw new RuntimeException("mycellTasksId is null");
		}
		this.mycellTasksId = mycellTasksId;
		return this;
	}

	public CellMyTaskMainQuery mycellTasksIdLike(String mycellTasksIdLike) {
		if (mycellTasksIdLike == null) {
			throw new RuntimeException("mycellTasksId is null");
		}
		this.mycellTasksIdLike = mycellTasksIdLike;
		return this;
	}

	public CellMyTaskMainQuery mycellTasksIds(List<String> mycellTasksIds) {
		if (mycellTasksIds == null) {
			throw new RuntimeException("mycellTasksIds is empty ");
		}
		this.mycellTasksIds = mycellTasksIds;
		return this;
	}

	public CellMyTaskMainQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellMyTaskMainQuery netroleid(String netroleid) {
		if (netroleid == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleid = netroleid;
		return this;
	}

	public CellMyTaskMainQuery netroleidLike(String netroleidLike) {
		if (netroleidLike == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleidLike = netroleidLike;
		return this;
	}

	public CellMyTaskMainQuery netroleids(List<String> netroleids) {
		if (netroleids == null) {
			throw new RuntimeException("netroleids is empty ");
		}
		this.netroleids = netroleids;
		return this;
	}

	public CellMyTaskMainQuery projnameLike(String projnameLike) {
		if (projnameLike == null) {
			throw new RuntimeException("projname is null");
		}
		this.projnameLike = projnameLike;
		return this;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setFiletypeIndex(Integer filetypeIndex) {
		this.filetypeIndex = filetypeIndex;
	}

	public void setFiletypeIndexGreaterThanOrEqual(
			Integer filetypeIndexGreaterThanOrEqual) {
		this.filetypeIndexGreaterThanOrEqual = filetypeIndexGreaterThanOrEqual;
	}

	public void setFiletypeIndexLessThanOrEqual(
			Integer filetypeIndexLessThanOrEqual) {
		this.filetypeIndexLessThanOrEqual = filetypeIndexLessThanOrEqual;
	}

	public void setFiletypeIndexs(List<Integer> filetypeIndexs) {
		this.filetypeIndexs = filetypeIndexs;
	}

	public void setFlagint(Integer flagint) {
		this.flagint = flagint;
	}

	public void setFlagintGreaterThanOrEqual(Integer flagintGreaterThanOrEqual) {
		this.flagintGreaterThanOrEqual = flagintGreaterThanOrEqual;
	}

	public void setFlagintLessThanOrEqual(Integer flagintLessThanOrEqual) {
		this.flagintLessThanOrEqual = flagintLessThanOrEqual;
	}

	public void setFlagints(List<Integer> flagints) {
		this.flagints = flagints;
	}

	public void setFromtasksid(String fromtasksid) {
		this.fromtasksid = fromtasksid;
	}

	public void setFromtasksidLike(String fromtasksidLike) {
		this.fromtasksidLike = fromtasksidLike;
	}

	public void setFromtasksids(List<String> fromtasksids) {
		this.fromtasksids = fromtasksids;
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

	public void setIntfinish(Integer intfinish) {
		this.intfinish = intfinish;
	}

	public void setIntfinishGreaterThanOrEqual(
			Integer intfinishGreaterThanOrEqual) {
		this.intfinishGreaterThanOrEqual = intfinishGreaterThanOrEqual;
	}

	public void setIntfinishLessThanOrEqual(Integer intfinishLessThanOrEqual) {
		this.intfinishLessThanOrEqual = intfinishLessThanOrEqual;
	}

	public void setIntfinishs(List<Integer> intfinishs) {
		this.intfinishs = intfinishs;
	}

	public void setIntisflow(Integer intisflow) {
		this.intisflow = intisflow;
	}

	public void setIntisflowGreaterThanOrEqual(
			Integer intisflowGreaterThanOrEqual) {
		this.intisflowGreaterThanOrEqual = intisflowGreaterThanOrEqual;
	}

	public void setIntisflowLessThanOrEqual(Integer intisflowLessThanOrEqual) {
		this.intisflowLessThanOrEqual = intisflowLessThanOrEqual;
	}

	public void setIntisflows(List<Integer> intisflows) {
		this.intisflows = intisflows;
	}

	public void setIntStop(Integer intStop) {
		this.intStop = intStop;
	}

	public void setIntStopGreaterThanOrEqual(Integer intStopGreaterThanOrEqual) {
		this.intStopGreaterThanOrEqual = intStopGreaterThanOrEqual;
	}

	public void setIntStopLessThanOrEqual(Integer intStopLessThanOrEqual) {
		this.intStopLessThanOrEqual = intStopLessThanOrEqual;
	}

	public void setIntStops(List<Integer> intStops) {
		this.intStops = intStops;
	}

	public void setMycellTasksId(String mycellTasksId) {
		this.mycellTasksId = mycellTasksId;
	}

	public void setMycellTasksIdLike(String mycellTasksIdLike) {
		this.mycellTasksIdLike = mycellTasksIdLike;
	}

	public void setMycellTasksIds(List<String> mycellTasksIds) {
		this.mycellTasksIds = mycellTasksIds;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNetroleid(String netroleid) {
		this.netroleid = netroleid;
	}

	public void setNetroleidLike(String netroleidLike) {
		this.netroleidLike = netroleidLike;
	}

	public void setNetroleids(List<String> netroleids) {
		this.netroleids = netroleids;
	}

	public void setProjnameLike(String projnameLike) {
		this.projnameLike = projnameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setTaskIdLike(String taskIdLike) {
		this.taskIdLike = taskIdLike;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

	public void setTotaskid(String totaskid) {
		this.totaskid = totaskid;
	}

	public void setTotaskidLike(String totaskidLike) {
		this.totaskidLike = totaskidLike;
	}

	public void setTotaskids(List<String> totaskids) {
		this.totaskids = totaskids;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public void setTypeIdLike(String typeIdLike) {
		this.typeIdLike = typeIdLike;
	}

	public void setTypeIds(List<String> typeIds) {
		this.typeIds = typeIds;
	}

	public void setTypeIndexId(Integer typeIndexId) {
		this.typeIndexId = typeIndexId;
	}

	public void setTypeIndexIdGreaterThanOrEqual(
			Integer typeIndexIdGreaterThanOrEqual) {
		this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
	}

	public void setTypeIndexIdLessThanOrEqual(Integer typeIndexIdLessThanOrEqual) {
		this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
	}

	public void setTypeIndexIds(List<Integer> typeIndexIds) {
		this.typeIndexIds = typeIndexIds;
	}

	public void setTypeTablename(String typeTablename) {
		this.typeTablename = typeTablename;
	}

	public void setTypeTablenameLike(String typeTablenameLike) {
		this.typeTablenameLike = typeTablenameLike;
	}

	public void setTypeTablenames(List<String> typeTablenames) {
		this.typeTablenames = typeTablenames;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUseridLike(String useridLike) {
		this.useridLike = useridLike;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
	}

	public CellMyTaskMainQuery taskId(String taskId) {
		if (taskId == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskId = taskId;
		return this;
	}

	public CellMyTaskMainQuery taskIdLike(String taskIdLike) {
		if (taskIdLike == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskIdLike = taskIdLike;
		return this;
	}

	public CellMyTaskMainQuery taskIds(List<String> taskIds) {
		if (taskIds == null) {
			throw new RuntimeException("taskIds is empty ");
		}
		this.taskIds = taskIds;
		return this;
	}

	public CellMyTaskMainQuery totaskid(String totaskid) {
		if (totaskid == null) {
			throw new RuntimeException("totaskid is null");
		}
		this.totaskid = totaskid;
		return this;
	}

	public CellMyTaskMainQuery totaskidLike(String totaskidLike) {
		if (totaskidLike == null) {
			throw new RuntimeException("totaskid is null");
		}
		this.totaskidLike = totaskidLike;
		return this;
	}

	public CellMyTaskMainQuery totaskids(List<String> totaskids) {
		if (totaskids == null) {
			throw new RuntimeException("totaskids is empty ");
		}
		this.totaskids = totaskids;
		return this;
	}

	public CellMyTaskMainQuery typeId(String typeId) {
		if (typeId == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeId = typeId;
		return this;
	}

	public CellMyTaskMainQuery typeIdLike(String typeIdLike) {
		if (typeIdLike == null) {
			throw new RuntimeException("typeId is null");
		}
		this.typeIdLike = typeIdLike;
		return this;
	}

	public CellMyTaskMainQuery typeIds(List<String> typeIds) {
		if (typeIds == null) {
			throw new RuntimeException("typeIds is empty ");
		}
		this.typeIds = typeIds;
		return this;
	}

	public CellMyTaskMainQuery typeIndexId(Integer typeIndexId) {
		if (typeIndexId == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexId = typeIndexId;
		return this;
	}

	public CellMyTaskMainQuery typeIndexIdGreaterThanOrEqual(
			Integer typeIndexIdGreaterThanOrEqual) {
		if (typeIndexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery typeIndexIdLessThanOrEqual(
			Integer typeIndexIdLessThanOrEqual) {
		if (typeIndexIdLessThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
		return this;
	}

	public CellMyTaskMainQuery typeIndexIds(List<Integer> typeIndexIds) {
		if (typeIndexIds == null) {
			throw new RuntimeException("typeIndexIds is empty ");
		}
		this.typeIndexIds = typeIndexIds;
		return this;
	}

	public CellMyTaskMainQuery typeTablename(String typeTablename) {
		if (typeTablename == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablename = typeTablename;
		return this;
	}

	public CellMyTaskMainQuery typeTablenameLike(String typeTablenameLike) {
		if (typeTablenameLike == null) {
			throw new RuntimeException("typeTablename is null");
		}
		this.typeTablenameLike = typeTablenameLike;
		return this;
	}

	public CellMyTaskMainQuery typeTablenames(List<String> typeTablenames) {
		if (typeTablenames == null) {
			throw new RuntimeException("typeTablenames is empty ");
		}
		this.typeTablenames = typeTablenames;
		return this;
	}

	public CellMyTaskMainQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public CellMyTaskMainQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public CellMyTaskMainQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

}