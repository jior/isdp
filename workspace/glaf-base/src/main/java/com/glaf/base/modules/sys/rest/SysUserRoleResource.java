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

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glaf.base.modules.sys.service.SysUserRoleService;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;

@Controller("/rs/sys/userRole")
@Path("/rs/sys/userRole")
public class SysUserRoleResource {
	private static final Log logger = LogFactory
			.getLog(SysUserRoleResource.class);

	private SysUserRoleService sysUserRoleService;

	@POST
	@Path("addRole")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] addRole(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserId = RequestUtils.getString(request, "toUserId");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		int mark = RequestUtils.getInt(request, "mark");
		String processNames = request.getParameter("processNames");
		String processDescriptions = request
				.getParameter("processDescriptions");
		if (!sysUserRoleService.isAuthorized(fromUserId, toUserId)) {// 已授权
			sysUserRoleService.addRole(fromUserId, toUserId, startDate,
					endDate, mark, processNames, processDescriptions);
			return ResponseUtils.responseResult(true);
		}
		return ResponseUtils.responseResult(false);
	}

	@POST
	@Path("addRoleUser")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] addRoleUser(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserIds = request.getParameter("toUserIds");
		String startDate = request.getParameter("startDate");
		String endDate = request.getParameter("endDate");
		int mark = RequestUtils.getInt(request, "mark");
		String processNames = request.getParameter("processNames");
		String processDescriptions = request
				.getParameter("processDescriptions");
		String[] ids = toUserIds.split(",");
		for (int i = 0; i < ids.length; i++) {
			String toUserId = ids[i];
			if (!sysUserRoleService.isAuthorized(fromUserId, toUserId)) {// 已授权
				sysUserRoleService.addRole(fromUserId, toUserId, startDate,
						endDate, mark, processNames, processDescriptions);
				return ResponseUtils.responseResult(true);
			}
		}
		return ResponseUtils.responseResult(false);
	}

	@Path("removeRole")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] removeRole(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserId = RequestUtils.getString(request, "toUserId");
		sysUserRoleService.removeRole(fromUserId, toUserId);
		return ResponseUtils.responseResult(true);
	}

	@Path("removeRoleUser")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] removeRoleUser(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String fromUserId = RequestUtils.getString(request, "fromUserId");
		String toUserIds = request.getParameter("toUserIds");
		logger.info("toUserIds:" + toUserIds);
		String[] ids = toUserIds.split(",");
		for (int i = 0; i < ids.length; i++) {
			String toUserId = ids[i];
			sysUserRoleService.removeRole(fromUserId, toUserId);
		}
		return ResponseUtils.responseResult(true);
	}

	@javax.annotation.Resource
	public void setSysUserRoleService(SysUserRoleService sysUserRoleService) {
		this.sysUserRoleService = sysUserRoleService;
	}

}