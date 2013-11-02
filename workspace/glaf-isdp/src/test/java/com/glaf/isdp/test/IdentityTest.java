package com.glaf.isdp.test;

import org.junit.Test;

import com.glaf.isdp.domain.RolePrivilege;
import com.glaf.isdp.service.IsdpIdentityService;
import com.glaf.test.AbstractTest;

public class IdentityTest extends AbstractTest {

	protected IsdpIdentityService isdpIdentityService;

	@Test
	public void testGetRolePrivileges() {
		isdpIdentityService = super.getBean("isdpIdentityService");
		RolePrivilege rp = isdpIdentityService.getRolePrivilege("system_init",
				15);
		logger.info(rp.toJsonObject().toJSONString());
		logger.info("---------------------------------------------");
		logger.info(rp.toObjectNode().toString());
	}

}
