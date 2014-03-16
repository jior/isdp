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
package com.glaf.auth.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;

import com.glaf.auth.Constants;
import com.glaf.base.modules.sys.service.AuthorizeService;
import com.glaf.base.online.service.UserOnlineService;
import com.glaf.core.cache.CacheFactory;
import com.glaf.core.context.ContextFactory;
import com.glaf.core.identity.User;

public class LogoutController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	// services
	protected AuthorizeService authorizeService;

	protected UserOnlineService userOnlineService;

	@Listen("onClick=#logout")
	public void doLogout() {
		Session session = Sessions.getCurrent();
		User user = (User) session.getAttribute(Constants.LOGIN_USER);
		if (user != null) {
			session.removeAttribute(Constants.LOGIN_USER);
			logger.debug(user.getActorId() + " will logout.");
			String actorId = user.getActorId();
			try {
				getUserOnlineService().logout(actorId);
				String cacheKey = com.glaf.core.util.Constants.LOGIN_USER_CACHE
						+ actorId;
				CacheFactory.remove(cacheKey);
				cacheKey = com.glaf.core.util.Constants.USER_CACHE + actorId;
				CacheFactory.remove(cacheKey);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		try {
			Executions.getCurrent().sendRedirect("/");
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				com.glaf.security.shiro.ShiroSecurity.logout();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public AuthorizeService getAuthorizeService() {
		if (authorizeService == null) {
			authorizeService = ContextFactory.getBean("authorizeService");
		}
		return authorizeService;
	}

	public UserOnlineService getUserOnlineService() {
		if (userOnlineService == null) {
			userOnlineService = ContextFactory.getBean("userOnlineService");
		}
		return userOnlineService;
	}

	public void setUserOnlineService(UserOnlineService userOnlineService) {
		this.userOnlineService = userOnlineService;
	}
}
