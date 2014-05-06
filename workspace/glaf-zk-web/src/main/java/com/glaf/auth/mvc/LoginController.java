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

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Session;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

import com.glaf.auth.Constants;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.service.AuthorizeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.online.domain.UserOnline;
import com.glaf.base.online.service.UserOnlineService;
import com.glaf.base.utils.ContextUtil;
import com.glaf.core.context.ContextFactory;
import com.glaf.core.util.RequestUtils;
import com.glaf.security.shiro.ShiroSecurity;

public class LoginController extends SelectorComposer<Component> {
	private static final long serialVersionUID = 1L;
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected AuthorizeService authorizeService;

	protected SysUserService sysUserService;

	protected UserOnlineService userOnlineService;

	// wire components
	@Wire
	protected Textbox account;
	@Wire
	protected Textbox password;
	@Wire
	protected Label message;

	@Listen("onClick=#login; onOK=#loginWin")
	public void doLogin() {
		String actorId = account.getValue();
		String pd = password.getValue();

		if (getAuthorizeService().login(actorId, pd) == null) {
			message.setValue("用户名或密码不正确！");
			return;
		}

		Map<String, String[]> params = Executions.getCurrent()
				.getParameterMap();
		Set<Entry<String, String[]>> entrySet = params.entrySet();
		for (Entry<String, String[]> entry : entrySet) {
			String key = entry.getKey();
			String[] value = entry.getValue();
			logger.debug(key + "=" + value[0]);
		}

		SysUser user = getAuthorizeService().login(actorId);

 
		user.setLastLoginDate(new Date());
		user.setLastLoginIP(Executions.getCurrent().getRemoteAddr());
		getSysUserService().updateUser(user);

		ContextUtil.put(user.getAccount(), user); 
		HttpServletRequest request = (HttpServletRequest) Executions
				.getCurrent().getNativeRequest();
		HttpServletResponse response = (HttpServletResponse) Executions
				.getCurrent().getNativeResponse();
		RequestUtils.setLoginUser(request, response, "default", actorId);

		try {
			ShiroSecurity.login(actorId, "pwd");
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

		try {
			UserOnline online = new UserOnline();
			online.setActorId(user.getActorId());
			online.setName(user.getName());
			online.setCheckDate(new Date());
			online.setLoginDate(new Date());
			online.setLoginIP(user.getLastLoginIP());

			getUserOnlineService().login(online);
		} catch (Throwable ex) {
			ex.printStackTrace();
		}

		Session session = Sessions.getCurrent();
		session.setAttribute(Constants.LOGIN_USER, user);

		message.setValue("Welcome, " + user.getName());
		message.setSclass("");
		logger.debug(user.getActorId() + " have login.");
		Executions.sendRedirect("/");
	}

	public AuthorizeService getAuthorizeService() {
		if (authorizeService == null) {
			authorizeService = ContextFactory.getBean("authorizeService");
		}
		return authorizeService;
	}

	public SysUserService getSysUserService() {
		if (sysUserService == null) {
			sysUserService = ContextFactory.getBean("sysUserService");
		}
		return sysUserService;
	}

	public UserOnlineService getUserOnlineService() {
		if (userOnlineService == null) {
			userOnlineService = ContextFactory.getBean("userOnlineService");
		}
		return userOnlineService;
	}

	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;
	}

	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	public void setUserOnlineService(UserOnlineService userOnlineService) {
		this.userOnlineService = userOnlineService;
	}
}
