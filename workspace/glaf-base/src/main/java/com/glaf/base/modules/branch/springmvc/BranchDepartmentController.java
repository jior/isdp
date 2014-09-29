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

package com.glaf.base.modules.branch.springmvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
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
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.Dictory;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.UserRole;
import com.glaf.base.modules.sys.query.SysDepartmentQuery;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.query.UserRoleQuery;
import com.glaf.base.modules.sys.service.ComplexUserService;
import com.glaf.base.modules.sys.service.DictoryService;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysDeptRoleService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.utils.ParamUtil;
import com.glaf.core.base.TreeModel;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.security.LoginContext;
import com.glaf.core.tree.helper.JacksonTreeHelper;
import com.glaf.core.util.JsonUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.Paging;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.Tools;

@Controller("/branch/department")
@RequestMapping("/branch/department")
public class BranchDepartmentController {
	private static final Log logger = LogFactory
			.getLog(BranchDepartmentController.class);

	protected ComplexUserService complexUserService;

	protected DictoryService dictoryService;

	protected SysDepartmentService sysDepartmentService;

	protected SysDeptRoleService sysDeptRoleService;

	protected SysTreeService sysTreeService;

	protected SysUserService sysUserService;

	protected SysRoleService sysRoleService;

	@RequestMapping("/branchAdmin")
	public ModelAndView branchAdmin(HttpServletRequest request,
			ModelMap modelMap) {
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

		String x_view = ViewProperties
				.getString("branch.department.branchAdmin");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/branchAdmin", modelMap);
	}

	@RequestMapping("/frame")
	public ModelAndView frame(HttpServletRequest request, ModelMap modelMap) {
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

		String x_view = ViewProperties.getString("branch.department.frame");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/frame", modelMap);
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request) throws IOException {
		logger.debug("----------------------json----------------------");
		String actorId = RequestUtils.getActorId(request);
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug("params:" + params);
		SysDepartmentQuery query = new SysDepartmentQuery();
		Tools.populate(query, params);

		if (!RequestUtils.getLoginContext(request).isSystemAdministrator()) {
			List<Long> nodeIds = complexUserService
					.getUserManageBranchNodeIds(actorId);
			logger.debug("#nodeIds:" + nodeIds);
			query.nodeIds(nodeIds);
		}

		if (StringUtils.isNotEmpty(request.getParameter("parentId"))) {
			query.setParentId(RequestUtils.getLong(request, "parentId"));
		} else {
			SysUser user = com.glaf.base.utils.RequestUtil
					.getLoginUser(request);
			query.setParentId(user.getDeptId());
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
			limit = Paging.MAX_RECORD_COUNT;
		}

		JSONObject result = new JSONObject();
		int total = sysDepartmentService
				.getSysDepartmentCountByQueryCriteria(query);
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

			List<SysDepartment> list = sysDepartmentService
					.getSysDepartmentsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysDepartment sysDepartment : list) {
					JSONObject rowJSON = sysDepartment.toJsonObject();
					rowJSON.put("id", sysDepartment.getId());
					rowJSON.put("departmentId", sysDepartment.getId());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		} else {
			result.put("total", 0);
			result.put("totalCount", 0);
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
		}
		logger.debug(result.toString());
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

		String x_view = ViewProperties.getString("branch.department.list");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/list", modelMap);
	}

	@RequestMapping("/permission")
	public ModelAndView permission(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		List<SysRole> roleList = new ArrayList<SysRole>();
		List<SysRole> roles = sysRoleService.getSysRoleList();
		for (SysRole role : roles) {
			if (StringUtils.isNotEmpty(role.getCode())
					&& (StringUtils.startsWithIgnoreCase(role.getCode(),
							SysConstants.BRANCH_PREFIX) || StringUtils.equals(
							role.getIsUseBranch(), "Y"))) {
				roleList.add(role);
			}
		}

		request.setAttribute("roleList", roleList);

		String op_view = request.getParameter("op_view");
		if (StringUtils.isEmpty(op_view)) {
			op_view = "user";
		}

		request.setAttribute("op_view", op_view);

		long parentId = 0;
		if (StringUtils.isNotEmpty(request.getParameter("parentId"))) {
			parentId = RequestUtils.getLong(request, "parentId");
		} else {
			SysUser user = com.glaf.base.utils.RequestUtil
					.getLoginUser(request);
			parentId = user.getDeptId();
		}

		List<Long> deptIds = new ArrayList<Long>();
		List<SysTree> treeList = new ArrayList<SysTree>();
		sysTreeService.loadSysTrees(treeList, parentId, 1);
		if (treeList != null && !treeList.isEmpty()) {
			for (SysTree tree : treeList) {
				if (tree.getDepartment() != null) {
					deptIds.add(tree.getDepartment().getId());
				}
			}
		}

		SysDepartment dept = sysDepartmentService
				.getSysDepartmentByNodeId(parentId);
		if (dept != null) {
			deptIds.add(dept.getId());
		}

		logger.debug("----deptIds:" + deptIds);

		SysUserQuery query = new SysUserQuery();
		query.deptIds(deptIds);
		List<SysUser> users = sysUserService.getSysUsersByQueryCriteria(0,
				1000, query);
		if (users != null && !users.isEmpty()) {
			List<String> actorIds = new ArrayList<String>();
			for (SysUser user : users) {
				actorIds.add(user.getAccount());
			}
			UserRoleQuery userRoleQuery = new UserRoleQuery();
			userRoleQuery.setActorIds(actorIds);
			List<UserRole> userRoles = sysUserService
					.getRoleUserViews(userRoleQuery);
			if (userRoles != null && !userRoles.isEmpty()) {
				for (SysUser user : users) {
					for (UserRole userRole : userRoles) {
						if (StringUtils.equals(user.getAccount(),
								userRole.getActorId())) {
							user.getRoleCodes().add(userRole.getRoleCode());
						}
					}
				}
			}
			request.setAttribute("users", users);
		}

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

		String x_view = ViewProperties
				.getString("branch.department.permission");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/permission", modelMap);
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

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.DEPT_LEVEL);
		modelMap.put("dictories", dictories);

		String x_view = ViewProperties
				.getString("branch.department.prepareAdd");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/dept_add", modelMap);
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
		SysDepartment bean = sysDepartmentService.getSysDepartment(id);
		request.setAttribute("bean", bean);

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		List<SysTree> list = new java.util.ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.loadSysTrees(list, parent.getId(), 1);
		request.setAttribute("parent", list);

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.DEPT_LEVEL);
		modelMap.put("dictories", dictories);

		String x_view = ViewProperties
				.getString("branch.department.prepareModify");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/modules/branch/dept/dept_modify", modelMap);
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
		long parentId = ParamUtil.getLongParameter(request, "parent", 0);
		boolean ret = false;
		LoginContext loginContext = RequestUtils.getLoginContext(request);

		List<Long> nodeIds = new ArrayList<Long>();

		if (!loginContext.isSystemAdministrator()) {
			nodeIds = complexUserService
					.getUserManageBranchNodeIds(loginContext.getActorId());
		}

		/**
		 * 保证添加的部门是分级管理员管辖的部门
		 */
		if (loginContext.isSystemAdministrator() || nodeIds.contains(parentId)) {
			// 增加部门时，同时要增加对应节点
			SysDepartment bean = new SysDepartment();
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setDesc(ParamUtil.getParameter(request, "desc"));
			bean.setCode(ParamUtil.getParameter(request, "code"));
			bean.setCode2(ParamUtil.getParameter(request, "code2"));
			bean.setNo(ParamUtil.getParameter(request, "no"));
			bean.setLevel(RequestUtils.getInt(request, "level"));
			bean.setCreateTime(new Date());
			bean.setCreateBy(RequestUtils.getActorId(request));

			SysTree node = new SysTree();
			node.setCreateBy(RequestUtils.getActorId(request));
			node.setName(bean.getName());
			node.setDesc(bean.getName());
			node.setCode(bean.getCode());
			node.setParentId(parentId);
			bean.setNode(node);

			ret = sysDepartmentService.create(bean);

			ViewMessages messages = new ViewMessages();
			if (ret) {// 保存成功
				messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
						"department.add_success"));
			} else {// 保存失败
				messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
						"department.add_failure"));
			}
			MessageUtils.addMessages(request, messages);
		}

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
		long id = ParamUtil.getLongParameter(request, "id", 0);
		long parentId = ParamUtil.getLongParameter(request, "parent", 0);
		SysDepartment bean = sysDepartmentService.getSysDepartment(id);
		boolean ret = false;
		if (bean != null) {
			LoginContext loginContext = RequestUtils.getLoginContext(request);

			List<Long> nodeIds = new ArrayList<Long>();

			if (!loginContext.isSystemAdministrator()) {
				nodeIds = complexUserService
						.getUserManageBranchNodeIds(loginContext.getActorId());
			}

			/**
			 * 保证添加的部门是分级管理员管辖的部门
			 */
			if (loginContext.isSystemAdministrator()
					|| nodeIds.contains(parentId)) {
				bean.setUpdateBy(RequestUtils.getActorId(request));
				bean.setName(ParamUtil.getParameter(request, "name"));
				bean.setDesc(ParamUtil.getParameter(request, "desc"));
				bean.setCode(ParamUtil.getParameter(request, "code"));
				bean.setCode2(ParamUtil.getParameter(request, "code2"));
				bean.setNo(ParamUtil.getParameter(request, "no"));
				bean.setStatus(ParamUtil.getIntParameter(request, "status", 0));
				bean.setLevel(RequestUtils.getInt(request, "level"));
				SysTree node = bean.getNode();

				node.setUpdateBy(RequestUtils.getActorId(request));
				node.setName(bean.getName());
				node.setParentId(parentId);
				bean.setNode(node);
				try {
					ret = sysDepartmentService.update(bean);
				} catch (Exception ex) {
					ret = false;
					logger.error(ex);
				}
			}
		}
		ViewMessages messages = new ViewMessages();
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"department.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"department.modify_failure"));
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
	@ResponseBody
	@RequestMapping("/setUserRole")
	public byte[] setUserRole(HttpServletRequest request) {
		long roleId = ParamUtil.getLongParameter(request, "roleId", 0);
		String actorId = request.getParameter("actorId");
		String operation = request.getParameter("operation");
		SysRole bean = sysRoleService.findById(roleId);
		SysUser user = sysUserService.findByAccountWithAll(actorId);
		if (bean != null && user != null) {
			LoginContext loginContext = RequestUtils.getLoginContext(request);

			List<Long> nodeIds = new ArrayList<Long>();

			if (!loginContext.isSystemAdministrator()) {
				nodeIds = complexUserService
						.getUserManageBranchNodeIds(loginContext.getActorId());
			}

			/**
			 * 保证添加的部门是分级管理员管辖的部门
			 */
			if (loginContext.isSystemAdministrator()
					|| nodeIds.contains(user.getDepartment().getNodeId())) {
				if (StringUtils.equals(operation, "revoke")) {
					sysUserService.deleteRoleUser(roleId, actorId);
				} else {
					sysUserService.createRoleUser(roleId, actorId);
				}
				return ResponseUtils.responseResult(true);
			}
		}

		return ResponseUtils.responseResult(false);
	}

	@javax.annotation.Resource
	public void setComplexUserService(ComplexUserService complexUserService) {
		this.complexUserService = complexUserService;
	}

	@javax.annotation.Resource
	public void setDictoryService(DictoryService dictoryService) {
		this.dictoryService = dictoryService;
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
		int parent = ParamUtil.getIntParameter(request, "parent", 0);
		int pageNo = ParamUtil.getIntParameter(request, "page_no", 1);
		int pageSize = ParamUtil.getIntParameter(request, "page_size",
				Constants.PAGE_SIZE);
		PageResult pager = sysDepartmentService.getSysDepartmentList(parent,
				pageNo, pageSize);
		request.setAttribute("pager", pager);

		SysTree treeNode = sysTreeService.findById(parent);
		SysDepartment dept = treeNode.getDepartment();
		List<SysDepartment> list = new java.util.ArrayList<SysDepartment>();
		sysDepartmentService.findNestingDepartment(list, dept);
		request.setAttribute("nav", list);

		String x_view = ViewProperties.getString("branch.department.showList");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/dept_list", modelMap);
	}

	@ResponseBody
	@RequestMapping("/sort")
	public void sort(@RequestParam(value = "parent") int parent,
			@RequestParam(value = "id") int id,
			@RequestParam(value = "operate") int operate) {
		logger.debug("parent:" + parent + "; id:" + id + "; operate:" + operate);
		SysDepartment bean = sysDepartmentService.findById(id);
		sysDepartmentService.sort(parent, bean, operate);
	}

	@RequestMapping("/tree")
	public ModelAndView tree(HttpServletRequest request, ModelMap modelMap) {
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

		String x_view = ViewProperties.getString("branch.department.tree");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/modules/branch/dept/tree", modelMap);
	}

	@ResponseBody
	@RequestMapping("/treeJson")
	public byte[] treeJson(HttpServletRequest request) {
		logger.debug("------------------------treeJson--------------------");
		String actorId = RequestUtils.getActorId(request);
		List<TreeModel> treeModels = complexUserService
				.getUserManageBranch(actorId);
		logger.debug("#treeModels:" + treeModels);
		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode responseJSON = treeHelper.getTreeArrayNode(treeModels);
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}