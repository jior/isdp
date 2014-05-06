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
import com.glaf.isdp.domain.CellCriterionTree;
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.ProjectCellAndFile;
import com.glaf.isdp.domain.ProjectTreeAllwbs;
import com.glaf.isdp.domain.IsdpTreepInfo;
import com.glaf.isdp.domain.TreewbsTab;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.ProjectTreeAllwbsQuery;
import com.glaf.isdp.query.TreepInfoQuery;
import com.glaf.isdp.query.TreewbsTabQuery;
import com.glaf.isdp.service.ICellCriterionService;
import com.glaf.isdp.service.ICellCriterionTreeService;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellMyTaskMainService;
import com.glaf.isdp.service.ICellTreedotPerService;
import com.glaf.isdp.service.ICellTreedotService;
import com.glaf.isdp.service.IsdpFiledotService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IProjectCellAndFileService;
import com.glaf.isdp.service.IProjectTreeAllwbsService;
import com.glaf.isdp.service.IsdpTreepInfoService;
import com.glaf.isdp.service.ITreewbsTabService;
import com.glaf.isdp.service.IUserInfoService;

@Controller
@Path("/rs/isdp/wbs")
public class IsdpWbsResource {
	protected final static Log logger = LogFactory
			.getLog(IsdpWbsResource.class);

	protected ICellCriterionService cellCriterionService;

	protected ICellCriterionTreeService cellCriterionTreeService;

	protected ICellMyTaskMainService cellMyTaskMainService;

	protected IUserInfoService userInfoService;

	protected INetRoleService netRoleService;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected INetRoleUseService netRoleUseService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected IsdpFiledotService isdpFiledotService;

	protected IMyCellBusiessService myCellBusiessService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	protected ITreewbsTabService treewbsTabService;

	protected IProjectCellAndFileService projectCellAndFileService;

	protected IProjectTreeAllwbsService projectTreeAllwbsService;

	@GET
	@POST
	@Path("/executionList")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] executionList(@Context HttpServletRequest request) {
		int treepinfoIndexId = RequestUtils.getInt(request, "treepinfoIndexId");
		logger.debug("##treepinfoIndexId:" + treepinfoIndexId);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (treepinfoIndexId > 0) {
			projectTreeAllwbsService.reloadExecution(treepinfoIndexId);
			ProjectTreeAllwbsQuery query = new ProjectTreeAllwbsQuery();
			query.cellTaskIndexId(treepinfoIndexId);
			List<ProjectTreeAllwbs> rows = projectTreeAllwbsService.list(query);
			if (rows != null && !rows.isEmpty()) {
				List<ITree> trees = new ArrayList<ITree>();
				for (ProjectTreeAllwbs m : rows) {
					trees.add(m);
				}
				IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
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
	@Path("/fileCheckList")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] fileCheckList(@Context HttpServletRequest request) {
		int indexId = RequestUtils.getInt(request, "indexId");
		List<ProjectCellAndFile> rows = projectCellAndFileService
				.getWbsFileProjectCellAndFileByIndexId(indexId);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (rows != null && !rows.isEmpty()) {
			int sortNo = 0;
			for (ProjectCellAndFile m : rows) {
				sortNo++;
				m.setSortNo(sortNo);
				responseJSON.add(m.toObjectNode());
			}
		}
		// logger.debug("files:" + responseJSON.toString());
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

	/**
	 * 节点属性
	 * 
	 * @param request
	 * @return
	 */
	@GET
	@POST
	@Path("/nodeProps")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] nodeProps(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LogUtils.debug("params:" + params);
		int indexId = RequestUtils.getInt(request, "indexId", -1);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<IsdpFiledot> filedots = isdpFiledotService
				.getMyCellTaskFiles(indexId, 101);
		if (filedots != null && !filedots.isEmpty()) {
			for (IsdpFiledot dot : filedots) {
				responseJSON.add(dot.toObjectNode());
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
	@Path("/selectedTreegrid")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] selectedTreegrid(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LogUtils.debug("params:" + params);

		String activityId = request.getParameter("activityId");
		int indexId = cellMyTaskMainService
				.getCellMyTaskMainIndexIdByFlowActId(activityId);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();

		List<IsdpTreepInfo> rows = isdpTreepInfoService
				.getWbsTreepInfosByIndexId(indexId);

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
	public void setCellCriterionService(
			ICellCriterionService cellCriterionService) {
		this.cellCriterionService = cellCriterionService;
	}

	@javax.annotation.Resource
	public void setCellCriterionTreeService(
			ICellCriterionTreeService cellCriterionTreeService) {
		this.cellCriterionTreeService = cellCriterionTreeService;
	}

	@javax.annotation.Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@javax.annotation.Resource
	public void setCellMyTaskMainService(
			ICellMyTaskMainService cellMyTaskMainService) {
		this.cellMyTaskMainService = cellMyTaskMainService;
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
	public void setIsdpFiledotService(IsdpFiledotService isdpFiledotService) {
		this.isdpFiledotService = isdpFiledotService;
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
	public void setProjectCellAndFileService(
			IProjectCellAndFileService projectCellAndFileService) {
		this.projectCellAndFileService = projectCellAndFileService;
	}

	@javax.annotation.Resource
	public void setProjectTreeAllwbsService(
			IProjectTreeAllwbsService projectTreeAllwbsService) {
		this.projectTreeAllwbsService = projectTreeAllwbsService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@javax.annotation.Resource
	public void setTreewbsTabService(ITreewbsTabService treewbsTabService) {
		this.treewbsTabService = treewbsTabService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	/**
	 * 相关规范
	 * 
	 * @param request
	 * @return
	 */
	@GET
	@POST
	@Path("/specs")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] specs(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		LogUtils.debug("params:" + params);
		int indexId = RequestUtils.getInt(request, "indexId", -1);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		List<CellCriterionTree> rows = cellCriterionTreeService
				.getCellCriterionTrees(indexId, 101);
		if (rows != null && !rows.isEmpty()) {
			for (CellCriterionTree m : rows) {
				responseJSON.add(m.toObjectNode());
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
	@Path("/tableCheckList")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] tableCheckList(@Context HttpServletRequest request) {
		int indexId = RequestUtils.getInt(request, "indexId");
		List<ProjectCellAndFile> rows = projectCellAndFileService
				.getWbsProjectCellAndFileByIndexId(indexId);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (rows != null && !rows.isEmpty()) {
			int sortNo = 0;
			for (ProjectCellAndFile m : rows) {
				sortNo++;
				m.setSortNo(sortNo);
				responseJSON.add(m.toObjectNode());
			}
		}
		// logger.debug(responseJSON.toString());
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

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

	@GET
	@POST
	@Path("/wbsTabs")
	@ResponseBody
	@Produces({ MediaType.APPLICATION_OCTET_STREAM })
	public byte[] wbsTabs(@Context HttpServletRequest request) {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		int indexId = RequestUtils.getInt(request, "indexId");
		TreewbsTabQuery query = new TreewbsTabQuery();
		Tools.populate(query, params);
		query.indexId(indexId);
		List<TreewbsTab> tabs = treewbsTabService.list(query);
		ArrayNode responseJSON = new ObjectMapper().createArrayNode();
		if (tabs != null && !tabs.isEmpty()) {
			for (TreewbsTab tab : tabs) {
				responseJSON.add(tab.toObjectNode());
			}
		}
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}
	}

}
