/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.query;

import java.util.*;

import com.glaf.core.query.DataQuery;

public class SysUserQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String account;
	protected String accountLike;
	protected List<String> accounts;
	protected Integer accountType;
	protected String adminFlag;
	protected Date availDateEndGreaterThanOrEqual;
	protected Date availDateEndLessThanOrEqual;
	protected Date availDateStartGreaterThanOrEqual;
	protected Date availDateStartLessThanOrEqual;
	protected Date createTimeGreaterThanOrEqual;
	protected Date createTimeLessThanOrEqual;
	protected Long deptId;
	protected List<Long> deptIds;
	protected Integer dumpFlag;
	protected String email;
	protected String emailLike;
	protected String lastLoginIP;
	protected String lastLoginIPLike;
	protected List<String> lastLoginIPs;
	protected Date lastLoginTimeGreaterThanOrEqual;
	protected Date lastLoginTimeLessThanOrEqual;
	protected String mobile;
	protected String mobileLike;
	protected String name;
	protected String nameLike;
	protected List<String> names;
	protected String roleCode;
	protected List<String> roleCodes;
	protected String telephone;
	protected String telephoneLike;
	protected Integer userType;

	public SysUserQuery() {

	}

	public SysUserQuery account(String account) {
		if (account == null) {
			throw new RuntimeException("account is null");
		}
		this.account = account;
		return this;
	}

	public SysUserQuery accountLike(String accountLike) {
		if (accountLike == null) {
			throw new RuntimeException("account is null");
		}
		this.accountLike = accountLike;
		return this;
	}

	public SysUserQuery accounts(List<String> accounts) {
		if (accounts == null) {
			throw new RuntimeException("accounts is empty ");
		}
		this.accounts = accounts;
		return this;
	}

	public SysUserQuery accountType(Integer accountType) {
		if (accountType == null) {
			throw new RuntimeException("accountType is null");
		}
		this.accountType = accountType;
		return this;
	}

	public SysUserQuery adminFlag(String adminFlag) {
		if (adminFlag == null) {
			throw new RuntimeException("adminFlag is null");
		}
		this.adminFlag = adminFlag;
		return this;
	}

	public SysUserQuery createTimeGreaterThanOrEqual(
			Date createTimeGreaterThanOrEqual) {
		if (createTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("createTime is null");
		}
		this.createTimeGreaterThanOrEqual = createTimeGreaterThanOrEqual;
		return this;
	}

	public SysUserQuery createTimeLessThanOrEqual(Date createTimeLessThanOrEqual) {
		if (createTimeLessThanOrEqual == null) {
			throw new RuntimeException("createTime is null");
		}
		this.createTimeLessThanOrEqual = createTimeLessThanOrEqual;
		return this;
	}

	public SysUserQuery deptId(Long deptId) {
		if (deptId == null) {
			throw new RuntimeException("deptId is null");
		}
		this.deptId = deptId;
		return this;
	}

	public SysUserQuery deptIds(List<Long> deptIds) {
		if (deptIds == null) {
			throw new RuntimeException("deptIds is empty ");
		}
		this.deptIds = deptIds;
		return this;
	}

	public SysUserQuery dumpFlag(Integer dumpFlag) {
		if (dumpFlag == null) {
			throw new RuntimeException("dumpFlag is null");
		}
		this.dumpFlag = dumpFlag;
		return this;
	}

	public SysUserQuery email(String email) {
		if (email == null) {
			throw new RuntimeException("email is null");
		}
		this.email = email;
		return this;
	}

	public SysUserQuery emailLike(String emailLike) {
		if (emailLike == null) {
			throw new RuntimeException("email is null");
		}
		this.emailLike = emailLike;
		return this;
	}

	public String getAccount() {
		return account;
	}

	public String getAccountLike() {
		if (accountLike != null && accountLike.trim().length() > 0) {
			if (!accountLike.startsWith("%")) {
				accountLike = "%" + accountLike;
			}
			if (!accountLike.endsWith("%")) {
				accountLike = accountLike + "%";
			}
		}
		return accountLike;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public Date getAvailDateEndGreaterThanOrEqual() {
		return availDateEndGreaterThanOrEqual;
	}

	public Date getAvailDateEndLessThanOrEqual() {
		return availDateEndLessThanOrEqual;
	}

	public Date getAvailDateStartGreaterThanOrEqual() {
		return availDateStartGreaterThanOrEqual;
	}

	public Date getAvailDateStartLessThanOrEqual() {
		return availDateStartLessThanOrEqual;
	}

	public Date getCreateTimeGreaterThanOrEqual() {
		return createTimeGreaterThanOrEqual;
	}

	public Date getCreateTimeLessThanOrEqual() {
		return createTimeLessThanOrEqual;
	}

	public Long getDeptId() {
		return deptId;
	}

	public List<Long> getDeptIds() {
		return deptIds;
	}

	public Integer getDumpFlag() {
		return dumpFlag;
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

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public String getLastLoginIPLike() {
		if (lastLoginIPLike != null && lastLoginIPLike.trim().length() > 0) {
			if (!lastLoginIPLike.startsWith("%")) {
				lastLoginIPLike = "%" + lastLoginIPLike;
			}
			if (!lastLoginIPLike.endsWith("%")) {
				lastLoginIPLike = lastLoginIPLike + "%";
			}
		}
		return lastLoginIPLike;
	}

	public List<String> getLastLoginIPs() {
		return lastLoginIPs;
	}

	public Date getLastLoginTimeGreaterThanOrEqual() {
		return lastLoginTimeGreaterThanOrEqual;
	}

	public Date getLastLoginTimeLessThanOrEqual() {
		return lastLoginTimeLessThanOrEqual;
	}

	public String getMobile() {
		return mobile;
	}

	public String getMobileLike() {
		if (mobileLike != null && mobileLike.trim().length() > 0) {
			if (!mobileLike.startsWith("%")) {
				mobileLike = "%" + mobileLike;
			}
			if (!mobileLike.endsWith("%")) {
				mobileLike = mobileLike + "%";
			}
		}
		return mobileLike;
	}

	public String getName() {
		return name;
	}

	public String getNameLike() {
		if (nameLike != null && nameLike.trim().length() > 0) {
			if (!nameLike.startsWith("%")) {
				nameLike = "%" + nameLike;
			}
			if (!nameLike.endsWith("%")) {
				nameLike = nameLike + "%";
			}
		}
		return nameLike;
	}

	public List<String> getNames() {
		return names;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("account".equals(sortColumn)) {
				orderBy = "E.ACCOUNT" + a_x;
			}

			if ("password".equals(sortColumn)) {
				orderBy = "E.PASSWORD" + a_x;
			}

			if ("code".equals(sortColumn)) {
				orderBy = "E.CODE" + a_x;
			}

			if ("name".equals(sortColumn)) {
				orderBy = "E.NAME" + a_x;
			}

			if ("blocked".equals(sortColumn)) {
				orderBy = "E.BLOCKED" + a_x;
			}

			if ("createTime".equals(sortColumn)) {
				orderBy = "E.CREATETIME" + a_x;
			}

			if ("lastLoginTime".equals(sortColumn)) {
				orderBy = "E.LASTLOGINTIME" + a_x;
			}

			if ("lastLoginIP".equals(sortColumn)) {
				orderBy = "E.LASTLOGINIP" + a_x;
			}

			if ("evection".equals(sortColumn)) {
				orderBy = "E.EVECTION" + a_x;
			}

			if ("mobile".equals(sortColumn)) {
				orderBy = "E.MOBILE" + a_x;
			}

			if ("email".equals(sortColumn)) {
				orderBy = "E.EMAIL" + a_x;
			}

			if ("telephone".equals(sortColumn)) {
				orderBy = "E.TELEPHONE" + a_x;
			}

			if ("gender".equals(sortColumn)) {
				orderBy = "E.GENDER" + a_x;
			}

			if ("headship".equals(sortColumn)) {
				orderBy = "E.HEADSHIP" + a_x;
			}

			if ("userType".equals(sortColumn)) {
				orderBy = "E.USERTYPE" + a_x;
			}

			if ("fax".equals(sortColumn)) {
				orderBy = "E.FAX" + a_x;
			}

			if ("accountType".equals(sortColumn)) {
				orderBy = "E.ACCOUNTTYPE" + a_x;
			}

			if ("dumpFlag".equals(sortColumn)) {
				orderBy = "E.DUMPFLAG" + a_x;
			}

			if ("deptId".equals(sortColumn)) {
				orderBy = "E.DEPTID" + a_x;
			}

			if ("adminFlag".equals(sortColumn)) {
				orderBy = "E.ADMINFLAG" + a_x;
			}

			if ("superiorIds".equals(sortColumn)) {
				orderBy = "E.SUPERIORIDS" + a_x;
			}

		}
		return orderBy;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public List<String> getRoleCodes() {
		return roleCodes;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getTelephoneLike() {
		if (telephoneLike != null && telephoneLike.trim().length() > 0) {
			if (!telephoneLike.startsWith("%")) {
				telephoneLike = "%" + telephoneLike;
			}
			if (!telephoneLike.endsWith("%")) {
				telephoneLike = telephoneLike + "%";
			}
		}
		return telephoneLike;
	}

	public Integer getUserType() {
		return userType;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("id", "ID");
		addColumn("account", "USERID");
		addColumn("name", "NAME");
		addColumn("createTime", "CTIME");
		addColumn("lastLoginTime", "LASTLOGINTIME");
		addColumn("lastLoginIP", "LASTLOGINIP");
		addColumn("mobile", "MOBILE");
		addColumn("email", "EMAIL");
		addColumn("userType", "USERTYPE");
		addColumn("accountType", "ACCOUNTTYPE");
		addColumn("deptId", "DEPTID");
		addColumn("adminFlag", "ADMINFLAG");
	}

	public SysUserQuery lastLoginIP(String lastLoginIP) {
		if (lastLoginIP == null) {
			throw new RuntimeException("lastLoginIP is null");
		}
		this.lastLoginIP = lastLoginIP;
		return this;
	}

	public SysUserQuery lastLoginIPLike(String lastLoginIPLike) {
		if (lastLoginIPLike == null) {
			throw new RuntimeException("lastLoginIP is null");
		}
		this.lastLoginIPLike = lastLoginIPLike;
		return this;
	}

	public SysUserQuery lastLoginIPs(List<String> lastLoginIPs) {
		if (lastLoginIPs == null) {
			throw new RuntimeException("lastLoginIPs is empty ");
		}
		this.lastLoginIPs = lastLoginIPs;
		return this;
	}

	public SysUserQuery lastLoginTimeGreaterThanOrEqual(
			Date lastLoginTimeGreaterThanOrEqual) {
		if (lastLoginTimeGreaterThanOrEqual == null) {
			throw new RuntimeException("lastLoginTime is null");
		}
		this.lastLoginTimeGreaterThanOrEqual = lastLoginTimeGreaterThanOrEqual;
		return this;
	}

	public SysUserQuery lastLoginTimeLessThanOrEqual(
			Date lastLoginTimeLessThanOrEqual) {
		if (lastLoginTimeLessThanOrEqual == null) {
			throw new RuntimeException("lastLoginTime is null");
		}
		this.lastLoginTimeLessThanOrEqual = lastLoginTimeLessThanOrEqual;
		return this;
	}

	public SysUserQuery mobile(String mobile) {
		if (mobile == null) {
			throw new RuntimeException("mobile is null");
		}
		this.mobile = mobile;
		return this;
	}

	public SysUserQuery mobileLike(String mobileLike) {
		if (mobileLike == null) {
			throw new RuntimeException("mobile is null");
		}
		this.mobileLike = mobileLike;
		return this;
	}

	public SysUserQuery name(String name) {
		if (name == null) {
			throw new RuntimeException("name is null");
		}
		this.name = name;
		return this;
	}

	public SysUserQuery nameLike(String nameLike) {
		if (nameLike == null) {
			throw new RuntimeException("name is null");
		}
		this.nameLike = nameLike;
		return this;
	}

	public SysUserQuery names(List<String> names) {
		if (names == null) {
			throw new RuntimeException("names is empty ");
		}
		this.names = names;
		return this;
	}

	public SysUserQuery roleCode(String roleCode) {
		if (roleCode == null) {
			throw new RuntimeException("roleCode is null");
		}
		this.roleCode = roleCode;
		return this;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setAccountLike(String accountLike) {
		this.accountLike = accountLike;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	public void setAvailDateEndGreaterThanOrEqual(
			Date availDateEndGreaterThanOrEqual) {
		this.availDateEndGreaterThanOrEqual = availDateEndGreaterThanOrEqual;
	}

	public void setAvailDateEndLessThanOrEqual(Date availDateEndLessThanOrEqual) {
		this.availDateEndLessThanOrEqual = availDateEndLessThanOrEqual;
	}

	public void setAvailDateStartGreaterThanOrEqual(
			Date availDateStartGreaterThanOrEqual) {
		this.availDateStartGreaterThanOrEqual = availDateStartGreaterThanOrEqual;
	}

	public void setAvailDateStartLessThanOrEqual(
			Date availDateStartLessThanOrEqual) {
		this.availDateStartLessThanOrEqual = availDateStartLessThanOrEqual;
	}

	public void setCreateTimeGreaterThanOrEqual(
			Date createTimeGreaterThanOrEqual) {
		this.createTimeGreaterThanOrEqual = createTimeGreaterThanOrEqual;
	}

	public void setCreateTimeLessThanOrEqual(Date createTimeLessThanOrEqual) {
		this.createTimeLessThanOrEqual = createTimeLessThanOrEqual;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public void setDeptIds(List<Long> deptIds) {
		this.deptIds = deptIds;
	}

	public void setDumpFlag(Integer dumpFlag) {
		this.dumpFlag = dumpFlag;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmailLike(String emailLike) {
		this.emailLike = emailLike;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public void setLastLoginIPLike(String lastLoginIPLike) {
		this.lastLoginIPLike = lastLoginIPLike;
	}

	public void setLastLoginIPs(List<String> lastLoginIPs) {
		this.lastLoginIPs = lastLoginIPs;
	}

	public void setLastLoginTimeGreaterThanOrEqual(
			Date lastLoginTimeGreaterThanOrEqual) {
		this.lastLoginTimeGreaterThanOrEqual = lastLoginTimeGreaterThanOrEqual;
	}

	public void setLastLoginTimeLessThanOrEqual(
			Date lastLoginTimeLessThanOrEqual) {
		this.lastLoginTimeLessThanOrEqual = lastLoginTimeLessThanOrEqual;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setMobileLike(String mobileLike) {
		this.mobileLike = mobileLike;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public void setRoleCodes(List<String> roleCodes) {
		this.roleCodes = roleCodes;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setTelephoneLike(String telephoneLike) {
		this.telephoneLike = telephoneLike;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public SysUserQuery telephone(String telephone) {
		if (telephone == null) {
			throw new RuntimeException("telephone is null");
		}
		this.telephone = telephone;
		return this;
	}

	public SysUserQuery telephoneLike(String telephoneLike) {
		if (telephoneLike == null) {
			throw new RuntimeException("telephone is null");
		}
		this.telephoneLike = telephoneLike;
		return this;
	}

	public SysUserQuery userType(Integer userType) {
		if (userType == null) {
			throw new RuntimeException("userType is null");
		}
		this.userType = userType;
		return this;
	}

}