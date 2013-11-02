package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellDottofileQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer treetopIndexid;
	protected Integer treetopIndexidGreaterThanOrEqual;
	protected Integer treetopIndexidLessThanOrEqual;
	protected List<Integer> treetopIndexids;
	protected String numLike;
	protected String nameLike;
	

	public CellDottofileQuery() {

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

	public String getNumLike() {
		if (numLike != null && numLike.trim().length() > 0) {
			if (!numLike.startsWith("%")) {
				numLike = "%" + numLike;
			}
			if (!numLike.endsWith("%")) {
				numLike = numLike + "%";
			}
		}
		return numLike;
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

	public Integer getTreetopIndexid() {
		return treetopIndexid;
	}

	public Integer getTreetopIndexidGreaterThanOrEqual() {
		return treetopIndexidGreaterThanOrEqual;
	}

	public Integer getTreetopIndexidLessThanOrEqual() {
		return treetopIndexidLessThanOrEqual;
	}

	public List<Integer> getTreetopIndexids() {
		return treetopIndexids;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("treetopIndexid", "treetop_indexid");
		addColumn("num", "num");
		addColumn("name", "name");
		addColumn("listno", "listno");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public CellDottofileQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public CellDottofileQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTreetopIndexid(Integer treetopIndexid) {
		this.treetopIndexid = treetopIndexid;
	}

	public void setTreetopIndexidGreaterThanOrEqual(
			Integer treetopIndexidGreaterThanOrEqual) {
		this.treetopIndexidGreaterThanOrEqual = treetopIndexidGreaterThanOrEqual;
	}

	public void setTreetopIndexidLessThanOrEqual(
			Integer treetopIndexidLessThanOrEqual) {
		this.treetopIndexidLessThanOrEqual = treetopIndexidLessThanOrEqual;
	}

	public void setTreetopIndexids(List<Integer> treetopIndexids) {
		this.treetopIndexids = treetopIndexids;
	}

	public CellDottofileQuery treetopIndexid(Integer treetopIndexid) {
		if (treetopIndexid == null) {
			throw new RuntimeException("treetopIndexid is null");
		}
		this.treetopIndexid = treetopIndexid;
		return this;
	}

	public CellDottofileQuery treetopIndexidGreaterThanOrEqual(
			Integer treetopIndexidGreaterThanOrEqual) {
		if (treetopIndexidGreaterThanOrEqual == null) {
			throw new RuntimeException("treetopIndexid is null");
		}
		this.treetopIndexidGreaterThanOrEqual = treetopIndexidGreaterThanOrEqual;
		return this;
	}

	public CellDottofileQuery treetopIndexidLessThanOrEqual(
			Integer treetopIndexidLessThanOrEqual) {
		if (treetopIndexidLessThanOrEqual == null) {
			throw new RuntimeException("treetopIndexid is null");
		}
		this.treetopIndexidLessThanOrEqual = treetopIndexidLessThanOrEqual;
		return this;
	}

	public CellDottofileQuery treetopIndexids(List<Integer> treetopIndexids) {
		if (treetopIndexids == null) {
			throw new RuntimeException("treetopIndexids is empty ");
		}
		this.treetopIndexids = treetopIndexids;
		return this;
	}

}