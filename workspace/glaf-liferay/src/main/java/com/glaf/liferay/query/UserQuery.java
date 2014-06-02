package com.glaf.liferay.query;

import java.util.Date;
import java.util.List;

import com.glaf.core.query.DataQuery;

/**
 * 
 * 查询类
 * 
 */
public class UserQuery extends DataQuery {
	private static final long serialVersionUID = 1L;
	protected String uuid;
	protected List<String> uuids;
	protected Long userId;
	protected List<Long> userIds;
	protected Long companyId;
	protected List<Long> companyIds;
	protected Date createDateGreaterThanOrEqual;
	protected Date createDateLessThanOrEqual;
	protected Date modifiedDateGreaterThanOrEqual;
	protected Date modifiedDateLessThanOrEqual;
	protected String defaultUser;
	protected Long contactId;
	protected List<Long> contactIds;
	protected String passwordEncrypted;
	protected String passwordReset;
	protected Date passwordModifiedDateGreaterThanOrEqual;
	protected Date passwordModifiedDateLessThanOrEqual;
	protected String screenName;
	protected String screenNameLike;
	protected String emailAddressLike;
	protected String openId;
	protected List<String> openIds;
	protected Long portraitId;
	protected List<Long> portraitIds;
	protected String languageId;
	protected List<String> languageIds;
	protected String timeZoneId;
	protected String firstNameLike;
	protected String middleNameLike;
	protected String lastNameLike;
	protected String jobTitleLike;
	protected Date loginDateGreaterThanOrEqual;
	protected Date loginDateLessThanOrEqual;
	protected String loginIP;
	protected String loginIPLike;
	protected Date lastLoginDateGreaterThanOrEqual;
	protected Date lastLoginDateLessThanOrEqual;
	protected String lastLoginIP;
	protected String lastLoginIPLike;
	protected String lockout;
	protected List<String> lockouts;
	protected Date lockoutDateGreaterThanOrEqual;
	protected Date lockoutDateLessThanOrEqual;
	protected String emailAddressVerified;
	protected Integer status;

	public UserQuery() {

	}

	public String getUuid() {
		return uuid;
	}

	public List<String> getUuids() {
		return uuids;
	}

	public Long getUserId() {
		return userId;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public List<Long> getCompanyIds() {
		return companyIds;
	}

	public Date getCreateDateGreaterThanOrEqual() {
		return createDateGreaterThanOrEqual;
	}

	public Date getCreateDateLessThanOrEqual() {
		return createDateLessThanOrEqual;
	}

	public Date getModifiedDateGreaterThanOrEqual() {
		return modifiedDateGreaterThanOrEqual;
	}

	public Date getModifiedDateLessThanOrEqual() {
		return modifiedDateLessThanOrEqual;
	}

	public String getDefaultUser() {
		return defaultUser;
	}

	public Long getContactId() {
		return contactId;
	}

	public List<Long> getContactIds() {
		return contactIds;
	}

	public String getPasswordEncrypted() {
		return passwordEncrypted;
	}

	public String getPasswordReset() {
		return passwordReset;
	}

	public Date getPasswordModifiedDateGreaterThanOrEqual() {
		return passwordModifiedDateGreaterThanOrEqual;
	}

	public Date getPasswordModifiedDateLessThanOrEqual() {
		return passwordModifiedDateLessThanOrEqual;
	}

	public String getScreenName() {
		return screenName;
	}

	public String getScreenNameLike() {
		if (screenNameLike != null && screenNameLike.trim().length() > 0) {
			if (!screenNameLike.startsWith("%")) {
				screenNameLike = "%" + screenNameLike;
			}
			if (!screenNameLike.endsWith("%")) {
				screenNameLike = screenNameLike + "%";
			}
		}
		return screenNameLike;
	}

	public String getEmailAddressLike() {
		if (emailAddressLike != null && emailAddressLike.trim().length() > 0) {
			if (!emailAddressLike.startsWith("%")) {
				emailAddressLike = "%" + emailAddressLike;
			}
			if (!emailAddressLike.endsWith("%")) {
				emailAddressLike = emailAddressLike + "%";
			}
		}
		return emailAddressLike;
	}

	public String getOpenId() {
		return openId;
	}

	public List<String> getOpenIds() {
		return openIds;
	}

	public Long getPortraitId() {
		return portraitId;
	}

	public List<Long> getPortraitIds() {
		return portraitIds;
	}

	public String getLanguageId() {
		return languageId;
	}

	public List<String> getLanguageIds() {
		return languageIds;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public String getFirstNameLike() {
		if (firstNameLike != null && firstNameLike.trim().length() > 0) {
			if (!firstNameLike.startsWith("%")) {
				firstNameLike = "%" + firstNameLike;
			}
			if (!firstNameLike.endsWith("%")) {
				firstNameLike = firstNameLike + "%";
			}
		}
		return firstNameLike;
	}

	public String getMiddleNameLike() {
		if (middleNameLike != null && middleNameLike.trim().length() > 0) {
			if (!middleNameLike.startsWith("%")) {
				middleNameLike = "%" + middleNameLike;
			}
			if (!middleNameLike.endsWith("%")) {
				middleNameLike = middleNameLike + "%";
			}
		}
		return middleNameLike;
	}

	public String getLastNameLike() {
		if (lastNameLike != null && lastNameLike.trim().length() > 0) {
			if (!lastNameLike.startsWith("%")) {
				lastNameLike = "%" + lastNameLike;
			}
			if (!lastNameLike.endsWith("%")) {
				lastNameLike = lastNameLike + "%";
			}
		}
		return lastNameLike;
	}

	public String getJobTitleLike() {
		if (jobTitleLike != null && jobTitleLike.trim().length() > 0) {
			if (!jobTitleLike.startsWith("%")) {
				jobTitleLike = "%" + jobTitleLike;
			}
			if (!jobTitleLike.endsWith("%")) {
				jobTitleLike = jobTitleLike + "%";
			}
		}
		return jobTitleLike;
	}

	public Date getLoginDateGreaterThanOrEqual() {
		return loginDateGreaterThanOrEqual;
	}

	public Date getLoginDateLessThanOrEqual() {
		return loginDateLessThanOrEqual;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public String getLoginIPLike() {
		if (loginIPLike != null && loginIPLike.trim().length() > 0) {
			if (!loginIPLike.startsWith("%")) {
				loginIPLike = "%" + loginIPLike;
			}
			if (!loginIPLike.endsWith("%")) {
				loginIPLike = loginIPLike + "%";
			}
		}
		return loginIPLike;
	}

	public Date getLastLoginDateGreaterThanOrEqual() {
		return lastLoginDateGreaterThanOrEqual;
	}

	public Date getLastLoginDateLessThanOrEqual() {
		return lastLoginDateLessThanOrEqual;
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

	public String getLockout() {
		return lockout;
	}

	public List<String> getLockouts() {
		return lockouts;
	}

	public Date getLockoutDateGreaterThanOrEqual() {
		return lockoutDateGreaterThanOrEqual;
	}

	public Date getLockoutDateLessThanOrEqual() {
		return lockoutDateLessThanOrEqual;
	}

	public String getEmailAddressVerified() {
		return emailAddressVerified;
	}

	public Integer getStatusGreaterThanOrEqual() {
		return statusGreaterThanOrEqual;
	}

	public Integer getStatusLessThanOrEqual() {
		return statusLessThanOrEqual;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public void setUuids(List<String> uuids) {
		this.uuids = uuids;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setCompanyIds(List<Long> companyIds) {
		this.companyIds = companyIds;
	}

	public void setCreateDateGreaterThanOrEqual(
			Date createDateGreaterThanOrEqual) {
		this.createDateGreaterThanOrEqual = createDateGreaterThanOrEqual;
	}

	public void setCreateDateLessThanOrEqual(Date createDateLessThanOrEqual) {
		this.createDateLessThanOrEqual = createDateLessThanOrEqual;
	}

	public void setModifiedDateGreaterThanOrEqual(
			Date modifiedDateGreaterThanOrEqual) {
		this.modifiedDateGreaterThanOrEqual = modifiedDateGreaterThanOrEqual;
	}

	public void setModifiedDateLessThanOrEqual(Date modifiedDateLessThanOrEqual) {
		this.modifiedDateLessThanOrEqual = modifiedDateLessThanOrEqual;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public void setContactIds(List<Long> contactIds) {
		this.contactIds = contactIds;
	}

	public void setPasswordEncrypted(String passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	public void setPasswordReset(String passwordReset) {
		this.passwordReset = passwordReset;
	}

	public void setPasswordModifiedDateGreaterThanOrEqual(
			Date passwordModifiedDateGreaterThanOrEqual) {
		this.passwordModifiedDateGreaterThanOrEqual = passwordModifiedDateGreaterThanOrEqual;
	}

	public void setPasswordModifiedDateLessThanOrEqual(
			Date passwordModifiedDateLessThanOrEqual) {
		this.passwordModifiedDateLessThanOrEqual = passwordModifiedDateLessThanOrEqual;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public void setScreenNameLike(String screenNameLike) {
		this.screenNameLike = screenNameLike;
	}

	public void setEmailAddressLike(String emailAddressLike) {
		this.emailAddressLike = emailAddressLike;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public void setOpenIds(List<String> openIds) {
		this.openIds = openIds;
	}

	public void setPortraitId(Long portraitId) {
		this.portraitId = portraitId;
	}

	public void setPortraitIds(List<Long> portraitIds) {
		this.portraitIds = portraitIds;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public void setLanguageIds(List<String> languageIds) {
		this.languageIds = languageIds;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public void setFirstNameLike(String firstNameLike) {
		this.firstNameLike = firstNameLike;
	}

	public void setMiddleNameLike(String middleNameLike) {
		this.middleNameLike = middleNameLike;
	}

	public void setLastNameLike(String lastNameLike) {
		this.lastNameLike = lastNameLike;
	}

	public void setJobTitleLike(String jobTitleLike) {
		this.jobTitleLike = jobTitleLike;
	}

	public void setLoginDateGreaterThanOrEqual(Date loginDateGreaterThanOrEqual) {
		this.loginDateGreaterThanOrEqual = loginDateGreaterThanOrEqual;
	}

	public void setLoginDateLessThanOrEqual(Date loginDateLessThanOrEqual) {
		this.loginDateLessThanOrEqual = loginDateLessThanOrEqual;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public void setLoginIPLike(String loginIPLike) {
		this.loginIPLike = loginIPLike;
	}

	public void setLastLoginDateGreaterThanOrEqual(
			Date lastLoginDateGreaterThanOrEqual) {
		this.lastLoginDateGreaterThanOrEqual = lastLoginDateGreaterThanOrEqual;
	}

	public void setLastLoginDateLessThanOrEqual(
			Date lastLoginDateLessThanOrEqual) {
		this.lastLoginDateLessThanOrEqual = lastLoginDateLessThanOrEqual;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public void setLastLoginIPLike(String lastLoginIPLike) {
		this.lastLoginIPLike = lastLoginIPLike;
	}

	public void setLockout(String lockout) {
		this.lockout = lockout;
	}

	public void setLockouts(List<String> lockouts) {
		this.lockouts = lockouts;
	}

	public void setLockoutDateGreaterThanOrEqual(
			Date lockoutDateGreaterThanOrEqual) {
		this.lockoutDateGreaterThanOrEqual = lockoutDateGreaterThanOrEqual;
	}

	public void setLockoutDateLessThanOrEqual(Date lockoutDateLessThanOrEqual) {
		this.lockoutDateLessThanOrEqual = lockoutDateLessThanOrEqual;
	}

	public void setEmailAddressVerified(String emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public UserQuery uuid(String uuid) {
		if (uuid == null) {
			throw new RuntimeException("uuid is null");
		}
		this.uuid = uuid;
		return this;
	}

	public UserQuery uuids(List<String> uuids) {
		if (uuids == null) {
			throw new RuntimeException("uuids is empty ");
		}
		this.uuids = uuids;
		return this;
	}

	public UserQuery userId(Long userId) {
		if (userId == null) {
			throw new RuntimeException("userId is null");
		}
		this.userId = userId;
		return this;
	}

	public UserQuery userIds(List<Long> userIds) {
		if (userIds == null) {
			throw new RuntimeException("userIds is empty ");
		}
		this.userIds = userIds;
		return this;
	}

	public UserQuery companyId(Long companyId) {
		if (companyId == null) {
			throw new RuntimeException("companyId is null");
		}
		this.companyId = companyId;
		return this;
	}

	public UserQuery companyIds(List<Long> companyIds) {
		if (companyIds == null) {
			throw new RuntimeException("companyIds is empty ");
		}
		this.companyIds = companyIds;
		return this;
	}

	public UserQuery createDate(Date createDate) {
		if (createDate == null) {
			throw new RuntimeException("createDate is null");
		}
		this.createDate = createDate;
		return this;
	}

	public UserQuery createDateGreaterThanOrEqual(
			Date createDateGreaterThanOrEqual) {
		if (createDateGreaterThanOrEqual == null) {
			throw new RuntimeException("createDate is null");
		}
		this.createDateGreaterThanOrEqual = createDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery createDateLessThanOrEqual(Date createDateLessThanOrEqual) {
		if (createDateLessThanOrEqual == null) {
			throw new RuntimeException("createDate is null");
		}
		this.createDateLessThanOrEqual = createDateLessThanOrEqual;
		return this;
	}

	public UserQuery modifiedDateGreaterThanOrEqual(
			Date modifiedDateGreaterThanOrEqual) {
		if (modifiedDateGreaterThanOrEqual == null) {
			throw new RuntimeException("modifiedDate is null");
		}
		this.modifiedDateGreaterThanOrEqual = modifiedDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery modifiedDateLessThanOrEqual(
			Date modifiedDateLessThanOrEqual) {
		if (modifiedDateLessThanOrEqual == null) {
			throw new RuntimeException("modifiedDate is null");
		}
		this.modifiedDateLessThanOrEqual = modifiedDateLessThanOrEqual;
		return this;
	}

	public UserQuery defaultUser(String defaultUser) {
		if (defaultUser == null) {
			throw new RuntimeException("defaultUser is null");
		}
		this.defaultUser = defaultUser;
		return this;
	}

	public UserQuery contactId(Long contactId) {
		if (contactId == null) {
			throw new RuntimeException("contactId is null");
		}
		this.contactId = contactId;
		return this;
	}

	public UserQuery contactIds(List<Long> contactIds) {
		if (contactIds == null) {
			throw new RuntimeException("contactIds is empty ");
		}
		this.contactIds = contactIds;
		return this;
	}

	public UserQuery passwordEncrypted(String passwordEncrypted) {
		if (passwordEncrypted == null) {
			throw new RuntimeException("passwordEncrypted is null");
		}
		this.passwordEncrypted = passwordEncrypted;
		return this;
	}

	public UserQuery passwordReset(String passwordReset) {
		if (passwordReset == null) {
			throw new RuntimeException("passwordReset is null");
		}
		this.passwordReset = passwordReset;
		return this;
	}

	public UserQuery passwordModifiedDateGreaterThanOrEqual(
			Date passwordModifiedDateGreaterThanOrEqual) {
		if (passwordModifiedDateGreaterThanOrEqual == null) {
			throw new RuntimeException("passwordModifiedDate is null");
		}
		this.passwordModifiedDateGreaterThanOrEqual = passwordModifiedDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery passwordModifiedDateLessThanOrEqual(
			Date passwordModifiedDateLessThanOrEqual) {
		if (passwordModifiedDateLessThanOrEqual == null) {
			throw new RuntimeException("passwordModifiedDate is null");
		}
		this.passwordModifiedDateLessThanOrEqual = passwordModifiedDateLessThanOrEqual;
		return this;
	}

	public UserQuery screenName(String screenName) {
		if (screenName == null) {
			throw new RuntimeException("screenName is null");
		}
		this.screenName = screenName;
		return this;
	}

	public UserQuery screenNameLike(String screenNameLike) {
		if (screenNameLike == null) {
			throw new RuntimeException("screenName is null");
		}
		this.screenNameLike = screenNameLike;
		return this;
	}

	public UserQuery emailAddressLike(String emailAddressLike) {
		if (emailAddressLike == null) {
			throw new RuntimeException("emailAddress is null");
		}
		this.emailAddressLike = emailAddressLike;
		return this;
	}

	public UserQuery openId(String openId) {
		if (openId == null) {
			throw new RuntimeException("openId is null");
		}
		this.openId = openId;
		return this;
	}

	public UserQuery openIds(List<String> openIds) {
		if (openIds == null) {
			throw new RuntimeException("openIds is empty ");
		}
		this.openIds = openIds;
		return this;
	}

	public UserQuery portraitId(Long portraitId) {
		if (portraitId == null) {
			throw new RuntimeException("portraitId is null");
		}
		this.portraitId = portraitId;
		return this;
	}

	public UserQuery portraitIds(List<Long> portraitIds) {
		if (portraitIds == null) {
			throw new RuntimeException("portraitIds is empty ");
		}
		this.portraitIds = portraitIds;
		return this;
	}

	public UserQuery languageId(String languageId) {
		if (languageId == null) {
			throw new RuntimeException("languageId is null");
		}
		this.languageId = languageId;
		return this;
	}

	public UserQuery languageIds(List<String> languageIds) {
		if (languageIds == null) {
			throw new RuntimeException("languageIds is empty ");
		}
		this.languageIds = languageIds;
		return this;
	}

	public UserQuery timeZoneId(String timeZoneId) {
		if (timeZoneId == null) {
			throw new RuntimeException("timeZoneId is null");
		}
		this.timeZoneId = timeZoneId;
		return this;
	}

	public UserQuery firstNameLike(String firstNameLike) {
		if (firstNameLike == null) {
			throw new RuntimeException("firstName is null");
		}
		this.firstNameLike = firstNameLike;
		return this;
	}

	public UserQuery middleNameLike(String middleNameLike) {
		if (middleNameLike == null) {
			throw new RuntimeException("middleName is null");
		}
		this.middleNameLike = middleNameLike;
		return this;
	}

	public UserQuery lastNameLike(String lastNameLike) {
		if (lastNameLike == null) {
			throw new RuntimeException("lastName is null");
		}
		this.lastNameLike = lastNameLike;
		return this;
	}

	public UserQuery jobTitleLike(String jobTitleLike) {
		if (jobTitleLike == null) {
			throw new RuntimeException("jobTitle is null");
		}
		this.jobTitleLike = jobTitleLike;
		return this;
	}

	public UserQuery loginDateGreaterThanOrEqual(
			Date loginDateGreaterThanOrEqual) {
		if (loginDateGreaterThanOrEqual == null) {
			throw new RuntimeException("loginDate is null");
		}
		this.loginDateGreaterThanOrEqual = loginDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery loginDateLessThanOrEqual(Date loginDateLessThanOrEqual) {
		if (loginDateLessThanOrEqual == null) {
			throw new RuntimeException("loginDate is null");
		}
		this.loginDateLessThanOrEqual = loginDateLessThanOrEqual;
		return this;
	}

	public UserQuery loginIP(String loginIP) {
		if (loginIP == null) {
			throw new RuntimeException("loginIP is null");
		}
		this.loginIP = loginIP;
		return this;
	}

	public UserQuery loginIPLike(String loginIPLike) {
		if (loginIPLike == null) {
			throw new RuntimeException("loginIP is null");
		}
		this.loginIPLike = loginIPLike;
		return this;
	}

	public UserQuery lastLoginDateGreaterThanOrEqual(
			Date lastLoginDateGreaterThanOrEqual) {
		if (lastLoginDateGreaterThanOrEqual == null) {
			throw new RuntimeException("lastLoginDate is null");
		}
		this.lastLoginDateGreaterThanOrEqual = lastLoginDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery lastLoginDateLessThanOrEqual(
			Date lastLoginDateLessThanOrEqual) {
		if (lastLoginDateLessThanOrEqual == null) {
			throw new RuntimeException("lastLoginDate is null");
		}
		this.lastLoginDateLessThanOrEqual = lastLoginDateLessThanOrEqual;
		return this;
	}

	public UserQuery lastLoginIP(String lastLoginIP) {
		if (lastLoginIP == null) {
			throw new RuntimeException("lastLoginIP is null");
		}
		this.lastLoginIP = lastLoginIP;
		return this;
	}

	public UserQuery lastLoginIPLike(String lastLoginIPLike) {
		if (lastLoginIPLike == null) {
			throw new RuntimeException("lastLoginIP is null");
		}
		this.lastLoginIPLike = lastLoginIPLike;
		return this;
	}

	public UserQuery lockout(String lockout) {
		if (lockout == null) {
			throw new RuntimeException("lockout is null");
		}
		this.lockout = lockout;
		return this;
	}

	public UserQuery lockouts(List<String> lockouts) {
		if (lockouts == null) {
			throw new RuntimeException("lockouts is empty ");
		}
		this.lockouts = lockouts;
		return this;
	}

	public UserQuery lockoutDateGreaterThanOrEqual(
			Date lockoutDateGreaterThanOrEqual) {
		if (lockoutDateGreaterThanOrEqual == null) {
			throw new RuntimeException("lockoutDate is null");
		}
		this.lockoutDateGreaterThanOrEqual = lockoutDateGreaterThanOrEqual;
		return this;
	}

	public UserQuery lockoutDateLessThanOrEqual(Date lockoutDateLessThanOrEqual) {
		if (lockoutDateLessThanOrEqual == null) {
			throw new RuntimeException("lockoutDate is null");
		}
		this.lockoutDateLessThanOrEqual = lockoutDateLessThanOrEqual;
		return this;
	}

	public UserQuery emailAddressVerified(String emailAddressVerified) {
		if (emailAddressVerified == null) {
			throw new RuntimeException("emailAddressVerified is null");
		}
		this.emailAddressVerified = emailAddressVerified;
		return this;
	}

	public UserQuery status(Integer status) {
		if (status == null) {
			throw new RuntimeException("status is null");
		}
		this.status = status;
		return this;
	}

	public UserQuery statusGreaterThanOrEqual(Integer statusGreaterThanOrEqual) {
		if (statusGreaterThanOrEqual == null) {
			throw new RuntimeException("status is null");
		}
		this.statusGreaterThanOrEqual = statusGreaterThanOrEqual;
		return this;
	}

	public UserQuery statusLessThanOrEqual(Integer statusLessThanOrEqual) {
		if (statusLessThanOrEqual == null) {
			throw new RuntimeException("status is null");
		}
		this.statusLessThanOrEqual = statusLessThanOrEqual;
		return this;
	}

	public String getOrderBy() {
		if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

			if ("uuid".equals(sortColumn)) {
				orderBy = "E.UUID_" + a_x;
			}

			if ("userId".equals(sortColumn)) {
				orderBy = "E.USERID" + a_x;
			}

			if ("companyId".equals(sortColumn)) {
				orderBy = "E.COMPANYID" + a_x;
			}

			if ("createDate".equals(sortColumn)) {
				orderBy = "E.CREATEDATE" + a_x;
			}

			if ("modifiedDate".equals(sortColumn)) {
				orderBy = "E.MODIFIEDDATE" + a_x;
			}

			if ("defaultUser".equals(sortColumn)) {
				orderBy = "E.DEFAULTUSER" + a_x;
			}

			if ("contactId".equals(sortColumn)) {
				orderBy = "E.CONTACTID" + a_x;
			}

			if ("password".equals(sortColumn)) {
				orderBy = "E.PASSWORD_" + a_x;
			}

			if ("passwordEncrypted".equals(sortColumn)) {
				orderBy = "E.PASSWORDENCRYPTED" + a_x;
			}

			if ("passwordReset".equals(sortColumn)) {
				orderBy = "E.PASSWORDRESET" + a_x;
			}

			if ("passwordModifiedDate".equals(sortColumn)) {
				orderBy = "E.PASSWORDMODIFIEDDATE" + a_x;
			}

			if ("digest".equals(sortColumn)) {
				orderBy = "E.DIGEST" + a_x;
			}

			if ("reminderQueryQuestion".equals(sortColumn)) {
				orderBy = "E.REMINDERQUERYQUESTION" + a_x;
			}

			if ("reminderQueryAnswer".equals(sortColumn)) {
				orderBy = "E.REMINDERQUERYANSWER" + a_x;
			}

			if ("graceLoginCount".equals(sortColumn)) {
				orderBy = "E.GRACELOGINCOUNT" + a_x;
			}

			if ("screenName".equals(sortColumn)) {
				orderBy = "E.SCREENNAME" + a_x;
			}

			if ("emailAddress".equals(sortColumn)) {
				orderBy = "E.EMAILADDRESS" + a_x;
			}

			if ("facebookId".equals(sortColumn)) {
				orderBy = "E.FACEBOOKID" + a_x;
			}

			if ("ldapServerId".equals(sortColumn)) {
				orderBy = "E.LDAPSERVERID" + a_x;
			}

			if ("openId".equals(sortColumn)) {
				orderBy = "E.OPENID" + a_x;
			}

			if ("portraitId".equals(sortColumn)) {
				orderBy = "E.PORTRAITID" + a_x;
			}

			if ("languageId".equals(sortColumn)) {
				orderBy = "E.LANGUAGEID" + a_x;
			}

			if ("timeZoneId".equals(sortColumn)) {
				orderBy = "E.TIMEZONEID" + a_x;
			}

			if ("greeting".equals(sortColumn)) {
				orderBy = "E.GREETING" + a_x;
			}

			if ("comments".equals(sortColumn)) {
				orderBy = "E.COMMENTS" + a_x;
			}

			if ("firstName".equals(sortColumn)) {
				orderBy = "E.FIRSTNAME" + a_x;
			}

			if ("middleName".equals(sortColumn)) {
				orderBy = "E.MIDDLENAME" + a_x;
			}

			if ("lastName".equals(sortColumn)) {
				orderBy = "E.LASTNAME" + a_x;
			}

			if ("jobTitle".equals(sortColumn)) {
				orderBy = "E.JOBTITLE" + a_x;
			}

			if ("loginDate".equals(sortColumn)) {
				orderBy = "E.LOGINDATE" + a_x;
			}

			if ("loginIP".equals(sortColumn)) {
				orderBy = "E.LOGINIP" + a_x;
			}

			if ("lastLoginDate".equals(sortColumn)) {
				orderBy = "E.LASTLOGINDATE" + a_x;
			}

			if ("lastLoginIP".equals(sortColumn)) {
				orderBy = "E.LASTLOGINIP" + a_x;
			}

			if ("lastFailedLoginDate".equals(sortColumn)) {
				orderBy = "E.LASTFAILEDLOGINDATE" + a_x;
			}

			if ("failedLoginAttempts".equals(sortColumn)) {
				orderBy = "E.FAILEDLOGINATTEMPTS" + a_x;
			}

			if ("lockout".equals(sortColumn)) {
				orderBy = "E.LOCKOUT" + a_x;
			}

			if ("lockoutDate".equals(sortColumn)) {
				orderBy = "E.LOCKOUTDATE" + a_x;
			}

			if ("agreedToTermsOfUse".equals(sortColumn)) {
				orderBy = "E.AGREEDTOTERMSOFUSE" + a_x;
			}

			if ("emailAddressVerified".equals(sortColumn)) {
				orderBy = "E.EMAILADDRESSVERIFIED" + a_x;
			}

			if ("status".equals(sortColumn)) {
				orderBy = "E.STATUS" + a_x;
			}

		}
		return orderBy;
	}

	@Override
	public void initQueryColumns() {
		super.initQueryColumns();
		addColumn("uuid", "UUID_");
		addColumn("userId", "USERID");
		addColumn("companyId", "COMPANYID");
		addColumn("createDate", "CREATEDATE");
		addColumn("modifiedDate", "MODIFIEDDATE");
		addColumn("defaultUser", "DEFAULTUSER");
		addColumn("contactId", "CONTACTID");
		addColumn("password", "PASSWORD_");
		addColumn("passwordEncrypted", "PASSWORDENCRYPTED");
		addColumn("passwordReset", "PASSWORDRESET");
		addColumn("passwordModifiedDate", "PASSWORDMODIFIEDDATE");
		addColumn("digest", "DIGEST");
		addColumn("reminderQueryQuestion", "REMINDERQUERYQUESTION");
		addColumn("reminderQueryAnswer", "REMINDERQUERYANSWER");
		addColumn("graceLoginCount", "GRACELOGINCOUNT");
		addColumn("screenName", "SCREENNAME");
		addColumn("emailAddress", "EMAILADDRESS");
		addColumn("facebookId", "FACEBOOKID");
		addColumn("ldapServerId", "LDAPSERVERID");
		addColumn("openId", "OPENID");
		addColumn("portraitId", "PORTRAITID");
		addColumn("languageId", "LANGUAGEID");
		addColumn("timeZoneId", "TIMEZONEID");
		addColumn("greeting", "GREETING");
		addColumn("comments", "COMMENTS");
		addColumn("firstName", "FIRSTNAME");
		addColumn("middleName", "MIDDLENAME");
		addColumn("lastName", "LASTNAME");
		addColumn("jobTitle", "JOBTITLE");
		addColumn("loginDate", "LOGINDATE");
		addColumn("loginIP", "LOGINIP");
		addColumn("lastLoginDate", "LASTLOGINDATE");
		addColumn("lastLoginIP", "LASTLOGINIP");
		addColumn("lastFailedLoginDate", "LASTFAILEDLOGINDATE");
		addColumn("failedLoginAttempts", "FAILEDLOGINATTEMPTS");
		addColumn("lockout", "LOCKOUT");
		addColumn("lockoutDate", "LOCKOUTDATE");
		addColumn("agreedToTermsOfUse", "AGREEDTOTERMSOFUSE");
		addColumn("emailAddressVerified", "EMAILADDRESSVERIFIED");
		addColumn("status", "STATUS");
	}

}