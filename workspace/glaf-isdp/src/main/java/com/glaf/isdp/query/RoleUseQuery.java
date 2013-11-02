package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class RoleUseQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String roleId;
	protected List<String> roleIds;
	protected String usetype;
	protected String usetypeLike;
	protected List<String> usetypes;
	protected Integer pid;
	protected Integer pidGreaterThanOrEqual;
	protected Integer pidLessThanOrEqual;
	protected List<Integer> pids;
	

	public RoleUseQuery() {

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

	public Integer getPid() {
		return pid;
	}

	public Integer getPidGreaterThanOrEqual() {
		return pidGreaterThanOrEqual;
	}

	public Integer getPidLessThanOrEqual() {
		return pidLessThanOrEqual;
	}

	public List<Integer> getPids() {
		return pids;
	}

	public String getRoleId() {
		return roleId;
	}

	public List<String> getRoleIds() {
		return roleIds;
	}

	public String getUsetype() {
		return usetype;
	}

	public String getUsetypeLike() {
		if (usetypeLike != null && usetypeLike.trim().length() > 0) {
			if (!usetypeLike.startsWith("%")) {
				usetypeLike = "%" + usetypeLike;
			}
			if (!usetypeLike.endsWith("%")) {
				usetypeLike = usetypeLike + "%";
			}
		}
		return usetypeLike;
	}

	public List<String> getUsetypes() {
		return usetypes;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("roleId", "roleId");
		addColumn("usetype", "usetype");
		addColumn("pid", "pid");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public RoleUseQuery pid(Integer pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public RoleUseQuery pidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		if (pidGreaterThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
		return this;
	}

	public RoleUseQuery pidLessThanOrEqual(Integer pidLessThanOrEqual) {
		if (pidLessThanOrEqual == null) {
			throw new RuntimeException("pid is null");
		}
		this.pidLessThanOrEqual = pidLessThanOrEqual;
		return this;
	}

	public RoleUseQuery pids(List<Integer> pids) {
		if (pids == null) {
			throw new RuntimeException("pids is empty ");
		}
		this.pids = pids;
		return this;
	}

	public RoleUseQuery roleId(String roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public RoleUseQuery roleIds(List<String> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setPidGreaterThanOrEqual(Integer pidGreaterThanOrEqual) {
		this.pidGreaterThanOrEqual = pidGreaterThanOrEqual;
	}

	public void setPidLessThanOrEqual(Integer pidLessThanOrEqual) {
		this.pidLessThanOrEqual = pidLessThanOrEqual;
	}

	public void setPids(List<Integer> pids) {
		this.pids = pids;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setUsetype(String usetype) {
		this.usetype = usetype;
	}

	public void setUsetypeLike(String usetypeLike) {
		this.usetypeLike = usetypeLike;
	}

	public void setUsetypes(List<String> usetypes) {
		this.usetypes = usetypes;
	}

	public RoleUseQuery usetype(String usetype) {
		if (usetype == null) {
			throw new RuntimeException("usetype is null");
		}
		this.usetype = usetype;
		return this;
	}

	public RoleUseQuery usetypeLike(String usetypeLike) {
		if (usetypeLike == null) {
			throw new RuntimeException("usetype is null");
		}
		this.usetypeLike = usetypeLike;
		return this;
	}

	public RoleUseQuery usetypes(List<String> usetypes) {
		if (usetypes == null) {
			throw new RuntimeException("usetypes is empty ");
		}
		this.usetypes = usetypes;
		return this;
	}

}