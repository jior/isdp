package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreevmainUser;
import com.glaf.isdp.query.TreevmainUserQuery;
import com.glaf.isdp.service.ITreevmainUserService;
 

public class TreevmainUserTest extends AbstractTest {

	protected ITreevmainUserService treevmainUserService;

	@Test
	public void testList() {
		treevmainUserService = super.getBean("treevmainUserService");
		TreevmainUserQuery query = new TreevmainUserQuery();
		//query.nameLike("¹¤³Ì");
		List<TreevmainUser> rows = treevmainUserService
				.getTreevmainUsersByQueryCriteria(0, 10, query);
		for (TreevmainUser row : rows) {
			treevmainUserService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
