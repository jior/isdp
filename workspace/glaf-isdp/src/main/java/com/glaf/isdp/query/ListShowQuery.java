package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ListShowQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer indexId;
	protected List<Integer> indexIds;
	protected String listId;
	protected List<String> listIds;
	protected String frmtype;
	protected String frmtypeLike;
	protected List<String> frmtypes;

	

	public ListShowQuery() {

	}

	public ListShowQuery frmtype(String frmtype) {
		if (frmtype == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtype = frmtype;
		return this;
	}

	public ListShowQuery frmtypeLike(String frmtypeLike) {
		if (frmtypeLike == null) {
			throw new RuntimeException("frmtype is null");
		}
		this.frmtypeLike = frmtypeLike;
		return this;
	}

	public ListShowQuery frmtypes(List<String> frmtypes) {
		if (frmtypes == null) {
			throw new RuntimeException("frmtypes is empty ");
		}
		this.frmtypes = frmtypes;
		return this;
	}

	public String getFrmtype() {
		return frmtype;
	}

	public String getFrmtypeLike() {
		if (frmtypeLike != null && frmtypeLike.trim().length() > 0) {
			if (!frmtypeLike.startsWith("%")) {
				frmtypeLike = "%" + frmtypeLike;
			}
			if (!frmtypeLike.endsWith("%")) {
				frmtypeLike = frmtypeLike + "%";
			}
		}
		return frmtypeLike;
	}

	public List<String> getFrmtypes() {
		return frmtypes;
	}

	public Integer getIndexId() {
		return indexId;
	}

	public List<Integer> getIndexIds() {
		return indexIds;
	}

	public String getListId() {
		return listId;
	}

	public List<String> getListIds() {
		return listIds;
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

	public ListShowQuery indexId(Integer indexId) {
		if (indexId == null) {
			throw new RuntimeException("indexId is null");
		}
		this.indexId = indexId;
		return this;
	}

	public ListShowQuery indexIds(List<Integer> indexIds) {
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
		addColumn("listId", "listId");
		addColumn("listno", "listno");
		addColumn("frmtype", "frmtype");
		addColumn("leftL", "left_L");
		addColumn("topL", "top_L");
		addColumn("widthL", "width_L");
		addColumn("heightL", "height_L");
		addColumn("leftC", "left_C");
		addColumn("topC", "top_C");
		addColumn("widthC", "width_C");
		addColumn("heightC", "height_C");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public ListShowQuery listId(String listId) {
		if (listId == null) {
			throw new RuntimeException("listId is null");
		}
		this.listId = listId;
		return this;
	}

	public ListShowQuery listIds(List<String> listIds) {
		if (listIds == null) {
			throw new RuntimeException("listIds is empty ");
		}
		this.listIds = listIds;
		return this;
	}

	public void setFrmtype(String frmtype) {
		this.frmtype = frmtype;
	}

	public void setFrmtypeLike(String frmtypeLike) {
		this.frmtypeLike = frmtypeLike;
	}

	public void setFrmtypes(List<String> frmtypes) {
		this.frmtypes = frmtypes;
	}

	public void setIndexId(Integer indexId) {
		this.indexId = indexId;
	}

	public void setIndexIds(List<Integer> indexIds) {
		this.indexIds = indexIds;
	}

	public void setListId(String listId) {
		this.listId = listId;
	}

	public void setListIds(List<String> listIds) {
		this.listIds = listIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}