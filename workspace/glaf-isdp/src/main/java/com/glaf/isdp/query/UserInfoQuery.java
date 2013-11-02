package com.glaf.isdp.query;

import java.util.*;
import com.glaf.core.query.UserQuery;

public class UserInfoQuery extends UserQuery {
	private static final long serialVersionUID = 1L;
	protected String status;
	protected String setpruv;
	protected String setpruvLike;
	protected List<String> setpruvs;
	protected Integer slevel;
	protected Integer slevelGreaterThanOrEqual;
	protected Integer slevelLessThanOrEqual;
	protected List<Integer> slevels;
	protected Integer intRemote;
	protected List<Integer> domainIndexs;
	protected Integer intallwbs;
	protected Integer intVirtual;
	

	public UserInfoQuery() {

	}

	public UserInfoQuery domainIndexs(List<Integer> domainIndexs) {
		if (domainIndexs == null) {
			throw new RuntimeException("domainIndexs is empty ");
		}
		this.domainIndexs = domainIndexs;
		return this;
	}

	public List<Integer> getDomainIndexs() {
		return domainIndexs;
	}

	public Integer getIntallwbs() {
		return intallwbs;
	}

	public Integer getIntRemote() {
		return intRemote;
	}

	public Integer getIntVirtual() {
		return intVirtual;
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

	public String getSetpruv() {
		return setpruv;
	}

	public String getSetpruvLike() {
		if (setpruvLike != null && setpruvLike.trim().length() > 0) {
			if (!setpruvLike.startsWith("%")) {
				setpruvLike = "%" + setpruvLike;
			}
			if (!setpruvLike.endsWith("%")) {
				setpruvLike = setpruvLike + "%";
			}
		}
		return setpruvLike;
	}

	public List<String> getSetpruvs() {
		return setpruvs;
	}

	public Integer getSlevel() {
		return slevel;
	}

	public Integer getSlevelGreaterThanOrEqual() {
		return slevelGreaterThanOrEqual;
	}

	public Integer getSlevelLessThanOrEqual() {
		return slevelLessThanOrEqual;
	}

	public List<Integer> getSlevels() {
		return slevels;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("actorId", "UserID");
		addColumn("name", "UserName");
		addColumn("createDate", "ctime");
		addColumn("status", "status");
		addColumn("isSystem", "issystem");
		addColumn("setpruv", "setpruv");
		addColumn("remark", "note");
		addColumn("slevel", "slevel");
		addColumn("deptId", "depid");
		addColumn("isBind", "isbind");
		addColumn("computerId", "computerid");
		addColumn("mail", "email");
		addColumn("mailUser", "email_user");
		addColumn("mobile", "Mobile");
		addColumn("intRemote", "intRemote");
		addColumn("domainIndex", "domain_index");
		addColumn("intallwbs", "intallwbs");
	}

	public UserInfoQuery intallwbs(Integer intallwbs) {
		if (intallwbs == null) {
			throw new RuntimeException("intallwbs is null");
		}
		this.intallwbs = intallwbs;
		return this;
	}

	public UserInfoQuery intRemote(Integer intRemote) {
		if (intRemote == null) {
			throw new RuntimeException("intRemote is null");
		}
		this.intRemote = intRemote;
		return this;
	}

	public UserInfoQuery intVirtual(Integer intVirtual) {
		if (intVirtual == null) {
			throw new RuntimeException("intVirtual is null");
		}
		this.intVirtual = intVirtual;
		return this;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setDomainIndexs(List<Integer> domainIndexs) {
		this.domainIndexs = domainIndexs;
	}

	public void setIntallwbs(Integer intallwbs) {
		this.intallwbs = intallwbs;
	}

	public void setIntRemote(Integer intRemote) {
		this.intRemote = intRemote;
	}

	public void setIntVirtual(Integer intVirtual) {
		this.intVirtual = intVirtual;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setMobileLike(String mobileLike) {
		this.mobileLike = mobileLike;
	}

	public UserInfoQuery setpruv(String setpruv) {
		if (setpruv == null) {
			throw new RuntimeException("setpruv is null");
		}
		this.setpruv = setpruv;
		return this;
	}

	public UserInfoQuery setpruvLike(String setpruvLike) {
		if (setpruvLike == null) {
			throw new RuntimeException("setpruv is null");
		}
		this.setpruvLike = setpruvLike;
		return this;
	}

	public UserInfoQuery setpruvs(List<String> setpruvs) {
		if (setpruvs == null) {
			throw new RuntimeException("setpruvs is empty ");
		}
		this.setpruvs = setpruvs;
		return this;
	}

	public void setSetpruv(String setpruv) {
		this.setpruv = setpruv;
	}

	public void setSetpruvLike(String setpruvLike) {
		this.setpruvLike = setpruvLike;
	}

	public void setSetpruvs(List<String> setpruvs) {
		this.setpruvs = setpruvs;
	}

	public void setSlevel(Integer slevel) {
		this.slevel = slevel;
	}

	public void setSlevelGreaterThanOrEqual(Integer slevelGreaterThanOrEqual) {
		this.slevelGreaterThanOrEqual = slevelGreaterThanOrEqual;
	}

	public void setSlevelLessThanOrEqual(Integer slevelLessThanOrEqual) {
		this.slevelLessThanOrEqual = slevelLessThanOrEqual;
	}

	public void setSlevels(List<Integer> slevels) {
		this.slevels = slevels;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UserInfoQuery slevel(Integer slevel) {
		if (slevel == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevel = slevel;
		return this;
	}

	public UserInfoQuery slevelGreaterThanOrEqual(
			Integer slevelGreaterThanOrEqual) {
		if (slevelGreaterThanOrEqual == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelGreaterThanOrEqual = slevelGreaterThanOrEqual;
		return this;
	}

	public UserInfoQuery slevelLessThanOrEqual(Integer slevelLessThanOrEqual) {
		if (slevelLessThanOrEqual == null) {
			throw new RuntimeException("slevel is null");
		}
		this.slevelLessThanOrEqual = slevelLessThanOrEqual;
		return this;
	}

	public UserInfoQuery slevels(List<Integer> slevels) {
		if (slevels == null) {
			throw new RuntimeException("slevels is empty ");
		}
		this.slevels = slevels;
		return this;
	}

	public UserInfoQuery status(String status) {
		if (status == null) {
			throw new RuntimeException("status is null");
		}
		this.status = status;
		return this;
	}

}