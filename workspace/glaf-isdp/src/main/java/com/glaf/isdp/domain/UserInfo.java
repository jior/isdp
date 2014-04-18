package com.glaf.isdp.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.core.identity.User;
import com.glaf.isdp.util.UserInfoJsonFactory;

@Entity
@Table(name = "userinfo")
public class UserInfo implements Serializable, JSONable, User {
	private static final long serialVersionUID = 1L;

	@javax.persistence.Transient
	protected int accountType;

	@Id
	@Column(name = "userId", length = 50, nullable = false)
	protected String actorId;

	/**
	 * computerid
	 */
	@Column(name = "computerid", length = 500)
	protected String computerId;

	/**
	 * ctime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ctime")
	protected Date createDate;

	/**
	 * depid
	 */
	@Column(name = "depid")
	protected Long deptId;

	/**
	 * domain_index
	 */
	@Column(name = "domain_index")
	protected int domainIndex;

	@javax.persistence.Transient
	protected int dumpflag;

	/**
	 * etime
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "etime")
	protected Date etime;

	@javax.persistence.Transient
	protected String fax;

	/**
	 * intallwbs
	 */
	@Column(name = "intallwbs")
	protected int intallwbs;

	/**
	 * intRemote
	 */
	@Column(name = "intRemote")
	protected int intRemote;

	@Column(name = "intVirtual")
	protected int intVirtual;

	/**
	 * isbind
	 */
	@Column(name = "isbind", length = 1)
	protected String isBind;

	/**
	 * issystem
	 */
	@Column(name = "issystem", length = 1)
	protected String isSystem;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "lastLoginDate")
	protected Date lastLoginDate;

	@javax.persistence.Transient
	protected int locked;

	@Column(name = "loginIP")
	protected String loginIP;

	@Column(name = "loginRetry")
	protected int loginRetry;

	/**
	 * email
	 */
	@Column(name = "email", length = 100)
	protected String mail;

	/**
	 * email_psw
	 */
	@Column(name = "email_psw", length = 50)
	protected String mailPwd;

	/**
	 * email_user
	 */
	@Column(name = "email_user", length = 100)
	protected String mailUser;

	/**
	 * Mobile
	 */
	@Column(name = "mobile", length = 15)
	protected String mobile;

	/**
	 * UserName
	 */
	@Column(name = "username", length = 20)
	protected String name;

	/**
	 * Password
	 */
	@Column(name = "password", length = 10)
	protected String password;

	/**
	 * note
	 */
	@Column(name = "note", length = 50)
	protected String remark;

	/**
	 * setpruv
	 */
	@Column(name = "setpruv", length = 1)
	protected String setpruv;

	/**
	 * slevel
	 */
	@Column(name = "slevel")
	protected int slevel;

	@javax.persistence.Transient
	protected int sortNo;

	/**
	 * status
	 */
	@Column(name = "status", length = 1)
	protected String status;

	@Column(name = "USERTYPE")
	protected int userType;

	/**
	 * Token
	 */
	@Column(name = "TOKEN", length = 250)
	protected String token;

	public UserInfo() {

	}

	public int getAccountType() {
		return 0;
	}

	public String getActivationCode() {
		return null;
	}

	public String getActorId() {
		return actorId;
	}

	public String getAdminFlag() {

		return null;
	}

	public String getComputerId() {
		return computerId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Date getCtime() {
		return this.createDate;
	}

	public long getDeptId() {
		return deptId;
	}

	public int getDomainIndex() {
		return this.domainIndex;
	}

	public int getDumpflag() {
		return dumpflag;
	}

	public String getEmail() {
		return this.mail;
	}

	public Date getEtime() {
		return this.etime;
	}

	public String getFax() {
		return fax;
	}

	public long getId() {

		return 0;
	}

	public int getIntallwbs() {
		return this.intallwbs;
	}

	public int getIntRemote() {
		return this.intRemote;
	}

	public int getIntVirtual() {
		return intVirtual;
	}

	public String getIsBind() {
		return this.isBind;
	}

	public String getIsSystem() {
		return isSystem;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public int getLocked() {
		return locked;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public int getLoginRetry() {
		return loginRetry;
	}

	public String getMail() {
		return mail;
	}

	public String getMailPwd() {
		return this.mailPwd;
	}

	public String getMailUser() {
		return mailUser;
	}

	public String getMobile() {
		return this.mobile;
	}

	public String getName() {
		return name;
	}

	public String getNote() {
		return this.remark;
	}

	public String getPassword() {
		return this.password;
	}

	public String getRemark() {
		return remark;
	}

	public String getSetpruv() {
		return this.setpruv;
	}

	public int getSlevel() {
		return this.slevel;
	}

	public int getSortNo() {
		return sortNo;
	}

	public String getStatus() {
		return this.status;
	}

	public String getSuperiorId() {
		return null;
	}

	public String getToken() {
		return token;
	}

	public String getUserId() {
		return this.actorId;
	}

	public String getUsername() {
		return this.name;
	}

	public int getUserType() {
		return userType;
	}

	public boolean isSystemAdministrator() {

		return false;
	}

	public UserInfo jsonToObject(JSONObject jsonObject) {
		return UserInfoJsonFactory.jsonToObject(jsonObject);
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public void setActivationCode(String activationCode) {

	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public void setAdminFlag(String adminFlag) {

	}

	public void setComputerId(String computerId) {
		this.computerId = computerId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setCtime(Date ctime) {
		this.createDate = ctime;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public void setDomainIndex(int domainIndex) {
		this.domainIndex = domainIndex;
	}

	public void setDumpflag(int dumpflag) {
		this.dumpflag = dumpflag;
	}

	public void setEmail(String email) {
		this.mail = email;
	}

	public void setEtime(Date etime) {
		this.etime = etime;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setId(long id) {

	}

	public void setIntallwbs(int intallwbs) {
		this.intallwbs = intallwbs;
	}

	public void setIntRemote(int intRemote) {
		this.intRemote = intRemote;
	}

	public void setIntVirtual(int intVirtual) {
		this.intVirtual = intVirtual;
	}

	public void setIsBind(String isBind) {
		this.isBind = isBind;
	}

	public void setIsSystem(String isSystem) {
		this.isSystem = isSystem;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public void setLoginRetry(int loginRetry) {
		this.loginRetry = loginRetry;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setMailPwd(String mailPwd) {
		this.mailPwd = mailPwd;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNote(String note) {
		this.remark = note;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setSetpruv(String setpruv) {
		this.setpruv = setpruv;
	}

	public void setSlevel(int slevel) {
		this.slevel = slevel;
	}

	public void setSortNo(int sortNo) {
		this.sortNo = sortNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setSuperiorId(String superiorId) {

	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setUserId(String userId) {
		this.actorId = userId;
	}

	public void setUsername(String username) {
		this.name = username;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public JSONObject toJsonObject() {
		return UserInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return UserInfoJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
