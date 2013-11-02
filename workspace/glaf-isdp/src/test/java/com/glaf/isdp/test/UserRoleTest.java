package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.UserRole;
import com.glaf.isdp.query.UserRoleQuery;
import com.glaf.isdp.service.IUserRoleService;
 

public class UserRoleTest extends AbstractTest {

	protected IUserRoleService userRoleService;

	@Test
	public void testList() {
		userRoleService = super.getBean("userRoleService");
		UserRoleQuery query = new UserRoleQuery();
		//query.nameLike("¹¤³Ì");
		List<UserRole> rows = userRoleService
				.getUserRolesByQueryCriteria(0, 10, query);
		for (UserRole row : rows) {
			userRoleService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
