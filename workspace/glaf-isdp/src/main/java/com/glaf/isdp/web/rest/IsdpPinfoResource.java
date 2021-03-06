package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.List;

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
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.RequestUtils;

import com.glaf.isdp.domain.IsdpPinfo;
import com.glaf.isdp.query.PinfoQuery;
import com.glaf.isdp.service.IsdpPinfoService;

@Controller
@Path("/rs/isdp/pinfo")
public class IsdpPinfoResource {

	protected static final Log logger = LogFactory
			.getLog(IsdpPinfoResource.class);

	protected IsdpPinfoService isdpPinfoService;

	@GET
	@POST
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		int indexId = RequestUtils.getInt(request, "indexId", 1);
		String dtag = RequestUtils.getString(request, "dtag", "1");
		PinfoQuery query = new PinfoQuery();
		query.indexId(indexId);
		query.dtag(dtag);
		List<IsdpPinfo> list = isdpPinfoService.list(query);
		if (list != null && !list.isEmpty()) {
			IsdpPinfo info = list.get(0);
			responseJSON = info.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setIsdpPinfoService(IsdpPinfoService isdpPinfoService) {
		this.isdpPinfoService = isdpPinfoService;
	}

}
