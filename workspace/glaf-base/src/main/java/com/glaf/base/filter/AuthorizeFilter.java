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

package com.glaf.base.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.utils.Authentication;
import com.glaf.base.utils.RequestUtil;

public class AuthorizeFilter implements Filter {
	private Log logger = LogFactory.getLog(AuthorizeFilter.class);
	private String url = "";
	private String require = "";
	private String errorUrl = "";

	/**
	 * ע��
	 */
	public void destroy() {
	}

	/**
	 * ����
	 * 
	 * @param request
	 *            ServletRequest
	 * @param response
	 *            ServletResponse
	 * @param chain
	 *            FilterChain
	 * @throws IOException
	 * @throws ServletException
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		// ��Ҫ��֤
		if ("true".equals(require)) {
			// ����û��Ƿ��Ѿ���¼
			SysUser bean = RequestUtil.getLoginUser(req);
			String uri = req.getRequestURI();
			logger.debug(uri);

			// �û�û�е�¼�ҵ�ǰҳ���ǵ�¼ҳ��
			logger.debug("ignoreUrl:" + ignoreUrl(uri));
			if (bean == null && !ignoreUrl(uri)) {// ��ʾ��½ҳ
				res.sendRedirect(req.getContextPath() + errorUrl);
				return;
			} else {
				if (bean != null) {
					if (!bean.isSystemAdmin()) {
						if (StringUtils.contains(uri, "/mx/sys/role")
								|| StringUtils.contains(uri,
										"/mx/sys/department")
								|| StringUtils.contains(uri,
										"/mx/sys/application")
								|| StringUtils.contains(uri,
										"/mx/sys/scheduler")
								|| StringUtils
										.contains(uri, "/mx/sys/function")
								|| StringUtils.contains(uri, "/mx/sys/todo")
								|| StringUtils.contains(uri, "/mx/sys/user")
								|| StringUtils
										.contains(uri, "/mx/sys/deptRole")
								|| StringUtils.contains(uri,
										"/mx/sys/sysUserRole")
								|| StringUtils.contains(uri,
										"/mx/sys/workCalendar")) {
							res.sendRedirect(errorUrl);
							return;
						}
					}
					Authentication.setAuthenticatedUser(bean);
					Authentication.setAuthenticatedAccount(bean.getAccount());
					com.glaf.core.security.Authentication
							.setAuthenticatedActorId(bean.getAccount());
				}
			}
		}
		chain.doFilter(request, response);
	}

	/**
	 * �Ƿ���Ե�ǰҳ��
	 * 
	 * @param uri
	 * @return
	 */
	private boolean ignoreUrl(String uri) {
		boolean ret = false;
		String[] ignoreUrls = url.split(",");
		for (int i = 0; i < ignoreUrls.length; i++) {
			if (StringUtils.contains(uri, ignoreUrls[i])) {
				ret = true;
				break;
			}
		}
		return ret;
	}

	/**
	 * ��ʼ��Filter
	 * 
	 * @param config
	 *            FilterConfig
	 * @throws ServletException
	 */
	public void init(FilterConfig config) throws ServletException {
		this.url = config.getInitParameter("login_url");
		this.require = config.getInitParameter("require");
		this.errorUrl = config.getInitParameter("error_url");

		logger.info("url:" + url);
		logger.info("require:" + require);
		logger.info("errorUrl:" + errorUrl);

	}
}