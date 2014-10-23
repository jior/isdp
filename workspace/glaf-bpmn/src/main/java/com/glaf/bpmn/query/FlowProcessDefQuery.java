/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.bpmn.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class FlowProcessDefQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
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
	protected Integer issave;
	protected Integer issaveGreaterThanOrEqual;
	protected Integer issaveLessThanOrEqual;
	protected Integer intflag;
	protected Integer intflagGreaterThanOrEqual;
	protected Integer intflagLessThanOrEqual;

	public FlowProcessDefQuery() {

	}

	public FlowProcessDefQuery actor(String actor) {
		if (actor == null) {
			throw new RuntimeException("actor is null");
		}
		this.actor = actor;
		return this;
	}

	public FlowProcessDefQuery actorLike(String actorLike) {
		if (actorLike == null) {
			throw new RuntimeException("actor is null");
		}
		this.actorLike = actorLike;
		return this;
	}

	public FlowProcessDefQuery actors(List<String> actors) {
		if (actors == null) {
			throw new RuntimeException("actors is empty ");
		}
		this.actors = actors;
		return this;
	}

	public FlowProcessDefQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public FlowProcessDefQuery ctimeGreaterThanOrEqual(
			Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public FlowProcessDefQuery ctimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public FlowProcessDefQuery fileid(String fileid) {
		if (fileid == null) {
			throw new RuntimeException("fileid is null");
		}
		this.fileid = fileid;
		return this;
	}

	public FlowProcessDefQuery fileidLike(String fileidLike) {
		if (fileidLike == null) {
			throw new RuntimeException("fileid is null");
		}
		this.fileidLike = fileidLike;
		return this;
	}

	public FlowProcessDefQuery fileids(List<String> fileids) {
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

	public Integer getIntflag() {
		return intflag;
	}

	public Integer getIntflagGreaterThanOrEqual() {
		return intflagGreaterThanOrEqual;
	}

	public Integer getIntflagLessThanOrEqual() {
		return intflagLessThanOrEqual;
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
			if (getSortOrder() != null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
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
		addColumn("mainId", "Main_id");
		addColumn("fileid", "fileid");
		addColumn("name", "name");
		addColumn("content", "content");
		addColumn("actor", "actor");
		addColumn("ctime", "ctime");
		addColumn("version", "version");
		addColumn("issave", "issave");
		addColumn("intflag", "intflag");
	}

	public FlowProcessDefQuery intflag(Integer intflag) {
		if (intflag == null) {
			throw new RuntimeException("intflag is null");
		}
		this.intflag = intflag;
		return this;
	}

	public FlowProcessDefQuery intflagGreaterThanOrEqual(
			Integer intflagGreaterThanOrEqual) {
		if (intflagGreaterThanOrEqual == null) {
			throw new RuntimeException("intflag is null");
		}
		this.intflagGreaterThanOrEqual = intflagGreaterThanOrEqual;
		return this;
	}

	public FlowProcessDefQuery intflagLessThanOrEqual(
			Integer intflagLessThanOrEqual) {
		if (intflagLessThanOrEqual == null) {
			throw new RuntimeException("intflag is null");
		}
		this.intflagLessThanOrEqual = intflagLessThanOrEqual;
		return this;
	}

	public FlowProcessDefQuery issave(Integer issave) {
		if (issave == null) {
			throw new RuntimeException("issave is null");
		}
		this.issave = issave;
		return this;
	}

	public FlowProcessDefQuery issaveGreaterThanOrEqual(
			Integer issaveGreaterThanOrEqual) {
		if (issaveGreaterThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
		return this;
	}

	public FlowProcessDefQuery issaveLessThanOrEqual(
			Integer issaveLessThanOrEqual) {
		if (issaveLessThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowProcessDefQuery mainId(String mainId) {
		if (mainId == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainId = mainId;
		return this;
	}

	public FlowProcessDefQuery mainIdLike(String mainIdLike) {
		if (mainIdLike == null) {
			throw new RuntimeException("mainId is null");
		}
		this.mainIdLike = mainIdLike;
		return this;
	}

	public FlowProcessDefQuery mainIds(List<String> mainIds) {
		if (mainIds == null) {
			throw new RuntimeException("mainIds is empty ");
		}
		this.mainIds = mainIds;
		return this;
	}

	public FlowProcessDefQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
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

	public void setIntflag(Integer intflag) {
		this.intflag = intflag;
	}

	public void setIntflagGreaterThanOrEqual(Integer intflagGreaterThanOrEqual) {
		this.intflagGreaterThanOrEqual = intflagGreaterThanOrEqual;
	}

	public void setIntflagLessThanOrEqual(Integer intflagLessThanOrEqual) {
		this.intflagLessThanOrEqual = intflagLessThanOrEqual;
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

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setVersionLike(String versionLike) {
		this.versionLike = versionLike;
	}

	public FlowProcessDefQuery version(String version) {
		if (version == null) {
			throw new RuntimeException("version is null");
		}
		this.version = version;
		return this;
	}

	public FlowProcessDefQuery versionLike(String versionLike) {
		if (versionLike == null) {
			throw new RuntimeException("version is null");
		}
		this.versionLike = versionLike;
		return this;
	}

}