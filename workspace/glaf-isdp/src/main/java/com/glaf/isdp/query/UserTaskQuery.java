package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class UserTaskQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String nameLike;
	protected String indexNameLike;
	protected String activityId;
	protected List<String> activityIds;
	protected Integer parentIdNotEqual;
	protected Date startTimeGreaterThanOrEqual;
	protected Date startTimeLessThanOrEqual;
	protected Date endTimeGreaterThanOrEqual;
	protected Date endTimeLessThanOrEqual;
	protected Integer state;
	protected Integer stateGreaterThanOrEqual;
	protected Integer stateLessThanOrEqual;
	protected List<Integer> states;
	protected Integer timelimit;
	protected Integer timelimitGreaterThanOrEqual;
	protected Integer timelimitLessThanOrEqual;
	protected Long lastModifiedGreaterThanOrEqual;
	protected Long lastModifiedLessThanOrEqual;
	

	public UserTaskQuery() {

	}
	
	

	public Integer getParentIdNotEqual() {
		return parentIdNotEqual;
	}



	public void setParentIdNotEqual(Integer parentIdNotEqual) {
		this.parentIdNotEqual = parentIdNotEqual;
	}

	public UserTaskQuery parentIdNotEqual(Integer parentIdNotEqual) {
		if (parentIdNotEqual == null) {
			throw new RuntimeException("parentIdNotEqual is null");
		}
		this.parentIdNotEqual = parentIdNotEqual;
		return this;
	}

	public UserTaskQuery activityId(String activityId) {
		if (activityId == null) {
			throw new RuntimeException("activityId is null");
		}
		this.activityId = activityId;
		return this;
	}

	public UserTaskQuery activityIds(List<String> activityIds) {
		if (activityIds == null) {
			throw new RuntimeException("activityIds is empty ");
		}
		this.activityIds = activityIds;
		return this;
	}

	public UserTaskQuery actorId(String actorId) {
		if (actorId == null) {
			throw new RuntimeException("actorId is null");
		}
		this.actorId = actorId;
		return this;
	}

	public UserTaskQuery actorIds(List<String> actorIds) {
		if (actorIds == null) {
			throw new RuntimeException("actorIds is empty ");
		}
		this.actorIds = actorIds;
		return this;
	}

	public UserTaskQuery endTimeGreaterThanOrEqual(
			Date endTimeGreaterThanOrEqual) {
		if (endTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("endTime is null");
		}
		this.endTimeGreaterThanOrEqual = endTimeGreaterThanOrEqual;
		return this;
	}

	public UserTaskQuery endTimeLessThanOrEqual(Date endTimeLessThanOrEqual) {
		if (endTimeLessThanOrEqual == null) {
			throw new RuntimeException("endTime is null");
		}
		this.endTimeLessThanOrEqual = endTimeLessThanOrEqual;
		return this;
	}

	public String getActivityId() {
		return activityId;
	}

	public List<String> getActivityIds() {
		return activityIds;
	}

	public String getActorId() {
		return actorId;
	}

	public List<String> getActorIds() {
		return actorIds;
	}

	public Date getEndTimeGreaterThanOrEqual() {
		return endTimeGreaterThanOrEqual;
	}

	public Date getEndTimeLessThanOrEqual() {
		return endTimeLessThanOrEqual;
	}

	public String getIndexNameLike() {
		if (indexNameLike != null && indexNameLike.trim().length() > 0) {
			if (!indexNameLike.startsWith("%")) {
				indexNameLike = "%" + indexNameLike;
			}
			if (!indexNameLike.endsWith("%")) {
				indexNameLike = indexNameLike + "%";
			}
		}
		return indexNameLike;
	}

	public Long getLastModifiedGreaterThanOrEqual() {
		return lastModifiedGreaterThanOrEqual;
	}

	public Long getLastModifiedLessThanOrEqual() {
		return lastModifiedLessThanOrEqual;
	}

	public String getName() {
		return name;
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

	public Date getStartTimeGreaterThanOrEqual() {
		return startTimeGreaterThanOrEqual;
	}

	public Date getStartTimeLessThanOrEqual() {
		return startTimeLessThanOrEqual;
	}

	public Integer getState() {
		return state;
	}

	public Integer getStateGreaterThanOrEqual() {
		return stateGreaterThanOrEqual;
	}

	public Integer getStateLessThanOrEqual() {
		return stateLessThanOrEqual;
	}

	public List<Integer> getStates() {
		return states;
	}

	public Integer getTimelimit() {
		return timelimit;
	}

	public Integer getTimelimitGreaterThanOrEqual() {
		return timelimitGreaterThanOrEqual;
	}

	public Integer getTimelimitLessThanOrEqual() {
		return timelimitLessThanOrEqual;
	}

	public UserTaskQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID_");
		addColumn("parentId", "PARENTID_");
		addColumn("actorId", "ACTORID_");
		addColumn("name", "NAME_");
		addColumn("indexName", "INDEXNAME_");
		addColumn("activityId", "ACTIVITYID_");
		addColumn("startTime", "STARTTIME_");
		addColumn("endTime", "ENDTIME_");
		addColumn("state", "STATE_");
		addColumn("timelimit", "TIMELIMIT_");
		addColumn("lastModified", "LASTMODIFIED_");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public UserTaskQuery lastModifiedGreaterThanOrEqual(
			Long lastModifiedGreaterThanOrEqual) {
		if (lastModifiedGreaterThanOrEqual == null) {
			throw new RuntimeException("lastModified is null");
		}
		this.lastModifiedGreaterThanOrEqual = lastModifiedGreaterThanOrEqual;
		return this;
	}

	public UserTaskQuery lastModifiedLessThanOrEqual(
			Long lastModifiedLessThanOrEqual) {
		if (lastModifiedLessThanOrEqual == null) {
			throw new RuntimeException("lastModified is null");
		}
		this.lastModifiedLessThanOrEqual = lastModifiedLessThanOrEqual;
		return this;
	}

	public UserTaskQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public UserTaskQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public void setActivityIds(List<String> activityIds) {
		this.activityIds = activityIds;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public void setActorIds(List<String> actorIds) {
		this.actorIds = actorIds;
	}

	public void setEndTimeGreaterThanOrEqual(Date endTimeGreaterThanOrEqual) {
		this.endTimeGreaterThanOrEqual = endTimeGreaterThanOrEqual;
	}

	public void setEndTimeLessThanOrEqual(Date endTimeLessThanOrEqual) {
		this.endTimeLessThanOrEqual = endTimeLessThanOrEqual;
	}

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setLastModifiedGreaterThanOrEqual(
			Long lastModifiedGreaterThanOrEqual) {
		this.lastModifiedGreaterThanOrEqual = lastModifiedGreaterThanOrEqual;
	}

	public void setLastModifiedLessThanOrEqual(Long lastModifiedLessThanOrEqual) {
		this.lastModifiedLessThanOrEqual = lastModifiedLessThanOrEqual;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStartTimeGreaterThanOrEqual(Date startTimeGreaterThanOrEqual) {
		this.startTimeGreaterThanOrEqual = startTimeGreaterThanOrEqual;
	}

	public void setStartTimeLessThanOrEqual(Date startTimeLessThanOrEqual) {
		this.startTimeLessThanOrEqual = startTimeLessThanOrEqual;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public void setStateGreaterThanOrEqual(Integer stateGreaterThanOrEqual) {
		this.stateGreaterThanOrEqual = stateGreaterThanOrEqual;
	}

	public void setStateLessThanOrEqual(Integer stateLessThanOrEqual) {
		this.stateLessThanOrEqual = stateLessThanOrEqual;
	}

	public void setStates(List<Integer> states) {
		this.states = states;
	}

	public void setTimelimit(Integer timelimit) {
		this.timelimit = timelimit;
	}

	public void setTimelimitGreaterThanOrEqual(
			Integer timelimitGreaterThanOrEqual) {
		this.timelimitGreaterThanOrEqual = timelimitGreaterThanOrEqual;
	}

	public void setTimelimitLessThanOrEqual(Integer timelimitLessThanOrEqual) {
		this.timelimitLessThanOrEqual = timelimitLessThanOrEqual;
	}

	public UserTaskQuery startTimeGreaterThanOrEqual(
			Date startTimeGreaterThanOrEqual) {
		if (startTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("startTime is null");
		}
		this.startTimeGreaterThanOrEqual = startTimeGreaterThanOrEqual;
		return this;
	}

	public UserTaskQuery startTimeLessThanOrEqual(Date startTimeLessThanOrEqual) {
		if (startTimeLessThanOrEqual == null) {
			throw new RuntimeException("startTime is null");
		}
		this.startTimeLessThanOrEqual = startTimeLessThanOrEqual;
		return this;
	}

	public UserTaskQuery state(Integer state) {
		if (state == null) {
			throw new RuntimeException("state is null");
		}
		this.state = state;
		return this;
	}

	public UserTaskQuery stateGreaterThanOrEqual(Integer stateGreaterThanOrEqual) {
		if (stateGreaterThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateGreaterThanOrEqual = stateGreaterThanOrEqual;
		return this;
	}

	public UserTaskQuery stateLessThanOrEqual(Integer stateLessThanOrEqual) {
		if (stateLessThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateLessThanOrEqual = stateLessThanOrEqual;
		return this;
	}

	public UserTaskQuery states(List<Integer> states) {
		if (states == null) {
			throw new RuntimeException("states is empty ");
		}
		this.states = states;
		return this;
	}

	public UserTaskQuery timelimit(Integer timelimit) {
		if (timelimit == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimit = timelimit;
		return this;
	}

	public UserTaskQuery timelimitGreaterThanOrEqual(
			Integer timelimitGreaterThanOrEqual) {
		if (timelimitGreaterThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitGreaterThanOrEqual = timelimitGreaterThanOrEqual;
		return this;
	}

	public UserTaskQuery timelimitLessThanOrEqual(
			Integer timelimitLessThanOrEqual) {
		if (timelimitLessThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitLessThanOrEqual = timelimitLessThanOrEqual;
		return this;
	}

}