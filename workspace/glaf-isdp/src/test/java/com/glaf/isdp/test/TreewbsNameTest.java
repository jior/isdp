package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.TreewbsName;
import com.glaf.isdp.query.TreewbsNameQuery;
import com.glaf.isdp.service.ITreewbsNameService;
 

public class TreewbsNameTest extends AbstractTest {

	protected ITreewbsNameService treewbsNameService;

	@Test
	public void testList() {
		treewbsNameService = super.getBean("treewbsNameService");
		TreewbsNameQuery query = new TreewbsNameQuery();
		//query.nameLike("¹¤³Ì");
		List<TreewbsName> rows = treewbsNameService
				.getTreewbsNamesByQueryCriteria(0, 10, query);
		for (TreewbsName row : rows) {
			treewbsNameService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
