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
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Document;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.glaf.core.config.ViewProperties;
import com.glaf.core.util.*;

import com.glaf.dms.domain.*;
import com.glaf.dms.export.VolumeXmlExport;
import com.glaf.dms.service.*;

/**
 * 
 * SpringMVC控制器
 * 
 */

@Controller("/dms/volume")
@RequestMapping("/dms/volume")
public class DmsVolumeController {
	protected static final Log logger = LogFactory
			.getLog(DmsVolumeController.class);

	protected DmsVolumeService dmsVolumeService;

	public DmsVolumeController() {

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

		DmsVolume dmsVolume = dmsVolumeService.getDmsVolume(request
				.getParameter("id"));
		if (dmsVolume != null) {
			request.setAttribute("dmsVolume", dmsVolume);
		}

		boolean canUpdate = false;
		String x_method = request.getParameter("x_method");
		if (StringUtils.equals(x_method, "submit")) {

		}

		request.setAttribute("canUpdate", canUpdate);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("dmsVolume.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/dms/volume/edit", modelMap);
	}

	@RequestMapping("/exportXml")
	@ResponseBody
	public void exportXml(HttpServletRequest request,
			HttpServletResponse response) {
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
			logger.debug(m.getVname());
			ResponseUtils.download(request, response, bytes, m.getVname()
					+ ".xml");
		} catch (Exception ex) {
			ex.printStackTrace();
			LogUtils.error(ex);
		} finally {
			bytes = null;
		}
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

		return new ModelAndView("/dms/volume/list", modelMap);
	}

	@RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
		String x_view = ViewProperties.getString("dmsVolume.query");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/dms/volume/query", modelMap);
	}

	@RequestMapping("/save")
	public ModelAndView save(HttpServletRequest request, ModelMap modelMap) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsVolume dmsVolume = new DmsVolume();
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

		dmsVolumeService.save(dmsVolume);

		return this.list(request, modelMap);
	}

	@ResponseBody
	@RequestMapping("/saveVolume")
	public byte[] saveVolume(HttpServletRequest request) {
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

			this.dmsVolumeService.save(dmsVolume);

			return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(ex);
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setDmsVolumeService(DmsVolumeService dmsVolumeService) {
		this.dmsVolumeService = dmsVolumeService;
	}

	@RequestMapping("/update")
	public ModelAndView update(HttpServletRequest request, ModelMap modelMap) {

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		params.remove("status");
		params.remove("wfStatus");

		DmsVolume dmsVolume = dmsVolumeService.getDmsVolume(request
				.getParameter("id"));

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

		dmsVolumeService.save(dmsVolume);

		return this.list(request, modelMap);
	}

	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		DmsVolume dmsVolume = dmsVolumeService.getDmsVolume(request
				.getParameter("id"));
		request.setAttribute("dmsVolume", dmsVolume);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view);
		}

		String x_view = ViewProperties.getString("dmsVolume.view");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view);
		}

		return new ModelAndView("/dms/volume/view");
	}

}
