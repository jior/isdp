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

package com.glaf.base.modules.sys.springmvc;

import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.listener.UserOnlineListener;
import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.service.AuthorizeService;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysTreeService;

import com.glaf.base.utils.ContextUtil;
import com.glaf.base.utils.ParamUtil;
import com.glaf.base.utils.RequestUtil;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.security.DigestUtil;
import com.glaf.core.util.ClassUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.web.callback.CallbackProperties;
import com.glaf.core.web.callback.LoginCallback;

@Controller("/authorize")
@RequestMapping("/authorize")
public class AuthorizeController {
	private static final Log logger = LogFactory
			.getLog(AuthorizeController.class);

	private SysApplicationService sysApplicationService;

	private AuthorizeService authorizeService;

	private SysTreeService sysTreeService;

	/**
	 * ��¼
	 * 
	 * 
	 * @param form
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		HttpSession session = request.getSession(true);
		ViewMessages messages = new ViewMessages();
		// ��ȡ����
		String account = ParamUtil.getParameter(request, "account");
		String password = ParamUtil.getParameter(request, "password");
		String pwd = password;
		try {
			pwd = DigestUtil.digestString(password, "MD5");
		} catch (Exception ex) {
		}

		logger.debug(account + " start login........................");

		// �û���½������ϵͳ�û�����
		SysUser bean = authorizeService.login(account, pwd);
		if (bean == null) {
			// �û�����Ϊ�ջ�ʧЧ����ʾ������Ϣ
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"authorize.login_failure"));
			MessageUtils.addMessages(request, messages);
			return new ModelAndView("/modules/login", modelMap);
		} else {
			String loginIp = UserOnlineListener.findUser(bean.getActorId());
			logger.info("login ip:" + loginIp);
			if (loginIp != null && !loginIp.equals(request.getRemoteAddr())) {// �û���������������½
				messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
						"authorize.login_failure2"));
				MessageUtils.addMessages(request, messages);
				return new ModelAndView("/modules/login", modelMap);
			}

			Properties props = CallbackProperties.getProperties();
			if (props != null && props.keys().hasMoreElements()) {
				Enumeration<?> e = props.keys();
				while (e.hasMoreElements()) {
					String className = (String) e.nextElement();
					try {
						Object obj = ClassUtils.instantiateObject(className);
						if (obj instanceof LoginCallback) {
							LoginCallback callback = (LoginCallback) obj;
							callback.afterLogin(bean.getAccount(), request,
									response);
						}
					} catch (Exception ex) {
						ex.printStackTrace();
						logger.error(ex);
					}
				}
			}

			// ��¼�ɹ����޸����һ�ε�¼ʱ��

			String menus = sysApplicationService.getMenu(3, bean);
			bean.setMenus(menus);

			ContextUtil.put(bean.getAccount(), bean);// ����ȫ�ֱ���

			if (session != null) {
				RequestUtils.setLoginUser(request, response, "GLAF",
						bean.getAccount());
			}

			request.setAttribute(SysConstants.MENU, menus);

			if (bean.getAccountType() == 1) {// ��Ӧ���û�
				return new ModelAndView("/modules/spframe", modelMap);
			} else {
				return new ModelAndView("/modules/frame", modelMap);
			}
		}
	}

	/**
	 * �ǳ�
	 * 
	 * 
	 * @param form
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		// �ǳ�ϵͳ�����session����
		request.getSession().removeAttribute(SysConstants.LOGIN);
		request.getSession().removeAttribute(SysConstants.MENU);
		return new ModelAndView("/modules/login", modelMap);
	}

	/**
	 * ׼����¼
	 * 
	 * 
	 * @param form
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareLogin")
	public ModelAndView prepareLogin(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		// ��ʾ��½ҳ��
		return new ModelAndView("/modules/login", modelMap);
	}

	@javax.annotation.Resource
	public void setAuthorizeService(AuthorizeService authorizeService) {
		this.authorizeService = authorizeService;

	}

	@javax.annotation.Resource
	public void setSysApplicationService(
			SysApplicationService sysApplicationService) {
		this.sysApplicationService = sysApplicationService;

	}

	@javax.annotation.Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;

	}

	/**
	 * ��ʾ�˵�
	 * 
	 * 
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showMenu")
	public ModelAndView showMenu(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser user = RequestUtil.getLoginUser(request);
		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_APP);
		List<SysApplication> list = sysApplicationService.getAccessAppList(
				parent.getId(), user);
		request.setAttribute("list", list);
		return new ModelAndView("/modules/menu", modelMap);
	}

	/**
	 * ��ʾ�Ӳ˵�
	 * 
	 * 
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showSubMenu")
	public ModelAndView showSubMenu(HttpServletRequest request,
			ModelMap modelMap) {
		SysUser user = RequestUtil.getLoginUser(request);
		long parent = ParamUtil.getIntParameter(request, "parent", 0);
		List<SysApplication> list = sysApplicationService.getAccessAppList(
				parent, user);
		request.setAttribute("list", list);
		return new ModelAndView("/modules/sub_menu", modelMap);
	}
}