package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class UserRoleQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String roleid;
	protected String roleidLike;
	protected List<String> roleids;
	protected String userid;
	protected String useridLike;
	protected List<String> userids;
	protected String rsysid;
	protected String rsysidLike;
	protected List<String> rsysids;
	protected String ruserid;
	protected String ruseridLike;
	protected List<String> ruserids;
	

	public UserRoleQuery() {

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

	public String getRoleid() {
		return roleid;
	}

	public String getRoleidLike() {
		if (roleidLike != null && roleidLike.trim().length() > 0) {
			if (!roleidLike.startsWith("%")) {
				roleidLike = "%" + roleidLike;
			}
			if (!roleidLike.endsWith("%")) {
				roleidLike = roleidLike + "%";
			}
		}
		return roleidLike;
	}

	public List<String> getRoleids() {
		return roleids;
	}

	public String getRsysid() {
		return rsysid;
	}

	public String getRsysidLike() {
		if (rsysidLike != null && rsysidLike.trim().length() > 0) {
			if (!rsysidLike.startsWith("%")) {
				rsysidLike = "%" + rsysidLike;
			}
			if (!rsysidLike.endsWith("%")) {
				rsysidLike = rsysidLike + "%";
			}
		}
		return rsysidLike;
	}

	public List<String> getRsysids() {
		return rsysids;
	}

	public String getRuserid() {
		return ruserid;
	}

	public String getRuseridLike() {
		if (ruseridLike != null && ruseridLike.trim().length() > 0) {
			if (!ruseridLike.startsWith("%")) {
				ruseridLike = "%" + ruseridLike;
			}
			if (!ruseridLike.endsWith("%")) {
				ruseridLike = ruseridLike + "%";
			}
		}
		return ruseridLike;
	}

	public List<String> getRuserids() {
		return ruserids;
	}

	public String getUserid() {
		return userid;
	}

	public String getUseridLike() {
		if (useridLike != null && useridLike.trim().length() > 0) {
			if (!useridLike.startsWith("%")) {
				useridLike = "%" + useridLike;
			}
			if (!useridLike.endsWith("%")) {
				useridLike = useridLike + "%";
			}
		}
		return useridLike;
	}

	public List<String> getUserids() {
		return userids;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("ID", "ID");
		addColumn("roleid", "roleid");
		addColumn("userid", "userid");
		addColumn("rsysid", "Rsysid");
		addColumn("ruserid", "Ruserid");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public UserRoleQuery roleid(String roleid) {
		if (roleid == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleid = roleid;
		return this;
	}

	public UserRoleQuery roleidLike(String roleidLike) {
		if (roleidLike == null) {
			throw new RuntimeException("roleid is null");
		}
		this.roleidLike = roleidLike;
		return this;
	}

	public UserRoleQuery roleids(List<String> roleids) {
		if (roleids == null) {
			throw new RuntimeException("roleids is empty ");
		}
		this.roleids = roleids;
		return this;
	}

	public UserRoleQuery rsysid(String rsysid) {
		if (rsysid == null) {
			throw new RuntimeException("rsysid is null");
		}
		this.rsysid = rsysid;
		return this;
	}

	public UserRoleQuery rsysidLike(String rsysidLike) {
		if (rsysidLike == null) {
			throw new RuntimeException("rsysid is null");
		}
		this.rsysidLike = rsysidLike;
		return this;
	}

	public UserRoleQuery rsysids(List<String> rsysids) {
		if (rsysids == null) {
			throw new RuntimeException("rsysids is empty ");
		}
		this.rsysids = rsysids;
		return this;
	}

	public UserRoleQuery ruserid(String ruserid) {
		if (ruserid == null) {
			throw new RuntimeException("ruserid is null");
		}
		this.ruserid = ruserid;
		return this;
	}

	public UserRoleQuery ruseridLike(String ruseridLike) {
		if (ruseridLike == null) {
			throw new RuntimeException("ruserid is null");
		}
		this.ruseridLike = ruseridLike;
		return this;
	}

	public UserRoleQuery ruserids(List<String> ruserids) {
		if (ruserids == null) {
			throw new RuntimeException("ruserids is empty ");
		}
		this.ruserids = ruserids;
		return this;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public void setRoleidLike(String roleidLike) {
		this.roleidLike = roleidLike;
	}

	public void setRoleids(List<String> roleids) {
		this.roleids = roleids;
	}

	public void setRsysid(String rsysid) {
		this.rsysid = rsysid;
	}

	public void setRsysidLike(String rsysidLike) {
		this.rsysidLike = rsysidLike;
	}

	public void setRsysids(List<String> rsysids) {
		this.rsysids = rsysids;
	}

	public void setRuserid(String ruserid) {
		this.ruserid = ruserid;
	}

	public void setRuseridLike(String ruseridLike) {
		this.ruseridLike = ruseridLike;
	}

	public void setRuserids(List<String> ruserids) {
		this.ruserids = ruserids;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setUseridLike(String useridLike) {
		this.useridLike = useridLike;
	}

	public void setUserids(List<String> userids) {
		this.userids = userids;
	}

	public UserRoleQuery userid(String userid) {
		if (userid == null) {
			throw new RuntimeException("userid is null");
		}
		this.userid = userid;
		return this;
	}

	public UserRoleQuery useridLike(String useridLike) {
		if (useridLike == null) {
			throw new RuntimeException("userid is null");
		}
		this.useridLike = useridLike;
		return this;
	}

	public UserRoleQuery userids(List<String> userids) {
		if (userids == null) {
			throw new RuntimeException("userids is empty ");
		}
		this.userids = userids;
		return this;
	}

}