package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.test.AbstractTest;
import com.glaf.core.util.FileUtils;
import com.glaf.isdp.domain.UserInfo;
import com.glaf.isdp.query.UserInfoQuery;
import com.glaf.isdp.service.IUserInfoService;

public class UserInfoTest extends AbstractTest {

	protected IUserInfoService userInfoService;

	@Test
	public void testList() {
		userInfoService = super.getBean("userInfoService");
		UserInfoQuery query = new UserInfoQuery();
		// query.nameLike("工程");
		List<UserInfo> rows = userInfoService.getUserInfosByQueryCriteria(0,
				100, query);

		ObjectNode result = new ObjectMapper().createObjectNode();
		if (rows != null && !rows.isEmpty()) {
			int listno = 1;
			result.put("total", rows.size());
			ArrayNode arrayJSON = new ObjectMapper().createArrayNode();
			for (UserInfo user : rows) {
				userInfoService.save(user);
				ObjectNode objectNode = user.toObjectNode();
				objectNode.put("listno", listno++);
				arrayJSON.add(objectNode);
			}
			result.set("rows", arrayJSON);
		}

		try {
			FileUtils.save("data/userinfo.json",
					result.toString().getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
