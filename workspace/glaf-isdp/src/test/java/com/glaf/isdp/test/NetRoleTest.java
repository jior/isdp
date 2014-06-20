package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.isdp.domain.NetRole;
import com.glaf.isdp.query.NetRoleQuery;
import com.glaf.isdp.service.INetRoleService;

public class NetRoleTest extends AbstractTest {

	protected INetRoleService netRoleService;

	@Test
	public void testList() {
		netRoleService = super.getBean("netRoleService");
		NetRoleQuery query = new NetRoleQuery();
		// query.nameLike("工程");
		List<NetRole> rows = netRoleService.getNetRolesByQueryCriteria(0, 100,
				query);
		int listno = 1;
		ObjectNode responseJSON = new ObjectMapper().createObjectNode();
		ArrayNode array = new ObjectMapper().createArrayNode();
		for (NetRole row : rows) {
			netRoleService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
			ObjectNode objectNode = row.toObjectNode();
			objectNode.put("listno", listno++);
			array.add(objectNode);
		}
		responseJSON.set("rows", array);
		responseJSON.put("total", rows.size());

		try {
			FileUtils.save("data/net_role.json", responseJSON.toString()
					.getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
