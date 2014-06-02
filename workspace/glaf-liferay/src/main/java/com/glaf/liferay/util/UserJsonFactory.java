package com.glaf.liferay.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.DateUtils;
import com.glaf.liferay.domain.User;

/**
 * 
 * JSON工厂类
 * 
 */
public class UserJsonFactory {

	public static java.util.List<User> arrayToList(JSONArray array) {
		java.util.List<User> list = new java.util.ArrayList<User>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			User model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}

	public static User jsonToObject(JSONObject jsonObject) {
		User model = new User();

		if (jsonObject.containsKey("uuid")) {
			model.setUuid(jsonObject.getString("uuid"));
		}
		if (jsonObject.containsKey("userId")) {
			model.setUserId(jsonObject.getLong("userId"));
		}
		if (jsonObject.containsKey("companyId")) {
			model.setCompanyId(jsonObject.getLong("companyId"));
		}
		if (jsonObject.containsKey("createDate")) {
			model.setCreateDate(jsonObject.getDate("createDate"));
		}
		if (jsonObject.containsKey("modifiedDate")) {
			model.setModifiedDate(jsonObject.getDate("modifiedDate"));
		}
		if (jsonObject.containsKey("defaultUser")) {
			model.setDefaultUser(jsonObject.getString("defaultUser"));
		}
		if (jsonObject.containsKey("contactId")) {
			model.setContactId(jsonObject.getLong("contactId"));
		}
		if (jsonObject.containsKey("password")) {
			model.setPassword(jsonObject.getString("password"));
		}
		if (jsonObject.containsKey("passwordEncrypted")) {
			model.setPasswordEncrypted(jsonObject
					.getString("passwordEncrypted"));
		}
		if (jsonObject.containsKey("passwordReset")) {
			model.setPasswordReset(jsonObject.getString("passwordReset"));
		}
		if (jsonObject.containsKey("passwordModifiedDate")) {
			model.setPasswordModifiedDate(jsonObject
					.getDate("passwordModifiedDate"));
		}
		if (jsonObject.containsKey("digest")) {
			model.setDigest(jsonObject.getString("digest"));
		}
		if (jsonObject.containsKey("reminderQueryQuestion")) {
			model.setReminderQueryQuestion(jsonObject
					.getString("reminderQueryQuestion"));
		}
		if (jsonObject.containsKey("reminderQueryAnswer")) {
			model.setReminderQueryAnswer(jsonObject
					.getString("reminderQueryAnswer"));
		}
		if (jsonObject.containsKey("graceLoginCount")) {
			model.setGraceLoginCount(jsonObject.getInteger("graceLoginCount"));
		}
		if (jsonObject.containsKey("screenName")) {
			model.setScreenName(jsonObject.getString("screenName"));
		}
		if (jsonObject.containsKey("emailAddress")) {
			model.setEmailAddress(jsonObject.getString("emailAddress"));
		}
		if (jsonObject.containsKey("facebookId")) {
			model.setFacebookId(jsonObject.getLong("facebookId"));
		}
		if (jsonObject.containsKey("ldapServerId")) {
			model.setLdapServerId(jsonObject.getLong("ldapServerId"));
		}
		if (jsonObject.containsKey("openId")) {
			model.setOpenId(jsonObject.getString("openId"));
		}
		if (jsonObject.containsKey("portraitId")) {
			model.setPortraitId(jsonObject.getLong("portraitId"));
		}
		if (jsonObject.containsKey("languageId")) {
			model.setLanguageId(jsonObject.getString("languageId"));
		}
		if (jsonObject.containsKey("timeZoneId")) {
			model.setTimeZoneId(jsonObject.getString("timeZoneId"));
		}
		if (jsonObject.containsKey("greeting")) {
			model.setGreeting(jsonObject.getString("greeting"));
		}
		if (jsonObject.containsKey("comments")) {
			model.setComments(jsonObject.getString("comments"));
		}
		if (jsonObject.containsKey("firstName")) {
			model.setFirstName(jsonObject.getString("firstName"));
		}
		if (jsonObject.containsKey("middleName")) {
			model.setMiddleName(jsonObject.getString("middleName"));
		}
		if (jsonObject.containsKey("lastName")) {
			model.setLastName(jsonObject.getString("lastName"));
		}
		if (jsonObject.containsKey("jobTitle")) {
			model.setJobTitle(jsonObject.getString("jobTitle"));
		}
		if (jsonObject.containsKey("loginDate")) {
			model.setLoginDate(jsonObject.getDate("loginDate"));
		}
		if (jsonObject.containsKey("loginIP")) {
			model.setLoginIP(jsonObject.getString("loginIP"));
		}
		if (jsonObject.containsKey("lastLoginDate")) {
			model.setLastLoginDate(jsonObject.getDate("lastLoginDate"));
		}
		if (jsonObject.containsKey("lastLoginIP")) {
			model.setLastLoginIP(jsonObject.getString("lastLoginIP"));
		}
		if (jsonObject.containsKey("lastFailedLoginDate")) {
			model.setLastFailedLoginDate(jsonObject
					.getDate("lastFailedLoginDate"));
		}
		if (jsonObject.containsKey("failedLoginAttempts")) {
			model.setFailedLoginAttempts(jsonObject
					.getInteger("failedLoginAttempts"));
		}
		if (jsonObject.containsKey("lockout")) {
			model.setLockout(jsonObject.getString("lockout"));
		}
		if (jsonObject.containsKey("lockoutDate")) {
			model.setLockoutDate(jsonObject.getDate("lockoutDate"));
		}
		if (jsonObject.containsKey("agreedToTermsOfUse")) {
			model.setAgreedToTermsOfUse(jsonObject
					.getString("agreedToTermsOfUse"));
		}
		if (jsonObject.containsKey("emailAddressVerified")) {
			model.setEmailAddressVerified(jsonObject
					.getString("emailAddressVerified"));
		}
		if (jsonObject.containsKey("status")) {
			model.setStatus(jsonObject.getInteger("status"));
		}

		return model;
	}

	public static JSONArray listToArray(java.util.List<User> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (User model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static JSONObject toJsonObject(User model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getUserId());
		jsonObject.put("_id_", model.getUserId());
		jsonObject.put("_oid_", model.getUserId());
		if (model.getUuid() != null) {
			jsonObject.put("uuid", model.getUuid());
		}
		jsonObject.put("userId", model.getUserId());
		jsonObject.put("companyId", model.getCompanyId());
		if (model.getCreateDate() != null) {
			jsonObject.put("createDate",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(model.getCreateDate()));
		}
		if (model.getModifiedDate() != null) {
			jsonObject.put("modifiedDate",
					DateUtils.getDate(model.getModifiedDate()));
			jsonObject.put("modifiedDate_date",
					DateUtils.getDate(model.getModifiedDate()));
			jsonObject.put("modifiedDate_datetime",
					DateUtils.getDateTime(model.getModifiedDate()));
		}
		if (model.getDefaultUser() != null) {
			jsonObject.put("defaultUser", model.getDefaultUser());
		}
		jsonObject.put("contactId", model.getContactId());
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		if (model.getPasswordEncrypted() != null) {
			jsonObject.put("passwordEncrypted", model.getPasswordEncrypted());
		}
		if (model.getPasswordReset() != null) {
			jsonObject.put("passwordReset", model.getPasswordReset());
		}
		if (model.getPasswordModifiedDate() != null) {
			jsonObject.put("passwordModifiedDate",
					DateUtils.getDate(model.getPasswordModifiedDate()));
			jsonObject.put("passwordModifiedDate_date",
					DateUtils.getDate(model.getPasswordModifiedDate()));
			jsonObject.put("passwordModifiedDate_datetime",
					DateUtils.getDateTime(model.getPasswordModifiedDate()));
		}
		if (model.getDigest() != null) {
			jsonObject.put("digest", model.getDigest());
		}
		if (model.getReminderQueryQuestion() != null) {
			jsonObject.put("reminderQueryQuestion",
					model.getReminderQueryQuestion());
		}
		if (model.getReminderQueryAnswer() != null) {
			jsonObject.put("reminderQueryAnswer",
					model.getReminderQueryAnswer());
		}
		jsonObject.put("graceLoginCount", model.getGraceLoginCount());
		if (model.getScreenName() != null) {
			jsonObject.put("screenName", model.getScreenName());
		}
		if (model.getEmailAddress() != null) {
			jsonObject.put("emailAddress", model.getEmailAddress());
		}
		jsonObject.put("facebookId", model.getFacebookId());
		jsonObject.put("ldapServerId", model.getLdapServerId());
		if (model.getOpenId() != null) {
			jsonObject.put("openId", model.getOpenId());
		}
		jsonObject.put("portraitId", model.getPortraitId());
		if (model.getLanguageId() != null) {
			jsonObject.put("languageId", model.getLanguageId());
		}
		if (model.getTimeZoneId() != null) {
			jsonObject.put("timeZoneId", model.getTimeZoneId());
		}
		if (model.getGreeting() != null) {
			jsonObject.put("greeting", model.getGreeting());
		}
		if (model.getComments() != null) {
			jsonObject.put("comments", model.getComments());
		}
		if (model.getFirstName() != null) {
			jsonObject.put("firstName", model.getFirstName());
		}
		if (model.getMiddleName() != null) {
			jsonObject.put("middleName", model.getMiddleName());
		}
		if (model.getLastName() != null) {
			jsonObject.put("lastName", model.getLastName());
		}
		if (model.getJobTitle() != null) {
			jsonObject.put("jobTitle", model.getJobTitle());
		}
		if (model.getLoginDate() != null) {
			jsonObject
					.put("loginDate", DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_date",
					DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_datetime",
					DateUtils.getDateTime(model.getLoginDate()));
		}
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}
		if (model.getLastLoginDate() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_date",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_datetime",
					DateUtils.getDateTime(model.getLastLoginDate()));
		}
		if (model.getLastLoginIP() != null) {
			jsonObject.put("lastLoginIP", model.getLastLoginIP());
		}
		if (model.getLastFailedLoginDate() != null) {
			jsonObject.put("lastFailedLoginDate",
					DateUtils.getDate(model.getLastFailedLoginDate()));
			jsonObject.put("lastFailedLoginDate_date",
					DateUtils.getDate(model.getLastFailedLoginDate()));
			jsonObject.put("lastFailedLoginDate_datetime",
					DateUtils.getDateTime(model.getLastFailedLoginDate()));
		}
		jsonObject.put("failedLoginAttempts", model.getFailedLoginAttempts());
		if (model.getLockout() != null) {
			jsonObject.put("lockout", model.getLockout());
		}
		if (model.getLockoutDate() != null) {
			jsonObject.put("lockoutDate",
					DateUtils.getDate(model.getLockoutDate()));
			jsonObject.put("lockoutDate_date",
					DateUtils.getDate(model.getLockoutDate()));
			jsonObject.put("lockoutDate_datetime",
					DateUtils.getDateTime(model.getLockoutDate()));
		}
		if (model.getAgreedToTermsOfUse() != null) {
			jsonObject.put("agreedToTermsOfUse", model.getAgreedToTermsOfUse());
		}
		if (model.getEmailAddressVerified() != null) {
			jsonObject.put("emailAddressVerified",
					model.getEmailAddressVerified());
		}
		jsonObject.put("status", model.getStatus());
		return jsonObject;
	}

	public static ObjectNode toObjectNode(User model) {
		ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getUserId());
		jsonObject.put("_id_", model.getUserId());
		jsonObject.put("_oid_", model.getUserId());
		if (model.getUuid() != null) {
			jsonObject.put("uuid", model.getUuid());
		}
		jsonObject.put("userId", model.getUserId());
		jsonObject.put("companyId", model.getCompanyId());
		if (model.getCreateDate() != null) {
			jsonObject.put("createDate",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_date",
					DateUtils.getDate(model.getCreateDate()));
			jsonObject.put("createDate_datetime",
					DateUtils.getDateTime(model.getCreateDate()));
		}
		if (model.getModifiedDate() != null) {
			jsonObject.put("modifiedDate",
					DateUtils.getDate(model.getModifiedDate()));
			jsonObject.put("modifiedDate_date",
					DateUtils.getDate(model.getModifiedDate()));
			jsonObject.put("modifiedDate_datetime",
					DateUtils.getDateTime(model.getModifiedDate()));
		}
		if (model.getDefaultUser() != null) {
			jsonObject.put("defaultUser", model.getDefaultUser());
		}
		jsonObject.put("contactId", model.getContactId());
		if (model.getPassword() != null) {
			jsonObject.put("password", model.getPassword());
		}
		if (model.getPasswordEncrypted() != null) {
			jsonObject.put("passwordEncrypted", model.getPasswordEncrypted());
		}
		if (model.getPasswordReset() != null) {
			jsonObject.put("passwordReset", model.getPasswordReset());
		}
		if (model.getPasswordModifiedDate() != null) {
			jsonObject.put("passwordModifiedDate",
					DateUtils.getDate(model.getPasswordModifiedDate()));
			jsonObject.put("passwordModifiedDate_date",
					DateUtils.getDate(model.getPasswordModifiedDate()));
			jsonObject.put("passwordModifiedDate_datetime",
					DateUtils.getDateTime(model.getPasswordModifiedDate()));
		}
		if (model.getDigest() != null) {
			jsonObject.put("digest", model.getDigest());
		}
		if (model.getReminderQueryQuestion() != null) {
			jsonObject.put("reminderQueryQuestion",
					model.getReminderQueryQuestion());
		}
		if (model.getReminderQueryAnswer() != null) {
			jsonObject.put("reminderQueryAnswer",
					model.getReminderQueryAnswer());
		}
		jsonObject.put("graceLoginCount", model.getGraceLoginCount());
		if (model.getScreenName() != null) {
			jsonObject.put("screenName", model.getScreenName());
		}
		if (model.getEmailAddress() != null) {
			jsonObject.put("emailAddress", model.getEmailAddress());
		}
		jsonObject.put("facebookId", model.getFacebookId());
		jsonObject.put("ldapServerId", model.getLdapServerId());
		if (model.getOpenId() != null) {
			jsonObject.put("openId", model.getOpenId());
		}
		jsonObject.put("portraitId", model.getPortraitId());
		if (model.getLanguageId() != null) {
			jsonObject.put("languageId", model.getLanguageId());
		}
		if (model.getTimeZoneId() != null) {
			jsonObject.put("timeZoneId", model.getTimeZoneId());
		}
		if (model.getGreeting() != null) {
			jsonObject.put("greeting", model.getGreeting());
		}
		if (model.getComments() != null) {
			jsonObject.put("comments", model.getComments());
		}
		if (model.getFirstName() != null) {
			jsonObject.put("firstName", model.getFirstName());
		}
		if (model.getMiddleName() != null) {
			jsonObject.put("middleName", model.getMiddleName());
		}
		if (model.getLastName() != null) {
			jsonObject.put("lastName", model.getLastName());
		}
		if (model.getJobTitle() != null) {
			jsonObject.put("jobTitle", model.getJobTitle());
		}
		if (model.getLoginDate() != null) {
			jsonObject
					.put("loginDate", DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_date",
					DateUtils.getDate(model.getLoginDate()));
			jsonObject.put("loginDate_datetime",
					DateUtils.getDateTime(model.getLoginDate()));
		}
		if (model.getLoginIP() != null) {
			jsonObject.put("loginIP", model.getLoginIP());
		}
		if (model.getLastLoginDate() != null) {
			jsonObject.put("lastLoginDate",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_date",
					DateUtils.getDate(model.getLastLoginDate()));
			jsonObject.put("lastLoginDate_datetime",
					DateUtils.getDateTime(model.getLastLoginDate()));
		}
		if (model.getLastLoginIP() != null) {
			jsonObject.put("lastLoginIP", model.getLastLoginIP());
		}
		if (model.getLastFailedLoginDate() != null) {
			jsonObject.put("lastFailedLoginDate",
					DateUtils.getDate(model.getLastFailedLoginDate()));
			jsonObject.put("lastFailedLoginDate_date",
					DateUtils.getDate(model.getLastFailedLoginDate()));
			jsonObject.put("lastFailedLoginDate_datetime",
					DateUtils.getDateTime(model.getLastFailedLoginDate()));
		}
		jsonObject.put("failedLoginAttempts", model.getFailedLoginAttempts());
		if (model.getLockout() != null) {
			jsonObject.put("lockout", model.getLockout());
		}
		if (model.getLockoutDate() != null) {
			jsonObject.put("lockoutDate",
					DateUtils.getDate(model.getLockoutDate()));
			jsonObject.put("lockoutDate_date",
					DateUtils.getDate(model.getLockoutDate()));
			jsonObject.put("lockoutDate_datetime",
					DateUtils.getDateTime(model.getLockoutDate()));
		}
		if (model.getAgreedToTermsOfUse() != null) {
			jsonObject.put("agreedToTermsOfUse", model.getAgreedToTermsOfUse());
		}
		if (model.getEmailAddressVerified() != null) {
			jsonObject.put("emailAddressVerified",
					model.getEmailAddressVerified());
		}
		jsonObject.put("status", model.getStatus());
		return jsonObject;
	}

	private UserJsonFactory() {

	}

}
