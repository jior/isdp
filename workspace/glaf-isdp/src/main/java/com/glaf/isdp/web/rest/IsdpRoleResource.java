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

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.domain.CellTreedot;
import com.glaf.isdp.domain.CellTreedotPer;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.CellTreedotPerQuery;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellTreedotPerService;
import com.glaf.isdp.service.ICellTreedotService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@Path("/rs/isdp/sys/role")
public class IsdpRoleResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpRoleResource.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected INetRoleUseService netRoleUseService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected IMyCellBusiessService myCellBusiessService;

	@GET
	@POST
	@Path("/dataPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] dataPerms(@Context HttpServletRequest request) {
		String roleId = request.getParameter("roleId");
		String businessId = request.getParameter("businessId");
		NetRole netRole = null;
		if (StringUtils.isNotEmpty(roleId) && StringUtils.isNumeric(roleId)) {
			netRole = netRoleService.getNetRole(Integer.parseInt(roleId));
		} else {
			NetRoleQuery query = new NetRoleQuery();
			List<NetRole> rows = netRoleService.list(query);
			if (rows != null && !rows.isEmpty()) {
				netRole = rows.get(0);
				roleId = String.valueOf(netRole.getId());
			}
		}

		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (netRole != null) {

			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByRoleId(Integer.parseInt(roleId));
			List<Integer> indexIds = new ArrayList<Integer>();
			if (roles != null && !roles.isEmpty()) {
				for (NetRoleUse r : roles) {
					indexIds.add(r.getCelltreedotIndex());
				}
			}

			if (StringUtils.isNotEmpty(businessId)) {
				List<CellTreedot> dots = cellTreedotService
						.getCellTreedotsByTopId(businessId);
				if (dots != null && !dots.isEmpty()) {
					List<ITree> trees = new ArrayList<ITree>();
					for (CellTreedot d : dots) {
						if (indexIds.contains(d.getIndexId())) {
							d.setChecked(true);
						}
						trees.add(d);
					}

					IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
					responseJSON = treeHelper.getTreeArrayNode(trees);
					trees.clear();
					trees = null;
				}
			}
		}
		try {
			logger.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/detail")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] detail(@Context HttpServletRequest request) {
		String roleId = request.getParameter("roleId");
		NetRole netRole = null;
		if (StringUtils.isNumeric(roleId)) {
			netRole = netRoleService.getNetRole(Integer.parseInt(roleId));
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (netRole != null) {
			responseJSON = netRole.toObjectNode();
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/functionPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] functionPerms(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		String roleId = request.getParameter("roleId");

		NetRole netRole = null;
		if (StringUtils.isNotEmpty(roleId) && StringUtils.isNumeric(roleId)) {
			netRole = netRoleService.getNetRole(Integer.parseInt(roleId));
		} else {
			NetRoleQuery query = new NetRoleQuery();
			List<NetRole> rows = netRoleService.list(query);
			if (rows != null && !rows.isEmpty()) {
				netRole = rows.get(0);
				roleId = String.valueOf(netRole.getId());
			}
		}

		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (netRole != null) {
			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByRoleId(Integer.parseInt(roleId));
			List<Integer> indexIds = new ArrayList<Integer>();
			if (roles != null && !roles.isEmpty()) {
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				for (NetRoleUse r : roles) {
					arrayJSON.add(r.toObjectNode());
					indexIds.add(r.getCelltreedotIndex());
				}

			}

			CellTreedotPerQuery query = new CellTreedotPerQuery();
			Tools.populate(query, params);

			List<CellTreedotPer> rows = cellTreedotPerService.list(query);
			if (rows != null && !rows.isEmpty()) {
				List<ITree> trees = new ArrayList<ITree>();
				for (CellTreedotPer p : rows) {
					if (indexIds.contains(p.getIndexId())) {
						p.setChecked(true);
					}
					trees.add(p);
				}
				IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
				responseJSON = treeHelper.getTreeArrayNode(trees);
				trees.clear();
				trees = null;
			}
		}
		try {
			logger.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@POST
	@Path("/info")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] info(@Context HttpServletRequest request) {
		String roleId = request.getParameter("roleId");
		NetRole netRole = null;
		if (StringUtils.isNumeric(roleId)) {
			netRole = netRoleService.getNetRole(Integer.parseInt(roleId));
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (netRole != null) {
			responseJSON = netRole.toObjectNode();
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
		String searchWord = request.getParameter("searchWord");
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		NetRoleQuery query = new NetRoleQuery();
		Tools.populate(query, params);
		if (searchWord != null) {
			searchWord = searchWord.trim();
			query.rolenameLike(searchWord);
		}
		List<NetRole> roles = netRoleService.list(query);
		if (roles != null && !roles.isEmpty()) {
			int i = 1;
			for (NetRole r : roles) {
				r.setSortNo(i++);
				responseJSON.add(r.toObjectNode());
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
	@Path("/list")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] list(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		NetRoleQuery query = new NetRoleQuery();
		Tools.populate(query, params);
		List<NetRole> roles = netRoleService.list(query);
		if (roles != null && !roles.isEmpty()) {
			responseJSON.put("total", roles.size());
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			int i = 1;
			for (NetRole r : roles) {
				r.setSortNo(i++);
				ObjectNode objectNode = r.toObjectNode();
				objectNode.put("startIndex", r.getSortNo());
				arrayJSON.add(objectNode);
			}
			responseJSON.put("rows", arrayJSON);
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setCellTreedotPerService(
			ICellTreedotPerService cellTreedotPerService) {
		this.cellTreedotPerService = cellTreedotPerService;
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
