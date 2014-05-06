package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.NetDotRole;
import com.glaf.isdp.query.NetDotRoleQuery;
import com.glaf.isdp.service.INetDotRoleService;
 

public class NetDotRoleTest extends AbstractTest {

	protected INetDotRoleService netDotRoleService;

	@Test
	public void testList() {
		netDotRoleService = super.getBean("netDotRoleService");
		NetDotRoleQuery query = new NetDotRoleQuery();
		//query.nameLike("工程");
		List<NetDotRole> rows = netDotRoleService
				.getNetDotRolesByQueryCriteria(0, 10, query);
		for (NetDotRole row : rows) {
			netDotRoleService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
