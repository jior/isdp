package com.glaf.isdp.web.springmvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.base.modules.sys.service.ITreedotService;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.Tools;
import com.glaf.isdp.domain.IsdpTreepname;
import com.glaf.isdp.query.TreepnameQuery;
import com.glaf.isdp.service.*;

/**
 * /mx/isdp/wbs/plan?topId=20111031/admin-0000001
 */
@Controller
@RequestMapping("/isdp/wbs/plan")
public class IsdpWbsPlanController {
	protected final static Log logger = LogFactory
			.getLog(IsdpWbsPlanController.class);

	protected ICellMenuService cellMenuService;

	protected ICellRepInfoService cellRepInfoService;

	protected IFiledotService filedotService;

	protected IFieldInterfaceService fieldInterfaceService;

	protected IMyCellBusiessService myCellBusiessService;

	protected INetRoleService netRoleService;

	protected INetRoleUseService netRoleUseService;

	protected IRoleUse2Service roleUse2Service;

	protected ITreedotService treedotService;

	protected ICellCriterionService cellCriterionService;

	protected ICellCriterionTreeService cellCriterionTreeService;

	protected ICellDataFieldService cellDataFieldService;

	protected ICellDataTableService cellDataTableService;

	protected ICellDottofileService cellDottofileService;

	protected IsdpCellFillFormService isdpCellFillformService;

	protected IsdpCellFormService isdpCellFormService;

	protected ICellMyTaskMainService cellMyTaskMainService;

	protected ICellMyTaskService cellMyTaskService;

	protected ICellRepInfo2Service cellRepInfo2Service;

	protected ICellTableTreeService cellTableTreeService;

	protected ICellTreehintService cellTreehintService;

	protected IsdpDotuseService isdpDotuseService;

	protected IsdpFileattService isdpFileattService;

	protected IFlowActivityDefService flowActivityDefService;

	protected IFlowActivityService flowActivityService;

	protected IFlowForwardDefService flowForwardDefService;

	protected IFlowForwardService flowForwardService;

	protected IFlowProcessDefService flowProcessDefService;

	protected IFlowProcessService flowProcessService;

	protected IFlowStationService flowStationService;

	protected IHintListService hintListService;

	protected IHintService hintService;

	protected IsdpIdentityService isdpIdentityService;

	protected IMyCellTaskSubService myCellTaskSubService;

	protected IMyCellTaskService myCellTaskService;

	protected INetDotRoleService netDotRoleService;

	protected IUserInfoService userInfoService;

	protected IsdpPfileAttService isdpPfileAttService;

	protected IsdpPfileService pfileService;

	protected IsdpPinfoService isdpPinfoService;

	protected IProjectCellAndFileRefService projectCellAndFileRefService;

	protected IProjectCellAndFileService projectCellAndFileService;

	protected IProjectOrganizationService projectOrganizationService;

	protected IProjectTreeAllwbsService projectTreeAllwbsService;

	protected IProjectTreeService projectTreeService;

	protected IsdpRoleService isdpRoleService;

	protected IRoleUseService roleUseService;

	protected ITreeFolderService treeFolderService;

	protected IsdpTreepInfoService isdpTreepInfoService;

	protected ITreepInfoUserService treepInfoUserService;

	protected IsdpTreepnameService isdpTreepnameService;

	protected ITreeProjectParService treeProjectParService;

	protected ITreeProjectService treeProjectService;

	protected ITreepurService treepurService;

	protected IsdpTreeService isdpTreeService;

	protected ITreetopService treetopService;

	protected ITreevmainService treevmainService;

	protected ITreevmainUserService treevmainUserService;

	protected ITreewbsAutoindexService treewbsAutoindexService;

	protected ITreewbsAutostartService treewbsAutostartService;

	protected ITreewbsNameService treewbsNameService;

	protected ITreewbsTabService treewbsTabService;

	protected ITreewbsService treewbsService;

	protected IUserRoleService userRoleService;

	protected IUserTaskService userTaskService;

	public IsdpWbsPlanController() {

	}

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		RequestUtils.setRequestParameterToAttribute(request);
		Map<String, Object> paramMap = RequestUtils.getParameterMap(request);
		TreepnameQuery query = new TreepnameQuery();
		Tools.populate(query, paramMap);
		List<IsdpTreepname> list = isdpTreepnameService.list(query);
		request.setAttribute("projects", list);

		return new ModelAndView("/isdp/wbs/plan/list");
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
	public void setIsdpCellFillformService(
			IsdpCellFillFormService isdpCellFillformService) {
		this.isdpCellFillformService = isdpCellFillformService;
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
	public void setCellTreehintService(ICellTreehintService cellTreehintService) {
		this.cellTreehintService = cellTreehintService;
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
	public void setMyCellTasksService(IMyCellTaskService myCellTaskService) {
		this.myCellTaskService = myCellTaskService;
	}

	@javax.annotation.Resource
	public void setMyCellTasksSubService(
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
	public void setIsdpPfileService(IsdpPfileService pfileService) {
		this.pfileService = pfileService;
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
