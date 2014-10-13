package com.glaf.base.modules.sys.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;

import com.glaf.base.modules.sys.model.DictoryDefinition;
import com.glaf.base.modules.sys.service.DictoryDefinitionService;

@Controller("/rs/sys/dictoryDefinition")
@Path("/rs/sys/dictoryDefinition")
public class SysDictoryDefinitionResource {

	protected DictoryDefinitionService dictoryDefinitionService;

	protected final Logger logger = LoggerFactory.getLogger(getClass());

	public SysDictoryDefinitionResource() {

	}

	@GET
	@POST
	@Path("json")
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	@ResponseBody
	public byte[] json(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Long nodeId = ParamUtils.getLong(params, "nodeId");
		String target = request.getParameter("target");
		if (StringUtils.isNotEmpty(target)) {
			Map<String, DictoryDefinition> defMap = new HashMap<String, DictoryDefinition>();
			List<DictoryDefinition> list = dictoryDefinitionService
					.getDictoryDefinitions(0L, target);
			if (nodeId > 0) {
				List<DictoryDefinition> rows = dictoryDefinitionService
						.getDictoryDefinitions(nodeId, target);
				if (rows != null && !rows.isEmpty()) {
					for (DictoryDefinition d : rows) {
						defMap.put(d.getName(), d);
					}
				}
			}
			if (list != null && !list.isEmpty()) {
				if (list != null && !list.isEmpty()) {
					for (DictoryDefinition d : list) {
						if (defMap.get(d.getName()) != null) {
							DictoryDefinition m = defMap.get(d.getName());
							d.setTitle(m.getTitle());
							d.setRequired(m.getRequired());
						}
					}
				}
				Collections.sort(list);
				JSONObject result = new JSONObject();
				JSONArray array = new JSONArray();
				for (DictoryDefinition d : list) {
					array.add(d.toJsonObject());
				}
				result.put("rows", array);
				logger.debug(result.toJSONString());
				return result.toJSONString().getBytes("UTF-8");
			}
		}

		return null;
	}

	@Path("save")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] save(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug("params:" + params);
		String target = request.getParameter("target");
		Long nodeId = ParamUtils.getLong(params, "nodeId");
		boolean ret = false;
		if (StringUtils.isNotEmpty(target)) {
			List<DictoryDefinition> list = dictoryDefinitionService
					.getDictoryDefinitions(0L, target);
			if (list != null && !list.isEmpty()) {
				List<DictoryDefinition> rows = new ArrayList<DictoryDefinition>();
				for (DictoryDefinition m : list) {
					String title = request.getParameter(m.getName() + "_title");
					String required = request.getParameter(m.getName()
							+ "_required");
					if (StringUtils.isNotEmpty(title)) {
						DictoryDefinition model = new DictoryDefinition();
						model.setName(m.getName());
						model.setNodeId(nodeId);
						model.setTarget(target);
						model.setTitle(title);
						model.setType(m.getType());
						model.setSort(m.getSort());
						model.setColumnName(m.getColumnName());
						model.setLength(m.getLength());
						if (StringUtils.equals(required, "1")
								|| StringUtils.equals(required, "on")) {
							model.setRequired(1);
						}
						rows.add(model);
					}
				}
				dictoryDefinitionService.saveAll(nodeId, target, rows);
				ret = true;
			}
		}

		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
	}

	@Path("saveDictoryDefinition")
	@POST
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] saveDictoryDefinition(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		boolean ret = false;
		try {
			Map<String, Object> params = RequestUtils.getParameterMap(request);
			logger.debug("params:" + params);
			String target = request.getParameter("target");
			Long nodeId = ParamUtils.getLong(params, "nodeId");
			if (StringUtils.isNotEmpty(target)) {
				List<DictoryDefinition> list = dictoryDefinitionService
						.getDictoryDefinitions(0L, target);
				if (list != null && !list.isEmpty()) {
					List<DictoryDefinition> rows = new ArrayList<DictoryDefinition>();
					for (DictoryDefinition m : list) {
						String title = request.getParameter(m.getName()
								+ "_title");
						String required = request.getParameter(m.getName()
								+ "_required");
						if (StringUtils.isNotEmpty(title)) {
							DictoryDefinition model = new DictoryDefinition();
							model.setName(m.getName());
							model.setNodeId(nodeId);
							model.setTarget(target);
							model.setTitle(title);
							model.setType(m.getType());
							model.setSort(m.getSort());
							model.setColumnName(m.getColumnName());
							model.setLength(m.getLength());
							if (StringUtils.equals(required, "1")
									|| StringUtils.equals(required, "on")) {
								model.setRequired(1);
							}
							rows.add(model);
						}
					}
					dictoryDefinitionService.saveAll(nodeId, target, rows);
					ret = true;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (ret) {// 保存成功
			return ResponseUtils.responseResult(true);
		}

		return ResponseUtils.responseResult(false);
	}

	@javax.annotation.Resource
	public void setDictoryDefinitionService(
			DictoryDefinitionService dictoryDefinitionService) {
		this.dictoryDefinitionService = dictoryDefinitionService;
	}

}
