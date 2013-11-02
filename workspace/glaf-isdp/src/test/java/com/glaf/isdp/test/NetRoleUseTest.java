package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.NetRoleUse;
import com.glaf.isdp.query.NetRoleUseQuery;
import com.glaf.isdp.service.INetRoleUseService;
 

public class NetRoleUseTest extends AbstractTest {

	protected INetRoleUseService netRoleUseService;

	@Test
	public void testList() {
		netRoleUseService = super.getBean("netRoleUseService");
		NetRoleUseQuery query = new NetRoleUseQuery();
		//query.nameLike("¹¤³Ì");
		List<NetRoleUse> rows = netRoleUseService
				.getNetRoleUsesByQueryCriteria(0, 10, query);
		for (NetRoleUse row : rows) {
			netRoleUseService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
