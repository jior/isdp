package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.ArrayList;
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

import com.glaf.core.util.LogUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.TreepInfoQuery;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellTreedotPerService;
import com.glaf.isdp.service.ICellTreedotService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IsdpTreepInfoService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@Path("/rs/isdp/wbs/check")
public class IsdpWbsCheckResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpWbsCheckResource.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected INetRoleUseService netRoleUseService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected IMyCellBusiessService myCellBusiessService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	@GET
	@POST
	@Path("/treegrid")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] treegrid(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LogUtils.debug("params:" + params);
		int topId = RequestUtils.getInt(request, "topId", 1);
		long parentId = RequestUtils.getLong(request, "indexId", -1);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		TreepInfoQuery query = new TreepInfoQuery();
		Tools.populate(query, params);
		query.nodetype("0").topId(topId);
		query.parentId(parentId);

		List<IsdpTreepInfo> rows = isdpTreepInfoService.list(query);

		List<ITree> treeModels = new ArrayList<ITree>();
		for (IsdpTreepInfo row : rows) {
			treeModels.add(row);
		}

		LogUtils.debug("treeModels size:" + treeModels.size());

		IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
		responseJSON = treeHelper.getTreeArrayNode(treeModels);
		// LogUtils.debug(responseJSON.toString());

		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setCellTreedotPerService(
			ICellTreedotPerService cellTreedotPerService) {
		this.cellTreedotPerService = cellTreedotPerService;
	}

	@javax.annotation.Resource
	public void setMyCellBusiessService(
			IMyCellBusiessService myCellBusiessService) {
		this.myCellBusiessService = myCellBusiessService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}

	@javax.annotation.Resource
	public void setNetRoleService(INetRoleService netRoleService) {
		this.netRoleService = netRoleService;
	}

	@javax.annotation.Resource
	public void setNetRoleUseService(INetRoleUseService netRoleUseService) {
		this.netRoleUseService = netRoleUseService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

}
