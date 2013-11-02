package com.glaf.isdp.web.springmvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellTreedotService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@RequestMapping("/isdp/ui/combo")
public class IsdpUIComboController {
	protected static final Log logger = LogFactory
			.getLog(IsdpUIComboController.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected INetRoleUseService netRoleUseService;

	@RequestMapping("/basic")
	public ModelAndView base(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		return new ModelAndView("/isdp/ui/combo/basic");
	}

	@RequestMapping("/grid")
	public ModelAndView grid(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		return new ModelAndView("/isdp/ui/combo/grid");
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

	@RequestMapping("/tree")
	public ModelAndView tree(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		logger.debug("paramMap:" + paramMap);
		return new ModelAndView("/isdp/ui/combo/tree");
	}

}
