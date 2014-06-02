package com.glaf.liferay.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.liferay.util.UserJsonFactory;

/**
 * 
 * 实体对象
 * 
 */

@Entity
@Table(name = "USER_")
public class User implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USERID")
	protected Long userId;

	@Column(name = "UUID_", length = 75)
	protected String uuid;

	@Column(name = "COMPANYID")
	protected Long companyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATE")
	protected Date createDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFIEDDATE")
	protected Date modifiedDate;

	@Column(name = "DEFAULTUSER", length = 1)
	protected String defaultUser;

	@Column(name = "CONTACTID")
	protected Long contactId;

	@Column(name = "PASSWORD_", length = 75)
	protected String password;

	@Column(name = "PASSWORDENCRYPTED", length = 1)
	protected String passwordEncrypted;

	@Column(name = "PASSWORDRESET", length = 1)
	protected String passwordReset;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PASSWORDMODIFIEDDATE")
	protected Date passwordModifiedDate;

	@Column(name = "DIGEST", length = 255)
	protected String digest;

	@Column(name = "REMINDERQUERYQUESTION", length = 75)
	protected String reminderQueryQuestion;

	@Column(name = "REMINDERQUERYANSWER", length = 75)
	protected String reminderQueryAnswer;

	@Column(name = "GRACELOGINCOUNT")
	protected Integer graceLoginCount;

	@Column(name = "SCREENNAME", length = 75)
	protected String screenName;

	@Column(name = "EMAILADDRESS", length = 75)
	protected String emailAddress;

	@Column(name = "FACEBOOKID")
	protected Long facebookId;

	@Column(name = "LDAPSERVERID")
	protected Long ldapServerId;

	@Column(name = "OPENID", length = 1024)
	protected String openId;

	@Column(name = "PORTRAITID")
	protected Long portraitId;

	@Column(name = "LANGUAGEID", length = 75)
	protected String languageId;

	@Column(name = "TIMEZONEID", length = 75)
	protected String timeZoneId;

	@Column(name = "GREETING", length = 255)
	protected String greeting;

	@Column(name = "COMMENTS", length = 2000)
	protected String comments;

	@Column(name = "FIRSTNAME", length = 75)
	protected String firstName;

	@Column(name = "MIDDLENAME", length = 75)
	protected String middleName;

	@Column(name = "LASTNAME", length = 75)
	protected String lastName;

	@Column(name = "JOBTITLE", length = 100)
	protected String jobTitle;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGINDATE")
	protected Date loginDate;

	@Column(name = "LOGINIP", length = 75)
	protected String loginIP;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTLOGINDATE")
	protected Date lastLoginDate;

	@Column(name = "LASTLOGINIP", length = 75)
	protected String lastLoginIP;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LASTFAILEDLOGINDATE")
	protected Date lastFailedLoginDate;

	@Column(name = "FAILEDLOGINATTEMPTS")
	protected Integer failedLoginAttempts;

	@Column(name = "LOCKOUT", length = 1)
	protected String lockout;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOCKOUTDATE")
	protected Date lockoutDate;

	@Column(name = "AGREEDTOTERMSOFUSE", length = 1)
	protected String agreedToTermsOfUse;

	@Column(name = "EMAILADDRESSVERIFIED", length = 1)
	protected String emailAddressVerified;

	@Column(name = "STATUS")
	protected Integer status;

	public User() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	public String getAgreedToTermsOfUse() {
		return this.agreedToTermsOfUse;
	}

	public String getComments() {
		return this.comments;
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public Long getContactId() {
		return this.contactId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public String getDefaultUser() {
		return this.defaultUser;
	}

	public String getDigest() {
		return this.digest;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public String getEmailAddressVerified() {
		return this.emailAddressVerified;
	}

	public Long getFacebookId() {
		return this.facebookId;
	}

	public Integer getFailedLoginAttempts() {
		return this.failedLoginAttempts;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public Integer getGraceLoginCount() {
		return this.graceLoginCount;
	}

	public String getGreeting() {
		return this.greeting;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public String getLanguageId() {
		return this.languageId;
	}

	public Date getLastFailedLoginDate() {
		return this.lastFailedLoginDate;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public String getLastLoginIP() {
		return this.lastLoginIP;
	}

	public String getLastName() {
		return this.lastName;
	}

	public Long getLdapServerId() {
		return this.ldapServerId;
	}

	public String getLockout() {
		return this.lockout;
	}

	public Date getLockoutDate() {
		return this.lockoutDate;
	}

	public Date getLoginDate() {
		return this.loginDate;
	}

	public String getLoginIP() {
		return this.loginIP;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public String getOpenId() {
		return this.openId;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPasswordEncrypted() {
		return this.passwordEncrypted;
	}

	public Date getPasswordModifiedDate() {
		return this.passwordModifiedDate;
	}

	public String getPasswordReset() {
		return this.passwordReset;
	}

	public Long getPortraitId() {
		return this.portraitId;
	}

	public String getReminderQueryAnswer() {
		return this.reminderQueryAnswer;
	}

	public String getReminderQueryQuestion() {
		return this.reminderQueryQuestion;
	}

	public String getScreenName() {
		return this.screenName;
	}

	public Integer getStatus() {
		return this.status;
	}

	public String getTimeZoneId() {
		return this.timeZoneId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public String getUuid() {
		return this.uuid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	public User jsonToObject(JSONObject jsonObject) {
		return UserJsonFactory.jsonToObject(jsonObject);
	}

	public void setAgreedToTermsOfUse(String agreedToTermsOfUse) {
		this.agreedToTermsOfUse = agreedToTermsOfUse;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setDefaultUser(String defaultUser) {
		this.defaultUser = defaultUser;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setEmailAddressVerified(String emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}

	public void setFacebookId(Long facebookId) {
		this.facebookId = facebookId;
	}

	public void setFailedLoginAttempts(Integer failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setGraceLoginCount(Integer graceLoginCount) {
		this.graceLoginCount = graceLoginCount;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setLanguageId(String languageId) {
		this.languageId = languageId;
	}

	public void setLastFailedLoginDate(Date lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setLdapServerId(Long ldapServerId) {
		this.ldapServerId = ldapServerId;
	}

	public void setLockout(String lockout) {
		this.lockout = lockout;
	}

	public void setLockoutDate(Date lockoutDate) {
		this.lockoutDate = lockoutDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordEncrypted(String passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	public void setPasswordModifiedDate(Date passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}

	public void setPasswordReset(String passwordReset) {
		this.passwordReset = passwordReset;
	}

	public void setPortraitId(Long portraitId) {
		this.portraitId = portraitId;
	}

	public void setReminderQueryAnswer(String reminderQueryAnswer) {
		this.reminderQueryAnswer = reminderQueryAnswer;
	}

	public void setReminderQueryQuestion(String reminderQueryQuestion) {
		this.reminderQueryQuestion = reminderQueryQuestion;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public JSONObject toJsonObject() {
		return UserJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return UserJsonFactory.toObjectNode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
