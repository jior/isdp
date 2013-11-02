package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreewbsTabQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer tabIndex;
	protected Integer tabIndexGreaterThanOrEqual;
	protected Integer tabIndexLessThanOrEqual;
	protected List<Integer> tabIndexs;
	protected String nameLike;
	protected String onameLike;
	

	public TreewbsTabQuery() {

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

	public String getOnameLike() {
		if (onameLike != null && onameLike.trim().length() > 0) {
			if (!onameLike.startsWith("%")) {
				onameLike = "%" + onameLike;
			}
			if (!onameLike.endsWith("%")) {
				onameLike = onameLike + "%";
			}
		}
		return onameLike;
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

	public Integer getTabIndex() {
		return tabIndex;
	}

	public Integer getTabIndexGreaterThanOrEqual() {
		return tabIndexGreaterThanOrEqual;
	}

	public Integer getTabIndexLessThanOrEqual() {
		return tabIndexLessThanOrEqual;
	}

	public List<Integer> getTabIndexs() {
		return tabIndexs;
	}

	public TreewbsTabQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreewbsTabQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsTabQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreewbsTabQuery indexIds(List<Integer> indexIds) {
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
		addColumn("indexId", "index_id");
		addColumn("tabIndex", "Tab_index");
		addColumn("name", "name");
		addColumn("oname", "oname");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public TreewbsTabQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public TreewbsTabQuery onameLike(String onameLike) {
		if (onameLike == null) {
			throw new RuntimeException("oname is null");
		}
		this.onameLike = onameLike;
		return this;
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

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setOnameLike(String onameLike) {
		this.onameLike = onameLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTabIndex(Integer tabIndex) {
		this.tabIndex = tabIndex;
	}

	public void setTabIndexGreaterThanOrEqual(Integer tabIndexGreaterThanOrEqual) {
		this.tabIndexGreaterThanOrEqual = tabIndexGreaterThanOrEqual;
	}

	public void setTabIndexLessThanOrEqual(Integer tabIndexLessThanOrEqual) {
		this.tabIndexLessThanOrEqual = tabIndexLessThanOrEqual;
	}

	public void setTabIndexs(List<Integer> tabIndexs) {
		this.tabIndexs = tabIndexs;
	}

	public TreewbsTabQuery tabIndex(Integer tabIndex) {
		if (tabIndex == null) {
			throw new RuntimeException("tabIndex is null");
		}
		this.tabIndex = tabIndex;
		return this;
	}

	public TreewbsTabQuery tabIndexGreaterThanOrEqual(
			Integer tabIndexGreaterThanOrEqual) {
		if (tabIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("tabIndex is null");
		}
		this.tabIndexGreaterThanOrEqual = tabIndexGreaterThanOrEqual;
		return this;
	}

	public TreewbsTabQuery tabIndexLessThanOrEqual(
			Integer tabIndexLessThanOrEqual) {
		if (tabIndexLessThanOrEqual == null) {
			throw new RuntimeException("tabIndex is null");
		}
		this.tabIndexLessThanOrEqual = tabIndexLessThanOrEqual;
		return this;
	}

	public TreewbsTabQuery tabIndexs(List<Integer> tabIndexs) {
		if (tabIndexs == null) {
			throw new RuntimeException("tabIndexs is empty ");
		}
		this.tabIndexs = tabIndexs;
		return this;
	}

}