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

package com.glaf.base.modules.workspace.springmvc;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.workspace.form.MyMenuFormBean;
import com.glaf.base.modules.workspace.model.MyMenu;
import com.glaf.base.modules.workspace.service.MyMenuService;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.RequestUtils;

import com.glaf.core.util.StringTools;
import com.glaf.base.utils.ParamUtil;
import com.glaf.base.utils.RequestUtil;

@Controller
@RequestMapping("/workspace/mymenu")
public class MyMenuController {
	protected static final Log logger = LogFactory
			.getLog(MyMenuController.class);

	private MyMenuService myMenuService;

	/**
	 * ����ɾ����Ϣ
	 * 
	 * @return
	 */
	@RequestMapping("/batchDelete")
	public ModelAndView batchDelete(ModelMap modelMap,
			HttpServletRequest request) {
		boolean ret = true;
		// if (isTokenValid(request)) {// ��ֹ�����ظ��ύ
		int[] id = ParamUtil.getIntParameterValues(request, "id");
		if (id != null) {
			for (int i = 0; i < id.length; i++) {
				if (!myMenuService.delete((long) id[i])) {
					ret = false;
				}
			}
		}
		// }
		// saveToken(request);

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.delete_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);
		// ��ʾ�ύ��ҳ��
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * ��ʾ����ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/prepareAdd")
	public ModelAndView prepareAdd(ModelMap modelMap, HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("mymenu.prepareAdd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/modules/workspace/mymenu/mymenu_add",
				modelMap);
	}

	/**
	 * ��ʾ�����ҵĲ˵�ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/prepareAddMyMenu")
	public ModelAndView prepareAddMyMenu(ModelMap modelMap,
			HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("mymenu.prepareAddMyMenu");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/workspace/mymenu/mymenu_addmymenu",
				modelMap);
	}

	/**
	 * ��ʾ�޸�ҳ��
	 * 
	 * @return
	 */
	@RequestMapping("/prepareModify")
	public ModelAndView prepareModify(ModelMap modelMap,
			HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		long id = ParamUtil.getLongParameter(request, "id", 0);
		MyMenu bean = myMenuService.find(id);
		request.setAttribute("bean", bean);

		String x_view = ViewProperties.getString("mymenu.prepareModify");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�޸�ҳ��
		return new ModelAndView("/modules/workspace/mymenu/mymenu_modify",
				modelMap);
	}

	/**
	 * �ύ������Ϣ
	 * 
	 * @return
	 */
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(ModelMap modelMap, MyMenuFormBean formBean,
			HttpServletRequest request) {
		MyMenu bean = new MyMenu();

		SysUser user = RequestUtil.getLoginUser(request);
		String userId = user == null ? "x" : user.getActorId();

		String url = formBean.getUrl();
		try {
			url = URLDecoder.decode(url, "UTF-8");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// System.out.println(url);
		String contextPath = request.getContextPath();
		if (url != null && url.startsWith(contextPath)) {
			url = StringTools.replaceIgnoreCase(url, contextPath, "");
		}

		bean.setTitle(formBean.getTitle());
		bean.setUrl(url);
		bean.setUserId(userId);

		boolean ret = false;
		// if (isTokenValid(request)) {// ��ֹ�����ظ��ύ
		ret = myMenuService.create(bean);
		// }
		// saveToken(request);

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.add_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		// ��ʾ�ύ��ҳ��
		int showList = ParamUtil.getIntParameter(request, "showList", 0);
		if (showList == 1) {// ���ӵ��ҵĲ˵�

			int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
			int pageSize = ParamUtil.getIntParameter(request, "page_size",
					Constants.PAGE_SIZE);
			PageResult pager = myMenuService.getMyMenuList(userId, pageNo,
					pageSize);
			request.setAttribute("pager", pager);

			return new ModelAndView("/modules/workspace/mymenu/mymenu_list",
					modelMap);
		}
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �ύ�޸���Ϣ
	 * 
	 * @return
	 */
	@RequestMapping("/saveModify")
	public ModelAndView saveModify(ModelMap modelMap, MyMenuFormBean formBean,
			HttpServletRequest request) {
		MyMenu bean = myMenuService.find(formBean.getId());

		if (bean != null) {
			bean.setTitle(formBean.getTitle());
			bean.setUrl(formBean.getUrl());
		}

		boolean ret = false;
		// if (isTokenValid(request)) {// ��ֹ�����ظ��ύ
		ret = myMenuService.update(bean);
		// }
		// saveToken(request);

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.modify_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"myMenu.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		// ��ʾ�ύ��ҳ��
		return new ModelAndView("show_msg", modelMap);
	}

	@javax.annotation.Resource
	public void setMyMenuService(MyMenuService myMenuService) {
		this.myMenuService = myMenuService;
	}

	/**
	 * ��ʾ�б�
	 * 
	 * @return
	 */
	@RequestMapping("/showList")
	public ModelAndView showList(ModelMap modelMap, HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser user = RequestUtil.getLoginUser(request);
		String userId = user == null ? "x" : user.getActorId();

		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = ParamUtil.getIntParameter(request, "page_size",
				Constants.PAGE_SIZE);
		PageResult pager = myMenuService
				.getMyMenuList(userId, pageNo, pageSize);
		request.setAttribute("pager", pager);

		String x_view = ViewProperties.getString("mymenu.showList");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/workspace/mymenu/mymenu_list",
				modelMap);
	}

}