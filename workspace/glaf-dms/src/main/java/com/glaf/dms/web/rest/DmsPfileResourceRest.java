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

import com.glaf.dms.domain.DmsPfile;
import com.glaf.dms.query.DmsPfileQuery;
import com.glaf.dms.service.DmsPfileService;

/**
 * 
 * Rest响应类
 * 
 */
@Controller
@Path("/rs/dms/pfile")
public class DmsPfileResourceRest {
	protected static final Log logger = LogFactory
			.getLog(DmsPfileResourceRest.class);

	protected DmsPfileService dmsPfileService;

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
				dmsPfileService.deleteByIds(ids);
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
		dmsPfileService.deleteById(request.getParameter("id"));
		return ResponseUtils.responseJsonResult(true);
	}

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("topid");
		DmsPfileQuery query = new DmsPfileQuery();
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
		int total = dmsPfileService.getDmsPfileCountByQueryCriteria(query);
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

			List<DmsPfile> list = dmsPfileService.getDmsPfilesByQueryCriteria(
					start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (DmsPfile dmsPfile : list) {
					JSONObject rowJSON = dmsPfile.toJsonObject();
					rowJSON.put("id", dmsPfile.getId());
					rowJSON.put("pfileId", dmsPfile.getId());
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
	@Path("/savePfile")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] savePfile(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		DmsPfile dmsPfile = new DmsPfile();
		try {
			Tools.populate(dmsPfile, params);

			dmsPfile.setEfilenum(RequestUtils.getInt(request, "efilenum"));
			dmsPfile.setListnum(request.getParameter("listnum"));
			dmsPfile.setListId(RequestUtils.getLong(request, "listId"));
			dmsPfile.setIndexId(RequestUtils.getInt(request, "indexId"));
			dmsPfile.setPid(RequestUtils.getInt(request, "pid"));
			dmsPfile.setProjid(RequestUtils.getInt(request, "projid"));
			dmsPfile.setDwid(RequestUtils.getInt(request, "dwid"));
			dmsPfile.setFbid(RequestUtils.getInt(request, "fbid"));
			dmsPfile.setFxid(RequestUtils.getInt(request, "fxid"));
			dmsPfile.setJid(request.getParameter("jid"));
			dmsPfile.setFlid(request.getParameter("flid"));
			dmsPfile.setTopnode(request.getParameter("topnode"));
			dmsPfile.setTopnodem(request.getParameter("topnodem"));
			dmsPfile.setVid(request.getParameter("vid"));
			dmsPfile.setOldvid(request.getParameter("oldvid"));
			dmsPfile.setVisflag(request.getParameter("visflag"));
			dmsPfile.setListno(RequestUtils.getInt(request, "listno"));
			dmsPfile.setFilingflag(request.getParameter("filingflag"));
			dmsPfile.setSaveflag(request.getParameter("saveflag"));
			dmsPfile.setOpenflag(request.getParameter("openflag"));
			dmsPfile.setCheckupflag(request.getParameter("checkupflag"));
			dmsPfile.setFinishflag(request.getParameter("finishflag"));
			dmsPfile.setFromID(request.getParameter("fromID"));
			dmsPfile.setTname(request.getParameter("tname"));
			dmsPfile.setDuty(request.getParameter("duty"));
			dmsPfile.setTagnum(request.getParameter("tagnum"));
			dmsPfile.setFilenum(request.getParameter("filenum"));
			dmsPfile.setThematic(request.getParameter("thematic"));
			dmsPfile.setCtime(RequestUtils.getDate(request, "ctime"));
			dmsPfile.setPageno(request.getParameter("pageno"));
			dmsPfile.setSlevel(request.getParameter("slevel"));
			dmsPfile.setPage(RequestUtils.getInt(request, "page"));
			dmsPfile.setFiletype(request.getParameter("filetype"));
			dmsPfile.setFontsnum(request.getParameter("fontsnum"));
			dmsPfile.setSavetime(request.getParameter("savetime"));
			dmsPfile.setCompany(request.getParameter("company"));
			dmsPfile.setYear(RequestUtils.getInt(request, "year"));
			dmsPfile.setFileatt(request.getParameter("fileatt"));
			dmsPfile.setAnnotations(request.getParameter("annotations"));
			dmsPfile.setCarriertype(request.getParameter("carriertype"));
			dmsPfile.setSummary(request.getParameter("summary"));
			dmsPfile.setPtext(request.getParameter("ptext"));
			dmsPfile.setCarrieru(request.getParameter("carrieru"));
			dmsPfile.setGlidenum(request.getParameter("glidenum"));
			dmsPfile.setEfile(request.getParameter("efile"));
			dmsPfile.setFtime(RequestUtils.getDate(request, "ftime"));
			dmsPfile.setTotalnum(request.getParameter("totalnum"));
			dmsPfile.setInputman(request.getParameter("inputman"));
			dmsPfile.setEtime(RequestUtils.getDate(request, "etime"));
			dmsPfile.setDotnum(request.getParameter("dotnum"));
			dmsPfile.setPicnum(request.getParameter("picnum"));
			dmsPfile.setRecnum(request.getParameter("recnum"));
			dmsPfile.setTotal(RequestUtils.getInt(request, "total"));
			dmsPfile.setPagetype(request.getParameter("pagetype"));
			dmsPfile.setIscom(request.getParameter("iscom"));
			dmsPfile.setIslocate(request.getParameter("islocate"));
			dmsPfile.setWcompany(request.getParameter("wcompany"));
			dmsPfile.setWcompanyID(request.getParameter("wcompanyID"));
			dmsPfile.setSendflag(request.getParameter("sendflag"));
			dmsPfile.setLcontent(request.getParameter("lcontent"));
			dmsPfile.setLcompany(request.getParameter("lcompany"));
			dmsPfile.setLman(request.getParameter("lman"));
			dmsPfile.setLlen(request.getParameter("llen"));
			dmsPfile.setLdate(RequestUtils.getDate(request, "ldate"));
			dmsPfile.setJconten(request.getParameter("jconten"));
			dmsPfile.setJplace(request.getParameter("jplace"));
			dmsPfile.setJman(request.getParameter("jman"));
			dmsPfile.setJback(request.getParameter("jback"));
			dmsPfile.setJactor(request.getParameter("jactor"));
			dmsPfile.setJnum(request.getParameter("jnum"));
			dmsPfile.setJbnum(request.getParameter("jbnum"));
			dmsPfile.setTnum(request.getParameter("tnum"));
			dmsPfile.setTzoom(request.getParameter("tzoom"));
			dmsPfile.setTflag(request.getParameter("tflag"));
			dmsPfile.setTdesigner(request.getParameter("tdesigner"));
			dmsPfile.setTviewer(request.getParameter("tviewer"));
			dmsPfile.setTassessor(request.getParameter("tassessor"));
			dmsPfile.setTvision(request.getParameter("tvision"));
			dmsPfile.setClistno(RequestUtils.getInt(request, "clistno"));
			dmsPfile.setCpageno(request.getParameter("cpageno"));
			dmsPfile.setVnum(request.getParameter("vnum"));
			dmsPfile.setCvnum(request.getParameter("cvnum"));
			dmsPfile.setCtimeEnd(RequestUtils.getDate(request, "ctimeEnd"));
			dmsPfile.setSysListno(RequestUtils.getInt(request, "sysListno"));
			dmsPfile.setSysaddint(RequestUtils.getInt(request, "sysaddint"));
			dmsPfile.setChkefileint(RequestUtils.getInt(request, "chkefileint"));
			dmsPfile.setProjIndex(RequestUtils.getInt(request, "projIndex"));
			dmsPfile.setNoscan(RequestUtils.getInt(request, "noscan"));
			dmsPfile.setTreeParent(RequestUtils.getInt(request, "treeParent"));
			dmsPfile.setTreeList(RequestUtils.getInt(request, "treeList"));
			dmsPfile.setTreeDliststr(request.getParameter("treeDliststr"));
			dmsPfile.setChoosePublishFlag(request
					.getParameter("choosePublishFlag"));
			dmsPfile.setChoosePublishTime(RequestUtils.getLong(request,
					"choosePublishTime"));
			dmsPfile.setPublishdiskid(RequestUtils.getInt(request,
					"publishdiskid"));

			this.dmsPfileService.save(dmsPfile);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setDmsPfileService(DmsPfileService dmsPfileService) {
		this.dmsPfileService = dmsPfileService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request) throws IOException {
		DmsPfile dmsPfile = null;
		if (StringUtils.isNotEmpty(request.getParameter("id"))) {
			dmsPfile = dmsPfileService.getDmsPfile(request.getParameter("id"));
		}
		JSONObject result = new JSONObject();
		if (dmsPfile != null) {
			result = dmsPfile.toJsonObject();
			result.put("id", dmsPfile.getId());
			result.put("pfileId", dmsPfile.getId());
		}
		return result.toJSONString().getBytes("UTF-8");
	}
}
