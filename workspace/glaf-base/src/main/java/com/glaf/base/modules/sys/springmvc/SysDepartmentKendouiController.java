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
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.SysConstants;
import com.glaf.base.modules.sys.model.Dictory;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysDepartmentQuery;
import com.glaf.base.modules.sys.service.DictoryService;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.modules.sys.util.SysDepartmentDomainFactory;
import com.glaf.base.modules.sys.util.SysRoleJsonFactory;
import com.glaf.base.utils.ParamUtil;
import com.glaf.core.base.DataRequest;
import com.glaf.core.base.TreeModel;
import com.glaf.core.base.DataRequest.SortDescriptor;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.tree.helper.JacksonTreeHelper;
import com.glaf.core.util.JsonUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.Tools;

@Controller("/system/department")
@RequestMapping("/system/department")
public class SysDepartmentKendouiController {
	private static final Log logger = LogFactory
			.getLog(SysDepartmentKendouiController.class);

	protected DictoryService dictoryService;

	protected SysDepartmentService sysDepartmentService;

	protected SysRoleService sysRoleService;

	protected SysUserService sysUserService;

	protected SysTreeService sysTreeService;

	@ResponseBody
	@RequestMapping("/deptRolesJson")
	public byte[] deptRolesJson(HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug(params);

		long nodeId = RequestUtils.getLong(request, "nodeId", -1);
		SysDepartmentQuery query = new SysDepartmentQuery();
		query.nodeId(nodeId);
		List<SysRole> roles = sysRoleService.getSysRoleList();

		for (SysRole role : roles) {
			role.setNodeId(nodeId);
		}

		JSONArray array = SysRoleJsonFactory.listToArray(roles);

		logger.debug(array.toString());
		try {
			return array.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return array.toString().getBytes();
		}
	}

	/**
	 * 显示修改页面
	 * 
	 * 
	 * @param form
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		long deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		if (deptId > 0) {
			SysDepartment bean = sysDepartmentService.findById(deptId);
			request.setAttribute("department", bean);
		}

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_DEPT);
		List<SysTree> list = new ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.getSysTree(list, (int) parent.getId(), 1);
		request.setAttribute("treeList", list);

		List<Dictory> dictories = dictoryService
				.getDictoryList(SysConstants.DEPT_LEVEL);
		modelMap.put("dictories", dictories);

		String x_view = ViewProperties.getString("department.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		// 显示列表页面
		return new ModelAndView("/kendoui/sys/dept/edit", modelMap);
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request,
			@RequestBody DataRequest dataRequest) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysDepartmentQuery query = new SysDepartmentQuery();
		Tools.populate(query, params);
		query.setDataRequest(dataRequest);
		SysDepartmentDomainFactory.processDataRequest(dataRequest);

		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "kendoui";
		}
		int start = 0;
		int limit = PageResult.DEFAULT_PAGE_SIZE;

		int pageNo = dataRequest.getPage();
		limit = dataRequest.getPageSize();

		start = (pageNo - 1) * limit;

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = PageResult.DEFAULT_PAGE_SIZE;
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

			String orderName = null;
			String order = null;

			if (dataRequest.getSort() != null
					&& !dataRequest.getSort().isEmpty()) {
				SortDescriptor sort = dataRequest.getSort().get(0);
				orderName = sort.getField();
				order = sort.getDir();
				logger.debug("orderName:" + orderName);
				logger.debug("order:" + order);
			}

			if (StringUtils.isNotEmpty(orderName)) {
				query.setSortColumn(orderName);
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
					rowJSON.put("sysDepartmentId", sysDepartment.getId());
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

		String x_view = ViewProperties.getString("department.list");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/dept/list", modelMap);
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveAdd")
	@ResponseBody
	public byte[] saveAdd(HttpServletRequest request, ModelMap modelMap) {
		// 增加部门时，同时要增加对应节点
		SysDepartment bean = new SysDepartment();
		bean.setName(ParamUtil.getParameter(request, "name"));
		bean.setDesc(ParamUtil.getParameter(request, "desc"));
		bean.setCode(ParamUtil.getParameter(request, "code"));
		bean.setCode2(ParamUtil.getParameter(request, "code2"));
		bean.setNo(ParamUtil.getParameter(request, "no"));
		bean.setLevel(RequestUtils.getInt(request, "level"));
		bean.setCreateTime(new Date());

		SysTree node = new SysTree();
		node.setCreateBy(RequestUtils.getActorId(request));
		node.setName(bean.getName());
		node.setDesc(bean.getName());
		node.setCode(bean.getCode());
		node.setParentId((long) ParamUtil.getIntParameter(request, "parent", 0));
		bean.setNode(node);
		bean.setCreateBy(RequestUtils.getActorId(request));
		try {
			boolean ret = sysDepartmentService.create(bean);

			if (ret) {// 保存成功
				return ResponseUtils.responseResult(true);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}

		return ResponseUtils.responseResult(false);
	}

	/**
	 * 提交修改信息
	 * 
	 * 
	 * @param form
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveModify")
	@ResponseBody
	public byte[] saveModify(HttpServletRequest request, ModelMap modelMap) {
		long deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		SysDepartment bean = sysDepartmentService.findById(deptId);
		boolean ret = false;
		if (bean != null) {
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
			node.setParentId((long) ParamUtil.getIntParameter(request,
					"parent", 0));
			bean.setNode(node);
			try {
				ret = sysDepartmentService.update(bean);
			} catch (Exception ex) {
				ret = false;
				ex.printStackTrace();
				logger.error(ex);
			}
		}
		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
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
	@RequestMapping("/showDeptRoleUsers")
	public ModelAndView showDeptRoleUsers(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		long nodeId = ParamUtil.getIntParameter(request, "nodeId", 0);
		// String roleCode = request.getParameter("roleCode");

		SysDepartment dept = sysDepartmentService
				.getSysDepartmentByNodeId(nodeId);
		if (dept != null) {
			Collection<SysUser> users = sysUserService.getSysUserList(dept
					.getId());
			request.setAttribute("department", dept);
			request.setAttribute("users", users);
		}

		String x_view = ViewProperties
				.getString("department.showDeptRoleUsers");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/dept/dept_role_user", modelMap);
	}

	@RequestMapping("/treegrid")
	public ModelAndView treegrid(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("department.treegrid");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/dept/treegrid", modelMap);
	}

	@ResponseBody
	@RequestMapping("/treegridJson")
	public byte[] treegridJson(HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug(params);

		long parentId = RequestUtils.getLong(request, "parentId", -1);

		List<SysTree> trees = sysTreeService.getSysTreeListForDept(parentId, 0);
		List<SysDepartment> depts = sysDepartmentService
				.getSysDepartmentList(parentId);

		ArrayNode responseJSON = new ObjectMapper().createArrayNode();

		List<TreeModel> treeModels = new ArrayList<TreeModel>();

		if (trees != null && !trees.isEmpty() && depts != null
				&& !depts.isEmpty()) {
			Map<Long, SysDepartment> deptMap = new HashMap<Long, SysDepartment>();
			for (SysDepartment dept : depts) {
				deptMap.put(dept.getNodeId(), dept);
			}
			for (SysTree tree : trees) {
				SysDepartment dept = deptMap.get(tree.getId());
				if (dept != null) {
					Map<String, Object> dataMap = tree.getDataMap();
					if (dataMap == null) {
						dataMap = new HashMap<String, Object>();
					}
					dataMap.put("deptId", dept.getId());
					dataMap.put("deptName", dept.getName());
					dataMap.put("deptCode", dept.getCode());
					dataMap.put("deptCode2", dept.getCode2());
					dataMap.put("deptNo", dept.getNo());
					dataMap.put("deptDesc", dept.getDesc());
					dataMap.put("deptFincode", dept.getFincode());
					dataMap.put("deptLevel", dept.getLevel());
					tree.setDataMap(dataMap);
				}
				treeModels.add(tree);
			}
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		responseJSON = treeHelper.getTreeArrayNode(treeModels);
		logger.debug(responseJSON.toString());
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}