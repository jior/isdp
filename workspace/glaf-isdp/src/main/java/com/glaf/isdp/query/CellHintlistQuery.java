package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellHintlistQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected Integer indexIdGreaterThanOrEqual;
	protected Integer indexIdLessThanOrEqual;
	protected List<Integer> indexIds;
	protected String hint;
	protected String hintLike;
	protected List<String> hints;
	

	public CellHintlistQuery() {

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

	public String getHint() {
		return hint;
	}

	public String getHintLike() {
		if (hintLike != null && hintLike.trim().length() > 0) {
			if (!hintLike.startsWith("%")) {
				hintLike = "%" + hintLike;
			}
			if (!hintLike.endsWith("%")) {
				hintLike = hintLike + "%";
			}
		}
		return hintLike;
	}

	public List<String> getHints() {
		return hints;
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

	public void setHint(String hint) {
		this.hint = hint;
	}

	public void setHintLike(String hintLike) {
		this.hintLike = hintLike;
	}

	public void setHints(List<String> hints) {
		this.hints = hints;
	}

	public CellHintlistQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public CellHintlistQuery indexIdGreaterThanOrEqual(
			Integer indexIdGreaterThanOrEqual) {
		if (indexIdGreaterThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
		return this;
	}

	public CellHintlistQuery indexIdLessThanOrEqual(
			Integer indexIdLessThanOrEqual) {
		if (indexIdLessThanOrEqual == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
		return this;
	}

	public CellHintlistQuery indexIds(List<Integer> indexIds) {
		if (indexIds == null) {
			throw new RuntimeException("indexIds is empty ");
		}
		this.indexIds = indexIds;
		return this;
	}

	public CellHintlistQuery hint(String hint) {
		if (hint == null) {
			throw new RuntimeException("hint is null");
		}
		this.hint = hint;
		return this;
	}

	public CellHintlistQuery hintLike(String hintLike) {
		if (hintLike == null) {
			throw new RuntimeException("hint is null");
		}
		this.hintLike = hintLike;
		return this;
	}

	public CellHintlistQuery hints(List<String> hints) {
		if (hints == null) {
			throw new RuntimeException("hints is empty ");
		}
		this.hints = hints;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
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

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("indexId", "index_id");
		addColumn("hint", "hint");
	}

}