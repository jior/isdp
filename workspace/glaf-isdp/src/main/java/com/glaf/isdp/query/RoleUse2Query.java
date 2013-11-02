package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class RoleUse2Query extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String roleId;
	protected List<String> roleIds;
	protected String useType;
	protected String useTypeLike;
	protected List<String> useTypes;
	protected Integer treeType;
	protected Integer treeTypeGreaterThanOrEqual;
	protected Integer treeTypeLessThanOrEqual;
	protected List<Integer> treeTypes;
	protected String pid;
	protected String userchk;
	protected List<String> treeIds;

	public RoleUse2Query() {

	}

	public String getOrderBy() {
		if (sortField != null) {
			String a_x = " asc ";
			if (getSortOrder() != null) {
				a_x = " desc ";
			}

			if (columns.get(sortField) != null) {
				orderBy = " E." + columns.get(sortField) + a_x;
			}
		}
		return orderBy;
	}

	public String getPid() {
		return pid;
	}

	public String getRoleId() {
		return roleId;
	}

	public List<String> getRoleIds() {
		return roleIds;
	}

	public List<String> getTreeIds() {
		return treeIds;
	}

	public Integer getTreeType() {
		return treeType;
	}

	public Integer getTreeTypeGreaterThanOrEqual() {
		return treeTypeGreaterThanOrEqual;
	}

	public Integer getTreeTypeLessThanOrEqual() {
		return treeTypeLessThanOrEqual;
	}

	public List<Integer> getTreeTypes() {
		return treeTypes;
	}

	public String getUserchk() {
		return userchk;
	}

	public String getUseType() {
		return useType;
	}

	public String getUseTypeLike() {
		if (useTypeLike != null && useTypeLike.trim().length() > 0) {
			if (!useTypeLike.startsWith("%")) {
				useTypeLike = "%" + useTypeLike;
			}
			if (!useTypeLike.endsWith("%")) {
				useTypeLike = useTypeLike + "%";
			}
		}
		return useTypeLike;
	}

	public List<String> getUseTypes() {
		return useTypes;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("roleId", "roleID");
		addColumn("useType", "usetype");
		addColumn("pid", "pid");
		addColumn("treeType", "treetype");
		addColumn("userchk", "userchk");
		addColumn("treeId", "treeid");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public RoleUse2Query pid(String pid) {
		if (pid == null) {
			throw new RuntimeException("pid is null");
		}
		this.pid = pid;
		return this;
	}

	public RoleUse2Query roleId(String roleId) {
		if (roleId == null) {
			throw new RuntimeException("roleId is null");
		}
		this.roleId = roleId;
		return this;
	}

	public RoleUse2Query roleIds(List<String> roleIds) {
		if (roleIds == null) {
			throw new RuntimeException("roleIds is empty ");
		}
		this.roleIds = roleIds;
		return this;
	}

	public void setPid(String pid) {
		this.pid = pid;
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

	public void setTreeIds(List<String> treeIds) {
		this.treeIds = treeIds;
	}

	public void setTreeType(Integer treeType) {
		this.treeType = treeType;
	}

	public void setTreeTypeGreaterThanOrEqual(Integer treeTypeGreaterThanOrEqual) {
		this.treeTypeGreaterThanOrEqual = treeTypeGreaterThanOrEqual;
	}

	public void setTreeTypeLessThanOrEqual(Integer treeTypeLessThanOrEqual) {
		this.treeTypeLessThanOrEqual = treeTypeLessThanOrEqual;
	}

	public void setTreeTypes(List<Integer> treeTypes) {
		this.treeTypes = treeTypes;
	}

	public void setUserchk(String userchk) {
		this.userchk = userchk;
	}

	public void setUseType(String useType) {
		this.useType = useType;
	}

	public void setUseTypeLike(String useTypeLike) {
		this.useTypeLike = useTypeLike;
	}

	public void setUseTypes(List<String> useTypes) {
		this.useTypes = useTypes;
	}

	public RoleUse2Query treeIdLike(String treeIdLike) {
		if (treeIdLike == null) {
			throw new RuntimeException("treeId is null");
		}
		this.treeIdLike = treeIdLike;
		return this;
	}

	public RoleUse2Query treeIds(List<String> treeIds) {
		if (treeIds == null) {
			throw new RuntimeException("treeIds is empty ");
		}
		this.treeIds = treeIds;
		return this;
	}

	public RoleUse2Query treeType(Integer treeType) {
		if (treeType == null) {
			throw new RuntimeException("treeType is null");
		}
		this.treeType = treeType;
		return this;
	}

	public RoleUse2Query treeTypeGreaterThanOrEqual(
			Integer treeTypeGreaterThanOrEqual) {
		if (treeTypeGreaterThanOrEqual == null) {
			throw new RuntimeException("treeType is null");
		}
		this.treeTypeGreaterThanOrEqual = treeTypeGreaterThanOrEqual;
		return this;
	}

	public RoleUse2Query treeTypeLessThanOrEqual(Integer treeTypeLessThanOrEqual) {
		if (treeTypeLessThanOrEqual == null) {
			throw new RuntimeException("treeType is null");
		}
		this.treeTypeLessThanOrEqual = treeTypeLessThanOrEqual;
		return this;
	}

	public RoleUse2Query treeTypes(List<Integer> treeTypes) {
		if (treeTypes == null) {
			throw new RuntimeException("treeTypes is empty ");
		}
		this.treeTypes = treeTypes;
		return this;
	}

	public RoleUse2Query userchk(String userchk) {
		if (userchk == null) {
			throw new RuntimeException("userchk is null");
		}
		this.userchk = userchk;
		return this;
	}

	public RoleUse2Query useType(String useType) {
		if (useType == null) {
			throw new RuntimeException("useType is null");
		}
		this.useType = useType;
		return this;
	}

	public RoleUse2Query useTypeLike(String useTypeLike) {
		if (useTypeLike == null) {
			throw new RuntimeException("useType is null");
		}
		this.useTypeLike = useTypeLike;
		return this;
	}

	public RoleUse2Query useTypes(List<String> useTypes) {
		if (useTypes == null) {
			throw new RuntimeException("useTypes is empty ");
		}
		this.useTypes = useTypes;
		return this;
	}

}