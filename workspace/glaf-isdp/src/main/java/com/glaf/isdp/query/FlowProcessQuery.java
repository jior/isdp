package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FlowProcessQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processDefId;
	protected String processDefIdLike;
	protected List<String> processDefIds;
	protected String mainId;
	protected String mainIdLike;
	protected List<String> mainIds;
	protected String fileid;
	protected String fileidLike;
	protected List<String> fileids;
	protected String nameLike;
	protected String contentLike;
	protected String actor;
	protected String actorLike;
	protected List<String> actors;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected String version;
	protected String versionLike;
	protected Integer state;
	protected Integer stateGreaterThanOrEqual;
	protected Integer stateLessThanOrEqual;
	protected List<Integer> states;
	

	public FlowProcessQuery() {

	}

	public FlowProcessQuery actor(String actor) {
		if (actor == null) {
			throw new RuntimeException("actor is null");
		}
		this.actor = actor;
		return this;
	}

	public FlowProcessQuery actorLike(String actorLike) {
		if (actorLike == null) {
			throw new RuntimeException("actor is null");
		}
		this.actorLike = actorLike;
		return this;
	}

	public FlowProcessQuery actors(List<String> actors) {
		if (actors == null) {
			throw new RuntimeException("actors is empty ");
		}
		this.actors = actors;
		return this;
	}

	public FlowProcessQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public FlowProcessQuery ctimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public FlowProcessQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public FlowProcessQuery fileid(String fileid) {
		if (fileid == null) {
			throw new RuntimeException("fileid is null");
		}
		this.fileid = fileid;
		return this;
	}

	public FlowProcessQuery fileidLike(String fileidLike) {
		if (fileidLike == null) {
			throw new RuntimeException("fileid is null");
		}
		this.fileidLike = fileidLike;
		return this;
	}

	public FlowProcessQuery fileids(List<String> fileids) {
		if (fileids == null) {
			throw new RuntimeException("fileids is empty ");
		}
		this.fileids = fileids;
		return this;
	}

	public String getActor() {
		return actor;
	}

	public String getActorLike() {
		if (actorLike != null && actorLike.trim().length() > 0) {
			if (!actorLike.startsWith("%")) {
				actorLike = "%" + actorLike;
			}
			if (!actorLike.endsWith("%")) {
				actorLike = actorLike + "%";
			}
		}
		return actorLike;
	}

	public List<String> getActors() {
		return actors;
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

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public String getFileid() {
		return fileid;
	}

	public String getFileidLike() {
		if (fileidLike != null && fileidLike.trim().length() > 0) {
			if (!fileidLike.startsWith("%")) {
				fileidLike = "%" + fileidLike;
			}
			if (!fileidLike.endsWith("%")) {
				fileidLike = fileidLike + "%";
			}
		}
		return fileidLike;
	}

	public List<String> getFileids() {
		return fileids;
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

	public String getProcessDefId() {
		return processDefId;
	}

	public String getProcessDefIdLike() {
		if (processDefIdLike != null && processDefIdLike.trim().length() > 0) {
			if (!processDefIdLike.startsWith("%")) {
				processDefIdLike = "%" + processDefIdLike;
			}
			if (!processDefIdLike.endsWith("%")) {
				processDefIdLike = processDefIdLike + "%";
			}
		}
		return processDefIdLike;
	}

	public List<String> getProcessDefIds() {
		return processDefIds;
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

	public String getVersion() {
		return version;
	}

	public String getVersionLike() {
		if (versionLike != null && versionLike.trim().length() > 0) {
			if (!versionLike.startsWith("%")) {
				versionLike = "%" + versionLike;
			}
			if (!versionLike.endsWith("%")) {
				versionLike = versionLike + "%";
			}
		}
		return versionLike;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("processDefId", "process_d_id");
		addColumn("mainId", "main_id");
		addColumn("fileid", "fileid");
		addColumn("name", "name");
		addColumn("content", "content");
		addColumn("actor", "actor");
		addColumn("ctime", "ctime");
		addColumn("version", "version");
		addColumn("state", "state");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowProcessQuery mainId(String mainId) {
		if (mainId == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainId = mainId;
		return this;
	}

	public FlowProcessQuery mainIdLike(String mainIdLike) {
		if (mainIdLike == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainIdLike = mainIdLike;
		return this;
	}

	public FlowProcessQuery mainIds(List<String> mainIds) {
		if (mainIds == null) {
			throw new RuntimeException("mainIds is empty ");
		}
		this.mainIds = mainIds;
		return this;
	}

	public FlowProcessQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public FlowProcessQuery processDefId(String processDefId) {
		if (processDefId == null) {
			throw new RuntimeException("processDefId is null");
		}
		this.processDefId = processDefId;
		return this;
	}

	public FlowProcessQuery processDefIdLike(String processDefIdLike) {
		if (processDefIdLike == null) {
			throw new RuntimeException("processDefIdLike is null");
		}
		this.processDefIdLike = processDefIdLike;
		return this;
	}

	public FlowProcessQuery processDefIds(List<String> processDefIds) {
		if (processDefIds == null) {
			throw new RuntimeException("processDefIds is empty ");
		}
		this.processDefIds = processDefIds;
		return this;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public void setActorLike(String actorLike) {
		this.actorLike = actorLike;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public void setFileidLike(String fileidLike) {
		this.fileidLike = fileidLike;
	}

	public void setFileids(List<String> fileids) {
		this.fileids = fileids;
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

	public void setProcessDefId(String processDefId) {
		this.processDefId = processDefId;
	}

	public void setProcessDefIdLike(String processDefIdLike) {
		this.processDefIdLike = processDefIdLike;
	}

	public void setProcessDefIds(List<String> processDefIds) {
		this.processDefIds = processDefIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	public void setVersion(String version) {
		this.version = version;
	}

	public void setVersionLike(String versionLike) {
		this.versionLike = versionLike;
	}

	public FlowProcessQuery state(Integer state) {
		if (state == null) {
			throw new RuntimeException("state is null");
		}
		this.state = state;
		return this;
	}

	public FlowProcessQuery stateGreaterThanOrEqual(
			Integer stateGreaterThanOrEqual) {
		if (stateGreaterThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateGreaterThanOrEqual = stateGreaterThanOrEqual;
		return this;
	}

	public FlowProcessQuery stateLessThanOrEqual(Integer stateLessThanOrEqual) {
		if (stateLessThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateLessThanOrEqual = stateLessThanOrEqual;
		return this;
	}

	public FlowProcessQuery states(List<Integer> states) {
		if (states == null) {
			throw new RuntimeException("states is empty ");
		}
		this.states = states;
		return this;
	}

	public FlowProcessQuery version(String version) {
		if (version == null) {
			throw new RuntimeException("version is null");
		}
		this.version = version;
		return this;
	}

	public FlowProcessQuery versionLike(String versionLike) {
		if (versionLike == null) {
			throw new RuntimeException("version is null");
		}
		this.versionLike = versionLike;
		return this;
	}

}