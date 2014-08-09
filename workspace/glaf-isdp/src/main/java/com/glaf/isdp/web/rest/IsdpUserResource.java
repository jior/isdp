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
import com.glaf.core.util.FileUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.core.util.UUID32;
import com.glaf.isdp.domain.CellMenu;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.model.CellTreedotPer;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.query.CellTreedotPerQuery;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.isdp.query.CellMenuQuery;

import com.glaf.isdp.query.UserInfoQuery;
import com.glaf.isdp.service.ICellMenuService;

import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@Path("/rs/isdp/sys/user")
public class IsdpUserResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpUserResource.class);

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected INetRoleUseService netRoleUseService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected ICellTreedotPerService cellTreedotPerService;

	@GET
	@POST
	@Path("/dataPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] dataPerms(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		String actorId = request.getParameter("userId_enc");
		String businessId = request.getParameter("businessId");
		UserInfo user = null;
		if (StringUtils.isNotEmpty(actorId)) {
			actorId = RequestUtils.decodeString(actorId);
			user = userInfoService.getUserInfo(actorId);
		} else {
			UserInfoQuery query = new UserInfoQuery();
			Tools.populate(query, params);
			List<UserInfo> list = userInfoService.list(query);
			if (list != null && !list.isEmpty()) {
				user = list.get(0);
				actorId = user.getUserId();
			}
		}

		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (user != null) {
			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByUserId(actorId);
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
					JacksonTreeHelper treeHelper = new JacksonTreeHelper();
					responseJSON = treeHelper.getTreeArrayNode(trees);
					trees.clear();
					trees = null;
				}
			} else {
				CellTreedotPerQuery query = new CellTreedotPerQuery();
				Tools.populate(query, params);
				List<CellTreedotPer> rows = cellTreedotPerService.list(query);
				List<ITree> trees = new ArrayList<ITree>();

				for (CellTreedotPer d : rows) {
					if (indexIds.contains(d.getMenuIndex())) {
						d.setChecked(true);
					}
					trees.add(d);
				}
				JacksonTreeHelper treeHelper = new JacksonTreeHelper();
				responseJSON = treeHelper.getTreeArrayNode(trees);
				trees.clear();
				trees = null;
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
	@Path("/detail")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] detail(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		String actorId = request.getParameter("userId_enc");
		UserInfo user = null;
		if (StringUtils.isNotEmpty(actorId)) {
			actorId = RequestUtils.decodeString(actorId);
			user = userInfoService.getUserInfo(actorId);
		} else {
			UserInfoQuery query = new UserInfoQuery();
			Tools.populate(query, params);
			List<UserInfo> list = userInfoService.list(query);
			if (list != null && !list.isEmpty()) {
				user = list.get(0);
				actorId = user.getUserId();
			}
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (user != null) {
			responseJSON = user.toObjectNode();
			List<NetRole> roles = netRoleService.getNetRolesByUserId(actorId);
			if (roles != null && !roles.isEmpty()) {
				StringBuffer sb = new StringBuffer();
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				for (NetRole role : roles) {
					arrayJSON.add(role.toObjectNode());
					sb.append(role.getName()).append(FileUtils.newline);
				}
				responseJSON.set("roles", arrayJSON);
				responseJSON.put("roleNames", sb.toString());
			} else {
				responseJSON.put("roleNames", " ");
			}
		}
		try {
			// logger.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/info")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] info(@Context HttpServletRequest request) {
		String actorId = request.getParameter("userId_enc");
		logger.debug("#actorId=" + actorId);
		UserInfo user = null;
		if (StringUtils.isNotEmpty(actorId)) {
			actorId = RequestUtils.decodeString(actorId);
			user = userInfoService.getUserInfo(actorId);
		}
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		responseJSON.put("x", UUID32.getUUID());
		if (user != null) {
			responseJSON = user.toObjectNode();
			List<NetRole> roles = netRoleService.getNetRolesByUserId(actorId);
			if (roles != null && !roles.isEmpty()) {
				StringBuffer sb = new StringBuffer();
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				for (NetRole role : roles) {
					arrayJSON.add(role.toObjectNode());
					sb.append(role.getName()).append(FileUtils.newline);
				}
				responseJSON.set("roles", arrayJSON);
				responseJSON.put("roleNames", sb.toString());
			} else {
				responseJSON.put("roleNames", " ");
			}
		}
		try {
			// logger.debug(responseJSON.toString());
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
		String actorId = request.getParameter("userId_enc");
		String businessId = request.getParameter("businessId");
		UserInfo user = null;
		logger.debug("actorId=" + actorId);
		if (StringUtils.isNotEmpty(actorId)) {
			actorId = RequestUtils.decodeString(actorId);
			user = userInfoService.getUserInfo(actorId);
		} else {
			UserInfoQuery query = new UserInfoQuery();
			Tools.populate(query, params);
			List<UserInfo> list = userInfoService.list(query);
			if (list != null && !list.isEmpty()) {
				user = list.get(0);
				actorId = user.getUserId();
			}
		}
		logger.debug("user=" + user);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (user != null) {
			JacksonTreeHelper treeHelper = new JacksonTreeHelper();

			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByUserId(actorId);
			List<Integer> indexIds = new ArrayList<Integer>();
			if (roles != null && !roles.isEmpty()) {
				for (NetRoleUse r : roles) {
					indexIds.add(r.getCelltreedotIndex());
				}
			}

			List<ITree> trees = new ArrayList<ITree>();

			if (StringUtils.isNotEmpty(businessId)) {
				List<CellTreedot> dots = cellTreedotService
						.getCellTreedotsByTopId(businessId);
				if (dots != null && !dots.isEmpty()) {

					for (CellTreedot d : dots) {
						if (indexIds.contains(d.getIndexId())) {
							d.setChecked(true);
						}
						trees.add(d);
					}
				}
			} else {
				CellTreedotPerQuery query = new CellTreedotPerQuery();
				// Tools.populate(query, params);
				List<CellTreedotPer> rows = cellTreedotPerService.list(query);
				for (CellTreedotPer d : rows) {
					if (indexIds.contains(d.getMenuIndex())) {
						d.setChecked(true);
					}
					trees.add(d);
				}
			}

			responseJSON = treeHelper.getTreeArrayNode(trees);
			trees.clear();
			trees = null;
		}
		try {
			// logger.debug(responseJSON.toString());
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
		UserInfoQuery query = new UserInfoQuery();
		Tools.populate(query, params);
		List<UserInfo> rows = userInfoService.list(query);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (rows != null && !rows.isEmpty()) {
			responseJSON.put("total", rows.size());
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			int i = 1;
			for (UserInfo user : rows) {
				user.setSortNo(i++);
				ObjectNode objectNode = user.toObjectNode();
				objectNode.put("startIndex", user.getSortNo());
				arrayJSON.add(objectNode);
			}
			responseJSON.set("rows", arrayJSON);
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/searchUsers")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] searchUsers(@Context HttpServletRequest request) {
		String searchWord = request.getParameter("searchWord");
		List<UserInfo> rows = null;
		if (StringUtils.isNotEmpty(searchWord)) {
			searchWord = searchWord.trim();
			searchWord = "%" + searchWord + "%";
			rows = userInfoService.searchUsers(searchWord);
			logger.debug("searchWord:" + searchWord);
		} else {
			Map<String, Object> params = RequestUtils.getParameterMap(request);
			UserInfoQuery query = new UserInfoQuery();
			Tools.populate(query, params);
			rows = userInfoService.list(query);
		}
		logger.debug("users:" + rows);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (rows != null && !rows.isEmpty()) {
			int i = 1;
			for (UserInfo user : rows) {
				user.setSortNo(i++);
				responseJSON.add(user.toObjectNode());
			}
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

	@javax.annotation.Resource
	public void setCellTreedotPerService(
			ICellTreedotPerService cellTreedotPerService) {
		this.cellTreedotPerService = cellTreedotPerService;
	}

	@GET
	@POST
	@Path("/subSystem")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] subSystem(@Context HttpServletRequest request) {
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		CellMenuQuery query = new CellMenuQuery();
		List<CellMenu> menus = cellMenuService.list(query);
		if (menus != null && !menus.isEmpty()) {
			for (CellMenu m : menus) {
				if (!StringUtils.equals(m.getId(), "system_init")) {
					responseJSON.add(m.toObjectNode());
				}
			}
		}

		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
