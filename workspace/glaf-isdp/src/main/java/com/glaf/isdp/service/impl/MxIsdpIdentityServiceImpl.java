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
import com.glaf.isdp.query.*;
import com.glaf.isdp.service.*;

@Service("isdpIdentityService")
@Transactional(readOnly = true)
public class MxIsdpIdentityServiceImpl implements IsdpIdentityService {
	protected static final Log logger = LogFactory
			.getLog(MxIsdpIdentityServiceImpl.class);

	protected EntityDAO entityDAO;

	protected IsdpTaskMapper isdpTaskMapper;

	protected IsdpIdmMapper isdpIdmMapper;

	protected ICellMenuService cellMenuService;

	protected ICellTreedotService cellTreedotService;

	protected IMyCellBusiessService mycellBusiessService;

	protected INetRoleUseService netRoleUseService;

	protected IRoleUseService roleUseService;

	protected IRoleUse2Service roleUse2Service;

	public MxIsdpIdentityServiceImpl() {

	}

	public RolePrivilege getRolePrivilege(String topId, int roleId) {
		RolePrivilege rp = new RolePrivilege();
		MyCellBusiessQuery query01 = new MyCellBusiessQuery();
		List<MyCellBusiess> rows01 = mycellBusiessService.list(query01);
		if (rows01 != null && !rows01.isEmpty()) {
			rp.setMycellBusiesses(rows01);
		}

		CellMenu cellMenu = cellMenuService.getCellMenu(topId);
		if (cellMenu != null) {
			rp.setCellMenu(cellMenu);
		}

		List<CellTreedot> rows02 = cellTreedotService
				.getCellTreedotsByTopId(topId);
		if (rows02 != null && !rows02.isEmpty()) {
			rp.setCellTreedots(rows02);
		}

		NetRoleUseQuery query03 = new NetRoleUseQuery();
		query03.roleid(roleId);
		List<NetRoleUse> rows03 = netRoleUseService.list(query03);
		if (rows03 != null && !rows03.isEmpty()) {
			rp.setNetRoleUses(rows03);
		}

		RoleUse2Query query04 = new RoleUse2Query();
		query04.roleId(String.valueOf(roleId));
		List<RoleUse2> rows04 = roleUse2Service.list(query04);
		if (rows04 != null && !rows04.isEmpty()) {
			rp.setRoleUse2s(rows04);
		}

		RoleUseQuery query05 = new RoleUseQuery();
		query05.roleId(String.valueOf(roleId));
		List<RoleUse> rows05 = roleUseService.list(query05);
		if (rows05 != null && !rows05.isEmpty()) {
			rp.setRoleUses(rows05);
		}

		return rp;
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

}
