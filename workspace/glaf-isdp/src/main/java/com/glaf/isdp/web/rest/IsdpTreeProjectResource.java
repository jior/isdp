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
import com.glaf.isdp.domain.TreeProject;
import com.glaf.isdp.query.TreeProjectQuery;
import com.glaf.isdp.service.ITreeProjectService;

@Controller
@Path("/rs/isdp/treeProject")
public class IsdpTreeProjectResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpTreeProjectResource.class);

	protected ITreeProjectService treeProjectService;

	@POST
	@Path("/deleteAll")
	public void deleteAll(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String rowIds = request.getParameter("rowIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// treeProjectService.deleteByIds(ids);
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
				// treeProjectService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete")
	public void deleteById(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String treeProjectId = request.getParameter("treeProjectId");
		if (StringUtils.isEmpty(treeProjectId)) {
			treeProjectId = request.getParameter("id");
		}
		if (treeProjectId != null) {
			treeProjectService.deleteById(treeProjectId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete/{treeProjectId}")
	public void deleteById(@PathParam("treeProjectId") String treeProjectId,
			@Context UriInfo uriInfo) {
		if (treeProjectId != null) {
			treeProjectService.deleteById(treeProjectId);
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
		TreeProjectQuery query = new TreeProjectQuery();
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
		int total = treeProjectService
				.getTreeProjectCountByQueryCriteria(query);
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
			List<TreeProject> list = treeProjectService
					.getTreeProjectsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				// int sortNo = 0;
				for (TreeProject treeProject : list) {
					// sortNo++;
					ObjectNode node = treeProject.toObjectNode();
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
	public void saveTreeProject(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String treeProjectId = request.getParameter("treeProjectId");
		if (StringUtils.isEmpty(treeProjectId)) {
			treeProjectId = request.getParameter("id");
		}
		TreeProject treeProject = null;
		if (StringUtils.isNotEmpty(treeProjectId)) {
			treeProject = treeProjectService.getTreeProjectById(treeProjectId);
		}

		if (treeProject == null) {
			treeProject = new TreeProject();
		}

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Tools.populate(treeProject, params);

		this.treeProjectService.save(treeProject);
	}

	@javax.annotation.Resource
	public void setTreeProjectService(ITreeProjectService treeProjectService) {
		this.treeProjectService = treeProjectService;
	}

	@GET
	@POST
	@Path("/treeJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treeJson(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		long parentId = RequestUtils.getLong(request, "id", -1);
		logger.debug("params:" + params);
		TreeProjectQuery query = new TreeProjectQuery();
		query.parentId(parentId);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<TreeProject> treetops = treeProjectService.list(query);
		// List<ITree> treeModels = new ArrayList<ITree>();
		for (TreeProject row : treetops) {
			ObjectNode objectNode = row.toObjectNode();
			objectNode.put("isParent", true);
			responseJSON.add(objectNode);
		}

		try {
			logger.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String treeProjectId = request.getParameter("treeProjectId");
		TreeProject treeProject = null;
		if (StringUtils.isNotEmpty(treeProjectId)) {
			treeProject = treeProjectService.getTreeProjectById(treeProjectId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (treeProject != null) {
			// Map<String, UserProfile> userMap =
			// MxIdentityFactory.getUserProfileMap();
			responseJSON = treeProject.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}
