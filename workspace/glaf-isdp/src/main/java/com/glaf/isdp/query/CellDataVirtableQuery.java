package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellDataVirtableQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String tableid;
	protected String tableidLike;
	protected List<String> tableids;
	protected String desid;
	protected String desidLike;
	protected List<String> desids;
	protected Integer inttype;
	protected Integer inttypeGreaterThanOrEqual;
	protected Integer inttypeLessThanOrEqual;
	protected List<Integer> inttypes;
	protected String lstnameLike;
	protected String contentLike;
	protected Integer intsave;
	protected Integer intsaveGreaterThanOrEqual;
	protected Integer intsaveLessThanOrEqual;
	protected List<Integer> intsaves;
	

	public CellDataVirtableQuery() {

	}

	public String getTableid() {
		return tableid;
	}

	public String getTableidLike() {
		if (tableidLike != null && tableidLike.trim().length() > 0) {
			if (!tableidLike.startsWith("%")) {
				tableidLike = "%" + tableidLike;
			}
			if (!tableidLike.endsWith("%")) {
				tableidLike = tableidLike + "%";
			}
		}
		return tableidLike;
	}

	public List<String> getTableids() {
		return tableids;
	}

	public String getDesid() {
		return desid;
	}

	public String getDesidLike() {
		if (desidLike != null && desidLike.trim().length() > 0) {
			if (!desidLike.startsWith("%")) {
				desidLike = "%" + desidLike;
			}
			if (!desidLike.endsWith("%")) {
				desidLike = desidLike + "%";
			}
		}
		return desidLike;
	}

	public List<String> getDesids() {
		return desids;
	}

	public Integer getInttype() {
		return inttype;
	}

	public Integer getInttypeGreaterThanOrEqual() {
		return inttypeGreaterThanOrEqual;
	}

	public Integer getInttypeLessThanOrEqual() {
		return inttypeLessThanOrEqual;
	}

	public List<Integer> getInttypes() {
		return inttypes;
	}

	public String getLstnameLike() {
		if (lstnameLike != null && lstnameLike.trim().length() > 0) {
			if (!lstnameLike.startsWith("%")) {
				lstnameLike = "%" + lstnameLike;
			}
			if (!lstnameLike.endsWith("%")) {
				lstnameLike = lstnameLike + "%";
			}
		}
		return lstnameLike;
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

	public Integer getIntsave() {
		return intsave;
	}

	public Integer getIntsaveGreaterThanOrEqual() {
		return intsaveGreaterThanOrEqual;
	}

	public Integer getIntsaveLessThanOrEqual() {
		return intsaveLessThanOrEqual;
	}

	public List<Integer> getIntsaves() {
		return intsaves;
	}

	public void setTableid(String tableid) {
		this.tableid = tableid;
	}

	public void setTableidLike(String tableidLike) {
		this.tableidLike = tableidLike;
	}

	public void setTableids(List<String> tableids) {
		this.tableids = tableids;
	}

	public void setDesid(String desid) {
		this.desid = desid;
	}

	public void setDesidLike(String desidLike) {
		this.desidLike = desidLike;
	}

	public void setDesids(List<String> desids) {
		this.desids = desids;
	}

	public void setInttype(Integer inttype) {
		this.inttype = inttype;
	}

	public void setInttypeGreaterThanOrEqual(Integer inttypeGreaterThanOrEqual) {
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
	}

	public void setInttypeLessThanOrEqual(Integer inttypeLessThanOrEqual) {
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
	}

	public void setInttypes(List<Integer> inttypes) {
		this.inttypes = inttypes;
	}

	public void setLstnameLike(String lstnameLike) {
		this.lstnameLike = lstnameLike;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setIntsave(Integer intsave) {
		this.intsave = intsave;
	}

	public void setIntsaveGreaterThanOrEqual(Integer intsaveGreaterThanOrEqual) {
		this.intsaveGreaterThanOrEqual = intsaveGreaterThanOrEqual;
	}

	public void setIntsaveLessThanOrEqual(Integer intsaveLessThanOrEqual) {
		this.intsaveLessThanOrEqual = intsaveLessThanOrEqual;
	}

	public void setIntsaves(List<Integer> intsaves) {
		this.intsaves = intsaves;
	}

	public CellDataVirtableQuery tableid(String tableid) {
		if (tableid == null) {
			throw new RuntimeException("tableid is null");
		}
		this.tableid = tableid;
		return this;
	}

	public CellDataVirtableQuery tableidLike(String tableidLike) {
		if (tableidLike == null) {
			throw new RuntimeException("tableid is null");
		}
		this.tableidLike = tableidLike;
		return this;
	}

	public CellDataVirtableQuery tableids(List<String> tableids) {
		if (tableids == null) {
			throw new RuntimeException("tableids is empty ");
		}
		this.tableids = tableids;
		return this;
	}

	public CellDataVirtableQuery desid(String desid) {
		if (desid == null) {
			throw new RuntimeException("desid is null");
		}
		this.desid = desid;
		return this;
	}

	public CellDataVirtableQuery desidLike(String desidLike) {
		if (desidLike == null) {
			throw new RuntimeException("desid is null");
		}
		this.desidLike = desidLike;
		return this;
	}

	public CellDataVirtableQuery desids(List<String> desids) {
		if (desids == null) {
			throw new RuntimeException("desids is empty ");
		}
		this.desids = desids;
		return this;
	}

	public CellDataVirtableQuery inttype(Integer inttype) {
		if (inttype == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttype = inttype;
		return this;
	}

	public CellDataVirtableQuery inttypeGreaterThanOrEqual(
			Integer inttypeGreaterThanOrEqual) {
		if (inttypeGreaterThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeGreaterThanOrEqual = inttypeGreaterThanOrEqual;
		return this;
	}

	public CellDataVirtableQuery inttypeLessThanOrEqual(
			Integer inttypeLessThanOrEqual) {
		if (inttypeLessThanOrEqual == null) {
			throw new RuntimeException("inttype is null");
		}
		this.inttypeLessThanOrEqual = inttypeLessThanOrEqual;
		return this;
	}

	public CellDataVirtableQuery inttypes(List<Integer> inttypes) {
		if (inttypes == null) {
			throw new RuntimeException("inttypes is empty ");
		}
		this.inttypes = inttypes;
		return this;
	}

	public CellDataVirtableQuery lstnameLike(String lstnameLike) {
		if (lstnameLike == null) {
			throw new RuntimeException("lstname is null");
		}
		this.lstnameLike = lstnameLike;
		return this;
	}

	public CellDataVirtableQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public CellDataVirtableQuery intsave(Integer intsave) {
		if (intsave == null) {
			throw new RuntimeException("intsave is null");
		}
		this.intsave = intsave;
		return this;
	}

	public CellDataVirtableQuery intsaveGreaterThanOrEqual(
			Integer intsaveGreaterThanOrEqual) {
		if (intsaveGreaterThanOrEqual == null) {
			throw new RuntimeException("intsave is null");
		}
		this.intsaveGreaterThanOrEqual = intsaveGreaterThanOrEqual;
		return this;
	}

	public CellDataVirtableQuery intsaveLessThanOrEqual(
			Integer intsaveLessThanOrEqual) {
		if (intsaveLessThanOrEqual == null) {
			throw new RuntimeException("intsave is null");
		}
		this.intsaveLessThanOrEqual = intsaveLessThanOrEqual;
		return this;
	}

	public CellDataVirtableQuery intsaves(List<Integer> intsaves) {
		if (intsaves == null) {
			throw new RuntimeException("intsaves is empty ");
		}
		this.intsaves = intsaves;
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
		addColumn("tableid", "tableid");
		addColumn("desid", "desid");
		addColumn("inttype", "inttype");
		addColumn("lstname", "lstname");
		addColumn("content", "content");
		addColumn("intsave", "intsave");
	}

}