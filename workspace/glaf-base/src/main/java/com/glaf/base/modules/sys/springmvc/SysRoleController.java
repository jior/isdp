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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysRoleQuery;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.utils.ParamUtil;
import com.glaf.core.base.BaseTree;
import com.glaf.core.base.TreeModel;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.tree.helper.TreeHelper;
import com.glaf.core.util.JsonUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.Tools;

@Controller("/sys/role")
@RequestMapping("/sys/role")
public class SysRoleController {
	private static final Log logger = LogFactory
			.getLog(SysRoleController.class);

	protected SysApplicationService sysApplicationService;

	protected SysRoleService sysRoleService;

	protected SysTreeService sysTreeService;

	protected SysUserService sysUserService;

	/**
	 * 批量删除信息
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
		long[] ids = ParamUtil.getLongParameterValues(request, "id");
		try {
			ret = sysRoleService.deleteAll(ids);
		} catch (Exception ex) {
			logger.error(ex);
			ret = false;
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// 成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.delete_success"));
		} else {// 失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);

		// 显示列表页面
		return new ModelAndView("show_msg2", modelMap);
	}

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		long id = ParamUtil.getIntParameter(request, "id", 0);
		SysRole sysRole = null;
		if (id > 0) {
			sysRole = sysRoleService.findById(id);
			request.setAttribute("sysRole", sysRole);
		}

		String x_view = ViewProperties.getString("role.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/role/edit", modelMap);
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysRoleQuery query = new SysRoleQuery();
		Tools.populate(query, params);

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
		int total = sysRoleService.getSysRoleCountByQueryCriteria(query);
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

			List<SysRole> list = sysRoleService.getSysRolesByQueryCriteria(
					start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();
				result.put("rows", rowsJSON);
				for (SysRole sysRole : list) {
					JSONObject rowJSON = sysRole.toJsonObject();
					rowJSON.put("id", sysRole.getId());
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

		String x_view = ViewProperties.getString("role.list");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/sys/role/list", modelMap);
	}

	/**
	 * 显示增加页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareAdd")
	public ModelAndView prepareAdd(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("role.prepareAdd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/sys/role/role_add", modelMap);
	}

	/**
	 * 显示修改页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/prepareModify")
	public ModelAndView prepareModify(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		long id = ParamUtil.getIntParameter(request, "id", 0);
		SysRole bean = sysRoleService.findById(id);
		request.setAttribute("bean", bean);

		String x_view = ViewProperties.getString("role.prepareModify");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/sys/role/role_modify", modelMap);
	}

	/**
	 * 显示菜单页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/privilege")
	public ModelAndView privilege(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		long roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		SysRole bean = sysRoleService.findById(roleId);
		request.setAttribute("role", bean);

		long parentId = ParamUtil.getIntParameter(request, "parentId", 3);

		List<SysTree> list = sysApplicationService
				.getTreeWithApplicationList(parentId);
		request.setAttribute("list", list);

		String x_view = ViewProperties.getString("role.privilege");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/sys/role/role_privilege", modelMap);
	}

	/**
	 * 显示菜单页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/roleMenus")
	public ModelAndView roleMenus(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		long roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		SysRole bean = sysRoleService.findById(roleId);
		request.setAttribute("role", bean);

		String x_view = ViewProperties.getString("role.roleMenus");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/sys/role/roleMenus", modelMap);
	}

	@RequestMapping("/roleUsers")
	public ModelAndView roleUsers(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		long id = ParamUtil.getIntParameter(request, "id", 0);
		SysRole sysRole = null;
		if (id > 0) {
			sysRole = sysRoleService.findById(id);
			request.setAttribute("sysRole", sysRole);
		}

		if (sysRole == null) {
			id = ParamUtil.getIntParameter(request, "roleId", 0);
			sysRole = sysRoleService.findById(id);
			request.setAttribute("sysRole", sysRole);
		}

		String x_view = ViewProperties.getString("role.roleUsers");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/sys/role/roleUsers", modelMap);
	}

	@RequestMapping("/roleUsersJson")
	@ResponseBody
	public byte[] roleUsersJson(HttpServletRequest request, ModelMap modelMap)
			throws IOException {
		JSONObject result = new JSONObject();
		String roleCode = request.getParameter("roleCode");
		List<SysUser> roleUsers = sysUserService
				.getSysUsersByRoleCode(roleCode);
		Collection<String> userIds = new HashSet<String>();
		if (roleUsers != null && !roleUsers.isEmpty()) {
			for (SysUser u : roleUsers) {
				userIds.add(u.getAccount());
			}
		}
		List<SysUser> users = sysUserService.getSysUserWithDeptList();
		SysTree root = sysTreeService.getSysTreeByCode(SysConstants.TREE_DEPT);
		if (root != null && users != null) {
			logger.debug(root.toJsonObject().toJSONString());
			logger.debug("users size:" + users.size());
			List<TreeModel> treeModels = new ArrayList<TreeModel>();
			// treeModels.add(root);
			List<SysTree> trees = sysTreeService.getAllSysTreeListForDept(
					(int) root.getId(), 0);
			if (trees != null && !trees.isEmpty()) {
				logger.debug("dept tree size:" + trees.size());
				Map<Long, SysTree> treeMap = new HashMap<Long, SysTree>();
				for (SysTree tree : trees) {
					SysDepartment dept = tree.getDepartment();
					treeMap.put(dept.getId(), tree);
				}
				long ts = System.currentTimeMillis();
				for (SysTree tree : trees) {
					treeModels.add(tree);
					SysDepartment dept = tree.getDepartment();
					if (dept != null && dept.getId() > 0) {
						for (SysUser user : users) {
							SysTree t = treeMap.get(Long.valueOf(user
									.getDeptId()));
							if (dept.getId() == user.getDeptId() && t != null) {
								TreeModel treeModel = new BaseTree();
								treeModel.setParentId(t.getId());
								treeModel.setId(ts++);
								treeModel.setCode(user.getAccount());
								treeModel.setName(user.getAccount() + " "
										+ user.getName());
								treeModel.setIconCls("icon-user");
								treeModel.setIcon(request.getContextPath()
										+ "/icons/icons/user.gif");
								if (userIds != null
										&& userIds.contains(user.getAccount())) {
									treeModel.setChecked(true);
								}
								treeModels.add(treeModel);
							}
						}
					}
				}
			}
			logger.debug("treeModels:" + treeModels.size());
			TreeHelper treeHelper = new TreeHelper();
			JSONArray jsonArray = treeHelper.getTreeJSONArray(treeModels);
			// logger.debug(jsonArray.toJSONString());
			return jsonArray.toJSONString().getBytes("UTF-8");
		}
		return result.toString().getBytes("UTF-8");
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveAdd")
	public ModelAndView saveAdd(HttpServletRequest request, ModelMap modelMap) {
		boolean ret = false;
		if (sysRoleService.findByCode(ParamUtil.getParameter(request, "code")) == null) {
			SysRole bean = new SysRole();
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setContent(ParamUtil.getParameter(request, "content"));
			bean.setCode(ParamUtil.getParameter(request, "code"));
			bean.setIsUseBranch(ParamUtil.getParameter(request, "isUseBranch"));
			bean.setCreateBy(RequestUtils.getActorId(request));
			bean.setUpdateBy(RequestUtils.getActorId(request));
			ret = sysRoleService.create(bean);
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.add_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		// 显示列表页面
		return new ModelAndView("show_msg", modelMap);
	}

	/**
	 * 提交修改信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveModify")
	public ModelAndView saveModify(HttpServletRequest request, ModelMap modelMap) {
		long roleId = ParamUtil.getIntParameter(request, "id", 0);
		SysRole bean = sysRoleService.findById(roleId);
		if (bean != null) {
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setContent(ParamUtil.getParameter(request, "content"));
			bean.setCode(ParamUtil.getParameter(request, "code"));
			bean.setIsUseBranch(ParamUtil.getParameter(request, "isUseBranch"));
			bean.setUpdateBy(RequestUtils.getActorId(request));
		}
		boolean ret = sysRoleService.update(bean);
		ViewMessages messages = new ViewMessages();
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"role.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		// 显示列表页面
		return new ModelAndView("show_msg", modelMap);
	}

	@javax.annotation.Resource
	public void setSysApplicationService(
			SysApplicationService sysApplicationService) {
		this.sysApplicationService = sysApplicationService;
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

	/**
	 * 显示所有列表
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/showList")
	public ModelAndView showList(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		logger.debug("->params:" + RequestUtils.getRequestParameters(request));
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = ParamUtil.getIntParameter(request, "page_size",
				Constants.PAGE_SIZE);

		SysRoleQuery query = new SysRoleQuery();
		String rq = ParamUtil.getParameter(request, "_rq_", "");
		logger.debug("_rq_:" + rq);
		String nameLike_encode = ParamUtil.getParameter(request,
				"nameLike_encode", "");
		String codeLike_encode = ParamUtil.getParameter(request,
				"codeLike_encode", "");

		if ("1".equals(rq)) {
			logger.debug("-----------------------参数查询-----------------------");
			String nameLike = ParamUtil.getParameter(request, "nameLike", "");
			String codeLike = ParamUtil.getParameter(request, "codeLike", "");
			if (StringUtils.isNotEmpty(nameLike)) {
				query.setNameLike(nameLike);
				request.setAttribute("nameLike_encode",
						RequestUtils.encodeString(nameLike));
				request.setAttribute("nameLike", nameLike);
			} else {
				request.removeAttribute("nameLike");
				request.removeAttribute("nameLike_encode");
				request.setAttribute("nameLike", "");
			}
			if (StringUtils.isNotEmpty(codeLike)) {
				query.setCodeLike(codeLike);
				request.setAttribute("codeLike_encode",
						RequestUtils.encodeString(codeLike));
				request.setAttribute("codeLike", codeLike);
			} else {
				request.removeAttribute("codeLike");
				request.removeAttribute("codeLike_encode");
				request.setAttribute("codeLike", "");
			}
		} else {
			logger.debug("-----------------------链接查询-----------------------");
			if (StringUtils.isNotEmpty(nameLike_encode)) {
				String nameLike = RequestUtils.decodeString(nameLike_encode);
				query.setNameLike(nameLike);
				request.setAttribute("nameLike_encode", nameLike_encode);
				request.setAttribute("nameLike", nameLike);
			}
			if (StringUtils.isNotEmpty(codeLike_encode)) {
				String codeLike = RequestUtils.decodeString(codeLike_encode);
				query.setCodeLike(codeLike);
				request.setAttribute("codeLike_encode", codeLike_encode);
				request.setAttribute("codeLike", codeLike);
			}

		}

		// Tools.populate(query, params);
		// PageResult pager = sysRoleService.getSysRoleList(pageNo, pageSize);
		PageResult pager = sysRoleService.getSysRoleList(pageNo, pageSize,
				query);
		request.setAttribute("pager", pager);

		String x_view = ViewProperties.getString("role.showList");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/sys/role/role_list", modelMap);
	}

	@ResponseBody
	@RequestMapping("/sort")
	public byte[] sort(@RequestParam(value = "id") int id,
			@RequestParam(value = "operate") int operate) {
		logger.info("id:" + id + ",operate:" + operate);
		sysRoleService.sort(sysRoleService.findById(id), operate);
		return ResponseUtils.responseResult(true);
	}
}