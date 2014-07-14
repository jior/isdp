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
import com.glaf.dms.query.DmsFileattQuery;
import com.glaf.dms.service.*;

/**
 * 
 * SpringMVC控制器
 * 
 */

@Controller("/dms/pfile")
@RequestMapping("/dms/pfile")
public class DmsPfileController {
	protected static final Log logger = LogFactory
			.getLog(DmsPfileController.class);

	protected DmsPfileService dmsPfileService;

	protected DmsFileattService dmsFileattService;

	public DmsPfileController() {

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
		DmsPfile dmsPfile = dmsPfileService.getDmsPfile(request
				.getParameter("id"));
		if (dmsPfile != null) {
			request.setAttribute("dmsPfile", dmsPfile);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("dmsPfile.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/dms/pfile/edit", modelMap);
	}

	@RequestMapping("/efile")
	public ModelAndView efile(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		request.removeAttribute("canSubmit");
		DmsPfile dmsPfile = dmsPfileService.getDmsPfile(request
				.getParameter("id"));
		if (dmsPfile != null) {
			request.setAttribute("pfile", dmsPfile);
			DmsFileattQuery query = new DmsFileattQuery();
			query.topid(dmsPfile.getId());
			List<DmsFileatt> list = dmsFileattService.list(query);
			if (list != null && !list.isEmpty()) {
				DmsFileatt file = (DmsFileatt)list.get(0);
				file.setFileId(RequestUtils.encodeString(file.getFileId()));
				request.setAttribute("fileatt", file);
			}
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("dmsPfile.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/dms/pfile/efile", modelMap);
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

		return new ModelAndView("/dms/pfile/list", modelMap);
	}

	@RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
		String x_view = ViewProperties.getString("dmsPfile.query");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/dms/pfile/query", modelMap);
	}

	@RequestMapping("/save")
	public ModelAndView save(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsPfile dmsPfile = new DmsPfile();
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

		// dmsPfile.setCreateBy(actorId);

		dmsPfileService.save(dmsPfile);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/savePfile")
	public byte[] savePfile(HttpServletRequest request) {
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

			this.dmsPfileService.save(dmsPfile);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setDmsFileattService(DmsFileattService dmsFileattService) {
		this.dmsFileattService = dmsFileattService;
	}

	@javax.annotation.Resource
	public void setDmsPfileService(DmsPfileService dmsPfileService) {
		this.dmsPfileService = dmsPfileService;
	}

	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsPfile dmsPfile = dmsPfileService.getDmsPfile(request
				.getParameter("id"));

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

		dmsPfileService.save(dmsPfile);

		return this.list(request, modelMap);
	}

	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		DmsPfile dmsPfile = dmsPfileService.getDmsPfile(request
				.getParameter("id"));
		request.setAttribute("dmsPfile", dmsPfile);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view);
		}

		String x_view = ViewProperties.getString("dmsPfile.view");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view);
		}

		return new ModelAndView("/dms/pfile/view");
	}

}
