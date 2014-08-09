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
import org.apache.commons.lang3.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.util.Paging;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.Tools;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.query.TreepInfoQuery;

import com.glaf.isdp.service.IsdpTreepInfoService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@Path("/rs/isdp/treepInfo")
public class IsdpTreepInfoResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpTreepInfoResource.class);

	protected ICellTreedotService cellTreedotService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	protected IUserInfoService userInfoService;

	@POST
	@Path("/deleteAll")
	public void deleteAll(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String rowIds = request.getParameter("rowIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// isdpTreepInfoService.deleteByIds(ids);
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
				// isdpTreepInfoService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete")
	public void deleteById(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String treepInfoId = request.getParameter("treepInfoId");
		if (StringUtils.isEmpty(treepInfoId)) {
			treepInfoId = request.getParameter("id");
		}
		if (treepInfoId != null) {
			isdpTreepInfoService.deleteById(treepInfoId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete/{treepInfoId}")
	public void deleteById(@PathParam("treepInfoId") String treepInfoId,
			@Context UriInfo uriInfo) {
		if (treepInfoId != null) {
			isdpTreepInfoService.deleteById(treepInfoId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug(params);
		long parentId = RequestUtils.getLong(request, "id");
		TreepInfoQuery query = new TreepInfoQuery();
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<IsdpTreepInfo> list = null;
		if (parentId > 0) {
			query.parentId(parentId);
		} else {
			query.topId(1).parentId(-1L);
		}

		list = isdpTreepInfoService.list(query);

		if (list != null && !list.isEmpty()) {
			List<ITree> treeModels = new ArrayList<ITree>();
			for (IsdpTreepInfo treepInfo : list) {
				treeModels.add(treepInfo);
			}
			JacksonTreeHelper treeHelper = new JacksonTreeHelper();
			responseJSON = treeHelper.getTreeArrayNode(treeModels);
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/list")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] list(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		TreepInfoQuery query = new TreepInfoQuery();
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
		int total = isdpTreepInfoService
				.getTreepInfoCountByQueryCriteria(query);
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

			List<IsdpTreepInfo> list = isdpTreepInfoService
					.getTreepInfosByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.set("records", rowsJSON);
				} else {
					responseJSON.set("rows", rowsJSON);
				}

				for (IsdpTreepInfo treepInfo : list) {
					rowsJSON.add(treepInfo.toObjectNode());
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
	public void saveTreepInfo(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String treepInfoId = request.getParameter("treepInfoId");
		if (StringUtils.isEmpty(treepInfoId)) {
			treepInfoId = request.getParameter("id");
		}
		IsdpTreepInfo treepInfo = null;
		if (StringUtils.isNotEmpty(treepInfoId)) {
			treepInfo = isdpTreepInfoService.getTreepInfoById(treepInfoId);
		}

		if (treepInfo == null) {
			treepInfo = new IsdpTreepInfo();
		}

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Tools.populate(treepInfo, params);

		this.isdpTreepInfoService.save(treepInfo);
	}

	@javax.annotation.Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(
			IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@GET
	@POST
	@Path("/treeJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treeJson(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		String actorId = RequestUtils.getActorId(request);
		int treedotIndexId = RequestUtils.getInt(request, "cellTreedotIndexId");
		String parentId = request.getParameter("id");
		UserInfo userInfo = userInfoService.getUserInfo(actorId);
		logger.debug(params);

		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<IsdpTreepInfo> list = null;

		CellTreedot cellTreedot = cellTreedotService
				.getCellTreedotByPrimaryKey(treedotIndexId);

		if (StringUtils.isNotEmpty(parentId)) {
			TreepInfoQuery query = new TreepInfoQuery();
			query.topId(userInfo.getDomainIndex());
			query.parentId(Long.parseLong(parentId));
			query.nodetype("0");
			// list = isdpTreepInfoService.list(query);
		} else {
			List<String> rowIds = null;
			if (cellTreedot != null
					&& StringUtils.equals(cellTreedot.getCustomData(), "f-1")) {
				List<IsdpTreepInfo> rows = isdpTreepInfoService
						.getTreepInfosByTreedotIndexId(treedotIndexId);
				if (rows != null && !rows.isEmpty()) {
					rowIds = new ArrayList<String>();
					for (IsdpTreepInfo p : rows) {
						rowIds.add(p.getId());
					}
				} else {
					TreepInfoQuery query = new TreepInfoQuery();
					query.topId(userInfo.getDomainIndex());
					query.parentId(-1L);
					rows = isdpTreepInfoService.list(query);
					if (rows != null && !rows.isEmpty()) {
						rowIds = new ArrayList<String>();
						for (IsdpTreepInfo p : rows) {
							rowIds.add(p.getId());
						}
					}
				}
			} else {
				rowIds = isdpTreepInfoService.getTreepInfoIds(String
						.valueOf(treedotIndexId));
			}

			if (rowIds != null && !rowIds.isEmpty()) {
				logger.debug("rowIds:" + rowIds);
				list = isdpTreepInfoService.getTreepInfoList(rowIds,
						userInfo.getDomainIndex(), "0");
			}
		}

		if (list != null && !list.isEmpty()) {
			List<ITree> treeModels = new ArrayList<ITree>();
			for (IsdpTreepInfo treepInfo : list) {
				treeModels.add(treepInfo);
			}
			logger.debug("treeModels:" + treeModels.size());
			JacksonTreeHelper treeHelper = new JacksonTreeHelper();
			responseJSON = treeHelper.getTreeArrayNode(treeModels);
		}
		try {
			// logger.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/view/{treepInfoId}")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@PathParam("treepInfoId") String treepInfoId,
			@Context UriInfo uriInfo) {
		IsdpTreepInfo treepInfo = null;
		if (StringUtils.isNotEmpty(treepInfoId)) {
			treepInfo = isdpTreepInfoService.getTreepInfoById(treepInfoId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (treepInfo != null) {
			responseJSON = treepInfo.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}
