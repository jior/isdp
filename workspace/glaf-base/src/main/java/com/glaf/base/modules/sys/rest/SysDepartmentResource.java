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

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.base.modules.sys.model.SysDepartment;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.query.SysDepartmentQuery;
import com.glaf.base.modules.sys.query.SysTreeQuery;
import com.glaf.base.modules.sys.service.SysDepartmentService;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.util.SysDepartmentDomainFactory;
import com.glaf.base.utils.ParamUtil;
import com.glaf.core.base.DataRequest;
import com.glaf.core.base.TreeModel;
import com.glaf.core.base.DataRequest.SortDescriptor;
import com.glaf.core.tree.helper.JacksonTreeHelper;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.Tools;

@Controller("/rs/sys/department")
@Path("/rs/sys/department")
public class SysDepartmentResource {
	private static final Log logger = LogFactory
			.getLog(SysDepartmentResource.class);

	protected SysDepartmentService sysDepartmentService;

	protected SysTreeService sysTreeService;

	/**
	 * 批量删除信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("batchDelete")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] batchDelete(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		boolean ret = true;
		long[] id = ParamUtil.getLongParameterValues(request, "id");
		ret = sysDepartmentService.deleteAll(id);

		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}
		return ResponseUtils.responseResult(false);
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("create")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_JSON })
	public byte[] create(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		// 增加部门时，同时要增加对应节点
		SysDepartment bean = new SysDepartment();
		bean.setName(ParamUtil.getParameter(request, "name"));
		bean.setDesc(ParamUtil.getParameter(request, "desc"));
		bean.setCode(ParamUtil.getParameter(request, "code"));
		bean.setCode2(ParamUtil.getParameter(request, "code2"));
		bean.setLevel(RequestUtils.getInt(request, "level"));
		bean.setNo(ParamUtil.getParameter(request, "no"));
		bean.setCreateTime(new Date());

		SysTree node = new SysTree();
		node.setCreateBy(RequestUtils.getActorId(request));
		node.setName(bean.getName());
		node.setDesc(bean.getName());
		node.setCode(bean.getCode());
		node.setParentId(ParamUtil.getLongParameter(request, "parent", 0));
		bean.setNode(node);
		bean.setCreateBy(RequestUtils.getActorId(request));
		boolean ret = sysDepartmentService.create(bean);

		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
	}

	@POST
	@Path("data")
	@Produces({ MediaType.APPLICATION_JSON })
	@ResponseBody
	public byte[] data(@Context HttpServletRequest request,
			@RequestBody DataRequest dataRequest) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysDepartmentQuery query = new SysDepartmentQuery();
		Tools.populate(query, params);
		query.setDataRequest(dataRequest);

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
		int total = sysDepartmentService
				.getSysDepartmentCountByQueryCriteria(query);
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

			List<SysDepartment> list = sysDepartmentService
					.getSysDepartmentsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysDepartment sysDepartment : list) {
					JSONObject rowJSON = sysDepartment.toJsonObject();
					rowJSON.put("id", sysDepartment.getId());
					rowJSON.put("deptId", sysDepartment.getId());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		}
		logger.debug(result.toJSONString());
		return result.toJSONString().getBytes("UTF-8");
	}

	@GET
	@POST
	@Path("json")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public byte[] json(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysDepartmentQuery query = new SysDepartmentQuery();
		Tools.populate(query, params);

		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "easyui";
		}
		int start = 0;
		int limit = 10;
		String orderName = null;
		String order = null;

		int pageNo = ParamUtils.getInt(params, "page");
		limit = ParamUtils.getInt(params, "rows");
		start = (pageNo - 1) * limit;
		orderName = ParamUtils.getString(params, "sortName");
		order = ParamUtils.getString(params, "sortOrder");

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = PageResult.DEFAULT_PAGE_SIZE;
		}

		JSONObject result = new JSONObject();
		int total = sysDepartmentService
				.getSysDepartmentCountByQueryCriteria(query);
		if (total > 0) {
			result.put("total", total);
			result.put("totalCount", total);
			result.put("totalRecords", total);
			result.put("start", start);
			result.put("startIndex", start);
			result.put("limit", limit);
			result.put("pageSize", limit);

			if (StringUtils.isNotEmpty(orderName)) {
				query.setSortOrder(orderName);
				if (StringUtils.equals(order, "desc")) {
					query.setSortOrder(" desc ");
				}
			}

			List<SysDepartment> list = sysDepartmentService
					.getSysDepartmentsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysDepartment sysDepartment : list) {
					JSONObject rowJSON = sysDepartment.toJsonObject();
					rowJSON.put("id", sysDepartment.getId());
					rowJSON.put("sysDepartmentId", sysDepartment.getId());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		}
		return result.toJSONString().getBytes("UTF-8");
	}

	@POST
	@Path("read")
	@Produces({ MediaType.APPLICATION_JSON })
	@ResponseBody
	public byte[] read(@Context HttpServletRequest request,
			@RequestBody DataRequest dataRequest) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysDepartmentQuery query = new SysDepartmentQuery();
		Tools.populate(query, params);
		query.setDataRequest(dataRequest);
		SysDepartmentDomainFactory.processDataRequest(dataRequest);

		int start = 0;

		JSONArray result = new JSONArray();
		int total = sysDepartmentService
				.getSysDepartmentCountByQueryCriteria(query);
		if (total > 0) {

			String orderName = null;
			String order = null;

			if (dataRequest != null && dataRequest.getSort() != null
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
			List<SysDepartment> list = sysDepartmentService
					.getSysDepartmentsByQueryCriteria(start, 10000, query);

			if (list != null && !list.isEmpty()) {

				for (SysDepartment sysDepartment : list) {
					JSONObject rowJSON = sysDepartment.toJsonObject();
					if (sysDepartment.getId() == 1) {
						rowJSON.remove("nodeParentId");
					}
					rowJSON.put("departmentId", sysDepartment.getId());
					rowJSON.put("startIndex", ++start);
					result.add(rowJSON);
				}

			}
		}

		logger.debug("json:" + result.toString());
		return result.toString().getBytes("UTF-8");
	}

	/**
	 * 提交增加信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("saveAdd")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveAdd(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		RequestUtils.setRequestParameterToAttribute(request);
		// 增加部门时，同时要增加对应节点
		SysDepartment bean = new SysDepartment();
		bean.setName(ParamUtil.getParameter(request, "name"));
		bean.setDesc(ParamUtil.getParameter(request, "desc"));
		bean.setCode(ParamUtil.getParameter(request, "code"));
		bean.setCode2(ParamUtil.getParameter(request, "code2"));
		bean.setLevel(RequestUtils.getInt(request, "level"));
		bean.setNo(ParamUtil.getParameter(request, "no"));
		bean.setCreateTime(new Date());

		SysTree node = new SysTree();
		node.setCreateBy(RequestUtils.getActorId(request));
		node.setName(bean.getName());
		node.setDesc(bean.getName());
		node.setCode(bean.getCode());
		node.setParentId((long) ParamUtil.getIntParameter(request, "parent", 0));
		bean.setNode(node);
		bean.setCreateBy(RequestUtils.getActorId(request));
		boolean ret = sysDepartmentService.create(bean);

		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
	}

	/**
	 * 提交修改信息
	 * 
	 * @param request
	 * @param uriInfo
	 * @return
	 */
	@Path("saveModify")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveModify(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		long id = ParamUtil.getIntParameter(request, "id", 0);
		SysDepartment bean = sysDepartmentService.findById(id);
		boolean ret = false;
		if (bean != null) {
			bean.setUpdateBy(RequestUtils.getActorId(request));
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setDesc(ParamUtil.getParameter(request, "desc"));
			bean.setCode(ParamUtil.getParameter(request, "code"));
			bean.setCode2(ParamUtil.getParameter(request, "code2"));
			bean.setLevel(RequestUtils.getInt(request, "level"));
			bean.setNo(ParamUtil.getParameter(request, "no"));
			bean.setStatus(ParamUtil.getIntParameter(request, "status", 0));
			SysTree node = bean.getNode();
			node.setUpdateBy(RequestUtils.getActorId(request));
			node.setName(bean.getName());
			node.setParentId((long) ParamUtil.getIntParameter(request,
					"parent", 0));
			bean.setNode(node);
			try {
				ret = sysDepartmentService.update(bean);
			} catch (Exception ex) {
				ret = false;
				logger.error(ex);
			}
		}

		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}
		return ResponseUtils.responseResult(false);
	}

	@javax.annotation.Resource
	public void setSysDepartmentService(
			SysDepartmentService sysDepartmentService) {
		this.sysDepartmentService = sysDepartmentService;
	}

	@javax.annotation.Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;
	}

	@POST
	@ResponseBody
	@Path("sort")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] sort(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		long id = ParamUtil.getIntParameter(request, "id", 0);
		long parent = ParamUtil.getIntParameter(request, "parent", 0);
		int operate = ParamUtil.getIntParameter(request, "operate", 0);
		logger.info("parent:" + parent + "; id:" + id + "; operate:" + operate);
		SysDepartment bean = sysDepartmentService.findById(id);
		sysDepartmentService.sort(parent, bean, operate);
		return ResponseUtils.responseResult(true);
	}

	@GET
	@POST
	@Path("/treeJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treeJson(@Context HttpServletRequest request) {
		String nodeCode = request.getParameter("nodeCode");

		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		if (StringUtils.isNotEmpty(nodeCode)) {
			TreeModel treeModel = sysTreeService.getSysTreeByCode(nodeCode);
			if (treeModel != null) {
				SysTreeQuery query = new SysTreeQuery();
				Map<String, Object> params = RequestUtils
						.getParameterMap(request);
				Tools.populate(query, params);
				// query.setParentId(treeModel.getId());
				List<SysTree> trees = sysTreeService
						.getDepartmentSysTrees(query);
				if (trees != null && !trees.isEmpty()) {
					for (SysTree tree : trees) {
						treeModels.add(tree);
					}
				}
			}
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode responseJSON = treeHelper.getTreeArrayNode(treeModels);
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@Path("update")
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@ResponseBody
	public byte[] update(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		logger.debug(RequestUtils.getParameterMap(request));
		long deptId = ParamUtil.getIntParameter(request, "deptId", 0);
		SysDepartment bean = sysDepartmentService.findById(deptId);
		boolean ret = false;
		if (bean != null) {
			bean.setUpdateBy(RequestUtils.getActorId(request));
			bean.setName(ParamUtil.getParameter(request, "name"));
			bean.setDesc(ParamUtil.getParameter(request, "desc"));
			bean.setCode(ParamUtil.getParameter(request, "code"));
			bean.setCode2(ParamUtil.getParameter(request, "code2"));
			bean.setNo(ParamUtil.getParameter(request, "no"));
			bean.setStatus(ParamUtil.getIntParameter(request, "status", 0));
			bean.setLevel(RequestUtils.getInt(request, "level"));
			SysTree node = bean.getNode();
			node.setUpdateBy(RequestUtils.getActorId(request));
			node.setName(bean.getName());
			if (ParamUtil.getLongParameter(request, "parent", 0) > 0) {
				node.setParentId(ParamUtil.getLongParameter(request, "parent",
						0));
			}
			bean.setNode(node);
			try {
				ret = sysDepartmentService.update(bean);
			} catch (Exception ex) {
				ret = false;
				ex.printStackTrace();
				logger.error(ex);
			}
		}
		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
	}
}