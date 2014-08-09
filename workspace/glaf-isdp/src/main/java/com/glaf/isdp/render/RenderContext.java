package com.glaf.isdp.render;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.glaf.base.modules.sys.model.CellTreedot;
import com.glaf.base.modules.sys.service.ICellTreedotDotService;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.base.modules.sys.service.ICellTreedotService;
import com.glaf.base.modules.sys.service.ICellTreedotViewService;
import com.glaf.base.modules.sys.service.IFiledotService;
import com.glaf.base.modules.sys.service.ITreedotService;
import com.glaf.core.security.LoginContext;
import com.glaf.isdp.service.*;

public class RenderContext {

	protected CellTreedot cellTreedot;

	protected HttpServletRequest request;

	protected HttpServletResponse response;

	protected LoginContext loginContext;

	protected Map<String, Object> parameterMap = new HashMap<String, Object>();

	protected Map<String, Object> contextMap = new HashMap<String, Object>();

	protected ICellMenuService cellMenuService;

	protected ICellRepInfoService cellRepInfoService;

	protected ICellTreedotService cellTreedotService;

	protected ICellTreedotPerService cellTreedotPerService;

	protected ICellUpicInfoService cellUpicInfoService;

	protected ICellUseDataInfoService cellUseDataInfoService;

	protected IFiledotService isdpFiledotService;

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

	protected IsdpCellFillFormService isdpCellFillFormService;

	protected IsdpCellFormService isdpCellFormService;

	protected ICellMyTaskMainService cellMyTaskMainService;

	protected ICellMyTaskService cellMyTaskService;

	protected ICellRepInfo2Service cellRepInfo2Service;

	protected ICellTableTreeService cellTableTreeService;

	protected ICellTreedotDotService cellTreedotDotService;

	protected ICellTreedotViewService cellTreedotViewService;

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

	protected IsdpPfileService isdpPfileService;

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

	public RenderContext() {

	}

	public RenderContext(HttpServletRequest request,
			HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public RenderContext(LoginContext loginContext,
			Map<String, Object> parameterMap) {
		this.loginContext = loginContext;
		this.parameterMap = parameterMap;
	}

	public ICellCriterionService getCellCriterionService() {
		return cellCriterionService;
	}

	public ICellCriterionTreeService getCellCriterionTreeService() {
		return cellCriterionTreeService;
	}

	public ICellDataFieldService getCellDataFieldService() {
		return cellDataFieldService;
	}

	public ICellDataTableService getCellDataTableService() {
		return cellDataTableService;
	}

	public ICellDottofileService getCellDottofileService() {
		return cellDottofileService;
	}

	public IsdpCellFillFormService getIsdpCellFillFormService() {
		return isdpCellFillFormService;
	}

	public ICellMenuService getCellMenuService() {
		return cellMenuService;
	}

	public ICellMyTaskMainService getCellMyTaskMainService() {
		return cellMyTaskMainService;
	}

	public ICellMyTaskService getCellMyTaskService() {
		return cellMyTaskService;
	}

	public ICellRepInfo2Service getCellRepInfo2Service() {
		return cellRepInfo2Service;
	}

	public ICellRepInfoService getCellRepInfoService() {
		return cellRepInfoService;
	}

	public ICellTableTreeService getCellTableTreeService() {
		return cellTableTreeService;
	}

	public CellTreedot getCellTreedot() {
		return cellTreedot;
	}

	public ICellTreedotDotService getCellTreedotDotService() {
		return cellTreedotDotService;
	}

	public ICellTreedotPerService getCellTreedotPerService() {
		return cellTreedotPerService;
	}

	public ICellTreedotService getCellTreedotService() {
		return cellTreedotService;
	}

	public ICellTreedotViewService getCellTreedotViewService() {
		return cellTreedotViewService;
	}

	public ICellTreehintService getCellTreehintService() {
		return cellTreehintService;
	}

	public Map<String, Object> getContextMap() {
		return contextMap;
	}

	public IsdpDotuseService getIsdpDotuseService() {
		return isdpDotuseService;
	}

	public IFieldInterfaceService getFieldInterfaceService() {
		return fieldInterfaceService;
	}

	public IsdpFileattService getIsdpFileattService() {
		return isdpFileattService;
	}

	public IFiledotService getIFiledotService() {
		return isdpFiledotService;
	}

	public IFlowActivityDefService getFlowActivityDefService() {
		return flowActivityDefService;
	}

	public IFlowActivityService getFlowActivityService() {
		return flowActivityService;
	}

	public IFlowForwardDefService getFlowForwardDefService() {
		return flowForwardDefService;
	}

	public IFlowForwardService getFlowForwardService() {
		return flowForwardService;
	}

	public IFlowProcessDefService getFlowProcessDefService() {
		return flowProcessDefService;
	}

	public IFlowProcessService getFlowProcessService() {
		return flowProcessService;
	}

	public IFlowStationService getFlowStationService() {
		return flowStationService;
	}

	public IHintListService getHintListService() {
		return hintListService;
	}

	public IHintService getHintService() {
		return hintService;
	}

	public IsdpCellFormService getIsdpCellFormService() {
		return isdpCellFormService;
	}

	public IsdpIdentityService getIsdpIdentityService() {
		return isdpIdentityService;
	}

	public IsdpRoleService getIsdpRoleService() {
		return isdpRoleService;
	}

	public IsdpTreeService getIsdpTreeService() {
		return isdpTreeService;
	}

	public LoginContext getLoginContext() {
		return loginContext;
	}

	public IMyCellBusiessService getMyCellBusiessService() {
		return myCellBusiessService;
	}

	public IMyCellTaskService getMyCellTaskService() {
		return myCellTaskService;
	}

	public IMyCellTaskSubService getMyCellTaskSubService() {
		return myCellTaskSubService;
	}

	public INetDotRoleService getNetDotRoleService() {
		return netDotRoleService;
	}

	public INetRoleService getNetRoleService() {
		return netRoleService;
	}

	public INetRoleUseService getNetRoleUseService() {
		return netRoleUseService;
	}

	public Map<String, Object> getParameterMap() {
		return parameterMap;
	}

	public IsdpPfileAttService getIsdpPfileAttService() {
		return isdpPfileAttService;
	}

	public IsdpPfileService getIsdpPfileService() {
		return isdpPfileService;
	}

	public IsdpPinfoService getIsdpPinfoService() {
		return isdpPinfoService;
	}

	public IProjectCellAndFileRefService getProjectCellAndFileRefService() {
		return projectCellAndFileRefService;
	}

	public IProjectCellAndFileService getProjectCellAndFileService() {
		return projectCellAndFileService;
	}

	public IProjectOrganizationService getProjectOrganizationService() {
		return projectOrganizationService;
	}

	public IProjectTreeAllwbsService getProjectTreeAllwbsService() {
		return projectTreeAllwbsService;
	}

	public IProjectTreeService getProjectTreeService() {
		return projectTreeService;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public IRoleUse2Service getRoleUse2Service() {
		return roleUse2Service;
	}

	public IRoleUseService getRoleUseService() {
		return roleUseService;
	}

	public ITreedotService getTreedotService() {
		return treedotService;
	}

	public ITreeFolderService getTreeFolderService() {
		return treeFolderService;
	}

	public IsdpTreepInfoService getIsdpTreepInfoService() {
		return isdpTreepInfoService;
	}

	public ITreepInfoUserService getTreepInfoUserService() {
		return treepInfoUserService;
	}

	public IsdpTreepnameService getIsdpTreepnameService() {
		return isdpTreepnameService;
	}

	public ITreeProjectParService getTreeProjectParService() {
		return treeProjectParService;
	}

	public ITreeProjectService getTreeProjectService() {
		return treeProjectService;
	}

	public ITreepurService getTreepurService() {
		return treepurService;
	}

	public ITreetopService getTreetopService() {
		return treetopService;
	}

	public ITreevmainService getTreevmainService() {
		return treevmainService;
	}

	public ITreevmainUserService getTreevmainUserService() {
		return treevmainUserService;
	}

	public ITreewbsAutoindexService getTreewbsAutoindexService() {
		return treewbsAutoindexService;
	}

	public ITreewbsAutostartService getTreewbsAutostartService() {
		return treewbsAutostartService;
	}

	public ITreewbsNameService getTreewbsNameService() {
		return treewbsNameService;
	}

	public ITreewbsService getTreewbsService() {
		return treewbsService;
	}

	public ITreewbsTabService getTreewbsTabService() {
		return treewbsTabService;
	}

	public IUserInfoService getUserInfoService() {
		return userInfoService;
	}

	public IUserRoleService getUserRoleService() {
		return userRoleService;
	}

	public IUserTaskService getUserTaskService() {
		return userTaskService;
	}

	public void setAttribute(String name, Object value) {
		if (request != null) {
			request.setAttribute(name, value);
		}
	}

	public void setCellCriterionService(
			ICellCriterionService cellCriterionService) {
		this.cellCriterionService = cellCriterionService;
	}

	public void setCellCriterionTreeService(
			ICellCriterionTreeService cellCriterionTreeService) {
		this.cellCriterionTreeService = cellCriterionTreeService;
	}

	public void setCellDataFieldService(
			ICellDataFieldService cellDataFieldService) {
		this.cellDataFieldService = cellDataFieldService;
	}

	public void setCellDataTableService(
			ICellDataTableService cellDataTableService) {
		this.cellDataTableService = cellDataTableService;
	}

	public void setCellDottofileService(
			ICellDottofileService cellDottofileService) {
		this.cellDottofileService = cellDottofileService;
	}

	public void setIsdpCellFillFormService(IsdpCellFillFormService isdpCellFillFormService) {
		this.isdpCellFillFormService = isdpCellFillFormService;
	}

	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	public void setCellMyTaskMainService(
			ICellMyTaskMainService cellMyTaskMainService) {
		this.cellMyTaskMainService = cellMyTaskMainService;
	}

	public void setCellMyTaskService(ICellMyTaskService cellMyTaskService) {
		this.cellMyTaskService = cellMyTaskService;
	}

	public void setCellRepInfo2Service(ICellRepInfo2Service cellRepInfo2Service) {
		this.cellRepInfo2Service = cellRepInfo2Service;
	}

	public void setCellRepInfoService(ICellRepInfoService cellRepInfoService) {
		this.cellRepInfoService = cellRepInfoService;
	}

	public void setCellTableTreeService(
			ICellTableTreeService cellTableTreeService) {
		this.cellTableTreeService = cellTableTreeService;
	}

	public void setCellTreedot(CellTreedot cellTreedot) {
		this.cellTreedot = cellTreedot;
	}

	public void setCellTreedotDotService(
			ICellTreedotDotService cellTreedotDotService) {
		this.cellTreedotDotService = cellTreedotDotService;
	}

	public void setCellTreedotPerService(
			ICellTreedotPerService cellTreedotPerService) {
		this.cellTreedotPerService = cellTreedotPerService;
	}

	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}

	public void setCellTreedotViewService(
			ICellTreedotViewService cellTreedotViewService) {
		this.cellTreedotViewService = cellTreedotViewService;
	}

	public void setCellTreehintService(ICellTreehintService cellTreehintService) {
		this.cellTreehintService = cellTreehintService;
	}

	public void setCellUpicInfoService(ICellUpicInfoService cellUpicInfoService) {
		this.cellUpicInfoService = cellUpicInfoService;
	}

	public void setCellUseDataInfoService(
			ICellUseDataInfoService cellUseDataInfoService) {
		this.cellUseDataInfoService = cellUseDataInfoService;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public void setIsdpDotuseService(IsdpDotuseService isdpDotuseService) {
		this.isdpDotuseService = isdpDotuseService;
	}

	public void setFieldInterfaceService(
			IFieldInterfaceService fieldInterfaceService) {
		this.fieldInterfaceService = fieldInterfaceService;
	}

	public void setIsdpFileattService(IsdpFileattService isdpFileattService) {
		this.isdpFileattService = isdpFileattService;
	}

	public void setIFiledotService(IFiledotService isdpFiledotService) {
		this.isdpFiledotService = isdpFiledotService;
	}

	public void setFlowActivityDefService(
			IFlowActivityDefService flowActivityDefService) {
		this.flowActivityDefService = flowActivityDefService;
	}

	public void setFlowActivityService(IFlowActivityService flowActivityService) {
		this.flowActivityService = flowActivityService;
	}

	public void setFlowForwardDefService(
			IFlowForwardDefService flowForwardDefService) {
		this.flowForwardDefService = flowForwardDefService;
	}

	public void setFlowForwardService(IFlowForwardService flowForwardService) {
		this.flowForwardService = flowForwardService;
	}

	public void setFlowProcessDefService(
			IFlowProcessDefService flowProcessDefService) {
		this.flowProcessDefService = flowProcessDefService;
	}

	public void setFlowProcessService(IFlowProcessService flowProcessService) {
		this.flowProcessService = flowProcessService;
	}

	public void setFlowStationService(IFlowStationService flowStationService) {
		this.flowStationService = flowStationService;
	}

	public void setHintListService(IHintListService hintListService) {
		this.hintListService = hintListService;
	}

	public void setHintService(IHintService hintService) {
		this.hintService = hintService;
	}

	public void setIsdpCellFormService(IsdpCellFormService isdpCellFormService) {
		this.isdpCellFormService = isdpCellFormService;
	}

	public void setIsdpIdentityService(IsdpIdentityService isdpIdentityService) {
		this.isdpIdentityService = isdpIdentityService;
	}

	public void setIsdpRoleService(IsdpRoleService isdpRoleService) {
		this.isdpRoleService = isdpRoleService;
	}

	public void setIsdpTreeService(IsdpTreeService isdpTreeService) {
		this.isdpTreeService = isdpTreeService;
	}

	public void setLoginContext(LoginContext loginContext) {
		this.loginContext = loginContext;
	}

	public void setMyCellBusiessService(
			IMyCellBusiessService myCellBusiessService) {
		this.myCellBusiessService = myCellBusiessService;
	}

	public void setMyCellTaskService(IMyCellTaskService myCellTaskService) {
		this.myCellTaskService = myCellTaskService;
	}

	public void setMyCellTaskSubService(
			IMyCellTaskSubService myCellTaskSubService) {
		this.myCellTaskSubService = myCellTaskSubService;
	}

	public void setNetDotRoleService(INetDotRoleService netDotRoleService) {
		this.netDotRoleService = netDotRoleService;
	}

	public void setNetRoleService(INetRoleService netRoleService) {
		this.netRoleService = netRoleService;
	}

	public void setNetRoleUseService(INetRoleUseService netRoleUseService) {
		this.netRoleUseService = netRoleUseService;
	}

	public void setParameterMap(Map<String, Object> parameterMap) {
		this.parameterMap = parameterMap;
	}

	public void setIsdpPfileAttService(IsdpPfileAttService isdpPfileAttService) {
		this.isdpPfileAttService = isdpPfileAttService;
	}

	public void setIsdpPfileService(IsdpPfileService isdpPfileService) {
		this.isdpPfileService = isdpPfileService;
	}

	public void setIsdpPinfoService(IsdpPinfoService isdpPinfoService) {
		this.isdpPinfoService = isdpPinfoService;
	}

	public void setProjectCellAndFileRefService(
			IProjectCellAndFileRefService projectCellAndFileRefService) {
		this.projectCellAndFileRefService = projectCellAndFileRefService;
	}

	public void setProjectCellAndFileService(
			IProjectCellAndFileService projectCellAndFileService) {
		this.projectCellAndFileService = projectCellAndFileService;
	}

	public void setProjectOrganizationService(
			IProjectOrganizationService projectOrganizationService) {
		this.projectOrganizationService = projectOrganizationService;
	}

	public void setProjectTreeAllwbsService(
			IProjectTreeAllwbsService projectTreeAllwbsService) {
		this.projectTreeAllwbsService = projectTreeAllwbsService;
	}

	public void setProjectTreeService(IProjectTreeService projectTreeService) {
		this.projectTreeService = projectTreeService;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public void setRoleUse2Service(IRoleUse2Service roleUse2Service) {
		this.roleUse2Service = roleUse2Service;
	}

	public void setRoleUseService(IRoleUseService roleUseService) {
		this.roleUseService = roleUseService;
	}

	public void setTreedotService(ITreedotService treedotService) {
		this.treedotService = treedotService;
	}

	public void setTreeFolderService(ITreeFolderService treeFolderService) {
		this.treeFolderService = treeFolderService;
	}

	public void setIsdpTreepInfoService(IsdpTreepInfoService isdpTreepInfoService) {
		this.isdpTreepInfoService = isdpTreepInfoService;
	}

	public void setTreepInfoUserService(
			ITreepInfoUserService treepInfoUserService) {
		this.treepInfoUserService = treepInfoUserService;
	}

	public void setIsdpTreepnameService(IsdpTreepnameService isdpTreepnameService) {
		this.isdpTreepnameService = isdpTreepnameService;
	}

	public void setTreeProjectParService(
			ITreeProjectParService treeProjectParService) {
		this.treeProjectParService = treeProjectParService;
	}

	public void setTreeProjectService(ITreeProjectService treeProjectService) {
		this.treeProjectService = treeProjectService;
	}

	public void setTreepurService(ITreepurService treepurService) {
		this.treepurService = treepurService;
	}

	public void setTreetopService(ITreetopService treetopService) {
		this.treetopService = treetopService;
	}

	public void setTreevmainService(ITreevmainService treevmainService) {
		this.treevmainService = treevmainService;
	}

	public void setTreevmainUserService(
			ITreevmainUserService treevmainUserService) {
		this.treevmainUserService = treevmainUserService;
	}

	public void setTreewbsAutoindexService(
			ITreewbsAutoindexService treewbsAutoindexService) {
		this.treewbsAutoindexService = treewbsAutoindexService;
	}

	public void setTreewbsAutostartService(
			ITreewbsAutostartService treewbsAutostartService) {
		this.treewbsAutostartService = treewbsAutostartService;
	}

	public void setTreewbsNameService(ITreewbsNameService treewbsNameService) {
		this.treewbsNameService = treewbsNameService;
	}

	public void setTreewbsService(ITreewbsService treewbsService) {
		this.treewbsService = treewbsService;
	}

	public void setTreewbsTabService(ITreewbsTabService treewbsTabService) {
		this.treewbsTabService = treewbsTabService;
	}

	public void setUserInfoService(IUserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public void setUserRoleService(IUserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}

	public void setUserTaskService(IUserTaskService userTaskService) {
		this.userTaskService = userTaskService;
	}

}
