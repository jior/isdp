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

@Controller("/dms/treevmain")
@RequestMapping("/dms/treevmain")
public class DmsTreevmainController {
	protected static final Log logger = LogFactory
			.getLog(DmsTreevmainController.class);

	protected DmsTreevmainService dmsTreevmainService;

	public DmsTreevmainController() {

	}

	@javax.annotation.Resource
	public void setDmsTreevmainService(DmsTreevmainService dmsTreevmainService) {
		this.dmsTreevmainService = dmsTreevmainService;
	}

	@RequestMapping("/save")
	public ModelAndView save(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsTreevmain dmsTreevmain = new DmsTreevmain();
		Tools.populate(dmsTreevmain, params);

		dmsTreevmain.setIndexId(RequestUtils.getInt(request, "indexId"));
		dmsTreevmain.setParentId(RequestUtils.getInt(request, "parentId"));
		dmsTreevmain.setIndexName(request.getParameter("indexName"));
		dmsTreevmain.setNlevel(RequestUtils.getInt(request, "nlevel"));
		dmsTreevmain.setNum(request.getParameter("num"));
		dmsTreevmain.setFilenum(request.getParameter("filenum"));
		dmsTreevmain.setContent(request.getParameter("content"));
		dmsTreevmain.setVflag(request.getParameter("vflag"));
		dmsTreevmain.setSindexName(request.getParameter("sindexName"));
		dmsTreevmain.setZtype(RequestUtils.getInt(request, "ztype"));
		dmsTreevmain.setContent2(request.getParameter("content2"));
		dmsTreevmain.setTopnode(request.getParameter("topnode"));
		dmsTreevmain.setNodeico(RequestUtils.getInt(request, "nodeico"));
		dmsTreevmain.setIntendofshow(RequestUtils.getInt(request,
				"intendofshow"));
		dmsTreevmain.setChoosePublishFlag(request
				.getParameter("choosePublishFlag"));

		dmsTreevmainService.save(dmsTreevmain);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/saveTreevmain")
	public byte[] saveTreevmain(HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		DmsTreevmain dmsTreevmain = new DmsTreevmain();
		try {
			Tools.populate(dmsTreevmain, params);
			dmsTreevmain.setIndexId(RequestUtils.getInt(request, "indexId"));
			dmsTreevmain.setParentId(RequestUtils.getInt(request, "parentId"));
			dmsTreevmain.setIndexName(request.getParameter("indexName"));
			dmsTreevmain.setNlevel(RequestUtils.getInt(request, "nlevel"));
			dmsTreevmain.setNum(request.getParameter("num"));
			dmsTreevmain.setFilenum(request.getParameter("filenum"));
			dmsTreevmain.setContent(request.getParameter("content"));
			dmsTreevmain.setVflag(request.getParameter("vflag"));
			dmsTreevmain.setSindexName(request.getParameter("sindexName"));
			dmsTreevmain.setZtype(RequestUtils.getInt(request, "ztype"));
			dmsTreevmain.setContent2(request.getParameter("content2"));
			dmsTreevmain.setTopnode(request.getParameter("topnode"));
			dmsTreevmain.setNodeico(RequestUtils.getInt(request, "nodeico"));
			dmsTreevmain.setIntendofshow(RequestUtils.getInt(request,
					"intendofshow"));

			this.dmsTreevmainService.save(dmsTreevmain);

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

		DmsTreevmain dmsTreevmain = dmsTreevmainService
				.getDmsTreevmainById(request.getParameter("id"));

		dmsTreevmain.setIndexId(RequestUtils.getInt(request, "indexId"));
		dmsTreevmain.setParentId(RequestUtils.getInt(request, "parentId"));
		dmsTreevmain.setIndexName(request.getParameter("indexName"));
		dmsTreevmain.setNlevel(RequestUtils.getInt(request, "nlevel"));
		dmsTreevmain.setNum(request.getParameter("num"));
		dmsTreevmain.setFilenum(request.getParameter("filenum"));
		dmsTreevmain.setContent(request.getParameter("content"));
		dmsTreevmain.setVflag(request.getParameter("vflag"));
		dmsTreevmain.setSindexName(request.getParameter("sindexName"));
		dmsTreevmain.setZtype(RequestUtils.getInt(request, "ztype"));
		dmsTreevmain.setContent2(request.getParameter("content2"));
		dmsTreevmain.setTopnode(request.getParameter("topnode"));
		dmsTreevmain.setNodeico(RequestUtils.getInt(request, "nodeico"));
		dmsTreevmain.setIntendofshow(RequestUtils.getInt(request,
				"intendofshow"));

		dmsTreevmainService.save(dmsTreevmain);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/delete")
	public void delete(HttpServletRequest request, ModelMap modelMap) {
		String id = RequestUtils.getString(request, "id");
		String ids = request.getParameter("ids");
		if (StringUtils.isNotEmpty(ids)) {
			StringTokenizer token = new StringTokenizer(ids, ",");
			while (token.hasMoreTokens()) {
				String x = token.nextToken();
				if (StringUtils.isNotEmpty(x)) {

				}
			}
		} else if (id != null) {

		}
	}

	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		request.removeAttribute("canSubmit");

		DmsTreevmain dmsTreevmain = dmsTreevmainService
				.getDmsTreevmainById(request.getParameter("id"));
		if (dmsTreevmain != null) {
			request.setAttribute("dmsTreevmain", dmsTreevmain);
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

		String x_view = ViewProperties.getString("dmsTreevmain.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/dms/treevmain/edit", modelMap);
	}

	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		DmsTreevmain dmsTreevmain = dmsTreevmainService
				.getDmsTreevmainById(request.getParameter("id"));
		request.setAttribute("dmsTreevmain", dmsTreevmain);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view);
		}

		String x_view = ViewProperties.getString("dmsTreevmain.view");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view);
		}

		return new ModelAndView("/dms/treevmain/view");
	}

	@RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
		String x_view = ViewProperties.getString("dmsTreevmain.query");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/dms/treevmain/query", modelMap);
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

		return new ModelAndView("/dms/treevmain/list", modelMap);
	}

}
