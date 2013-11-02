package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.WebApplicationException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.lang.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.util.Paging;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.Tools;

import com.glaf.isdp.domain.ProjectInspection;
import com.glaf.isdp.query.ProjectInspectionQuery;
import com.glaf.isdp.service.IProjectInspectionService;

@Controller
@Path("/rs/isdp/projectInspection")
public class IsdpProjectInspectionResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpProjectInspectionResource.class);

	protected IProjectInspectionService projectInspectionService;

	@POST
	@Path("/deleteAll")
	public void deleteAll(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String rowIds = request.getParameter("rowIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// projectInspectionService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/deleteAll/{rowIds}")
	public void deleteAll(@PathParam("rowIds") String rowIds,
			@Context UriInfo uriInfo) {
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// projectInspectionService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete")
	public void deleteById(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String projectInspectionId = request
				.getParameter("projectInspectionId");
		if (StringUtils.isEmpty(projectInspectionId)) {
			projectInspectionId = request.getParameter("id");
		}
		if (projectInspectionId != null) {
			projectInspectionService.deleteById(projectInspectionId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete/{projectInspectionId}")
	public void deleteById(
			@PathParam("projectInspectionId") String projectInspectionId,
			@Context UriInfo uriInfo) {
		if (projectInspectionId != null) {
			projectInspectionService.deleteById(projectInspectionId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@GET
	@POST
	@Path("/list")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] list(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		ProjectInspectionQuery query = new ProjectInspectionQuery();
		Tools.populate(query, params);

		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "easyui";
		}
		int start = 0;
		int limit = 10;
		String orderName = null;
		String order = null;
		if ("easyui".equals(gridType)) {
			int pageNo = ParamUtils.getInt(params, "page");
			limit = ParamUtils.getInt(params, "rows");
			start = (pageNo - 1) * limit;
			orderName = ParamUtils.getString(params, "sort");
			order = ParamUtils.getString(params, "order");
		} else if ("extjs".equals(gridType)) {
			start = ParamUtils.getInt(params, "start");
			limit = ParamUtils.getInt(params, "limit");
			orderName = ParamUtils.getString(params, "sort");
			order = ParamUtils.getString(params, "dir");
		} else if ("yui".equals(gridType)) {
			start = ParamUtils.getInt(params, "startIndex");
			limit = ParamUtils.getInt(params, "results");
			orderName = ParamUtils.getString(params, "sort");
			order = ParamUtils.getString(params, "dir");
		}

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = Paging.DEFAULT_PAGE_SIZE;
		}

		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		int total = projectInspectionService
				.getProjectInspectionCountByQueryCriteria(query);
		if (total > 0) {
			responseJSON.put("total", total);
			responseJSON.put("totalCount", total);
			responseJSON.put("totalRecords", total);
			responseJSON.put("start", start);
			responseJSON.put("startIndex", start);
			responseJSON.put("limit", limit);
			responseJSON.put("pageSize", limit);

			if (StringUtils.isNotEmpty(orderName)) {
				query.setSortOrder(orderName);
				if (StringUtils.equals(order, "desc")) {
					query.setSortOrder("desc");
				}
			}

			// Map<String, UserProfile> userMap =
			// MxIdentityFactory.getUserProfileMap();
			List<ProjectInspection> list = projectInspectionService
					.getProjectInspectionsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				// int sortNo = 0;
				for (ProjectInspection projectInspection : list) {
					// sortNo++;
					ObjectNode node = projectInspection.toObjectNode();
					node.put("sortNo", ++start);
					rowsJSON.add(node);
				}

			}
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@POST
	@Path("/save")
	public void saveProjectInspection(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String projectInspectionId = request
				.getParameter("projectInspectionId");
		if (StringUtils.isEmpty(projectInspectionId)) {
			projectInspectionId = request.getParameter("id");
		}
		ProjectInspection projectInspection = null;
		if (StringUtils.isNotEmpty(projectInspectionId)) {
			projectInspection = projectInspectionService
					.getProjectInspection(projectInspectionId);
		}

		if (projectInspection == null) {
			projectInspection = new ProjectInspection();
		}

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Tools.populate(projectInspection, params);

		this.projectInspectionService.save(projectInspection);
	}

	@javax.annotation.Resource
	public void setProjectInspectionService(
			IProjectInspectionService projectInspectionService) {
		this.projectInspectionService = projectInspectionService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String projectInspectionId = request
				.getParameter("projectInspectionId");
		ProjectInspection projectInspection = null;
		if (StringUtils.isNotEmpty(projectInspectionId)) {
			projectInspection = projectInspectionService
					.getProjectInspection(projectInspectionId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (projectInspection != null) {
			// Map<String, UserProfile> userMap =
			// MxIdentityFactory.getUserProfileMap();
			responseJSON = projectInspection.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}
