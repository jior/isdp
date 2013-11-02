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

import com.glaf.core.freemarker.TemplateUtils;
import com.glaf.core.util.Paging;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.Tools;

import com.glaf.isdp.config.IsdpTemplateConfig;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.domain.IsdpPfile;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.query.PfileQuery;
import com.glaf.isdp.service.IFieldInterfaceService;
import com.glaf.isdp.service.IHintListService;
import com.glaf.isdp.service.IsdpPfileService;
import com.glaf.isdp.service.IsdpTreepInfoService;

@Controller
@Path("/rs/isdp/pfile")
public class IsdpPfileResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpPfileResource.class);

	protected IsdpPfileService pfileService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	protected IFieldInterfaceService fieldInterfaceService;

	protected IHintListService hintListService;

	@POST
	@Path("/deleteAll")
	public void deleteAll(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String rowIds = request.getParameter("rowIds");
		if (rowIds != null) {
			List<String> ids = StringTools.split(rowIds);
			if (ids != null && !ids.isEmpty()) {
				// pfileService.deleteByIds(ids);
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
				// pfileService.deleteByIds(ids);
			}
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete")
	public void deleteById(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String pfileId = request.getParameter("pfileId");
		if (StringUtils.isEmpty(pfileId)) {
			pfileId = request.getParameter("id");
		}
		if (pfileId != null) {
			pfileService.deleteById(pfileId);
		} else {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
	}

	@POST
	@Path("/delete/{pfileId}")
	public void deleteById(@PathParam("pfileId") String pfileId,
			@Context UriInfo uriInfo) {
		if (pfileId != null) {
			pfileService.deleteById(pfileId);
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
		PfileQuery query = new PfileQuery();
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
		int total = pfileService.getPfileCountByQueryCriteria(query);
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

			List<IsdpPfile> list = pfileService.getPfilesByQueryCriteria(start,
					limit, query);

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				for (IsdpPfile pfile : list) {
					rowsJSON.add(pfile.toObjectNode());
				}

			}
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/panel")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] panel(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String pfileId = request.getParameter("pfileId");
		IsdpPfile pfile = null;
		logger.debug("pfileId:" + pfileId);
		if (StringUtils.isNotEmpty(pfileId)) {
			pfile = pfileService.getPfile(pfileId);
		}
		StringBuffer buffer = new StringBuffer();
		List<FieldInterface> columns = new ArrayList<FieldInterface>();
		if (pfile != null) {
			List<FieldInterface> fields = fieldInterfaceService
					.getListShowFields("pfile", pfile.getIndexId());
			if (fields == null || fields.isEmpty()) {
				fields = fieldInterfaceService.getFieldsByFrmType("pfile");
			}
			if (fields != null && !fields.isEmpty()) {
				for (FieldInterface f : fields) {
					if (!"tname".equals(f.getDname())) {

						columns.add(f);
					}
				}
			}
		}
		// logger.debug("columns size:" + columns.size());
		if (columns.size() > 0) {
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("columns", columns);
			String text = IsdpTemplateConfig.getContent("detail");
			// logger.debug("tpl text:" + text);
			if (text != null && text.length() > 100) {
				String result = TemplateUtils.process(context, text);
				if (result != null && result.length() > 100) {
					// System.out.println(result);
					buffer.append(result);
				}
			}
		}

		try {
			return buffer.toString().getBytes("UTF-8");
		} catch (Exception ex) {
			return buffer.toString().getBytes();
		}
	}

	@POST
	@Path("/save")
	public void savePfile(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String pfileId = request.getParameter("pfileId");
		if (StringUtils.isEmpty(pfileId)) {
			pfileId = request.getParameter("id");
		}
		IsdpPfile pfile = null;
		if (StringUtils.isNotEmpty(pfileId)) {
			pfile = pfileService.getPfile(pfileId);
		}

		if (pfile == null) {
			pfile = new IsdpPfile();
		}

		Map<String, Object> params = RequestUtils.getParameterMap(request);
		Tools.populate(pfile, params);

		this.pfileService.save(pfile);
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	@javax.annotation.Resource
	public void setHintListService(IHintListService hintListService) {
		this.hintListService = hintListService;
	}

	@javax.annotation.Resource
	public void setIsdpPfileService(IsdpPfileService pfileService) {
		this.pfileService = pfileService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@GET
	@POST
	@Path("/treefiles")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treefiles(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		PfileQuery query = new PfileQuery();
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

		String indexId = request.getParameter("indexId");
		IsdpTreepInfo treepInfo = null;
		String treepinfoIdLike = null;
		if (StringUtils.isNotEmpty(indexId)) {
			treepInfo = isdpTreepInfoService.getTreepInfoByPrimaryKey(Integer
					.valueOf(indexId));
		}
		if (treepInfo != null) {
			treepinfoIdLike = treepInfo.getId() + "%";
		} else {
			treepinfoIdLike = request.getParameter("treepinfoIdLike");
			if (treepinfoIdLike != null) {
				treepinfoIdLike = treepinfoIdLike + "%";
			}
		}
		logger.debug("treepinfoIdLike=" + treepinfoIdLike);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		int total = pfileService.getTreePfileCount(treepinfoIdLike, "1", "0");
		responseJSON.put("total", total);
		responseJSON.put("totalCount", total);
		responseJSON.put("totalRecords", total);
		if (total > 0) {
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

			List<IsdpPfile> list = pfileService.getTreePfiles(treepinfoIdLike, "1",
					"0");

			if (list != null && !list.isEmpty()) {
				ArrayNode rowsJSON = new ObjectMapper().createArrayNode();
				if ("yui".equals(gridType)) {
					responseJSON.put("records", rowsJSON);
				} else {
					responseJSON.put("rows", rowsJSON);
				}

				int sortNo = 0;
				for (IsdpPfile pfile : list) {
					sortNo++;
					ObjectNode node = pfile.toObjectNode();
					node.put("sortNo", sortNo);
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

	@GET
	@POST
	@Path("/view")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] view(@Context HttpServletRequest request,
			@Context UriInfo uriInfo) {
		String pfileId = request.getParameter("pfileId");
		IsdpPfile pfile = null;
		logger.debug("pfileId:" + pfileId);
		if (StringUtils.isNotEmpty(pfileId)) {
			pfile = pfileService.getPfile(pfileId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (pfile != null) {
			responseJSON = pfile.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
