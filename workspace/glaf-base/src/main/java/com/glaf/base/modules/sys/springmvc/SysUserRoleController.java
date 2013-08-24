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

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.service.SysUserRoleService;
import com.glaf.base.modules.sys.service.SysUserService;

import com.glaf.base.utils.ParamUtil;
import com.glaf.base.utils.RequestUtil;
import com.glaf.base.utils.WebUtil;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.util.DateUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;

@Controller("/sys/sysUserRole")
@RequestMapping("/sys/sysUserRole")
public class SysUserRoleController {
	private static final Log logger = LogFactory
			.getLog(SysUserRoleController.class);

	private SysUserRoleService sysUserRoleService;

	private SysUserService sysUserService;

	@ResponseBody
	@RequestMapping("/addRole")
	public byte[] addRole(HttpServletRequest request) {
		logger.debug("---------------------addRole--------------------");
		logger.debug(RequestUtils.getParameterMap(request));
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserId = RequestUtils.getString(request, "toUserId");
		fromUserId = RequestUtils.decodeString(fromUserId);
		toUserId = RequestUtils.decodeString(toUserId);
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		int mark = RequestUtils.getInt(request, "mark");
		String processNames = request.getParameter("processNames");
		String processDescriptions = request
				.getParameter("processDescriptions");
		logger.debug("fromUserId:"+fromUserId);
		logger.debug("toUserId:"+toUserId);
		if (!sysUserRoleService.isAuthorized(fromUserId, toUserId)) {// ����Ȩ
			sysUserRoleService.addRole(fromUserId, toUserId, startDate,
					endDate, mark, processNames, processDescriptions);
			return ResponseUtils.responseJsonResult(true);
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@ResponseBody
	@RequestMapping("/addRoleUser")
	public byte[] addRoleUser(HttpServletRequest request) {
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserIds = request.getParameter("toUserIds");
		fromUserId = RequestUtils.decodeString(fromUserId);
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		int mark = RequestUtils.getInt(request, "mark");
		String processNames = request.getParameter("processNames");
		String processDescriptions = request
				.getParameter("processDescriptions");
		String[] ids = toUserIds.split(",");
		for (int i = 0; i < ids.length; i++) {
			String toUserId = ids[i];
			toUserId = RequestUtils.decodeString(toUserId);
			if (!sysUserRoleService.isAuthorized(fromUserId, toUserId)) {// ����Ȩ
				sysUserRoleService.addRole(fromUserId, toUserId, startDate,
						endDate, mark, processNames, processDescriptions);
			}
		}
		return ResponseUtils.responseJsonResult(true);
	}

	@ResponseBody
	@RequestMapping("/removeRole")
	public byte[] removeRole(
			@RequestParam(value = "fromUserId") String fromUserId,
			@RequestParam(value = "toUserId") String toUserId) {
		fromUserId = RequestUtils.decodeString(fromUserId);
		toUserId = RequestUtils.decodeString(toUserId);
		sysUserRoleService.removeRole(fromUserId, toUserId);
		return ResponseUtils.responseJsonResult(true);
	}

	@ResponseBody
	@RequestMapping("/removeRoleUser")
	public byte[] removeRoleUser(
			@RequestParam(value = "fromUserId") String fromUserId,
			@RequestParam(value = "toUserIds") String toUserIds) {
		fromUserId = RequestUtils.decodeString(fromUserId);
		logger.info("toUserIds:" + toUserIds);
		String[] ids = toUserIds.split(",");
		for (int i = 0; i < ids.length; i++) {
			String toUserId = ids[i];
			toUserId = RequestUtils.decodeString(toUserId);
			removeRole(fromUserId, toUserId);
		}
		return ResponseUtils.responseJsonResult(true);
	}

	/**
	 * �����û���Ȩ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	@RequestMapping("/saveUserSysAuth")
	public ModelAndView saveUserSysAuth(HttpServletRequest request,
			ModelMap modelMap) {
		String fromUserId = ParamUtil.getParameter(request, "uid");
		String[] userIds = ParamUtil.getParameterValues(request, "userIds");
		fromUserId = RequestUtils.decodeString(fromUserId);

		SysUser user = sysUserService.findById(fromUserId);
		SysUser rootUser = sysUserService.findByAccount("root");// ����Ա

		String msgStr = user.getName() + "[" + user.getAccount()
				+ "]����Ȩ�б�����:<br><br>";
		ViewMessages messages = new ViewMessages();
		if (fromUserId != null && userIds.length > 0) {
			// ȡ����Ȩ�б�
			List userList = sysUserRoleService.getAuthorizedUser(user);
			logger.info("userList.size()=>" + userList.size());

			for (int i = 0; i < userIds.length; i++) {
				String toUserId = RequestUtils.decodeString(userIds[i]);
				SysUser sysUser = sysUserService.findById(toUserId);

				String startDate = ParamUtil.getParameter(request, "startDate_"
						+ userIds[i], "");
				String endDate = ParamUtil.getParameter(request, "endDate_"
						+ userIds[i], "");

				if (!startDate.equals("") && !endDate.equals("")) {
					for (int j = 0; j < userList.size(); j++) {
						Object[] bean = (Object[]) userList.get(j);
						SysUser authorUser = (SysUser) bean[0];
						if (StringUtils.equals(authorUser.getActorId(),
								sysUser.getActorId())) {// ����Ȩ
							msgStr = msgStr + "&nbsp;&nbsp;&nbsp;&nbsp;�޸���Ȩ=>"
									+ sysUser.getName() + "["
									+ sysUser.getAccount() + "]&nbsp;&nbsp;"
									+ startDate + "��" + endDate + "<br>";
							logger.info(msgStr);
							userList.remove(j);

							continue;
						}
					}

					msgStr = msgStr + "&nbsp;&nbsp;&nbsp;&nbsp;������Ȩ=>"
							+ sysUser.getName() + "[" + sysUser.getAccount()
							+ "]&nbsp;&nbsp;" + startDate + "��" + endDate
							+ "<br>";
					logger.info(msgStr);
				} else {
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							sysUser.getName() + "[" + sysUser.getAccount()
									+ "]" + "sys.author_dateErr"));

					return new ModelAndView("show_msg", modelMap);
				}
			}

			for (int i = 0; i < userList.size(); i++) {
				Object[] bean = (Object[]) userList.get(i);
				SysUser authorUser = (SysUser) bean[0];
				Date aStartDate = (Date) bean[1];
				Date aEndDate = (Date) bean[2];
				msgStr = msgStr + "&nbsp;&nbsp;&nbsp;&nbsp;ȡ����Ȩ=>"
						+ authorUser.getName() + "[" + authorUser.getAccount()
						+ "]&nbsp;&nbsp;" + DateUtils.getDateTime(aStartDate)
						+ "��" + DateUtils.getDateTime(aEndDate) + "<br>";
				logger.info(msgStr);
			}
		} else {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"sys.author_msgErr"));

			return new ModelAndView("show_msg");
		}

		if (sendMail(user, rootUser, "��Ȩ��", msgStr)) {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"sys.author_success"));
		} else {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"sys.author_failure"));
		}

		MessageUtils.addMessages(request, messages);
		request.setAttribute("refresh", "false");
		// ��ʾ�б�ҳ��
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �����Ա������Ȩ����
	 * 
	 * @param fromUser
	 * @param toUser
	 * @param msgStr
	 * @return
	 */
	private boolean sendMail(SysUser fromUser, SysUser toUser, String title,
			String msgStr) {
		boolean rst = true;

		String subject = title;
		String context = msgStr;
		logger.info(fromUser.getEmail() + "--" + toUser.getEmail() + "--"
				+ subject + "--" + context);

		return rst;
	}

	@javax.annotation.Resource
	public void setSysUserRoleService(SysUserRoleService sysUserRoleService) {
		this.sysUserRoleService = sysUserRoleService;

	}

	@javax.annotation.Resource
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;

	}

	/**
	 * ��ʾ��Ȩҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showMain")
	public ModelAndView showMain(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser user = RequestUtil.getLoginUser(request);
		request.setAttribute("available",
				sysUserRoleService.getUnAuthorizedUser(user));
		request.setAttribute("unavailable",
				sysUserRoleService.getAuthorizedUser(user));

		String x_view = ViewProperties.getString("userRole.showMain");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/sys/userRole/authorize_list",
				modelMap);
	}

	/**
	 * ��ʾ��Ȩҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showSysAuth")
	public ModelAndView showSysAuth(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userId = ParamUtil.getParameter(request, "id");
		userId = RequestUtils.decodeString(userId);
		SysUser user = sysUserService.findById(userId);
		if (user == null) {
			user = RequestUtil.getLoginUser(request);
		}

		request.setAttribute("user", user);
		request.setAttribute("authorizedUser",
				sysUserRoleService.getAuthorizedUser(user));
		request.setAttribute("processList",
				sysUserRoleService.getProcessByUser(user));

		String x_view = ViewProperties.getString("userRole.showSysAuth");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/sys/userRole/authorize_panel",
				modelMap);
	}

	/**
	 * ��ʾ��Ȩҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showUsers")
	public ModelAndView showUsers(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, String> filter = WebUtil.getQueryMap(request);
		request.setAttribute("pager",
				sysUserRoleService.getAllAuthorizedUser(filter));

		String x_view = ViewProperties.getString("userRole.showUsers");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/sys/userRole/authorize_users",
				modelMap);
	}

	/**
	 * ��ʾ��Ȩҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showUserSysAuth")
	public ModelAndView showUserSysAuth(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userId = ParamUtil.getParameter(request, "id");
		userId = RequestUtils.decodeString(userId);
		SysUser user = sysUserService.findById(userId);
		if (user == null) {
			user = RequestUtil.getLoginUser(request);
		}

		request.setAttribute("user", user);
		request.setAttribute("authorizedUser",
				sysUserRoleService.getAuthorizedUser(user));

		String x_view = ViewProperties.getString("userRole.showUserSysAuth");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/sys/userRole/authorizeUser_panel",
				modelMap);
	}

}