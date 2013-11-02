package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class NetDotRoleQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String filedotFileid;
	protected String filedotFileidLike;
	protected List<String> filedotFileids;
	protected Integer roleId;
	protected Integer roleIdGreaterThanOrEqual;
	protected Integer roleIdLessThanOrEqual;
	protected List<Integer> roleIds;

	

	public NetDotRoleQuery() {

	}

	public NetDotRoleQuery filedotFileid(String filedotFileid) {
		if (filedotFileid == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileid = filedotFileid;
		return this;
	}

	public NetDotRoleQuery filedotFileidLike(String filedotFileidLike) {
		if (filedotFileidLike == null) {
			throw new RuntimeException("filedotFileid is null");
		}
		this.filedotFileidLike = filedotFileidLike;
		return this;
	}

	public NetDotRoleQuery filedotFileids(List<String> filedotFileids) {
		if (filedotFileids == null) {
			throw new RuntimeException("filedotFileids is empty ");
		}
		this.filedotFileids = filedotFileids;
		return this;
	}

	public String getFiledotFileid() {
		return filedotFileid;
	}

	public String getFiledotFileidLike() {
		if (filedotFileidLike != null && filedotFileidLike.trim().length() > 0) {
			if (!filedotFileidLike.startsWith("%")) {
				filedotFileidLike = "%" + filedotFileidLike;
			}
			if (!filedotFileidLike.endsWith("%")) {
				filedotFileidLike = filedotFileidLike + "%";
			}
		}
		return filedotFileidLike;
	}

	public List<String> getFiledotFileids() {
		return filedotFileids;
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

	public Integer getRoleId() {
		return roleId;
	}

	public Integer getRoleIdGreaterThanOrEqual() {
		return roleIdGreaterThanOrEqual;
	}

	public Integer getRoleIdLessThanOrEqual() {
		return roleIdLessThanOrEqual;
	}

	public List<Integer> getRoleIds() {
		return roleIds;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("filedotFileid", "filedot_fileid");
		addColumn("roleId", "role_id");
		addColumn("listno", "listno");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public NetDotRoleQuery roleId(Integer roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public NetDotRoleQuery roleIdGreaterThanOrEqual(
			Integer roleIdGreaterThanOrEqual) {
		if (roleIdGreaterThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
		return this;
	}

	public NetDotRoleQuery roleIdLessThanOrEqual(Integer roleIdLessThanOrEqual) {
		if (roleIdLessThanOrEqual == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
		return this;
	}

	public NetDotRoleQuery roleIds(List<Integer> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
	}

	public void setFiledotFileid(String filedotFileid) {
		this.filedotFileid = filedotFileid;
	}

	public void setFiledotFileidLike(String filedotFileidLike) {
		this.filedotFileidLike = filedotFileidLike;
	}

	public void setFiledotFileids(List<String> filedotFileids) {
		this.filedotFileids = filedotFileids;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public void setRoleIdGreaterThanOrEqual(Integer roleIdGreaterThanOrEqual) {
		this.roleIdGreaterThanOrEqual = roleIdGreaterThanOrEqual;
	}

	public void setRoleIdLessThanOrEqual(Integer roleIdLessThanOrEqual) {
		this.roleIdLessThanOrEqual = roleIdLessThanOrEqual;
	}

	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}