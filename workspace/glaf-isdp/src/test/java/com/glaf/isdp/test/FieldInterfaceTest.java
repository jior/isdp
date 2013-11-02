package com.glaf.isdp.test;

import java.util.List;

import org.junit.Test;
import com.glaf.test.AbstractTest;
import com.glaf.isdp.domain.FieldInterface;
import com.glaf.isdp.query.FieldInterfaceQuery;
import com.glaf.isdp.service.IFieldInterfaceService;
 

public class FieldInterfaceTest extends AbstractTest {

	protected IFieldInterfaceService fieldInterfaceService;

	@Test
	public void testList() {
		fieldInterfaceService = super.getBean("fieldInterfaceService");
		FieldInterfaceQuery query = new FieldInterfaceQuery();
		//query.nameLike("¹¤³Ì");
		List<FieldInterface> rows = fieldInterfaceService
				.getFieldInterfacesByQueryCriteria(0, 10, query);
		for (FieldInterface row : rows) {
			fieldInterfaceService.save(row);
			logger.debug(row.toJsonObject().toJSONString());
		}
	}

}
