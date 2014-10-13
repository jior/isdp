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
import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.glaf.base.helper.TreeHelper;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.model.TreeProjectInfo;
import com.glaf.base.modules.sys.service.ITreeProjectInfoService;

@Controller("/rs/treeProjectInfo")
@Path("/rs/treeProjectInfo")
public class TreeProjectInfoResource {

	protected static final Log logger = LogFactory
			.getLog(TreeProjectInfoResource.class);

	protected ITreeProjectInfoService treeProjectInfoService;

	@javax.annotation.Resource
	public void setTreeProjectInfoService(
			ITreeProjectInfoService treeProjectInfoService) {
		this.treeProjectInfoService = treeProjectInfoService;
	}

	@GET
	@POST
	@Path("treeJson")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public byte[] treeJson(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) throws IOException {
		JSONArray result = new JSONArray();
		String strfuntion = request.getParameter("strfuntion");
		logger.debug("strfuntion:" + strfuntion);
		if (StringUtils.isNotEmpty(strfuntion)) {
			List<TreeProjectInfo> rows = treeProjectInfoService
					.getTreeProjectInfos(strfuntion);
			if (rows != null && !rows.isEmpty()) {
				List<ITree> treeModels = new ArrayList<ITree>();
				for (TreeProjectInfo tree : rows) {
					treeModels.add(tree);
				}
				TreeHelper helper = new TreeHelper();
				JSONArray jsonArray = helper
						.getTreeJSONArray(treeModels, false);
				return jsonArray.toJSONString().getBytes("UTF-8");
			}
		}
		return result.toString().getBytes("UTF-8");
	}

}
