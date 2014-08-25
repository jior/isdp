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

package com.glaf.base.modules.sys.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.util.SysUserJsonFactory;
import com.glaf.core.base.JSONable;
import com.glaf.core.identity.User;

@Entity
@Table(name = "UserInfo")
public class SysUser implements Serializable, User, JSONable {
	private static final long serialVersionUID = -7677600372139823989L;

	/**
	 * 用户名
	 */
	@Id
	@Column(name = "USERID", length = 50)
	protected String account;

	/**
	 * 账号类型
	 */
	@Column(name = "ACCOUNTTYPE")
	protected int accountType;

	/**
	 * 管理员标识
	 */
	@Column(name = "ISSYSTEM", length = 10)
	protected String adminFlag;

	@javax.persistence.Transient
	private Set<SysApplication> apps = new HashSet<SysApplication>();

	/**
	 * 启用标记
	 */
	@Column(name = "STATUS")
	protected String status;

	/**
	 * 创建人
	 */
	@Column(name = "CREATEBY", length = 50)
	protected String createBy;

	/**
	 * 创建时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CTIME")
	protected Date createTime;

	@javax.persistence.Transient
	private SysDepartment department;

	/**
	 * 部门编号
	 */
	@Column(name = "DEPID")
	protected long deptId;

	/**
	 * 废弃标记
	 */
	@Column(name = "DUMPFLAG")
	protected int dumpFlag;

	/**
	 * 邮件
	 */
	@Column(name = "EMAIL", length = 200)
	protected String email;

	/**
	 * 出差
	 */
	@Column(name = "EVECTION")
	protected int evection;

	/**
	 * 传真
	 */
	@Column(name = "FAX", length = 50)
	protected String fax;

	@javax.persistence.Transient
	private Set<SysFunction> functions = new HashSet<SysFunction>();

	/**
	 * 性别
	 */
	@Column(name = "GENDER")
	protected int gender;

	/**
	 * 职务
	 */
	@Column(name = "HEADSHIP", length = 50)
	protected String headship;

	/**
	 * 最后登录IP
	 */
	@Column(name = "LASTLOGINIP", length = 80)
	protected String lastLoginIP;

	/**
	 * 最后登录时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTLOGINTIME")
	protected Date lastLoginTime;

	@javax.persistence.Transient
	protected String menus;

	/**
	 * 手机
	 */
	@Column(name = "MOBILE", length = 50)
	protected String mobile;

	/**
	 * 姓名
	 */
	@Column(name = "USERNAME", length = 50)
	protected String name;

	@javax.persistence.Transient
	private List<SysDepartment> nestingDepartment;

	/**
	 * 密码
	 */
	@Column(name = "PASSWORD", length = 50)
	protected String password;

	@javax.persistence.Transient
	private Collection<SysRole> roles = new HashSet<SysRole>();

	@javax.persistence.Transient
	private Collection<SysDeptRole> deptRoles = new HashSet<SysDeptRole>();

	/**
	 * 上级领导
	 */
	@Column(name = "SUPERIORIDS", length = 250)
	protected String superiorIds;

	/**
	 * 电话
	 */
	@Column(name = "TELEPHONE", length = 50)
	protected String telephone;

	/**
	 * 修改人
	 */
	@Column(name = "UPDATEBY", length = 50)
	protected String updateBy;

	/**
	 * 修改日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATEDATE")
	protected Date updateDate;

	@javax.persistence.Transient
	private Set<SysUserRole> userRoles = new HashSet<SysUserRole>();

	/**
	 * 用户类别
	 */
	@Column(name = "USERTYPE")
	protected int userType;

	/**
	 * Token
	 */
	@Column(name = "TOKEN", length = 250)
	protected String token;

	@javax.persistence.Transient
	protected String sessionId;

	public SysUser() {

	}

	public String getAccount() {
		return account;
	}

	public int getAccountType() {
		return accountType;
	}

	public String getActorId() {
		return account;
	}

	public String getAdminFlag() {
		return adminFlag;
	}

	public Set<SysApplication> getApps() {
		if (apps == null) {
			apps = new HashSet<SysApplication>();
		}
		return apps;
	}

	public String getCreateBy() {
		return createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public SysDepartment getDepartment() {
		return department;
	}

	public long getDeptId() {
		if (department != null) {
			return department.getId();
		}
		return deptId;
	}

	public Collection<SysDeptRole> getDeptRoles() {
		if (deptRoles == null) {
			deptRoles = new HashSet<SysDeptRole>();
		}
		return deptRoles;
	}

	public int getDumpFlag() {
		return dumpFlag;
	}

	public String getEmail() {
		return email;
	}

	public int getEvection() {
		return evection;
	}

	public String getFax() {
		return fax;
	}

	public Set<SysFunction> getFunctions() {
		if (functions == null) {
			functions = new HashSet<SysFunction>();
		}
		return functions;
	}

	public int getGender() {
		return gender;
	}

	public String getHeadship() {
		return headship;
	}

	public long getId() {
		return account.hashCode();
	}

	public Date getLastLoginDate() {
		return lastLoginTime;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public int getLocked() {
		return 0;
	}

	public String getLoginIP() {
		return lastLoginIP;
	}

	public int getLoginRetry() {
		return 0;
	}

	public String getMail() {
		return email;
	}

	public String getMenus() {
		return menus;
	}

	public String getMobile() {
		return mobile;
	}

	public String getName() {
		return name;
	}

	public List<SysDepartment> getNestingDepartment() {
		return nestingDepartment;
	}

	public String getPassword() {
		return password;
	}

	public String getRemark() {
		return null;
	}

	public Collection<SysRole> getRoles() {
		if (roles == null) {
			roles = new HashSet<SysRole>();
		}
		return roles;
	}

	public String getSessionId() {
		return sessionId;
	}

	public String getStatus() {
		return status;
	}

	public String getSuperiorIds() {
		return superiorIds;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getToken() {
		return token;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public Set<SysUserRole> getUserRoles() {
		if (userRoles == null) {
			userRoles = new HashSet<SysUserRole>();
		}
		return userRoles;
	}

	public int getUserType() {
		return userType;
	}

	public boolean hasApplicationAccess(long appId) {
		boolean hasAccess = false;
		if (apps != null && !apps.isEmpty()) {
			for (SysApplication app : apps) {
				if (appId == app.getId()) {
					hasAccess = true;
					break;
				}
			}
		}
		return hasAccess;
	}

	public boolean isDepartmentAdmin() {
		boolean isDeptAdmin = false;

		if (roles != null && !roles.isEmpty()) {
			for (SysRole r : roles) {
				if ("R006".equals(r.getCode())) {
					isDeptAdmin = true;
					break;
				}
			}
		}

		if (!isDeptAdmin) {
			if (userRoles != null && !userRoles.isEmpty()) {
				for (SysUserRole r : userRoles) {
					if (r.getRole() != null) {
						if ("R006".equals(r.getRole().getCode())) {
							isDeptAdmin = true;
							break;
						}
					}
				}
			}
		}
		return isDeptAdmin;
	}

	public boolean isSystemAdmin() {
		return isSystemAdministrator();
	}

	public boolean isSystemAdministrator() {
		boolean isAdmin = false;

		if (StringUtils.equals(adminFlag, "1")) {
			isAdmin = true;
			return isAdmin;
		}

		if (roles != null && !roles.isEmpty()) {
			for (SysRole r : roles) {
				if ("SystemAdministrator".equals(r.getCode())) {
					isAdmin = true;
					break;
				}
			}
		}

		if (!isAdmin) {
			if (userRoles != null && !userRoles.isEmpty()) {
				for (SysUserRole r : userRoles) {
					if (r.getRole() != null) {
						if ("SystemAdministrator".equals(r.getRole().getCode())) {
							isAdmin = true;
							break;
						}
					}
				}
			}
		}
		return isAdmin;
	}

	public SysUser jsonToObject(JSONObject jsonObject) {
		return SysUserJsonFactory.jsonToObject(jsonObject);
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public void setActorId(String actorId) {
		this.account = actorId;
	}

	public void setAdminFlag(String adminFlag) {
		this.adminFlag = adminFlag;
	}

	public void setApps(Set<SysApplication> apps) {
		this.apps = apps;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setCreateDate(Date createDate) {
		this.createTime = createDate;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public void setDepartment(SysDepartment department) {
		this.department = department;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public void setDeptRoles(Collection<SysDeptRole> deptRoles) {
		this.deptRoles = deptRoles;
	}

	public void setDumpFlag(int dumpFlag) {
		this.dumpFlag = dumpFlag;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEvection(int evection) {
		this.evection = evection;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setFunctions(Set<SysFunction> functions) {
		this.functions = functions;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public void setHeadship(String headship) {
		this.headship = headship;
	}

	public void setId(long id) {

	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginTime = lastLoginDate;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public void setLocked(int locked) {
		this.status = String.valueOf(locked);
	}

	public void setLoginIP(String loginIP) {
		this.lastLoginIP = loginIP;
	}

	public void setLoginRetry(int loginRetry) {

	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public void setMenus(String menus) {
		this.menus = menus;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNestingDepartment(List<SysDepartment> nestingDepartment) {
		this.nestingDepartment = nestingDepartment;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRemark(String remark) {

	}

	public void setRoles(Collection<SysRole> roles) {
		this.roles = roles;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSuperiorIds(String superiorIds) {
		this.superiorIds = superiorIds;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUserRoles(Set<SysUserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public JSONObject toJsonObject() {
		return SysUserJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return SysUserJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return toJsonObject().toJSONString();
	}

}