package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.RoleUse;
import com.glaf.isdp.query.RoleUseQuery;
import com.glaf.isdp.service.IRoleUseService;
 

public class RoleUseTest extends AbstractTest {

	protected IRoleUseService roleUseService;

	@Test
	public void testList() {
		roleUseService = super.getBean("roleUseService");
		RoleUseQuery query = new RoleUseQuery();
		//query.nameLike("工程");
		List<RoleUse> rows = roleUseService
				.getRoleUsesByQueryCriteria(0, 10, query);
		for (RoleUse row : rows) {
			roleUseService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
