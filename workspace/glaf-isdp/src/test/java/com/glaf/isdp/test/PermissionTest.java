package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.test.AbstractTest;

import com.glaf.core.util.FileUtils;
import com.glaf.isdp.domain.CellMenu;
import com.glaf.isdp.domain.CellRepInfo;
import com.glaf.isdp.domain.CellTreedot;
import com.glaf.isdp.domain.IsdpFiledot;
import com.glaf.isdp.domain.ITree;
import com.glaf.isdp.domain.MyCellBusiess;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.isdp.helper.IsdpJacksonTreeHelper;
import com.glaf.isdp.query.CellMenuQuery;
import com.glaf.isdp.query.MyCellBusiessQuery;
import com.glaf.isdp.service.ICellMenuService;
import com.glaf.isdp.service.ICellRepInfoService;
import com.glaf.isdp.service.ICellTreedotService;
import com.glaf.isdp.service.IsdpFiledotService;
import com.glaf.isdp.service.IMyCellBusiessService;
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.ITreedotService;
import com.glaf.isdp.service.IUserInfoService;

public class PermissionTest extends AbstractTest {

	protected ICellRepInfoService cellRepInfoService;

	protected ICellTreedotService cellTreedotService;

	protected IsdpFiledotService filedotService;

	protected IMyCellBusiessService mycellBusiessService;

	protected INetRoleUseService netRoleUseService;

	protected ITreedotService treedotService;

	protected ICellMenuService cellMenuService;

	protected IUserInfoService userInfoService;

	@Test
	public void testSysPerms() {
		mycellBusiessService = super.getBean("mycellBusiessService");
		cellTreedotService = super.getBean("cellTreedotService");
		MyCellBusiessQuery query = new MyCellBusiessQuery();
		List<MyCellBusiess> rows = mycellBusiessService.list(query);
		if (rows != null && !rows.isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (MyCellBusiess m : rows) {
				array.add(m.toObjectNode());
			}
			try {
				FileUtils.save("data/cell_business.json", array.toString()
						.getBytes("UTF-8"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String topId = "system_init";

		
		List<CellTreedot> dots = cellTreedotService
				.getCellTreedotsByTopId(topId);
		if (dots != null && !dots.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			List<ITree> trees = new ArrayList<ITree>();
			for (CellTreedot d : dots) {
				arrayJSON.add(d.toObjectNode());
				trees.add(d);
			}
			IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
			ArrayNode array = treeHelper.getTreeArrayNode(trees);
			try {
				FileUtils.save("data/treedots.json",
						array.toString().getBytes("UTF-8"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testDataPermSet() {
		logger.info("------------------testDataPermSet------------------");
		cellRepInfoService = super.getBean("cellRepInfoService");
		filedotService = super.getBean("filedotService");
		ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
		int indexId = 256;
		List<IsdpFiledot> filedots = filedotService.getFiledotsOfTreedot(indexId);
		if (filedots != null && !filedots.isEmpty()) {
			for (IsdpFiledot dot : filedots) {
				ObjectNode row = dot.toObjectNode();
				List<CellRepInfo> reps = cellRepInfoService
						.getCellRepInfosByFiledotId(dot.getFileID());
				if (reps != null && !reps.isEmpty()) {
					ArrayNode array = new ObjectMapper().createArrayNode();
					for (CellRepInfo rep : reps) {
						array.add(rep.toObjectNode());
					}
					row.put("cellRepInfos", array);
				}
				arrayJSON.add(row);
			}
		}
		logger.debug(arrayJSON.toString());
	}

	@Test
	public void testDataPerms() {
		String businessId = "system_init";
		cellTreedotService = super.getBean("cellTreedotService");
		List<CellTreedot> dots = cellTreedotService
				.getCellTreedotsByTopId(businessId);
		if (dots != null && !dots.isEmpty()) {
			List<ITree> trees = new ArrayList<ITree>();
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (CellTreedot d : dots) {
				arrayJSON.add(d.toObjectNode());
				trees.add(d);
			}
			IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
			ArrayNode array = treeHelper.getTreeArrayNode(trees);
			try {
				FileUtils.save("data/data_perms.json", array.toString()
						.getBytes("UTF-8"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Test
	public void testFunctionPerms() {
		String userId = "admin";
		String businessId = "system_init";
		cellTreedotService = super.getBean("cellTreedotService");
		netRoleUseService = super.getBean("netRoleUseService");
		userInfoService = super.getBean("userInfoService");
		cellMenuService = super.getBean("cellMenuService");
		UserInfo user = userInfoService.getUserInfo(userId);
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		if (user != null) {
			responseJSON = user.toObjectNode();
			IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
			CellMenuQuery query = new CellMenuQuery();
			List<CellMenu> menus = cellMenuService.list(query);
			if (menus != null && !menus.isEmpty()) {
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				for (CellMenu m : menus) {
					if (!StringUtils.equals(m.getId(), "system_init")) {
						arrayJSON.add(m.toObjectNode());
					}
				}
				responseJSON.put("sysMenus", arrayJSON);
			}

			List<NetRoleUse> roles = netRoleUseService
					.getNetRoleUsesByUserId(userId);
			List<Integer> indexIds = new ArrayList<Integer>();
			if (roles != null && !roles.isEmpty()) {
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				for (NetRoleUse r : roles) {
					arrayJSON.add(r.toObjectNode());
					indexIds.add(r.getCelltreedotIndex());
				}
				responseJSON.put("roles", arrayJSON);
			}

			List<CellTreedot> dots = cellTreedotService
					.getCellTreedotsByTopId(businessId);
			if (dots != null && !dots.isEmpty()) {
				ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
				List<ITree> trees = new ArrayList<ITree>();
				for (CellTreedot d : dots) {
					if (indexIds.contains(d.getIndexId())) {
						d.setChecked(true);
					}
					arrayJSON.add(d.toObjectNode());
					trees.add(d);
				}
				ObjectNode treeNode = treeHelper.getTreeJson(trees);
				responseJSON.put("treedots", treeNode);

				ArrayNode array = treeHelper.getTreeArrayNode(trees);

				try {
					FileUtils.save("data/function_perms.json", array.toString()
							.getBytes("UTF-8"));
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

	@Test
	public void testPerms() {
		logger.info("------------------testPerms------------------");
		cellRepInfoService = super.getBean("cellRepInfoService");
		filedotService = super.getBean("filedotService");
		cellTreedotService = super.getBean("cellTreedotService");
		mycellBusiessService = super.getBean("mycellBusiessService");
		netRoleUseService = super.getBean("netRoleUseService");
		treedotService = super.getBean("treedotService");
		int roleId = 15;
		String topId = "system_init";
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		MyCellBusiessQuery query = new MyCellBusiessQuery();
		List<MyCellBusiess> rows = mycellBusiessService.list(query);
		if (rows != null && !rows.isEmpty()) {
			ArrayNode array = new ObjectMapper().createArrayNode();
			for (MyCellBusiess m : rows) {
				array.add(m.toObjectNode());
			}
			responseJSON.put("cellBusiesses", array);
		}

		IsdpJacksonTreeHelper treeHelper = new IsdpJacksonTreeHelper();
		List<NetRoleUse> roles = netRoleUseService
				.getNetRoleUsesByRoleId(roleId);
		List<Integer> indexIds = new ArrayList<Integer>();
		if (roles != null && !roles.isEmpty()) {
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (NetRoleUse r : roles) {
				arrayJSON.add(r.toObjectNode());
				indexIds.add(r.getCelltreedotIndex());
			}
			responseJSON.put("roles", arrayJSON);
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
			responseJSON.put("treedots", treeNode);
		}
		logger.info(responseJSON.toString());
	}

}
