package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellMyTaskQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String topid;
	protected String topidLike;
	protected List<String> topids;
	protected String fillformId;
	protected String fillformIdLike;
	protected List<String> fillformIds;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String taskId;
	protected String taskIdLike;
	protected List<String> taskIds;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected String nameLike;
	protected String projnameLike;
	protected Integer typeIndexId;
	protected Integer typeIndexIdGreaterThanOrEqual;
	protected Integer typeIndexIdLessThanOrEqual;
	protected List<Integer> typeIndexIds;
	protected Integer finishint;
	protected Integer finishintGreaterThanOrEqual;
	protected Integer finishintLessThanOrEqual;
	protected List<Integer> finishints;
	protected Integer formtypeint;
	protected Integer formtypeintGreaterThanOrEqual;
	protected Integer formtypeintLessThanOrEqual;
	protected List<Integer> formtypeints;
	protected Integer flagint;
	protected Integer flagintGreaterThanOrEqual;
	protected Integer flagintLessThanOrEqual;
	protected List<Integer> flagints;
	protected Integer intinflow;
	protected Integer intinflowGreaterThanOrEqual;
	protected Integer intinflowLessThanOrEqual;
	protected List<Integer> intinflows;
	protected String mainId;
	protected String mainIdLike;
	protected List<String> mainIds;

	

	public CellMyTaskQuery() {

	}

	public CellMyTaskQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public CellMyTaskQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public CellMyTaskQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public CellMyTaskQuery fillformId(String fillformId) {
		if (fillformId == null) {
			throw new RuntimeException("fillformId is null");
		}
		this.fillformId = fillformId;
		return this;
	}

	public CellMyTaskQuery fillformIdLike(String fillformIdLike) {
		if (fillformIdLike == null) {
			throw new RuntimeException("fillformId is null");
		}
		this.fillformIdLike = fillformIdLike;
		return this;
	}

	public CellMyTaskQuery fillformIds(List<String> fillformIds) {
		if (fillformIds == null) {
			throw new RuntimeException("fillformIds is empty ");
		}
		this.fillformIds = fillformIds;
		return this;
	}

	public CellMyTaskQuery finishint(Integer finishint) {
		if (finishint == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishint = finishint;
		return this;
	}

	public CellMyTaskQuery finishintGreaterThanOrEqual(
			Integer finishintGreaterThanOrEqual) {
		if (finishintGreaterThanOrEqual == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishintGreaterThanOrEqual = finishintGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery finishintLessThanOrEqual(
			Integer finishintLessThanOrEqual) {
		if (finishintLessThanOrEqual == null) {
			throw new RuntimeException("finishint is null");
		}
		this.finishintLessThanOrEqual = finishintLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery finishints(List<Integer> finishints) {
		if (finishints == null) {
			throw new RuntimeException("finishints is empty ");
		}
		this.finishints = finishints;
		return this;
	}

	public CellMyTaskQuery flagint(Integer flagint) {
		if (flagint == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagint = flagint;
		return this;
	}

	public CellMyTaskQuery flagintGreaterThanOrEqual(
			Integer flagintGreaterThanOrEqual) {
		if (flagintGreaterThanOrEqual == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagintGreaterThanOrEqual = flagintGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery flagintLessThanOrEqual(Integer flagintLessThanOrEqual) {
		if (flagintLessThanOrEqual == null) {
			throw new RuntimeException("flagint is null");
		}
		this.flagintLessThanOrEqual = flagintLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery flagints(List<Integer> flagints) {
		if (flagints == null) {
			throw new RuntimeException("flagints is empty ");
		}
		this.flagints = flagints;
		return this;
	}

	public CellMyTaskQuery formtypeint(Integer formtypeint) {
		if (formtypeint == null) {
			throw new RuntimeException("formtypeint is null");
		}
		this.formtypeint = formtypeint;
		return this;
	}

	public CellMyTaskQuery formtypeintGreaterThanOrEqual(
			Integer formtypeintGreaterThanOrEqual) {
		if (formtypeintGreaterThanOrEqual == null) {
			throw new RuntimeException("formtypeint is null");
		}
		this.formtypeintGreaterThanOrEqual = formtypeintGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery formtypeintLessThanOrEqual(
			Integer formtypeintLessThanOrEqual) {
		if (formtypeintLessThanOrEqual == null) {
			throw new RuntimeException("formtypeint is null");
		}
		this.formtypeintLessThanOrEqual = formtypeintLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery formtypeints(List<Integer> formtypeints) {
		if (formtypeints == null) {
			throw new RuntimeException("formtypeints is empty ");
		}
		this.formtypeints = formtypeints;
		return this;
	}

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
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

	public String getFillformId() {
		return fillformId;
	}

	public String getFillformIdLike() {
		if (fillformIdLike != null && fillformIdLike.trim().length() > 0) {
			if (!fillformIdLike.startsWith("%")) {
				fillformIdLike = "%" + fillformIdLike;
			}
			if (!fillformIdLike.endsWith("%")) {
				fillformIdLike = fillformIdLike + "%";
			}
		}
		return fillformIdLike;
	}

	public List<String> getFillformIds() {
		return fillformIds;
	}

	public Integer getFinishint() {
		return finishint;
	}

	public Integer getFinishintGreaterThanOrEqual() {
		return finishintGreaterThanOrEqual;
	}

	public Integer getFinishintLessThanOrEqual() {
		return finishintLessThanOrEqual;
	}

	public List<Integer> getFinishints() {
		return finishints;
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

	public Integer getFormtypeint() {
		return formtypeint;
	}

	public Integer getFormtypeintGreaterThanOrEqual() {
		return formtypeintGreaterThanOrEqual;
	}

	public Integer getFormtypeintLessThanOrEqual() {
		return formtypeintLessThanOrEqual;
	}

	public List<Integer> getFormtypeints() {
		return formtypeints;
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

	public Integer getIntinflow() {
		return intinflow;
	}

	public Integer getIntinflowGreaterThanOrEqual() {
		return intinflowGreaterThanOrEqual;
	}

	public Integer getIntinflowLessThanOrEqual() {
		return intinflowLessThanOrEqual;
	}

	public List<Integer> getIntinflows() {
		return intinflows;
	}

	public String getMainId() {
		return mainId;
	}

	public String getMainIdLike() {
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

	public List<String> getMainIds() {
		return mainIds;
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

	public CellMyTaskQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellMyTaskQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery indexIdLessThanOrEqual(Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery indexIds(List<Integer> indexIds) {
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
		addColumn("topid", "topid");
		addColumn("fillformId", "fillform_id");
		addColumn("ctime", "ctime");
		addColumn("indexId", "index_id");
		addColumn("taskId", "Task_id");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("name", "name");
		addColumn("projname", "projname");
		addColumn("listno", "listno");
		addColumn("typeIndexId", "type_index_id");
		addColumn("page", "page");
		addColumn("finishint", "finishint");
		addColumn("formtypeint", "formtypeint");
		addColumn("flagint", "flagint");
		addColumn("intinflow", "intinflow");
		addColumn("mainId", "main_id");
		addColumn("intlastpage", "intlastpage");
	}

	public CellMyTaskQuery intinflow(Integer intinflow) {
		if (intinflow == null) {
			throw new RuntimeException("intinflow is null");
		}
		this.intinflow = intinflow;
		return this;
	}

	public CellMyTaskQuery intinflowGreaterThanOrEqual(
			Integer intinflowGreaterThanOrEqual) {
		if (intinflowGreaterThanOrEqual == null) {
			throw new RuntimeException("intinflow is null");
		}
		this.intinflowGreaterThanOrEqual = intinflowGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery intinflowLessThanOrEqual(
			Integer intinflowLessThanOrEqual) {
		if (intinflowLessThanOrEqual == null) {
			throw new RuntimeException("intinflow is null");
		}
		this.intinflowLessThanOrEqual = intinflowLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery intinflows(List<Integer> intinflows) {
		if (intinflows == null) {
			throw new RuntimeException("intinflows is empty ");
		}
		this.intinflows = intinflows;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellMyTaskQuery mainId(String mainId) {
		if (mainId == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainId = mainId;
		return this;
	}

	public CellMyTaskQuery mainIdLike(String mainIdLike) {
		if (mainIdLike == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainIdLike = mainIdLike;
		return this;
	}

	public CellMyTaskQuery mainIds(List<String> mainIds) {
		if (mainIds == null) {
			throw new RuntimeException("mainIds is empty ");
		}
		this.mainIds = mainIds;
		return this;
	}

	public CellMyTaskQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellMyTaskQuery projnameLike(String projnameLike) {
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

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFiledotFileidLike(String filedotFileidLike) {
		this.filedotFileidLike = filedotFileidLike;
	}

	public void setFiledotFileids(List<String> filedotFileids) {
		this.filedotFileids = filedotFileids;
	}

	public void setFillformId(String fillformId) {
		this.fillformId = fillformId;
	}

	public void setFillformIdLike(String fillformIdLike) {
		this.fillformIdLike = fillformIdLike;
	}

	public void setFillformIds(List<String> fillformIds) {
		this.fillformIds = fillformIds;
	}

	public void setFinishint(Integer finishint) {
		this.finishint = finishint;
	}

	public void setFinishintGreaterThanOrEqual(
			Integer finishintGreaterThanOrEqual) {
		this.finishintGreaterThanOrEqual = finishintGreaterThanOrEqual;
	}

	public void setFinishintLessThanOrEqual(Integer finishintLessThanOrEqual) {
		this.finishintLessThanOrEqual = finishintLessThanOrEqual;
	}

	public void setFinishints(List<Integer> finishints) {
		this.finishints = finishints;
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

	public void setFormtypeint(Integer formtypeint) {
		this.formtypeint = formtypeint;
	}

	public void setFormtypeintGreaterThanOrEqual(
			Integer formtypeintGreaterThanOrEqual) {
		this.formtypeintGreaterThanOrEqual = formtypeintGreaterThanOrEqual;
	}

	public void setFormtypeintLessThanOrEqual(Integer formtypeintLessThanOrEqual) {
		this.formtypeintLessThanOrEqual = formtypeintLessThanOrEqual;
	}

	public void setFormtypeints(List<Integer> formtypeints) {
		this.formtypeints = formtypeints;
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

	public void setIntinflow(Integer intinflow) {
		this.intinflow = intinflow;
	}

	public void setIntinflowGreaterThanOrEqual(
			Integer intinflowGreaterThanOrEqual) {
		this.intinflowGreaterThanOrEqual = intinflowGreaterThanOrEqual;
	}

	public void setIntinflowLessThanOrEqual(Integer intinflowLessThanOrEqual) {
		this.intinflowLessThanOrEqual = intinflowLessThanOrEqual;
	}

	public void setIntinflows(List<Integer> intinflows) {
		this.intinflows = intinflows;
	}

	public void setMainId(String mainId) {
		this.mainId = mainId;
	}

	public void setMainIdLike(String mainIdLike) {
		this.mainIdLike = mainIdLike;
	}

	public void setMainIds(List<String> mainIds) {
		this.mainIds = mainIds;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
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

	public void setTopid(String topid) {
		this.topid = topid;
	}

	public void setTopidLike(String topidLike) {
		this.topidLike = topidLike;
	}

	public void setTopids(List<String> topids) {
		this.topids = topids;
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

	public CellMyTaskQuery taskId(String taskId) {
		if (taskId == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskId = taskId;
		return this;
	}

	public CellMyTaskQuery taskIdLike(String taskIdLike) {
		if (taskIdLike == null) {
			throw new RuntimeException("taskId is null");
		}
		this.taskIdLike = taskIdLike;
		return this;
	}

	public CellMyTaskQuery taskIds(List<String> taskIds) {
		if (taskIds == null) {
			throw new RuntimeException("taskIds is empty ");
		}
		this.taskIds = taskIds;
		return this;
	}

	public CellMyTaskQuery topid(String topid) {
		if (topid == null) {
			throw new RuntimeException("topid is null");
		}
		this.topid = topid;
		return this;
	}

	public CellMyTaskQuery topidLike(String topidLike) {
		if (topidLike == null) {
			throw new RuntimeException("topid is null");
		}
		this.topidLike = topidLike;
		return this;
	}

	public CellMyTaskQuery topids(List<String> topids) {
		if (topids == null) {
			throw new RuntimeException("topids is empty ");
		}
		this.topids = topids;
		return this;
	}

	public CellMyTaskQuery typeIndexId(Integer typeIndexId) {
		if (typeIndexId == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexId = typeIndexId;
		return this;
	}

	public CellMyTaskQuery typeIndexIdGreaterThanOrEqual(
			Integer typeIndexIdGreaterThanOrEqual) {
		if (typeIndexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdGreaterThanOrEqual = typeIndexIdGreaterThanOrEqual;
		return this;
	}

	public CellMyTaskQuery typeIndexIdLessThanOrEqual(
			Integer typeIndexIdLessThanOrEqual) {
		if (typeIndexIdLessThanOrEqual == null) {
			throw new RuntimeException("typeIndexId is null");
		}
		this.typeIndexIdLessThanOrEqual = typeIndexIdLessThanOrEqual;
		return this;
	}

	public CellMyTaskQuery typeIndexIds(List<Integer> typeIndexIds) {
		if (typeIndexIds == null) {
			throw new RuntimeException("typeIndexIds is empty ");
		}
		this.typeIndexIds = typeIndexIds;
		return this;
	}

}