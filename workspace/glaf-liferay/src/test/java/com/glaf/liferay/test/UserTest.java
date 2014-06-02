package com.glaf.liferay.test;

import java.util.*;

import org.junit.Test;

import com.glaf.liferay.domain.User;
import com.glaf.liferay.query.UserQuery;
import com.glaf.liferay.service.UserService;
import com.glaf.test.AbstractTest;

/**
 * 
 *  
 *
 */
public class UserTest extends AbstractTest {

	protected UserService userService;

	public UserTest() {
		userService = getBean("userService");
	}

	public void insertUser() {
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setUuid("uuid");
			user.setUserId(100L);
			user.setCompanyId(100L);
			user.setCreateDate(new Date());
			user.setModifiedDate(new Date());
			user.setDefaultUser("defaultUser");
			user.setContactId(100L);
			user.setPassword("password");
			user.setPasswordEncrypted("passwordEncrypted");
			user.setPasswordReset("passwordReset");
			user.setPasswordModifiedDate(new Date());
			user.setDigest("digest");
			user.setReminderQueryQuestion("reminderQueryQuestion");
			user.setReminderQueryAnswer("reminderQueryAnswer");
			user.setGraceLoginCount(1);
			user.setScreenName("screenName");
			user.setEmailAddress("emailAddress");
			user.setFacebookId(100L);
			user.setLdapServerId(100L);
			user.setOpenId("openId");
			user.setPortraitId(100L);
			user.setLanguageId("languageId");
			user.setTimeZoneId("timeZoneId");
			user.setGreeting("greeting");
			user.setComments("comments");
			user.setFirstName("firstName");
			user.setMiddleName("middleName");
			user.setLastName("lastName");
			user.setJobTitle("jobTitle");
			user.setLoginDate(new Date());
			user.setLoginIP("loginIP");
			user.setLastLoginDate(new Date());
			user.setLastLoginIP("lastLoginIP");
			user.setLastFailedLoginDate(new Date());
			user.setFailedLoginAttempts(1);
			user.setLockout("lockout");
			user.setLockoutDate(new Date());
			user.setAgreedToTermsOfUse("agreedToTermsOfUse");
			user.setEmailAddressVerified("emailAddressVerified");
			user.setStatus(1);

			userService.save(user);
		}
	}

	@Test
	public void list() {
		UserQuery userQuery = new UserQuery();

		logger.debug("---------------------total----------------------");
		int total = userService.getUserCountByQueryCriteria(userQuery);

		logger.debug("row count:" + total);

		logger.debug("----------------------list---------------------");

		if (total > 0) {
			List<User> list = userService.getUsersByQueryCriteria(0, 10,
					userQuery);
			logger.debug(list);
		}
	}

}
