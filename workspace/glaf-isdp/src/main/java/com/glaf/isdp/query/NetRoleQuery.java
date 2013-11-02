package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class NetRoleQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String rolename;
	protected String rolenameLike;
	protected Integer roleuse;
	protected Integer roleuseGreaterThanOrEqual;
	protected Integer roleuseLessThanOrEqual;
	protected String contentLike;
	protected Integer roletype;
	protected Integer roletypeGreaterThanOrEqual;
	protected Integer roletypeLessThanOrEqual;
	protected List<Integer> roletypes;
	protected String busiessId;
	protected String busiessIdLike;
	protected List<String> busiessIds;
	protected Integer tasksort;
	protected Integer tasksortGreaterThanOrEqual;
	protected Integer tasksortLessThanOrEqual;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	

	public NetRoleQuery() {

	}

	public NetRoleQuery busiessId(String busiessId) {
		if (busiessId == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessId = busiessId;
		return this;
	}

	public NetRoleQuery busiessIdLike(String busiessIdLike) {
		if (busiessIdLike == null) {
			throw new RuntimeException("busiessId is null");
		}
		this.busiessIdLike = busiessIdLike;
		return this;
	}

	public NetRoleQuery busiessIds(List<String> busiessIds) {
		if (busiessIds == null) {
			throw new RuntimeException("busiessIds is empty ");
		}
		this.busiessIds = busiessIds;
		return this;
	}

	public NetRoleQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public NetRoleQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public NetRoleQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public NetRoleQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public NetRoleQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public String getBusiessId() {
		return busiessId;
	}

	public String getBusiessIdLike() {
		if (busiessIdLike != null && busiessIdLike.trim().length() > 0) {
			if (!busiessIdLike.startsWith("%")) {
				busiessIdLike = "%" + busiessIdLike;
			}
			if (!busiessIdLike.endsWith("%")) {
				busiessIdLike = busiessIdLike + "%";
			}
		}
		return busiessIdLike;
	}

	public List<String> getBusiessIds() {
		return busiessIds;
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

	public Integer getDomainIndex() {
		return domainIndex;
	}

	public Integer getDomainIndexGreaterThanOrEqual() {
		return domainIndexGreaterThanOrEqual;
	}

	public Integer getDomainIndexLessThanOrEqual() {
		return domainIndexLessThanOrEqual;
	}

	public List<Integer> getDomainIndexs() {
		return domainIndexs;
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

	public String getRolename() {
		return rolename;
	}

	public String getRolenameLike() {
		if (rolenameLike != null && rolenameLike.trim().length() > 0) {
			if (!rolenameLike.startsWith("%")) {
				rolenameLike = "%" + rolenameLike;
			}
			if (!rolenameLike.endsWith("%")) {
				rolenameLike = rolenameLike + "%";
			}
		}
		return rolenameLike;
	}

	public Integer getRoletype() {
		return roletype;
	}

	public Integer getRoletypeGreaterThanOrEqual() {
		return roletypeGreaterThanOrEqual;
	}

	public Integer getRoletypeLessThanOrEqual() {
		return roletypeLessThanOrEqual;
	}

	public List<Integer> getRoletypes() {
		return roletypes;
	}

	public Integer getRoleuse() {
		return roleuse;
	}

	public Integer getRoleuseGreaterThanOrEqual() {
		return roleuseGreaterThanOrEqual;
	}

	public Integer getRoleuseLessThanOrEqual() {
		return roleuseLessThanOrEqual;
	}

	public Integer getTasksort() {
		return tasksort;
	}

	public Integer getTasksortGreaterThanOrEqual() {
		return tasksortGreaterThanOrEqual;
	}

	public Integer getTasksortLessThanOrEqual() {
		return tasksortLessThanOrEqual;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "id");
		addColumn("listno", "listno");
		addColumn("rolename", "rolename");
		addColumn("roleuse", "roleuse");
		addColumn("content", "content");
		addColumn("roletype", "roletype");
		addColumn("busiessId", "busiess_id");
		addColumn("tasksort", "tasksort");
		addColumn("domainIndex", "domain_index");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public NetRoleQuery rolename(String rolename) {
		if (rolename == null) {
			throw new RuntimeException("rolename is null");
		}
		this.rolename = rolename;
		return this;
	}

	public NetRoleQuery rolenameLike(String rolenameLike) {
		if (rolenameLike == null) {
			throw new RuntimeException("rolename is null");
		}
		this.rolenameLike = rolenameLike;
		return this;
	}

	public NetRoleQuery roletype(Integer roletype) {
		if (roletype == null) {
			throw new RuntimeException("roletype is null");
		}
		this.roletype = roletype;
		return this;
	}

	public NetRoleQuery roletypeGreaterThanOrEqual(
			Integer roletypeGreaterThanOrEqual) {
		if (roletypeGreaterThanOrEqual == null) {
			throw new RuntimeException("roletype is null");
		}
		this.roletypeGreaterThanOrEqual = roletypeGreaterThanOrEqual;
		return this;
	}

	public NetRoleQuery roletypeLessThanOrEqual(Integer roletypeLessThanOrEqual) {
		if (roletypeLessThanOrEqual == null) {
			throw new RuntimeException("roletype is null");
		}
		this.roletypeLessThanOrEqual = roletypeLessThanOrEqual;
		return this;
	}

	public NetRoleQuery roletypes(List<Integer> roletypes) {
		if (roletypes == null) {
			throw new RuntimeException("roletypes is empty ");
		}
		this.roletypes = roletypes;
		return this;
	}

	public NetRoleQuery roleuse(Integer roleuse) {
		if (roleuse == null) {
			throw new RuntimeException("roleuse is null");
		}
		this.roleuse = roleuse;
		return this;
	}

	public NetRoleQuery roleuseGreaterThanOrEqual(
			Integer roleuseGreaterThanOrEqual) {
		if (roleuseGreaterThanOrEqual == null) {
			throw new RuntimeException("roleuse is null");
		}
		this.roleuseGreaterThanOrEqual = roleuseGreaterThanOrEqual;
		return this;
	}

	public NetRoleQuery roleuseLessThanOrEqual(Integer roleuseLessThanOrEqual) {
		if (roleuseLessThanOrEqual == null) {
			throw new RuntimeException("roleuse is null");
		}
		this.roleuseLessThanOrEqual = roleuseLessThanOrEqual;
		return this;
	}

	public void setBusiessId(String busiessId) {
		this.busiessId = busiessId;
	}

	public void setBusiessIdLike(String busiessIdLike) {
		this.busiessIdLike = busiessIdLike;
	}

	public void setBusiessIds(List<String> busiessIds) {
		this.busiessIds = busiessIds;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setDomainIndex(Integer domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setDomainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
	}

	public void setDomainIndexLessThanOrEqual(Integer domainIndexLessThanOrEqual) {
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
	}

	public void setDomainIndexs(List<Integer> domainIndexs) {
		this.domainIndexs = domainIndexs;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public void setRolenameLike(String rolenameLike) {
		this.rolenameLike = rolenameLike;
	}

	public void setRoletype(Integer roletype) {
		this.roletype = roletype;
	}

	public void setRoletypeGreaterThanOrEqual(Integer roletypeGreaterThanOrEqual) {
		this.roletypeGreaterThanOrEqual = roletypeGreaterThanOrEqual;
	}

	public void setRoletypeLessThanOrEqual(Integer roletypeLessThanOrEqual) {
		this.roletypeLessThanOrEqual = roletypeLessThanOrEqual;
	}

	public void setRoletypes(List<Integer> roletypes) {
		this.roletypes = roletypes;
	}

	public void setRoleuse(Integer roleuse) {
		this.roleuse = roleuse;
	}

	public void setRoleuseGreaterThanOrEqual(Integer roleuseGreaterThanOrEqual) {
		this.roleuseGreaterThanOrEqual = roleuseGreaterThanOrEqual;
	}

	public void setRoleuseLessThanOrEqual(Integer roleuseLessThanOrEqual) {
		this.roleuseLessThanOrEqual = roleuseLessThanOrEqual;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setTasksort(Integer tasksort) {
		this.tasksort = tasksort;
	}

	public void setTasksortGreaterThanOrEqual(Integer tasksortGreaterThanOrEqual) {
		this.tasksortGreaterThanOrEqual = tasksortGreaterThanOrEqual;
	}

	public void setTasksortLessThanOrEqual(Integer tasksortLessThanOrEqual) {
		this.tasksortLessThanOrEqual = tasksortLessThanOrEqual;
	}

	public NetRoleQuery tasksort(Integer tasksort) {
		if (tasksort == null) {
			throw new RuntimeException("tasksort is null");
		}
		this.tasksort = tasksort;
		return this;
	}

	public NetRoleQuery tasksortGreaterThanOrEqual(
			Integer tasksortGreaterThanOrEqual) {
		if (tasksortGreaterThanOrEqual == null) {
			throw new RuntimeException("tasksort is null");
		}
		this.tasksortGreaterThanOrEqual = tasksortGreaterThanOrEqual;
		return this;
	}

	public NetRoleQuery tasksortLessThanOrEqual(Integer tasksortLessThanOrEqual) {
		if (tasksortLessThanOrEqual == null) {
			throw new RuntimeException("tasksort is null");
		}
		this.tasksortLessThanOrEqual = tasksortLessThanOrEqual;
		return this;
	}

}