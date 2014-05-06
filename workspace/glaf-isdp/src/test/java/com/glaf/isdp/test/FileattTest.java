package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.IsdpFileatt;
import com.glaf.isdp.query.FileattQuery;
import com.glaf.isdp.service.IsdpFileattService;
 

public class FileattTest extends AbstractTest {

	protected IsdpFileattService fileattService;

	@Test
	public void testList() {
		fileattService = super.getBean("fileattService");
		FileattQuery query = new FileattQuery();
		//query.nameLike("工程");
		List<IsdpFileatt> rows = fileattService
				.getFileattsByQueryCriteria(0, 10, query);
		for (IsdpFileatt row : rows) {
			fileattService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
