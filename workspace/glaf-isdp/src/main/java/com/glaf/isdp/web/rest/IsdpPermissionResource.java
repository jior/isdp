package com.glaf.isdp.web.rest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
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
import com.glaf.base.helper.JacksonTreeHelper;
import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.model.FieldInterface;
import com.glaf.base.modules.sys.model.Filedot;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.base.modules.sys.service.IFieldInterfaceService;
import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.base.modules.sys.service.ITreedotService;
import com.glaf.core.util.LogUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.domain.MyCellBusiess;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.domain.RoleUse2;
import com.glaf.isdp.query.MyCellBusiessQuery;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.query.RoleUse2Query;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellRepInfoService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IRoleUse2Service;
 

@Controller
@Path("/rs/isdp/sys/permission")
public class IsdpPermissionResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpPermissionResource.class);

	protected ICellMenuService cellMenuService;

	protected ICellRepInfoService cellRepInfoService;

	protected ICellTreedotService cellTreedotService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected IFiledotService filedotService;

	protected IFieldInterfaceService fieldInterfaceService;

	protected IMyCellBusiessService myCellBusiessService;

	protected INetRoleService netRoleService;

	protected INetRoleUseService netRoleUseService;

	protected IRoleUse2Service roleUse2Service;

	protected ITreedotService treedotService;

	public IsdpPermissionResource() {

	}

	@GET
	@POST
	@Path("/baseDataPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] baseDataPerms(@Context HttpServletRequest request) {
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
		// LogUtils.debug("netRole:"+netRole);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (netRole != null) {
			LogUtils.debug("netRole:" + netRole.toObjectNode().toString());

			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByRoleId(Integer.parseInt(roleId));
			List<Integer> indexIds = new ArrayList<Integer>();
			if (roles != null && !roles.isEmpty()) {
				for (NetRoleUse r : roles) {
					indexIds.add(r.getCelltreedotIndex());
				}
			}

			String topId = "system_init";

			List<CellTreedot> dots = cellTreedotService
					.getCellTreedotsByTopId(topId);
			if (dots != null && !dots.isEmpty()) {
				LogUtils.debug("dots size=" + dots.size());
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
		}
		try {
			// LogUtils.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/dataPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] dataPerms(@Context HttpServletRequest request) {
		int indexId = RequestUtils.getInt(request, "indexId");
		int roleId = RequestUtils.getInt(request, "roleId");
		String filedotId = request.getParameter("filedotId");
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		List<FieldInterface> fields = fieldInterfaceService
				.getFieldsByFrmType("filedot");
		if (fields != null && !fields.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (FieldInterface f : fields) {
				arrayJSON.add(f.toObjectNode());
			}
			responseJSON.set("fields", arrayJSON);
		}
		List<Filedot> filedots = filedotService.getFiledotsOfTreedot(indexId);
		if (filedots != null && !filedots.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (Filedot dot : filedots) {
				arrayJSON.add(dot.toObjectNode());
			}
			responseJSON.set("filedots", arrayJSON);
		}

		List<CellRepInfo> notExistCellRepInfos = cellRepInfoService
				.getRoleUseNotExistsCellRepInfos(filedotId, roleId, indexId);
		if (notExistCellRepInfos != null && !notExistCellRepInfos.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (CellRepInfo f : notExistCellRepInfos) {
				arrayJSON.add(f.toObjectNode());
			}
			responseJSON.set("notExistCellRepInfos", arrayJSON);
		}

		List<CellRepInfo> existCellRepInfos = cellRepInfoService
				.getRoleUseExistsCellRepInfos(filedotId, roleId, indexId);
		if (existCellRepInfos != null && !existCellRepInfos.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (CellRepInfo f : existCellRepInfos) {
				arrayJSON.add(f.toObjectNode());
			}
			responseJSON.set("existCellRepInfos", arrayJSON);
		}

		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	@GET
	@POST
	@Path("/dataPermSet")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] dataPermSet(@Context HttpServletRequest request) {
		ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
		int indexId = RequestUtils.getInt(request, "indexId");
		List<Filedot> filedots = filedotService.getFiledotsOfTreedot(indexId);
		if (filedots != null && !filedots.isEmpty()) {
			for (Filedot dot : filedots) {
				List<CellRepInfo> reps = cellRepInfoService
						.getCellRepInfosByFiledotId(dot.getFileID());
				if (reps != null && !reps.isEmpty()) {
					for (CellRepInfo rep : reps) {
						arrayJSON.add(rep.toObjectNode());
					}
				}
			}
		}
		try {
			return arrayJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return arrayJSON.toString().getBytes();
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
	@Path("/perms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] perms(@Context HttpServletRequest request) {
		int roleId = RequestUtils.getInt(request, "roleId");
		String topId = request.getParameter("topId");
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		NetRole netRole = netRoleService.getNetRole(roleId);
		responseJSON.set("netRole", netRole.toObjectNode());
		MyCellBusiessQuery query = new MyCellBusiessQuery();
		List<MyCellBusiess> rows = myCellBusiessService.list(query);
		if (rows != null && !rows.isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (MyCellBusiess m : rows) {
				array.add(m.toObjectNode());
			}
			responseJSON.set("cellBusiesses", array);
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		List<NetRoleUse> roles = netRoleUseService
				.getNetRoleUsesByRoleId(roleId);
		List<Integer> indexIds = new ArrayList<Integer>();
		if (roles != null && !roles.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (NetRoleUse r : roles) {
				arrayJSON.add(r.toObjectNode());
				indexIds.add(r.getCelltreedotIndex());
			}
			responseJSON.set("roles", arrayJSON);
		}

		List<CellTreedot> treedots = cellTreedotService
				.getCellTreedotsByTopId(topId);
		if (treedots != null && !treedots.isEmpty()) {
			List<ITree> trees = new ArrayList<ITree>();
			for (CellTreedot p : treedots) {
				if (indexIds.contains(p.getIndexId())) {
					p.setChecked(true);
				}
				trees.add(p);
			}
			ObjectNode treeNode = treeHelper.getTreeJson(trees);
			responseJSON.set("treedots", treeNode);
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
	public void setCellRepInfoService(ICellRepInfoService cellRepInfoService) {
		this.cellRepInfoService = cellRepInfoService;
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
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	@javax.annotation.Resource
	public void setIFiledotService(IFiledotService filedotService) {
		this.filedotService = filedotService;
	}

	@javax.annotation.Resource
	public void setMyCellBusiessService(
			IMyCellBusiessService myCellBusiessService) {
		this.myCellBusiessService = myCellBusiessService;
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
	public void setRoleUse2Service(IRoleUse2Service roleUse2Service) {
		this.roleUse2Service = roleUse2Service;
	}

	@javax.annotation.Resource
	public void setTreedotService(ITreedotService treedotService) {
		this.treedotService = treedotService;
	}

	@GET
	@POST
	@Path("/subSysPerms")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] subSysPerms(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LogUtils.debug(params);

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
			RoleUse2Query q = new RoleUse2Query();

			q.roleId(roleId);

			List<RoleUse2> roles = roleUse2Service.list(q);
			Collection<String> list = new HashSet<String>();
			for (RoleUse2 r : roles) {
				list.add(r.getTreeId());
			}

			MyCellBusiessQuery query = new MyCellBusiessQuery();
			List<MyCellBusiess> rows = myCellBusiessService.list(query);
			if (rows != null && !rows.isEmpty()) {
				for (MyCellBusiess m : rows) {
					if (list.contains(m.getId())) {
						m.setChecked(true);
					}
					responseJSON.add(m.toObjectNode());
				}
			}
		}
		try {
			// LogUtils.debug(responseJSON.toString());
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
