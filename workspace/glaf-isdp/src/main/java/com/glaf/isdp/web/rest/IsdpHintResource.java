package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.isdp.domain.HintList;
import com.glaf.isdp.query.HintListQuery;
import com.glaf.isdp.service.IHintListService;

@Controller
@Path("/rs/isdp/hint")
public class IsdpHintResource {

	protected final static Log logger = LogFactory
			.getLog(IsdpHintResource.class);

	protected IHintListService hintListService;

	@GET
	@POST
	@Path("/hint/{hintid}")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] hint(@PathParam("hintid") String hintid) {
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		HintListQuery query = new HintListQuery();
		query.hintid(hintid);
		List<HintList> list = hintListService.list(query);
		if (list != null && !list.isEmpty()) {
			for (HintList hint : list) {
				responseJSON.add(hint.toObjectNode());
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
	@Path("/json")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] json(@Context HttpServletRequest request) {
		String hintid = request.getParameter("hintid");
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		HintListQuery query = new HintListQuery();
		query.hintid(hintid);
		List<HintList> list = hintListService.list(query);
		if (list != null && !list.isEmpty()) {
			for (HintList hint : list) {
				responseJSON.add(hint.toObjectNode());
			}
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setHintListService(IHintListService hintListService) {
		this.hintListService = hintListService;
	}

}
