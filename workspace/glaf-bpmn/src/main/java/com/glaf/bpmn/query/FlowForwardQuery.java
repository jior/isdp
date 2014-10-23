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

public class FlowForwardQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String activDefId;
	protected List<String> activDefIds;
	protected String activDefNext;
	protected List<String> activDefNexts;
	protected Integer sendtype;
	protected Integer sendtypeGreaterThanOrEqual;
	protected Integer sendtypeLessThanOrEqual;
	protected List<Integer> sendtypes;
	protected Integer sendtimes;
	protected Integer sendtimesGreaterThanOrEqual;
	protected Integer sendtimesLessThanOrEqual;
	protected List<Integer> sendtimess;

	public FlowForwardQuery() {

	}

	public FlowForwardQuery activDefId(String activDefId) {
		if (activDefId == null) {
			throw new RuntimeException("activDefId is null");
		}
		this.activDefId = activDefId;
		return this;
	}

	public FlowForwardQuery activDefIds(List<String> activDefIds) {
		if (activDefIds == null) {
			throw new RuntimeException("activDefIds is empty ");
		}
		this.activDefIds = activDefIds;
		return this;
	}

	public FlowForwardQuery activDefNext(String activDefNext) {
		if (activDefNext == null) {
			throw new RuntimeException("activDefNext is null");
		}
		this.activDefNext = activDefNext;
		return this;
	}

	public FlowForwardQuery activDefNexts(List<String> activDefNexts) {
		if (activDefNexts == null) {
			throw new RuntimeException("activDefNexts is empty ");
		}
		this.activDefNexts = activDefNexts;
		return this;
	}

	public String getActivDefId() {
		return activDefId;
	}

	public List<String> getActivDefIds() {
		return activDefIds;
	}

	public String getActivDefNext() {
		return activDefNext;
	}

	public List<String> getActivDefNexts() {
		return activDefNexts;
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

	public Integer getSendtimes() {
		return sendtimes;
	}

	public Integer getSendtimesGreaterThanOrEqual() {
		return sendtimesGreaterThanOrEqual;
	}

	public Integer getSendtimesLessThanOrEqual() {
		return sendtimesLessThanOrEqual;
	}

	public List<Integer> getSendtimess() {
		return sendtimess;
	}

	public Integer getSendtype() {
		return sendtype;
	}

	public Integer getSendtypeGreaterThanOrEqual() {
		return sendtypeGreaterThanOrEqual;
	}

	public Integer getSendtypeLessThanOrEqual() {
		return sendtypeLessThanOrEqual;
	}

	public List<Integer> getSendtypes() {
		return sendtypes;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("processId", "process_id");
		addColumn("activDId", "activ_d_id");
		addColumn("activDNext", "activ_d_next");
		addColumn("sendtype", "sendtype");
		addColumn("sendtimes", "sendtimes");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowForwardQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowForwardQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowForwardQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public FlowForwardQuery sendtimes(Integer sendtimes) {
		if (sendtimes == null) {
			throw new RuntimeException("sendtimes is null");
		}
		this.sendtimes = sendtimes;
		return this;
	}

	public FlowForwardQuery sendtimesGreaterThanOrEqual(
			Integer sendtimesGreaterThanOrEqual) {
		if (sendtimesGreaterThanOrEqual == null) {
			throw new RuntimeException("sendtimes is null");
		}
		this.sendtimesGreaterThanOrEqual = sendtimesGreaterThanOrEqual;
		return this;
	}

	public FlowForwardQuery sendtimesLessThanOrEqual(
			Integer sendtimesLessThanOrEqual) {
		if (sendtimesLessThanOrEqual == null) {
			throw new RuntimeException("sendtimes is null");
		}
		this.sendtimesLessThanOrEqual = sendtimesLessThanOrEqual;
		return this;
	}

	public FlowForwardQuery sendtimess(List<Integer> sendtimess) {
		if (sendtimess == null) {
			throw new RuntimeException("sendtimess is empty ");
		}
		this.sendtimess = sendtimess;
		return this;
	}

	public FlowForwardQuery sendtype(Integer sendtype) {
		if (sendtype == null) {
			throw new RuntimeException("sendtype is null");
		}
		this.sendtype = sendtype;
		return this;
	}

	public FlowForwardQuery sendtypeGreaterThanOrEqual(
			Integer sendtypeGreaterThanOrEqual) {
		if (sendtypeGreaterThanOrEqual == null) {
			throw new RuntimeException("sendtype is null");
		}
		this.sendtypeGreaterThanOrEqual = sendtypeGreaterThanOrEqual;
		return this;
	}

	public FlowForwardQuery sendtypeLessThanOrEqual(
			Integer sendtypeLessThanOrEqual) {
		if (sendtypeLessThanOrEqual == null) {
			throw new RuntimeException("sendtype is null");
		}
		this.sendtypeLessThanOrEqual = sendtypeLessThanOrEqual;
		return this;
	}

	public FlowForwardQuery sendtypes(List<Integer> sendtypes) {
		if (sendtypes == null) {
			throw new RuntimeException("sendtypes is empty ");
		}
		this.sendtypes = sendtypes;
		return this;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setActivDefIds(List<String> activDefIds) {
		this.activDefIds = activDefIds;
	}

	public void setActivDefNext(String activDefNext) {
		this.activDefNext = activDefNext;
	}

	public void setActivDefNexts(List<String> activDefNexts) {
		this.activDefNexts = activDefNexts;
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

	public void setSendtimes(Integer sendtimes) {
		this.sendtimes = sendtimes;
	}

	public void setSendtimesGreaterThanOrEqual(
			Integer sendtimesGreaterThanOrEqual) {
		this.sendtimesGreaterThanOrEqual = sendtimesGreaterThanOrEqual;
	}

	public void setSendtimesLessThanOrEqual(Integer sendtimesLessThanOrEqual) {
		this.sendtimesLessThanOrEqual = sendtimesLessThanOrEqual;
	}

	public void setSendtimess(List<Integer> sendtimess) {
		this.sendtimess = sendtimess;
	}

	public void setSendtype(Integer sendtype) {
		this.sendtype = sendtype;
	}

	public void setSendtypeGreaterThanOrEqual(Integer sendtypeGreaterThanOrEqual) {
		this.sendtypeGreaterThanOrEqual = sendtypeGreaterThanOrEqual;
	}

	public void setSendtypeLessThanOrEqual(Integer sendtypeLessThanOrEqual) {
		this.sendtypeLessThanOrEqual = sendtypeLessThanOrEqual;
	}

	public void setSendtypes(List<Integer> sendtypes) {
		this.sendtypes = sendtypes;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}