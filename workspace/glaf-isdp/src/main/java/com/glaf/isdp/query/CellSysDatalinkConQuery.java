package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class CellSysDatalinkConQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String sysdatalinkId;
	protected String sysdatalinkIdLike;
	protected List<String> sysdatalinkIds;
	protected Integer intandor;
	protected Integer intandorGreaterThanOrEqual;
	protected Integer intandorLessThanOrEqual;
	protected List<Integer> intandors;
	

	public CellSysDatalinkConQuery() {

	}

	public String getSysdatalinkId() {
		return sysdatalinkId;
	}

	public String getSysdatalinkIdLike() {
		if (sysdatalinkIdLike != null && sysdatalinkIdLike.trim().length() > 0) {
			if (!sysdatalinkIdLike.startsWith("%")) {
				sysdatalinkIdLike = "%" + sysdatalinkIdLike;
			}
			if (!sysdatalinkIdLike.endsWith("%")) {
				sysdatalinkIdLike = sysdatalinkIdLike + "%";
			}
		}
		return sysdatalinkIdLike;
	}

	public List<String> getSysdatalinkIds() {
		return sysdatalinkIds;
	}

	public Integer getIntandor() {
		return intandor;
	}

	public Integer getIntandorGreaterThanOrEqual() {
		return intandorGreaterThanOrEqual;
	}

	public Integer getIntandorLessThanOrEqual() {
		return intandorLessThanOrEqual;
	}

	public List<Integer> getIntandors() {
		return intandors;
	}

	public void setSysdatalinkId(String sysdatalinkId) {
		this.sysdatalinkId = sysdatalinkId;
	}

	public void setSysdatalinkIdLike(String sysdatalinkIdLike) {
		this.sysdatalinkIdLike = sysdatalinkIdLike;
	}

	public void setSysdatalinkIds(List<String> sysdatalinkIds) {
		this.sysdatalinkIds = sysdatalinkIds;
	}

	public void setIntandor(Integer intandor) {
		this.intandor = intandor;
	}

	public void setIntandorGreaterThanOrEqual(Integer intandorGreaterThanOrEqual) {
		this.intandorGreaterThanOrEqual = intandorGreaterThanOrEqual;
	}

	public void setIntandorLessThanOrEqual(Integer intandorLessThanOrEqual) {
		this.intandorLessThanOrEqual = intandorLessThanOrEqual;
	}

	public void setIntandors(List<Integer> intandors) {
		this.intandors = intandors;
	}

	public CellSysDatalinkConQuery sysdatalinkId(String sysdatalinkId) {
		if (sysdatalinkId == null) {
			throw new RuntimeException("sysdatalinkId is null");
		}
		this.sysdatalinkId = sysdatalinkId;
		return this;
	}

	public CellSysDatalinkConQuery sysdatalinkIdLike(String sysdatalinkIdLike) {
		if (sysdatalinkIdLike == null) {
			throw new RuntimeException("sysdatalinkId is null");
		}
		this.sysdatalinkIdLike = sysdatalinkIdLike;
		return this;
	}

	public CellSysDatalinkConQuery sysdatalinkIds(List<String> sysdatalinkIds) {
		if (sysdatalinkIds == null) {
			throw new RuntimeException("sysdatalinkIds is empty ");
		}
		this.sysdatalinkIds = sysdatalinkIds;
		return this;
	}

	public CellSysDatalinkConQuery intandor(Integer intandor) {
		if (intandor == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandor = intandor;
		return this;
	}

	public CellSysDatalinkConQuery intandorGreaterThanOrEqual(
			Integer intandorGreaterThanOrEqual) {
		if (intandorGreaterThanOrEqual == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandorGreaterThanOrEqual = intandorGreaterThanOrEqual;
		return this;
	}

	public CellSysDatalinkConQuery intandorLessThanOrEqual(
			Integer intandorLessThanOrEqual) {
		if (intandorLessThanOrEqual == null) {
			throw new RuntimeException("intandor is null");
		}
		this.intandorLessThanOrEqual = intandorLessThanOrEqual;
		return this;
	}

	public CellSysDatalinkConQuery intandors(List<Integer> intandors) {
		if (intandors == null) {
			throw new RuntimeException("intandors is empty ");
		}
		this.intandors = intandors;
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
		addColumn("sysdatalinkId", "sysdatalink_id");
		addColumn("intandor", "intandor");
	}

}