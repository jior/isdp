package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.ArrayList;
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

import com.fasterxml.jackson.databind.node.ArrayNode;

import com.glaf.base.modules.sys.model.ITree;
import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.service.IsdpTreepnameService;

@Controller
@Path("/rs/isdp/treepname")
public class IsdpTreepnameResource {

	protected static final Log logger = LogFactory
			.getLog(IsdpTreepnameResource.class);

	protected IsdpTreepnameService isdpTreepnameService;

	@GET
	@POST
	@Path("/treeJson")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treeJson(@Context HttpServletRequest request) {
		List<IsdpTreepname> trees = isdpTreepnameService.getTreepnamesByDomainIndex(2);
		List<ITree> treeModels = new ArrayList<ITree>();
		for (IsdpTreepname row : trees) {
			treeModels.add(row);
			// logger.debug(row.toJsonObject().toJSONString());
		}
		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode responseJSON = treeHelper.getTreeArrayNode(treeModels);
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
