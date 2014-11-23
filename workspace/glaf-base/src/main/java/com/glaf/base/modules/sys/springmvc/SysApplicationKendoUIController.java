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

package com.glaf.base.modules.sys.springmvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.base.modules.Constants;
import com.glaf.base.modules.sys.model.SysApplication;
import com.glaf.base.modules.sys.model.SysRole;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.query.SysApplicationQuery;
import com.glaf.base.modules.sys.service.SysApplicationService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.util.SysApplicationDomainFactory;
import com.glaf.base.utils.ParamUtil;
import com.glaf.core.base.DataRequest;
import com.glaf.core.base.DataRequest.SortDescriptor;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.util.JsonUtils;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.Tools;

@Controller("/system/application")
@RequestMapping("/system/application")
public class SysApplicationKendoUIController {
	private static final Log logger = LogFactory
			.getLog(SysApplicationKendoUIController.class);

	private SysApplicationService sysApplicationService;

	private SysTreeService sysTreeService;

	/**
	 * 显示修改页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		// RequestUtils.setRequestParameterToAttribute(request);
		long appId = ParamUtil.getIntParameter(request, "appId", 0);
		if (appId != 0) {
			SysApplication bean = sysApplicationService.findById(appId);
			request.setAttribute("application", bean);
		}

		SysTree parent = sysTreeService.getSysTreeByCode(Constants.TREE_APP);
		List<SysTree> list = new ArrayList<SysTree>();
		parent.setDeep(0);
		list.add(parent);
		sysTreeService.getSysTree(list, (int) parent.getId(), 1);
		request.setAttribute("treeList", list);

		String x_view = ViewProperties.getString("application.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/app/edit", modelMap);
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request,
			@RequestBody DataRequest dataRequest) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysApplicationQuery query = new SysApplicationQuery();
		Tools.populate(query, params);
		query.setDataRequest(dataRequest);
		SysApplicationDomainFactory.processDataRequest(dataRequest);
		logger.debug("dataRequest:" + dataRequest);
		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "kendoui";
		}
		int start = 0;
		int limit = PageResult.DEFAULT_PAGE_SIZE;

		int pageNo = dataRequest.getPage();
		limit = dataRequest.getPageSize();

		start = (pageNo - 1) * limit;

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = PageResult.DEFAULT_PAGE_SIZE;
		}

		JSONObject result = new JSONObject();
		int total = sysApplicationService
				.getSysApplicationCountByQueryCriteria(query);
		if (total > 0) {
			result.put("total", total);
			result.put("totalCount", total);
			result.put("totalRecords", total);
			result.put("start", start);
			result.put("startIndex", start);
			result.put("limit", limit);
			result.put("pageSize", limit);

			String orderName = null;
			String order = null;

			if (dataRequest.getSort() != null
					&& !dataRequest.getSort().isEmpty()) {
				SortDescriptor sort = dataRequest.getSort().get(0);
				orderName = sort.getField();
				order = sort.getDir();
				logger.debug("orderName:" + orderName);
				logger.debug("order:" + order);
			}

			if (StringUtils.isNotEmpty(orderName)) {
				query.setSortColumn(orderName);
				if (StringUtils.equals(order, "desc")) {
					query.setSortOrder(" desc ");
				}
			}

			List<SysApplication> list = sysApplicationService
					.getSysApplicationsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysApplication sysApplication : list) {
					JSONObject rowJSON = sysApplication.toJsonObject();
					rowJSON.put("id", sysApplication.getId());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		} else {
			result.put("total", total);
			result.put("totalCount", total);
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
		}
		return result.toString().getBytes("UTF-8");
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
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("application.list");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/app/list", modelMap);
	}

	/**
	 * 显示修改页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/permission")
	public ModelAndView permission(HttpServletRequest request, ModelMap modelMap) {
		// RequestUtils.setRequestParameterToAttribute(request);
		long id = ParamUtil.getIntParameter(request, "id", 0);
		if (id > 0) {
			SysApplication bean = sysApplicationService.findById(id);
			if (bean != null) {
				List<SysRole> roles = sysApplicationService
						.getApplicationRoleWithUsers(bean.getId());
				request.setAttribute("bean", bean);
				request.setAttribute("roles", roles);
			}
		}

		String x_view = ViewProperties.getString("application.permission");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/app/permission", modelMap);
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveAdd")
	@ResponseBody
	public byte[] saveAdd(HttpServletRequest request, ModelMap modelMap) {
		MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;

		SysApplication bean = new SysApplication();
		bean.setName(ParamUtil.getParameter(req, "name"));
		bean.setCode(ParamUtil.getParameter(req, "code"));
		bean.setDesc(ParamUtil.getParameter(req, "desc"));
		bean.setUrl(ParamUtil.getParameter(req, "url"));
		bean.setShowMenu(ParamUtil.getIntParameter(req, "showMenu", 0));
		bean.setLinkParam(ParamUtil.getParameter(req, "linkParam"));
		bean.setPrintParam(ParamUtil.getParameter(req, "printParam"));
		bean.setRefId1(ParamUtil.getIntParameter(req, "refId1", 0));
		bean.setRefName1(ParamUtil.getParameter(req, "refName1"));
		bean.setRefId2(ParamUtil.getIntParameter(req, "refId2", 0));
		bean.setRefName2(ParamUtil.getParameter(req, "refName2"));
		bean.setRefId3(ParamUtil.getIntParameter(req, "refId3", 0));
		bean.setRefName3(ParamUtil.getParameter(req, "refName3"));
		bean.setRefId4(ParamUtil.getIntParameter(req, "refId4", 0));
		bean.setRefName4(ParamUtil.getParameter(req, "refName4"));
		bean.setRefId5(ParamUtil.getIntParameter(req, "refId5", 0));
		bean.setRefName5(ParamUtil.getParameter(req, "refName5"));
		bean.setCreateBy(RequestUtils.getActorId(request));
		SysTree node = new SysTree();
		node.setName(bean.getName());
		node.setDesc(bean.getName());
		node.setCode(bean.getCode());
		node.setCreateBy(RequestUtils.getActorId(request));
		node.setParentId((long) ParamUtil.getIntParameter(req, "parent", 0));
		bean.setNode(node);

		Map<String, MultipartFile> fileMap = req.getFileMap();
		Set<Entry<String, MultipartFile>> entrySet = fileMap.entrySet();
		for (Entry<String, MultipartFile> entry : entrySet) {
			MultipartFile mFile = entry.getValue();
			if (StringUtils.equals(mFile.getName(), "linkFileName")) {
				if (mFile.getOriginalFilename() != null && mFile.getSize() > 0) {
					String filename = mFile.getOriginalFilename();
					bean.setLinkFileName(filename);
					bean.setLinkType("T");
					try {
						bean.setLinkFileContent(mFile.getBytes());
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			}
			if (StringUtils.equals(mFile.getName(), "printFileName")) {
				if (mFile.getOriginalFilename() != null && mFile.getSize() > 0) {
					String filename = mFile.getOriginalFilename();
					bean.setPrintFileName(filename);
					bean.setPrintType("T");
					try {
						bean.setPrintFileContent(mFile.getBytes());
					} catch (IOException ex) {
						ex.printStackTrace();
					}
				}
			}
		}

		try {
			boolean ret = sysApplicationService.create(bean);
			if (ret) {// 保存成功
				return ResponseUtils.responseResult(true);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}

		return ResponseUtils.responseResult(false);
	}

	/**
	 * 提交修改信息
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/saveModify")
	@ResponseBody
	public byte[] saveModify(HttpServletRequest request, ModelMap modelMap) {
		MultipartHttpServletRequest req = (MultipartHttpServletRequest) request;
		long appId = ParamUtil.getIntParameter(req, "appId", 0);
		SysApplication bean = sysApplicationService.findById(appId);
		if (bean != null) {
			bean.setName(ParamUtil.getParameter(req, "name"));
			bean.setCode(ParamUtil.getParameter(req, "code"));
			bean.setDesc(ParamUtil.getParameter(req, "desc"));
			bean.setUrl(ParamUtil.getParameter(req, "url"));
			bean.setShowMenu(ParamUtil.getIntParameter(req, "showMenu", 0));
			bean.setLinkParam(ParamUtil.getParameter(req, "linkParam"));
			bean.setPrintParam(ParamUtil.getParameter(req, "printParam"));
			bean.setUpdateBy(RequestUtils.getActorId(request));
			bean.setLocked(ParamUtil.getIntParameter(req, "locked", 0));
			bean.setRefId1(ParamUtil.getIntParameter(req, "refId1", 0));
			bean.setRefName1(ParamUtil.getParameter(req, "refName1"));
			bean.setRefId2(ParamUtil.getIntParameter(req, "refId2", 0));
			bean.setRefName2(ParamUtil.getParameter(req, "refName2"));
			bean.setRefId3(ParamUtil.getIntParameter(req, "refId3", 0));
			bean.setRefName3(ParamUtil.getParameter(req, "refName3"));
			bean.setRefId4(ParamUtil.getIntParameter(req, "refId4", 0));
			bean.setRefName4(ParamUtil.getParameter(req, "refName4"));
			bean.setRefId5(ParamUtil.getIntParameter(req, "refId5", 0));
			bean.setRefName5(ParamUtil.getParameter(req, "refName5"));

			SysTree node = bean.getNode();
			node.setName(bean.getName());
			node.setCode(bean.getCode());
			node.setDesc(bean.getName());
			node.setParentId(ParamUtil.getLongParameter(req, "parent", 0));
			bean.setNode(node);

			Map<String, MultipartFile> fileMap = req.getFileMap();
			Set<Entry<String, MultipartFile>> entrySet = fileMap.entrySet();
			for (Entry<String, MultipartFile> entry : entrySet) {
				MultipartFile mFile = entry.getValue();
				if (StringUtils.equals(mFile.getName(), "linkFileName")) {
					if (mFile.getOriginalFilename() != null
							&& mFile.getSize() > 0) {
						String filename = mFile.getOriginalFilename();
						bean.setLinkFileName(filename);
						bean.setLinkType("T");
						try {
							bean.setLinkFileContent(mFile.getBytes());
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
				if (StringUtils.equals(mFile.getName(), "printFileName")) {
					if (mFile.getOriginalFilename() != null
							&& mFile.getSize() > 0) {
						String filename = mFile.getOriginalFilename();
						bean.setPrintFileName(filename);
						bean.setPrintType("T");
						try {
							bean.setPrintFileContent(mFile.getBytes());
						} catch (IOException ex) {
							ex.printStackTrace();
						}
					}
				}
			}
		}
		boolean ret = false;
		try {
			ret = sysApplicationService.update(bean);
			if (ret) {// 保存成功
				return ResponseUtils.responseResult(true);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}

		return ResponseUtils.responseResult(false);
	}

	@javax.annotation.Resource
	public void setSysApplicationService(
			SysApplicationService sysApplicationService) {
		this.sysApplicationService = sysApplicationService;
	}

	@javax.annotation.Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;
	}

	@RequestMapping("/showPermission")
	public ModelAndView showPermission(HttpServletRequest request,
			ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("application.showPermission");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/kendoui/sys/app/permission_frame", modelMap);
	}

}