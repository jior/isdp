package com.glaf.isdp.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.dao.EntityDAO;
import com.glaf.isdp.domain.*;
import com.glaf.isdp.mapper.*;
import com.glaf.isdp.service.*;

@Service("isdpCellFormService")
@Transactional(readOnly = true)
public class MxIsdpCellFormServiceImpl implements IsdpCellFormService {
	protected static final Log logger = LogFactory
			.getLog(MxIsdpCellFormServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IsdpTaskMapper isdpTaskMapper;

	protected IsdpIdmMapper isdpIdmMapper;

	protected ICellDataTableService cellDataTableService;

	protected ICellDataFieldService cellDataFieldService;

	protected ICellRepInfoService cellRepInfoService;

	protected ICellRepInfo2Service cellRepInfo2Service;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected IMyCellBusiessService mycellBusiessService;

	protected INetRoleUseService netRoleUseService;

	protected IRoleUseService roleUseService;

	protected IRoleUse2Service roleUse2Service;

	public MxIsdpCellFormServiceImpl() {

	}

	/**
	 * 根据文件定义编号获取表单定义信息
	 * 
	 * @param filedotId
	 * @return
	 */
	public CellForm getCellFormByFiledotId(String filedotId) {
		CellForm cellForm = new CellForm();
		List<CellDataTable> tables = cellDataTableService
				.getCellDataTablesByFiledotId(filedotId);
		cellForm.setDataTables(tables);

		List<CellDataField> fields = cellDataFieldService
				.getCellDataFieldsByFiledotId(filedotId);
		cellForm.setDataFields(fields);

		List<CellRepInfo> repInfos = cellRepInfoService
				.getCellRepInfosByFiledotId(filedotId);
		cellForm.setMasterRepInfos(repInfos);

		List<CellRepInfo2> repInfos2 = cellRepInfo2Service
				.getCellRepInfo2sByFiledotId(filedotId);
		cellForm.setSlaveRepInfos(repInfos2);

		return cellForm;
	}

	@Resource
	public void setCellMenuService(ICellMenuService cellMenuService) {
		this.cellMenuService = cellMenuService;
	}

	@Resource
	public void setCellTreedotService(ICellTreedotService cellTreedotService) {
		this.cellTreedotService = cellTreedotService;
	}


	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@Resource
	public void setIsdpIdmMapper(IsdpIdmMapper isdpIdmMapper) {
		this.isdpIdmMapper = isdpIdmMapper;
	}

	@Resource
	public void setIsdpTaskMapper(IsdpTaskMapper isdpTaskMapper) {
		this.isdpTaskMapper = isdpTaskMapper;
	}

	@Resource
	public void setMycellBusiessService(
			IMyCellBusiessService mycellBusiessService) {
		this.mycellBusiessService = mycellBusiessService;
	}

	@Resource
	public void setNetRoleUseService(INetRoleUseService netRoleUseService) {
		this.netRoleUseService = netRoleUseService;
	}

	@Resource
	public void setRoleUse2Service(IRoleUse2Service roleUse2Service) {
		this.roleUse2Service = roleUse2Service;
	}

	@Resource
	public void setRoleUseService(IRoleUseService roleUseService) {
		this.roleUseService = roleUseService;
	}

	@Resource
	public void setCellDataTableService(
			ICellDataTableService cellDataTableService) {
		this.cellDataTableService = cellDataTableService;
	}

	@Resource
	public void setCellDataFieldService(
			ICellDataFieldService cellDataFieldService) {
		this.cellDataFieldService = cellDataFieldService;
	}

	@Resource
	public void setCellRepInfoService(ICellRepInfoService cellRepInfoService) {
		this.cellRepInfoService = cellRepInfoService;
	}

	@Resource
	public void setCellRepInfo2Service(ICellRepInfo2Service cellRepInfo2Service) {
		this.cellRepInfo2Service = cellRepInfo2Service;
	}

}
