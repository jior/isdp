package com.glaf.isdp.web.springmvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@RequestMapping("/isdp/sys/role")
public class IsdpRoleController {
	protected static final Log logger = LogFactory
			.getLog(IsdpRoleController.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected INetRoleUseService netRoleUseService;

	@RequestMapping("/choose")
	public ModelAndView choose(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		NetRoleQuery query = new NetRoleQuery();
		List<NetRole> roles = netRoleService.list(query);
		request.setAttribute("roles", roles);
		String objectIds = request.getParameter("objectIds");
		List<String> selecteds = StringTools.split(objectIds);
		request.setAttribute("selecteds", selecteds);
		return new ModelAndView("/isdp/sys/role/choose");
	}

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		String roleId = request.getParameter("roleId");

		NetRole netRole = null;
		if (StringUtils.isNotEmpty(roleId) && StringUtils.isNumeric(roleId)) {
			netRole = netRoleService.getNetRole(Integer.parseInt(roleId));
			request.setAttribute("role", netRole);
		}

		return new ModelAndView("/isdp/sys/role/edit");
	}

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		return new ModelAndView("/isdp/sys/role/list");
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
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
