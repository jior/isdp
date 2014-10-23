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

public class FlowStationQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String activDefId;
	protected List<String> activDefIds;

	public FlowStationQuery() {

	}

	public FlowStationQuery activDefId(String activDefId) {
		if (activDefId == null) {
			throw new RuntimeException("activDefId is null");
		}
		this.activDefId = activDefId;
		return this;
	}

	public FlowStationQuery activDefIds(List<String> activDefIds) {
		if (activDefIds == null) {
			throw new RuntimeException("activDefIds is empty ");
		}
		this.activDefIds = activDefIds;
		return this;
	}

	public String getActivDefId() {
		return activDefId;
	}

	public List<String> getActivDefIds() {
		return activDefIds;
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
		addColumn("activDId", "activ_d_id");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowStationQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowStationQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowStationQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setActivDefIds(List<String> activDefIds) {
		this.activDefIds = activDefIds;
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