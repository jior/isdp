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

public class CellTreedotPerQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String idLike;
	protected List<String> ids;
	protected String indexNameLike;
	protected Integer nlevel;
	protected Integer nlevelGreaterThanOrEqual;
	protected Integer nlevelLessThanOrEqual;
	protected List<Integer> nlevels;
	protected String fromid;
	protected String fromidLike;
	protected List<String> fromids;
	protected Integer intuserper;
	protected Integer intuserperGreaterThanOrEqual;
	protected Integer intuserperLessThanOrEqual;
	protected List<Integer> intuserpers;
	protected Integer menuIndex;
	protected Integer menuIndexGreaterThanOrEqual;
	protected Integer menuIndexLessThanOrEqual;
	protected List<Integer> menuIndexs;
	

	public CellTreedotPerQuery() {

	}

	public CellTreedotPerQuery fromid(String fromid) {
		if (fromid == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromid = fromid;
		return this;
	}

	public CellTreedotPerQuery fromidLike(String fromidLike) {
		if (fromidLike == null) {
			throw new RuntimeException("fromid is null");
		}
		this.fromidLike = fromidLike;
		return this;
	}

	public CellTreedotPerQuery fromids(List<String> fromids) {
		if (fromids == null) {
			throw new RuntimeException("fromids is empty ");
		}
		this.fromids = fromids;
		return this;
	}

	public String getFromid() {
		return fromid;
	}

	public String getFromidLike() {
		if (fromidLike != null && fromidLike.trim().length() > 0) {
			if (!fromidLike.startsWith("%")) {
				fromidLike = "%" + fromidLike;
			}
			if (!fromidLike.endsWith("%")) {
				fromidLike = fromidLike + "%";
			}
		}
		return fromidLike;
	}

	public List<String> getFromids() {
		return fromids;
	}

	public String getIdLike() {
		if (idLike != null && idLike.trim().length() > 0) {
			if (!idLike.startsWith("%")) {
				idLike = "%" + idLike;
			}
			if (!idLike.endsWith("%")) {
				idLike = idLike + "%";
			}
		}
		return idLike;
	}

	public List<String> getIds() {
		return ids;
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

	public Integer getIntuserper() {
		return intuserper;
	}

	public Integer getIntuserperGreaterThanOrEqual() {
		return intuserperGreaterThanOrEqual;
	}

	public Integer getIntuserperLessThanOrEqual() {
		return intuserperLessThanOrEqual;
	}

	public List<Integer> getIntuserpers() {
		return intuserpers;
	}

	public Integer getMenuIndex() {
		return menuIndex;
	}

	public Integer getMenuIndexGreaterThanOrEqual() {
		return menuIndexGreaterThanOrEqual;
	}

	public Integer getMenuIndexLessThanOrEqual() {
		return menuIndexLessThanOrEqual;
	}

	public List<Integer> getMenuIndexs() {
		return menuIndexs;
	}

	public Integer getNlevel() {
		return nlevel;
	}

	public Integer getNlevelGreaterThanOrEqual() {
		return nlevelGreaterThanOrEqual;
	}

	public Integer getNlevelLessThanOrEqual() {
		return nlevelLessThanOrEqual;
	}

	public List<Integer> getNlevels() {
		return nlevels;
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

	public CellTreedotPerQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public CellTreedotPerQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellTreedotPerQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public CellTreedotPerQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexName is null");
		}
		this.indexNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("indexId", "index_id");
		addColumn("parentId", "parent_id");
		addColumn("indexName", "index_name");
		addColumn("nlevel", "nlevel");
		addColumn("nodeico", "nodeico");
		addColumn("fromid", "fromid");
		addColumn("listno", "listno");
		addColumn("intuserper", "intuserper");
		addColumn("menuIndex", "menu_index");
	}

	public CellTreedotPerQuery intuserper(Integer intuserper) {
		if (intuserper == null) {
			throw new RuntimeException("intuserper is null");
		}
		this.intuserper = intuserper;
		return this;
	}

	public CellTreedotPerQuery intuserperGreaterThanOrEqual(
			Integer intuserperGreaterThanOrEqual) {
		if (intuserperGreaterThanOrEqual == null) {
			throw new RuntimeException("intuserper is null");
		}
		this.intuserperGreaterThanOrEqual = intuserperGreaterThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery intuserperLessThanOrEqual(
			Integer intuserperLessThanOrEqual) {
		if (intuserperLessThanOrEqual == null) {
			throw new RuntimeException("intuserper is null");
		}
		this.intuserperLessThanOrEqual = intuserperLessThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery intuserpers(List<Integer> intuserpers) {
		if (intuserpers == null) {
			throw new RuntimeException("intuserpers is empty ");
		}
		this.intuserpers = intuserpers;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellTreedotPerQuery menuIndex(Integer menuIndex) {
		if (menuIndex == null) {
			throw new RuntimeException("menuIndex is null");
		}
		this.menuIndex = menuIndex;
		return this;
	}

	public CellTreedotPerQuery menuIndexGreaterThanOrEqual(
			Integer menuIndexGreaterThanOrEqual) {
		if (menuIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("menuIndex is null");
		}
		this.menuIndexGreaterThanOrEqual = menuIndexGreaterThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery menuIndexLessThanOrEqual(
			Integer menuIndexLessThanOrEqual) {
		if (menuIndexLessThanOrEqual == null) {
			throw new RuntimeException("menuIndex is null");
		}
		this.menuIndexLessThanOrEqual = menuIndexLessThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery menuIndexs(List<Integer> menuIndexs) {
		if (menuIndexs == null) {
			throw new RuntimeException("menuIndexs is empty ");
		}
		this.menuIndexs = menuIndexs;
		return this;
	}

	public CellTreedotPerQuery nlevel(Integer nlevel) {
		if (nlevel == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevel = nlevel;
		return this;
	}

	public CellTreedotPerQuery nlevelGreaterThanOrEqual(
			Integer nlevelGreaterThanOrEqual) {
		if (nlevelGreaterThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery nlevelLessThanOrEqual(
			Integer nlevelLessThanOrEqual) {
		if (nlevelLessThanOrEqual == null) {
			throw new RuntimeException("nlevel is null");
		}
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
		return this;
	}

	public CellTreedotPerQuery nlevels(List<Integer> nlevels) {
		if (nlevels == null) {
			throw new RuntimeException("nlevels is empty ");
		}
		this.nlevels = nlevels;
		return this;
	}

	public void setFromid(String fromid) {
		this.fromid = fromid;
	}

	public void setFromidLike(String fromidLike) {
		this.fromidLike = fromidLike;
	}

	public void setFromids(List<String> fromids) {
		this.fromids = fromids;
	}

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
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

	public void setIndexNameLike(String indexNameLike) {
		this.indexNameLike = indexNameLike;
	}

	public void setIntuserper(Integer intuserper) {
		this.intuserper = intuserper;
	}

	public void setIntuserperGreaterThanOrEqual(
			Integer intuserperGreaterThanOrEqual) {
		this.intuserperGreaterThanOrEqual = intuserperGreaterThanOrEqual;
	}

	public void setIntuserperLessThanOrEqual(Integer intuserperLessThanOrEqual) {
		this.intuserperLessThanOrEqual = intuserperLessThanOrEqual;
	}

	public void setIntuserpers(List<Integer> intuserpers) {
		this.intuserpers = intuserpers;
	}

	public void setMenuIndex(Integer menuIndex) {
		this.menuIndex = menuIndex;
	}

	public void setMenuIndexGreaterThanOrEqual(
			Integer menuIndexGreaterThanOrEqual) {
		this.menuIndexGreaterThanOrEqual = menuIndexGreaterThanOrEqual;
	}

	public void setMenuIndexLessThanOrEqual(Integer menuIndexLessThanOrEqual) {
		this.menuIndexLessThanOrEqual = menuIndexLessThanOrEqual;
	}

	public void setMenuIndexs(List<Integer> menuIndexs) {
		this.menuIndexs = menuIndexs;
	}

	public void setNlevel(Integer nlevel) {
		this.nlevel = nlevel;
	}

	public void setNlevelGreaterThanOrEqual(Integer nlevelGreaterThanOrEqual) {
		this.nlevelGreaterThanOrEqual = nlevelGreaterThanOrEqual;
	}

	public void setNlevelLessThanOrEqual(Integer nlevelLessThanOrEqual) {
		this.nlevelLessThanOrEqual = nlevelLessThanOrEqual;
	}

	public void setNlevels(List<Integer> nlevels) {
		this.nlevels = nlevels;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}