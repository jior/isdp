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

package com.glaf.base.modules.sys.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysRoleService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.utils.ParamUtil;
import com.glaf.base.utils.RequestUtil;
import com.glaf.core.base.TreeModel;
import com.glaf.core.cache.CacheUtils;
import com.glaf.core.res.MessageUtils;
import com.glaf.core.res.ViewMessage;
import com.glaf.core.res.ViewMessages;
import com.glaf.core.security.DigestUtil;
import com.glaf.core.service.ITableDataService;
import com.glaf.core.tree.helper.TreeHelper;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;

@Controller("/rs/sys/user")
@Path("/rs/sys/user")
public class SysUserResource {
	private static final Log logger = LogFactory.getLog(SysUserResource.class);

	protected SysApplicationService sysApplicationService;

	protected SysDepartmentService sysDepartmentService;

	protected SysRoleService sysRoleService;

	protected SysTreeService sysTreeService;

	protected SysUserService sysUserService;

	protected ITableDataService tableDataService;

	/**
	 * 增加角色用户
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("addRoleUser")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView addRoleUser(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		logger.debug("---------addRoleUser---------------------------");
		RequestUtils.setRequestParameterToAttribute(request);

		int roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		boolean success = false;

		String[] userIds = ParamUtil.getParameterValues(request, "id");
		for (int i = 0; i < userIds.length; i++) {
			SysUser user = sysUserService.findByAccount(userIds[i]);
			if (user != null) {
				sysUserService.createRoleUser(roleId, user.getAccount());
			}
			success = true;
		}

		ViewMessages messages = new ViewMessages();
		if (success) {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		return new ModelAndView("show_json_msg");
	}

	/**
	 * 批量删除信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("batchDelete")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView batchDelete(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		boolean ret = true;
		long[] id = ParamUtil.getLongParameterValues(request, "id");
		ret = sysUserService.deleteAll(id);
		ViewMessages messages = new ViewMessages();
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 删除角色用户
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("delRoleUser")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView delRoleUser(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		int roleId = ParamUtil.getIntParameter(request, "roleId", 0);
		SysRole role = sysRoleService.findById(roleId);
		boolean sucess = false;
		try {
			String[] userIds = ParamUtil.getParameterValues(request, "id");
			sysUserService.deleteRoleUsers(role, userIds);
			sucess = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			sucess = false;
		}

		ViewMessages messages = new ViewMessages();
		if (sucess) {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.delete_failure"));
		}
		MessageUtils.addMessages(request, messages);

		return new ModelAndView("show_json_msg");
	}

	/**
	 * 得到部门下所有部门列表
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

	@GET
	@POST
	@Path("json")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public byte[] json(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysUserQuery query = new SysUserQuery();
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
					rowJSON.put("id", sysUser.getActorId());
					rowJSON.put("actorId", sysUser.getAccount());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		}
		return result.toJSONString().getBytes("UTF-8");
	}

	/**
	 * 重置用户密码
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("resetPwd")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView resetPwd(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
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
			SysUser bean = sysUserService.findByAccount(id);

			if (bean != null && !bean.isSystemAdministrator()) {
				String newPwd = ParamUtil.getParameter(request, "newPwd");
				if (StringUtils.isNotEmpty(newPwd)) {
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
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("saveAdd")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView saveAdd(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser bean = new SysUser();
		SysDepartment department = sysDepartmentService.findById(ParamUtil
				.getIntParameter(request, "parent", 0));
		bean.setDepartment(department);
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
		} else {// 帐号存在
			ret = 1;
		}

		ViewMessages messages = new ViewMessages();
		if (ret == 2) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_success"));
		} else if (ret == 1) {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.existed"));
		} else {
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.add_failure"));
		}
		MessageUtils.addMessages(request, messages);

		// 显示列表页面
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 提交修改信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("saveModify")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView saveModify(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		String id = ParamUtil.getParameter(request, "id");
		SysUser bean = sysUserService.findByAccount(id);
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
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 提交修改信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("saveModifyInfo")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView saveModifyInfo(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser bean = RequestUtil.getLoginUser(request);
		boolean ret = false;
		if (bean != null) {
			SysUser user = sysUserService.findByAccount(bean.getActorId());
			user.setMobile(ParamUtil.getParameter(request, "mobile"));
			user.setEmail(ParamUtil.getParameter(request, "email"));
			user.setTelephone(ParamUtil.getParameter(request, "telephone"));
			user.setUpdateBy(RequestUtils.getActorId(request));
			ret = sysUserService.update(user);
			CacheUtils.clearUserCache(user.getAccount());
		}

		ViewMessages messages = new ViewMessages();
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 修改用户密码
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("savePwd")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView savePwd(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		SysUser bean = RequestUtil.getLoginUser(request);
		boolean ret = false;
		String oldPwd = ParamUtil.getParameter(request, "oldPwd");
		String newPwd = ParamUtil.getParameter(request, "newPwd");
		if (bean != null && StringUtils.isNotEmpty(oldPwd)
				&& StringUtils.isNotEmpty(newPwd)) {
			SysUser user = sysUserService.findByAccount(bean.getActorId());
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
		if (ret) {// 保存成功
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_success"));
		} else {// 保存失败
			messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
					"user.modify_failure"));
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	/**
	 * 设置用户角色
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("setRole")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public ModelAndView setRole(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		logger.debug(RequestUtils.getParameterMap(request));
		ViewMessages messages = new ViewMessages();
		String userId = ParamUtil.getParameter(request, "user_id");
		SysUser user = sysUserService.findByAccount(userId);// 查找用户对象

		if (user != null) {// 用户存在
			long[] id = ParamUtil.getLongParameterValues(request, "id");// 获取页面参数
			if (id != null) {
				Set<SysRole> newRoles = new HashSet<SysRole>();
				for (int i = 0; i < id.length; i++) {
					logger.debug("id[" + i + "]=" + id[i]);
					SysRole role = sysRoleService.findById(id[i]);// 查找角色对象
					if (role != null) {
						newRoles.add(role);// 加入到角色列表
					}
				}

				user.setUpdateBy(RequestUtils.getActorId(request));

				if (sysUserService.updateUserRole(user, newRoles)) {// 授权成功
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_success"));
				} else {// 保存失败
					messages.add(ViewMessages.GLOBAL_MESSAGE, new ViewMessage(
							"user.role_failure"));
				}
			}
		}
		MessageUtils.addMessages(request, messages);
		return new ModelAndView("show_json_msg");
	}

	@javax.annotation.Resource
	public void setSysApplicationService(
			SysApplicationService sysApplicationService) {
		this.sysApplicationService = sysApplicationService;
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

	@javax.annotation.Resource
	public void setTableDataService(ITableDataService tableDataService) {
		this.tableDataService = tableDataService;
	}

	@GET
	@POST
	@Path("userMenusJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] userMenusJson(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) throws IOException {
		String actorId = ParamUtil.getParameter(request, "actorId");
		actorId = RequestUtils.decodeString(actorId);
		long parentId = ParamUtil.getLongParameter(request, "parentId", 3);

		SysTree root = sysTreeService.findById(parentId);
		List<SysTree> list = sysApplicationService
				.getTreeWithApplicationList(parentId);
		List<TreeModel> treeModels = new ArrayList<TreeModel>();

		List<SysRole> roles = sysUserService.getUserRoles(actorId);

		if (roles != null && !roles.isEmpty()) {
			for (SysRole role : roles) {
				List<SysApplication> apps = sysApplicationService
						.getRoleApplications(role.getId());
				if (apps != null && !apps.isEmpty()) {
					for (SysTree tree : list) {
						for (SysApplication app : apps) {
							if (tree.getApp().getId() == app.getId()) {
								tree.setChecked(true);
							}
						}
					}
				}
			}
		}

		for (SysTree tree : list) {
			if (tree.getParentId() == root.getId()) {
				tree.setParentId(0);
			}
			if (tree.getId() != root.getId()) {
				treeModels.add(tree);
			}
		}

		logger.debug("treeModels:" + treeModels.size());
		TreeHelper treeHelper = new TreeHelper();
		JSONArray jsonArray = treeHelper.getTreeJSONArray(treeModels);
		logger.debug(jsonArray.toJSONString());
		return jsonArray.toJSONString().getBytes("UTF-8");

	}

}