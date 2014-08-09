package com.glaf.isdp.web.springmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.query.UserInfoQuery;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@RequestMapping("/isdp/sys/user")
public class IsdpUserController {
	protected static final Log logger = LogFactory
			.getLog(IsdpUserController.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected INetRoleUseService netRoleUseService;

	@RequestMapping("/choose")
	public ModelAndView choose(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		UserInfoQuery query = new UserInfoQuery();
		List<UserInfo> users = userInfoService.list(query);
		request.setAttribute("users", users);
		return new ModelAndView("/isdp/sys/user/choose");
	}

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		String userId = request.getParameter("userId_enc");
		UserInfo user = null;
		if (StringUtils.isNotEmpty(userId)) {
			userId = RequestUtils.decodeString(userId);
			user = userInfoService.getUserInfo(userId);
			request.setAttribute("user", user);
			List<NetRole> roles = netRoleService.getNetRolesByUserId(userId);
			if (roles != null && !roles.isEmpty()) {
				List<Integer> selecteds = new ArrayList<Integer>();
				for (NetRole role : roles) {
					selecteds.add(role.getId());
				}
				request.setAttribute("selecteds", selecteds);
			}
		}

		NetRoleQuery query = new NetRoleQuery();
		List<NetRole> roles = netRoleService.list(query);
		request.setAttribute("roles", roles);

		return new ModelAndView("/isdp/sys/user/edit");
	}

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		UserInfoQuery query = new UserInfoQuery();
		List<UserInfo> users = userInfoService.list(query);
		request.setAttribute("users", users);
		String objectIds = request.getParameter("objectIds");
		List<String> selecteds = StringTools.split(objectIds);
		request.setAttribute("selecteds", selecteds);
		return new ModelAndView("/isdp/sys/user/list");
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setNetRoleService(INetRoleService netRoleService) {
		this.netRoleService = netRoleService;
	}

	@javax.annotation.Resource
	public void setNetRoleUseService(INetRoleUseService netRoleUseService) {
		this.netRoleUseService = netRoleUseService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

}
