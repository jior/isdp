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

public class FlowForwardDefQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String activId;
	protected String activIdLike;
	protected List<String> activIds;
	protected String activPre;
	protected String activPreLike;
	protected List<String> activPres;
	protected String activNext;
	protected String activNextLike;
	protected List<String> activNexts;
	protected Integer issave;
	protected Integer issaveGreaterThanOrEqual;
	protected Integer issaveLessThanOrEqual;
	protected List<Integer> issaves;
	protected Integer isdel;

	public FlowForwardDefQuery() {

	}

	public FlowForwardDefQuery activId(String activId) {
		if (activId == null) {
			throw new RuntimeException("activId is null");
		}
		this.activId = activId;
		return this;
	}

	public FlowForwardDefQuery activIdLike(String activIdLike) {
		if (activIdLike == null) {
			throw new RuntimeException("activId is null");
		}
		this.activIdLike = activIdLike;
		return this;
	}

	public FlowForwardDefQuery activIds(List<String> activIds) {
		if (activIds == null) {
			throw new RuntimeException("activIds is empty ");
		}
		this.activIds = activIds;
		return this;
	}

	public FlowForwardDefQuery activNext(String activNext) {
		if (activNext == null) {
			throw new RuntimeException("activNext is null");
		}
		this.activNext = activNext;
		return this;
	}

	public FlowForwardDefQuery activNextLike(String activNextLike) {
		if (activNextLike == null) {
			throw new RuntimeException("activNext is null");
		}
		this.activNextLike = activNextLike;
		return this;
	}

	public FlowForwardDefQuery activNexts(List<String> activNexts) {
		if (activNexts == null) {
			throw new RuntimeException("activNexts is empty ");
		}
		this.activNexts = activNexts;
		return this;
	}

	public FlowForwardDefQuery activPre(String activPre) {
		if (activPre == null) {
			throw new RuntimeException("activPre is null");
		}
		this.activPre = activPre;
		return this;
	}

	public FlowForwardDefQuery activPreLike(String activPreLike) {
		if (activPreLike == null) {
			throw new RuntimeException("activPre is null");
		}
		this.activPreLike = activPreLike;
		return this;
	}

	public FlowForwardDefQuery activPres(List<String> activPres) {
		if (activPres == null) {
			throw new RuntimeException("activPres is empty ");
		}
		this.activPres = activPres;
		return this;
	}

	public String getActivId() {
		return activId;
	}

	public String getActivIdLike() {
		if (activIdLike != null && activIdLike.trim().length() > 0) {
			if (!activIdLike.startsWith("%")) {
				activIdLike = "%" + activIdLike;
			}
			if (!activIdLike.endsWith("%")) {
				activIdLike = activIdLike + "%";
			}
		}
		return activIdLike;
	}

	public List<String> getActivIds() {
		return activIds;
	}

	public String getActivNext() {
		return activNext;
	}

	public String getActivNextLike() {
		if (activNextLike != null && activNextLike.trim().length() > 0) {
			if (!activNextLike.startsWith("%")) {
				activNextLike = "%" + activNextLike;
			}
			if (!activNextLike.endsWith("%")) {
				activNextLike = activNextLike + "%";
			}
		}
		return activNextLike;
	}

	public List<String> getActivNexts() {
		return activNexts;
	}

	public String getActivPre() {
		return activPre;
	}

	public String getActivPreLike() {
		if (activPreLike != null && activPreLike.trim().length() > 0) {
			if (!activPreLike.startsWith("%")) {
				activPreLike = "%" + activPreLike;
			}
			if (!activPreLike.endsWith("%")) {
				activPreLike = activPreLike + "%";
			}
		}
		return activPreLike;
	}

	public List<String> getActivPres() {
		return activPres;
	}

	public Integer getIsdel() {
		return isdel;
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

	public List<Integer> getIssaves() {
		return issaves;
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

	public String getProcessId() {
		return processId;
	}

	public String getProcessIdLike() {
		if (processIdLike != null && processIdLike.trim().length() > 0) {
			if (!processIdLike.startsWith("%")) {
				processIdLike = "%" + processIdLike;
			}
			if (!processIdLike.endsWith("%")) {
				processIdLike = processIdLike + "%";
			}
		}
		return processIdLike;
	}

	public List<String> getProcessIds() {
		return processIds;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("processId", "process_id");
		addColumn("activId", "activ_id");
		addColumn("activPre", "activ_pre");
		addColumn("activNext", "activ_next");
		addColumn("issave", "issave");
		addColumn("isdel", "isdel");
		addColumn("listno", "listno");
	}

	public FlowForwardDefQuery isdel(Integer isdel) {
		if (isdel == null) {
			throw new RuntimeException("isdel is null");
		}
		this.isdel = isdel;
		return this;
	}

	public FlowForwardDefQuery issave(Integer issave) {
		if (issave == null) {
			throw new RuntimeException("issave is null");
		}
		this.issave = issave;
		return this;
	}

	public FlowForwardDefQuery issaveGreaterThanOrEqual(
			Integer issaveGreaterThanOrEqual) {
		if (issaveGreaterThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
		return this;
	}

	public FlowForwardDefQuery issaveLessThanOrEqual(
			Integer issaveLessThanOrEqual) {
		if (issaveLessThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
		return this;
	}

	public FlowForwardDefQuery issaves(List<Integer> issaves) {
		if (issaves == null) {
			throw new RuntimeException("issaves is empty ");
		}
		this.issaves = issaves;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowForwardDefQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowForwardDefQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowForwardDefQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public void setActivId(String activId) {
		this.activId = activId;
	}

	public void setActivIdLike(String activIdLike) {
		this.activIdLike = activIdLike;
	}

	public void setActivIds(List<String> activIds) {
		this.activIds = activIds;
	}

	public void setActivNext(String activNext) {
		this.activNext = activNext;
	}

	public void setActivNextLike(String activNextLike) {
		this.activNextLike = activNextLike;
	}

	public void setActivNexts(List<String> activNexts) {
		this.activNexts = activNexts;
	}

	public void setActivPre(String activPre) {
		this.activPre = activPre;
	}

	public void setActivPreLike(String activPreLike) {
		this.activPreLike = activPreLike;
	}

	public void setActivPres(List<String> activPres) {
		this.activPres = activPres;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
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

	public void setIssaves(List<Integer> issaves) {
		this.issaves = issaves;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public void setProcessIdLike(String processIdLike) {
		this.processIdLike = processIdLike;
	}

	public void setProcessIds(List<String> processIds) {
		this.processIds = processIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}