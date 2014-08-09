package com.glaf.isdp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.test.AbstractTest;
 
import com.glaf.base.modules.sys.model.CellTreedotPer;
import com.glaf.base.modules.sys.model.ITree;
import com.glaf.base.modules.sys.query.CellTreedotPerQuery;
import com.glaf.base.modules.sys.service.ICellTreedotPerService;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.domain.Role;
import com.glaf.base.helper.JacksonTreeHelper;
 
import com.glaf.isdp.query.RoleQuery;
 
import com.glaf.isdp.service.INetRoleUseService;
import com.glaf.isdp.service.IsdpRoleService;

public class RoleTest extends AbstractTest {

	protected IsdpRoleService roleService;

	protected INetRoleUseService netRoleUseService;

	protected ICellTreedotPerService cellTreedotPerService;

	@Test
	public void testList() {
		roleService = super.getBean("isdpRoleService");
		RoleQuery query = new RoleQuery();
		// query.nameLike("工程");
		List<Role> rows = roleService.getRolesByQueryCriteria(0, 10, query);
		for (Role row : rows) {
			roleService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

	@Test
	public void testFunctionPerms() {
		netRoleUseService = super.getBean("netRoleUseService");
		cellTreedotPerService = super.getBean("cellTreedotPerService");
		int roleId = 3;
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
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

		CellTreedotPerQuery query = new CellTreedotPerQuery();
		List<CellTreedotPer> rows = cellTreedotPerService.list(query);
		if (rows != null && !rows.isEmpty()) {
			List<ITree> trees = new ArrayList<ITree>();
			for (CellTreedotPer p : rows) {
				if (indexIds.contains(p.getIndexId())) {
					p.setChecked(true);
				}
				trees.add(p);
			}
			ObjectNode treeNode = treeHelper.getTreeJson(trees);
			responseJSON.set("treedots", treeNode);
		}

		logger.info(responseJSON.toString());

	}

}
