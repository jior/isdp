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

package com.glaf.base.modules.sys.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class SysApplicationQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String code;
	protected String codeLike;
	protected String descLike;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected Long nodeId;
	protected List<Long> nodeIds;
	protected Integer refId1;
	protected Integer refId2;
	protected Integer refId3;
	protected Integer refId4;
	protected Integer refId5;
	protected Integer showMenu;
	protected Integer sortGreaterThan;
	protected Integer sortGreaterThanOrEqual;
	protected Integer sortLessThan;
	protected Integer sortLessThanOrEqual;
	protected String urlLike;

	public SysApplicationQuery() {

	}

	public SysApplicationQuery code(String code) {
		if (code == null) {
			throw new RuntimeException("code is null");
		}
		this.code = code;
		return this;
	}

	public SysApplicationQuery descLike(String descLike) {
		if (descLike == null) {
			throw new RuntimeException("desc is null");
		}
		this.descLike = descLike;
		return this;
	}

	public String getCode() {
		return code;
	}

	public String getCodeLike() {
		return codeLike;
	}

	public String getDescLike() {
		if (descLike != null && descLike.trim().length() > 0) {
			if (!descLike.startsWith("%")) {
				descLike = "%" + descLike;
			}
			if (!descLike.endsWith("%")) {
				descLike = descLike + "%";
			}
		}
		return descLike;
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

	public Long getNodeId() {
		return nodeId;
	}

	public List<Long> getNodeIds() {
		return nodeIds;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("name".equals(sortColumn)) {
				orderBy = "E.NAME" + a_x;
			}

			if ("desc".equals(sortColumn)) {
				orderBy = "E.APPDESC" + a_x;
			}

			if ("url".equals(sortColumn)) {
				orderBy = "E.URL" + a_x;
			}

			if ("sort".equals(sortColumn)) {
				orderBy = "E.SORT" + a_x;
			}

			if ("showMenu".equals(sortColumn)) {
				orderBy = "E.SHOWMENU" + a_x;
			}

			if ("nodeId".equals(sortColumn)) {
				orderBy = "E.NODEID" + a_x;
			}

		}
		return orderBy;
	}

	public Integer getRefId1() {
		return refId1;
	}

	public Integer getRefId2() {
		return refId2;
	}

	public Integer getRefId3() {
		return refId3;
	}

	public Integer getRefId4() {
		return refId4;
	}

	public Integer getRefId5() {
		return refId5;
	}

	public Integer getShowMenu() {
		return showMenu;
	}

	public Integer getSortGreaterThan() {
		return sortGreaterThan;
	}

	public Integer getSortGreaterThanOrEqual() {
		return sortGreaterThanOrEqual;
	}

	public Integer getSortLessThan() {
		return sortLessThan;
	}

	public Integer getSortLessThanOrEqual() {
		return sortLessThanOrEqual;
	}

	public String getUrlLike() {
		if (urlLike != null && urlLike.trim().length() > 0) {
			if (!urlLike.startsWith("%")) {
				urlLike = "%" + urlLike;
			}
			if (!urlLike.endsWith("%")) {
				urlLike = urlLike + "%";
			}
		}
		return urlLike;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID");
		addColumn("name", "NAME");
		addColumn("desc", "APPDESC");
		addColumn("url", "URL");
		addColumn("sort", "SORT");
		addColumn("showMenu", "SHOWMENU");
		addColumn("nodeId", "NODEID");
	}

	public SysApplicationQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public SysApplicationQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public SysApplicationQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public SysApplicationQuery nodeId(Long nodeId) {
		if (nodeId == null) {
			throw new RuntimeException("nodeId is null");
		}
		this.nodeId = nodeId;
		return this;
	}

	public SysApplicationQuery nodeIds(List<Long> nodeIds) {
		if (nodeIds == null) {
			throw new RuntimeException("nodeIds is empty ");
		}
		this.nodeIds = nodeIds;
		return this;
	}

	public SysApplicationQuery refId1(Integer refId1) {
		if (refId1 == null) {
			throw new RuntimeException("refId1 is null");
		}
		this.refId1 = refId1;
		return this;
	}

	public SysApplicationQuery refId2(Integer refId2) {
		if (refId2 == null) {
			throw new RuntimeException("refId2 is null");
		}
		this.refId2 = refId2;
		return this;
	}

	public SysApplicationQuery refId3(Integer refId3) {
		if (refId3 == null) {
			throw new RuntimeException("refId3 is null");
		}
		this.refId3 = refId3;
		return this;
	}

	public SysApplicationQuery refId4(Integer refId4) {
		if (refId4 == null) {
			throw new RuntimeException("refId4 is null");
		}
		this.refId4 = refId4;
		return this;
	}

	public SysApplicationQuery refId5(Integer refId5) {
		if (refId5 == null) {
			throw new RuntimeException("refId5 is null");
		}
		this.refId5 = refId5;
		return this;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public void setDescLike(String descLike) {
		this.descLike = descLike;
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

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public void setNodeIds(List<Long> nodeIds) {
		this.nodeIds = nodeIds;
	}

	public void setRefId1(Integer refId1) {
		this.refId1 = refId1;
	}

	public void setRefId2(Integer refId2) {
		this.refId2 = refId2;
	}

	public void setRefId3(Integer refId3) {
		this.refId3 = refId3;
	}

	public void setRefId4(Integer refId4) {
		this.refId4 = refId4;
	}

	public void setRefId5(Integer refId5) {
		this.refId5 = refId5;
	}

	public void setShowMenu(Integer showMenu) {
		this.showMenu = showMenu;
	}

	public void setSortGreaterThan(Integer sortGreaterThan) {
		this.sortGreaterThan = sortGreaterThan;
	}

	public void setSortGreaterThanOrEqual(Integer sortGreaterThanOrEqual) {
		this.sortGreaterThanOrEqual = sortGreaterThanOrEqual;
	}

	public void setSortLessThan(Integer sortLessThan) {
		this.sortLessThan = sortLessThan;
	}

	public void setSortLessThanOrEqual(Integer sortLessThanOrEqual) {
		this.sortLessThanOrEqual = sortLessThanOrEqual;
	}

	public void setUrlLike(String urlLike) {
		this.urlLike = urlLike;
	}

	public SysApplicationQuery showMenu(Integer showMenu) {
		if (showMenu == null) {
			throw new RuntimeException("showMenu is null");
		}
		this.showMenu = showMenu;
		return this;
	}

	public SysApplicationQuery sortGreaterThanOrEqual(
			Integer sortGreaterThanOrEqual) {
		if (sortGreaterThanOrEqual == null) {
			throw new RuntimeException("sort is null");
		}
		this.sortGreaterThanOrEqual = sortGreaterThanOrEqual;
		return this;
	}

	public SysApplicationQuery sortLessThanOrEqual(Integer sortLessThanOrEqual) {
		if (sortLessThanOrEqual == null) {
			throw new RuntimeException("sort is null");
		}
		this.sortLessThanOrEqual = sortLessThanOrEqual;
		return this;
	}

	public SysApplicationQuery urlLike(String urlLike) {
		if (urlLike == null) {
			throw new RuntimeException("url is null");
		}
		this.urlLike = urlLike;
		return this;
	}

}