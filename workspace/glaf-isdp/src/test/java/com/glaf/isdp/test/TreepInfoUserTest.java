package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreepInfoUser;
import com.glaf.isdp.query.TreepInfoUserQuery;
import com.glaf.isdp.service.ITreepInfoUserService;
 

public class TreepInfoUserTest extends AbstractTest {

	protected ITreepInfoUserService treepInfoUserService;

	@Test
	public void testList() {
		treepInfoUserService = super.getBean("treepInfoUserService");
		TreepInfoUserQuery query = new TreepInfoUserQuery();
		//query.nameLike("¹¤³Ì");
		List<TreepInfoUser> rows = treepInfoUserService
				.getTreepInfoUsersByQueryCriteria(0, 10, query);
		for (TreepInfoUser row : rows) {
			treepInfoUserService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
