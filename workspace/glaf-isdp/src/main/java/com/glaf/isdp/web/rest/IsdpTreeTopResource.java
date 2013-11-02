package com.glaf.isdp.web.rest;

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

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import com.glaf.core.util.RequestUtils;
import com.glaf.isdp.domain.Treetop;
import com.glaf.isdp.query.TreetopQuery;
import com.glaf.isdp.service.ITreetopService;

@Controller
@Path("/rs/isdp/treetop")
public class IsdpTreeTopResource {
	protected static final Log logger = LogFactory
			.getLog(IsdpTreeTopResource.class);

	protected ITreetopService treetopService;

	@javax.annotation.Resource
	public void setTreetopService(ITreetopService treetopService) {
		this.treetopService = treetopService;
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
		TreetopQuery query = new TreetopQuery();
		if (parentId != -1) {
			query.parentId(parentId);
		} else {
			query.setTopNode("true");
		}
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<Treetop> treetops = treetopService.list(query);
		// List<ITree> treeModels = new ArrayList<ITree>();
		for (Treetop row : treetops) {
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

}
