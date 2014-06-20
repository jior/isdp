package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.util.RequestUtils;

import com.glaf.isdp.domain.CellMyTask;
import com.glaf.isdp.query.CellMyTaskQuery;
import com.glaf.isdp.service.ICellMyTaskService;

@Controller
@Path("/rs/isdp/cellMyTask")
public class IsdpCellMyTaskResource {

	protected static final Log logger = LogFactory
			.getLog(IsdpCellMyTaskResource.class);

	protected ICellMyTaskService cellMyTaskService;

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug("->params:" + params);
		int indexId = RequestUtils.getInt(request, "indexId");
		CellMyTaskQuery query = new CellMyTaskQuery();
		query.indexId(indexId);
		List<CellMyTask> list = cellMyTaskService.list(query);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (list != null && !list.isEmpty()) {
			int sortNo = 1;
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (CellMyTask m : list) {
				ObjectNode node = m.toObjectNode();
				node.put("sortNo", sortNo++);
				arrayJSON.add(node);
			}
			responseJSON.set("rows", arrayJSON);
			responseJSON.put("total", arrayJSON.size());
		} else {
			responseJSON.put("rows", "[]");
			responseJSON.put("total", 0);
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setCellMyTaskService(ICellMyTaskService cellMyTaskService) {
		this.cellMyTaskService = cellMyTaskService;
	}

}
