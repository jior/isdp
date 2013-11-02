package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreewbsNameQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer wbsindex;
	protected Integer wbsindexGreaterThanOrEqual;
	protected Integer wbsindexLessThanOrEqual;
	protected List<Integer> wbsindexs;
	

	public TreewbsNameQuery() {

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

	public Integer getWbsindex() {
		return wbsindex;
	}

	public Integer getWbsindexGreaterThanOrEqual() {
		return wbsindexGreaterThanOrEqual;
	}

	public Integer getWbsindexLessThanOrEqual() {
		return wbsindexLessThanOrEqual;
	}

	public List<Integer> getWbsindexs() {
		return wbsindexs;
	}

	public TreewbsNameQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreewbsNameQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreewbsNameQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreewbsNameQuery indexIds(List<Integer> indexIds) {
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
		addColumn("wbsindex", "wbsindex");
	}

	public String getSortOrder() {
		return sortOrder;
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

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setWbsindex(Integer wbsindex) {
		this.wbsindex = wbsindex;
	}

	public void setWbsindexGreaterThanOrEqual(Integer wbsindexGreaterThanOrEqual) {
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
	}

	public void setWbsindexLessThanOrEqual(Integer wbsindexLessThanOrEqual) {
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
	}

	public void setWbsindexs(List<Integer> wbsindexs) {
		this.wbsindexs = wbsindexs;
	}

	public TreewbsNameQuery wbsindex(Integer wbsindex) {
		if (wbsindex == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindex = wbsindex;
		return this;
	}

	public TreewbsNameQuery wbsindexGreaterThanOrEqual(
			Integer wbsindexGreaterThanOrEqual) {
		if (wbsindexGreaterThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexGreaterThanOrEqual = wbsindexGreaterThanOrEqual;
		return this;
	}

	public TreewbsNameQuery wbsindexLessThanOrEqual(
			Integer wbsindexLessThanOrEqual) {
		if (wbsindexLessThanOrEqual == null) {
			throw new RuntimeException("wbsindex is null");
		}
		this.wbsindexLessThanOrEqual = wbsindexLessThanOrEqual;
		return this;
	}

	public TreewbsNameQuery wbsindexs(List<Integer> wbsindexs) {
		if (wbsindexs == null) {
			throw new RuntimeException("wbsindexs is empty ");
		}
		this.wbsindexs = wbsindexs;
		return this;
	}

}