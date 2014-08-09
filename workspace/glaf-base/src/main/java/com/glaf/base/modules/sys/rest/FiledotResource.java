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
import java.util.List;
import java.util.Map;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.base.modules.sys.model.Filedot;
import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.core.util.RequestUtils;

@Controller
@Path("/rs/isdp/filedot")
public class FiledotResource {

	protected static final Log logger = LogFactory
			.getLog(FiledotResource.class);

	protected IFiledotService filedotService;

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug("->params:" + params);
		int wbsIndexId = RequestUtils.getInt(request, "wbsIndexId");
		int intistasks = RequestUtils.getInt(request, "intistasks", 101);
		List<Filedot> list = filedotService.getMyCellTaskFiles(wbsIndexId,
				intistasks);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (list != null && !list.isEmpty()) {
			int sortNo = 1;
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (Filedot dot : list) {
				ObjectNode node = dot.toObjectNode();
				node.put("sortNo", sortNo++);
				arrayJSON.add(node);
			}
			responseJSON.set("rows", arrayJSON);
			responseJSON.put("total", arrayJSON.size());
		} else {
			responseJSON.put("rows", "[]");
			responseJSON.put("total", 0);
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setIFiledotService(IFiledotService filedotService) {
		this.filedotService = filedotService;
	}

}
