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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.glaf.core.cache.CacheUtils;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.security.DigestUtil;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.util.JsonUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.Tools;

import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.Dictory;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysDeptRole;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.service.DictoryService;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysDeptRoleService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.utils.ParamUtil;
import com.glaf.base.utils.RequestUtil;

@Controller("/sys/user")
@RequestMapping("/sys/user")
public class SysUserController {
	private static final Log logger = LogFactory
			.getLog(SysUserController.class);

	protected DictoryService dictoryService;

	protected SysDepartmentService sysDepartmentService;

	protected SysDeptRoleService sysDeptRoleService;

	protected SysRoleService sysRoleService;

	protected SysTreeService sysTreeService;

	protected SysUserService sysUserService;

	protected ITableDataService tableDataService;

	/**
	 * ���ӽ�ɫ�û�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/addRoleUser")
	public ModelAndView addRoleUser(HttpServletRequest request,
			ModelMap modelMap) {
		logger.debug("---------addRoleUser---------------------------");
		RequestUtils.setRequestParameterToAttribute(request);
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		int roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		SysDeptRole deptRole = sysDeptRoleService.find(deptId, roleId);
		boolean success = false;
		if (deptRole == null) {
			deptRole = new SysDeptRole();
			deptRole.setDeptId(deptId);
			deptRole.setDept(sysDepartmentService.findById(deptId));
			deptRole.setRoleId(roleId);
			deptRole.setRole(sysRoleService.findById(roleId));
			sysDeptRoleService.create(deptRole);
		}
		if (deptRole != null) {
			Set<SysUser> users = deptRole.getUsers();

			String[] userIds = ParamUtil.getParameterValues(request, "id");
			for (int i = 0; i < userIds.length; i++) {
				SysUser user = sysUserService.findById(userIds[i]);
				if (user != null) {
					logger.info(user.getName());
					users.add(user);
				}
			}
			deptRole.setUsers(users);
			success = sysDeptRoleService.update(deptRole);
		}

		ViewMessages messages = new ViewMessages();
		if (success) {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * ����ɾ����Ϣ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/batchDelete")
	public ModelAndView batchDelete(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		boolean ret = true;
		long[] id = ParamUtil.getLongParameterValues(request, "id");
		ret = sysUserService.deleteAll(id);
		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg2", modelMap);
	}

	/**
	 * ɾ����ɫ�û�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/delRoleUser")
	public ModelAndView delRoleUser(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		int roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		SysDeptRole deptRole = sysDeptRoleService.find(deptId, roleId);
		boolean sucess = false;
		try {
			String[] userIds = ParamUtil.getParameterValues(request, "id");
			sysUserService.deleteRoleUsers(deptRole, userIds);
			sucess = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			sucess = false;
		}

		ViewMessages messages = new ViewMessages();
		if (sucess) {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);

		return new ModelAndView("show_msg2", modelMap);
	}

	@RequestMapping("/deptUsers")
	public ModelAndView deptUsers(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String x_query = request.getParameter("x_query");
		if (StringUtils.equals(x_query, "true")) {
			Map<String, Object> paramMap = RequestUtils
					.getParameterMap(request);
			String x_complex_query = JsonUtils.encode(paramMap);
			x_complex_query = RequestUtils.encodeString(x_complex_query);
			request.setAttribute("x_complex_query", x_complex_query);
		} else {
			request.setAttribute("x_complex_query", "");
		}

		String x_view = ViewProperties.getString("user.deptUsers");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/deptUsers", modelMap);
	}

	/**
	 * �õ����������в����б�
	 * 
	 * @param list
	 * @param parentId
	 */
	public void getAllSysDepartmentList(List<SysDepartment> list, int parentId) {
		List<SysDepartment> temp = new ArrayList<SysDepartment>();
		temp = this.sysDepartmentService.getSysDepartmentList(parentId);
		if (temp != null && temp.size() != 0) {
			for (int i = 0; i < temp.size(); i++) {
				SysDepartment element = (SysDepartment) temp.get(i);
				getAllSysDepartmentList(list, (int) element.getId());
			}
			list.addAll(temp);
		}
	}

	/**
	 * �õ���������������ɫ���� ���û�н�ɫ����õ���������������
	 * 
	 * @param set
	 * @param deptId
	 * @param code
	 */
	public void getRoleUser(Set<SysUser> set, long deptId, String code) {
		if (!"".equals(code)) {
			Set<SysUser> temp = sysDeptRoleService.findRoleUser(deptId, "R011");
			set.addAll(temp);
		} else {
			List<SysUser> list = sysUserService.getSysUserList((int) deptId);
			set.addAll(list);
		}
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request) throws IOException {
		Long deptId = ParamUtil.getLongParameter(request, "parent", 0);
		Long nodeId = RequestUtils.getLong(request, "nodeId");
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysUserQuery query = new SysUserQuery();
		Tools.populate(query, params);
		if (nodeId > 0) {
			SysDepartment dept = sysDepartmentService
					.getSysDepartmentByNodeId(nodeId);
			if (dept != null) {
				query.deptId(dept.getId());
			}
		} else if (deptId > 0) {
			query.deptId(deptId);
		}

		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "easyui";
		}
		int start = 0;
		int limit = 10;
		String orderName = null;
		String order = null;

		int pageNo = ParamUtils.getInt(params, "page");
		limit = ParamUtils.getInt(params, "rows");
		start = (pageNo - 1) * limit;
		orderName = ParamUtils.getString(params, "sortName");
		order = ParamUtils.getString(params, "sortOrder");

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = PageResult.DEFAULT_PAGE_SIZE;
		}

		JSONObject result = new JSONObject();
		int total = sysUserService.getSysUserCountByQueryCriteria(query);
		if (total > 0) {
			result.put("total", total);
			result.put("totalCount", total);
			result.put("totalRecords", total);
			result.put("start", start);
			result.put("startIndex", start);
			result.put("limit", limit);
			result.put("pageSize", limit);

			if (StringUtils.isNotEmpty(orderName)) {
				query.setSortOrder(orderName);
				if (StringUtils.equals(order, "desc")) {
					query.setSortOrder(" desc ");
				}
			}

			List<SysUser> list = sysUserService.getSysUsersByQueryCriteria(
					start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysUser sysUser : list) {
					JSONObject rowJSON = sysUser.toJsonObject();
					rowJSON.put("id", sysUser.getId());
					rowJSON.put("actorId", sysUser.getAccount());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		} else {
			result.put("total", total);
			result.put("totalCount", total);
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
		}
		return result.toString().getBytes("UTF-8");
	}

	@RequestMapping
	public ModelAndView list(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String x_query = request.getParameter("x_query");
		if (StringUtils.equals(x_query, "true")) {
			Map<String, Object> paramMap = RequestUtils
					.getParameterMap(request);
			String x_complex_query = JsonUtils.encode(paramMap);
			x_complex_query = RequestUtils.encodeString(x_complex_query);
			request.setAttribute("x_complex_query", x_complex_query);
		} else {
			request.setAttribute("x_complex_query", "");
		}

		String x_view = ViewProperties.getString("user.list");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/list", modelMap);
	}

	/**
	 * ��ʾ����ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareAdd")
	public ModelAndView prepareAdd(HttpServletRequest request, ModelMap modelMap) {

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.USER_HEADSHIP);
		modelMap.put("dictories", dictories);

		String x_view = ViewProperties.getString("user.prepareAdd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_add", modelMap);
	}

	/**
	 * ��ʾ�޸�ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareModify")
	public ModelAndView prepareModify(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String id = ParamUtil.getParameter(request, "id");
		id = RequestUtils.decodeString(id);
		SysUser bean = sysUserService.findById(id);
		request.setAttribute("bean", bean);

		if (bean != null && StringUtils.isNotEmpty(bean.getSuperiorIds())) {
			List<String> userIds = StringTools.split(bean.getSuperiorIds());
			StringBuffer buffer = new StringBuffer();
			if (userIds != null && !userIds.isEmpty()) {
				for (String userId : userIds) {
					SysUser u = sysUserService.findByAccount(userId);
					if (u != null) {
						buffer.append(u.getName()).append("[")
								.append(u.getAccount()).append("] ");
					}
				}
				request.setAttribute("x_users_name", buffer.toString());
			}
		}

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.USER_HEADSHIP);
		modelMap.put("dictories", dictories);

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		List<SysTree> list = new ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.getSysTree(list, (int) parent.getId(), 1);
		request.setAttribute("parent", list);

		String x_view = ViewProperties.getString("user.prepareModify");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_modify", modelMap);
	}

	/**
	 * ��ʾ�޸�ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareModifyInfo")
	public ModelAndView prepareModifyInfo(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser user = RequestUtil.getLoginUser(request);
		SysUser bean = sysUserService.findByAccount(user.getAccount());
		request.setAttribute("bean", bean);

		if (bean != null && StringUtils.isNotEmpty(bean.getSuperiorIds())) {
			List<String> userIds = StringTools.split(bean.getSuperiorIds());
			StringBuffer buffer = new StringBuffer();
			if (userIds != null && !userIds.isEmpty()) {
				for (String userId : userIds) {
					SysUser u = sysUserService.findByAccount(userId);
					if (u != null) {
						buffer.append(u.getName()).append("[")
								.append(u.getAccount()).append("] ");
					}
				}
				request.setAttribute("x_users_name", buffer.toString());
			}
		}

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.USER_HEADSHIP);
		modelMap.put("dictories", dictories);

		String x_view = ViewProperties.getString("user.prepareModifyInfo");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_change_info", modelMap);
	}

	/**
	 * ��ʾ�޸�ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareModifyPwd")
	public ModelAndView prepareModifyPwd(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser bean = RequestUtil.getLoginUser(request);
		request.setAttribute("bean", bean);

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		List<SysTree> list = new ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.getSysTree(list, (int) parent.getId(), 1);
		request.setAttribute("parent", list);

		String x_view = ViewProperties.getString("user.prepareModifyPwd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_modify_pwd", modelMap);
	}

	/**
	 * ��ʾ��������ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareResetPwd")
	public ModelAndView prepareResetPwd(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String id = ParamUtil.getParameter(request, "id");
		id = RequestUtils.decodeString(id);
		SysUser bean = sysUserService.findById(id);
		request.setAttribute("bean", bean);

		String x_view = ViewProperties.getString("user.prepareResetPwd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_reset_pwd", modelMap);
	}

	/**
	 * �����û�����
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/resetPwd")
	public ModelAndView resetPwd(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser login = RequestUtil.getLoginUser(request);
		boolean ret = false;

		if (login.isSystemAdmin()) {
			logger.debug(login.getAccount() + " is system admin");
		}

		if (login.isDepartmentAdmin()) {
			logger.debug(login.getAccount() + " is dept admin");
		}

		if (login.isDepartmentAdmin() || login.isSystemAdmin()) {

			String id = ParamUtil.getParameter(request, "id");
			SysUser bean = sysUserService.findById(id);

			/**
			 * ϵͳ����Ա�����벻��������
			 */
			if (bean != null && !bean.isSystemAdministrator()) {
				String newPwd = ParamUtil.getParameter(request, "newPwd");
				if (bean != null && StringUtils.isNotEmpty(newPwd)) {
					try {
						bean.setPassword(DigestUtil.digestString(newPwd, "MD5"));
					} catch (Exception ex) {
						ex.printStackTrace();
					}
					bean.setUpdateBy(bean.getAccount());
					ret = sysUserService.update(bean);
				}
			}
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �ύ������Ϣ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(HttpServletRequest request, ModelMap modelMap) {
		SysUser bean = new SysUser();
		long nodeId = RequestUtils.getLong(request, "nodeId");
		if (nodeId > 0) {
			SysDepartment department = sysDepartmentService
					.getSysDepartmentByNodeId(nodeId);
			bean.setDepartment(department);
			bean.setDeptId(department.getId());
		} else {
			SysDepartment department = sysDepartmentService.findById(ParamUtil
					.getIntParameter(request, "parent", 0));
			bean.setDepartment(department);
			bean.setDeptId(department.getId());
		}

		bean.setAccount(ParamUtil.getParameter(request, "id"));
		bean.setName(ParamUtil.getParameter(request, "name"));
		String password = ParamUtil.getParameter(request, "password");
		try {
			String pwd = DigestUtil.digestString(password, "MD5");
			bean.setPassword(pwd);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		bean.setSuperiorIds(ParamUtil.getParameter(request, "superiorIds"));
		bean.setGender(ParamUtil.getIntParameter(request, "gender", 0));
		bean.setMobile(ParamUtil.getParameter(request, "mobile"));
		bean.setEmail(ParamUtil.getParameter(request, "email"));
		bean.setTelephone(ParamUtil.getParameter(request, "telephone"));
		bean.setStatus(ParamUtil.getParameter(request, "status"));
		bean.setHeadship(ParamUtil.getParameter(request, "headship"));
		bean.setUserType(ParamUtil.getIntParameter(request, "userType", 0));
		bean.setEvection(0);
		bean.setCreateTime(new Date());
		bean.setLastLoginTime(new Date());
		bean.setCreateBy(RequestUtils.getActorId(request));
		bean.setUpdateBy(RequestUtils.getActorId(request));

		int ret = 0;
		if (sysUserService.findByAccount(bean.getAccount()) == null) {
			if (sysUserService.create(bean))
				ret = 2;
		} else {// �ʺŴ���
			ret = 1;
		}

		ViewMessages messages = new ViewMessages();
		if (ret == 2) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_success"));
		} else if (ret == 1) {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.existed"));
		} else {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		// ��ʾ�б�ҳ��
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �ύ�޸���Ϣ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveModify")
	public ModelAndView saveModify(HttpServletRequest request, ModelMap modelMap) {
		String id = ParamUtil.getParameter(request, "id");
		id = RequestUtils.decodeString(id);
		SysUser bean = sysUserService.findById(id);
		boolean ret = false;
		if (bean != null) {
			SysDepartment department = sysDepartmentService.findById(ParamUtil
					.getIntParameter(request, "parent", 0));
			bean.setDepartment(department);
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setSuperiorIds(ParamUtil.getParameter(request, "superiorIds"));
			bean.setGender(ParamUtil.getIntParameter(request, "gender", 0));
			bean.setMobile(ParamUtil.getParameter(request, "mobile"));
			bean.setEmail(ParamUtil.getParameter(request, "email"));
			bean.setTelephone(ParamUtil.getParameter(request, "telephone"));
			bean.setEvection(ParamUtil.getIntParameter(request, "evection", 0));
			bean.setStatus(ParamUtil.getParameter(request, "status"));
			bean.setHeadship(ParamUtil.getParameter(request, "headship"));
			bean.setUserType(ParamUtil.getIntParameter(request, "userType", 0));
			bean.setUpdateBy(RequestUtils.getActorId(request));
			ret = sysUserService.update(bean);
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �ύ�޸���Ϣ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveModifyInfo")
	public ModelAndView saveModifyInfo(HttpServletRequest request,
			ModelMap modelMap) {
		SysUser bean = RequestUtil.getLoginUser(request);
		boolean ret = false;
		if (bean != null) {
			SysUser user = sysUserService.findById(bean.getActorId());
			user.setMobile(ParamUtil.getParameter(request, "mobile"));
			user.setEmail(ParamUtil.getParameter(request, "email"));
			user.setTelephone(ParamUtil.getParameter(request, "telephone"));
			user.setUpdateBy(RequestUtils.getActorId(request));
			ret = sysUserService.update(user);
			CacheUtils.clearUserCache(user.getAccount());
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �޸��û�����
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/savePwd")
	public ModelAndView savePwd(HttpServletRequest request, ModelMap modelMap) {
		SysUser bean = RequestUtil.getLoginUser(request);
		boolean ret = false;
		String oldPwd = ParamUtil.getParameter(request, "oldPwd");
		String newPwd = ParamUtil.getParameter(request, "newPwd");
		if (bean != null && StringUtils.isNotEmpty(oldPwd)
				&& StringUtils.isNotEmpty(newPwd)) {
			SysUser user = sysUserService.findById(bean.getActorId());
			try {
				String encPwd = DigestUtil.digestString(oldPwd, "MD5");
				if (StringUtils.equals(encPwd, user.getPassword())) {
					user.setPassword(DigestUtil.digestString(newPwd, "MD5"));
					user.setUpdateBy(RequestUtils.getActorId(request));
					ret = sysUserService.update(user);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// ����ɹ�
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// ����ʧ��
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * ��ѯ��ȡ�û��б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/selectSysUser")
	public ModelAndView selectSysUser(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = Constants.PAGE_SIZE;
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		int multDate = ParamUtil.getIntParameter(request, "multDate", 0);
		String name = ParamUtil.getParameter(request, "fullName", null);
		PageResult pager = sysUserService.getSysUserList(deptId, name, pageNo,
				pageSize);
		request.setAttribute("pager", pager);
		request.setAttribute("multDate", new Integer(multDate));

		String x_view = ViewProperties.getString("user.selectSysUser");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_select", modelMap);
	}

	/**
	 * ��ѯ��ȡ�ض������û��б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/selectSysUserByDept")
	public ModelAndView selectSysUserByDept(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = Constants.PAGE_SIZE;
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		String name = ParamUtil.getParameter(request, "fullName", null);

		SysDepartment sysDepartment = sysDepartmentService.findById(deptId);
		request.setAttribute("sysDepartment", sysDepartment);
		PageResult pager = null;
		if (name != null && !"".equals(name)) {
			pager = sysUserService.getSysUserList(deptId, name, pageNo,
					pageSize);
		} else {
			pager = sysUserService.getSysUserList(deptId, pageNo, pageSize);
		}
		request.setAttribute("pager", pager);

		String x_view = ViewProperties.getString("user.selectSysUserByDept");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/userByDept_list", modelMap);
	}

	@javax.annotation.Resource
	public void setDictoryService(DictoryService dictoryService) {
		this.dictoryService = dictoryService;
	}

	/**
	 * �����û���ɫ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/setRole")
	public ModelAndView setRole(HttpServletRequest request, ModelMap modelMap) {
		logger.debug(RequestUtils.getParameterMap(request));
		ViewMessages messages = new ViewMessages();
		String userId = ParamUtil.getParameter(request, "user_id");
		SysUser user = sysUserService.findById(userId);// �����û�����

		if (user != null) {// �û�����
			long[] id = ParamUtil.getLongParameterValues(request, "id");// ��ȡҳ�����
			if (id != null) {

				Set<SysDeptRole> newRoles = new HashSet<SysDeptRole>();
				for (int i = 0; i < id.length; i++) {
					logger.debug("id[" + i + "]=" + id[i]);
					SysDeptRole role = sysDeptRoleService.findById(id[i]);// ���ҽ�ɫ����
					if (role != null) {
						newRoles.add(role);// ���뵽��ɫ�б�
					}
				}

				user.setUpdateBy(RequestUtils.getActorId(request));

				if (sysUserService.updateRole(user, newRoles)) {// ��Ȩ�ɹ�
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_success"));
				} else {// ����ʧ��
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_failure"));
				}
			}
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * �����û���ɫ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/setUserRole")
	public ModelAndView setUserRole(HttpServletRequest request,
			ModelMap modelMap) {
		logger.debug(RequestUtils.getParameterMap(request));
		ViewMessages messages = new ViewMessages();
		String userId = ParamUtil.getParameter(request, "user_id");
		SysUser user = sysUserService.findById(userId);// �����û�����

		if (user != null) {// �û�����
			long[] id = ParamUtil.getLongParameterValues(request, "id");// ��ȡҳ�����
			if (id != null) {

				Set<SysRole> newRoles = new HashSet<SysRole>();
				for (int i = 0; i < id.length; i++) {
					logger.debug("id[" + i + "]=" + id[i]);
					SysRole role = sysRoleService.findById(id[i]);// ���ҽ�ɫ����
					if (role != null) {
						logger.debug("name[" + i + "]=" + role.getName());
						newRoles.add(role);// ���뵽��ɫ�б�
					}
				}

				user.setUpdateBy(RequestUtils.getActorId(request));

				logger.debug("---------------update user roles----------------");
				if (sysUserService.updateUserRole(user, newRoles)) {// ��Ȩ�ɹ�
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_success"));
				} else {// ����ʧ��
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_failure"));
				}
			}
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_msg", modelMap);
	}

	@javax.annotation.Resource
	public void setSysDepartmentService(
			SysDepartmentService sysDepartmentService) {
		this.sysDepartmentService = sysDepartmentService;

	}

	@javax.annotation.Resource
	public void setSysDeptRoleService(SysDeptRoleService sysDeptRoleService) {
		this.sysDeptRoleService = sysDeptRoleService;

	}

	@javax.annotation.Resource
	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;

	}

	@javax.annotation.Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;

	}

	@javax.annotation.Resource
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;

	}

	@javax.annotation.Resource
	public void setTableDataService(ITableDataService tableDataService) {
		this.tableDataService = tableDataService;
	}

	/**
	 * ��ʾ������������
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showDeptUsers")
	public ModelAndView showDeptUsers(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		List<SysDepartment> list = new ArrayList<SysDepartment>();
		Set<SysUser> set = new HashSet<SysUser>();
		// 6:
		long deptId = ParamUtil.getLongParameter(request, "dept", 5);
		String roleCode = ParamUtil.getParameter(request, "code", "");
		SysDepartment node = this.sysDepartmentService.findById(deptId);
		if (node != null) {
			list.add(node);
			this.getAllSysDepartmentList(list, (int) node.getId());
		} else {
			this.getAllSysDepartmentList(list, (int) deptId);
		}
		for (Iterator<SysDepartment> iter = list.iterator(); iter.hasNext();) {
			SysDepartment element = (SysDepartment) iter.next();
			this.getRoleUser(set, element.getId(), roleCode);
		}
		request.setAttribute("user", set);

		String x_view = ViewProperties.getString("user.showDeptUsers");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/duty_select", modelMap);
	}

	/**
	 * ��ʾ���ҳ��
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showFrame")
	public ModelAndView showFrame(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysTree bean = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		request.setAttribute("parent", bean.getId() + "");

		String x_view = ViewProperties.getString("user.showFrame");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_frame", modelMap);
	}

	/**
	 * ��ʾ�����б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showList")
	public ModelAndView showList(HttpServletRequest request, ModelMap modelMap) {
		int deptId = ParamUtil.getIntParameter(request, "parent", 0);
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = ParamUtil.getIntParameter(request, "page_size",
				Constants.PAGE_SIZE);
		PageResult pager = sysUserService.getSysUserList(deptId, pageNo,
				pageSize);
		request.setAttribute("department",
				sysDepartmentService.findById(deptId));
		request.setAttribute("pager", pager);

		SysDepartment dept = sysDepartmentService.findById(deptId);
		List<SysDepartment> list = new ArrayList<SysDepartment>();
		sysDepartmentService.findNestingDepartment(list, dept);
		request.setAttribute("nav", list);

		String x_view = ViewProperties.getString("user.showList");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_list", modelMap);
	}

	/**
	 * ��ʾ�����б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showPasswordList")
	public ModelAndView showPasswordList(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userName = ParamUtil.getParameter(request, "userName");
		String account = ParamUtil.getParameter(request, "account");
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = ParamUtil.getIntParameter(request, "page_size", 20);

		PageResult pager = sysUserService.getSysUserList(deptId, userName,
				account, pageNo, pageSize);
		request.setAttribute("pager", pager);

		String x_view = ViewProperties.getString("user.showPasswordList");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_password_list",
				modelMap);
	}

	/**
	 * ��ʾ��ɫ
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showRole")
	public ModelAndView showRole(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userId = ParamUtil.getParameter(request, "user_id");
		userId = RequestUtils.decodeString(userId);
		logger.debug("userId:" + userId);
		SysUser user = sysUserService.findByAccountWithAll(userId);
		request.setAttribute("user", user);
		if (user.getDepartment() != null) {
			request.setAttribute("list", sysDeptRoleService.getRoleList(user
					.getDepartment().getId()));
		}

		String x_view = ViewProperties.getString("user.showRole");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// ��ʾ�б�ҳ��
		return new ModelAndView("/modules/sys/user/user_role", modelMap);
	}

	/**
	 * ��ʾ��ɫ�û��б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showRoleUser")
	public ModelAndView showRoleUser(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		long roleId = ParamUtil.getLongParameter(request, "roleId", 0);

		// ������Ϣ
		SysDepartment dept = sysDepartmentService.findById(deptId);
		List<SysDepartment> list = new ArrayList<SysDepartment>();
		sysDepartmentService.findNestingDepartment(list, dept);
		request.setAttribute("nav", list);

		// ��ɫ
		SysRole role = sysRoleService.findById(roleId);
		request.setAttribute("role", role.getName());

		Set<?> users = sysDeptRoleService.findRoleUser(deptId, role.getCode());
		request.setAttribute("list", users);

		String x_view = ViewProperties.getString("user.showRoleUser");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/deptRole_user", modelMap);
	}

	/**
	 * ��ʾ��ɫ�û��б�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showSelUser")
	public ModelAndView showSelUser(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		int deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		if (deptId != 0) {
			request.setAttribute("list", sysUserService.getSysUserList(deptId));
		}

		deptId = ParamUtil.getIntParameter(request, "deptId2", 0);
		if (deptId != 0) {
			request.setAttribute("list", sysUserService.getSysUserList(deptId));
		}

		String x_view = ViewProperties.getString("user.showSelUser");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/dept_user_sel", modelMap);
	}

	/**
	 * ���ӽ�ɫ�û�
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showUser")
	public ModelAndView showUser(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userId = ParamUtil.getParameter(request, "userId");
		SysUser user = sysUserService.findById(userId);
		request.setAttribute("user", user);

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		List<SysTree> list = new ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.getSysTree(list, (int) parent.getId(), 1);
		request.setAttribute("parent", list);

		String x_view = ViewProperties.getString("user.showUser");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/user/user_info", modelMap);
	}
}