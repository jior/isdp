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

public class CellTreedotViewQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String tablename;
	protected String tablenameLike;
	protected List<String> tablenames;
	protected String tablenameS;
	protected String tablenameSLike;
	protected List<String> tablenameSs;
	protected String alldname;
	protected String alldnameLike;
	protected List<String> alldnames;
	protected String allfname;
	protected String allfnameLike;
	protected List<String> allfnames;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;

	protected Integer intrad;
	protected Integer intradGreaterThanOrEqual;
	protected Integer intradLessThanOrEqual;
	protected List<Integer> intrads;
	protected Integer intwbslevel;
	protected Integer intwbslevelGreaterThanOrEqual;
	protected Integer intwbslevelLessThanOrEqual;
	protected List<Integer> intwbslevels;
	

	public CellTreedotViewQuery() {

	}

	public CellTreedotViewQuery alldname(String alldname) {
		if (alldname == null) {
			throw new RuntimeException("alldname is null");
		}
		this.alldname = alldname;
		return this;
	}

	public CellTreedotViewQuery alldnameLike(String alldnameLike) {
		if (alldnameLike == null) {
			throw new RuntimeException("alldname is null");
		}
		this.alldnameLike = alldnameLike;
		return this;
	}

	public CellTreedotViewQuery alldnames(List<String> alldnames) {
		if (alldnames == null) {
			throw new RuntimeException("alldnames is empty ");
		}
		this.alldnames = alldnames;
		return this;
	}

	public CellTreedotViewQuery allfname(String allfname) {
		if (allfname == null) {
			throw new RuntimeException("allfname is null");
		}
		this.allfname = allfname;
		return this;
	}

	public CellTreedotViewQuery allfnameLike(String allfnameLike) {
		if (allfnameLike == null) {
			throw new RuntimeException("allfname is null");
		}
		this.allfnameLike = allfnameLike;
		return this;
	}

	public CellTreedotViewQuery allfnames(List<String> allfnames) {
		if (allfnames == null) {
			throw new RuntimeException("allfnames is empty ");
		}
		this.allfnames = allfnames;
		return this;
	}

	public String getAlldname() {
		return alldname;
	}

	public String getAlldnameLike() {
		if (alldnameLike != null && alldnameLike.trim().length() > 0) {
			if (!alldnameLike.startsWith("%")) {
				alldnameLike = "%" + alldnameLike;
			}
			if (!alldnameLike.endsWith("%")) {
				alldnameLike = alldnameLike + "%";
			}
		}
		return alldnameLike;
	}

	public List<String> getAlldnames() {
		return alldnames;
	}

	public String getAllfname() {
		return allfname;
	}

	public String getAllfnameLike() {
		if (allfnameLike != null && allfnameLike.trim().length() > 0) {
			if (!allfnameLike.startsWith("%")) {
				allfnameLike = "%" + allfnameLike;
			}
			if (!allfnameLike.endsWith("%")) {
				allfnameLike = allfnameLike + "%";
			}
		}
		return allfnameLike;
	}

	public List<String> getAllfnames() {
		return allfnames;
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

	public Integer getIntrad() {
		return intrad;
	}

	public Integer getIntradGreaterThanOrEqual() {
		return intradGreaterThanOrEqual;
	}

	public Integer getIntradLessThanOrEqual() {
		return intradLessThanOrEqual;
	}

	public List<Integer> getIntrads() {
		return intrads;
	}

	public Integer getIntwbslevel() {
		return intwbslevel;
	}

	public Integer getIntwbslevelGreaterThanOrEqual() {
		return intwbslevelGreaterThanOrEqual;
	}

	public Integer getIntwbslevelLessThanOrEqual() {
		return intwbslevelLessThanOrEqual;
	}

	public List<Integer> getIntwbslevels() {
		return intwbslevels;
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

	public String getTablename() {
		return tablename;
	}

	public String getTablenameLike() {
		if (tablenameLike != null && tablenameLike.trim().length() > 0) {
			if (!tablenameLike.startsWith("%")) {
				tablenameLike = "%" + tablenameLike;
			}
			if (!tablenameLike.endsWith("%")) {
				tablenameLike = tablenameLike + "%";
			}
		}
		return tablenameLike;
	}

	public List<String> getTablenames() {
		return tablenames;
	}

	public String getTablenameS() {
		return tablenameS;
	}

	public String getTablenameSLike() {
		if (tablenameSLike != null && tablenameSLike.trim().length() > 0) {
			if (!tablenameSLike.startsWith("%")) {
				tablenameSLike = "%" + tablenameSLike;
			}
			if (!tablenameSLike.endsWith("%")) {
				tablenameSLike = tablenameSLike + "%";
			}
		}
		return tablenameSLike;
	}

	public List<String> getTablenameSs() {
		return tablenameSs;
	}

	public CellTreedotViewQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellTreedotViewQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("tablename", "tablename");
		addColumn("tablenameS", "tablename_s");
		addColumn("alldname", "alldname");
		addColumn("allfname", "allfname");
		addColumn("indexId", "index_id");
		addColumn("listno", "listno");
		addColumn("intrad", "intrad");
		addColumn("intwbslevel", "intwbslevel");
	}

	public CellTreedotViewQuery intrad(Integer intrad) {
		if (intrad == null) {
			throw new RuntimeException("intrad is null");
		}
		this.intrad = intrad;
		return this;
	}

	public CellTreedotViewQuery intradGreaterThanOrEqual(
			Integer intradGreaterThanOrEqual) {
		if (intradGreaterThanOrEqual == null) {
			throw new RuntimeException("intrad is null");
		}
		this.intradGreaterThanOrEqual = intradGreaterThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery intradLessThanOrEqual(
			Integer intradLessThanOrEqual) {
		if (intradLessThanOrEqual == null) {
			throw new RuntimeException("intrad is null");
		}
		this.intradLessThanOrEqual = intradLessThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery intrads(List<Integer> intrads) {
		if (intrads == null) {
			throw new RuntimeException("intrads is empty ");
		}
		this.intrads = intrads;
		return this;
	}

	public CellTreedotViewQuery intwbslevel(Integer intwbslevel) {
		if (intwbslevel == null) {
			throw new RuntimeException("intwbslevel is null");
		}
		this.intwbslevel = intwbslevel;
		return this;
	}

	public CellTreedotViewQuery intwbslevelGreaterThanOrEqual(
			Integer intwbslevelGreaterThanOrEqual) {
		if (intwbslevelGreaterThanOrEqual == null) {
			throw new RuntimeException("intwbslevel is null");
		}
		this.intwbslevelGreaterThanOrEqual = intwbslevelGreaterThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery intwbslevelLessThanOrEqual(
			Integer intwbslevelLessThanOrEqual) {
		if (intwbslevelLessThanOrEqual == null) {
			throw new RuntimeException("intwbslevel is null");
		}
		this.intwbslevelLessThanOrEqual = intwbslevelLessThanOrEqual;
		return this;
	}

	public CellTreedotViewQuery intwbslevels(List<Integer> intwbslevels) {
		if (intwbslevels == null) {
			throw new RuntimeException("intwbslevels is empty ");
		}
		this.intwbslevels = intwbslevels;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setAlldname(String alldname) {
		this.alldname = alldname;
	}

	public void setAlldnameLike(String alldnameLike) {
		this.alldnameLike = alldnameLike;
	}

	public void setAlldnames(List<String> alldnames) {
		this.alldnames = alldnames;
	}

	public void setAllfname(String allfname) {
		this.allfname = allfname;
	}

	public void setAllfnameLike(String allfnameLike) {
		this.allfnameLike = allfnameLike;
	}

	public void setAllfnames(List<String> allfnames) {
		this.allfnames = allfnames;
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

	public void setIntrad(Integer intrad) {
		this.intrad = intrad;
	}

	public void setIntradGreaterThanOrEqual(Integer intradGreaterThanOrEqual) {
		this.intradGreaterThanOrEqual = intradGreaterThanOrEqual;
	}

	public void setIntradLessThanOrEqual(Integer intradLessThanOrEqual) {
		this.intradLessThanOrEqual = intradLessThanOrEqual;
	}

	public void setIntrads(List<Integer> intrads) {
		this.intrads = intrads;
	}

	public void setIntwbslevel(Integer intwbslevel) {
		this.intwbslevel = intwbslevel;
	}

	public void setIntwbslevelGreaterThanOrEqual(
			Integer intwbslevelGreaterThanOrEqual) {
		this.intwbslevelGreaterThanOrEqual = intwbslevelGreaterThanOrEqual;
	}

	public void setIntwbslevelLessThanOrEqual(Integer intwbslevelLessThanOrEqual) {
		this.intwbslevelLessThanOrEqual = intwbslevelLessThanOrEqual;
	}

	public void setIntwbslevels(List<Integer> intwbslevels) {
		this.intwbslevels = intwbslevels;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public void setTablenameLike(String tablenameLike) {
		this.tablenameLike = tablenameLike;
	}

	public void setTablenames(List<String> tablenames) {
		this.tablenames = tablenames;
	}

	public void setTablenameS(String tablenameS) {
		this.tablenameS = tablenameS;
	}

	public void setTablenameSLike(String tablenameSLike) {
		this.tablenameSLike = tablenameSLike;
	}

	public void setTablenameSs(List<String> tablenameSs) {
		this.tablenameSs = tablenameSs;
	}

	public CellTreedotViewQuery tablename(String tablename) {
		if (tablename == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablename = tablename;
		return this;
	}

	public CellTreedotViewQuery tablenameLike(String tablenameLike) {
		if (tablenameLike == null) {
			throw new RuntimeException("tablename is null");
		}
		this.tablenameLike = tablenameLike;
		return this;
	}

	public CellTreedotViewQuery tablenames(List<String> tablenames) {
		if (tablenames == null) {
			throw new RuntimeException("tablenames is empty ");
		}
		this.tablenames = tablenames;
		return this;
	}

	public CellTreedotViewQuery tablenameS(String tablenameS) {
		if (tablenameS == null) {
			throw new RuntimeException("tablenameS is null");
		}
		this.tablenameS = tablenameS;
		return this;
	}

	public CellTreedotViewQuery tablenameSLike(String tablenameSLike) {
		if (tablenameSLike == null) {
			throw new RuntimeException("tablenameS is null");
		}
		this.tablenameSLike = tablenameSLike;
		return this;
	}

	public CellTreedotViewQuery tablenameSs(List<String> tablenameSs) {
		if (tablenameSs == null) {
			throw new RuntimeException("tablenameSs is empty ");
		}
		this.tablenameSs = tablenameSs;
		return this;
	}

}