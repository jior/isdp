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

package com.glaf.dms.web.rest;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.lang3.StringUtils;
import com.alibaba.fastjson.*;

import com.glaf.core.util.*;

import com.glaf.dms.domain.DmsTreevmain;
import com.glaf.dms.query.DmsTreevmainQuery;
import com.glaf.dms.service.DmsTreevmainService;

/**
 * 
 * Rest响应类
 * 
 */

@Controller
@Path("/rs/dms/treevmain")
public class DmsTreevmainResourceRest {
	protected static final Log logger = LogFactory
			.getLog(DmsTreevmainResourceRest.class);

	protected DmsTreevmainService dmsTreevmainService;

	@POST
	@Path("/deleteAll")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] deleteAll(@Context HttpServletRequest request)
			throws IOException {
		String rowIds = request.getParameter("ids");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				dmsTreevmainService.deleteByIds(ids);
			}
		}
		return ResponseUtils.responseJsonResult(true);
	}

	@POST
	@Path("/delete")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] deleteById(@Context HttpServletRequest request)
			throws IOException {
		dmsTreevmainService.deleteById(request.getParameter("id"));
		return ResponseUtils.responseJsonResult(true);
	}

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		DmsTreevmainQuery query = new DmsTreevmainQuery();
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
		int total = dmsTreevmainService
				.getDmsTreevmainCountByQueryCriteria(query);
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

			List<DmsTreevmain> list = dmsTreevmainService
					.getDmsTreevmainsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (DmsTreevmain dmsTreevmain : list) {
					JSONObject rowJSON = dmsTreevmain.toJsonObject();
					rowJSON.put("id", dmsTreevmain.getId());
					rowJSON.put("treevmainId", dmsTreevmain.getId());
					rowJSON.put("startIndex", ++start);
					rowsJSON.add(rowJSON);
				}

			}
		} else {
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
			result.put("total", total);
		}
		return result.toJSONString().getBytes("UTF-8");
	}

	@POST
	@Path("/saveTreevmain")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveTreevmain(@Context HttpServletRequest request) {
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
			dmsTreevmain.setChoosePublishFlag(request
					.getParameter("choosePublishFlag"));
			dmsTreevmain.setChoosePublishTime(RequestUtils.getLong(request,
					"choosePublishTime"));
			dmsTreevmain.setPublishdiskid(RequestUtils.getInt(request,
					"publishdiskid"));

			this.dmsTreevmainService.save(dmsTreevmain);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setDmsTreevmainService(DmsTreevmainService dmsTreevmainService) {
		this.dmsTreevmainService = dmsTreevmainService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request) throws IOException {
		DmsTreevmain dmsTreevmain = null;
		if (StringUtils.isNotEmpty(request.getParameter("id"))) {
			dmsTreevmain = dmsTreevmainService.getDmsTreevmainById(request
					.getParameter("id"));
		}
		JSONObject result = new JSONObject();
		if (dmsTreevmain != null) {
			result = dmsTreevmain.toJsonObject();
			result.put("id", dmsTreevmain.getId());
			result.put("treevmainId", dmsTreevmain.getId());
		}
		return result.toJSONString().getBytes("UTF-8");
	}
}
