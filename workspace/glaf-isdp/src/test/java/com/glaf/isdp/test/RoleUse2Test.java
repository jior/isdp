package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.RoleUse2;
import com.glaf.isdp.query.RoleUse2Query;
import com.glaf.isdp.service.IRoleUse2Service;
 

public class RoleUse2Test extends AbstractTest {

	protected IRoleUse2Service roleUse2Service;

	@Test
	public void testList() {
		roleUse2Service = super.getBean("roleUse2Service");
		RoleUse2Query query = new RoleUse2Query();
		//query.nameLike("¹¤³Ì");
		List<RoleUse2> rows = roleUse2Service
				.getRoleUse2sByQueryCriteria(0, 10, query);
		for (RoleUse2 row : rows) {
			roleUse2Service.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
