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
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.service.IsdpFiledotService;

@Controller
@Path("/rs/isdp/filedot")
public class IsdpFiledotResource {

	protected static final Log logger = LogFactory
			.getLog(IsdpFiledotResource.class);

	protected IsdpFiledotService isdpFiledotService;

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		logger.debug("->params:" + params);
		int wbsIndexId = RequestUtils.getInt(request, "wbsIndexId");
		int intistasks = RequestUtils.getInt(request, "intistasks", 101);
		List<IsdpFiledot> list = isdpFiledotService.getMyCellTaskFiles(wbsIndexId,
				intistasks);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (list != null && !list.isEmpty()) {
			int sortNo = 1;
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (IsdpFiledot dot : list) {
				ObjectNode node = dot.toObjectNode();
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
	public void setIsdpFiledotService(IsdpFiledotService isdpFiledotService) {
		this.isdpFiledotService = isdpFiledotService;
	}

}
