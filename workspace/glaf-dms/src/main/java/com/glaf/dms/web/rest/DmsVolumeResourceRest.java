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
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.dom4j.Document;

import com.alibaba.fastjson.*;

import com.glaf.core.security.LoginContext;
import com.glaf.core.util.*;

import com.glaf.dms.bean.VolumeBean;
import com.glaf.dms.bean.VolumeHelper;
import com.glaf.dms.domain.DmsTreevmainUser;
import com.glaf.dms.domain.DmsVolume;
import com.glaf.dms.export.VolumeXmlExport;
import com.glaf.dms.query.DmsVolumeQuery;
import com.glaf.dms.service.DmsTreevmainService;
import com.glaf.dms.service.DmsTreevmainUserService;
import com.glaf.dms.service.DmsVolumeService;

/**
 * 
 * Rest响应类
 * 
 */

@Controller
@Path("/rs/dms/volume")
public class DmsVolumeResourceRest {
	protected static final Log logger = LogFactory
			.getLog(DmsVolumeResourceRest.class);

	protected DmsTreevmainService dmsTreevmainService;

	protected DmsTreevmainUserService dmsTreevmainUserService;

	protected DmsVolumeService dmsVolumeService;

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
				dmsVolumeService.deleteByIds(ids);
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
		dmsVolumeService.deleteById(request.getParameter("id"));
		return ResponseUtils.responseJsonResult(true);
	}

	@GET
	@POST
	@Path("detail")
	@ResponseBody
	public byte[] detail(@Context HttpServletRequest request) {
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
			params.put(
					"dms_treenodes",
					helper.getTreeNodeFilterBuffer(systemName,
							loginContext.getActorId()));
		}
		logger.debug(">#params:" + params);
		String vid = request.getParameter("vid");

		VolumeBean bean = new VolumeBean();

		JSONObject rootJSON = new JSONObject();
		try {
			com.glaf.core.config.Environment.setCurrentSystemName(systemName);
			Map<String, Object> dataMap = bean.getSingleVolume(vid);
			if (dataMap != null && !dataMap.isEmpty()) {
				Set<Entry<String, Object>> entrySet = dataMap.entrySet();
				for (Entry<String, Object> entry : entrySet) {
					String key = entry.getKey();
					Object value = entry.getValue();
					if (value != null) {
						if (value instanceof Date) {
							Date date = (Date) value;
							rootJSON.put(key, DateUtils.getDate(date));
						} else {
							rootJSON.put(key, value);
						}
					} else {
						rootJSON.put(key, "");
					}
				}
			}
			return rootJSON.toJSONString().getBytes("UTF-8");
		} catch (IOException e) {
			return rootJSON.toJSONString().getBytes();
		}
	}

	@GET
	@POST
	@Path("exportXml")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public void exportXml(@Context HttpServletRequest request,
			@Context HttpServletResponse response) {
		String id = request.getParameter("id");
		logger.debug("id:" + id);
		VolumeXmlExport export = new VolumeXmlExport();
		byte[] bytes = null;
		try {
			DmsVolume m = dmsVolumeService.getDmsVolume(id);
			Document doc = export.writeVolumeXml(m, true);
			bytes = Dom4jUtils.getBytesFromPrettyDocument(doc, "UTF-8");
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			ResponseUtils.download(request, response, bytes, m.getVname()
					+ ".xml");
		} catch (Exception ex) {
			ex.printStackTrace();
			LogUtils.error(ex);
		} finally {
			bytes = null;
		}
	}

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("topid");
		DmsVolumeQuery query = new DmsVolumeQuery();
		Tools.populate(query, params);
		String systemName = RequestUtils.getSystemName(request);
		LoginContext loginContext = RequestUtils.getLoginContext(request);
		logger.debug("is admin:" + loginContext.isSystemAdministrator());
		if (!loginContext.isSystemAdministrator()) {
			params.put("accessLimit", true);
			params.put("projectAttr",
					request.getSession().getAttribute("projectAttr"));
			params.put("actorId", loginContext.getActorId());
			VolumeHelper helper = new VolumeHelper();
			query.setDmsTreenodes(helper.getTreeNodeFilterBuffer(systemName,
					loginContext.getActorId()));
		}

		Integer topid = RequestUtils.getInteger(request, "topid");
		if (topid != null && topid > 0) {
			DmsTreevmainUser t = dmsTreevmainUserService
					.getDmsTreevmainUserByIndexId(topid);
			if (t != null) {
				query.setTopid(-1);
				query.setTreenodeLike(t.getId());
			}
		}

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
		com.glaf.core.config.Environment.setCurrentSystemName(systemName);
		int total = dmsVolumeService.getDmsVolumeCountByQueryCriteria(query);
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

			List<DmsVolume> list = dmsVolumeService
					.getDmsVolumesByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (DmsVolume dmsVolume : list) {
					JSONObject rowJSON = dmsVolume.toJsonObject();
					rowJSON.put("id", dmsVolume.getId());
					rowJSON.put("volumeId", dmsVolume.getId());
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
	@Path("/saveVolume")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveVolume(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		DmsVolume dmsVolume = new DmsVolume();
		try {
			Tools.populate(dmsVolume, params);

			dmsVolume.setListno(RequestUtils.getInt(request, "listno"));
			dmsVolume.setOldid(request.getParameter("oldid"));
			dmsVolume.setRuleID(request.getParameter("ruleID"));
			dmsVolume.setRuleflag(request.getParameter("ruleflag"));
			dmsVolume.setRulepid(request.getParameter("rulepid"));
			dmsVolume.setVid(request.getParameter("vid"));
			dmsVolume.setSumflag(request.getParameter("sumflag"));
			dmsVolume.setTopid(RequestUtils.getInt(request, "topid"));
			dmsVolume.setIndexId(RequestUtils.getInt(request, "indexId"));
			dmsVolume.setProjid(RequestUtils.getInt(request, "projid"));
			dmsVolume.setPid(RequestUtils.getInt(request, "pid"));
			dmsVolume.setPname(request.getParameter("pname"));
			dmsVolume.setVflag(request.getParameter("vflag"));
			dmsVolume.setVname(request.getParameter("vname"));
			dmsVolume.setYear(RequestUtils.getInt(request, "year"));
			dmsVolume.setGlidenum(request.getParameter("glidenum"));
			dmsVolume.setFilingflag(request.getParameter("filingflag"));
			dmsVolume.setCheckupflag(request.getParameter("checkupflag"));
			dmsVolume.setOpenflag(request.getParameter("openflag"));
			dmsVolume.setFinishflag(request.getParameter("finishflag"));
			dmsVolume.setVtagnum(request.getParameter("vtagnum"));
			dmsVolume.setVtype(request.getParameter("vtype"));
			dmsVolume.setVnum(request.getParameter("vnum"));
			dmsVolume.setVtmpnum(request.getParameter("vtmpnum"));
			dmsVolume.setRoomnum(request.getParameter("roomnum"));
			dmsVolume.setZoonum(request.getParameter("zoonum"));
			dmsVolume.setEfilenum(request.getParameter("efilenum"));
			dmsVolume.setBoxnum(request.getParameter("boxnum"));
			dmsVolume.setPlace(request.getParameter("place"));
			dmsVolume.setTname(request.getParameter("tname"));
			dmsVolume.setWcompany(request.getParameter("wcompany"));
			dmsVolume.setWdate(RequestUtils.getDate(request, "wdate"));
			dmsVolume.setCarriertype(request.getParameter("carriertype"));
			dmsVolume.setNumunit(request.getParameter("numunit"));
			dmsVolume.setSpec(request.getParameter("spec"));
			dmsVolume.setStartday(RequestUtils.getDate(request, "startday"));
			dmsVolume.setEndday(RequestUtils.getDate(request, "endday"));
			dmsVolume.setSavetime(request.getParameter("savetime"));
			dmsVolume.setSlevel(request.getParameter("slevel"));
			dmsVolume.setThematic(request.getParameter("thematic"));
			dmsVolume.setAnnotations(request.getParameter("annotations"));
			dmsVolume.setTotalfile(RequestUtils.getInt(request, "totalfile"));
			dmsVolume.setTotalpage(RequestUtils.getInt(request, "totalpage"));
			dmsVolume.setTxtpage(RequestUtils.getInt(request, "txtpage"));
			dmsVolume.setPicpage(RequestUtils.getInt(request, "picpage"));
			dmsVolume.setPhotopage(RequestUtils.getInt(request, "photopage"));
			dmsVolume.setCman(request.getParameter("cman"));
			dmsVolume.setCtime(RequestUtils.getDate(request, "ctime"));
			dmsVolume.setAssessor(request.getParameter("assessor"));
			dmsVolume.setAtime(RequestUtils.getDate(request, "atime"));
			dmsVolume.setContent(request.getParameter("content"));
			dmsVolume.setIslocate(request.getParameter("islocate"));
			dmsVolume.setTopnode(request.getParameter("topnode"));
			dmsVolume.setLcontent(request.getParameter("lcontent"));
			dmsVolume.setLcompany(request.getParameter("lcompany"));
			dmsVolume.setLman(request.getParameter("lman"));
			dmsVolume.setLlen(request.getParameter("llen"));
			dmsVolume.setLdate(RequestUtils.getDate(request, "ldate"));
			dmsVolume.setJconten(request.getParameter("jconten"));
			dmsVolume.setJplace(request.getParameter("jplace"));
			dmsVolume.setJman(request.getParameter("jman"));
			dmsVolume.setJback(request.getParameter("jback"));
			dmsVolume.setJactor(request.getParameter("jactor"));
			dmsVolume.setTnum(request.getParameter("tnum"));
			dmsVolume.setTzoom(request.getParameter("tzoom"));
			dmsVolume.setTflag(request.getParameter("tflag"));
			dmsVolume.setTdesigner(request.getParameter("tdesigner"));
			dmsVolume.setTviewer(request.getParameter("tviewer"));
			dmsVolume.setTassessor(request.getParameter("tassessor"));
			dmsVolume.setTvision(request.getParameter("tvision"));
			dmsVolume.setFinishday(RequestUtils.getDate(request, "finishday"));
			dmsVolume.setChoosePublishFlag(request
					.getParameter("choosePublishFlag"));
			dmsVolume.setChoosePublishTime(RequestUtils.getLong(request,
					"choosePublishTime"));
			dmsVolume.setPublishdiskid(RequestUtils.getInt(request,
					"publishdiskid"));

			this.dmsVolumeService.save(dmsVolume);

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

	@javax.annotation.Resource
	public void setDmsVolumeService(DmsVolumeService dmsVolumeService) {
		this.dmsVolumeService = dmsVolumeService;
	}

	@javax.annotation.Resource
	public void setDmsTreevmainUserService(
			DmsTreevmainUserService dmsTreevmainUserService) {
		this.dmsTreevmainUserService = dmsTreevmainUserService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request) throws IOException {
		DmsVolume dmsVolume = null;
		if (StringUtils.isNotEmpty(request.getParameter("id"))) {
			dmsVolume = dmsVolumeService.getDmsVolume(request
					.getParameter("id"));
		}
		JSONObject result = new JSONObject();
		if (dmsVolume != null) {
			result = dmsVolume.toJsonObject();
			result.put("id", dmsVolume.getId());
			result.put("volumeId", dmsVolume.getId());
		}
		return result.toJSONString().getBytes("UTF-8");
	}
}
