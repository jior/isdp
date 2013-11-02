package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class HintListQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String hintid;
	protected String hintidLike;
	protected List<String> hintids;
	protected String listLike;
	protected String contentLike;
	

	public HintListQuery() {

	}

	public HintListQuery contentLike(String contentLike) {
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

	public String getHintid() {
		return hintid;
	}

	public String getHintidLike() {
		if (hintidLike != null && hintidLike.trim().length() > 0) {
			if (!hintidLike.startsWith("%")) {
				hintidLike = "%" + hintidLike;
			}
			if (!hintidLike.endsWith("%")) {
				hintidLike = hintidLike + "%";
			}
		}
		return hintidLike;
	}

	public List<String> getHintids() {
		return hintids;
	}

	public String getListLike() {
		if (listLike != null && listLike.trim().length() > 0) {
			if (!listLike.startsWith("%")) {
				listLike = "%" + listLike;
			}
			if (!listLike.endsWith("%")) {
				listLike = listLike + "%";
			}
		}
		return listLike;
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

	public HintListQuery hintid(String hintid) {
		if (hintid == null) {
			throw new RuntimeException("hintid is null");
		}
		this.hintid = hintid;
		return this;
	}

	public HintListQuery hintidLike(String hintidLike) {
		if (hintidLike == null) {
			throw new RuntimeException("hintid is null");
		}
		this.hintidLike = hintidLike;
		return this;
	}

	public HintListQuery hintids(List<String> hintids) {
		if (hintids == null) {
			throw new RuntimeException("hintids is empty ");
		}
		this.hintids = hintids;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("hintid", "hintid");
		addColumn("list", "list");
		addColumn("content", "content");
		addColumn("listno", "listno");
		addColumn("hintdata", "hintdata");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public HintListQuery listLike(String listLike) {
		if (listLike == null) {
			throw new RuntimeException("list is null");
		}
		this.listLike = listLike;
		return this;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setHintid(String hintid) {
		this.hintid = hintid;
	}

	public void setHintidLike(String hintidLike) {
		this.hintidLike = hintidLike;
	}

	public void setHintids(List<String> hintids) {
		this.hintids = hintids;
	}

	public void setListLike(String listLike) {
		this.listLike = listLike;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}