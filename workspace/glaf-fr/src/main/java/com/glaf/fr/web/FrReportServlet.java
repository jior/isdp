package com.glaf.fr.web;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.glaf.core.security.SecurityUtils;
import com.glaf.core.util.FileUtils;

public class FrReportServlet extends HttpServlet {

	protected final static Log logger = LogFactory
			.getLog(FrReportServlet.class);

	private static final long serialVersionUID = 1L;

	private static String key;

	private static String reprotService;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	@Override
	public void init(ServletConfig config) {
		String key_file = config.getInitParameter("security_key_file");
		if (StringUtils.isEmpty(key_file)) {
			key_file = config.getServletContext().getRealPath("/")
					+ "/WEB-INF/key";
		}
		logger.info("load key file:" + key_file);
		key = FileUtils.readFile(key_file);
		logger.debug("key:" + key);
		reprotService = config.getInitParameter("reprotService");
		if (StringUtils.isEmpty(reprotService)) {
			reprotService = "/ReportServer";
		}
	}

	protected void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		StringBuffer buffer = new StringBuffer();
		buffer.append(request.getContextPath()).append(reprotService);
		java.util.Enumeration<String> names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = request.getParameter(name);
			if (StringUtils.isNotEmpty(value)) {
				if (StringUtils.endsWith(name, "_encode")) {
					String tmp = SecurityUtils.decode(key, value);
					buffer.append("&").append(name).append("=").append(tmp);
				}
				if (StringUtils.endsWith(name, "_json_encode")) {
					String tmp = SecurityUtils.decode(key, value);
					JSONObject jsonObject = JSON.parseObject(tmp);
					Iterator<Entry<String, Object>> iterator = jsonObject
							.entrySet().iterator();
					while (iterator.hasNext()) {
						Entry<String, Object> entry = iterator.next();
						String key = (String) entry.getKey();
						Object x = entry.getValue();
						if (x != null) {
							buffer.append("&").append(key).append("=")
									.append(x);
						}
					}
				} else {
					buffer.append("&").append(name).append("=").append(value);
				}
			}
		}
		response.sendRedirect(buffer.toString());
	}

}
