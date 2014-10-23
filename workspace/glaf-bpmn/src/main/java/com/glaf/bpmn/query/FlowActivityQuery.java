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

public class FlowActivityQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String activDefId;
	protected String activDefIdLike;
	protected List<String> activDefIds;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String typeofact;
	protected String typeofactLike;
	protected List<String> typeofacts;
	protected String nameLike;
	protected String contentLike;
	protected String strfuntion;
	protected String netroleid;
	protected String netroleidLike;
	protected List<String> netroleids;
	protected String userId;
	protected String userIdLike;
	protected List<String> userIds;
	protected Long timelimitGreaterThanOrEqual;
	protected Long timelimitLessThanOrEqual;
	protected Date ctimeStartGreaterThanOrEqual;
	protected Date ctimeStartLessThanOrEqual;
	protected Date ctimeEndGreaterThanOrEqual;
	protected Date ctimeEndLessThanOrEqual;
	protected Integer state;
	protected Integer stateGreaterThanOrEqual;
	protected Integer stateLessThanOrEqual;
	protected List<Integer> states;
	protected Integer intback;
	protected Integer intbackGreaterThanOrEqual;
	protected Integer intbackLessThanOrEqual;
	protected List<Integer> intbacks;

	public FlowActivityQuery() {

	}

	public FlowActivityQuery activDefId(String activDefId) {
		if (activDefId == null) {
			throw new RuntimeException("activDefId is null");
		}
		this.activDefId = activDefId;
		return this;
	}

	public FlowActivityQuery activDefIdLike(String activDefIdLike) {
		if (activDefIdLike == null) {
			throw new RuntimeException("activDefId is null");
		}
		this.activDefIdLike = activDefIdLike;
		return this;
	}

	public FlowActivityQuery activDefIds(List<String> activDefIds) {
		if (activDefIds == null) {
			throw new RuntimeException("activDefIds is empty ");
		}
		this.activDefIds = activDefIds;
		return this;
	}

	public FlowActivityQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public FlowActivityQuery ctimeEndGreaterThanOrEqual(
			Date ctimeEndGreaterThanOrEqual) {
		if (ctimeEndGreaterThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndGreaterThanOrEqual = ctimeEndGreaterThanOrEqual;
		return this;
	}

	public FlowActivityQuery ctimeEndLessThanOrEqual(
			Date ctimeEndLessThanOrEqual) {
		if (ctimeEndLessThanOrEqual == null) {
			throw new RuntimeException("ctimeEnd is null");
		}
		this.ctimeEndLessThanOrEqual = ctimeEndLessThanOrEqual;
		return this;
	}

	public FlowActivityQuery ctimeStartGreaterThanOrEqual(
			Date ctimeStartGreaterThanOrEqual) {
		if (ctimeStartGreaterThanOrEqual == null) {
			throw new RuntimeException("ctimeStart is null");
		}
		this.ctimeStartGreaterThanOrEqual = ctimeStartGreaterThanOrEqual;
		return this;
	}

	public FlowActivityQuery ctimeStartLessThanOrEqual(
			Date ctimeStartLessThanOrEqual) {
		if (ctimeStartLessThanOrEqual == null) {
			throw new RuntimeException("ctimeStart is null");
		}
		this.ctimeStartLessThanOrEqual = ctimeStartLessThanOrEqual;
		return this;
	}

	public String getActivDefId() {
		return activDefId;
	}

	public String getActivDefIdLike() {
		if (activDefIdLike != null && activDefIdLike.trim().length() > 0) {
			if (!activDefIdLike.startsWith("%")) {
				activDefIdLike = "%" + activDefIdLike;
			}
			if (!activDefIdLike.endsWith("%")) {
				activDefIdLike = activDefIdLike + "%";
			}
		}
		return activDefIdLike;
	}

	public List<String> getActivDefIds() {
		return activDefIds;
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

	public Date getCtimeEndGreaterThanOrEqual() {
		return ctimeEndGreaterThanOrEqual;
	}

	public Date getCtimeEndLessThanOrEqual() {
		return ctimeEndLessThanOrEqual;
	}

	public Date getCtimeStartGreaterThanOrEqual() {
		return ctimeStartGreaterThanOrEqual;
	}

	public Date getCtimeStartLessThanOrEqual() {
		return ctimeStartLessThanOrEqual;
	}

	public Integer getIntback() {
		return intback;
	}

	public Integer getIntbackGreaterThanOrEqual() {
		return intbackGreaterThanOrEqual;
	}

	public Integer getIntbackLessThanOrEqual() {
		return intbackLessThanOrEqual;
	}

	public List<Integer> getIntbacks() {
		return intbacks;
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

	public String getSortOrder() {
		return sortOrder;
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

	public String getStrfuntion() {
		return strfuntion;
	}

	public Long getTimelimitGreaterThanOrEqual() {
		return timelimitGreaterThanOrEqual;
	}

	public Long getTimelimitLessThanOrEqual() {
		return timelimitLessThanOrEqual;
	}

	public String getTypeofact() {
		return typeofact;
	}

	public String getTypeofactLike() {
		if (typeofactLike != null && typeofactLike.trim().length() > 0) {
			if (!typeofactLike.startsWith("%")) {
				typeofactLike = "%" + typeofactLike;
			}
			if (!typeofactLike.endsWith("%")) {
				typeofactLike = typeofactLike + "%";
			}
		}
		return typeofactLike;
	}

	public List<String> getTypeofacts() {
		return typeofacts;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserIdLike() {
		if (userIdLike != null && userIdLike.trim().length() > 0) {
			if (!userIdLike.startsWith("%")) {
				userIdLike = "%" + userIdLike;
			}
			if (!userIdLike.endsWith("%")) {
				userIdLike = userIdLike + "%";
			}
		}
		return userIdLike;
	}

	public List<String> getUserIds() {
		return userIds;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("activDefId", "activ_d_id");
		addColumn("processId", "process_id");
		addColumn("typeofact", "typeofact");
		addColumn("name", "name");
		addColumn("content", "content");
		addColumn("strfuntion", "strfuntion");
		addColumn("netroleid", "netroleid");
		addColumn("userId", "userid");
		addColumn("listno", "listno");
		addColumn("timelimit", "timelimit");
		addColumn("ctimeStart", "ctime_start");
		addColumn("ctimeEnd", "ctime_end");
		addColumn("state", "state");
		addColumn("intback", "intback");
	}

	public FlowActivityQuery intback(Integer intback) {
		if (intback == null) {
			throw new RuntimeException("intback is null");
		}
		this.intback = intback;
		return this;
	}

	public FlowActivityQuery intbackGreaterThanOrEqual(
			Integer intbackGreaterThanOrEqual) {
		if (intbackGreaterThanOrEqual == null) {
			throw new RuntimeException("intback is null");
		}
		this.intbackGreaterThanOrEqual = intbackGreaterThanOrEqual;
		return this;
	}

	public FlowActivityQuery intbackLessThanOrEqual(
			Integer intbackLessThanOrEqual) {
		if (intbackLessThanOrEqual == null) {
			throw new RuntimeException("intback is null");
		}
		this.intbackLessThanOrEqual = intbackLessThanOrEqual;
		return this;
	}

	public FlowActivityQuery intbacks(List<Integer> intbacks) {
		if (intbacks == null) {
			throw new RuntimeException("intbacks is empty ");
		}
		this.intbacks = intbacks;
		return this;
	}

	public FlowActivityQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public FlowActivityQuery netroleid(String netroleid) {
		if (netroleid == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleid = netroleid;
		return this;
	}

	public FlowActivityQuery netroleidLike(String netroleidLike) {
		if (netroleidLike == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleidLike = netroleidLike;
		return this;
	}

	public FlowActivityQuery netroleids(List<String> netroleids) {
		if (netroleids == null) {
			throw new RuntimeException("netroleids is empty ");
		}
		this.netroleids = netroleids;
		return this;
	}

	public FlowActivityQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowActivityQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowActivityQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public void setActivDefId(String activDefId) {
		this.activDefId = activDefId;
	}

	public void setActivDefIdLike(String activDefIdLike) {
		this.activDefIdLike = activDefIdLike;
	}

	public void setActivDefIds(List<String> activDefIds) {
		this.activDefIds = activDefIds;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setCtimeEndGreaterThanOrEqual(Date ctimeEndGreaterThanOrEqual) {
		this.ctimeEndGreaterThanOrEqual = ctimeEndGreaterThanOrEqual;
	}

	public void setCtimeEndLessThanOrEqual(Date ctimeEndLessThanOrEqual) {
		this.ctimeEndLessThanOrEqual = ctimeEndLessThanOrEqual;
	}

	public void setCtimeStartGreaterThanOrEqual(
			Date ctimeStartGreaterThanOrEqual) {
		this.ctimeStartGreaterThanOrEqual = ctimeStartGreaterThanOrEqual;
	}

	public void setCtimeStartLessThanOrEqual(Date ctimeStartLessThanOrEqual) {
		this.ctimeStartLessThanOrEqual = ctimeStartLessThanOrEqual;
	}

	public void setIntback(Integer intback) {
		this.intback = intback;
	}

	public void setIntbackGreaterThanOrEqual(Integer intbackGreaterThanOrEqual) {
		this.intbackGreaterThanOrEqual = intbackGreaterThanOrEqual;
	}

	public void setIntbackLessThanOrEqual(Integer intbackLessThanOrEqual) {
		this.intbackLessThanOrEqual = intbackLessThanOrEqual;
	}

	public void setIntbacks(List<Integer> intbacks) {
		this.intbacks = intbacks;
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

	public void setStrfuntion(String strfuntion) {
		this.strfuntion = strfuntion;
	}

	public void setTimelimitGreaterThanOrEqual(Long timelimitGreaterThanOrEqual) {
		this.timelimitGreaterThanOrEqual = timelimitGreaterThanOrEqual;
	}

	public void setTimelimitLessThanOrEqual(Long timelimitLessThanOrEqual) {
		this.timelimitLessThanOrEqual = timelimitLessThanOrEqual;
	}

	public void setTypeofact(String typeofact) {
		this.typeofact = typeofact;
	}

	public void setTypeofactLike(String typeofactLike) {
		this.typeofactLike = typeofactLike;
	}

	public void setTypeofacts(List<String> typeofacts) {
		this.typeofacts = typeofacts;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserIdLike(String userIdLike) {
		this.userIdLike = userIdLike;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}

	public FlowActivityQuery state(Integer state) {
		if (state == null) {
			throw new RuntimeException("state is null");
		}
		this.state = state;
		return this;
	}

	public FlowActivityQuery stateGreaterThanOrEqual(
			Integer stateGreaterThanOrEqual) {
		if (stateGreaterThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateGreaterThanOrEqual = stateGreaterThanOrEqual;
		return this;
	}

	public FlowActivityQuery stateLessThanOrEqual(Integer stateLessThanOrEqual) {
		if (stateLessThanOrEqual == null) {
			throw new RuntimeException("state is null");
		}
		this.stateLessThanOrEqual = stateLessThanOrEqual;
		return this;
	}

	public FlowActivityQuery states(List<Integer> states) {
		if (states == null) {
			throw new RuntimeException("states is empty ");
		}
		this.states = states;
		return this;
	}

	public FlowActivityQuery strfuntion(String strfuntion) {
		if (strfuntion == null) {
			throw new RuntimeException("strfuntion is null");
		}
		this.strfuntion = strfuntion;
		return this;
	}

	public FlowActivityQuery timelimitGreaterThanOrEqual(
			Long timelimitGreaterThanOrEqual) {
		if (timelimitGreaterThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitGreaterThanOrEqual = timelimitGreaterThanOrEqual;
		return this;
	}

	public FlowActivityQuery timelimitLessThanOrEqual(
			Long timelimitLessThanOrEqual) {
		if (timelimitLessThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitLessThanOrEqual = timelimitLessThanOrEqual;
		return this;
	}

	public FlowActivityQuery typeofact(String typeofact) {
		if (typeofact == null) {
			throw new RuntimeException("typeofact is null");
		}
		this.typeofact = typeofact;
		return this;
	}

	public FlowActivityQuery typeofactLike(String typeofactLike) {
		if (typeofactLike == null) {
			throw new RuntimeException("typeofact is null");
		}
		this.typeofactLike = typeofactLike;
		return this;
	}

	public FlowActivityQuery typeofacts(List<String> typeofacts) {
		if (typeofacts == null) {
			throw new RuntimeException("typeofacts is empty ");
		}
		this.typeofacts = typeofacts;
		return this;
	}

	public FlowActivityQuery userId(String userId) {
		if (userId == null) {
			throw new RuntimeException("userId is null");
		}
		this.userId = userId;
		return this;
	}

	public FlowActivityQuery userIdLike(String userIdLike) {
		if (userIdLike == null) {
			throw new RuntimeException("userId is null");
		}
		this.userIdLike = userIdLike;
		return this;
	}

	public FlowActivityQuery userIds(List<String> userIds) {
		if (userIds == null) {
			throw new RuntimeException("userIds is empty ");
		}
		this.userIds = userIds;
		return this;
	}

}