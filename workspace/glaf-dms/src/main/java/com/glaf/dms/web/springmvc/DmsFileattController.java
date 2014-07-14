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

package com.glaf.dms.web.springmvc;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.glaf.core.config.ViewProperties;
import com.glaf.core.util.*;

import com.glaf.dms.domain.*;
import com.glaf.dms.service.*;

/**
 * 
 * SpringMVC控制器
 * 
 */

@Controller("/dms/fileatt")
@RequestMapping("/dms/fileatt")
public class DmsFileattController {
	protected static final Log logger = LogFactory
			.getLog(DmsFileattController.class);

	protected DmsFileattService dmsFileattService;

	public DmsFileattController() {

	}

	@javax.annotation.Resource
	public void setDmsFileattService(DmsFileattService dmsFileattService) {
		this.dmsFileattService = dmsFileattService;
	}

	@RequestMapping("/save")
	public ModelAndView save(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsFileatt dmsFileatt = new DmsFileatt();
		Tools.populate(dmsFileatt, params);

		dmsFileatt.setTopid(request.getParameter("topid"));
		dmsFileatt.setNum(request.getParameter("num"));
		dmsFileatt.setActor(request.getParameter("actor"));
		dmsFileatt.setFname(request.getParameter("fname"));
		dmsFileatt.setFileName(request.getParameter("fileName"));
		dmsFileatt.setVision(request.getParameter("vision"));
		dmsFileatt.setCtime(RequestUtils.getDate(request, "ctime"));
		dmsFileatt.setFilesize(RequestUtils.getInt(request, "filesize"));
		dmsFileatt.setVisID(request.getParameter("visID"));
		dmsFileatt.setAttID(request.getParameter("attID"));
		dmsFileatt.setIsTextContent(RequestUtils.getInt(request,
				"isTextContent"));
		dmsFileatt.setChoosePublishFlag(request
				.getParameter("choosePublishFlag"));
		dmsFileatt.setChoosePublishTime(RequestUtils.getLong(request,
				"choosePublishTime"));
		dmsFileatt.setPublishdiskid(RequestUtils.getInt(request,
				"publishdiskid"));

		// dmsFileatt.setCreateBy(actorId);

		dmsFileattService.save(dmsFileatt);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/saveFileatt")
	public byte[] saveFileatt(HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		DmsFileatt dmsFileatt = new DmsFileatt();
		try {
			Tools.populate(dmsFileatt, params);
			dmsFileatt.setTopid(request.getParameter("topid"));
			dmsFileatt.setNum(request.getParameter("num"));
			dmsFileatt.setActor(request.getParameter("actor"));
			dmsFileatt.setFname(request.getParameter("fname"));
			dmsFileatt.setFileName(request.getParameter("fileName"));
			dmsFileatt.setVision(request.getParameter("vision"));
			dmsFileatt.setCtime(RequestUtils.getDate(request, "ctime"));
			dmsFileatt.setFilesize(RequestUtils.getInt(request, "filesize"));
			dmsFileatt.setVisID(request.getParameter("visID"));
			dmsFileatt.setAttID(request.getParameter("attID"));
			dmsFileatt.setIsTextContent(RequestUtils.getInt(request,
					"isTextContent"));

			// dmsFileatt.setCreateBy(actorId);
			this.dmsFileattService.save(dmsFileatt);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsFileatt dmsFileatt = dmsFileattService.getDmsFileatt(request
				.getParameter("fileId"));

		dmsFileatt.setTopid(request.getParameter("topid"));
		dmsFileatt.setNum(request.getParameter("num"));
		dmsFileatt.setActor(request.getParameter("actor"));
		dmsFileatt.setFname(request.getParameter("fname"));
		dmsFileatt.setFileName(request.getParameter("fileName"));
		dmsFileatt.setVision(request.getParameter("vision"));
		dmsFileatt.setCtime(RequestUtils.getDate(request, "ctime"));
		dmsFileatt.setFilesize(RequestUtils.getInt(request, "filesize"));
		dmsFileatt.setVisID(request.getParameter("visID"));
		dmsFileatt.setAttID(request.getParameter("attID"));
		dmsFileatt.setIsTextContent(RequestUtils.getInt(request,
				"isTextContent"));

		dmsFileattService.save(dmsFileatt);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/delete")
	public void delete(HttpServletRequest request, ModelMap modelMap) {
		String fileId = RequestUtils.getString(request, "fileId");
		String fileIds = request.getParameter("fileIds");
		if (StringUtils.isNotEmpty(fileIds)) {
			StringTokenizer token = new StringTokenizer(fileIds, ",");
			while (token.hasMoreTokens()) {
				String x = token.nextToken();
				if (StringUtils.isNotEmpty(x)) {

				}
			}
		} else if (fileId != null) {

		}
	}

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		request.removeAttribute("canSubmit");

		DmsFileatt dmsFileatt = dmsFileattService.getDmsFileatt(request
				.getParameter("fileId"));
		if (dmsFileatt != null) {
			request.setAttribute("dmsFileatt", dmsFileatt);
		}

		boolean canUpdate = false;
		String x_method = request.getParameter("x_method");
		if (StringUtils.equals(x_method, "submit")) {

		}

		request.setAttribute("canUpdate", canUpdate);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("dmsFileatt.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/dms/fileatt/edit", modelMap);
	}

	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		DmsFileatt dmsFileatt = dmsFileattService.getDmsFileatt(request
				.getParameter("fileId"));
		request.setAttribute("dmsFileatt", dmsFileatt);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view);
		}

		String x_view = ViewProperties.getString("dmsFileatt.view");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view);
		}

		return new ModelAndView("/dms/fileatt/view");
	}

	@RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
		String x_view = ViewProperties.getString("dmsFileatt.query");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/dms/fileatt/query", modelMap);
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

		String requestURI = request.getRequestURI();
		if (request.getQueryString() != null) {
			request.setAttribute(
					"fromUrl",
					RequestUtils.encodeURL(requestURI + "?"
							+ request.getQueryString()));
		} else {
			request.setAttribute("fromUrl", RequestUtils.encodeURL(requestURI));
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/dms/fileatt/list", modelMap);
	}

}
