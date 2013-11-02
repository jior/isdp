package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class NetRoleUseQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected Integer roleid;
	protected List<Integer> roleids;
	protected Integer celltreedotIndex;
	protected List<Integer> celltreedotIndexs;
	protected Integer intuserper;
	protected List<Integer> intuserpers;
	

	public NetRoleUseQuery() {

	}

	public NetRoleUseQuery celltreedotIndex(Integer celltreedotIndex) {
		if (celltreedotIndex == null) {
			throw new RuntimeException("celltreedotIndex is null");
		}
		this.celltreedotIndex = celltreedotIndex;
		return this;
	}

	public NetRoleUseQuery celltreedotIndexs(List<Integer> celltreedotIndexs) {
		if (celltreedotIndexs == null) {
			throw new RuntimeException("celltreedotIndexs is empty ");
		}
		this.celltreedotIndexs = celltreedotIndexs;
		return this;
	}

	public Integer getCelltreedotIndex() {
		return celltreedotIndex;
	}

	public List<Integer> getCelltreedotIndexs() {
		return celltreedotIndexs;
	}

	public Integer getIntuserper() {
		return intuserper;
	}

	public List<Integer> getIntuserpers() {
		return intuserpers;
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

	public Integer getRoleid() {
		return roleid;
	}

	public List<Integer> getRoleids() {
		return roleids;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("roleid", "roleid");
		addColumn("celltreedotIndex", "celltreedot_index");
		addColumn("intuserper", "intuserper");
	}

	public NetRoleUseQuery intuserper(Integer intuserper) {
		if (intuserper == null) {
			throw new RuntimeException("intuserper is null");
		}
		this.intuserper = intuserper;
		return this;
	}

	public NetRoleUseQuery intuserpers(List<Integer> intuserpers) {
		if (intuserpers == null) {
			throw new RuntimeException("intuserpers is empty ");
		}
		this.intuserpers = intuserpers;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public NetRoleUseQuery roleid(Integer roleid) {
		if (roleid == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleid = roleid;
		return this;
	}

	public NetRoleUseQuery roleids(List<Integer> roleids) {
		if (roleids == null) {
			throw new RuntimeException("roleids is empty ");
		}
		this.roleids = roleids;
		return this;
	}

	public void setCelltreedotIndex(Integer celltreedotIndex) {
		this.celltreedotIndex = celltreedotIndex;
	}

	public void setCelltreedotIndexs(List<Integer> celltreedotIndexs) {
		this.celltreedotIndexs = celltreedotIndexs;
	}

	public void setIntuserper(Integer intuserper) {
		this.intuserper = intuserper;
	}

	public void setIntuserpers(List<Integer> intuserpers) {
		this.intuserpers = intuserpers;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public void setRoleids(List<Integer> roleids) {
		this.roleids = roleids;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}