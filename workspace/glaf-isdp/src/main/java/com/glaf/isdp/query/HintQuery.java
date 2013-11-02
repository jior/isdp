package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class HintQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String hint;
	protected String hintLike;
	protected List<String> hints;
	

	public HintQuery() {

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

	public HintQuery hint(String hint) {
		if (hint == null) {
			throw new RuntimeException("hint is null");
		}
		this.hint = hint;
		return this;
	}

	public HintQuery hintLike(String hintLike) {
		if (hintLike == null) {
			throw new RuntimeException("hint is null");
		}
		this.hintLike = hintLike;
		return this;
	}

	public HintQuery hints(List<String> hints) {
		if (hints == null) {
			throw new RuntimeException("hints is empty ");
		}
		this.hints = hints;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("hint", "hint");
	}

	public String getSortOrder() {
		return sortOrder;
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

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}