package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class ProjectOrganizationQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String idLike;
	protected List<String> ids;
	protected Integer flag;
	protected List<Integer> flags;
	protected String sysId;
	protected List<String> sysIds;
	protected String projectNameLike;
	protected String numLike;
	protected Date ctimeGreaterThanOrEqual;
	protected Date ctimeLessThanOrEqual;
	protected String contentLike;
	protected String dbname;
	protected String dbnameLike;
	protected List<String> dbnames;
	protected String serverName;
	protected String serverNameLike;
	protected List<String> serverNames;
	protected String user;
	protected String userLike;
	protected List<String> users;
	protected String email;
	protected String emailLike;
	protected List<String> emails;
	protected Integer domainIndex;
	protected Integer domainIndexGreaterThanOrEqual;
	protected Integer domainIndexLessThanOrEqual;
	protected List<Integer> domainIndexs;
	protected Integer intLocal;
	protected Integer connected;
	protected Integer orgLevel;
	protected Integer orgLevelGreaterThanOrEqual;
	protected Integer orgLevelLessThanOrEqual;
	protected Integer sendType;
	

	public ProjectOrganizationQuery() {

	}

	public ProjectOrganizationQuery connected(Integer connected) {
		if (connected == null) {
			throw new RuntimeException("connected is null");
		}
		this.connected = connected;
		return this;
	}

	public ProjectOrganizationQuery contentLike(String contentLike) {
		if (contentLike == null) {
			throw new RuntimeException("content is null");
		}
		this.contentLike = contentLike;
		return this;
	}

	public ProjectOrganizationQuery ctimeGreaterThanOrEqual(
			Date ctimeGreaterThanOrEqual) {
		if (ctimeGreaterThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery ctimeLessThanOrEqual(
			Date ctimeLessThanOrEqual) {
		if (ctimeLessThanOrEqual == null) {
			throw new RuntimeException("ctime is null");
		}
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery dbname(String dbname) {
		if (dbname == null) {
			throw new RuntimeException("dbname is null");
		}
		this.dbname = dbname;
		return this;
	}

	public ProjectOrganizationQuery dbnameLike(String dbnameLike) {
		if (dbnameLike == null) {
			throw new RuntimeException("dbname is null");
		}
		this.dbnameLike = dbnameLike;
		return this;
	}

	public ProjectOrganizationQuery dbnames(List<String> dbnames) {
		if (dbnames == null) {
			throw new RuntimeException("dbnames is empty ");
		}
		this.dbnames = dbnames;
		return this;
	}

	public ProjectOrganizationQuery domainIndex(Integer domainIndex) {
		if (domainIndex == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndex = domainIndex;
		return this;
	}

	public ProjectOrganizationQuery domainIndexGreaterThanOrEqual(
			Integer domainIndexGreaterThanOrEqual) {
		if (domainIndexGreaterThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexGreaterThanOrEqual = domainIndexGreaterThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery domainIndexLessThanOrEqual(
			Integer domainIndexLessThanOrEqual) {
		if (domainIndexLessThanOrEqual == null) {
			throw new RuntimeException("domainIndex is null");
		}
		this.domainIndexLessThanOrEqual = domainIndexLessThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public ProjectOrganizationQuery email(String email) {
		if (email == null) {
			throw new RuntimeException("email is null");
		}
		this.email = email;
		return this;
	}

	public ProjectOrganizationQuery emailLike(String emailLike) {
		if (emailLike == null) {
			throw new RuntimeException("email is null");
		}
		this.emailLike = emailLike;
		return this;
	}

	public ProjectOrganizationQuery emails(List<String> emails) {
		if (emails == null) {
			throw new RuntimeException("emails is empty ");
		}
		this.emails = emails;
		return this;
	}

	public ProjectOrganizationQuery flag(Integer flag) {
		if (flag == null) {
			throw new RuntimeException("flag is null");
		}
		this.flag = flag;
		return this;
	}

	public ProjectOrganizationQuery flags(List<Integer> flags) {
		if (flags == null) {
			throw new RuntimeException("flags is empty ");
		}
		this.flags = flags;
		return this;
	}

	public Integer getConnected() {
		return connected;
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

	public Date getCtimeGreaterThanOrEqual() {
		return ctimeGreaterThanOrEqual;
	}

	public Date getCtimeLessThanOrEqual() {
		return ctimeLessThanOrEqual;
	}

	public String getDbname() {
		return dbname;
	}

	public String getDbnameLike() {
		if (dbnameLike != null && dbnameLike.trim().length() > 0) {
			if (!dbnameLike.startsWith("%")) {
				dbnameLike = "%" + dbnameLike;
			}
			if (!dbnameLike.endsWith("%")) {
				dbnameLike = dbnameLike + "%";
			}
		}
		return dbnameLike;
	}

	public List<String> getDbnames() {
		return dbnames;
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

	public String getEmail() {
		return email;
	}

	public String getEmailLike() {
		if (emailLike != null && emailLike.trim().length() > 0) {
			if (!emailLike.startsWith("%")) {
				emailLike = "%" + emailLike;
			}
			if (!emailLike.endsWith("%")) {
				emailLike = emailLike + "%";
			}
		}
		return emailLike;
	}

	public List<String> getEmails() {
		return emails;
	}

	public Integer getFlag() {
		return flag;
	}

	public List<Integer> getFlags() {
		return flags;
	}

	public String getIdLike() {
		if (idLike != null && idLike.trim().length() > 0) {
			if (!idLike.startsWith("%")) {
				idLike = "%" + idLike;
			}
			if (!idLike.endsWith("%")) {
				idLike = idLike + "%";
			}
		}
		return idLike;
	}

	public List<String> getIds() {
		return ids;
	}

	public Integer getIntLocal() {
		return intLocal;
	}

	public String getNumLike() {
		if (numLike != null && numLike.trim().length() > 0) {
			if (!numLike.startsWith("%")) {
				numLike = "%" + numLike;
			}
			if (!numLike.endsWith("%")) {
				numLike = numLike + "%";
			}
		}
		return numLike;
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

	public Integer getOrgLevel() {
		return orgLevel;
	}

	public Integer getOrgLevelGreaterThanOrEqual() {
		return orgLevelGreaterThanOrEqual;
	}

	public Integer getOrgLevelLessThanOrEqual() {
		return orgLevelLessThanOrEqual;
	}

	public String getProjectNameLike() {
		if (projectNameLike != null && projectNameLike.trim().length() > 0) {
			if (!projectNameLike.startsWith("%")) {
				projectNameLike = "%" + projectNameLike;
			}
			if (!projectNameLike.endsWith("%")) {
				projectNameLike = projectNameLike + "%";
			}
		}
		return projectNameLike;
	}

	public Integer getSendType() {
		return sendType;
	}

	public String getServerName() {
		return serverName;
	}

	public String getServerNameLike() {
		if (serverNameLike != null && serverNameLike.trim().length() > 0) {
			if (!serverNameLike.startsWith("%")) {
				serverNameLike = "%" + serverNameLike;
			}
			if (!serverNameLike.endsWith("%")) {
				serverNameLike = serverNameLike + "%";
			}
		}
		return serverNameLike;
	}

	public List<String> getServerNames() {
		return serverNames;
	}

	public String getSysId() {
		return sysId;
	}

	public List<String> getSysIds() {
		return sysIds;
	}

	public String getUser() {
		return user;
	}

	public String getUserLike() {
		if (userLike != null && userLike.trim().length() > 0) {
			if (!userLike.startsWith("%")) {
				userLike = "%" + userLike;
			}
			if (!userLike.endsWith("%")) {
				userLike = userLike + "%";
			}
		}
		return userLike;
	}

	public List<String> getUsers() {
		return users;
	}

	public ProjectOrganizationQuery idLike(String idLike) {
		if (idLike == null) {
			throw new RuntimeException("id is null");
		}
		this.idLike = idLike;
		return this;
	}

	public ProjectOrganizationQuery ids(List<String> ids) {
		if (ids == null) {
			throw new RuntimeException("ids is empty ");
		}
		this.ids = ids;
		return this;
	}

	public ProjectOrganizationQuery indexNameLike(String indexNameLike) {
		if (indexNameLike == null) {
			throw new RuntimeException("indexNameLike is null");
		}
		this.projectNameLike = indexNameLike;
		return this;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("indexId", "index_id");
		addColumn("id", "id");
		addColumn("flag", "intflag");
		addColumn("sysId", "sys_id");
		addColumn("projectName", "projname");
		addColumn("num", "num");
		addColumn("ctime", "ctime");
		addColumn("content", "content");
		addColumn("dbname", "sdbname");
		addColumn("serverName", "sServerName");
		addColumn("user", "sUser");
		addColumn("password", "sPassword");
		addColumn("listno", "listno");
		addColumn("email", "email");
		addColumn("parentId", "parent_id");
		addColumn("nodeico", "nodeico");
		addColumn("line", "intLine");
		addColumn("domainIndex", "domain_index");
		addColumn("intLocal", "intLocal");
		addColumn("emailPsw", "email_psw");
		addColumn("connected", "intConnected");
		addColumn("emailS", "email_s");
		addColumn("orgLevel", "intorglevel");
		addColumn("sendType", "intsendtype");
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public ProjectOrganizationQuery numLike(String numLike) {
		if (numLike == null) {
			throw new RuntimeException("num is null");
		}
		this.numLike = numLike;
		return this;
	}

	public ProjectOrganizationQuery orgLevel(Integer orgLevel) {
		if (orgLevel == null) {
			throw new RuntimeException("orgLevel is null");
		}
		this.orgLevel = orgLevel;
		return this;
	}

	public ProjectOrganizationQuery orgLevelGreaterThanOrEqual(
			Integer orgLevelGreaterThanOrEqual) {
		if (orgLevelGreaterThanOrEqual == null) {
			throw new RuntimeException("orgLevel is null");
		}
		this.orgLevelGreaterThanOrEqual = orgLevelGreaterThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery orgLevelLessThanOrEqual(
			Integer orgLevelLessThanOrEqual) {
		if (orgLevelLessThanOrEqual == null) {
			throw new RuntimeException("orgLevel is null");
		}
		this.orgLevelLessThanOrEqual = orgLevelLessThanOrEqual;
		return this;
	}

	public ProjectOrganizationQuery projectNameLike(String projectNameLike) {
		if (projectNameLike == null) {
			throw new RuntimeException("projectName is null");
		}
		this.projectNameLike = projectNameLike;
		return this;
	}

	public ProjectOrganizationQuery sendType(Integer sendType) {
		if (sendType == null) {
			throw new RuntimeException("sendType is null");
		}
		this.sendType = sendType;
		return this;
	}

	public ProjectOrganizationQuery serverName(String serverName) {
		if (serverName == null) {
			throw new RuntimeException("serverName is null");
		}
		this.serverName = serverName;
		return this;
	}

	public ProjectOrganizationQuery serverNameLike(String serverNameLike) {
		if (serverNameLike == null) {
			throw new RuntimeException("serverName is null");
		}
		this.serverNameLike = serverNameLike;
		return this;
	}

	public ProjectOrganizationQuery serverNames(List<String> serverNames) {
		if (serverNames == null) {
			throw new RuntimeException("serverNames is empty ");
		}
		this.serverNames = serverNames;
		return this;
	}

	public void setConnected(Integer connected) {
		this.connected = connected;
	}

	public void setContentLike(String contentLike) {
		this.contentLike = contentLike;
	}

	public void setCtimeGreaterThanOrEqual(Date ctimeGreaterThanOrEqual) {
		this.ctimeGreaterThanOrEqual = ctimeGreaterThanOrEqual;
	}

	public void setCtimeLessThanOrEqual(Date ctimeLessThanOrEqual) {
		this.ctimeLessThanOrEqual = ctimeLessThanOrEqual;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public void setDbnameLike(String dbnameLike) {
		this.dbnameLike = dbnameLike;
	}

	public void setDbnames(List<String> dbnames) {
		this.dbnames = dbnames;
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

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailLike(String emailLike) {
		this.emailLike = emailLike;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public void setFlags(List<Integer> flags) {
		this.flags = flags;
	}

	public void setIdLike(String idLike) {
		this.idLike = idLike;
	}

	public void setIds(List<String> ids) {
		this.ids = ids;
	}

	public void setIntLocal(Integer intLocal) {
		this.intLocal = intLocal;
	}

	public void setNumLike(String numLike) {
		this.numLike = numLike;
	}

	public void setOrgLevel(Integer orgLevel) {
		this.orgLevel = orgLevel;
	}

	public void setOrgLevelGreaterThanOrEqual(Integer orgLevelGreaterThanOrEqual) {
		this.orgLevelGreaterThanOrEqual = orgLevelGreaterThanOrEqual;
	}

	public void setOrgLevelLessThanOrEqual(Integer orgLevelLessThanOrEqual) {
		this.orgLevelLessThanOrEqual = orgLevelLessThanOrEqual;
	}

	public void setProjectNameLike(String projectNameLike) {
		this.projectNameLike = projectNameLike;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setServerNameLike(String serverNameLike) {
		this.serverNameLike = serverNameLike;
	}

	public void setServerNames(List<String> serverNames) {
		this.serverNames = serverNames;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setSysId(String sysId) {
		this.sysId = sysId;
	}

	public void setSysIds(List<String> sysIds) {
		this.sysIds = sysIds;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setUserLike(String userLike) {
		this.userLike = userLike;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	public ProjectOrganizationQuery sysId(String sysId) {
		if (sysId == null) {
			throw new RuntimeException("sysId is null");
		}
		this.sysId = sysId;
		return this;
	}

	public ProjectOrganizationQuery sysIds(List<String> sysIds) {
		if (sysIds == null) {
			throw new RuntimeException("sysIds is empty ");
		}
		this.sysIds = sysIds;
		return this;
	}

	public ProjectOrganizationQuery user(String user) {
		if (user == null) {
			throw new RuntimeException("user is null");
		}
		this.user = user;
		return this;
	}

	public ProjectOrganizationQuery userLike(String userLike) {
		if (userLike == null) {
			throw new RuntimeException("user is null");
		}
		this.userLike = userLike;
		return this;
	}

	public ProjectOrganizationQuery users(List<String> users) {
		if (users == null) {
			throw new RuntimeException("users is empty ");
		}
		this.users = users;
		return this;
	}

}