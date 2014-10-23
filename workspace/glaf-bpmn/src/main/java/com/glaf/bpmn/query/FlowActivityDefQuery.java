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

public class FlowActivityDefQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String processId;
	protected String processIdLike;
	protected List<String> processIds;
	protected String typeofact;
	protected String typeofactLike;
	protected List<String> typeofacts;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected String contentLike;
	protected String strfuntion;
	protected String netroleid;
	protected String netroleidLike;
	protected List<String> netroleids;
	protected Long timelimitGreaterThanOrEqual;
	protected Long timelimitLessThanOrEqual;
	protected Integer issave;
	protected Integer issaveGreaterThanOrEqual;
	protected Integer issaveLessThanOrEqual;
	protected List<Integer> issaves;
	protected Integer isdel;
	protected Integer isdelGreaterThanOrEqual;
	protected Integer isdelLessThanOrEqual;
	protected List<Integer> isdels;
	protected Integer intselectuser;
	protected Integer intselectuserGreaterThanOrEqual;
	protected Integer intselectuserLessThanOrEqual;
	protected List<Integer> intselectusers;
	protected Integer intusedomain;
	protected Integer intusedomainGreaterThanOrEqual;
	protected Integer intusedomainLessThanOrEqual;
	protected List<Integer> intusedomains;

	public FlowActivityDefQuery() {

	}

	public FlowActivityDefQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
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

	public Integer getIntselectuser() {
		return intselectuser;
	}

	public Integer getIntselectuserGreaterThanOrEqual() {
		return intselectuserGreaterThanOrEqual;
	}

	public Integer getIntselectuserLessThanOrEqual() {
		return intselectuserLessThanOrEqual;
	}

	public List<Integer> getIntselectusers() {
		return intselectusers;
	}

	public Integer getIntusedomain() {
		return intusedomain;
	}

	public Integer getIntusedomainGreaterThanOrEqual() {
		return intusedomainGreaterThanOrEqual;
	}

	public Integer getIntusedomainLessThanOrEqual() {
		return intusedomainLessThanOrEqual;
	}

	public List<Integer> getIntusedomains() {
		return intusedomains;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public Integer getIsdelGreaterThanOrEqual() {
		return isdelGreaterThanOrEqual;
	}

	public Integer getIsdelLessThanOrEqual() {
		return isdelLessThanOrEqual;
	}

	public List<Integer> getIsdels() {
		return isdels;
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

	public List<String> getNames() {
		return names;
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

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("processId", "process_id");
		addColumn("typeofact", "typeofact");
		addColumn("name", "name");
		addColumn("content", "content");
		addColumn("strfuntion", "strfuntion");
		addColumn("netroleid", "netroleid");
		addColumn("listno", "listno");
		addColumn("timelimit", "timelimit");
		addColumn("issave", "issave");
		addColumn("isdel", "isdel");
		addColumn("intselectuser", "intselectuser");
		addColumn("intusedomain", "intusedomain");
	}

	public FlowActivityDefQuery intselectuser(Integer intselectuser) {
		if (intselectuser == null) {
			throw new RuntimeException("intselectuser is null");
		}
		this.intselectuser = intselectuser;
		return this;
	}

	public FlowActivityDefQuery intselectuserGreaterThanOrEqual(
			Integer intselectuserGreaterThanOrEqual) {
		if (intselectuserGreaterThanOrEqual == null) {
			throw new RuntimeException("intselectuser is null");
		}
		this.intselectuserGreaterThanOrEqual = intselectuserGreaterThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery intselectuserLessThanOrEqual(
			Integer intselectuserLessThanOrEqual) {
		if (intselectuserLessThanOrEqual == null) {
			throw new RuntimeException("intselectuser is null");
		}
		this.intselectuserLessThanOrEqual = intselectuserLessThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery intselectusers(List<Integer> intselectusers) {
		if (intselectusers == null) {
			throw new RuntimeException("intselectusers is empty ");
		}
		this.intselectusers = intselectusers;
		return this;
	}

	public FlowActivityDefQuery intusedomain(Integer intusedomain) {
		if (intusedomain == null) {
			throw new RuntimeException("intusedomain is null");
		}
		this.intusedomain = intusedomain;
		return this;
	}

	public FlowActivityDefQuery intusedomainGreaterThanOrEqual(
			Integer intusedomainGreaterThanOrEqual) {
		if (intusedomainGreaterThanOrEqual == null) {
			throw new RuntimeException("intusedomain is null");
		}
		this.intusedomainGreaterThanOrEqual = intusedomainGreaterThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery intusedomainLessThanOrEqual(
			Integer intusedomainLessThanOrEqual) {
		if (intusedomainLessThanOrEqual == null) {
			throw new RuntimeException("intusedomain is null");
		}
		this.intusedomainLessThanOrEqual = intusedomainLessThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery intusedomains(List<Integer> intusedomains) {
		if (intusedomains == null) {
			throw new RuntimeException("intusedomains is empty ");
		}
		this.intusedomains = intusedomains;
		return this;
	}

	public FlowActivityDefQuery isdel(Integer isdel) {
		if (isdel == null) {
			throw new RuntimeException("isdel is null");
		}
		this.isdel = isdel;
		return this;
	}

	public FlowActivityDefQuery isdelGreaterThanOrEqual(
			Integer isdelGreaterThanOrEqual) {
		if (isdelGreaterThanOrEqual == null) {
			throw new RuntimeException("isdel is null");
		}
		this.isdelGreaterThanOrEqual = isdelGreaterThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery isdelLessThanOrEqual(
			Integer isdelLessThanOrEqual) {
		if (isdelLessThanOrEqual == null) {
			throw new RuntimeException("isdel is null");
		}
		this.isdelLessThanOrEqual = isdelLessThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery isdels(List<Integer> isdels) {
		if (isdels == null) {
			throw new RuntimeException("isdels is empty ");
		}
		this.isdels = isdels;
		return this;
	}

	public FlowActivityDefQuery issave(Integer issave) {
		if (issave == null) {
			throw new RuntimeException("issave is null");
		}
		this.issave = issave;
		return this;
	}

	public FlowActivityDefQuery issaveGreaterThanOrEqual(
			Integer issaveGreaterThanOrEqual) {
		if (issaveGreaterThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveGreaterThanOrEqual = issaveGreaterThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery issaveLessThanOrEqual(
			Integer issaveLessThanOrEqual) {
		if (issaveLessThanOrEqual == null) {
			throw new RuntimeException("issave is null");
		}
		this.issaveLessThanOrEqual = issaveLessThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery issaves(List<Integer> issaves) {
		if (issaves == null) {
			throw new RuntimeException("issaves is empty ");
		}
		this.issaves = issaves;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public FlowActivityDefQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public FlowActivityDefQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public FlowActivityDefQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public FlowActivityDefQuery netroleid(String netroleid) {
		if (netroleid == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleid = netroleid;
		return this;
	}

	public FlowActivityDefQuery netroleidLike(String netroleidLike) {
		if (netroleidLike == null) {
			throw new RuntimeException("netroleid is null");
		}
		this.netroleidLike = netroleidLike;
		return this;
	}

	public FlowActivityDefQuery netroleids(List<String> netroleids) {
		if (netroleids == null) {
			throw new RuntimeException("netroleids is empty ");
		}
		this.netroleids = netroleids;
		return this;
	}

	public FlowActivityDefQuery processId(String processId) {
		if (processId == null) {
			throw new RuntimeException("processId is null");
		}
		this.processId = processId;
		return this;
	}

	public FlowActivityDefQuery processIdLike(String processIdLike) {
		if (processIdLike == null) {
			throw new RuntimeException("processId is null");
		}
		this.processIdLike = processIdLike;
		return this;
	}

	public FlowActivityDefQuery processIds(List<String> processIds) {
		if (processIds == null) {
			throw new RuntimeException("processIds is empty ");
		}
		this.processIds = processIds;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setIntselectuser(Integer intselectuser) {
		this.intselectuser = intselectuser;
	}

	public void setIntselectuserGreaterThanOrEqual(
			Integer intselectuserGreaterThanOrEqual) {
		this.intselectuserGreaterThanOrEqual = intselectuserGreaterThanOrEqual;
	}

	public void setIntselectuserLessThanOrEqual(
			Integer intselectuserLessThanOrEqual) {
		this.intselectuserLessThanOrEqual = intselectuserLessThanOrEqual;
	}

	public void setIntselectusers(List<Integer> intselectusers) {
		this.intselectusers = intselectusers;
	}

	public void setIntusedomain(Integer intusedomain) {
		this.intusedomain = intusedomain;
	}

	public void setIntusedomainGreaterThanOrEqual(
			Integer intusedomainGreaterThanOrEqual) {
		this.intusedomainGreaterThanOrEqual = intusedomainGreaterThanOrEqual;
	}

	public void setIntusedomainLessThanOrEqual(
			Integer intusedomainLessThanOrEqual) {
		this.intusedomainLessThanOrEqual = intusedomainLessThanOrEqual;
	}

	public void setIntusedomains(List<Integer> intusedomains) {
		this.intusedomains = intusedomains;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	public void setIsdelGreaterThanOrEqual(Integer isdelGreaterThanOrEqual) {
		this.isdelGreaterThanOrEqual = isdelGreaterThanOrEqual;
	}

	public void setIsdelLessThanOrEqual(Integer isdelLessThanOrEqual) {
		this.isdelLessThanOrEqual = isdelLessThanOrEqual;
	}

	public void setIsdels(List<Integer> isdels) {
		this.isdels = isdels;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNames(List<String> names) {
		this.names = names;
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

	public FlowActivityDefQuery strfuntion(String strfuntion) {
		if (strfuntion == null) {
			throw new RuntimeException("strfuntion is null");
		}
		this.strfuntion = strfuntion;
		return this;
	}

	public FlowActivityDefQuery timelimitGreaterThanOrEqual(
			Long timelimitGreaterThanOrEqual) {
		if (timelimitGreaterThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitGreaterThanOrEqual = timelimitGreaterThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery timelimitLessThanOrEqual(
			Long timelimitLessThanOrEqual) {
		if (timelimitLessThanOrEqual == null) {
			throw new RuntimeException("timelimit is null");
		}
		this.timelimitLessThanOrEqual = timelimitLessThanOrEqual;
		return this;
	}

	public FlowActivityDefQuery typeofact(String typeofact) {
		if (typeofact == null) {
			throw new RuntimeException("typeofact is null");
		}
		this.typeofact = typeofact;
		return this;
	}

	public FlowActivityDefQuery typeofactLike(String typeofactLike) {
		if (typeofactLike == null) {
			throw new RuntimeException("typeofact is null");
		}
		this.typeofactLike = typeofactLike;
		return this;
	}

	public FlowActivityDefQuery typeofacts(List<String> typeofacts) {
		if (typeofacts == null) {
			throw new RuntimeException("typeofacts is empty ");
		}
		this.typeofacts = typeofacts;
		return this;
	}

}