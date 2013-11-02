package com.glaf.isdp.web.springmvc;

import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glaf.core.config.Environment;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.context.ContextFactory;
import com.glaf.core.domain.SysLog;
import com.glaf.core.identity.User;
import com.glaf.core.security.LoginContext;
import com.glaf.core.security.IdentityFactory;
import com.glaf.core.service.ISysLogService;
import com.glaf.core.util.ClassUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.web.callback.CallbackProperties;
import com.glaf.core.web.callback.LoginCallback;
import com.glaf.shiro.ShiroSecurity;

@Controller
@RequestMapping("/isdp/login")
public class IsdpLoginController {
	protected final static Log logger = LogFactory
			.getLog(IsdpLoginController.class);

	protected ISysLogService sysLogService;

	@RequestMapping
	public String login(HttpServletRequest request, HttpServletResponse response) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("x");
		params.remove("y");
		ModelMap modelMap = new ModelMap();
		modelMap.putAll(params);
		logger.debug("params:" + params);
		User user = null;
		LoginContext loginContext = null;

		String actorId = request.getParameter("x");
		String password = request.getParameter("y");
		String systemName = request
				.getParameter(Environment.CURRENT_SYSTEM_NAME);

		String redirectUrl = request.getParameter("redirectUrl");
		String controller = request.getParameter("controller");
		String forward = request.getParameter("forward");

		if (systemName != null) {
			Environment.setCurrentSystemName(systemName);
		}

		if (StringUtils.isNotEmpty(actorId) && StringUtils.isNotEmpty(password)) {
			actorId = actorId.toLowerCase();
			logger.debug("actorId:" + actorId);
			user = IdentityFactory.getUser(actorId);
			if (user != null) {
				if (user.getLocked() != 0) {
					request.setAttribute("error_message", "用户名已经停用！");
					return "/modules/login";
				}
				boolean isAuthenticated = false;
				isAuthenticated = IdentityFactory.checkPassword(actorId,
						password);
				if (!isAuthenticated) {
					request.setAttribute("error_message", "密码不正确！");
					return "/modules/login";
				}
			}
		}

		if (user != null && user.getLocked() == 0) {

			if (loginContext == null) {
				loginContext = IdentityFactory.getLoginContext(user
						.getActorId());
			}

			user.setLastLoginDate(new Date());
			user.setLoginIP(RequestUtils.getIPAddress(request));
			loginContext.setUser(user);
			loginContext.setSystemType(100);

			logger.debug("Roles:" + loginContext.getRoles());
			logger.debug("Permissions:" + loginContext.getPermissions());

			if (!"true".equals(System.getProperty("jmeter"))) {
				try {
					SysLog sysLog = new SysLog();
					sysLog.setAccount(loginContext.getActorId());
					sysLog.setCreateTime(new Date());
					sysLog.setFlag(1);
					sysLog.setOperate("Login");
					sysLog.setIp(RequestUtils.getIPAddress(request));
					sysLogService.create(sysLog);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			Map<String, Object> attributes = new HashMap<String, Object>();
			attributes.put(Environment.CURRENT_SYSTEM_NAME, systemName);

			RequestUtils.setLoginUser(request, response, systemName, actorId);

			logger.info(user.getName() + "已经登录系统");

			Properties props = CallbackProperties.getProperties();
			if (props != null && props.keys().hasMoreElements()) {
				Enumeration<?> e = props.keys();
				while (e.hasMoreElements()) {
					String className = (String) e.nextElement();
					try {
						Object obj = ClassUtils.instantiateObject(className);
						if (obj instanceof LoginCallback) {
							LoginCallback callback = (LoginCallback) obj;
							callback.afterLogin(user.getActorId(), request,
									response);
						}
					} catch (Exception ex) {
						ex.printStackTrace();
						logger.error(ex);
					}
				}
			}

			if (StringUtils.isNotEmpty(redirectUrl)) {
				if (!redirectUrl.startsWith(request.getContextPath())) {
					redirectUrl = request.getContextPath() + redirectUrl;
				}
				if (redirectUrl.indexOf("?") == -1) {
					redirectUrl = redirectUrl + "?q=1";
				}
				redirectUrl += "&" + RequestUtils.getRequestParameters(request);
				logger.debug("redirect:" + redirectUrl);
				try {
					response.sendRedirect(redirectUrl);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return null;
			} else if (StringUtils.isNotEmpty(controller)) {
				logger.debug("controller:" + controller);
				Object object = ContextFactory.getBean(controller);
				if (object != null) {
					try {
						logger.debug("bean:" + object.getClass().getName());

					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				return null;
			} else if (StringUtils.isNotEmpty(forward)) {
				try {
					forward = RequestUtils.decodeURL(forward);
					request.getRequestDispatcher(forward).forward(request,
							response);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
				return null;
			}

			String view = "/modules/main";
			String x_view = ViewProperties.getString("sys_login.main");
			if (StringUtils.isNotEmpty(x_view)) {
				view = x_view;
			}
			return view;
		} else {
			request.setAttribute("error_message", "用户名不存在！");
			String view = "/modules/login";
			String x_view = ViewProperties.getString("sys_login.login");
			if (StringUtils.isNotEmpty(x_view)) {
				view = x_view;
			}
			return view;
		}

	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("prepare logout system...");
		LoginContext loginContext = RequestUtils.getLoginContext(request);
		if (loginContext != null) {

			SysLog sysLog = new SysLog();
			sysLog.setAccount(loginContext.getActorId());
			sysLog.setCreateTime(new Date());
			sysLog.setFlag(1);
			sysLog.setOperate("Logout");
			sysLog.setIp(RequestUtils.getIPAddress(request));
			sysLogService.create(sysLog);

			RequestUtils.removeLoginUser(request, response);

			try {
				ShiroSecurity.logout();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

		String view = "/modules/logout";
		String x_view = ViewProperties.getString("sys_login.logout");
		if (StringUtils.isNotEmpty(x_view)) {
			view = x_view;
		}

		return view;
	}

	@javax.annotation.Resource
	public void setSysLogService(ISysLogService sysLogService) {
		this.sysLogService = sysLogService;
	}

}
