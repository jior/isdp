package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class RoleQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String roleName;
	protected String roleNameLike;
	protected List<String> roleNames;
	protected String roletype;
	protected String roletypeLike;
	protected List<String> roletypes;
	protected String content;
	protected String contentLike;
	protected List<String> contents;
	protected String alldata;
	protected String alldataLike;
	protected List<String> alldatas;
	

	public RoleQuery() {

	}

	public RoleQuery alldata(String alldata) {
		if (alldata == null) {
			throw new RuntimeException("alldata is null");
		}
		this.alldata = alldata;
		return this;
	}

	public RoleQuery alldataLike(String alldataLike) {
		if (alldataLike == null) {
			throw new RuntimeException("alldata is null");
		}
		this.alldataLike = alldataLike;
		return this;
	}

	public RoleQuery alldatas(List<String> alldatas) {
		if (alldatas == null) {
			throw new RuntimeException("alldatas is empty ");
		}
		this.alldatas = alldatas;
		return this;
	}

	public RoleQuery content(String content) {
		if (content == null) {
			throw new RuntimeException("content is null");
		}
		this.content = content;
		return this;
	}

	public RoleQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public RoleQuery contents(List<String> contents) {
		if (contents == null) {
			throw new RuntimeException("contents is empty ");
		}
		this.contents = contents;
		return this;
	}

	public String getAlldata() {
		return alldata;
	}

	public String getAlldataLike() {
		if (alldataLike != null && alldataLike.trim().length() > 0) {
			if (!alldataLike.startsWith("%")) {
				alldataLike = "%" + alldataLike;
			}
			if (!alldataLike.endsWith("%")) {
				alldataLike = alldataLike + "%";
			}
		}
		return alldataLike;
	}

	public List<String> getAlldatas() {
		return alldatas;
	}

	public String getContent() {
		return content;
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

	public List<String> getContents() {
		return contents;
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

	public String getRoleName() {
		return roleName;
	}

	public String getRoleNameLike() {
		if (roleNameLike != null && roleNameLike.trim().length() > 0) {
			if (!roleNameLike.startsWith("%")) {
				roleNameLike = "%" + roleNameLike;
			}
			if (!roleNameLike.endsWith("%")) {
				roleNameLike = roleNameLike + "%";
			}
		}
		return roleNameLike;
	}

	public List<String> getRoleNames() {
		return roleNames;
	}

	public String getRoletype() {
		return roletype;
	}

	public String getRoletypeLike() {
		if (roletypeLike != null && roletypeLike.trim().length() > 0) {
			if (!roletypeLike.startsWith("%")) {
				roletypeLike = "%" + roletypeLike;
			}
			if (!roletypeLike.endsWith("%")) {
				roletypeLike = roletypeLike + "%";
			}
		}
		return roletypeLike;
	}

	public List<String> getRoletypes() {
		return roletypes;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("ID", "ID");
		addColumn("roleName", "roleName");
		addColumn("roletype", "roletype");
		addColumn("content", "content");
		addColumn("alldata", "alldata");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public RoleQuery roleName(String roleName) {
		if (roleName == null) {
			throw new RuntimeException("roleName is null");
		}
		this.roleName = roleName;
		return this;
	}

	public RoleQuery roleNameLike(String roleNameLike) {
		if (roleNameLike == null) {
			throw new RuntimeException("roleName is null");
		}
		this.roleNameLike = roleNameLike;
		return this;
	}

	public RoleQuery roleNames(List<String> roleNames) {
		if (roleNames == null) {
			throw new RuntimeException("roleNames is empty ");
		}
		this.roleNames = roleNames;
		return this;
	}

	public RoleQuery roletype(String roletype) {
		if (roletype == null) {
			throw new RuntimeException("roletype is null");
		}
		this.roletype = roletype;
		return this;
	}

	public RoleQuery roletypeLike(String roletypeLike) {
		if (roletypeLike == null) {
			throw new RuntimeException("roletype is null");
		}
		this.roletypeLike = roletypeLike;
		return this;
	}

	public RoleQuery roletypes(List<String> roletypes) {
		if (roletypes == null) {
			throw new RuntimeException("roletypes is empty ");
		}
		this.roletypes = roletypes;
		return this;
	}

	public void setAlldata(String alldata) {
		this.alldata = alldata;
	}

	public void setAlldataLike(String alldataLike) {
		this.alldataLike = alldataLike;
	}

	public void setAlldatas(List<String> alldatas) {
		this.alldatas = alldatas;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setContents(List<String> contents) {
		this.contents = contents;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRoleNameLike(String roleNameLike) {
		this.roleNameLike = roleNameLike;
	}

	public void setRoleNames(List<String> roleNames) {
		this.roleNames = roleNames;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

	public void setRoletypeLike(String roletypeLike) {
		this.roletypeLike = roletypeLike;
	}

	public void setRoletypes(List<String> roletypes) {
		this.roletypes = roletypes;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

}