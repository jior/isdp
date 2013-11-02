package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class TreeProjectParQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected Integer treeProjectParUser1;
	protected Integer treeProjectParUser1GreaterThanOrEqual;
	protected Integer treeProjectParUser1LessThanOrEqual;
	protected List<Integer> treeProjectParUser1s;
	

	public TreeProjectParQuery() {

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

	public Integer getTreeProjectParUser1() {
		return treeProjectParUser1;
	}

	public Integer getTreeProjectParUser1GreaterThanOrEqual() {
		return treeProjectParUser1GreaterThanOrEqual;
	}

	public Integer getTreeProjectParUser1LessThanOrEqual() {
		return treeProjectParUser1LessThanOrEqual;
	}

	public List<Integer> getTreeProjectParUser1s() {
		return treeProjectParUser1s;
	}

	public TreeProjectParQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public TreeProjectParQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public TreeProjectParQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public TreeProjectParQuery indexIds(List<Integer> indexIds) {
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
		addColumn("treeProjectParUser1", "treeproj_par_user1");
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

	public void setTreeProjectParUser1(Integer treeProjectParUser1) {
		this.treeProjectParUser1 = treeProjectParUser1;
	}

	public void setTreeProjectParUser1GreaterThanOrEqual(
			Integer treeProjectParUser1GreaterThanOrEqual) {
		this.treeProjectParUser1GreaterThanOrEqual = treeProjectParUser1GreaterThanOrEqual;
	}

	public void setTreeProjectParUser1LessThanOrEqual(
			Integer treeProjectParUser1LessThanOrEqual) {
		this.treeProjectParUser1LessThanOrEqual = treeProjectParUser1LessThanOrEqual;
	}

	public void setTreeProjectParUser1s(List<Integer> treeProjectParUser1s) {
		this.treeProjectParUser1s = treeProjectParUser1s;
	}

	public TreeProjectParQuery treeProjectParUser1(Integer treeProjectParUser1) {
		if (treeProjectParUser1 == null) {
			throw new RuntimeException("treeProjectParUser1 is null");
		}
		this.treeProjectParUser1 = treeProjectParUser1;
		return this;
	}

	public TreeProjectParQuery treeProjectParUser1GreaterThanOrEqual(
			Integer treeProjectParUser1GreaterThanOrEqual) {
		if (treeProjectParUser1GreaterThanOrEqual == null) {
			throw new RuntimeException("treeProjectParUser1 is null");
		}
		this.treeProjectParUser1GreaterThanOrEqual = treeProjectParUser1GreaterThanOrEqual;
		return this;
	}

	public TreeProjectParQuery treeProjectParUser1LessThanOrEqual(
			Integer treeProjectParUser1LessThanOrEqual) {
		if (treeProjectParUser1LessThanOrEqual == null) {
			throw new RuntimeException("treeProjectParUser1 is null");
		}
		this.treeProjectParUser1LessThanOrEqual = treeProjectParUser1LessThanOrEqual;
		return this;
	}

	public TreeProjectParQuery treeProjectParUser1s(
			List<Integer> treeProjectParUser1s) {
		if (treeProjectParUser1s == null) {
			throw new RuntimeException("treeProjectParUser1s is empty ");
		}
		this.treeProjectParUser1s = treeProjectParUser1s;
		return this;
	}

}