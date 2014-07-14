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

import com.glaf.dms.domain.DmsFileatt;
import com.glaf.dms.service.DmsFileattService;

/**
 * 
 * Rest响应类
 * 
 */

@Controller
@Path("/rs/dms/fileatt")
public class DmsFileattResourceRest {
	protected static final Log logger = LogFactory
			.getLog(DmsFileattResourceRest.class);

	protected DmsFileattService dmsFileattService;

	@POST
	@Path("/deleteAll")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] deleteAll(@Context HttpServletRequest request)
			throws IOException {
		String rowIds = request.getParameter("fileIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				dmsFileattService.deleteByIds(ids);
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
		dmsFileattService.deleteById(request.getParameter("fileId"));
		return ResponseUtils.responseJsonResult(true);
	}

	@POST
	@Path("/saveFileatt")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveFileatt(@Context HttpServletRequest request) {
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
			dmsFileatt.setChoosePublishFlag(request
					.getParameter("choosePublishFlag"));
			dmsFileatt.setChoosePublishTime(RequestUtils.getLong(request,
					"choosePublishTime"));
			dmsFileatt.setPublishdiskid(RequestUtils.getInt(request,
					"publishdiskid"));

			this.dmsFileattService.save(dmsFileatt);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setDmsFileattService(DmsFileattService dmsFileattService) {
		this.dmsFileattService = dmsFileattService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request) throws IOException {
		DmsFileatt dmsFileatt = null;
		if (StringUtils.isNotEmpty(request.getParameter("fileId"))) {
			dmsFileatt = dmsFileattService.getDmsFileatt(request
					.getParameter("fileId"));
		}
		JSONObject result = new JSONObject();
		if (dmsFileatt != null) {
			result = dmsFileatt.toJsonObject();
			result.put("id", dmsFileatt.getFileId());
			result.put("fileId", dmsFileatt.getFileId());
		}
		return result.toJSONString().getBytes("UTF-8");
	}
}
