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

import com.glaf.isdp.domain.IsdpCellFillForm;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.query.CellFillFormQuery;
import com.glaf.isdp.service.IsdpCellFillFormService;
import com.glaf.isdp.service.IsdpTreepInfoService;

@Controller
@Path("/rs/isdp/cellFillForm")
public class IsdpCellFillFormResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpCellFillFormResource.class);

	protected IsdpCellFillFormService isdpCellFillFormService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	@POST
	@Path("/deleteAll")
	public void deleteAll(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String rowIds = request.getParameter("rowIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// isdpCellFillformService.deleteByIds(ids);
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
				// isdpCellFillformService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete")
	public void deleteById(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String cellFillformId = request.getParameter("cellFillformId");
		if (StringUtils.isEmpty(cellFillformId)) {
			cellFillformId = request.getParameter("id");
		}
		if (cellFillformId != null) {
			isdpCellFillFormService.deleteById(cellFillformId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete/{cellFillformId}")
	public void deleteById(@PathParam("cellFillformId") String cellFillformId,
			@Context UriInfo uriInfo) {
		if (cellFillformId != null) {
			isdpCellFillFormService.deleteById(cellFillformId);
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
		logger.debug("->params:" + params);

		String gridType = ParamUtils.getString(params, "gridType");
		if (gridType == null) {
			gridType = "easyui";
		}
		int pageNo = 1;
		int start = 0;
		int limit = 10;

		if ("easyui".equals(gridType)) {
			pageNo = ParamUtils.getInt(params, "page");
			limit = ParamUtils.getInt(params, "rows");
			start = (pageNo - 1) * limit;
		} else if ("extjs".equals(gridType)) {
			start = ParamUtils.getInt(params, "start");
			limit = ParamUtils.getInt(params, "limit");
		} else if ("yui".equals(gridType)) {
			start = ParamUtils.getInt(params, "startIndex");
			limit = ParamUtils.getInt(params, "results");
		}

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = Paging.DEFAULT_PAGE_SIZE;
		}

		String idLike = request.getParameter("idLike");
		int indexId = RequestUtils.getInt(request, "indexId");
		int treepInfoIndexId = RequestUtils.getInt(request, "treepInfoIndexId");

		IsdpTreepInfo treepInfo = isdpTreepInfoService
				.getTreepInfoByPrimaryKey(treepInfoIndexId);
		if (treepInfo != null) {
			idLike = treepInfo.getId() + "%";
		}
		Paging paging = isdpCellFillFormService.getPageFileCellFillForm(pageNo,
				limit, idLike, indexId);

		ObjectNode responseJSON = new ObjectMapper().createObjectNode();

		responseJSON.put("start", start);
		responseJSON.put("startIndex", start);
		responseJSON.put("limit", limit);
		responseJSON.put("pageSize", limit);

		int total = paging.getTotal();
		responseJSON.put("total", total);
		responseJSON.put("totalCount", total);
		responseJSON.put("totalRecords", total);
		if (total > 0) {

			List<Object> list = paging.getRows();

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				for (Object row : list) {
					IsdpCellFillForm cellFillform = (IsdpCellFillForm) row;
					ObjectNode node = cellFillform.toObjectNode();
					node.put("sortNo", ++start);
					rowsJSON.add(node);
				}

			}
		} else {
			ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
			for (int i = 0; i < limit; i++) {
				ObjectNode node = new ObjectMapper().createObjectNode();
				rowsJSON.add(node);
			}
			responseJSON.put("rows", rowsJSON);
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
		CellFillFormQuery query = new CellFillFormQuery();
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
		int total = isdpCellFillFormService
				.getCellFillFormCountByQueryCriteria(query);
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
			List<IsdpCellFillForm> list = isdpCellFillFormService
					.getCellFillFormsByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				// int sortNo = 0;
				for (IsdpCellFillForm cellFillform : list) {
					// sortNo++;
					ObjectNode node = cellFillform.toObjectNode();
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
	public void saveCellFillform(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String cellFillformId = request.getParameter("cellFillformId");
		if (StringUtils.isEmpty(cellFillformId)) {
			cellFillformId = request.getParameter("id");
		}
		IsdpCellFillForm cellFillform = null;
		if (StringUtils.isNotEmpty(cellFillformId)) {
			cellFillform = isdpCellFillFormService
					.getCellFillForm(cellFillformId);
		}

		if (cellFillform == null) {
			cellFillform = new IsdpCellFillForm();
		}

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Tools.populate(cellFillform, params);

		this.isdpCellFillFormService.save(cellFillform);
	}

	@javax.annotation.Resource
	public void setIsdpCellFillFormService(
			IsdpCellFillFormService isdpCellFillFormService) {
		this.isdpCellFillFormService = isdpCellFillFormService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(
			IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String cellFillformId = request.getParameter("cellFillFormId");
		IsdpCellFillForm cellFillform = null;
		if (StringUtils.isNotEmpty(cellFillformId)) {
			cellFillform = isdpCellFillFormService
					.getCellFillForm(cellFillformId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (cellFillform != null) {
			// Map<String, UserProfile> userMap =
			// MxIdentityFactory.getUserProfileMap();
			responseJSON = cellFillform.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}
}
