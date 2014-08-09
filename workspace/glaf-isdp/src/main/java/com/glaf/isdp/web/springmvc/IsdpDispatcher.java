package com.glaf.isdp.web.springmvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.service.ICellTreedotDotService;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.base.modules.sys.service.ICellTreedotViewService;
import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.base.modules.sys.service.ITreedotService;
import com.glaf.core.config.Configuration;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.config.IsdpBaseConfiguration;
import com.glaf.isdp.domain.CellMenu;
import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.isdp.query.TreepnameQuery;
import com.glaf.isdp.render.RenderContainer;
import com.glaf.isdp.render.RenderContext;
import com.glaf.isdp.render.Renderer;
import com.glaf.isdp.service.*;
import com.glaf.isdp.util.EncodeUtils;

/**
 * /mx/isdp/dispatcher/main?topId=20111031/admin-0000001
 */
@Controller
@RequestMapping("/isdp/dispatcher")
public class IsdpDispatcher {
	protected static final Log logger = LogFactory.getLog(IsdpDispatcher.class);

	protected static final Configuration conf = IsdpBaseConfiguration.create();

	protected static final RenderContainer container = RenderContainer
			.getContainer();

	protected volatile ICellMenuService cellMenuService;

	protected volatile ICellRepInfoService cellRepInfoService;

	protected volatile ICellTreedotService cellTreedotService;

	protected volatile ICellTreedotPerService cellTreedotPerService;

	protected volatile IFiledotService filedotService;

	protected volatile IFieldInterfaceService fieldInterfaceService;

	protected volatile IMyCellBusiessService myCellBusiessService;

	protected volatile INetRoleService netRoleService;

	protected volatile INetRoleUseService netRoleUseService;

	protected volatile IRoleUse2Service roleUse2Service;

	protected volatile ITreedotService treedotService;

	protected volatile ICellCriterionService cellCriterionService;

	protected volatile ICellCriterionTreeService cellCriterionTreeService;

	protected volatile ICellDataFieldService cellDataFieldService;

	protected volatile ICellDataTableService cellDataTableService;

	protected volatile ICellDottofileService cellDottofileService;

	protected volatile IsdpCellFillFormService isdpCellFillFormService;

	protected volatile IsdpCellFormService isdpCellFormService;

	protected volatile ICellMyTaskMainService cellMyTaskMainService;

	protected volatile ICellMyTaskService cellMyTaskService;

	protected volatile ICellRepInfo2Service cellRepInfo2Service;

	protected volatile ICellTableTreeService cellTableTreeService;

	protected volatile ICellTreedotDotService cellTreedotDotService;

	protected volatile ICellTreedotViewService cellTreedotViewService;

	protected volatile ICellTreehintService cellTreehintService;

	protected volatile ICellUpicInfoService cellUpicInfoService;

	protected volatile ICellUseDataInfoService cellUseDataInfoService;

	protected volatile IsdpDotuseService isdpDotuseService;

	protected volatile IsdpFileattService isdpFileattService;

	protected volatile IFlowActivityDefService flowActivityDefService;

	protected volatile IFlowActivityService flowActivityService;

	protected volatile IFlowForwardDefService flowForwardDefService;

	protected volatile IFlowForwardService flowForwardService;

	protected volatile IFlowProcessDefService flowProcessDefService;

	protected volatile IFlowProcessService flowProcessService;

	protected volatile IFlowStationService flowStationService;

	protected volatile IHintListService hintListService;

	protected volatile IHintService hintService;

	protected volatile IsdpIdentityService isdpIdentityService;

	protected volatile IMyCellTaskSubService myCellTaskSubService;

	protected volatile IMyCellTaskService myCellTaskService;

	protected volatile INetDotRoleService netDotRoleService;

	protected volatile IUserInfoService userInfoService;

	protected volatile IsdpPfileAttService isdpPfileAttService;

	protected volatile IsdpPfileService isdpPfileService;

	protected volatile IsdpPinfoService isdpPinfoService;

	protected volatile IProjectCellAndFileRefService projectCellAndFileRefService;

	protected volatile IProjectCellAndFileService projectCellAndFileService;

	protected volatile IProjectOrganizationService projectOrganizationService;

	protected volatile IProjectTreeAllwbsService projectTreeAllwbsService;

	protected volatile IProjectTreeService projectTreeService;

	protected volatile IsdpRoleService isdpRoleService;

	protected volatile IRoleUseService roleUseService;

	protected volatile ITreeFolderService treeFolderService;

	protected volatile IsdpTreepInfoService isdpTreepInfoService;

	protected volatile ITreepInfoUserService treepInfoUserService;

	protected volatile IsdpTreepnameService isdpTreepnameService;

	protected volatile ITreeProjectParService treeProjectParService;

	protected volatile ITreeProjectService treeProjectService;

	protected volatile ITreepurService treepurService;

	protected volatile IsdpTreeService isdpTreeService;

	protected volatile ITreetopService treetopService;

	protected volatile ITreevmainService treevmainService;

	protected volatile ITreevmainUserService treevmainUserService;

	protected volatile ITreewbsAutoindexService treewbsAutoindexService;

	protected volatile ITreewbsAutostartService treewbsAutostartService;

	protected volatile ITreewbsNameService treewbsNameService;

	protected volatile ITreewbsTabService treewbsTabService;

	protected volatile ITreewbsService treewbsService;

	protected volatile IUserRoleService userRoleService;

	protected volatile IUserTaskService userTaskService;

	public IsdpDispatcher() {

	}

	@RequestMapping("/go")
	public ModelAndView go(HttpServletRequest request,
			HttpServletResponse response) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		request.setAttribute("contextPath", request.getContextPath());
		TreepnameQuery query = new TreepnameQuery();
		Tools.populate(query, paramMap);
		List<IsdpTreepname> list = isdpTreepnameService.list(query);
		request.setAttribute("projects", list);
		String moduleId = request.getParameter("moduleId");
		if (StringUtils.isNotEmpty(moduleId)) {
			logger.debug("->moduleId:" + moduleId);
			moduleId = EncodeUtils.decode(moduleId);
			logger.debug("moduleId:" + moduleId);
			CellTreedot cellTreedot = cellTreedotService
					.getCellTreedotById(moduleId);
			if (cellTreedot != null) {
				request.setAttribute("cellTreedot", cellTreedot);
				logger.debug(cellTreedot.toObjectNode().toString());

				RenderContext ctx = new RenderContext();
				ctx.setRequest(request);
				ctx.setResponse(response);
				ctx.setCellTreedot(cellTreedot);
				ctx.setLoginContext(RequestUtils.getLoginContext(request));
				ctx.setParameterMap(RequestUtils.getParameterMap(request));

				// C
				ctx.setCellCriterionService(cellCriterionService);
				ctx.setCellCriterionTreeService(cellCriterionTreeService);
				ctx.setCellDataFieldService(cellDataFieldService);
				ctx.setCellDataTableService(cellDataTableService);
				ctx.setCellDottofileService(cellDottofileService);
				ctx.setIsdpCellFillFormService(isdpCellFillFormService);
				ctx.setCellMenuService(cellMenuService);
				ctx.setCellMyTaskMainService(cellMyTaskMainService);
				ctx.setCellMyTaskService(cellMyTaskService);
				ctx.setCellRepInfo2Service(cellRepInfo2Service);
				ctx.setCellRepInfoService(cellRepInfoService);
				ctx.setCellTableTreeService(cellTableTreeService);
				ctx.setCellTreedotDotService(cellTreedotDotService);
				ctx.setCellTreedotPerService(cellTreedotPerService);
				ctx.setCellTreedotService(cellTreedotService);
				ctx.setCellTreedotViewService(cellTreedotViewService);
				ctx.setCellTreehintService(cellTreehintService);
				ctx.setCellUpicInfoService(cellUpicInfoService);
				ctx.setCellUseDataInfoService(cellUseDataInfoService);

				// D
				ctx.setIsdpDotuseService(isdpDotuseService);

				// F
				ctx.setFieldInterfaceService(fieldInterfaceService);
				ctx.setIsdpFileattService(isdpFileattService);
				ctx.setIFiledotService(filedotService);
				ctx.setFlowActivityDefService(flowActivityDefService);
				ctx.setFlowActivityService(flowActivityService);
				ctx.setFlowForwardDefService(flowForwardDefService);
				ctx.setFlowForwardService(flowForwardService);
				ctx.setFlowProcessDefService(flowProcessDefService);
				ctx.setFlowProcessService(flowProcessService);
				ctx.setFlowStationService(flowStationService);

				// H
				ctx.setHintListService(hintListService);
				ctx.setHintService(hintService);

				// I
				ctx.setIsdpCellFormService(isdpCellFormService);
				ctx.setIsdpIdentityService(isdpIdentityService);
				ctx.setIsdpRoleService(isdpRoleService);
				ctx.setIsdpTreeService(isdpTreeService);

				// M
				ctx.setMyCellBusiessService(myCellBusiessService);
				ctx.setMyCellTaskService(myCellTaskService);
				ctx.setMyCellTaskSubService(myCellTaskSubService);

				// N
				ctx.setNetDotRoleService(netDotRoleService);
				ctx.setNetRoleService(netRoleService);
				ctx.setNetRoleUseService(netRoleUseService);

				// P
				ctx.setIsdpPfileAttService(isdpPfileAttService);
				ctx.setIsdpPfileService(isdpPfileService);
				ctx.setIsdpPinfoService(isdpPinfoService);
				ctx.setProjectCellAndFileRefService(projectCellAndFileRefService);
				ctx.setProjectCellAndFileService(projectCellAndFileService);
				ctx.setProjectOrganizationService(projectOrganizationService);
				ctx.setProjectTreeAllwbsService(projectTreeAllwbsService);
				ctx.setProjectTreeService(projectTreeService);

				// R
				ctx.setRoleUse2Service(roleUse2Service);
				ctx.setRoleUseService(roleUseService);

				// T
				ctx.setTreedotService(treedotService);
				ctx.setTreeFolderService(treeFolderService);
				ctx.setIsdpTreepInfoService(isdpTreepInfoService);
				ctx.setTreepInfoUserService(treepInfoUserService);
				ctx.setIsdpTreepnameService(isdpTreepnameService);
				ctx.setTreeProjectParService(treeProjectParService);
				ctx.setTreeProjectService(treeProjectService);
				ctx.setTreepurService(treepurService);
				ctx.setTreetopService(treetopService);
				ctx.setTreevmainService(treevmainService);
				ctx.setTreevmainUserService(treevmainUserService);
				ctx.setTreewbsAutoindexService(treewbsAutoindexService);
				ctx.setTreewbsAutostartService(treewbsAutostartService);
				ctx.setTreewbsNameService(treewbsNameService);
				ctx.setTreewbsService(treewbsService);
				ctx.setTreewbsTabService(treewbsTabService);

				// U
				ctx.setUserInfoService(userInfoService);
				ctx.setUserRoleService(userRoleService);
				ctx.setUserTaskService(userTaskService);

				String view = null;
				Renderer renderer = null;
				String rendererName = null;
				/**
				 * 获取每个菜单项定制的渲染器
				 */
				rendererName = conf.get("isdp.renderer." + cellTreedot.getId());
				if (StringUtils.isEmpty(rendererName)) {
					/**
					 * 获取指定类别的渲染器
					 */
					if (cellTreedot.getCustomData() != null) {
						rendererName = cellTreedot.getCustomData();
					}
				}

				if (StringUtils.isNotEmpty(rendererName)) {
					renderer = container.getRenderer(rendererName);
				}

				if (renderer != null) {
					view = renderer.render(ctx);
				}

				if (view == null) {
					/**
					 * 获取每个菜单项定制的视图
					 */
					if (conf.get("isdp.view." + cellTreedot.getId()) != null) {
						view = conf.get("isdp.view." + cellTreedot.getId());
					} else {
						/**
						 * 获取指定类别的视图
						 */
						if (cellTreedot.getCustomData() != null) {
							view = "/isdp/dispatcher/"
									+ cellTreedot.getCustomData();
						}
					}
				}

				logger.debug("view:" + view);

				if (StringUtils.isNotEmpty(view)) {
					return new ModelAndView(view);
				}

				return new ModelAndView("/isdp/dispatcher/common");
			}
		}

		return new ModelAndView("/isdp/dispatcher/error");
	}

	@RequestMapping("/main")
	public ModelAndView main(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		String topId = request.getParameter("topId");// 20111031/admin-0000001
		if (StringUtils.isNotEmpty(topId)) {
			logger.debug("topId=" + topId);
			CellMenu cellMenu = cellMenuService.getCellMenuByBusinessId(topId);
			JSONArray result = new JSONArray();
			List<CellTreedot> treedots = cellTreedotService
					.getTopLevelCellTreedotsByTopId(topId);
			if (treedots != null && !treedots.isEmpty()) {
				for (CellTreedot treedot : treedots) {
					logger.debug("---------" + treedot.getIndexName()
							+ "------------");
					JSONObject objectNode = new JSONObject();
					objectNode.put("id", String.valueOf(treedot.getIndexId()));
					// objectNode.put("icon", "icon-"+i);
					objectNode.put("name", treedot.getIndexName());
					objectNode.put("icon", "icon-sys");
					objectNode.put("url", "#");
					result.add(objectNode);
					// objectNode.put("url", treedot.getIndexId());
					List<CellTreedot> children = cellTreedotService
							.getChildrenCellTreedots(treedot.getIndexId());
					if (children != null && !children.isEmpty()) {
						JSONArray childrenNode = new JSONArray();
						int i = 0;
						for (CellTreedot child : children) {
							i++;
							int indexId = child.getIndexId();
							String customData = child.getCustomData();
							String url = null;
							JSONObject node = new JSONObject();
							node.put("id", String.valueOf(child.getIndexId()));
							node.put("icon", "icon-" + i);
							node.put("name", child.getIndexName());
							/**
							 * 扩展点1:通过指定编号获取视图
							 */
							url = conf.get("isdp.url." + indexId);
							if (StringUtils.isEmpty(url)
									&& StringUtils.isNotEmpty(customData)) {
								/**
								 * 扩展点2:通过指定类型获取视图
								 */
								url = conf.get("isdp.url." + customData);
							}

							if (StringUtils.isNotEmpty(url)) {
								if (url.indexOf("?") != -1) {
									url = url + "&cellTreedotIndexId="
											+ child.getIndexId() + "&moduleId="
											+ EncodeUtils.encode(child.getId());
								} else {
									url = url + "?cellTreedotIndexId="
											+ child.getIndexId() + "&moduleId="
											+ EncodeUtils.encode(child.getId());
								}
							} else {
								url = "/mx/isdp/dispatcher/go?cellTreedotIndexId="
										+ child.getIndexId()
										+ "&moduleId="
										+ EncodeUtils.encode(child.getId());
							}

							node.put("url", url);
							childrenNode.add(node);
						}
						objectNode.put("children", childrenNode);
					}
				}
			}
			request.setAttribute("menus", result);
			request.setAttribute("cellMenu", cellMenu);
			request.setAttribute("treedots", treedots);
			request.setAttribute("scripts", result.toJSONString());
			logger.debug(result.toJSONString());
		}
		return new ModelAndView("/isdp/dispatcher/main");
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
	public void setCellDataFieldService(
			ICellDataFieldService cellDataFieldService) {
		this.cellDataFieldService = cellDataFieldService;
	}

	@javax.annotation.Resource
	public void setCellDataTableService(
			ICellDataTableService cellDataTableService) {
		this.cellDataTableService = cellDataTableService;
	}

	@javax.annotation.Resource
	public void setCellDottofileService(
			ICellDottofileService cellDottofileService) {
		this.cellDottofileService = cellDottofileService;
	}

	@javax.annotation.Resource
	public void setIsdpCellFillFormService(
			IsdpCellFillFormService isdpCellFillFormService) {
		this.isdpCellFillFormService = isdpCellFillFormService;
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
	public void setCellMyTaskService(ICellMyTaskService cellMyTaskService) {
		this.cellMyTaskService = cellMyTaskService;
	}

	@javax.annotation.Resource
	public void setCellRepInfo2Service(ICellRepInfo2Service cellRepInfo2Service) {
		this.cellRepInfo2Service = cellRepInfo2Service;
	}

	@javax.annotation.Resource
	public void setCellRepInfoService(ICellRepInfoService cellRepInfoService) {
		this.cellRepInfoService = cellRepInfoService;
	}

	@javax.annotation.Resource
	public void setCellTableTreeService(
			ICellTableTreeService cellTableTreeService) {
		this.cellTableTreeService = cellTableTreeService;
	}

	@javax.annotation.Resource
	public void setCellTreedotDotService(
			ICellTreedotDotService cellTreedotDotService) {
		this.cellTreedotDotService = cellTreedotDotService;
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
	public void setCellTreedotViewService(
			ICellTreedotViewService cellTreedotViewService) {
		this.cellTreedotViewService = cellTreedotViewService;
	}

	@javax.annotation.Resource
	public void setCellTreehintService(ICellTreehintService cellTreehintService) {
		this.cellTreehintService = cellTreehintService;
	}

	@javax.annotation.Resource
	public void setCellUpicInfoService(ICellUpicInfoService cellUpicInfoService) {
		this.cellUpicInfoService = cellUpicInfoService;
	}

	@javax.annotation.Resource
	public void setCellUseDataInfoService(
			ICellUseDataInfoService cellUseDataInfoService) {
		this.cellUseDataInfoService = cellUseDataInfoService;
	}

	@javax.annotation.Resource
	public void setIsdpDotuseService(IsdpDotuseService isdpDotuseService) {
		this.isdpDotuseService = isdpDotuseService;
	}

	@javax.annotation.Resource
	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	@javax.annotation.Resource
	public void setIsdpFileattService(IsdpFileattService isdpFileattService) {
		this.isdpFileattService = isdpFileattService;
	}

	@javax.annotation.Resource
	public void setIFiledotService(IFiledotService filedotService) {
		this.filedotService = filedotService;
	}

	@javax.annotation.Resource
	public void setFlowActivityDefService(
			IFlowActivityDefService flowActivityDefService) {
		this.flowActivityDefService = flowActivityDefService;
	}

	@javax.annotation.Resource
	public void setFlowActivityService(IFlowActivityService flowActivityService) {
		this.flowActivityService = flowActivityService;
	}

	@javax.annotation.Resource
	public void setFlowForwardDefService(
			IFlowForwardDefService flowForwardDefService) {
		this.flowForwardDefService = flowForwardDefService;
	}

	@javax.annotation.Resource
	public void setFlowForwardService(IFlowForwardService flowForwardService) {
		this.flowForwardService = flowForwardService;
	}

	@javax.annotation.Resource
	public void setFlowProcessDefService(
			IFlowProcessDefService flowProcessDefService) {
		this.flowProcessDefService = flowProcessDefService;
	}

	@javax.annotation.Resource
	public void setFlowProcessService(IFlowProcessService flowProcessService) {
		this.flowProcessService = flowProcessService;
	}

	@javax.annotation.Resource
	public void setFlowStationService(IFlowStationService flowStationService) {
		this.flowStationService = flowStationService;
	}

	@javax.annotation.Resource
	public void setHintListService(IHintListService hintListService) {
		this.hintListService = hintListService;
	}

	@javax.annotation.Resource
	public void setHintService(IHintService hintService) {
		this.hintService = hintService;
	}

	@javax.annotation.Resource
	public void setIsdpCellFormService(IsdpCellFormService isdpCellFormService) {
		this.isdpCellFormService = isdpCellFormService;
	}

	@javax.annotation.Resource
	public void setIsdpIdentityService(IsdpIdentityService isdpIdentityService) {
		this.isdpIdentityService = isdpIdentityService;
	}

	@javax.annotation.Resource
	public void setIsdpRoleService(IsdpRoleService isdpRoleService) {
		this.isdpRoleService = isdpRoleService;
	}

	@javax.annotation.Resource
	public void setIsdpTreeService(IsdpTreeService isdpTreeService) {
		this.isdpTreeService = isdpTreeService;
	}

	@javax.annotation.Resource
	public void setMyCellBusiessService(
			IMyCellBusiessService myCellBusiessService) {
		this.myCellBusiessService = myCellBusiessService;
	}

	@javax.annotation.Resource
	public void setMyCellTaskService(IMyCellTaskService myCellTaskService) {
		this.myCellTaskService = myCellTaskService;
	}

	@javax.annotation.Resource
	public void setMyCellTaskSubService(
			IMyCellTaskSubService myCellTaskSubService) {
		this.myCellTaskSubService = myCellTaskSubService;
	}

	@javax.annotation.Resource
	public void setNetDotRoleService(INetDotRoleService netDotRoleService) {
		this.netDotRoleService = netDotRoleService;
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
	public void setIsdpPfileAttService(IsdpPfileAttService isdpPfileAttService) {
		this.isdpPfileAttService = isdpPfileAttService;
	}

	@javax.annotation.Resource
	public void setIsdpPfileService(IsdpPfileService isdpPfileService) {
		this.isdpPfileService = isdpPfileService;
	}

	@javax.annotation.Resource
	public void setIsdpPinfoService(IsdpPinfoService isdpPinfoService) {
		this.isdpPinfoService = isdpPinfoService;
	}

	@javax.annotation.Resource
	public void setProjectCellAndFileRefService(
			IProjectCellAndFileRefService projectCellAndFileRefService) {
		this.projectCellAndFileRefService = projectCellAndFileRefService;
	}

	@javax.annotation.Resource
	public void setProjectCellAndFileService(
			IProjectCellAndFileService projectCellAndFileService) {
		this.projectCellAndFileService = projectCellAndFileService;
	}

	@javax.annotation.Resource
	public void setProjectOrganizationService(
			IProjectOrganizationService projectOrganizationService) {
		this.projectOrganizationService = projectOrganizationService;
	}

	@javax.annotation.Resource
	public void setProjectTreeAllwbsService(
			IProjectTreeAllwbsService projectTreeAllwbsService) {
		this.projectTreeAllwbsService = projectTreeAllwbsService;
	}

	@javax.annotation.Resource
	public void setProjectTreeService(IProjectTreeService projectTreeService) {
		this.projectTreeService = projectTreeService;
	}

	@javax.annotation.Resource
	public void setRoleUse2Service(IRoleUse2Service roleUse2Service) {
		this.roleUse2Service = roleUse2Service;
	}

	@javax.annotation.Resource
	public void setRoleUseService(IRoleUseService roleUseService) {
		this.roleUseService = roleUseService;
	}

	@javax.annotation.Resource
	public void setTreedotService(ITreedotService treedotService) {
		this.treedotService = treedotService;
	}

	@javax.annotation.Resource
	public void setTreeFolderService(ITreeFolderService treeFolderService) {
		this.treeFolderService = treeFolderService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepInfoService(
			IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	@javax.annotation.Resource
	public void setTreepInfoUserService(
			ITreepInfoUserService treepInfoUserService) {
		this.treepInfoUserService = treepInfoUserService;
	}

	@javax.annotation.Resource
	public void setIsdpTreepnameService(
			IsdpTreepnameService isdpTreepnameService) {
		this.isdpTreepnameService = isdpTreepnameService;
	}

	@javax.annotation.Resource
	public void setTreeProjectParService(
			ITreeProjectParService treeProjectParService) {
		this.treeProjectParService = treeProjectParService;
	}

	@javax.annotation.Resource
	public void setTreeProjectService(ITreeProjectService treeProjectService) {
		this.treeProjectService = treeProjectService;
	}

	@javax.annotation.Resource
	public void setTreepurService(ITreepurService treepurService) {
		this.treepurService = treepurService;
	}

	@javax.annotation.Resource
	public void setTreetopService(ITreetopService treetopService) {
		this.treetopService = treetopService;
	}

	@javax.annotation.Resource
	public void setTreevmainService(ITreevmainService treevmainService) {
		this.treevmainService = treevmainService;
	}

	@javax.annotation.Resource
	public void setTreevmainUserService(
			ITreevmainUserService treevmainUserService) {
		this.treevmainUserService = treevmainUserService;
	}

	@javax.annotation.Resource
	public void setTreewbsAutoindexService(
			ITreewbsAutoindexService treewbsAutoindexService) {
		this.treewbsAutoindexService = treewbsAutoindexService;
	}

	@javax.annotation.Resource
	public void setTreewbsAutostartService(
			ITreewbsAutostartService treewbsAutostartService) {
		this.treewbsAutostartService = treewbsAutostartService;
	}

	@javax.annotation.Resource
	public void setTreewbsNameService(ITreewbsNameService treewbsNameService) {
		this.treewbsNameService = treewbsNameService;
	}

	@javax.annotation.Resource
	public void setTreewbsService(ITreewbsService treewbsService) {
		this.treewbsService = treewbsService;
	}

	@javax.annotation.Resource
	public void setTreewbsTabService(ITreewbsTabService treewbsTabService) {
		this.treewbsTabService = treewbsTabService;
	}

	@javax.annotation.Resource
	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@javax.annotation.Resource
	public void setUserRoleService(IUserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}

	@javax.annotation.Resource
	public void setUserTaskService(IUserTaskService userTaskService) {
		this.userTaskService = userTaskService;
	}

}
