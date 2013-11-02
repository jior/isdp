package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ProjectCellAndFileRefQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String pfileid;
	protected String pfileidLike;
	protected List<String> pfileids;
	protected String cellid;
	protected String cellidLike;
	protected List<String> cellids;
	

	public ProjectCellAndFileRefQuery() {

	}

	public ProjectCellAndFileRefQuery cellid(String cellid) {
		if (cellid == null) {
			throw new RuntimeException("cellid is null");
		}
		this.cellid = cellid;
		return this;
	}

	public ProjectCellAndFileRefQuery cellidLike(String cellidLike) {
		if (cellidLike == null) {
			throw new RuntimeException("cellid is null");
		}
		this.cellidLike = cellidLike;
		return this;
	}

	public ProjectCellAndFileRefQuery cellids(List<String> cellids) {
		if (cellids == null) {
			throw new RuntimeException("cellids is empty ");
		}
		this.cellids = cellids;
		return this;
	}

	public String getCellid() {
		return cellid;
	}

	public String getCellidLike() {
		if (cellidLike != null && cellidLike.trim().length() > 0) {
			if (!cellidLike.startsWith("%")) {
				cellidLike = "%" + cellidLike;
			}
			if (!cellidLike.endsWith("%")) {
				cellidLike = cellidLike + "%";
			}
		}
		return cellidLike;
	}

	public List<String> getCellids() {
		return cellids;
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

	public String getPfileid() {
		return pfileid;
	}

	public String getPfileidLike() {
		if (pfileidLike != null && pfileidLike.trim().length() > 0) {
			if (!pfileidLike.startsWith("%")) {
				pfileidLike = "%" + pfileidLike;
			}
			if (!pfileidLike.endsWith("%")) {
				pfileidLike = pfileidLike + "%";
			}
		}
		return pfileidLike;
	}

	public List<String> getPfileids() {
		return pfileids;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("pfileid", "pfileid");
		addColumn("cellid", "cellid");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public ProjectCellAndFileRefQuery pfileid(String pfileid) {
		if (pfileid == null) {
			throw new RuntimeException("pfileid is null");
		}
		this.pfileid = pfileid;
		return this;
	}

	public ProjectCellAndFileRefQuery pfileidLike(String pfileidLike) {
		if (pfileidLike == null) {
			throw new RuntimeException("pfileid is null");
		}
		this.pfileidLike = pfileidLike;
		return this;
	}

	public ProjectCellAndFileRefQuery pfileids(List<String> pfileids) {
		if (pfileids == null) {
			throw new RuntimeException("pfileids is empty ");
		}
		this.pfileids = pfileids;
		return this;
	}

	public void setCellid(String cellid) {
		this.cellid = cellid;
	}

	public void setCellidLike(String cellidLike) {
		this.cellidLike = cellidLike;
	}

	public void setCellids(List<String> cellids) {
		this.cellids = cellids;
	}

	public void setPfileid(String pfileid) {
		this.pfileid = pfileid;
	}

	public void setPfileidLike(String pfileidLike) {
		this.pfileidLike = pfileidLike;
	}

	public void setPfileids(List<String> pfileids) {
		this.pfileids = pfileids;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}