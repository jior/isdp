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
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.glaf.core.base.BaseTree;
import com.glaf.core.base.TreeModel;
import com.glaf.core.jdbc.QueryHelper;
import com.glaf.core.security.LoginContext;
import com.glaf.core.service.EntityService;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;

import com.glaf.dms.bean.VolumeBean;
import com.glaf.dms.bean.VolumeHelper;

@Controller
@Path("/rs/dms/ztree")
public class DmsZTreeResource {

	protected final static Log logger = LogFactory
			.getLog(DmsZTreeResource.class);

	protected EntityService entityService;

	@javax.annotation.Resource
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	@GET
	@POST
	@Path("treeJson")
	@ResponseBody
	public byte[] treeJson(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LoginContext loginContext = RequestUtils.getLoginContext(request);
		logger.debug("is admin:" + loginContext.isSystemAdministrator());
		String systemName = RequestUtils.getSystemName(request);
		if (!loginContext.isSystemAdministrator()) {
			params.put("accessLimit", true);
			params.put("projectAttr",
					request.getSession().getAttribute("projectAttr"));
			params.put("actorId", loginContext.getActorId());
			VolumeHelper helper = new VolumeHelper();
			params.put("dms_treenodes",
					helper.getTreeNodeFilterBuffer(systemName, loginContext.getActorId()));
		}
		String actorId = RequestUtils.getActorId(request);
		params.put("actorId", actorId);

		

		JSONArray rootJSON = new JSONArray();
		QueryHelper queryHelper = new QueryHelper();
		Map<String, Object> dataMap = queryHelper.selectOne(systemName,
				" select * from userinfo where userId = #{actorId} ", params);
		String issystem = ParamUtils.getString(dataMap, "issystem");
		if (StringUtils.equals(issystem, "1") || loginContext.isSystemAdministrator()) {
			VolumeBean bean = new VolumeBean();
			String parent_id = request.getParameter("node");
			if (StringUtils.isEmpty(parent_id)) {
				parent_id = request.getParameter("parentId");
			}
			if (StringUtils.isEmpty(parent_id)) {
				parent_id = request.getParameter("pId");
			}
			if (StringUtils.isEmpty(parent_id)) {
				parent_id = request.getParameter("parent_id");
			}
			params.put("node", parent_id);
			params.put("pId", parent_id);
			params.put("parentId", parent_id);
			params.put("parent_id", parent_id);
			TreeModel root = null;
			if (StringUtils.equals("0", parent_id)
					|| StringUtils.equals("-1", parent_id)) {
				root = new BaseTree();
				root.setId(Integer.valueOf(parent_id));
				root.setName("/");
			}
			rootJSON = bean.getTreevmainJson(root, params);
		} else {
			List<Map<String, Object>> resultList = queryHelper
					.getResultList(systemName,
							" select * from roleuse2 where roleid in (select roleid from userrole where userid = #{actorId} ) and usetype=2 ",
							params);
			if (resultList != null && !resultList.isEmpty()) {
				StringBuffer buffer = new StringBuffer();
				buffer.append(" and ( id like '0|0000|%' ");
				for (Map<String, Object> map : resultList) {
					String treeid = ParamUtils.getString(map, "treeid");
					buffer.append("  or id like '").append(treeid).append("%'");
				}
				buffer.append(" ) ");
				params.put("filterNode", buffer.toString());
				logger.debug("filterNode:" + buffer.toString());
				VolumeBean bean = new VolumeBean();
				String parent_id = request.getParameter("node");
				if (StringUtils.isEmpty(parent_id)) {
					parent_id = request.getParameter("parentId");
				}
				if (StringUtils.isEmpty(parent_id)) {
					parent_id = request.getParameter("pId");
				}
				if (StringUtils.isEmpty(parent_id)) {
					parent_id = request.getParameter("parent_id");
				}
				params.put("node", parent_id);
				TreeModel root = null;
				if (StringUtils.equals("0", parent_id)
						|| StringUtils.equals("-1", parent_id)) {
					root = new BaseTree();
					root.setId(Integer.valueOf(parent_id));
					root.setName("/");
				}
				com.glaf.core.config.Environment.setCurrentSystemName(systemName);
				rootJSON = bean.getTreevmainJson(root, params);
			}
		}

		logger.debug(rootJSON.toJSONString());
		try {
			return rootJSON.toJSONString().getBytes("UTF-8");
		} catch (IOException e) {
			return rootJSON.toJSONString().getBytes();
		}
	}

}
